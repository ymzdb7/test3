package com.myoa.dao.common;

import com.myoa.model.common.SecureRule;
import com.myoa.model.common.SecureRuleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SecureRuleMapper {
	public abstract int countByExample(SecureRuleExample paramSecureRuleExample);

	public abstract int deleteByExample(SecureRuleExample paramSecureRuleExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SecureRule paramSecureRule);

	public abstract int insertSelective(SecureRule paramSecureRule);

	public abstract List<SecureRule> selectByExample(
			SecureRuleExample paramSecureRuleExample);

	public abstract SecureRule selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SecureRule paramSecureRule,
			@Param("example") SecureRuleExample paramSecureRuleExample);

	public abstract int updateByExample(
			@Param("record") SecureRule paramSecureRule,
			@Param("example") SecureRuleExample paramSecureRuleExample);

	public abstract int updateByPrimaryKeySelective(SecureRule paramSecureRule);

	public abstract int updateByPrimaryKey(SecureRule paramSecureRule);

	public abstract List<SecureRule> getAllSecureRule();

	public abstract SecureRule getSecureById(int paramInt);
}