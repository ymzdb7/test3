package com.myoa.controller.example;

import com.myoa.util.Constant;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/bexa" })
public class BodyExample {

	@Value("${app_login_path_php}")
	String b;

	@ResponseBody
	@RequestMapping({ "/json" })
	public BaseWrapper test(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return new BaseWrapper();
	}

	@RequestMapping({ "/view" })
	public String testView(Model model, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		model.addAttribute("name", this.b);
		return "index";
	}
}
