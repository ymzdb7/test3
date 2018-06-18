package com.myoa.controller.edu.eduYear;

import com.myoa.model.edu.eduYear.EduYear;
import com.myoa.service.edu.eduYear.EduYearService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/eduYear" })
public class eduYearController {

	@Resource
	private EduYearService eduYearService;

	@RequestMapping({ "/schoolYearManagement" })
	public String index() {
		return "app/edu/basicSetting/schoolYearManagement";
	}

	@ResponseBody
	@RequestMapping({ "/addEduYear" })
	public ToJson<EduYear> addEduYear(HttpServletRequest request,
			EduYear eduYear) {
		return this.eduYearService.addEduYear(request, eduYear);
	}

	@ResponseBody
	@RequestMapping({ "/deleteEduYear" })
	public ToJson<EduYear> deleteEduYear(Integer yearId) {
		return this.eduYearService.deleteEduYear(yearId);
	}

	@ResponseBody
	@RequestMapping({ "/selectEduYear" })
	public ToJson<EduYear> selectEduYear(Integer yearId) {
		return this.eduYearService.selectEduYear(yearId);
	}

	@ResponseBody
	@RequestMapping({ "/updateEduYear" })
	public ToJson<EduYear> updateEduYear(HttpServletRequest request,
			EduYear eduYear) {
		return this.eduYearService.updateEduYear(request, eduYear);
	}

	@ResponseBody
	@RequestMapping({ "/selectAll" })
	public ToJson<EduYear> selectAll(Integer page, Integer pageSize,
			boolean useFlag, EduYear eduYear, String export,
			HttpServletResponse response, HttpServletRequest request) {
		return this.eduYearService.selectAll(page, pageSize, useFlag, eduYear,
				export, response, request);
	}
}