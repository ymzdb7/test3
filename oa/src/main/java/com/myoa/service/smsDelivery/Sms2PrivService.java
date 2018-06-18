package com.myoa.service.smsDelivery;

import com.myoa.model.sms2.Sms2Priv;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface Sms2PrivService
{
  public abstract ToJson<Sms2Priv> selectSms2Priv();

  public abstract ToJson upSms2Priv(Sms2Priv paramSms2Priv);

  public abstract ToJson<Sms2Priv> selectModule();

  public abstract ToJson<Sms2Priv> selectRemindPriv();

  public abstract ToJson upRemindPriv(Sms2Priv paramSms2Priv);

  public abstract ToJson<Sms2Priv> selectSms2RemindPriv();

  public abstract ToJson upselectSms2RemindPriv(Sms2Priv paramSms2Priv);

  public abstract ToJson<Sms2Priv> selectModuleOrder();

  public abstract ToJson<Sms2Priv> selectSmsRemind();

  public abstract ToJson upSmsRemindSet(Sms2Priv paramSms2Priv);

  public abstract ToJson selectSender(String paramString);

  public abstract ToJson smsSender(StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2, Sms2Priv paramSms2Priv);

  public abstract ToJson selSenderMobile(String paramString, Sms2Priv paramSms2Priv, StringBuffer paramStringBuffer, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Sms2Priv> selOutPriv();

  public abstract ToJson upOutPriv(Sms2Priv paramSms2Priv);

  public abstract ToJson outToSelf(Sms2Priv paramSms2Priv);
}
