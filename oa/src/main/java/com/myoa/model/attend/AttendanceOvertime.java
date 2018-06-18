package com.myoa.model.attend;

import java.util.Date;

public class AttendanceOvertime
{
  private Integer overtimeId;
  private String userId;
  private String approveId;
  private Date recordTime;
  private Date startTime;
  private Date endTime;
  private String overtimeHours;
  private Date confirmTime;
  private String allow;
  private String status;
  private String registerIp;
  private Date handleTime;
  private String agent;
  private Integer orderNo;
  private String overtimeContent;
  private String confirmView;
  private String reason;
  private Integer runId;
  private String tableName;
  private String flowId;
  private String flowPrcs;
  private String prcsId;
  private String flowName;

  public String getFlowId()
  {
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

  public String getFlowName() {
    return this.flowName;
  }

  public void setFlowName(String flowName) {
    this.flowName = flowName;
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

  public Integer getOvertimeId() {
    return this.overtimeId;
  }

  public void setOvertimeId(Integer overtimeId) {
    this.overtimeId = overtimeId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getApproveId() {
    return this.approveId == null ? "" : this.approveId;
  }

  public void setApproveId(String approveId) {
    this.approveId = approveId;
  }

  public Date getRecordTime() {
    return this.recordTime;
  }

  public void setRecordTime(Date recordTime) {
    this.recordTime = recordTime;
  }

  public Date getStartTime() {
    return this.startTime;
   }
 
   public void setStartTime(Date startTime) {
     this.startTime = startTime;
   }
 
   public Date getEndTime() {
     return this.endTime;
   }
 
   public void setEndTime(Date endTime) {
     this.endTime = endTime;
   }
 
   public String getOvertimeHours() {
     return this.overtimeHours == null ? "" : this.overtimeHours;
   }
 
   public void setOvertimeHours(String overtimeHours) {
     this.overtimeHours = overtimeHours;
   }
 
   public Date getConfirmTime() {
     return this.confirmTime;
   }
 
   public void setConfirmTime(Date confirmTime) {
     this.confirmTime = confirmTime;
   }
 
   public String getAllow() {
     return this.allow == null ? "" : this.allow;
   }
 
   public void setAllow(String allow) {
     this.allow = allow;
   }
 
   public String getStatus() {
     return this.status == null ? "" : this.status;
   }
 
   public void setStatus(String status) {
     this.status = status;
   }
 
   public String getRegisterIp() {
     return this.registerIp == null ? "" : this.registerIp;
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
 
   public Integer getOrderNo() {
     return this.orderNo;
   }
 
   public void setOrderNo(Integer orderNo) {
     this.orderNo = orderNo;
   }
 
   public String getOvertimeContent() {
     return this.overtimeContent == null ? "" : this.overtimeContent;
   }
 
   public void setOvertimeContent(String overtimeContent) {
     this.overtimeContent = overtimeContent;
   }
 
   public String getConfirmView() {
     return this.confirmView == null ? "" : this.confirmView;
   }
 
   public void setConfirmView(String confirmView) {
     this.confirmView = confirmView;
   }
 
   public String getReason() {
     return this.reason == null ? "" : this.reason;
   }
 
   public void setReason(String reason) {
     this.reason = reason;
   }
 }

