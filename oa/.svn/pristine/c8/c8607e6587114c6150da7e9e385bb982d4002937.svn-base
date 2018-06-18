package com.myoa.dao.WFE;

import com.myoa.model.workflow.FlowProcess;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface WFEFlowProcessMapper {
	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract void insert(FlowProcess paramFlowProcess);

	public abstract int insertSelective(FlowProcess paramFlowProcess);

	public abstract FlowProcess selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByPrimaryKeySelective(FlowProcess paramFlowProcess);

	public abstract int updateByPrimaryKeyWithBLOBs(FlowProcess paramFlowProcess);

	public abstract int updateByPrimaryKey(FlowProcess paramFlowProcess);

	public abstract FlowProcess find(Map<String, Object> paramMap);

	public abstract List<FlowProcess> findFlowId(int paramInt);

	public abstract List<FlowProcess> findF(int paramInt);

	public abstract FlowProcess findbyprcsId(Map<String, Object> paramMap);

	public abstract void updateTopAndLeft(FlowProcess paramFlowProcess);

	public abstract FlowProcess findProcess(
			@Param("flowId") Integer paramInteger1,
			@Param("prcsId") Integer paramInteger2);

	public abstract FlowProcess findPrcessLine(
			@Param("flowId") Integer paramInteger1,
			@Param("prcsId") Integer paramInteger2);

	public abstract FlowProcess findLine(@Param("id") Integer paramInteger);

	public abstract List<FlowProcess> selectPricByFlowId(
			@Param("flowId") Integer paramInteger);

	public abstract List<Integer> selectShowPrcsId(
			@Param("flowId") Integer paramInteger);

	public abstract FlowProcess findPrcessName(
			@Param("flowId") Integer paramInteger1,
			@Param("prcsId") Integer paramInteger2);

	public abstract int deleteByFlowId(Integer paramInteger);

	public abstract List<FlowProcess> findProcseePrcsTo(
			Map<String, Object> paramMap);

	public abstract String findPrcsName(Map<String, Object> paramMap);
}
