 package com.myoa.model.meet;
 
 import com.myoa.model.enclosure.Attachment;

import java.util.List;
 
 public class Meeting
 {
   private Integer sid;
   private String createTime;
   private String endTime;
   private Integer isWriteCalednar;
   private String meetName;
   private Integer resendHour;
   private Integer resendMinute;
   private Integer resendSeveral;
   private String sms2Remind;
   private String smsRemind;
   private String startTime;
   private Integer status;
   private String statusName;
   private String subject;
   private Integer managerId;
   private String managerName;
   private Integer meetRoomId;
   private String meetRoomName;
   private Integer uid;
   private String userName;
   private Integer recorderId;
   private String recorderName;
   private String isuploadsummary;
   private String currentTime;
   private Integer pendingCount;
   private Integer approvedCount;
   private Integer processingCount;
   private Integer notApprovedCount;
   private Integer overCount;
   private String attachmentId;
   private String attachmentName;
   private String SummaryAttachmentId;
   private String SummaryAttachmentName;
   List<Attachment> attachmentList;
 
   public List<Attachment> getAttachmentList()
   {
     return this.attachmentList;
   }
 
   public void setAttachmentList(List<Attachment> attachmentList) {
     this.attachmentList = attachmentList;
   }
 
   public String getAttachmentId()
   {
     return this.attachmentId == null ? "" : this.attachmentId;
   }
 
   public void setAttachmentId(String attachmentId) {
     this.attachmentId = attachmentId;
   }
 
   public String getAttachmentName() {
     return this.attachmentName == null ? "" : this.attachmentName;
   }
 
   public void setAttachmentName(String attachmentName) {
     this.attachmentName = attachmentName;
   }
 
   public String getSummaryAttachmentId() {
     return this.SummaryAttachmentId;
   }
 
   public void setSummaryAttachmentId(String summaryAttachmentId) {
     this.SummaryAttachmentId = summaryAttachmentId;
   }
 
   public String getSummaryAttachmentName() {
     return this.SummaryAttachmentName;
   }
 
   public void setSummaryAttachmentName(String summaryAttachmentName) {
     this.SummaryAttachmentName = summaryAttachmentName;
   }
 
   public String getManagerName() {
     return this.managerName == null ? "" : this.managerName;
   }
 
   public void setManagerName(String managerName) {
     this.managerName = managerName;
   }
 
   public void setRecorderName(String recorderName) {
     this.recorderName = recorderName;
   }
 
   public String getRecorderName() {
     return this.recorderName == null ? "" : this.recorderName;
   }
 
   public String getCurrentTime() {
     return this.currentTime;
   }
 
   public void setCurrentTime(String currentTime) {
     this.currentTime = currentTime;
   }
 
   public String getStatusName() {
     return this.statusName == null ? "" : this.statusName;
   }
 
   public void setStatusName(String statusName) {
     this.statusName = statusName;
   }
 
   public String getMeetRoomName() {
     return this.meetRoomName == null ? "" : this.meetRoomName;
   }
 
   public void setMeetRoomName(String meetRoomName) {
     this.meetRoomName = meetRoomName;
   }
 
   public String getUserName() {
     return this.userName == null ? "" : this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public void setCreateTime(String createTime) {
     this.createTime = createTime;
   }
 
   public void setEndTime(String endTime) {
     this.endTime = endTime;
   }
 
   public void setStartTime(String startTime) {
     this.startTime = startTime;
   }
 
   public String getCreateTime()
   {
     return this.createTime;
   }
 
   public String getEndTime() {
     return this.endTime;
   }
 
   public String getStartTime() {
     return this.startTime;
   }
 
   public Integer getSid() {
     return this.sid;
   }
 
   public void setSid(Integer sid) {
     this.sid = sid;
   }
 
   public Integer getIsWriteCalednar() {
     return this.isWriteCalednar;
   }
 
   public void setIsWriteCalednar(Integer isWriteCalednar) {
     this.isWriteCalednar = isWriteCalednar;
   }
 
   public String getMeetName() {
     return this.meetName;
   }
 
   public void setMeetName(String meetName) {
     this.meetName = (meetName == null ? null : meetName.trim());
   }
 
   public Integer getResendHour() {
     return Integer.valueOf(this.resendHour == null ? 0 : this.resendHour.intValue());
   }
 
   public void setResendHour(Integer resendHour) {
     this.resendHour = resendHour;
   }
 
   public Integer getResendMinute() {
     return Integer.valueOf(this.resendMinute == null ? 0 : this.resendMinute.intValue());
   }
 
   public void setResendMinute(Integer resendMinute) {
     if (resendMinute == null)
       this.resendMinute = Integer.valueOf(0);
     else
       this.resendMinute = resendMinute;
   }
 
   public Integer getResendSeveral()
   {
     return Integer.valueOf(this.resendSeveral == null ? 0 : this.resendSeveral.intValue());
   }
 
   public void setResendSeveral(Integer resendSeveral) {
     if (resendSeveral == null)
       this.resendSeveral = Integer.valueOf(0);
     else
       this.resendSeveral = resendSeveral;
   }
 
   public String getSms2Remind()
   {
     return this.sms2Remind;
   }
 
   public void setSms2Remind(String sms2Remind) {
     this.sms2Remind = (sms2Remind == null ? null : sms2Remind.trim());
   }
 
   public String getSmsRemind() {
     return this.smsRemind;
   }
 
   public void setSmsRemind(String smsRemind) {
     this.smsRemind = (smsRemind == null ? null : smsRemind.trim());
   }
 
   public Integer getStatus() {
     return this.status;
   }
 
   public void setStatus(Integer status) {
     this.status = status;
   }
 
   public String getSubject() {
     return this.subject;
   }
 
   public void setSubject(String subject) {
     this.subject = (subject == null ? null : subject.trim());
   }
 
   public Integer getManagerId() {
     return this.managerId;
   }
 
   public void setManagerId(Integer managerId) {
     this.managerId = managerId;
   }
 
   public Integer getMeetRoomId() {
     return this.meetRoomId;
   }
 
   public void setMeetRoomId(Integer meetRoomId) {
     this.meetRoomId = meetRoomId;
   }
 
   public Integer getUid() {
     return this.uid;
   }
 
   public void setUid(Integer uid) {
     this.uid = uid;
   }
 
   public Integer getRecorderId() {
     return this.recorderId;
   }
 
   public void setRecorderId(Integer recorderId) {
     this.recorderId = recorderId;
   }
 
   public String getIsuploadsummary() {
     return this.isuploadsummary;
   }
 
   public void setIsuploadsummary(String isuploadsummary) {
     this.isuploadsummary = (isuploadsummary == null ? null : isuploadsummary.trim());
   }
 
   public Integer getPendingCount() {
     return this.pendingCount;
   }
 
   public Integer getApprovedCount() {
     return this.approvedCount;
   }
 
   public Integer getProcessingCount() {
     return this.processingCount;
   }
 
   public Integer getNotApprovedCount() {
     return this.notApprovedCount;
   }
 
   public Integer getOverCount() {
     return this.overCount;
   }
 
   public void setPendingCount(Integer pendingCount) {
     this.pendingCount = pendingCount;
   }
 
   public void setApprovedCount(Integer approvedCount) {
     this.approvedCount = approvedCount;
   }
 
   public void setProcessingCount(Integer processingCount) {
     this.processingCount = processingCount;
   }
 
   public void setNotApprovedCount(Integer notApprovedCount) {
     this.notApprovedCount = notApprovedCount;
   }
 
   public void setOverCount(Integer overCount) {
     this.overCount = overCount;
   }
 }

