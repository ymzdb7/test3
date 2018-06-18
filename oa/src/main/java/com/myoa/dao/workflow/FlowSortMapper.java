package com.myoa.dao.workflow;

import com.myoa.model.workflow.FlowSort;
import com.myoa.model.workflow.FlowSortExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowSortMapper {
	public abstract int countByExample(FlowSortExample paramFlowSortExample);

	public abstract int deleteByExample(FlowSortExample paramFlowSortExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(FlowSort paramFlowSort);

	public abstract int insertSelective(FlowSort paramFlowSort);

	public abstract List<FlowSort> selectByExample(
			FlowSortExample paramFlowSortExample);

	public abstract List<FlowSort> selectAllFlowSort(Integer paramInteger);

	public abstract int getChildNumber(Integer paramInteger);

	public abstract int selectflowSortNum(Integer paramInteger);

	public abstract List<FlowSort> getChildDatas(
			@Param("sortId") Integer paramInteger);

	public abstract Integer selectNoflowSort(Integer paramInteger);

	public abstract FlowSort selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") FlowSort paramFlowSort,
			@Param("example") FlowSortExample paramFlowSortExample);

	public abstract int updateByExample(
			@Param("record") FlowSort paramFlowSort,
			@Param("example") FlowSortExample paramFlowSortExample);

	public abstract int updateByPrimaryKeySelective(FlowSort paramFlowSort);

	public abstract int updateByPrimaryKey(FlowSort paramFlowSort);

	public abstract List<FlowSort> selectFlowSortByAuth(
			Map<String, Object> paramMap);

	public abstract List<FlowSort> documentFlowSortByAuth(
			Map<String, Object> paramMap);

	public abstract List<FlowSort> selectAllFs(Integer paramInteger);

	public abstract int countAllFs(Integer paramInteger);
}