 package com.myoa.util;
 
 public enum ModuleEnum
 {
   EMAIL("email", 1), WORKFLOW("workflow", 2), FILEFLODER("file_folder", 3), IM("im", 26), DIARY("diary", 6), 
   NEWS("news", 5), ATTEND("attend", 37), MODULE_SUMMARY_MEET("summary_meet", 7), MODULE_MEETING("meeting", 8), 
   MODULE_HRSTAFFINFO("hr_staffinfo", 9), MODULE_HRSTAFFCONTRACT("hr_staffcontract", 10), MODULE_SEAL("seal", 11), WE_CHAT("wechat", 39), EMAIL_COUNT("emailCount", 40), 
   MODULE_ROLL_MANAGE("roll_manage", 17);
 
   private String name;
   private int index;
 
   private ModuleEnum(String name, int index) { this.name = name;
     this.index = index; }
 
   public String getName() {
     return this.name;
   }
   public void setName(String name) {
     this.name = name;
   }
   public int getIndex() {
     return this.index;
   }
   public void setIndex(int index) {
     this.index = index;
   }
 }

