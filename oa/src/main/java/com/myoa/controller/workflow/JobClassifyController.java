package com.myoa.controller.workflow;

import com.myoa.service.workflow.JobClassifyService;
import com.myoa.service.workflow.wrapper.JobSelectorWrapper;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/workflow" })
public class JobClassifyController {

	@Autowired
	JobClassifyService service;

	@RequestMapping({ "/flowclassify/form" })
	public JobSelectorWrapper getSeletorInfo(HttpServletRequest request) {
		return this.service.getJobSelector(request.getSession());
	}

	@RequestMapping({ "/flowclassify/flow" })
	public JobSelectorWrapper getFlowInfo(HttpServletRequest request) {
		return this.service.getFlowsort(request.getSession());
	}

	@RequestMapping({ "/flowclassify/flowByAuth" })
	public JobSelectorWrapper getFlowSortByAuth(HttpServletRequest request) {
		return this.service.getFlowsortByAuth(request);
	}

	@RequestMapping({ "/mobile/flowclassify/flowByAuth" })
	public BaseWrappers getFlowSortByAuthWithMobile(HttpServletRequest request) {
		return this.service.getFlowSortByAuthWithMobile(request);
	}

	@RequestMapping({ "/flowclassify/formSave" })
	public BaseWrapper insertForm(
			@RequestParam(defaultValue = "0", required = false) Integer parentId,
			Integer sortNo,
			String formName,
			@RequestParam(defaultValue = "0", required = false) Integer departmentId) {
		return this.service
				.insertForm(parentId, sortNo, formName, departmentId);
	}

	@RequestMapping({ "/flowclassify/flowSave" })
	public BaseWrapper insertFlow(
			@RequestParam(defaultValue = "0", required = false) Integer parentId,
			Integer sortNo,
			String flowName,
			@RequestParam(defaultValue = "0", required = false) Integer departmentId,
			String sortMainType, String sortDetailType) {
		return this.service.insertFlow(parentId, sortNo, flowName,
				departmentId, sortMainType, sortDetailType);
	}

	@RequestMapping({ "/flowclassify/formUpdate" })
	public BaseWrapper updateForm(Integer formId, Integer parentId,
			Integer sortNo, String formName, Integer departmentId) {
		return this.service.formUpdate(formId, parentId, sortNo, formName,
				departmentId);
	}

	@RequestMapping({ "/flowclassify/flowUpdate" })
	public BaseWrapper updateFlow(Integer flowId, Integer parentId,
			Integer sortNo, String flowName, Integer departmentId,
			String sortMainType, String sortDetailType) {
		return this.service.flowUpdate(flowId, parentId, sortNo, flowName,
				departmentId, sortMainType, sortDetailType);
	}

	@RequestMapping({ "/flowclassify/flowDelete" })
	public BaseWrapper deleteFlow(Integer flowId) {
		return this.service.deleteFlow(flowId);
	}

	@RequestMapping({ "/flowclassify/formDelete" })
	public BaseWrapper deleteForm(Integer formId) {
		return this.service.deleteForm(formId);
	}

	@RequestMapping({ "/flowclassify/formJsTree" })
	public JobSelectorWrapper formJsData(HttpServletRequest request) {
		return this.service.easyFormTree(request.getSession());
	}

	@RequestMapping({ "/flowclassify/flowJsTree" })
	public JobSelectorWrapper flowJsData(HttpServletRequest request) {
		return this.service.easyFlowTree(request.getSession());
	}
}
