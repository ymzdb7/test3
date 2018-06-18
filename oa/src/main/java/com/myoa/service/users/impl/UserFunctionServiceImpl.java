 package com.myoa.service.users.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.menu.SysFunctionMapper;
import com.myoa.dao.users.UserExtMapper;
import com.myoa.dao.users.UserFunctionMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.menu.SysFunction;
import com.myoa.model.users.UserFunction;
import com.myoa.service.users.UserFunctionService;
import com.myoa.util.ToJson;

 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class UserFunctionServiceImpl
   implements UserFunctionService
 {
 
   @Resource
   private UserFunctionMapper userFunctionMapper;
 
   @Resource
   private SysFunctionMapper sysFunctionMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private UserExtMapper userExtMapper;
 
   public ToJson<SysFunction> getMenu(int uid)
   {
     ToJson toJson = new ToJson(0, "显示结果");
     String[] strArray = null;
     List sFunList = this.sysFunctionMapper.getAll();
     UserFunction uFun = this.userFunctionMapper.getMenuByUserId(uid);
     strArray = uFun.getUserFunCidStr().split(",");
     List list1 = new ArrayList();
     System.out.println(strArray.length);
     for (int j = 0; j < strArray.length; j++) {
       for (int i = j; i < sFunList.size(); i++) {
         System.out.println(((SysFunction)sFunList.get(j)).getId());
         if (!((SysFunction)sFunList.get(i)).getId().toString().equals(strArray[j]))
           continue;
         list1.add(sFunList.get(i));
         break;
       }
 
     }
 
     toJson.setObj(list1);
     return toJson;
   }
 
   public List<String> getUserNameByFuncId(String fid)
   {
     List userNameList = null;
     List <String> uidList = this.usersMapper.getUserByFuncId(fid);
     if ((uidList != null) && (uidList.size() > 0))
     {
       List list = new ArrayList();
       for (String uid : uidList) {
         list.add(uid);
       }
 
       Map map = new HashMap();
       map.put("ids", list);
       userNameList = this.usersMapper.findUsersByIds(map);
     }
 
     return userNameList;
   }
 
   public void updateAuthUser(String fid, String uids)
   {
     String[] uidArr = null;
     if (uids != null) {
       uidArr = uids.split(",");
     }
 
     if ((uidArr != null) && (fid != null)) {
       for (String userId : uidArr) {
         String userFuncIdStr = this.userExtMapper.getUserFuncIdStr(userId);
         if ((userFuncIdStr != null) && ("".equals(userFuncIdStr))) {
           userFuncIdStr = fid.concat(",");
         }
         else if (userFuncIdStr != null) {
           if ((!userFuncIdStr.contains(",".concat(fid).concat(","))) && (!userFuncIdStr.contains("".concat(fid).concat(","))))
             userFuncIdStr = userFuncIdStr.concat(fid).concat(",");
         }
         else {
           userFuncIdStr = "".concat(fid).concat(",");
         }
 
         if (userFuncIdStr != null) {
           Map map = new HashMap();
           map.put("userId", userId);
           map.put("userFuncIdStr", userFuncIdStr);
           this.userExtMapper.updateUserFuncIdStr(map);
         }
 
       }
 
     }
 
     if ((uidArr != null) && (fid != null))
       for (String userId : uidArr) {
         String userFuncIdStr = this.userFunctionMapper.getUserFuncIdStr(userId);
         if ((userFuncIdStr != null) && ("".equals(userFuncIdStr))) {
           userFuncIdStr = fid.concat(",");
         }
         else if (userFuncIdStr != null) {
           if ((!userFuncIdStr.contains(",".concat(fid).concat(","))) && (!userFuncIdStr.contains("".concat(fid).concat(","))))
             userFuncIdStr = userFuncIdStr.concat(fid).concat(",");
           else {
             userFuncIdStr = userFuncIdStr.concat(fid).concat(",");
           }
 
         }
 
         Map map = new HashMap();
         map.put("userId", userId);
         map.put("userFuncIdStr", userFuncIdStr);
         this.userFunctionMapper.updateUserFuncIdStr(map);
       }
   }
 
   public void deleteAuthUser(String fid, String uids)
   {
     String[] uidArr = null;
     if (uids != null) {
       uidArr = uids.split(",");
     }
 
     if ((uidArr != null) && (fid != null)) {
       for (String userId : uidArr) {
         String userFuncIdStr = this.userFunctionMapper.getUserFuncIdStr(userId);
         if ((userFuncIdStr != null) && ((userFuncIdStr.contains(",".concat(fid).concat(","))) || (userFuncIdStr.contains(fid.concat(","))))) {
           userFuncIdStr = userFuncIdStr.replace(fid.concat(","), "");
           Map map = new HashMap();
           map.put("userId", userId);
           map.put("userFuncIdStr", userFuncIdStr);
           this.userFunctionMapper.updateUserFuncIdStr(map);
         }
       }
 
       for (String userId : uidArr)
       {
         String userFuncIdStr = this.userExtMapper.getUserFuncIdStr(userId);
         if ((userFuncIdStr != null) && ((userFuncIdStr.contains(",".concat(fid).concat(","))) || (userFuncIdStr.contains(fid.concat(","))))) {
           Map map = new HashMap();
           map.put("userId", userId);
 
           userFuncIdStr = userFuncIdStr.replace(",", "");
           map.put("userFuncIdStr", userFuncIdStr);
           this.userExtMapper.updateUserFuncIdStr(map);
         }
       }
     }
   }
 
   public UserFunction getMenuByUserId(int uid)
   {
     return this.userFunctionMapper.getMenuByUserId(uid);
   }
 
   public String getUserFunctionStr(String userId)
   {
     return this.userFunctionMapper.getUserFuncIdStr(String.valueOf(userId));
   }
 
   public String getUserFunctionStrById(Integer uid)
   {
     if (uid != null) {
       UserFunction userFunction = this.userFunctionMapper.getMenuByUserId(uid.intValue());
       if ((userFunction != null) && (userFunction.getUserFunCidStr() != null)) {
         return userFunction.getUserFunCidStr();
       }
     }
     return "";
   }
 }
