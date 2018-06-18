package com.myoa.service.timedTaskManagement;

import com.myoa.model.timedTaskManagement.TimedTaskManagement;
import com.myoa.util.ToJson;

import java.util.List;
import java.util.Map;

public abstract interface TimedTaskManagementService
{
  public abstract ToJson selectTimedTask();

  public abstract TimedTaskManagement selectTimedTaskOne(Integer paramInteger1, Integer paramInteger2);

  public abstract List<TimedTaskManagement> selectTimeManagerTo();

  public abstract Integer[] selectTimedTaskId();

  public abstract TimedTaskManagement selectTimedTaskKey(Integer paramInteger);

  public abstract int updateTimedTaskManagement(Map<String, Object> paramMap);
}

