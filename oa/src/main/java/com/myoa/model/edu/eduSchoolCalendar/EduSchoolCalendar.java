package com.myoa.model.edu.eduSchoolCalendar;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class EduSchoolCalendar {
	private Integer id;
	private String schoolYear;
	private String schoolTerm;
	private String gradeType;
	private Integer holidayNy;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date begenDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date endDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date createTime;
	private String createUser;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSchoolYear() {
		return this.schoolYear;
	}

	public void setSchoolYear(String schoolYear) {
		this.schoolYear = (schoolYear == null ? null : schoolYear.trim());
	}

	public String getSchoolTerm() {
		return this.schoolTerm;
	}

	public void setSchoolTerm(String schoolTerm) {
		this.schoolTerm = (schoolTerm == null ? null : schoolTerm.trim());
	}

	public String getGradeType() {
		return this.gradeType;
	}

	public void setGradeType(String gradeType) {
		this.gradeType = (gradeType == null ? null : gradeType.trim());
	}

	public Integer getHolidayNy() {
		return this.holidayNy;
	}

	public void setHolidayNy(Integer holidayNy) {
		this.holidayNy = holidayNy;
	}

	public Date getBegenDate() {
		return this.begenDate;
	}

	public void setBegenDate(Date begenDate) {
		this.begenDate = begenDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = (createUser == null ? null : createUser.trim());
	}
}
