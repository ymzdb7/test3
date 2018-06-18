package com.myoa.dao.event;

import com.myoa.model.event.TimeLineViewDept;
import com.myoa.model.event.TimeLineViewDeptExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TimeLineViewDeptMapper {
	public abstract int countByExample(
			TimeLineViewDeptExample paramTimeLineViewDeptExample);

	public abstract int deleteByExample(
			TimeLineViewDeptExample paramTimeLineViewDeptExample);

	public abstract int deleteByPrimaryKey(String paramString);

	public abstract int insert(TimeLineViewDept paramTimeLineViewDept);

	public abstract int insertSelective(TimeLineViewDept paramTimeLineViewDept);

	public abstract List<TimeLineViewDept> selectByExample(
			TimeLineViewDeptExample paramTimeLineViewDeptExample);

	public abstract int updateByExampleSelective(
			@Param("record") TimeLineViewDept paramTimeLineViewDept,
			@Param("example") TimeLineViewDeptExample paramTimeLineViewDeptExample);

	public abstract int updateByExample(
			@Param("record") TimeLineViewDept paramTimeLineViewDept,
			@Param("example") TimeLineViewDeptExample paramTimeLineViewDeptExample);

	public abstract int updateTimeLineViewDept(
			TimeLineViewDept paramTimeLineViewDept);

	public abstract int addTimeLineViewDept(
			TimeLineViewDept paramTimeLineViewDept);

	public abstract List<TimeLineViewDept> selectByUUID(String paramString);
}
