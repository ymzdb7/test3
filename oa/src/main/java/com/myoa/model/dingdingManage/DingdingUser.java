 package com.myoa.model.dingdingManage;
 
 import java.util.List;
 
 public class DingdingUser
 {
   private String userid;
   private String name;
   private List<Integer> department;
   private String mobile;
   private String position;
   private String email;
 
   public String getUserid()
   {
     return this.userid;
   }
 
   public void setUserid(String userid) {
     this.userid = userid;
   }
 
   public String getName() {
     return this.name;
   }
 
   public void setName(String name) {
     this.name = name;
   }
 
   public List<Integer> getDepartment() {
     return this.department;
   }
 
   public void setDepartment(List<Integer> department) {
     this.department = department;
   }
 
   public String getMobile() {
     return this.mobile;
   }
 
   public void setMobile(String mobile) {
     this.mobile = mobile;
   }
 
   public String getPosition() {
     return this.position;
   }
 
   public void setPosition(String position) {
     this.position = position;
   }
 
   public String getEmail() {
     return this.email;
   }
 
   public void setEmail(String email) {
     this.email = email;
   }
 }

