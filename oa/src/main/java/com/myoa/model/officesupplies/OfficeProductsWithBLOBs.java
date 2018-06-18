 package com.myoa.model.officesupplies;
 
 public class OfficeProductsWithBLOBs extends OfficeProducts
 {
   private String typeName;
   private String proDesc;
   private String proSupplier;
   private String proDept;
   private String proDeptName;
   private String proManager;
   private String proManagerName;
   private String proAuditer;
   private String proAuditerName;
   private String attachmentId;
   private String attachmentName;
 
   public String getProDesc()
   {
     return this.proDesc == null ? "" : this.proDesc;
   }
 
   public String getProDeptName()
   {
     return this.proDeptName == null ? "" : this.proDeptName;
   }
 
   public void setProDeptName(String proDeptName) {
     this.proDeptName = proDeptName;
   }
 
   public String getProManagerName() {
     return this.proManagerName == null ? "" : this.proManagerName;
   }
 
   public void setProManagerName(String proManagerName) {
     this.proManagerName = proManagerName;
   }
 
   public void setProDesc(String proDesc)
   {
     this.proDesc = (proDesc == null ? null : proDesc.trim());
   }
 
   public String getProSupplier()
   {
     return this.proSupplier == null ? "" : this.proSupplier;
   }
 
   public void setProSupplier(String proSupplier)
   {
     this.proSupplier = (proSupplier == null ? null : proSupplier.trim());
   }
 
   public String getProDept()
   {
     return this.proDept;
   }
 
   public void setProDept(String proDept)
   {
     this.proDept = (proDept == null ? null : proDept.trim());
   }
 
   public String getProManager()
   {
     return this.proManager;
   }
 
   public void setProManager(String proManager)
   {
     this.proManager = (proManager == null ? null : proManager.trim());
   }
 
   public String getProAuditer()
   {
     return this.proAuditer;
   }
 
   public void setProAuditer(String proAuditer)
   {
     this.proAuditer = (proAuditer == null ? null : proAuditer.trim());
   }
 
   public String getAttachmentId()
   {
     return this.attachmentId;
   }
 
   public void setAttachmentId(String attachmentId)
   {
     this.attachmentId = (attachmentId == null ? null : attachmentId.trim());
   }
 
   public String getAttachmentName()
   {
     return this.attachmentName;
   }
 
   public void setAttachmentName(String attachmentName)
   {
     this.attachmentName = (attachmentName == null ? null : attachmentName.trim());
   }
 
   public String getTypeName() {
     return this.typeName == null ? "" : this.typeName;
   }
 
   public void setTypeName(String typeName) {
     this.typeName = typeName;
   }
 
   public String getProAuditerName() {
     return this.proAuditerName == null ? "" : this.proAuditerName;
   }
 
   public void setProAuditerName(String proAuditerName) {
     this.proAuditerName = proAuditerName;
   }
 }

