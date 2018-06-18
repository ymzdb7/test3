 package com.myoa.model.hr;
 
 public class HrStaffLeaveWithBLOBs extends HrStaffLeave
 {
   private String quitReason;
   private String trace;
   private String remark;
   private String materialsCondition;
   private String despacho;
   private String blacklistInstructions;
 
   public String getQuitReason()
   {
     return this.quitReason;
   }
 
   public void setQuitReason(String quitReason)
   {
     this.quitReason = (quitReason == null ? null : quitReason.trim());
   }
 
   public String getTrace()
   {
     return this.trace;
   }
 
   public void setTrace(String trace)
   {
     this.trace = (trace == null ? null : trace.trim());
   }
 
   public String getRemark()
   {
     return this.remark;
   }
 
   public void setRemark(String remark)
   {
     this.remark = (remark == null ? null : remark.trim());
   }
 
   public String getMaterialsCondition()
   {
     return this.materialsCondition;
   }
 
   public void setMaterialsCondition(String materialsCondition)
   {
     this.materialsCondition = (materialsCondition == null ? null : materialsCondition.trim());
   }
 
   public String getDespacho()
   {
     return this.despacho;
   }
 
   public void setDespacho(String despacho)
   {
     this.despacho = (despacho == null ? null : despacho.trim());
   }
 
   public String getBlacklistInstructions()
   {
     return this.blacklistInstructions;
   }
 
   public void setBlacklistInstructions(String blacklistInstructions)
   {
     this.blacklistInstructions = (blacklistInstructions == null ? null : blacklistInstructions.trim());
   }
 }

