 package com.myoa.model.attend;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 import org.springframework.format.annotation.DateTimeFormat;
 
 public class AttendEvection
 {
   private Integer evectionId;
   private String userId;
   private String userName;
   private String evectionDest;
 
   @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
   @JSONField(format="yyyy-MM-dd HH:mm")
   private Date evectionDate1;
 
   @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
   @JSONField(format="yyyy-MM-dd HH:mm")
   private Date evectionDate2;
   private String status;
   private String leaderId;
   private String leaderName;
   private String allow;
   private String registerIp;
 
   @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   private Date handleTime;
   private String agent;
 
   @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   private Date recordTime;
   private Integer orderNo;
   private String evecDays;
   private String reason;
   private String notReason;
   private Integer runId;
   private String tableName;
   private String beginDate;
   private String endDate;
   private String flowId;
   private String flowPrcs;
   private String prcsId;
   private String flowName;
   private String evectionTime;
   private String deptName;
 
   public String getFlowName()
   {
     return this.flowName;
   }
 
   public void setFlowName(String flowName) {
     this.flowName = flowName;
   }
 
   public String getFlowId() {
     return this.flowId;
   }
 
   public void setFlowId(String flowId) {
     this.flowId = flowId;
   }
 
   public String getFlowPrcs() {
     return this.flowPrcs;
   }
 
   public void setFlowPrcs(String flowPrcs) {
     this.flowPrcs = flowPrcs;
   }
 
   public String getPrcsId() {
     return this.prcsId;
   }
 
   public void setPrcsId(String prcsId) {
     this.prcsId = prcsId;
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
 
   public String getTableName() {
     return this.tableName;
   }
 
   public void setTableName(String tableName) {
     this.tableName = tableName;
   }
 
   public Integer getRunId() {
     return this.runId;
   }
 
   public void setRunId(Integer runId) {
     this.runId = runId;
  }

  public Integer getEvectionId() {
    return this.evectionId;
  }

  public void setEvectionId(Integer evectionId) {
    this.evectionId = evectionId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getEvectionDest() {
    return this.evectionDest;
  }

  public void setEvectionDest(String evectionDest) {
    this.evectionDest = evectionDest;
  }

  public Date getEvectionDate1() {
    return this.evectionDate1;
  }

  public void setEvectionDate1(Date evectionDate1) {
    this.evectionDate1 = evectionDate1;
  }

  public Date getEvectionDate2() {
    return this.evectionDate2;
  }

  public void setEvectionDate2(Date evectionDate2) {
    this.evectionDate2 = evectionDate2;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getLeaderId() {
    return this.leaderId == null ? "" : this.leaderId;
  }

  public void setLeaderId(String leaderId) {
    this.leaderId = leaderId;
  }

  public String getAllow() {
    return this.allow;
  }

  public void setAllow(String allow) {
    this.allow = allow;
  }

  public String getRegisterIp() {
    return this.registerIp;
  }

  public void setRegisterIp(String registerIp) {
    this.registerIp = registerIp;
  }

  public Date getHandleTime() {
    return this.handleTime;
  }

  public void setHandleTime(Date handleTime) {
    this.handleTime = handleTime;
  }

  public String getAgent() {
    return this.agent == null ? "" : this.agent;
  }

  public void setAgent(String agent) {
    this.agent = agent;
  }

  public Date getRecordTime() {
    return this.recordTime;
  }

  public void setRecordTime(Date recordTime) {
    this.recordTime = recordTime;
  }

  public Integer getOrderNo() {
    return this.orderNo;
  }

  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }

  public String getEvecDays() {
    return this.evecDays == null ? "" : this.evecDays;
  }

  public void setEvecDays(String evecDays) {
    this.evecDays = evecDays;
  }

  public String getReason() {
    return this.reason == null ? "" : this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public String getNotReason() {
    return this.notReason == null ? "" : this.notReason;
  }

  public void setNotReason(String notReason) {
    this.notReason = notReason;
  }

  public String getUserName() {
    return this.userName == null ? "" : this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
 
   public String getLeaderName() {
     return this.leaderName == null ? "" : this.leaderName;
   }
 
   public void setLeaderName(String leaderName) {
     this.leaderName = leaderName;
   }
 
   public String getEvectionTime()
   {
     return this.evectionTime;
   }
 
   public void setEvectionTime(String evectionTime) {
     this.evectionTime = evectionTime;
   }
 
   public String getDeptName()
   {
     return this.deptName == null ? "" : this.deptName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 }

