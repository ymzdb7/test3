package com.myoa.model.edu.eduElectiveCourse;

public class eduElectiveCourse {
	private Integer id;
	private Integer nid;
	private String courseName;
	private String courseEname;
	private String courseArea;
	private String courseAreaName;
	private String createUser;

	public String getCourseAreaName() {
		return this.courseAreaName;
	}

	public void setCourseAreaName(String courseAreaName) {
		this.courseAreaName = courseAreaName;
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

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = (courseName == null ? null : courseName.trim());
	}

	public String getCourseEname() {
		return this.courseEname;
	}

	public void setCourseEname(String courseEname) {
		this.courseEname = (courseEname == null ? null : courseEname.trim());
	}

	public String getCourseArea() {
		return this.courseArea;
	}

	public void setCourseArea(String courseArea) {
		this.courseArea = (courseArea == null ? null : courseArea.trim());
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = (createUser == null ? null : createUser.trim());
	}
}