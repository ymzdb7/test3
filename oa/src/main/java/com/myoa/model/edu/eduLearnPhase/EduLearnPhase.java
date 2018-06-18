package com.myoa.model.edu.eduLearnPhase;

import java.util.Date;

public class EduLearnPhase {
	private Integer id;
	private String name;
	private String code;
	private String leader;
	private String facultyNo;
	private String facultyName;
	private String isEnabled;
	private String posotion;
	private String remark;
	private Date createTime;
	private String createUser;
	private Date editTime;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = (name == null ? null : name.trim());
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = (code == null ? null : code.trim());
	}

	public String getLeader() {
		return this.leader;
	}

	public void setLeader(String leader) {
		this.leader = (leader == null ? null : leader.trim());
	}

	public String getFacultyNo() {
		return this.facultyNo;
	}

	public void setFacultyNo(String facultyNo) {
		this.facultyNo = (facultyNo == null ? null : facultyNo.trim());
	}

	public String getFacultyName() {
		return this.facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = (facultyName == null ? null : facultyName.trim());
	}

	public String getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = (isEnabled == null ? null : isEnabled.trim());
	}

	public String getPosotion() {
		return this.posotion;
	}

	public void setPosotion(String posotion) {
		this.posotion = (posotion == null ? null : posotion.trim());
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = (remark == null ? null : remark.trim());
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

	public Date getEditTime() {
		return this.editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}
}