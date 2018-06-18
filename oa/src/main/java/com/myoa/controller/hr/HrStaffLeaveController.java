package com.myoa.controller.hr;

import com.myoa.model.hr.HrStaffInfo;
import com.myoa.model.hr.HrStaffLeave;
import com.myoa.service.hr.HrStaffLeaveService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/hr/leave" })
public class HrStaffLeaveController {

	@Autowired
	HrStaffLeaveService hrStaffLeaveService;

	@ResponseBody
	@RequestMapping({ "/getLeavePerson" })
	public ToJson<HrStaffInfo> insertLeavePersonByDeptId(
			HttpServletRequest request, Integer deptId) {
		return this.hrStaffLeaveService.querytLeavePersonByDeptId(request,
				deptId);
	}

	@ResponseBody
	@RequestMapping({ "/getLeaveUsersByDeptId" })
	public ToJson<HrStaffLeave> getLeaveUsersByDeptId(
			HttpServletRequest request, Integer deptId) {
		return this.hrStaffLeaveService.getLeaveUsersByDeptId(request, deptId);
	}

	@ResponseBody
	@RequestMapping({ "/addLeaveInfor" })
	public ToJson<HrStaffLeave> addLeaveInfor(HrStaffLeave hrStaffLeave,
			HttpServletRequest request) {
		return this.hrStaffLeaveService.addLeaveInfor(hrStaffLeave, request);
	}

	@ResponseBody
	@RequestMapping({ "/getLeaveUserByDeptId" })
	public ToJson<HrStaffLeave> getLeaveUserByDeptId(
			HttpServletRequest request, Integer deptId) {
		return this.hrStaffLeaveService.getLeaveUserByDeptId(request, deptId);
	}
}
