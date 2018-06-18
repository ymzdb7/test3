package com.myoa.dao.attend;

import com.myoa.model.attend.Attend;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface AttendMapper {
	public abstract int addAttend(Attend paramAttend);

	public abstract List<Attend> selectAttend(Map<String, Object> paramMap);

	public abstract Attend selectAttendType(@Param("type") String paramString);

	public abstract List<Attend> selectAttendList(Map<String, Object> paramMap);

	public abstract List<Attend> AttendList(Map<String, Object> paramMap);

	public abstract List<Attend> quertAttendList(Map<String, Object> paramMap);

	public abstract Attend selectAttendAll(@Param("date") String paramString1,
			@Param("uid") String paramString2,
			@Param("type") String paramString3);

	public abstract List<Attend> selectAttend0(
			@Param("date") String paramString1,
			@Param("uid") String paramString2);

	public abstract List<Attend> queryCountPhone(Map<String, Object> paramMap);

	public abstract List<Attend> queryAttendPhone(Map<String, Object> paramMap);

	public abstract List<Attend> queryAttendPhoneId(Map<String, Object> paramMap);

	public abstract List<Attend> findByAttendCount(
			@Param("depId") String paramString);

	public abstract List<Date> selectAttendDate(Integer paramInteger);
}
