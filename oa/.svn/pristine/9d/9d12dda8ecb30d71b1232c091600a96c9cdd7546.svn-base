 package com.myoa.service.vehicle;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.vehicle.VehicleMaintenanceMapper;
import com.myoa.dao.vehicle.VehicleMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.users.Users;
import com.myoa.model.vehicle.VehicleMaintenanceWithBLOBs;
import com.myoa.model.vehicle.VehicleUsageWithBLOBs;
import com.myoa.model.vehicle.VehicleWithBLOBs;
import com.myoa.service.edu.eduUser.IEduUserService;
import com.myoa.util.AjaxJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;

 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class VeHicleService
 {
 
   @Autowired
   private VehicleMapper vehicleMapper;
 
   @Autowired
   private SysCodeMapper sysCodeMapper;
 
   @Autowired
   private VehicleMaintenanceMapper vehicleMaintenanceMapper;
 
   @Autowired
   DepartmentMapper departmentMapper;
 
   @Autowired
   IEduUserService eduUserService;
 
   public AjaxJson addVeHicle(HttpServletRequest request, VehicleWithBLOBs vehicleWithBLOBs)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     String userId = users.getUserId();
     vehicleWithBLOBs.setvManage(userId);
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       int i = this.vehicleMapper.insertSelective(vehicleWithBLOBs);
       if (i > 0) {
         ajaxJson.setMsg("ok");
         ajaxJson.setFlag(true);
       }
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson editVeHicle(VehicleWithBLOBs vehicleWithBLOBs) {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       this.vehicleMapper.updateByPrimaryKeySelective(vehicleWithBLOBs);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
   public AjaxJson deleteVeHicleByVid(Integer vId) {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       int i = this.vehicleMapper.deleteByPrimaryKey(vId);
       if (i > 0) {
         ajaxJson.setMsg("ok");
         ajaxJson.setFlag(true);
       }
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson deleteVeHiclesByVids(String[] vIds)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       this.vehicleMapper.deleteVeHiclesByVids(vIds);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("ok");
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getDetailVeHicle(Integer vId)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       VehicleWithBLOBs vehicleWithBLOBs = this.vehicleMapper.selectByPrimaryKey(vId);
       if (vehicleWithBLOBs.getvDepart() != null) {
         String depart = vehicleWithBLOBs.getvDepart();
         if (!StringUtils.checkNull(depart).booleanValue()) {
           String depart1 = depart.substring(0, depart.length() - 1);
           vehicleWithBLOBs.setvDepartName(this.departmentMapper.getDeptNameById(Integer.valueOf(depart1).intValue()));
         }
       }
       if (vehicleWithBLOBs.getvOnwer() != null) {
         String owner = vehicleWithBLOBs.getvOnwer();
         vehicleWithBLOBs.setoOnwerName(this.eduUserService.getUserNameByUserIds(owner));
       }
       if (vehicleWithBLOBs.getvCaruser() != null) {
         String carUser = vehicleWithBLOBs.getvCaruser();
         vehicleWithBLOBs.setvCaruserName(this.eduUserService.getUserNameByUserIds(carUser));
       }
       if (vehicleWithBLOBs.getvDriver() != null) {
         String driver = vehicleWithBLOBs.getvDriver();
         vehicleWithBLOBs.setvDriverName(this.eduUserService.getUserNameByUserIds(driver));
       }
       if (!StringUtils.checkNull(vehicleWithBLOBs.getDeptRange()).booleanValue()) {
         String depart = vehicleWithBLOBs.getDeptRange();
         String[] de = depart.split(",");
         StringBuffer sb = new StringBuffer();
         for (String s : de) {
           String deptNameByDeptId = this.departmentMapper.getDeptNameByDeptId(Integer.valueOf(s));
           sb.append(deptNameByDeptId + ",");
         }
         vehicleWithBLOBs.setDeptRangeName(sb.toString());
       }
       if (!StringUtils.checkNull(vehicleWithBLOBs.getUserRange()).booleanValue()) {
         String driver = vehicleWithBLOBs.getUserRange();
         vehicleWithBLOBs.setUserRangeName(this.eduUserService.getUserNameByUserIds(driver));
       }
 
       if ((vehicleWithBLOBs.getvType() != null) && (vehicleWithBLOBs.getvType() != "")) {
         SysCode sysCode = this.sysCodeMapper.getSingleCode("VEHICLETYPE", vehicleWithBLOBs.getvType());
         if (sysCode != null)
           vehicleWithBLOBs.setvTypeName(sysCode.getCodeName());
       }
       else {
         vehicleWithBLOBs.setvTypeName("");
       }
 
       if ((vehicleWithBLOBs.getvStatus() != null) && (vehicleWithBLOBs.getvStatus() != "")) {
         SysCode sysCode1 = this.sysCodeMapper.getSingleCode("VEHICLESTATE", vehicleWithBLOBs.getvStatus());
         if (sysCode1 != null)
           vehicleWithBLOBs.setvStatusName(sysCode1.getCodeName());
       }
       else {
         vehicleWithBLOBs.setvStatusName("");
       }
 
       ajaxJson.setObj(vehicleWithBLOBs);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getAllVeHicle(HttpServletRequest request)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       List <VehicleWithBLOBs> vehicleWithBLOBs = this.vehicleMapper.selectAllVeHicles();
       for (VehicleWithBLOBs vehicleWithBLOBs1 : vehicleWithBLOBs) {
         if (!StringUtils.checkNull(vehicleWithBLOBs1.getvDepart()).booleanValue()) {
           String depart = vehicleWithBLOBs1.getvDepart();
           if (!StringUtils.checkNull(depart).booleanValue()) {
             String depart1 = depart.substring(0, depart.length() - 1);
             vehicleWithBLOBs1.setvDepartName(this.departmentMapper.getDeptNameById(Integer.valueOf(depart1).intValue()));
           }
         }
         if (!StringUtils.checkNull(vehicleWithBLOBs1.getvOnwer()).booleanValue()) {
           String owner = vehicleWithBLOBs1.getvOnwer();
           vehicleWithBLOBs1.setoOnwerName(this.eduUserService.getUserNameByUserIds(owner));
         }
         if (!StringUtils.checkNull(vehicleWithBLOBs1.getvCaruser()).booleanValue()) {
           String carUser = vehicleWithBLOBs1.getvCaruser();
           vehicleWithBLOBs1.setvCaruserName(this.eduUserService.getUserNameByUserIds(carUser));
         }
         if (!StringUtils.checkNull(vehicleWithBLOBs1.getvDriver()).booleanValue()) {
           String driver = vehicleWithBLOBs1.getvDriver();
           vehicleWithBLOBs1.setvDriverName(this.eduUserService.getUserNameByUserIds(driver));
         }
         if (!StringUtils.checkNull(vehicleWithBLOBs1.getDeptRange()).booleanValue()) {
           StringBuffer sb = new StringBuffer();
           String depart = vehicleWithBLOBs1.getDeptRange();
           if (StringUtils.checkNull(depart).booleanValue()) {
             String[] split = depart.split(",");
             for (String s : split) {
               String deptNameByDeptId = this.departmentMapper.getDeptNameByDeptId(Integer.valueOf(s));
               sb.append(deptNameByDeptId + ",");
             }
           }
           vehicleWithBLOBs1.setDeptRangeName(sb.toString());
         }
         if (!StringUtils.checkNull(vehicleWithBLOBs1.getUserRange()).booleanValue()) {
           String driver = vehicleWithBLOBs1.getUserRange();
           vehicleWithBLOBs1.setUserRangeName(this.eduUserService.getUserNameByUserIds(driver));
         }
 
         if ((vehicleWithBLOBs1.getvType() != null) && (vehicleWithBLOBs1.getvType() != "")) {
           SysCode sysCode = this.sysCodeMapper.getSingleCode("VEHICLETYPE", vehicleWithBLOBs1.getvType());
           if (sysCode != null)
             vehicleWithBLOBs1.setvTypeName(sysCode.getCodeName());
         }
         else {
           vehicleWithBLOBs1.setvTypeName("");
         }
 
         if ((vehicleWithBLOBs1.getvStatus() != null) && (vehicleWithBLOBs1.getvStatus() != "")) {
           SysCode sysCode1 = this.sysCodeMapper.getSingleCode("VEHICLESTATE", vehicleWithBLOBs1.getvStatus());
           if (sysCode1 != null)
             vehicleWithBLOBs1.setvStatusName(sysCode1.getCodeName());
         }
         else {
           vehicleWithBLOBs1.setvStatusName("");
         }
 
         if ((vehicleWithBLOBs1.getvNature() != null) && (vehicleWithBLOBs1.getvNature() != "")) {
           SysCode sysCode2 = this.sysCodeMapper.getSingleCode("PROPERTY", vehicleWithBLOBs1.getvNature());
           if (sysCode2 != null)
             vehicleWithBLOBs1.setvNatureName(sysCode2.getCodeName());
         }
         else {
           vehicleWithBLOBs1.setvNatureName("");
         }
       }
 
       ajaxJson.setObj(vehicleWithBLOBs);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getVeHicleFixRecord(Integer vId)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       List <VehicleMaintenanceWithBLOBs> recordByVid = this.vehicleMaintenanceMapper.getRecordByVid(vId);
       for (VehicleMaintenanceWithBLOBs vehicleMaintenanceWithBLOBs : recordByVid)
       {
         VehicleWithBLOBs vehicleWithBLOBs2 = this.vehicleMapper.selectByPrimaryKey(Integer.valueOf(vehicleMaintenanceWithBLOBs.getvId()));
         if (vehicleWithBLOBs2 != null) {
           vehicleMaintenanceWithBLOBs.setvIdNumber(vehicleWithBLOBs2.getvNum());
         }
 
         SysCode sysCode = this.sysCodeMapper.getSingleCode("FIX_TYPE", vehicleMaintenanceWithBLOBs.getVmType());
         if (sysCode != null) {
           vehicleMaintenanceWithBLOBs.setVmTypeName(sysCode.getCodeName());
         }
       }
 
       ajaxJson.setObj(recordByVid);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getDropDownBox(HttpServletRequest request)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try
     {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String userId = users.getUserId();
       Integer deptId = users.getDeptId();
       VehicleWithBLOBs vehicleWithBLOBs = new VehicleWithBLOBs();
       vehicleWithBLOBs.setUserRange(userId);
       vehicleWithBLOBs.setDeptRange(String.valueOf(deptId));
       List allList = new ArrayList();
       List <VehicleWithBLOBs> vehicleWithBLOBs1 = this.vehicleMapper.selectRangeVehicle(vehicleWithBLOBs);
       for (VehicleWithBLOBs vehicleWithBLOBs2 : vehicleWithBLOBs1) {
         allList.add(vehicleWithBLOBs2);
       }
       List <VehicleWithBLOBs>dropDownBox = this.vehicleMapper.getDropDownBox();
       for (VehicleWithBLOBs vehicleWithBLOBs2 : dropDownBox) {
         if (((vehicleWithBLOBs2.getDeptRange() == null) || (vehicleWithBLOBs2.getDeptRange() == "")) && ((vehicleWithBLOBs2.getUserRange() == null) || (vehicleWithBLOBs2.getUserRange() == ""))) {
           allList.add(vehicleWithBLOBs2);
         }
       }
       ajaxJson.setObj(allList);
       ajaxJson.setMsg("ok");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getVeHicleByNum(String vNum)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       List veHicleByvNum = this.vehicleMapper.getVeHicleByvNum(vNum);
       if (veHicleByvNum.size() > 0) {
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("ok");
       }
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("err");
       e.printStackTrace();
     }
     return ajaxJson;
   }
 
   public AjaxJson getVeHicleStatus(VehicleUsageWithBLOBs vehicleUsageWithBLOBs)
   {
     AjaxJson ajaxJson = new AjaxJson();
     ajaxJson.setSuccess(true);
     ajaxJson.setFlag(false);
     try {
       String s = vehicleUsageWithBLOBs.getvId();
       if ((s != null) && (s != "")) {
         List <VehicleMaintenanceWithBLOBs> veHicleStatus = this.vehicleMaintenanceMapper.getVeHicleStatus(Integer.valueOf(s));
         if (veHicleStatus != null)
           for (VehicleMaintenanceWithBLOBs vehicleMaintenanceWithBLOBs : veHicleStatus) {
             Date date = vehicleMaintenanceWithBLOBs.getVmRequestDate();
             Date vuStart = vehicleUsageWithBLOBs.getVuStart();
             Date vuEnd = vehicleUsageWithBLOBs.getVuEnd();
             long time = date.getTime();
             long startTime = vuStart.getTime();
             long endTime = vuEnd.getTime();
             if ((startTime <= time) && (endTime >= time)) {
               ajaxJson.setFlag(true);
               ajaxJson.setMsg("申请该车时段在维护中");
             }
           }
       }
     }
     catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("err");
       e.printStackTrace();
     }
     return ajaxJson;
   }
 }

