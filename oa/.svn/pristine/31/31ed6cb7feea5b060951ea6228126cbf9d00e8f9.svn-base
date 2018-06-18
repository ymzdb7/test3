package com.myoa.controller.edu.eduSchoolCalendar;

import com.myoa.model.edu.eduSchoolCalendar.EduSchoolCalendarDescWithBLOBs;
import com.myoa.model.edu.eduSchoolCalendar.EduSchoolCalendarWithBLOBs;
import com.myoa.service.edu.eduSchoolCalendar.EduSchoolCalendarService;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/eduSchoolCalendar" })
public class EduSchoolCalendarController {

	@Resource
	private EduSchoolCalendarService eduSchoolCalendarService;

	@RequestMapping({ "/showSchoolCalendar" })
	public String showSchoolCalendar(HttpServletRequest request) {
		return "app/edu/eduSchoolCalendar/eduSchoolCalendar";
	}

	@ResponseBody
	@RequestMapping({ "/editSchoolCalendar" })
	public ToJson<EduSchoolCalendarWithBLOBs> editSchoolCalendar(
			HttpServletRequest request,
			EduSchoolCalendarWithBLOBs eduSchoolCalendarWithBLOBs) {
		return this.eduSchoolCalendarService.editSchoolCalendar(request,
				eduSchoolCalendarWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/delSchoolCalendarById" })
	public ToJson<EduSchoolCalendarWithBLOBs> delSchoolCalendarById(int id) {
		return this.eduSchoolCalendarService.delSchoolCalendarById(id);
	}

	@ResponseBody
	@RequestMapping({ "/selSchoolCalendarByCond" })
	public AjaxJson selSchoolCalendarByCond(
			EduSchoolCalendarWithBLOBs eduSchoolCalendarWithBLOBs) {
		return this.eduSchoolCalendarService
				.selSchoolCalendarByCond(eduSchoolCalendarWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/editSCDesc" })
	public ToJson<EduSchoolCalendarDescWithBLOBs> editSCDesc(
			HttpServletRequest request,
			EduSchoolCalendarDescWithBLOBs eduSchoolCalendarDescWithBLOBs) {
		return this.eduSchoolCalendarService.editSCDesc(request,
				eduSchoolCalendarDescWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/getYearTerm" })
	public ToJson<EduSchoolCalendarDescWithBLOBs> getYearTerm() {
		return this.eduSchoolCalendarService.getYearTerm();
	}
}
