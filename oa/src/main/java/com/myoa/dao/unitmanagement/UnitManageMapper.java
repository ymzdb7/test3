package com.myoa.dao.unitmanagement;

import com.myoa.model.unitmanagement.UnitManage;
import com.myoa.util.Constant;

import org.apache.ibatis.annotations.Param;

public abstract interface UnitManageMapper {
	public abstract UnitManage showUnitManage();

	public abstract void addUnitManage(UnitManage paramUnitManage);

	public abstract int update(UnitManage paramUnitManage);

	public abstract int updateUnit(@Param(Constant.MYOA) String paramString1,
			@Param("name") String paramString2,
			@Param("unitId") Integer paramInteger);
}
