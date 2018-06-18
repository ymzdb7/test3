package com.myoa.controller.hr;

import com.myoa.util.Constant;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/hr/query" })
public class HrStaffInfoQueryController {
	@RequestMapping({ "/main" })
	public String main(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/queryHrStaffInfo/queryHrMain";
	}

	@RequestMapping({ "/hrOn" })
	public String hrOn(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/queryHrStaffInfo/hr_on";
	}

	@RequestMapping({ "/hr_onLineFind" })
	public String onFind(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/queryHrStaffInfo/hr_onLineFind";
	}

	@RequestMapping({ "/personInfo" })
	public String personInfo(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/queryHrStaffInfo/personInfo";
	}

	@RequestMapping({ "/hrLeave" })
	public String hrLeave(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/queryHrStaffInfo/hr_leave";
	}

	@RequestMapping({ "/hr_LeaveLineFind" })
	public String hrLeaveFind(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/queryHrStaffInfo/hr_leaveLineFind";
	}

	@RequestMapping({ "/queryHr/index" })
	public String index(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/queryHrInfo/index";
	}

	@RequestMapping({ "/queryHr/staffPersonInfo" })
	public String staffPersonInfo(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/queryHrInfo/staffPersonInfo";
	}

	@RequestMapping({ "/queryHr/contractInfo" })
	public String contractInfo(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/queryHrInfo/contractInfo";
	}

	@RequestMapping({ "/attend/attendanceRecord" })
	public String attendanceRecord(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/hr/attendanceRecord/attendanceRecord";
	}
}