 package com.myoa.model.sms;
 
 import com.myoa.util.DateFormat;

import java.util.List;
 
 public class SmsBody
 {
   private Integer bodyId;
   private String fromId;
   private String fromName;
   private String smsType;
   private String smsTypeName;
   private Integer sendTime;
   private String sendTimeStr;
   private String remindUrl;
   private String content;
   private String toId;
   private String toName;
   private String remindFlag;
   private String remindStr;
   private String deleteFlag;
   private String title;
   private List<Sms> smsList;
   private String isAttach;
 
   public String getTitle()
   {
     return this.title;
   }
 
   public void setTitle(String title) {
     this.title = title;
   }
 
   public String getIsAttach()
   {
     return this.isAttach == null ? "0" : this.isAttach;
   }
 
   public void setIsAttach(String isAttach) {
     this.isAttach = isAttach;
   }
 
   public SmsBody()
   {
   }
 
   public Integer getBodyId() {
     return this.bodyId;
   }
 
   public void setBodyId(Integer bodyId) {
     this.bodyId = bodyId;
   }
 
   public String getFromId() {
     return this.fromId;
   }
 
   public void setFromId(String fromId) {
     this.fromId = (fromId == null ? null : fromId.trim());
   }
 
   public String getSmsType() {
     return this.smsType;
   }
 
   public void setSmsType(String smsType) {
     this.smsType = (smsType == null ? null : smsType.trim());
   }
 
   public Integer getSendTime() {
     return this.sendTime;
   }
 
   public void setSendTime(Integer sendTime) {
     this.sendTime = sendTime;
   }
 
   public String getRemindUrl() {
     return this.remindUrl;
   }
 
   public void setRemindUrl(String remindUrl) {
     this.remindUrl = (remindUrl == null ? null : remindUrl.trim());
   }
 
   public String getContent() {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = (content == null ? null : content.trim());
   }
 
   public String getFromName() {
     return this.fromName;
   }
 
   public void setFromName(String fromName) {
     this.fromName = fromName;
   }
 
   public String getToId() {
     return this.toId;
   }
 
   public void setToId(String toId) {
     this.toId = toId;
   }
 
   public String getToName() {
     return this.toName;
   }
 
   public void setToName(String toName) {
     this.toName = toName;
   }
 
   public List<Sms> getSmsList() {
     return this.smsList;
   }
 
   public void setSmsList(List<Sms> smsList) {
     this.smsList = smsList;
   }
 
   public String getRemindFlag() {
     return this.remindFlag;
   }
 
   public void setRemindFlag(String remindFlag) {
     this.remindFlag = remindFlag;
   }
 
   public String getDeleteFlag() {
     return this.deleteFlag;
   }
 
   public void setDeleteFlag(String deleteFlag) {
     this.deleteFlag = deleteFlag;
   }
 
   public String getSmsTypeName() {
     return this.smsTypeName;
   }
 
   public void setSmsTypeName(String smsTypeName) {
     this.smsTypeName = smsTypeName;
   }
 
   public String getSendTimeStr() {
     this.sendTimeStr = DateFormat.getDateStrTime(this.sendTime);
     return this.sendTimeStr;
   }
 
   public void setSendTimeStr(String sendTimeStr) {
     this.sendTimeStr = sendTimeStr;
   }
 
   public String getRemindStr() {
     if (this.remindFlag != null) {
       return this.remindFlag.equals("0") ? "否" : "是";
     }
     return "是";
   }
 
   public void setRemindStr(String remindStr)
   {
     this.remindStr = remindStr;
   }
 
   public SmsBody(String fromId, String smsType, Integer sendTime, String remindUrl, String content) {
     this.fromId = fromId;
     this.smsType = smsType;
     this.sendTime = sendTime;
     this.remindUrl = remindUrl;
     this.content = content;
   }
 }

