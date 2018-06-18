package com.myoa.controller.event;

import com.myoa.model.event.TimeLinePostUser;
import com.myoa.service.event.TimeLinePostUserService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/timeLinePostUser" })
public class TimeLinePostUserController {

	@Autowired
	TimeLinePostUserService timeLinePostUserService;

	@ResponseBody
	@RequestMapping({ "/updateTimeLinePostUser" })
	public ToJson<TimeLinePostUser> updateTimeLinePostUser(
			HttpServletRequest request, TimeLinePostUser timeLinePostUser) {
		return this.timeLinePostUserService
				.updateTimeLinePostUser(timeLinePostUser);
	}

	@ResponseBody
	@RequestMapping({ "/addTimeLinePostUser" })
	public ToJson<TimeLinePostUser> addTimeLinePostUser(
			HttpServletRequest request, TimeLinePostUser timeLinePostUser) {
		return this.timeLinePostUserService
				.addTimeLinePostUser(timeLinePostUser);
	}
}
