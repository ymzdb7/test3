package com.myoa.service.event;

import com.myoa.model.event.TimeLine;
import com.myoa.model.event.TimelineEvent;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface TimeLineEventService
{
  public abstract ToJson<TimelineEvent> getEventList(HttpServletRequest paramHttpServletRequest, TimelineEvent paramTimelineEvent, TimeLine paramTimeLine);

  public abstract ToJson<TimelineEvent> getEventDetailByUuid(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<TimelineEvent> updateInfor(HttpServletRequest paramHttpServletRequest, TimelineEvent paramTimelineEvent);

  public abstract ToJson<TimelineEvent> deleteEventByUuid(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<TimelineEvent> addEventInfor(HttpServletRequest paramHttpServletRequest, TimelineEvent paramTimelineEvent, TimeLine paramTimeLine);
}

