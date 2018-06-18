package com.myoa.controller.portalArticle;

import com.myoa.model.portalArticle.PortalArticleWithBLOBs;
import com.myoa.service.portalArticle.PortalArticleService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/article" })
public class PortalArticleController {

	@Resource
	private PortalArticleService portalArticleService;

	@RequestMapping({ "/article" })
	public String goIndex() {
		return "app/article/index";
	}

	@ResponseBody
	@RequestMapping({ "/selectPortalArticle" })
	public ToJson selectPortalArticle(
			PortalArticleWithBLOBs portalArticleWithBLOBs) {
		return this.portalArticleService
				.selectPortalArticle(portalArticleWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/selectPortalArticleById" })
	public ToJson selectPortalArticleById(Integer articleId) {
		return this.portalArticleService.selectPortalArticleById(articleId);
	}

	@ResponseBody
	@RequestMapping({ "/insertPortalArticle" })
	public ToJson insertPortalArticle(
			PortalArticleWithBLOBs portalArticleWithBLOBs) {
		return this.portalArticleService
				.insertPortalArticle(portalArticleWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/upPortalArticle" })
	public ToJson upPortalArticle(PortalArticleWithBLOBs portalArticleWithBLOBs) {
		return this.portalArticleService
				.upPortalArticle(portalArticleWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/delPortalArticle" })
	public ToJson delPortalArticle(PortalArticleWithBLOBs portalArticleWithBLOBs) {
		return this.portalArticleService
				.delPortalArticle(portalArticleWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/articleTree" })
	public ToJson articleTreeController(String id,
			@RequestParam(value = "colIds", required = false) Integer[] colIds) {
		return this.portalArticleService.articleTree(id, colIds);
	}
}
