package com.myoa.controller.attend;

import com.myoa.model.attend.AttendanceOvertime;
import com.myoa.service.attend.AttendanceOvertimeService;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/attendanceOvertime" })
public class AttendanceOvertimeController {

	@Resource
	private AttendanceOvertimeService attendanceOvertimeService;

	@RequestMapping(value = { "/queryAttendanceOvertimeByUserId" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<AttendanceOvertime> queryAttendanceOvertimeByUserId(
			String beginDate, String endDate, HttpServletRequest req) {
		return this.attendanceOvertimeService.queryAttendanceOvertimeByUserId(
				beginDate, endDate, req);
	}

	@RequestMapping(value = { "/addAttendanceOvertime" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrapper addAttendanceOvertime(String createDate,
			HttpServletRequest request) {
		return this.attendanceOvertimeService.addAttendanceOvertime(createDate,
				request);
	}
}
