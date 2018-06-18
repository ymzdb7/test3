 package com.myoa.model.flowRunFeedback;
 
 import com.myoa.model.enclosure.Attachment;
import com.myoa.model.users.Users;

import java.util.List;
 
 public class FlowRunFeedback
 {
   private int feedId;
   private int runId;
   private int prcsId;
   private int flowPrcs;
   private String userId;
   private String content;
   private String attachmentId;
   private String attachmentName;
   private String editTime;
   private String feedFlag;
   private String signData;
   private int replyId;
   private List<Attachment> list;
   private String userName;
   private String prcsName;
   private Users users;
 
   public String getPrcsName()
   {
     return this.prcsName;
   }
 
   public void setPrcsName(String prcsName) {
     this.prcsName = prcsName;
   }
 
   public String getUserName() {
     return this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public Users getUsers()
   {
     return this.users;
   }
 
   public void setUsers(Users users) {
     this.users = users;
   }
 
   public List<Attachment> getList() {
     return this.list;
   }
 
   public void setList(List<Attachment> list) {
     this.list = list;
   }
 
   public int getFeedId() {
     return this.feedId;
   }
 
   public void setFeedId(int feedId) {
     this.feedId = feedId;
   }
 
   public int getRunId() {
     return this.runId;
   }
 
   public void setRunId(int runId) {
     this.runId = runId;
   }
 
   public int getPrcsId() {
     return this.prcsId;
   }
 
   public void setPrcsId(int prcsId) {
     this.prcsId = prcsId;
   }
 
   public int getFlowPrcs() {
     return this.flowPrcs;
   }
 
   public void setFlowPrcs(int flowPrcs) {
     this.flowPrcs = flowPrcs;
   }
 
   public String getUserId() {
     return this.userId;
   }
 
   public void setUserId(String userId) {
     this.userId = userId;
   }
 
   public String getContent() {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = content;
   }
 
   public String getAttachmentId() {
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
 
   public String getEditTime() {
     return this.editTime;
   }
 
   public void setEditTime(String editTime) {
     this.editTime = editTime;
   }
 
   public String getFeedFlag() {
     return this.feedFlag;
   }
 
   public void setFeedFlag(String feedFlag) {
     this.feedFlag = feedFlag;
   }
 
   public String getSignData() {
     return this.signData == null ? "" : this.signData;
   }
 
   public void setSignData(String signData) {
     this.signData = signData;
   }
 
   public int getReplyId() {
     return this.replyId;
   }
 
   public void setReplyId(int replyId) {
     this.replyId = replyId;
   }
 }

