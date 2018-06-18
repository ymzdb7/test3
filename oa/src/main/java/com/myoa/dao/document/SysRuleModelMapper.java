package com.myoa.dao.document;

import com.myoa.model.document.SysRuleModel;

import java.util.List;

public abstract interface SysRuleModelMapper {
	public abstract int saveSysRule(SysRuleModel paramSysRuleModel);

	public abstract int deleteSysRule(SysRuleModel paramSysRuleModel);

	public abstract int updateRuleById(SysRuleModel paramSysRuleModel);

	public abstract SysRuleModel getRuleById(SysRuleModel paramSysRuleModel);

	public abstract SysRuleModel getRuleByCode(SysRuleModel paramSysRuleModel);

	public abstract List<SysRuleModel> getRuleAll(SysRuleModel paramSysRuleModel);
}
