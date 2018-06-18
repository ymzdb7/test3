 package com.myoa.service.infoCenter;
 
 import com.myoa.dao.infoCenter.InfoCenterMapper;
import com.myoa.dao.users.UserFunctionMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.infoCenter.InfoCenter;
import com.myoa.model.users.Users;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;

 import java.util.ArrayList;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class InfoCenterService
 {
 
   @Autowired
   private UsersMapper usersMapper;
 
   @Autowired
   private InfoCenterMapper infoCenterMapper;
 
   @Autowired
   private UserFunctionMapper userFunctionMapper;
   private Users users;
 
   public BaseWrapper getInfoCenterOrder(HttpServletRequest request)
   {
     BaseWrapper wrapper = new BaseWrapper();
     this.users = ((Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users()));
     Users user = this.usersMapper.selectUserByUId(this.users.getUid());
     String definedOrder = this.infoCenterMapper.getInfoCenterDefinedOrder();
 
     if (user.getMytableLeft().equals("ALL")) {
       user.setMytableLeft(definedOrder);
     }
 
     String userIdFunctions = this.userFunctionMapper.getUserFuncIdStr(user.getUserId());
     userIdFunctions = getNewUserIdFunction(definedOrder, userIdFunctions);
     String[] infoCenters = user.getMytableLeft().split(",");
 
     infoCenters = power(infoCenters, userIdFunctions);
     user.setMytableLeft(transToStr(infoCenters));
 
     if (user != null) {
       wrapper.setFlag(true);
       wrapper.setMsg("查询成功！");
       wrapper.setData(user.getMytableLeft());
     } else {
       wrapper.setMsg("查询失败！");
     }
     return wrapper;
   }
 
   @Transactional(rollbackFor={RuntimeException.class})
   public BaseWrapper setInfoCenterOrder(String infoCenterOrder) {
     BaseWrapper wrapper = new BaseWrapper();
     Users user = this.usersMapper.selectUserByUId(this.users.getUid());
     user.setMytableLeft(infoCenterOrder);
     try
     {
       int result = this.usersMapper.editUser(user);
       if (result > 0) {
         wrapper.setFlag(true);
         wrapper.setMsg("更新成功！");
       } else {
         wrapper.setMsg("更新失败！");
       }
     } catch (Exception e) {
       e.printStackTrace();
       throw new RuntimeException("更新出错！");
     }
     return wrapper;
   }
 
   public BaseWrapper getHadInfoCenterList()
   {
     BaseWrapper wrapper = new BaseWrapper();
     List infoCenterList = new ArrayList();
 
     Users user = this.usersMapper.selectUserByUId(this.users.getUid());
     String definedOrder = this.infoCenterMapper.getInfoCenterDefinedOrder();
     String userFunctions;
   //  String userFunctions;
     if (!user.getMytableLeft().equals("ALL"))
       userFunctions = user.getMytableLeft();
     else {
       userFunctions = definedOrder;
     }
 
     String userIdFunctions = this.userFunctionMapper.getUserFuncIdStr(user.getUserId());
     userIdFunctions = getNewUserIdFunction(definedOrder, userIdFunctions);
     String[] infoCenters = userFunctions.split(",");
 
     infoCenters = power(infoCenters, userIdFunctions);
 
     for (String userFunction : infoCenters) {
       if (!userFunction.equals("")) {
         InfoCenter infoCenter = this.infoCenterMapper.getInfoCenterByInfoFuncId(Integer.valueOf(Integer.parseInt(userFunction)));
         if (infoCenter != null) {
           infoCenterList.add(infoCenter);
         }
       }
     }
 
     if (infoCenterList != null) {
       wrapper.setFlag(true);
       wrapper.setMsg("查询成功！");
       wrapper.setData(infoCenterList);
     } else {
       wrapper.setMsg("查询失败！");
     }
     return wrapper;
   }
 
   public BaseWrapper getChooseInfoCenterList()
   {
     BaseWrapper wrapper = new BaseWrapper();
     List infoCenterList = new ArrayList();
     Users user = this.usersMapper.selectUserByUId(this.users.getUid());
     String definedOrder = this.infoCenterMapper.getInfoCenterDefinedOrder();
 
     String userFunctions = user.getMytableLeft();
 
     String userIdFunctions = this.userFunctionMapper.getUserFuncIdStr(user.getUserId());
 
     if (userFunctions.equals("ALL")) {
       userFunctions = definedOrder;
     }
 
     String[] userFunctionList = userFunctions.split(",");
     userIdFunctions = getNewUserIdFunction(definedOrder, userIdFunctions);
 
     String[] userIdFunctionList = userIdFunctions.split(",");
 
     for (String userFunction : userFunctionList) {
       for (int i = 0; i < userIdFunctionList.length; i++) {
         if (userFunction.equals(userIdFunctionList[i])) {
           userIdFunctionList[i] = "";
         }
       }
     }
 
     for (String userIdFunction : userIdFunctionList) {
       InfoCenter infoCenter = null;
       if (!userIdFunction.equals("")) {
         infoCenter = this.infoCenterMapper.getInfoCenterByInfoFuncId(Integer.valueOf(Integer.parseInt(userIdFunction)));
         if (infoCenter != null) {
           infoCenterList.add(infoCenter);
         }
       }
     }
 
     if (infoCenterList != null) {
       wrapper.setFlag(true);
       wrapper.setMsg("查询成功！");
       wrapper.setData(infoCenterList);
     } else {
       wrapper.setMsg("查询失败！");
     }
     return wrapper;
   }
 
   public String[] power(String[] theTables, String userIdFunctions)
   {
     int i = 0;
     for (String theTable : theTables) {
       if (!("," + userIdFunctions + ",").contains("," + theTable + ",")) {
         theTables[i] = "";
       }
       i++;
     }
     return theTables;
   }
 
   public String transToStr(String[] strs)
   {
     String result = "";
     for (String str : strs) {
       if (str != "") {
         result = result + str + ",";
       }
     }
     return result;
   }
 
   public String getNewUserIdFunction(String definedOrders, String userIdFunctions)
   {
     String[] definedOrderList = definedOrders.split(",");
     for (String order : definedOrderList) {
       if ((Integer.parseInt(order) > 0) || 
         (StringUtils.checkNull(userIdFunctions).booleanValue())) continue;
       if (!userIdFunctions.substring(userIdFunctions.length() - 1, userIdFunctions.length()).equals(","))
         userIdFunctions = userIdFunctions + "," + order + ",";
       else {
         userIdFunctions = userIdFunctions + order + ",";
       }
 
     }
 
     return userIdFunctions;
   }
 }

