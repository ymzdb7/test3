package com.myoa.controller.workflow;

import com.myoa.model.workflow.FlowTiggerModel;
import com.myoa.service.flowplugin.FlowPluginService;
import com.myoa.service.workflow.flowtigger.FlowTiggerService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/tigger" })
public class FlowTiggerControlle {

	@Resource
	private FlowTiggerService flowTiggerService;

	@Resource
	private FlowPluginService flowPluginService;

	@RequestMapping(value = { "saveTigger" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public ToJson<FlowTiggerModel> saveTigger(FlowTiggerModel flowTiggerModel,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.flowTiggerService.saveTigger(flowTiggerModel);
	}

	@RequestMapping(value = { "updateTigger" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public ToJson<FlowTiggerModel> updateTigger(
			FlowTiggerModel flowTiggerModel, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.flowTiggerService.updateTigger(flowTiggerModel);
	}

	@RequestMapping(value = { "deleteTigger" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<FlowTiggerModel> deleteTigger(@RequestParam("id") Integer id,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.flowTiggerService.deleteTigger(id);
	}

	@RequestMapping(value = { "showPlugin" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson showPlugin(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.flowPluginService.showPlugin();
	}

	@RequestMapping({ "/modifyFieldProperties" })
	@ResponseBody
	public ToJson<FlowTiggerModel> modifyFieldProperties(String tableName,
			String id, Integer runId) {
		return this.flowTiggerService.modifyFieldProperties(tableName, id,
				runId);
	}
}
