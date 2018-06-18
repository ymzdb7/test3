package com.myoa.dao.flowRunFeedback;

import com.myoa.model.flowRunFeedback.FlowRunFeedback;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowRunFeedbackMapper {
	public abstract int insertSelective(FlowRunFeedback paramFlowRunFeedback);

	public abstract List<FlowRunFeedback> select(Map<String, Object> paramMap);

	public abstract List<FlowRunFeedback> selectprcsId(
			Map<String, Object> paramMap);

	public abstract List<FlowRunFeedback> selectRunId(
			Map<String, Object> paramMap);

	public abstract List<FlowRunFeedback> selectFeedBackByRunId(
			Map<String, Object> paramMap);

	public abstract List<FlowRunFeedback> selectFlowFeedBackByRunId(
			@Param("runId") String paramString);
}
