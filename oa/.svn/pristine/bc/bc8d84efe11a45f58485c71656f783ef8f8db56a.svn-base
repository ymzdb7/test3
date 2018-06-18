package com.myoa.controller.supervision;

import com.myoa.model.supervision.SupervisionType;
import com.myoa.service.supervision.SupervisionTypeService;
import com.myoa.util.ToJson;
import com.myoa.util.treeUtil.TreeGirdNode;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/supervisionType" })
public class SupervisionTypeController {

	@Autowired
	SupervisionTypeService supervisionTypeService;

	@ResponseBody
	@RequestMapping({ "/getSupervisionTypeDetail" })
	public ToJson<SupervisionType> getSupervisionTypeDetail(
			HttpServletRequest request, Integer sid) {
		return this.supervisionTypeService.getSupervisionTypeDetail(request,
				sid);
	}

	@ResponseBody
	@RequestMapping({ "/updateSupervisionType" })
	public ToJson<SupervisionType> updateSupervisionType(
			HttpServletRequest request, SupervisionType supervisionType) {
		return this.supervisionTypeService.updateSupervisionType(request,
				supervisionType);
	}

	@ResponseBody
	@RequestMapping({ "/addSupervisionType" })
	public ToJson<SupervisionType> addSupervisionType(
			HttpServletRequest request, SupervisionType supervisionType) {
		if (supervisionType.getParentId().intValue() == -1) {
			supervisionType.setParentId(Integer.valueOf(0));
		}
		return this.supervisionTypeService.addSupervisionType(request,
				supervisionType);
	}

	@ResponseBody
	@RequestMapping({ "/deleteSupervisionTypeBySid" })
	public ToJson<SupervisionType> deleteSupervisionTypeBySid(Integer sid) {
		return this.supervisionTypeService.deleteSupervisionTypeBySid(sid);
	}

	@ResponseBody
	@RequestMapping({ "/getSupervisionTypeList" })
	public ToJson<SupervisionType> getSupervisionTypeList(
			SupervisionType supervisionType, HttpServletRequest request) {
		return this.supervisionTypeService.getSupervisionTypeList(
				supervisionType, request);
	}

	@ResponseBody
	@RequestMapping({ "/getSupTypeList" })
	public ToJson<TreeGirdNode> getSupTypeList(HttpServletRequest request) {
		return this.supervisionTypeService.getSupTypeList(request);
	}

	@ResponseBody
	@RequestMapping({ "/getSupNameSelect" })
	public ToJson<SupervisionType> getSupNameSelect(HttpServletRequest request,
			SupervisionType supervisionType) {
		return this.supervisionTypeService.getSupNameSelect(request,
				supervisionType);
	}
}
