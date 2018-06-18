 package com.myoa.service.hr.impl;
 
 import com.myoa.dao.hr.HrStaffInfoMapper;
import com.myoa.dao.hr.HrStaffLeaveMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.hr.HrStaffInfo;
import com.myoa.model.hr.HrStaffLeave;
import com.myoa.model.users.Users;
import com.myoa.service.hr.HrStaffLeaveService;
import com.myoa.util.DateCompute;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;

 import java.text.SimpleDateFormat;
 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class HrStaffLeaveServiceImpl
   implements HrStaffLeaveService
 {
 
   @Resource
   HrStaffLeaveMapper hrStaffLeaveMapper;
 
   @Resource
   UsersMapper usersMapper;
 
   @Resource
   HrStaffInfoMapper hrStaffInfoMapper;
 
   public ToJson<HrStaffInfo> querytLeavePersonByDeptId(HttpServletRequest request, Integer deptId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List<HrStaffInfo> list = this.hrStaffInfoMapper.selectLeavePersonByDeptId(deptId);
       for (HrStaffInfo hrStaffInfo : list) {
         if (!StringUtils.checkNull(hrStaffInfo.getUserId()).booleanValue()) {
           Users users = this.usersMapper.getUsersByuserId(hrStaffInfo.getUserId());
           if (users != null) {
             hrStaffInfo.setAvatar(users.getAvatar());
           }
         }
         hrStaffInfo.setUserName(hrStaffInfo.getStaffName());
         HrStaffLeave hrStaffLeave = this.hrStaffLeaveMapper.queryStaffLeaveByLeavePerson(hrStaffInfo.getUserId());
         if (hrStaffLeave != null) {
           hrStaffInfo.setLeaveReason(hrStaffLeave.getQuitReason());
         }
         if (StringUtils.checkNull(hrStaffInfo.getAvatar()).booleanValue()) {
           hrStaffInfo.setAvatar(hrStaffInfo.getStaffSex());
         }
       }
       if (list.size() > 0) {
         toJson.setObject(list);
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("离职人员信息为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<HrStaffLeave> getLeaveUsersByDeptId(HttpServletRequest request, Integer deptId) {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.hrStaffLeaveMapper.getLeaveUsersByDeptId(deptId);
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setObject("没数据");
         toJson.setMsg("离职人员为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<HrStaffLeave> addLeaveInfor(HrStaffLeave hrStaffLeave, HttpServletRequest request)
   {
     if (hrStaffLeave.getQuitTimePlan() != null) {
       hrStaffLeave.setQuitTimePlan(hrStaffLeave.getQuitTimePlan().trim().equals("") ? "0000-00-00" : hrStaffLeave.getQuitTimePlan().trim().trim());
     }
     if (hrStaffLeave.getLastSalaryTime() != null) {
       hrStaffLeave.setLastSalaryTime(hrStaffLeave.getLastSalaryTime().trim().equals("") ? "0000-00-00" : hrStaffLeave.getLastSalaryTime().trim().trim());
     }
     if (hrStaffLeave.getQuitTimeFact() != null) {
       hrStaffLeave.setQuitTimeFact(hrStaffLeave.getQuitTimeFact().trim().equals("") ? "0000-00-00" : hrStaffLeave.getQuitTimeFact().trim().trim());
     }
     if (hrStaffLeave.getAddTime() != null) {
       hrStaffLeave.setAddTime(hrStaffLeave.getAddTime().trim().equals("") ? "0000-00-00 00:00:00" : hrStaffLeave.getAddTime().trim().trim());
     }
     if (hrStaffLeave.getLastUpdateTime() != null) {
       hrStaffLeave.setLastUpdateTime(hrStaffLeave.getLastUpdateTime().trim().equals("") ? "0000-00-00 00:00:00" : hrStaffLeave.getLastUpdateTime().trim().trim());
     }
     if (hrStaffLeave.getApplicationDate() != null) {
       hrStaffLeave.setApplicationDate(hrStaffLeave.getApplicationDate().trim().equals("") ? "0000-00-00" : hrStaffLeave.getApplicationDate().trim().trim());
     }
     if (hrStaffLeave.getQuitType() == null) {
       hrStaffLeave.setQuitType("");
     }
     if (hrStaffLeave.getQuitReason() == null) {
       hrStaffLeave.setQuitReason("");
     }
     if (hrStaffLeave.getTrace() == null) {
       hrStaffLeave.setTrace("");
     }
     if (hrStaffLeave.getRemark() == null) {
       hrStaffLeave.setRemark("");
     }
 
     if (hrStaffLeave.getLeavePerson() == null) {
       hrStaffLeave.setLeavePerson("");
     }
     if (hrStaffLeave.getMaterialsCondition() == null) {
       hrStaffLeave.setMaterialsCondition("");
     }
     if (hrStaffLeave.getDespacho() == null) {
       hrStaffLeave.setDespacho("");
     }
     if (hrStaffLeave.getDespachoPerson() == null) {
       hrStaffLeave.setDespachoPerson("");
     }
     if (hrStaffLeave.getPosition() == null) {
       hrStaffLeave.setPosition("");
     }
 
     if (hrStaffLeave.getAttachmentId() == null) {
       hrStaffLeave.setAttachmentId("");
     }
     if (hrStaffLeave.getAttachmentName() == null) {
       hrStaffLeave.setAttachmentName("");
     }
 
     if (hrStaffLeave.getLeaveDept() == null) {
       hrStaffLeave.setLeaveDept("");
     }
     if (hrStaffLeave.getIsReinstatement() == null) {
       hrStaffLeave.setIsReinstatement(Integer.valueOf(0));
     }
     ToJson toJson = new ToJson(1, "error");
     try {
       int count = 0;
 
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       hrStaffLeave.setCreateUserId(users.getUserId());
       hrStaffLeave.setCreateDeptId(users.getDeptId());
       count += this.hrStaffLeaveMapper.addLeaveInfor(hrStaffLeave);
 
       HrStaffInfo hrStaffInfo = this.hrStaffInfoMapper.getStaffByUserId(hrStaffLeave.getLeavePerson());
       hrStaffInfo.setWorkStatus("02");
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       int year = DateCompute.workAge(sdf.parse(hrStaffLeave.getQuitTimeFact()), sdf.parse(hrStaffInfo.getJobBeginning()));
       hrStaffInfo.setJobAge(String.valueOf(year));
 
       count += this.hrStaffInfoMapper.updatePersonFile(hrStaffInfo);
 
       Users users1 = this.usersMapper.getUsersByuserId(hrStaffLeave.getLeavePerson());
       users1.setDeptId(Integer.valueOf(0));
       users1.setNotLogin(Byte.valueOf((byte) 1));
       count += this.usersMapper.editUser(users1);
       if (count == 3) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<HrStaffLeave> getLeaveUserByDeptId(HttpServletRequest request, Integer deptId) {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.hrStaffLeaveMapper.getLeaveUserByDeptId(deptId);
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("无用户");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 }

