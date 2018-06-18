package com.myoa.service.schedule;

import com.myoa.model.schedule.ResultLeaderActivity;
import com.myoa.model.schedule.Schedule;
import com.myoa.util.ToJson;

public abstract interface ScheduleService
{
  public abstract ToJson<Schedule> saveSchedule(Schedule paramSchedule);

  public abstract ToJson<Schedule> commitSchedule(int paramInt);

  public abstract ToJson<ResultLeaderActivity> queryLeaderActiveAll(Schedule paramSchedule);
}

