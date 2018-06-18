package com.myoa.controller.sys;

import com.myoa.model.sys.SealLog;
import com.myoa.service.sys.SealLogService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/SealLog" })
public class SealLogController {

	@Resource
	private SealLogService sealLogService;

	@ResponseBody
	@RequestMapping({ "/getAllSealLog" })
	public ToJson<SealLog> getAllSealLog(String startTime, String endTime,
			HttpServletRequest request, String sealName, SealLog sealLog,
			Integer page, Integer pageSize, boolean useFlag) {
		return this.sealLogService.getAllSealLog(startTime, endTime, request,
				sealName, sealLog, page, pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/deleteSealLog" })
	public ToJson<Object> deleteSealLog(@RequestParam("ids[]") String[] ids) {
		return this.sealLogService.deleteSealLog(ids);
	}
}
