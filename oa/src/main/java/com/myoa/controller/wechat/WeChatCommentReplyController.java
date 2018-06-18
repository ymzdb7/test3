package com.myoa.controller.wechat;

import com.myoa.model.users.Users;
import com.myoa.model.wechat.WeChatCommentReply;
import com.myoa.service.wechat.WeChatCommentReply.WeChatCommentReplyService;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/weChatCommentReply" })
public class WeChatCommentReplyController {

	@Resource
	private WeChatCommentReplyService weChatCommentReplyService;

	@RequestMapping({ "/insertWeChatCommentReply" })
	@ResponseBody
	public ToJson<WeChatCommentReply> insertWeChatCommentReply(
			WeChatCommentReply weChatCommentReply, HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.weChatCommentReplyService.insertWeChatCommentReply(
				weChatCommentReply, user);
	}

	@RequestMapping({ "/selectWeChatCommentReply" })
	@ResponseBody
	public ToJson<WeChatCommentReply> selectWeChatCommentReply(Integer wid,
			Integer cid) {
		return this.weChatCommentReplyService
				.selectWeChatCommentReply(wid, cid);
	}

	@RequestMapping({ "/deleteByPrimaryKey" })
	@ResponseBody
	public ToJson<WeChatCommentReply> deleteByPrimaryKey(Integer rid) {
		return this.weChatCommentReplyService.deleteByPrimaryKey(rid);
	}
}
