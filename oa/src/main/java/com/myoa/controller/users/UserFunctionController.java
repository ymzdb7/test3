package com.myoa.controller.users;

import com.myoa.controller.menu.MenuController;
import com.myoa.service.users.UserFunctionService;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class UserFunctionController {
	private Logger loger = Logger.getLogger(MenuController.class);

	@Resource
	private UserFunctionService userFunctionService;
}
