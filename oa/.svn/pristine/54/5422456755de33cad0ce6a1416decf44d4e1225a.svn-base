package com.myoa.model.book;

import java.util.ArrayList;
import java.util.List;

public class BookTypeExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public BookTypeExample() {
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

	public static class Criteria extends BookTypeExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<BookTypeExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<BookTypeExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<BookTypeExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new BookTypeExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new BookTypeExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new BookTypeExample.Criterion(condition, value1,
					value2));
		}

		public BookTypeExample.Criteria andTypeIdIsNull() {
			addCriterion("TYPE_ID is null");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdIsNotNull() {
			addCriterion("TYPE_ID is not null");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdEqualTo(Integer value) {
			addCriterion("TYPE_ID =", value, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdNotEqualTo(Integer value) {
			addCriterion("TYPE_ID <>", value, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdGreaterThan(Integer value) {
			addCriterion("TYPE_ID >", value, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("TYPE_ID >=", value, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdLessThan(Integer value) {
			addCriterion("TYPE_ID <", value, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdLessThanOrEqualTo(Integer value) {
			addCriterion("TYPE_ID <=", value, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdIn(List<Integer> values) {
			addCriterion("TYPE_ID in", values, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdNotIn(List<Integer> values) {
			addCriterion("TYPE_ID not in", values, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdBetween(Integer value1,
				Integer value2) {
			addCriterion("TYPE_ID between", value1, value2, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("TYPE_ID not between", value1, value2, "typeId");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameIsNull() {
			addCriterion("TYPE_NAME is null");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameIsNotNull() {
			addCriterion("TYPE_NAME is not null");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameEqualTo(String value) {
			addCriterion("TYPE_NAME =", value, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameNotEqualTo(String value) {
			addCriterion("TYPE_NAME <>", value, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameGreaterThan(String value) {
			addCriterion("TYPE_NAME >", value, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("TYPE_NAME >=", value, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameLessThan(String value) {
			addCriterion("TYPE_NAME <", value, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameLessThanOrEqualTo(
				String value) {
			addCriterion("TYPE_NAME <=", value, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameLike(String value) {
			addCriterion("TYPE_NAME like", value, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameNotLike(String value) {
			addCriterion("TYPE_NAME not like", value, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameIn(List<String> values) {
			addCriterion("TYPE_NAME in", values, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameNotIn(List<String> values) {
			addCriterion("TYPE_NAME not in", values, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameBetween(String value1,
				String value2) {
			addCriterion("TYPE_NAME between", value1, value2, "typeName");
			return (BookTypeExample.Criteria) this;
		}

		public BookTypeExample.Criteria andTypeNameNotBetween(String value1,
				String value2) {
			addCriterion("TYPE_NAME not between", value1, value2, "typeName");
			return (BookTypeExample.Criteria) this;
		}
	}
}
