package com.myoa.dao.attend;

import com.myoa.model.attend.AttendOut;
import com.myoa.model.attend.AttendOutFlowRunPrcs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface AttendOutMapper {
	public abstract List<AttendOut> queryAttendOut(
			@Param("userId") String paramString1,
			@Param("date") String paramString2);

	public abstract AttendOut selectAttendOut(
			@Param("userId") String paramString1,
			@Param("date") String paramString2);

	public abstract List<AttendOutFlowRunPrcs> queryAllAttendOut(
			Map<String, Object> paramMap);

	public abstract int insertSelective(AttendOut paramAttendOut);

	public abstract int updateByExampleSelective(AttendOut paramAttendOut);

	public abstract List<AttendOutFlowRunPrcs> backlogAttendOut(
			Map<String, Object> paramMap);

	public abstract List<AttendOutFlowRunPrcs> haveDoneAttendOut(
			Map<String, Object> paramMap);

	public abstract List<AttendOut> queryAttendOutByUserId(String paramString);
}
