package com.myoa.model.book;

import java.util.ArrayList;
import java.util.List;

public class BookManagerExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public BookManagerExample() {
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

	public static class Criteria extends BookManagerExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<BookManagerExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<BookManagerExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<BookManagerExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new BookManagerExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria
					.add(new BookManagerExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new BookManagerExample.Criterion(condition,
					value1, value2));
		}

		public BookManagerExample.Criteria andAutoIdIsNull() {
			addCriterion("AUTO_ID is null");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdIsNotNull() {
			addCriterion("AUTO_ID is not null");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdEqualTo(Integer value) {
			addCriterion("AUTO_ID =", value, "autoId");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdNotEqualTo(Integer value) {
			addCriterion("AUTO_ID <>", value, "autoId");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdGreaterThan(Integer value) {
			addCriterion("AUTO_ID >", value, "autoId");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("AUTO_ID >=", value, "autoId");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdLessThan(Integer value) {
			addCriterion("AUTO_ID <", value, "autoId");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("AUTO_ID <=", value, "autoId");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdIn(List<Integer> values) {
			addCriterion("AUTO_ID in", values, "autoId");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdNotIn(List<Integer> values) {
			addCriterion("AUTO_ID not in", values, "autoId");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdBetween(Integer value1,
				Integer value2) {
			addCriterion("AUTO_ID between", value1, value2, "autoId");
			return (BookManagerExample.Criteria) this;
		}

		public BookManagerExample.Criteria andAutoIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("AUTO_ID not between", value1, value2, "autoId");
			return (BookManagerExample.Criteria) this;
		}
	}
}
