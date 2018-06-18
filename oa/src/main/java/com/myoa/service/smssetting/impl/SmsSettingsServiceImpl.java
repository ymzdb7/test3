 package com.myoa.service.smssetting.impl;
 
 import com.myoa.dao.smsSettings.SmsSettingsMapper;
import com.myoa.model.smsSettings.SmsSettings;
import com.myoa.service.smssetting.SmsSettingsService;
import com.myoa.util.ToJson;

 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class SmsSettingsServiceImpl
   implements SmsSettingsService
 {
 
   @Autowired
   private SmsSettingsMapper smsSettingsMapper;
 
   @Transactional
   public ToJson insertSmsSettings(SmsSettings smsSettings)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.smsSettingsMapper.insertSelective(smsSettings);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("success");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
 
     return toJson;
   }
 
   @Transactional
   public ToJson delSmsSettings(int id) {
     ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.smsSettingsMapper.deleteByPrimaryKey(Integer.valueOf(id));
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("success");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson upSmsSettings(SmsSettings smsSettings) {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       int temp = this.smsSettingsMapper.updateByPrimaryKeySelective(smsSettings);
       int id = 0;
       if ((temp > 0) && 
         (!smsSettings.getState().equals("0"))) {
         List list = this.smsSettingsMapper.selectSmsSettingsState(smsSettings.getId());
         for (int i = 0; i < list.size(); i++) {
           id = ((SmsSettings)list.get(i)).getId().intValue();
           this.smsSettingsMapper.upSmsSettingsState(Integer.valueOf(id));
         }
         toJson.setFlag(0);
         toJson.setMsg("success");
       }
     }
     catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson selectSmsSettings() {
     ToJson toJson = new ToJson(1, "error");
     Map map = new HashMap();
     try {
       List list = this.smsSettingsMapper.selectSmsSettings(map);
 
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setMsg("success");
         toJson.setFlag(0);
       }
     }
     catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
 
     return toJson;
   }
   @Transactional
   public ToJson selectSmsSettingsAll() { ToJson toJson = new ToJson(1, "error");
     Map map = new HashMap();
     try {
       List list = this.smsSettingsMapper.selectSmsSettingsAll(map);
 
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setMsg("success");
         toJson.setFlag(0);
       }
     }
     catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
 
     return toJson; }
 
   @Transactional
   public ToJson selectSmsSettingsById(HttpServletRequest request, Integer id) {
     ToJson toJson = new ToJson(1, "error");
     try {
       SmsSettings smsSettings = this.smsSettingsMapper.selectByPrimaryKey(id);
 
       toJson.setObject(smsSettings);
       toJson.setFlag(0);
       toJson.setMsg("ok");
     }
     catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 }

