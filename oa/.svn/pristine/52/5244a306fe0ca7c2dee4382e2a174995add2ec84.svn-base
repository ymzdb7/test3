 package com.myoa.service.edu.eduSchoolBusiness;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.edu.eduSchoolBusiness.EduSchoolBusinessMapper;
import com.myoa.dao.edu.eduUser.EduUserMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.department.Department;
import com.myoa.model.edu.eduSchoolBusiness.EduSchoolBusiness;
import com.myoa.model.edu.eduUser.EduUser;
import com.myoa.model.users.Users;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelUtil;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.io.OutputStream;
 import java.io.PrintStream;
 import java.lang.reflect.InvocationTargetException;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFCellStyle;
 import org.apache.poi.hssf.usermodel.HSSFRow;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduSchoolBusinessService
 {
   public static String eduSchoolChageId = "1";
   public static String eduSchoolDatetime = "1970-01-01 08:00:00";
 
   @Resource
   EduSchoolBusinessMapper eduSchoolBusinessMapper;
 
   @Resource
   DepartmentMapper departmentMapper;
 
   @Resource
   EduUserMapper eduUserMapper;
 
   @Resource
   SysCodeMapper sysCodeMapper;
 
   @Resource
   DepartmentService departmentService;
 
   @Resource
   UsersService usersService;
 
   @Resource
   UsersPrivService usersPrivService;
 
   @Resource
   UsersMapper usersMapper;
 
   public ToJson<EduSchoolBusiness> addEduSchoolBus(HttpServletRequest request, EduSchoolBusiness eduSchoolBusiness) { ToJson toJson = new ToJson(1, "error");
     try
     {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String fromId = users.getUserId();
       eduSchoolBusiness.setFromId(fromId);
       int a = this.eduSchoolBusinessMapper.addEduSchoolBus(eduSchoolBusiness);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("error");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<EduSchoolBusiness> updateEduSchoolBus(HttpServletRequest request, EduSchoolBusiness eduSchoolBusiness)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.eduSchoolBusinessMapper.updateEduSchoolBus(eduSchoolBusiness);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("error");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<EduSchoolBusiness> eduSchoolBusList(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson(1, "error");
 
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     try
     {
       List list = this.eduSchoolBusinessMapper.eduSchoolBusList(maps);
       if (list != null) {
         toJson.setObj(list);
         toJson.setTotleNum(pageParams.getTotal());
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("error");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson eduSchoolConunt(Map<String, Object> map)
   {
     ToJson json = new ToJson();
     try {
       List<Map<String, Object>> list = this.eduSchoolBusinessMapper.eduSchoolConunt(map);
       for (Map map1 : list) {
         int deptId = ((Integer)map1.get("fromDept")).intValue();
         map1.put("deptName", this.departmentMapper.departmentOneSelect(Integer.valueOf(deptId)));
         map1.put("deptId", Integer.valueOf(deptId));
       }
       if (list.size() > 0) {
         json.setMsg("ok");
         json.setFlag(0);
         json.setObj(list);
         return json;
       }
       json.setMsg("err");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduSchoolDelete(String[] notifyId)
   {
     ToJson json = new ToJson();
     int a = 0; int count = 0; int b = 0;
     try {
       for (int i = 0; i < notifyId.length; i++) {
         count = this.eduSchoolBusinessMapper.eduSchoolDelete(Integer.valueOf(notifyId[i]));
         if (count > 0)
           a += 1;
         else {
           b += 1;
         }
       }
       if (a > 0) {
         json.setMsg("ok删除成功" + a + "条");
         json.setFlag(0);
         return json;
       }
       json.setMsg("err删除失败" + b + "条");
       json.setFlag(0);
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduSchoolOnerSelect(Integer notifyId)
   {
     ToJson json = new ToJson();
     try {
       EduSchoolBusiness map = this.eduSchoolBusinessMapper.eduSchoolOnerSelect(notifyId);
       if ((map.getFromDept() != null) && (map.getFromDept().intValue() != 0)) {
         String deptName = this.departmentMapper.departmentOneSelect(map.getFromDept());
         map.setDeptName(deptName);
       }
       if (map.getFromId() != null) { EduUser eduUser = this.eduUserMapper.getByuserId(map.getFromId());
         map.setUserName(eduUser.getUserName()); }
       if (map != null) {
         json.setMsg("ok");
         json.setFlag(0);
         json.setObject(map);
         return json;
       }
       json.setMsg("err");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson statisticalDerivation(HttpServletRequest request, HttpServletResponse response)
   {
     ToJson json = new ToJson();
     Map map = new HashMap();
     String fromDept = null;
     try {
       Integer export = Integer.valueOf(request.getParameter("step"));
       switch (export.intValue()) {
       case 1:
         fromDept = request.getParameter("fromDept");
         if ((fromDept != null) && (!fromDept.equals(""))) {
           map.put("fromDept", Integer.valueOf(fromDept));
         }
         map.put("beginTime", request.getParameter("beginTime"));
         map.put("endTime", request.getParameter("endTime"));
         List<Map<String, Object>> list = this.eduSchoolBusinessMapper.eduSchoolConunt(map);
         for (Map map1 : list) {
           int deptId = ((Integer)map1.get("fromDept")).intValue();
           map1.put("deptName", this.departmentMapper.departmentOneSelect(Integer.valueOf(deptId)));
           map1.put("deptId", Integer.valueOf(deptId));
         }
         List eduSchoolBusinessList = new ArrayList();
         for (int i = 0; i < list.size(); i++) {
           EduSchoolBusiness eduSchoolBusiness = new EduSchoolBusiness();
           String deptName = ((Map)list.get(i)).get("deptName") + "";
           int count = Integer.parseInt(((Map)list.get(i)).get("count") + "");
           eduSchoolBusiness.setDeptName(deptName);
           eduSchoolBusiness.setCount(Integer.valueOf(count));
           eduSchoolBusinessList.add(eduSchoolBusiness);
         }
 
         HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("校务公开统计导出", 8);
         String[] secondTitles = { "部门", "发布数量" };
         HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
         String[] beanProperty = { "deptName", "count" };
         HSSFWorkbook workbook = null;
         workbook = ExcelUtil.exportExcelData(workbook2, eduSchoolBusinessList, beanProperty);
         OutputStream out = response.getOutputStream();
         String filename = "校务公开统计记录表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel;charset=UTF-8");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
         workbook.write(out);
         out.close();
         json.setMsg("ok");
         json.setFlag(0);
 
         break;
       case 2:
         fromDept = request.getParameter("deptId");
         if ((fromDept != null) && (!fromDept.equals(""))) {
           map.put("deptId", Integer.valueOf(fromDept));
         }
         map.put("beginTime", request.getParameter("beginTime"));
         map.put("endTime", request.getParameter("endTime"));
         Map map1 = this.eduSchoolBusinessMapper.eduSchoolYuangong(map);
         if ((map1.get("userId") != null) && (!map1.get("userId").equals(""))) {
           EduUser eduUser = this.eduUserMapper.getByuserId(map1.get("userId").toString());
           map1.put("userName", eduUser.getUserName());
         }map1.put("deptName", this.departmentMapper.departmentOneSelect((Integer)map.get("deptId")));
         list = new ArrayList();
         list.add(map1);
 
         workbook1 = ExcelUtil.makeExcelHead("校务公开统计导出", 8);
         String[] secondTitles2 = { "部门", "姓名", "发布数量" };
         workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles2);
         String[] beanProperty2 = { "deptNam", "userName", "yuanGongCount" };
         workbook = exportExcelDatas(workbook2, list, beanProperty2);
         out = response.getOutputStream();
         filename = "校务公开统计记(姓名)录表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel;charset=UTF-8");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
         workbook.write(out);
         out.close();
         json.setMsg("ok");
         json.setFlag(0);
 
         break;
       case 3:
         fromDept = request.getParameter("fromDept");
         if ((fromDept != null) && (!fromDept.equals(""))) {
           map.put("fromDept", Integer.valueOf(fromDept));
         }
         map.put("userId", request.getParameter("fromId"));
         map.put("beginTime", request.getParameter("beginTime"));
         map.put("endTime", request.getParameter("endTime"));
         List<EduSchoolBusiness> eduList = this.eduSchoolBusinessMapper.eduSchoolYuanggongXiangqing(map);
         for (EduSchoolBusiness eduSchoolBusiness : eduList) {
           if (eduSchoolBusiness.getFromId() != null) {
             EduUser eduUser = this.eduUserMapper.getByuserId(map.get("userId").toString());
             eduSchoolBusiness.setUserName(eduUser.getUserName());
             String[] toId = eduSchoolBusiness.getToId().split(",");
             String deptNameSp = null;
             for (int i = 0; i < toId.length; i++) {
               Integer deptId = Integer.valueOf(toId[i]);
               String deptNamezi = this.departmentMapper.departmentOneSelect(deptId);
               deptNameSp = deptNameSp + "," + deptNamezi;
             }
             eduSchoolBusiness.setDeptNameSp(deptNameSp);
           }
         }
 
         workbook1 = ExcelUtil.makeExcelHead("校务公开统计导出", 8);
         String[] secondTitles3 = { "发布人", "类型", "发布范围", "标题", "创建时间", "生效日期", "终止日期", "状态" };
         workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles3);
         String[] beanProperty3 = { "userName", "typeId", "deptNameSp", "subject", "sendTime", "beginDate", "endDate", "publish" };
         workbook = ExcelUtil.exportExcelData(workbook2, eduList, beanProperty3);
         out = response.getOutputStream();
         filename = "校务公开统计记(本人详情)录表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel;charset=UTF-8");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
         workbook.write(out);
         out.close();
         json.setMsg("ok");
         json.setFlag(0);
 
         break;
       default:
         json.setMsg("err");
         json.setFlag(1);
       }
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<EduSchoolBusiness> eduSchoolBusExport(HttpServletRequest request, HttpServletResponse response, String exportId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (exportId == null) {
         exportId = "0";
       }
       Map maps = new HashMap();
       maps.put("fromId", request.getParameter("fromId"));
       maps.put("format", request.getParameter("format"));
       maps.put("typeId", request.getParameter("typeId"));
       maps.put("publish", request.getParameter("publish"));
       maps.put("top", request.getParameter("top"));
       maps.put("subject", request.getParameter("subject"));
       maps.put("beginDate", request.getParameter("beginDate"));
       maps.put("endDate", request.getParameter("endDate"));
       maps.put("summary", request.getParameter("summary"));
       List eduSchoolBusinesses = this.eduSchoolBusinessMapper.eduSchoolBusList(maps);
       if (eduSchoolBusinesses != null) {
         toJson.setObj(eduSchoolBusinesses);
         toJson.setMsg("ok");
         toJson.setFlag(0);
       }
 
       if (exportId.equals("2")) {
         HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("校务公开信息导出", 8);
         String[] secondTitles = { "发布人", "格式", "类型", "发布状态", "发布置顶", "标题", "发布日期", "内容" };
         HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
         String[] beanProperty = { "fromId", "format", "typeId", "publish", "top", "subject", "content", "beginDate", "endDate" };
         HSSFWorkbook workbook = null;
         workbook = ExcelUtil.exportExcelData(workbook2, eduSchoolBusinesses, beanProperty);
         OutputStream out = response.getOutputStream();
         String filename = "校务公开信息记录表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel;charset=UTF-8");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
         workbook.write(out);
         out.close();
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<EduSchoolBusiness> unreadEduSchool(Map<String, Object> maps, Integer page, Integer pageSize, Boolean useFlag, String name, String sqlType)
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     ToJson json = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(useFlag);
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
 
     List<EduSchoolBusiness> list = this.eduSchoolBusinessMapper.unreadEduSchool(maps);
     List list1 = new ArrayList();
     List list2 = new ArrayList();
     for (EduSchoolBusiness eduSchoolBusiness : list) {
       eduSchoolBusiness.setNotifyDateTime(DateFormat.getStrDate(eduSchoolBusiness.getSendTime()));
       eduSchoolBusiness.setName(eduSchoolBusiness.getUsers().getUserName());
       if ((eduSchoolBusiness.getTypeId() != null) && (!eduSchoolBusiness.getTypeId().equals(""))) {
         String name11 = this.sysCodeMapper.getNotifyNameByNo(eduSchoolBusiness.getTypeId());
         if (StringUtils.checkNull(name11).booleanValue())
           eduSchoolBusiness.setTypeName("");
         else
           eduSchoolBusiness.setTypeName(name11);
       }
       else
       {
         eduSchoolBusiness.setTypeName("");
       }
       if ((eduSchoolBusiness.getAttachmentName() != null) && (eduSchoolBusiness.getAttachmentId() != null)) {
         eduSchoolBusiness.setAttachment(GetAttachmentListUtil.returnAttachment(eduSchoolBusiness.getAttachmentName(), eduSchoolBusiness.getAttachmentId(), sqlType, "news"));
       }
       String depId = eduSchoolBusiness.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
         String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
         if (!"ALL_DEPT".trim().equals(eduSchoolBusiness.getToId()))
           eduSchoolBusiness.setDeprange(depName + ",");
         else {
           eduSchoolBusiness.setDeprange(depName);
         }
       }
 
       String userId = eduSchoolBusiness.getUserId();
       if (!StringUtils.checkNull(userId).booleanValue()) {
         String userName = this.usersService.getUserNameById(userId);
         eduSchoolBusiness.setUserrange(userName + ",");
       }
 
       String roleId = eduSchoolBusiness.getPrivId();
       if (!StringUtils.checkNull(roleId).booleanValue()) {
         String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
         eduSchoolBusiness.setRolerange(roleName + ",");
       }
 
       if (eduSchoolBusiness.getReaders().indexOf(null != name ? name : "") != -1)
         eduSchoolBusiness.setRead(Integer.valueOf(1));
       else {
         eduSchoolBusiness.setRead(Integer.valueOf(0));
       }
     }
 
     json.setObj(list);
     json.setTotleNum(pageParams.getTotal());
     return json;
   }
 
   public ToJson<EduSchoolBusiness> readEduSchool(Map<String, Object> maps, Integer page, Integer pageSize, Boolean useFlag, String name, String sqlType)
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     ToJson json = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(useFlag);
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
 
     List<EduSchoolBusiness> list = this.eduSchoolBusinessMapper.readEduSchool(maps);
     List list1 = new ArrayList();
     List list2 = new ArrayList();
     List list3 = new ArrayList();
     for (EduSchoolBusiness eduSchoolBusiness : list) {
       eduSchoolBusiness.setNotifyDateTime(DateFormat.getStrDate(eduSchoolBusiness.getSendTime()));
       eduSchoolBusiness.setName(eduSchoolBusiness.getUsers().getUserName());
       if ((eduSchoolBusiness.getTypeId() != null) && (!eduSchoolBusiness.getTypeId().equals(""))) {
         String name11 = this.sysCodeMapper.getNotifyNameByNo(eduSchoolBusiness.getTypeId());
         if (StringUtils.checkNull(name11).booleanValue())
           eduSchoolBusiness.setTypeName("");
         else
           eduSchoolBusiness.setTypeName(name11);
       }
       else
       {
         eduSchoolBusiness.setTypeName("");
       }
       if ((eduSchoolBusiness.getBeginDate() != null) && (!"".equals(eduSchoolBusiness.getBeginDate()))) {
         if (!eduSchoolDatetime.equals(DateFormat.getStrTime(eduSchoolBusiness.getBeginDate())))
           eduSchoolBusiness.setBegin(DateFormat.getStrTime(eduSchoolBusiness.getBeginDate()));
         else
           eduSchoolBusiness.setBegin("");
       }
       else {
         eduSchoolBusiness.setBegin("");
       }
       if ((eduSchoolBusiness.getEndDate() != null) && (!"".equals(eduSchoolBusiness.getEndDate()))) {
         if (!eduSchoolDatetime.equals(DateFormat.getStrTime(eduSchoolBusiness.getEndDate())))
           eduSchoolBusiness.setEnd(DateFormat.getStrTime(eduSchoolBusiness.getEndDate()));
         else
           eduSchoolBusiness.setEnd("");
       }
       else {
         eduSchoolBusiness.setEnd("");
       }
 
       if ((eduSchoolBusiness.getAttachmentName() != null) && (eduSchoolBusiness.getAttachmentId() != null)) {
         eduSchoolBusiness.setAttachment(GetAttachmentListUtil.returnAttachment(eduSchoolBusiness.getAttachmentName(), eduSchoolBusiness.getAttachmentId(), sqlType, "news"));
       }
       String depId = eduSchoolBusiness.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
         String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
         if (!"ALL_DEPT".trim().equals(eduSchoolBusiness.getToId()))
           eduSchoolBusiness.setDeprange(depName + ",");
         else {
           eduSchoolBusiness.setDeprange(depName);
         }
 
       }
 
       String userId = eduSchoolBusiness.getUserId();
       if (!StringUtils.checkNull(userId).booleanValue()) {
         String userName = this.usersService.getUserNameById(userId);
         eduSchoolBusiness.setUserrange(userName + ",");
       }
 
       String roleId = eduSchoolBusiness.getPrivId();
       if (!StringUtils.checkNull(roleId).booleanValue()) {
         String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
         eduSchoolBusiness.setRolerange(roleName + ",");
       }
 
       if (eduSchoolBusiness.getReaders().indexOf(null != name ? name : "") != -1)
         eduSchoolBusiness.setRead(Integer.valueOf(1));
       else {
         eduSchoolBusiness.setRead(Integer.valueOf(0));
       }
     }
     json.setObj(list);
     json.setTotleNum(pageParams.getTotal());
     return json;
   }
 
   public ToJson<EduSchoolBusiness> eduSchoolShow(Map<String, Object> maps, Integer page, Integer pageSize, Boolean useFlag, String name, String sqlType)
   {
     ToJson json = new ToJson();
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
 
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(useFlag);
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
 
     List list1 = new ArrayList();
     List<EduSchoolBusiness> list = this.eduSchoolBusinessMapper.eduSchoolBusList(maps);
 
     for (EduSchoolBusiness eduSchoolBusiness : list) {
       eduSchoolBusiness.setNotifyDateTime(DateFormat.getStrDate(eduSchoolBusiness.getSendTime()));
       eduSchoolBusiness.setName(eduSchoolBusiness.getUsers().getUserName());
       if ((eduSchoolBusiness.getTypeId() != null) && (!eduSchoolBusiness.getTypeId().equals(""))) {
         String name11 = this.sysCodeMapper.getNotifyNameByNo(eduSchoolBusiness.getTypeId());
         if (StringUtils.checkNull(name11).booleanValue())
           eduSchoolBusiness.setTypeName("");
         else
           eduSchoolBusiness.setTypeName(name11);
       }
       else
       {
         eduSchoolBusiness.setTypeName(" ");
       }
       if ((eduSchoolBusiness.getAttachmentName() != null) && (eduSchoolBusiness.getAttachmentId() != null)) {
         eduSchoolBusiness.setAttachment(GetAttachmentListUtil.returnAttachment(eduSchoolBusiness.getAttachmentName(), eduSchoolBusiness.getAttachmentId(), sqlType, "notify"));
       }
       String depId = eduSchoolBusiness.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
         String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
         if (!"ALL_DEPT".trim().equals(eduSchoolBusiness.getToId()))
           eduSchoolBusiness.setDeprange(depName + ",");
         else {
           eduSchoolBusiness.setDeprange(depName);
         }
 
       }
 
       String userId = eduSchoolBusiness.getUserId();
       if (!StringUtils.checkNull(userId).booleanValue()) {
         String userName = this.usersService.getUserNameById(userId);
         eduSchoolBusiness.setUserrange(userName + ",");
       }
 
       String roleId = eduSchoolBusiness.getPrivId();
       if (!StringUtils.checkNull(roleId).booleanValue()) {
         String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
         eduSchoolBusiness.setRolerange(roleName + ",");
       }
       if (eduSchoolBusiness.getReaders().indexOf(name) != -1)
         eduSchoolBusiness.setRead(Integer.valueOf(1));
       else {
         eduSchoolBusiness.setRead(Integer.valueOf(0));
       }
     }
 
     json.setObj(list);
     json.setTotleNum(pageParams.getTotal());
     return json;
   }
 
   public ToJson eduSchoolYuangong(Map<String, Object> map)
   {
     ToJson json = new ToJson();
     try {
       Map map1 = this.eduSchoolBusinessMapper.eduSchoolYuangong(map);
       if ((map1.get("userId") != null) && (!map1.get("userId").equals(""))) {
         EduUser eduUser = this.eduUserMapper.getByuserId(map1.get("userId").toString());
         map1.put("userName", eduUser.getUserName());
       }map1.put("deptName", this.departmentMapper.departmentOneSelect((Integer)map.get("deptId")));
       if (map1 != null) {
         json.setMsg("ok");
         json.setObject(map1);
         json.setFlag(0);
         return json;
       }
       json.setMsg("err");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduSchoolYuanggongXiangqing(Map<String, Object> map)
   {
     ToJson json = new ToJson();
     try {
       List<EduSchoolBusiness> list = this.eduSchoolBusinessMapper.eduSchoolYuanggongXiangqing(map);
       for (EduSchoolBusiness eduSchoolBusiness : list) {
         if (eduSchoolBusiness.getFromId() != null) {
           EduUser eduUser = this.eduUserMapper.getByuserId(map.get("userId").toString());
           eduSchoolBusiness.setUserName(eduUser.getUserName());
         }
         if (eduSchoolBusiness.getToId() != null) {
           String[] deptsId = eduSchoolBusiness.getToId().split(",");
           String deptName = "";
           for (int i = 0; i < deptsId.length; i++) {
             String deptNameto = this.departmentMapper.departmentOneSelect(Integer.valueOf(deptsId[i]));
             deptName = deptName + "," + deptNameto;
           }
           eduSchoolBusiness.setDeptNameSp(deptName);
         }
       }
       if (list.size() > 0) {
         json.setObj(list);
         json.setFlag(0);
         json.setMsg("eer");
         return json;
       }
       json.setMsg("err");
       json.setFlag(1);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public static <T> HSSFWorkbook exportExcelDatas(HSSFWorkbook workbook, List<Map<String, Object>> dataList, String[] beanPropertys)
     throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
   {
     HSSFSheet sheet = workbook.getSheetAt(0);
 
     HSSFCellStyle styleData = workbook.createCellStyle();
     styleData.setAlignment((short) 2);
     styleData.setVerticalAlignment((short) 1);
 
     for (int j = 0; j < dataList.size(); j++) {
       HSSFRow rowData = sheet.createRow(j + 2);
       Map<String,Object> map = (Map)dataList.get(j);
       for (int k = 0; k < beanPropertys.length; k++) {
         System.out.println(map);
         System.out.println(beanPropertys[k]);
 
         HSSFCell cellData = rowData.createCell(k);
         try {
           for (String key : map.keySet()) {
             if ((!map.get(key).equals("")) && (map.get(key) != null)) {
               int sum = 0;
               System.out.print(beanPropertys.length);
               for (int ks = 0; ks < beanPropertys.length; ks++) {
                 if (key.equals(beanPropertys[ks])) {
                   cellData.setCellValue(map.get(key).toString());
                 }
               }
             }
             cellData.setCellStyle(styleData);
           }
         }
         catch (Exception e) {
           e.printStackTrace();
         }
       }
     }
 
     return workbook;
   }
 
   public ToJson eudSchollTop(Map<String, Object> map)
   {
     ToJson json = new ToJson();
     try {
       int count = this.eduSchoolBusinessMapper.eudSchollTop(map);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
         return json;
       }
       json.setMsg("err");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduSchollPublish(Map<String, Object> map)
   {
     ToJson json = new ToJson();
     try {
       int count = this.eduSchoolBusinessMapper.eduSchollPublish(map);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
         return json;
       }
       json.setMsg("err");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<EduSchoolBusiness> EduConsultTheSituationNotify(String newsId)
   {
     ToJson NotifyToJson = new ToJson();
     Map maps = new HashMap();
     maps.put("notifyId", newsId);
     EduSchoolBusiness notify = this.eduSchoolBusinessMapper.eduDetailedNotify(maps);
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
 
   public EduSchoolBusiness queryById(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name, String sqlType, String changId)
     throws Exception
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     EduSchoolBusiness notify = this.eduSchoolBusinessMapper.eduDetailedNotify(maps);
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
         if (!eduSchoolDatetime.equals(DateFormat.getStrTime(notify.getBeginDate())))
           notify.setBegin(DateFormat.getStrTime(notify.getBeginDate()));
         else
           notify.setBegin("");
       }
       else {
         notify.setBegin("");
       }
       if ((notify.getEndDate() != null) && (!"".equals(notify.getEndDate()))) {
         if (!eduSchoolDatetime.equals(DateFormat.getStrTime(notify.getEndDate())))
           notify.setEnd(DateFormat.getStrTime(notify.getEndDate()));
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
 
       if ((!eduSchoolChageId.equals(changId)) && 
         (notify.getReaders().indexOf(name) == -1)) {
         StringBuffer str2 = new StringBuffer(notify.getReaders());
         str2.append(",");
         str2.append(name);
         String str1 = str2.toString();
         notify.setNotifyId(notify.getNotifyId());
         notify.setReaders(str1);
         this.eduSchoolBusinessMapper.updateReaders(notify);
       }
     }
 
     return notify;
   }
 }

