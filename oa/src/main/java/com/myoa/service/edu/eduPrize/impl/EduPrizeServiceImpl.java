 package com.myoa.service.edu.eduPrize.impl;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.edu.eduCourse.EduCourseMapper;
import com.myoa.dao.edu.eduDepartment.EduDepartmentMapper;
import com.myoa.dao.edu.eduPrize.EduPrizeInfoMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.edu.eduCourse.EduCourseWithBLOBs;
import com.myoa.model.edu.eduDepartment.EduDepartmentWithBLOBs;
import com.myoa.model.edu.eduPrize.EduPrizeInfo;
import com.myoa.service.edu.eduPrize.EduPrizeService;
import com.myoa.util.AjaxJson;
import com.myoa.util.ExcelUtil;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.page.PageParams;

 import java.io.OutputStream;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduPrizeServiceImpl
   implements EduPrizeService
 {
 
   @Autowired
   private EduPrizeInfoMapper eduPrizeInfoMapper;
 
   @Autowired
   private EduDepartmentMapper eduDepartmentMapper;
 
   @Autowired
   private EduCourseMapper eduCourseMapper;
 
   @Autowired
   private SysCodeMapper sysCodeMapper;
 
   public AjaxJson addEduPrizeInfo(EduPrizeInfo eduPrizeInfo)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       int i = this.eduPrizeInfoMapper.insertSelective(eduPrizeInfo);
       if (i > 0) {
         ajaxJson.setMsg("ok");
         ajaxJson.setFlag(true);
       }
     } catch (Exception e) {
       ajaxJson.setMsg("err");
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getAllEduPrizeInfo(EduPrizeInfo eduPrizeInfo, HttpServletRequest request, Integer page, Integer pageSize, Boolean useFlag)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try
     {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(useFlag);
       Map map = new HashMap();
       map.put("page", pageParams);
       if ((eduPrizeInfo.getTeacherUserId() != null) && (eduPrizeInfo.getTeacherUserId() != ""))
       {
         eduPrizeInfo.setTeacherUserId(eduPrizeInfo.getTeacherUserId().substring(0, eduPrizeInfo.getTeacherUserId().length() - 1));
       }
       map.put("eduPrizeInfo", eduPrizeInfo);
 
       List<EduPrizeInfo> allEduPrizeInfo = this.eduPrizeInfoMapper.getAllEduPrizeInfo(map);
       int i = 1;
 
       for (EduPrizeInfo eduPrizeInfo1 : allEduPrizeInfo)
       {
         String teacherUserName = eduPrizeInfo1.getTeacherUserName();
         eduPrizeInfo1.setTeacherUserName(teacherUserName.substring(0, teacherUserName.length() - 1));
 
         eduPrizeInfo1.setIdNo(Integer.valueOf(i));
         i++;
 
         if (eduPrizeInfo1.getGrade() != null) {
           EduDepartmentWithBLOBs eduDepartmentWithBLOBs = this.eduDepartmentMapper.queryGetObjectByDeptId(eduPrizeInfo1.getGrade().toString());
           if (eduDepartmentWithBLOBs != null)
             eduPrizeInfo1.setGradeName(eduDepartmentWithBLOBs.getDeptName());
           else
             eduPrizeInfo1.setGradeName("");
         }
         else
         {
           eduPrizeInfo1.setGradeName("");
         }
 
         if (eduPrizeInfo1.getClazz() != null) {
           EduDepartmentWithBLOBs eduDepartmentWithBLOBs1 = this.eduDepartmentMapper.queryGetObjectByDeptId(eduPrizeInfo1.getClazz().toString());
           if (eduDepartmentWithBLOBs1 != null)
             eduPrizeInfo1.setClassName(eduDepartmentWithBLOBs1.getDeptName());
           else
             eduPrizeInfo1.setClassName("");
         }
         else {
           eduPrizeInfo1.setClassName("");
         }
         if (eduPrizeInfo1.getSubject() != null)
         {
           EduCourseWithBLOBs courseBycourseId = this.eduCourseMapper.getCourseBycourseId(eduPrizeInfo1.getSubject());
           if (courseBycourseId != null)
             eduPrizeInfo1.setSubjectName(courseBycourseId.getCourseName());
           else
             eduPrizeInfo1.setSubjectName("");
         }
         else
         {
           eduPrizeInfo1.setSubjectName("");
         }
 
         SysCode code = this.sysCodeMapper.getSingleCode("PRIZE_LEVEL", eduPrizeInfo1.getLevel());
         if (code != null)
           eduPrizeInfo1.setLevelName(code.getCodeName());
         else {
           eduPrizeInfo1.setLevelName("");
         }
       }
 
       int getcount = this.eduPrizeInfoMapper.getCount();
       ajaxJson.setTotleNum(Integer.valueOf(getcount));
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("ok");
       ajaxJson.setObj(allEduPrizeInfo);
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("err");
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson editEduPrizeInfo(EduPrizeInfo eduPrizeInfo)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       int i = this.eduPrizeInfoMapper.updateByPrimaryKeySelective(eduPrizeInfo);
       if (i > 0) {
         ajaxJson.setMsg("ok");
         ajaxJson.setFlag(true);
       }
     } catch (Exception e) {
       ajaxJson.setMsg("err");
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson deleteEduPrizeInfo(Integer id)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       this.eduPrizeInfoMapper.deleteEduPrizeInfo(id);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setMsg("err");
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getEduPrizeInfoById(Integer id)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       EduPrizeInfo eduPrizeInfoById = this.eduPrizeInfoMapper.getEduPrizeInfoById(id);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
 
       EduDepartmentWithBLOBs eduDepartmentWithBLOBs = this.eduDepartmentMapper.queryGetObjectByDeptId(eduPrizeInfoById.getGrade().toString());
       if (eduDepartmentWithBLOBs != null)
         eduPrizeInfoById.setGradeName(eduDepartmentWithBLOBs.getDeptName());
       else {
         eduPrizeInfoById.setGradeName("");
       }
 
       EduDepartmentWithBLOBs eduDepartmentWithBLOBs1 = this.eduDepartmentMapper.queryGetObjectByDeptId(eduPrizeInfoById.getClazz().toString());
       if (eduDepartmentWithBLOBs1 != null)
         eduPrizeInfoById.setClassName(eduDepartmentWithBLOBs1.getDeptName());
       else {
         eduPrizeInfoById.setClassName("");
       }
 
       EduCourseWithBLOBs courseBycourseId = this.eduCourseMapper.getCourseBycourseId(eduPrizeInfoById.getSubject());
       if (courseBycourseId != null)
         eduPrizeInfoById.setSubjectName(courseBycourseId.getCourseName());
       else {
         eduPrizeInfoById.setSubjectName("");
       }
 
       SysCode code = this.sysCodeMapper.getSingleCode("PRIZE_LEVEL", eduPrizeInfoById.getLevel());
       if (code != null)
         eduPrizeInfoById.setLevelName(code.getCodeName());
       else {
         eduPrizeInfoById.setLevelName("");
       }
       ajaxJson.setObj(eduPrizeInfoById);
     } catch (Exception e) {
       ajaxJson.setMsg("err");
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getAllSubject(HttpServletRequest request)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       List allSubject = this.eduCourseMapper.getAllSubject();
       ajaxJson.setObj(allSubject);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setMsg("err");
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public void exportExcel(EduPrizeInfo eduPrizeInfo, HttpServletRequest request, HttpServletResponse response)
   {
     Map map = new HashMap();
     map.put("eduPrizeInfo", eduPrizeInfo);
     List<EduPrizeInfo> allEduPrizeInfo = this.eduPrizeInfoMapper.getAllEduPrizeInfo(map);
     int i = 1;
     for (EduPrizeInfo eduPrizeInfo1 : allEduPrizeInfo)
     {
       String teacherUserName = eduPrizeInfo1.getTeacherUserName();
       eduPrizeInfo1.setTeacherUserName(teacherUserName.substring(0, teacherUserName.length() - 1));
 
       eduPrizeInfo1.setIdNo(Integer.valueOf(i));
       i++;
 
       if (eduPrizeInfo1.getGrade() != null) {
         EduDepartmentWithBLOBs eduDepartmentWithBLOBs = this.eduDepartmentMapper.queryGetObjectByDeptId(eduPrizeInfo1.getGrade().toString());
         if (eduDepartmentWithBLOBs != null)
           eduPrizeInfo1.setGradeName(eduDepartmentWithBLOBs.getDeptName());
         else
           eduPrizeInfo1.setGradeName("");
       }
       else
       {
         eduPrizeInfo1.setGradeName("");
       }
 
       if (eduPrizeInfo1.getClazz() != null) {
         EduDepartmentWithBLOBs eduDepartmentWithBLOBs1 = this.eduDepartmentMapper.queryGetObjectByDeptId(eduPrizeInfo1.getClazz().toString());
         if (eduDepartmentWithBLOBs1 != null)
           eduPrizeInfo1.setClassName(eduDepartmentWithBLOBs1.getDeptName());
         else
           eduPrizeInfo1.setClassName("");
       }
       else {
         eduPrizeInfo1.setClassName("");
       }
       eduPrizeInfo1.setAllName(eduPrizeInfo1.getGradeName() + eduPrizeInfo1.getClassName());
       if (eduPrizeInfo1.getSubject() != null)
       {
         EduCourseWithBLOBs courseBycourseId = this.eduCourseMapper.getCourseBycourseId(eduPrizeInfo1.getSubject());
         if (courseBycourseId != null)
           eduPrizeInfo1.setSubjectName(courseBycourseId.getCourseName());
         else
           eduPrizeInfo1.setSubjectName("");
       }
       else
       {
         eduPrizeInfo1.setSubjectName("");
       }
 
       SysCode code = this.sysCodeMapper.getSingleCode("PRIZE_LEVEL", eduPrizeInfo1.getLevel());
       if (code != null)
         eduPrizeInfo1.setLevelName(code.getCodeName());
       else {
         eduPrizeInfo1.setLevelName("");
       }
     }
     HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("教师获奖信息表", 9);
     String[] secondTitles = { "序号", "教师姓名", "任课班级", "科目", "获奖项目", "获奖时间", "级别", "备注" };
     HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
     String[] beanProperty = { "idNo", "teacherUserName", "allName", "subjectName", "prizeProject", "time", "levelName", "remark" };
     HSSFWorkbook workbook = null;
     try {
       workbook = ExcelUtil.exportExcelData(workbook2, allEduPrizeInfo, beanProperty);
       OutputStream out = response.getOutputStream();
       String filename = "人事导出信息表.xls";
       filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
       response.setContentType("application/vnd.ms-excel;charset=UTF-8");
       response.setHeader("content-disposition", "attachment;filename=" + filename);
       workbook.write(out);
       out.close();
     } catch (Exception e) {
       e.printStackTrace();
     }
   }
 }

