 package com.myoa.model.hierarchical;
 
 public class HierarchicalGlobal
 {
   private Integer globalId;
   private String modelId;
   private String globalPerson;
   private String globalPersonName;
   private String globalDept;
   private String globalDeptName;
   private String globalPriv;
   private String globalPrivName;
 
   public Integer getGlobalId()
   {
     return this.globalId;
   }
 
   public void setGlobalId(Integer globalId)
   {
     this.globalId = globalId;
   }
 
   public String getModelId()
   {
     return this.modelId;
   }
 
   public void setModelId(String modelId)
   {
     this.modelId = (modelId == null ? null : modelId.trim());
   }
 
   public String getGlobalPerson()
   {
     return this.globalPerson == null ? "" : this.globalPerson;
   }
 
   public void setGlobalPerson(String globalPerson)
   {
     this.globalPerson = (globalPerson == null ? null : globalPerson.trim());
   }
 
   public String getGlobalDept()
   {
     return this.globalDept == null ? "" : this.globalDept;
   }
 
   public void setGlobalDept(String globalDept)
   {
     this.globalDept = (globalDept == null ? null : globalDept.trim());
   }
 
   public String getGlobalPriv()
   {
     return this.globalPriv == null ? "" : this.globalPriv;
   }
 
   public void setGlobalPriv(String globalPriv)
   {
     this.globalPriv = (globalPriv == null ? null : globalPriv.trim());
   }
 
   public String getGlobalPersonName() {
     return this.globalPersonName == null ? "" : this.globalPersonName;
   }
 
   public void setGlobalPersonName(String globalPersonName) {
     this.globalPersonName = globalPersonName;
   }
 
   public String getGlobalDeptName() {
     return this.globalDeptName == null ? "" : this.globalDeptName;
   }
 
   public void setGlobalDeptName(String globalDeptName) {
     this.globalDeptName = globalDeptName;
   }
 
   public String getGlobalPrivName() {
     return this.globalPrivName == null ? "" : this.globalPrivName;
   }
 
   public void setGlobalPrivName(String globalPrivName) {
     this.globalPrivName = globalPrivName;
   }
 }

