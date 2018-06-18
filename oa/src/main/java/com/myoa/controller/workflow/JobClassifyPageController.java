package com.myoa.controller.workflow;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/workflow/flowclassify" })
public class JobClassifyPageController {
	@RequestMapping({ "/index" })
	public String showPage(Model model) {
		return "app/workflow/flowclassify/index";
	}
}
