package com.myoa.controller.edu.eduStudentExt;

import com.myoa.model.edu.eduStudentExt.EduStudentExt;
import com.myoa.service.edu.eduStudentExt.IEduStudentExtService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/eduStudentExt" })
public class EduStudentExtController {

	@Autowired
	IEduStudentExtService eduStudentExtService;

	@ResponseBody
	@RequestMapping({ "/getSemeter" })
	public ToJson<EduStudentExt> getSemeter(HttpServletRequest request,
			EduStudentExt eduStudentExt) {
		return this.eduStudentExtService.getSemeter(request, eduStudentExt);
	}
}
