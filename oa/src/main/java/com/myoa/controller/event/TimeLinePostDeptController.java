package com.myoa.controller.event;

import com.myoa.model.event.TimeLinePostDept;
import com.myoa.service.event.TimeLinePostDeptService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/timeLinePostDept" })
public class TimeLinePostDeptController {

	@Autowired
	TimeLinePostDeptService timeLinePostDeptService;

	@ResponseBody
	@RequestMapping({ "/updateTimeLinePostDept" })
	public ToJson<TimeLinePostDept> updateTimeLinePostDept(
			HttpServletRequest request, TimeLinePostDept timeLinePostDept) {
		return this.timeLinePostDeptService.updateTimeLinePostDept(request,
				timeLinePostDept);
	}

	@ResponseBody
	@RequestMapping({ "/addTimeLinePostDept" })
	public ToJson<TimeLinePostDept> addTimeLinePostDept(
			HttpServletRequest request, TimeLinePostDept timeLinePostDept) {
		return this.timeLinePostDeptService.addTimeLinePostDept(request,
				timeLinePostDept);
	}
}
