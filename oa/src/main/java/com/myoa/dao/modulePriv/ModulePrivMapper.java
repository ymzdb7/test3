package com.myoa.dao.modulePriv;

import com.myoa.model.department.Department;
import com.myoa.model.modulePriv.ModulePriv;
import com.myoa.model.users.UserPriv;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface ModulePrivMapper {
	public abstract void addModulePriv(ModulePriv paramModulePriv);

	public abstract void updateModulePriv(ModulePriv paramModulePriv);

	public abstract void deleteModulePrivs(
			@Param("uids") String[] paramArrayOfString,
			@Param("moduleId") Integer paramInteger);

	public abstract void deleteModulePriv(ModulePriv paramModulePriv);

	public abstract void deleteModulePrivByUids(String[] paramArrayOfString);

	public abstract ModulePriv getModulePrivSingle(ModulePriv paramModulePriv);

	public abstract List<Department> getDeptNameByIds(
			String[] paramArrayOfString);

	public abstract List<UserPriv> getPrivNameByIds(String[] paramArrayOfString);
}
