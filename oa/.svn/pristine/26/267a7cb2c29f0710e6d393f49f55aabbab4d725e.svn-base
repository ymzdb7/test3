package com.myoa.controller.document;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.document.DocumentModel;
import com.myoa.model.document.DocumentModelWithBLOBs;
import com.myoa.model.document.SysRuleModel;
import com.myoa.model.users.Users;
import com.myoa.service.document.DocumentSerivce;
import com.myoa.service.work.WorkService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.dataSource.ContextHolder;
import com.myoa.util.page.PageParams;

@Controller
@RequestMapping({ "/document" })
public class DocumentController {

	@Resource
	DocumentSerivce documentSerivce;

	@Resource
	WorkService workService;

	@RequestMapping({ "/mine" })
	public String index(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/document/mine";
	}

	@RequestMapping({ "/newDocument" })
	public String newDocument() {
		return "app/document/newDocument";
	}

	@RequestMapping({ "/pageTesting" })
	public String pageTesting() {
		return "app/officialDocument/pageTesting";
	}

	@RequestMapping({ "/makeADraft" })
	public String makeADraft() {
		return "app/officialDocument/dispatch/makeADraft";
	}

	@RequestMapping({ "/draftArticlesOfCommunication" })
	public String draftArticlesOfCommunication() {
		return "app/officialDocument/dispatch/draftArticlesOfCommunication";
	}

	@RequestMapping({ "/IthasBeenDone" })
	public String IthasBeenDone() {
		return "app/officialDocument/dispatch/IthasBeenDone";
	}

	@RequestMapping({ "/ISentAMessage" })
	public String ISentAMessage() {
		return "app/officialDocument/dispatch/ISentAMessage";
	}

	@RequestMapping({ "/addresseeRegistrationForm" })
	public String addresseeRegistrationForm() {
		return "app/officialDocument/incomingDispatches/addresseeRegistrationForm";
	}

	@RequestMapping({ "/inAbeyance" })
	public String inAbeyance() {
		return "app/officialDocument/incomingDispatches/inAbeyance";
	}

	@RequestMapping({ "/myInReply" })
	public String myInReply() {
		return "app/officialDocument/incomingDispatches/myInReply";
	}

	@RequestMapping({ "/received" })
	public String received() {
		return "app/officialDocument/incomingDispatches/received";
	}

	@RequestMapping({ "/theOfficialDocumentQuery" })
	public String theOfficialDocumentQuery() {
		return "app/officialDocument/theOfficialDocumentQuery";
	}

	@RequestMapping({ "/documentsSupervisor" })
	public String documentsSupervisor() {
		return "app/officialDocument/documentsSupervisor";
	}

	@RequestMapping({ "/officialDocumentSet" })
	public String officialDocumentSet() {
		return "app/officialDocument/officialDocumentSet";
	}

	@RequestMapping({ "/theOfficialStatistics" })
	public String theOfficialStatistics() {
		return "app/officialDocument/theOfficialStatistics";
	}

	@RequestMapping({ "/saveRule" })
	@ResponseBody
	public ToJson<SysRuleModel> saveSysrule(SysRuleModel sysRule,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		if (sysRule != null) {
			if ((sysRule.getDigit() == null) || ("".equals(sysRule.getDigit()))) {
				tojson.setMsg("保存失败，位数没有填写");
				tojson.setFlag(1);
				return tojson;
			}
			if ((sysRule.getCode() == null) || ("".equals(sysRule.getCode()))) {
				tojson.setMsg("保存失败，唯一标识没有填写");
				tojson.setFlag(1);
				return tojson;
			}
		}
		SysRuleModel ruleByCode = this.documentSerivce.getRuleByCode(sysRule);
		if ((ruleByCode != null) && (ruleByCode.getCode() != null)) {
			tojson.setMsg("保存失败，存在相同为唯一标识");
			tojson.setFlag(1);
		} else {
			int result = this.documentSerivce.saveSysRule(sysRule);
			if (result == 1) {
				tojson.setMsg("保存成功");
				tojson.setFlag(0);
			} else {
				tojson.setMsg("保存失败");
				tojson.setFlag(1);
			}
		}

		return tojson;
	}

