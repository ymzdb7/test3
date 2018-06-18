package com.myoa.controller.vehicle;

import com.myoa.model.vehicle.VehicleUsageWithBLOBs;
import com.myoa.model.vehicle.VehicleWithBLOBs;
import com.myoa.service.vehicle.VeHicleService;
import com.myoa.util.AjaxJson;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/veHicle" })
public class VeHicleController {

	@Autowired
	VeHicleService veHicleService;

	@RequestMapping({ "/addVeHicle" })
	@ResponseBody
	public AjaxJson addVeHicle(HttpServletRequest request,
			VehicleWithBLOBs vehicleWithBLOBs) {
		return this.veHicleService.addVeHicle(request, vehicleWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/editVeHicle" })
	public AjaxJson editVeHicle(VehicleWithBLOBs vehicleWithBLOBs) {
		return this.veHicleService.editVeHicle(vehicleWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/deleteVeHicleByVid" })
	public AjaxJson deleteVeHicleByVid(Integer vId) {
		return this.veHicleService.deleteVeHicleByVid(vId);
	}

	@ResponseBody
	@RequestMapping({ "/deleteVeHiclesByVids" })
	public AjaxJson deleteVeHiclesByVids(String[] vIds) {
		return this.veHicleService.deleteVeHiclesByVids(vIds);
	}

	@ResponseBody
	@RequestMapping({ "/getDetailVeHicle" })
	public AjaxJson getDetailVeHicle(Integer vId) {
		return this.veHicleService.getDetailVeHicle(vId);
	}

	@ResponseBody
	@RequestMapping({ "/getAllVeHicle" })
	public AjaxJson getAllVeHicle(HttpServletRequest request) {
		return this.veHicleService.getAllVeHicle(request);
	}

	@ResponseBody
	@RequestMapping({ "/getVeHicleFixRecord" })
	public AjaxJson getVeHicleFixRecord(Integer vId) {
		return this.veHicleService.getVeHicleFixRecord(vId);
	}

	@RequestMapping({ "/veHicleIndex" })
	public String veHicleIndex() {
		return "app/vehicle/vehicleInfoManage/index";
	}

	@RequestMapping({ "/veHicleInfoManage" })
	public String veHicleInfoManage() {
		return "app/vehicle/vehicleInfoManage/infoManagement";
	}

	@RequestMapping({ "/veHicleEdit" })
	public String veHicleAdd(int editFlag, String vId, Map<String, Object> map,
			HttpServletRequest request) {
		map.put("editFlag", Integer.valueOf(editFlag));
		map.put("vId", vId);
		return "app/vehicle/vehicleInfoManage/editVehicle";
	}

	@RequestMapping({ "/oilCardManagement" })
	public String oilCardManagement() {
		return "app/vehicle/vehicleInfoManage/oilCardManage";
	}

	@RequestMapping({ "/editOilCard" })
	public String addOilCard(int editFlag, String id, Map<String, Object> map) {
		map.put("editFlag", Integer.valueOf(editFlag));
		map.put("id", id);
		return "app/vehicle/vehicleInfoManage/editOilCard";
	}

	@RequestMapping({ "/veHicleUseageIndex" })
	public String veHicleUseageIndex() {
		return "app/vehicle/veHicleUseage/index";
	}

	@RequestMapping({ "/vehicleUseApply" })
	public String vehicleUse(int editFlag, String vuId, String sign,
			Map<String, Object> map) {
		map.put("editFlag", Integer.valueOf(editFlag));
		map.put("vuId", vuId);
		map.put("sign", sign);
		return "app/vehicle/veHicleUseage/vehicleUseApply";
	}

	@RequestMapping({ "/pendingApply" })
	public String pendingApply() {
		return "app/vehicle/veHicleUseage/pendingApply";
	}

	@RequestMapping({ "/approvedApply" })
	public String approvedApply() {
		return "app/vehicle/veHicleUseage/approvedApply";
	}

	@RequestMapping({ "/inUseVehicle" })
	public String inUseVehicle() {
		return "app/vehicle/veHicleUseage/inUseVehicle";
	}

	@RequestMapping({ "/notApply" })
	public String notApply() {
		return "app/vehicle/veHicleUseage/notApply";
	}

	@RequestMapping({ "/veHicledetail" })
	public String veHicledetail(Map<String, Object> map, String vuId) {
		map.put("vuId", vuId);
		return "app/vehicle/veHicledetail";
	}

	@RequestMapping({ "/veDetail" })
	public String veDetail(Map<String, Object> map, String vId) {
		map.put("vId", vId);
		return "app/vehicle/veDetail";
	}

	@RequestMapping({ "/getDropDownBox" })
	@ResponseBody
	public AjaxJson getDropDownBox(HttpServletRequest request) {
		return this.veHicleService.getDropDownBox(request);
	}

	@RequestMapping({ "/vehicleDeptApproveIndex" })
	public String vehicleDeptApproveIndex() {
		return "app/vehicle/veHicleDeptApprove/index";
	}

	@RequestMapping({ "/vehicleDeptpendApply" })
	public String vehicleDeptpendApply() {
		return "app/vehicle/veHicleDeptApprove/pendingApply";
	}

	@RequestMapping({ "/vehicleDeptnotApply" })
	public String vehicleDeptnotApply() {
		return "app/vehicle/veHicleDeptApprove/notApply";
	}

	@RequestMapping({ "/vehicleDeptApproveApply" })
	public String vehicleDeptApproveApply() {
		return "app/vehicle/veHicleDeptApprove/approvedApply";
	}

	@RequestMapping({ "/operatorIndex" })
	public String operatorIndex() {
		return "app/vehicle/vehicleOperator/index";
	}

	@RequestMapping({ "/operatorpendingApply" })
	public String operatorpendingApply() {
		return "app/vehicle/vehicleOperator/pendingApply";
	}

	@RequestMapping({ "/operatorapprovedApply" })
	public String operatorapprovedApply() {
		return "app/vehicle/vehicleOperator/approvedApply";
	}

	@RequestMapping({ "/operatorinUseVehicle" })
	public String operatorinUseVehicle() {
		return "app/vehicle/vehicleOperator/inUseVehicle";
	}

	@RequestMapping({ "/operatornotApply" })
	public String operatornotApply() {
		return "app/vehicle/vehicleOperator/notApply";
	}

	@RequestMapping({ "/operatorUseEnd" })
	public String operatorUseEnd() {
		return "app/vehicle/vehicleOperator/operatorUseEnd";
	}

	@RequestMapping({ "/operatorQuery" })
	public String operatorQuery() {
		return "app/vehicle/vehicleOperator/operatorQuery";
	}

	@RequestMapping({ "/OperatorMange" })
	public String OperatorMange() {
		return "app/vehicle/vehicleOperator/manage";
	}

	@ResponseBody
	@RequestMapping({ "/getVeHicleByNum" })
	public AjaxJson getVeHicleByNum(String vNum) {
		return this.veHicleService.getVeHicleByNum(vNum);
	}

	@ResponseBody
	@RequestMapping({ "/getVeHicleStatus" })
	public AjaxJson getVeHicleStatus(VehicleUsageWithBLOBs vehicleUsageWithBLOBs) {
		return this.veHicleService.getVeHicleStatus(vehicleUsageWithBLOBs);
	}
}
