package com.myoa.controller.edu.eduElectiveStudent;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.edu.eduElectiveStudent.EduElectiveStudent;
import com.myoa.service.edu.eduElectiveStudent.IEduElectiveStudentService;
import com.myoa.service.edu.eduElectiveStudentCount.IEduElectiveStudentCountService;
import com.myoa.util.ToJson;

@Controller
@RequestMapping({ "/eduElectiveStudent" })
public class EduElectiveStudentController {

	@Autowired
	private IEduElectiveStudentService eduElectiveStudentService;

	@Autowired
	private IEduElectiveStudentCountService eduElectiveStudentCountService;

	@RequestMapping({ "/eduElectiveStudentSelect" })
	@ResponseBody
	public ToJson eduElectiveStudentSelect(HttpServletRequest request) {
		return this.eduElectiveStudentService.eduElectiveStudentSelect(request);
	}

	@RequestMapping({ "eduElectiveStudentClass" })
	@ResponseBody
	public ToJson eduElectiveStudentClass(HttpServletRequest request) {
		return this.eduElectiveStudentService.eduElectiveStudentClass(request);
	}

	@RequestMapping({ "/eduElectiveStudentDelete" })
	@ResponseBody
	public ToJson eduElectiveStudentDelete(HttpServletRequest request) {
		return this.eduElectiveStudentService.eduElectiveStudentDelete(request);
	}

	@RequestMapping({ "/eduElectiveStudentInsert" })
	@ResponseBody
	public ToJson eduElectiveStudentInsert(
			EduElectiveStudent[] eduElectiveStudent) {
		return this.eduElectiveStudentService
				.eduElectiveStudentInsert(eduElectiveStudent);
	}
}
