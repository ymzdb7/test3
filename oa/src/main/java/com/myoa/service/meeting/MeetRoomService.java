package com.myoa.service.meeting;

import com.myoa.model.meet.MeetingRoomWithBLOBs;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface MeetRoomService
{
  public abstract ToJson<MeetingRoomWithBLOBs> getAllMeetRoomInfo(Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<MeetingRoomWithBLOBs> getMeetRoomBySid(String paramString);

  public abstract ToJson<Object> deleteMeetRoomBySid(String paramString);

  public abstract ToJson<Object> addMeetRoom(MeetingRoomWithBLOBs paramMeetingRoomWithBLOBs);

  public abstract ToJson<Object> editMeetRoom(MeetingRoomWithBLOBs paramMeetingRoomWithBLOBs);

  public abstract ToJson<MeetingRoomWithBLOBs> getAllMeetRoom(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<MeetingRoomWithBLOBs> getUserRoomCondition(String paramString);
}

