package com.myoa.controller.attend;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myoa.model.attend.AttendEvection;
import com.myoa.model.attend.AttendEvectionFlowRunPrcs;
import com.myoa.service.attend.AttendEvectionService;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

@RestController
@RequestMapping({ "/attendEvection" })
public class AttendEvectionController {

	@Autowired
	private AttendEvectionService attendEvectionService;

	@RequestMapping(value = { "/queryAllAttendEvection" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<AttendEvectionFlowRunPrcs> queryAllAttendEvection(
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
			@RequestParam(name = "useFlag", required = false, defaultValue = "true") Boolean useFlag,
			String allow, HttpServletRequest request) {
		return this.attendEvectionService.queryAllAttendEvection(page,
				pageSize, useFlag, request, allow);
	}

	@RequestMapping(value = { "/addAttendEvection" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper addAttendEvection(String createDate,
			HttpServletRequest request) {
		return this.attendEvectionService
				.addAttendEvection(createDate, request);
	}

	@RequestMapping(value = { "/backlogAttendList" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrappers backlogAttendList(
			HttpServletRequest request,
			String num,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
			@RequestParam(name = "useFlag", required = false, defaultValue = "true") Boolean useFlag) {
		return this.attendEvectionService.backlogAttendList(request, num, page,
				pageSize, useFlag);
	}

	@RequestMapping(value = { "/selectAttendEvectionByUserId" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<AttendEvection> selectAttendEvectionByUserId(
			String beginDate, String endDate, HttpServletRequest req) {
		return this.attendEvectionService.selectAttendEvectionByUserId(
				beginDate, endDate, req);
	}
}
