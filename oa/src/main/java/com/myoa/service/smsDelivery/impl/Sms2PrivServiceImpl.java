 package com.myoa.service.smsDelivery.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.sms2.Sms2PrivMapper;
import com.myoa.dao.smsSettings.SmsSettingsMapper;
import com.myoa.model.department.Department;
import com.myoa.model.sms2.Sms2Priv;
import com.myoa.model.smsSettings.SmsSettings;
import com.myoa.model.users.Users;
import com.myoa.service.smsDelivery.Sms2PrivService;
import com.myoa.service.users.UsersService;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.sendUtil.send;

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class Sms2PrivServiceImpl
   implements Sms2PrivService
 {
 
   @Resource
   private Sms2PrivMapper sms2PrivMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private SmsSettingsMapper smsSettingsMapper;
 
   @Transactional
   public ToJson<Sms2Priv> selectSms2Priv()
   {
     ToJson json = new ToJson();
     try {
       Sms2Priv sms2Priv = this.sms2PrivMapper.selectSms2Priv();
       if (!StringUtils.checkNull(sms2Priv.getTypePriv()).booleanValue()) {
         String[] split = sms2Priv.getTypePriv().split(",");
         List sms2Priv1 = this.sms2PrivMapper.selectSms2Priv1(split);
         json.setObj(sms2Priv1);
       }
 
       json.setMsg("ok");
       json.setFlag(0);
     }
     catch (Exception e)
     {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson upSms2Priv(Sms2Priv sms2Priv)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.sms2PrivMapper.upSms2Priv(sms2Priv);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<Sms2Priv> selectRemindPriv()
   {
     ToJson json = new ToJson();
     try {
       Sms2Priv sms2Priv = this.sms2PrivMapper.selectSms2Priv();
       if (!StringUtils.checkNull(sms2Priv.getRemindPriv()).booleanValue()) {
         String[] split = sms2Priv.getRemindPriv().split(",");
         List remindPriv1 = this.sms2PrivMapper.selectRemindPriv1(split);
         json.setObj(remindPriv1);
       }
 
       json.setMsg("ok");
       json.setFlag(0);
     }
     catch (Exception e)
     {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson upRemindPriv(Sms2Priv sms2Priv) {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (!StringUtils.checkNull(sms2Priv.getRemindPriv()).booleanValue()) {
         String[] split = sms2Priv.getRemindPriv().split(",");
         List<Sms2Priv> sms2PrivList = this.sms2PrivMapper.upRemindPriv(split);
         String str = "";
         for (Sms2Priv sms2Priv1 : sms2PrivList) {
           str = str + sms2Priv1.getUserId() + ",";
         }
         sms2Priv.setRemindPriv(str);
       }
       int temp = this.sms2PrivMapper.upSms2Priv(sms2Priv);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<Sms2Priv> selectSms2RemindPriv()
   {
     ToJson json = new ToJson();
     try {
       Sms2Priv sms2Priv = this.sms2PrivMapper.selectSms2Priv();
       if (!StringUtils.checkNull(sms2Priv.getSms2RemindPriv()).booleanValue()) {
         String[] split = sms2Priv.getSms2RemindPriv().split(",");
         List remindPriv1 = this.sms2PrivMapper.selectSms2RemindPriv1(split);
         json.setObj(remindPriv1);
       }
 
       json.setMsg("ok");
       json.setFlag(0);
     }
     catch (Exception e)
     {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson upselectSms2RemindPriv(Sms2Priv sms2Priv) {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (!StringUtils.checkNull(sms2Priv.getSms2RemindPriv()).booleanValue()) {
         String[] split = sms2Priv.getSms2RemindPriv().split(",");
         List<Sms2Priv> sms2PrivList = this.sms2PrivMapper.upselectSms2RemindPriv(split);
         String str = "";
         for (Sms2Priv sms2Priv1 : sms2PrivList) {
           str = str + sms2Priv1.getUserId() + ",";
         }
         sms2Priv.setSms2RemindPriv(str);
       }
       int temp = this.sms2PrivMapper.upSms2Priv(sms2Priv);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson selectModule()
   {
     ToJson json = new ToJson();
     try {
       Sms2Priv sms2Priv = this.sms2PrivMapper.selectSms2Priv();
 
       if (!StringUtils.checkNull(sms2Priv.getTypePriv()).booleanValue()) {
         String[] split = sms2Priv.getTypePriv().split(",");
         List sms2Priv1 = this.sms2PrivMapper.selectModule(split);
         json.setObj(sms2Priv1);
       }
 
       json.setMsg("ok");
       json.setFlag(0);
     }
     catch (Exception e)
     {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson selectModuleOrder()
   {
     ToJson json = new ToJson();
     try {
       List list = this.sms2PrivMapper.selectModuleOrder();
       json.setObj(list);
       json.setMsg("ok");
       json.setFlag(0);
     }
     catch (Exception e)
     {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
   @Transactional
   public ToJson selectSmsRemind() {
     ToJson json = new ToJson();
     try {
       Sms2Priv sms2Priv = this.sms2PrivMapper.selectSmsRemind();
       if (!StringUtils.checkNull(sms2Priv.getParaValue()).booleanValue()) {
         String[] split = sms2Priv.getParaValue().split("\\|");
         if (split.length == 1) {
           sms2Priv.setColumn1(split[0]);
         } else if (split.length == 2) {
           sms2Priv.setColumn1(split[0]);
           sms2Priv.setColumn2(split[1]);
         } else if (split.length == 3) {
           sms2Priv.setColumn1(split[0]);
           sms2Priv.setColumn2(split[1]);
           sms2Priv.setColumn3(split[2]);
         }
 
       }
 
       json.setObject(sms2Priv);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
   @Transactional
   public ToJson upSmsRemindSet(Sms2Priv sms2Priv) { ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.sms2PrivMapper.upSmsRemindSet(sms2Priv);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson; }
 
   @Transactional
   public ToJson selectSender(String name)
   {
     ToJson json = new ToJson();
     try {
       Sms2Priv sms2Priv = this.sms2PrivMapper.selectSmsRemind();
       if (!StringUtils.checkNull(sms2Priv.getParaValue()).booleanValue()) {
         String[] split = sms2Priv.getParaValue().split("\\|");
 
         if (split[2].contains("," + name + ","))
           sms2Priv.setSmsDefault("0");
         else {
           sms2Priv.setSmsDefault("1");
         }
         if (split[1].contains("," + name + ","))
           sms2Priv.setThingDefault("0");
         else {
           sms2Priv.setThingDefault("1");
         }
         if (split[0].contains("," + name + ","))
           sms2Priv.setThingRemind("0");
         else {
           sms2Priv.setThingRemind("1");
         }
       }
       json.setObject(sms2Priv);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson smsSender(StringBuffer mobileString, StringBuffer contextString, Sms2Priv sms2Priv) {
     ToJson toJson = new ToJson(1, "error");
 
     Map map = new HashMap();
 
     String stime = "";
     try
     {
       List<SmsSettings> list = this.smsSettingsMapper.selectSmsSettings(map);
       if (list.size() == 1) {
         for (SmsSettings smsSettings : list) {
           if (smsSettings.getState().equals("1")) {
             StringBuffer extno = new StringBuffer(smsSettings.getExtend2());
 
             send.doPost(mobileString, contextString, smsSettings.getProtocol(), smsSettings.getHost(), smsSettings.getPort(), smsSettings.getUsername(), smsSettings.getPwd(), smsSettings.getContentField(), smsSettings.getCode(), smsSettings.getMobile(), smsSettings.getTimeContent(), smsSettings.getSign(), smsSettings.getLocation(), smsSettings.getExtend1(), smsSettings.getExtend2(), smsSettings.getExtend3(), smsSettings.getExtend4(), smsSettings.getExtend5(), sms2Priv.getStartTime());
           }
 
         }
 
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     }
     catch (Exception e)
     {
       e.printStackTrace();
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson selSenderMobile(String smsDefault, Sms2Priv sms2Priv, StringBuffer contextString, HttpServletRequest request)
   {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       String[] userIdList = sms2Priv.getUserId().split(",");
       List<String> userArray = new ArrayList();
       for (String userId : userIdList) {
         userArray.add(userId);
       }
 
       List<Users> deptList = new ArrayList();
       if (!StringUtils.checkNull(sms2Priv.getToId()).booleanValue()) {
         if ("ALL_DEPT".trim().equals(sms2Priv.getToId())) {
           List<Department> deptListArr = this.departmentMapper.getAllDepartment();
           StringBuffer stringBuffer = new StringBuffer();
           for (Department department : deptListArr) {
             stringBuffer.append(department.getDeptId());
             stringBuffer.append(",");
           }
           deptList = this.usersService.getUserByDeptIds(stringBuffer.toString(), Integer.valueOf(1));
         } else {
           deptList = this.usersService.getUserByDeptIds(sms2Priv.getToId(), Integer.valueOf(1));
         }
       }
       List<String> deptArray = new ArrayList();
       for (Users users : deptList) {
         deptArray.add(users.getUserId());
       }
 
       List<Users> privList = new ArrayList<Users>();
       if (!StringUtils.checkNull(sms2Priv.getPrivId()).booleanValue()) {
         privList = this.usersService.getUserByDeptIds(sms2Priv.getPrivId(), Integer.valueOf(2));
       }
       List<String> privArray = new ArrayList();
       for (Users users : privList) {
         privArray.add(users.getUserId());
       }
 
       for (String userId : userArray) {
         int f1 = 0;
         for (String deptUser : deptArray) {
           if (userId.equals(deptUser)) {
             f1 = 1;
             break;
           }
         }
         if (f1 == 0) {
           deptArray.add(userId);
         }
       }
       for (String temp1 : deptArray) {
         int f2 = 0;
         for (String privUser : privArray) {
           if (temp1.equals(privUser)) {
             f2 = 1;
             break;
           }
         }
         if (f2 == 0) {
           privArray.add(temp1);
         }
       }
       StringBuffer mobileString = new StringBuffer();
       for (String tempUser : privArray) {
         String mobile = this.sms2PrivMapper.selSenderMobile(tempUser);
         if ((mobile != null) && (!mobile.equals(""))) {
           mobileString.append(mobile + ",");
         }
 
       }
 
       smsSender(mobileString, contextString, sms2Priv);
 
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<Sms2Priv> selOutPriv()
   {
     ToJson json = new ToJson();
     try {
       Sms2Priv sms2Priv = this.sms2PrivMapper.selectSms2Priv();
       if (!StringUtils.checkNull(sms2Priv.getOutPriv()).booleanValue()) {
         String[] split = sms2Priv.getOutPriv().split(",");
         List sms2Priv1 = this.sms2PrivMapper.selOutPriv(split);
         json.setObj(sms2Priv1);
       }
 
       json.setMsg("ok");
       json.setFlag(0);
     }
     catch (Exception e)
     {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson upOutPriv(Sms2Priv sms2Priv)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (!StringUtils.checkNull(sms2Priv.getOutPriv()).booleanValue()) {
         String[] split = sms2Priv.getOutPriv().split(",");
         List<Sms2Priv> sms2PrivList = this.sms2PrivMapper.upOutPriv(split);
         String str = "";
         for (Sms2Priv sms2Priv1 : sms2PrivList) {
           str = str + sms2Priv1.getUserId() + ",";
         }
         sms2Priv.setOutPriv(str);
       }
       int temp = this.sms2PrivMapper.upSms2Priv(sms2Priv);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson outToSelf(Sms2Priv sms2Priv)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.sms2PrivMapper.upSms2Priv(sms2Priv);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 }
