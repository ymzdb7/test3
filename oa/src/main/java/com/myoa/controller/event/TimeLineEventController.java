package com.myoa.controller.event;

import com.myoa.model.event.TimeLine;
import com.myoa.model.event.TimelineEvent;
import com.myoa.service.event.TimeLineEventService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/timeLineEvent" })
public class TimeLineEventController {

	@Autowired
	TimeLineEventService timeLineEventService;

	@ResponseBody
	@RequestMapping({ "/getEventList" })
	public ToJson<TimelineEvent> getEventList(HttpServletRequest request,
			TimelineEvent timelineEvent, TimeLine timeLine) {
		return this.timeLineEventService.getEventList(request, timelineEvent,
				timeLine);
	}

	@ResponseBody
	@RequestMapping({ "/getEventDetailByUuid" })
	public ToJson<TimelineEvent> getEventDetailByUuid(
			HttpServletRequest request, String uuid) {
		return this.timeLineEventService.getEventDetailByUuid(request, uuid);
	}

	@ResponseBody
	@RequestMapping({ "/updateInfor" })
	public ToJson<TimelineEvent> updateInfor(HttpServletRequest request,
			TimelineEvent timelineEvent) {
		return this.timeLineEventService.updateInfor(request, timelineEvent);
	}

	@ResponseBody
	@RequestMapping({ "/addEventInfor" })
	public ToJson<TimelineEvent> addEventInfor(HttpServletRequest request,
			TimelineEvent timelineEvent, TimeLine timeLine) {
		return this.timeLineEventService.addEventInfor(request, timelineEvent,
				timeLine);
	}

	@ResponseBody
	@RequestMapping({ "/deleteEventByUuid" })
	public ToJson<TimelineEvent> deleteEventByUuid(HttpServletRequest request,
			String uuid) {
		return this.timeLineEventService.deleteEventByUuid(request, uuid);
	}
}