	@RequestMapping({ "/deleteRule" })
	@ResponseBody
	public ToJson<SysRuleModel> deleteRule(SysRuleModel sysRule,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		int result = this.documentSerivce.deleteSysRule(sysRule);
		if (result == 1) {
			tojson.setMsg("删除成功");
			tojson.setFlag(0);
		} else {
			tojson.setMsg("删除失败");
			tojson.setFlag(1);
		}
		return tojson;
	}

	@RequestMapping({ "/updateRule" })
	@ResponseBody
	public ToJson<SysRuleModel> updateRule(SysRuleModel sysRule,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		SysRuleModel ruleByCode = this.documentSerivce.getRuleByCode(sysRule);
		if ((ruleByCode != null)
				&& (!ruleByCode.getId().equals(sysRule.getId()))) {
			tojson.setMsg("修改失败，存在相同为唯一标识");
			tojson.setFlag(1);
		} else {
			int result = this.documentSerivce.updateRuleById(sysRule);
			if (result == 1) {
				tojson.setMsg("修改成功");
				tojson.setFlag(0);
			} else {
				tojson.setMsg("修改失败");
				tojson.setFlag(1);
			}
		}
		return tojson;
	}

	@RequestMapping({ "/getRuleById" })
	@ResponseBody
	public ToJson<SysRuleModel> getRuleById(SysRuleModel sysRule,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		SysRuleModel result = this.documentSerivce
				.getRuleById(sysRule, request);
		if (result != null) {
			tojson.setObject(result);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		}
		return tojson;
	}

	@RequestMapping({ "/getRuleAll" })
	@ResponseBody
	public ToJson<SysRuleModel> getRuleAll(SysRuleModel sysRule,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		List result = this.documentSerivce.getRuleAll(sysRule);

		if (result != null) {
			tojson.setFlag(0);
			tojson.setMsg("ok");
			tojson.setObj(result);
		} else {
			tojson.setFlag(1);
			tojson.setMsg("null");
			tojson.setObj(result);
		}

		return tojson;
	}

