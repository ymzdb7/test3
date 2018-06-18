package com.myoa.dao.diary;

import com.myoa.model.diary.DiaryCommentReplyModel;

import java.util.List;

public abstract interface DiaryCommentReplyModelMapper {
	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(
			DiaryCommentReplyModel paramDiaryCommentReplyModel);

	public abstract int insertSelective(
			DiaryCommentReplyModel paramDiaryCommentReplyModel);

	public abstract DiaryCommentReplyModel selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByPrimaryKeySelective(
			DiaryCommentReplyModel paramDiaryCommentReplyModel);

	public abstract int updateByPrimaryKeyWithBLOBs(
			DiaryCommentReplyModel paramDiaryCommentReplyModel);

	public abstract int updateByPrimaryKey(
			DiaryCommentReplyModel paramDiaryCommentReplyModel);

	public abstract int insertCommentReply(
			DiaryCommentReplyModel paramDiaryCommentReplyModel);

	public abstract List<DiaryCommentReplyModel> getCommentReplyByCommentId(
			String paramString);

	public abstract int delCommentReplyByCommentId(String paramString);

	public abstract int delCommentReplyByReplyId(String paramString);
}