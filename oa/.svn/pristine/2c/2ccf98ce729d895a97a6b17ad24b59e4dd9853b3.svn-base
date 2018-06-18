package com.myoa.controller.edu;

import com.myoa.model.edu.eduCourse.EduCourse;
import com.myoa.model.edu.eduTeacher.EduTeacher;
import com.myoa.model.edu.eduTeacher.EduTeacherWithBLOBs;
import com.myoa.service.edu.eduTeacher.EduTeacherService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/eduTeacher" })
public class EduTeacherController {

	@Resource
	private EduTeacherService eduTeacherService;

	@RequestMapping({ "/index" })
	public String index() {
		return "app/edu/eduTeacher/index";
	}

	@RequestMapping({ "/manage" })
	public String managePage() {
		return "app/edu/eduTeacher/manage";
	}

	@RequestMapping({ "/query" })
	public String queryPage() {
		return "app/edu/eduTeacher/query";
	}

	@RequestMapping({ "/import" })
	public String importPage() {
		return "app/edu/eduTeacher/import";
	}

	@ResponseBody
	@RequestMapping({ "/save" })
	public ToJson<EduTeacher> save(EduTeacherWithBLOBs teacher) {
		return this.eduTeacherService.save(teacher);
	}

	@ResponseBody
	@RequestMapping({ "/getTeacherInfo" })
	public ToJson<EduTeacher> getTeacherInfo(EduTeacherWithBLOBs teacher) {
		return this.eduTeacherService.getTeacherInfo(teacher);
	}

	@ResponseBody
	@RequestMapping({ "/importTeacher" })
	public ToJson<EduTeacher> importTeacher(MultipartFile file,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		return this.eduTeacherService.importTeacher(file, request, response,
				session);
	}

	@ResponseBody
	@RequestMapping({ "/deleteByIds" })
	public ToJson<EduTeacher> deleteTeacher(String ids) {
		return this.eduTeacherService.deleteTeacher(ids);
	}

	@ResponseBody
	@RequestMapping({ "/queryAndExport" })
	public ToJson<EduTeacher> queryAndExport(HttpServletRequest request,
			HttpServletResponse response, String userId, String teacherType,
			String schoolYear, String clazz, String grade, String term,
			String course, boolean useFlag, Integer page, Integer pageSize,
			String queryType) {
		return this.eduTeacherService.queryAndExport(request, response, userId,
				teacherType, schoolYear, clazz, grade, term, course, useFlag,
				page, pageSize, queryType);
	}

	@ResponseBody
	@RequestMapping({ "/getEduTeacherById" })
	ToJson<EduTeacher> getEduTeacherById(Integer id) {
		return this.eduTeacherService.getEduTeacherById(id);
	}

	@ResponseBody
	@RequestMapping({ "/getCourseByGrade" })
	public ToJson<EduCourse> getCourseByGrade(String grade) {
		return this.eduTeacherService.getCourseByGrade(grade);
	}

	@ResponseBody
	@RequestMapping({ "/update" })
	ToJson<EduTeacher> update(EduTeacherWithBLOBs eduTeacher) {
		return this.eduTeacherService.update(eduTeacher);
	}
}
