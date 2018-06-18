package com.myoa.controller.modulePriv;

import com.myoa.model.modulePriv.ModulePriv;
import com.myoa.service.modulePriv.ModulePrivService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/modulePriv" })
public class ModulePrivController {

	@Resource
	private ModulePrivService modulePrivService;

	@ResponseBody
	@RequestMapping(value = { "/saveModulePriv" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<ModulePriv> saveModulePriv(ModulePriv modulePriv,
			String applyModules, String applyDepts, String applyPrivs) {
		return this.modulePrivService.saveModulePriv(modulePriv, applyModules,
				applyDepts, applyPrivs);
	}

	@ResponseBody
	@RequestMapping(value = { "/deleteModulePriv" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<ModulePriv> deleteModulePriv(ModulePriv modulePriv) {
		return this.modulePrivService.deleteModulePriv(modulePriv);
	}

	@ResponseBody
	@RequestMapping(value = { "/getModulePrivSingle" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<ModulePriv> getModulePrivByUid(ModulePriv modulePriv) {
		return this.modulePrivService.getModulePrivSingle(modulePriv);
	}
}
