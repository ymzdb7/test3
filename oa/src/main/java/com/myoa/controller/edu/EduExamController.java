package com.myoa.controller.edu;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.myoa.model.edu.eduExam.EduExamWithBLOBs;
import com.myoa.service.edu.eduExam.EduExamService;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

@Controller
@RequestMapping({ "/eduExam" })
public class EduExamController {
	private Logger loger = Logger.getLogger(EduExamController.class);

	@Autowired
	private EduExamService eduExamService;

	@RequestMapping({ "/index" })
	public String index() {
		return "app/edu/eduExam/index";
	}

	@RequestMapping({ "/addExam" })
	public String addExam() {
		return "app/edu/eduExam/add";
	}

	@RequestMapping({ "/findExam" })
	public String findExam() {
		return "app/edu/eduExam/findExam";
	}

	@RequestMapping({ "/editExam" })
	public String editExam() {
		return "app/edu/eduExam/examEdit";
	}

	@RequestMapping({ "/queryExam" })
	public String queryExam() {
		return "app/edu/eduExam/examQuery";
	}

	@RequestMapping({ "/insertExam" })
	public String insertExam() {
		return "app/edu/eduExam/examImport";
	}

	@RequestMapping({ "allExam" })
	@ResponseBody
	public AjaxJson getAllExam(Map<String, Object> maps, Integer page,
			Integer pageSize, boolean useFlag, HttpServletRequest request) {
		return this.eduExamService.getAllExam(maps, page, pageSize, useFlag);
	}

	@RequestMapping({ "getOne" })
	@ResponseBody
	public AjaxJson getOneExam(Integer Id) {
		return this.eduExamService.getOneExam(Id);
	}

	@RequestMapping({ "updateExam" })
	@ResponseBody
	public AjaxJson updateExam(EduExamWithBLOBs eduExamWithBLOBs,
			HttpServletRequest request) {
		return this.eduExamService.updateExam(eduExamWithBLOBs, request);
	}

	@RequestMapping({ "editExamInfor" })
	@ResponseBody
	public AjaxJson editExam(EduExamWithBLOBs eduExamWithBLOBs,
			HttpServletRequest request) {
		return this.eduExamService.editExam(eduExamWithBLOBs, request);
	}

	@RequestMapping({ "deleteExam" })
	@ResponseBody
	public AjaxJson deleteExam(Integer Id) {
		return this.eduExamService.deleteExam(Id);
	}

	@RequestMapping({ "deleteManyExam" })
	@ResponseBody
	public AjaxJson deleteManyExam(String ids) {
		return this.eduExamService.deleteManyExam(ids);
	}

	@RequestMapping({ "selectEduExam" })
	@ResponseBody
	public AjaxJson selectEduExam(
			HttpServletRequest request,
			@RequestParam(value = "schoolYear", required = false) String schoolYear,
			@RequestParam(value = "semester", required = false) String semester,
			@RequestParam(value = "examType", required = false) String examType,
			@RequestParam(value = "examArrange", required = false) String examArrange,
			Map<String, Object> maps,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		return this.eduExamService.selectEduExam(schoolYear, semester,
				examType, examArrange, maps, page, pageSize, useFlag);
	}

	@RequestMapping({ "importEduExam" })
	@ResponseBody
	public ToJson importEduExam(MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) {
		return this.eduExamService.importEduExam(file, request, response);
	}
}
