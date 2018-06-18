 package com.myoa.model.hr;
 
 import com.alibaba.fastjson.annotation.JSONField;
import com.myoa.model.common.SysCode;
import com.myoa.model.enclosure.Attachment;

 import java.sql.Timestamp;
 import java.util.Date;
 import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
 
 public class HrStaffContract
 {
   private Integer contractId;
   private String createUserId;
   private Integer createDeptId;
   private String staffName;
   private String staffContractNo;
   private String contractType;
   private String contractTypeName;
   private String contractSpecialization;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date makeContract;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date trailEffectiveTime;
   private String probationaryPeriod;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date trailOverTime;
   private String passOrNot;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date probationEndDate;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date probationEffectiveDate;
   private String activePeriod;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date contractEndTime;
   private String remark;
   private String removeOrNot;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date contractRemoveTime;
   private String status;
   private String SingTimes;
   private String attachmentId;
   private String attachmentName;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date addTime;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date lastUpdateTime;
 
   @JSONField(format="yyyy-MM-dd")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Timestamp remindTime;
   private String staffUserName;
   private String remindUser;
   private String remindUserName;
   private Integer remindType;
   private Integer hasReminded;
   private String renewTime;
   private String contractEnterpries;
   private String contractEnterpriesName;
   private String isTrial;
   private String isRenew;
   private String userName;
   private String deptName;
   private String postName;
   private String UserPrivName;
   private String userPriv;
   List<Attachment> attachmentList;
   private SysCode codes;
 
   public SysCode getCodes()
   {
     return this.codes;
   }
 
   public void setCodes(SysCode codes) {
     this.codes = codes;
   }
 
   public HrStaffContract(Integer contractId, String createUserId, Integer createDeptId, String staffName, String staffContractNo, String contractType, String contractSpecialization, Date makeContract, Date trailEffectiveTime, String probationaryPeriod, Date trailOverTime, String passOrNot, Date probationEndDate, Date probationEffectiveDate, String activePeriod, Date contractEndTime, String remark, String removeOrNot, Date contractRemoveTime, String status, String singTimes, String attachmentId, String attachmentName, Date addTime, Date lastUpdateTime, Timestamp remindTime, String staffUserName, String remindUser, Integer remindType, Integer hasReminded, String renewTime, String contractEnterpries, String isTrial, String isRenew, String userName, String deptName, String postName, String userPrivName) {
     this.contractId = contractId;
     this.createUserId = createUserId;
     this.createDeptId = createDeptId;
     this.staffName = staffName;
     this.staffContractNo = staffContractNo;
     this.contractType = contractType;
     this.contractSpecialization = contractSpecialization;
     this.makeContract = makeContract;
     this.trailEffectiveTime = trailEffectiveTime;
     this.probationaryPeriod = probationaryPeriod;
     this.trailOverTime = trailOverTime;
     this.passOrNot = passOrNot;
     this.probationEndDate = probationEndDate;
     this.probationEffectiveDate = probationEffectiveDate;
     this.activePeriod = activePeriod;
     this.contractEndTime = contractEndTime;
     this.remark = remark;
     this.removeOrNot = removeOrNot;
     this.contractRemoveTime = contractRemoveTime;
     this.status = status;
     this.SingTimes = singTimes;
     this.attachmentId = attachmentId;
     this.attachmentName = attachmentName;
     this.addTime = addTime;
     this.lastUpdateTime = lastUpdateTime;
     this.remindTime = remindTime;
     this.staffUserName = staffUserName;
     this.remindUser = remindUser;
     this.remindType = remindType;
     this.hasReminded = hasReminded;
     this.renewTime = renewTime;
     this.contractEnterpries = contractEnterpries;
     this.isTrial = isTrial;
     this.isRenew = isRenew;
     this.userName = userName;
     this.deptName = deptName;
     this.postName = postName;
     this.UserPrivName = userPrivName;
   }
 
   public HrStaffContract() {
   }
 
   public Integer getContractId() {
     return this.contractId;
   }
 
   public void setContractId(Integer contractId) {
     this.contractId = Integer.valueOf(contractId == null ? 0 : contractId.intValue());
   }
 
   public String getCreateUserId() {
     return this.createUserId;
   }
 
   public void setCreateUserId(String createUserId) {
     this.createUserId = (createUserId == null ? "" : createUserId.trim());
   }
 
   public List<Attachment> getAttachmentList() {
     return this.attachmentList;
   }
 
   public void setAttachmentList(List<Attachment> attachmentList) {
     this.attachmentList = attachmentList;
   }
 
   public Integer getCreateDeptId() {
     return this.createDeptId;
   }
 
   public void setCreateDeptId(Integer createDeptId) {
     this.createDeptId = Integer.valueOf(createDeptId == null ? 0 : createDeptId.intValue());
   }
 
   public String getStaffName() {
     return this.staffName;
   }
 
   public void setStaffName(String staffName) {
     this.staffName = (staffName == null ? "" : staffName.trim());
   }
 
   public String getStaffContractNo() {
     return this.staffContractNo;
   }
 
   public void setStaffContractNo(String staffContractNo) {
     this.staffContractNo = (staffContractNo == null ? "" : staffContractNo.trim());
   }
 
   public String getContractType() {
     return this.contractType;
   }
 
   public void setContractType(String contractType) {
     this.contractType = (contractType == null ? "" : contractType.trim());
   }
 
   public String getContractSpecialization() {
     return this.contractSpecialization;
   }
 
   public void setContractSpecialization(String contractSpecialization) {
     this.contractSpecialization = (contractSpecialization == null ? "" : contractSpecialization.trim());
   }
 
   public Date getMakeContract() {
     return this.makeContract;
   }
 
   public void setMakeContract(Date makeContract) {
     this.makeContract = makeContract;
   }
 
   public Date getTrailEffectiveTime() {
     return this.trailEffectiveTime;
   }
 
   public void setTrailEffectiveTime(Date trailEffectiveTime) {
     this.trailEffectiveTime = trailEffectiveTime;
   }
 
   public String getProbationaryPeriod() {
     return this.probationaryPeriod == null ? "" : this.probationaryPeriod;
   }
 
   public void setProbationaryPeriod(String probationaryPeriod) {
     this.probationaryPeriod = (probationaryPeriod == null ? "" : probationaryPeriod.trim());
   }
 
   public Date getTrailOverTime() {
     return this.trailOverTime;
   }
 
   public void setTrailOverTime(Date trailOverTime) {
     this.trailOverTime = trailOverTime;
   }
 
   public String getPassOrNot() {
     return this.passOrNot;
   }
 
   public void setPassOrNot(String passOrNot) {
     this.passOrNot = (passOrNot == null ? "" : passOrNot.trim());
   }
 
   public Date getProbationEndDate() {
     return this.probationEndDate;
   }
 
   public void setProbationEndDate(Date probationEndDate) {
     this.probationEndDate = probationEndDate;
   }
 
   public Date getProbationEffectiveDate() {
     return this.probationEffectiveDate;
   }
 
   public void setProbationEffectiveDate(Date probationEffectiveDate) {
     this.probationEffectiveDate = probationEffectiveDate;
   }
 
   public String getActivePeriod() {
     return this.activePeriod == null ? "" : this.activePeriod.trim();
   }
 
   public void setActivePeriod(String activePeriod) {
     this.activePeriod = (activePeriod == null ? "" : activePeriod.trim());
   }
 
   public Date getContractEndTime() {
     return this.contractEndTime;
   }
 
   public void setContractEndTime(Date contractEndTime) {
     this.contractEndTime = contractEndTime;
   }
 
   public String getRemark() {
     return this.remark == null ? "" : this.remark.trim();
   }
 
   public void setRemark(String remark) {
     this.remark = (remark == null ? "" : remark.trim());
   }
 
   public String getRemoveOrNot() {
     return this.removeOrNot == null ? "" : this.removeOrNot.trim();
   }
 
   public void setRemoveOrNot(String removeOrNot) {
     this.removeOrNot = (removeOrNot == null ? "" : removeOrNot.trim());
   }
 
   public Date getContractRemoveTime() {
     return this.contractRemoveTime;
   }
 
   public void setContractRemoveTime(Date contractRemoveTime) {
     this.contractRemoveTime = contractRemoveTime;
   }
 
   public String getStatus() {
     return this.status == null ? "" : this.status.trim();
   }
 
   public void setStatus(String status) {
     this.status = (status == null ? "" : status.trim());
   }
 
   public String getSingTimes() {
     return this.SingTimes == null ? "" : this.SingTimes.trim();
   }
 
   public void setSingTimes(String singTimes) {
     this.SingTimes = (singTimes == null ? "" : singTimes.trim());
   }
 
   public String getAttachmentId() {
     return this.attachmentId == null ? "" : this.attachmentId.trim();
   }
 
   public void setAttachmentId(String attachmentId) {
     this.attachmentId = (attachmentId == null ? "" : attachmentId.trim());
   }
 
   public String getAttachmentName() {
     return this.attachmentName == null ? "" : this.attachmentName.trim();
   }
 
   public void setAttachmentName(String attachmentName) {
     this.attachmentName = (attachmentName == null ? "" : attachmentName.trim());
   }
 
   public Date getAddTime() {
     return this.addTime;
   }
 
   public void setAddTime(Date addTime) {
     this.addTime = addTime;
   }
 
   public Date getLastUpdateTime() {
     return this.lastUpdateTime;
   }
 
   public void setLastUpdateTime(Date lastUpdateTime) {
     this.lastUpdateTime = lastUpdateTime;
   }
 
   public Timestamp getRemindTime() {
     return this.remindTime == null ? new Timestamp(0L) : this.remindTime;
   }
 
   public void setRemindTime(Timestamp remindTime) {
     this.remindTime = remindTime;
   }
 
   public String getStaffUserName() {
     return this.staffUserName == null ? "" : this.staffUserName.trim();
   }
 
   public void setStaffUserName(String staffUserName) {
     this.staffUserName = (staffUserName == null ? "" : staffUserName.trim());
   }
 
   public String getRemindUser() {
     return this.remindUser == null ? "" : this.remindUser.trim();
   }
 
   public void setRemindUser(String remindUser) {
     this.remindUser = (remindUser == null ? "" : remindUser.trim());
   }
 
   public Integer getRemindType() {
     return this.remindType;
   }
 
   public void setRemindType(Integer remindType) {
     this.remindType = Integer.valueOf(remindType == null ? 0 : remindType.intValue());
   }
 
   public Integer getHasReminded() {
     return this.hasReminded;
   }
 
   public void setHasReminded(Integer hasReminded) {
     this.hasReminded = Integer.valueOf(hasReminded == null ? 0 : hasReminded.intValue());
   }
 
   public String getRenewTime() {
     return this.renewTime;
   }
 
   public void setRenewTime(String renewTime) {
     this.renewTime = (renewTime == null ? "" : renewTime);
   }
 
   public String getContractEnterpries() {
     return this.contractEnterpries;
   }
 
   public void setContractEnterpries(String contractEnterpries) {
     this.contractEnterpries = (contractEnterpries == null ? "" : contractEnterpries.trim());
   }
 
   public String getIsTrial() {
     return this.isTrial;
   }
 
   public void setIsTrial(String isTrial) {
     this.isTrial = (isTrial == null ? "" : isTrial.trim());
   }
 
   public String getIsRenew() {
     return this.isRenew;
   }
 
   public void setIsRenew(String isRenew) {
     this.isRenew = (isRenew == null ? "" : isRenew.trim());
   }
 
   public String getUserName() {
     return this.userName;
   }
 
   public void setUserName(String userName)
   {
     this.userName = (userName == null ? "" : userName.trim());
   }
 
   public String getDeptName()
   {
     return this.deptName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public String getPostName() {
     return this.postName;
   }
 
   public void setPostName(String postName) {
     this.postName = postName;
   }
 
   public String getUserPrivName() {
     return this.UserPrivName;
   }
 
   public void setUserPrivName(String userPrivName) {
     this.UserPrivName = userPrivName;
   }
 
   public String getUserPriv() {
     return this.userPriv;
   }
 
   public void setUserPriv(String userPriv) {
     this.userPriv = userPriv;
   }
 
   public String getContractTypeName() {
     return this.contractTypeName;
   }
 
   public void setContractTypeName(String contractTypeName) {
     this.contractTypeName = contractTypeName;
   }
 
   public String getContractEnterpriesName() {
     return this.contractEnterpriesName;
   }
 
   public void setContractEnterpriesName(String contractEnterpriesName) {
     this.contractEnterpriesName = contractEnterpriesName;
   }
 
   public String getRemindUserName() {
     return this.remindUserName;
   }
 
   public void setRemindUserName(String remindUserName) {
     this.remindUserName = remindUserName;
   }
 }

