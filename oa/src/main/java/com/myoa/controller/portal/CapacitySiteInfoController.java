package com.myoa.controller.portal;

import com.myoa.model.portal.CapacitySiteInfo;
import com.myoa.service.portal.CapacitySiteInfoService;
import com.myoa.service.portal.wrapper.PortalWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/capacitySiteInfo" })
public class CapacitySiteInfoController {

	@Autowired
	private CapacitySiteInfoService capacitySiteInfoService;

	@RequestMapping({ "/selectCapacitySiteInfoList" })
	public BaseWrappers selectCapacitySiteInfoList(
			HttpServletRequest request,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
		return this.capacitySiteInfoService.selectCapacitySiteInfoList(request,
				page, pageSize);
	}

	@RequestMapping({ "/updateCapacitySiteInfo" })
	public PortalWrapper updateCapacitySiteInfo(
			CapacitySiteInfo capacitySiteInfo, HttpServletRequest request) {
		return this.capacitySiteInfoService.updateCapacitySiteInfo(
				capacitySiteInfo, request);
	}

	@RequestMapping({ "/addCapacitySiteInfo" })
	public PortalWrapper addCapacitySiteInfo(CapacitySiteInfo capacitySiteInfo,
			HttpServletRequest request) {
		return this.capacitySiteInfoService.addCapacitySiteInfo(
				capacitySiteInfo, request);
	}

	@RequestMapping({ "/queryCapacitySiteInfoOne" })
	public PortalWrapper queryCapacitySiteInfoOne(Integer sid) {
		return this.capacitySiteInfoService.queryCapacitySiteInfoOne(sid);
	}

	@RequestMapping({ "/deleteCapacitySiteInfoOne" })
	public PortalWrapper deleteCapacitySiteInfoOne(Integer sid) {
		return this.capacitySiteInfoService.deleteCapacitySiteInfoOne(sid);
	}
}
