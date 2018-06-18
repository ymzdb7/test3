package com.myoa.controller.portalTemplate;

import com.myoa.model.portalTemplate.PortalTemplateWithBLOBs;
import com.myoa.service.portalTemplate.PortalTemplateService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/temp" })
public class PortalTemplateController {

	@Resource
	private PortalTemplateService portalTemplateService;

	@RequestMapping({ "/temp" })
	public String goIndex() {
		return "app/temp/index";
	}

	@ResponseBody
	@RequestMapping({ "/selectPortalTemplate" })
	public ToJson selectPortalTemplate(Integer portalId) {
		return this.portalTemplateService.selectPortalTemplate(portalId);
	}

	@ResponseBody
	@RequestMapping({ "/selectPortalTemplateById" })
	public ToJson selectPortalTemplateById(Integer templateId) {
		return this.portalTemplateService.selectPortalTemplateById(templateId);
	}

	@ResponseBody
	@RequestMapping({ "/insertPortalTemplate" })
	public ToJson insertPortalTemplate(HttpServletRequest request,
			PortalTemplateWithBLOBs portalTemplateWithBLOBs) {
		return this.portalTemplateService.insertPortalTemplate(request,
				portalTemplateWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/upPortalTemplate" })
	public ToJson upPortalTemplate(
			PortalTemplateWithBLOBs portalTemplateWithBLOBs) {
		return this.portalTemplateService
				.upPortalTemplate(portalTemplateWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/delPortalTemplate" })
	public ToJson delPortalTemplate(
			PortalTemplateWithBLOBs portalTemplateWithBLOBs) {
		return this.portalTemplateService
				.delPortalTemplate(portalTemplateWithBLOBs);
	}
}
