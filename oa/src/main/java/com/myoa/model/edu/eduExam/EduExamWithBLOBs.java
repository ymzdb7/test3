package com.myoa.model.edu.eduExam;

public class EduExamWithBLOBs extends EduExam {
	private String gradeId;
	private String gradeName;
	private String examArrange;
	private String attachmentId;
	private String attachmentName;
	private String classId;
	private String className;
	private String examUserId;
	private String examUserName;

	public String getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = (gradeId == null ? null : gradeId.trim());
	}

	public String getGradeName() {
		return this.gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = (gradeName == null ? null : gradeName.trim());
	}

	public String getExamArrange() {
		return this.examArrange;
	}

	public void setExamArrange(String examArrange) {
		this.examArrange = (examArrange == null ? null : examArrange.trim());
	}

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = (attachmentId == null ? null : attachmentId.trim());
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = (attachmentName == null ? null : attachmentName
				.trim());
	}

	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = (classId == null ? null : classId.trim());
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = (className == null ? null : className.trim());
	}

	public String getExamUserId() {
		return this.examUserId;
	}

	public void setExamUserId(String examUserId) {
		this.examUserId = (examUserId == null ? null : examUserId.trim());
	}

	public String getExamUserName() {
		return this.examUserName;
	}

	public void setExamUserName(String examUserName) {
		this.examUserName = (examUserName == null ? null : examUserName.trim());
	}
}
