package com.myoa.controller.event;

import com.myoa.util.Constant;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/timeLineConmon" })
public class TimeLineConmonController {
	@RequestMapping({ "/eventManage" })
	public String EventManage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/event/eventManage";
	}

	@RequestMapping({ "/event" })
	public String Event(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/event/eventIndex";
	}

	@RequestMapping({ "/timeLineEvent" })
	public String TimeLineEvent(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/event/event";
	}

	@RequestMapping({ "/eventSee" })
	public String eventSee(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/event/eventSee";
	}

	@RequestMapping({ "/eventManageIndex" })
	public String eventManageSee(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/event/eventManageIndex";
	}
}
