package com.myoa.controller.edu.schoolPriv;

import com.myoa.model.edu.schoolPriv.SchoolPriv;
import com.myoa.service.edu.schoolPriv.SchoolPrivService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/schoolPriv" })
public class SchoolPrivController {

	@Resource
	private SchoolPrivService schoolPrivService;

	@ResponseBody
	@RequestMapping({ "/addSchoolPriv" })
	public ToJson<SchoolPriv> addSchoolPriv(HttpServletRequest request,
			SchoolPriv schoolPriv) {
		return this.schoolPrivService.addSchoolPriv(request, schoolPriv);
	}

	@ResponseBody
	@RequestMapping({ "/deleteSchoolPriv" })
	public ToJson<SchoolPriv> deleteSchoolPriv(HttpServletRequest request,
			Integer id) {
		return this.schoolPrivService.deleteSchoolPriv(request, id);
	}

	@ResponseBody
	@RequestMapping({ "/selectByPrimaryKey" })
	public ToJson<SchoolPriv> selectByPrimaryKey(HttpServletRequest request,
			Integer id) {
		return this.schoolPrivService.selectByPrimaryKey(request, id);
	}

	@ResponseBody
	@RequestMapping({ "/updateSchoolPriv" })
	public ToJson<SchoolPriv> updateSchoolPriv(HttpServletRequest request,
			SchoolPriv schoolPriv) {
		return this.schoolPrivService.updateSchoolPriv(request, schoolPriv);
	}

	@ResponseBody
	@RequestMapping({ "/selectAll" })
	public ToJson<SchoolPriv> selectAll(HttpServletRequest request,
			SchoolPriv schoolPriv) {
		return this.schoolPrivService.selectAll(request, schoolPriv);
	}

	@ResponseBody
	@RequestMapping({ "/selectObjectBySelf" })
	public ToJson<SchoolPriv> selectObjectBySelf(HttpServletRequest request,
			SchoolPriv schoolPriv, Integer page, Integer pageSize,
			boolean useFlag) {
		return this.schoolPrivService.selectObjectBySelf(request, schoolPriv,
				page, pageSize, useFlag);
	}
}
