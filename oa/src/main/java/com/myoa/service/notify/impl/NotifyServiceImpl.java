 package com.myoa.service.notify.impl;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.notify.NotifyMapper;
import com.myoa.dao.users.UserPrivMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.department.Department;
import com.myoa.model.notify.Notify;
import com.myoa.model.users.Users;
import com.myoa.service.ThreadSerivice.ThreadService;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.notify.NotifyService;
import com.myoa.service.sms.SmsService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelUtil;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.page.PageParams;

 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.commons.collections.map.HashedMap;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class NotifyServiceImpl
   implements NotifyService
 {
   public static String notifyChageId = "1";
   public static String notifyDatetime = "1970-01-01 08:00:00";
 
   @Autowired
   ThreadPoolTaskExecutor threadPoolTaskExecutor;
 
   @Resource
   private NotifyMapper notifyMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   @Resource
   private DepartmentService departmentService;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private UsersPrivService usersPrivService;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private SysCodeMapper sysCodeMapper;
 
   @Resource
   private UserPrivMapper userPrivMapper;
 
   @Resource
   private SmsService smsService;
 
   @Autowired
   ThreadService threadService;
 
   public ToJson<Notify> selectNotify(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name) throws Exception { String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     ToJson json = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
     String changeId = (String)maps.get("changeId");
     if (StringUtils.checkNull(changeId).booleanValue()) {
       json.setFlag(1);
       json.setMsg("err");
       return json;
     }
     List<Notify> list = new ArrayList();
     if ("admin".equals(name)) {
       list = this.notifyMapper.selectNotify(maps);
     } else {
       maps.put("fromId", name);
       list = this.notifyMapper.selectNotify(maps);
     }
 
     if ("1".equals(changeId)) {
       for (Notify notify1 : list) {
         notify1.setNotifyDateTime(DateFormat.getStrDate(notify1.getSendTime()));
         if ((notify1.getBeginDate() != null) && (!"".equals(notify1.getBeginDate()))) {
           if (!notifyDatetime.equals(DateFormat.getStrTime(notify1.getBeginDate())))
             notify1.setBegin(DateFormat.getStrTime(notify1.getBeginDate()));
           else
             notify1.setBegin("");
         }
         else {
           notify1.setBegin("");
         }
         if ((notify1.getEndDate() != null) && (!"".equals(notify1.getEndDate()))) {
           if (!notifyDatetime.equals(DateFormat.getStrTime(notify1.getEndDate())))
             notify1.setEnd(DateFormat.getStrTime(notify1.getEndDate()));
           else
             notify1.setEnd("");
         }
         else {
           notify1.setEnd("");
         }
 
         notify1.setName(notify1.getUsers().getUserName());
         if ((notify1.getTypeId() != null) && (!notify1.getTypeId().equals(""))) {
           String name11 = this.sysCodeMapper.getNotifyNameByNo(notify1.getTypeId());
           if (StringUtils.checkNull(name11).booleanValue())
             notify1.setTypeName("");
           else
             notify1.setTypeName(name11);
         }
         else
         {
           notify1.setTypeName("");
         }
 
         String depId = notify1.getToId();
         if (!StringUtils.checkNull(depId).booleanValue()) {
           String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
           if (!"ALL_DEPT".trim().equals(notify1.getToId()))
             notify1.setDeprange(depName + ",");
           else {
             notify1.setDeprange(depName);
           }
 
         }
 
         String userId = notify1.getUserId();
         if (!StringUtils.checkNull(userId).booleanValue()) {
           String userName = this.usersService.getUserNameById(userId);
           notify1.setUserrange(userName + ",");
         }
 
         String roleId = notify1.getPrivId();
         if (!StringUtils.checkNull(roleId).booleanValue()) {
           String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
           notify1.setRolerange(roleName + ",");
         }
 
         if (notify1.getReaders().indexOf(null != name ? name : "") != -1)
           notify1.setRead(Integer.valueOf(1));
         else {
           notify1.setRead(Integer.valueOf(0));
         }
       }
       json.setMsg("ok");
       json.setFlag(0);
       json.setObj(list);
       json.setTotleNum(pageParams.getTotal());
     }
     else if ("2".equals(changeId)) {
       for (Notify notify1 : list) {
         this.notifyMapper.deleteById(notify1.getNotifyId());
       }
       json.setMsg("ok");
       json.setFlag(0);
       json.setObject(Integer.valueOf(list.size()));
     }
 
     return json;
   }
 
   public ToJson<Notify> unreadNotify(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name, String sqlType)
     throws Exception
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     ToJson json = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
 
     List<Notify> list = this.notifyMapper.unreadNotify(maps);
     List list1 = new ArrayList();
     List list2 = new ArrayList();
     for (Notify notify : list) {
       notify.setNotifyDateTime(DateFormat.getStrDate(notify.getSendTime()));
       notify.setName(notify.getUsers().getUserName());
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
       if ((notify.getBeginDate() != null) && (!"".equals(notify.getBeginDate()))) {
         if (!notifyDatetime.equals(DateFormat.getStrTime(notify.getBeginDate())))
           notify.setBegin(DateFormat.getStrDateTime(notify.getBeginDate()));
         else
           notify.setBegin("");
       }
       else {
         notify.setBegin("");
       }
       if ((notify.getAttachmentName() != null) && (notify.getAttachmentId() != null)) {
         notify.setAttachment(GetAttachmentListUtil.returnAttachment(notify.getAttachmentName(), notify.getAttachmentId(), sqlType, "news"));
       }
       String depId = notify.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
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
 
       if (notify.getReaders().indexOf(null != name ? name : "") != -1)
         notify.setRead(Integer.valueOf(1));
       else {
         notify.setRead(Integer.valueOf(0));
       }
     }
 
     json.setObj(list);
     json.setTotleNum(pageParams.getTotal());
     return json;
   }
 
   public ToJson<Notify> readNotify(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name, String sqlType)
     throws Exception
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     ToJson json = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
 
     List<Notify> list = this.notifyMapper.readNotify(maps);
     List list1 = new ArrayList();
     List list2 = new ArrayList();
     List list3 = new ArrayList();
     for (Notify notify : list) {
       notify.setNotifyDateTime(DateFormat.getStrDate(notify.getSendTime()));
       notify.setName(notify.getUsers().getUserName());
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
       if ((notify.getBeginDate() != null) && (!"".equals(notify.getBeginDate()))) {
         if (!notifyDatetime.equals(DateFormat.getStrTime(notify.getBeginDate())))
           notify.setBegin(DateFormat.getStrTime(notify.getBeginDate()));
         else
           notify.setBegin("");
       }
       else {
         notify.setBegin("");
       }
       if ((notify.getEndDate() != null) && (!"".equals(notify.getEndDate()))) {
         if (!notifyDatetime.equals(DateFormat.getStrTime(notify.getEndDate())))
           notify.setEnd(DateFormat.getStrTime(notify.getEndDate()));
         else
           notify.setEnd("");
       }
       else {
         notify.setEnd("");
       }
 
       if ((notify.getAttachmentName() != null) && (notify.getAttachmentId() != null)) {
         notify.setAttachment(GetAttachmentListUtil.returnAttachment(notify.getAttachmentName(), notify.getAttachmentId(), sqlType, "news"));
       }
       String depId = notify.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
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
 
       if (notify.getReaders().indexOf(null != name ? name : "") != -1)
         notify.setRead(Integer.valueOf(1));
       else {
         notify.setRead(Integer.valueOf(0));
       }
 
     }
 
     json.setObj(list);
     json.setTotleNum(pageParams.getTotal());
     return json;
   }
 
   public void updateNotify(Notify notify, String remind, String tuisong, HttpServletRequest request)
   {
     Map map = new HashedMap();
     map.put("notifyId", notify.getNotifyId());
     Notify notify1 = this.notifyMapper.detailedNotify(map);
     if ((StringUtils.checkNull(notify.getAttachmentId()).booleanValue()) && (StringUtils.checkNull(notify.getAttachmentName()).booleanValue())) {
       notify.setAttachmentId(notify1.getAttachmentId());
       notify.setAttachmentName(notify1.getAttachmentName());
     }
     this.notifyMapper.updateNotify(notify);
 
     if ("1".equals(notify1.getPublish())) {
       String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
       this.threadService.addNotify(notify1, remind, tuisong, sqlType);
     }
   }
 
   public int addNotify(Notify notify, String remind, String tuisong, HttpServletRequest request)
   {
     int count = this.notifyMapper.addNotify(notify);
     if ((count > 0) && 
       ("1".equals(notify.getPublish()))) {
       String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
       this.threadService.addNotify(notify, tuisong, remind, sqlType);
 
       this.threadService.addNotifyMessageSendering(notify, request);
     }
 
     return count;
   }
 
   public Notify queryById(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name, String sqlType, String changId)
     throws Exception
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     maps.put("notifyTime", DateFormat.getCurrentTime2());
     Notify notify = this.notifyMapper.detailedNotify(maps);
     if (notify != null) {
       notify.setNotifyDateTime(DateFormat.getStrDate(notify.getSendTime()));
       notify.setName(notify.getUsers().getUserName());
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
 
       if ((notify.getAttachmentName() != null) && (notify.getAttachmentId() != null)) {
         notify.setAttachment(GetAttachmentListUtil.returnAttachment(notify.getAttachmentName(), notify.getAttachmentId(), sqlType, "notify"));
       }
 
       StringBuffer s = new StringBuffer();
       StringBuffer s1 = new StringBuffer();
       StringBuffer s2 = new StringBuffer();
 
       String depId = notify.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
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
       if (!StringUtils.checkNull(notify.getAuditer()).booleanValue()) {
         Users users = this.usersMapper.findUsersByuserId(notify.getAuditer());
         if (users != null) {
           notify.setAuditerName(users.getUserName());
         }
       }
       Users users = this.usersMapper.findUsersByuserId(notify.getFromId());
       if (users != null) {
         Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
         notify.setDepName(department.getDeptName());
       }
 
       if ((!notifyChageId.equals(changId)) && 
         (notify.getReaders().indexOf(name) == -1)) {
         this.smsService.updatequerySmsByType("1", name, String.valueOf(notify.getNotifyId()));
         StringBuffer str2 = new StringBuffer(notify.getReaders());
         str2.append(",");
         str2.append(name);
         String str1 = str2.toString();
         notify.setNotifyId(notify.getNotifyId());
         notify.setReaders(str1);
         this.notifyMapper.updateReaders(notify);
       }
 
     }
 
     return notify;
   }
 
   public ToJson<Notify> deleteByids(String[] newsId)
   {
     ToJson notifyToJson = new ToJson();
     if (newsId.length > 0)
     {
       this.notifyMapper.deleteByids(newsId);
     }
 
     notifyToJson.setFlag(0);
     notifyToJson.setMsg("ok");
     return notifyToJson;
   }
 
   public void queryDeleteByStaleDated()
   {
     Map maps = new HashMap();
     List<Notify> notifyList = this.notifyMapper.selectNotify(maps);
     if ((notifyList.size() > 0) && (notifyList != null))
       for (Notify notify : notifyList)
         if ((notify.getEndDate() != null) && (!"".equals(notify.getEndDate())) && 
           (!notifyDatetime.equals(DateFormat.getStrTime(notify.getEndDate())))) {
           Date dt = new Date();
           SimpleDateFormat matter1 = new SimpleDateFormat("yyyy-MM-dd");
           String data = matter1.format(dt);
           if (data.equals(DateFormat.getStrTime(notify.getEndDate())))
             this.notifyMapper.deleteById(notify.getNotifyId());
         }
   }
 
   public ToJson<Notify> updateByids(String[] newsId, String top)
   {
     ToJson notifyToJson = new ToJson();
     if (StringUtils.checkNull(top).booleanValue()) {
       notifyToJson.setFlag(1);
       notifyToJson.setMsg("传值错误");
       return notifyToJson;
     }
 
     if (newsId.length > 0)
     {
       this.notifyMapper.updateByIds(top, newsId);
       notifyToJson.setFlag(0);
       notifyToJson.setMsg("ok");
     } else {
       notifyToJson.setFlag(1);
       notifyToJson.setMsg("传值错误");
     }
 
     return notifyToJson;
   }
 
   public ToJson<Notify> ConsultTheSituationNotify(String newsId)
   {
     ToJson NotifyToJson = new ToJson();
     Map maps = new HashMap();
     maps.put("notifyId", newsId);
     Notify notify = this.notifyMapper.detailedNotify(maps);
     if (notify != null) {
       notify.setNotifyDateTime(DateFormat.getStrDate(notify.getSendTime()));
       notify.setName(notify.getUsers().getUserName());
     }
     List<Users> usersList = this.usersMapper.unreadConsultTheSituationNotify(maps);
     List<Users> usersList1 = this.usersMapper.readConsultTheSituationNotify(maps);
     List resultList = new ArrayList();
     List<Department> departmentList = this.departmentMapper.getDatagrid();
 
     for (Department department : departmentList) {
       StringBuffer stringBuffer = new StringBuffer();
       for (Users users : usersList) {
         Integer depId = users.getDeptId();
         if (department.getDeptId().equals(depId)) {
           stringBuffer.append(users.getUserName());
           stringBuffer.append(",");
         }
       }
       department.setUnread(stringBuffer.toString());
       StringBuffer stringBuffer1 = new StringBuffer();
       for (Users users : usersList1) {
         Integer depId = users.getDeptId();
         if (department.getDeptId().equals(depId)) {
           stringBuffer1.append(users.getUserName());
           stringBuffer1.append(",");
         }
       }
       department.setRead(stringBuffer1.toString());
     }
 
     notify.setReadSize(Integer.valueOf(usersList1.size()));
     notify.setUnreadSize(Integer.valueOf(usersList.size()));
     notify.setDepartmentList(departmentList);
     NotifyToJson.setObject(notify);
     NotifyToJson.setFlag(0);
     NotifyToJson.setMsg("ok");
     return NotifyToJson;
   }
 
   public List<Notify> getNotifyById(String id)
   {
     return this.notifyMapper.getNotifyById(id);
   }
 
   public Notify getNotifyById(Integer id)
   {
     return this.notifyMapper.getNotifyById(id);
   }
 
   @Transactional
   public void delete(Integer notifyId)
   {
     this.notifyMapper.deleteById(notifyId);
   }
 
   public ToJson<Notify> selectNotifyManage(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name, String sqlType)
     throws Exception
   {
     ToJson json = new ToJson();
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
 
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
 
     List list1 = new ArrayList();
     List<Notify> list = this.notifyMapper.selectNotifyManage(maps);
 
     for (Notify notify : list) {
       notify.setNotifyDateTime(DateFormat.getStrDate(notify.getSendTime()));
       notify.setName(notify.getUsers().getUserName());
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
       if ((!StringUtils.checkNull(notify.getAttachmentName()).booleanValue()) && (!StringUtils.checkNull(notify.getAttachmentId()).booleanValue())) {
         notify.setAttachment(GetAttachmentListUtil.returnAttachment(notify.getAttachmentName(), notify.getAttachmentId(), sqlType, "notify"));
       }
       if ((notify.getBeginDate() != null) && (!"".equals(notify.getBeginDate()))) {
         if (!notifyDatetime.equals(DateFormat.getStrTime(notify.getBeginDate())))
           notify.setBegin(DateFormat.getStrDateTime(notify.getBeginDate()));
         else
           notify.setBegin("");
       }
       else {
         notify.setBegin("");
       }
       String depId = notify.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
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
       if (notify.getReaders().indexOf(name) != -1)
         notify.setRead(Integer.valueOf(1));
       else {
         notify.setRead(Integer.valueOf(0));
       }
     }
 
     json.setObj(list);
     json.setTotleNum(pageParams.getTotal());
     return json;
   }
 
   private static boolean ifChilds(List<Department> list, int deptId)
   {
     boolean flag = false;
     for (Department department : list) {
       if (department.getDeptParent().intValue() == deptId) {
         flag = true;
         break;
       }
     }
     return flag;
   }
 
   private static List<Department> getChildList(List<Department> list, int deptId, List<Department> reList)
   {
     for (Department department : list) {
       if (department.getDeptParent().intValue() == deptId) {
         List l = department.getChild();
         reList.add(department);
         if (ifChilds(list, department.getDeptId().intValue())) {
           getChildList(list, department.getDeptId().intValue(), reList);
         }
       }
     }
     return reList;
   }
 
   public ToJson<Department> getNotifyGroupFromDept(Notify notify)
   {
     ToJson json = new ToJson(1, "error");
     try {
       List<Department> departmentList = this.notifyMapper.getNotifyGroupFromDept(notify);
       for (Department department : departmentList) {
         notify.setFromDept(department.getDeptId());
         int count = this.notifyMapper.getCountByFromDept(notify);
         department.setCount(String.valueOf(count));
       }
       json.setObj(departmentList);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "NotifyServiceImpl getNotifyGroupFromDept:" + e });
     }
     return json;
   }
 
   public ToJson<Notify> getNotifyByFromDept(Notify notify)
   {
     ToJson json = new ToJson(1, "error");
     try {
       List<Notify> notifyList = this.notifyMapper.getNotifyByFromDept(notify);
       for (Notify notify1 : notifyList) {
         notify1.setFromDeptStr(this.departmentMapper.getDeptNameByDeptId(notify1.getFromDept()));
         notify1.setFromIdStr(this.usersMapper.getUsernameByUserId(notify1.getFromId()));
         notify1.setResultCount(this.notifyMapper.getCountByFromIdAndDept(notify1));
       }
       json.setObj(notifyList);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "NotifyServiceImpl getNotifyByFromDept:" + e });
     }
     return json;
   }
 
   public ToJson<Notify> getNotifyByFromIdAndDept(Notify notify)
   {
     ToJson json = new ToJson(1, "error");
     try {
       List<Notify> notifyList = this.notifyMapper.getNotifyByFromIdAndDept(notify);
       for (Notify notify1 : notifyList) {
         StringBuffer toDeptStr = new StringBuffer();
         StringBuffer toPrivStr = new StringBuffer();
         StringBuffer toUserStr = new StringBuffer();
         if (notify1.getToId().equals("ALL_DEPT")) {
           notify1.setToId("全体部门");
         }
         if ((!StringUtils.checkNull(notify1.getToId()).booleanValue()) && (!notify1.getToId().equals("ALL_DEPT"))) {
           String[] deptArry = notify1.getToId().split(",");
           for (String dept : deptArry) {
             if (!StringUtils.checkNull(this.departmentMapper.getDeptNameByDeptId(Integer.valueOf(dept))).booleanValue()) {
               toDeptStr.append(this.departmentMapper.getDeptNameByDeptId(Integer.valueOf(dept)) + ",");
             }
           }
           notify1.setToId(toDeptStr.toString());
         }
         if (!StringUtils.checkNull(notify1.getPrivId()).booleanValue()) {
           String[] privArry = notify1.getPrivId().split(",");
           for (String priv : privArry) {
             if (!StringUtils.checkNull(this.userPrivMapper.getPrivNameByPrivId(Integer.valueOf(priv))).booleanValue()) {
               toPrivStr.append(this.userPrivMapper.getPrivNameByPrivId(Integer.valueOf(priv)) + ",");
             }
           }
           notify1.setPrivId(toPrivStr.toString());
         }
         if (!StringUtils.checkNull(notify1.getUserId()).booleanValue()) {
           String[] userArry = notify1.getUserId().split(",");
           for (String user : userArry) {
             if ((this.usersMapper.findUsersByuserId(user) == null) || 
               (StringUtils.checkNull(this.usersMapper.findUsersByuserId(user).getUserName()).booleanValue())) continue;
             toUserStr.append(this.usersMapper.findUsersByuserId(user).getUserName() + ",");
           }
 
           notify1.setUserId(toUserStr.toString());
         }
         if (!StringUtils.checkNull(notify1.getTypeId()).booleanValue())
           notify1.setTypeId(this.sysCodeMapper.getNotifyNameByNo(notify1.getTypeId()));
         else {
           notify1.setTypeId("");
         }
         notify1.setFromIdStr(this.usersMapper.getUsernameByUserId(notify1.getFromId()));
         int notifyStatus = Integer.valueOf(notify1.getPublish()).intValue();
         switch (notifyStatus) {
         case 0:
           notify1.setPublish("未发布");
           break;
         case 1:
           notify1.setPublish("已发布");
           break;
         case 2:
           notify1.setPublish("待审批");
           break;
         case 3:
           notify1.setPublish("未通过");
         }
       }
 
       json.setObj(notifyList);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg(e.getMessage());
       L.e(new Object[] { "NotifyServiceImpl getNotifyByFromIdAndDept:" + e });
     }
     return json;
   }
 
   public ToJson<Notify> getNotifyByNotifyId(String notifyId)
   {
     ToJson json = new ToJson(1, "error");
     try {
       Notify notify = this.notifyMapper.getNotifyByNotifyId(notifyId);
       notify.setFromDeptStr(this.departmentMapper.getDeptNameByDeptId(notify.getFromDept()));
       notify.setFromIdStr(this.usersMapper.getUsernameByUserId(notify.getFromId()));
       notify.setTypeId(this.sysCodeMapper.getNotifyNameByNo(notify.getTypeId()));
       json.setObject(notify);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "NotifyServiceImpl getNotifyByNotifyId:" + e });
     }
     return json;
   }
 
   public ToJson<Notify> outputNotify(int step, Notify notify, HttpServletRequest request, HttpServletResponse response)
   {
     ToJson json = new ToJson(1, "error");
     HSSFWorkbook workbook1 = new HSSFWorkbook();
     HSSFWorkbook workbook2 = new HSSFWorkbook();
     HSSFWorkbook workbook3 = new HSSFWorkbook();
     try {
       HSSFWorkbook workbook11 = ExcelUtil.makeExcelHead("公告统计信息", 9);
       switch (step) {
       case 1:
         String[] secondTitles = { "部门", "发布数量" };
         HSSFWorkbook workbook21 = ExcelUtil.makeSecondHead(workbook11, secondTitles);
         List<Department> departmentList = this.notifyMapper.getNotifyGroupFromDept(notify);
         for (Department department : departmentList) {
           notify.setFromDept(department.getDeptId());
           int count = this.notifyMapper.getCountByFromDept(notify);
           department.setCount(String.valueOf(count));
         }
 
         String[] beanProperty1 = { "deptName", "count" };
         workbook1 = ExcelUtil.exportExcelData(workbook21, departmentList, beanProperty1);
         break;
       case 2:
         String[] secondTitles1 = { "部门", "姓名", "发布数量" };
         HSSFWorkbook workbook22 = ExcelUtil.makeSecondHead(workbook11, secondTitles1);
         List<Notify> notifyList = this.notifyMapper.getNotifyByFromDept(notify);
         for (Notify notify1 : notifyList) {
           notify1.setFromDeptStr(this.departmentMapper.getDeptNameByDeptId(notify1.getFromDept()));
           notify1.setFromIdStr(this.usersMapper.getUsernameByUserId(notify1.getFromId()));
           notify1.setResultCount(this.notifyMapper.getCountByFromIdAndDept(notify1));
         }
 
         String[] beanProperty2 = { "fromDeptStr", "fromIdStr", "resultCount" };
         workbook2 = ExcelUtil.exportExcelData(workbook22, notifyList, beanProperty2);
         break;
       case 3:
         String[] secondTitles3 = { "发布人", "类型", "发布范围", "标题", "创建时间", "生效日期", "终止日期", "状态" };
         HSSFWorkbook workbook23 = ExcelUtil.makeSecondHead(workbook11, secondTitles3);
         StringBuffer toDeptStr = new StringBuffer();
         StringBuffer toPrivStr = new StringBuffer();
         StringBuffer toUserStr = new StringBuffer();
         List<Notify> notifyList2 = this.notifyMapper.getNotifyByFromIdAndDept(notify);
         for (Notify notify1 : notifyList2) {
           if (notify1.getToId().equals("ALL_DEPT")) {
             notify1.setToId("全体部门");
           }
           if (!StringUtils.checkNull(notify1.getToId()).booleanValue()) {
             String[] deptArry = notify1.getToId().split(",");
             for (String dept : deptArry) {
               if (!StringUtils.checkNull(this.departmentMapper.getDeptNameByDeptId(Integer.valueOf(dept))).booleanValue()) {
                 toDeptStr.append(this.departmentMapper.getDeptNameByDeptId(Integer.valueOf(dept)) + ",");
               }
             }
             notify1.setToId(toDeptStr.toString());
           }
           if (!StringUtils.checkNull(notify1.getPrivId()).booleanValue()) {
             String[] privArry = notify1.getPrivId().split(",");
             for (String priv : privArry) {
               if (!StringUtils.checkNull(this.userPrivMapper.getPrivNameByPrivId(Integer.valueOf(priv))).booleanValue()) {
                 toPrivStr.append(this.userPrivMapper.getPrivNameByPrivId(Integer.valueOf(priv)) + ",");
               }
             }
             notify1.setPrivId(toPrivStr.toString());
           }
           if (!StringUtils.checkNull(notify1.getUserId()).booleanValue()) {
             String[] userArry = notify1.getUserId().split(",");
             for (String user : userArry) {
               if (!StringUtils.checkNull(this.usersMapper.findUsersByuserId(user).getUserName()).booleanValue()) {
                 toUserStr.append(this.usersMapper.findUsersByuserId(user).getUserName() + ",");
               }
             }
             notify1.setUserId(toUserStr.toString());
           }
           if (!StringUtils.checkNull(notify1.getTypeId()).booleanValue())
             notify1.setTypeId(this.sysCodeMapper.getNotifyNameByNo(notify1.getTypeId()));
           else {
             notify1.setTypeId("");
           }
           notify1.setFromIdStr(this.usersMapper.getUsernameByUserId(notify1.getFromId()));
           int notifyStatus = Integer.valueOf(notify1.getPublish()).intValue();
           switch (notifyStatus) {
           case 0:
             notify1.setPublish("未发布");
             break;
           case 1:
             notify1.setPublish("已发布");
             break;
           case 2:
             notify1.setPublish("待审批");
             break;
           case 3:
             notify1.setPublish("未通过");
           }
 
           StringBuffer rangeStr = new StringBuffer();
           if (!StringUtils.checkNull(toDeptStr.toString()).booleanValue()) {
             rangeStr.append("部门：" + toDeptStr.toString() + "  ");
           }
           if (!StringUtils.checkNull(toPrivStr.toString()).booleanValue()) {
             rangeStr.append("角色：" + toPrivStr.toString() + "  ");
           }
           if (!StringUtils.checkNull(toUserStr.toString()).booleanValue()) {
             rangeStr.append("人员：" + toUserStr.toString() + "  ");
           }
           notify1.setRange(rangeStr.toString());
         }
         String[] beanProperty3 = { "fromIdStr", "typeId", "range", "subject", "sendTime", "beginDate", "endDate", "publish" };
         workbook3 = ExcelUtil.exportExcelData(workbook23, notifyList2, beanProperty3);
       }
 
       ServletOutputStream out = response.getOutputStream();
 
       String filename = "公告统计信息.xls";
       filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
 
       response.setContentType("application/vnd.ms-excel");
       response.setHeader("content-disposition", "attachment;filename=" + filename);
 
       switch (step) {
       case 1:
         workbook1.write(out);
         break;
       case 2:
         workbook2.write(out);
         break;
       case 3:
         workbook3.write(out);
       }
 
       out.close();
       json.setMsg("OK");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "NotifyServiceImpl outputNotify:" + e });
     }
     return json;
   }
 
   public BaseWrapper selectByType()
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     List<Notify> temp = this.notifyMapper.selectByType();
     HashMap count = new HashMap();
     for (Notify n : temp) {
       String key = "其他";
       SysCode s = n.getCodes();
       if (s != null) {
         key = s.getCodeName();
       }
       if (count.containsKey(key))
         count.put(key, Integer.valueOf(((Integer)count.get(key)).intValue() + 1));
       else {
         count.put(key, Integer.valueOf(1));
       }
     }
     baseWrapper.setData(count);
     baseWrapper.setStatus(true);
     baseWrapper.setFlag(true);
     return baseWrapper;
   }
 }

