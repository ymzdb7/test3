package com.myoa.controller.edu.eduTerm;

import com.myoa.model.edu.eduTerm.EduTerm;
import com.myoa.service.edu.eduTerm.EduTermService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/eduTerm" })
public class EduTermController {

	@Resource
	private EduTermService eduTermService;

	@RequestMapping({ "/termManagement" })
	public String index() {
		return "app/edu/basicSetting/termManagement";
	}

	@ResponseBody
	@RequestMapping({ "/addEduTerm" })
	public ToJson<EduTerm> addEduTerm(HttpServletRequest request,
			EduTerm eduTerm) {
		return this.eduTermService.addEduTerm(request, eduTerm);
	}

	@ResponseBody
	@RequestMapping({ "/deleteEduTerm" })
	public ToJson<EduTerm> deleteEduTerm(Integer termId) {
		return this.eduTermService.deleteEduTerm(termId);
	}

	@ResponseBody
	@RequestMapping({ "/selectEduTerm" })
	public ToJson<EduTerm> selectEduTerm(Integer termId) {
		return this.eduTermService.selectEduTerm(termId);
	}

	@ResponseBody
	@RequestMapping({ "/updateEduTerm" })
	public ToJson<EduTerm> updateEduTerm(HttpServletRequest request,
			EduTerm eduTerm) {
		return this.eduTermService.updateEduTerm(request, eduTerm);
	}

	@ResponseBody
	@RequestMapping({ "/selectAll" })
	public ToJson<EduTerm> selectAll(Integer page, Integer pageSize,
			boolean useFlag, EduTerm eduTerm, String export,
			HttpServletResponse response, HttpServletRequest request) {
		return this.eduTermService.selectAll(page, pageSize, useFlag, eduTerm,
				export, response, request);
	}
}