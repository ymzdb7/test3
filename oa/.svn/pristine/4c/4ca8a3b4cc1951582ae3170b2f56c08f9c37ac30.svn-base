package com.myoa.dao.event;

import com.myoa.model.event.TimeLine;
import com.myoa.model.event.TimeLineExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface TimeLineMapper {
	public abstract int countByExample(TimeLineExample paramTimeLineExample);

	public abstract int deleteByExample(TimeLineExample paramTimeLineExample);

	public abstract int deleteByPrimaryKey(String paramString);

	public abstract int insert(TimeLine paramTimeLine);

	public abstract int insertSelective(TimeLine paramTimeLine);

	public abstract List<TimeLine> selectByExampleWithBLOBs(
			TimeLineExample paramTimeLineExample);

	public abstract List<TimeLine> selectByExample(
			TimeLineExample paramTimeLineExample);

	public abstract TimeLine selectByPrimaryKey(String paramString);

	public abstract int updateByExampleSelective(
			@Param("record") TimeLine paramTimeLine,
			@Param("example") TimeLineExample paramTimeLineExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") TimeLine paramTimeLine,
			@Param("example") TimeLineExample paramTimeLineExample);

	public abstract int updateByExample(
			@Param("record") TimeLine paramTimeLine,
			@Param("example") TimeLineExample paramTimeLineExample);

	public abstract int updateByPrimaryKeySelective(TimeLine paramTimeLine);

	public abstract int updateByPrimaryKeyWithBLOBs(TimeLine paramTimeLine);

	public abstract int updateByPrimaryKey(TimeLine paramTimeLine);

	public abstract List<TimeLine> getDetailByUuid(String paramString);

	public abstract List<TimeLine> getInforList(TimeLine paramTimeLine);

	public abstract int updateData(TimeLine paramTimeLine);

	public abstract int deleteByUuid(String paramString);

	public abstract int addData(TimeLine paramTimeLine);

	public abstract List<TimeLine> getInforList1(TimeLine paramTimeLine);

	public abstract List<TimeLine> getTimelines(Map<String, Object> paramMap);

	public abstract List<TimeLine> postTimelines(Map<String, Object> paramMap);

	public abstract TimeLine selectTimeLineByUuid(String paramString);
}
