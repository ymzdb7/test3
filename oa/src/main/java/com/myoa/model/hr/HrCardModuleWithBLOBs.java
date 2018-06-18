 package com.myoa.model.hr;
 
 public class HrCardModuleWithBLOBs extends HrCardModule
 {
   private String attach;
   private String suitUsers;
   private String greeting;
 
   public String getAttach()
   {
     return this.attach;
   }
 
   public void setAttach(String attach)
   {
     this.attach = (attach == null ? null : attach.trim());
   }
 
   public String getSuitUsers()
   {
     return this.suitUsers;
   }
 
   public void setSuitUsers(String suitUsers)
   {
     this.suitUsers = (suitUsers == null ? null : suitUsers.trim());
   }
 
   public String getGreeting()
   {
     return this.greeting;
   }
 
   public void setGreeting(String greeting)
   {
     this.greeting = (greeting == null ? null : greeting.trim());
   }
 }

