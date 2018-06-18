package com.myoa.service.smsDelivery;

import com.myoa.model.sms2.Sms2;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface Sms2Service
{
  public abstract ToJson<Sms2> selectSms2(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, Sms2 paramSms2);

  public abstract ToJson selectSms2ById(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson insertSms2(Sms2 paramSms2);

  public abstract ToJson delSms2(Sms2 paramSms2);

  public abstract ToJson upSms2(Sms2 paramSms2);

  public abstract ToJson SendSms();
}

