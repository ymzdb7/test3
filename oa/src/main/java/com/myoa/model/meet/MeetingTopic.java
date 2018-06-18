 package com.myoa.model.meet;
 
 import java.util.Date;
 
 public class MeetingTopic
 {
   private Integer sid;
   private Date crTime;
   private Integer userId;
   private Integer meetingId;
   private String content;
 
   public Integer getSid()
   {
     return this.sid;
   }
 
   public void setSid(Integer sid)
   {
     this.sid = sid;
   }
 
   public Date getCrTime()
   {
     return this.crTime;
   }
 
   public void setCrTime(Date crTime)
   {
     this.crTime = crTime;
   }
 
   public Integer getUserId()
   {
     return this.userId;
   }
 
   public void setUserId(Integer userId)
   {
     this.userId = userId;
   }
 
   public Integer getMeetingId()
   {
     return this.meetingId;
   }
 
   public void setMeetingId(Integer meetingId)
   {
     this.meetingId = meetingId;
   }
 
   public String getContent()
   {
     return this.content;
   }
 
   public void setContent(String content)
   {
     this.content = (content == null ? null : content.trim());
   }
 }

