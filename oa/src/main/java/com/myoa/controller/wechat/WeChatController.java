package com.myoa.controller.wechat;

import com.myoa.model.users.Users;
import com.myoa.model.wechat.LikeUser;
import com.myoa.model.wechat.WeChat;
import com.myoa.service.wechat.weChat.WeChatService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/weChat" })
public class WeChatController {

	@Resource
	private WeChatService weChatService;

	@RequestMapping({ "/index" })
	public String index() {
		return "app/weChat/index";
	}

	@RequestMapping({ "/insertWeChat" })
	@ResponseBody
	public ToJson<WeChat> insertWeChat(WeChat weChat, HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.weChatService.insertWeChat(weChat, user);
	}

	@RequestMapping({ "/selectWeChat" })
	@ResponseBody
	public ToJson<WeChat> selectWeChat(Map<String, Object> maps, Integer page,
			Integer pageSize, boolean useFlag, HttpServletRequest request) {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		ContextHolder.setConsumerType(sqlType);
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.weChatService.selectWeChat(maps, page, pageSize, useFlag,
				sqlType, user);
	}

	@RequestMapping({ "/updateWeChatByPrimaryKey" })
	@ResponseBody
	public ToJson<WeChat> updateWeChatByPrimaryKey(Integer wid,
			HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.weChatService.updateWeChatByPrimaryKey(wid, user);
	}

	@RequestMapping({ "/selectWeChatByPrimaryKey" })
	@ResponseBody
	public ToJson<WeChat> selectWeChatByPrimaryKey(Integer wid,
			HttpServletRequest request) {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		ContextHolder.setConsumerType(sqlType);
		return this.weChatService.selectWeChatByPrimaryKey(wid, sqlType);
	}

	@RequestMapping({ "/deleteByPrimaryKey" })
	@ResponseBody
	public ToJson<WeChat> deleteByPrimaryKey(Integer wid) {
		return this.weChatService.deleteByPrimaryKey(wid);
	}

	@RequestMapping({ "/getLikeUser" })
	@ResponseBody
	public ToJson<LikeUser> getLikeUser(Integer wid) {
		return this.weChatService.getLikeUser(wid);
	}
}
