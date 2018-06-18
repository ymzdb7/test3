package com.myoa.dao.diary;

import com.myoa.model.diary.DiaryCommentModel;

import java.util.List;

public abstract interface DiaryCommentModelMapper {
	public abstract int insertDiaryComment(
			DiaryCommentModel paramDiaryCommentModel);

	public abstract List<DiaryCommentModel> getDiaryCommentByDiaId(
			String paramString);

	public abstract int delDiaryCommentByCommentId(String paramString);

	public abstract int getDiaryCommentCount(Integer paramInteger);
}
