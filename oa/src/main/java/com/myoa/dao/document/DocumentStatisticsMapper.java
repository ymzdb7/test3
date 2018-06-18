package com.myoa.dao.document;

import com.myoa.model.document.DocumentDispatchStatistics;
import com.myoa.model.document.DocumentStatusStatistics;

import java.util.List;
import java.util.Map;

public abstract interface DocumentStatisticsMapper {
	public abstract List<DocumentDispatchStatistics> getDispatchStatistics(
			Map<String, Object> paramMap);

	public abstract List<DocumentStatusStatistics> getStatusStatistics(
			Map<String, Object> paramMap);
}
