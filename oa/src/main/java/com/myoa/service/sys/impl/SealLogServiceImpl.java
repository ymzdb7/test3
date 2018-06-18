 package com.myoa.service.sys.impl;
 
 import com.myoa.dao.sys.SealLogMapper;
import com.myoa.dao.sys.SealMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.sys.Seal;
import com.myoa.model.sys.SealLog;
import com.myoa.model.sys.SealWithBLOBs;
import com.myoa.model.users.Users;
import com.myoa.service.sys.SealLogService;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class SealLogServiceImpl
   implements SealLogService
 {
 
   @Resource
   private SealLogMapper sealLogMapper;
 
   @Resource
   private SealMapper sealMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   public int addSealLog(SealLog sealLog)
   {
     return this.sealLogMapper.insertSelective(sealLog);
   }
 
   public ToJson<SealLog> getAllSealLog(String startTime, String endTime, HttpServletRequest request, String sealName, SealLog sealLog, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson(1, "err");
     try {
       if (startTime == "") {
         startTime = null;
       }
       if (endTime == "") {
         endTime = null;
       }
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       Map map = new HashMap();
       map.put("page", pageParams);
       map.put("startTime", startTime);
       map.put("endTime", endTime);
       StringBuffer sb = new StringBuffer();
       String id = "";
       if ((sealName != null) && (sealName != "")) {
         List<SealWithBLOBs> sealByName = this.sealMapper.getSealByName(sealName);
         for (SealWithBLOBs seal : sealByName) {
           id = sb.append(seal.getSealId() + ",").toString();
         }
         id = id.substring(0, id.length() - 1);
       }
       sealLog.setsId(id);
       map.put("sealLog", sealLog);
       List<SealLog> allSealLogInfo = this.sealLogMapper.getAllSealLogInfo(map);
       if (allSealLogInfo != null) {
         for (SealLog sealLog1 : allSealLogInfo) {
           Seal sealLogBySealId = this.sealMapper.getSealLogBySealId(sealLog1.getsId());
           if (sealLogBySealId != null)
             sealLog1.setSealName(sealLogBySealId.getSealName());
           else {
             sealLog1.setSealName("印章已删除");
           }
           Users usersByuserId = this.usersMapper.getUsersByuserId(sealLog1.getUserId());
           sealLog1.setUserName(usersByuserId.getUserName());
 
           if (sealLog1.getLogType().equals("makeseal")) {
             sealLog1.setLogTypeName("制作印章");
           }
           else if (sealLog1.getLogType().equals("setseal")) {
             sealLog1.setLogTypeName("印章授权");
           }
           else if (sealLog1.getLogType().equals("deleteseal")) {
             sealLog1.setLogTypeName("删除印章");
           }
         }
       }
       json.setFlag(0);
       json.setMsg("ok");
       json.setObj(allSealLogInfo);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> deleteSealLog(String[] ids)
   {
     ToJson json = new ToJson(1, "err");
     try {
       this.sealLogMapper.deleteSealLog(ids);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 }