	@ResponseBody
	@RequestMapping({ "/updateCount" })
	public ToJson<SysRuleModel> addCount(HttpServletRequest request,
			SysRuleModel sysRuleModel) {
		ToJson json = new ToJson();
		try {
			SysRuleModel ruleById = this.documentSerivce.getRuleById(
					sysRuleModel, request);
			Integer newCounter = Integer.valueOf(ruleById.getCounter()
					.intValue() + 1);
			ruleById.setCounter(newCounter);
			this.documentSerivce.updateRuleById(ruleById);
			json.setObject(ruleById);
			json.setFlag(0);
			json.setMsg("ok");
		} catch (Exception e) {
			e.printStackTrace();
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/codeIfUse" })
	public ToJson<SysRuleModel> codeIfUse(SysRuleModel sysRuleModel) {
		ToJson json = new ToJson();
		try {
			SysRuleModel ruleByCode = this.documentSerivce
					.getRuleByCode(sysRuleModel);
			if (ruleByCode != null) {
				json.setFlag(1);
				json.setMsg("已被使用");
			} else {
				json.setFlag(0);
				json.setMsg("未被使用");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}

	@RequestMapping({ "/saveDoc" })
	@ResponseBody
	public ToJson<Object> saveDocument(
			Integer fflowId,
			@RequestParam(value = "fflowStep", required = false) Integer fflowStep,
			@RequestParam(value = "fprcsId", required = false) String fprcsId,
			@RequestParam(value = "frunName", required = false) String frunName,
			DocumentModelWithBLOBs document, HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		String userId = (String) request.getSession().getAttribute("userId");
		Integer deptId = (Integer) request.getSession().getAttribute("deptId");
		document.setCurUserId(userId);
		document.setCreater(userId);
		document.setCreateDept(String.valueOf(deptId));
		ToJson result = this.documentSerivce.saveDocument(user, fflowId,
				fflowStep, fprcsId, frunName, document, request);
		return result;
	}

	@RequestMapping({ "/deleteDoc" })
	@ResponseBody
	public ToJson<DocumentModelWithBLOBs> deleteDocument(
			DocumentModelWithBLOBs document, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		int result = this.documentSerivce.deleteDocument(document);
		if (result == 1) {
			tojson.setMsg("删除成功");
			tojson.setFlag(0);
		} else {
			tojson.setMsg("删除失败");
			tojson.setFlag(1);
		}
		return tojson;
	}

	@RequestMapping({ "/updateDoc" })
	@ResponseBody
	public ToJson<DocumentModelWithBLOBs> updateDocument(
			DocumentModelWithBLOBs document, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		int result = this.documentSerivce.updateDocument(document);
		if (result == 1) {
			tojson.setMsg("修改成功");
			tojson.setFlag(0);
		} else {
			tojson.setMsg("修改失败");
			tojson.setFlag(1);
		}
		return tojson;
	}

	@RequestMapping({ "/selectDocById" })
	@ResponseBody
	public ToJson<DocumentModelWithBLOBs> selectDocumentById(
			DocumentModelWithBLOBs document, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));
		ToJson tojson = new ToJson();
		try {
			DocumentModelWithBLOBs resultDocument = this.documentSerivce
					.selectDocumentById(request, document);
			tojson.setObject(resultDocument);
			tojson.setFlag(0);
			tojson.setMsg("ok");
		} catch (Exception e) {
			e.printStackTrace();
			tojson.setFlag(1);
			tojson.setMsg("err");
		}
		return tojson;
	}

	@RequestMapping({ "/selectDocSelective" })
	@ResponseBody
	public BaseWrappers selectDocSelective(Integer documentType, String title,
			Integer flowId, String dispatchType, String urgency,
			String secrecy, String userId, String deptId, String createTime,
			Integer status, PageParams pageParams, HttpServletRequest request) {
		return this.documentSerivce.selectDocSelective(documentType, title,
				flowId, dispatchType, urgency, secrecy, userId, deptId,
				createTime, status, pageParams, request);
	}

	@RequestMapping({ "/selectDocAll" })
	@ResponseBody
	public ToJson<DocumentModelWithBLOBs> selectDocAll(
			DocumentModelWithBLOBs document, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));
		ToJson tojson = new ToJson();
		List resultDocument = this.documentSerivce.selectDocAll(document);
		tojson.setObj(resultDocument);
		tojson.setFlag(0);
		return tojson;
	}

	@RequestMapping({ "/selectBacklogDoc" })
	@ResponseBody
	public ToJson<DocumentModelWithBLOBs> selectBacklogDoc(
			HttpServletRequest request) {
		ToJson tojson = new ToJson();
		tojson.setFlag(0);
		return tojson;
	}

	@RequestMapping({ "/selectBacklogingDoc" })
	@ResponseBody
	public ToJson<DocumentModelWithBLOBs> selectBacklogingDoc(
			HttpServletRequest request) {
		ToJson tojson = new ToJson();
		tojson.setFlag(0);
		return tojson;
	}

	@RequestMapping({ "/selectBacklogedDoc" })
	@ResponseBody
	public ToJson<DocumentModelWithBLOBs> selectBacklogedDoc(
			HttpServletRequest request) {
		ToJson tojson = new ToJson();
		tojson.setFlag(0);
		return tojson;
	}

	@RequestMapping({ "/seleDocSendReceive" })
	@ResponseBody
	public ToJson<DocumentModelWithBLOBs> seleDocSendReceive(
			String documentType, String curUserID, String allUserID,
			String dispatchType, String printDate, HttpServletRequest request,
			@RequestParam("page") Integer page,
			@RequestParam("pageSize") Integer pageSize,
			@RequestParam("useFlag") Boolean useFlag) {
		return this.documentSerivce.seleDocSendReceive(documentType, curUserID,
				allUserID, dispatchType, printDate, request, page, pageSize,
				useFlag);
	}

