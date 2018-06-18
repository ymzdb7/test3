 package com.myoa.service.syspara.impl;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.notify.NotifyMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.common.SysPara;
import com.myoa.model.notify.Notify;
import com.myoa.model.users.Users;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.syspara.SysParaNotifyService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.LinkedHashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class SysParaNotifyServiceImpl
   implements SysParaNotifyService
 {
 
   @Resource
   SysParaMapper sysParaMapper;
 
   @Resource
   DepartmentMapper departmentMapper;
 
   @Resource
   UsersMapper usersMapper;
 
   @Resource
   NotifyMapper notifyMapper;
 
   @Resource
   UsersService usersService;
 
   @Resource
   DepartmentService departmentService;
 
   @Resource
   UsersPrivService usersPrivService;
 
   @Resource
   SysCodeMapper sysCodeMapper;
   public static String notifyDatetime = "1970-01-01 08:00:00";
 
   public ToJson<Object> editNotify(String singls, String manager, String edit, String userIds)
   {
     ToJson json = new ToJson();
     try {
       SysPara sysPara = new SysPara();
       sysPara.setParaName("NOTIFY_AUDITING_SINGLE_NEW");
       sysPara.setParaValue(singls);
       this.sysParaMapper.updateSysPara(sysPara);
       sysPara.setParaName("NOTIFY_AUDITING_MANAGER");
       sysPara.setParaValue(manager);
       this.sysParaMapper.updateSysPara(sysPara);
       sysPara.setParaName("NOTIFY_AUDITING_EDIT");
       sysPara.setParaValue(edit);
       this.sysParaMapper.updateSysPara(sysPara);
       sysPara.setParaName("NOTIFY_AUDITING_ALL");
       sysPara.setParaValue(userIds);
       this.sysParaMapper.updateSysPara(sysPara);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> selectNotify()
   {
     ToJson json = new ToJson();
     try {
       List codeList = this.sysCodeMapper.getNotifyType();
       List<SysPara> sysParaList = this.sysParaMapper.selectNotify();
       List allList = new ArrayList();
       String userIds = null;
       for (SysPara sysPara : sysParaList) {
         Map map = new LinkedHashMap();
         if (sysPara.getParaName().equals("NOTIFY_AUDITING_SINGLE_NEW")) {
           String[] singls = sysPara.getParaValue().split(",");
           Integer[] singlArr = new Integer[singls.length];
           singlArr[0] = Integer.valueOf(singls[0].split("-")[1]);
           for (int i = 0; i < codeList.size(); i++) {
             Integer res = Integer.valueOf(0);
             for (String s : singls) {
               String[] singleArr = s.split("-");
               if (((SysCode)codeList.get(i)).getCodeNo().equals(singleArr[0])) {
                 res = Integer.valueOf(singleArr[1]);
               }
             }
             singlArr[(i + 1)] = res;
           }
           map.put("singls", singlArr);
           allList.add(map);
         }
         if (sysPara.getParaName().equals("NOTIFY_AUDITING_MANAGER")) {
           map.put("manager", sysPara.getParaValue());
           allList.add(map);
         }
         if (sysPara.getParaName().equals("NOTIFY_AUDITING_EDIT")) {
           map.put("edit", sysPara.getParaValue());
           allList.add(map);
         }
         if (sysPara.getParaName().equals("NOTIFY_AUDITING_ALL")) {
           userIds = sysPara.getParaValue();
         }
       }
       if (!StringUtils.checkNull(userIds).booleanValue()) {
         String[] uerIdArr = userIds.split(",");
         List<Users> usersList = this.usersMapper.getUserByUserIds(uerIdArr);
         for (Users user : usersList) {
           Map userMap = new LinkedHashMap();
           userMap.put("uId", user.getUid());
           userMap.put("userId", user.getUserId());
           userMap.put("userName", user.getUserName());
           userMap.put("deptId", user.getDeptId());
           allList.add(userMap);
         }
       }
       json.setObj(allList);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> getDeptManagers(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       List deptManagerList = new ArrayList();
       String managerIds = this.departmentMapper.getDeptManagerIdByDeptId(user.getDeptId());
       String[] managerIdArr = managerIds.split(",");
       if (StringUtils.checkNull(managerIds).booleanValue()) {
         managerIdArr = null;
       }
       String autidingUserIds = this.sysParaMapper.getAutidingUsers();
       String[] autidingUserIdArr = autidingUserIds.split(",");
       if (StringUtils.checkNull(autidingUserIds).booleanValue()) {
         autidingUserIdArr = null;
       }
       List<Users> usersList = this.usersMapper.getUserByUids(managerIdArr, autidingUserIdArr);
       for (Users users : usersList) {
         Map userMap = new LinkedHashMap();
         userMap.put("uid", users.getUid());
         userMap.put("userName", users.getUserName());
         userMap.put("userId", users.getUserId());
         userMap.put("deptId", users.getDeptId());
         deptManagerList.add(userMap);
       }
       json.setObj(deptManagerList);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Notify> getApprovedNotifyList(String typeId, Integer start, Integer size, Integer page, Integer pageSize, Boolean useFlag)
   {
     ToJson json = new ToJson();
     try {
       Map maps = new HashMap();
       PageParams pageParams = new PageParams();
       pageParams.setUseFlag(useFlag);
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       maps.put("page", pageParams);
       maps.put("typeId", typeId);
       maps.put("start", start);
       maps.put("size", size);
       List<Notify> notifyList = this.notifyMapper.selectApprovedNotifyByTypeId(maps);
       for (Notify notify : notifyList) {
         if ((notify.getBeginDate() != null) && (!"".equals(notify.getBeginDate()))) {
           if (!notifyDatetime.equals(DateFormat.getStrTime(notify.getBeginDate())))
             notify.setBegin(DateFormat.getStrDateTime(notify.getBeginDate()));
           else
             notify.setBegin("");
         }
         else {
           notify.setBegin("");
         }
         if ((notify.getEndDate() != null) && (!"".equals(notify.getEndDate()))) {
           if (!notifyDatetime.equals(DateFormat.getStrTime(notify.getEndDate())))
             notify.setEnd(DateFormat.getStrDateTime(notify.getEndDate()));
           else
             notify.setEnd("");
         }
         else {
           notify.setEnd("");
         }
 
         String usename = this.usersMapper.getUsernameByUserId(notify.getFromId());
         notify.setName(usename);
         if ((notify.getTypeId() != null) && (!notify.getTypeId().equals(""))) {
           String name11 = this.sysCodeMapper.getNotifyNameByNo(notify.getTypeId());
           if (StringUtils.checkNull(name11).booleanValue())
             notify.setTypeName("");
           else
             notify.setTypeName(name11);
         }
         else
         {
           notify.setTypeName("");
         }
         StringBuffer s = new StringBuffer();
         StringBuffer s1 = new StringBuffer();
         StringBuffer s2 = new StringBuffer();
 
         String depId = notify.getToId();
 
         if (!StringUtils.checkNull(depId).booleanValue())
         {
           String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
           if (!"ALL_DEPT".trim().equals(notify.getToId()))
             notify.setDeprange(depName + ",");
           else {
             notify.setDeprange(depName);
           }
 
         }
 
         String userId = notify.getUserId();
         if (!StringUtils.checkNull(userId).booleanValue()) {
           String userName = this.usersService.getUserNameById(userId);
           notify.setUserrange(userName + ",");
         }
 
         String roleId = notify.getPrivId();
         if (!StringUtils.checkNull(roleId).booleanValue()) {
           String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
           notify.setRolerange(roleName + ",");
         }
 
       }
 
       json.setObj(notifyList);
       json.setTotleNum(pageParams.getTotal());
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Notify> getPendingNotifyList(String typeId, Integer start, Integer size, Integer page, Integer pageSize, Boolean useFlag)
   {
     ToJson json = new ToJson();
     try {
       Map maps = new HashMap();
       PageParams pageParams = new PageParams();
       pageParams.setUseFlag(useFlag);
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       maps.put("page", pageParams);
       maps.put("typeId", typeId);
       maps.put("start", start);
       maps.put("size", size);
       List list = new ArrayList();
       List<Notify> notifyList = this.notifyMapper.selectPendingNotifyByTypeId(maps);
       for (Notify notify : notifyList)
       {
         if ((notify.getBeginDate() != null) && (!"".equals(notify.getBeginDate()))) {
           if (!notifyDatetime.equals(DateFormat.getStrTime(notify.getBeginDate())))
             notify.setBegin(DateFormat.getStrDateTime(notify.getBeginDate()));
           else
             notify.setBegin("");
         }
         else {
           notify.setBegin("");
         }
         if ((notify.getEndDate() != null) && (!"".equals(notify.getEndDate()))) {
           if (!notifyDatetime.equals(DateFormat.getStrTime(notify.getEndDate())))
             notify.setEnd(DateFormat.getStrDateTime(notify.getEndDate()));
           else
             notify.setEnd("");
         }
         else {
           notify.setEnd("");
         }
         String usename = this.usersMapper.getUsernameByUserId(notify.getFromId());
         notify.setName(usename);
         if ((notify.getTypeId() != null) && (!notify.getTypeId().equals(""))) {
           String name11 = this.sysCodeMapper.getNotifyNameByNo(notify.getTypeId());
           if (StringUtils.checkNull(name11).booleanValue())
             notify.setTypeName("");
           else
             notify.setTypeName(name11);
         }
         else
         {
           notify.setTypeName("");
         }
         StringBuffer s = new StringBuffer();
         StringBuffer s1 = new StringBuffer();
         StringBuffer s2 = new StringBuffer();
 
         String depId = notify.getToId();
         if (!StringUtils.checkNull(depId).booleanValue())
         {
           String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
           if (!"ALL_DEPT".trim().equals(notify.getToId()))
             notify.setDeprange(depName + ",");
           else {
             notify.setDeprange(depName);
           }
 
         }
 
         String userId = notify.getUserId();
         if (!StringUtils.checkNull(userId).booleanValue()) {
           String userName = this.usersService.getUserNameById(userId);
           notify.setUserrange(userName + ",");
         }
 
         String roleId = notify.getPrivId();
         if (!StringUtils.checkNull(roleId).booleanValue()) {
           String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
           notify.setRolerange(roleName + ",");
         }
       }
 
       String isEdit = this.sysParaMapper.getEditFlag();
       Map map = new LinkedHashMap();
       map.put("isEdit", isEdit);
       list.add(map);
       list.add(notifyList);
       json.setObj(notifyList);
       json.setTotleNum(pageParams.getTotal());
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> getNotifyTypeList()
   {
     ToJson json = new ToJson();
     try
     {
       List<SysCode> codeList = this.sysCodeMapper.getNotifyType();
       String[] singleNewsArr = this.sysParaMapper.selectNotifySingleNew().split(",");
       List allCodeList = new ArrayList();
       Map AllTypeMap = new LinkedHashMap();
       String isEdit = "0";
       String AllType = "0";
       for (SysCode code : codeList) {
         Map map = new LinkedHashMap();
         for (int i = 0; i < singleNewsArr.length; i++) {
           String[] singleArr = singleNewsArr[i].split("-");
           if ("TYPE".equals(singleArr[0])) {
             AllTypeMap.put("AllType", "AllType");
             AllTypeMap.put("isEdit", singleArr[1]);
           }
           if (code.getCodeNo().equals(singleArr[0])) {
             map.put("codeId", code.getCodeId());
             map.put("codeNo", code.getCodeNo());
             map.put("codeName", code.getCodeName());
             map.put("isEdit", singleArr[1]);
             allCodeList.add(map);
           }
           else {
             isEdit = "1";
           }
         }
 
       }
 
       json.setObj(allCodeList);
       json.setObject(AllTypeMap);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> getNotifyCode()
   {
     ToJson json = new ToJson();
     try {
       List<SysCode> codeList = this.sysCodeMapper.getNotifyType();
       List allCodeList = new ArrayList();
       Map AllTypeMap = new LinkedHashMap();
       String isEdit = "0";
       StringBuffer sb = new StringBuffer("TYPE-0,");
       for (SysCode code : codeList) {
         sb.append(code.getCodeNo() + "-" + 0);
         sb.append(",");
         Map map = new LinkedHashMap();
         map.put("codeId", code.getCodeId());
         map.put("codeNo", code.getCodeNo());
         map.put("codeName", code.getCodeName());
         map.put("isEdit", Integer.valueOf(0));
         allCodeList.add(map);
       }
       AllTypeMap.put("AllType", "AllType");
       AllTypeMap.put("isEdit", isEdit);
       json.setObj(allCodeList);
       json.setObject(AllTypeMap);
       json.setFlag(0);
       json.setMsg(sb.toString());
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 }

