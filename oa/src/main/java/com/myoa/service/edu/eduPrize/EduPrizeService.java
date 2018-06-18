package com.myoa.service.edu.eduPrize;

import com.myoa.model.edu.eduPrize.EduPrizeInfo;
import com.myoa.util.AjaxJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface EduPrizeService
{
  public abstract AjaxJson addEduPrizeInfo(EduPrizeInfo paramEduPrizeInfo);

  public abstract AjaxJson getAllEduPrizeInfo(EduPrizeInfo paramEduPrizeInfo, HttpServletRequest paramHttpServletRequest, Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean);

  public abstract AjaxJson editEduPrizeInfo(EduPrizeInfo paramEduPrizeInfo);

  public abstract AjaxJson deleteEduPrizeInfo(Integer paramInteger);

  public abstract AjaxJson getEduPrizeInfoById(Integer paramInteger);

  public abstract AjaxJson getAllSubject(HttpServletRequest paramHttpServletRequest);

  public abstract void exportExcel(EduPrizeInfo paramEduPrizeInfo, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse);
}

