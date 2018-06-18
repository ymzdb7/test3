package com.myoa.model.attend;

import java.util.List;

public class BaseAttend {
	private String date;
	private String week;
	private String time;
	private String phoneId;
	private String str;
	private String atime;
	private List<Attend> remark;
	private String signTime;
	private String signTimeStr;
	private String signTimeDate;
	private String signStatus;
	private String strat;
	private String end;
	private String cause;
	private String hour;

	public String getSignTime() {
		return this.signTime;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getSignTimeStr() {
		return this.signTimeStr;
	}

	public void setSignTimeStr(String signTimeStr) {
		this.signTimeStr = signTimeStr;
	}

	public String getSignTimeDate() {
		return this.signTimeDate;
	}

	public void setSignTimeDate(String signTimeDate) {
		this.signTimeDate = signTimeDate;
	}

	public String getSignStatus() {
		return this.signStatus;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public List<Attend> getRemark() {
		return this.remark;
	}

	public void setRemark(List<Attend> remark) {
		this.remark = remark;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}

	public String getStr() {
		return this.str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getAtime() {
		return this.atime;
	}

	public void setAtime(String atime) {
		this.atime = atime;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getWeek() {
		return this.week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getHour() {
		return this.hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getStrat() {
		return this.strat;
	}

	public void setStrat(String strat) {
		this.strat = strat;
	}

	public String getEnd() {
		return this.end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}
}
