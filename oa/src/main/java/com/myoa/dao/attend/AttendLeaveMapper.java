package com.myoa.dao.attend;

import com.myoa.model.attend.AttendFlowRunPrcs;
import com.myoa.model.attend.AttendLeave;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface AttendLeaveMapper {
	public abstract AttendLeave queryAttendLeave(
			@Param("userId") String paramString1,
			@Param("date") String paramString2);

	public abstract AttendLeave selectAttendLeave(
			@Param("userId") String paramString1,
			@Param("date") String paramString2);

	public abstract List<AttendLeave> selectAttendLeaveModify(
			@Param("userId") String paramString1,
			@Param("date") String paramString2);

	public abstract List<AttendFlowRunPrcs> queryAllAttendLeave(
			Map<String, Object> paramMap);

	public abstract List<AttendLeave> queryAllAttendLeaveFields(
			Map<String, Object> paramMap);

	public abstract int addAttendLeave(AttendLeave paramAttendLeave);

	public abstract int updateAttendLeave(AttendLeave paramAttendLeave);

	public abstract List<AttendFlowRunPrcs> backlogAttendList(
			Map<String, Object> paramMap);

	public abstract List<AttendFlowRunPrcs> haveDoneAttendList(
			Map<String, Object> paramMap);

	public abstract List<AttendLeave> getAllByDate(Map<String, Object> paramMap);

	public abstract List<AttendLeave> selectAttendLeaveByUserId(
			String paramString);

	public abstract List<AttendLeave> getAttendLeaveCount(
			@Param("year") String paramString);
}