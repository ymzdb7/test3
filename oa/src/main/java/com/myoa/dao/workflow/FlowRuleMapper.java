package com.myoa.dao.workflow;

import com.myoa.model.workflow.FlowRule;
import com.myoa.model.workflow.FlowRuleExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowRuleMapper {
	public abstract int countByExample(FlowRuleExample paramFlowRuleExample);

	public abstract int deleteByExample(FlowRuleExample paramFlowRuleExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(FlowRule paramFlowRule);

	public abstract int insertSelective(FlowRule paramFlowRule);

	public abstract List<FlowRule> selectByExample(
			FlowRuleExample paramFlowRuleExample);

	public abstract FlowRule selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") FlowRule paramFlowRule,
			@Param("example") FlowRuleExample paramFlowRuleExample);

	public abstract int updateByExample(
			@Param("record") FlowRule paramFlowRule,
			@Param("example") FlowRuleExample paramFlowRuleExample);

	public abstract int updateByPrimaryKeySelective(FlowRule paramFlowRule);

	public abstract int updateByPrimaryKey(FlowRule paramFlowRule);

	public abstract List<FlowRule> queryFlowRule(Map<String, Object> paramMap);

	public abstract int insertFlowRule(FlowRule paramFlowRule);

	public abstract int updateStatusToStart(FlowRule paramFlowRule);

	public abstract int updateStatusToEnd(FlowRule paramFlowRule);

	public abstract int deleteFlowRule(FlowRule paramFlowRule);

	public abstract List<FlowRule> selectFlowRule(String paramString1,
			String paramString2, String paramString3);
}