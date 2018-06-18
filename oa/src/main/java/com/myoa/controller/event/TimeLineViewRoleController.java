package com.myoa.controller.event;

import com.myoa.model.event.TimeLineViewRole;
import com.myoa.service.event.TimeLineViewRoleService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/timeLineViewRole" })
public class TimeLineViewRoleController {

	@Autowired
	TimeLineViewRoleService timeLineViewRoleService;

	@ResponseBody
	@RequestMapping({ "/updateTimeLineViewRole" })
	public ToJson<TimeLineViewRole> updateTimeLineViewRole(
			HttpServletRequest request, TimeLineViewRole timeLineViewRole) {
		return this.timeLineViewRoleService.updateTimeLineViewRole(request,
				timeLineViewRole);
	}

	@ResponseBody
	@RequestMapping({ "/addTimeLineViewRole" })
	public ToJson<TimeLineViewRole> addTimeLineViewRole(
			HttpServletRequest request, TimeLineViewRole timeLineViewRole) {
		return this.timeLineViewRoleService.addTimeLineViewRole(request,
				timeLineViewRole);
	}
}