package com.myoa.controller.menu;

import com.myoa.service.menu.MenuService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuFindIdController {

	@Resource
	private MenuService menuService;

	@ResponseBody
	@RequestMapping(value = { "/getMenuId" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Integer> findMaxId(HttpServletRequest request) {
		return this.menuService.findMaxId();
	}
}
