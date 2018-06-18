package com.myoa.controller.workflow;

import com.myoa.model.workflow.FlowRule;
import com.myoa.service.workflow.flowRule.FlowRuleService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/flowRule" })
public class FlowRuleController {
	private Logger loger = LoggerFactory.getLogger(FlowRuleController.class);

	@Resource
	private FlowRuleService flowRuleService;

	@ResponseBody
	@RequestMapping({ "/queryFlowRule" })
	public ToJson<FlowRule> queryFlowRule(Integer page, Integer pageSize,
			boolean useFlag) {
		return this.flowRuleService.queryFlowRule(page, pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping(value = { "insertFlowRule" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public ToJson<FlowRule> insertFlowRule(FlowRule flowRule,
			HttpServletRequest request) {
		return this.flowRuleService.insertFlowRule(flowRule);
	}

	@ResponseBody
	@RequestMapping(value = { "updateStatusToStart" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<FlowRule> updateStatusToStart(FlowRule flowRule,
			HttpServletRequest request) {
		return this.flowRuleService.updateStatusToStart(flowRule);
	}

	@ResponseBody
	@RequestMapping(value = { "updateStatusToEnd" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<FlowRule> updateStatusToEnd(FlowRule flowRule,
			HttpServletRequest request) {
		return this.flowRuleService.updateStatusToEnd(flowRule);
	}

	@ResponseBody
	@RequestMapping(value = { "deleteFlowRule" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<FlowRule> deleteFlowRule(FlowRule flowRule) {
		return this.flowRuleService.deleteFlowRule(flowRule);
	}

	@ResponseBody
	@RequestMapping({ "/selectFlowRule" })
	public ToJson<FlowRule> selectFlowRule(String flowName, String userName,
			String toUserName) {
		return this.flowRuleService.selectFlowRule(flowName, userName,
				toUserName);
	}
}
