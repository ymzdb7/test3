package com.myoa.dao.meet;

import com.myoa.model.meet.MeetingRoom;
import com.myoa.model.meet.MeetingRoomExample;
import com.myoa.model.meet.MeetingRoomWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface MeetingRoomMapper {
	public abstract int countByExample(
			MeetingRoomExample paramMeetingRoomExample);

	public abstract int deleteByExample(
			MeetingRoomExample paramMeetingRoomExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(MeetingRoomWithBLOBs paramMeetingRoomWithBLOBs);

	public abstract int insertSelective(
			MeetingRoomWithBLOBs paramMeetingRoomWithBLOBs);

	public abstract List<MeetingRoomWithBLOBs> selectByExampleWithBLOBs(
			MeetingRoomExample paramMeetingRoomExample);

	public abstract List<MeetingRoom> selectByExample(
			MeetingRoomExample paramMeetingRoomExample);

	public abstract MeetingRoomWithBLOBs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") MeetingRoomWithBLOBs paramMeetingRoomWithBLOBs,
			@Param("example") MeetingRoomExample paramMeetingRoomExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") MeetingRoomWithBLOBs paramMeetingRoomWithBLOBs,
			@Param("example") MeetingRoomExample paramMeetingRoomExample);

	public abstract int updateByExample(
			@Param("record") MeetingRoom paramMeetingRoom,
			@Param("example") MeetingRoomExample paramMeetingRoomExample);

	public abstract int updateByPrimaryKeySelective(
			MeetingRoomWithBLOBs paramMeetingRoomWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			MeetingRoomWithBLOBs paramMeetingRoomWithBLOBs);

	public abstract int updateByPrimaryKey(MeetingRoom paramMeetingRoom);

	public abstract List<MeetingRoomWithBLOBs> getAllMeetRoomInfo(
			Map<String, Object> paramMap);

	public abstract MeetingRoomWithBLOBs getMeetRoomBySid(
			@Param("sid") Integer paramInteger);

	public abstract void deleteMeetRoomBySid(@Param("sid") Integer paramInteger);

	public abstract void addMeetRoom(MeetingRoom paramMeetingRoom);

	public abstract void editMeetRoom(
			MeetingRoomWithBLOBs paramMeetingRoomWithBLOBs);

	public abstract List<MeetingRoomWithBLOBs> getSomeMeetRoom(
			Map<String, Object> paramMap);
}