package com.myoa.controller.edu.eduTrain;

import com.myoa.model.edu.eduTrainingPlanRecord.EduTrainingRecordWithBLOBs;
import com.myoa.service.edu.eduTrainingRecord.EduTrainingRecordService;
import com.myoa.util.AjaxJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/record" })
public class EduTrainPlainRecordController {

	@Autowired
	private EduTrainingRecordService eduTrainingRecordService;

	@RequestMapping({ "/trainRecord" })
	public String trainRecord() {
		return "app/edu/eduTrainPlan/planRecordIndex";
	}

	@RequestMapping({ "/trainRecordMange" })
	public String trainRecordMange() {
		return "app/edu/eduTrainPlan/trainRecordMange";
	}

	@RequestMapping({ "/trainRecordNew" })
	public String trainRecordNew() {
		return "app/edu/eduTrainPlan/trainRecordNew";
	}

	@RequestMapping({ "/trainRecordQuery" })
	public String trainRecordQuery() {
		return "app/edu/eduTrainPlan/trainRecordQuery";
	}

	@RequestMapping({ "/goDetail" })
	public String goDetail() {
		return "app/edu/eduTrainPlan/trainRecordDetail";
	}

	@RequestMapping({ "/save" })
	@ResponseBody
	public AjaxJson addEduTrainPlainRecord(HttpServletRequest request,
			EduTrainingRecordWithBLOBs eduTrainingRecordWithBLOBs) {
		return this.eduTrainingRecordService.addEduTrainPlainRecord(request,
				eduTrainingRecordWithBLOBs);
	}

	@RequestMapping({ "/editRecord" })
	@ResponseBody
	public AjaxJson editRecord(HttpServletRequest request,
			EduTrainingRecordWithBLOBs eduTrainingRecordWithBLOBs) {
		return this.eduTrainingRecordService.editRecord(request,
				eduTrainingRecordWithBLOBs);
	}

	@RequestMapping({ "/delete" })
	@ResponseBody
	public AjaxJson deleteRecordById(HttpServletRequest request,
			Integer recordId) {
		return this.eduTrainingRecordService
				.deleteRecordById(request, recordId);
	}

	@RequestMapping({ "/getdetail" })
	@ResponseBody
	public AjaxJson getdetail(HttpServletRequest request, Integer recordId) {
		return this.eduTrainingRecordService.getdetail(request, recordId);
	}

	@RequestMapping({ "/getAll" })
	@ResponseBody
	public AjaxJson getAll(
			HttpServletRequest request,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) Boolean useFlag) {
		return this.eduTrainingRecordService.getAll(request, page, pageSize,
				useFlag);
	}

	@RequestMapping({ "/query" })
	@ResponseBody
	public AjaxJson queryRecord(
			EduTrainingRecordWithBLOBs eduTrainingRecordWithBLOBs,
			String export, HttpServletRequest request,
			HttpServletResponse response) {
		return this.eduTrainingRecordService.queryRecord(
				eduTrainingRecordWithBLOBs, export, request, response);
	}

	@RequestMapping({ "/deleteByIds" })
	@ResponseBody
	public AjaxJson deleteByIds(String[] recordIds) {
		return this.eduTrainingRecordService.deleteByIds(recordIds);
	}
}