package com.myoa.controller.documentOrg;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.documentOrg.DocumentOrg;
import com.myoa.service.documentOrg.DocumentOrgService;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

@Controller
@RequestMapping({ "/documentOrg" })
public class DocumentOrgController {

	@Autowired
	DocumentOrgService documentOrgService;

	@RequestMapping({ "/issue" })
	public String issue() {
		return "app/officialDocument/issue";
	}

	@ResponseBody
	@RequestMapping({ "/save" })
	public ToJson<DocumentOrg> save(Integer id, DocumentOrg documentOrg,
			HttpServletRequest request) {
		return this.documentOrgService.saveDoc(id, documentOrg, request);
	}

	@ResponseBody
	@RequestMapping({ "/selDocumentOrg" })
	public ToJson<DocumentOrg> selDocumentOrg(DocumentOrg documentOrg,
			HttpServletRequest request, PageParams pageParams) {
		return this.documentOrgService.selDocumentOrg(documentOrg, request,
				pageParams);
	}

	@ResponseBody
	@RequestMapping({ "/saveToDocument" })
	public ToJson<Object> saveToDocument(HttpServletRequest request,
			Integer id, Integer flowId, String documentType) {
		return this.documentOrgService.saveToDocument(request, id, flowId,
				documentType);
	}
}
