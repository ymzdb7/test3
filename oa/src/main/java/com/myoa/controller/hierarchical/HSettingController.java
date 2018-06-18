package com.myoa.controller.hierarchical;

import com.myoa.model.department.Department;
import com.myoa.service.department.DepartmentService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping({ "/hierarchical" })
public class HSettingController {

	@Resource
	private DepartmentService departmentService;
	private Logger loger = Logger.getLogger(HSettingController.class);

	@ResponseBody
	@RequestMapping({ "/setClassifyOrgByDeptId" })
	public ToJson<Department> setClassifyOrgByDeptId(String deptIds,
			String classifyOrgAdmin, int classifyOrg) {
		return this.departmentService.setClassifyOrgByDeptId(deptIds,
				classifyOrgAdmin, classifyOrg);
	}

	@ResponseBody
	@RequestMapping({ "/getAllClassifyOrg" })
	public ToJson<Department> getAllClassifyOrg() {
		return this.departmentService.getAllClassifyOrg();
	}

	@ResponseBody
	@RequestMapping({ "/getClassifyOrgByAdmin" })
	public ToJson<Department> getClassifyOrgByAdmin(HttpServletRequest request) {
		return this.departmentService.getClassifyOrgByAdmin(request);
	}
}
