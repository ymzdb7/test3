package com.myoa.dao.workflow;

import com.myoa.model.workflow.FlowPrintTpl;
import com.myoa.model.workflow.FlowPrintTplExample;
import com.myoa.model.workflow.FlowPrintTplWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowPrintTplMapper {
	public abstract int countByExample(
			FlowPrintTplExample paramFlowPrintTplExample);

	public abstract int deleteByExample(
			FlowPrintTplExample paramFlowPrintTplExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(FlowPrintTplWithBLOBs paramFlowPrintTplWithBLOBs);

	public abstract int insertSelective(
			FlowPrintTplWithBLOBs paramFlowPrintTplWithBLOBs);

	public abstract List<FlowPrintTplWithBLOBs> selectByExampleWithBLOBs(
			FlowPrintTplExample paramFlowPrintTplExample);

	public abstract List<FlowPrintTpl> selectByExample(
			FlowPrintTplExample paramFlowPrintTplExample);

	public abstract FlowPrintTplWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") FlowPrintTplWithBLOBs paramFlowPrintTplWithBLOBs,
			@Param("example") FlowPrintTplExample paramFlowPrintTplExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") FlowPrintTplWithBLOBs paramFlowPrintTplWithBLOBs,
			@Param("example") FlowPrintTplExample paramFlowPrintTplExample);

	public abstract int updateByExample(
			@Param("record") FlowPrintTpl paramFlowPrintTpl,
			@Param("example") FlowPrintTplExample paramFlowPrintTplExample);

	public abstract int updateByPrimaryKeySelective(
			FlowPrintTplWithBLOBs paramFlowPrintTplWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			FlowPrintTplWithBLOBs paramFlowPrintTplWithBLOBs);

	public abstract int updateByPrimaryKey(FlowPrintTpl paramFlowPrintTpl);

	public abstract List<FlowPrintTplWithBLOBs> queryByFlowId(
			Integer paramInteger);

	public abstract int deleteBatchKey(Integer[] paramArrayOfInteger);
}
