 package com.myoa.model.hr;
 
 import java.util.Date;
 
 public class HrCardModule
 {
   private Integer moduleId;
   private String moduleName;
   private Date createTime;
 
   public Integer getModuleId()
   {
     return this.moduleId;
   }
 
   public void setModuleId(Integer moduleId)
   {
     this.moduleId = moduleId;
   }
 
   public String getModuleName()
   {
     return this.moduleName;
   }
 
   public void setModuleName(String moduleName)
   {
     this.moduleName = (moduleName == null ? null : moduleName.trim());
   }
 
   public Date getCreateTime()
   {
     return this.createTime;
   }
 
   public void setCreateTime(Date createTime)
   {
     this.createTime = createTime;
   }
 }
