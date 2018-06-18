 package com.myoa.service.workflow.wrapper;
 
 import java.util.List;
 
 public class JobSelectorModel
 {
   Integer sort_id;
   Integer sort_parent;
   String sort_name;
   String have_child;
   JobSelectorModel child;
   List<JobSelectorModel> childs;
 
   public String getHave_child()
   {
     return this.have_child;
   }
 
   public void setHave_child(String have_child) {
     this.have_child = have_child;
   }
 
   public List<JobSelectorModel> getChilds()
   {
     return this.childs;
   }
 
   public void setChilds(List<JobSelectorModel> childs) {
     this.childs = childs;
   }
 
   public JobSelectorModel getChild() {
     return this.child;
   }
 
   public void setChild(JobSelectorModel child) {
     this.child = child;
   }
 
   public Integer getSort_id() {
     return this.sort_id;
   }
 
   public void setSort_id(Integer sort_id) {
     this.sort_id = sort_id;
   }
 
   public Integer getSort_parent() {
     return this.sort_parent;
   }
 
   public void setSort_parent(Integer sort_parent) {
     this.sort_parent = sort_parent;
   }
 
   public String getSort_name() {
     return this.sort_name;
   }
 
   public void setSort_name(String sort_name) {
     this.sort_name = sort_name;
   }
 }

