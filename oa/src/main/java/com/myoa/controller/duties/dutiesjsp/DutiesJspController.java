package com.myoa.controller.duties.dutiesjsp;

import com.myoa.util.Constant;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/duties" })
public class DutiesJspController {
	@RequestMapping({ "/dutiesjsp" })
	public String companyInfo(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/duties";
	}
}
