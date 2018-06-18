package com.myoa.model.common;

public class SecureLog {
	private Integer logId;
	private Short ruleId;
	private Integer uid;
	private Integer logTime;
	private String ip;
	private String remark;
	private Integer fromBodyId;
	private Integer toBodyId;
	private String fromTableExtends;
	private String toTableExtends;

	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public Short getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Short ruleId) {
		this.ruleId = ruleId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getLogTime() {
		return this.logTime;
	}

	public void setLogTime(Integer logTime) {
		this.logTime = logTime;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = (ip == null ? null : ip.trim());
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = (remark == null ? null : remark.trim());
	}

	public Integer getFromBodyId() {
		return this.fromBodyId;
	}

	public void setFromBodyId(Integer fromBodyId) {
		this.fromBodyId = fromBodyId;
	}

	public Integer getToBodyId() {
		return this.toBodyId;
	}

	public void setToBodyId(Integer toBodyId) {
		this.toBodyId = toBodyId;
	}

	public String getFromTableExtends() {
		return this.fromTableExtends == null ? "" : this.fromTableExtends;
	}

	public void setFromTableExtends(String fromTableExtends) {
		this.fromTableExtends = (fromTableExtends == null ? null
				: fromTableExtends.trim());
	}

	public String getToTableExtends() {
		return this.toTableExtends == null ? "" : this.toTableExtends;
	}

	public void setToTableExtends(String toTableExtends) {
		this.toTableExtends = (toTableExtends == null ? null : toTableExtends
				.trim());
	}
}
