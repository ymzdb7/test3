 package com.myoa.service.menu.impl;
 
 import com.myoa.dao.menu.SysFunctionMapper;
import com.myoa.dao.menu.SysMenuMapper;
import com.myoa.model.common.SysPara;
import com.myoa.model.common.SysParaExtend;
import com.myoa.model.menu.SysFunction;
import com.myoa.model.menu.SysMenu;
import com.myoa.model.users.Users;
import com.myoa.service.menu.MenuService;
import com.myoa.service.syspara.SysParaService;
import com.myoa.service.users.UserFunctionService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.util.Constant;
import com.myoa.util.DBPropertiesUtils;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;

 import java.io.BufferedInputStream;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.IOException;
 import java.io.OutputStream;
 import java.io.OutputStreamWriter;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import java.util.Set;
 import javax.annotation.Resource;
 import javax.servlet.ServletContext;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Transactional
 @Service
 public class MenuServiceImpl
   implements MenuService
 {
 
   @Resource
   private SysMenuMapper sysMenuMapper;
 
   @Resource
   private SysFunctionMapper sysFunctionMapper;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private UsersPrivService usersPrivService;
 
   @Resource
   private SysParaService sysParaService;
 
   @Resource
   private UserFunctionService userFunctionService;
 
   public List<SysMenu> getAll(HttpServletRequest request, String locale)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Integer uid = users.getUid();
 
     String userFunctionStr = this.userFunctionService.getUserFunctionStrById(uid);
     String[] funcIds = userFunctionStr.split(",");
 
     Set<String> userMenuSet = new HashSet<String>();
 
     for (String funcId : funcIds) {
       userMenuSet.add(funcId);
     }
 
     StringBuffer sb = new StringBuffer();
 
     List<SysMenu> list = this.sysMenuMapper.getDatagrid();
     for (SysMenu sysMenu : list) {
       if (locale.equals("zh_CN"))
         sysMenu.setName(sysMenu.getName());
       else if (locale.equals("en_US"))
         sysMenu.setName(sysMenu.getName1());
       else if (locale.equals("zh_tw")) {
         sysMenu.setName(sysMenu.getName2());
       }
       List<SysFunction> list1 = null;
       if (sysMenu.getId() != null)
       {
         list1 = this.sysFunctionMapper.getDatagrid(sysMenu.getId().concat("__"));
       }
 
       for (SysFunction sysFunction : list1) {
         if (locale.equals("zh_CN"))
           sysFunction.setName(sysFunction.getName());
         else if (locale.equals("en_US"))
           sysFunction.setName(sysFunction.getName1());
         else if (locale.equals("zh_TW")) {
           sysFunction.setName(sysFunction.getName2());
         }
         List<SysFunction> list2 = null;
         if (sysFunction.getId() != null)
         {
           list2 = this.sysFunctionMapper.childMenu(sysFunction.getId().concat("__"));
         }
 
         for (SysFunction sysFunction2 : list2) {
           if (locale.equals("zh_CN"))
             sysFunction2.setName(sysFunction2.getName());
           else if (locale.equals("en_US"))
             sysFunction2.setName(sysFunction2.getName1());
           else if (locale.equals("zh_TW")) {
             sysFunction2.setName(sysFunction2.getName2());
           }
 
         }
 
         if (list2.size() > 0) {
           sb.append(",").append(sysFunction.getfId()).append(",");
         }
         sysFunction.setChild(list2);
       }
 
       sysMenu.setChild(list1);
     }
 
     List<SysMenu> userMenulistResult = new ArrayList();
     for (SysMenu sysMenu : list) {
       List<SysFunction> secondList = new ArrayList<SysFunction>();
       List tempSecondList = sysMenu.getChild();
				 SysFunction sysFunction;
       for (Iterator i$ = tempSecondList.iterator(); i$.hasNext(); ) { sysFunction = (SysFunction)i$.next();
         for (String funcId : userMenuSet) {
           Integer fId = sysFunction.getfId();
           if ((funcId != null) && (funcId.equals(String.valueOf(fId))))
             secondList.add(sysFunction);
         }
       }
      
       for (SysFunction temp : secondList)
       {
         if (temp != null) {
           List thirdList = new ArrayList();
           List<SysFunction> tempThirdList = temp.getChild();
 
           for (Iterator<SysFunction> i$ = tempThirdList.iterator(); i$.hasNext(); ) {SysFunction function = i$.next();
             for (String funcId : userMenuSet) {
               Integer fId = function.getfId();
 
               if ((funcId != null) && (funcId.equals(String.valueOf(fId))))
                 thirdList.add(function);
             }
           }
           SysFunction function;
           temp.setChild(thirdList);
         }
       }
       sysMenu.setChild(secondList);
       userMenulistResult.add(sysMenu);
     }
 
     List sysMenuListWithoutEmpty = new ArrayList();
     for (SysMenu sysMenu : userMenulistResult) {
       List<SysFunction> twoSysFunctionList = sysMenu.getChild();
       List twoMenuList = new ArrayList();
 
       if ((twoSysFunctionList != null) && (twoSysFunctionList.size() > 0)) {
         for (SysFunction sysFunction : twoSysFunctionList) {
           List threeSysFunctionList = sysFunction.getChild();
 
           if (threeSysFunctionList != null) {
             if (threeSysFunctionList.size() > 0)
               twoMenuList.add(sysFunction);
             else if (threeSysFunctionList.size() == 0)
             {
               if (!sb.toString().contains(",".concat(String.valueOf(sysFunction.getfId())).concat(","))) {
                 twoMenuList.add(sysFunction);
               }
             }
           }
         }
       }
 
       if (twoMenuList.size() > 0) {
         sysMenu.setChild(twoMenuList);
         sysMenuListWithoutEmpty.add(sysMenu);
       }
     }
     return sysMenuListWithoutEmpty;
   }
 
   public List<SysMenu> getAllWithEmpty(HttpServletRequest request, String locale)
   {
     List<SysMenu> list = this.sysMenuMapper.getDatagrid();
     for (SysMenu sysMenu : list) {
       if (locale.equals("zh_CN"))
         sysMenu.setName(sysMenu.getName());
       else if (locale.equals("en_US"))
         sysMenu.setName(sysMenu.getName1());
       else if (locale.equals("zh_TW")) {
         sysMenu.setName(sysMenu.getName2());
       }
       List<SysFunction> list1 = null;
       if (sysMenu.getId() != null)
       {
         list1 = this.sysFunctionMapper.getDatagrid(sysMenu.getId().concat("__"));
       }
 
       for (SysFunction sysFunction : list1) {
         if (locale.equals("zh_CN"))
           sysFunction.setName(sysFunction.getName());
         else if (locale.equals("en_US"))
           sysFunction.setName(sysFunction.getName1());
         else if (locale.equals("zh_TW")) {
           sysFunction.setName(sysFunction.getName2());
         }
         List<SysFunction> list2 = null;
         if (sysFunction.getId() != null)
         {
           list2 = this.sysFunctionMapper.childMenu(sysFunction.getId().concat("__"));
         }
 
         for (SysFunction sysFunction2 : list2) {
           if (locale.equals("zh_CN"))
             sysFunction2.setName(sysFunction2.getName());
           else if (locale.equals("en_US"))
             sysFunction2.setName(sysFunction2.getName1());
           else if (locale.equals("zh_TW")) {
             sysFunction2.setName(sysFunction2.getName2());
           }
 
         }
 
         sysFunction.setChild(list2);
       }
 
       sysMenu.setChild(list1);
     }
 
     return list;
   }
 
   public List<SysFunction> getDadMenu(String menuId, String locale)
   {
     List<SysFunction> list = null;
     if (menuId != null)
     {
       list = this.sysFunctionMapper.getDatagrid(menuId.concat("__"));
     }
     for (SysFunction sysFunction : list)
     {
       if (locale.equals("zh_CN"))
         sysFunction.setName(sysFunction.getName());
       else if (locale.equals("en_US"))
         sysFunction.setName(sysFunction.getName1());
       else if (locale.equals("zh_TW")) {
         sysFunction.setName(sysFunction.getName2());
       }
       List<SysFunction> list1 = null;
       if (sysFunction.getId() != null)
       {
         list1 = this.sysFunctionMapper.childMenu(sysFunction.getId().concat("__"));
       }
 
       for (SysFunction function : list1) {
         if (locale.equals("zh_CN"))
           sysFunction.setName(sysFunction.getName());
         else if (locale.equals("en_US"))
           sysFunction.setName(sysFunction.getName1());
         else if (locale.equals("zh_TW")) {
           sysFunction.setName(sysFunction.getName2());
         }
       }
 
       sysFunction.setChild(list1);
     }
     return list;
   }
 
   public void updateSysMenu(SysMenu sysMenu)
   {
     this.sysMenuMapper.updateSysMenu(sysMenu);
   }
 
   public void addSysMenu(SysMenu sysMenu)
   {
     this.sysMenuMapper.addSysMenu(sysMenu);
   }
 
   public void deleteSysMenu(String id)
   {
     if ((id != null) && (id.trim().length() == 2)) {
       this.sysMenuMapper.deleteSysMenu(id);
       this.sysFunctionMapper.deleteFunction(id.concat("%"));
     } else {
       this.sysFunctionMapper.deleteFunction(id.concat("%"));
     }
   }
 
   public ToJson<SysFunction> addFunctionMenu(SysFunction sysFunction, String pfId)
   {
     ToJson json = new ToJson();
     try
     {
       json.setFlag(1);
       if (StringUtils.checkNull(pfId).booleanValue()) {
         json.setMsg("父ID为空");
         return json;
       }
 
       if (sysFunction != null)
       {
         String menuId = sysFunction.getId();
         Integer fid = sysFunction.getfId();
         if (fid == null) {
           json.setMsg("id不存在");
           return json;
         }
         SysFunction check = this.sysFunctionMapper.checkFunctionExits(fid);
         if (check != null) {
           json.setMsg("菜单已经存在");
           return json;
         }
         String newId = pfId + menuId;
         int exis = this.sysFunctionMapper.checkIdExists(newId);
         if (exis > 0) {
           json.setMsg("Id不合法");
           return json;
         }
 
         sysFunction.setId(newId);
         int res = this.sysFunctionMapper.addFunctionMenu(sysFunction);
 
         if (res > 0)
         {
           json.setFlag(0);
           json.setMsg("操作成功");
           return json;
         }
 
         json.setMsg("操作失败");
       }
       else
       {
         json.setMsg("参数不足");
         return json;
       }
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public void editSysFunction(SysFunction sysFunction)
   {
     this.sysFunctionMapper.editSysFunction(sysFunction);
   }
 
   public List<SysFunction> findChildMenu(String id, String locale)
   {
     List list = null;
 
     if (id != null) {
       Map hashMap = new HashMap();
       hashMap.put("secondId", id.concat("__"));
       hashMap.put("thirdId", id.concat("____"));
       hashMap.put("id", id);
       list = this.sysFunctionMapper.findChildMenu(hashMap);
     }
 
     boolean isFindSecond = false;
 
     List secondMenuList = new ArrayList();
     List<SysFunction> thirdList = new ArrayList();
 
     if ((list != null) && (list.size() > 0)) {
       for (int i = 0; i < list.size(); i++)
       {
         if ("zh_CN".equals(locale))
           ((SysFunction)list.get(i)).setName(((SysFunction)list.get(i)).getName());
         else if ("en_US".equals(locale))
           ((SysFunction)list.get(i)).setName(((SysFunction)list.get(i)).getName1());
         else if ("zh_TW".equals(locale)) {
           ((SysFunction)list.get(i)).setName(((SysFunction)list.get(i)).getName2());
         }
 
         SysFunction sysFunction = (SysFunction)list.get(i);
         if (sysFunction.getId().length() == 4)
         {
           isFindSecond = true;
           secondMenuList.add(sysFunction);
         } else if (sysFunction.getId().length() == 6) {
           thirdList.add(sysFunction);
         }
       }
 
     }
 
     if (secondMenuList.size() > 0) {
       for (int i = 0; i < secondMenuList.size(); i++) {
         ((SysFunction)secondMenuList.get(i)).setChild(new ArrayList());
         for (int j = 0; j < thirdList.size(); j++) {
           String thirdMenuId = ((SysFunction)thirdList.get(j)).getId().substring(0, 4);
           String theSecondMenuId = ((SysFunction)secondMenuList.get(i)).getId();
           if ((theSecondMenuId != null) && (theSecondMenuId.equals(thirdMenuId))) {
             ((SysFunction)secondMenuList.get(i)).getChild().add(thirdList.get(j));
           }
         }
       }
 
     }
 
     if (isFindSecond) {
       return secondMenuList;
     }
     return list;
   }
 
   public List<SysMenu> getTheFirstMenu(String id, String locale)
   {
     if (id != null) {
       List list = this.sysMenuMapper.getTheFirstMenu(id);
       if (list != null) {
         for (int i = 0; i < list.size(); i++)
         {
           if ("zh_CN".equals(locale))
             ((SysMenu)list.get(i)).setName(((SysMenu)list.get(i)).getName());
           else if ("en_US".equals(locale))
             ((SysMenu)list.get(i)).setName(((SysMenu)list.get(i)).getName1());
           else if ("zh_TW".equals(locale)) {
             ((SysMenu)list.get(i)).setName(((SysMenu)list.get(i)).getName2());
           }
         }
       }
 
       return list;
     }
     return null;
   }
 
   public ToJson<Integer> findMaxId()
   {
     ToJson json = new ToJson();
     try {
       json.setFlag(1);
 
       int maxId = this.sysFunctionMapper.getMaxId();
 
       if (maxId < 1000) {
         json.setObject(Integer.valueOf(1001));
         json.setMsg("子菜单项ID必须大于1000");
       } else {
         json.setObject(Integer.valueOf(maxId + 1));
       }
       json.setFlag(0);
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public List<SysFunction> getMenus(HttpServletRequest request, String id, String locale)
   {
     List<SysFunction> list1 = null;
 
     if (id != null) {
       Map hashMap = new HashMap();
       hashMap.put("secondId", id.concat("__"));
       hashMap.put("thirdId", id.concat("____"));
       hashMap.put("id", id);
       list1 = this.sysFunctionMapper.findChildMenu(hashMap);
     }
 
     List list = new ArrayList();
 
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
     String user_id = users.getUserId();
 
     String userFunctionStr = this.userFunctionService.getUserFunctionStr(user_id);
 
     String[] funcId = userFunctionStr.split(",");
     for (String fid : funcId)
     {
       for (SysFunction sysFunction : list1)
       {
         Integer dbFid = sysFunction.getfId();
 
         if (String.valueOf(dbFid).equals(fid)) {
           list.add(sysFunction);
         }
 
       }
 
     }
 
     boolean isFindSecond = false;
 
     List secondMenuList = new ArrayList();
     List<SysFunction> thirdList = new ArrayList();
 
     if ((list != null) && (list.size() > 0)) {
       for (int i = 0; i < list.size(); i++)
       {
         if ("zh_CN".equals(locale))
           ((SysFunction)list.get(i)).setName(((SysFunction)list.get(i)).getName());
         else if ("en_US".equals(locale))
           ((SysFunction)list.get(i)).setName(((SysFunction)list.get(i)).getName1());
         else if ("zh_TW".equals(locale)) {
           ((SysFunction)list.get(i)).setName(((SysFunction)list.get(i)).getName2());
         }
 
         SysFunction sysFunction = (SysFunction)list.get(i);
         if (sysFunction.getId().length() == 4)
         {
           isFindSecond = true;
           secondMenuList.add(sysFunction);
         } else if (sysFunction.getId().length() == 6) {
           thirdList.add(sysFunction);
         }
       }
 
     }
 
     if (secondMenuList.size() > 0) {
       for (int i = 0; i < secondMenuList.size(); i++) {
         ((SysFunction)secondMenuList.get(i)).setChild(new ArrayList());
         for (int j = 0; j < thirdList.size(); j++) {
           String thirdMenuId = ((SysFunction)thirdList.get(j)).getId().substring(0, 4);
           String theSecondMenuId = ((SysFunction)secondMenuList.get(i)).getId();
           if ((theSecondMenuId != null) && (theSecondMenuId.equals(thirdMenuId))) {
             ((SysFunction)secondMenuList.get(i)).getChild().add(thirdList.get(j));
           }
         }
       }
 
     }
 
     if (isFindSecond) {
       return secondMenuList;
     }
     return list;
   }
 
   public List<SysMenu> getAllMenu(HttpServletRequest request, String locale)
   {
     List<SysMenu> list = this.sysMenuMapper.getDatagrid();
     for (SysMenu sysMenu : list) {
       if (locale.equals("zh_CN"))
         sysMenu.setName(sysMenu.getName());
       else if (locale.equals("en_US"))
         sysMenu.setName(sysMenu.getName1());
       else if (locale.equals("zh_TW")) {
         sysMenu.setName(sysMenu.getName2());
       }
       List<SysFunction> list1 = null;
       if (sysMenu.getId() != null)
       {
         list1 = this.sysFunctionMapper.getDatagrid(sysMenu.getId().concat("__"));
       }
 
       for (SysFunction sysFunction : list1) {
         if (locale.equals("zh_CN"))
           sysFunction.setName(sysFunction.getName());
         else if (locale.equals("en_US"))
           sysFunction.setName(sysFunction.getName1());
         else if (locale.equals("zh_TW")) {
           sysFunction.setName(sysFunction.getName2());
         }
         List<SysFunction> list2 = null;
         if (sysFunction.getId() != null)
         {
           list2 = this.sysFunctionMapper.childMenu(sysFunction.getId().concat("__"));
         }
 
         for (SysFunction sysFunction2 : list2) {
           if (locale.equals("zh_CN"))
             sysFunction2.setName(sysFunction2.getName());
           else if (locale.equals("en_US"))
             sysFunction2.setName(sysFunction2.getName1());
           else if (locale.equals("zh_TW")) {
             sysFunction2.setName(sysFunction2.getName2());
           }
         }
 
         sysFunction.setChild(list2);
       }
 
       sysMenu.setChild(list1);
     }
 
     return list;
   }
 
   public List<SysFunction> getSysFunctionByName(String funName)
   {
     return this.sysFunctionMapper.getSysFunctionByName(funName);
   }
 
   public int getCountSysFunctionByName(String funName)
   {
     return this.sysFunctionMapper.getCountSysFunctionByName(funName);
   }
 
   public List<SysFunction> getPriMenu(HttpServletRequest request, String locale)
   {
     List sysFunctionList = new ArrayList();
     List<SysFunction> child = new ArrayList();
 
     List<SysMenu> sysMenus = getAll(request, locale);
 
     for (SysMenu sysMenu : sysMenus)
     {
       child = sysMenu.getChild();
 
       for (SysFunction sysFunction : child)
       {
         if (locale.equals("zh_CN")) {
           sysFunction.setName(sysFunction.getName());
           sysFunction.setName1(null);
           sysFunction.setName2(null);
           sysFunction.setName3(null);
           sysFunction.setName4(null);
           sysFunction.setName5(null);
         } else if (locale.equals("en_US")) {
           sysFunction.setName(sysFunction.getName1());
           sysFunction.setName1(null);
           sysFunction.setName2(null);
           sysFunction.setName3(null);
           sysFunction.setName4(null);
           sysFunction.setName5(null);
         } else if (locale.equals("zh_TW")) {
           sysFunction.setName(sysFunction.getName2());
           sysFunction.setName1(null);
           sysFunction.setName2(null);
           sysFunction.setName3(null);
           sysFunction.setName4(null);
           sysFunction.setName5(null);
         }
 
         if (sysFunction.getChild().size() == 0)
         {
           if (sysFunctionList.size() < 15)
           {
             sysFunctionList.add(sysFunction);
           }
         }
         else
         {
           List<SysFunction> threeChildList = sysFunction.getChild();
           for (SysFunction function : threeChildList)
           {
             if (locale.equals("zh_CN")) {
               function.setName(function.getName());
               function.setName1(null);
               function.setName2(null);
               function.setName3(null);
               function.setName4(null);
               function.setName5(null);
             } else if (locale.equals("en_US")) {
               function.setName(function.getName1());
               function.setName1(null);
               function.setName2(null);
               function.setName3(null);
               function.setName4(null);
               function.setName5(null);
             } else if (locale.equals("zh_TW")) {
               function.setName(function.getName2());
               function.setName1(null);
               function.setName2(null);
               function.setName3(null);
               function.setName4(null);
               function.setName5(null);
             }
 
             if (sysFunctionList.size() < 15) {
               sysFunctionList.add(function);
             }
           }
         }
       }
     }
 
     return sysFunctionList;
   }
 
   public ToJson<List<SysFunction>> getErrMenu()
   {
     List list = new ArrayList();
 
     List errlist = new ArrayList();
     ToJson json = new ToJson();
     try
     {
       List<SysMenu> sysMenus = this.sysMenuMapper.getDatagrid();
 
       for (SysMenu sysMenu : sysMenus) {
         List<SysFunction> someChildMenu = this.sysFunctionMapper.getSomeChildMenu(sysMenu.getId());
 
         for (SysFunction sysFunction : someChildMenu) {
           list.add(sysFunction);
         }
       }
 
       StringBuffer sb = new StringBuffer();
       for (int i = 0; i < list.size(); i++) {
         String id = ((SysFunction)list.get(i)).getId();
         sb.append(",").append(id).append(",");
       }
 
       List allMenu = this.sysFunctionMapper.getAll();
       for (int i = 0; i < allMenu.size(); i++) {
         String id = ((SysFunction)allMenu.get(i)).getId();
         if (!sb.toString().contains("," + id + ",")) {
           errlist.add(allMenu.get(i));
         }
       }
       if (errlist != null) {
         json.setMsg("Ok");
         json.setObject(errlist);
         json.setFlag(0);
       } else {
         errlist = new ArrayList();
         json.setObject(errlist);
       }
     }
     catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Object> recoverMenu(HttpServletRequest request, String path)
   {
     String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
     ToJson json = new ToJson();
     try
     {
       String username = (String)DBPropertiesUtils.getDbMsg(request).get("username");
       String password = (String)DBPropertiesUtils.getDbMsg(request).get("password");
       String host = (String)DBPropertiesUtils.getDbMsg(request).get("ip");
 
       String realPath = request.getSession().getServletContext().getRealPath("/");
       String Topath = realPath + "\\ui\\lib";
       String loginCommand = new StringBuffer().append("localbin/mysql -u").append(username).append(" -p").append(password).append(" -h").append(host).toString();
 
       String switchCommand = new StringBuffer("use ").append(sqlType).toString();
 
       String charsetCommand = new StringBuffer("set names utf8;").toString();
 
       String importCommand = new StringBuffer("source ").append(path).toString();
 
       String[] commands = { loginCommand, switchCommand, charsetCommand, importCommand };
 
       Runtime runtime = Runtime.getRuntime();
 
       Process process = runtime.exec(commands[0]);
 
       OutputStream os = process.getOutputStream();
       OutputStreamWriter writer = new OutputStreamWriter(os);
 
       writer.write(commands[1] + "\r\n");
       writer.flush();
       Thread.sleep(300L);
       writer.write(commands[2] + "\r\n");
       Thread.sleep(300L);
       writer.flush();
       writer.write(commands[3]);
       Thread.sleep(300L);
 
       json.setFlag(0);
       json.setMsg("ok");
       writer.flush();
       writer.close();
       os.close();
     }
     catch (Exception e)
     {
       File file;
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     finally
     {
       try
       {
         File file = new File(path);
         file.delete();
       }
       catch (Exception e)
       {
       }
 
     }
 
     return json;
   }
 
   public void exportMenu(HttpServletRequest request, HttpServletResponse response)
   {
     String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
     ToJson json = new ToJson(0, "ok");
     String exportPath = null;
     String fileName = null;
 
     String realPath = request.getSession().getServletContext().getRealPath("/");
     String username = (String)DBPropertiesUtils.getDbMsg(request).get("username");
     String password = (String)DBPropertiesUtils.getDbMsg(request).get("password");
     String host = (String)DBPropertiesUtils.getDbMsg(request).get("ip");
 
     String tablename = "sys_menu sys_function";
 
     exportPath = realPath;
     fileName = "menu.sql";
 
     String path = exportPath + "\\ui\\lib";
     String[] command = { "sh ", "-c ", "bin/mysqldump -h" + host + " -u" + username + " -p" + password, sqlType + " " + tablename + " -r" + exportPath };
     try {
       Process runtimeProcess = Runtime.getRuntime().exec(command);
       int processComplete = runtimeProcess.waitFor();
       File file = new File(exportPath + fileName);
       Thread.sleep(300L);
       if (file.exists()) {
         response.setContentType("application/force-download");
         response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);
 
         byte[] buffer = new byte[1024];
         FileInputStream fis = null;
         BufferedInputStream bis = null;
         try {
           fis = new FileInputStream(file);
           bis = new BufferedInputStream(fis);
           OutputStream os = response.getOutputStream();
           int i = bis.read(buffer);
           while (i != -1) {
             os.write(buffer, 0, i);
             i = bis.read(buffer);
           }
         }
         catch (Exception e) {
           e.printStackTrace();
         }
         if (bis != null) {
           try {
             bis.close();
           }
           catch (IOException e) {
             e.printStackTrace();
           }
         }
         if (fis != null)
           try {
             fis.close();
           }
           catch (IOException e) {
             e.printStackTrace();
           }
       }
     }
     catch (Exception e)
     {
       File file1;
       e.printStackTrace();
     }
     finally
     {
       try
       {
         File file1;
         Thread.sleep(300L);
         file1 = new File(exportPath + fileName);
         Thread.sleep(300L);
         if (file1.exists())
           file1.delete();
       }
       catch (Exception e) {
         e.printStackTrace();
       }
     }
   }
 
   public ToJson<Object> editMenuPara(SysParaExtend sysParaExtend)
   {
     ToJson json = new ToJson();
     try
     {
       if (sysParaExtend != null)
       {
         String menuQuickGroup = sysParaExtend.getMenuQuickGroup();
         String menuWinexe = sysParaExtend.getMenuWinexe();
         String menuUrl = sysParaExtend.getMenuUrl();
         String menuExpandSingle = sysParaExtend.getMenuExpandSingle();
         String topMenuNum = sysParaExtend.getTopMenuNum();
 
         String menu_Display = "";
         if ((menuQuickGroup != null) && (menuQuickGroup != "")) {
           menu_Display = menu_Display + "," + menuQuickGroup;
         }
         if ((menuWinexe != null) && (menuWinexe != "")) {
           menu_Display = menu_Display + "," + menuWinexe;
         }
         if ((menuUrl != null) && (menuUrl != "")) {
           menu_Display = menu_Display + "," + menuUrl;
         }
         SysPara sysPara1 = new SysPara();
         SysPara sysPara2 = new SysPara();
         SysPara sysPara3 = new SysPara();
         sysPara1.setParaName("TOP_MENU_NUM");
         sysPara1.setParaValue(topMenuNum);
         sysPara2.setParaName("MENU_DISPLAY");
         sysPara2.setParaValue(menu_Display);
         sysPara3.setParaName("MENU_EXPAND_SINGLE");
         sysPara3.setParaValue(menuExpandSingle);
 
         this.sysParaService.updateSysPara(sysPara1);
         this.sysParaService.updateSysPara(sysPara2);
         this.sysParaService.updateSysPara(sysPara3);
         json.setMsg("修改成功");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("修改失败");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<SysParaExtend> getParaInfo()
   {
     SysParaExtend sysParaExtend = new SysParaExtend();
     ToJson json = new ToJson();
     try {
       SysPara sysPara1 = new SysPara();
       SysPara sysPara2 = new SysPara();
       SysPara sysPara3 = new SysPara();
       sysPara1.setParaName("TOP_MENU_NUM");
       sysPara2.setParaName("MENU_DISPLAY");
       sysPara3.setParaName("MENU_EXPAND_SINGLE");
 
       List top_menu_num = this.sysParaService.getTheSysParam("TOP_MENU_NUM");
       List menu_display = this.sysParaService.getTheSysParam("MENU_DISPLAY");
       List menu_expand_single = this.sysParaService.getTheSysParam("MENU_EXPAND_SINGLE");
       sysParaExtend.setTopMenuNum(((SysPara)top_menu_num.get(0)).getParaValue());
       String paraValue = ((SysPara)menu_display.get(0)).getParaValue();
       String[] split = paraValue.split(",");
       String MENU_QUICKGROUP = null;
       String MENU_WINEXE = null;
       String MENU_URL = null;
       for (String s : split) {
         if (s.equals("menuQuickGroup")) {
           MENU_QUICKGROUP = s;
         }
         if (s.equals("menuWinexe")) {
           MENU_WINEXE = s;
         }
         if (s.equals("menuUrl")) {
           MENU_URL = s;
         }
       }
       sysParaExtend.setMenuQuickGroup(MENU_QUICKGROUP);
       sysParaExtend.setMenuWinexe(MENU_WINEXE);
       sysParaExtend.setMenuUrl(MENU_URL);
       sysParaExtend.setMenuExpandSingle(((SysPara)menu_expand_single.get(0)).getParaValue());
       json.setObject(sysParaExtend);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setObject(sysParaExtend);
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public SysFunction getSysFunctionByFid(Integer fid)
   {
     return this.sysFunctionMapper.getSysFunctionByFid(fid);
   }
 }

