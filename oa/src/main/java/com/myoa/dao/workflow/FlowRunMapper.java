package com.myoa.dao.workflow;

import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowRunModelPrcs;
import com.myoa.model.workflow.FlowRunModelPrcsCount;

import java.util.List;
import java.util.Map;

public abstract interface FlowRunMapper {
	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(FlowRun paramFlowRun);

	public abstract int insertSelective(FlowRun paramFlowRun);

	public abstract FlowRun selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByPrimaryKeySelective(FlowRun paramFlowRun);

	public abstract int updateByPrimaryKeyWithBLOBs(FlowRun paramFlowRun);

	public abstract int updateByPrimaryKey(FlowRun paramFlowRun);

	public abstract String getMaxRunId();

	public abstract FlowRun find(Integer paramInteger);

	public abstract int updateTime(Map<String, Object> paramMap);

	public abstract int updateAttachment(Map<String, Object> paramMap);

	public abstract int cancelRun(Map<String, Object> paramMap);

	public abstract List<Integer> getRunIdsByFlowId(Integer paramInteger);

	public abstract int deleteByFlowId(Integer paramInteger);

	public abstract List<FlowRunModelPrcs> queryFlowRun(
			Map<String, Object> paramMap);

	public abstract List<FlowRun> sAll();

	public abstract List<FlowRunModelPrcs> queryFlowRunBycy(
			Map<String, Object> paramMap);

	public abstract int updateFocusUser(Map<String, Object> paramMap);

	public abstract int updateWorkLevel(Map<String, Object> paramMap);

	public abstract int updateEnd(Map<String, Object> paramMap);

	public abstract int upRunByFouAndTime(FlowRun paramFlowRun);

	public abstract FlowRunModelPrcsCount queryFlowRunPerformCount(
			Map<String, Object> paramMap);

	public abstract FlowRunModelPrcsCount queryFlowRunEndCount(
			Map<String, Object> paramMap);

	public abstract FlowRunModelPrcsCount queryFlowRunArchiveCount(
			Map<String, Object> paramMap);
}
