package com.myoa.controller.workflow;

import com.myoa.model.users.Users;
import com.myoa.service.syspara.SysParaService;
import com.myoa.util.common.session.SessionUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/workflow/formtype" })
public class FlowFormTypePageController {

	@Resource
	SysParaService sysParaService;

	@RequestMapping({ "/index" })
	public String showPage(HttpServletRequest request, Model model) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		if (!this.sysParaService.checkIsHaveSecure(user, Integer.valueOf(8))) {
			return "app/common/development";
		}
		return "app/workflow/formtype/index";
	}

	@RequestMapping({ "/control" })
	public String control(HttpServletRequest request) {
		return "app/workflow/formtype/control";
	}
}
