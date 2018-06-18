package com.myoa.controller.menu;

import com.myoa.service.menu.SelectMenuService;
import com.myoa.util.Constant;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.dataSource.ContextHolder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
@Scope("prototype")
public class SelectMenuController {

	@Resource
	private SelectMenuService selectMenuService;
	private int flag;
	private String err = "err";
	private String ok = "ok";

	@ResponseBody
	@RequestMapping(value = { "/showNewMenu" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET }, produces = { "application/json;charset=UTF-8" })
	public BaseWrappers showNew(HttpServletRequest request,
			HttpServletResponse response) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class
				.getName() + ".LOCALE";
		Object locale = request.getSession().getAttribute(
				LOCALE_SESSION_ATTRIBUTE_NAME);

		return this.selectMenuService.getAll("zh_CN");
	}
}