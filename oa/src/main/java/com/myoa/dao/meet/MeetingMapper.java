package com.myoa.dao.meet;

import com.myoa.model.meet.Meeting;
import com.myoa.model.meet.MeetingWithBLOBs;

import java.util.List;
import java.util.Map;

public abstract interface MeetingMapper {
	public abstract List<MeetingWithBLOBs> queryMeeting(
			Map<String, Object> paramMap);

	public abstract List<MeetingWithBLOBs> getMyMeeting(
			Map<String, Object> paramMap);

	public abstract MeetingWithBLOBs queryMeetingById(String paramString);

	public abstract int updateMeetingById(MeetingWithBLOBs paramMeetingWithBLOBs);

	public abstract int updMeetStatusById(Meeting paramMeeting);

	public abstract int insertMeeting(MeetingWithBLOBs paramMeetingWithBLOBs);

	public abstract int delMeetingById(String paramString);

	public abstract int queryCountByStatus(Meeting paramMeeting);

	public abstract List<MeetingWithBLOBs> getMeetSummary(
			Map<String, Object> paramMap);

	public abstract int editMeetSummary(MeetingWithBLOBs paramMeetingWithBLOBs);

	public abstract int selCountRoomNoConflict(Map<String, Object> paramMap);

	public abstract List<MeetingWithBLOBs> queryCurrentRoomUserCondition(
			Map<String, Object> paramMap);

	public abstract List<MeetingWithBLOBs> getMeetingNotify(
			Map<String, Object> paramMap);

	public abstract MeetingWithBLOBs queryMeetingByIdInt(Integer paramInteger);
}
