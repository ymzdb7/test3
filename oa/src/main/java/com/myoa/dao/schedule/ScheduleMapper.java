package com.myoa.dao.schedule;

import com.myoa.model.schedule.Schedule;

import java.util.List;
import java.util.Map;

public abstract interface ScheduleMapper {
	public abstract int saveSchedule(Schedule paramSchedule);

	public abstract int commitSchedule(Map<String, Object> paramMap);

	public abstract List<Schedule> queryLeaderActiveAll(
			Map<String, Object> paramMap);
}
