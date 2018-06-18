 package com.myoa.model.portals;
 
 import com.myoa.model.diary.DiaryModel;
 
 public class PortalsUser
 {
   private String avatar;
   private String userName;
   private String userId;
   private Integer userPriv;
   private String userPrivName;
   private String sex;
   private String postName;
   private String jobName;
   private DiaryModel diary;
   private Integer toDoCount;
   private Integer doneCount;
 
   public Integer getUserPriv()
   {
     return this.userPriv;
   }
 
   public void setUserPriv(Integer userPriv) {
     this.userPriv = userPriv;
   }
 
   public String getUserPrivName() {
     return this.userPrivName;
   }
 
   public void setUserPrivName(String userPrivName) {
     this.userPrivName = userPrivName;
   }
 
   public String getSex() {
     return this.sex;
   }
 
   public void setSex(String sex) {
     this.sex = sex;
   }
 
   public String getPostName() {
     return this.postName;
   }
 
   public void setPostName(String postName) {
     this.postName = postName;
   }
 
   public String getJobName() {
     return this.jobName;
   }
 
   public void setJobName(String jobName) {
     this.jobName = jobName;
   }
 
   public String getAvatar() {
     return this.avatar;
   }
 
   public void setAvatar(String avatar) {
     this.avatar = avatar;
   }
 
   public String getUserName() {
     return this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public String getUserId() {
     return this.userId;
   }
 
   public void setUserId(String userId) {
     this.userId = userId;
   }
 
   public DiaryModel getDiary() {
     return this.diary;
   }
 
   public void setDiary(DiaryModel diary) {
     this.diary = diary;
   }
 
   public Integer getToDoCount() {
     return this.toDoCount;
   }
 
   public void setToDoCount(Integer toDoCount) {
     this.toDoCount = toDoCount;
   }
 
   public Integer getDoneCount() {
     return this.doneCount;
   }
 
   public void setDoneCount(Integer doneCount) {
     this.doneCount = doneCount;
   }
 }

