package com.myoa.service.smssetting;

import com.myoa.model.smsSettings.SmsSettings;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface SmsSettingsService
{
  public abstract ToJson insertSmsSettings(SmsSettings paramSmsSettings);

  public abstract ToJson delSmsSettings(int paramInt);

  public abstract ToJson upSmsSettings(SmsSettings paramSmsSettings);

  public abstract ToJson selectSmsSettings();

  public abstract ToJson selectSmsSettingsAll();

  public abstract ToJson selectSmsSettingsById(HttpServletRequest paramHttpServletRequest, Integer paramInteger);
}

