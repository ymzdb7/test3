 package com.myoa.model.supervision;
 
 public class SupFeedBack
 {
   private Integer sid;
   private String userId;
   private String leaderId;
   private String managerId;
   private Integer fbId;
   private String title;
   private String content;
   private Integer level;
   private Integer supId;
   private String userName;
   private String createrId;
   private String createTime;
 
   public Integer getFbId()
   {
     return this.fbId;
   }
 
   public void setFbId(Integer fbId) {
     this.fbId = fbId;
   }
 
   public String getLeaderId() {
     return this.leaderId;
   }
 
   public String getManagerId() {
     return this.managerId;
   }
 
   public void setLeaderId(String leaderId) {
     this.leaderId = leaderId;
   }
 
   public void setManagerId(String managerId) {
     this.managerId = managerId;
   }
 
   public String getUserId() {
     return this.userId;
   }
 
   public void setUserId(String userId) {
     this.userId = userId;
   }
 
   public String getUserName()
   {
     return this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public Integer getSid()
   {
     return this.sid;
   }
 
   public void setSid(Integer sid)
   {
     this.sid = sid;
   }
 
   public String getTitle()
   {
     return this.title;
   }
 
   public void setTitle(String title)
   {
     this.title = (title == null ? null : title.trim());
   }
 
   public String getContent()
   {
     return this.content;
   }
 
   public void setContent(String content)
   {
     this.content = (content == null ? null : content.trim());
   }
 
   public Integer getLevel()
   {
     return this.level;
   }
 
   public void setLevel(Integer level)
   {
     this.level = level;
   }
 
   public Integer getSupId()
   {
     return this.supId;
   }
 
   public void setSupId(Integer supId)
   {
     this.supId = supId;
   }
 
   public String getCreaterId() {
     return this.createrId;
   }
 
   public void setCreaterId(String createrId) {
     this.createrId = createrId;
   }
 
   public void setCreateTime(String createTime) {
     this.createTime = createTime;
   }
 
   public String getCreateTime()
   {
     return this.createTime == null ? "0000-00-00" : this.createTime;
   }
 }

