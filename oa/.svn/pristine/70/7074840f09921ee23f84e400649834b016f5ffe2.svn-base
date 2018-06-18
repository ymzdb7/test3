package com.myoa.controller.edu.eduStudent;

import com.myoa.model.edu.eduParent.EduParent;
import com.myoa.model.edu.eduStudent.EduStudent;
import com.myoa.model.edu.eduStudentExt.EduStudentExt;
import com.myoa.service.edu.eduStudent.IEduStudentService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/edu/student" })
public class EduStudentController {

	@Autowired
	IEduStudentService eduStudentService;

	@RequestMapping({ "/eduStudentIndex" })
	public String eduStudentIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduStudent/index";
	}

	@RequestMapping({ "/editStudent" })
	public String editStudent(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduStudent/editStudent";
	}

	@RequestMapping({ "/eduStudentNew" })
	public String eduStudentNew(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduStudent/newStudent";
	}

	@RequestMapping({ "/eduStudentSearch" })
	public String eduStudentSearch(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduStudent/searchStudent";
	}

	@RequestMapping({ "/eduStudentList" })
	public String eduStudentList(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduStudent/studentList";
	}

	@RequestMapping({ "/importStudent" })
	public String importStudent(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduStudent/importStudent";
	}

	@ResponseBody
	@RequestMapping({ "/getGrade" })
	public ToJson<EduStudent> getGrade(HttpServletRequest request,
			EduStudent eduStudent) {
		return this.eduStudentService.getGrade(request, eduStudent);
	}

	@ResponseBody
	@RequestMapping(value = { "/getClassByDeptId" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<EduStudent> getClassByDeptId(HttpServletRequest request,
			Integer deptId) {
		return this.eduStudentService.getClassByDeptId(request, deptId);
	}

	@ResponseBody
	@RequestMapping({ "/getUserByDeptId" })
	public ToJson<EduStudent> getUserByDeptId(HttpServletRequest request,
			Integer deptId) {
		return this.eduStudentService.getUserByDeptId(request, deptId);
	}

	@ResponseBody
	@RequestMapping({ "/getStudentInforByUserId" })
	public ToJson<EduStudent> getStudentInforByUid(HttpServletRequest request,
			Integer uid) {
		return this.eduStudentService.getStudentInforByUid(request, uid);
	}

	@ResponseBody
	@RequestMapping({ "/getStudentList1" })
	public ToJson<EduStudent> getStudentList1(HttpServletRequest request,
			Integer deptId) {
		return this.eduStudentService.getStudentList1(request, deptId);
	}

	@ResponseBody
	@RequestMapping({ "/getStudentList" })
	public ToJson<EduStudent> getStudentList(HttpServletRequest request,
			EduStudent eduStudent) {
		return this.eduStudentService.getStudentList(request, eduStudent);
	}

	@ResponseBody
	@RequestMapping({ "/getStudentExport" })
	public ToJson<EduStudent> getStudentExport(HttpServletRequest request,
			HttpServletResponse response, EduStudent eduStudent,
			EduStudentExt eduStudentExt, String userId, String userName,
			Integer mobilNo, String sex, String grade, String clazz,
			String export) {
		return this.eduStudentService.getStudentExport(request, response,
				eduStudent, eduStudentExt, userId, userName, mobilNo, sex,
				grade, clazz, export);
	}

	@ResponseBody
	@RequestMapping({ "/deleteStudentByUid" })
	public ToJson<EduStudent> deleteStudentByUid(HttpServletRequest request,
			String[] uids) {
		return this.eduStudentService.deleteStudentByUid(request, uids);
	}

	@ResponseBody
	@RequestMapping({ "/clearPasswordByUid" })
	public ToJson<EduStudent> clearPasswordByUid(HttpServletRequest request,
			String uids) {
		return this.eduStudentService.clearPasswordByUid(request, uids);
	}

	@ResponseBody
	@RequestMapping({ "/addStudent" })
	public ToJson<EduStudent> addStudent(HttpServletRequest request,
			EduStudent eduStudent, EduStudentExt eduStudentExt) {
		return this.eduStudentService.addStudent(request, eduStudent,
				eduStudentExt);
	}

	@ResponseBody
	@RequestMapping({ "/updateStudent" })
	public ToJson<EduStudent> updateStudent(HttpServletRequest request,
			EduStudent eduStudent, EduParent eduParent,
			EduStudentExt eduStudentExt) {
		return this.eduStudentService.updateStudent(request, eduStudent,
				eduParent, eduStudentExt);
	}

	@ResponseBody
	@RequestMapping({ "/StudentAcademicYear" })
	public ToJson<Object> StudentAcademicYear(HttpServletRequest request) {
		return this.eduStudentService.StudentAcademicYear(request);
	}

	@RequestMapping({ "/importStudentInfor" })
	@ResponseBody
	public ToJson importStudentInfor(MultipartFile file,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		return this.eduStudentService.importStudentInfor(file, request,
				response, session);
	}
}
