package com.myoa.model.edu.eduTrainingPlanRecord;

import java.math.BigDecimal;

public class EduTrainingRecord {
	private Integer recordId;
	private String createUserId;
	private String createUserName;
	private Integer createDeptId;
	private String createDeptName;
	private String staffUserId;
	private String staffUserName;
	private String tPlanNo;
	private String tPlanName;
	private String tInstitutionName;
	private BigDecimal trainningCost;
	private String tExamResults;
	private Integer tExamLevel;

	public Integer getRecordId() {
		return this.recordId;
	}

	public String getCreateUserName() {
		return this.createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getCreateDeptName() {
		return this.createDeptName;
	}

	public void setCreateDeptName(String createDeptName) {
		this.createDeptName = createDeptName;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public String getStaffUserName() {
		return this.staffUserName;
	}

	public void setStaffUserName(String staffUserName) {
		this.staffUserName = staffUserName;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = (createUserId == null ? null : createUserId.trim());
	}

	public Integer getCreateDeptId() {
		return this.createDeptId;
	}

	public void setCreateDeptId(Integer createDeptId) {
		this.createDeptId = createDeptId;
	}

	public String getStaffUserId() {
		return this.staffUserId;
	}

	public void setStaffUserId(String staffUserId) {
		this.staffUserId = (staffUserId == null ? null : staffUserId.trim());
	}

	public String gettPlanNo() {
		return this.tPlanNo;
	}

	public void settPlanNo(String tPlanNo) {
		this.tPlanNo = (tPlanNo == null ? null : tPlanNo.trim());
	}

	public String gettPlanName() {
		return this.tPlanName == null ? "" : this.tPlanName;
	}

	public void settPlanName(String tPlanName) {
		this.tPlanName = (tPlanName == null ? null : tPlanName.trim());
	}

	public String gettInstitutionName() {
		return this.tInstitutionName == null ? "" : this.tInstitutionName;
	}

	public void settInstitutionName(String tInstitutionName) {
		this.tInstitutionName = (tInstitutionName == null ? null
				: tInstitutionName.trim());
	}

	public BigDecimal getTrainningCost() {
		return this.trainningCost;
	}

	public void setTrainningCost(BigDecimal trainningCost) {
		this.trainningCost = trainningCost;
	}

	public String gettExamResults() {
		return this.tExamResults;
	}

	public void settExamResults(String tExamResults) {
		this.tExamResults = tExamResults;
	}

	public Integer gettExamLevel() {
		return this.tExamLevel;
	}

	public void settExamLevel(Integer tExamLevel) {
		this.tExamLevel = tExamLevel;
	}
}
