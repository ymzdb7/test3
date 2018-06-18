 package com.myoa.service.edu.eduArrangeCource.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.edu.eduArrangeCource.EduArrangeCourseMapper;
import com.myoa.model.edu.eduArrangeCource.EduArrangeCourse;
import com.myoa.model.edu.eduArrangeCource.EduArrbean;
import com.myoa.service.edu.eduArrangeCource.IEduArrangeCourseService;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.InputStream;
 import java.math.BigDecimal;
 import java.util.ArrayList;
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
 import org.apache.poi.ss.usermodel.Row;
 import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class EduArrangeCourseServiceImpl extends ServiceImpl<EduArrangeCourseMapper, EduArrangeCourse>
   implements IEduArrangeCourseService
 {
 
   @Resource
   private EduArrangeCourseMapper eduArrangeCourseMapper;
 
   public ToJson<EduArrbean> eduArrangeCourseClassSelect(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson();
     try {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       maps.put("page", pageParams);
       List edulsit = this.eduArrangeCourseMapper.eduArrangeCourseClassSelect(maps);
       json.setObj(edulsit);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("false");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<EduArrbean> eduArrangeCourseTeacherSelect(HttpServletRequest request, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson();
     Map maps = new HashMap();
 
     if ((request.getParameter("teacheri") == null) || (request.getParameter("teacheri").equals(""))) {
       return null;
     }
     maps.put("teacheri", request.getParameter("teacheri"));
     maps.put("academicYear", request.getParameter("academicYear"));
     maps.put("semester", request.getParameter("semester"));
     maps.put("monday", request.getParameter("teacheri"));
     maps.put("tuesday", request.getParameter("teacheri"));
     maps.put("wednesday", request.getParameter("teacheri"));
     maps.put("thursday", request.getParameter("teacheri"));
     maps.put("friday", request.getParameter("teacheri"));
     maps.put("saturday", request.getParameter("teacheri"));
     maps.put("friday", request.getParameter("teacheri"));
     try
     {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       maps.put("page", pageParams);
       Map edulsit = this.eduArrangeCourseMapper.eduArrangeCourseTeacherSelect(maps);
       json.setObject(edulsit);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<EduArrbean> eduArrangeCourseTotalClass(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson();
     try {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       maps.put("page", pageParams);
       List edulsit = this.eduArrangeCourseMapper.eduArrangeCourseTotalClass(maps);
       json.setObj(edulsit);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("false");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<EduArrangeCourse> eduArrangeCourseTotalTeacher(HttpServletRequest request, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson();
     Map maps = new HashMap();
     try {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       maps.put("academicYear", request.getParameter("academicYear"));
       maps.put("semester", request.getParameter("semester"));
       maps.put("page", pageParams);
       List edulsit = this.eduArrangeCourseMapper.eduArrangeCourseTotalTeacher(maps);
       json.setObj(edulsit);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("false");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<EduArrangeCourse> importArrangeCourse(MultipartFile file, HttpServletRequest request, HttpServletResponse response, HttpSession session)
   {
     ToJson json = new ToJson();
 
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
         json.setMsg("请上传文件！");
         json.setFlag(1);
         return json;
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
         EduArrangeCourse eduArrangeCourse = null;
         String value = null;
         for (int i = 1; i <= lastRowNum; i++) {
           eduArrangeCourse = new EduArrangeCourse();
           row = sheetObj.getRow(i);
           if (row != null) {
             for (int j = 0; j < colNum; j++)
             {
               Cell cell = row.getCell(j);
               if (cell != null) {
                 switch (j)
                 {
                 case 0:
                   BigDecimal big1 = new BigDecimal(cell.getNumericCellValue());
                   value = big1.toString();
                   if (null != value) {
                     String[] item = value.split("[.]");
                     if ((1 < item.length) && ("0".equals(item[1]))) {
                       value = item[0];
                     }
                     eduArrangeCourse.setAcademicYear(value);
                   }
                   else {
                     eduArrangeCourse.setAcademicYear(cell.getNumericCellValue() + "");
                   }break;
                 case 1:
                   BigDecimal big2 = new BigDecimal(cell.getNumericCellValue());
                   value = big2.toString();
                   if (null != value) {
                     String[] item = value.split("[.]");
                     if ((1 < item.length) && ("0".equals(item[1]))) {
                       value = item[0];
                     }
                   }
                   eduArrangeCourse.setSemester(value);
                   break;
                 case 2:
                   BigDecimal big3 = new BigDecimal(cell.getNumericCellValue());
                   value = big3.toString();
                   if (null != value) {
                     String[] item = value.split("[.]");
                     if ((1 < item.length) && ("0".equals(item[1]))) {
                       value = item[0];
                     }
                   }
                   eduArrangeCourse.setSection(value);
                   break;
                 case 3:
                   eduArrangeCourse.setGrade(cell.getStringCellValue());
                   break;
                 case 4:
                   eduArrangeCourse.setClazz(cell.getStringCellValue());
                   break;
                 case 5:
                   eduArrangeCourse.setAfternoon(cell.getStringCellValue());
                   break;
                 case 6:
                   eduArrangeCourse.setMonday(cell.getStringCellValue());
                   break;
                 case 7:
                   eduArrangeCourse.setTuesday(cell.getStringCellValue());
                   break;
                 case 8:
                   eduArrangeCourse.setWednesday(cell.getStringCellValue());
                   break;
                 case 9:
                   eduArrangeCourse.setThursday(cell.getStringCellValue());
                   break;
                 case 10:
                   eduArrangeCourse.setFriday(cell.getStringCellValue());
                   break;
                 case 11:
                   eduArrangeCourse.setSaturday(cell.getStringCellValue());
                   break;
                 case 12:
                   eduArrangeCourse.setSunday(cell.getStringCellValue());
                   break;
                 case 13:
                   eduArrangeCourse.setWeekFlag(cell.getStringCellValue());
                 }
               }
 
             }
 
             eduArrangeCourse.setAttachmentId("无");
             eduArrangeCourse.setAttachmentName("无");
             int count = this.eduArrangeCourseMapper.eduArrangeCourseInsert(eduArrangeCourse);
             if (count > 0) {
               successCount = Integer.valueOf(successCount.intValue() + count);
             }
           }
         }
       }
 
       if (successCount.intValue() > 0) {
         json.setMsg("ok");
         json.setFlag(0);
         return json;
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 }

