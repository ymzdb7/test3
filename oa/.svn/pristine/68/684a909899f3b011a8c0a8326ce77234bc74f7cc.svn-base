package com.myoa.kg.model;

import java.util.ArrayList;
import java.util.List;

public class KgRelationKeyUserExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public KgRelationKeyUserExample() {
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

	public static class Criteria extends
			KgRelationKeyUserExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<KgRelationKeyUserExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<KgRelationKeyUserExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<KgRelationKeyUserExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria
					.add(new KgRelationKeyUserExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new KgRelationKeyUserExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new KgRelationKeyUserExample.Criterion(condition,
					value1, value2));
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdIsNull() {
			addCriterion("KEY_USER_ID is null");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdIsNotNull() {
			addCriterion("KEY_USER_ID is not null");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdEqualTo(
				Integer value) {
			addCriterion("KEY_USER_ID =", value, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdNotEqualTo(
				Integer value) {
			addCriterion("KEY_USER_ID <>", value, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdGreaterThan(
				Integer value) {
			addCriterion("KEY_USER_ID >", value, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("KEY_USER_ID >=", value, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdLessThan(
				Integer value) {
			addCriterion("KEY_USER_ID <", value, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("KEY_USER_ID <=", value, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdIn(
				List<Integer> values) {
			addCriterion("KEY_USER_ID in", values, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdNotIn(
				List<Integer> values) {
			addCriterion("KEY_USER_ID not in", values, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdBetween(
				Integer value1, Integer value2) {
			addCriterion("KEY_USER_ID between", value1, value2, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyUserIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("KEY_USER_ID not between", value1, value2, "keyUserId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdIsNull() {
			addCriterion("USER_ID is null");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdIsNotNull() {
			addCriterion("USER_ID is not null");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdEqualTo(Integer value) {
			addCriterion("USER_ID =", value, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdNotEqualTo(
				Integer value) {
			addCriterion("USER_ID <>", value, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdGreaterThan(
				Integer value) {
			addCriterion("USER_ID >", value, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("USER_ID >=", value, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdLessThan(Integer value) {
			addCriterion("USER_ID <", value, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("USER_ID <=", value, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdIn(
				List<Integer> values) {
			addCriterion("USER_ID in", values, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdNotIn(
				List<Integer> values) {
			addCriterion("USER_ID not in", values, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdBetween(
				Integer value1, Integer value2) {
			addCriterion("USER_ID between", value1, value2, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andUserIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("USER_ID not between", value1, value2, "userId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdIsNull() {
			addCriterion("KEY_ID is null");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdIsNotNull() {
			addCriterion("KEY_ID is not null");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdEqualTo(Integer value) {
			addCriterion("KEY_ID =", value, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdNotEqualTo(
				Integer value) {
			addCriterion("KEY_ID <>", value, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdGreaterThan(
				Integer value) {
			addCriterion("KEY_ID >", value, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("KEY_ID >=", value, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdLessThan(Integer value) {
			addCriterion("KEY_ID <", value, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("KEY_ID <=", value, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdIn(List<Integer> values) {
			addCriterion("KEY_ID in", values, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdNotIn(
				List<Integer> values) {
			addCriterion("KEY_ID not in", values, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdBetween(
				Integer value1, Integer value2) {
			addCriterion("KEY_ID between", value1, value2, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}

		public KgRelationKeyUserExample.Criteria andKeyIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("KEY_ID not between", value1, value2, "keyId");
			return (KgRelationKeyUserExample.Criteria) this;
		}
	}
}
