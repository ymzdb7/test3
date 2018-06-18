package com.myoa.service.diary;

import com.myoa.model.diary.DiaryCommentModel;
import com.myoa.model.diary.DiaryCommentReplyModel;
import com.myoa.model.diary.DiaryModel;
import com.myoa.model.enclosure.Attachment;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

import java.util.Map;
import java.util.zip.DataFormatException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface DiaryService
{
  public abstract int saveDiary(DiaryModel paramDiaryModel)
    throws DataFormatException;

  public abstract int updateDiary(DiaryModel paramDiaryModel);

  public abstract ToJson<DiaryModel> getDiaryIndex(DiaryModel paramDiaryModel, PageParams paramPageParams, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<DiaryModel> getDiaryAll(DiaryModel paramDiaryModel, PageParams paramPageParams, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<DiaryModel> getDiaryOther(DiaryModel paramDiaryModel, PageParams paramPageParams, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Attachment> getDiaryByDiaId(DiaryModel paramDiaryModel, String paramString);

  public abstract int deletDiaById(DiaryModel paramDiaryModel);

  public abstract ToJson<DiaryModel> diarySelect(Map<String, String> paramMap, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<DiaryCommentModel> insertDiaryComment(DiaryCommentModel paramDiaryCommentModel, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<DiaryCommentModel> getDiaryCommentByDiaId(String paramString);

  public abstract ToJson<DiaryCommentReplyModel> insertCommentReply(DiaryCommentReplyModel paramDiaryCommentReplyModel, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<DiaryCommentModel> delDiaryCommentByCommentId(String paramString);

  public abstract ToJson<DiaryCommentReplyModel> delCommentReplyByReplyId(String paramString);

  public abstract ToJson<DiaryCommentModel> getDiaryCommentCount(Integer paramInteger);

  public abstract ToJson<DiaryModel> insertDiaryTop(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<DiaryModel> deleteDiaryTop(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<DiaryModel> getReadUsers(Integer paramInteger);
}


 