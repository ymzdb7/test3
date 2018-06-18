package com.myoa.controller.customNumber;

import com.myoa.service.workflow.customNumber.CustomNumberService;
import com.myoa.util.common.wrapper.BaseWrapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/customNumber" })
public class CustomNumberController {

	@Resource
	private CustomNumberService customNumberService;

	@RequestMapping(value = { "/addCustomNumber" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper addCustomNumber(Integer uuid, String model,
			String modelId) {
		return this.customNumberService.generateCustomNumber(uuid, model,
				modelId);
	}

	@RequestMapping(value = { "/queryCustomNumber" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper queryCustomNumber(HttpServletRequest request) {
		return this.customNumberService.queryCustomNumber(request);
	}
}
