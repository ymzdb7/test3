 package com.myoa.service.vehicle;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.edu.eduUser.EduUserMapper;
import com.myoa.dao.vehicle.VehicleMapper;
import com.myoa.dao.vehicle.VehicleUsageMapper;
import com.myoa.model.department.Department;
import com.myoa.model.edu.eduUser.EduUser;
import com.myoa.model.users.Users;
import com.myoa.model.vehicle.VehicleUsageWithBLOBs;
import com.myoa.model.vehicle.VehicleWithBLOBs;
import com.myoa.util.AjaxJson;
import com.myoa.util.ExcelUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;

 import java.io.OutputStream;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.commons.collections.map.HashedMap;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class VeHicleUsageService
 {
 
   @Autowired
   private VehicleUsageMapper vehicleUsageMapper;
 
   @Autowired
   private EduUserMapper eduUserMapper;
 
   @Autowired
   private VehicleMapper vehicleMapper;
 
   @Autowired
   private DepartmentMapper departmentMapper;
 
   public AjaxJson addVeHicle(HttpServletRequest request, VehicleUsageWithBLOBs vehicleUsageWithBLOBs)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try
     {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String userId = users.getUserId();
 
       vehicleUsageWithBLOBs.setVuProposer(userId + ",");
       Date date1 = new Date();
       vehicleUsageWithBLOBs.setVuRequestDate(date1);
 
       String vuUser = vehicleUsageWithBLOBs.getVuUser();
       if (vuUser != null) {
         vehicleUsageWithBLOBs.setVuUser(vuUser);
       }
 
       String deptManager = vehicleUsageWithBLOBs.getDeptManager();
       if (deptManager != null) {
         vehicleUsageWithBLOBs.setDeptManager(deptManager);
       }
 
       String s = vehicleUsageWithBLOBs.getvId();
       if (!StringUtils.checkNull(s).booleanValue()) {
         VehicleWithBLOBs vehicleWithBLOBs = this.vehicleMapper.selectByPrimaryKey(Integer.valueOf(s));
         if (vehicleWithBLOBs != null) {
           vehicleUsageWithBLOBs.setVuDriver(vehicleWithBLOBs.getvDriver());
         }
       }
 
       Map map = new HashedMap();
       map.put("vId", vehicleUsageWithBLOBs.getvId());
       int count = this.vehicleUsageMapper.getCount(map);
       map.put("startTime", vehicleUsageWithBLOBs.getVuStart());
       map.put("endTime", vehicleUsageWithBLOBs.getVuEnd());
       int VehicleCount = this.vehicleUsageMapper.getCount(map);
       if (count == VehicleCount) {
         if (!StringUtils.checkNull(vehicleUsageWithBLOBs.getDeptManager()).booleanValue()) {
           vehicleUsageWithBLOBs.setDmerStatus("0");
         }
         int i = this.vehicleUsageMapper.insertSelective(vehicleUsageWithBLOBs);
         if (i > 0) {
           ajaxJson.setFlag(true);
           ajaxJson.setMsg("申请成功");
         }
       } else {
         ajaxJson.setFlag(false);
         ajaxJson.setMsg("您预约车辆的时间段已经被占用");
       }
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
     }
     return ajaxJson;
   }
 
   public AjaxJson selectAllVeHicle(HttpServletResponse response, HttpServletRequest request, String vuStatusName, String applyStartTime, VehicleUsageWithBLOBs vehicleUsageWithBLOBs3, String applyEndTime, String export)
   {
     if (export == null) {
       export = "0";
     }
 
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       Map map = new HashMap();
       map.put("vId", vehicleUsageWithBLOBs3.getvId());
       map.put("vuDriver", vehicleUsageWithBLOBs3.getVuDriver());
       map.put("applyStartTime", applyStartTime);
       map.put("applyEndTime", applyEndTime);
       map.put("vuUser", vehicleUsageWithBLOBs3.getVuUser());
       map.put("vuDept", vehicleUsageWithBLOBs3.getVuDept());
       map.put("vuProposer", vehicleUsageWithBLOBs3.getVuProposer());
       map.put("vuOperator", vehicleUsageWithBLOBs3.getVuOperator());
       map.put("vuReason", vehicleUsageWithBLOBs3.getVuReason());
       map.put("vuRemark", vehicleUsageWithBLOBs3.getVuRemark());
 
       List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBs1 = null;
 
       if (vuStatusName.equals("0"))
       {
         vehicleUsageWithBLOBs1 = this.vehicleUsageMapper.getNoApproval(map);
       }
       else if (vuStatusName.equals("1"))
       {
         vehicleUsageWithBLOBs1 = this.vehicleUsageMapper.selectAlredyAllVeHicle();
         List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBsList1 = this.vehicleUsageMapper.getAllApprovalVehicle(map);
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs : vehicleUsageWithBLOBsList1) {
           if ((vehicleUsageWithBLOBs.getDeptManager() == null) || (vehicleUsageWithBLOBs.getDeptManager().equals(""))) {
             vehicleUsageWithBLOBs1.add(vehicleUsageWithBLOBs);
           }
         }
 
       }
       else if (vuStatusName.equals("2")) {
         vehicleUsageWithBLOBs1 = this.vehicleUsageMapper.selectAlredyAllVeHicle();
         List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBsList1 = this.vehicleUsageMapper.getAllApprovalVehicle(map);
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs : vehicleUsageWithBLOBsList1) {
           if (vehicleUsageWithBLOBs.getDeptManager() == null) {
             vehicleUsageWithBLOBs1.add(vehicleUsageWithBLOBs);
           }
         }
 
         List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBsList = new ArrayList <VehicleUsageWithBLOBs>();
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs : vehicleUsageWithBLOBs1) {
           Date date = new Date();
           Date vuStart = vehicleUsageWithBLOBs.getVuStart();
           Date vuEnd = vehicleUsageWithBLOBs.getVuEnd();
           long time = date.getTime();
           long startTime = vuStart.getTime();
           long endTime = vuEnd.getTime();
           if ((startTime <= time) && (endTime >= time)) {
             vehicleUsageWithBLOBsList.add(vehicleUsageWithBLOBs);
           }
         }
 
         vehicleUsageWithBLOBs1 = vehicleUsageWithBLOBsList;
       }
       else if (vuStatusName.equals("3")) {
         vehicleUsageWithBLOBs1 = this.vehicleUsageMapper.selectAlredyAllVeHicle();
         List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBsList1 = this.vehicleUsageMapper.getAllApprovalVehicle(map);
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs : vehicleUsageWithBLOBsList1) {
           if (vehicleUsageWithBLOBs.getDeptManager() == null) {
             vehicleUsageWithBLOBs1.add(vehicleUsageWithBLOBs);
           }
         }
 
         List vehicleUsageWithBLOBsList = new ArrayList();
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs : vehicleUsageWithBLOBs1) {
           Date date = new Date();
           Date vuStart = vehicleUsageWithBLOBs.getVuStart();
           Date vuEnd = vehicleUsageWithBLOBs.getVuEnd();
           long time = date.getTime();
           long startTime = vuStart.getTime();
           long endTime = vuEnd.getTime();
           if ((startTime >= time) && (endTime >= time)) {
             vehicleUsageWithBLOBsList.add(vehicleUsageWithBLOBs);
           }
         }
 
         vehicleUsageWithBLOBs1 = vehicleUsageWithBLOBsList;
       }
       else if (vuStatusName.equals("4"))
       {
         vehicleUsageWithBLOBs1 = this.vehicleUsageMapper.selectRefuseVehicle(map);
       }
       else if (vuStatusName.equals("5"))
       {
         vehicleUsageWithBLOBs1 = this.vehicleUsageMapper.selectNoUseVehicle(map);
       }
       else {
         vehicleUsageWithBLOBs1 = this.vehicleUsageMapper.seVehicle(map);
       }
       if (vehicleUsageWithBLOBs1 != null) {
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs : vehicleUsageWithBLOBs1)
         {
           if (!StringUtils.checkNull(vehicleUsageWithBLOBs.getvId()).booleanValue()) {
             VehicleWithBLOBs vehicleWithBLOBs = this.vehicleMapper.selectByPrimaryKey(Integer.valueOf(vehicleUsageWithBLOBs.getvId()));
             if (vehicleWithBLOBs != null)
               vehicleUsageWithBLOBs.setvIdNum(vehicleWithBLOBs.getvNum());
             else {
               vehicleUsageWithBLOBs.setvIdNum("");
             }
           }
 
           if ((vehicleUsageWithBLOBs.getVuUser() != null) && (vehicleUsageWithBLOBs.getVuUser() != "")) {
             EduUser byuserId = this.eduUserMapper.getByuserId(vehicleUsageWithBLOBs.getVuUser().substring(0, vehicleUsageWithBLOBs.getVuUser().length() - 1));
             if (byuserId != null) {
               vehicleUsageWithBLOBs.setVuUserName(byuserId.getUserName());
             }
 
           }
 
           if ((vehicleUsageWithBLOBs.getDeptManager() != null) && (vehicleUsageWithBLOBs.getDeptManager() != "")) {
             EduUser byuserId1 = this.eduUserMapper.getByuserId(vehicleUsageWithBLOBs.getDeptManager().substring(0, vehicleUsageWithBLOBs.getDeptManager().length() - 1));
             if (byuserId1 != null) {
               vehicleUsageWithBLOBs.setDeptManagerName(byuserId1.getUserName());
             }
 
           }
 
           String vuSuite = vehicleUsageWithBLOBs.getVuSuite();
           if ((vuSuite != null) && (vuSuite != "")) {
             StringBuffer sb = new StringBuffer();
             String[] split = vuSuite.split(",");
             for (String s : split) {
               EduUser byuserId2 = this.eduUserMapper.getByuserId(s);
               if (byuserId2 != null) {
                 sb.append(byuserId2.getUserName() + ",");
               }
               vehicleUsageWithBLOBs.setVuSuiteName(sb.toString());
             }
           }
         }
 
       }
 
       if (export.equals("1")) {
         HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("车辆信息导入表", 9);
         String[] secondTitles = { "车牌号", "用车人", "随行人员", "事由", "开始时间", "结束时间", "备注" };
         HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
         String[] beanProperty = { "vIdNum", "vuUserName", "vuSuiteName", "vuReason", "vuStart", "vuEnd", "vuRemark" };
         HSSFWorkbook workbook = null;
         workbook = ExcelUtil.exportExcelData(workbook2, vehicleUsageWithBLOBs1, beanProperty);
         OutputStream out = response.getOutputStream();
         String filename = "车辆信息导出表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel;charset=UTF-8");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
         workbook.write(out);
         out.close();
       }
 
       ajaxJson.setObj(vehicleUsageWithBLOBs1);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setMsg(e.getMessage());
     }
     return ajaxJson;
   }
 
   public AjaxJson deptApproval(HttpServletRequest request, String dmerStatus)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try
     {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String userId = users.getUserId();
       VehicleUsageWithBLOBs vehicleUsageWithBLOBs = new VehicleUsageWithBLOBs();
       vehicleUsageWithBLOBs.setDeptManager(userId);
       vehicleUsageWithBLOBs.setDmerStatus(dmerStatus);
       List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBs1 = this.vehicleUsageMapper.deptApproval(vehicleUsageWithBLOBs);
       for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs2 : vehicleUsageWithBLOBs1)
       {
         VehicleWithBLOBs vehicleWithBLOBs = this.vehicleMapper.selectByPrimaryKey(Integer.valueOf(vehicleUsageWithBLOBs2.getvId()));
         if (vehicleWithBLOBs != null) {
           vehicleUsageWithBLOBs2.setvIdNum(vehicleWithBLOBs.getvNum());
         }
 
         String vuUser = vehicleUsageWithBLOBs2.getVuUser();
         if (!StringUtils.checkNull(vuUser).booleanValue()) {
           EduUser byuserId = this.eduUserMapper.getByuserId(vuUser.substring(0, vuUser.length() - 1));
           if (byuserId != null) {
             vehicleUsageWithBLOBs2.setVuUserName(byuserId.getUserName());
           }
         }
 
         String vuSuite = vehicleUsageWithBLOBs2.getVuSuite();
         if ((vuSuite != null) && (vuSuite != "")) {
           StringBuffer sb = new StringBuffer();
           String[] split = vuSuite.split(",");
           for (String s : split) {
             EduUser byuserId2 = this.eduUserMapper.getByuserId(s);
             if (byuserId2 != null) {
               sb.append(byuserId2.getUserName() + ",");
             }
             vehicleUsageWithBLOBs2.setVuSuiteName(sb.toString());
           }
         }
       }
 
       ajaxJson.setObj(vehicleUsageWithBLOBs1);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
   public AjaxJson editDeptApproval(VehicleUsageWithBLOBs vehicleUsageWithBLOBs) {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       vehicleUsageWithBLOBs.setVuStatus("0");
       int i = this.vehicleUsageMapper.updateByPrimaryKeySelective(vehicleUsageWithBLOBs);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("ok");
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
   public AjaxJson editOperatorstatu(VehicleUsageWithBLOBs vehicleUsageWithBLOBs) {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       int i = this.vehicleUsageMapper.updateByPrimaryKeySelective(vehicleUsageWithBLOBs);
       if (i > 0) {
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("ok");
       }
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public ToJson<VehicleUsageWithBLOBs> getReservation(Integer vId)
   {
     ToJson json = new ToJson(1, "err");
     try
     {
       List <VehicleUsageWithBLOBs> reservation = this.vehicleUsageMapper.getReservation(vId);
       for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs2 : reservation)
       {
         if ((vehicleUsageWithBLOBs2.getDeptManager() != null) && (vehicleUsageWithBLOBs2.getDeptManager() != "")) {
           if (vehicleUsageWithBLOBs2.getDmerStatus().equals("0")) {
             vehicleUsageWithBLOBs2.setVuStatusName("部门审批员待审批");
           }
           else if (vehicleUsageWithBLOBs2.getDmerStatus().equals("1"))
             vehicleUsageWithBLOBs2.setVuStatusName("部门审批员已批准");
           else {
             vehicleUsageWithBLOBs2.setVuStatusName("部门审批员未批准");
           }
         }
         else if (vehicleUsageWithBLOBs2.getVuStatus().equals("0")) {
           vehicleUsageWithBLOBs2.setVuStatusName("调度员待审批");
         }
         else if (vehicleUsageWithBLOBs2.getVuStatus().equals("1")) {
           vehicleUsageWithBLOBs2.setVuStatusName("调度员已批准");
         }
         else {
           vehicleUsageWithBLOBs2.setVuStatusName("调度员未批准");
         }
 
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs : reservation)
         {
           VehicleWithBLOBs vehicleWithBLOBs = this.vehicleMapper.selectByPrimaryKey(Integer.valueOf(vehicleUsageWithBLOBs.getvId()));
           if (vehicleWithBLOBs != null) {
             vehicleUsageWithBLOBs.setvIdNum(vehicleWithBLOBs.getvNum());
           }
 
           if ((vehicleUsageWithBLOBs.getVuUser() != null) && (vehicleUsageWithBLOBs.getVuUser() != "")) {
             EduUser byuserId = this.eduUserMapper.getByuserId(vehicleUsageWithBLOBs.getVuUser().substring(0, vehicleUsageWithBLOBs.getVuUser().length() - 1));
             if (byuserId != null) {
               vehicleUsageWithBLOBs.setVuUserName(byuserId.getUserName());
             }
 
           }
 
           if ((vehicleUsageWithBLOBs.getDeptManager() != null) && (vehicleUsageWithBLOBs.getDeptManager() != "")) {
             EduUser byuserId1 = this.eduUserMapper.getByuserId(vehicleUsageWithBLOBs.getDeptManager().substring(0, vehicleUsageWithBLOBs.getDeptManager().length() - 1));
             if (byuserId1 != null) {
               vehicleUsageWithBLOBs.setDeptManagerName(byuserId1.getUserName());
             }
 
           }
 
           String vuSuite = vehicleUsageWithBLOBs.getVuSuite();
           if ((vuSuite != null) && (vuSuite != "")) {
             StringBuffer sb = new StringBuffer();
             String[] split = vuSuite.split(",");
             for (String s : split) {
               EduUser byuserId2 = this.eduUserMapper.getByuserId(s);
               if (byuserId2 != null) {
                 sb.append(byuserId2.getUserName() + ",");
               }
               vehicleUsageWithBLOBs.setVuSuiteName(sb.toString());
             }
           }
         }
 
       }
 
       json.setObj(reservation);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg("err");
       json.setFlag(1);
       e.printStackTrace();
     }
     return json;
   }
 
   public AjaxJson GetOperator(HttpServletRequest request, String applyStartTime, String applyEndTime, VehicleUsageWithBLOBs vehicleUsageWithBLOBs)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       Map map = new HashMap();
 
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String userId = users.getUserId();
       vehicleUsageWithBLOBs.setVuOperator(userId);
 
       List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBsList = null;
       if (vehicleUsageWithBLOBs.getSign().equals("0")) {
         vehicleUsageWithBLOBsList = this.vehicleUsageMapper.GetOperator(vehicleUsageWithBLOBs);
 
         List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBsList1 = this.vehicleUsageMapper.getAllPendingVehicle(map);
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs2 : vehicleUsageWithBLOBsList1) {
           if ((vehicleUsageWithBLOBs2.getDeptManager() == null) || (vehicleUsageWithBLOBs2.getDeptManager().equals(""))) {
             vehicleUsageWithBLOBsList.add(vehicleUsageWithBLOBs2);
           }
         }
       }
       else if (vehicleUsageWithBLOBs.getSign().equals("1")) {
         vehicleUsageWithBLOBsList = this.vehicleUsageMapper.GetOperator(vehicleUsageWithBLOBs);
 
         Map map1 = new HashMap();
         map1.put("vuOperator", userId);
         List <VehicleUsageWithBLOBs>vehicleUsageWithBLOBsList1 = this.vehicleUsageMapper.getAllapproveVehicle(map1);
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs2 : vehicleUsageWithBLOBsList1) {
           if ((vehicleUsageWithBLOBs2.getDeptManager() == null) || (vehicleUsageWithBLOBs2.getDeptManager().equals(""))) {
             vehicleUsageWithBLOBsList.add(vehicleUsageWithBLOBs2);
           }
         }
       }
       else if (vehicleUsageWithBLOBs.getSign().equals("2")) {
         vehicleUsageWithBLOBsList = this.vehicleUsageMapper.selectAlredyAllVeHicle();
         List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBsList1 = this.vehicleUsageMapper.getAllApprovalVehicle(map);
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs2 : vehicleUsageWithBLOBsList1) {
           if ((vehicleUsageWithBLOBs2.getDeptManager() == null) || (vehicleUsageWithBLOBs2.getDeptManager().equals(""))) {
             vehicleUsageWithBLOBsList.add(vehicleUsageWithBLOBs2);
           }
         }
 
         List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBsList3 = new ArrayList <VehicleUsageWithBLOBs>();
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs4 : vehicleUsageWithBLOBsList) {
           Date date = new Date();
           Date vuStart = vehicleUsageWithBLOBs4.getVuStart();
           Date vuEnd = vehicleUsageWithBLOBs4.getVuEnd();
           long time = date.getTime();
           long startTime = vuStart.getTime();
           long endTime = vuEnd.getTime();
           if ((startTime <= time) && (endTime >= time)) {
             vehicleUsageWithBLOBsList3.add(vehicleUsageWithBLOBs4);
           }
         }
 
         vehicleUsageWithBLOBsList = vehicleUsageWithBLOBsList3;
       }
       else if (vehicleUsageWithBLOBs.getSign().equals("3"))
       {
         Map map1 = new HashMap();
         map1.put("vuOperator", userId);
         vehicleUsageWithBLOBsList = this.vehicleUsageMapper.selectRefuseByOperator(map1);
       }
       else if (vehicleUsageWithBLOBs.getSign().equals("4")) {
         vehicleUsageWithBLOBsList = this.vehicleUsageMapper.selectAlredyAllVeHicle();
         List <VehicleUsageWithBLOBs> vehicleUsageWithBLOBsList4 = this.vehicleUsageMapper.getAllApprovalVehicle(map);
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs3 : vehicleUsageWithBLOBsList4) {
           if ((vehicleUsageWithBLOBs3.getDeptManager() == null) || (vehicleUsageWithBLOBs3.getDeptManager().equals(""))) {
             vehicleUsageWithBLOBsList.add(vehicleUsageWithBLOBs3);
           }
         }
 
         List vehicleUsageWithBLOBsList2 = new ArrayList();
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs5 : vehicleUsageWithBLOBsList) {
           Date date = new Date();
           Date vuStart = vehicleUsageWithBLOBs5.getVuStart();
           Date vuEnd = vehicleUsageWithBLOBs5.getVuEnd();
           long time = date.getTime();
           long startTime = vuStart.getTime();
           long endTime = vuEnd.getTime();
           if ((startTime >= time) && (endTime >= time)) {
             vehicleUsageWithBLOBsList2.add(vehicleUsageWithBLOBs5);
           }
         }
 
         vehicleUsageWithBLOBsList = vehicleUsageWithBLOBsList2;
       } else {
         vehicleUsageWithBLOBsList = this.vehicleUsageMapper.GetOperator(vehicleUsageWithBLOBs);
       }
 
       if (vehicleUsageWithBLOBsList != null) {
         for (VehicleUsageWithBLOBs vehicleUsageWithBLOBs1 : vehicleUsageWithBLOBsList)
         {
           VehicleWithBLOBs vehicleWithBLOBs2 = this.vehicleMapper.selectByPrimaryKey(Integer.valueOf(vehicleUsageWithBLOBs1.getvId()));
           if (vehicleWithBLOBs2 != null) {
             vehicleUsageWithBLOBs1.setvIdNum(vehicleWithBLOBs2.getvNum());
           }
 
           String vuUser = vehicleUsageWithBLOBs1.getVuUser();
           if (!StringUtils.checkNull(vuUser).booleanValue()) {
             EduUser byuserId = this.eduUserMapper.getByuserId(vuUser.substring(0, vuUser.length() - 1));
             if (byuserId != null) {
               vehicleUsageWithBLOBs1.setVuUserName(byuserId.getUserName());
             }
 
           }
 
           String vuProposer = vehicleUsageWithBLOBs1.getVuProposer();
           if (!StringUtils.checkNull(vuProposer).booleanValue()) {
             EduUser byuserId3 = this.eduUserMapper.getByuserId(vuProposer.substring(0, vuProposer.length() - 1));
             if (byuserId3 != null) {
               vehicleUsageWithBLOBs1.setVuProposerName(byuserId3.getUserName());
             }
           }
 
           String deptManager = vehicleUsageWithBLOBs1.getDeptManager();
           if (!StringUtils.checkNull(deptManager).booleanValue()) {
             EduUser byuserId1 = this.eduUserMapper.getByuserId(deptManager.substring(0, deptManager.length() - 1));
             if (byuserId1 != null) {
               vehicleUsageWithBLOBs1.setDeptManagerName(byuserId1.getUserName());
             }
           }
 
           String vuSuite = vehicleUsageWithBLOBs1.getVuSuite();
           if ((vuSuite != null) && (vuSuite != "")) {
             StringBuffer sb = new StringBuffer();
             String[] split = vuSuite.split(",");
             for (String s : split) {
               EduUser byuserId2 = this.eduUserMapper.getByuserId(s);
               if (byuserId2 != null) {
                 sb.append(byuserId2.getUserName() + ",");
               }
               vehicleUsageWithBLOBs1.setVuSuiteName(sb.toString());
             }
 
           }
 
         }
 
       }
 
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("ok");
       ajaxJson.setObj(vehicleUsageWithBLOBsList);
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getVehicleUsageDetail(Integer vuId)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       VehicleUsageWithBLOBs vehicleUsageWithBLOBs = this.vehicleUsageMapper.selectByPrimaryKey(vuId);
       if (vehicleUsageWithBLOBs != null)
       {
         VehicleWithBLOBs vehicleWithBLOBs = this.vehicleMapper.selectByPrimaryKey(Integer.valueOf(vehicleUsageWithBLOBs.getvId()));
         if (vehicleWithBLOBs != null) {
           vehicleUsageWithBLOBs.setvIdNum(vehicleWithBLOBs.getvNum());
         }
 
         String s1 = vehicleUsageWithBLOBs.getVuDriver();
         if (!StringUtils.checkNull(s1).booleanValue()) {
           EduUser byuserId6 = this.eduUserMapper.getByuserId(s1.substring(0, s1.length() - 1));
           if (byuserId6 != null) {
             vehicleUsageWithBLOBs.setVuDriverName(byuserId6.getUserName());
           }
 
         }
 
         String vuProposer = vehicleUsageWithBLOBs.getVuProposer();
         if (!StringUtils.checkNull(vuProposer).booleanValue()) {
           EduUser byuserId3 = this.eduUserMapper.getByuserId(vuProposer.substring(0, vuProposer.length() - 1));
           if (byuserId3 != null) {
             vehicleUsageWithBLOBs.setVuProposerName(byuserId3.getUserName());
           }
         }
 
         String vuDept = vehicleUsageWithBLOBs.getVuDept();
         if (!StringUtils.checkNull(vuDept).booleanValue()) {
           Department deptById = this.departmentMapper.getDeptById(Integer.valueOf(vuDept.substring(0, vuDept.length() - 1)).intValue());
           if (deptById != null) {
             vehicleUsageWithBLOBs.setVuDeptName(deptById.getDeptName());
           }
         }
 
         String vuUser = vehicleUsageWithBLOBs.getVuUser();
         if (!StringUtils.checkNull(vuUser).booleanValue()) {
           EduUser byuserId = this.eduUserMapper.getByuserId(vuUser.substring(0, vuUser.length() - 1));
           if (byuserId != null) {
             vehicleUsageWithBLOBs.setVuUserName(byuserId.getUserName());
           }
 
         }
 
         EduUser byuserId5 = this.eduUserMapper.getByuserId(vehicleUsageWithBLOBs.getVuOperator());
         if (byuserId5 != null) {
           vehicleUsageWithBLOBs.setVuOperatorName(byuserId5.getUserName());
         }
 
         String deptManager = vehicleUsageWithBLOBs.getDeptManager();
         if (!StringUtils.checkNull(deptManager).booleanValue()) {
           EduUser byuserId1 = this.eduUserMapper.getByuserId(deptManager.substring(0, deptManager.length() - 1));
           if (byuserId1 != null) {
             vehicleUsageWithBLOBs.setDeptManagerName(byuserId1.getUserName());
           }
 
         }
 
         String vuSuite = vehicleUsageWithBLOBs.getVuSuite();
         if ((vuSuite != null) && (vuSuite != "")) {
           StringBuffer sb = new StringBuffer();
           String[] split = vuSuite.split(",");
           for (String s : split) {
             EduUser byuserId2 = this.eduUserMapper.getByuserId(s);
             if (byuserId2 != null) {
               sb.append(byuserId2.getUserName() + ",");
             }
             vehicleUsageWithBLOBs.setVuSuiteName(sb.toString());
           }
         }
         ajaxJson.setObj(vehicleUsageWithBLOBs);
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("ok");
       }
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson deleteVehicleUsage(Integer vuId)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       int i = this.vehicleUsageMapper.deleteByPrimaryKey(vuId);
       if (i > 0) {
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("ok");
       }
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson editVehicleUsage(VehicleUsageWithBLOBs vehicleUsageWithBLOBs)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       int i = this.vehicleUsageMapper.updateByPrimaryKeySelective(vehicleUsageWithBLOBs);
       if (i > 0) {
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("ok");
       }
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
       e.printStackTrace();
     }
     return ajaxJson;
   }
 }

