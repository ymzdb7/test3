package com.myoa.dao.event;

import com.myoa.model.event.TimeLineViewUser;
import com.myoa.model.event.TimeLineViewUserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TimeLineViewUserMapper {
	public abstract int countByExample(
			TimeLineViewUserExample paramTimeLineViewUserExample);

	public abstract int deleteByExample(
			TimeLineViewUserExample paramTimeLineViewUserExample);

	public abstract int deleteByPrimaryKey(String paramString);

	public abstract int insert(TimeLineViewUser paramTimeLineViewUser);

	public abstract int insertSelective(TimeLineViewUser paramTimeLineViewUser);

	public abstract List<TimeLineViewUser> selectByExample(
			TimeLineViewUserExample paramTimeLineViewUserExample);

	public abstract int updateByExampleSelective(
			@Param("record") TimeLineViewUser paramTimeLineViewUser,
			@Param("example") TimeLineViewUserExample paramTimeLineViewUserExample);

	public abstract int updateByExample(
			@Param("record") TimeLineViewUser paramTimeLineViewUser,
			@Param("example") TimeLineViewUserExample paramTimeLineViewUserExample);

	public abstract int addTimeLineViewUser(
			TimeLineViewUser paramTimeLineViewUser);

	public abstract int updateTimeLineViewUser(
			TimeLineViewUser paramTimeLineViewUser);

	public abstract List<TimeLineViewUser> selectByUUID(String paramString);
}
