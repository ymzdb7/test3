 package com.myoa.model.hr;
 
 public class HrCode
 {
   private Integer codeId;
   private String codeNo;
   private String codeOrder;
   private String parentNo;
   private String codeFlag;
   private String codeName;
 
   public Integer getCodeId()
   {
     return this.codeId;
   }
 
   public void setCodeId(Integer codeId)
   {
     this.codeId = codeId;
   }
 
   public String getCodeNo()
   {
     return this.codeNo;
   }
 
   public void setCodeNo(String codeNo)
   {
     this.codeNo = (codeNo == null ? null : codeNo.trim());
   }
 
   public String getCodeOrder()
   {
     return this.codeOrder;
   }
 
   public void setCodeOrder(String codeOrder)
   {
     this.codeOrder = (codeOrder == null ? null : codeOrder.trim());
   }
 
   public String getParentNo()
   {
     return this.parentNo;
   }
 
   public void setParentNo(String parentNo)
   {
     this.parentNo = (parentNo == null ? null : parentNo.trim());
   }
 
   public String getCodeFlag()
   {
     return this.codeFlag;
   }
 
   public void setCodeFlag(String codeFlag)
   {
     this.codeFlag = (codeFlag == null ? null : codeFlag.trim());
   }
 
   public String getCodeName()
   {
     return this.codeName;
   }
 
   public void setCodeName(String codeName)
   {
     this.codeName = (codeName == null ? null : codeName.trim());
   }
 }

