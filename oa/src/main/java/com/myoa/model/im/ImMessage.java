 package com.myoa.model.im;
 
 public class ImMessage
 {
   private Integer imid;
   private String fromUid;
   private String toUid;
   private String ofFrom;
   private String ofTo;
   private String thumbnailUrl;
   private String stime;
   private String atime;
   private String type;
   private String dflag;
   private String msgType;
   private String uuid;
   private String content;
   private String fileId;
   private String fileName;
   private String realUrl;
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
 
   public String getRealUrl() {
     return this.realUrl;
   }
 
   public void setRealUrl(String realUrl) {
     this.realUrl = realUrl;
   }
 
   public String getContent() {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = (content == null ? null : content.trim());
   }
 
   public String getFileId() {
     return this.fileId;
   }
 
   public void setFileId(String fileId) {
     this.fileId = (fileId == null ? null : fileId.trim());
   }
 
   public String getFileName() {
     return this.fileName;
   }
 
   public void setFileName(String fileName) {
     this.fileName = (fileName == null ? null : fileName.trim());
   }
   public Integer getImid() {
     return this.imid;
   }
 
   public void setImid(Integer imid) {
     this.imid = imid;
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
 
   public String getThumbnailUrl() {
     return this.thumbnailUrl;
   }
 
   public void setThumbnailUrl(String thumbnailUrl) {
     this.thumbnailUrl = (thumbnailUrl == null ? null : thumbnailUrl.trim());
   }
 
   public String getStime() {
     return this.stime;
   }
 
   public void setStime(String stime) {
     this.stime = (stime == null ? null : stime.trim());
   }
 
   public String getAtime() {
     return this.atime;
   }
 
   public void setAtime(String atime) {
     this.atime = atime;
   }
 
   public String getType() {
     return this.type;
   }
 
   public void setType(String type) {
     this.type = (type == null ? null : type.trim());
   }
 
   public String getDflag() {
     return this.dflag;
   }
 
   public void setDflag(String dflag) {
     this.dflag = (dflag == null ? null : dflag.trim());
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
 }

