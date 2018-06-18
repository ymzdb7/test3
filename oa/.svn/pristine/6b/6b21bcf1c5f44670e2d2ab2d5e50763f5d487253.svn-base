package com.myoa.dao.workflow;

import com.myoa.model.workflow.FlowPriv;
import com.myoa.model.workflow.FlowPrivExample;
import com.myoa.model.workflow.FlowPrivWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowPrivMapper {
	public abstract int countByExample(FlowPrivExample paramFlowPrivExample);

	public abstract int deleteByExample(FlowPrivExample paramFlowPrivExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(FlowPrivWithBLOBs paramFlowPrivWithBLOBs);

	public abstract int insertSelective(FlowPrivWithBLOBs paramFlowPrivWithBLOBs);

	public abstract List<FlowPrivWithBLOBs> selectByExampleWithBLOBs(
			FlowPrivExample paramFlowPrivExample);

	public abstract List<FlowPriv> selectByExample(
			FlowPrivExample paramFlowPrivExample);

	public abstract FlowPrivWithBLOBs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") FlowPrivWithBLOBs paramFlowPrivWithBLOBs,
			@Param("example") FlowPrivExample paramFlowPrivExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") FlowPrivWithBLOBs paramFlowPrivWithBLOBs,
			@Param("example") FlowPrivExample paramFlowPrivExample);

	public abstract int updateByExample(
			@Param("record") FlowPriv paramFlowPriv,
			@Param("example") FlowPrivExample paramFlowPrivExample);

	public abstract int updateByPrimaryKeySelective(
			FlowPrivWithBLOBs paramFlowPrivWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			FlowPrivWithBLOBs paramFlowPrivWithBLOBs);

	public abstract int updateByPrimaryKey(FlowPriv paramFlowPriv);

	public abstract List<FlowPrivWithBLOBs> queryByFlowId(Integer paramInteger);

	public abstract int deleteBatchKey(Integer[] paramArrayOfInteger);

	public abstract List<Integer> queryFlowIdByUserPriv(
			Map<String, Object> paramMap);

	public abstract List<Integer> selPrivByUser(Map<String, Object> paramMap);
}
