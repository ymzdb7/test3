package com.myoa.controller.workflow;

import com.myoa.model.workflow.FlowSort;
import com.myoa.service.workflow.flowSort.FlowSortService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/flowSort" })
public class FlowSortController {

	@Resource
	private FlowSortService flowSortService;

	@ResponseBody
	@RequestMapping({ "/getFlowTypes" })
	public ToJson<FlowSort> getFlowTypes() {
		return this.flowSortService.getFlowTypes();
	}

	@ResponseBody
	@RequestMapping({ "/getSortAndType" })
	public ToJson<FlowSort> getSortAndType() {
		return this.flowSortService.getSortAndType();
	}
}
