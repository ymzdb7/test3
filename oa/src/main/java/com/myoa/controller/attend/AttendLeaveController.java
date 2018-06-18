package com.myoa.controller.attend;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myoa.model.attend.AttendFlowRunPrcs;
import com.myoa.model.attend.AttendLeave;
import com.myoa.service.attend.AttendLeaveService;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

@RestController
@RequestMapping({ "/attendLeave" })
public class AttendLeaveController {

	@Autowired
	private AttendLeaveService attendLeaveService;

	@RequestMapping(value = { "/queryAllAttendLeave" }, produces = { "application/json;charset=UTF-8" })
	ToJson<AttendFlowRunPrcs> queryAllAttendLeave(
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
			@RequestParam(name = "useFlag", required = false, defaultValue = "true") Boolean useFlag,
			String allow, HttpServletRequest request) {
		return this.attendLeaveService.queryAllAttendLeave(page, pageSize,
				useFlag, request, allow);
	}

	@RequestMapping(value = { "/queryAllAttendLeaveFields" }, produces = { "application/json;charset=UTF-8" })
	ToJson<AttendLeave> queryAllAttendLeaveFields(String tableName,
			HttpServletRequest request) {
		return this.attendLeaveService.queryAllAttendLeaveFields(tableName,
				request);
	}

	@RequestMapping({ "/addAttendLeave" })
	BaseWrapper addAttendLeave(String userId, String recordTime,
			HttpServletRequest request) {
		return this.attendLeaveService.addAttendLeave(userId, recordTime,
				request);
	}

	@RequestMapping(value = { "/backlogAttendList" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrappers backlogAttendList(
			HttpServletRequest request,
			String num,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
			@RequestParam(name = "useFlag", required = false, defaultValue = "true") Boolean useFlag) {
		return this.attendLeaveService.backlogAttendList(request, num, page,
				pageSize, useFlag);
	}

	@RequestMapping(value = { "/getAllBydate" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper getAllByDate(HttpServletRequest request,
			String startDate, String endDate, Integer length, String userId) {
		return this.attendLeaveService.getAllByDate(startDate, endDate, length,
				userId);
	}

	@RequestMapping(value = { "/selectAttendLeaveByUserId" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<AttendLeave> selectAttendLeaveByUserId(String beginDate,
			String endDate, HttpServletRequest req) {
		return this.attendLeaveService.selectAttendLeaveByUserId(beginDate,
				endDate, req);
	}

	@RequestMapping(value = { "/getAttendLeaveCount" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper getAttendLeaveCount() {
		return this.attendLeaveService.getAttendLeaveCount();
	}
}
