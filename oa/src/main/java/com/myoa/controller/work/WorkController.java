package com.myoa.controller.work;

import com.myoa.dao.workflow.FlowRunMapper;
import com.myoa.dao.workflow.FlowRunPrcsMapper;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.flowRunFeedback.FlowRunFeedback;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowFast;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.service.ThreadSerivice.ThreadService;
import com.myoa.service.WFE.WFERunner.WFEFlowRun;
import com.myoa.service.WFE.WFERunner.WFEFlowRunInfo;
import com.myoa.service.WFE.WFERunner.WFEFlowRunPrcs;
import com.myoa.service.WFE.WFERunner.WFERunner;
import com.myoa.service.sms.SmsService;
import com.myoa.service.syspara.SysParaService;
import com.myoa.service.work.WorkService;
import com.myoa.service.workflow.flowtype.FlowRunPrcsService;
import com.myoa.util.AjaxJson;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/workflow/work" })
public class WorkController {

	@Resource
	private FlowRunPrcsService flowRunPrcsService;

	@Resource
	private WorkService workService;

	@Resource
	private SmsService smsService;

	@Resource
	private SysParaService sysParaService;

	@Resource
	private FlowRunMapper flowRunMapper;

	@Autowired
	protected WFERunner wfeRunner;

	@Resource
	private WFEFlowRun wfeFlowRun;

	@Resource
	private WFEFlowRunPrcs wfeFlowRunPrcs;

	@Resource
	private FlowRunPrcsMapper flowRunPrcsMapper;

	@Autowired
	private ThreadService threadService;

	@RequestMapping({ "addwork" })
	public String work(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/add_work";
	}

	@RequestMapping({ "workformh5" })
	public String workformh5(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/workformh5";
	}

	@RequestMapping({ "zhuanjiaoh5" })
	public String zhuanjiaoh5(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/zhuanjiaoh5";
	}

	@RequestMapping({ "workformh5PreView" })
	public String workformh5PreView(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/workformh5PreView";
	}

	@RequestMapping({ "turnh5" })
	public String turnh5(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/turnh5";
	}

	@RequestMapping({ "feedback" })
	public String feedback(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/feedback";
	}

	@RequestMapping({ "newflowguider" })
	public String addflowGuider(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/newFlowGuider";
	}

	@RequestMapping({ "workList" })
	public String workList(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/workList";
	}

	@RequestMapping({ "waitwork" })
	public String waitwork(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/waitwork";
	}

	@RequestMapping({ "endwork" })
	public String endwork(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/endwork";
	}

	@RequestMapping({ "allwork" })
	public String allwork(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/allwork";
	}

	@RequestMapping({ "workform" })
	public String workform(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/workform";
	}

	@RequestMapping({ "workform1" })
	public String workform1(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/workform1";
	}

	@RequestMapping({ "workformPreView" })
	public String workformPreView(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/workformPreView";
	}

	@RequestMapping({ "notifyWork" })
	public String notifyWork(HttpServletRequest request) {
		return "app/workflow/work/notifyWork";
	}

	@RequestMapping({ "workDelegate" })
	public String workDelegate(HttpServletRequest request) {
		return "app/workflow/work/workDelegate";
	}

	@RequestMapping({ "/automaticNumbering" })
	public String automaticNumbering() {
		return "app/workflow/work/automaticNumbering";
	}

	@RequestMapping({ "/automaticNumberingOne" })
	public String automaticNumberingOne() {
		return "app/workflow/work/automaticNumberingOne";
	}

	@RequestMapping({ "/numberingAdminister" })
	public String numberingAdminister() {
		return "app/workflow/work/numberingAdminister";
	}

	@RequestMapping({ "/businessApplications" })
	public String businessApplications(HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		if (!this.sysParaService.checkIsHaveSecure(user, Integer.valueOf(5))) {
			return "app/common/development";
		}
		return "app/workflow/work/businessApplications";
	}

