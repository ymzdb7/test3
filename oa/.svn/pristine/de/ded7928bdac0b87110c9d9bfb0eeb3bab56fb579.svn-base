package com.myoa.service.meeting;

import com.myoa.model.meet.MeetingWithBLOBs;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface MeetSummaryService
{
  public abstract ToJson<MeetingWithBLOBs> getAllInfo(Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<MeetingWithBLOBs> getMeetSummarydetail(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<Object> editMeetSummarydetail(HttpServletRequest paramHttpServletRequest, MeetingWithBLOBs paramMeetingWithBLOBs);
}
