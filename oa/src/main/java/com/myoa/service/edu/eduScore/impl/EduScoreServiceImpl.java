 package com.myoa.service.edu.eduScore.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.edu.eduScore.EduScoreMapper;
import com.myoa.model.edu.eduScore.EduScore;
import com.myoa.model.users.Users;
import com.myoa.service.edu.eduScore.IEduScoreService;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.InputStream;
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
 import org.apache.poi.ss.usermodel.Row;
 import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class EduScoreServiceImpl extends ServiceImpl<EduScoreMapper, EduScore>
   implements IEduScoreService
 {
 
   @Resource
   EduScoreMapper eduScoreMapper;
 
   public void eudScoreInsert(EduScore eduScore)
   {
     this.eduScoreMapper.eudScoreInsert(eduScore);
   }
 
   public ToJson<String> yearSelect(String schollYear)
   {
     ToJson json = new ToJson();
     try {
       List yearlist = this.eduScoreMapper.yearSelect(schollYear);
       if (yearlist.size() > 0) {
         json.setObj(yearlist);
         json.setMsg("ok");
         json.setFlag(0);
       } else {
         json.setMsg("err");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<EduScore> yearClassSelect(Map<String, String> maps)
   {
     ToJson json = new ToJson();
     try {
       List yearClassList = this.eduScoreMapper.yearClassSelect(maps);
       if (yearClassList.size() > 0) {
         int i = yearClassList.size();
         json.setObj(yearClassList);
         json.setMsg("ok");
         json.setFlag(yearClassList.size());
         json.setFlag(i);
       } else {
         json.setMsg("err");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<EduScore> wordEduScoreInsert(MultipartFile file, HttpServletRequest request, HttpServletResponse response, HttpSession session)
   {
     ToJson json = new ToJson();
     Map mapClass = new HashMap();
 
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
         EduScore eduScore = null;
         for (int i = 1; i <= lastRowNum; i++) {
           eduScore = new EduScore();
           row = sheetObj.getRow(i);
           if (row != null) {
             for (int j = 0; j < colNum; j++) {
               Cell cell = row.getCell(j);
               if (cell != null) {
                 switch (j)
                 {
                 case 0:
                   eduScore.setUserId(cell.getStringCellValue());
                   break;
                 case 1:
                   eduScore.setUserName(cell.getStringCellValue());
                   break;
                 case 2:
                   eduScore.setGradeName(cell.getStringCellValue());
                   break;
                 case 3:
                   eduScore.setClassName(cell.getStringCellValue());
                   break;
                 case 4:
                   eduScore.setSchoolYear(cell.getStringCellValue());
                   break;
                 case 5:
                   eduScore.setSemester(cell.getStringCellValue());
                   break;
                 case 6:
                   eduScore.setSubject(cell.getStringCellValue());
                   break;
                 case 7:
                   eduScore.setExamType(cell.getStringCellValue());
                   break;
                 case 8:
                   eduScore.setExamCheck(cell.getStringCellValue());
                   break;
                 case 9:
                   eduScore.setExamNumber(cell.getStringCellValue());
                   break;
                 case 10:
                   eduScore.setHeadteacherId((int)cell.getNumericCellValue() + "");
                   break;
                 case 11:
                   eduScore.setHeadteacherName(cell.getStringCellValue());
                   break;
                 case 12:
                   eduScore.setSubjectTeacherId((int)cell.getNumericCellValue() + "");
                   break;
                 case 13:
                   eduScore.setSubjectTeacher(cell.getStringCellValue());
                   break;
                 case 14:
                   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
                   Date date1 = cell.getDateCellValue();
                   eduScore.setEntryDate(date1);
                   break;
                 case 15:
                   double score = cell.getNumericCellValue();
                   eduScore.setScore(Integer.valueOf((int)score));
                   break;
                 case 16:
                   eduScore.setScoreLevel(cell.getNumericCellValue() + "");
                   break;
                 case 17:
                   eduScore.setExamId((int)cell.getNumericCellValue() + "");
                 }
 
               }
 
             }
 
             String gradeName = eduScore.getGradeName();
             Map mapGrade = this.eduScoreMapper.selectGradeNameID(gradeName);
 
             eduScore.setGradeId(mapGrade.get("deptId").toString());
 
             mapClass.put("className", eduScore.getClassName());
             mapClass.put("deptNo", mapGrade.get("deptNo"));
             String classId = this.eduScoreMapper.selectClassID(mapClass);
 
             eduScore.setClassId(classId);
             eduScore.setAttachmentId("wu");
 
             eduScore.setAttachmentName(fileName);
             int count = this.eduScoreMapper.eudScoreInsert(eduScore);
             if (count > 0) {
               successCount = Integer.valueOf(successCount.intValue() + count);
             }
           }
         }
       }
 
       if (successCount.intValue() > 0) {
         json.setMsg("ok");
         json.setFlag(1);
         return json;
       }
       json.setMsg("err");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduScoreTww(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     String paraValue = request.getParameter("paraValue");
     try {
       int count = this.eduScoreMapper.eduScoreTww(paraValue);
       if (count > 0) {
         json.setFlag(0);
         json.setMsg("ok");
         return json;
       }
       json.setMsg("err");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduScoreTwwSelect(HttpServletRequest request)
   {
     ToJson json = new ToJson();
 
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Integer id = users.getUid();
     try {
       String paraValue = this.eduScoreMapper.eduScoreTwwSelect();
       String[] uid = paraValue.split(",");
       for (int i = 0; i < uid.length; i++) {
         Integer paraid = Integer.valueOf(uid[i]);
         if (paraid == id) {
           json.setFlag(0);
           json.setMsg("ok");
           return json;
         }
       }
       json.setMsg("err");
       json.setFlag(1);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 }

