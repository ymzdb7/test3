package com.myoa.controller.supervision;

import com.myoa.model.supervision.Supervision;
import com.myoa.service.supervision.SupervisionService;
import com.myoa.util.ToJson;
import com.myoa.util.treeUtil.TreeGirdNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/supervision" })
public class SupervisionController {

	@Autowired
	SupervisionService supervisionService;

	@ResponseBody
	@RequestMapping({ "/getSupManageListByTypeId" })
	public ToJson<Supervision> getSupManageByTypeId(HttpServletRequest request,
			Integer typeId) {
		return this.supervisionService.getSupManageByTypeId(request, typeId);
	}

	@ResponseBody
	@RequestMapping({ "/getSupManageMenu" })
	public ToJson<TreeGirdNode> getSupManageMenu(HttpServletRequest request,
			Supervision supervision) {
		return this.supervisionService.getSupManageMenu(request, supervision);
	}

	@ResponseBody
	@RequestMapping({ "/addSupervision" })
	public ToJson<Supervision> addSupervision(HttpServletRequest request,
			Supervision supervision) {
		return this.supervisionService.addSupervision(request, supervision);
	}

	@ResponseBody
	@RequestMapping({ "/updateSupervision" })
	public ToJson<Supervision> updateSupervision(HttpServletRequest request,
			Supervision supervision) {
		return this.supervisionService.updateSupervision(request, supervision);
	}

	@ResponseBody
	@RequestMapping({ "/deleteSupervisionBySid" })
	public ToJson<Supervision> deleteSupervisionBySid(
			HttpServletRequest request, Integer sid) {
		return this.supervisionService.deleteSupervisionBySid(request, sid);
	}

	@ResponseBody
	@RequestMapping({ "/selectCountList" })
	public ToJson<Supervision> selectCountList(HttpServletRequest request,
			Integer sid, String beginDate, String endDate, String typeId) {
		Map mapParamter = new HashMap();
		Map paramMap = request.getParameterMap();

		Iterator iKeys = paramMap.keySet().iterator();
		while (iKeys.hasNext()) {
			String key = (String) iKeys.next();
			String[] value = (String[]) paramMap.get(key);
			if ((value != null) && (value.length > 0))
				mapParamter.put(key, value[0]);
			else {
				mapParamter.put(key, "");
			}
		}

		return this.supervisionService.selectCountList(mapParamter, sid,
				beginDate, endDate, typeId);
	}

	@ResponseBody
	@RequestMapping({ "/getSupAssistDetail" })
	public ToJson<Supervision> getSupAssistDetail(HttpServletRequest request,
			Integer sid) {
		return this.supervisionService.getSupAssistDetail(request, sid);
	}

	@ResponseBody
	@RequestMapping({ "/getSupApplyTaskList" })
	public ToJson<Supervision> getSupApplyTaskList(Integer status, Integer sid,
			HttpServletRequest request) {
		return this.supervisionService
				.getSupApplyTaskList(status, sid, request);
	}

	@ResponseBody
	@RequestMapping({ "updateSupStatus" })
	public ToJson<Supervision> updateSupStatus(Supervision supervision,
			HttpServletRequest request) {
		return this.supervisionService.updateSupStatus(supervision, request);
	}
}
