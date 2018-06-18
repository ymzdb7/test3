 package com.myoa.model.officesupplies;
 
 import java.util.List;
 
 public class OfficeDepositoryWithBLOBs extends OfficeDepository
 {
   private String officeTypeId;
   private String officeTypeName;
   private String deptId;
   private String deptName;
   private String manager;
   private String managerName;
   private String proKeeper;
   private String proKeeperName;
   private String returnReason;
   private List<OfficeType> officeTypeList;
 
   public String getOfficeTypeId()
   {
     return this.officeTypeId;
   }
 
   public void setOfficeTypeId(String officeTypeId)
   {
     this.officeTypeId = (officeTypeId == null ? null : officeTypeId.trim());
   }
 
   public String getDeptId()
   {
     return this.deptId;
   }
 
   public void setDeptId(String deptId)
   {
     this.deptId = (deptId == null ? null : deptId.trim());
   }
 
   public String getManager()
   {
     return this.manager;
   }
 
   public void setManager(String manager)
   {
     this.manager = (manager == null ? null : manager.trim());
   }
 
   public String getProKeeper()
   {
     return this.proKeeper;
   }
 
   public void setProKeeper(String proKeeper)
   {
     this.proKeeper = (proKeeper == null ? null : proKeeper.trim());
   }
 
   public String getReturnReason()
   {
     return this.returnReason;
   }
 
   public void setReturnReason(String returnReason)
   {
     this.returnReason = (returnReason == null ? null : returnReason.trim());
   }
 
   public String getDeptName()
   {
     return this.deptName == null ? "" : this.deptName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public String getManagerName() {
     return this.managerName == null ? "" : this.managerName;
   }
 
   public void setManagerName(String managerName) {
     this.managerName = managerName;
   }
 
   public String getProKeeperName() {
     return this.proKeeperName == null ? "" : this.proKeeperName;
   }
 
   public void setProKeeperName(String proKeeperName) {
     this.proKeeperName = proKeeperName;
   }
 
   public String getOfficeTypeName() {
     return this.officeTypeName == null ? "" : this.officeTypeName;
   }
 
   public void setOfficeTypeName(String officeTypeName) {
     this.officeTypeName = officeTypeName;
   }
 
   public List<OfficeType> getOfficeTypeList() {
     return this.officeTypeList;
   }
 
   public void setOfficeTypeList(List<OfficeType> officeTypeList) {
     this.officeTypeList = officeTypeList;
   }
 }

