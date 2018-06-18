package com.myoa.service.widget;

import com.myoa.model.widget.WidgetSetModel;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface WidgetService
{
  public abstract ToJson<WidgetSetModel> getWidgetToDoMsg(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<WidgetSetModel> getWeather(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<WidgetSetModel> getWidgetMsg(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<WidgetSetModel> getUserSetByUid(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<WidgetSetModel> editWidgetSetModel(HttpServletRequest paramHttpServletRequest, WidgetSetModel paramWidgetSetModel);
}
