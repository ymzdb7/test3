package com.myoa.model.calender;

import java.util.Date;
import java.util.List;

public class Calendar {
	private Integer calId;
	private String userId;
	private Integer calTime;
	private Integer endTime;
	private String calType;
	private String calLevel;
	private String managerId;
	private String overStatus;
	private String beforeRemaind;
	private String beforeDay;
	private String beforeHour;
	private String beforeMin;
	private Date addTime;
	private Byte allday;
	private Byte fromModule;
	private String url;
	private Integer mId;
	private Integer resId;
	private String content;
	private String owner;
	private String taker;
	private String takeName;
	private String ownerName;
	private String calData;
	private List<CalendarAll> calMessage;
	private String stim;
	private String etim;
	private Integer deptId;
	private String deptFunc;
	private String byName;
	private Integer uId;
	private String deptName;
	private String userName;

	public Integer getuId() {
		return this.uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public void setBeforeDay(String beforeDay) {
		if ((beforeDay == null) || (beforeDay == ""))
			this.beforeDay = "0";
		else
			this.beforeDay = beforeDay;
	}

	public String getTakeName() {
		return this.takeName == null ? "" : this.takeName;
	}

	public void setTakeName(String takeName) {
		this.takeName = takeName;
	}

	public String getOwnerName() {
		return this.ownerName == null ? "" : this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setBeforeHour(String beforeHour) {
		if ((beforeHour == null) || (beforeHour == ""))
			this.beforeHour = "0";
		else
			this.beforeHour = beforeHour;
	}

	public void setBeforeMin(String beforeMin) {
		if ((beforeMin == null) || (beforeMin == ""))
			this.beforeMin = "0";
		else
			this.beforeMin = beforeMin;
	}

	public String getBeforeDay() {
		if ((this.beforeDay == null) || (this.beforeDay == "")) {
			this.beforeDay = "0";
		}
		return this.beforeDay;
	}

	public String getBeforeHour() {
		if ((this.beforeHour == null) || (this.beforeHour == "")) {
			this.beforeHour = "0";
		}
		return this.beforeHour;
	}

	public String getBeforeMin() {
		if ((this.beforeMin == null) || (this.beforeMin == "")) {
			this.beforeMin = "0";
		}
		return this.beforeMin;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getByName() {
		return this.byName;
	}

	public void setByName(String byName) {
		this.byName = byName;
	}

	public String getDeptFunc() {
		return this.deptFunc;
	}

	public void setDeptFunc(String deptFunc) {
		this.deptFunc = deptFunc;
	}

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getStim() {
		return this.stim;
	}

	public void setStim(String stim) {
		this.stim = stim;
	}

	public String getEtim() {
		return this.etim;
	}

	public void setEtim(String etim) {
		this.etim = etim;
	}

	public String getCalData() {
		return this.calData;
	}

	public void setCalData(String calData) {
		this.calData = calData;
	}

	public List<CalendarAll> getCalMessage() {
		return this.calMessage;
	}

	public void setCalMessage(List<CalendarAll> calMessage) {
		this.calMessage = calMessage;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = (content == null ? null : content.trim());
	}

	public String getOwner() {
		return this.owner == null ? "" : this.owner;
	}

	public void setOwner(String owner) {
		this.owner = (owner == null ? null : owner.trim());
	}

	public String getTaker() {
		return this.taker == null ? "" : this.taker;
	}

	public void setTaker(String taker) {
		this.taker = (taker == null ? null : taker.trim());
	}

	public Integer getCalId() {
		return this.calId;
	}

	public void setCalId(Integer calId) {
		this.calId = calId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = (userId == null ? null : userId.trim());
	}

	public Integer getCalTime() {
		return this.calTime;
	}

	public void setCalTime(Integer calTime) {
		this.calTime = calTime;
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	public String getCalType() {
		return this.calType;
	}

	public void setCalType(String calType) {
		this.calType = (calType == null ? null : calType.trim());
	}

	public String getCalLevel() {
		return this.calLevel;
	}

	public void setCalLevel(String calLevel) {
		this.calLevel = (calLevel == null ? null : calLevel.trim());
	}

	public String getManagerId() {
		return this.managerId == null ? "" : this.managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = (managerId == null ? null : managerId.trim());
	}

	public String getOverStatus() {
		return this.overStatus == null ? "" : this.overStatus;
	}

	public void setOverStatus(String overStatus) {
		this.overStatus = (overStatus == null ? null : overStatus.trim());
	}

	public String getBeforeRemaind() {
		return this.beforeRemaind;
	}

	public void setBeforeRemaind(String beforeRemaind) {
		this.beforeRemaind = (beforeRemaind == null ? null : beforeRemaind
				.trim());
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Byte getAllday() {
		return Byte.valueOf(this.allday == null ? 0 : this.allday.byteValue());
	}

	public void setAllday(Byte allday) {
		this.allday = allday;
	}

	public Byte getFromModule() {
		return Byte.valueOf(this.fromModule == null ? 0 : this.fromModule
				.byteValue());
	}

	public void setFromModule(Byte fromModule) {
		this.fromModule = fromModule;
	}

	public String getUrl() {
		return this.url == null ? "" : this.url;
	}

	public void setUrl(String url) {
		this.url = (url == null ? null : url.trim());
	}

	public Integer getmId() {
		return Integer.valueOf(this.mId == null ? 1 : this.mId.intValue());
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public Integer getResId() {
		return Integer.valueOf(this.resId == null ? 1 : this.resId.intValue());
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}
}