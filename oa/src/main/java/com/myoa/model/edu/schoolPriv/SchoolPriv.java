package com.myoa.model.edu.schoolPriv;

public class SchoolPriv {
	private String roleManagerText;
	private String UserPrivText;
	private String flag;
	private Integer id;
	private String personUid;
	private String shcoolNum;
	private String modularId;

	public String getRoleManagerText() {
		return this.roleManagerText;
	}

	public void setRoleManagerText(String roleManagerText) {
		this.roleManagerText = roleManagerText;
	}

	public String getUserPrivText() {
		return this.UserPrivText;
	}

	public void setUserPrivText(String userPrivText) {
		this.UserPrivText = userPrivText;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonUid() {
		return this.personUid;
	}

	public void setPersonUid(String personUid) {
		this.personUid = (personUid == null ? null : personUid.trim());
	}

	public String getShcoolNum() {
		return this.shcoolNum;
	}

	public void setShcoolNum(String shcoolNum) {
		this.shcoolNum = (shcoolNum == null ? null : shcoolNum.trim());
	}

	public String getModularId() {
		return this.modularId;
	}

	public void setModularId(String modularId) {
		this.modularId = (modularId == null ? null : modularId.trim());
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
}
