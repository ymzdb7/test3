package com.myoa.controller.workflow;

import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowProcess;
import com.myoa.model.workflow.FlowProcessList;
import com.myoa.service.WFE.WFEFactory.WFEFlowProcess;
import com.myoa.service.workflow.flowtype.FlowProcessService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.dataSource.ContextHolder;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping({ "/flowProcess" })
public class FlowProcessController {

	@Resource
	private FlowProcessService flowProcessService;

	@Autowired
	private WFEFlowProcess wfeFlowProcess;

	@ResponseBody
	@RequestMapping(value = { "findFlow" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<FlowProcess> findFlow(@RequestParam("id") int id,
			HttpServletRequest request) {
		SessionUtils.getSessionInfo(request.getSession(), Users.class,
				new Users());
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			FlowProcess flowProcess = this.flowProcessService.find(id);
			json.setObject(flowProcess);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "saveFlow" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public ToJson<FlowProcess> saveFlow(FlowProcess flowProcess,
			HttpServletRequest request) {
		SessionUtils.getSessionInfo(request.getSession(), Users.class,
				new Users());
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.flowProcessService.updateByPrimaryKeySelective(flowProcess);
	}

	@ResponseBody
	@RequestMapping(value = { "insert" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public ToJson<FlowProcess> insert(FlowProcess flowProcess,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		SessionUtils.getSessionInfo(request.getSession(), Users.class,
				new Users());
		return this.flowProcessService.insertSelective(flowProcess);
	}

	@ResponseBody
	@RequestMapping(value = { "doedit" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<FlowProcess> doedit(int id, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		SessionUtils.getSessionInfo(request.getSession(), Users.class,
				new Users());
		ToJson json = new ToJson(0, null);
		try {
			FlowProcess flowProcess = this.flowProcessService.find(id);
			json.setObject(flowProcess);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "findFlowId" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<FlowProcess> findFlowId(@RequestParam("flowId") int flowId,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		SessionUtils.getSessionInfo(request.getSession(), Users.class,
				new Users());
		ToJson json = new ToJson(0, null);
		try {
			List list = this.flowProcessService.findFlowId(flowId);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "delete" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<FlowProcess> delete(@RequestParam("id") int id,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		SessionUtils.getSessionInfo(request.getSession(), Users.class,
				new Users());

		String prcsId = request.getParameter("prcsId");

		return this.flowProcessService.delete(id, prcsId);
	}

	@ResponseBody
	@RequestMapping(value = { "flowview" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<FlowProcessList> flowview(
			@RequestParam("flowId") Integer flowId,
			@RequestParam(value = "runId", required = false) Integer runId,
			@RequestParam(value = "userId", required = false) String userId,
			@RequestParam(value = "showType", required = false, defaultValue = "0") Integer showType,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		if (StringUtils.checkNull(userId).booleanValue()) {
			userId = ((Users) SessionUtils.getSessionInfo(request.getSession(),
					Users.class, new Users())).getUserId();
		}
		if (showType.intValue() == 0) {
			return this.wfeFlowProcess.flowView(flowId, runId, userId);
		}
		return this.wfeFlowProcess.myFlowView(flowId, runId, userId);
	}

	@RequestMapping(value = { "updateTopAndLeft" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<FlowProcess> updateTopAndLeft(FlowProcess flowProcess,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		SessionUtils.getSessionInfo(request.getSession(), Users.class,
				new Users());
		return this.flowProcessService.updateTopAndLeft(flowProcess);
	}

	@RequestMapping(value = { "deleteTopAndLeft" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson<FlowProcess> deleteTopAndLeft(FlowProcess flowProcess,
			@RequestParam("toPrcsLine") String toPrcsLine,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		SessionUtils.getSessionInfo(request.getSession(), Users.class,
				new Users());
		return this.flowProcessService.findPrcessLine(flowProcess, toPrcsLine);
	}

	@RequestMapping(value = { "xs" }, produces = { "application/json;charset=UTF-8" })
	public String xs() {
		return "app/workflow/flowprocess/flowProcess";
	}

	@RequestMapping({ "/getFlowAttachment" })
	@ResponseBody
	public ToJson getFlowAttachment(HttpServletRequest request, String runId) {
		String company = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		return this.flowProcessService.getFlowAttachment(runId, company);
	}

	@RequestMapping({ "/getFlowFeedBack" })
	@ResponseBody
	public ToJson getFlowFeedBack(String runId) {
		return this.flowProcessService.selectFlowFeedBackByRunId(runId);
	}

	@RequestMapping(value = { "getFlowRunPrecsAll" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrappers getFlowRunPrecsAll(String runId) {
		return this.flowProcessService.getFlowRunPrecsAll(runId);
	}
}
