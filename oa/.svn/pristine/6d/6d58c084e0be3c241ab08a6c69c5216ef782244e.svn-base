 package com.myoa.service.sys.impl;
 
 import com.myoa.dao.sys.SealMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.sys.Seal;
import com.myoa.model.sys.SealLog;
import com.myoa.model.sys.SealWithBLOBs;
import com.myoa.model.users.Users;
import com.myoa.service.sys.SealLogService;
import com.myoa.service.sys.SealService;
import com.myoa.util.Constant;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.ipUtil.IpAddr;

 import java.net.InetAddress;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
 
 @Service
 public class SealServiceImpl
   implements SealService
 {
 
   @Resource
   private SealMapper sealMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private SealLogService sealLogService;
 
   public ToJson<Object> addSealObject(HttpServletRequest request, SealWithBLOBs sealWithBLOBs)
   {
     ToJson json = new ToJson(1, "err");
 
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     String userId = users.getUserId();
     sealWithBLOBs.setUserStr(userId + ",");
     if (sealWithBLOBs.getSealId() == null) {
       sealWithBLOBs.setSealId("");
     }
     if (sealWithBLOBs.getDeptId() == null) {
       sealWithBLOBs.setDeptId("");
     }
     if (sealWithBLOBs.getSealName() == null) {
       sealWithBLOBs.setSealName("");
     }
     if (sealWithBLOBs.getCertStr() == null) {
       sealWithBLOBs.setCertStr("");
     }
     if (sealWithBLOBs.getUserStr() == null) {
       sealWithBLOBs.setUserStr("");
     }
     if (sealWithBLOBs.getSealData() == null) {
       sealWithBLOBs.setSealData("");
     }
     Date date = new Date();
     sealWithBLOBs.setCreateTime(date);
     try {
       int i = this.sealMapper.insertSelective(sealWithBLOBs);
       SealLog sealLog = new SealLog();
       sealLog.setsId(sealWithBLOBs.getSealId());
       sealLog.setUserId(userId);
       sealLog.setLogTime(date);
       sealLog.setLogType("makeseal");
       sealLog.setResult("制章成功");
       InetAddress currentIp = IpAddr.getCurrentIp();
       sealLog.setIpAdd(currentIp.toString().substring(1, currentIp.toString().length()));
       int i1 = this.sealLogService.addSealLog(sealLog);
       if (i > 0) {
         json.setFlag(0);
         json.setMsg("ok");
       }
     }
     catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.getMessage();
     }
 
     return json;
   }
 
   public ToJson<Object> editSealObject(HttpServletRequest request, SealWithBLOBs seal)
   {
     ToJson json = new ToJson(1, "err");
     try
     {
       Date date = new Date();
       int i = this.sealMapper.updateByPrimaryKeySelective(seal);
 
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String userId = users.getUserId();
       SealLog sealLog = new SealLog();
       SealWithBLOBs sealById = this.sealMapper.getSealById(Integer.valueOf(seal.getId().intValue()));
       sealLog.setsId(sealById.getSealId());
       sealLog.setUserId(userId);
       sealLog.setLogTime(date);
       sealLog.setLogType("setseal");
 
       StringBuffer sb = new StringBuffer();
       if ((seal.getUserStr() != null) && (seal.getUserStr() != "")) {
         String userStr = seal.getUserStr();
         String[] split = userStr.split(",");
         for (String s : split) {
           Users usersByuserId = this.usersMapper.getUsersByuserId(s);
           sb.append(usersByuserId.getUserName() + ",");
         }
         seal.setUserName(sb.toString());
       } else {
         seal.setUserName("");
       }
       sealLog.setResult("授权给:" + seal.getUserName());
       InetAddress currentIp = IpAddr.getCurrentIp();
       sealLog.setIpAdd(currentIp.toString().substring(1, currentIp.toString().length()));
       int i1 = this.sealLogService.addSealLog(sealLog);
       if (i > 0) {
         json.setFlag(0);
         json.setMsg("ok");
       }
     } catch (Exception e) {
       e.getMessage();
     }
     return json;
   }
 
   public List<SealWithBLOBs> getSealByUser(HttpServletRequest request)
   {
     List sealByUser = new ArrayList();
 
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     String userId = users.getUserId();
     if (userId != null) {
       sealByUser = this.sealMapper.getSealByUser(userId);
     }
     for (Iterator i$ = sealByUser.iterator(); i$.hasNext(); ) {
				SealWithBLOBs sealWithBLOBs;
				sealWithBLOBs = (SealWithBLOBs)i$.next();
 
       List<Attachment> attachmentList = new ArrayList();
       if ((sealWithBLOBs.getAttachmentName() != null) && (!"".equals(sealWithBLOBs.getAttachmentName()))) {
         attachmentList = GetAttachmentListUtil.returnAttachment(sealWithBLOBs.getAttachmentName(), sealWithBLOBs.getAttachmentId(), Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), "seal");
       }
       if (attachmentList != null)
         for (Attachment attachment : attachmentList) {
           sealWithBLOBs.setUrl(attachment.getAttUrl());
           sealWithBLOBs.setName(attachment.getAttachName());
         }
     }
     SealWithBLOBs sealWithBLOBs;
     return sealByUser;
   }
 
   public ToJson<SealWithBLOBs> getAllSealInfo(SealWithBLOBs sealWithBLOBs, String startTime, String endTime)
   {
     ToJson json = new ToJson(1, "err");
     try {
       Map map = new HashMap();
       map.put("sealWithBLOBs", sealWithBLOBs);
       map.put("startTime", startTime);
       map.put("endTime", endTime);
 
       List<SealWithBLOBs> allSealInfo = this.sealMapper.getAllSealInfo(map);
       for (SealWithBLOBs sealWithBLOBs1 : allSealInfo) {
         StringBuffer sb = new StringBuffer();
         if ((sealWithBLOBs1.getUserStr() != null) && (sealWithBLOBs1.getUserStr() != "")) {
           String userStr = sealWithBLOBs1.getUserStr();
           String[] split = userStr.split(",");
           for (String s : split) {
             Users usersByuserId = this.usersMapper.getUsersByuserId(s);
             sb.append(usersByuserId.getUserName() + ",");
           }
           sealWithBLOBs1.setUserName(sb.toString());
         } else {
           sealWithBLOBs1.setUserName("");
         }
       }
       json.setFlag(0);
       json.setObj(allSealInfo);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<SealWithBLOBs> getSealById(String id)
   {
     ToJson json = new ToJson(1, "err");
     try {
       if (id != null) {
         StringBuffer sb = new StringBuffer();
         SealWithBLOBs sealById = this.sealMapper.getSealById(Integer.valueOf(id));
         if ((sealById.getUserStr() != null) && (sealById.getUserStr() != "")) {
           String[] split = sealById.getUserStr().split(",");
           for (String s : split) {
             Users usersByuserId = this.usersMapper.getUsersByuserId(s);
             sb.append(usersByuserId.getUserName() + ",");
           }
           sealById.setUserName(sb.toString());
         } else {
           sealById.setUserName(sb.toString());
         }
         json.setObject(sealById);
         json.setFlag(0);
         json.setMsg("ok");
       }
     } catch (NumberFormatException e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> deleteSeal(HttpServletRequest request, String[] ids)
   {
     ToJson json = new ToJson(1, "err");
     try
     {
       int i1;
       for (String s : ids)
       {
         Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
         String userId = users.getUserId();
         Date date = new Date();
         SealLog sealLog = new SealLog();
         if ((s != null) && (s != "")) {
           SealWithBLOBs sealById = this.sealMapper.getSealById(Integer.valueOf(s));
           sealLog.setsId(sealById.getSealId());
         } else {
           sealLog.setsId("");
         }
         sealLog.setUserId(userId);
         sealLog.setLogTime(date);
         sealLog.setLogType("deleteseal");
         sealLog.setResult("删除成功");
         InetAddress currentIp = IpAddr.getCurrentIp();
         sealLog.setIpAdd(currentIp.toString().substring(1, currentIp.toString().length()));
         i1 = this.sealLogService.addSealLog(sealLog);
       }
       this.sealMapper.deleteSeal(ids);
       json.setFlag(0);
       json.setMsg("ok");
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> getSealIdById(HttpServletRequest request, String id)
   {
     ToJson json = new ToJson(1, "err");
     try {
       Seal sealLogBySealId = this.sealMapper.getSealLogBySealIdLastOne(id);
       String sealId_1 = "0001";
       if (sealLogBySealId != null) {
         String sealId = sealLogBySealId.getSealId();
 
         String s = sealId.substring(0, sealId.length() - 3);
 
         String s2 = sealId.substring(sealId.length() - 3, sealId.length());
         Integer integer = Integer.valueOf(s2);
         integer = Integer.valueOf(integer.intValue() + 1);
         String s1 = integer.toString();
         if (s1.length() == 1) {
           s2 = "000" + integer;
           sealId_1 = s2;
         } else if (s1.length() == 2) {
           s2 = "00" + integer;
           sealId_1 = s2;
         }
         else if (s1.length() == 3) {
           s2 = "0" + integer;
           sealId_1 = s2;
         }
         else if (s1.length() == 4) {
           s2 = integer.toString();
           sealId_1 = s2;
         }
       }
       json.setFlag(0);
       json.setMsg("ok");
       json.setObject(sealId_1);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<SealWithBLOBs> getSealBySealId(HttpServletRequest request, String sealId)
   {
     ToJson json = new ToJson(1, "err");
     try {
       Seal sealLogBySealId = this.sealMapper.getSealLogBySealId(sealId);
       json.setFlag(0);
       json.setMsg("ok");
       json.setObject(sealLogBySealId);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 }

