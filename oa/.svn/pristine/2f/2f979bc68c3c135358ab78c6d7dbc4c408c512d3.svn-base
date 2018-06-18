package com.myoa.controller.schedule;

import com.myoa.model.schedule.ResultLeaderActivity;
import com.myoa.model.schedule.Schedule;
import com.myoa.service.schedule.ScheduleService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/leaderschedule" })
public class ScheduleController {

	@Resource
	private ScheduleService scheduleService;

	@RequestMapping({ "/leaderActivity" })
	public String getIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/leaderActivity/leaderActivity";
	}

	@RequestMapping({ "/query" })
	public String getQuery(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/leaderActivity/query";
	}

	@ResponseBody
	@RequestMapping(value = { "/saveSchedule" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Schedule> saveSchedule(HttpServletRequest request,
			Schedule schedule) {
		return this.scheduleService.saveSchedule(schedule);
	}

	@ResponseBody
	@RequestMapping(value = { "/commitSchedule" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Schedule> commitSchedule(int id) {
		return this.scheduleService.commitSchedule(id);
	}

	@ResponseBody
	@RequestMapping(value = { "/queryLeaderActiveAll" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<ResultLeaderActivity> queryLeaderActiveAll(Schedule schedule) {
		return this.scheduleService.queryLeaderActiveAll(schedule);
	}
}
