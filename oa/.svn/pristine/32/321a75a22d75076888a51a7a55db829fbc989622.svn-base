package com.myoa.controller.supervision;

import com.myoa.util.Constant;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({ "/SupervCommon" })
@Controller
public class SupervisionCommonController {
	@RequestMapping({ "/MySupervision" })
	public String MySupervision(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/supervise/mySupervision/index";
	}

	@RequestMapping({ "/SupervisionManage" })
	public String SupervisionManage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/supervise/supervisionManage/index";
	}

	@RequestMapping({ "/SupervisionType" })
	public String SupervisionType(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/supervise/supervisionType/index";
	}

	@RequestMapping({ "/Supervisionstatistic" })
	public String Supervisionstatistic(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/supervise/statistic/index";
	}

	@RequestMapping({ "/Supervisionhandle" })
	public String Supervisionhandle(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/supervise/supervisionManage/handle";
	}
}
