 package com.myoa.model.hr;
 
 import com.myoa.model.enclosure.Attachment;

 import java.math.BigDecimal;
import java.util.List;
 
 public class HrStaffInfo
 {
   private Integer staffId;
   private String createUserId;
   private Integer createDeptId;
   private String userId;
   private Integer deptId;
   private String staffNo;
   private String workNo;
   private String photoName;
   private String workType;
   private String staffName;
   private String staffEName;
   private String staffCardNo;
   private String staffSex;
   private String staffSexName;
   private String staffBirth;
   private String isLunar;
   private String staffAge;
   private String staffNativePlace;
   private String staffDomicilePlace;
   private String yesOtherP;
   private String staffNationality;
   private String staffMaritalStatus;
   private String staffPoliticalStatus;
   private String staffPoliticalStatusName;
   private String joinPartyTime;
   private String staffPhone;
   private String staffMobile;
   private String staffLittleSmart;
   private String staffEmail;
   private String staffMsn;
   private String staffQq;
   private String homeAddress;
   private String otherContact;
   private String jobBeginning;
   private String workAge;
   private String staffHealth;
   private String staffHighestSchool;
   private String staffHighestDegree;
   private String graduationDate;
   private String graduationSchool;
   private String staffMajor;
   private String computerLevel;
   private String foreignLanguage1;
   private String foreignLevel1;
   private String foreignLanguage2;
   private String foreignLevel2;
   private String foreignLanguage3;
   private String foreignLevel3;
   private String staffSkills;
   private String staffOccupation;
   private String administrationLevel;
   private String jobPosition;
   private String presentPosition;
   private String datesEmployed;
   private String jobAge;
   private String beginSalsryTime;
   private String workStatus;
   private String staffCs;
   private String staffCtr;
   private String staffCompany;
   private String addTime;
   private String lastUpdateTime;
   private BigDecimal leaveType;
   private String staffType;
   private String yesOrNot;
   private String recordDate;
   private String workLevel;
   private String staffNativePlace2;
   private String workJob;
   private String beforeName;
   private String birthRemindDate;
   private String bank1;
   private String bankAccount1;
   private String bank2;
   private String bankAccount2;
   private String bloodType;
   private String isExperts;
   private String directlyUnder;
   private String directlySuperior;
   private String directlySuperiorName;
   private String directlyUnderName;
   private String partTime;
   private String startTime;
   private String endTime;
   private Integer uid;
   private String deptName;
   private String sex;
   private String userName;
   private String userPriv;
   private String photo;
   private String userPrivName;
   private String remark;
   private String resume;
   private String attachmentId;
   private String attachmentName;
   private String certificate;
   private String surety;
   private String bodyExamim;
   private String insure;
   private String userdef1;
   private String userdef2;
   private String userdef3;
   private String userdef4;
   private String userdef5;
   private String expertsInfo;
   private String researchResults;
   private String leaveReason;
   private String avatar;
   private String byName;
   List<Attachment> attachmentList;
   private String ouitTimeFact;
 
   public String getSex()
   {
     return this.sex;
   }
 
   public void setSex(String sex) {
     this.sex = sex;
   }
 
   public String getAvatar() {
     return this.avatar;
   }
 
   public void setAvatar(String avatar) {
     this.avatar = avatar;
   }
 
   public List<Attachment> getAttachmentList() {
     return this.attachmentList;
   }
 
   public void setAttachmentList(List<Attachment> attachmentList) {
     this.attachmentList = attachmentList;
   }
 
   public String getDirectlySuperiorName() {
     return this.directlySuperiorName == null ? "" : this.directlySuperiorName;
   }
 
   public String getDirectlyUnderName() {
     return this.directlyUnderName == null ? "" : this.directlyUnderName;
   }
 
   public String getStaffPoliticalStatusName() {
     return this.staffPoliticalStatusName;
   }
 
   public void setStaffPoliticalStatusName(String staffPoliticalStatusName) {
     this.staffPoliticalStatusName = staffPoliticalStatusName;
   }
 
   public void setDirectlySuperiorName(String directlySuperiorName) {
     this.directlySuperiorName = directlySuperiorName;
   }
 
   public void setDirectlyUnderName(String directlyUnderName) {
     this.directlyUnderName = directlyUnderName;
   }
 
   public String getLeaveReason()
   {
     return this.leaveReason == null ? "" : this.leaveReason;
   }
 
   public void setLeaveReason(String leaveReason) {
     this.leaveReason = leaveReason;
   }
 
   public Integer getStaffId() {
     return this.staffId;
   }
 
   public String getCreateUserId() {
     return this.createUserId;
   }
 
   public Integer getCreateDeptId() {
     return this.createDeptId;
   }
 
   public String getUserId() {
     return this.userId;
   }
 
   public Integer getDeptId() {
     return this.deptId;
   }
 
   public String getStaffNo() {
     return this.staffNo;
   }
 
   public String getWorkNo() {
     return this.workNo;
   }
 
   public String getPhotoName() {
     return this.photoName == null ? "" : this.photoName;
   }
 
   public String getWorkType() {
     return this.workType;
   }
 
   public String getStaffName() {
     return this.staffName == null ? "" : this.staffName;
   }
 
   public String getStaffEName() {
     return this.staffEName == null ? "" : this.staffEName;
   }
 
   public String getStaffCardNo() {
     return this.staffCardNo;
   }
 
   public String getStaffSex() {
     return this.staffSex;
   }
 
   public String getStaffBirth() {
     if ((this.staffBirth == "") || (this.staffBirth == null)) {
       return "0000-00-00";
     }
     return this.staffBirth;
   }
 
   public String getIsLunar() {
     return this.isLunar;
   }
 
   public String getStaffAge() {
     return this.staffAge;
   }
 
   public String getStaffNativePlace() {
     return this.staffNativePlace == null ? "" : this.staffNativePlace;
   }
 
   public String getStaffDomicilePlace() {
     return this.staffDomicilePlace == null ? "" : this.staffDomicilePlace;
   }
 
   public String getYesOtherP() {
     return this.yesOtherP;
   }
 
   public String getStaffSexName() {
     return this.staffSexName;
   }
 
   public void setStaffSexName(String staffSexName) {
     this.staffSexName = staffSexName;
   }
 
   public String getStaffNationality() {
     return this.staffNationality == null ? "" : this.staffNationality;
   }
 
   public String getStaffMaritalStatus() {
     return this.staffMaritalStatus;
   }
 
   public String getStaffPoliticalStatus() {
     return this.staffPoliticalStatus;
   }
 
   public String getJoinPartyTime() {
     return this.joinPartyTime == "" ? "0000-00-00" : this.joinPartyTime;
   }
 
   public String getStaffPhone() {
     return this.staffPhone;
   }
 
   public String getStaffMobile() {
     return this.staffMobile;
   }
 
   public String getStaffLittleSmart() {
     return this.staffLittleSmart;
   }
 
   public String getStaffEmail() {
     return this.staffEmail;
   }
 
   public String getStaffMsn() {
     return this.staffMsn;
   }
 
   public String getStaffQq() {
     return this.staffQq;
   }
 
   public String getHomeAddress() {
     return this.homeAddress;
   }
 
   public String getOtherContact() {
     return this.otherContact;
   }
 
   public String getJobBeginning() {
     return this.jobBeginning == "" ? "0000-00-00" : this.jobBeginning;
   }
 
   public String getWorkAge() {
     return this.workAge;
   }
 
   public String getStaffHealth() {
     return this.staffHealth;
   }
 
   public String getStaffHighestSchool() {
     return this.staffHighestSchool;
   }
 
   public String getStaffHighestDegree() {
     return this.staffHighestDegree;
   }
 
   public String getGraduationDate() {
     return this.graduationDate == "" ? "0000-00-00" : this.graduationDate;
   }
 
   public String getGraduationSchool() {
     return this.graduationSchool;
   }
 
   public String getStaffMajor() {
     return this.staffMajor;
   }
 
   public String getComputerLevel() {
     return this.computerLevel;
   }
 
   public String getForeignLanguage1() {
     return this.foreignLanguage1;
   }
 
   public String getForeignLevel1() {
     return this.foreignLevel1;
   }
 
   public String getForeignLanguage2() {
     return this.foreignLanguage2;
   }
 
   public String getForeignLevel2() {
     return this.foreignLevel2;
   }
 
   public String getForeignLanguage3() {
     return this.foreignLanguage3;
   }
 
   public String getForeignLevel3() {
     return this.foreignLevel3;
   }
 
   public String getStaffSkills() {
     return this.staffSkills;
   }
 
   public String getStaffOccupation() {
     return this.staffOccupation;
   }
 
   public String getAdministrationLevel() {
     return this.administrationLevel;
   }
 
   public String getJobPosition() {
     return this.jobPosition;
   }
 
   public String getPresentPosition() {
     return this.presentPosition;
   }
 
   public String getDatesEmployed() {
     if ((this.datesEmployed == "") || (this.datesEmployed == null)) {
       return "0000-00-00";
     }
     return this.datesEmployed;
   }
 
   public String getJobAge() {
     return this.jobAge;
   }
 
   public String getBeginSalsryTime() {
     return this.beginSalsryTime == "" ? "0000-00-00" : this.beginSalsryTime;
   }
 
   public String getWorkStatus() {
     return this.workStatus;
   }
 
   public String getStaffCs() {
     return this.staffCs == "" ? "0000-00-00" : this.staffCs;
   }
 
   public String getStaffCtr() {
     return this.staffCtr == "" ? "0000-00-00" : this.staffCtr;
   }
 
   public String getStaffCompany() {
     return this.staffCompany;
   }
 
   public String getAddTime() {
     return this.addTime == "" ? "0000-00-00 00:00:00" : this.addTime;
   }
 
   public String getLastUpdateTime() {
     return this.lastUpdateTime == "" ? "0000-00-00 00:00:00" : this.lastUpdateTime;
   }
 
   public BigDecimal getLeaveType() {
     return this.leaveType;
   }
 
   public String getStaffType() {
     return this.staffType;
   }
 
   public String getYesOrNot() {
     return this.yesOrNot;
   }
 
   public String getRecordDate() {
     return this.recordDate == "" ? "0000-00-00" : this.recordDate;
   }
 
   public String getWorkLevel() {
     return this.workLevel;
   }
 
   public String getStaffNativePlace2() {
     return this.staffNativePlace2 == null ? "" : this.staffNativePlace2;
   }
 
   public String getWorkJob() {
     return this.workJob;
   }
 
   public String getBeforeName() {
     return this.beforeName == null ? "" : this.beforeName;
   }
 
   public String getBirthRemindDate() {
     return this.birthRemindDate;
   }
 
   public String getBank1() {
     return this.bank1;
   }
 
   public String getBankAccount1() {
     return this.bankAccount1;
   }
 
   public String getBank2() {
     return this.bank2;
   }
 
   public String getBankAccount2() {
     return this.bankAccount2;
   }
 
   public String getBloodType() {
     return this.bloodType;
   }
 
   public String getIsExperts() {
     return this.isExperts;
   }
 
   public String getDirectlyUnder() {
     return this.directlyUnder;
   }
 
   public String getDirectlySuperior() {
     return this.directlySuperior;
   }
 
   public String getPartTime() {
     return this.partTime;
   }
 
   public String getStartTime() {
     return this.startTime;
   }
 
   public String getEndTime() {
     return this.endTime;
   }
 
   public Integer getUid() {
     return this.uid;
   }
 
   public String getDeptName() {
     return this.deptName == null ? "" : this.deptName;
   }
 
   public String getUserName() {
     return this.userName == null ? "" : this.userName;
   }
 
   public String getUserPriv() {
     return this.userPriv;
   }
 
   public String getPhoto() {
     return this.photo;
   }
 
   public String getUserPrivName() {
     return this.userPrivName == null ? "" : this.userPrivName;
   }
 
   public String getRemark() {
     return this.remark;
   }
 
   public String getResume() {
     return this.resume;
   }
 
   public String getAttachmentId() {
     return this.attachmentId;
   }
 
   public String getAttachmentName() {
     return this.attachmentName;
   }
 
   public String getCertificate() {
     return this.certificate;
   }
 
   public String getSurety() {
     return this.surety;
   }
 
   public String getBodyExamim() {
     return this.bodyExamim;
   }
 
   public String getInsure() {
     return this.insure;
   }
 
   public String getUserdef1() {
     return this.userdef1 == null ? "" : this.userdef1;
   }
 
   public String getUserdef2() {
     return this.userdef2 == null ? "" : this.userdef2;
   }
 
   public String getUserdef3() {
     return this.userdef3 == null ? "" : this.userdef3;
   }
 
   public String getUserdef4() {
     return this.userdef4 == null ? "" : this.userdef4;
   }
 
   public String getUserdef5() {
     return this.userdef5 == null ? "" : this.userdef5;
   }
 
   public String getExpertsInfo() {
     return this.expertsInfo;
   }
 
   public String getResearchResults() {
     return this.researchResults;
   }
 
   public void setStaffId(Integer staffId) {
     this.staffId = staffId;
   }
 
   public void setCreateUserId(String createUserId) {
     this.createUserId = createUserId;
   }
 
   public void setCreateDeptId(Integer createDeptId) {
     this.createDeptId = createDeptId;
   }
 
   public void setUserId(String userId) {
     this.userId = userId;
   }
 
   public void setDeptId(Integer deptId) {
     this.deptId = deptId;
   }
 
   public void setStaffNo(String staffNo) {
     this.staffNo = staffNo;
   }
 
   public void setWorkNo(String workNo) {
     this.workNo = workNo;
   }
 
   public void setPhotoName(String photoName) {
     this.photoName = photoName;
   }
 
   public void setWorkType(String workType) {
     this.workType = workType;
   }
 
   public void setStaffName(String staffName) {
     this.staffName = staffName;
   }
 
   public void setStaffEName(String staffEName) {
     this.staffEName = staffEName;
   }
 
   public void setStaffCardNo(String staffCardNo) {
     this.staffCardNo = staffCardNo;
   }
 
   public void setStaffSex(String staffSex) {
     this.staffSex = staffSex;
   }
 
   public void setStaffBirth(String staffBirth) {
     this.staffBirth = staffBirth;
   }
 
   public void setIsLunar(String isLunar) {
     this.isLunar = isLunar;
   }
 
   public void setStaffAge(String staffAge) {
     this.staffAge = staffAge;
   }
 
   public void setStaffNativePlace(String staffNativePlace) {
     this.staffNativePlace = staffNativePlace;
   }
 
   public void setStaffDomicilePlace(String staffDomicilePlace) {
     this.staffDomicilePlace = staffDomicilePlace;
   }
 
   public void setYesOtherP(String yesOtherP) {
     this.yesOtherP = yesOtherP;
   }
 
   public void setStaffNationality(String staffNationality) {
     this.staffNationality = staffNationality;
   }
 
   public void setStaffMaritalStatus(String staffMaritalStatus) {
     this.staffMaritalStatus = staffMaritalStatus;
   }
 
   public void setStaffPoliticalStatus(String staffPoliticalStatus) {
     this.staffPoliticalStatus = staffPoliticalStatus;
   }
 
   public void setJoinPartyTime(String joinPartyTime) {
     this.joinPartyTime = joinPartyTime;
   }
 
   public void setStaffPhone(String staffPhone) {
     this.staffPhone = staffPhone;
   }
 
   public void setStaffMobile(String staffMobile) {
     this.staffMobile = staffMobile;
   }
 
   public void setStaffLittleSmart(String staffLittleSmart) {
     this.staffLittleSmart = staffLittleSmart;
   }
 
   public void setStaffEmail(String staffEmail) {
     this.staffEmail = staffEmail;
   }
 
   public void setStaffMsn(String staffMsn) {
     this.staffMsn = staffMsn;
   }
 
   public void setStaffQq(String staffQq) {
     this.staffQq = staffQq;
   }
 
   public void setHomeAddress(String homeAddress) {
     this.homeAddress = homeAddress;
   }
 
   public void setOtherContact(String otherContact) {
     this.otherContact = otherContact;
   }
 
   public void setJobBeginning(String jobBeginning) {
     this.jobBeginning = jobBeginning;
   }
 
   public void setWorkAge(String workAge) {
     this.workAge = workAge;
   }
 
   public void setStaffHealth(String staffHealth) {
     this.staffHealth = staffHealth;
   }
 
   public void setStaffHighestSchool(String staffHighestSchool) {
     this.staffHighestSchool = staffHighestSchool;
   }
 
   public void setStaffHighestDegree(String staffHighestDegree) {
     this.staffHighestDegree = staffHighestDegree;
   }
 
   public void setGraduationDate(String graduationDate) {
     this.graduationDate = graduationDate;
   }
 
   public void setGraduationSchool(String graduationSchool) {
     this.graduationSchool = graduationSchool;
   }
 
   public void setStaffMajor(String staffMajor) {
     this.staffMajor = staffMajor;
   }
 
   public void setComputerLevel(String computerLevel) {
     this.computerLevel = computerLevel;
   }
 
   public void setForeignLanguage1(String foreignLanguage1) {
     this.foreignLanguage1 = foreignLanguage1;
   }
 
   public void setForeignLevel1(String foreignLevel1) {
     this.foreignLevel1 = foreignLevel1;
   }
 
   public void setForeignLanguage2(String foreignLanguage2) {
     this.foreignLanguage2 = foreignLanguage2;
   }
 
   public void setForeignLevel2(String foreignLevel2) {
     this.foreignLevel2 = foreignLevel2;
   }
 
   public void setForeignLanguage3(String foreignLanguage3) {
     this.foreignLanguage3 = foreignLanguage3;
   }
 
   public void setForeignLevel3(String foreignLevel3) {
     this.foreignLevel3 = foreignLevel3;
   }
 
   public void setStaffSkills(String staffSkills) {
     this.staffSkills = staffSkills;
   }
 
   public void setStaffOccupation(String staffOccupation) {
     this.staffOccupation = staffOccupation;
   }
 
   public void setAdministrationLevel(String administrationLevel) {
     this.administrationLevel = administrationLevel;
   }
 
   public void setJobPosition(String jobPosition) {
     this.jobPosition = jobPosition;
   }
 
   public void setPresentPosition(String presentPosition) {
     this.presentPosition = presentPosition;
   }
 
   public void setDatesEmployed(String datesEmployed) {
     this.datesEmployed = datesEmployed;
   }
 
   public void setJobAge(String jobAge)
   {
     this.jobAge = jobAge;
   }
 
   public void setBeginSalsryTime(String beginSalsryTime) {
     this.beginSalsryTime = beginSalsryTime;
   }
 
   public void setWorkStatus(String workStatus) {
     this.workStatus = workStatus;
   }
 
   public void setStaffCs(String staffCs) {
     this.staffCs = staffCs;
   }
 
   public void setStaffCtr(String staffCtr) {
     this.staffCtr = staffCtr;
   }
 
   public void setStaffCompany(String staffCompany) {
     this.staffCompany = staffCompany;
   }
 
   public void setAddTime(String addTime) {
     this.addTime = addTime;
   }
 
   public void setLastUpdateTime(String lastUpdateTime) {
     this.lastUpdateTime = lastUpdateTime;
   }
 
   public void setLeaveType(BigDecimal leaveType) {
     this.leaveType = leaveType;
   }
 
   public void setStaffType(String staffType) {
     this.staffType = staffType;
   }
 
   public void setYesOrNot(String yesOrNot) {
     this.yesOrNot = yesOrNot;
   }
 
   public void setRecordDate(String recordDate) {
     this.recordDate = recordDate;
   }
 
   public void setWorkLevel(String workLevel) {
     this.workLevel = workLevel;
   }
 
   public void setStaffNativePlace2(String staffNativePlace2) {
     this.staffNativePlace2 = staffNativePlace2;
   }
 
   public void setWorkJob(String workJob) {
     this.workJob = workJob;
   }
 
   public void setBeforeName(String beforeName) {
     this.beforeName = beforeName;
   }
 
   public void setBirthRemindDate(String birthRemindDate) {
     this.birthRemindDate = birthRemindDate;
   }
 
   public void setBank1(String bank1) {
     this.bank1 = bank1;
   }
 
   public void setBankAccount1(String bankAccount1) {
     this.bankAccount1 = bankAccount1;
   }
 
   public void setBank2(String bank2) {
     this.bank2 = bank2;
   }
 
   public void setBankAccount2(String bankAccount2) {
     this.bankAccount2 = bankAccount2;
   }
 
   public void setBloodType(String bloodType) {
     this.bloodType = bloodType;
   }
 
   public void setIsExperts(String isExperts) {
     this.isExperts = isExperts;
   }
 
   public void setDirectlyUnder(String directlyUnder) {
     this.directlyUnder = directlyUnder;
   }
 
   public void setDirectlySuperior(String directlySuperior) {
     this.directlySuperior = directlySuperior;
   }
 
   public void setPartTime(String partTime) {
     this.partTime = partTime;
   }
 
   public void setStartTime(String startTime) {
     this.startTime = startTime;
   }
 
   public void setEndTime(String endTime) {
     this.endTime = endTime;
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
 
   public void setRemark(String remark) {
     this.remark = remark;
   }
 
   public void setResume(String resume) {
     this.resume = resume;
   }
 
   public void setAttachmentId(String attachmentId) {
     this.attachmentId = attachmentId;
   }
 
   public void setAttachmentName(String attachmentName) {
     this.attachmentName = attachmentName;
   }
 
   public void setCertificate(String certificate) {
     this.certificate = certificate;
   }
 
   public void setSurety(String surety) {
     this.surety = surety;
   }
 
   public void setBodyExamim(String bodyExamim) {
     this.bodyExamim = bodyExamim;
   }
 
   public void setInsure(String insure) {
     this.insure = insure;
   }
 
   public void setUserdef1(String userdef1) {
     this.userdef1 = userdef1;
   }
 
   public void setUserdef2(String userdef2) {
     this.userdef2 = userdef2;
   }
 
   public void setUserdef3(String userdef3) {
     this.userdef3 = userdef3;
   }
 
   public void setUserdef4(String userdef4) {
     this.userdef4 = userdef4;
   }
 
   public void setUserdef5(String userdef5) {
     this.userdef5 = userdef5;
   }
 
   public void setExpertsInfo(String expertsInfo) {
     this.expertsInfo = expertsInfo;
   }
 
   public void setResearchResults(String researchResults) {
     this.researchResults = researchResults;
   }
 
   public String getByName() {
     return this.byName;
   }
 
   public void setByName(String byName) {
     this.byName = byName;
   }
 
   public String getOuitTimeFact() {
     return this.ouitTimeFact == null ? "" : this.ouitTimeFact;
   }
 
   public void setOuitTimeFact(String ouitTimeFact) {
     this.ouitTimeFact = ouitTimeFact;
   }
 }
