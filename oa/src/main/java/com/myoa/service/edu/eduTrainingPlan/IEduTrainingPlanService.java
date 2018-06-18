package com.myoa.service.edu.eduTrainingPlan;

import com.baomidou.mybatisplus.service.IService;
import com.myoa.model.edu.eduTrainingPlan.EduTrainingPlan;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface IEduTrainingPlanService extends IService<EduTrainingPlan>
{
  public abstract ToJson<EduTrainingPlan> getHrtailDetail(Integer paramInteger);

  public abstract AjaxJson getAll(HttpServletRequest paramHttpServletRequest, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract AjaxJson editTrain(EduTrainingPlan paramEduTrainingPlan);

  public abstract AjaxJson deleteTrainObjects(String[] paramArrayOfString);

  public abstract AjaxJson deleteTrainById(String paramString);

  public abstract AjaxJson addTrain(HttpServletRequest paramHttpServletRequest, EduTrainingPlan paramEduTrainingPlan);

  public abstract AjaxJson queryTrain(Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, EduTrainingPlan paramEduTrainingPlan);

  public abstract AjaxJson getEduTrainByStatus(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract AjaxJson editEduTrainByStatus(EduTrainingPlan paramEduTrainingPlan);

  public abstract AjaxJson QueryPlan(EduTrainingPlan paramEduTrainingPlan, String paramString1, String paramString2);

  public abstract AjaxJson QueryPlanStatus(EduTrainingPlan paramEduTrainingPlan, String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest);

  public abstract AjaxJson getMinePlanByStatus(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract AjaxJson getAllPlan();

  public abstract AjaxJson getAllPlanTrue();
}

