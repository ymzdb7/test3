package com.myoa.controller.received;

import com.myoa.model.sms3.Sms3;
import com.myoa.service.received.Sms3Service;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/sms3" })
public class Sms3Controller {

	@Resource
	private Sms3Service sms3Service;

	@ResponseBody
	@RequestMapping({ "/selectSms3" })
	public ToJson<Sms3> selectSms3(HttpServletRequest request,
			HttpServletResponse response, Integer page, Integer pageSize,
			boolean useFlag, Sms3 sms3) {
		return this.sms3Service.selectSms3(request, response, page, pageSize,
				useFlag, sms3);
	}

	@ResponseBody
	@RequestMapping({ "/selectSms3ById" })
	public ToJson selectSms3ById(HttpServletRequest request, Integer id) {
		return this.sms3Service.selectSms3ById(request, id);
	}

	@ResponseBody
	@RequestMapping({ "/insertSms3" })
	public ToJson insertSmsSettings(Sms3 sms3) {
		return this.sms3Service.insertSms3(sms3);
	}

	@ResponseBody
	@RequestMapping({ "/delSms3" })
	public ToJson delSms3(Sms3 sms3) {
		return this.sms3Service.delSms3(sms3);
	}

	@ResponseBody
	@RequestMapping({ "/upSms3" })
	public ToJson upSms3(Sms3 sms3) {
		return this.sms3Service.upSms3(sms3);
	}
}
