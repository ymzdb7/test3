 package com.myoa.service.edu.eduStudent.impl;
 
 import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.common.SyslogMapper;
import com.myoa.dao.edu.eduDepartment.EduDepartmentMapper;
import com.myoa.dao.edu.eduParent.EduParentMapper;
import com.myoa.dao.edu.eduStudent.EduStudentMapper;
import com.myoa.dao.edu.eduStudentExt.EduStudentExtMapper;
import com.myoa.dao.users.OrgManageMapper;
import com.myoa.model.common.SysPara;
import com.myoa.model.common.Syslog;
import com.myoa.model.edu.eduDepartment.EduDepartmentWithBLOBs;
import com.myoa.model.edu.eduParent.EduParent;
import com.myoa.model.edu.eduStudent.EduStudent;
import com.myoa.model.edu.eduStudentExt.EduStudentExt;
import com.myoa.model.users.OrgManage;
import com.myoa.service.edu.eduStudent.IEduStudentService;
import com.myoa.service.syspara.SysParaService;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.ipUtil.IpAddr;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.InputStream;
 import java.io.OutputStream;
 import java.math.BigDecimal;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.UUID;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.CellStyle;
 import org.apache.poi.ss.usermodel.DateUtil;
 import org.apache.poi.ss.usermodel.Row;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class EduStudentServiceImpl
   implements IEduStudentService
 {
 
   @Resource
   EduStudentMapper eduStudentMapper;
 
   @Resource
   EduParentMapper eduParentMapper;
 
   @Resource
   EduStudentExtMapper eduStudentExtMapper;
 
   @Resource
   SysParaService sysParaService;
 
   @Resource
   EduDepartmentMapper eduDepartmentMapper;
 
   @Resource
   SysParaMapper sysParaMapper;
 
   @Resource
   OrgManageMapper orgManageMapper;
 
   @Resource
   SyslogMapper syslogMapper;
 
   public ToJson<EduStudent> getGrade(HttpServletRequest request, EduStudent eduStudent)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.eduStudentMapper.getGrade(eduStudent);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("没数据");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduUserServiceImpl getGrade:" + e });
     }
     return toJson;
   }
 
   public ToJson<EduStudent> getClassByDeptId(HttpServletRequest request, Integer deptId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.eduStudentMapper.getClassByDeptId(deptId);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("没数据");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduUserServiceImpl getClass:" + e });
     }
     return toJson;
   }
 
   public ToJson<EduStudent> getUserByDeptId(HttpServletRequest request, Integer deptId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.eduStudentMapper.getUserByDeptId(deptId);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("没数据");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduUserServiceImpl getUserByDeptId:" + e });
     }
     return toJson;
   }
 
   public ToJson<EduStudent> getStudentInforByUid(HttpServletRequest request, Integer uid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       EduStudent eduStudent1 = this.eduStudentMapper.getStudentInforByUid(uid);
 
       EduStudentExt eduStudentExt = this.eduStudentExtMapper.getStudentInfor(eduStudent1.getUserId());
       String a = eduStudent1.getUserId();
       String userId = "P" + a;
       EduParent eduParent = this.eduParentMapper.getPersonInforByUid(userId);
 
       if ((eduStudent1 != null) || (eduParent != null) || (eduStudentExt != null)) {
         Object[] o = new Object[3];
         o[0] = eduStudent1;
         o[1] = eduParent;
         o[2] = eduStudentExt;
         toJson.setObject(o);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("空数据");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduStudentServiceImpl getStudentInforByUid:" + e });
     }
     return toJson;
   }
 
   public ToJson<EduStudent> deleteStudentByUid(HttpServletRequest request, String[] uids)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (uids.length > 0) {
         this.eduStudentMapper.deleteStudentByUid(uids);
       }
       toJson.setMsg("ok");
       toJson.setFlag(0);
     }
     catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduStudentServiceImpl deleteStudentByUid" + e });
     }
     return toJson;
   }
 
   public ToJson<EduStudent> clearPasswordByUid(HttpServletRequest request, String uids)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (uids != null) {
         this.eduStudentMapper.clearPasswordByUid(uids);
       }
       toJson.setMsg("ok");
       toJson.setFlag(0);
     }
     catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduStudentServiceImpl clearPasswordByUid" + e });
     }
     return toJson;
   }
 
   public ToJson<EduStudent> getStudentList1(HttpServletRequest request, Integer deptId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.eduStudentMapper.getStudentList1(deptId);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("学生信息为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduStudentServiceImpl getStudentList1" + e });
     }
     return toJson;
   }
 
   public ToJson<EduStudent> getStudentList(HttpServletRequest request, EduStudent eduStudent)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.eduStudentMapper.getStudentList(eduStudent);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("学生信息为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduStudentServiceImpl getStudentList" + e });
     }
     return toJson;
   }
 
   public ToJson<EduStudent> addStudent(HttpServletRequest request, EduStudent eduStudent, EduStudentExt eduStudentExt)
   {
     ToJson toJson = new ToJson(1, "error");
     EduParent eduParent = new EduParent();
     try {
       if ((eduStudent.getBirthday() == null) || (eduStudent.getBirthday() == "")) {
         eduStudent.setBirthday(DateFormat.getCurrentTime());
       }
       int a = this.eduStudentMapper.addStudent(eduStudent);
       eduStudentExt.setUid(eduStudent.getUid());
       eduStudentExt.setUserId(eduStudent.getUserId());
       int c = this.eduStudentExtMapper.addStudentExt(eduStudentExt);
 
       String str = eduStudent.getUserId();
       StringBuffer pUserId = new StringBuffer("P");
       pUserId.append(str);
       eduParent.setUserId(pUserId.toString());
       eduParent.setUserName(eduStudent.getpUserName());
       eduParent.setPassword(eduStudent.getpPassword());
       eduParent.setSex(eduStudent.getpSex());
       if ((eduParent.getBirthday() == null) || (eduParent.getBirthday() == ""))
         eduParent.setBirthday(DateFormat.getCurrentTime());
       else {
         eduParent.setBirthday(eduStudent.getpBirthday());
       }
       eduParent.setMobilNo(eduStudent.getMobilNo());
       eduParent.setEmail(eduStudent.getpEmail());
       int b = this.eduParentMapper.addParent(eduParent);
       if ((a > 0) && (b > 0) && (c > 0)) {
         toJson.setMsg("新建成功");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("新建失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduStudentServiceImpl addStudent" + e });
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<EduStudent> updateStudent(HttpServletRequest request, EduStudent eduStudent, EduParent eduParent, EduStudentExt eduStudentExt)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int c = this.eduStudentMapper.updateStudent(eduStudent);
       eduStudentExt.setUserId(eduStudent.getUserId());
       int e = this.eduStudentExtMapper.updateStudentExt(eduStudentExt);
 
       String str = eduStudent.getUserId();
       StringBuffer pUserId = new StringBuffer("P");
       pUserId.append(str);
       eduParent.setUserId(pUserId.toString());
 
       int d = this.eduParentMapper.updateParent(eduParent);
       if ((c > 0) || (d > 0) || (e > 0)) {
         toJson.setMsg("编辑成功");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("编辑失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduStudentServiceImpl updateStudent" + e });
     }
     return toJson;
   }
 
   public ToJson<Object> StudentAcademicYear(HttpServletRequest request)
   {
     ToJson json = new ToJson(1, "err");
 
     ToJson status = this.sysParaService.getStatus();
 
     boolean flag = status.isFlag();
     if (flag == true)
       json.setMsg("学生今年已经升过级");
     else {
       try {
         List<EduStudent> eduStudents = this.eduStudentMapper.selectAll();
         for (EduStudent eduStudent : eduStudents)
         {
           if (eduStudent.getGrade().equals("一年级")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("二年级");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
           }
           else if (eduStudent.getGrade().equals("二年级")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("三年级");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
           }
           else if (eduStudent.getGrade().equals("三年级")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("四年级");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
           }
           else if (eduStudent.getGrade().equals("四年级")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("五年级");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
           }
           else if (eduStudent.getGrade().equals("五年级")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("六年级");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
           }
           else if (eduStudent.getGrade().equals("六年级")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("七年级");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
             EduStudent student = new EduStudent();
             student.setUid(eduStudent.getUid());
             List numList = this.eduDepartmentMapper.getdeptIdByDeptName("毕业生");
             int num = 0;
             if (numList.size() > 0) {
               num = ((Integer)numList.get(0)).intValue();
             }
             student.setDeptId(Integer.valueOf(num));
             this.eduStudentMapper.editDeptId(student);
           }
           else if (eduStudent.getGrade().equals("七年级")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("八年级");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
           }
           else if (eduStudent.getGrade().equals("八年级")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("九年级");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
           }
           else if (eduStudent.getGrade().equals("九年级")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("高一");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
             EduStudent student = new EduStudent();
             student.setUid(eduStudent.getUid());
             List numList = this.eduDepartmentMapper.getdeptIdByDeptName("毕业生");
             int num = 0;
             if (numList.size() > 0) {
               num = ((Integer)numList.get(0)).intValue();
             }
             student.setDeptId(Integer.valueOf(num));
             this.eduStudentMapper.editDeptId(student);
           }
           else if (eduStudent.getGrade().equals("高一")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("高二");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
           }
           else if (eduStudent.getGrade().equals("高二")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("高三");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
           }
           else if (eduStudent.getGrade().equals("高三")) {
             EduStudentExt eduStudentExt = new EduStudentExt();
             eduStudentExt.setGrade("毕业生");
             eduStudentExt.setUid(eduStudent.getUid());
             this.eduStudentExtMapper.editStudent(eduStudentExt);
             EduStudent student = new EduStudent();
             student.setUid(eduStudent.getUid());
             List numList = this.eduDepartmentMapper.getdeptIdByDeptName("毕业生");
             int num = 0;
             if (numList.size() > 0) {
               num = ((Integer)numList.get(0)).intValue();
             }
             student.setDeptId(Integer.valueOf(num));
             this.eduStudentMapper.editDeptId(student);
           }
         }
         Date date = new Date();
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
         String startTime = simpleDateFormat.format(date);
         int i = Integer.valueOf(startTime).intValue() + 1;
         String time = startTime + "-" + i;
         SysPara sysPara = new SysPara();
         sysPara.setParaValue(time);
         sysPara.setParaName("EDU_STUDENT_UPGRADE");
         this.sysParaService.updateSysPara(sysPara);
         json.setMsg("ok");
         json.setFlag(0);
       } catch (Exception e) {
         json.setMsg("学生升级错误");
         json.setFlag(1);
         e.printStackTrace();
       }
     }
 
     return json;
   }
 
   public ToJson<Map> studentSelect(String graseClass)
   {
     ToJson json = new ToJson();
     try {
       List mapStudent = this.eduStudentMapper.studentSelect(graseClass);
       if (mapStudent != null) {
         json.setObject(mapStudent);
         json.setFlag(0);
         json.setMsg("ok");
       } else {
         json.setFlag(1);
         json.setMsg("err");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson importStudentInfor(MultipartFile file, HttpServletRequest request, HttpServletResponse response, HttpSession session)
   {
     ToJson toJson = new ToJson(1, "error");
 
     Integer successCount = Integer.valueOf(0);
     try
     {
       ResourceBundle rb = ResourceBundle.getBundle("upload");
       String osName = System.getProperty("os.name");
       StringBuffer path = new StringBuffer();
       if (osName.toLowerCase().startsWith("win"))
         path = path.append(rb.getString("upload.win"));
       else {
         path = path.append(rb.getString("upload.linux"));
       }
 
       if (file.isEmpty()) {
         toJson.setMsg("请上传文件！");
         toJson.setFlag(1);
         return toJson;
       }
       String fileName = file.getOriginalFilename();
       if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
         String uuid = UUID.randomUUID().toString().replaceAll("-", "");
         int pos = fileName.indexOf(".");
         String extName = fileName.substring(pos);
         String newFileName = uuid + extName;
         File dest = new File(path.toString(), newFileName);
         file.transferTo(dest);
 
         String readPath = path.append(newFileName).toString();
         InputStream in = new FileInputStream(readPath);
         HSSFWorkbook excelObj = new HSSFWorkbook(in);
         HSSFSheet sheetObj = excelObj.getSheetAt(0);
         Row row = sheetObj.getRow(0);
         int colNum = row.getPhysicalNumberOfCells();
         int lastRowNum = sheetObj.getLastRowNum();
         List saveList = new ArrayList();
         List saveList1 = new ArrayList();
         List saveList2 = new ArrayList();
         EduStudent eduStudent = null;
         EduStudentExt eduStudentExt = null;
         EduParent eduParent = null;
         for (int i = 1; i <= lastRowNum; i++) {
           eduStudent = new EduStudent();
           eduStudentExt = new EduStudentExt();
           eduParent = new EduParent();
           row = sheetObj.getRow(i);
           String value = "";
           if (row != null) {
             for (int j = 0; j < colNum; j++)
             {
               Cell cell = row.getCell(j);
               if (cell != null) {
                 switch (j)
                 {
                 case 0:
                   if (cell.getCellType() == 0) {
                     BigDecimal big = new BigDecimal(cell.getNumericCellValue());
                     value = big.toString();
 
                     if ((null != value) && (!"".equals(value.trim()))) {
                       String[] item = value.split("[.]");
                       if ((1 < item.length) && ("0".equals(item[1]))) {
                         value = item[0];
                       }
                       eduStudent.setUserId(value);
                       eduStudentExt.setUserId(value);
                     }
                   } else {
                     eduStudent.setUserId(cell.getStringCellValue());
                     eduStudentExt.setUserId(cell.getStringCellValue());
                   }break;
                 case 1:
                   if (cell.getCellType() == 0) {
                     BigDecimal bigP = new BigDecimal(cell.getNumericCellValue());
                     value = bigP.toString();
 
                     if ((null != value) && (!"".equals(value.trim()))) {
                       String[] item = value.split("[.]");
                       if ((1 < item.length) && ("0".equals(item[1]))) {
                         value = item[0];
                       }
                     }
                     eduStudent.setPassword(value);
                     eduStudentExt.setUserId(value);
                   } else {
                     eduStudent.setPassword(cell.getStringCellValue());
                     eduStudentExt.setUserId(cell.getStringCellValue());
                   }
                   break;
                 case 2:
                   eduStudent.setUserId(cell.getStringCellValue());
                   eduStudentExt.setGrade(cell.getStringCellValue());
                   break;
                 case 3:
                   eduStudentExt.setClazz(cell.getStringCellValue());
                   break;
                 case 4:
                   eduStudent.setUserName(cell.getStringCellValue());
                   break;
                 case 5:
                   eduStudent.setSex(cell.getStringCellValue());
                   break;
                 case 6:
                   String result = null;
                   if (cell.getCellType() == 0) {
                     short format = cell.getCellStyle().getDataFormat();
                     SimpleDateFormat sdf = null;
                     if ((format == 14) || (format == 31) || (format == 57) || (format == 58))
                     {
                       sdf = new SimpleDateFormat("yyyy-MM-dd");
                     } else if ((format == 20) || (format == 32))
                     {
                       sdf = new SimpleDateFormat("HH:mm");
                     }
                     double v = cell.getNumericCellValue();
                     Date date = DateUtil.getJavaDate(v);
                     result = sdf.format(date);
                     eduStudent.setBirthday(result);
                   }
                   else
                   {
                     eduStudent.setBirthday(cell.getStringCellValue());
                   }break;
                 case 7:
                   BigDecimal bigM = new BigDecimal(cell.getNumericCellValue());
                   value = bigM.toString();
 
                   if ((null != value) && (!"".equals(value.trim()))) {
                     String[] item = value.split("[.]");
                     if ((1 < item.length) && ("0".equals(item[1]))) {
                       value = item[0];
                     }
                   }
                   eduStudent.setMobilNo(value);
                   break;
                 case 8:
                   eduStudent.setEmail(cell.getStringCellValue());
                   break;
                 case 9:
                   eduParent.setUserName(cell.getStringCellValue());
                   break;
                 case 10:
                   eduParent.setSex(cell.getStringCellValue());
                   break;
                 case 11:
                   BigDecimal bigPM = new BigDecimal(cell.getNumericCellValue());
                   value = bigPM.toString();
 
                   if ((null != value) && (!"".equals(value.trim()))) {
                     String[] item = value.split("[.]");
                     if ((1 < item.length) && ("0".equals(item[1]))) {
                       value = item[0];
                     }
                   }
                   eduParent.setMobilNo(value);
                   break;
                 case 12:
                   eduParent.setEmail(cell.getStringCellValue());
                   break;
                 case 13:
                   if (cell.getCellType() == 0) {
                     BigDecimal bigX = new BigDecimal(cell.getNumericCellValue());
                     value = bigX.toString();
 
                     if ((null != value) && (!"".equals(value.trim()))) {
                       String[] item = value.split("[.]");
                       if ((1 < item.length) && ("0".equals(item[1]))) {
                         value = item[0];
                       }
                     }
                     eduStudentExt.setStudentNumber(value);
                   }
                   else {
                     eduStudentExt.setStudentNumber(cell.getStringCellValue());
                   }break;
                 case 14:
                   if (cell.getCellType() == 0) {
                     BigDecimal bigN = new BigDecimal(cell.getNumericCellValue());
                     value = bigN.toString();
 
                     if ((null != value) && (!"".equals(value.trim()))) {
                       String[] item = value.split("[.]");
                       if ((1 < item.length) && ("0".equals(item[1]))) {
                         value = item[0];
                       }
                     }
                     eduStudentExt.setSchoolYear(value);
                   }
                   else {
                     eduStudentExt.setSchoolYear(cell.getStringCellValue());
                   }break;
                 case 15:
                   eduStudentExt.setNativePlace(cell.getStringCellValue());
                   break;
                 case 16:
                   if (cell.getCellType() == 0) {
                     BigDecimal big1 = new BigDecimal(cell.getNumericCellValue());
                     value = big1.toString();
                   }
 
                   if ((null != value) && (!"".equals(value.trim()))) {
                     String[] item = value.split("[.]");
                     if ((1 < item.length) && ("0".equals(item[1]))) {
                       value = item[0];
                     }
                   }
                   eduStudentExt.setIdNumber(value);
                   break;
                 default:
                   toJson.setFlag(0);
                   toJson.setMsg("err");
                 }
               }
 
             }
 
             if (!StringUtils.checkNull(eduStudentExt.getGrade()).booleanValue()) {
               List parentList = this.eduDepartmentMapper.getdeptIdByDeptName(eduStudentExt.getGrade());
               int depParent = 0;
               if (parentList.size() > 0) {
                 depParent = ((Integer)parentList.get(0)).intValue();
               }
               EduDepartmentWithBLOBs selectEduDepartmentWithBLOBs = this.eduDepartmentMapper.selectByDeptParentDeptName(Integer.valueOf(depParent), eduStudentExt.getClazz());
               eduStudent.setDeptId(selectEduDepartmentWithBLOBs.getDeptId());
 
               int count = this.eduStudentMapper.addStudent(eduStudent);
               eduStudentExt.setUid(eduStudent.getUid());
               eduStudentExt.setUserId(eduStudent.getUserId());
               int count1 = this.eduStudentExtMapper.addStudentExt(eduStudentExt);
 
               String str = eduStudent.getUserId();
               StringBuffer pUserId = new StringBuffer("P");
               pUserId.append(str);
               eduParent.setUserId(pUserId.toString());
               int count2 = this.eduParentMapper.addParent(eduParent);
               if (count > 0) {
                 successCount = Integer.valueOf(successCount.intValue() + count);
               }
             }
             dest.delete();
           }
         }
 
       }
 
       if (successCount.intValue() > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
         return toJson;
       }
     }
     catch (Exception e) {
       StringBuffer path = getPath();
       String fileName = file.getOriginalFilename();
       if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
         String uuid = UUID.randomUUID().toString().replaceAll("-", "");
         String extName = fileName.substring(fileName.lastIndexOf(".") + 1);
 
         String newFileName = uuid + extName;
         File dest = new File(path.toString(), newFileName);
         dest.delete();
       }
       e.getMessage();
       e.printStackTrace();
     }
 
     return toJson;
   }
 
   public StringBuffer getPath()
   {
     ResourceBundle rb = ResourceBundle.getBundle("upload");
     String osName = System.getProperty("os.name");
     StringBuffer path = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       path = path.append(rb.getString("upload.win"));
     else {
       path = path.append(rb.getString("upload.linux"));
     }
     return path;
   }
 
   public EduStudent findUserByName(String byname, HttpServletRequest req) {
     EduStudent user = this.eduStudentMapper.findUserByName(byname);
     if (user != null) {
       String a = "";
       try {
         a = req.getSession().getAttribute("loginDateSouse").toString();
       } catch (NullPointerException e) {
         a = "1005";
       }
       try {
         OrgManage name = this.orgManageMapper.getOrgManageById(Integer.valueOf(Integer.parseInt(a)));
         if (name != null)
           user.setCompanyName(name.getName());
       }
       catch (Exception e) {
         L.a(new Object[] { e.getMessage() });
       }
 
       if (user.getDeptId() != null) {
         EduDepartmentWithBLOBs dep = this.eduDepartmentMapper.queryGetObjectByDeptId(String.valueOf(user.getDeptId()));
         if (dep != null) {
           user.setDeptName(dep.getDeptName());
         }
 
       }
 
       Syslog sysLog = new Syslog();
       sysLog.setLogId(Integer.valueOf(0));
       sysLog.setUserId(user.getUserId());
       sysLog.setTime(new Date());
       String ip = IpAddr.getIpAddress(req);
       sysLog.setIp(ip);
       sysLog.setType(Integer.valueOf(1));
       sysLog.setRemark("");
 
       SysPara sysPara = this.sysParaMapper.querySysPara("IM_HOST");
       SysPara sysPara1 = this.sysParaMapper.querySysPara("IM_PORT");
       String ip1 = sysPara.getParaValue();
       StringBuffer url = req.getRequestURL();
 
       String ipCurren = IpAddr.getInternetIp();
       user.setImRegisterIp(ipCurren);
       this.syslogMapper.save(sysLog);
     }
 
     return user;
   }
 
   public ToJson<EduStudent> getStudentExport(HttpServletRequest request, HttpServletResponse response, EduStudent eduStudent, EduStudentExt eduStudentExt, String userId, String userName, Integer mobilNo, String sex, String grade, String clazz, String export)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (export == null) {
         export = "0";
       }
       Map map = new HashMap();
       map.put("userId", userId);
       map.put("userName", userName);
       map.put("mobilNo", mobilNo);
       map.put("sex", sex);
       map.put("eduStudent", eduStudent);
       map.put("grade", grade);
       map.put("clazz", clazz);
       map.put("eduStudentExt", eduStudentExt);
       List eduStudents = this.eduStudentMapper.getStudentLists(map);
       if (eduStudents != null) {
         toJson.setObj(eduStudents);
         toJson.setFlag(0);
       }
 
       if (export.equals("1")) {
         HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("学生信息导出", 6);
         String[] secondTitles = { "学号", "学生真实姓名", "手机", "性别", "班级" };
         HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
         String[] beanProperty = { "userId", "userName", "mobilNo", "sex", "grade", "clazz" };
         HSSFWorkbook workbook = null;
         workbook = ExcelUtil.exportExcelData(workbook2, eduStudents, beanProperty);
         OutputStream out = response.getOutputStream();
         String filename = "学生信息记录表.xls";
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
 }
