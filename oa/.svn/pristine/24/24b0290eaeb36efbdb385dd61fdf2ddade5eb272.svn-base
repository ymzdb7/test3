package com.myoa.dao.event;

import com.myoa.model.event.TimeLinePostUser;
import com.myoa.model.event.TimeLinePostUserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TimeLinePostUserMapper {
	public abstract int countByExample(
			TimeLinePostUserExample paramTimeLinePostUserExample);

	public abstract int deleteByExample(
			TimeLinePostUserExample paramTimeLinePostUserExample);

	public abstract int deleteByPrimaryKey(String paramString);

	public abstract int insert(TimeLinePostUser paramTimeLinePostUser);

	public abstract int insertSelective(TimeLinePostUser paramTimeLinePostUser);

	public abstract List<TimeLinePostUser> selectByExample(
			TimeLinePostUserExample paramTimeLinePostUserExample);

	public abstract int updateByExampleSelective(
			@Param("record") TimeLinePostUser paramTimeLinePostUser,
			@Param("example") TimeLinePostUserExample paramTimeLinePostUserExample);

	public abstract int updateByExample(
			@Param("record") TimeLinePostUser paramTimeLinePostUser,
			@Param("example") TimeLinePostUserExample paramTimeLinePostUserExample);

	public abstract int updateTimeLinePostUser(
			TimeLinePostUser paramTimeLinePostUser);

	public abstract int addTimeLinePostUser(
			TimeLinePostUser paramTimeLinePostUser);

	public abstract List<TimeLinePostUser> selectByUUID(String paramString);
}
