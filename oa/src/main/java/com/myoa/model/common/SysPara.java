package com.myoa.model.common;

import com.myoa.model.edu.eduUser.EduUser;
import com.myoa.model.users.Users;

import java.util.List;

public class SysPara {
	private String paraName;
	private String paraValue;
	private String userName;
	private List<Users> usersList;
	private List<EduUser> eduUserList;
	private String userId;

	public String getParaName() {
		return this.paraName;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setParaName(String paraName) {
		this.paraName = (paraName == null ? null : paraName.trim());
	}

	public List<Users> getUsersList() {
		return this.usersList;
	}

	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}

	public String getParaValue() {
		return this.paraValue;
	}

	public void setParaValue(String paraValue) {
		this.paraValue = (paraValue == null ? null : paraValue.trim());
	}

	public String getUserName() {
		return this.userName == null ? "" : this.userName.trim();
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<EduUser> getEduUserList() {
		return this.eduUserList;
	}

	public void setEduUserList(List<EduUser> eduUserList) {
		this.eduUserList = eduUserList;
	}
}