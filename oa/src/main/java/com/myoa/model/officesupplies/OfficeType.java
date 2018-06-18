 package com.myoa.model.officesupplies;
 
 import java.util.List;
 
 public class OfficeType
 {
   private Integer id;
   private String typeName;
   private String typeOrder;
   private Integer typeParentId;
   private Integer typeDepository;
   private String typeDepositoryName;
   private List<OfficeProductsWithBLOBs> officeProductsList;
 
   public Integer getId()
   {
     return this.id;
   }
 
   public void setId(Integer id)
   {
     this.id = id;
   }
 
   public String getTypeName()
   {
     return this.typeName;
   }
 
   public void setTypeName(String typeName)
   {
     this.typeName = (typeName == null ? null : typeName.trim());
   }
 
   public String getTypeOrder()
   {
     return this.typeOrder;
   }
 
   public void setTypeOrder(String typeOrder)
   {
     this.typeOrder = (typeOrder == null ? null : typeOrder.trim());
   }
 
   public Integer getTypeParentId()
   {
     return this.typeParentId;
   }
 
   public void setTypeParentId(Integer typeParentId)
   {
     this.typeParentId = typeParentId;
   }
 
   public Integer getTypeDepository()
   {
     return this.typeDepository;
   }
 
   public void setTypeDepository(Integer typeDepository)
   {
     this.typeDepository = typeDepository;
   }
 
   public List<OfficeProductsWithBLOBs> getOfficeProductsList() {
     return this.officeProductsList;
   }
 
   public void setOfficeProductsList(List<OfficeProductsWithBLOBs> officeProductsList) {
     this.officeProductsList = officeProductsList;
   }
 
   public String getTypeDepositoryName() {
     return this.typeDepositoryName == null ? "" : this.typeDepositoryName;
   }
 
   public void setTypeDepositoryName(String typeDepositoryName) {
     this.typeDepositoryName = typeDepositoryName;
   }
 }

