package com.myoa.dao.WFE;

import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowRunModelPrcs;

import java.util.List;
import java.util.Map;

public abstract interface WFEFlowRunMapper {
	public abstract FlowRun find(Map<String, Object> paramMap);

	public abstract int insert(FlowRun paramFlowRun);

	public abstract String getMaxRunId();

	public abstract int delete(Map<String, Object> paramMap);

	public abstract int update(FlowRun paramFlowRun);

	public abstract List<FlowRunModelPrcs> queryFlowRun(
			Map<String, Object> paramMap);

	public abstract List<FlowRunModelPrcs> queryFlowRunBycy(
			Map<String, Object> paramMap);

	public abstract int updateState(Map<String, Object> paramMap);

	public abstract int updateAttachment(Map<String, Object> paramMap);

	public abstract void deleteByRunId(Integer paramInteger);
}
