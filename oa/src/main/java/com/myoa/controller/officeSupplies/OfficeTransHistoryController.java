package com.myoa.controller.officeSupplies;

import com.myoa.model.officesupplies.OfficeTranshistoryWithBLOBs;
import com.myoa.service.officesupplies.OfficeTransHistoryService;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/officetransHistory" })
public class OfficeTransHistoryController {

	@Resource
	private OfficeTransHistoryService officeTransHistoryService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}

	@RequestMapping({ "/goMyOfficeApply" })
	public String goMyOfficeApply() {
		return "app/officeSupplies/product/myApply";
	}

	@RequestMapping({ "/goFixDepository" })
	public String goFixDepository() {
		return "app/officeSupplies/depository/fixDepository";
	}

	@RequestMapping({ "/goPendregistration" })
	public String goPendregistration() {
		return "app/officeSupplies/depository/goPendregistration";
	}

	@RequestMapping({ "/goQuery" })
	public String goQuery() {
		return "app/officeSupplies/depository/query";
	}

	@RequestMapping({ "/productRelease" })
	public String productRelease() {
		return "app/officeSupplies/release/productRelease";
	}

	@RequestMapping({ "/approvalIndex" })
	public String approvalIndex() {
		return "app/officeSupplies/approval/index";
	}

	@RequestMapping({ "/NoApproval" })
	public String NoApproval() {
		return "app/officeSupplies/approval/NoApproval";
	}

	@RequestMapping({ "/applyRecord" })
	public String applyRecord() {
		return "app/officeSupplies/approval/applyRecord";
	}

	@RequestMapping({ "/OfficeProductApply" })
	public String OfficeProductApply(int editFlag, int transId,
			Map<String, Object> map) {
		map.put("editFlag", Integer.valueOf(editFlag));
		map.put("transId", Integer.valueOf(transId));
		return "app/officeSupplies/product/editApply";
	}

	@RequestMapping({ "/gpProApply" })
	public String goProductApply(int editFlag, int transId, int proid,
			int depositoryid, int protypeid, Map<String, Object> map) {
		map.put("editFlag", Integer.valueOf(editFlag));
		map.put("transId", Integer.valueOf(transId));
		map.put("proid", Integer.valueOf(proid));
		map.put("depositoryid", Integer.valueOf(depositoryid));
		map.put("protypeid", Integer.valueOf(protypeid));
		return "app/officeSupplies/product/gpProApply";
	}

	@RequestMapping({ "/OfficeProductApplyIndex" })
	public String OfficeProductApplyIndex() {
		return "app/officeSupplies/product/index";
	}

	@RequestMapping({ "/stockIndex" })
	public String stockIndex() {
		return "app/officeSupplies/depository/stockIndex";
	}

	@ResponseBody
	@RequestMapping({ "/insertObject" })
	public ToJson<Object> insertObject(HttpServletRequest request,
			OfficeTranshistoryWithBLOBs officeTranshistoryWithBLOBs, int flag) {
		return this.officeTransHistoryService.insertObject(request,
				officeTranshistoryWithBLOBs, flag);
	}

	@ResponseBody
	@RequestMapping({ "/getMyHistroy" })
	public ToJson<OfficeTranshistoryWithBLOBs> getMyHistroy(
			HttpServletRequest request) {
		return this.officeTransHistoryService.getMyHistroy(request);
	}

	@ResponseBody
	@RequestMapping({ "/deleteObject" })
	public ToJson<Object> deleteObject(Integer transId) {
		return this.officeTransHistoryService.deleteObject(transId);
	}

	@ResponseBody
	@RequestMapping({ "/editObject" })
	public ToJson<Object> editObject(
			OfficeTranshistoryWithBLOBs officeTranshistoryWithBLOBs) {
		return this.officeTransHistoryService
				.editObject(officeTranshistoryWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/getObjectById" })
	public ToJson<OfficeTranshistoryWithBLOBs> getObjectById(Integer transId) {
		return this.officeTransHistoryService.getObjectById(transId);
	}

	@ResponseBody
	@RequestMapping({ "/selTranshistoryByState" })
	ToJson<OfficeTranshistoryWithBLOBs> selTranshistoryByState(
			HttpServletRequest request) {
		return this.officeTransHistoryService.selTranshistoryByState(request);
	}

	@ResponseBody
	@RequestMapping({ "/upTransHistoryState" })
	public ToJson<OfficeTranshistoryWithBLOBs> upTransHistoryState(
			OfficeTranshistoryWithBLOBs transhistory) {
		return this.officeTransHistoryService.upTransHistoryState(transhistory);
	}

	@ResponseBody
	@RequestMapping({ "/getDownObjects" })
	public AjaxJson getDownObjects(String typeDepository,
			String officeProductType) {
		return this.officeTransHistoryService.getDownObjects(typeDepository,
				officeProductType);
	}

	@ResponseBody
	@RequestMapping({ "/selGrantByCond" })
	ToJson<OfficeTranshistoryWithBLOBs> selGrantByCond(
			OfficeTranshistoryWithBLOBs transhistory,
			HttpServletRequest request, Integer page, Integer pageSize,
			boolean useFlag) {
		return this.officeTransHistoryService.selGrantByCond(transhistory,
				request, page, pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/upGrantStatus" })
	ToJson<OfficeTranshistoryWithBLOBs> upGrantStatus(
			OfficeTranshistoryWithBLOBs officeTranshistoryWithBLOBs) {
		return this.officeTransHistoryService
				.upGrantStatus(officeTranshistoryWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/selTranshistoryByCond" })
	public ToJson<OfficeTranshistoryWithBLOBs> selTranshistoryByCond(
			OfficeTranshistoryWithBLOBs officeTranshistoryWithBLOBs,
			int output, HttpServletRequest request, HttpServletResponse response) {
		return this.officeTransHistoryService.selTranshistoryByCond(
				officeTranshistoryWithBLOBs, output, request, response);
	}

	@ResponseBody
	@RequestMapping({ "/selMaintain" })
	ToJson<OfficeTranshistoryWithBLOBs> selMaintain(
			OfficeTranshistoryWithBLOBs officeTranshistoryWithBLOBs,
			HttpServletRequest request) {
		return this.officeTransHistoryService.selMaintain(
				officeTranshistoryWithBLOBs, request);
	}

	@ResponseBody
	@RequestMapping({ "/selInstead" })
	ToJson<OfficeTranshistoryWithBLOBs> selInstead(
			OfficeTranshistoryWithBLOBs officeTranshistoryWithBLOBs,
			HttpServletRequest request) {
		return this.officeTransHistoryService.selInstead(
				officeTranshistoryWithBLOBs, request);
	}

	@ResponseBody
	@RequestMapping({ "/returnObject" })
	public ToJson<Object> returnObject(String transIds) {
		return this.officeTransHistoryService.returnObject(transIds);
	}
}
