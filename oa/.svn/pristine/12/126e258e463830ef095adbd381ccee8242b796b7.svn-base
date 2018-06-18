package com.myoa.controller.common;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.common.SecureRule;
import com.myoa.service.common.SecureRuleService;
import com.myoa.util.ToJson;

@Controller
@RequestMapping({ "/SecureRule" })
public class SecureRuleController {

	@Resource
	private SecureRuleService secureRuleService;

	@RequestMapping({ "/getAllSecureRule" })
	@ResponseBody
	public ToJson<SecureRule> getAllSecureRule() {
		return this.secureRuleService.getAllSecureRule();
	}

	@RequestMapping({ "/editSecureRule" })
	@ResponseBody
	public ToJson<Object> editSecureRule(HttpServletRequest request,
			SecureRule secureRule) {
		return this.secureRuleService.editSecureRule(request, secureRule);
	}

	@RequestMapping({ "/getSecureRule" })
	@ResponseBody
	public String getSecureRule() {
		return "app/sys/seIndex2";
	}

	@RequestMapping({ "/getSecureById" })
	@ResponseBody
	public ToJson<SecureRule> getSecureById(String ruleId) {
		return this.secureRuleService.getSecureById(ruleId);
	}
}
