package com.myoa.controller.hierarchical;

import com.myoa.model.hierarchical.HierarchicalGlobal;
import com.myoa.service.hierarchical.HierarchicalGlobalService;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping({ "/hierarchicalGlobal" })
public class HierarchicalGlobalController {

	@Resource
	private HierarchicalGlobalService hierarchicalGlobalService;
	private Logger loger = Logger.getLogger(HierarchicalGlobalController.class);

	@ResponseBody
	@RequestMapping({ "/setHierarchicalGlobalPerson" })
	public ToJson<HierarchicalGlobal> setHierarchicalGlobalPerson(
			String globalJson) {
		return this.hierarchicalGlobalService
				.setHierarchicalGlobalPerson(globalJson);
	}

	@ResponseBody
	@RequestMapping({ "/selGlobalPerson" })
	public AjaxJson selGlobalPerson() {
		return this.hierarchicalGlobalService.selGlobalPerson();
	}
}
