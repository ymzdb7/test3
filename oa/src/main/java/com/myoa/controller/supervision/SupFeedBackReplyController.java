package com.myoa.controller.supervision;

import com.myoa.model.supervision.SupFeedBackReply;
import com.myoa.service.supervision.SupFeedBackReplyService;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/supFeedBackReply" })
public class SupFeedBackReplyController {

	@Autowired
	private SupFeedBackReplyService supFeedBackReplyService;

	@RequestMapping({ "/insertsupFeedBackReply" })
	public BaseWrapper insertsupFeedBackReply(
			SupFeedBackReply supFeedBackReply, HttpServletRequest request) {
		return this.supFeedBackReplyService.insetrtSupFeedBackReply(
				supFeedBackReply, request);
	}

	@RequestMapping({ "/deleteByPrimaryKey" })
	public ToJson<SupFeedBackReply> deleteByPrimaryKey(
			HttpServletRequest request, Integer sid) {
		return this.supFeedBackReplyService.deleteByPrimaryKeySupFeedBackReply(
				request, sid);
	}
}
