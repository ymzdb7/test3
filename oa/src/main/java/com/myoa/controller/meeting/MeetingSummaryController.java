package com.myoa.controller.meeting;

import com.myoa.model.meet.MeetingWithBLOBs;
import com.myoa.service.meeting.MeetSummaryService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/MeetSummary" })
public class MeetingSummaryController {

	@Resource
	private MeetSummaryService meetSummaryService;

	@RequestMapping({ "/getAllInfo" })
	@ResponseBody
	public ToJson<MeetingWithBLOBs> getAllInfo(Integer page, Integer pageSize,
			boolean useFlag, HttpServletRequest request) {
		return this.meetSummaryService.getAllInfo(page, pageSize, useFlag,
				request);
	}

	@RequestMapping({ "/getMeetSummarydetail" })
	@ResponseBody
	public ToJson<MeetingWithBLOBs> getMeetSummarydetail(
			HttpServletRequest request, String sid) {
		return this.meetSummaryService.getMeetSummarydetail(request, sid);
	}

	@RequestMapping({ "/editMeetSummarydetail" })
	@ResponseBody
	public ToJson<Object> editMeetSummarydetail(HttpServletRequest request,
			MeetingWithBLOBs meetingWithBLOBs) {
		return this.meetSummaryService.editMeetSummarydetail(request,
				meetingWithBLOBs);
	}
}
