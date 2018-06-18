package com.myoa.dao.diary;

import com.myoa.model.diary.DiaryModel;

import java.util.List;
import java.util.Map;

public abstract interface DiaryModelMapper {
	public abstract List<DiaryModel> getDiarySelf(Map<String, Object> paramMap);

	public abstract List<DiaryModel> getDiaryList(Map<String, Object> paramMap);

	public abstract List<DiaryModel> getDiaryOtherList(
			Map<String, Object> paramMap);

	public abstract DiaryModel getDiaryByDiaId(DiaryModel paramDiaryModel);

	public abstract int updateDiary(DiaryModel paramDiaryModel);

	public abstract int saveDiary(DiaryModel paramDiaryModel);

	public abstract int updateReadersByDiaId(DiaryModel paramDiaryModel);

	public abstract int deletDiaById(DiaryModel paramDiaryModel);

	public abstract int getCountSelf(Map<String, Object> paramMap);

	public abstract List<DiaryModel> getCountOther(Map<String, Object> paramMap);

	public abstract List<String> getDeptUserId(Map<String, Object> paramMap);

	public abstract List<String> getUserIdByPriv(List<String> paramList);

	public abstract List<DiaryModel> diarySelectFour(
			Map<String, Object> paramMap);

	public abstract List<DiaryModel> diarySelectThree(
			Map<String, Object> paramMap);

	public abstract List<DiaryModel> diarySelectTwo(Map<String, Object> paramMap);

	public abstract List<DiaryModel> diarySelectOne(Map<String, Object> paramMap);

	public abstract List<DiaryModel> diarySelectFive(
			Map<String, Object> paramMap);

	public abstract List<String> selectName(List<String> paramList);

	public abstract DiaryModel getReadUsers(Integer paramInteger);
}