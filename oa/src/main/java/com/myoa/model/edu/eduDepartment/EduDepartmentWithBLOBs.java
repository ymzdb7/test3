package com.myoa.model.edu.eduDepartment;

import java.util.List;

public class EduDepartmentWithBLOBs extends EduDepartment {
	private String manager;
	private String assistantId;
	private String leader1;
	private String leader2;
	private String deptFunc;
	private String type;
	private List<EduDepartmentWithBLOBs> sonDep;
	private List<EduDepartmentWithBLOBs> sonUser;

	public String getManager() {
		return this.manager == null ? "" : this.manager;
	}

	public void setManager(String manager) {
		this.manager = (manager == null ? null : manager.trim());
	}

	public String getAssistantId() {
		return this.assistantId == null ? "" : this.assistantId;
	}

	public void setAssistantId(String assistantId) {
		this.assistantId = (assistantId == null ? null : assistantId.trim());
	}

	public String getLeader1() {
		return this.leader1 == null ? "" : this.leader1;
	}

	public void setLeader1(String leader1) {
		this.leader1 = (leader1 == null ? null : leader1.trim());
	}

	public String getLeader2() {
		return this.leader2 == null ? "" : this.leader2;
	}

	public void setLeader2(String leader2) {
		this.leader2 = (leader2 == null ? null : leader2.trim());
	}

	public String getDeptFunc() {
		return this.deptFunc == null ? "" : this.deptFunc;
	}

	public void setDeptFunc(String deptFunc) {
		this.deptFunc = (deptFunc == null ? null : deptFunc.trim());
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<EduDepartmentWithBLOBs> getSonDep() {
		return this.sonDep;
	}

	public void setSonDep(List<EduDepartmentWithBLOBs> sonDep) {
		this.sonDep = sonDep;
	}

	public List<EduDepartmentWithBLOBs> getSonUser() {
		return this.sonUser;
	}

	public void setSonUser(List<EduDepartmentWithBLOBs> sonUser) {
		this.sonUser = sonUser;
	}
}
