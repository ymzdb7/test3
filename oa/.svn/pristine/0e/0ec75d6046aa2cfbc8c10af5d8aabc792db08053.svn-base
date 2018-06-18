package com.myoa.controller.meeting;

import com.myoa.util.Constant;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({ "/MeetingCommon" })
@Controller
public class MeetingCommonController {
	@RequestMapping({ "/MeetingApply" })
	public String meetingApply(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/meeting/index";
	}

	@RequestMapping({ "/selectMeeting" })
	public String selectMeeting(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/meeting/query";
	}

	@RequestMapping({ "/selectMyMeeting" })
	public String selectMyMeeting(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/meeting/myMeeting";
	}

	@RequestMapping({ "/selectMeetingMinutes" })
	public String selectMeetingMinutes(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/meeting/summary/index";
	}

	@RequestMapping({ "/selectMeetingMange" })
	public String selectMeetingMange(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/meeting/leader/index";
	}

	@RequestMapping({ "/MeetingDeviceMange" })
	public String MeetingDeviceMange(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/meeting/equipment/index";
	}

	@RequestMapping({ "/MeetingRoom" })
	public String MeetingRoom(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/meeting/room/index";
	}

	@RequestMapping({ "/MeetingMange" })
	public String MeetingMange(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/meeting/leader/setLeader";
	}
}
