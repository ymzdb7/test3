 package com.myoa.model.dingdingManage;
 
 public class DingdingBindUser
 {
   private String userid;
   private String name;
   private boolean bind;
 
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
 
   public boolean isBind() {
     return this.bind;
   }
 
   public void setBind(boolean bind) {
     this.bind = bind;
   }
 }

