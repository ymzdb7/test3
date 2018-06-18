 package com.myoa.model.workflow;
 
 public class FlowRun
 {
   private int rid;
   private int runId;
   private String runName;
   private int flowId;
   private String beginUser;
   private int beginDept;
   private String beginTime;
   private String endTime;
   private String attachmentId;
   private String attachmentName;
   private String delFlag;
   private String focusUser;
   private int parentRun;
   private String fromUser;
   private String aipFiles;
   private String preSet;
   private String viewUser;
   private int archive;
   private String forceOver;
   private int workLevel;
   private String delTime;
   private FlowTypeModel flowTypeModel;
   private String userName;
   private String uid;
 
   public String getUserName()
   {
     return this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public String getUid() {
     return this.uid;
   }
 
   public void setUid(String uid) {
     this.uid = uid;
   }
 
   public int getRid() {
     return this.rid;
   }
   public void setRid(int rid) {
     this.rid = rid;
   }
   public int getRunId() {
     return this.runId;
   }
   public void setRunId(int runId) {
     this.runId = runId;
   }
   public String getRunName() {
     return this.runName == null ? "" : this.runName;
   }
   public void setRunName(String runName) {
     this.runName = runName;
   }
   public int getFlowId() {
     return this.flowId;
   }
   public void setFlowId(int flowId) {
     this.flowId = flowId;
   }
   public String getBeginUser() {
     return this.beginUser == null ? "" : this.beginUser;
   }
   public void setBeginUser(String beginUser) {
     this.beginUser = beginUser;
   }
   public int getBeginDept() {
     return this.beginDept;
   }
   public void setBeginDept(int beginDept) {
     this.beginDept = beginDept;
   }
   public String getBeginTime() {
     return this.beginTime == null ? "" : this.beginTime;
   }
   public void setBeginTime(String beginTime) {
     this.beginTime = beginTime;
   }
   public String getEndTime() {
     return this.endTime == null ? null : this.endTime;
   }
   public void setEndTime(String endTime) {
     this.endTime = endTime;
   }
   public String getAttachmentId() {
     return this.attachmentId == null ? "" : this.attachmentId.trim();
   }
   public void setAttachmentId(String attachmentId) {
     this.attachmentId = attachmentId;
   }
   public String getAttachmentName() {
     return this.attachmentName == null ? "" : this.attachmentName.trim();
   }
   public void setAttachmentName(String attachmentName) {
     this.attachmentName = attachmentName;
   }
   public String getDelFlag() {
     return this.delFlag == null ? "" : this.delFlag;
   }
   public void setDelFlag(String delFlag) {
     this.delFlag = delFlag;
   }
   public String getFocusUser() {
     return this.focusUser == null ? "" : this.focusUser;
   }
   public void setFocusUser(String focusUser) {
     this.focusUser = focusUser;
   }
   public int getParentRun() {
     return this.parentRun;
   }
   public void setParentRun(int parentRun) {
     this.parentRun = parentRun;
   }
   public String getFromUser() {
     return this.fromUser == null ? "" : this.fromUser.trim();
   }
   public void setFromUser(String fromUser) {
     this.fromUser = fromUser;
   }
   public String getAipFiles() {
     return this.aipFiles == null ? "" : this.aipFiles;
   }
   public void setAipFiles(String aipFiles) {
     this.aipFiles = aipFiles;
   }
   public String getPreSet() {
     return this.preSet == null ? "" : this.preSet;
   }
   public void setPreSet(String preSet) {
     this.preSet = preSet;
   }
   public String getViewUser() {
     return this.viewUser == null ? "" : this.viewUser;
   }
   public void setViewUser(String viewUser) {
     this.viewUser = viewUser;
   }
   public int getArchive() {
     return this.archive;
   }
   public void setArchive(int archive) {
     this.archive = archive;
   }
   public String getForceOver() {
     return this.forceOver == null ? "" : this.forceOver;
   }
   public void setForceOver(String forceOver) {
     this.forceOver = forceOver;
   }
   public int getWorkLevel() {
     return this.workLevel;
   }
   public void setWorkLevel(int workLevel) {
     this.workLevel = workLevel;
   }
   public String getDelTime() {
     return this.delTime == null ? "" : this.delTime;
   }
   public void setDelTime(String delTime) {
     this.delTime = delTime;
   }
 
   public FlowTypeModel getFlowTypeModel() {
     return this.flowTypeModel;
   }
 
   public void setFlowTypeModel(FlowTypeModel flowTypeModel) {
     this.flowTypeModel = flowTypeModel;
   }
 
   public FlowRun() {
   }
 
   public FlowRun(int runId, String runName, int flowId, String beginUser, String beginTime, int beginDept, String delFlag) {
     this.runId = runId;
     this.runName = runName;
     this.flowId = flowId;
     this.beginUser = beginUser;
     this.beginDept = beginDept;
     this.beginTime = beginTime;
     this.endTime = this.endTime;
     this.delFlag = delFlag;
   }
 }
