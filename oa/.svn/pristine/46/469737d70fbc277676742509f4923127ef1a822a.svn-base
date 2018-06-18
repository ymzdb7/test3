package com.myoa.controller.wechat;

import com.myoa.model.wechat.WeChatTopic;
import com.myoa.service.wechat.WeChatTopic.WeChatTopicService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/weChatTopic" })
public class WeChatTopicController {

	@Resource
	private WeChatTopicService weChatTopicService;

	@RequestMapping({ "/selectAllWeChatTopic" })
	@ResponseBody
	public ToJson<WeChatTopic> selectAllWeChatTopic(HttpServletRequest request) {
		return this.weChatTopicService.selectAllWeChatTopic();
	}

	@RequestMapping({ "/updateWeChatTopic" })
	@ResponseBody
	public ToJson<WeChatTopic> updateWeChatTopic(WeChatTopic weChatTopic) {
		return this.weChatTopicService.updateWeChatTopic(weChatTopic);
	}
}
