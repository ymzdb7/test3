package com.myoa.controller.event;

import com.myoa.model.event.TimeLinePostRole;
import com.myoa.service.event.TimeLinePostRoleService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/timeLinePostRole" })
public class TimeLinePostRoleController {

	@Autowired
	TimeLinePostRoleService timeLinePostRoleService;

	@ResponseBody
	@RequestMapping({ "/updateTimeLinePostRole" })
	public ToJson<TimeLinePostRole> updateTimeLinePostRole(
			HttpServletRequest request, TimeLinePostRole timeLinePostRole) {
		return this.timeLinePostRoleService.updateTimeLinePostRole(request,
				timeLinePostRole);
	}

	@ResponseBody
	@RequestMapping({ "/addTimeLinePostRole" })
	public ToJson<TimeLinePostRole> addTimeLinePostRole(
			HttpServletRequest request, TimeLinePostRole timeLinePostRole) {
		return this.timeLinePostRoleService.addTimeLinePostRole(request,
				timeLinePostRole);
	}
}