	@RequestMapping({ "/selMyDocSendOrReceive" })
	@ResponseBody
	public BaseWrappers selMyDocSendOrReceive(
			HttpServletRequest request,
			String documentType,
			String dispatchType,
			String printDate,
			String title,
			Integer docStatus,
			@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
		return this.documentSerivce.selMyDocSendOrReceive(request,
				documentType, dispatchType, printDate, title, docStatus, page,
				pageSize);
	}

	@RequestMapping({ "/getRunName" })
	@ResponseBody
	public BaseWrapper getRunName(HttpServletRequest request, Integer flowId,
			@RequestParam(value = "flowStep", required = false) Integer prcsId,
			@RequestParam(value = "prcsId", required = false) String flowProcs) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.workService.getRunName(user, flowId, prcsId, flowProcs);
	}

	@RequestMapping({ "/selWillDocSendOrReceive" })
	@ResponseBody
	public BaseWrappers selWillDocSendOrReceive(
			HttpServletRequest request,
			String documentType,
			String dispatchType,
			String printDate,
			String title,
			Integer docStatus,
			@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
		return this.documentSerivce.selWillDocSendOrReceive(request,
				documentType, dispatchType, printDate, title, docStatus, page,
				pageSize, DocumentSerivce.PRCS_FLAG_WILL);
	}

	@RequestMapping({ "/selOverDocSendOrReceive" })
	@ResponseBody
	public BaseWrappers selOverDocSendOrReceive(
			HttpServletRequest request,
			String documentType,
			String dispatchType,
			String printDate,
			String title,
			Integer docStatus,
			@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
		return this.documentSerivce.selWillDocSendOrReceive(request,
				documentType, dispatchType, printDate, title, docStatus, page,
				pageSize, DocumentSerivce.PRCS_FLAG_OVER);
	}

	@RequestMapping({ "/selOverDocSendOrReceiveOnly" })
	@ResponseBody
	public BaseWrappers selOverDocSendOrReceiveNew(
			HttpServletRequest request,
			String documentType,
			String dispatchType,
			String printDate,
			String title,
			Integer docStatus,
			@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
		return this.documentSerivce.selOverDocSendOrReceive(request,
				documentType, dispatchType, printDate, title, docStatus, page,
				pageSize, DocumentSerivce.PRCS_FLAG_OVER);
	}

	@RequestMapping({ "/selOverseeTheOfficialDocument" })
	@ResponseBody
	public BaseWrappers selOverseeTheOfficialDocument(
			HttpServletRequest request,
			String documentType,
			String dispatchType,
			String computationNumber,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
			@RequestParam(name = "useFlag", required = false, defaultValue = "true") Boolean useFlag) {
		return this.documentSerivce.selOverseeTheOfficialDocument(request,
				documentType, dispatchType, computationNumber, page, pageSize,
				useFlag);
	}

	@RequestMapping({ "/addDocSendSms" })
	@ResponseBody
	public BaseWrappers addDocSendSms(HttpServletRequest req, String cuName,
			String allName, String title, String classify, String flowId,
			String prcsId, String flowStep, String runId) {
		return this.documentSerivce.addDocSendSms(req, cuName, allName, title,
				classify, flowId, prcsId, flowStep, runId);
	}

	@ResponseBody
	@RequestMapping({ "/getDocumentEditPriv" })
	public ToJson<DocumentModel> getDocumentEditPriv(Integer id) {
		return this.documentSerivce.getDocumentEditPriv(id);
	}

	@RequestMapping({ "/SealIndex" })
	public String SealIndex() {
		return "app/document/SealIndex";
	}

	@RequestMapping({ "/SealNew" })
	public String newSeal() {
		return "app/document/index";
	}

	@RequestMapping({ "/SealSetting" })
	public String SealSetting() {
		return "app/document/Sealsetting";
	}

	@RequestMapping({ "/SealLog" })
	public String SealLog() {
		return "app/document/SealLog";
	}

	@ResponseBody
	@RequestMapping({ "/selectTimeOutDoc" })
	public BaseWrappers selectTimeOutDoc(HttpServletRequest request) {
		return this.documentSerivce.selectTimeOutDoc(request);
	}

	@RequestMapping({ "/sealManagerIndex" })
	public String sealManagerIndex() {
		return "app/document/sealManager";
	}
}
