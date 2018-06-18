package com.myoa.dao.event;

import com.myoa.model.event.TimeLinePostDept;
import com.myoa.model.event.TimeLinePostDeptExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TimeLinePostDeptMapper {
	public abstract int countByExample(
			TimeLinePostDeptExample paramTimeLinePostDeptExample);

	public abstract int deleteByExample(
			TimeLinePostDeptExample paramTimeLinePostDeptExample);

	public abstract int deleteByPrimaryKey(String paramString);

	public abstract int insert(TimeLinePostDept paramTimeLinePostDept);

	public abstract int insertSelective(TimeLinePostDept paramTimeLinePostDept);

	public abstract List<TimeLinePostDept> selectByExample(
			TimeLinePostDeptExample paramTimeLinePostDeptExample);

	public abstract int updateByExampleSelective(
			@Param("record") TimeLinePostDept paramTimeLinePostDept,
			@Param("example") TimeLinePostDeptExample paramTimeLinePostDeptExample);

	public abstract int updateByExample(
			@Param("record") TimeLinePostDept paramTimeLinePostDept,
			@Param("example") TimeLinePostDeptExample paramTimeLinePostDeptExample);

	public abstract int updateTimeLinePostDept(
			TimeLinePostDept paramTimeLinePostDept);

	public abstract int addTimeLinePostDept(
			TimeLinePostDept paramTimeLinePostDept);

	public abstract List<TimeLinePostDept> selectByUUID(String paramString);
}
