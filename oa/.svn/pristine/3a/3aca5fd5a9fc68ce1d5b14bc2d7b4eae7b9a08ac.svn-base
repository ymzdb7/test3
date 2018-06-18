package com.myoa.controller.edu.eduTrain;

import com.myoa.model.edu.eduTrainingPlan.EduTrainingPlan;
import com.myoa.service.edu.eduTrainingPlan.IEduTrainingPlanService;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/eduTrainPlan" })
public class EduTrainPlanController {

	@Resource
	private IEduTrainingPlanService eduTrainingPlanService;

	@RequestMapping({ "/getHrtailDetail" })
	@ResponseBody
	public ToJson<EduTrainingPlan> getHrtailDetail(Integer planId) {
		return this.eduTrainingPlanService.getHrtailDetail(planId);
	}

	@RequestMapping({ "/getAllTrain" })
	@ResponseBody
	public AjaxJson getAllTrain(HttpServletRequest request, Integer page,
			Integer pageSize, boolean useFlag) {
		return this.eduTrainingPlanService.getAll(request, page, pageSize,
				useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/editTrain" })
	public AjaxJson editTrain(EduTrainingPlan eduTrainingPlan) {
		return this.eduTrainingPlanService.editTrain(eduTrainingPlan);
	}

	@ResponseBody
	@RequestMapping({ "/deleteTrainObjects" })
	public AjaxJson deleteTrainObjects(String[] planIds) {
		return this.eduTrainingPlanService.deleteTrainObjects(planIds);
	}

	@ResponseBody
	@RequestMapping({ "/deleteTrainById" })
	public AjaxJson deleteTrainById(String planId) {
		return this.eduTrainingPlanService.deleteTrainById(planId);
	}

	@ResponseBody
	@RequestMapping({ "/addTrain" })
	public AjaxJson addTrain(HttpServletRequest request,
			EduTrainingPlan eduTrainingPlan) {
		return this.eduTrainingPlanService.addTrain(request, eduTrainingPlan);
	}

	@ResponseBody
	@RequestMapping({ "/queryTrain" })
	public AjaxJson queryTrain(Integer page, Integer pageSize, boolean useFlag,
			EduTrainingPlan eduTrainingPlan) {
		return this.eduTrainingPlanService.queryTrain(page, pageSize, useFlag,
				eduTrainingPlan);
	}

	@RequestMapping({ "/goIndex" })
	public String goIndex() {
		return "app/edu/eduTrainPlan/index";
	}

	@RequestMapping({ "/goManage" })
	public String goManage() {
		return "app/edu/eduTrainPlan/mange";
	}

	@RequestMapping({ "/goNew" })
	public String goNew() {
		return "app/edu/eduTrainPlan/trainPlanNew";
	}

	@RequestMapping({ "/goQuery" })
	public String goQuery() {
		return "app/edu/eduTrainPlan/trainPlanQuery";
	}

	@RequestMapping({ "/assessIndex" })
	public String assessIndex() {
		return "app/edu/eduTrainPlan/assessIndex";
	}

	@RequestMapping({ "/assessManage" })
	public String assessManage() {
		return "app/edu/eduTrainPlan/assessMange";
	}

	@RequestMapping({ "/approvalTrue" })
	public String ApprovalTrue() {
		return "app/edu/eduTrainPlan/approvalTrue";
	}

	@RequestMapping({ "/approvalFalse" })
	public String ApprovalFlase() {
		return "app/edu/eduTrainPlan/approvalFalse";
	}

	@RequestMapping({ "/approvalQuery" })
	public String approvalQuery() {
		return "app/edu/eduTrainPlan/approvalQuery";
	}

	@ResponseBody
	@RequestMapping({ "/getEduTrainByStatus" })
	public AjaxJson getEduTrainByStatus(HttpServletRequest request,
			String assessingStatus) {
		return this.eduTrainingPlanService.getEduTrainByStatus(request,
				assessingStatus);
	}

	@ResponseBody
	@RequestMapping({ "/getMinePlanByStatus" })
	public AjaxJson getMinePlanByStatus(HttpServletRequest request,
			String assessingStatus) {
		return this.eduTrainingPlanService.getMinePlanByStatus(request,
				assessingStatus);
	}

	@ResponseBody
	@RequestMapping({ "/editEduTrainByStatus" })
	public AjaxJson editEduTrainByStatus(EduTrainingPlan eduTrainingPlan) {
		return this.eduTrainingPlanService
				.editEduTrainByStatus(eduTrainingPlan);
	}

	@ResponseBody
	@RequestMapping({ "/QueryPlan" })
	public AjaxJson QueryPlan(EduTrainingPlan eduTrainingPlan,
			String startTime, String endTime) {
		return this.eduTrainingPlanService.QueryPlan(eduTrainingPlan,
				startTime, endTime);
	}

	@ResponseBody
	@RequestMapping({ "/QueryPlanStatus" })
	public AjaxJson QueryPlanStatus(EduTrainingPlan eduTrainingPlan,
			String startTime, String endTime, HttpServletRequest request) {
		return this.eduTrainingPlanService.QueryPlanStatus(eduTrainingPlan,
				startTime, endTime, request);
	}

	@ResponseBody
	@RequestMapping({ "/getAllPlan" })
	public AjaxJson getAllPlan() {
		return this.eduTrainingPlanService.getAllPlan();
	}

	@ResponseBody
	@RequestMapping({ "/getAllPlanTrue" })
	public AjaxJson getAllPlanTrue() {
		return this.eduTrainingPlanService.getAllPlanTrue();
	}

	@RequestMapping({ "/goDetail" })
	public String goDetail(String planId) {
		return "app/edu/eduTrainPlan/trainPlanDetail";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}
}
