package com.myoa.service.received;

import com.myoa.model.sms3.Sms3;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface Sms3Service
{
  public abstract ToJson<Sms3> selectSms3(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, Sms3 paramSms3);

  public abstract ToJson selectSms3ById(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson insertSms3(Sms3 paramSms3);

  public abstract ToJson delSms3(Sms3 paramSms3);

  public abstract ToJson upSms3(Sms3 paramSms3);
}

