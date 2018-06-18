 package com.myoa.model.email;
 
 import java.io.Serializable;
 
 public class EmailModel
   implements Serializable
 {
   private static final long serialVersionUID = 1076969159692234636L;
   private Integer emailId;
   private String toId;
   private String toName;
   private String readFlag;
   private String deleteFlag;
   private Integer boxId;
   private Integer bodyId;
   private String receipt;
   private String isF;
   private String isR;
   private String sign;
   private EmailBodyModel emailBody;
   private String userName;
   private String deptName;
   private String withdrawFlag;
 
   public String getDeptName()
   {
     return this.deptName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public String getWithdrawFlag()
   {
     return this.withdrawFlag == null ? "0" : this.withdrawFlag;
   }
 
   public void setWithdrawFlag(String withdrawFlag) {
     this.withdrawFlag = withdrawFlag;
   }
 
   public String getUserName() {
     return this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public EmailBodyModel getEmailBody()
   {
     return this.emailBody;
   }
 
   public void setEmailBody(EmailBodyModel emailBody)
   {
     this.emailBody = emailBody;
   }
 
   public Integer getEmailId()
   {
     return this.emailId;
   }
 
   public void setEmailId(Integer emailId)
   {
     this.emailId = emailId;
   }
 
   public String getToId()
   {
     return this.toId;
   }
 
   public void setToId(String toId)
   {
     this.toId = (toId == null ? null : toId.trim());
   }
 
   public String getReadFlag()
   {
     return this.readFlag == null ? "0" : this.readFlag;
   }
 
   public void setReadFlag(String readFlag)
   {
     this.readFlag = readFlag;
   }
 
   public String getDeleteFlag()
   {
     return this.deleteFlag == null ? "0" : this.deleteFlag;
   }
 
   public void setDeleteFlag(String deleteFlag)
   {
     this.deleteFlag = (deleteFlag == null ? null : deleteFlag.trim());
   }
 
   public Integer getBoxId()
   {
     return this.boxId;
   }
 
   public void setBoxId(Integer boxId)
   {
     this.boxId = boxId;
   }
 
   public Integer getBodyId()
   {
     return this.bodyId;
   }
 
   public void setBodyId(Integer bodyId)
   {
     this.bodyId = bodyId;
   }
 
   public String getReceipt()
   {
     return this.receipt == null ? "0" : this.receipt;
   }
 
   public void setReceipt(String receipt)
   {
     this.receipt = (receipt == null ? null : receipt.trim());
   }
 
   public String getIsF()
   {
     return this.isF == null ? "" : this.isF;
   }
 
   public void setIsF(String isF)
   {
     this.isF = (isF == null ? null : isF.trim());
   }
 
   public String getIsR()
   {
     return this.isR == null ? "" : this.isR;
   }
 
   public void setIsR(String isR)
   {
     this.isR = (isR == null ? null : isR.trim());
   }
 
   public String getSign()
   {
     return this.sign == null ? "0" : this.sign;
   }
 
   public void setSign(String sign)
   {
     this.sign = (sign == null ? null : sign.trim());
   }
 
   public String getToName()
   {
     return this.toName;
   }
 
   public void setToName(String toName)
   {
     this.toName = toName;
   }
 }

