 package com.myoa.model.vehicle;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.math.BigDecimal;
 import java.util.Date;
 import org.springframework.format.annotation.DateTimeFormat;
 
 public class VehicleUsage
 {
   private Integer vuId;
   private String vId;
   private String vIdNum;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date vuRequestDate;
   private String vuProposer;
   private String vuProposerName;
   private String vuUser;
   private String vuUserName;
   private String applyStartTime;
   private String applyEndTime;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date vuStart;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date vuEnd;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date vuFinalEnd;
   private Integer vuMileage;
   private String vuDept;
   private String vuDeptName;
   private String vuStatus;
   private String vuStatusName;
   private String sign;
   private String vuDestination;
   private String vuOperator;
   private String vuOperatorName;
   private String vuDriver;
   private String vuDriverName;
   private String smsRemind;
   private String sms2Remind;
   private String deptManager;
   private String deptManagerName;
   private String showFlag;
   private String dmerStatus;
   private String dmerStatusName;
   private Integer vuMileageTrue;
   private BigDecimal vuParkingFees;
   private String smsRemindDriver;
   private String sms2RemindDriver;
   private String remindContent;
   private Integer isBack;
   private String vuOperator1;
   private Integer vuOperator1SmsType;
 
   public Integer getVuId()
   {
     return this.vuId;
   }
 
   public void setVuId(Integer vuId)
   {
     this.vuId = vuId;
   }
 
   public String getVuDriverName() {
     return this.vuDriverName == null ? "" : this.vuDriverName;
   }
 
   public void setVuDriverName(String vuDriverName) {
     this.vuDriverName = vuDriverName;
   }
 
   public String getvId()
   {
     return this.vId;
   }
 
   public String getApplyStartTime() {
     return this.applyStartTime;
   }
 
   public void setApplyStartTime(String applyStartTime) {
     this.applyStartTime = applyStartTime;
   }
 
   public String getApplyEndTime() {
     return this.applyEndTime;
   }
 
   public void setApplyEndTime(String applyEndTime) {
     this.applyEndTime = applyEndTime;
   }
 
   public String getSign() {
     return this.sign;
   }
 
   public void setSign(String sign) {
     this.sign = sign;
   }
 
   public String getVuStatusName() {
     return this.vuStatusName;
   }
 
   public void setVuStatusName(String vuStatusName) {
     this.vuStatusName = vuStatusName;
   }
 
   public void setvId(String vId)
   {
     this.vId = (vId == null ? null : vId.trim());
   }
 
   public String getvIdNum() {
     return this.vIdNum;
   }
 
   public void setvIdNum(String vIdNum) {
     this.vIdNum = vIdNum;
   }
 
   public String getVuProposerName() {
     return this.vuProposerName == null ? "" : this.vuProposerName;
   }
 
   public void setVuProposerName(String vuProposerName) {
     this.vuProposerName = vuProposerName;
   }
 
   public Date getVuRequestDate()
   {
     return this.vuRequestDate;
   }
 
   public void setVuRequestDate(Date vuRequestDate)
   {
     this.vuRequestDate = vuRequestDate;
   }
 
   public String getDmerStatusName() {
     return this.dmerStatusName;
   }
 
   public void setDmerStatusName(String dmerStatusName) {
     this.dmerStatusName = dmerStatusName;
   }
 
   public String getVuProposer()
   {
     return this.vuProposer;
   }
 
   public void setVuProposer(String vuProposer)
   {
     this.vuProposer = (vuProposer == null ? null : vuProposer.trim());
   }
 
   public String getVuUser()
   {
     return this.vuUser;
   }
 
   public void setVuUser(String vuUser)
   {
     this.vuUser = (vuUser == null ? null : vuUser.trim());
   }
 
   public Date getVuStart()
   {
     return this.vuStart;
   }
 
   public void setVuStart(Date vuStart)
   {
     this.vuStart = vuStart;
   }
 
   public Date getVuEnd()
   {
     return this.vuEnd;
   }
 
   public void setVuEnd(Date vuEnd)
   {
     this.vuEnd = vuEnd;
   }
 
   public Date getVuFinalEnd()
   {
     return this.vuFinalEnd;
   }
 
   public void setVuFinalEnd(Date vuFinalEnd)
   {
     this.vuFinalEnd = vuFinalEnd;
   }
 
   public Integer getVuMileage()
   {
     return this.vuMileage;
   }
 
   public void setVuMileage(Integer vuMileage)
   {
     this.vuMileage = vuMileage;
   }
 
   public String getVuDept()
   {
     return this.vuDept;
   }
 
   public void setVuDept(String vuDept)
   {
     this.vuDept = (vuDept == null ? null : vuDept.trim());
   }
 
   public String getVuStatus()
   {
     return this.vuStatus;
   }
 
   public void setVuStatus(String vuStatus)
   {
     this.vuStatus = (vuStatus == null ? null : vuStatus.trim());
   }
 
   public String getVuDestination()
   {
     return this.vuDestination;
   }
 
   public void setVuDestination(String vuDestination)
   {
     this.vuDestination = (vuDestination == null ? null : vuDestination.trim());
   }
 
   public String getVuOperator()
   {
     return this.vuOperator;
   }
 
   public void setVuOperator(String vuOperator)
   {
     this.vuOperator = (vuOperator == null ? null : vuOperator.trim());
   }
 
   public String getVuDriver()
   {
     return this.vuDriver;
   }
 
   public void setVuDriver(String vuDriver)
   {
     this.vuDriver = (vuDriver == null ? null : vuDriver.trim());
   }
 
   public String getVuDeptName() {
     return this.vuDeptName == null ? "" : this.vuDeptName;
   }
 
   public void setVuDeptName(String vuDeptName) {
     this.vuDeptName = vuDeptName;
   }
 
   public String getSmsRemind()
   {
     return this.smsRemind;
   }
 
   public void setSmsRemind(String smsRemind)
   {
     this.smsRemind = (smsRemind == null ? null : smsRemind.trim());
   }
 
   public String getSms2Remind()
   {
     return this.sms2Remind;
   }
 
   public void setSms2Remind(String sms2Remind)
   {
     this.sms2Remind = (sms2Remind == null ? null : sms2Remind.trim());
   }
 
   public String getDeptManager()
   {
     return this.deptManager;
   }
 
   public void setDeptManager(String deptManager)
   {
     this.deptManager = (deptManager == null ? null : deptManager.trim());
   }
 
   public String getShowFlag()
   {
     return this.showFlag;
   }
 
   public void setShowFlag(String showFlag)
   {
     this.showFlag = (showFlag == null ? null : showFlag.trim());
   }
 
   public String getDmerStatus()
   {
     return this.dmerStatus;
   }
 
   public void setDmerStatus(String dmerStatus)
   {
     this.dmerStatus = (dmerStatus == null ? null : dmerStatus.trim());
   }
 
   public Integer getVuMileageTrue()
   {
     return this.vuMileageTrue;
   }
 
   public void setVuMileageTrue(Integer vuMileageTrue)
   {
     this.vuMileageTrue = vuMileageTrue;
   }
 
   public BigDecimal getVuParkingFees()
   {
     return this.vuParkingFees;
   }
 
   public void setVuParkingFees(BigDecimal vuParkingFees)
   {
     this.vuParkingFees = vuParkingFees;
   }
 
   public String getVuOperatorName() {
     return this.vuOperatorName == null ? "" : this.vuOperatorName;
   }
 
   public void setVuOperatorName(String vuOperatorName) {
     this.vuOperatorName = vuOperatorName;
   }
 
   public String getSmsRemindDriver()
   {
     return this.smsRemindDriver;
   }
 
   public void setSmsRemindDriver(String smsRemindDriver)
   {
     this.smsRemindDriver = (smsRemindDriver == null ? null : smsRemindDriver.trim());
   }
 
   public String getDeptManagerName() {
     return this.deptManagerName == null ? "" : this.deptManagerName;
   }
 
   public void setDeptManagerName(String deptManagerName) {
     this.deptManagerName = deptManagerName;
   }
 
   public String getSms2RemindDriver()
   {
     return this.sms2RemindDriver;
   }
 
   public void setSms2RemindDriver(String sms2RemindDriver)
   {
     this.sms2RemindDriver = (sms2RemindDriver == null ? null : sms2RemindDriver.trim());
   }
 
   public String getVuUserName() {
     return this.vuUserName == null ? "" : this.vuUserName;
   }
 
   public void setVuUserName(String vuUserName) {
     this.vuUserName = vuUserName;
   }
 
   public String getRemindContent()
   {
     return this.remindContent;
   }
 
   public void setRemindContent(String remindContent)
   {
     this.remindContent = (remindContent == null ? null : remindContent.trim());
   }
 
   public Integer getIsBack()
   {
     return this.isBack;
   }
 
   public void setIsBack(Integer isBack)
   {
     this.isBack = isBack;
   }
 
   public String getVuOperator1()
   {
     return this.vuOperator1;
   }
 
   public void setVuOperator1(String vuOperator1)
   {
     this.vuOperator1 = (vuOperator1 == null ? null : vuOperator1.trim());
   }
 
   public Integer getVuOperator1SmsType()
   {
     return this.vuOperator1SmsType;
   }
 
   public void setVuOperator1SmsType(Integer vuOperator1SmsType)
   {
     this.vuOperator1SmsType = vuOperator1SmsType;
   }
 }

