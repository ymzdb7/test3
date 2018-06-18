package com.myoa.service.meeting;

import com.myoa.model.meet.Meeting;
import com.myoa.model.meet.MeetingAttendConfirm;
import com.myoa.model.meet.MeetingWithBLOBs;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface MeetingService
{
  public abstract ToJson<MeetingWithBLOBs> queryMeeting(MeetingWithBLOBs paramMeetingWithBLOBs, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<MeetingWithBLOBs> getMyMeeting(HttpServletRequest paramHttpServletRequest, MeetingWithBLOBs paramMeetingWithBLOBs, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<MeetingWithBLOBs> queryMeetingById(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, String paramString, int paramInt);

  public abstract ToJson<MeetingWithBLOBs> updateMeetingById(MeetingWithBLOBs paramMeetingWithBLOBs);

  public abstract ToJson<MeetingWithBLOBs> updMeetStatusById(HttpServletRequest paramHttpServletRequest, Meeting paramMeeting);

  public abstract ToJson<MeetingWithBLOBs> insertMeeting(MeetingWithBLOBs paramMeetingWithBLOBs, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<MeetingWithBLOBs> delMeetingById(String paramString);

  public abstract ToJson<MeetingAttendConfirm> queryAttendConfirm(String paramString);

  public abstract ToJson<Meeting> queryCountByStatus(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<MeetingWithBLOBs> updateConfirmReadStatusBySId(MeetingAttendConfirm paramMeetingAttendConfirm, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Users> updateConfirmAttendStatusBySId(MeetingAttendConfirm paramMeetingAttendConfirm, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<MeetingWithBLOBs> getMeetingNotify(HttpServletRequest paramHttpServletRequest, MeetingWithBLOBs paramMeetingWithBLOBs, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);
}

