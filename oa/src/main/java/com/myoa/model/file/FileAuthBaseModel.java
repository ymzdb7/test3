package com.myoa.model.file;

public class FileAuthBaseModel {
	FileAuthChildModel userId;
	FileAuthChildModel manageUser;
	FileAuthChildModel delUser;
	FileAuthChildModel downUser;
	FileAuthChildModel shareUser;
	FileAuthChildModel owner;
	FileAuthChildModel signUser;
	FileAuthChildModel review;
	FileAuthChildModel description;
	FileAuthChildModel newUser;
	Integer sortId;

	public FileAuthChildModel getUserId() {
		return this.userId;
	}

	public void setUserId(FileAuthChildModel userId) {
		this.userId = userId;
	}

	public FileAuthChildModel getManageUser() {
		return this.manageUser;
	}

	public void setManageUser(FileAuthChildModel manageUser) {
		this.manageUser = manageUser;
	}

	public FileAuthChildModel getDelUser() {
		return this.delUser;
	}

	public void setDelUser(FileAuthChildModel delUser) {
		this.delUser = delUser;
	}

	public FileAuthChildModel getDownUser() {
		return this.downUser;
	}

	public void setDownUser(FileAuthChildModel downUser) {
		this.downUser = downUser;
	}

	public FileAuthChildModel getShareUser() {
		return this.shareUser;
	}

	public void setShareUser(FileAuthChildModel shareUser) {
		this.shareUser = shareUser;
	}

	public FileAuthChildModel getOwner() {
		return this.owner;
	}

	public void setOwner(FileAuthChildModel owner) {
		this.owner = owner;
	}

	public FileAuthChildModel getSignUser() {
		return this.signUser;
	}

	public void setSignUser(FileAuthChildModel signUser) {
		this.signUser = signUser;
	}

	public FileAuthChildModel getReview() {
		return this.review;
	}

	public void setReview(FileAuthChildModel review) {
		this.review = review;
	}

	public FileAuthChildModel getDescription() {
		return this.description;
	}

	public void setDescription(FileAuthChildModel description) {
		this.description = description;
	}

	public FileAuthChildModel getNewUser() {
		return this.newUser;
	}

	public void setNewUser(FileAuthChildModel newUser) {
		this.newUser = newUser;
	}

	public Integer getSortId() {
		return this.sortId;
	}

	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	public class FileAuthGrandChildModel {
		String userStr;
		String deptStr;
		String roleStr;

		public FileAuthGrandChildModel() {
		}

		public String getUserStr() {
			return this.userStr;
		}

		public void setUserStr(String userStr) {
			this.userStr = userStr;
		}

		public String getDeptStr() {
			return this.deptStr;
		}

		public void setDeptStr(String deptStr) {
			this.deptStr = deptStr;
		}

		public String getRoleStr() {
			return this.roleStr;
		}

		public void setRoleStr(String roleStr) {
			this.roleStr = roleStr;
		}
	}

	public class FileAuthChildModel {
		String user;
		String dept;
		String role;
		FileAuthBaseModel.FileAuthGrandChildModel data;

		public FileAuthChildModel() {
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getDept() {
			return this.dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public FileAuthBaseModel.FileAuthGrandChildModel getData() {
			return this.data;
		}

		public void setData(FileAuthBaseModel.FileAuthGrandChildModel data) {
			this.data = data;
		}
	}
}
