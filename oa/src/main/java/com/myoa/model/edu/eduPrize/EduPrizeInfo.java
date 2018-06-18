package com.myoa.model.edu.eduPrize;

public class EduPrizeInfo {
	private Integer id;
	private Integer idNo;
	private String teacherUserId;
	private String teacherUserName;
	private Integer grade;
	private String gradeName;
	private Integer clazz;
	private String className;
	private String allName;
	private String subject;
	private String subjectName;
	private String prizeProject;
	private String time;
	private String level;
	private String levelName;
	private String remark;

	public Integer getIdNo() {
		return this.idNo;
	}

	public void setIdNo(Integer idNo) {
		this.idNo = idNo;
	}

	public String getGradeName() {
		return this.gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getAllName() {
		return this.allName;
	}

	public void setAllName(String allName) {
		this.allName = allName;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeacherUserId() {
		return this.teacherUserId;
	}

	public void setTeacherUserId(String teacherUserId) {
		this.teacherUserId = (teacherUserId == null ? null : teacherUserId
				.trim());
	}

	public String getTeacherUserName() {
		return this.teacherUserName;
	}

	public void setTeacherUserName(String teacherUserName) {
		this.teacherUserName = (teacherUserName == null ? null
				: teacherUserName.trim());
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getClazz() {
		return this.clazz;
	}

	public void setClazz(Integer clazz) {
		this.clazz = clazz;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = (subject == null ? null : subject.trim());
	}

	public String getPrizeProject() {
		return this.prizeProject;
	}

	public void setPrizeProject(String prizeProject) {
		this.prizeProject = (prizeProject == null ? null : prizeProject.trim());
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = (level == null ? null : level.trim());
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = (remark == null ? null : remark.trim());
	}
}
