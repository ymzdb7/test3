package com.myoa.service.event;

import com.myoa.model.event.TimeLinePostUser;
import com.myoa.util.ToJson;

import org.springframework.stereotype.Service;

@Service
public abstract interface TimeLinePostUserService
{
  public abstract ToJson<TimeLinePostUser> updateTimeLinePostUser(TimeLinePostUser paramTimeLinePostUser);

  public abstract ToJson<TimeLinePostUser> addTimeLinePostUser(TimeLinePostUser paramTimeLinePostUser);
}

