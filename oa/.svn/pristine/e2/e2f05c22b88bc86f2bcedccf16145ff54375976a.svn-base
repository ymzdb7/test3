 package com.myoa.service.syspara.impl;
 
 import com.alibaba.fastjson.JSONArray;
import com.myoa.dao.common.SecureRuleMapper;
import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.edu.eduUser.EduUserMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.common.SecureRule;
import com.myoa.model.common.SysPara;
import com.myoa.model.edu.eduUser.EduUser;
import com.myoa.model.users.Users;
import com.myoa.service.syspara.SysParaService;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;

 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class SysParaServiceImpl
   implements SysParaService
 {
 
   @Resource
   private SysParaMapper sysParaMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private EduUserMapper eduUserMapper;
 
   @Resource
   private SecureRuleMapper secureRuleMapper;
 
   public List<SysPara> getIeTitle()
   {
     return this.sysParaMapper.getIeTitle();
   }
 
   public List<SysPara> getIeTitle1()
   {
     return this.sysParaMapper.getIeTitle1();
   }
 
   public void updateSysPara(SysPara sysPara)
   {
     this.sysParaMapper.updateSysPara(sysPara);
   }
 
   public void updateSysPara1(SysPara sysPara)
   {
     this.sysParaMapper.updateSysPara1(sysPara);
   }
 
   public List<SysPara> getTheSysParam(String paraName)
   {
     return this.sysParaMapper.getTheSysParam(paraName);
   }
 
   public ToJson<SysPara> getUserName(String paraName)
   {
     ToJson json = new ToJson();
     try {
       SysPara sysPara = this.sysParaMapper.querySysPara(paraName);
       StringBuffer userName = new StringBuffer();
       StringBuffer userId = new StringBuffer();
       StringBuffer sb = new StringBuffer();
       List usersList = new ArrayList();
       String name = "";
       if ((sysPara != null) && 
         (sysPara.getParaValue() != null)) {
         String[] split = sysPara.getParaValue().split(",");
 
         for (String s : split) {
           String Name = this.usersMapper.getUsernameById(s);
           Users byUid = this.usersMapper.getByUid(Integer.valueOf(s).intValue());
           String user_Id = byUid.getUserId();
           if ((user_Id != null) && (user_Id != "")) {
             userId.append(user_Id + ",");
           }
           if ((Name != null) && (Name != "")) {
             Users userByuid = this.usersMapper.findUserByuid(Integer.valueOf(s).intValue());
             usersList.add(userByuid);
             sb.append(s + ",");
             userName.append(Name + ",");
           }
         }
       }
 
       if ((userName != null) && (userName.toString() != "")) {
         name = userName.toString().substring(0, userName.toString().length() - 1);
       }
       if (sb != null) {
         sysPara.setParaValue(sb.toString().substring(0, sb.toString().length() - 1));
       }
       if (name != null) {
         sysPara.setUserName(name.toString());
       }
       sysPara.setUserId(userId.toString());
       sysPara.setUsersList(usersList);
       json.setObject(sysPara);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> editSysPara(String usersIds)
   {
     ToJson json = new ToJson();
     try {
       StringBuffer paraValue = new StringBuffer();
       if ((usersIds != null) && (usersIds != "")) {
         String[] split = usersIds.split(",");
         List<Users> usersByUserIds = this.usersMapper.getUsersByUserIds(split);
         for (Users users : usersByUserIds) {
           Integer uid = users.getUid();
           if (uid != null) {
             paraValue.append(uid + ",");
           }
         }
       }
       SysPara sysPara = new SysPara();
       sysPara.setParaName("MEETING_MANAGER_TYPE");
       sysPara.setParaValue(paraValue.toString());
       updateSysPara(sysPara);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public boolean checkIsHaveSecure(Users users, Integer type)
   {
     Map m = getAllSecureSwitch();
     if ((!StringUtils.checkNull((String)m.get("switch")).booleanValue()) && (((String)m.get("switch")).equals("1")))
     {
       Map map = getAllSecureRule();
       SecureRule secureRule = (SecureRule)map.get(type);
       if ((secureRule.getSysRule().equals("1")) && (secureRule.getUseFlag().equals("1")))
       {
         String rulePriv = getRulePriv(secureRule);
 
         return (!StringUtils.checkNull((String)m.get(rulePriv)).booleanValue()) && (((String)m.get(rulePriv)).contains(String.valueOf(users.getUid())));
       }
 
     }
     else
     {
       return true;
     }
     return false;
   }
 
   public Map<Integer, SecureRule> getAllSecureRule() {
     List<SecureRule> list = this.secureRuleMapper.getAllSecureRule();
     Map map = new HashMap();
     for (SecureRule secureRule : list) {
       map.put(secureRule.getRuleId(), secureRule);
     }
     return map;
   }
 
   public Map<String, String> getAllSecureSwitch() {
     SysPara sysPara = this.sysParaMapper.querySysPara("SECURE_SWITCH");
     String paraValue = sysPara.getParaValue();
     Map param = new HashMap();
     JSONArray json = new JSONArray();
     param = (Map)JSONArray.parseObject(paraValue, Map.class);
     String swith = (String)param.get("swith");
     String syser = (String)param.get("syser");
     String safer = (String)param.get("safer");
     String audutor = (String)param.get("auditor");
     String userPriv = (String)param.get("userPriv");
 
     Map map = new HashMap();
     map.put("switch", swith);
     map.put("syser", syser);
     map.put("safer", safer);
     map.put("auditor", audutor);
     map.put("userPriv", userPriv);
     return map;
   }
 
   public String getRulePriv(SecureRule secureRule)
   {
     byte rulePriv = secureRule.getRulePriv().byteValue();
     if (rulePriv == 1) {
       return "syser";
     }
     if (rulePriv == 2) {
       return "safer";
     }
     if (rulePriv == 3) {
       return "auditor";
     }
     return null;
   }
 
   public ToJson<Object> getStatus()
   {
     ToJson json = new ToJson(1, "err");
     SysPara status = this.sysParaMapper.getStatus();
     if (status != null) {
       String paraValue = status.getParaValue();
       Date date = new Date();
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
       String startTime = simpleDateFormat.format(date);
       int i = Integer.valueOf(startTime).intValue() + 1;
       String time = startTime + "-" + i;
       if (time.equals(paraValue)) {
         json.setMsg("今年学生已经生过级");
         json.setFlag(0);
       }
     }
     return json;
   }
 
   public ToJson<SysPara> eduSetParam(String firstDate, String secondDate, String initPwd)
   {
     ToJson json = new ToJson(1, "error");
     try {
       SysPara sysPara = new SysPara();
       sysPara.setParaName("SUMMER_VACATION_END");
       sysPara.setParaValue(firstDate);
       this.sysParaMapper.updateSysPara(sysPara);
       sysPara.setParaName("WINTER_VACATION_END");
       sysPara.setParaValue(secondDate);
       this.sysParaMapper.updateSysPara(sysPara);
       sysPara.setParaName("EDU_DEFAULT_PASSWORD");
       sysPara.setParaValue(initPwd);
       this.sysParaMapper.updateSysPara(sysPara);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public AjaxJson selEduParam()
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setFlag(false);
     ajaxJson.setMsg("error");
     try {
       Map map = new HashMap();
       List<SysPara> sysParaList = this.sysParaMapper.selEduParam();
       for (SysPara sysPara : sysParaList) {
         map.put(sysPara.getParaName(), sysPara.getParaValue());
       }
       ajaxJson.setAttributes(map);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public ToJson<Object> editOperator(String usersIds)
   {
     ToJson json = new ToJson();
     try {
       SysPara sysPara = new SysPara();
       sysPara.setParaName("OPERATOR_NAME");
       sysPara.setParaValue(usersIds);
       updateSysPara(sysPara);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<SysPara> getOperator(String paraName)
   {
     ToJson json = new ToJson();
     try {
       SysPara sysPara = this.sysParaMapper.querySysPara(paraName);
       StringBuffer userName = new StringBuffer();
       StringBuffer sb = new StringBuffer();
       List usersList = new ArrayList();
       String name = "";
       if ((sysPara != null) && 
         (sysPara.getParaValue() != null)) {
         String[] split = sysPara.getParaValue().split(",");
         for (String s : split) {
           EduUser byuserId = this.eduUserMapper.getByuserId(s);
           if (byuserId != null) {
             String userName1 = byuserId.getUserName();
             usersList.add(byuserId);
             if (!StringUtils.checkNull(userName1).booleanValue()) {
               sb.append(s + ",");
               userName.append(userName1 + ",");
             }
           }
         }
 
       }
 
       if (!StringUtils.checkNull(userName.toString()).booleanValue()) {
         name = userName.toString().substring(0, userName.toString().length() - 1);
         sysPara.setUserName(name);
       }
       if (!StringUtils.checkNull(sb.toString()).booleanValue()) {
         sysPara.setParaValue(sb.toString().substring(0, sb.toString().length() - 1));
       }
       sysPara.setEduUserList(usersList);
       json.setObject(sysPara);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 }

