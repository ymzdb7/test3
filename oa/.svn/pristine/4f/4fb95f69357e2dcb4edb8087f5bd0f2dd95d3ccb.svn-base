package com.myoa.service.sys;

import com.myoa.model.common.Syslog;
import com.myoa.util.ToJson;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public abstract interface SysLogService
{
  public abstract void getLogMessage(Map<String, Long> paramMap)
    throws ParseException;

  public abstract List<Syslog> getTenLog();

  public abstract List<Object> getEachMouthLogData(String paramString);

  public abstract List<Integer> getYear();

  public abstract Integer getMonth(String paramString);

  public abstract List<Object> getEachDayLogData(String paramString1, String paramString2);

  public abstract List<Object> getHourLog();

  public abstract List<Syslog> logManage(Integer paramInteger, String paramString1, String paramString2, String paramString3, Syslog paramSyslog)
    throws Exception;

  public abstract void deleteSyslog(Integer paramInteger, String paramString, Date paramDate1, Date paramDate2, Syslog paramSyslog);

  public abstract void deleteLogByIds(String paramString);

  public abstract void deleteAllLog();

  public abstract List<Syslog> getUserLoginLogs(HttpServletRequest paramHttpServletRequest);

  public abstract List<Syslog> getTenBatchSetLog();

  public abstract ToJson<Syslog> getModifyPwdLog(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Syslog> getPassWordErrLog(String paramString);
}

