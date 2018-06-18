package com.myoa.service.sys;

import java.text.ParseException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public abstract interface SystemInfoService
{
  public abstract Map<String, String> getSystemInfo(String paramString, Object paramObject)
    throws ParseException;

  public abstract Map<String, String> getAuthInfo(String paramString);

  public abstract Map<String, String> getAuthInfo(HttpServletRequest paramHttpServletRequest);

  public abstract boolean checkMachineCode(String paramString)
    throws Exception;

  public abstract int getAuthUser(HttpServletRequest paramHttpServletRequest);

  public abstract int getOrgManage(HttpServletRequest paramHttpServletRequest);

  public abstract Map<String, String> getEndLecDate(HttpServletRequest paramHttpServletRequest)
    throws ParseException;

  public abstract Map<String, String> getAPPMessage();

  public abstract Map<String, String> getAuthorization(HttpServletRequest paramHttpServletRequest);
}
