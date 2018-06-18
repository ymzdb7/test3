package com.myoa.controller.edu.eduPrize;

import com.myoa.model.edu.eduPrize.EduPrizeInfo;
import com.myoa.service.edu.eduPrize.EduPrizeService;
import com.myoa.util.AjaxJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/eduPrize" })
public class EduPrizeController {

	@Autowired
	private EduPrizeService eduPrizeService;

	@RequestMapping({ "/addEduPrizeInfo" })
	@ResponseBody
	public AjaxJson addEduPrizeInfo(EduPrizeInfo eduPrizeInfo) {
		return this.eduPrizeService.addEduPrizeInfo(eduPrizeInfo);
	}

	@RequestMapping({ "/getAllEduPrizeInfo" })
	@ResponseBody
	public AjaxJson getAllEduPrizeInfo(
			EduPrizeInfo eduPrizeInfo,
			HttpServletRequest request,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) Boolean useFlag) {
		return this.eduPrizeService.getAllEduPrizeInfo(eduPrizeInfo, request,
				page, pageSize, useFlag);
	}

	@RequestMapping({ "/editEduPrizeInfo" })
	@ResponseBody
	public AjaxJson editEduPrizeInfo(EduPrizeInfo eduPrizeInfo) {
		return this.eduPrizeService.editEduPrizeInfo(eduPrizeInfo);
	}

	@RequestMapping({ "/deleteEduPrizeInfo" })
	@ResponseBody
	public AjaxJson deleteEduPrizeInfo(Integer id) {
		return this.eduPrizeService.deleteEduPrizeInfo(id);
	}

	@RequestMapping({ "/getEduPrizeInfoById" })
	@ResponseBody
	public AjaxJson getEduPrizeInfoById(Integer id) {
		return this.eduPrizeService.getEduPrizeInfoById(id);
	}

	@RequestMapping({ "/getAllSubject" })
	@ResponseBody
	public AjaxJson getAllSubject(HttpServletRequest request) {
		return this.eduPrizeService.getAllSubject(request);
	}

	@RequestMapping({ "/goIndex" })
	public String goIndex() {
		return "app/edu/eduPrize/index";
	}

	@RequestMapping({ "/exportExcel" })
	public void exportExcel(EduPrizeInfo eduPrizeInfo,
			HttpServletRequest request, HttpServletResponse response) {
		this.eduPrizeService.exportExcel(eduPrizeInfo, request, response);
	}
}
