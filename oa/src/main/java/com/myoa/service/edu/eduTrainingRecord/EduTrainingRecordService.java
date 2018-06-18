 package com.myoa.service.edu.eduTrainingRecord;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.edu.eduTrainingPlanRecord.EduTrainingRecordMapper;
import com.myoa.dao.edu.eduUser.EduUserMapper;
import com.myoa.model.department.Department;
import com.myoa.model.edu.eduTrainingPlanRecord.EduTrainingRecordWithBLOBs;
import com.myoa.model.edu.eduUser.EduUser;
import com.myoa.model.users.Users;
import com.myoa.util.AjaxJson;
import com.myoa.util.ExcelUtil;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
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
 public class EduTrainingRecordService
 {
 
   @Autowired
   private EduTrainingRecordMapper eduTrainingRecordMapper;
 
   @Autowired
   private EduUserMapper eduUserMapper;
 
   @Autowired
   private DepartmentMapper eduDepartmentMapper;
 
   public AjaxJson addEduTrainPlainRecord(HttpServletRequest request, EduTrainingRecordWithBLOBs eduTrainingRecordWithBLOBs)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setFlag(false);
     try
     {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       eduTrainingRecordWithBLOBs.setCreateUserId(users.getUserId());
       eduTrainingRecordWithBLOBs.setCreateDeptId(users.getDeptId());
       this.eduTrainingRecordMapper.insertSelective(eduTrainingRecordWithBLOBs);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson editRecord(HttpServletRequest request, EduTrainingRecordWithBLOBs eduTrainingRecordWithBLOBs)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setFlag(false);
     try {
       int i = this.eduTrainingRecordMapper.updateByPrimaryKeySelective(eduTrainingRecordWithBLOBs);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson deleteRecordById(HttpServletRequest request, Integer recordId)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setFlag(false);
     try {
       int i = this.eduTrainingRecordMapper.deleteByPrimaryKey(recordId);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getdetail(HttpServletRequest request, Integer recordId)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setFlag(false);
     try {
       EduTrainingRecordWithBLOBs eduTrainingRecordWithBLOBs = this.eduTrainingRecordMapper.selectByPrimaryKey(recordId);
       if (eduTrainingRecordWithBLOBs.getCreateUserId() != null) {
         EduUser byuserId = this.eduUserMapper.getByuserId(eduTrainingRecordWithBLOBs.getCreateUserId());
         eduTrainingRecordWithBLOBs.setCreateUserName(byuserId.getUserName());
       }
       if (eduTrainingRecordWithBLOBs.getCreateDeptId() != null) {
         Department eduDepartmentWithBLOBs = this.eduDepartmentMapper.getDeptById(Integer.valueOf(eduTrainingRecordWithBLOBs.getCreateDeptId().intValue()).intValue());
         eduTrainingRecordWithBLOBs.setCreateDeptName(eduDepartmentWithBLOBs.getDeptName());
       }
       StringBuffer sb = new StringBuffer();
       if (eduTrainingRecordWithBLOBs.getStaffUserId() != null) {
         String staffUserId = eduTrainingRecordWithBLOBs.getStaffUserId();
         String[] split = staffUserId.split(",");
         for (String s : split) {
           EduUser byuserId = this.eduUserMapper.getByuserId(s);
           sb.append(byuserId.getUserName() + ",");
         }
       }
       eduTrainingRecordWithBLOBs.setStaffUserName(sb.toString());
       ajaxJson.setObj(eduTrainingRecordWithBLOBs);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getAll(HttpServletRequest request, Integer page, Integer pageSize, Boolean useFlag)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setFlag(false);
     try
     {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(useFlag);
       Map map = new HashMap();
       map.put("page", pageParams);
 
       List<EduTrainingRecordWithBLOBs> all = this.eduTrainingRecordMapper.getAll(map);
 
       for (EduTrainingRecordWithBLOBs eduTrainingRecordWithBLOBs : all) {
         StringBuffer sb = new StringBuffer();
         if (eduTrainingRecordWithBLOBs.getStaffUserId() != null) {
           String staffUserId = eduTrainingRecordWithBLOBs.getStaffUserId();
           String[] split = staffUserId.split(",");
           for (String s : split) {
             EduUser byuserId = this.eduUserMapper.getByuserId(s);
             if (byuserId != null) {
               sb.append(byuserId.getUserName() + ",");
             }
           }
         }
         eduTrainingRecordWithBLOBs.setStaffUserName(sb.toString());
       }
       int count = this.eduTrainingRecordMapper.getCount();
       ajaxJson.setTotleNum(Integer.valueOf(count));
       ajaxJson.setObj(all);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson queryRecord(EduTrainingRecordWithBLOBs eduTrainingRecordWithBLOBs, String export, HttpServletRequest request, HttpServletResponse response)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setFlag(false);
     if (export == null)
       export = "0";
     try
     {
       Map map = new HashMap();
       map.put("eduTrainingRecordWithBLOBs", eduTrainingRecordWithBLOBs);
       List<EduTrainingRecordWithBLOBs> all = this.eduTrainingRecordMapper.queryRecord(map);
       for (EduTrainingRecordWithBLOBs eduTrainingRecordWithBLOBs1 : all) {
         if (eduTrainingRecordWithBLOBs1.getCreateUserId() != null) {
           EduUser byuserId = this.eduUserMapper.getByuserId(eduTrainingRecordWithBLOBs1.getCreateUserId());
           eduTrainingRecordWithBLOBs1.setCreateUserName(byuserId.getUserName());
         }
         if (eduTrainingRecordWithBLOBs1.getCreateDeptId() != null) {
           Department eduDepartmentWithBLOBs2 = this.eduDepartmentMapper.getDeptById(Integer.valueOf(eduTrainingRecordWithBLOBs1.getCreateDeptId().intValue()).intValue());
           eduTrainingRecordWithBLOBs1.setCreateDeptName(eduDepartmentWithBLOBs2.getDeptName());
         }
         StringBuffer sb = new StringBuffer();
         if (eduTrainingRecordWithBLOBs1.getStaffUserId() != null) {
           String staffUserId = eduTrainingRecordWithBLOBs1.getStaffUserId();
           String[] split = staffUserId.split(",");
           for (String s : split) {
             EduUser byuserId = this.eduUserMapper.getByuserId(s);
             if (byuserId != null) {
               sb.append(byuserId.getUserName() + ",");
             }
           }
         }
         eduTrainingRecordWithBLOBs1.setStaffUserName(sb.toString());
       }
       ajaxJson.setObj(all);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
       if (export.equals("1")) {
         HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("培训记录导出信息表", 9);
         String[] secondTitles = { "Id", "创建者用户名", "创建者部门", "培训人员", "培训计划编号", "培训计划名称", "培训机构名称", "培训费用", "出勤情况" };
         HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
         String[] beanProperty = { "recordId", "createUserName", "createDeptName", "staffUserName", "tPlanNo", "tPlanName", "tInstitutionName", "trainningCost", "dutySituation" };
         HSSFWorkbook workbook = ExcelUtil.exportExcelData(workbook2, all, beanProperty);
         OutputStream out = response.getOutputStream();
         String filename = "培训记录导出信息表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel;charset=UTF-8");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
         workbook.write(out);
         out.close();
       }
     }
     catch (Exception e)
     {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson deleteByIds(String[] recordIds)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setFlag(false);
     try {
       this.eduTrainingRecordMapper.deleteByIds(recordIds);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 }

