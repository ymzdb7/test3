package com.myoa.service.edu.eduSchoolCalendar;

import com.myoa.model.edu.eduSchoolCalendar.EduSchoolCalendarDescWithBLOBs;
import com.myoa.model.edu.eduSchoolCalendar.EduSchoolCalendarWithBLOBs;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface EduSchoolCalendarService
{
  public abstract ToJson<EduSchoolCalendarWithBLOBs> editSchoolCalendar(HttpServletRequest paramHttpServletRequest, EduSchoolCalendarWithBLOBs paramEduSchoolCalendarWithBLOBs);

  public abstract ToJson<EduSchoolCalendarWithBLOBs> delSchoolCalendarById(int paramInt);

  public abstract AjaxJson selSchoolCalendarByCond(EduSchoolCalendarWithBLOBs paramEduSchoolCalendarWithBLOBs);

  public abstract ToJson<EduSchoolCalendarDescWithBLOBs> editSCDesc(HttpServletRequest paramHttpServletRequest, EduSchoolCalendarDescWithBLOBs paramEduSchoolCalendarDescWithBLOBs);

  public abstract ToJson<EduSchoolCalendarDescWithBLOBs> getYearTerm();
}

