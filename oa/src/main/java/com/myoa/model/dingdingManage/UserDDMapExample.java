package com.myoa.model.dingdingManage;

import java.util.ArrayList;
import java.util.List;

public class UserDDMapExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public UserDDMapExample() {
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

	public static class Criteria extends UserDDMapExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<UserDDMapExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<UserDDMapExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<UserDDMapExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new UserDDMapExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new UserDDMapExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new UserDDMapExample.Criterion(condition, value1,
					value2));
		}

		public UserDDMapExample.Criteria andOaUidIsNull() {
			addCriterion("OA_UID is null");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidIsNotNull() {
			addCriterion("OA_UID is not null");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidEqualTo(String value) {
			addCriterion("OA_UID =", value, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidNotEqualTo(String value) {
			addCriterion("OA_UID <>", value, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidGreaterThan(String value) {
			addCriterion("OA_UID >", value, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidGreaterThanOrEqualTo(
				String value) {
			addCriterion("OA_UID >=", value, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidLessThan(String value) {
			addCriterion("OA_UID <", value, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidLessThanOrEqualTo(String value) {
			addCriterion("OA_UID <=", value, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidLike(String value) {
			addCriterion("OA_UID like", value, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidNotLike(String value) {
			addCriterion("OA_UID not like", value, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidIn(List<String> values) {
			addCriterion("OA_UID in", values, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidNotIn(List<String> values) {
			addCriterion("OA_UID not in", values, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidBetween(String value1,
				String value2) {
			addCriterion("OA_UID between", value1, value2, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andOaUidNotBetween(String value1,
				String value2) {
			addCriterion("OA_UID not between", value1, value2, "oaUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidIsNull() {
			addCriterion("DD_UID is null");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidIsNotNull() {
			addCriterion("DD_UID is not null");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidEqualTo(String value) {
			addCriterion("DD_UID =", value, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidNotEqualTo(String value) {
			addCriterion("DD_UID <>", value, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidGreaterThan(String value) {
			addCriterion("DD_UID >", value, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidGreaterThanOrEqualTo(
				String value) {
			addCriterion("DD_UID >=", value, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidLessThan(String value) {
			addCriterion("DD_UID <", value, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidLessThanOrEqualTo(String value) {
			addCriterion("DD_UID <=", value, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidLike(String value) {
			addCriterion("DD_UID like", value, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidNotLike(String value) {
			addCriterion("DD_UID not like", value, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidIn(List<String> values) {
			addCriterion("DD_UID in", values, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidNotIn(List<String> values) {
			addCriterion("DD_UID not in", values, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidBetween(String value1,
				String value2) {
			addCriterion("DD_UID between", value1, value2, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}

		public UserDDMapExample.Criteria andDdUidNotBetween(String value1,
				String value2) {
			addCriterion("DD_UID not between", value1, value2, "ddUid");
			return (UserDDMapExample.Criteria) this;
		}
	}
}
