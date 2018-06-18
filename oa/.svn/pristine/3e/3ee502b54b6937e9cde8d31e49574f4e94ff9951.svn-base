package com.myoa.controller.supervision;

import com.myoa.model.supervision.SupFeedBack;
import com.myoa.model.supervision.SupFeedBackReply;
import com.myoa.service.supervision.SupFeedBackServise;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/supFeedBack" })
public class SupFeedBackController {

	@Autowired
	SupFeedBackServise supFeedBackServise;

	@ResponseBody
	@RequestMapping({ "/getSupDetail" })
	public ToJson<Object> getSupDetail(HttpServletRequest request,
			SupFeedBack supFeedBack, SupFeedBackReply supFeedBackReply) {
		return this.supFeedBackServise.getSupDetail(request, supFeedBack,
				supFeedBackReply);
	}

	@ResponseBody
	@RequestMapping({ "/getSupFeedBackList" })
	public ToJson<SupFeedBack> getSupFeedBackList(HttpServletRequest request,
			SupFeedBack supFeedBack) {
		return this.supFeedBackServise.getSupFeedBackList(request, supFeedBack);
	}

	@ResponseBody
	@RequestMapping({ "/deleteSupFeedBack" })
	public ToJson<SupFeedBack> deleteSupFeedBack(HttpServletRequest request,
			Integer sid) {
		return this.supFeedBackServise.deleteSupFeedBack(request, sid);
	}

	@ResponseBody
	@RequestMapping({ "/updateSupFeedBack" })
	public ToJson<SupFeedBack> updateSupFeedBack(HttpServletRequest request,
			SupFeedBack supFeedBack) {
		return this.supFeedBackServise.updateSupFeedBack(request, supFeedBack);
	}

	@ResponseBody
	@RequestMapping({ "/addSupFeedBack" })
	public ToJson<SupFeedBack> addSupFeedBack(HttpServletRequest request,
			SupFeedBack supFeedBack) {
		return this.supFeedBackServise.addSupFeedBack(request, supFeedBack);
	}
}
