package com.myoa.dao.workflow;

import com.myoa.dao.base.BaseMapper;
import com.myoa.model.workflow.FlowRunPrcs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowRunPrcsMapper extends BaseMapper<FlowRunPrcs> {
	public abstract List<FlowRunPrcs> selectEnd(Map<String, Object> paramMap);

	public abstract List<FlowRunPrcs> selectHang(Map<String, Object> paramMap);

	public abstract List<FlowRunPrcs> selectAll(Map<String, Object> paramMap);

	public abstract String findTime(@Param("prcsId") Integer paramInteger1,
			@Param("runId") Integer paramInteger2);

	public abstract String findTimeBy(Map<String, Object> paramMap);

	public abstract List<FlowRunPrcs> findByRunId(Integer paramInteger);

	public abstract List<FlowRunPrcs> selectfrp(Map<String, Object> paramMap);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(FlowRunPrcs paramFlowRunPrcs);

	public abstract int insertSelective(FlowRunPrcs paramFlowRunPrcs);

	public abstract FlowRunPrcs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByPrimaryKeySelective(FlowRunPrcs paramFlowRunPrcs);

	public abstract int updateByPrimaryKey(FlowRunPrcs paramFlowRunPrcs);

	public abstract int updateSome(Map<String, Object> paramMap);

	public abstract void deleteWork(FlowRunPrcs paramFlowRunPrcs);

	public abstract Integer selectPrcs(@Param("id") Integer paramInteger);

	public abstract List<FlowRunPrcs> findlessRunId(Map<String, Object> paramMap);

	public abstract List<FlowRunPrcs> selectMyAll(
			@Param("userId") String paramString,
			@Param("runId") Integer paramInteger);

	public abstract List<FlowRunPrcs> selectAllByRunId(Integer paramInteger);

	public abstract List<FlowRunPrcs> getFlowRunReacsAllByRunId(
			String paramString);

	public abstract FlowRunPrcs selectqueryByRunId(
			@Param("prcsId") String paramString,
			@Param("runId") Integer paramInteger);

	public abstract int cancelRunPrcs(Map<String, Object> paramMap);

	public abstract FlowRunPrcs queryByRunId(
			@Param("runId") Integer paramInteger);

	public abstract int deleteByRunIds(List<Integer> paramList);

	public abstract List<FlowRunPrcs> entrustWork(Map<String, Object> paramMap);

	public abstract Integer checkGatherNode(Map<String, Object> paramMap);

	public abstract List<FlowRunPrcs> monitoring(Map<String, Object> paramMap);

	public abstract List<FlowRunPrcs> findNextFrp(Map<String, Object> paramMap);

	public abstract List<FlowRunPrcs> findMaxFrp(Integer paramInteger);

	public abstract List<String> selNotRunById(FlowRunPrcs paramFlowRunPrcs);

	public abstract FlowRunPrcs selPrcsByNotRun(Map<String, Object> paramMap);

	public abstract int upPrcsById(FlowRunPrcs paramFlowRunPrcs);

	public abstract int upPrcsStatusById(FlowRunPrcs paramFlowRunPrcs);
}
