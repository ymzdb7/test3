 package com.myoa.service.edu.eduExam.impl;
 
 import com.myoa.dao.edu.EduExamMapper;
import com.myoa.model.edu.eduExam.EduExam;
import com.myoa.model.edu.eduExam.EduExamWithBLOBs;
import com.myoa.service.edu.eduExam.EduExamService;
import com.myoa.service.enclosure.EnclosureService;
import com.myoa.util.AjaxJson;
import com.myoa.util.DateFormat;
import com.myoa.util.LG;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.page.PageParams;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.InputStream;
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.UUID;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.Row;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class EduExamServiceImpl
   implements EduExamService
 {
 
   @Autowired
   private EduExamMapper eduExamMapper;
 
   @Autowired
   private EnclosureService enclosureService;
 
   public AjaxJson getAllExam(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     AjaxJson ajaxJson = new AjaxJson();
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     try {
       List list = this.eduExamMapper.selectByExample(maps);
       ajaxJson.setTotleNum(pageParams.getTotal());
       ajaxJson.setObj(list);
       ajaxJson.setMsg("true");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public AjaxJson getOneExam(Integer Id)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       EduExam eduExam = this.eduExamMapper.selectByPrimaryKey(Id);
       ajaxJson.setObj(eduExam);
       ajaxJson.setMsg("true");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public AjaxJson updateExam(EduExamWithBLOBs eduExamWithBLOBs, HttpServletRequest request)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       if (eduExamWithBLOBs.getGradeId() == null) {
         eduExamWithBLOBs.setGradeId("");
       }
       if (eduExamWithBLOBs.getClassId() == null) {
         eduExamWithBLOBs.setClassId("");
       }
       if (eduExamWithBLOBs.getExamUserId() == null) {
         eduExamWithBLOBs.setExamUserId("");
       }
       if (eduExamWithBLOBs.getReleaseTime() == null) {
         eduExamWithBLOBs.setReleaseTime(DateFormat.getCurrentTime());
       }
       if (eduExamWithBLOBs.getAttachmentId() == null) {
         eduExamWithBLOBs.setAttachmentId("");
       }
       if (eduExamWithBLOBs.getAttachmentName() == null) {
         eduExamWithBLOBs.setAttachmentName("");
       }
       EduExam OldEduExam = this.eduExamMapper.queryExamByExamName(eduExamWithBLOBs.getExamName());
       if (OldEduExam == null) {
         this.eduExamMapper.insertSelective(eduExamWithBLOBs);
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("ok");
       } else {
         ajaxJson.setFlag(false);
         ajaxJson.setMsg("考试名称重复");
       }
 
     }
     catch (Exception e)
     {
       e.printStackTrace();
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public AjaxJson editExam(EduExamWithBLOBs eduExamWithBLOB, HttpServletRequest request)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       if (eduExamWithBLOB.getGradeId() == null) {
         eduExamWithBLOB.setGradeId("");
       }
       if (eduExamWithBLOB.getClassId() == null) {
         eduExamWithBLOB.setClassId("");
       }
       if (eduExamWithBLOB.getExamUserId() == null) {
         eduExamWithBLOB.setExamUserId("");
       }
       if (eduExamWithBLOB.getReleaseTime() == null) {
         eduExamWithBLOB.setReleaseTime(DateFormat.getCurrentTime());
       }
       if (eduExamWithBLOB.getAttachmentId() == null) {
         eduExamWithBLOB.setAttachmentId("");
       }
       if (eduExamWithBLOB.getAttachmentName() == null) {
         eduExamWithBLOB.setAttachmentName("");
       }
       EduExam OldEduExam = this.eduExamMapper.queryExamByExamName(eduExamWithBLOB.getExamName());
       if (OldEduExam == null) {
         this.eduExamMapper.updateByPrimaryKeySelective(eduExamWithBLOB);
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("ok");
       } else if (OldEduExam.getId() == eduExamWithBLOB.getId()) {
         this.eduExamMapper.updateByPrimaryKeySelective(eduExamWithBLOB);
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("ok");
       } else {
         ajaxJson.setFlag(false);
         ajaxJson.setMsg("考试名称重复");
       }
 
     }
     catch (Exception e)
     {
       e.printStackTrace();
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public AjaxJson deleteExam(Integer Id)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       this.eduExamMapper.deleteByPrimaryKey(Id);
       ajaxJson.setMsg("true");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public AjaxJson deleteManyExam(String ids)
   {
     AjaxJson ajaxJson = new AjaxJson();
     if (StringUtils.checkNull(ids).booleanValue()) {
       ajaxJson.setMsg("The incoming parameter is null");
       ajaxJson.setFlag(false);
       return ajaxJson;
     }
     try {
       String[] idArray = ids.split(",");
       Integer length = Integer.valueOf(idArray.length);
       for (int i = 0; i < length.intValue(); i++) {
         this.eduExamMapper.deleteByPrimaryKey(Integer.valueOf(Integer.parseInt(idArray[i])));
         ajaxJson.setMsg("true");
         ajaxJson.setFlag(true);
       }
     }
     catch (Exception e) {
       LG.e(new Object[] { e.getMessage() });
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public AjaxJson selectEduExam(String schoolYear, String semester, String examType, String examArrange, Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     AjaxJson ajaxJson = new AjaxJson();
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     EduExamWithBLOBs eduExamWithBLOBs = new EduExamWithBLOBs();
     eduExamWithBLOBs.setSchoolYear(schoolYear);
     eduExamWithBLOBs.setSemester(semester);
     eduExamWithBLOBs.setExamType(examType);
     eduExamWithBLOBs.setExamArrange(examArrange);
     maps.put("eduExamWithBLOBs", eduExamWithBLOBs);
     try
     {
       List list = this.eduExamMapper.selectEduExam(maps);
       ajaxJson.setTotleNum(pageParams.getTotal());
       ajaxJson.setObj(list);
       ajaxJson.setMsg("true");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public ToJson<EduExamWithBLOBs> importEduExam(MultipartFile file, HttpServletRequest request, HttpServletResponse response)
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
 
         String readPath = path.append(System.getProperty("file.separator")).append(newFileName).toString();
         InputStream in = new FileInputStream(readPath);
         HSSFWorkbook excelObj = new HSSFWorkbook(in);
         HSSFSheet sheetObj = excelObj.getSheetAt(0);
         Row row = sheetObj.getRow(0);
         int colNum = row.getPhysicalNumberOfCells();
         int lastRowNum = sheetObj.getLastRowNum();
         List EduExamWithBLOBsList = new ArrayList();
         EduExamWithBLOBs eduExamWithBLOBs = null;
         for (int i = 1; i <= lastRowNum; i++) {
           eduExamWithBLOBs = new EduExamWithBLOBs();
           row = sheetObj.getRow(i);
           if (row != null) {
             for (int j = 0; j < colNum; j++) {
               Cell cell = row.getCell(j);
               String value = "";
               if (cell != null) {
                 switch (j)
                 {
                 case 0:
                   BigDecimal big = new BigDecimal(cell.getNumericCellValue());
                   value = big.toString();
 
                   if ((null != value) && (!"".equals(value.trim()))) {
                     String[] item = value.split("[.]");
                     if ((1 < item.length) && ("0".equals(item[1]))) {
                       value = item[0];
                     }
                   }
                   eduExamWithBLOBs.setSchoolYear(value);
                   break;
                 case 1:
                   eduExamWithBLOBs.setSemester(cell.getStringCellValue());
                   break;
                 case 2:
                   eduExamWithBLOBs.setGradeName(cell.getStringCellValue());
                   break;
                 case 3:
                   eduExamWithBLOBs.setExamName(cell.getStringCellValue());
                   break;
                 case 4:
                   BigDecimal bigType = new BigDecimal(cell.getNumericCellValue());
                   String valueType = bigType.toString();
 
                   if ((null != valueType) && (!"".equals(valueType.trim()))) {
                     String[] item = valueType.split("[.]");
                     if ((1 < item.length) && ("0".equals(item[1]))) {
                       valueType = item[0];
                     }
                   }
                   String examType = 0 + valueType;
                   eduExamWithBLOBs.setExamType(examType);
                   break;
                 case 5:
                   eduExamWithBLOBs.setExamArrange(cell.getStringCellValue());
                 }
               }
             }
 
             eduExamWithBLOBs.setReleaseTime(DateFormat.getCurrentTime());
             if (!eduExamWithBLOBs.getExamName().equals("测试数据")) {
               int count = this.eduExamMapper.insertEduExam(eduExamWithBLOBs);
               if (count > 0) {
                 successCount = Integer.valueOf(successCount.intValue() + count);
               }
             }
           }
         }
 
       }
 
       if (successCount.intValue() > 0) {
         json.setMsg(successCount + "");
         json.setFlag(0);
         return json;
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
     }
     return json;
   }
 }

