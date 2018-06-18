package com.myoa.service.calender;

import com.myoa.model.calender.Calendar;
import com.myoa.util.ToJson;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

public abstract interface CalenderService
{
  public abstract List<Calendar> getschedule(int paramInt1, int paramInt2, String paramString);

  public abstract List<Calendar> getscheduleBycId(String paramString);

  public abstract List<Calendar> getscheduleBycId(String paramString1, String paramString2);

  public abstract void insertSelective(Calendar paramCalendar);

  public abstract void delete(int paramInt, HttpServletRequest paramHttpServletRequest);

  public abstract int update(Calendar paramCalendar);

  public abstract List<Calendar> getscheduleByDay(String paramString, int paramInt);

  public abstract List<Calendar> getAllschedule(String paramString);

  public abstract List<Calendar> getAllscheduleinfo(Integer paramInteger);

  public abstract List<Calendar> getscheduleByTakerAndOwner(String paramString1, String paramString2);

  public abstract List<Calendar> getscheduleByTakerAndOwner(String paramString);

  public abstract ToJson<Calendar> getScheduleByUserIdAndType(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Calendar> getAllScheduleByDeptIdAndDate(String paramString1, String paramString2);

  public abstract List<Calendar> rChSelect();
}

