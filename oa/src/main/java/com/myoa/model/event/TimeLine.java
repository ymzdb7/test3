package com.myoa.model.event;

import com.alibaba.fastjson.annotation.JSONField;
import com.myoa.util.common.StringUtils;

import org.springframework.format.annotation.DateTimeFormat;

public class TimeLine {
	private String uuid;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd hh:mm:ss")
	private String crTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd hh:mm:ss")
	private String endTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd hh:mm:ss")
	private String startTime;
	private String title;
	private String type;
	private String updateTime;
	private Integer crUserId;
	private Integer updateUserId;
	private String tag;
	private String content;
	private String codeName;
	private Integer codeNo;
	private String viewUserId;
	private String viewUserName;
	private String viewDeptId;
	private String viewDeptName;
	private String viewRoleId;
	private String viewRoleName;
	private String postUserId;
	private String postUserName;
	private String postDeptId;
	private String postDeptName;
	private String postRoleId;
	private String postRoleName;
	private Integer userId;
	private Integer deptId;
	private Integer roleId;
	private boolean isRight = false;

	public boolean isRight() {
		return this.isRight;
	}

	public void setRight(boolean right) {
		this.isRight = right;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public Integer getDeptId() {
		return this.deptId;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setPostDeptId(String postDeptId) {
		this.postDeptId = postDeptId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getCodeName() {
		return this.codeName;
	}

	public Integer getCodeNo() {
		return this.codeNo;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public void setCodeNo(Integer codeNo) {
		this.codeNo = codeNo;
	}

	public String getViewUserId() {
		return this.viewUserId;
	}

	public String getViewUserName() {
		return this.viewUserName;
	}

	public String getViewDeptId() {
		return this.viewDeptId;
	}

	public String getViewDeptName() {
		return this.viewDeptName;
	}

	public String getViewRoleId() {
		return this.viewRoleId;
	}

	public String getViewRoleName() {
		return this.viewRoleName;
	}

	public String getPostUserId() {
		return this.postUserId;
	}

	public String getPostUserName() {
		return this.postUserName;
	}

	public String getPostDeptId() {
		return this.postDeptId;
	}

	public String getPostDeptName() {
		return this.postDeptName;
	}

	public String getPostRoleId() {
		return this.postRoleId;
	}

	public String getPostRoleName() {
		return this.postRoleName;
	}

	public void setViewUserId(String viewUserId) {
		this.viewUserId = viewUserId;
	}

	public void setViewUserName(String viewUserName) {
		this.viewUserName = viewUserName;
	}

	public void setViewDeptId(String viewDeptId) {
		this.viewDeptId = viewDeptId;
	}

	public void setViewDeptName(String viewDeptName) {
		this.viewDeptName = viewDeptName;
	}

	public void setViewRoleId(String viewRoleId) {
		this.viewRoleId = viewRoleId;
	}

	public void setViewRoleName(String viewRoleName) {
		this.viewRoleName = viewRoleName;
	}

	public void setPostUserId(String postUserId) {
		this.postUserId = postUserId;
	}

	public void setPostUserName(String postUserName) {
		this.postUserName = postUserName;
	}

	public void setPostDeptIds(String postDeptId) {
		this.postDeptId = postDeptId;
	}

	public void setPostDeptName(String postDeptName) {
		this.postDeptName = postDeptName;
	}

	public void setPostRoleId(String postRoleId) {
		this.postRoleId = postRoleId;
	}

	public void setPostRoleName(String postRoleName) {
		this.postRoleName = postRoleName;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = (uuid == null ? null : uuid.trim());
	}

	public String getCrTime() {
		if (!StringUtils.checkNull(this.crTime).booleanValue()) {
			String startTimes = this.crTime.substring(0,
					this.crTime.length() - 2);
			return startTimes;
		}
		return this.crTime;
	}

	public void setCrTime(String crTime) {
		this.crTime = crTime;
	}

	public String getEndTime() {
		if (!StringUtils.checkNull(this.endTime).booleanValue()) {
			String startTimes = this.endTime.substring(0,
					this.endTime.length() - 2);
			return startTimes;
		}
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		if (!StringUtils.checkNull(this.startTime).booleanValue()) {
			String startTimes = this.startTime.substring(0,
					this.startTime.length() - 2);
			return startTimes;
		}
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = (title == null ? null : title.trim());
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = (type == null ? null : type.trim());
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getCrUserId() {
		return this.crUserId;
	}

	public void setCrUserId(Integer crUserId) {
		this.crUserId = crUserId;
	}

	public Integer getUpdateUserId() {
		return this.updateUserId;
	}

	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = (tag == null ? null : tag.trim());
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = (content == null ? null : content.trim());
	}
}
