package com.myoa.model.edu.eduTerm;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class EduTerm {
	private String yearText;
	private Integer termId;
	private String termName;
	private String termCode;
	private String termYear;
	private String defaultTerm;
	private String whichTerm;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date startTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date endTime;
	private String classDay;
	private String activate;
	private String position;
	private String createUser;
	private Date createTime;
	private Date updateTime;
	private String remark1;
	private String remark2;
	private String remark;

	public String getYearText() {
		return this.yearText;
	}

	public void setYearText(String yearText) {
		this.yearText = yearText;
	}

	public Integer getTermId() {
		return this.termId;
	}

	public void setTermId(Integer termId) {
		this.termId = termId;
	}

	public String getTermName() {
		return this.termName;
	}

	public void setTermName(String termName) {
		this.termName = (termName == null ? null : termName.trim());
	}

	public String getTermCode() {
		return this.termCode;
	}

	public void setTermCode(String termCode) {
		this.termCode = (termCode == null ? null : termCode.trim());
	}

	public String getTermYear() {
		return this.termYear;
	}

	public void setTermYear(String termYear) {
		this.termYear = (termYear == null ? null : termYear.trim());
	}

	public String getDefaultTerm() {
		return this.defaultTerm;
	}

	public void setDefaultTerm(String defaultTerm) {
		this.defaultTerm = (defaultTerm == null ? null : defaultTerm.trim());
	}

	public String getWhichTerm() {
		return this.whichTerm;
	}

	public void setWhichTerm(String whichTerm) {
		this.whichTerm = (whichTerm == null ? null : whichTerm.trim());
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

	public String getClassDay() {
		return this.classDay;
	}

	public void setClassDay(String classDay) {
		this.classDay = (classDay == null ? null : classDay.trim());
	}

	public String getActivate() {
		return this.activate;
	}

	public void setActivate(String activate) {
		this.activate = (activate == null ? null : activate.trim());
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = (position == null ? null : position.trim());
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = (createUser == null ? null : createUser.trim());
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark1() {
		return this.remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = (remark1 == null ? null : remark1.trim());
	}

	public String getRemark2() {
		return this.remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = (remark2 == null ? null : remark2.trim());
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = (remark == null ? null : remark.trim());
	}
}
