package com.myoa.controller.workflow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/flowRunPage" })
public class FlowRunPageController {
	@RequestMapping({ "/queryFlowRun" })
	public String showPage() {
		return "app/workflow/flowRun/queryFlowRun";
	}
}
