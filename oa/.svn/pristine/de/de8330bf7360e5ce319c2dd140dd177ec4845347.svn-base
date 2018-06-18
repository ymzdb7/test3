package com.myoa.controller.edu.eduElectiveCourse;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.edu.eduElectiveCourse.eduElectiveCourseWithBLOBs;
import com.myoa.service.edu.eduElectiveCourse.IEduElectiveCourseSerivce;
import com.myoa.util.ToJson;

@Controller
@RequestMapping({ "/eduElectiveCourseController" })
public class EduElectiveCourseController {

	@Autowired
	private IEduElectiveCourseSerivce eduElectiveCourseSerivce;

	@RequestMapping({ "/insertSelective" })
	@ResponseBody
	public ToJson insertSelective(
			eduElectiveCourseWithBLOBs eduElectiveCourseWithBLOBs,
			HttpServletRequest request) {
		return this.eduElectiveCourseSerivce.insertSelective(
				eduElectiveCourseWithBLOBs, request);
	}

	@RequestMapping({ "/selectEduElectiveCourse" })
	@ResponseBody
	public ToJson<eduElectiveCourseWithBLOBs> selectEduElectiveCourse(
			eduElectiveCourseWithBLOBs eduElectiveCourseWithBLOBs,
			HttpServletRequest request, Integer page, Integer pageSize,
			boolean useFlag) {
		return this.eduElectiveCourseSerivce.selectEduElectiveCourse(
				eduElectiveCourseWithBLOBs, request, page, pageSize, useFlag);
	}

	@RequestMapping({ "/updateByPrimaryKeySelective" })
	@ResponseBody
	public ToJson updateByPrimaryKeySelective(
			eduElectiveCourseWithBLOBs eduElectiveCourseWithBLOBs) {
		return this.eduElectiveCourseSerivce
				.updateByPrimaryKeySelective(eduElectiveCourseWithBLOBs);
	}

	@RequestMapping({ "/deleteElectveCourse" })
	@ResponseBody
	public ToJson deleteElectveCourse(HttpServletRequest request) {
		return this.eduElectiveCourseSerivce.deleteElectveCourse(request);
	}

	@RequestMapping({ "/eduCourseUpdate" })
	public String eduElectiveUpdate() {
		return "app/edu/eduElectiveCourse/basicCourseUpdate";
	}
}
