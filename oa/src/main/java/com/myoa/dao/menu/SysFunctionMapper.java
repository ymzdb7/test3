package com.myoa.dao.menu;

import com.myoa.model.menu.SysFunction;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface SysFunctionMapper {
	public abstract List<SysFunction> getDatagrid(String paramString);

	public abstract List<SysFunction> childMenu(String paramString);

	public abstract List<SysFunction> getAll();

	public abstract void deleteFunction(String paramString);

	public abstract int addFunctionMenu(SysFunction paramSysFunction);

	public abstract void editSysFunction(SysFunction paramSysFunction);

	public abstract List<SysFunction> findChildMenu(Map<String, String> paramMap);

	public abstract SysFunction getParentFunction(String paramString);

	public abstract int checkIdExists(String paramString);

	public abstract int getMaxId();

	public abstract List<SysFunction> getSysFunctionByName(String paramString);

	public abstract int getCountSysFunctionByName(String paramString);

	public abstract SysFunction checkFunctionExits(Integer paramInteger);

	public abstract List<SysFunction> getSomeChildMenu(String paramString);

	public abstract SysFunction getSysFunctionByFid(Integer paramInteger);

	public abstract List<SysFunction> getUserFunctionByUserId(
			@Param("userId") String paramString);
}
