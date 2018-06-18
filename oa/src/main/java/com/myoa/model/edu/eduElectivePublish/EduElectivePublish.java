package com.myoa.model.edu.eduElectivePublish;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

@TableName("edu_elective_publish")
public class EduElectivePublish extends Model<EduElectivePublish> {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nid;
	private String courseName;

	@TableField("elective_course")
	private String electiveCourse;

	@TableField("class_ids")
	private String classIds;

	@TableField("class_names")
	private String classNames;
	private String term;
	private String year;
	private String yearName;

	@TableField("max_class")
	private Integer maxClass;

	@TableField("start_time")
	private String startTime;

	@TableField("end_time")
	private String endTime;

	@TableField("CREATE_USER")
	private String createUser;

	@TableField("ATTACHMENT_ID")
	private String attachmentId;

	@TableField("ATTACHMENT_NAME")
	private String attachmentName;

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getYearName() {
		return this.yearName;
	}

	public void setYearName(String yearName) {
		this.yearName = yearName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNid() {
		return this.nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getElectiveCourse() {
		return this.electiveCourse == null ? "" : this.electiveCourse;
	}

	public void setElectiveCourse(String electiveCourse) {
		this.electiveCourse = electiveCourse;
	}

	public String getClassIds() {
		return this.classIds;
	}

	public void setClassIds(String classIds) {
		this.classIds = classIds;
	}

	public String getClassNames() {
		return this.classNames;
	}

	public void setClassNames(String classNames) {
		this.classNames = classNames;
	}

	public String getTerm() {
		return this.term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getYear() {
		return this.year == null ? "" : this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getMaxClass() {
		return this.maxClass;
	}

	public void setMaxClass(Integer maxClass) {
		this.maxClass = maxClass;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	protected Serializable pkVal() {
		return this.id;
	}

	public String toString() {
		return "EduElectivePublish{id=" + this.id + ", nid=" + this.nid
				+ ", electiveCourse=" + this.electiveCourse + ", classIds="
				+ this.classIds + ", classNames=" + this.classNames + ", term="
				+ this.term + ", year=" + this.year + ", maxClass="
				+ this.maxClass + ", startTime=" + this.startTime
				+ ", endTime=" + this.endTime + ", createUser="
				+ this.createUser + ", attachmentId=" + this.attachmentId
				+ ", attachmentName=" + this.attachmentName + "}";
	}
}
