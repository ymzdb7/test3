package com.myoa.controller.attend;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myoa.model.attend.Attend;
import com.myoa.service.attend.AttendService;
import com.myoa.service.attend.wrapper.AttendSetWrappers;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

@RestController
@RequestMapping({ "/attend" })
public class AttendController {

	@Autowired
	private AttendService attendService;

	@RequestMapping(value = { "/addAttend" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper addAttend(Attend attend, HttpServletRequest req,
			String attendDate, String uid) throws ParseException {
		return this.attendService.newAttend(attend, req, attendDate, uid);
	}

	@RequestMapping(value = { "/seledAttend" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper seledAttend(String attendDate, HttpServletRequest req,
			String uid) {
		String sqlType = Constant.MYOA
				+ (String) req.getSession().getAttribute("loginDateSouse");

		return this.attendService.attendList(attendDate, req, uid, sqlType);
	}

	@RequestMapping(value = { "/attendanceList" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper attendanceList(String date) {
		return this.attendService.mycheckList(date);
	}

	@RequestMapping({ "/myAttendance" })
	public BaseWrapper myAttendance(String date, String uid, String strat,
			String end, HttpServletRequest req) throws ParseException {
		return this.attendService.myAttend(date, uid, strat, end, req);
	}

	@RequestMapping({ "/companyAttendance" })
	public BaseWrapper companyAttendance(String date) {
		return this.attendService.companyAttendance(date);
	}

	@RequestMapping({ "/normalCondition" })
	public BaseWrapper normalCondition(String year, String month,
			HttpServletRequest request) throws ParseException {
		return this.attendService.normalCondition(year, month, request);
	}

	@RequestMapping(value = { "/personalAttendance" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper PersonalAttendance(String date,
			HttpServletRequest request) throws ParseException {
		return this.attendService.PersonalAttendance(date, request);
	}

	@RequestMapping(value = { "/PersonalTodayAttendance" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper PersonalTodayAttendance(String date,
			HttpServletRequest request) throws ParseException {
		return this.attendService.PersonalTodayAttendance(date, request);
	}

	@RequestMapping(value = { "/AttendanceStatistics" }, produces = { "application/json;charset=UTF-8" })
	public AttendSetWrappers AttendanceStatistics(String beginDate,
			String endDate, HttpServletRequest req) throws ParseException {
		return this.attendService.AttendanceStatistics(beginDate, endDate, req);
	}

	@RequestMapping(value = { "/pcAttendanceStatistics" }, produces = { "application/json;charset=UTF-8" })
	public AttendSetWrappers pcAttendanceStatistics(String beiginDate,
			String endDate, String deptId, String dutyType, String deptName,
			String uid, HttpServletRequest req) throws ParseException {
		return this.attendService.pcAttendanceStatistics(beiginDate, endDate,
				deptId, dutyType, uid, req);
	}

	@RequestMapping({ "/selectAttendDate" })
	public ToJson selectAttendDate(Integer uid) {
		return this.attendService.selectAttendDate(uid);
	}
}
