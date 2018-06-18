package com.myoa.model.common;

import java.util.ArrayList;
import java.util.List;

public class SecureRuleExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public SecureRuleExample() {
		this.oredCriteria = new ArrayList();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return this.orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return this.distinct;
	}

	public List<Criteria> getOredCriteria() {
		return this.oredCriteria;
	}

	public void or(Criteria criteria) {
		this.oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		this.oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (this.oredCriteria.size() == 0) {
			this.oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		this.oredCriteria.clear();
		this.orderByClause = null;
		this.distinct = false;
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return this.condition;
		}

		public Object getValue() {
			return this.value;
		}

		public Object getSecondValue() {
			return this.secondValue;
		}

		public boolean isNoValue() {
			return this.noValue;
		}

		public boolean isSingleValue() {
			return this.singleValue;
		}

		public boolean isBetweenValue() {
			return this.betweenValue;
		}

		public boolean isListValue() {
			return this.listValue;
		}

		public String getTypeHandler() {
			return this.typeHandler;
		}

		protected Criterion(String condition) {
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if ((value instanceof List))
				this.listValue = true;
			else
				this.singleValue = true;
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	public static class Criteria extends SecureRuleExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<SecureRuleExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<SecureRuleExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<SecureRuleExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new SecureRuleExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria
					.add(new SecureRuleExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new SecureRuleExample.Criterion(condition,
					value1, value2));
		}

		public SecureRuleExample.Criteria andRuleIdIsNull() {
			addCriterion("RULE_ID is null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdIsNotNull() {
			addCriterion("RULE_ID is not null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdEqualTo(Integer value) {
			addCriterion("RULE_ID =", value, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdNotEqualTo(Integer value) {
			addCriterion("RULE_ID <>", value, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdGreaterThan(Integer value) {
			addCriterion("RULE_ID >", value, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("RULE_ID >=", value, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdLessThan(Integer value) {
			addCriterion("RULE_ID <", value, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("RULE_ID <=", value, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdIn(List<Integer> values) {
			addCriterion("RULE_ID in", values, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdNotIn(List<Integer> values) {
			addCriterion("RULE_ID not in", values, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdBetween(Integer value1,
				Integer value2) {
			addCriterion("RULE_ID between", value1, value2, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("RULE_ID not between", value1, value2, "ruleId");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeIsNull() {
			addCriterion("RULE_TYPE is null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeIsNotNull() {
			addCriterion("RULE_TYPE is not null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeEqualTo(String value) {
			addCriterion("RULE_TYPE =", value, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeNotEqualTo(String value) {
			addCriterion("RULE_TYPE <>", value, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeGreaterThan(String value) {
			addCriterion("RULE_TYPE >", value, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("RULE_TYPE >=", value, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeLessThan(String value) {
			addCriterion("RULE_TYPE <", value, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeLessThanOrEqualTo(
				String value) {
			addCriterion("RULE_TYPE <=", value, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeLike(String value) {
			addCriterion("RULE_TYPE like", value, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeNotLike(String value) {
			addCriterion("RULE_TYPE not like", value, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeIn(List<String> values) {
			addCriterion("RULE_TYPE in", values, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeNotIn(List<String> values) {
			addCriterion("RULE_TYPE not in", values, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeBetween(String value1,
				String value2) {
			addCriterion("RULE_TYPE between", value1, value2, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleTypeNotBetween(String value1,
				String value2) {
			addCriterion("RULE_TYPE not between", value1, value2, "ruleType");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivIsNull() {
			addCriterion("RULE_PRIV is null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivIsNotNull() {
			addCriterion("RULE_PRIV is not null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivEqualTo(Byte value) {
			addCriterion("RULE_PRIV =", value, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivNotEqualTo(Byte value) {
			addCriterion("RULE_PRIV <>", value, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivGreaterThan(Byte value) {
			addCriterion("RULE_PRIV >", value, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivGreaterThanOrEqualTo(
				Byte value) {
			addCriterion("RULE_PRIV >=", value, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivLessThan(Byte value) {
			addCriterion("RULE_PRIV <", value, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivLessThanOrEqualTo(
				Byte value) {
			addCriterion("RULE_PRIV <=", value, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivIn(List<Byte> values) {
			addCriterion("RULE_PRIV in", values, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivNotIn(List<Byte> values) {
			addCriterion("RULE_PRIV not in", values, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivBetween(Byte value1,
				Byte value2) {
			addCriterion("RULE_PRIV between", value1, value2, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRulePrivNotBetween(Byte value1,
				Byte value2) {
			addCriterion("RULE_PRIV not between", value1, value2, "rulePriv");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescIsNull() {
			addCriterion("RULE_DESC is null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescIsNotNull() {
			addCriterion("RULE_DESC is not null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescEqualTo(String value) {
			addCriterion("RULE_DESC =", value, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescNotEqualTo(String value) {
			addCriterion("RULE_DESC <>", value, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescGreaterThan(String value) {
			addCriterion("RULE_DESC >", value, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescGreaterThanOrEqualTo(
				String value) {
			addCriterion("RULE_DESC >=", value, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescLessThan(String value) {
			addCriterion("RULE_DESC <", value, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescLessThanOrEqualTo(
				String value) {
			addCriterion("RULE_DESC <=", value, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescLike(String value) {
			addCriterion("RULE_DESC like", value, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescNotLike(String value) {
			addCriterion("RULE_DESC not like", value, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescIn(List<String> values) {
			addCriterion("RULE_DESC in", values, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescNotIn(List<String> values) {
			addCriterion("RULE_DESC not in", values, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescBetween(String value1,
				String value2) {
			addCriterion("RULE_DESC between", value1, value2, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleDescNotBetween(String value1,
				String value2) {
			addCriterion("RULE_DESC not between", value1, value2, "ruleDesc");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeIsNull() {
			addCriterion("RULE_CODE is null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeIsNotNull() {
			addCriterion("RULE_CODE is not null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeEqualTo(String value) {
			addCriterion("RULE_CODE =", value, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeNotEqualTo(String value) {
			addCriterion("RULE_CODE <>", value, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeGreaterThan(String value) {
			addCriterion("RULE_CODE >", value, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeGreaterThanOrEqualTo(
				String value) {
			addCriterion("RULE_CODE >=", value, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeLessThan(String value) {
			addCriterion("RULE_CODE <", value, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeLessThanOrEqualTo(
				String value) {
			addCriterion("RULE_CODE <=", value, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeLike(String value) {
			addCriterion("RULE_CODE like", value, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeNotLike(String value) {
			addCriterion("RULE_CODE not like", value, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeIn(List<String> values) {
			addCriterion("RULE_CODE in", values, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeNotIn(List<String> values) {
			addCriterion("RULE_CODE not in", values, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeBetween(String value1,
				String value2) {
			addCriterion("RULE_CODE between", value1, value2, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andRuleCodeNotBetween(String value1,
				String value2) {
			addCriterion("RULE_CODE not between", value1, value2, "ruleCode");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagIsNull() {
			addCriterion("USE_FLAG is null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagIsNotNull() {
			addCriterion("USE_FLAG is not null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagEqualTo(String value) {
			addCriterion("USE_FLAG =", value, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagNotEqualTo(String value) {
			addCriterion("USE_FLAG <>", value, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagGreaterThan(String value) {
			addCriterion("USE_FLAG >", value, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagGreaterThanOrEqualTo(
				String value) {
			addCriterion("USE_FLAG >=", value, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagLessThan(String value) {
			addCriterion("USE_FLAG <", value, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagLessThanOrEqualTo(
				String value) {
			addCriterion("USE_FLAG <=", value, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagLike(String value) {
			addCriterion("USE_FLAG like", value, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagNotLike(String value) {
			addCriterion("USE_FLAG not like", value, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagIn(List<String> values) {
			addCriterion("USE_FLAG in", values, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagNotIn(List<String> values) {
			addCriterion("USE_FLAG not in", values, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagBetween(String value1,
				String value2) {
			addCriterion("USE_FLAG between", value1, value2, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andUseFlagNotBetween(String value1,
				String value2) {
			addCriterion("USE_FLAG not between", value1, value2, "useFlag");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleIsNull() {
			addCriterion("SYS_RULE is null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleIsNotNull() {
			addCriterion("SYS_RULE is not null");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleEqualTo(String value) {
			addCriterion("SYS_RULE =", value, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleNotEqualTo(String value) {
			addCriterion("SYS_RULE <>", value, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleGreaterThan(String value) {
			addCriterion("SYS_RULE >", value, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleGreaterThanOrEqualTo(
				String value) {
			addCriterion("SYS_RULE >=", value, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleLessThan(String value) {
			addCriterion("SYS_RULE <", value, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleLessThanOrEqualTo(
				String value) {
			addCriterion("SYS_RULE <=", value, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleLike(String value) {
			addCriterion("SYS_RULE like", value, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleNotLike(String value) {
			addCriterion("SYS_RULE not like", value, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleIn(List<String> values) {
			addCriterion("SYS_RULE in", values, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleNotIn(List<String> values) {
			addCriterion("SYS_RULE not in", values, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleBetween(String value1,
				String value2) {
			addCriterion("SYS_RULE between", value1, value2, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}

		public SecureRuleExample.Criteria andSysRuleNotBetween(String value1,
				String value2) {
			addCriterion("SYS_RULE not between", value1, value2, "sysRule");
			return (SecureRuleExample.Criteria) this;
		}
	}
}
