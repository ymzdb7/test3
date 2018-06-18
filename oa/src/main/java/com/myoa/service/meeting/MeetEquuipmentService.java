package com.myoa.service.meeting;

import com.myoa.model.meet.MeetingEquuipment;
import com.myoa.util.ToJson;

public abstract interface MeetEquuipmentService
{
  public abstract ToJson<MeetingEquuipment> getAllEquip(Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<MeetingEquuipment> getdetailEquiet(String paramString);

  public abstract ToJson<Object> updateEquiet(MeetingEquuipment paramMeetingEquuipment);

  public abstract ToJson<Object> deleteEquiets(String paramString);

  public abstract ToJson<Object> addEquiet(MeetingEquuipment paramMeetingEquuipment);
}

