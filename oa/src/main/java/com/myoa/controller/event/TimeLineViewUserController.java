package com.myoa.controller.event;

import com.myoa.model.event.TimeLineViewUser;
import com.myoa.service.event.TimeLineViewUserService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/timeLineViewUser" })
public class TimeLineViewUserController {

	@Autowired
	TimeLineViewUserService timeLineViewUserService;

	@ResponseBody
	@RequestMapping({ "/updateTimeLineViewUser" })
	public ToJson<TimeLineViewUser> updateTimeLineViewUser(
			HttpServletRequest request, TimeLineViewUser timeLineViewUser) {
		return this.timeLineViewUserService.updateTimeLineViewUser(request,
				timeLineViewUser);
	}

	@ResponseBody
	@RequestMapping({ "/addTimeLineViewUser" })
	public ToJson<TimeLineViewUser> addTimeLineViewUser(
			HttpServletRequest request, TimeLineViewUser timeLineViewUser) {
		return this.timeLineViewUserService.addTimeLineViewUser(request,
				timeLineViewUser);
	}
}
