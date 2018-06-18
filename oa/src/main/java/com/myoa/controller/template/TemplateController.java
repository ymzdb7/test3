package com.myoa.controller.template;

import com.myoa.model.template.TemplateModule;
import com.myoa.service.template.TemplateService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/template" })
public class TemplateController {

	@Resource
	private TemplateService templateService;

	@RequestMapping({ "/redTemplateSelect" })
	public String redTemplateSelect(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/common/red_template";
	}

	@ResponseBody
	@RequestMapping({ "/query" })
	public ToJson<TemplateModule> queryTemplate(TemplateModule templateModule,
			Integer page, Integer pageSize, Boolean useFlag) {
		return this.templateService.queryTemplate(templateModule, page,
				pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/add" })
	public ToJson<TemplateModule> addTemplate(HttpServletRequest request,
			TemplateModule template,
			@RequestParam(required = false) MultipartFile file) {
		return this.templateService.addTemplate(request, template, file);
	}

	@ResponseBody
	@RequestMapping({ "/update" })
	public ToJson<TemplateModule> updateTemplate(TemplateModule template,
			@RequestParam(required = false) MultipartFile file,
			Integer deleteFlag, HttpServletRequest request,
			HttpServletResponse response) {
		return this.templateService.updateTemplate(template, file, deleteFlag,
				request, response);
	}

	@ResponseBody
	@RequestMapping({ "/deleteById" })
	public ToJson<TemplateModule> deleteTemplate(Integer id) {
		return this.templateService.deleteTemplate(id);
	}

	@ResponseBody
	@RequestMapping({ "/queryTemplateByPriv" })
	public ToJson<TemplateModule> queryTemplateByPriv(
			TemplateModule templateModule, Integer page, Integer pageSize,
			Boolean useFlag, HttpServletRequest request) {
		return this.templateService.queryTemplateByPriv(templateModule, page,
				pageSize, useFlag, request);
	}
}
