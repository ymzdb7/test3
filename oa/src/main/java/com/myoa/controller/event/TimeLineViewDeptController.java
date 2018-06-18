package com.myoa.controller.event;

import com.myoa.model.event.TimeLineViewDept;
import com.myoa.service.event.TimeLineViewDeptService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/timeLineViewDept" })
public class TimeLineViewDeptController {

	@Autowired
	TimeLineViewDeptService timeLineViewDeptService;

	@ResponseBody
	@RequestMapping({ "/updateTimeLineViewDept" })
	public ToJson<TimeLineViewDept> updateTimeLineViewDept(
			HttpServletRequest request, TimeLineViewDept timeLineViewDept) {
		return this.timeLineViewDeptService.updateTimeLineViewDept(request,
				timeLineViewDept);
	}

	@ResponseBody
	@RequestMapping({ "/addTimeLineViewDept" })
	public ToJson<TimeLineViewDept> addTimeLineViewDept(
			HttpServletRequest request, TimeLineViewDept timeLineViewDept) {
		return this.timeLineViewDeptService.addTimeLineViewDept(request,
				timeLineViewDept);
	}
}
