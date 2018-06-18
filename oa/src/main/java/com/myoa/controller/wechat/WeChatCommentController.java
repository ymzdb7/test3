package com.myoa.controller.wechat;

import com.myoa.model.users.Users;
import com.myoa.model.wechat.WeChatComment;
import com.myoa.service.wechat.WeChatComment.WeChatCommentService;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/weChatComment" })
public class WeChatCommentController {

	@Resource
	private WeChatCommentService weChatCommentService;

	@RequestMapping({ "/insertWeChatComment" })
	@ResponseBody
	public ToJson<WeChatComment> insertWeChatComment(
			WeChatComment weChatComment, HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.weChatCommentService.insertWeChatComment(weChatComment,
				user);
	}

	@RequestMapping({ "/selectWeChatCommentByWID" })
	@ResponseBody
	public ToJson<WeChatComment> selectWeChatCommentByWID(Integer wid,
			Map<String, Object> maps, Integer page, Integer pageSize,
			boolean useFlag, HttpServletRequest request) {
		return this.weChatCommentService.selectWeChatCommentByWID(wid, maps,
				page, pageSize, useFlag);
	}

	@RequestMapping({ "/deleteByPrimaryKey" })
	@ResponseBody
	public ToJson<WeChatComment> deleteByPrimaryKey(Integer cid,
			HttpServletRequest request) {
		return this.weChatCommentService.deleteByPrimaryKey(cid);
	}
}
