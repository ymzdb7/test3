package com.myoa.controller.vehicle;

import com.myoa.model.vehicle.VehicleUsageWithBLOBs;
import com.myoa.service.vehicle.VeHicleUsageService;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/veHicleUsage" })
public class VeHicleUsageController {

	@Autowired
	VeHicleUsageService veHicleUsageService;

	@RequestMapping({ "/addVeHicle" })
	@ResponseBody
	public AjaxJson addVeHicle(HttpServletRequest request,
			VehicleUsageWithBLOBs vehicleUsageWithBLOBs) {
		return this.veHicleUsageService.addVeHicle(request,
				vehicleUsageWithBLOBs);
	}

	@RequestMapping({ "/selectAllVeHicle" })
	@ResponseBody
	public AjaxJson selectAllVeHicle(HttpServletResponse response,
			HttpServletRequest request, String vuStatusName,
			String applyStartTime, VehicleUsageWithBLOBs vehicleUsageWithBLOBs,
			String applyEndTime, String export) {
		return this.veHicleUsageService.selectAllVeHicle(response, request,
				vuStatusName, applyStartTime, vehicleUsageWithBLOBs,
				applyEndTime, export);
	}

	@RequestMapping({ "/deptApproval" })
	@ResponseBody
	public AjaxJson deptApproval(HttpServletRequest request, String dmerStatus) {
		return this.veHicleUsageService.deptApproval(request, dmerStatus);
	}

	@RequestMapping({ "/editDeptApproval" })
	@ResponseBody
	public AjaxJson editDeptApproval(VehicleUsageWithBLOBs vehicleUsageWithBLOBs) {
		return this.veHicleUsageService.editDeptApproval(vehicleUsageWithBLOBs);
	}

	@RequestMapping({ "/editOperatorstatu" })
	@ResponseBody
	public AjaxJson editOperatorstatu(
			VehicleUsageWithBLOBs vehicleUsageWithBLOBs) {
		return this.veHicleUsageService
				.editOperatorstatu(vehicleUsageWithBLOBs);
	}

	@RequestMapping({ "/getReservation" })
	@ResponseBody
	public ToJson<VehicleUsageWithBLOBs> getReservation(Integer vId) {
		return this.veHicleUsageService.getReservation(vId);
	}

	@RequestMapping({ "/GetOperator" })
	@ResponseBody
	public AjaxJson GetOperator(HttpServletRequest request,
			String applyStartTime, String applyEndTime,
			VehicleUsageWithBLOBs vehicleUsageWithBLOBs) {
		return this.veHicleUsageService.GetOperator(request, applyStartTime,
				applyEndTime, vehicleUsageWithBLOBs);
	}

	@RequestMapping({ "/showList" })
	public String showList(String vuStatusName, Map<String, Object> map) {
		map.put("vuStatusName", vuStatusName);
		return "app/vehicle/vehicleUseQuery/showList";
	}

	@RequestMapping({ "/useQuery" })
	public String useQuery() {
		return "app/vehicle/vehicleUseQuery/useQuery";
	}

	@RequestMapping({ "/index" })
	public String index() {
		return "app/vehicle/vehicleUseQuery/index";
	}

	@ResponseBody
	@RequestMapping({ "/getVehicleUsageDetail" })
	public AjaxJson getVehicleUsageDetail(Integer vuId) {
		return this.veHicleUsageService.getVehicleUsageDetail(vuId);
	}

	@ResponseBody
	@RequestMapping({ "/deleteVehicleUsage" })
	public AjaxJson deleteVehicleUsage(Integer vuId) {
		return this.veHicleUsageService.deleteVehicleUsage(vuId);
	}

	@ResponseBody
	@RequestMapping({ "/editVehicleUsage" })
	public AjaxJson editVehicleUsage(VehicleUsageWithBLOBs vehicleUsageWithBLOBs) {
		return this.veHicleUsageService.editVehicleUsage(vehicleUsageWithBLOBs);
	}
}
