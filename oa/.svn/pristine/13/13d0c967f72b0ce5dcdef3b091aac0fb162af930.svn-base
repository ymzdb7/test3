package com.myoa.controller.meeting;

import com.myoa.model.meet.MeetingRoomWithBLOBs;
import com.myoa.service.meeting.MeetRoomService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping({ "/meetingRoom" })
@Controller
public class MeetingRoomController {

	@Resource
	private MeetRoomService meetRoomService;

	@RequestMapping({ "/getAllMeetRoomInfo" })
	@ResponseBody
	public ToJson<MeetingRoomWithBLOBs> getAllMeetRoomInfo(Integer page,
			Integer pageSize, boolean useFlag) {
		return this.meetRoomService.getAllMeetRoomInfo(page, pageSize, useFlag);
	}

	@RequestMapping({ "/getMeetRoomBySid" })
	@ResponseBody
	public ToJson<MeetingRoomWithBLOBs> getMeetRoomBySid(String sid) {
		return this.meetRoomService.getMeetRoomBySid(sid);
	}

	@RequestMapping({ "/deleteMeetRoomBySid" })
	@ResponseBody
	public ToJson<Object> deleteMeetRoomBySid(String sid) {
		return this.meetRoomService.deleteMeetRoomBySid(sid);
	}

	@RequestMapping({ "/addMeetRoom" })
	@ResponseBody
	public ToJson<Object> addMeetRoom(MeetingRoomWithBLOBs meetingRoomWithBLOBs) {
		return this.meetRoomService.addMeetRoom(meetingRoomWithBLOBs);
	}

	@RequestMapping({ "/editMeetRoom" })
	@ResponseBody
	public ToJson<Object> editMeetRoom(MeetingRoomWithBLOBs meetingRoomWithBLOBs) {
		return this.meetRoomService.editMeetRoom(meetingRoomWithBLOBs);
	}

	@RequestMapping({ "/getAllMeetRoom" })
	@ResponseBody
	public ToJson<MeetingRoomWithBLOBs> getAllMeetRoom(
			HttpServletRequest request) {
		return this.meetRoomService.getAllMeetRoom(request);
	}

	@RequestMapping({ "/getUserRoomCondition" })
	@ResponseBody
	public ToJson<MeetingRoomWithBLOBs> getUserRoomCondition(String currentDate) {
		return this.meetRoomService.getUserRoomCondition(currentDate);
	}
}
