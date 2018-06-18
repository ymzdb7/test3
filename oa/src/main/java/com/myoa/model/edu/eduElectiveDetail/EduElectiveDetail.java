package com.myoa.model.edu.eduElectiveDetail;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.math.BigDecimal;

@TableName("edu_elective_detail")
public class EduElectiveDetail extends Model<EduElectiveDetail> {
	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	private Integer nid;
	private String courseName;
	private String place;

	@TableField("class_time")
	private String classTime;

	@TableField("class_over")
	private String classOver;
	private Integer score;

	@TableField("class_hour")
	private Integer classHour;

	@TableField("exam_type")
	private String examType;

	@TableField("counseling_teachers")
	private String counselingTeachers;
	private BigDecimal tuition;

	@TableField("material_cost")
	private BigDecimal materialCost;
	private Integer maxpeople;
	private Integer minpeople;

	@TableField("teacherin_id")
	private String teacherinId;

	@TableField("teacherin_name")
	private String teacherinName;
	private String teacherout;

	@TableField("course_content")
	private String courseContent;

	@TableField("meaning_characteristics")
	private String meaningCharacteristics;
	private String remarks;
	private Integer sid;
	private Integer counts;

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getClassTime() {
		return this.classTime;
	}

	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}

	public String getClassOver() {
		return this.classOver;
	}

	public void setClassOver(String classOver) {
		this.classOver = classOver;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getClassHour() {
		return this.classHour;
	}

	public void setClassHour(Integer classHour) {
		this.classHour = classHour;
	}

	public String getExamType() {
		return this.examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getCounselingTeachers() {
		return this.counselingTeachers;
	}

	public void setCounselingTeachers(String counselingTeachers) {
		this.counselingTeachers = counselingTeachers;
	}

	public BigDecimal getTuition() {
		return this.tuition;
	}

	public void setTuition(BigDecimal tuition) {
		this.tuition = tuition;
	}

	public BigDecimal getMaterialCost() {
		return this.materialCost;
	}

	public void setMaterialCost(BigDecimal materialCost) {
		this.materialCost = materialCost;
	}

	public Integer getMaxpeople() {
		return this.maxpeople;
	}

	public void setMaxpeople(Integer maxpeople) {
		this.maxpeople = maxpeople;
	}

	public Integer getMinpeople() {
		return this.minpeople;
	}

	public void setMinpeople(Integer minpeople) {
		this.minpeople = minpeople;
	}

	public String getTeacherinId() {
		return this.teacherinId;
	}

	public void setTeacherinId(String teacherinId) {
		this.teacherinId = teacherinId;
	}

	public String getTeacherinName() {
		return this.teacherinName;
	}

	public void setTeacherinName(String teacherinName) {
		this.teacherinName = teacherinName;
	}

	public String getTeacherout() {
		return this.teacherout;
	}

	public void setTeacherout(String teacherout) {
		this.teacherout = teacherout;
	}

	public String getCourseContent() {
		return this.courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}

	public String getMeaningCharacteristics() {
		return this.meaningCharacteristics;
	}

	public void setMeaningCharacteristics(String meaningCharacteristics) {
		this.meaningCharacteristics = meaningCharacteristics;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getCounts() {
		return this.counts;
	}

	public void setCounts(Integer counts) {
		this.counts = counts;
	}

	protected Serializable pkVal() {
		return this.id;
	}

	public String toString() {
		return "EduElectiveDetail{id=" + this.id + ", nid=" + this.nid
				+ ", place=" + this.place + ", classTime=" + this.classTime
				+ ", classOver=" + this.classOver + ", score=" + this.score
				+ ", classHour=" + this.classHour + ", examType="
				+ this.examType + ", counselingTeachers="
				+ this.counselingTeachers + ", tuition=" + this.tuition
				+ ", materialCost=" + this.materialCost + ", maxpeople="
				+ this.maxpeople + ", minpeople=" + this.minpeople
				+ ", teacherinId=" + this.teacherinId + ", teacherinName="
				+ this.teacherinName + ", teacherout=" + this.teacherout
				+ ", courseContent=" + this.courseContent
				+ ", meaningCharacteristics=" + this.meaningCharacteristics
				+ ", remarks=" + this.remarks + ", sid=" + this.sid
				+ ", counts=" + this.counts + "}";
	}
}
