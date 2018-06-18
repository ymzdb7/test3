package com.myoa.controller.attend;

import com.myoa.util.Constant;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/attendPage" })
public class AttendPageController {
	@RequestMapping({ "/myAttendance" })
	public String myAttendance(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/myAttendance";
	}

	@RequestMapping({ "/backlogAttendLeave" })
	public String backlogAttendLeave(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/attendLeave/backlogAttendLeave";
	}

	@RequestMapping({ "/myAttendLeave" })
	public String myAttendLeave(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/attendLeave/myAttendLeave";
	}

	@RequestMapping({ "/myAttendEvection" })
	public String myAttendEvection(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/myAttendEvection";
	}

	@RequestMapping({ "/myAttendOut" })
	public String myAttendOut(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/myAttendOut";
	}

	@RequestMapping({ "/attendance" })
	public String attendance(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/statistic/index";
	}

	@RequestMapping({ "/personnelStatistics" })
	public String personnelStatistics(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/statistic/personnelStatistics";
	}

	@RequestMapping({ "/details" })
	public String details(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/statistic/details";
	}

	@RequestMapping({ "/leaveManagement" })
	public String leaveManagement(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/statistic/leaveManagement";
	}

	@RequestMapping({ "/reportForm" })
	public String reportForm(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/statistic/reportForm";
	}

	@RequestMapping({ "/detailsTtendance" })
	public String detailsTtendance(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/attend/statistic/myAttendance";
	}
}
