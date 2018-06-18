package com.myoa.controller.sys;

import com.myoa.model.sys.SealWithBLOBs;
import com.myoa.service.sys.SealService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/seal" })
public class SealController {

	@Resource
	private SealService sealService;

	@RequestMapping({ "/addSealObject" })
	@ResponseBody
	public ToJson<Object> addSealObject(HttpServletRequest request,
			SealWithBLOBs seal) {
		return this.sealService.addSealObject(request, seal);
	}

	@RequestMapping({ "/editSealObject" })
	@ResponseBody
	public ToJson<Object> editSealObject(HttpServletRequest request,
			SealWithBLOBs seal) {
		return this.sealService.editSealObject(request, seal);
	}

	@RequestMapping({ "/getAllSealInfo" })
	@ResponseBody
	public ToJson<SealWithBLOBs> getAllSealInfo(SealWithBLOBs sealWithBLOBs,
			String startTime, String endTime) {
		return this.sealService.getAllSealInfo(sealWithBLOBs, startTime,
				endTime);
	}

	@RequestMapping({ "/getSealById" })
	@ResponseBody
	public ToJson<SealWithBLOBs> getSealById(String id) {
		return this.sealService.getSealById(id);
	}

	@RequestMapping({ "/deleteSeal" })
	@ResponseBody
	public ToJson<Object> deleteSeal(HttpServletRequest request,
			@RequestParam("ids[]") String[] ids) {
		return this.sealService.deleteSeal(request, ids);
	}

	@RequestMapping({ "/getSealIdById" })
	@ResponseBody
	public ToJson<Object> getSealIdById(HttpServletRequest request, String id) {
		return this.sealService.getSealIdById(request, id);
	}

	@RequestMapping({ "/getSealLogBySealId" })
	@ResponseBody
	public ToJson<SealWithBLOBs> getSealBySealId(HttpServletRequest request,
			String sealId) {
		return this.sealService.getSealBySealId(request, sealId);
	}
}