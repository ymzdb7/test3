 package com.myoa.model.hr;
 
 import com.myoa.model.enclosure.Attachment;

import java.util.List;
 
 public class HrStaffLeave
 {
   private Integer leaveId;
   private String createUserId;
   private Integer createDeptId;
   private String quitTimePlan;
   private String quitType;
   private String lastSalaryTime;
   private String quitTimeFact;
   private String leavePerson;
   private Integer deptId;
   private Integer uid;
   private String deptName;
   private String userName;
   private String userPriv;
   private String photo;
   private String userPrivName;
   private String userId;
   private String sex;
   private String avatar;
   private String despachoPerson;
   private String position;
   private String addTime;
   private String lastUpdateTime;
   private String attachmentId;
   private String attachmentName;
   private String applicationDate;
   private String leaveDept;
   private Integer isReinstatement;
   private Integer salary;
   private String staffCardNo;
   private Boolean isBlacklist;
   private String quitReason;
   private String trace;
   private String remark;
   private String materialsCondition;
   private String despacho;
   private String blacklistInstructions;
   private String birthday;
   List<Attachment> attachmentList;
 
   public String getBirthday()
   {
     return this.birthday == "" ? "0000-00-00" : this.birthday;
   }
 
   public void setBirthday(String birthday) {
     this.birthday = birthday;
   }
 
   public Integer getLeaveId() {
     return this.leaveId;
   }
 
   public String getCreateUserId() {
     return this.createUserId;
   }
 
   public Integer getCreateDeptId() {
     return this.createDeptId;
   }
 
   public String getQuitTimePlan() {
     return this.quitTimePlan == "" ? "0000-00-00" : this.quitTimePlan;
   }
 
   public String getQuitType() {
     return this.quitType;
   }
 
   public String getLastSalaryTime() {
     return this.lastSalaryTime == "" ? "0000-00-00" : this.lastSalaryTime;
   }
 
   public String getQuitTimeFact() {
     return this.quitTimeFact == "" ? "0000-00-00" : this.quitTimeFact;
   }
 
   public String getLeavePerson() {
     return this.leavePerson;
   }
 
   public Integer getDeptId() {
     return this.deptId;
   }
 
   public Integer getUid() {
     return this.uid;
   }
 
   public String getDeptName() {
     return this.deptName;
   }
 
   public String getUserName() {
     return this.userName;
   }
 
   public String getUserPriv() {
     return this.userPriv;
   }
 
   public String getPhoto() {
     return this.photo;
   }
 
   public String getUserPrivName() {
     return this.userPrivName;
   }
 
   public String getUserId() {
     return this.userId;
   }
 
   public String getSex() {
     return this.sex;
   }
 
   public String getAvatar() {
     return this.avatar;
   }
 
   public String getDespachoPerson() {
     return this.despachoPerson;
   }
 
   public String getPosition() {
     return this.position;
   }
 
   public String getAddTime() {
     return this.addTime == "" ? "0000-00-00" : this.addTime;
   }
 
   public String getLastUpdateTime() {
     return this.lastUpdateTime == "" ? "0000-00-00" : this.lastUpdateTime;
   }
 
   public String getAttachmentId() {
     return this.attachmentId;
   }
 
   public String getAttachmentName() {
     return this.attachmentName;
   }
 
   public String getApplicationDate() {
     return this.applicationDate == "" ? "0000-00-00" : this.applicationDate;
   }
 
   public String getLeaveDept() {
     return this.leaveDept;
   }
 
   public Integer getIsReinstatement() {
     return this.isReinstatement;
   }
 
   public Integer getSalary() {
     return this.salary;
   }
 
   public String getStaffCardNo() {
     return this.staffCardNo;
   }
 
   public Boolean getBlacklist() {
     return this.isBlacklist;
   }
 
   public String getQuitReason() {
     return this.quitReason;
   }
 
   public String getTrace() {
     return this.trace;
   }
 
   public String getRemark() {
     return this.remark;
   }
 
   public String getMaterialsCondition() {
     return this.materialsCondition;
   }
 
   public String getDespacho() {
     return this.despacho;
   }
 
   public String getBlacklistInstructions() {
     return this.blacklistInstructions;
   }
 
   public void setLeaveId(Integer leaveId) {
     this.leaveId = leaveId;
   }
 
   public void setCreateUserId(String createUserId) {
     this.createUserId = createUserId;
   }
 
   public void setCreateDeptId(Integer createDeptId) {
     this.createDeptId = createDeptId;
   }
 
   public void setQuitTimePlan(String quitTimePlan) {
     this.quitTimePlan = quitTimePlan;
   }
 
   public void setQuitType(String quitType) {
     this.quitType = quitType;
   }
 
   public void setLastSalaryTime(String lastSalaryTime) {
     this.lastSalaryTime = lastSalaryTime;
   }
 
   public void setQuitTimeFact(String quitTimeFact) {
     this.quitTimeFact = quitTimeFact;
   }
 
   public void setLeavePerson(String leavePerson) {
     this.leavePerson = leavePerson;
   }
 
   public void setDeptId(Integer deptId) {
     this.deptId = deptId;
   }
 
   public void setUid(Integer uid) {
     this.uid = uid;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public void setUserPriv(String userPriv) {
     this.userPriv = userPriv;
   }
 
   public void setPhoto(String photo) {
     this.photo = photo;
   }
 
   public void setUserPrivName(String userPrivName) {
     this.userPrivName = userPrivName;
   }
 
   public void setUserId(String userId) {
     this.userId = userId;
   }
 
   public void setSex(String sex) {
     this.sex = sex;
   }
 
   public void setAvatar(String avatar) {
     this.avatar = avatar;
   }
 
   public void setDespachoPerson(String despachoPerson) {
     this.despachoPerson = despachoPerson;
   }
 
   public void setPosition(String position) {
     this.position = position;
   }
 
   public void setAddTime(String addTime) {
     this.addTime = addTime;
   }
 
   public void setLastUpdateTime(String lastUpdateTime) {
     this.lastUpdateTime = lastUpdateTime;
   }
 
   public void setAttachmentId(String attachmentId) {
     this.attachmentId = attachmentId;
   }
 
   public void setAttachmentName(String attachmentName) {
     this.attachmentName = attachmentName;
   }
 
   public void setApplicationDate(String applicationDate) {
     this.applicationDate = applicationDate;
   }
 
   public void setLeaveDept(String leaveDept) {
     this.leaveDept = leaveDept;
   }
 
   public void setIsReinstatement(Integer isReinstatement) {
     this.isReinstatement = isReinstatement;
   }
 
   public void setSalary(Integer salary) {
     this.salary = salary;
   }
 
   public void setStaffCardNo(String staffCardNo) {
     this.staffCardNo = staffCardNo;
   }
 
   public void setBlacklist(Boolean blacklist) {
     this.isBlacklist = blacklist;
   }
 
   public void setQuitReason(String quitReason) {
     this.quitReason = quitReason;
   }
 
   public void setTrace(String trace) {
     this.trace = trace;
   }
 
   public void setRemark(String remark) {
     this.remark = remark;
   }
 
   public void setMaterialsCondition(String materialsCondition) {
     this.materialsCondition = materialsCondition;
   }
 
   public void setDespacho(String despacho) {
     this.despacho = despacho;
   }
 
   public void setBlacklistInstructions(String blacklistInstructions) {
     this.blacklistInstructions = blacklistInstructions;
   }
 }

