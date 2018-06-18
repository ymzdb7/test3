package com.myoa.controller.infoCenter;

import com.myoa.service.infoCenter.InfoCenterService;
import com.myoa.util.common.wrapper.BaseWrapper;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/infoCenter" })
public class InfoCenterController {

	@Autowired
	InfoCenterService infoCenterService;

	@ResponseBody
	@RequestMapping({ "/getInfoCenterOrder" })
	public BaseWrapper getInfoCenterOrder(HttpServletRequest request) {
		return this.infoCenterService.getInfoCenterOrder(request);
	}

	@ResponseBody
	@RequestMapping({ "/setInfoCenterOrder" })
	public BaseWrapper setInfoCenterOrder(String infoCenterOrder) {
		return this.infoCenterService.setInfoCenterOrder(infoCenterOrder);
	}

	@ResponseBody
	@RequestMapping({ "/getHadInfoCenterList" })
	public BaseWrapper getHadInfoCenterList() {
		return this.infoCenterService.getHadInfoCenterList();
	}

	@ResponseBody
	@RequestMapping({ "/getChooseInfoCenterList" })
	public BaseWrapper getChooseInfoCenterList() {
		return this.infoCenterService.getChooseInfoCenterList();
	}
}
