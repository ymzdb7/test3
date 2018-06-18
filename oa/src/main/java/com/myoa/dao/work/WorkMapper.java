package com.myoa.dao.work;

import java.util.List;
import java.util.Map;

public abstract interface WorkMapper {
	public abstract void createTable(Map<String, Object> paramMap);

	public abstract void createSequence(Map<String, Object> paramMap);

	public abstract int insert(Map<String, Object> paramMap);

	public abstract Map<String, Object> select(Map<String, Object> paramMap);

	public abstract int update(Map<String, Object> paramMap);

	public abstract void addcolumn(Map<String, Object> paramMap);

	public abstract List<String> showColumns(Map<String, Object> paramMap);

	public abstract Map<String, Object> selectColumns(
			Map<String, Object> paramMap);

	public abstract void createTableList(Map<String, Object> paramMap);

	public abstract void deWork(Map<String, Object> paramMap);
}
