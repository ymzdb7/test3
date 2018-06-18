package com.myoa.controller.supervision;

import com.myoa.model.supervision.SupervisionApply;
import com.myoa.service.supervision.SupervisionApplyService;
import com.myoa.service.supervision.SupervisionService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/supApply" })
public class SupervisionApplyController {

	@Autowired
	SupervisionApplyService supervisionApplyService;

	@Autowired
	SupervisionService supervisionService;

	@ResponseBody
	@RequestMapping({ "/insertSupApply" })
	public ToJson<SupervisionApply> insertSupType(HttpServletRequest request,
			SupervisionApply supervisionApply) {
		return this.supervisionApplyService.insertSupApply(request,
				supervisionApply);
	}

	@ResponseBody
	@RequestMapping({ "/updateSupApply" })
	public ToJson<SupervisionApply> getUpdateStatus(HttpServletRequest request,
			SupervisionApply supervisionApply) {
		return this.supervisionApplyService.updateStatus(request,
				supervisionApply);
	}

	@ResponseBody
	@RequestMapping({ "/getSupApply" })
	public ToJson<SupervisionApply> getStatusInfor(HttpServletRequest request,
			Integer status) {
		return this.supervisionApplyService.getStatusInfor(request, status);
	}

	@ResponseBody
	@RequestMapping({ "/getSupApplyByStatus" })
	public ToJson<SupervisionApply> getSupApply(HttpServletRequest request,
			SupervisionApply supervisionApply) {
		return this.supervisionApplyService.getSupApplyByStatus(request,
				supervisionApply);
	}
}
