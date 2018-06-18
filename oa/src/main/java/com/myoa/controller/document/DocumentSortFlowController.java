package com.myoa.controller.document;

import com.myoa.service.document.DocumenSortFlowSerivce;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/document" })
public class DocumentSortFlowController {

	@Autowired
	DocumenSortFlowSerivce documenSortFlowSerivce;

	@RequestMapping({ "/sortFlow" })
	public BaseWrappers sortFlow(HttpServletRequest request, String mainType,
			String detailType) {
		return this.documenSortFlowSerivce.sortFlow(request, mainType,
				detailType);
	}

	@RequestMapping({ "/getStatistics" })
	public BaseWrappers getStatistics(
			HttpServletRequest request,
			@RequestParam(required = false, defaultValue = "0", name = "staType") Integer staType,
			String startTime, String endTime) {
		return this.documenSortFlowSerivce.getStatistics(request, staType,
				startTime, endTime);
	}

	@RequestMapping({ "/cancelDocument" })
	public BaseWrapper cancelDocument(HttpServletRequest request, Integer runId) {
		return this.documenSortFlowSerivce.cancelDocument(request, runId);
	}

	@RequestMapping({ "/getFlowDocument" })
	public BaseWrappers getDocumentFlowType() {
		return this.documenSortFlowSerivce.getDocumentFlowType();
	}
}
