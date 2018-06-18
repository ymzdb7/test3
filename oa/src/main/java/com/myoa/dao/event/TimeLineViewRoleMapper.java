package com.myoa.dao.event;

import com.myoa.model.event.TimeLineViewRole;
import com.myoa.model.event.TimeLineViewRoleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TimeLineViewRoleMapper {
	public abstract int countByExample(
			TimeLineViewRoleExample paramTimeLineViewRoleExample);

	public abstract int deleteByExample(
			TimeLineViewRoleExample paramTimeLineViewRoleExample);

	public abstract int deleteByPrimaryKey(String paramString);

	public abstract int insert(TimeLineViewRole paramTimeLineViewRole);

	public abstract int insertSelective(TimeLineViewRole paramTimeLineViewRole);

	public abstract List<TimeLineViewRole> selectByExample(
			TimeLineViewRoleExample paramTimeLineViewRoleExample);

	public abstract int updateByExampleSelective(
			@Param("record") TimeLineViewRole paramTimeLineViewRole,
			@Param("example") TimeLineViewRoleExample paramTimeLineViewRoleExample);

	public abstract int updateByExample(
			@Param("record") TimeLineViewRole paramTimeLineViewRole,
			@Param("example") TimeLineViewRoleExample paramTimeLineViewRoleExample);

	public abstract int addTimeLineViewRole(
			TimeLineViewRole paramTimeLineViewRole);

	public abstract int updateTimeLineViewRole(
			TimeLineViewRole paramTimeLineViewRole);

	public abstract List<TimeLineViewRole> selectByUUID(String paramString);
}
