package com.myoa.dao.calendar;

import com.myoa.model.calender.Calendar;

import java.util.List;
import java.util.Map;

public abstract interface CalendarMapper {
	public abstract int insert(Calendar paramCalendar);

	public abstract void insertSelective(Calendar paramCalendar);

	public abstract List<Calendar> getschedule(Map<String, Object> paramMap);

	public abstract List<Calendar> getscheduleBycId(Map<String, Object> paramMap);

	public abstract void delete(int paramInt);

	public abstract int update(Calendar paramCalendar);

	public abstract List<Calendar> getscheduleByDay(Map<String, Object> paramMap);

	public abstract List<Calendar> getAllschedule(Map<String, Object> paramMap);

	public abstract List<Calendar> getAllscheduleinfo(
			Map<String, Object> paramMap);

	public abstract List<Calendar> getscheduleByTakerAndOwner(
			Map<String, Object> paramMap);

	public abstract List<Calendar> getscheduleByTakerAndOwnerDay(
			Map<String, Object> paramMap);

	public abstract List<Calendar> getscheduleByUserIdDay(
			Map<String, Object> paramMap);

	public abstract List<Calendar> getscheduleByUserId(
			Map<String, Object> paramMap);

	public abstract List<Calendar> getAllScheduleByUserId(
			Map<String, Object> paramMap);

	public abstract List<Calendar> getAllScheduleByTakerAndOwner(
			Map<String, Object> paramMap);

	public abstract List<Calendar> getScheduleByUserIdAndType(String paramString);

	public abstract List<Calendar> getAllScheduleByDeptIdAndDate(
			Map<String, Object> paramMap);

	public abstract List<Calendar> queryAllScheduleByTakerAndOwner(
			Map<String, Object> paramMap);

	public abstract List<Calendar> getAllScheduleByAdmin(String paramString);

	public abstract List<Calendar> rChSelect();

	public abstract Calendar selCalendarById(int paramInt);

	public abstract List<Calendar> getscheduleBycIds(
			Map<String, Object> paramMap);
}
