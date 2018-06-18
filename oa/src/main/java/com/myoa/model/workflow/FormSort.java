 package com.myoa.model.workflow;
 
 import java.util.List;
 
 public class FormSort
 {
   private Integer sortId;
   private Integer sortNo;
   private String sortName;
   private Integer sortParent;
   private String haveChild;
   private Integer deptId;
   private Integer formcounts;
   private String departName;
   private Integer departId;
   private List<FormSort> childs;
 
   public String getDepartName()
   {
     if (this.departName == null) {
       this.departName = "全部部门";
     }
     return this.departName;
   }
 
   public void setDepartName(String departName) {
     this.departName = departName;
   }
 
   public Integer getDepartId() {
     if (this.departId == null) {
       this.departId = Integer.valueOf(0);
     }
     return this.departId;
   }
 
   public void setDepartId(Integer departId) {
     this.departId = departId;
   }
 
   public Integer getFormcounts() {
     if (this.formcounts == null) {
       this.formcounts = Integer.valueOf(0);
     }
     return this.formcounts;
   }
 
   public void setFormcounts(Integer formcounts) {
     this.formcounts = formcounts;
   }
 
   public List<FormSort> getChilds()
   {
     return this.childs;
   }
 
   public void setChilds(List<FormSort> childs) {
     this.childs = childs;
   }
 
   public Integer getSortId()
   {
     return this.sortId;
   }
 
   public void setSortId(Integer sortId) {
     this.sortId = sortId;
   }
 
   public Integer getSortNo() {
     return this.sortNo;
   }
 
   public void setSortNo(Integer sortNo) {
     this.sortNo = sortNo;
   }
 
   public String getSortName() {
     return this.sortName;
   }
 
   public void setSortName(String sortName) {
     this.sortName = sortName;
   }
 
   public Integer getSortParent() {
     return this.sortParent;
   }
 
   public void setSortParent(Integer sortParent) {
     this.sortParent = sortParent;
   }
 
   public String getHaveChild() {
     return this.haveChild;
   }
 
   public void setHaveChild(String haveChild) {
     this.haveChild = haveChild;
   }
 
   public Integer getDeptId() {
     return this.deptId;
   }
 
   public void setDeptId(Integer deptId) {
     this.deptId = deptId;
   }
 }

