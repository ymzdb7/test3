package com.myoa.model.attend;

import com.alibaba.fastjson.annotation.JSONField;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class AttendLeave {
	private Integer leaveId;
	private String userId;
	private String userName;
	private String deptName;
	private String leaderId;
	private String leaderName;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date leaveDate1;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date leaveDate2;
	private BigDecimal annualLeave;
	private String status;
	private String allow;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date destroyTime;
	private String registerIp;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date recordTime;
	private String leaveType2;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date handleTime;
	private String agent;
	private Integer orderNo;
	private String leaveType;
	private String reason;
	private Integer runId;
	private String tableName;
	private String columnName;
	private String columnComment;
	private String beginDate;
	private String endDate;
	private String flowId;
	private String flowPrcs;
	private String prcsId;
	private String flowName;
	private String monthname;
	private Integer id;
	private String leaveTime;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMonthname() {
		return this.monthname;
	}

	public void setMonthname(String monthname) {
		this.monthname = monthname;
	}

	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
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

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
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

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnComment() {
		return this.columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	public Integer getLeaveId() {
		return this.leaveId;
	}

	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLeaderId() {
		return this.leaderId == null ? "" : this.leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}

	public Date getLeaveDate1() {
		return this.leaveDate1;
	}

	public void setLeaveDate1(Date leaveDate1) {
		this.leaveDate1 = leaveDate1;
	}

	public Date getLeaveDate2() {
		return this.leaveDate2;
	}

	public void setLeaveDate2(Date leaveDate2) {
		this.leaveDate2 = leaveDate2;
	}

	public BigDecimal getAnnualLeave() {
		return this.annualLeave;
	}

	public void setAnnualLeave(BigDecimal annualLeave) {
		this.annualLeave = annualLeave;
	}

	public String getStatus() {
		return this.status == null ? "" : this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAllow() {
		return this.allow == null ? "" : this.allow;
	}

	public void setAllow(String allow) {
		this.allow = allow;
	}

	public Date getDestroyTime() {
		return this.destroyTime;
	}

	public void setDestroyTime(Date destroyTime) {
		this.destroyTime = destroyTime;
	}

	public String getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public Date getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	public String getLeaveType2() {
		return this.leaveType2 == null ? "" : this.leaveType2;
	}

	public void setLeaveType2(String leaveType2) {
		this.leaveType2 = leaveType2;
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
		return Integer.valueOf(this.orderNo == null ? 0 : this.orderNo
				.intValue());
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getLeaveType() {
		return this.leaveType == null ? "" : this.leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getReason() {
		return this.reason == null ? "" : this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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

	public String getLeaveTime() {
		return this.leaveTime;
	}

	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}

	public String getDeptName() {
		return this.deptName == null ? "" : this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
