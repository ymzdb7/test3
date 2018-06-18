 package com.myoa.service.smsDelivery.impl;
 
 import com.myoa.dao.sms2.Sms2Mapper;
import com.myoa.model.sms2.Sms2;
import com.myoa.service.smsDelivery.Sms2Service;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class Sms2ServiceImpl
   implements Sms2Service
 {
 
   @Resource
   private Sms2Mapper sms2Mapper;
 
   public ToJson<Sms2> selectSms2(HttpServletRequest request, HttpServletResponse response, Integer page, Integer pageSize, boolean useFlag, Sms2 sms2)
   {
     ToJson json = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setPageSize(pageSize);
     pageParams.setPage(page);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     try
     {
       Map map = new HashMap();
       map.put("page", pageParams);
       map.put("sms2", sms2);
       List list = this.sms2Mapper.selectSms2(map);
 
       if (list.size() > 0) {
         json.setObj(list);
         json.setTotleNum(pageParams.getTotal());
         json.setMsg("success");
         json.setFlag(0);
       }
     }
     catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson selectSms2ById(HttpServletRequest request, Integer smsId) {
     ToJson json = new ToJson();
     try {
       Sms2 sms2 = this.sms2Mapper.selectByPrimaryKey(smsId);
 
       json.setObject(sms2);
       json.setFlag(0);
       json.setMsg("ok");
     }
     catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
   @Transactional
   public ToJson insertSms2(Sms2 sms2) {
     ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.sms2Mapper.insertSelective(sms2);
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
   public ToJson delSms2(Sms2 sms2) {
     ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.sms2Mapper.delSms2(sms2);
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
   public ToJson upSms2(Sms2 sms2) { ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.sms2Mapper.updateByPrimaryKeySelective(sms2);
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
 
   public ToJson SendSms()
   {
     return null;
   }
 }
