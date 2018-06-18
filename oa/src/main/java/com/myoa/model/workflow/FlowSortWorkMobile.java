 package com.myoa.model.workflow;
 
 import java.util.List;
 
 public class FlowSortWorkMobile
 {
   String sortName;
   List<FlowTypeModel> flowTypes;
 
   public List<FlowTypeModel> getFlowTypes()
   {
     return this.flowTypes;
   }
 
   public void setFlowTypes(List<FlowTypeModel> flowTypes) {
     this.flowTypes = flowTypes;
   }
 
   public String getSortName()
   {
     return this.sortName;
   }
 
   public void setSortName(String sortName) {
     this.sortName = sortName;
   }
 }

