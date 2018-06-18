package com.myoa.controller.sys;

import com.myoa.service.sys.DangerSysService;
import com.myoa.util.common.wrapper.BaseWrapper;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/danger" })
public class DangerSysController {

	@Autowired
	DangerSysService dangerSysService;

	@RequestMapping({ "/truncate" })
	public BaseWrapper truncateTable(HttpServletRequest request,
			@RequestParam(required = false, name = "menuId[]") String[] menuId) {
		return this.dangerSysService.truncateTable(request, menuId);
	}

	@RequestMapping({ "/truncatePlagiarize" })
	public BaseWrapper truncateTablePlagiarize(HttpServletRequest request,
			@RequestParam(required = false, name = "menuId[]") String[] menuId) {
		return this.dangerSysService.truncateTablePlagiarize(request, menuId);
	}
}
