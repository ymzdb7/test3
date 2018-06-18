package com.myoa.dao.attend;

import com.myoa.model.attend.AttendanceOvertime;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface AttendanceOvertimeMapper {
	public abstract List<AttendanceOvertime> queryAttendanceOvertime(
			@Param("userId") String paramString1,
			@Param("date") String paramString2);

	public abstract AttendanceOvertime selectAttendanceOvertime(
			@Param("userId") String paramString1,
			@Param("date") String paramString2);

	public abstract int insertSelective(
			AttendanceOvertime paramAttendanceOvertime);

	public abstract int updateByExampleSelective(
			AttendanceOvertime paramAttendanceOvertime);

	public abstract List<AttendanceOvertime> queryAttendanceOvertimeByUserId(
			String paramString);
}