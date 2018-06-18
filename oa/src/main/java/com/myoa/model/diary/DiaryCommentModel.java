package com.myoa.model.diary;

import java.util.List;

public class DiaryCommentModel {
	private Integer commentId;
	private Integer diaId;
	private String userId;
	private String sendTime;
	private String commentFlag;
	private String content;
	private String attachmentId;
	private String attachmentName;
	private String userName;
	private List<DiaryCommentReplyModel> diaryCommentReplyModelList;

	public List<DiaryCommentReplyModel> getDiaryCommentReplyModelList() {
		return this.diaryCommentReplyModelList;
	}

	public void setDiaryCommentReplyModelList(
			List<DiaryCommentReplyModel> diaryCommentReplyModelList) {
		this.diaryCommentReplyModelList = diaryCommentReplyModelList;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = (content == null ? null : content.trim());
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

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getDiaId() {
		return this.diaId;
	}

	public void setDiaId(Integer diaId) {
		this.diaId = diaId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = (userId == null ? null : userId.trim());
	}

	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getCommentFlag() {
		return this.commentFlag;
	}

	public void setCommentFlag(String commentFlag) {
		this.commentFlag = (commentFlag == null ? null : commentFlag.trim());
	}
}
