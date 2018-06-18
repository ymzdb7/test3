package com.myoa.model.customNumber;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomNumberExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public CustomNumberExample() {
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

	public static class Criteria extends CustomNumberExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<CustomNumberExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<CustomNumberExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<CustomNumberExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new CustomNumberExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new CustomNumberExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new CustomNumberExample.Criterion(condition,
					value1, value2));
		}

		public CustomNumberExample.Criteria andUuidIsNull() {
			addCriterion("uuid is null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidIsNotNull() {
			addCriterion("uuid is not null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidEqualTo(Integer value) {
			addCriterion("uuid =", value, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidNotEqualTo(Integer value) {
			addCriterion("uuid <>", value, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidGreaterThan(Integer value) {
			addCriterion("uuid >", value, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("uuid >=", value, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidLessThan(Integer value) {
			addCriterion("uuid <", value, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidLessThanOrEqualTo(
				Integer value) {
			addCriterion("uuid <=", value, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidIn(List<Integer> values) {
			addCriterion("uuid in", values, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidNotIn(List<Integer> values) {
			addCriterion("uuid not in", values, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidBetween(Integer value1,
				Integer value2) {
			addCriterion("uuid between", value1, value2, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andUuidNotBetween(Integer value1,
				Integer value2) {
			addCriterion("uuid not between", value1, value2, "uuid");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleIsNull() {
			addCriterion("SET_STYLE is null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleIsNotNull() {
			addCriterion("SET_STYLE is not null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleEqualTo(String value) {
			addCriterion("SET_STYLE =", value, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleNotEqualTo(String value) {
			addCriterion("SET_STYLE <>", value, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleGreaterThan(String value) {
			addCriterion("SET_STYLE >", value, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleGreaterThanOrEqualTo(
				String value) {
			addCriterion("SET_STYLE >=", value, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleLessThan(String value) {
			addCriterion("SET_STYLE <", value, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleLessThanOrEqualTo(
				String value) {
			addCriterion("SET_STYLE <=", value, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleLike(String value) {
			addCriterion("SET_STYLE like", value, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleNotLike(String value) {
			addCriterion("SET_STYLE not like", value, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleIn(List<String> values) {
			addCriterion("SET_STYLE in", values, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleNotIn(List<String> values) {
			addCriterion("SET_STYLE not in", values, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleBetween(String value1,
				String value2) {
			addCriterion("SET_STYLE between", value1, value2, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andSetStyleNotBetween(
				String value1, String value2) {
			addCriterion("SET_STYLE not between", value1, value2, "setStyle");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesIsNull() {
			addCriterion("TYPES is null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesIsNotNull() {
			addCriterion("TYPES is not null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesEqualTo(Integer value) {
			addCriterion("TYPES =", value, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesNotEqualTo(Integer value) {
			addCriterion("TYPES <>", value, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesGreaterThan(Integer value) {
			addCriterion("TYPES >", value, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("TYPES >=", value, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesLessThan(Integer value) {
			addCriterion("TYPES <", value, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesLessThanOrEqualTo(
				Integer value) {
			addCriterion("TYPES <=", value, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesIn(List<Integer> values) {
			addCriterion("TYPES in", values, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesNotIn(List<Integer> values) {
			addCriterion("TYPES not in", values, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesBetween(Integer value1,
				Integer value2) {
			addCriterion("TYPES between", value1, value2, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andTypesNotBetween(Integer value1,
				Integer value2) {
			addCriterion("TYPES not between", value1, value2, "types");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitIsNull() {
			addCriterion("NUMBER_BIT is null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitIsNotNull() {
			addCriterion("NUMBER_BIT is not null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitEqualTo(Integer value) {
			addCriterion("NUMBER_BIT =", value, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitNotEqualTo(Integer value) {
			addCriterion("NUMBER_BIT <>", value, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitGreaterThan(
				Integer value) {
			addCriterion("NUMBER_BIT >", value, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("NUMBER_BIT >=", value, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitLessThan(Integer value) {
			addCriterion("NUMBER_BIT <", value, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitLessThanOrEqualTo(
				Integer value) {
			addCriterion("NUMBER_BIT <=", value, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitIn(List<Integer> values) {
			addCriterion("NUMBER_BIT in", values, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitNotIn(
				List<Integer> values) {
			addCriterion("NUMBER_BIT not in", values, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitBetween(Integer value1,
				Integer value2) {
			addCriterion("NUMBER_BIT between", value1, value2, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andNumberBitNotBetween(
				Integer value1, Integer value2) {
			addCriterion("NUMBER_BIT not between", value1, value2, "numberBit");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberIsNull() {
			addCriterion("CURRENT_NUMBER is null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberIsNotNull() {
			addCriterion("CURRENT_NUMBER is not null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberEqualTo(
				Integer value) {
			addCriterion("CURRENT_NUMBER =", value, "currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberNotEqualTo(
				Integer value) {
			addCriterion("CURRENT_NUMBER <>", value, "currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberGreaterThan(
				Integer value) {
			addCriterion("CURRENT_NUMBER >", value, "currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("CURRENT_NUMBER >=", value, "currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberLessThan(
				Integer value) {
			addCriterion("CURRENT_NUMBER <", value, "currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberLessThanOrEqualTo(
				Integer value) {
			addCriterion("CURRENT_NUMBER <=", value, "currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberIn(
				List<Integer> values) {
			addCriterion("CURRENT_NUMBER in", values, "currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberNotIn(
				List<Integer> values) {
			addCriterion("CURRENT_NUMBER not in", values, "currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberBetween(
				Integer value1, Integer value2) {
			addCriterion("CURRENT_NUMBER between", value1, value2,
					"currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andCurrentNumberNotBetween(
				Integer value1, Integer value2) {
			addCriterion("CURRENT_NUMBER not between", value1, value2,
					"currentNumber");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateIsNull() {
			addCriterion("LAST_DATE is null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateIsNotNull() {
			addCriterion("LAST_DATE is not null");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateEqualTo(Date value) {
			addCriterion("LAST_DATE =", value, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateNotEqualTo(Date value) {
			addCriterion("LAST_DATE <>", value, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateGreaterThan(Date value) {
			addCriterion("LAST_DATE >", value, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateGreaterThanOrEqualTo(
				Date value) {
			addCriterion("LAST_DATE >=", value, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateLessThan(Date value) {
			addCriterion("LAST_DATE <", value, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateLessThanOrEqualTo(
				Date value) {
			addCriterion("LAST_DATE <=", value, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateIn(List<Date> values) {
			addCriterion("LAST_DATE in", values, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateNotIn(List<Date> values) {
			addCriterion("LAST_DATE not in", values, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateBetween(Date value1,
				Date value2) {
			addCriterion("LAST_DATE between", value1, value2, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}

		public CustomNumberExample.Criteria andLastDateNotBetween(Date value1,
				Date value2) {
			addCriterion("LAST_DATE not between", value1, value2, "lastDate");
			return (CustomNumberExample.Criteria) this;
		}
	}
}