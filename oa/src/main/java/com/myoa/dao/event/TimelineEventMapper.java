package com.myoa.dao.event;

import com.myoa.model.event.TimelineEvent;
import com.myoa.model.event.TimelineEventExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TimelineEventMapper {
	public abstract int countByExample(
			TimelineEventExample paramTimelineEventExample);

	public abstract int deleteByExample(
			TimelineEventExample paramTimelineEventExample);

	public abstract int deleteByPrimaryKey(String paramString);

	public abstract int insert(TimelineEvent paramTimelineEvent);

	public abstract int insertSelective(TimelineEvent paramTimelineEvent);

	public abstract List<TimelineEvent> selectByExampleWithBLOBs(
			TimelineEventExample paramTimelineEventExample);

	public abstract List<TimelineEvent> selectByExample(
			TimelineEventExample paramTimelineEventExample);

	public abstract TimelineEvent selectByPrimaryKey(String paramString);

	public abstract int updateByExampleSelective(
			@Param("record") TimelineEvent paramTimelineEvent,
			@Param("example") TimelineEventExample paramTimelineEventExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") TimelineEvent paramTimelineEvent,
			@Param("example") TimelineEventExample paramTimelineEventExample);

	public abstract int updateByExample(
			@Param("record") TimelineEvent paramTimelineEvent,
			@Param("example") TimelineEventExample paramTimelineEventExample);

	public abstract int updateByPrimaryKeySelective(
			TimelineEvent paramTimelineEvent);

	public abstract int updateByPrimaryKeyWithBLOBs(
			TimelineEvent paramTimelineEvent);

	public abstract int updateByPrimaryKey(TimelineEvent paramTimelineEvent);

	public abstract List<TimelineEvent> getEventList(
			TimelineEvent paramTimelineEvent);

	public abstract TimelineEvent getEventDetailByUuid(String paramString);

	public abstract int updateInfor(TimelineEvent paramTimelineEvent);

	public abstract int deleteEventByUuid(String paramString);

	public abstract int addEventInfor(TimelineEvent paramTimelineEvent);
}