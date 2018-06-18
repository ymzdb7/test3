package com.myoa.service.edu.eduExam;

import com.myoa.model.edu.eduExam.EduExamWithBLOBs;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

public abstract interface EduExamService
{
  public abstract AjaxJson getAllExam(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract AjaxJson getOneExam(Integer paramInteger);

  public abstract AjaxJson updateExam(EduExamWithBLOBs paramEduExamWithBLOBs, HttpServletRequest paramHttpServletRequest);

  public abstract AjaxJson deleteExam(Integer paramInteger);

  public abstract AjaxJson deleteManyExam(String paramString);

  public abstract AjaxJson selectEduExam(String paramString1, String paramString2, String paramString3, String paramString4, Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<EduExamWithBLOBs> importEduExam(MultipartFile paramMultipartFile, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse);

  public abstract AjaxJson editExam(EduExamWithBLOBs paramEduExamWithBLOBs, HttpServletRequest paramHttpServletRequest);
}

