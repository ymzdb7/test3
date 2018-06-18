 package com.myoa.model.meet;
 
 public class MeetingAttendConfirm
 {
   private Integer sid;
   private Integer attendFlag;
   private String confirmTime;
   private String createTime;
   private Integer meetingId;
   private Integer readFlag;
   private String readingTime;
   private String remark;
   private Integer createUser;
   private String userPrivName;
   private String deptName;
   private String createName;
   private String attendFlagStr;
   private String readFlagStr;
   private Integer attendeeId;
   private String attendeeName;
   private String address;
   private String avatar;
 
   public String getAvatar()
   {
     return this.avatar;
   }
 
   public void setAvatar(String avatar) {
     this.avatar = avatar;
   }
 
   public String getAddress() {
     return this.address == null ? "" : this.address;
   }
 
   public void setAddress(String address) {
     this.address = address;
   }
 
   public Integer getAttendeeId() {
     return this.attendeeId;
   }
 
   public String getAttendeeName() {
     return this.attendeeName == null ? "" : this.attendeeName;
   }
 
   public void setAttendeeId(Integer attendeeId) {
     this.attendeeId = attendeeId;
   }
 
   public void setAttendeeName(String attendeeName) {
     this.attendeeName = attendeeName;
   }
 
   public Integer getSid() {
     return this.sid;
   }
 
   public Integer getAttendFlag() {
     return this.attendFlag;
   }
 
   public String getConfirmTime() {
     return this.confirmTime == null ? "" : this.confirmTime;
   }
 
   public String getCreateTime() {
     return this.createTime == null ? "" : this.createTime;
   }
 
   public Integer getMeetingId() {
     return this.meetingId;
   }
 
   public Integer getReadFlag() {
     return this.readFlag;
   }
 
   public String getReadingTime() {
     return this.readingTime == null ? "" : this.readingTime;
   }
 
   public String getRemark() {
     return this.remark == null ? "" : this.remark;
   }
 
   public Integer getCreateUser() {
     return this.createUser;
   }
 
   public void setSid(Integer sid) {
     this.sid = sid;
   }
 
   public void setAttendFlag(Integer attendFlag) {
     this.attendFlag = attendFlag;
   }
 
   public void setConfirmTime(String confirmTime) {
     this.confirmTime = confirmTime;
   }
 
   public void setCreateTime(String createTime) {
     this.createTime = createTime;
   }
 
   public void setMeetingId(Integer meetingId) {
     this.meetingId = meetingId;
   }
 
   public void setReadFlag(Integer readFlag) {
     this.readFlag = readFlag;
   }
 
   public void setReadingTime(String readingTime) {
     this.readingTime = readingTime;
   }
 
   public void setRemark(String remark) {
     this.remark = remark;
   }
 
   public void setCreateUser(Integer createUser) {
     this.createUser = createUser;
   }
 
   public String getUserPrivName() {
     return this.userPrivName == null ? "" : this.userPrivName;
   }
 
   public String getDeptName() {
     return this.deptName == null ? "" : this.deptName;
   }
 
   public String getCreateName() {
     return this.createName;
   }
 
   public String getAttendFlagStr() {
     return this.attendFlagStr == null ? "" : this.attendFlagStr;
   }
 
   public String getReadFlagStr() {
     return this.readFlagStr == null ? "" : this.readFlagStr;
   }
 
   public void setUserPrivName(String userPrivName) {
     this.userPrivName = userPrivName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public void setCreateName(String createName) {
     this.createName = createName;
   }
 
   public void setAttendFlagStr(String attendFlagStr) {
     this.attendFlagStr = attendFlagStr;
   }
 
   public void setReadFlagStr(String readFlagStr) {
     this.readFlagStr = readFlagStr;
   }
 }

