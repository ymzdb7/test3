package com.myoa.controller.edu.eduElectiveDetail;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.edu.eduElectiveDetail.EduElectiveDetail;
import com.myoa.service.edu.eduElectiveDetail.IEduElectiveDetailService;
import com.myoa.util.ToJson;

@Controller
@RequestMapping({ "/eduElectiveDetail" })
public class EduElectiveDetailController {

	@Autowired
	private IEduElectiveDetailService eduElectiveDetailService;

	@RequestMapping({ "/eduSelectOneDetail" })
	@ResponseBody
	public ToJson<EduElectiveDetail> eduSelectOneDetail(
			HttpServletRequest request) {
		Integer sid = Integer.valueOf(request.getParameter("tid"));
		return this.eduElectiveDetailService.eduSelectOneDetail(sid);
	}

	@RequestMapping({ "/eduUpdateDetail" })
	@ResponseBody
	public ToJson eduUpdateDetail(EduElectiveDetail eduElectiveDetail,
			HttpServletRequest request) {
		return this.eduElectiveDetailService.eduUpdateDetail(eduElectiveDetail,
				request);
	}
}
