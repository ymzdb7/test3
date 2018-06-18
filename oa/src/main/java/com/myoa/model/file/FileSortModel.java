package com.myoa.model.file;

public class FileSortModel {
	Integer sortId;
	Integer sortParent;
	String sortNo;
	String sortName;
	String sortType;
	String userId;
	String newUser;
	String managerUser;
	String delUser;
	String downUser;
	String sharUser;
	String owner;
	String signUser;
	String review;
	String descrtption;
	public int count;
	private Integer spaceLimit;
	private boolean downloadPriv;
	private boolean makePriv;
	private boolean showPriv;
	private boolean updatePriv;
	private boolean delPriv;
	String fileType;

	public Integer getSpaceLimit() {
		return this.spaceLimit;
	}

	public void setSpaceLimit(Integer spaceLimit) {
		this.spaceLimit = spaceLimit;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDescrtption() {
		return this.descrtption;
	}

	public boolean isDelPriv() {
		return this.delPriv;
	}

	public void setDelPriv(boolean delPriv) {
		this.delPriv = delPriv;
	}

	public boolean isDownloadPriv() {
		return this.downloadPriv;
	}

	public void setDownloadPriv(boolean downloadPriv) {
		this.downloadPriv = downloadPriv;
	}

	public boolean isMakePriv() {
		return this.makePriv;
	}

	public void setMakePriv(boolean makePriv) {
		this.makePriv = makePriv;
	}

	public boolean isShowPriv() {
		return this.showPriv;
	}

	public void setShowPriv(boolean showPriv) {
		this.showPriv = showPriv;
	}

	public boolean isUpdatePriv() {
		return this.updatePriv;
	}

	public void setUpdatePriv(boolean updatePriv) {
		this.updatePriv = updatePriv;
	}

	public void setDescrtption(String descrtption) {
		this.descrtption = descrtption;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Integer getSortId() {
		return this.sortId;
	}

	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	public Integer getSortParent() {
		return this.sortParent;
	}

	public void setSortParent(Integer sortParent) {
		this.sortParent = sortParent;
	}

	public String getSortNo() {
		return this.sortNo;
	}

	public void setSortNo(String sortNo) {
		this.sortNo = sortNo;
	}

	public String getSortName() {
		return this.sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortType() {
		return this.sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNewUser() {
		return this.newUser;
	}

	public void setNewUser(String newUser) {
		this.newUser = newUser;
	}

	public String getManagerUser() {
		return this.managerUser;
	}

	public void setManagerUser(String managerUser) {
		this.managerUser = managerUser;
	}

	public String getDelUser() {
		return this.delUser;
	}

	public void setDelUser(String delUser) {
		this.delUser = delUser;
	}

	public String getDownUser() {
		return this.downUser;
	}

	public void setDownUser(String downUser) {
		this.downUser = downUser;
	}

	public String getSharUser() {
		return this.sharUser;
	}

	public void setSharUser(String sharUser) {
		this.sharUser = sharUser;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSignUser() {
		return this.signUser;
	}

	public void setSignUser(String signUser) {
		this.signUser = signUser;
	}
}