package com.myoa.model.edu.eduSchoolCalendar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EduSchoolCalendarExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduSchoolCalendarExample() {
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
			EduSchoolCalendarExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduSchoolCalendarExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduSchoolCalendarExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduSchoolCalendarExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria
					.add(new EduSchoolCalendarExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduSchoolCalendarExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduSchoolCalendarExample.Criterion(condition,
					value1, value2));
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

		public EduSchoolCalendarExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ID >=", value, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("ID <=", value, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdBetween(Integer value1,
				Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearIsNull() {
			addCriterion("SCHOOL_YEAR is null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearIsNotNull() {
			addCriterion("SCHOOL_YEAR is not null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR =", value, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearNotEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR <>", value, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearGreaterThan(
				String value) {
			addCriterion("SCHOOL_YEAR >", value, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearGreaterThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR >=", value, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearLessThan(
				String value) {
			addCriterion("SCHOOL_YEAR <", value, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearLessThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR <=", value, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearLike(String value) {
			addCriterion("SCHOOL_YEAR like", value, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearNotLike(
				String value) {
			addCriterion("SCHOOL_YEAR not like", value, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearIn(
				List<String> values) {
			addCriterion("SCHOOL_YEAR in", values, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearNotIn(
				List<String> values) {
			addCriterion("SCHOOL_YEAR not in", values, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_YEAR between", value1, value2, "schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolYearNotBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_YEAR not between", value1, value2,
					"schoolYear");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermIsNull() {
			addCriterion("SCHOOL_TERM is null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermIsNotNull() {
			addCriterion("SCHOOL_TERM is not null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermEqualTo(
				String value) {
			addCriterion("SCHOOL_TERM =", value, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermNotEqualTo(
				String value) {
			addCriterion("SCHOOL_TERM <>", value, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermGreaterThan(
				String value) {
			addCriterion("SCHOOL_TERM >", value, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermGreaterThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_TERM >=", value, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermLessThan(
				String value) {
			addCriterion("SCHOOL_TERM <", value, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermLessThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_TERM <=", value, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermLike(String value) {
			addCriterion("SCHOOL_TERM like", value, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermNotLike(
				String value) {
			addCriterion("SCHOOL_TERM not like", value, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermIn(
				List<String> values) {
			addCriterion("SCHOOL_TERM in", values, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermNotIn(
				List<String> values) {
			addCriterion("SCHOOL_TERM not in", values, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_TERM between", value1, value2, "schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andSchoolTermNotBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_TERM not between", value1, value2,
					"schoolTerm");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeIsNull() {
			addCriterion("GRADE_TYPE is null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeIsNotNull() {
			addCriterion("GRADE_TYPE is not null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeEqualTo(
				String value) {
			addCriterion("GRADE_TYPE =", value, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeNotEqualTo(
				String value) {
			addCriterion("GRADE_TYPE <>", value, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeGreaterThan(
				String value) {
			addCriterion("GRADE_TYPE >", value, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("GRADE_TYPE >=", value, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeLessThan(
				String value) {
			addCriterion("GRADE_TYPE <", value, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeLessThanOrEqualTo(
				String value) {
			addCriterion("GRADE_TYPE <=", value, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeLike(String value) {
			addCriterion("GRADE_TYPE like", value, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeNotLike(
				String value) {
			addCriterion("GRADE_TYPE not like", value, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeIn(
				List<String> values) {
			addCriterion("GRADE_TYPE in", values, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeNotIn(
				List<String> values) {
			addCriterion("GRADE_TYPE not in", values, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeBetween(
				String value1, String value2) {
			addCriterion("GRADE_TYPE between", value1, value2, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andGradeTypeNotBetween(
				String value1, String value2) {
			addCriterion("GRADE_TYPE not between", value1, value2, "gradeType");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyIsNull() {
			addCriterion("HOLIDAY_NY is null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyIsNotNull() {
			addCriterion("HOLIDAY_NY is not null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyEqualTo(
				Integer value) {
			addCriterion("HOLIDAY_NY =", value, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyNotEqualTo(
				Integer value) {
			addCriterion("HOLIDAY_NY <>", value, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyGreaterThan(
				Integer value) {
			addCriterion("HOLIDAY_NY >", value, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("HOLIDAY_NY >=", value, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyLessThan(
				Integer value) {
			addCriterion("HOLIDAY_NY <", value, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyLessThanOrEqualTo(
				Integer value) {
			addCriterion("HOLIDAY_NY <=", value, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyIn(
				List<Integer> values) {
			addCriterion("HOLIDAY_NY in", values, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyNotIn(
				List<Integer> values) {
			addCriterion("HOLIDAY_NY not in", values, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyBetween(
				Integer value1, Integer value2) {
			addCriterion("HOLIDAY_NY between", value1, value2, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andHolidayNyNotBetween(
				Integer value1, Integer value2) {
			addCriterion("HOLIDAY_NY not between", value1, value2, "holidayNy");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateIsNull() {
			addCriterion("BEGEN_DATE is null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateIsNotNull() {
			addCriterion("BEGEN_DATE is not null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BEGEN_DATE =", value, "begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BEGEN_DATE <>", value, "begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("BEGEN_DATE >", value, "begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BEGEN_DATE >=", value, "begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("BEGEN_DATE <", value, "begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BEGEN_DATE <=", value, "begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BEGEN_DATE in", values, "begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BEGEN_DATE not in", values, "begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BEGEN_DATE between", value1, value2,
					"begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andBegenDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BEGEN_DATE not between", value1, value2,
					"begenDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateIsNull() {
			addCriterion("END_DATE is null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateIsNotNull() {
			addCriterion("END_DATE is not null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("END_DATE =", value, "endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("END_DATE <>", value, "endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("END_DATE >", value, "endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("END_DATE >=", value, "endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("END_DATE <", value, "endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("END_DATE <=", value, "endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("END_DATE in", values, "endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("END_DATE not in", values, "endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("END_DATE between", value1, value2,
					"endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andEndDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("END_DATE not between", value1, value2,
					"endDate");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeIsNull() {
			addCriterion("CREATE_TIME is null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeIsNotNull() {
			addCriterion("CREATE_TIME is not null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeEqualTo(
				java.util.Date value) {
			addCriterion("CREATE_TIME =", value, "createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeNotEqualTo(
				java.util.Date value) {
			addCriterion("CREATE_TIME <>", value, "createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeGreaterThan(
				java.util.Date value) {
			addCriterion("CREATE_TIME >", value, "createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterion("CREATE_TIME >=", value, "createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeLessThan(
				java.util.Date value) {
			addCriterion("CREATE_TIME <", value, "createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterion("CREATE_TIME <=", value, "createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeIn(
				List<java.util.Date> values) {
			addCriterion("CREATE_TIME in", values, "createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeNotIn(
				List<java.util.Date> values) {
			addCriterion("CREATE_TIME not in", values, "createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterion("CREATE_TIME between", value1, value2, "createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterion("CREATE_TIME not between", value1, value2,
					"createTime");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserIsNull() {
			addCriterion("CREATE_USER is null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserIsNotNull() {
			addCriterion("CREATE_USER is not null");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserEqualTo(
				String value) {
			addCriterion("CREATE_USER =", value, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserNotEqualTo(
				String value) {
			addCriterion("CREATE_USER <>", value, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserGreaterThan(
				String value) {
			addCriterion("CREATE_USER >", value, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserGreaterThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER >=", value, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserLessThan(
				String value) {
			addCriterion("CREATE_USER <", value, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserLessThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER <=", value, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserLike(String value) {
			addCriterion("CREATE_USER like", value, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserNotLike(
				String value) {
			addCriterion("CREATE_USER not like", value, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserIn(
				List<String> values) {
			addCriterion("CREATE_USER in", values, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserNotIn(
				List<String> values) {
			addCriterion("CREATE_USER not in", values, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER between", value1, value2, "createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}

		public EduSchoolCalendarExample.Criteria andCreateUserNotBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER not between", value1, value2,
					"createUser");
			return (EduSchoolCalendarExample.Criteria) this;
		}
	}
}
