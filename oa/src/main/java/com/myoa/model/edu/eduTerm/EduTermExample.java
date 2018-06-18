package com.myoa.model.edu.eduTerm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EduTermExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduTermExample() {
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

	public static class Criteria extends EduTermExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduTermExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduTermExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduTermExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new EduTermExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduTermExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduTermExample.Criterion(condition, value1,
					value2));
		}

		protected void addCriterionForJDBCDate(String condition,
				java.util.Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<java.util.Date> values, String property) {
			if ((values == null) || (values.size() == 0)) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List dateList = new ArrayList();
			Iterator iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(((java.util.Date) iter.next())
						.getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition,
				java.util.Date value1, java.util.Date value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public EduTermExample.Criteria andTermIdIsNull() {
			addCriterion("TERM_ID is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdIsNotNull() {
			addCriterion("TERM_ID is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdEqualTo(Integer value) {
			addCriterion("TERM_ID =", value, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdNotEqualTo(Integer value) {
			addCriterion("TERM_ID <>", value, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdGreaterThan(Integer value) {
			addCriterion("TERM_ID >", value, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("TERM_ID >=", value, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdLessThan(Integer value) {
			addCriterion("TERM_ID <", value, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdLessThanOrEqualTo(Integer value) {
			addCriterion("TERM_ID <=", value, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdIn(List<Integer> values) {
			addCriterion("TERM_ID in", values, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdNotIn(List<Integer> values) {
			addCriterion("TERM_ID not in", values, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdBetween(Integer value1,
				Integer value2) {
			addCriterion("TERM_ID between", value1, value2, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("TERM_ID not between", value1, value2, "termId");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameIsNull() {
			addCriterion("TERM_NAME is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameIsNotNull() {
			addCriterion("TERM_NAME is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameEqualTo(String value) {
			addCriterion("TERM_NAME =", value, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameNotEqualTo(String value) {
			addCriterion("TERM_NAME <>", value, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameGreaterThan(String value) {
			addCriterion("TERM_NAME >", value, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("TERM_NAME >=", value, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameLessThan(String value) {
			addCriterion("TERM_NAME <", value, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameLessThanOrEqualTo(String value) {
			addCriterion("TERM_NAME <=", value, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameLike(String value) {
			addCriterion("TERM_NAME like", value, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameNotLike(String value) {
			addCriterion("TERM_NAME not like", value, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameIn(List<String> values) {
			addCriterion("TERM_NAME in", values, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameNotIn(List<String> values) {
			addCriterion("TERM_NAME not in", values, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameBetween(String value1,
				String value2) {
			addCriterion("TERM_NAME between", value1, value2, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermNameNotBetween(String value1,
				String value2) {
			addCriterion("TERM_NAME not between", value1, value2, "termName");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeIsNull() {
			addCriterion("TERM_CODE is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeIsNotNull() {
			addCriterion("TERM_CODE is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeEqualTo(String value) {
			addCriterion("TERM_CODE =", value, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeNotEqualTo(String value) {
			addCriterion("TERM_CODE <>", value, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeGreaterThan(String value) {
			addCriterion("TERM_CODE >", value, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeGreaterThanOrEqualTo(
				String value) {
			addCriterion("TERM_CODE >=", value, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeLessThan(String value) {
			addCriterion("TERM_CODE <", value, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeLessThanOrEqualTo(String value) {
			addCriterion("TERM_CODE <=", value, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeLike(String value) {
			addCriterion("TERM_CODE like", value, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeNotLike(String value) {
			addCriterion("TERM_CODE not like", value, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeIn(List<String> values) {
			addCriterion("TERM_CODE in", values, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeNotIn(List<String> values) {
			addCriterion("TERM_CODE not in", values, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeBetween(String value1,
				String value2) {
			addCriterion("TERM_CODE between", value1, value2, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermCodeNotBetween(String value1,
				String value2) {
			addCriterion("TERM_CODE not between", value1, value2, "termCode");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearIsNull() {
			addCriterion("TERM_YEAR is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearIsNotNull() {
			addCriterion("TERM_YEAR is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearEqualTo(String value) {
			addCriterion("TERM_YEAR =", value, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearNotEqualTo(String value) {
			addCriterion("TERM_YEAR <>", value, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearGreaterThan(String value) {
			addCriterion("TERM_YEAR >", value, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearGreaterThanOrEqualTo(
				String value) {
			addCriterion("TERM_YEAR >=", value, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearLessThan(String value) {
			addCriterion("TERM_YEAR <", value, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearLessThanOrEqualTo(String value) {
			addCriterion("TERM_YEAR <=", value, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearLike(String value) {
			addCriterion("TERM_YEAR like", value, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearNotLike(String value) {
			addCriterion("TERM_YEAR not like", value, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearIn(List<String> values) {
			addCriterion("TERM_YEAR in", values, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearNotIn(List<String> values) {
			addCriterion("TERM_YEAR not in", values, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearBetween(String value1,
				String value2) {
			addCriterion("TERM_YEAR between", value1, value2, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andTermYearNotBetween(String value1,
				String value2) {
			addCriterion("TERM_YEAR not between", value1, value2, "termYear");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermIsNull() {
			addCriterion("DEFAULT_TERM is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermIsNotNull() {
			addCriterion("DEFAULT_TERM is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermEqualTo(String value) {
			addCriterion("DEFAULT_TERM =", value, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermNotEqualTo(String value) {
			addCriterion("DEFAULT_TERM <>", value, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermGreaterThan(String value) {
			addCriterion("DEFAULT_TERM >", value, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermGreaterThanOrEqualTo(
				String value) {
			addCriterion("DEFAULT_TERM >=", value, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermLessThan(String value) {
			addCriterion("DEFAULT_TERM <", value, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermLessThanOrEqualTo(
				String value) {
			addCriterion("DEFAULT_TERM <=", value, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermLike(String value) {
			addCriterion("DEFAULT_TERM like", value, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermNotLike(String value) {
			addCriterion("DEFAULT_TERM not like", value, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermIn(List<String> values) {
			addCriterion("DEFAULT_TERM in", values, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermNotIn(List<String> values) {
			addCriterion("DEFAULT_TERM not in", values, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermBetween(String value1,
				String value2) {
			addCriterion("DEFAULT_TERM between", value1, value2, "defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andDefaultTermNotBetween(String value1,
				String value2) {
			addCriterion("DEFAULT_TERM not between", value1, value2,
					"defaultTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermIsNull() {
			addCriterion("WHICH_TERM is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermIsNotNull() {
			addCriterion("WHICH_TERM is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermEqualTo(String value) {
			addCriterion("WHICH_TERM =", value, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermNotEqualTo(String value) {
			addCriterion("WHICH_TERM <>", value, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermGreaterThan(String value) {
			addCriterion("WHICH_TERM >", value, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermGreaterThanOrEqualTo(
				String value) {
			addCriterion("WHICH_TERM >=", value, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermLessThan(String value) {
			addCriterion("WHICH_TERM <", value, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermLessThanOrEqualTo(
				String value) {
			addCriterion("WHICH_TERM <=", value, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermLike(String value) {
			addCriterion("WHICH_TERM like", value, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermNotLike(String value) {
			addCriterion("WHICH_TERM not like", value, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermIn(List<String> values) {
			addCriterion("WHICH_TERM in", values, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermNotIn(List<String> values) {
			addCriterion("WHICH_TERM not in", values, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermBetween(String value1,
				String value2) {
			addCriterion("WHICH_TERM between", value1, value2, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andWhichTermNotBetween(String value1,
				String value2) {
			addCriterion("WHICH_TERM not between", value1, value2, "whichTerm");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeIsNull() {
			addCriterion("START_TIME is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeIsNotNull() {
			addCriterion("START_TIME is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeEqualTo(java.util.Date value) {
			addCriterionForJDBCDate("START_TIME =", value, "startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TIME <>", value, "startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TIME >", value, "startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TIME >=", value, "startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeLessThan(java.util.Date value) {
			addCriterionForJDBCDate("START_TIME <", value, "startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TIME <=", value, "startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("START_TIME in", values, "startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("START_TIME not in", values, "startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("START_TIME between", value1, value2,
					"startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andStartTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("START_TIME not between", value1, value2,
					"startTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeIsNull() {
			addCriterion("END_TIME is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeIsNotNull() {
			addCriterion("END_TIME is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeEqualTo(java.util.Date value) {
			addCriterionForJDBCDate("END_TIME =", value, "endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeNotEqualTo(java.util.Date value) {
			addCriterionForJDBCDate("END_TIME <>", value, "endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("END_TIME >", value, "endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("END_TIME >=", value, "endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeLessThan(java.util.Date value) {
			addCriterionForJDBCDate("END_TIME <", value, "endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("END_TIME <=", value, "endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeIn(List<java.util.Date> values) {
			addCriterionForJDBCDate("END_TIME in", values, "endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("END_TIME not in", values, "endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeBetween(java.util.Date value1,
				java.util.Date value2) {
			addCriterionForJDBCDate("END_TIME between", value1, value2,
					"endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andEndTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("END_TIME not between", value1, value2,
					"endTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayIsNull() {
			addCriterion("CLASS_DAY is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayIsNotNull() {
			addCriterion("CLASS_DAY is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayEqualTo(String value) {
			addCriterion("CLASS_DAY =", value, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayNotEqualTo(String value) {
			addCriterion("CLASS_DAY <>", value, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayGreaterThan(String value) {
			addCriterion("CLASS_DAY >", value, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayGreaterThanOrEqualTo(
				String value) {
			addCriterion("CLASS_DAY >=", value, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayLessThan(String value) {
			addCriterion("CLASS_DAY <", value, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayLessThanOrEqualTo(String value) {
			addCriterion("CLASS_DAY <=", value, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayLike(String value) {
			addCriterion("CLASS_DAY like", value, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayNotLike(String value) {
			addCriterion("CLASS_DAY not like", value, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayIn(List<String> values) {
			addCriterion("CLASS_DAY in", values, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayNotIn(List<String> values) {
			addCriterion("CLASS_DAY not in", values, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayBetween(String value1,
				String value2) {
			addCriterion("CLASS_DAY between", value1, value2, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andClassDayNotBetween(String value1,
				String value2) {
			addCriterion("CLASS_DAY not between", value1, value2, "classDay");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateIsNull() {
			addCriterion("ACTIVATE is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateIsNotNull() {
			addCriterion("ACTIVATE is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateEqualTo(String value) {
			addCriterion("ACTIVATE =", value, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateNotEqualTo(String value) {
			addCriterion("ACTIVATE <>", value, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateGreaterThan(String value) {
			addCriterion("ACTIVATE >", value, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateGreaterThanOrEqualTo(
				String value) {
			addCriterion("ACTIVATE >=", value, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateLessThan(String value) {
			addCriterion("ACTIVATE <", value, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateLessThanOrEqualTo(String value) {
			addCriterion("ACTIVATE <=", value, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateLike(String value) {
			addCriterion("ACTIVATE like", value, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateNotLike(String value) {
			addCriterion("ACTIVATE not like", value, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateIn(List<String> values) {
			addCriterion("ACTIVATE in", values, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateNotIn(List<String> values) {
			addCriterion("ACTIVATE not in", values, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateBetween(String value1,
				String value2) {
			addCriterion("ACTIVATE between", value1, value2, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andActivateNotBetween(String value1,
				String value2) {
			addCriterion("ACTIVATE not between", value1, value2, "activate");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionIsNull() {
			addCriterion("POSITION is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionIsNotNull() {
			addCriterion("POSITION is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionEqualTo(String value) {
			addCriterion("POSITION =", value, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionNotEqualTo(String value) {
			addCriterion("POSITION <>", value, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionGreaterThan(String value) {
			addCriterion("POSITION >", value, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionGreaterThanOrEqualTo(
				String value) {
			addCriterion("POSITION >=", value, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionLessThan(String value) {
			addCriterion("POSITION <", value, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionLessThanOrEqualTo(String value) {
			addCriterion("POSITION <=", value, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionLike(String value) {
			addCriterion("POSITION like", value, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionNotLike(String value) {
			addCriterion("POSITION not like", value, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionIn(List<String> values) {
			addCriterion("POSITION in", values, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionNotIn(List<String> values) {
			addCriterion("POSITION not in", values, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionBetween(String value1,
				String value2) {
			addCriterion("POSITION between", value1, value2, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andPositionNotBetween(String value1,
				String value2) {
			addCriterion("POSITION not between", value1, value2, "position");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserIsNull() {
			addCriterion("CREATE_USER is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserIsNotNull() {
			addCriterion("CREATE_USER is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserEqualTo(String value) {
			addCriterion("CREATE_USER =", value, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserNotEqualTo(String value) {
			addCriterion("CREATE_USER <>", value, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserGreaterThan(String value) {
			addCriterion("CREATE_USER >", value, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserGreaterThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER >=", value, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserLessThan(String value) {
			addCriterion("CREATE_USER <", value, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserLessThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER <=", value, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserLike(String value) {
			addCriterion("CREATE_USER like", value, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserNotLike(String value) {
			addCriterion("CREATE_USER not like", value, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserIn(List<String> values) {
			addCriterion("CREATE_USER in", values, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserNotIn(List<String> values) {
			addCriterion("CREATE_USER not in", values, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserBetween(String value1,
				String value2) {
			addCriterion("CREATE_USER between", value1, value2, "createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateUserNotBetween(String value1,
				String value2) {
			addCriterion("CREATE_USER not between", value1, value2,
					"createUser");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeIsNull() {
			addCriterion("CREATE_TIME is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeIsNotNull() {
			addCriterion("CREATE_TIME is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeEqualTo(java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("CREATE_TIME between", value1, value2,
					"createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andCreateTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("CREATE_TIME not between", value1, value2,
					"createTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeIsNull() {
			addCriterion("UPDATE_TIME is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeIsNotNull() {
			addCriterion("UPDATE_TIME is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeEqualTo(java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("UPDATE_TIME between", value1, value2,
					"updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andUpdateTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2,
					"updateTime");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1IsNull() {
			addCriterion("REMARK1 is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1IsNotNull() {
			addCriterion("REMARK1 is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1EqualTo(String value) {
			addCriterion("REMARK1 =", value, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1NotEqualTo(String value) {
			addCriterion("REMARK1 <>", value, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1GreaterThan(String value) {
			addCriterion("REMARK1 >", value, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1GreaterThanOrEqualTo(
				String value) {
			addCriterion("REMARK1 >=", value, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1LessThan(String value) {
			addCriterion("REMARK1 <", value, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1LessThanOrEqualTo(String value) {
			addCriterion("REMARK1 <=", value, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1Like(String value) {
			addCriterion("REMARK1 like", value, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1NotLike(String value) {
			addCriterion("REMARK1 not like", value, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1In(List<String> values) {
			addCriterion("REMARK1 in", values, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1NotIn(List<String> values) {
			addCriterion("REMARK1 not in", values, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1Between(String value1,
				String value2) {
			addCriterion("REMARK1 between", value1, value2, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark1NotBetween(String value1,
				String value2) {
			addCriterion("REMARK1 not between", value1, value2, "remark1");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2IsNull() {
			addCriterion("REMARK2 is null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2IsNotNull() {
			addCriterion("REMARK2 is not null");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2EqualTo(String value) {
			addCriterion("REMARK2 =", value, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2NotEqualTo(String value) {
			addCriterion("REMARK2 <>", value, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2GreaterThan(String value) {
			addCriterion("REMARK2 >", value, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2GreaterThanOrEqualTo(
				String value) {
			addCriterion("REMARK2 >=", value, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2LessThan(String value) {
			addCriterion("REMARK2 <", value, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2LessThanOrEqualTo(String value) {
			addCriterion("REMARK2 <=", value, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2Like(String value) {
			addCriterion("REMARK2 like", value, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2NotLike(String value) {
			addCriterion("REMARK2 not like", value, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2In(List<String> values) {
			addCriterion("REMARK2 in", values, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2NotIn(List<String> values) {
			addCriterion("REMARK2 not in", values, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2Between(String value1,
				String value2) {
			addCriterion("REMARK2 between", value1, value2, "remark2");
			return (EduTermExample.Criteria) this;
		}

		public EduTermExample.Criteria andRemark2NotBetween(String value1,
				String value2) {
			addCriterion("REMARK2 not between", value1, value2, "remark2");
			return (EduTermExample.Criteria) this;
		}
	}
}
