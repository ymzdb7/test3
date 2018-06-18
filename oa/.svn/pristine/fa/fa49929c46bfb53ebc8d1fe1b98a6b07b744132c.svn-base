package com.myoa.model.edu.eduSchoolCalendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduSchoolCalendarDescExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduSchoolCalendarDescExample() {
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
			EduSchoolCalendarDescExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduSchoolCalendarDescExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduSchoolCalendarDescExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduSchoolCalendarDescExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new EduSchoolCalendarDescExample.Criterion(
					condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduSchoolCalendarDescExample.Criterion(
					condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduSchoolCalendarDescExample.Criterion(
					condition, value1, value2));
		}

		public EduSchoolCalendarDescExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdNotEqualTo(
				Integer value) {
			addCriterion("ID <>", value, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdGreaterThan(
				Integer value) {
			addCriterion("ID >", value, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ID >=", value, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("ID <=", value, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdIn(
				List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdNotIn(
				List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdBetween(
				Integer value1, Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearIsNull() {
			addCriterion("SCHOOL_YEAR is null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearIsNotNull() {
			addCriterion("SCHOOL_YEAR is not null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR =", value, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearNotEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR <>", value, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearGreaterThan(
				String value) {
			addCriterion("SCHOOL_YEAR >", value, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearGreaterThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR >=", value, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearLessThan(
				String value) {
			addCriterion("SCHOOL_YEAR <", value, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearLessThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR <=", value, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearLike(
				String value) {
			addCriterion("SCHOOL_YEAR like", value, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearNotLike(
				String value) {
			addCriterion("SCHOOL_YEAR not like", value, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearIn(
				List<String> values) {
			addCriterion("SCHOOL_YEAR in", values, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearNotIn(
				List<String> values) {
			addCriterion("SCHOOL_YEAR not in", values, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_YEAR between", value1, value2, "schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolYearNotBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_YEAR not between", value1, value2,
					"schoolYear");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermIsNull() {
			addCriterion("SCHOOL_TERM is null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermIsNotNull() {
			addCriterion("SCHOOL_TERM is not null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermEqualTo(
				String value) {
			addCriterion("SCHOOL_TERM =", value, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermNotEqualTo(
				String value) {
			addCriterion("SCHOOL_TERM <>", value, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermGreaterThan(
				String value) {
			addCriterion("SCHOOL_TERM >", value, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermGreaterThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_TERM >=", value, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermLessThan(
				String value) {
			addCriterion("SCHOOL_TERM <", value, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermLessThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_TERM <=", value, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermLike(
				String value) {
			addCriterion("SCHOOL_TERM like", value, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermNotLike(
				String value) {
			addCriterion("SCHOOL_TERM not like", value, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermIn(
				List<String> values) {
			addCriterion("SCHOOL_TERM in", values, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermNotIn(
				List<String> values) {
			addCriterion("SCHOOL_TERM not in", values, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_TERM between", value1, value2, "schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andSchoolTermNotBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_TERM not between", value1, value2,
					"schoolTerm");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeIsNull() {
			addCriterion("CREATE_TIME is null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeIsNotNull() {
			addCriterion("CREATE_TIME is not null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeEqualTo(
				Date value) {
			addCriterion("CREATE_TIME =", value, "createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeNotEqualTo(
				Date value) {
			addCriterion("CREATE_TIME <>", value, "createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeGreaterThan(
				Date value) {
			addCriterion("CREATE_TIME >", value, "createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeGreaterThanOrEqualTo(
				Date value) {
			addCriterion("CREATE_TIME >=", value, "createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeLessThan(
				Date value) {
			addCriterion("CREATE_TIME <", value, "createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeLessThanOrEqualTo(
				Date value) {
			addCriterion("CREATE_TIME <=", value, "createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeIn(
				List<Date> values) {
			addCriterion("CREATE_TIME in", values, "createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeNotIn(
				List<Date> values) {
			addCriterion("CREATE_TIME not in", values, "createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeBetween(
				Date value1, Date value2) {
			addCriterion("CREATE_TIME between", value1, value2, "createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateTimeNotBetween(
				Date value1, Date value2) {
			addCriterion("CREATE_TIME not between", value1, value2,
					"createTime");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserIsNull() {
			addCriterion("CREATE_USER is null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserIsNotNull() {
			addCriterion("CREATE_USER is not null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserEqualTo(
				String value) {
			addCriterion("CREATE_USER =", value, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserNotEqualTo(
				String value) {
			addCriterion("CREATE_USER <>", value, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserGreaterThan(
				String value) {
			addCriterion("CREATE_USER >", value, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserGreaterThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER >=", value, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserLessThan(
				String value) {
			addCriterion("CREATE_USER <", value, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserLessThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER <=", value, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserLike(
				String value) {
			addCriterion("CREATE_USER like", value, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserNotLike(
				String value) {
			addCriterion("CREATE_USER not like", value, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserIn(
				List<String> values) {
			addCriterion("CREATE_USER in", values, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserNotIn(
				List<String> values) {
			addCriterion("CREATE_USER not in", values, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER between", value1, value2, "createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andCreateUserNotBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER not between", value1, value2,
					"createUser");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeIsNull() {
			addCriterion("GRADE_TYPE is null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeIsNotNull() {
			addCriterion("GRADE_TYPE is not null");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeEqualTo(
				String value) {
			addCriterion("GRADE_TYPE =", value, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeNotEqualTo(
				String value) {
			addCriterion("GRADE_TYPE <>", value, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeGreaterThan(
				String value) {
			addCriterion("GRADE_TYPE >", value, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("GRADE_TYPE >=", value, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeLessThan(
				String value) {
			addCriterion("GRADE_TYPE <", value, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeLessThanOrEqualTo(
				String value) {
			addCriterion("GRADE_TYPE <=", value, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeLike(
				String value) {
			addCriterion("GRADE_TYPE like", value, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeNotLike(
				String value) {
			addCriterion("GRADE_TYPE not like", value, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeIn(
				List<String> values) {
			addCriterion("GRADE_TYPE in", values, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeNotIn(
				List<String> values) {
			addCriterion("GRADE_TYPE not in", values, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeBetween(
				String value1, String value2) {
			addCriterion("GRADE_TYPE between", value1, value2, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}

		public EduSchoolCalendarDescExample.Criteria andGradeTypeNotBetween(
				String value1, String value2) {
			addCriterion("GRADE_TYPE not between", value1, value2, "gradeType");
			return (EduSchoolCalendarDescExample.Criteria) this;
		}
	}
}
