package com.myoa.dao.workflow;

import com.myoa.model.workflow.FlowTimer;
import com.myoa.model.workflow.FlowTimerExample;
import com.myoa.model.workflow.FlowTimerWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowTimerMapper {
	public abstract int countByExample(FlowTimerExample paramFlowTimerExample);

	public abstract int deleteByExample(FlowTimerExample paramFlowTimerExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(FlowTimerWithBLOBs paramFlowTimerWithBLOBs);

	public abstract int insertSelective(
			FlowTimerWithBLOBs paramFlowTimerWithBLOBs);

	public abstract List<FlowTimerWithBLOBs> selectByExampleWithBLOBs(
			FlowTimerExample paramFlowTimerExample);

	public abstract List<FlowTimer> selectByExample(
			FlowTimerExample paramFlowTimerExample);

	public abstract FlowTimerWithBLOBs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") FlowTimerWithBLOBs paramFlowTimerWithBLOBs,
			@Param("example") FlowTimerExample paramFlowTimerExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") FlowTimerWithBLOBs paramFlowTimerWithBLOBs,
			@Param("example") FlowTimerExample paramFlowTimerExample);

	public abstract int updateByExample(
			@Param("record") FlowTimer paramFlowTimer,
			@Param("example") FlowTimerExample paramFlowTimerExample);

	public abstract int updateByPrimaryKeySelective(
			FlowTimerWithBLOBs paramFlowTimerWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			FlowTimerWithBLOBs paramFlowTimerWithBLOBs);

	public abstract int updateByPrimaryKey(FlowTimer paramFlowTimer);

	public abstract List<FlowTimerWithBLOBs> queryByFlowId(Integer paramInteger);

	public abstract int deleteBatchKey(Integer[] paramArrayOfInteger);
}
