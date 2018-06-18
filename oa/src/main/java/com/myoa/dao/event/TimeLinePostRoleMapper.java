package com.myoa.dao.event;

import com.myoa.model.event.TimeLinePostRole;
import com.myoa.model.event.TimeLinePostRoleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TimeLinePostRoleMapper {
	public abstract int countByExample(
			TimeLinePostRoleExample paramTimeLinePostRoleExample);

	public abstract int deleteByExample(
			TimeLinePostRoleExample paramTimeLinePostRoleExample);

	public abstract int deleteByPrimaryKey(String paramString);

	public abstract int insert(TimeLinePostRole paramTimeLinePostRole);

	public abstract int insertSelective(TimeLinePostRole paramTimeLinePostRole);

	public abstract List<TimeLinePostRole> selectByExample(
			TimeLinePostRoleExample paramTimeLinePostRoleExample);

	public abstract int updateByExampleSelective(
			@Param("record") TimeLinePostRole paramTimeLinePostRole,
			@Param("example") TimeLinePostRoleExample paramTimeLinePostRoleExample);

	public abstract int updateByExample(
			@Param("record") TimeLinePostRole paramTimeLinePostRole,
			@Param("example") TimeLinePostRoleExample paramTimeLinePostRoleExample);

	public abstract int updateTimeLinePostRole(
			TimeLinePostRole paramTimeLinePostRole);

	public abstract int addTimeLinePostRole(
			TimeLinePostRole paramTimeLinePostRole);

	public abstract List<TimeLinePostRole> selectByUUID(String paramString);
}
