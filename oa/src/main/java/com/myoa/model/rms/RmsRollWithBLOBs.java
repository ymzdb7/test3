 package com.myoa.model.rms;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 import org.springframework.format.annotation.DateTimeFormat;
 
 public class RmsRollWithBLOBs extends RmsRoll
 {
   private String manageUser;
   private String readUser;
   private String deadBeginDate;
   private String deadEndDate;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date beginDate2;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date EndDate2;
   private String certificateStart2;
   private String certificateEnd2;
   private String rollPage2;
   private String deptName;
   private String managerName;
 
   public String getManagerName()
   {
     return this.managerName;
   }
 
   public void setManagerName(String managerName) {
     this.managerName = managerName;
   }
 
   public String getDeptName() {
     return this.deptName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public String getRollPage2() {
     return this.rollPage2;
   }
 
   public void setRollPage2(String rollPage2) {
     this.rollPage2 = rollPage2;
   }
 
   public String getCertificateStart2() {
     return this.certificateStart2;
   }
 
   public void setCertificateStart2(String certificateStart2) {
     this.certificateStart2 = certificateStart2;
   }
 
   public String getCertificateEnd2() {
     return this.certificateEnd2;
   }
 
   public void setCertificateEnd2(String certificateEnd2) {
     this.certificateEnd2 = certificateEnd2;
   }
 
   public String getDeadBeginDate() {
     return this.deadBeginDate;
   }
 
   public void setDeadBeginDate(String deadBeginDate) {
     this.deadBeginDate = deadBeginDate;
   }
 
   public String getDeadEndDate() {
     return this.deadEndDate;
   }
 
   public void setDeadEndDate(String deadEndDate) {
     this.deadEndDate = deadEndDate;
   }
 
   public Date getBeginDate2() {
     return this.beginDate2;
   }
 
   public void setBeginDate2(Date beginDate2) {
     this.beginDate2 = beginDate2;
   }
 
   public Date getEndDate2() {
     return this.EndDate2;
   }
 
   public void setEndDate2(Date endDate2) {
     this.EndDate2 = endDate2;
   }
 
   public String getManageUser() {
     return this.manageUser;
   }
 
   public void setManageUser(String manageUser) {
     this.manageUser = (manageUser == null ? null : manageUser.trim());
   }
 
   public String getReadUser() {
     return this.readUser;
   }
 
   public void setReadUser(String readUser) {
     this.readUser = (readUser == null ? null : readUser.trim());
   }
 }
