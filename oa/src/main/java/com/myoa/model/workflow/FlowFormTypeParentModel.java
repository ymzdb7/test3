 package com.myoa.model.workflow;
 
 import java.util.List;
 
 public class FlowFormTypeParentModel
 {
   String sortName;
   List<FlowFormType> form;
 
   public String getSortName()
   {
     return this.sortName;
   }
 
   public void setSortName(String sortName) {
     this.sortName = sortName;
   }
 
   public List<FlowFormType> getForm() {
     return this.form;
   }
 
   public void setForm(List<FlowFormType> form) {
     this.form = form;
   }
 }

