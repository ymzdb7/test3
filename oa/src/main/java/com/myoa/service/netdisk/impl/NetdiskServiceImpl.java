 package com.myoa.service.netdisk.impl;
 
 import com.myoa.dao.auth.AuthMapper;
import com.myoa.dao.netdisk.NetdiskMapper;
import com.myoa.model.netdisk.EasyUiDiskModel;
import com.myoa.model.netdisk.MyNetdisk;
import com.myoa.model.netdisk.Netdisk;
import com.myoa.model.netdisk.NetdiskBaseModel;
import com.myoa.model.netdisk.NetdiskWrapper;
import com.myoa.model.netdisk.NetdiskBaseModel.NetdiskChildBaseModel;
import com.myoa.model.netdisk.NetdiskBaseModel.NetdiskGrandChildModel;
import com.myoa.model.users.Users;
import com.myoa.service.file.FileSortResetAuth;
import com.myoa.service.netdisk.NetdiskService;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.netdisk.CheckAll;
import com.myoa.util.netdisk.ReadFile;

 import java.io.File;
 import java.text.Collator;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Comparator;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.Hashtable;
 import java.util.List;
 import java.util.Locale;
 import java.util.Map;
 import java.util.ResourceBundle;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class NetdiskServiceImpl
   implements NetdiskService
 {
 
   @Autowired
   AuthMapper authMapper;
 
   @Resource
   private NetdiskMapper netdiskMapper;
   private final int ORDERTYPE_ASC = 0;
   private final int ORDERTYPE_DESC = 1;
   private final int ORDER_BY_NAME = 0;
   private final int ORDER_BY_TYPE = 1;
   private final int ORDER_BY_SIZE = 2;
   private final int ORDER_BY_TIME = 3;
 
   public BaseWrapper addNetdisk(Netdisk netdisk)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     baseWrapper.setFlag(false);
     baseWrapper.setStatus(true);
     if (netdisk != null) {
       String path = netdisk.getDiskPath();
       if (!StringUtils.checkNull(path).booleanValue())
       {
         ResourceBundle rb = ResourceBundle.getBundle("upload");
         String osName = System.getProperty("os.name");
         StringBuffer sb = new StringBuffer();
         if (osName.toLowerCase().startsWith("win"))
           sb = sb.append(rb.getString("netdisk.win"));
         else {
           sb = sb.append(rb.getString("netdisk.linux"));
         }
         String basePath = sb.toString() + path;
 
         File file = new File(basePath);
         if (file.exists()) {
           baseWrapper.setMsg("路径已经存在不需要新建！");
           return baseWrapper;
         }
         file.mkdirs();
         int a = this.netdiskMapper.addNetdisk(netdisk);
         if (a > 0) {
           baseWrapper.setFlag(true);
           baseWrapper.setStatus(true);
           baseWrapper.setMsg("操作成功！");
         } else {
           baseWrapper.setMsg("操作失败！");
         }
       }
       else {
         baseWrapper.setMsg("请求路径不能为空！");
       }
     } else {
       baseWrapper.setMsg("请求参数不存在！");
     }
 
     return baseWrapper;
   }
 
   public List<Netdisk> selectNetdisk()
   {
     return this.netdiskMapper.selectNetdisk();
   }
 
   public void delete(Integer diskId)
   {
     this.netdiskMapper.delete(diskId);
   }
 
   public int editNetdisk(Netdisk netdisk)
   {
     int a = this.netdiskMapper.editNetdisk(netdisk);
     return a;
   }
 
   public int editNetdiskJurisdiction(Map<String, Object> maps)
   {
     Integer diskId = (Integer)maps.get("diskId");
     FileSortResetAuth resetAuth = new FileSortResetAuth();
     Map param = resetAuth.reset("userId", (Map)maps.get("userId")).reset("newUser", (Map)maps.get("newUser")).reset("manageUser", (Map)maps.get("manageUser")).reset("downUser", (Map)maps.get("downUser")).getParam();
 
     param.put("diskId", diskId.toString());
     int a = this.netdiskMapper.editNetdiskJurisdiction(param);
     return a;
   }
 
   public NetdiskWrapper queryById(Integer diskId)
   {
     NetdiskWrapper wrapper = new NetdiskWrapper();
     wrapper.setStatus(true);
     Netdisk netdisk = this.netdiskMapper.queryNetdisk(diskId);
     List useds = new ArrayList();
     if (netdisk != null) {
       String[] userIds = FileSortResetAuth.getAuthBase(netdisk.getUserId());
       String[] newUsers = FileSortResetAuth.getAuthBase(netdisk.getNewUser());
       String[] managerUsers = FileSortResetAuth.getAuthBase(netdisk.getManageUser());
       String[] downUsers = FileSortResetAuth.getAuthBase(netdisk.getDownUser());
 
       NetdiskBaseModel auth = new NetdiskBaseModel();
       auth.setNewUser(getName(newUsers));
       auth.setManageUser(getName(managerUsers));
       auth.setDownUser(getName(downUsers));
       auth.setUserId(getName(userIds));
       wrapper.setData(auth);
       wrapper.setNowFileSortName(netdisk.getDiskName());
       if (userIds != null) {
         useds.add("visit");
       }
       if (newUsers != null) {
         useds.add("add");
       }
       if (managerUsers != null) {
         useds.add("edit");
       }
       if (downUsers != null) {
         useds.add("download");
         wrapper.setUsed(useds);
         wrapper.setFlag(true);
       } else {
         wrapper.setFlag(false);
         wrapper.setMsg("还未设置权限");
       }
     }
 
     return wrapper;
   }
 
   public BaseWrappers getNetDiskMenu(HttpServletRequest request)
   {
     BaseWrappers wrappers = new BaseWrappers();
     List res = new ArrayList();
     List realRes = new ArrayList();
     try {
       List<Netdisk> firstMenu = this.netdiskMapper.selectNetdisk();
       if ((firstMenu != null) && (firstMenu.size() > 0)) {
         for (Netdisk disk : firstMenu) {
           EasyUiDiskModel model = new EasyUiDiskModel();
           model.setId(disk.getDiskId());
           model.setText(disk.getDiskName());
           String path = disk.getDiskPath();
 
           ResourceBundle rb = ResourceBundle.getBundle("upload");
           String osName = System.getProperty("os.name");
           StringBuffer sb = new StringBuffer();
           if (osName.toLowerCase().startsWith("win"))
             sb = sb.append(rb.getString("netdisk.win"));
           else {
             sb = sb.append(rb.getString("netdisk.linux"));
           }
           String basePath = sb.toString() + path;
           Map attr = new HashMap();
           attr.put("url", basePath);
           model.setAttributes(attr);
           res.add(model);
         }
       }
       if ((res != null) && (res.size() > 0)) {
         realRes = queryDir(res);
         wrappers.setMsg("成功");
         wrappers.setDatas(realRes);
         wrappers.setFlag(true);
         wrappers.setStatus(true);
       } else {
         wrappers.setMsg("失败");
         wrappers.setDatas(realRes);
         wrappers.setFlag(true);
         wrappers.setStatus(true);
       }
     }
     catch (Exception e) {
       e.printStackTrace();
       wrappers.setFlag(false);
       wrappers.setMsg("出现异常");
     }
 
     return wrappers;
   }
 
   public BaseWrappers selectNetdiskBySearch(HttpServletRequest request, String path, Integer orderType, Integer orderBy, String searchTitle, String content)
   {
     BaseWrappers wrappers = new BaseWrappers();
     wrappers.setStatus(true);
     wrappers.setFlag(false);
     List<MyNetdisk> res = null;
 
     if (StringUtils.checkNull(path).booleanValue()) {
       wrappers.setMsg("路径不正确");
       return wrappers;
     }
     File filePath = new File(path);
     if (!filePath.exists()) {
       wrappers.setMsg("路径不正确");
       return wrappers;
     }
 
     if (!checkAuth(request, path, Integer.valueOf(1))) {
       wrappers.setMsg("没有权限访问");
       return wrappers;
     }
     try {
       res = ReadFile.getFilesInPath(path);
       for (MyNetdisk myNetdisk : res) {
         myNetdisk.setUpdatePriv(checkAuth(request, path, Integer.valueOf(18)));
         myNetdisk.setDownloadPriv(checkAuth(request, path, Integer.valueOf(19)));
         myNetdisk.setShowPriv(checkAuth(request, path, Integer.valueOf(1)));
         myNetdisk.setMakePriv(checkAuth(request, path, Integer.valueOf(17)));
       }
 









     ///* 312 */       Collections.sort(res, new Comparator<MyNetdisk>(orderType, orderBy)
     ///*     */       {
     ///*     */         public int compare(MyNetdisk o1, MyNetdisk o2) {
     ///* 315 */           switch (orderType.intValue()) {
     ///*     */           case 0:
     ///* 317 */             return compareDetail(o1, o2);
     ///*     */           case 1:
     ///* 319 */             return compareDetail(o2, o1);
     ///*     */           }
     ///* 321 */           return compareDetail(o1, o2);
     ///*     */         }
     ///*     */ 
     ///*     */         private int compareDetail(MyNetdisk o1, MyNetdisk o2) {
     ///* 325 */           Collator instance = Collator.getInstance(Locale.CHINA);
     ///* 326 */           switch (orderBy.intValue()) {
     ///*     */           case 0:
     ///* 328 */             return instance.compare(o1.getNeName(), o2.getNeName());
     ///*     */           case 2:
     ///* 330 */             return o1.getSize().compareTo(o2.getSize());
     ///*     */           case 3:
     ///* 332 */             return o1.getTime().compareTo(o2.getTime());
     ///*     */           case 1:
     ///* 334 */             return o1.getType().compareTo(o2.getType());
     ///*     */           }
     ///* 336 */           return instance.compare(o1.getNeName(), o2.getNeName());
     ///*     */         }
     ///*     */       });























       wrappers.setFlag(true);
       wrappers.setDatas(res);
       wrappers.setStatus(true);
     } catch (Exception e) {
       e.printStackTrace();
       wrappers.setFlag(false);
       wrappers.setMsg("文件未找到");
       wrappers.setStatus(true);
     }
     return wrappers;
   }
 
   public boolean checkAuth(HttpServletRequest request, String path, Integer authType)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Map map = new Hashtable();
     map.put("userId", users.getUserId());
     map.put("userPriv", users.getUserPriv());
     map.put("deptId", users.getDeptId());
     List<Netdisk> neList = selectNetdisk();
     for (Netdisk disk : neList) {
       File filePath = new File(path);
       if (!filePath.exists())
         continue;
       ResourceBundle rb = ResourceBundle.getBundle("upload");
       String osName = System.getProperty("os.name");
       StringBuffer sb = new StringBuffer();
       if (osName.toLowerCase().startsWith("win"))
         sb = sb.append(rb.getString("netdisk.win"));
       else {
         sb = sb.append(rb.getString("netdisk.linux"));
       }
       String basePath = sb.toString() + disk.getDiskPath();
       File fileDiskPath = new File(basePath);
       if (fileDiskPath.exists()) {
         boolean a = filePath.getPath().startsWith(fileDiskPath.getPath());
         L.s(new Object[] { disk.getDiskPath(), ":", path, ":", Boolean.valueOf(path.startsWith(disk.getDiskPath())), ":", Boolean.valueOf(path.contains(disk.getDiskPath())) });
 
         if (a) {
           switch (authType.intValue()) {
           case 17:
             return CheckAll.checkAll(disk.getNewUser(), map);
           case 1:
             return CheckAll.checkAll(disk.getUserId(), map);
           case 19:
             return CheckAll.checkAll(disk.getDownUser(), map);
           case 18:
             return CheckAll.checkAll(disk.getManageUser(), map);
           }
           return false;
         }
       }
     }
     return false;
   }
 
   public Netdisk queryNetdiskold(String path)
   {
     Netdisk netdisk = this.netdiskMapper.queryNetdiskold(path);
     if (netdisk != null) {
       return netdisk;
     }
     return null;
   }
 
   private List<EasyUiDiskModel> queryDir(List<EasyUiDiskModel> res) throws Exception {
     for (EasyUiDiskModel model : res) {
       String url = (String)model.getAttributes().get("url");
       List child = ReadFile.getDirs(url);
       if (child != null) {
         model.setChildren(queryDir(child));
       }
     }
     return res;
   }
 
   public NetdiskBaseModel.NetdiskChildBaseModel getName(String[] ids)
   {
      NetdiskBaseModel tmp11_8 = new NetdiskBaseModel();
			   tmp11_8.getClass();
			   NetdiskBaseModel.NetdiskChildBaseModel child = tmp11_8.new NetdiskChildBaseModel();
      NetdiskBaseModel tmp31_28 = new NetdiskBaseModel();
			   tmp31_28.getClass();
			   NetdiskBaseModel.NetdiskGrandChildModel grandChild = tmp31_28.new NetdiskGrandChildModel();
 
     child.setDept("");
     grandChild.setDeptStr("");
     child.setUser("");
     grandChild.setUserStr("");
     child.setRole("");
     grandChild.setRoleStr("");
     child.setData(grandChild);
     if (ids == null)
       return child;
     String dept;
     String role;
     String user;
     switch (ids.length) {
     case 0:
       return child;
     case 1:
       dept = ids[0];
       role = null;
       user = null;
       break;
     case 2:
       dept = ids[0];
       role = ids[1];
       user = null;
       break;
     case 3:
       dept = ids[0];
       role = ids[1];
       user = ids[2];
       break;
     default:
       return child;
     }
 
     if (!StringUtils.checkNull(dept).booleanValue()) {
       String ret = "";
       if ("ALL_DEPT".equals(dept)) {
         ret = "全部部门";
       } else {
         List<String> depts = this.authMapper.getDeptName(dept);
         StringBuffer sb = new StringBuffer();
         for (String dep : depts) {
           sb.append(dep);
           sb.append(",");
         }
         ret = sb.toString();
       }
       child.setDept(dept);
       grandChild.setDeptStr(ret);
     } else {
       child.setDept("");
       grandChild.setDeptStr("");
     }
     if (!StringUtils.checkNull(role).booleanValue()) {
       List<String> roles = this.authMapper.getRoleName(role);
       StringBuffer sb = new StringBuffer();
       for (String rol : roles) {
         sb.append(rol);
         sb.append(",");
       }
       child.setRole(role);
       grandChild.setRoleStr(sb.toString());
     }
     else {
       child.setRole("");
       grandChild.setRoleStr("");
     }
     if (!StringUtils.checkNull(user).booleanValue()) {
       List<String> users = this.authMapper.getUserName(user);
       StringBuffer sb = new StringBuffer();
       for (String us : users) {
         sb.append(us);
         sb.append(",");
       }
       child.setUser(user);
       grandChild.setUserStr(sb.toString());
     }
     else {
       child.setUser("");
       grandChild.setUserStr("");
     }
     child.setData(grandChild);
     return child;
   }
 }

