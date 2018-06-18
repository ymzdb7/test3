package com.myoa.model.common;

import java.util.ArrayList;
import java.util.List;

public class SecureLogExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public SecureLogExample() {
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

	public static class Criteria extends SecureLogExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<SecureLogExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<SecureLogExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<SecureLogExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new SecureLogExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new SecureLogExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new SecureLogExample.Criterion(condition, value1,
					value2));
		}

		public SecureLogExample.Criteria andLogIdIsNull() {
			addCriterion("LOG_ID is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdIsNotNull() {
			addCriterion("LOG_ID is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdEqualTo(Integer value) {
			addCriterion("LOG_ID =", value, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdNotEqualTo(Integer value) {
			addCriterion("LOG_ID <>", value, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdGreaterThan(Integer value) {
			addCriterion("LOG_ID >", value, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("LOG_ID >=", value, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdLessThan(Integer value) {
			addCriterion("LOG_ID <", value, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdLessThanOrEqualTo(Integer value) {
			addCriterion("LOG_ID <=", value, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdIn(List<Integer> values) {
			addCriterion("LOG_ID in", values, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdNotIn(List<Integer> values) {
			addCriterion("LOG_ID not in", values, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdBetween(Integer value1,
				Integer value2) {
			addCriterion("LOG_ID between", value1, value2, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("LOG_ID not between", value1, value2, "logId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdIsNull() {
			addCriterion("RULE_ID is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdIsNotNull() {
			addCriterion("RULE_ID is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdEqualTo(Short value) {
			addCriterion("RULE_ID =", value, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdNotEqualTo(Short value) {
			addCriterion("RULE_ID <>", value, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdGreaterThan(Short value) {
			addCriterion("RULE_ID >", value, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdGreaterThanOrEqualTo(
				Short value) {
			addCriterion("RULE_ID >=", value, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdLessThan(Short value) {
			addCriterion("RULE_ID <", value, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdLessThanOrEqualTo(Short value) {
			addCriterion("RULE_ID <=", value, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdIn(List<Short> values) {
			addCriterion("RULE_ID in", values, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdNotIn(List<Short> values) {
			addCriterion("RULE_ID not in", values, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdBetween(Short value1,
				Short value2) {
			addCriterion("RULE_ID between", value1, value2, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRuleIdNotBetween(Short value1,
				Short value2) {
			addCriterion("RULE_ID not between", value1, value2, "ruleId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidIsNull() {
			addCriterion("UID is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidIsNotNull() {
			addCriterion("UID is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidEqualTo(Integer value) {
			addCriterion("UID =", value, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidNotEqualTo(Integer value) {
			addCriterion("UID <>", value, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidGreaterThan(Integer value) {
			addCriterion("UID >", value, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("UID >=", value, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidLessThan(Integer value) {
			addCriterion("UID <", value, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("UID <=", value, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidIn(List<Integer> values) {
			addCriterion("UID in", values, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidNotIn(List<Integer> values) {
			addCriterion("UID not in", values, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidBetween(Integer value1,
				Integer value2) {
			addCriterion("UID between", value1, value2, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andUidNotBetween(Integer value1,
				Integer value2) {
			addCriterion("UID not between", value1, value2, "uid");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeIsNull() {
			addCriterion("LOG_TIME is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeIsNotNull() {
			addCriterion("LOG_TIME is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeEqualTo(Integer value) {
			addCriterion("LOG_TIME =", value, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeNotEqualTo(Integer value) {
			addCriterion("LOG_TIME <>", value, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeGreaterThan(Integer value) {
			addCriterion("LOG_TIME >", value, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("LOG_TIME >=", value, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeLessThan(Integer value) {
			addCriterion("LOG_TIME <", value, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeLessThanOrEqualTo(
				Integer value) {
			addCriterion("LOG_TIME <=", value, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeIn(List<Integer> values) {
			addCriterion("LOG_TIME in", values, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeNotIn(List<Integer> values) {
			addCriterion("LOG_TIME not in", values, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeBetween(Integer value1,
				Integer value2) {
			addCriterion("LOG_TIME between", value1, value2, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andLogTimeNotBetween(Integer value1,
				Integer value2) {
			addCriterion("LOG_TIME not between", value1, value2, "logTime");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpIsNull() {
			addCriterion("IP is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpIsNotNull() {
			addCriterion("IP is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpEqualTo(String value) {
			addCriterion("IP =", value, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpNotEqualTo(String value) {
			addCriterion("IP <>", value, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpGreaterThan(String value) {
			addCriterion("IP >", value, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpGreaterThanOrEqualTo(String value) {
			addCriterion("IP >=", value, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpLessThan(String value) {
			addCriterion("IP <", value, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpLessThanOrEqualTo(String value) {
			addCriterion("IP <=", value, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpLike(String value) {
			addCriterion("IP like", value, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpNotLike(String value) {
			addCriterion("IP not like", value, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpIn(List<String> values) {
			addCriterion("IP in", values, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpNotIn(List<String> values) {
			addCriterion("IP not in", values, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpBetween(String value1,
				String value2) {
			addCriterion("IP between", value1, value2, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andIpNotBetween(String value1,
				String value2) {
			addCriterion("IP not between", value1, value2, "ip");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkIsNull() {
			addCriterion("REMARK is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkIsNotNull() {
			addCriterion("REMARK is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkEqualTo(String value) {
			addCriterion("REMARK =", value, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkNotEqualTo(String value) {
			addCriterion("REMARK <>", value, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkGreaterThan(String value) {
			addCriterion("REMARK >", value, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkGreaterThanOrEqualTo(
				String value) {
			addCriterion("REMARK >=", value, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkLessThan(String value) {
			addCriterion("REMARK <", value, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("REMARK <=", value, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkLike(String value) {
			addCriterion("REMARK like", value, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkNotLike(String value) {
			addCriterion("REMARK not like", value, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkIn(List<String> values) {
			addCriterion("REMARK in", values, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkNotIn(List<String> values) {
			addCriterion("REMARK not in", values, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkBetween(String value1,
				String value2) {
			addCriterion("REMARK between", value1, value2, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andRemarkNotBetween(String value1,
				String value2) {
			addCriterion("REMARK not between", value1, value2, "remark");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdIsNull() {
			addCriterion("FROM_BODY_ID is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdIsNotNull() {
			addCriterion("FROM_BODY_ID is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdEqualTo(Integer value) {
			addCriterion("FROM_BODY_ID =", value, "fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdNotEqualTo(Integer value) {
			addCriterion("FROM_BODY_ID <>", value, "fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdGreaterThan(Integer value) {
			addCriterion("FROM_BODY_ID >", value, "fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("FROM_BODY_ID >=", value, "fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdLessThan(Integer value) {
			addCriterion("FROM_BODY_ID <", value, "fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("FROM_BODY_ID <=", value, "fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdIn(List<Integer> values) {
			addCriterion("FROM_BODY_ID in", values, "fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdNotIn(List<Integer> values) {
			addCriterion("FROM_BODY_ID not in", values, "fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdBetween(Integer value1,
				Integer value2) {
			addCriterion("FROM_BODY_ID between", value1, value2, "fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromBodyIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("FROM_BODY_ID not between", value1, value2,
					"fromBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdIsNull() {
			addCriterion("TO_BODY_ID is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdIsNotNull() {
			addCriterion("TO_BODY_ID is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdEqualTo(Integer value) {
			addCriterion("TO_BODY_ID =", value, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdNotEqualTo(Integer value) {
			addCriterion("TO_BODY_ID <>", value, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdGreaterThan(Integer value) {
			addCriterion("TO_BODY_ID >", value, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("TO_BODY_ID >=", value, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdLessThan(Integer value) {
			addCriterion("TO_BODY_ID <", value, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("TO_BODY_ID <=", value, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdIn(List<Integer> values) {
			addCriterion("TO_BODY_ID in", values, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdNotIn(List<Integer> values) {
			addCriterion("TO_BODY_ID not in", values, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdBetween(Integer value1,
				Integer value2) {
			addCriterion("TO_BODY_ID between", value1, value2, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToBodyIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("TO_BODY_ID not between", value1, value2, "toBodyId");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsIsNull() {
			addCriterion("FROM_TABLE_EXTENDS is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsIsNotNull() {
			addCriterion("FROM_TABLE_EXTENDS is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsEqualTo(String value) {
			addCriterion("FROM_TABLE_EXTENDS =", value, "fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsNotEqualTo(
				String value) {
			addCriterion("FROM_TABLE_EXTENDS <>", value, "fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsGreaterThan(
				String value) {
			addCriterion("FROM_TABLE_EXTENDS >", value, "fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsGreaterThanOrEqualTo(
				String value) {
			addCriterion("FROM_TABLE_EXTENDS >=", value, "fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsLessThan(
				String value) {
			addCriterion("FROM_TABLE_EXTENDS <", value, "fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsLessThanOrEqualTo(
				String value) {
			addCriterion("FROM_TABLE_EXTENDS <=", value, "fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsLike(String value) {
			addCriterion("FROM_TABLE_EXTENDS like", value, "fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsNotLike(String value) {
			addCriterion("FROM_TABLE_EXTENDS not like", value,
					"fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsIn(
				List<String> values) {
			addCriterion("FROM_TABLE_EXTENDS in", values, "fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsNotIn(
				List<String> values) {
			addCriterion("FROM_TABLE_EXTENDS not in", values,
					"fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsBetween(
				String value1, String value2) {
			addCriterion("FROM_TABLE_EXTENDS between", value1, value2,
					"fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andFromTableExtendsNotBetween(
				String value1, String value2) {
			addCriterion("FROM_TABLE_EXTENDS not between", value1, value2,
					"fromTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsIsNull() {
			addCriterion("TO_TABLE_EXTENDS is null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsIsNotNull() {
			addCriterion("TO_TABLE_EXTENDS is not null");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsEqualTo(String value) {
			addCriterion("TO_TABLE_EXTENDS =", value, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsNotEqualTo(
				String value) {
			addCriterion("TO_TABLE_EXTENDS <>", value, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsGreaterThan(
				String value) {
			addCriterion("TO_TABLE_EXTENDS >", value, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsGreaterThanOrEqualTo(
				String value) {
			addCriterion("TO_TABLE_EXTENDS >=", value, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsLessThan(String value) {
			addCriterion("TO_TABLE_EXTENDS <", value, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsLessThanOrEqualTo(
				String value) {
			addCriterion("TO_TABLE_EXTENDS <=", value, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsLike(String value) {
			addCriterion("TO_TABLE_EXTENDS like", value, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsNotLike(String value) {
			addCriterion("TO_TABLE_EXTENDS not like", value, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsIn(List<String> values) {
			addCriterion("TO_TABLE_EXTENDS in", values, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsNotIn(
				List<String> values) {
			addCriterion("TO_TABLE_EXTENDS not in", values, "toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsBetween(
				String value1, String value2) {
			addCriterion("TO_TABLE_EXTENDS between", value1, value2,
					"toTableExtends");
			return (SecureLogExample.Criteria) this;
		}

		public SecureLogExample.Criteria andToTableExtendsNotBetween(
				String value1, String value2) {
			addCriterion("TO_TABLE_EXTENDS not between", value1, value2,
					"toTableExtends");
			return (SecureLogExample.Criteria) this;
		}
	}
}
