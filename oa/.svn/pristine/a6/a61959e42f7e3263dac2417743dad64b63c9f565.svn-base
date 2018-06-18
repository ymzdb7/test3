package com.myoa.controller.portalColumn;

import com.myoa.model.portalColumn.PortalColumn;
import com.myoa.service.portalColumn.PortalColumnService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/column" })
public class PortalColumnController {

	@Resource
	private PortalColumnService portalColumnService;

	@RequestMapping({ "/column" })
	public String goIndex() {
		return "app/column/index";
	}

	@ResponseBody
	@RequestMapping({ "/selectPortalColumn" })
	public ToJson selectPortalColumn() {
		return this.portalColumnService.selectPortalColumn();
	}

	@ResponseBody
	@RequestMapping({ "/selectPortalColumnById" })
	public ToJson selectPortalColumnById(Integer columnId) {
		return this.portalColumnService.selectPortalColumnById(columnId);
	}

	@ResponseBody
	@RequestMapping({ "/insertPortalColumn" })
	public ToJson insertPortalColumn(PortalColumn portalColumn) {
		return this.portalColumnService.insertPortalColumn(portalColumn);
	}

	@ResponseBody
	@RequestMapping({ "/upPortalColumn" })
	public ToJson upPortalColumn(PortalColumn portalColumn) {
		return this.portalColumnService.upPortalColumn(portalColumn);
	}

	@ResponseBody
	@RequestMapping({ "/delPortalColumn" })
	public ToJson delPortalColumn(@RequestParam("ids[]") Integer[] ids) {
		return this.portalColumnService.delPortalColumn(ids);
	}

	@ResponseBody
	@RequestMapping({ "/selectSite" })
	public ToJson selectSite() {
		return this.portalColumnService.selectSite();
	}

	@ResponseBody
	@RequestMapping({ "/ColumnTreeController" })
	public ToJson ColumnTreeController(
			@RequestParam("id") String id,
			@RequestParam(value = "portalIds", required = false) Integer[] portalIds,
			@RequestParam(value = "colIds", required = false) Integer[] colIds) {
		return this.portalColumnService.ColumnTree(id, portalIds, colIds);
	}
}
