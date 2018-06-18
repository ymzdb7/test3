package com.myoa.controller.attend;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myoa.model.attend.AttendOut;
import com.myoa.model.attend.AttendOutFlowRunPrcs;
import com.myoa.service.attend.AttendOutService;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

@RestController
@RequestMapping({ "/attendOut" })
public class AttendOutController {

	@Autowired
	private AttendOutService attendOutService;

	@RequestMapping(value = { "/queryAllAttendOut" }, produces = { "application/json;charset=UTF-8" })
	ToJson<AttendOutFlowRunPrcs> queryAllAttendOut(
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
			@RequestParam(name = "useFlag", required = false, defaultValue = "true") Boolean useFlag,
			String allow, HttpServletRequest request) {
		return this.attendOutService.queryAllAttendOut(page, pageSize, useFlag,
				request, allow);
	}

	@RequestMapping({ "/addAttendOut" })
	BaseWrapper addAttendOut(String createDate, HttpServletRequest request) {
		return this.attendOutService.addAllAttendOut(createDate, request);
	}

	@RequestMapping(value = { "/backlogAttendList" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrappers backlogAttendList(
			HttpServletRequest request,
			String num,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
			@RequestParam(name = "useFlag", required = false, defaultValue = "true") Boolean useFlag) {
		return this.attendOutService.backlogAttendList(request, num, page,
				pageSize, useFlag);
	}

	@RequestMapping(value = { "/queryAttendOutByUserId" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<AttendOut> queryAttendOutByUserId(String beginDate,
			String endDate, HttpServletRequest req) {
		return this.attendOutService.queryAttendOutByUserId(beginDate, endDate,
				req);
	}
}