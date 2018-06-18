package com.myoa.dao.workflow;

import com.myoa.model.workflow.FlowQueryTpl;
import com.myoa.model.workflow.FlowQueryTplExample;
import com.myoa.model.workflow.FlowQueryTplWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowQueryTplMapper {
	public abstract int countByExample(
			FlowQueryTplExample paramFlowQueryTplExample);

	public abstract int deleteByExample(
			FlowQueryTplExample paramFlowQueryTplExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(FlowQueryTplWithBLOBs paramFlowQueryTplWithBLOBs);

	public abstract int insertSelective(
			FlowQueryTplWithBLOBs paramFlowQueryTplWithBLOBs);

	public abstract List<FlowQueryTplWithBLOBs> selectByExampleWithBLOBs(
			FlowQueryTplExample paramFlowQueryTplExample);

	public abstract List<FlowQueryTpl> selectByExample(
			FlowQueryTplExample paramFlowQueryTplExample);

	public abstract List<FlowQueryTpl> queryByFlowId(Integer paramInteger);

	public abstract FlowQueryTplWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") FlowQueryTplWithBLOBs paramFlowQueryTplWithBLOBs,
			@Param("example") FlowQueryTplExample paramFlowQueryTplExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") FlowQueryTplWithBLOBs paramFlowQueryTplWithBLOBs,
			@Param("example") FlowQueryTplExample paramFlowQueryTplExample);

	public abstract int updateByExample(
			@Param("record") FlowQueryTpl paramFlowQueryTpl,
			@Param("example") FlowQueryTplExample paramFlowQueryTplExample);

	public abstract int updateByPrimaryKeySelective(
			FlowQueryTplWithBLOBs paramFlowQueryTplWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			FlowQueryTplWithBLOBs paramFlowQueryTplWithBLOBs);

	public abstract int updateByPrimaryKey(FlowQueryTpl paramFlowQueryTpl);

	public abstract int deleteBatchKey(Integer[] paramArrayOfInteger);
}
