package com.myoa.service.workflow.flowtype;

import com.myoa.model.workflow.FlowFormType;
import com.myoa.model.workflow.TMacroCtrl;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface FlowFormTypeService
{
  public abstract ToJson<FlowFormType> qureyItemMax(Integer paramInteger);

  public abstract ToJson<TMacroCtrl> qureyCtrl(String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest, Integer paramInteger1, Integer paramInteger2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7);
}

