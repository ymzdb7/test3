 package com.myoa.service.file.impl;
 
 import com.myoa.dao.auth.AuthMapper;
import com.myoa.dao.file.FileSortMapper;
import com.myoa.model.file.FileAuthBaseModel;
import com.myoa.model.file.FileAuthWrapper;
import com.myoa.model.file.FileSortModel;
import com.myoa.model.file.FileAuthBaseModel.FileAuthChildModel;
import com.myoa.model.file.FileAuthBaseModel.FileAuthGrandChildModel;
import com.myoa.service.file.FileSortResetAuth;
import com.myoa.service.file.FileSortService;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.netdisk.CheckAll;

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.Hashtable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class FileSortServiceImpl
   implements FileSortService
 {
 
   @Resource
   FileSortMapper file_SortMapper;
 
   @Autowired
   AuthMapper authMapper;
   private static final String STATUS_EXTENDS_TURE = "1";
   private static final String STATUS_EXTENDS_FALSE = "0";
 
   public ToJson<FileSortModel> getFileSortJson(FileSortModel file)
   {
     ToJson toJson = new ToJson(0, "显示结果");
     List list = this.file_SortMapper.getFileSort(file);
     toJson.setObj(list);
     return toJson;
   }
 
   public List<FileSortModel> getFileSortList(FileSortModel file)
   {
     return this.file_SortMapper.getFileSort(file);
   }
 
   public ToJson<FileSortModel> getFileSortBySortId(FileSortModel file)
   {
     ToJson toJson = new ToJson(0, "显示结果");
     List list = this.file_SortMapper.getFileSort(file);
     toJson.setObj(list);
     return toJson;
   }
 
   public int saveFileSort(FileSortModel file)
   {
     return this.file_SortMapper.saveFileSortChr(file);
   }
 
   public int updateFileSort(FileSortModel file)
   {
     return this.file_SortMapper.updateFileSort(file);
   }
 
   public int deleteBySortId(Map<String, Object> fileParent)
   {
     return this.file_SortMapper.deleteBySortId(fileParent);
   }
 
   public List<FileSortModel> getSortChrildren(int tempNo)
   {
     return this.file_SortMapper.getSortChrildren(tempNo);
   }
 
   public List<FileSortModel> getRootTree(Map<String, Object> rootMap)
   {
     return this.file_SortMapper.getRootTree(rootMap);
   }
 
   public List<FileSortModel> getChildTree(List<String> sortidList)
   {
     return this.file_SortMapper.getChildTree(sortidList);
   }
 
   public int saveFileSortChr(FileSortModel file)
   {
     return this.file_SortMapper.saveFileSortChr(file);
   }
 
   public BaseWrapper setFileSortAuth(Map<String, Object> mmp)
   {
     BaseWrapper wrapper = new BaseWrapper();
     wrapper.setStatus(true);
     wrapper.setFlag(false);
     wrapper.setMsg("操作失败");
     if (mmp == null)
     {
       return wrapper;
     }
     Integer sortId = (Integer)mmp.get("sortId");
     if (sortId == null) {
       return wrapper;
     }
     FileSortResetAuth resetAuth = new FileSortResetAuth();
 
     Map param = resetAuth.reset("userId", (Map)mmp.get("userId")).reset("manageUser", (Map)mmp.get("manageUser")).reset("delUser", (Map)mmp.get("delUser")).reset("downUser", (Map)mmp.get("downUser")).reset("shareUser", (Map)mmp.get("shareUser")).reset("owner", (Map)mmp.get("owner")).reset("signUser", (Map)mmp.get("signUser")).reset("review", (Map)mmp.get("review")).reset("description", (Map)mmp.get("description")).reset("newUser", (Map)mmp.get("newUser")).getParam();
 
     param.put("sortId", sortId.toString());
     Integer userIdRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("userId", (Map)mmp.get("userId")).getParam(), sortId.toString()));
 
     Integer manageUserRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("manageUser", (Map)mmp.get("manageUser")).getParam(), sortId.toString()));
 
     Integer delUserRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("delUser", (Map)mmp.get("delUser")).getParam(), sortId.toString()));
 
     Integer downUserRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("downUser", (Map)mmp.get("downUser")).getParam(), sortId.toString()));
 
     Integer shareUserRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("shareUser", (Map)mmp.get("shareUser")).getParam(), sortId.toString()));
 
     Integer ownerRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("owner", (Map)mmp.get("owner")).getParam(), sortId.toString()));
 
     Integer signUserRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("signUser", (Map)mmp.get("signUser")).getParam(), sortId.toString()));
 
     Integer reviewRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("review", (Map)mmp.get("review")).getParam(), sortId.toString()));
 
     Integer descriptionRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("description", (Map)mmp.get("description")).getParam(), sortId.toString()));
 
     Integer newUserRestTimes = Integer.valueOf(checkUpdateChild(resetAuth.reset("newUser", (Map)mmp.get("newUser")).getParam(), sortId.toString()));
 
     int res = this.file_SortMapper.updateSortAuth(param);
     if (res > 0) {
       wrapper.setStatus(true);
       wrapper.setFlag(true);
       wrapper.setMsg("操作成功");
     } else {
       wrapper.setStatus(true);
       wrapper.setFlag(false);
       wrapper.setMsg("操作失败");
     }
     return wrapper;
   }
 
   private int checkUpdateChild(Map<String, String> mmp, String sortId)
   {
     if (mmp == null) {
       return -1;
     }
     if (mmp.containsKey("isExtends")) {
       if ("1".equals(((String)mmp.get("isExtends")).trim())) {
         try
         {
           List<FileSortModel> childSort = this.file_SortMapper.getSortChrildren(Integer.parseInt(sortId));
           List childSortId = null;
           if ((childSort != null) && (childSort.size() > 0)) {
             childSortId = new ArrayList();
             for (FileSortModel model : childSort) {
               childSortId.add(model.getSortId());
             }
           }
           if ((childSortId != null) && (childSortId.size() > 0)) {
             Map map = new HashMap();
             map.putAll(mmp);
             map.put("sortIds", childSortId);
             return this.file_SortMapper.updateSortAuthByChildSort(map);
           }
           return -1;
         }
         catch (Exception e) {
           e.printStackTrace();
           return -2;
         }
       }
       return 0;
     }
 
     return -1;
   }
 
   public FileAuthWrapper getAuthBySortId(Integer sortId)
   {
     FileAuthWrapper wrapper = new FileAuthWrapper();
 
     List list = this.file_SortMapper.queryFileSortAndChildBySortId(sortId);
     wrapper.setFileSorts(list);
 
     FileSortModel model = this.file_SortMapper.getNowFileSortAuth(sortId);
     FileAuthBaseModel auth = new FileAuthBaseModel();
     List useds = new ArrayList();
     if (model != null) {
       String[] userIds = FileSortResetAuth.getAuthBase(model.getUserId());
       String[] newUsers = FileSortResetAuth.getAuthBase(model.getNewUser());
       String[] managerUsers = FileSortResetAuth.getAuthBase(model.getManagerUser());
       String[] delUsers = FileSortResetAuth.getAuthBase(model.getDelUser());
       String[] downUsers = FileSortResetAuth.getAuthBase(model.getDownUser());
       String[] owners = FileSortResetAuth.getAuthBase(model.getOwner());
       String[] sharUsers = FileSortResetAuth.getAuthBase(model.getSharUser());
       String[] signUsers = FileSortResetAuth.getAuthBase(model.getSignUser());
       String[] review = FileSortResetAuth.getAuthBase(model.getReview());
 
       auth.setUserId(getName(userIds));
       auth.setReview(getName(review));
       auth.setDelUser(getName(delUsers));
       auth.setNewUser(getName(newUsers));
       auth.setManageUser(getName(managerUsers));
       auth.setDownUser(getName(downUsers));
       auth.setOwner(getName(owners));
       auth.setShareUser(getName(sharUsers));
       auth.setSignUser(getName(signUsers));
       wrapper.setData(auth);
       wrapper.setNowFileSortName(model.getSortName());
 
       if (userIds != null) {
         useds.add("visit");
       }
       if (newUsers != null) {
         useds.add("add");
       }
       if (managerUsers != null)
         useds.add("edit");
       if (delUsers != null) {
         useds.add("delete");
       }
       if (downUsers != null) {
         useds.add("download");
       }
       if (owners != null) {
         useds.add("all");
       }
       if (review != null) {
         useds.add("comment");
       }
       if (signUsers != null) {
         useds.add("sign");
       }
       wrapper.setUsed(useds);
       wrapper.setFlag(true);
     } else {
       wrapper.setFlag(false);
       wrapper.setMsg("还未设置权限");
     }
 
     return wrapper;
   }
 
   public BaseWrapper getFileAuthBySortId(Integer sortId, HttpServletRequest request)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     FileSortModel model = this.file_SortMapper.getNowFileSortAuth(sortId);
     Map map = new Hashtable();
     String userId = String.valueOf(request.getSession().getAttribute("userId"));
     String userPriv = String.valueOf(request.getSession().getAttribute("userPriv"));
     String deptId = String.valueOf(request.getSession().getAttribute("deptId"));
 
     FileSortModel file = new FileSortModel();
     if (file.getUserId() == null) {
       file.setUserId(userId);
     }
     map.put("userId", file.getUserId() == null ? userId : file.getUserId());
     map.put("userPriv", userPriv == null ? "" : userPriv);
     map.put("deptId", deptId == null ? "" : deptId);
     model.setDelPriv(CheckAll.checkAll(model.getDelUser(), map));
     model.setMakePriv(CheckAll.checkAll(model.getNewUser(), map));
     model.setDownloadPriv(CheckAll.checkAll(model.getDownUser(), map));
     model.setUpdatePriv(CheckAll.checkAll(model.getManagerUser(), map));
     baseWrapper.setData(model);
     baseWrapper.setFlag(true);
     baseWrapper.setStatus(true);
     baseWrapper.setMsg("成功");
     return baseWrapper;
   }
 
   public FileAuthBaseModel.FileAuthChildModel getName(String[] ids)
   {
      FileAuthBaseModel tmp11_8 = new FileAuthBaseModel(); 
               tmp11_8.getClass();
               FileAuthBaseModel.FileAuthChildModel child = tmp11_8.new FileAuthChildModel();
      FileAuthBaseModel  tmp31_28 = new FileAuthBaseModel(); 
               tmp31_28.getClass(); 
               FileAuthBaseModel.FileAuthGrandChildModel grandChild = tmp31_28.new  FileAuthGrandChildModel();
 
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
 
   public List<FileSortModel> getChrildrenSort(FileSortModel file)
   {
     return null;
   }
 
   public FileSortModel getFileSortBySortIds(FileSortModel file) {
     return this.file_SortMapper.getOne(file);
   }
 
   public int getFileCheck(FileSortModel file) {
     return this.file_SortMapper.getFileCheck(file);
   }
 
   public FileSortModel singleBySortNo(String sortNo)
   {
     return this.file_SortMapper.singleBySortNo(sortNo);
   }
 
   public FileSortModel singleBySortName(String sortName)
   {
     return this.file_SortMapper.singleBySortName(sortName);
   }
 
   public List<FileSortModel> getChildTreeList(String sortId)
   {
     List<FileSortModel> fileSortModels1 = this.file_SortMapper.getChildTreeList();
     List sortModels = new ArrayList();
     FileSortModel fileSortModelss = this.file_SortMapper.getNowFileSortAuth(Integer.valueOf(Integer.parseInt(sortId)));
     sortModels.add(fileSortModelss);
     for (FileSortModel fileSortModel : fileSortModels1) {
       if (fileSortModel.getSortNo().equals(sortId)) {
         sortModels.add(fileSortModel);
         getChildTreeList(String.valueOf(fileSortModel.getSortId()));
       }
     }
     return sortModels;
   }
 }

