package com.myoa.controller.common;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myoa.util.Constant;
import com.myoa.util.dataSource.ContextHolder;

@Controller
@Scope("prototype")
@RequestMapping({ "/diary_" })
public class LogUtilController {
	private Logger loger = Logger.getLogger(LogUtilController.class);

	@RequestMapping({ "/index" })
	public String inboxPage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/diary/index";
	}

	@RequestMapping({ "/addbox" })
	public String addboxPage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/diary/writeMail";
	}
}
