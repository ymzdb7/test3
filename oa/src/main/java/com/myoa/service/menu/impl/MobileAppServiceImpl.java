 package com.myoa.service.menu.impl;
 
 import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.menu.MobileAppMapper;
import com.myoa.dao.menu.SysFunctionMapper;
import com.myoa.model.menu.SysFunction;
import com.myoa.model.users.Users;
import com.myoa.service.menu.MobileAppService;
import com.myoa.service.users.UserFunctionService;
import com.myoa.service.users.UsersService;
import com.myoa.util.common.session.SessionUtils;

 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
 
 @Service
 public class MobileAppServiceImpl
   implements MobileAppService
 {
 
   @Resource
   private MobileAppMapper mobileAppMapper;
 
   @Resource
   private SysParaMapper sysParaMapper;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private UserFunctionService userFunctionService;
 
   @Resource
   private SysFunctionMapper sysFunctionMapper;
 
   public List getMobileAppList(HttpServletRequest request)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Integer uid = users.getUid();
 
     String userFunctionStr = this.userFunctionService.getUserFunctionStrById(uid);
     String[] funcIds = userFunctionStr.split(",");
 
     String ids = this.sysParaMapper.getSysPara();
     String[] firstIds = ids.split(",");
     List a11 = new ArrayList();
     for (int o = 0; o < firstIds.length; o++) {
       for (int k = 0; k < funcIds.length; k++) {
         if (firstIds[o].equals(funcIds[k])) {
           a11.add(firstIds[o]);
         }
       }
 
     }
 
     List<SysFunction> mList = this.sysFunctionMapper.getAll();
     List<List> mList1 = new ArrayList<List>();
     List<SysFunction> list1 = new ArrayList<SysFunction>();
 
     for (int j = 0; j < a11.size(); j++) {
       for (int i = 0; i < mList.size(); i++) {
         System.out.println(((SysFunction)mList.get(j)).getfId());
         if (((SysFunction)mList.get(i)).getfId().toString().equals(a11.get(j))) {
           list1.add(mList.get(i));
           break;
         }
 
       }
 
     }
 
     Object local = request.getSession().getAttribute("LOCALE_SESSION_ATTRIBUTE_NAME");
     String locale = "zh_CN";
     if (local == null)
       locale = "zh_CN";
     else {
       locale = local.toString();
     }
 
     if ((list1 != null) && (list1.size() > 0)) {
       for (SysFunction sysFunction : list1) {
         if (locale.equals("zh_CN"))
           sysFunction.setName(sysFunction.getName());
         else if (locale.equals("en_US"))
           sysFunction.setName(sysFunction.getName1());
         else if (locale.equals("zh_TW")) {
           sysFunction.setName(sysFunction.getName2());
         }
       }
     }
 
     mList1.add(list1);
 
     return list1;
   }
 }

