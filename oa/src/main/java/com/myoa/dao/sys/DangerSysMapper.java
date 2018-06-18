package com.myoa.dao.sys;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface DangerSysMapper {
	public abstract void truncateTable(@Param("tableName") String paramString);

	public abstract void deleteUsers();

	public abstract List<Integer> getFileContentBySortType(
			@Param("sortType") Integer paramInteger);

	public abstract List<Integer> getFileContentBySortZero();

	public abstract int deleteFileContent(List<Integer> paramList);

	public abstract int deleteFileBox(@Param("sortType") Integer paramInteger);
}
