package com.myoa.controller.edu.eduLearnPhase;

import com.myoa.model.edu.eduLearnPhase.EduLearnPhase;
import com.myoa.service.edu.eduLearnPhase.EduLearnPhaseService;
import com.myoa.util.ToJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/eduLearnPhase" })
public class EduLearnPhaseController {

	@Autowired
	private EduLearnPhaseService eduLearnPhaseService;

	@RequestMapping({ "/studySectionManagement" })
	public String index() {
		return "app/edu/basicSetting/studySectionManagement";
	}

	@ResponseBody
	@RequestMapping({ "/addEduLearnPhase" })
	public ToJson<EduLearnPhase> addEduLearnPhase(EduLearnPhase eduLearnPhase) {
		return this.eduLearnPhaseService.addEduLearnPhase(eduLearnPhase);
	}

	@ResponseBody
	@RequestMapping({ "/delEduLearnPhase" })
	public ToJson<EduLearnPhase> delEduLearnPhase(int id) {
		return this.eduLearnPhaseService.delEduLearnPhase(id);
	}

	@ResponseBody
	@RequestMapping({ "/updateEduLearnPhase" })
	public ToJson<EduLearnPhase> updateEduLearnPhase(EduLearnPhase eduLearnPhase) {
		return this.eduLearnPhaseService.updateEduLearnPhase(eduLearnPhase);
	}

	@ResponseBody
	@RequestMapping({ "/selEduLearnPhaseById" })
	public ToJson<EduLearnPhase> selEduLearnPhaseById(int id) {
		return this.eduLearnPhaseService.selEduLearnPhaseById(id);
	}

	@ResponseBody
	@RequestMapping({ "/selEduLearnPhase" })
	public ToJson<EduLearnPhase> selEduLearnPhase(EduLearnPhase eduLearnPhase,
			Integer page, Integer pageSize, boolean useFlag) {
		return this.eduLearnPhaseService.selEduLearnPhase(eduLearnPhase, page,
				pageSize, useFlag);
	}
}
