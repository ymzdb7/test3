package com.myoa.model.dingdingManage;

public class UserDDMap {
	private String oaUid;
	private String ddUid;

	public String getOaUid() {
		return this.oaUid;
	}

	public void setOaUid(String oaUid) {
		this.oaUid = (oaUid == null ? null : oaUid.trim());
	}

	public String getDdUid() {
		return this.ddUid;
	}

	public void setDdUid(String ddUid) {
		this.ddUid = (ddUid == null ? null : ddUid.trim());
	}
}
