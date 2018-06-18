package com.myoa.controller.workflow;

import com.myoa.service.workflow.flowsetting.FlowSettingService;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/flowSetDatas" })
public class FlowSettingController {

	@Autowired
	FlowSettingService privService;

	@RequestMapping({ "/getFlowPrivList" })
	public BaseWrappers getFlowPrivDatas(Integer flowId) {
		return this.privService.queryFlowPriv(flowId);
	}

	@RequestMapping({ "/newFlowPriv" })
	public BaseWrapper newFlowPrivData(Integer privType,
			@RequestParam(name = "scope[]", required = false) Integer[] scope,
			@RequestParam(name = "user[]", required = false) Integer[] user,
			@RequestParam("role[]") Integer[] role,
			@RequestParam(name = "dept[]", required = false) Integer[] dept,
			Integer flowId) {
		return this.privService.newFlowPriv(privType, scope, user, role, dept,
				flowId);
	}

	@RequestMapping({ "/updateFlowPriv" })
	public BaseWrapper updateFlowPriv(Integer privType,
			@RequestParam(name = "scope[]", required = false) Integer[] scope,
			@RequestParam(name = "user[]", required = false) Integer[] user,
			@RequestParam(name = "role[]", required = false) Integer[] role,
			@RequestParam(name = "dept[]", required = false) Integer[] dept,
			Integer flowId, Integer privId) {
		return this.privService.updateFlowPriv(privType, scope, user, role,
				dept, flowId, privId);
	}

	@RequestMapping({ "/deleteFlowPriv" })
	public BaseWrapper deleteFlowPriv(
			@RequestParam(name = "privId[]", required = false) Integer[] privId) {
		return this.privService.deleteFlowPriv(privId);
	}

	@RequestMapping({ "/getFlowTimerList" })
	public BaseWrappers getFlowTimerDatas(Integer flowId) {
		return this.privService.queryFlowTimer(flowId);
	}

	@RequestMapping({ "/newFlowTimer" })
	public BaseWrapper newFlowTimer(Integer flowId, Integer type, String date,
			@RequestParam(name = "user[]", required = false) Integer[] user,
			@RequestParam(name = "dept[]", required = false) Integer[] dept,
			@RequestParam(name = "role[]", required = false) Integer[] role) {
		return this.privService.newFlowTimer(flowId, type, date, user, dept,
				role);
	}

	@RequestMapping({ "/updateFlowTimer" })
	public BaseWrapper updateFlowTimer(Integer timerId, Integer flowId,
			Integer type, String date,
			@RequestParam(name = "user[]", required = false) Integer[] user,
			@RequestParam(name = "dept[]", required = false) Integer[] dept,
			@RequestParam(name = "role[]", required = false) Integer[] role) {
		return this.privService.updateFlowTimer(timerId, flowId, type, date,
				user, dept, role);
	}

	@RequestMapping({ "/deleteFlowTimer" })
	public BaseWrapper deleteFlowTimer(
			@RequestParam(name = "timerId[]", required = false) Integer[] timerId) {
		return this.privService.deleteFlowTimer(timerId);
	}

	@RequestMapping({ "/getFlowQueryTplList" })
	public BaseWrappers getFlowQueryTpl(Integer flowId) {
		return this.privService.getFlowQueryTpl(flowId);
	}

	@RequestMapping({ "/newFlowQuertTpl" })
	public BaseWrapper newFlowQuertTpl(HttpServletRequest request,
			String tplName, Integer flowId, String viewFields,
			String groupFields, String dataConditions, String flowConditions,
			String dataXml, String condFormula) {
		return this.privService.newFlowQuertIpl(request, tplName, flowId,
				viewFields, groupFields, dataConditions, flowConditions,
				dataXml, condFormula);
	}

	@RequestMapping({ "/updateFlowQuertTpl" })
	public BaseWrapper updateFlowQuertTpl(Integer tplId,
			HttpServletRequest request, String tplName, Integer flowId,
			String viewFields, String groupFields, String dataConditions,
			String flowConditions, String dataXml, String condFormula) {
		return this.privService.updateFlowQuertTpl(tplId, request, tplName,
				flowId, viewFields, groupFields, dataConditions,
				flowConditions, dataXml, condFormula);
	}

	@RequestMapping({ "/queryFlowQuertTplById" })
	public BaseWrapper queryFlowQuertTplById(Integer tplId) {
		return this.privService.queryFlowQuertTplById(tplId);
	}

	@RequestMapping({ "/deleteFlowQuertTpl" })
	public BaseWrapper deleteFlowQuertTpl(
			@RequestParam(name = "tplId[]", required = false) Integer[] tplId) {
		return this.privService.deleteFlowQuertTpl(tplId);
	}

	@RequestMapping({ "/getFlowPrintTpl" })
	public BaseWrappers getFlowPrintTpl(Integer flowId) {
		return this.privService.getFlowPrintTpl(flowId);
	}

	@RequestMapping({ "/newFlowPrintTpl" })
	public BaseWrapper newFlowPrintTpl(Integer flowId, Integer tType,
			String tName, String content, String flowPrcs) {
		return this.privService.newFlowPrintTpl(flowId, tType, tName, content,
				flowPrcs);
	}

	@RequestMapping({ "/updateFlowPrintTpl" })
	public BaseWrapper updateFlowPrintTpl(Integer tId, Integer flowId,
			Integer tType, String tName, String content, String flowPrcs) {
		return this.privService.updateFlowPrintTpl(tId, flowId, tType, tName,
				content, flowPrcs);
	}

	@RequestMapping({ "/deleteFlowPrintTpl" })
	public BaseWrapper deleteFlowPrintTpl(
			@RequestParam(name = "tId[]", required = false) Integer[] tId) {
		return this.privService.deleteFlowPrintTpl(tId);
	}
}
