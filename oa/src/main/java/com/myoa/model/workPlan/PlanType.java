 package com.myoa.model.workPlan;
 
 public class PlanType
 {
   private Integer typeId;
   private String typeName;
   private Integer typeNo;
 
   public Integer getTypeId()
   {
     return this.typeId;
   }
 
   public void setTypeId(Integer typeId)
   {
     this.typeId = typeId;
   }
 
   public String getTypeName()
   {
     return this.typeName;
   }
 
   public void setTypeName(String typeName)
   {
     this.typeName = (typeName == null ? null : typeName.trim());
   }
 
   public Integer getTypeNo()
   {
     return this.typeNo;
   }
 
   public void setTypeNo(Integer typeNo)
   {
     this.typeNo = typeNo;
   }
 }