	@RequestMapping({ "workfastAdd" })
	@ResponseBody
	public ToJson<FlowFast> fastAdd(HttpServletRequest request, Integer flowId,
			@RequestParam(value = "flowStep", required = false) Integer prcsId,
			@RequestParam(value = "prcsId", required = false) String flowProcs,
			@RequestParam(value = "runId", required = false) String id,
			@RequestParam(value = "runName", required = false) String runName,
			@RequestParam(value = "preView", required = false) String preView) {
		String tableName = request.getParameter("tableName");
		String tabId = request.getParameter("tabId");
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		this.threadService.addNewworkFastAdd(user, flowId.intValue(),
				prcsId.intValue(), flowProcs, id, tableName, tabId, sqlType);
		return this.wfeRunner.getWfeFlowRunInfo().workFastAdd(user,
				flowId.intValue(), prcsId.intValue(), flowProcs, id, request,
				sqlType, runName, preView);
	}

	@RequestMapping({ "createGuide" })
	@ResponseBody
	public AjaxJson createGuide(String flowId, HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.wfeRunner.getWfeFlowRunInfo().createGuide(flowId, user,
				request);
	}

	@RequestMapping({ "nextwork" })
	@ResponseBody
	public ToJson<FlowFast> nextwork(
			HttpServletRequest request,
			@RequestParam(value = "flowId", required = false) String flowId,
			@RequestParam(value = "formdata", required = false) String formdata,
			@RequestParam(value = "modifydata", required = false) String modifydata,
			@RequestParam(value = "formLength", required = false) String formlength,
			@RequestParam(value = "runId", required = false) int runId,
			@RequestParam(value = "runName", required = false) String runName,
			@RequestParam(value = "beginTime", required = false) String beginTime,
			@RequestParam(value = "beginUser", required = false) String beginUser,
			@RequestParam(value = "prcsId", required = false) String prcsId,
			@RequestParam(value = "fromDataReject", required = false) String fromDateReject,
			@RequestParam(value = "tableName", required = false) String tableName,
			@RequestParam(value = "tabId", required = false) String tabId,
			@RequestParam(value = "flowPrcs", required = false) String flowPrcs) {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		return this.wfeRunner.getWfeFlowRunInfo().nextwork(flowId, formdata,
				modifydata, formlength, runId, runName, beginTime, beginUser,
				sqlType, prcsId, fromDateReject, tableName, tabId, flowPrcs,
				request);
	}

	@RequestMapping({ "saveWork" })
	@ResponseBody
	public ToJson<FlowRunPrcs> savework(
			HttpServletRequest request,
			@RequestParam(value = "runId", required = false) String runId,
			@RequestParam(value = "runName", required = false) String runName,
			@RequestParam(value = "flowId", required = false) String flowId,
			@RequestParam(value = "prcsId", required = false) String prcsId,
			@RequestParam(value = "prcsflag", required = false) String prcsFlag,
			@RequestParam(value = "flowPrcs", required = false) String flowPrcs,
			@RequestParam(value = "beginTime", required = false) String beginTime,
			@RequestParam(value = "beginUser", required = false) String beginUser,
			@RequestParam(value = "jingbanUser", required = false) String jingbanUser,
			@RequestParam(value = "currentPrcsId", required = false) String currentPrcsId,
			@RequestParam(value = "orgAdd", required = false) String orgadd,
			@RequestParam(value = "viewUser", required = false) String viewUser,
			@RequestParam(value = "smsContent", required = false) String smsContent,
			@RequestParam(value = "smsType", required = false) String smsType,
			@RequestParam(value = "tableName", required = false) String tableName,
			@RequestParam(value = "tabId", required = false) String tabId,
			@RequestParam(value = "flowStep", required = false) String flowStep) {
		String tuisong = request.getParameter("tuisong");
		String topDefault = request.getParameter("topDefault");
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		this.workService.todoWorkSmsBoby(beginUser, flowPrcs, tableName, runId,
				runName, flowId, prcsId, currentPrcsId, tabId, flowStep,
				smsContent, request, smsType, user, orgadd, jingbanUser,
				viewUser);

		String smsUrl = "/workflow/work/workform?opflag=1&flowId="
				+ Integer.valueOf(flowId) + "&flowStep=" + flowStep + "&runId="
				+ runId + "&prcsId=" + currentPrcsId;
		if ("document".equals(tableName)) {
			smsUrl = "/workflow/work/workform?opflag=1&flowId=" + flowId
					+ "&flowStep=" + flowStep + "&tableName=" + tableName
					+ "&tabId=" + tabId + "&runId=" + runId + "&prcsId="
					+ currentPrcsId + "&isNomalType=false";
			this.smsService.updatequerySmsByType("70", user.getUserId(),
					smsUrl.trim());
		} else {
			this.smsService.updatequerySmsByType("7", user.getUserId(),
					smsUrl.trim());
		}
		return this.wfeRunner.getWfeFlowRunInfo().savework(runId, runName,
				flowId, prcsId, prcsFlag, flowPrcs, beginTime, beginUser,
				jingbanUser, viewUser, user, currentPrcsId, topDefault);
	}

