 package com.myoa.model.officesupplies;
 
 public class OfficeTranshistoryWithBLOBs extends OfficeTranshistory
 {
   private String remark;
   private String reason;
   private String returnReason;
 
   public String getRemark()
   {
     return this.remark;
   }
 
   public void setRemark(String remark)
   {
     this.remark = (remark == null ? null : remark.trim());
   }
 
   public String getReason()
   {
     return this.reason;
   }
 
   public void setReason(String reason)
   {
     this.reason = (reason == null ? null : reason.trim());
   }
 
   public String getReturnReason()
   {
     return this.returnReason;
   }
 
   public void setReturnReason(String returnReason)
   {
     this.returnReason = (returnReason == null ? null : returnReason.trim());
   }
 }
