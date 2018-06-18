 package com.myoa.service.received.impl;
 
 import com.myoa.dao.sms3.Sms3Mapper;
import com.myoa.model.sms3.Sms3;
import com.myoa.service.received.Sms3Service;
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
 public class Sms3ServiceImpl
   implements Sms3Service
 {
 
   @Resource
   private Sms3Mapper sms3Mapper;
 
   public ToJson<Sms3> selectSms3(HttpServletRequest request, HttpServletResponse response, Integer page, Integer pageSize, boolean useFlag, Sms3 sms3)
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
       map.put("sms3", sms3);
       List list = this.sms3Mapper.selectSms3(map);
 
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
   public ToJson selectSms3ById(HttpServletRequest request, Integer smsId) {
     ToJson json = new ToJson();
     try {
       Sms3 sms3 = this.sms3Mapper.selectByPrimaryKey(smsId);
 
       json.setObject(sms3);
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
   public ToJson insertSms3(Sms3 sms3) {
     ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.sms3Mapper.insertSelective(sms3);
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
   public ToJson delSms3(Sms3 sms3) {
     ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.sms3Mapper.delSms3(sms3);
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
   public ToJson upSms3(Sms3 sms3) { ToJson toJson = new ToJson(1, "error");
     try {
       int temp = this.sms3Mapper.updateByPrimaryKeySelective(sms3);
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
 }