	@RequestMapping({ "selectFlowData" })
	@ResponseBody
	public Map<String, Object> fastAdd(HttpServletRequest request,
			@RequestParam(value = "runId", required = false) String runId,
			@RequestParam(value = "flowId", required = false) String flowId) {
		return this.wfeRunner.getWfeFlowRunInfo().fastAdd(runId, flowId);
	}

	@RequestMapping(value = { "workUpload" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public ToJson<Attachment> workUpload(
			@RequestParam(value = "file", required = false) MultipartFile[] files,
			String module, String runId, HttpServletRequest request) {
		String company = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		return this.wfeRunner.getWfeFlowRunInfo().workUpload(files, company,
				module, runId);
	}

	@RequestMapping(value = { "findworkUpload" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson<Attachment> findworkUpload(HttpServletRequest request,
			String runId) {
		String company = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		if (StringUtils.checkNull(company).booleanValue()) {
			company = "xoa1001";
		}
		String userId = ((Users) SessionUtils.getSessionInfo(
				request.getSession(), Users.class, new Users())).getUserId();
		return this.wfeRunner.getWfeFlowRunInfo()
				.findworkUpload(runId, company);
	}

	@RequestMapping(value = { "workfeedback" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson<FlowRunFeedback> workfeedback(String content, String runId,
			String prcsId, String flowPrcs, HttpServletRequest request) {
		String userId = ((Users) SessionUtils.getSessionInfo(
				request.getSession(), Users.class, new Users())).getUserId();
		return this.wfeRunner.getWfeFlowRunInfo().workfeedback(content, runId,
				prcsId, flowPrcs, userId);
	}

	@RequestMapping(value = { "findworkfeedback" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public AjaxJson findworkfeedback(HttpServletRequest request, String runId,
			String prcsId, String flowPrcs, String signlock) {
		String company = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		String userId = ((Users) SessionUtils.getSessionInfo(
				request.getSession(), Users.class, new Users())).getUserId();
		return this.wfeRunner.getWfeFlowRunInfo().findworkfeedback(runId,
				prcsId, flowPrcs, userId, company, signlock);
	}

	@RequestMapping(value = { "findbranch" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public AjaxJson findBranch(HttpServletRequest request, String flowId,
			String runId, String flowPrcs) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		String currentFlowPrcs = request.getParameter("currentFlowPrcs");
		return this.wfeRunner.getWfeFlowRunInfo().findBranch(flowId, runId,
				flowPrcs, currentFlowPrcs, user);
	}

	@RequestMapping(value = { "deletework" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson delete(String runId, @RequestParam("AID") String aid,
			@RequestParam("MODULE") String module,
			@RequestParam("YM") String ym,
			@RequestParam("ATTACHMENT_ID") String attachmentId,
			@RequestParam("ATTACHMENT_NAME") String attachmentName,
			@RequestParam("COMPANY") String company,
			HttpServletResponse response, HttpServletRequest request) {
		return this.wfeRunner.getWfeFlowRunInfo().delete(runId, aid, module,
				ym, attachmentId, attachmentName, company, response, request);
	}

	@RequestMapping(value = { "getflowprcsdata" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson<FlowRunPrcs> getflowprcsdata(String allowBack, String runId,
			String prcsId, HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.wfeRunner.getWfeFlowRunInfo().getflowprcsdata(allowBack,
				runId, prcsId, user.getUserId());
	}

	@RequestMapping(value = { "insertprcsdata" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public AjaxJson insertprcsdata(String runId, String flowStep,
			String prcsId, String flowPrcs, String feedback,
			HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.wfeRunner.getWfeFlowRunInfo().insertprcsdata(runId,
				flowStep, prcsId, flowPrcs, user, feedback);
	}

	@RequestMapping(value = { "selectWork" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson<FlowRunPrcs> selectObject(
			FlowRunPrcs flowRunPrcs,
			HttpServletRequest request,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		Map maps = new HashMap();
		if (StringUtils.checkNull(flowRunPrcs.getUserId()).booleanValue()) {
			String userId = ((Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users()))
					.getUserId();
			maps.put("userId", userId);
		} else {
			maps.put("userId", flowRunPrcs.getUserId());
		}
		if (!StringUtils.checkNull(flowRunPrcs.getMyworkconditions())
				.booleanValue()) {
			maps.put("myworkconditions", flowRunPrcs.getMyworkconditions());
		}
		return this.wfeRunner.getWfeFlowRunPrcs().selectObject(maps, page,
				pageSize, useFlag);
	}

	@RequestMapping(value = { "selectEndWord" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<FlowRunPrcs> selectEnd(
			FlowRunPrcs flowRunPrcs,
			HttpServletRequest request,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Map maps = new HashMap();
		if (StringUtils.checkNull(flowRunPrcs.getUserId()).booleanValue()) {
			String userId = ((Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users()))
					.getUserId();
			maps.put("userId", userId);
		} else {
			maps.put("userId", flowRunPrcs.getUserId());
		}
		if (!StringUtils.checkNull(flowRunPrcs.getMyworkconditions())
				.booleanValue()) {
			maps.put("myworkconditions", flowRunPrcs.getMyworkconditions());
		}
		return this.wfeRunner.getWfeFlowRunPrcs().selectEnd(maps, page,
				pageSize, useFlag);
	}

	@RequestMapping(value = { "selectHang" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<FlowRunPrcs> selectEndHang(
			FlowRunPrcs flowRunPrcs,
			HttpServletRequest request,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Map maps = new HashMap();
		if (StringUtils.checkNull(flowRunPrcs.getUserId()).booleanValue()) {
			String userId = ((Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users()))
					.getUserId();
			maps.put("userId", userId);
		} else {
			maps.put("userId", flowRunPrcs.getUserId());
		}
		if (!StringUtils.checkNull(flowRunPrcs.getMyworkconditions())
				.booleanValue()) {
			maps.put("myworkconditions", flowRunPrcs.getMyworkconditions());
		}
		return this.wfeRunner.getWfeFlowRunPrcs().selectHang(maps, page,
				pageSize, useFlag);
	}

	@RequestMapping(value = { "selectAll" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<FlowRunPrcs> selectAll(
			FlowRunPrcs flowRunPrcs,
			HttpServletRequest request,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Map maps = new HashMap();
		if (StringUtils.checkNull(flowRunPrcs.getUserId()).booleanValue()) {
			String userId = ((Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users()))
					.getUserId();
			maps.put("userId", userId);
		} else {
			maps.put("userId", flowRunPrcs.getUserId());
		}
		if (!StringUtils.checkNull(flowRunPrcs.getMyworkconditions())
				.booleanValue()) {
			maps.put("myworkconditions", flowRunPrcs.getMyworkconditions());
		}
		return this.wfeRunner.getWfeFlowRunPrcs().selectAll(maps, page,
				pageSize, useFlag);
	}

	@RequestMapping(value = { "deleteRunPrcs" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson<FlowRunPrcs> deleteRunPrcs(FlowRunPrcs flowRunPrcs,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		if (StringUtils.checkNull(flowRunPrcs.getUserId()).booleanValue()) {
			String userId = ((Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users()))
					.getUserId();
			flowRunPrcs.setUserId(userId);
		}
		return this.wfeRunner.getWfeFlowRunPrcs().deleteRunPrcs(flowRunPrcs);
	}

	@RequestMapping({ "procseeDesign" })
	public String procseeDesign(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/procseeDesign";
	}

	@RequestMapping({ "processSpeak" })
	public String processSpeak(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/work/processSpeak";
	}

	@RequestMapping({ "exportFlowRun" })
	@ResponseBody
	public ToJson<FlowFast> exportFlowRun(HttpServletRequest request,
			Integer flowId,
			@RequestParam(value = "flowStep", required = false) Integer prcsId,
			@RequestParam(value = "prcsId", required = false) String flowProcs,
			@RequestParam(value = "runId", required = false) String id,
			@RequestParam(value = "runName", required = false) String runName) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		return this.wfeRunner.getWfeFlowRunInfo().workFastAdd(user,
				flowId.intValue(), prcsId.intValue(), flowProcs, id, request,
				sqlType, runName, null);
	}

	@RequestMapping({ "/exportExcel" })
	@ResponseBody
	public void exportExcel(HttpServletRequest request,
			HttpServletResponse response) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());

		String type = request.getParameter("type");
		this.wfeRunner.getWfeFlowRunInfo().exportExcel(user, type, response);
	}

	@RequestMapping({ "/entrust" })
	@ResponseBody
	public ToJson<FlowRunPrcs> entrust(String runId, String prcsId,
			String toId, String flowPrcs, String opFlag,
			HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.wfeRunner.getWfeFlowRunInfo().entrust(runId, prcsId, toId,
				flowPrcs, opFlag, user);
	}

	@RequestMapping(value = { "entrustWork" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public AjaxJson entrustWork(
			FlowRunPrcs flowRunPrcs,
			HttpServletRequest request,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		Map maps = new HashMap();
		if (StringUtils.checkNull(flowRunPrcs.getUserId()).booleanValue()) {
			String userId = ((Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users()))
					.getUserId();
			maps.put("userId", userId);
		} else {
			maps.put("userId", flowRunPrcs.getUserId());
		}
		if (!StringUtils.checkNull(flowRunPrcs.getMyworkconditions())
				.booleanValue()) {
			maps.put("myworkconditions", flowRunPrcs.getMyworkconditions());
		}
		return this.wfeRunner.getWfeFlowRunPrcs().entrustWork(maps, page,
				pageSize, useFlag);
	}

	@RequestMapping(value = { "monitoring" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public AjaxJson monitoring(
			@RequestParam(value = "runName", required = false) String runName,
			@RequestParam(value = "runId", required = false) Integer runId,
			@RequestParam(value = "flowName", required = false) String flowName,
			@RequestParam(value = "workLevel", required = false) String workLevel,
			@RequestParam(value = "userId", required = false) String userId,
			@RequestParam(value = "status", required = false) String status,
			@RequestParam(value = "flowId", required = false) String flowId,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag,
			@RequestParam(value = "output", required = false) String output,
			HttpServletRequest request, HttpServletResponse response) {
		Map maps = new HashMap();
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		maps.put("runName", runName);
		maps.put("runId", runId);
		maps.put("flowName", flowName);
		maps.put("workLevel", workLevel);
		if ((!StringUtils.checkNull(userId).booleanValue())
				&& (userId.contains(",")))
			maps.put("userId", userId.substring(0, userId.length() - 1));
		else {
			maps.put("userId", userId);
		}
		maps.put("status", status);
		maps.put("flowId", flowId);
		maps.put("currentUid", user.getUid());
		return this.wfeRunner.getWfeFlowRunPrcs().monitoring(maps, page,
				pageSize, useFlag, output, request, response);
	}

	@RequestMapping({ "workMonitoring" })
	public String workMonitoring(HttpServletRequest request) {
		return "app/workflow/work/workMonitor";
	}

	@RequestMapping({ "workAttention" })
	@ResponseBody
	public AjaxJson workAttention(HttpServletRequest request,
			@RequestParam(value = "runId", required = false) Integer runId,
			@RequestParam(value = "userId", required = false) String userId,
			@RequestParam(value = "status", required = false) String status) {
		return this.wfeRunner.getWfeFlowRunInfo().workAttention(runId, userId,
				status);
	}

	@RequestMapping({ "worDelete" })
	@ResponseBody
	public AjaxJson worDelete(HttpServletRequest request,
			@RequestParam(value = "runId", required = false) Integer runId,
			@RequestParam(value = "status", required = false) String status) {
		return this.wfeRunner.getWfeFlowRunInfo().worDelete(runId, status);
	}

	@RequestMapping({ "saveHandle" })
	@ResponseBody
	public AjaxJson saveHandle(HttpServletRequest request,
			@RequestParam(value = "runId", required = false) int runId,
			@RequestParam(value = "prcsId", required = false) String prcsId,
			@RequestParam(value = "flowPrcs", required = false) String flowPrcs) {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		String flowId = request.getParameter("flowId");
		String tableName = request.getParameter("tableName");
		String tabId = request.getParameter("tabId");
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		this.threadService.add0pflagNewWorkFastAdd(user,
				Integer.parseInt(flowId), Integer.parseInt(prcsId), flowPrcs,
				String.valueOf(runId), tableName, tabId, sqlType);
		return this.wfeRunner.getWfeFlowRunInfo().saveHandle(
				Integer.valueOf(runId), prcsId, flowPrcs, user);
	}

	@RequestMapping({ "entrustUser" })
	@ResponseBody
	public ToJson<FlowRunPrcs> entrust(FlowRunPrcs flowRunPrcs,
			String entrstUser) {
		return this.flowRunPrcsService.entrust(flowRunPrcs, entrstUser);
	}

	@RequestMapping({ "updateState" })
	@ResponseBody
	public ToJson<Object> updateState(
			String flag,
			String runId,
			@RequestParam(value = "prcsId", required = false) String prcsId,
			@RequestParam(value = "userId", required = false) String userId,
			@RequestParam(value = "flowPrcs", required = false) String flowPrcs,
			@RequestParam(value = "prcsFlag", required = false) String prcsFlag) {
		ToJson tojson = new ToJson(1, "error");
		try {
			int count = 0;
			Map map = new HashMap();
			if ("1".equals(flag)) {
				map.put("endTime", new Date());
				map.put("delFlag", Integer.valueOf(1));
				map.put("runId", runId);
				count += this.wfeFlowRun.updateState(map);
				this.smsService.querySmsByTypeUpdateRunId("7", runId);
			} else {
				map.put("prcsFlag", "4");
				map.put("deliverTime", new Date());
				map.put("endTime", new Date());
				String[] runIdArr = runId.split(",");
				String[] prcsIdArr = prcsId.split(",");
				String[] prcsFlagArr = prcsFlag.split(",");
				String[] flowPrcsArr = flowPrcs.split(",");
				String[] userIdArr = userId.split(",");
				for (int i = 0; i < runIdArr.length; i++) {
					map.put("runId", runIdArr[i]);
					map.put("forceOver", prcsIdArr[i] + "`" + prcsFlagArr[i]
							+ "`" + flowPrcsArr[i] + "`" + userIdArr[i]);
					count += this.wfeFlowRunPrcs.updateEnd(map);
				}
			}
			if (count > 0) {
				tojson.setFlag(0);
				tojson.setMsg("ok");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tojson;
	}

	@RequestMapping({ "reminders" })
	@ResponseBody
	public ToJson<Object> reminders(Integer id, String userId, String flowPrcs,
			String runId, String runName, String flowId, String prcsId,
			String smsContent, HttpServletRequest request) {
		ToJson tojson = new ToJson(1, "error");
		try {
			Users user = (Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users());
			this.workService.todoWorkSmsBoby(userId, flowPrcs, null, runId,
					runName, flowId, prcsId, null, null, null, smsContent,
					request, "2", user, null, "", "");
			FlowRunPrcs flowRunPrcs = this.flowRunPrcsMapper
					.selectByPrimaryKey(id);
			flowRunPrcs.setIsRemind(Integer.valueOf(1));
			if (StringUtils.checkNull(flowRunPrcs.getDeliverTime())
					.booleanValue()) {
				flowRunPrcs.setDeliverTime("0000-00-00 00:00:00");
			}
			int count = this.flowRunPrcsMapper.upPrcsById(flowRunPrcs);
			if (count > 0) {
				tojson.setFlag(0);
				tojson.setMsg("ok");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tojson;
	}

	@RequestMapping({ "resumeExe" })
	@ResponseBody
	public ToJson resumeExe(Integer runId, Integer id) {
		return this.flowRunPrcsService.resumeExe(runId, id);
	}

	@RequestMapping({ "workBack" })
	@ResponseBody
	public AjaxJson workBack(Integer prcsId, Integer flowPrcs, String runId,
			String userId) {
		return this.wfeFlowRunPrcs.workBack(prcsId, flowPrcs, runId, userId);
	}

	@RequestMapping({ "remindSteps" })
	@ResponseBody
	public AjaxJson remindSteps(Integer prcsId, String runId) {
		return this.wfeFlowRunPrcs.remindSteps(prcsId, runId);
	}
}
