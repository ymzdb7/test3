package com.myoa.service.sms;

import com.myoa.model.sms.Sms;
import com.myoa.model.sms.SmsBody;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface SmsService
{
  public abstract ToJson<SmsBody> saveSms(SmsBody paramSmsBody, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6);

  public abstract ToJson<SmsBody> getSmsBodies(HttpServletRequest paramHttpServletRequest, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3);

  public abstract ToJson<Sms> updateDeleteFlag(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2);

  public abstract ToJson<Sms> updateRemindFlag(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2);

  public abstract ToJson<Sms> deleteByRemind(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<Sms> deleteByDelFlag(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Sms> setRead(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<SmsBody> querySmsBody(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract void setRead(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract void updatequerySmsByType(String paramString1, String paramString2, String paramString3);

  public abstract void updateEndTimeList(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract void querySmsByTypeUpdateRunId(String paramString1, String paramString2);
}

