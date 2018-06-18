 package com.myoa.model.workflow;
 
 public class FlowRule
 {
   private Integer ruleId;
   private Integer flowId;
   private String userId;
   private String toId;
   private String beginDate;
   private String endDate;
   private String status;
   private String createTime;
   private String createUser;
   private String updateTime;
   private String updateUser;
   private String flowName;
   private String userIdName;
   private String toIdName;
 
   public String getFlowName()
   {
     return this.flowName;
   }
 
   public void setFlowName(String flowName) {
     this.flowName = flowName;
   }
 
   public String getUserIdName() {
     return this.userIdName;
   }
 
   public void setUserIdName(String userIdName) {
     this.userIdName = userIdName;
   }
 
   public String getToIdName() {
     return this.toIdName;
   }
 
   public void setToIdName(String toIdName) {
     this.toIdName = toIdName;
   }
 
   public Integer getRuleId() {
     return this.ruleId;
   }
 
   public void setRuleId(Integer ruleId) {
     this.ruleId = ruleId;
   }
 
   public Integer getFlowId() {
     return this.flowId;
   }
 
   public void setFlowId(Integer flowId) {
     this.flowId = flowId;
   }
 
   public String getUserId() {
     return this.userId == null ? "" : this.userId;
   }
 
   public void setUserId(String userId) {
     this.userId = userId;
   }
 
   public String getToId() {
     return this.toId == null ? "" : this.toId;
   }
 
   public void setToId(String toId) {
     this.toId = toId;
   }
 
   public String getBeginDate() {
     return this.beginDate;
   }
 
   public void setBeginDate(String beginDate) {
     this.beginDate = beginDate;
   }
 
   public String getEndDate() {
     return this.endDate;
   }
 
   public void setEndDate(String endDate) {
     this.endDate = endDate;
   }
 
   public String getStatus() {
     return this.status;
   }
 
   public void setStatus(String status) {
     this.status = status;
   }
 
   public String getCreateTime() {
     return this.createTime;
   }
 
   public void setCreateTime(String createTime) {
     this.createTime = createTime;
   }
 
   public String getCreateUser() {
     return this.createUser;
   }
 
   public void setCreateUser(String createUser) {
     this.createUser = createUser;
   }
 
   public String getUpdateTime() {
     return this.updateTime;
   }
 
   public void setUpdateTime(String updateTime) {
     this.updateTime = updateTime;
   }
 
   public String getUpdateUser() {
     return this.updateUser;
   }
 
   public void setUpdateUser(String updateUser) {
     this.updateUser = updateUser;
   }
 }

