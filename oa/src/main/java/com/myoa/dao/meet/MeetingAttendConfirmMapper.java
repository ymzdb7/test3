package com.myoa.dao.meet;

import com.myoa.model.meet.MeetingAttendConfirm;

import java.util.List;
import java.util.Map;

public abstract interface MeetingAttendConfirmMapper {
	public abstract List<MeetingAttendConfirm> queryAttendConfirm(
			String paramString);

	public abstract int insertConfirm(
			MeetingAttendConfirm paramMeetingAttendConfirm);

	public abstract int delConfirmById(String paramString);

	public abstract List<MeetingAttendConfirm> queryAttendByMeetId(
			String paramString);

	public abstract int updateStatusBySId(
			MeetingAttendConfirm paramMeetingAttendConfirm);

	public abstract MeetingAttendConfirm queryMyAttend(
			Map<String, Object> paramMap);
}
