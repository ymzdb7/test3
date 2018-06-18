package com.myoa.controller.edu.eduArrangeCource;

import com.myoa.service.edu.eduArrangeCource.IEduArrangeCourseService;
import com.myoa.util.ToJson;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/eduArrangeCourse" })
public class EduArrangeCourseController {

	@Autowired
	private IEduArrangeCourseService eduArrangeCourseService;

	@RequestMapping({ "/arrangeCourse" })
	public String arrangeCourse() {
		return "app/edu/eduSchedule/schedule";
	}

	@RequestMapping({ "/eduArrangeCourseClassSelect" })
	@ResponseBody
	public ToJson eduArrangeCourseClassSelect(HttpServletRequest request,
			Integer page, Integer pageSize, boolean useFlag) {
		Map maps = new HashMap();
		maps.put("academicYear", request.getParameter("academicYear"));
		maps.put("semester", request.getParameter("semester"));
		maps.put("gradeClass", request.getParameter("gradeClass"));
		return this.eduArrangeCourseService.eduArrangeCourseClassSelect(maps,
				page, pageSize, useFlag);
	}

	@RequestMapping({ "/eduArrangeCourseTeacherSelect" })
	@ResponseBody
	public ToJson eduArrangeCourseTeacherSelect(HttpServletRequest request,
			Integer page, Integer pageSize, boolean useFlag) {
		return this.eduArrangeCourseService.eduArrangeCourseTeacherSelect(
				request, page, pageSize, useFlag);
	}

	@RequestMapping({ "/eduArrangeCourseTotalClass" })
	@ResponseBody
	public ToJson eduArrangeCourseTotalClass(HttpServletRequest request,
			Integer page, Integer pageSize, boolean useFlag) {
		Map maps = new HashMap();
		maps.put("academicYear", request.getParameter("academicYear"));
		maps.put("semester", request.getParameter("semester"));
		return this.eduArrangeCourseService.eduArrangeCourseTotalClass(maps,
				page, pageSize, useFlag);
	}

	@RequestMapping({ "/eduArrangeCourseTotalTeacher" })
	@ResponseBody
	public ToJson eduArrangeCourseTotalTeacher(HttpServletRequest request,
			Integer page, Integer pageSize, boolean useFlag) {
		return this.eduArrangeCourseService.eduArrangeCourseTotalTeacher(
				request, page, pageSize, useFlag);
	}

	@RequestMapping({ "/importArrangeCourse" })
	@ResponseBody
	public ToJson importArrangeCourse(MultipartFile file,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		return this.eduArrangeCourseService.importArrangeCourse(file, request,
				response, session);
	}
}
