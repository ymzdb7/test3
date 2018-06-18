package com.myoa.controller.workflow;

import com.myoa.model.users.Users;
import com.myoa.service.workflow.flowtype.FlowRunService;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrappers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/flowRun" })
public class FlowRunController {

	@Resource
	private FlowRunService flowRunService;

	@RequestMapping({ "/queryFlowRun" })
	public BaseWrappers queryFlowRunList(
			Integer state,
			Integer runId,
			Integer flowId,
			String runName,
			String beginDate,
			String endDate,
			String workLevel,
			String status,
			String userId,
			HttpServletRequest request,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
			@RequestParam(name = "useFlag", required = false, defaultValue = "true") Boolean useFlag,
			@RequestParam(name = "output", required = false, defaultValue = "0") String output,
			HttpServletResponse response) {
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.flowRunService.queryFlowRun(state, runId, flowId, runName,
				beginDate, endDate, workLevel, status, userId, page, pageSize,
				useFlag.booleanValue(), users, output, response, request);
	}

	@RequestMapping({ "/queryFlowRunCount" })
	public BaseWrappers queryFlowRunCount(HttpServletRequest request) {
		return this.flowRunService.queryFlowRunCount(request);
	}
}
