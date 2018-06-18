package com.myoa.controller.sms;

import com.myoa.model.sms.Sms;
import com.myoa.model.sms.SmsBody;
import com.myoa.service.sms.SmsService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/sms" })
public class SmsController {

	@Resource
	private SmsService smsService;

	@RequestMapping({ "/index" })
	public String goIndex() {
		return "app/sms/smsIndex";
	}

	@RequestMapping({ "/unconfirmedSmsPage" })
	public String unconfirmedSmsPage() {
		return "app/sms/unconfirmedSms";
	}

	@RequestMapping({ "/receivedSmsPage" })
	public String receivedSmsPage() {
		return "app/sms/receivedSms";
	}

	@RequestMapping({ "/sentSmsPage" })
	public String sentSmsPage() {
		return "app/sms/sentSms";
	}

	@RequestMapping({ "/querySmsPage" })
	public String querySmsPage() {
		return "app/sms/querySms";
	}

	@ResponseBody
	@RequestMapping({ "/selectByQueryType" })
	public ToJson<SmsBody> selectByQueryType(HttpServletRequest request,
			Integer queryType, Integer page, Integer pageSize) {
		return this.smsService.getSmsBodies(request, queryType, page, pageSize);
	}

	@ResponseBody
	@RequestMapping({ "/delete" })
	public ToJson<Sms> updateDeleteFlag(HttpServletRequest request,
			String deleteFlag, String bodyIds) {
		return this.smsService.updateDeleteFlag(request, deleteFlag, bodyIds);
	}

	@ResponseBody
	@RequestMapping({ "/updateRemind" })
	public ToJson<Sms> updateRemindFlag(HttpServletRequest request,
			String remindFlag, String bodyIds) {
		return this.smsService.updateRemindFlag(request, remindFlag, bodyIds);
	}

	@ResponseBody
	@RequestMapping({ "/deleteByRemind" })
	public ToJson<Sms> deleteByRemind(HttpServletRequest request,
			String deleteType) {
		return this.smsService.deleteByRemind(request, deleteType);
	}

	@ResponseBody
	@RequestMapping({ "/deleteByDelFlag" })
	public ToJson<Sms> deleteByDelFlag(HttpServletRequest request) {
		return this.smsService.deleteByDelFlag(request);
	}

	@ResponseBody
	@RequestMapping({ "/setRead" })
	public ToJson<Sms> setRead(HttpServletRequest request, Integer bodyId) {
		return this.smsService.setRead(request, bodyId);
	}

	@ResponseBody
	@RequestMapping({ "/query" })
	public ToJson<SmsBody> querySmsBody(HttpServletRequest request,
			HttpServletResponse response, String toIds, String fromIds,
			String smsType, String beginDate, String endDate, String content,
			String orderBy, String sortType, String opeType, Integer page,
			Integer pageSize, boolean useFlag) {
		return this.smsService.querySmsBody(request, response, toIds, fromIds,
				smsType, beginDate, endDate, content, orderBy, sortType,
				opeType, page, pageSize, useFlag);
	}
}
