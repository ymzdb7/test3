package com.myoa.controller.smsDelivery;

import com.myoa.model.sms2.Sms2;
import com.myoa.service.smsDelivery.Sms2Service;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/sms2" })
public class Sms2Controller {

	@Resource
	private Sms2Service sms2Service;

	@ResponseBody
	@RequestMapping({ "/selectSms2" })
	public ToJson<Sms2> selectSms2(HttpServletRequest request,
			HttpServletResponse response, Integer page, Integer pageSize,
			boolean useFlag, Sms2 sms2) {
		return this.sms2Service.selectSms2(request, response, page, pageSize,
				useFlag, sms2);
	}

	@ResponseBody
	@RequestMapping({ "/selectSms2ById" })
	public ToJson selectSms2ById(HttpServletRequest request, Integer id) {
		return this.sms2Service.selectSms2ById(request, id);
	}

	@ResponseBody
	@RequestMapping({ "/insertSms2" })
	public ToJson insertSmsSettings(Sms2 sms2) {
		return this.sms2Service.insertSms2(sms2);
	}

	@ResponseBody
	@RequestMapping({ "/delSms2" })
	public ToJson delSms2(Sms2 sms2) {
		return this.sms2Service.delSms2(sms2);
	}

	@ResponseBody
	@RequestMapping({ "/upSms2" })
	public ToJson upSms2(Sms2 sms2) {
		return this.sms2Service.upSms2(sms2);
	}

	@ResponseBody
	@RequestMapping({ "/SendSms" })
	public ToJson SendSms() {
		return this.sms2Service.SendSms();
	}
}
