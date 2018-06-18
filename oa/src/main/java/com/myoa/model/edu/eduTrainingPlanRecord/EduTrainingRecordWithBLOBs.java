package com.myoa.model.edu.eduTrainingPlanRecord;

public class EduTrainingRecordWithBLOBs extends EduTrainingRecord {
	private String dutySituation;
	private String trainningSituation;
	private String tComment;
	private String remark;
	private String attachmentId;
	private String attachmentName;

	public String getDutySituation() {
		return this.dutySituation;
	}

	public void setDutySituation(String dutySituation) {
		this.dutySituation = (dutySituation == null ? null : dutySituation
				.trim());
	}

	public String getTrainningSituation() {
		return this.trainningSituation;
	}

	public void setTrainningSituation(String trainningSituation) {
		this.trainningSituation = (trainningSituation == null ? null
				: trainningSituation.trim());
	}

	public String gettComment() {
		return this.tComment;
	}

	public void settComment(String tComment) {
		this.tComment = (tComment == null ? null : tComment.trim());
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = (remark == null ? null : remark.trim());
	}

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = (attachmentId == null ? null : attachmentId.trim());
	}

	public String getAttachmentName() {
		return this.attachmentName == null ? "" : this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = (attachmentName == null ? null : attachmentName
				.trim());
	}
}
