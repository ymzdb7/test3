package com.myoa.controller.edu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.dao.edu.eduDepartment.EduDepartmentMapper;
import com.myoa.model.edu.eduDepartment.EduDepartmentWithBLOBs;
import com.myoa.model.edu.eduUser.EduUser;
import com.myoa.service.edu.eduDepartment.EduDepartmentService;
import com.myoa.service.edu.eduTeacher.EduTeacherService;
import com.myoa.service.edu.eduUser.IEduUserService;
import com.myoa.util.AjaxJson;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.dataSource.ContextHolder;

@Controller
@RequestMapping({ "/eduDepartment" })
public class EduDepartmentController {

	@Autowired
	private EduDepartmentService eduDepartmentService;

	@Autowired
	private IEduUserService eduUserService;

	@Autowired
	private EduDepartmentMapper eduDepartmentMapper;

	@Autowired
	private EduTeacherService eduTeacherService;

	@RequestMapping({ "/eduDeptManagement" })
	public String eduDeptManagement(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduDepartment/eduDeptManagement";
	}

	@RequestMapping({ "/queryListByDeptId" })
	@ResponseBody
	public ToJson<EduDepartmentWithBLOBs> queryListByDeptId(String deptId,
			HttpServletRequest request) {
		return this.eduDepartmentService.queryListByDeptId(deptId, request);
	}

	@RequestMapping({ "/queryGetObjectByDeptId" })
	@ResponseBody
	public ToJson<EduDepartmentWithBLOBs> queryGetObjectByDeptId(String deptId,
			HttpServletRequest request) {
		return this.eduDepartmentService
				.queryGetObjectByDeptId(deptId, request);
	}

	@RequestMapping({ "/queryGetObj" })
	@ResponseBody
	public ToJson<EduDepartmentWithBLOBs> queryGetObj(HttpServletRequest request) {
		return this.eduDepartmentService.queryGetObj(request);
	}

	@RequestMapping({ "/updateEduDepartmentWithBLOBs" })
	@ResponseBody
	public ToJson<EduDepartmentWithBLOBs> updateEduDepartmentWithBLOBs(
			EduDepartmentWithBLOBs eduDepartmentWithBLOBs,
			HttpServletRequest request) {
		return this.eduDepartmentService.updateEduDepartmentWithBLOBs(
				eduDepartmentWithBLOBs, request);
	}

	@RequestMapping({ "/deleteEduDepartmentWithBLOBs" })
	@ResponseBody
	public ToJson<EduDepartmentWithBLOBs> deleteEduDepartmentWithBLOBs(
			String deptId, String deptNo, HttpServletRequest request) {
		return this.eduDepartmentService.deleteEduDepartmentWithBLOBs(deptId,
				deptNo, request);
	}

	@RequestMapping({ "/addEduDepartmentWithBLOBs" })
	@ResponseBody
	public ToJson<EduDepartmentWithBLOBs> addEduDepartmentWithBLOBs(
			EduDepartmentWithBLOBs eduDepartmentWithBLOBs,
			HttpServletRequest request) {
		return this.eduDepartmentService.addEduDepartmentWithBLOBs(
				eduDepartmentWithBLOBs, request);
	}

	@RequestMapping({ "/queryObjectsBydeptParent" })
	@ResponseBody
	public ToJson<EduDepartmentWithBLOBs> queryObjectsBydeptParent(
			String deptParent, HttpServletRequest request) {
		return this.eduDepartmentService.queryObjectsBydeptParent(deptParent,
				request);
	}

	@RequestMapping({ "/getObjByDeptId" })
	@ResponseBody
	public ToJson<EduDepartmentWithBLOBs> getObjByDeptId(String deptId,
			HttpServletRequest request) {
		return this.eduDepartmentService.getObjByDeptId(deptId, request);
	}

	@ResponseBody
	@RequestMapping(value = { "/getEduDeptUser" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<EduDepartmentWithBLOBs> getEduDeptUser(
			HttpServletRequest request) {
		ToJson json = new ToJson();
		try {
			request.setCharacterEncoding("UTF-8");
			int deptId = Integer.parseInt(new String(request.getParameter(
					"deptId").getBytes("ISO-8859-1"), "UTF-8"));
			List list = this.eduDepartmentService.getEduDeptUser(deptId);

			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@RequestMapping({ "getDpNameByIds" })
	@ResponseBody
	public AjaxJson getDpNameByIds(String deptIds) {
		return this.eduDepartmentService.getDpNameByIds(deptIds);
	}

	@RequestMapping({ "/getAllOrg" })
	@ResponseBody
	public AjaxJson getAllOrg(
			@RequestParam(value = "userId", required = false) String userId,
			@RequestParam(value = "type", required = false) Integer type) {
		AjaxJson ajaxJson = new AjaxJson();
		try {
			if (StringUtils.checkNull(userId).booleanValue()) {
				List list = this.eduDepartmentService.getAllOrg();
				ajaxJson.setObj(list);
				ajaxJson.setFlag(true);
				ajaxJson.setMsg("OK");
				return ajaxJson;
			}
			if ((type.intValue() == 2) || (type.intValue() == 3)) {
				EduUser eduUser = this.eduUserService.getByuserId(userId);

				List list = this.eduDepartmentMapper.getChDeptEduUser(eduUser
						.getDeptId().intValue());

				EduDepartmentWithBLOBs eduDepartmentWithBLOBs = this.eduDepartmentMapper
						.queryGetObjectByDeptId(String.valueOf(eduUser
								.getDeptId()));

				EduDepartmentWithBLOBs eduDepartmentWithBLOBs1 = this.eduDepartmentMapper
						.queryGetObjectByDeptId(String
								.valueOf(eduDepartmentWithBLOBs.getDeptId()));

				List listEduTeacher = this.eduTeacherService.getTeacherBygc(
						eduDepartmentWithBLOBs1.getDeptName(),
						eduDepartmentWithBLOBs.getDeptName());
				Map map = new HashMap();

				map.put("student", list);

				map.put("teacher", listEduTeacher);
				ajaxJson.setAttributes(map);
				ajaxJson.setFlag(true);
				ajaxJson.setMsg("OK");
				return ajaxJson;
			}
		} catch (Exception e) {
			e.printStackTrace();
			ajaxJson.setFlag(false);
			ajaxJson.setMsg(e.getMessage());
		}
		return ajaxJson;
	}

	@RequestMapping({ "/getAllGrade" })
	@ResponseBody
	public AjaxJson getAllGrade() {
		return this.eduDepartmentService.getAllGrade();
	}

	@RequestMapping({ "/getClazz" })
	@ResponseBody
	public AjaxJson getAllClazz() {
		return this.eduDepartmentService.getClazz();
	}
}
