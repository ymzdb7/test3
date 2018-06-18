 package com.myoa.model.supervision;
 
 public class SupFeedBackReply
 {
   private Integer sid;
   private String content;
   private String userName;
   private String userId;
   private Integer fbId;
   private String createTime;
   private String createrId;
   private Integer supId;
 
   public String getUserName()
   {
     return this.userName;
   }
 
   public String getUserId() {
     return this.userId;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public void setUserId(String userId) {
     this.userId = userId;
   }
 
   public Integer getSid()
   {
     return this.sid;
   }
 
   public void setSid(Integer sid)
   {
     this.sid = sid;
   }
 
   public String getContent()
   {
     return this.content;
   }
 
   public void setContent(String content)
   {
     this.content = (content == null ? null : content.trim());
   }
 
   public Integer getFbId()
   {
     return Integer.valueOf(this.fbId == null ? 0 : this.fbId.intValue());
   }
 
   public void setFbId(Integer fbId)
   {
     this.fbId = fbId;
   }
 
   public String getCreateTime() {
     return this.createTime;
   }
 
   public String getCreaterId() {
     return this.createrId;
   }
 
   public void setCreateTime(String createTime) {
     this.createTime = createTime;
   }
 
   public void setCreaterId(String createrId) {
     this.createrId = createrId;
   }
 
   public Integer getSupId()
   {
     return this.supId;
   }
 
   public void setSupId(Integer supId)
   {
     this.supId = supId;
   }
 }
