package com.myoa.kg.model;

import java.util.ArrayList;
import java.util.List;

public class KgSignKeyExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public KgSignKeyExample() {
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

	public static class Criteria extends KgSignKeyExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<KgSignKeyExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<KgSignKeyExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<KgSignKeyExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new KgSignKeyExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new KgSignKeyExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new KgSignKeyExample.Criterion(condition, value1,
					value2));
		}

		public KgSignKeyExample.Criteria andSignkeyIdIsNull() {
			addCriterion("SIGNKEY_ID is null");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdIsNotNull() {
			addCriterion("SIGNKEY_ID is not null");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdEqualTo(Integer value) {
			addCriterion("SIGNKEY_ID =", value, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdNotEqualTo(Integer value) {
			addCriterion("SIGNKEY_ID <>", value, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdGreaterThan(Integer value) {
			addCriterion("SIGNKEY_ID >", value, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("SIGNKEY_ID >=", value, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdLessThan(Integer value) {
			addCriterion("SIGNKEY_ID <", value, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("SIGNKEY_ID <=", value, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdIn(List<Integer> values) {
			addCriterion("SIGNKEY_ID in", values, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdNotIn(List<Integer> values) {
			addCriterion("SIGNKEY_ID not in", values, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdBetween(Integer value1,
				Integer value2) {
			addCriterion("SIGNKEY_ID between", value1, value2, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("SIGNKEY_ID not between", value1, value2, "signkeyId");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameIsNull() {
			addCriterion("SIGNKEY_NAME is null");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameIsNotNull() {
			addCriterion("SIGNKEY_NAME is not null");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameEqualTo(String value) {
			addCriterion("SIGNKEY_NAME =", value, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameNotEqualTo(String value) {
			addCriterion("SIGNKEY_NAME <>", value, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameGreaterThan(String value) {
			addCriterion("SIGNKEY_NAME >", value, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("SIGNKEY_NAME >=", value, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameLessThan(String value) {
			addCriterion("SIGNKEY_NAME <", value, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameLessThanOrEqualTo(
				String value) {
			addCriterion("SIGNKEY_NAME <=", value, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameLike(String value) {
			addCriterion("SIGNKEY_NAME like", value, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameNotLike(String value) {
			addCriterion("SIGNKEY_NAME not like", value, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameIn(List<String> values) {
			addCriterion("SIGNKEY_NAME in", values, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameNotIn(List<String> values) {
			addCriterion("SIGNKEY_NAME not in", values, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameBetween(String value1,
				String value2) {
			addCriterion("SIGNKEY_NAME between", value1, value2, "signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyNameNotBetween(
				String value1, String value2) {
			addCriterion("SIGNKEY_NAME not between", value1, value2,
					"signkeyName");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnIsNull() {
			addCriterion("SIGNKEY_KEYSN is null");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnIsNotNull() {
			addCriterion("SIGNKEY_KEYSN is not null");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnEqualTo(String value) {
			addCriterion("SIGNKEY_KEYSN =", value, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnNotEqualTo(String value) {
			addCriterion("SIGNKEY_KEYSN <>", value, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnGreaterThan(String value) {
			addCriterion("SIGNKEY_KEYSN >", value, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnGreaterThanOrEqualTo(
				String value) {
			addCriterion("SIGNKEY_KEYSN >=", value, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnLessThan(String value) {
			addCriterion("SIGNKEY_KEYSN <", value, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnLessThanOrEqualTo(
				String value) {
			addCriterion("SIGNKEY_KEYSN <=", value, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnLike(String value) {
			addCriterion("SIGNKEY_KEYSN like", value, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnNotLike(String value) {
			addCriterion("SIGNKEY_KEYSN not like", value, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnIn(List<String> values) {
			addCriterion("SIGNKEY_KEYSN in", values, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnNotIn(
				List<String> values) {
			addCriterion("SIGNKEY_KEYSN not in", values, "signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnBetween(String value1,
				String value2) {
			addCriterion("SIGNKEY_KEYSN between", value1, value2,
					"signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyKeysnNotBetween(
				String value1, String value2) {
			addCriterion("SIGNKEY_KEYSN not between", value1, value2,
					"signkeyKeysn");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusIsNull() {
			addCriterion("SIGNKEY_STATUS is null");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusIsNotNull() {
			addCriterion("SIGNKEY_STATUS is not null");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusEqualTo(Integer value) {
			addCriterion("SIGNKEY_STATUS =", value, "signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusNotEqualTo(
				Integer value) {
			addCriterion("SIGNKEY_STATUS <>", value, "signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusGreaterThan(
				Integer value) {
			addCriterion("SIGNKEY_STATUS >", value, "signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("SIGNKEY_STATUS >=", value, "signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusLessThan(Integer value) {
			addCriterion("SIGNKEY_STATUS <", value, "signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusLessThanOrEqualTo(
				Integer value) {
			addCriterion("SIGNKEY_STATUS <=", value, "signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusIn(List<Integer> values) {
			addCriterion("SIGNKEY_STATUS in", values, "signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusNotIn(
				List<Integer> values) {
			addCriterion("SIGNKEY_STATUS not in", values, "signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusBetween(
				Integer value1, Integer value2) {
			addCriterion("SIGNKEY_STATUS between", value1, value2,
					"signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}

		public KgSignKeyExample.Criteria andSignkeyStatusNotBetween(
				Integer value1, Integer value2) {
			addCriterion("SIGNKEY_STATUS not between", value1, value2,
					"signkeyStatus");
			return (KgSignKeyExample.Criteria) this;
		}
	}
}
