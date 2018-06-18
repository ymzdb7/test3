package com.myoa.model.edu.schoolPriv;

import java.util.ArrayList;
import java.util.List;

public class SchoolPrivExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public SchoolPrivExample() {
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

	public static class Criteria extends SchoolPrivExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<SchoolPrivExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<SchoolPrivExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<SchoolPrivExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new SchoolPrivExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria
					.add(new SchoolPrivExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new SchoolPrivExample.Criterion(condition,
					value1, value2));
		}

		public SchoolPrivExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ID >=", value, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("ID <=", value, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdBetween(Integer value1,
				Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidIsNull() {
			addCriterion("PERSON_UID is null");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidIsNotNull() {
			addCriterion("PERSON_UID is not null");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidEqualTo(String value) {
			addCriterion("PERSON_UID =", value, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidNotEqualTo(String value) {
			addCriterion("PERSON_UID <>", value, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidGreaterThan(String value) {
			addCriterion("PERSON_UID >", value, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidGreaterThanOrEqualTo(
				String value) {
			addCriterion("PERSON_UID >=", value, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidLessThan(String value) {
			addCriterion("PERSON_UID <", value, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidLessThanOrEqualTo(
				String value) {
			addCriterion("PERSON_UID <=", value, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidLike(String value) {
			addCriterion("PERSON_UID like", value, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidNotLike(String value) {
			addCriterion("PERSON_UID not like", value, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidIn(List<String> values) {
			addCriterion("PERSON_UID in", values, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidNotIn(List<String> values) {
			addCriterion("PERSON_UID not in", values, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidBetween(String value1,
				String value2) {
			addCriterion("PERSON_UID between", value1, value2, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andPersonUidNotBetween(String value1,
				String value2) {
			addCriterion("PERSON_UID not between", value1, value2, "personUid");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumIsNull() {
			addCriterion("SHCOOL_NUM is null");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumIsNotNull() {
			addCriterion("SHCOOL_NUM is not null");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumEqualTo(String value) {
			addCriterion("SHCOOL_NUM =", value, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumNotEqualTo(String value) {
			addCriterion("SHCOOL_NUM <>", value, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumGreaterThan(String value) {
			addCriterion("SHCOOL_NUM >", value, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumGreaterThanOrEqualTo(
				String value) {
			addCriterion("SHCOOL_NUM >=", value, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumLessThan(String value) {
			addCriterion("SHCOOL_NUM <", value, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumLessThanOrEqualTo(
				String value) {
			addCriterion("SHCOOL_NUM <=", value, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumLike(String value) {
			addCriterion("SHCOOL_NUM like", value, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumNotLike(String value) {
			addCriterion("SHCOOL_NUM not like", value, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumIn(List<String> values) {
			addCriterion("SHCOOL_NUM in", values, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumNotIn(List<String> values) {
			addCriterion("SHCOOL_NUM not in", values, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumBetween(String value1,
				String value2) {
			addCriterion("SHCOOL_NUM between", value1, value2, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andShcoolNumNotBetween(String value1,
				String value2) {
			addCriterion("SHCOOL_NUM not between", value1, value2, "shcoolNum");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdIsNull() {
			addCriterion("MODULAR_ID is null");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdIsNotNull() {
			addCriterion("MODULAR_ID is not null");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdEqualTo(String value) {
			addCriterion("MODULAR_ID =", value, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdNotEqualTo(String value) {
			addCriterion("MODULAR_ID <>", value, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdGreaterThan(String value) {
			addCriterion("MODULAR_ID >", value, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("MODULAR_ID >=", value, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdLessThan(String value) {
			addCriterion("MODULAR_ID <", value, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdLessThanOrEqualTo(
				String value) {
			addCriterion("MODULAR_ID <=", value, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdLike(String value) {
			addCriterion("MODULAR_ID like", value, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdNotLike(String value) {
			addCriterion("MODULAR_ID not like", value, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdIn(List<String> values) {
			addCriterion("MODULAR_ID in", values, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdNotIn(List<String> values) {
			addCriterion("MODULAR_ID not in", values, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdBetween(String value1,
				String value2) {
			addCriterion("MODULAR_ID between", value1, value2, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}

		public SchoolPrivExample.Criteria andModularIdNotBetween(String value1,
				String value2) {
			addCriterion("MODULAR_ID not between", value1, value2, "modularId");
			return (SchoolPrivExample.Criteria) this;
		}
	}
}
