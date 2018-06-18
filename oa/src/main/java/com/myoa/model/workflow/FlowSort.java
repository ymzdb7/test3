 package com.myoa.model.workflow;
 
 import java.util.List;
 
 public class FlowSort
 {
   private Integer sortId;
   private Integer sortNo;
   private String sortName;
   private Integer deptId;
   private Integer sortParent;
   private String haveChild;
   private Integer flowcounts;
   private String departName;
   private String sortMainType;
   private String sortDetailType;
   private List<FlowTypeModel> flowTypeModels;
   private List<FlowSort> childs;
 
   public String getSortMainType()
   {
     return this.sortMainType;
   }
 
   public void setSortMainType(String sortMainType) {
     this.sortMainType = sortMainType;
   }
 
   public String getSortDetailType() {
     return this.sortDetailType;
   }
 
   public void setSortDetailType(String sortDetailType) {
     this.sortDetailType = sortDetailType;
   }
 
   public List<FlowTypeModel> getFlowTypeModels()
   {
     return this.flowTypeModels;
   }
 
   public void setFlowTypeModels(List<FlowTypeModel> flowTypeModels) {
     this.flowTypeModels = flowTypeModels;
   }
 
   public String getDepartName() {
     if (this.departName == null) {
       this.departName = "全部部门";
     }
     return this.departName;
   }
   public void setDepartName(String departName) {
     this.departName = departName;
   }
 
   public Integer getFlowcounts() {
     if (this.flowcounts == null) {
       this.flowcounts = Integer.valueOf(0);
     }
     return this.flowcounts;
   }
 
   public void setFlowcounts(Integer flowcounts) {
     this.flowcounts = flowcounts;
   }
 
   public List<FlowSort> getChilds()
   {
     return this.childs;
   }
 
   public void setChilds(List<FlowSort> childs) {
     this.childs = childs;
   }
 
   public Integer getSortId() {
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
 
   public Integer getDeptId() {
     return this.deptId;
   }
 
   public void setDeptId(Integer deptId) {
     this.deptId = deptId;
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
 }

