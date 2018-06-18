 package com.myoa.model.im;
 
 public class ImChatData
 {
   private String listId;
   private String fromUid;
   private String toUid;
   private String ofFrom;
   private String ofTo;
   private String lastTime;
   private String lastAtime;
   private String lastFileId;
   private String lastFileName;
   private String lastThumbnailUrl;
   private String uidIgnore;
   private String type;
   private String msgType;
   private String uuid;
   private String lastContent;
   private String msg_free;
   private String toUserName;
   private String FromUserName;
 
   public String getToUserName()
   {
     return this.toUserName;
   }
 
   public void setToUserName(String toUserName) {
     this.toUserName = toUserName;
   }
 
   public String getFromUserName() {
     return this.FromUserName;
   }
 
   public void setFromUserName(String fromUserName) {
     this.FromUserName = fromUserName;
   }
 
   public String getMsg_free() {
     return this.msg_free == null ? "" : this.msg_free;
   }
 
   public void setMsg_free(String msg_free) {
     this.msg_free = msg_free;
   }
 
   public String getListId() {
     return this.listId;
   }
 
   public void setListId(String listId) {
     this.listId = listId;
   }
 
   public String getFromUid() {
     return this.fromUid;
   }
 
   public void setFromUid(String fromUid) {
     this.fromUid = (fromUid == null ? null : fromUid.trim());
   }
 
   public String getToUid() {
     return this.toUid;
   }
 
   public void setToUid(String toUid) {
     this.toUid = (toUid == null ? null : toUid.trim());
   }
 
   public String getOfFrom() {
     return this.ofFrom;
   }
 
   public void setOfFrom(String ofFrom) {
     this.ofFrom = (ofFrom == null ? null : ofFrom.trim());
   }
 
   public String getOfTo() {
     return this.ofTo;
   }
 
   public void setOfTo(String ofTo) {
     this.ofTo = (ofTo == null ? null : ofTo.trim());
   }
 
   public String getLastTime() {
     return this.lastTime;
   }
 
   public void setLastTime(String lastTime) {
     this.lastTime = (lastTime == null ? null : lastTime.trim());
   }
 
   public String getLastAtime() {
     return this.lastAtime;
   }
 
   public void setLastAtime(String lastAtime) {
     this.lastAtime = lastAtime;
   }
 
   public String getLastFileId() {
     return this.lastFileId;
   }
 
   public void setLastFileId(String lastFileId) {
     this.lastFileId = (lastFileId == null ? null : lastFileId.trim());
   }
 
   public String getLastFileName() {
     return this.lastFileName;
   }
 
   public void setLastFileName(String lastFileName) {
     this.lastFileName = (lastFileName == null ? null : lastFileName.trim());
   }
 
   public String getLastThumbnailUrl() {
     return this.lastThumbnailUrl;
   }
 
   public void setLastThumbnailUrl(String lastThumbnailUrl) {
     this.lastThumbnailUrl = (lastThumbnailUrl == null ? null : lastThumbnailUrl.trim());
   }
 
   public String getType() {
     return this.type;
   }
 
   public void setType(String type) {
     this.type = (type == null ? null : type.trim());
   }
 
   public String getMsgType() {
     return this.msgType;
   }
 
   public void setMsgType(String msgType) {
     this.msgType = (msgType == null ? null : msgType.trim());
   }
 
   public String getUuid() {
     return this.uuid;
   }
 
   public void setUuid(String uuid) {
     this.uuid = (uuid == null ? null : uuid.trim());
   }
 
   public String getLastContent() {
     return this.lastContent;
   }
 
   public void setLastContent(String lastContent) {
     this.lastContent = (lastContent == null ? null : lastContent.trim());
   }
 
   public String getUidIgnore() {
     return this.uidIgnore == null ? "" : this.uidIgnore;
   }
 
   public void setUidIgnore(String uidIgnore) {
     this.uidIgnore = (uidIgnore == null ? "" : uidIgnore);
   }
 }

