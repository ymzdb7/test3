package com.myoa.model.edu.eduTeacher;

import java.util.ArrayList;
import java.util.List;

public class EduTeacherExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduTeacherExample() {
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

	public static class Criteria extends EduTeacherExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduTeacherExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduTeacherExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduTeacherExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new EduTeacherExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria
					.add(new EduTeacherExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduTeacherExample.Criterion(condition,
					value1, value2));
		}

		public EduTeacherExample.Criteria andIdIsNull() {
			addCriterion("id is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("id >=", value, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdBetween(Integer value1,
				Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeIsNull() {
			addCriterion("GRADE is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeIsNotNull() {
			addCriterion("GRADE is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeEqualTo(String value) {
			addCriterion("GRADE =", value, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeNotEqualTo(String value) {
			addCriterion("GRADE <>", value, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeGreaterThan(String value) {
			addCriterion("GRADE >", value, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeGreaterThanOrEqualTo(
				String value) {
			addCriterion("GRADE >=", value, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeLessThan(String value) {
			addCriterion("GRADE <", value, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeLessThanOrEqualTo(String value) {
			addCriterion("GRADE <=", value, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeLike(String value) {
			addCriterion("GRADE like", value, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeNotLike(String value) {
			addCriterion("GRADE not like", value, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeIn(List<String> values) {
			addCriterion("GRADE in", values, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeNotIn(List<String> values) {
			addCriterion("GRADE not in", values, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeBetween(String value1,
				String value2) {
			addCriterion("GRADE between", value1, value2, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andGradeNotBetween(String value1,
				String value2) {
			addCriterion("GRADE not between", value1, value2, "grade");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIsNull() {
			addCriterion("CLASS is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIsNotNull() {
			addCriterion("CLASS is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassEqualTo(String value) {
			addCriterion("CLASS =", value, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassNotEqualTo(String value) {
			addCriterion("CLASS <>", value, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassGreaterThan(String value) {
			addCriterion("CLASS >", value, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassGreaterThanOrEqualTo(
				String value) {
			addCriterion("CLASS >=", value, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassLessThan(String value) {
			addCriterion("CLASS <", value, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassLessThanOrEqualTo(String value) {
			addCriterion("CLASS <=", value, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassLike(String value) {
			addCriterion("CLASS like", value, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassNotLike(String value) {
			addCriterion("CLASS not like", value, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIn(List<String> values) {
			addCriterion("CLASS in", values, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassNotIn(List<String> values) {
			addCriterion("CLASS not in", values, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassBetween(String value1,
				String value2) {
			addCriterion("CLASS between", value1, value2, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassNotBetween(String value1,
				String value2) {
			addCriterion("CLASS not between", value1, value2, "class");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearIsNull() {
			addCriterion("SCHOOL_YEAR is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearIsNotNull() {
			addCriterion("SCHOOL_YEAR is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearEqualTo(String value) {
			addCriterion("SCHOOL_YEAR =", value, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearNotEqualTo(String value) {
			addCriterion("SCHOOL_YEAR <>", value, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearGreaterThan(String value) {
			addCriterion("SCHOOL_YEAR >", value, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearGreaterThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR >=", value, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearLessThan(String value) {
			addCriterion("SCHOOL_YEAR <", value, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearLessThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_YEAR <=", value, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearLike(String value) {
			addCriterion("SCHOOL_YEAR like", value, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearNotLike(String value) {
			addCriterion("SCHOOL_YEAR not like", value, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearIn(List<String> values) {
			addCriterion("SCHOOL_YEAR in", values, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearNotIn(List<String> values) {
			addCriterion("SCHOOL_YEAR not in", values, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearBetween(String value1,
				String value2) {
			addCriterion("SCHOOL_YEAR between", value1, value2, "schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSchoolYearNotBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_YEAR not between", value1, value2,
					"schoolYear");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermIsNull() {
			addCriterion("TERM is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermIsNotNull() {
			addCriterion("TERM is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermEqualTo(String value) {
			addCriterion("TERM =", value, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermNotEqualTo(String value) {
			addCriterion("TERM <>", value, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermGreaterThan(String value) {
			addCriterion("TERM >", value, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermGreaterThanOrEqualTo(
				String value) {
			addCriterion("TERM >=", value, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermLessThan(String value) {
			addCriterion("TERM <", value, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermLessThanOrEqualTo(String value) {
			addCriterion("TERM <=", value, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermLike(String value) {
			addCriterion("TERM like", value, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermNotLike(String value) {
			addCriterion("TERM not like", value, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermIn(List<String> values) {
			addCriterion("TERM in", values, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermNotIn(List<String> values) {
			addCriterion("TERM not in", values, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermBetween(String value1,
				String value2) {
			addCriterion("TERM between", value1, value2, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTermNotBetween(String value1,
				String value2) {
			addCriterion("TERM not between", value1, value2, "term");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseIsNull() {
			addCriterion("COURSE is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseIsNotNull() {
			addCriterion("COURSE is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseEqualTo(String value) {
			addCriterion("COURSE =", value, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseNotEqualTo(String value) {
			addCriterion("COURSE <>", value, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseGreaterThan(String value) {
			addCriterion("COURSE >", value, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseGreaterThanOrEqualTo(
				String value) {
			addCriterion("COURSE >=", value, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseLessThan(String value) {
			addCriterion("COURSE <", value, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseLessThanOrEqualTo(
				String value) {
			addCriterion("COURSE <=", value, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseLike(String value) {
			addCriterion("COURSE like", value, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseNotLike(String value) {
			addCriterion("COURSE not like", value, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseIn(List<String> values) {
			addCriterion("COURSE in", values, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseNotIn(List<String> values) {
			addCriterion("COURSE not in", values, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseBetween(String value1,
				String value2) {
			addCriterion("COURSE between", value1, value2, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andCourseNotBetween(String value1,
				String value2) {
			addCriterion("COURSE not between", value1, value2, "course");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdIsNull() {
			addCriterion("USER_ID is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdIsNotNull() {
			addCriterion("USER_ID is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdEqualTo(String value) {
			addCriterion("USER_ID =", value, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdNotEqualTo(String value) {
			addCriterion("USER_ID <>", value, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdGreaterThan(String value) {
			addCriterion("USER_ID >", value, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("USER_ID >=", value, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdLessThan(String value) {
			addCriterion("USER_ID <", value, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdLessThanOrEqualTo(
				String value) {
			addCriterion("USER_ID <=", value, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdLike(String value) {
			addCriterion("USER_ID like", value, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdNotLike(String value) {
			addCriterion("USER_ID not like", value, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdIn(List<String> values) {
			addCriterion("USER_ID in", values, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdNotIn(List<String> values) {
			addCriterion("USER_ID not in", values, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdBetween(String value1,
				String value2) {
			addCriterion("USER_ID between", value1, value2, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserIdNotBetween(String value1,
				String value2) {
			addCriterion("USER_ID not between", value1, value2, "userId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeIsNull() {
			addCriterion("TEACHER_TYPE is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeIsNotNull() {
			addCriterion("TEACHER_TYPE is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeEqualTo(String value) {
			addCriterion("TEACHER_TYPE =", value, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeNotEqualTo(String value) {
			addCriterion("TEACHER_TYPE <>", value, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeGreaterThan(String value) {
			addCriterion("TEACHER_TYPE >", value, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_TYPE >=", value, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeLessThan(String value) {
			addCriterion("TEACHER_TYPE <", value, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_TYPE <=", value, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeLike(String value) {
			addCriterion("TEACHER_TYPE like", value, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeNotLike(String value) {
			addCriterion("TEACHER_TYPE not like", value, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeIn(List<String> values) {
			addCriterion("TEACHER_TYPE in", values, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeNotIn(
				List<String> values) {
			addCriterion("TEACHER_TYPE not in", values, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeBetween(String value1,
				String value2) {
			addCriterion("TEACHER_TYPE between", value1, value2, "teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andTeacherTypeNotBetween(
				String value1, String value2) {
			addCriterion("TEACHER_TYPE not between", value1, value2,
					"teacherType");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameIsNull() {
			addCriterion("USER_NAME is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameIsNotNull() {
			addCriterion("USER_NAME is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameEqualTo(String value) {
			addCriterion("USER_NAME =", value, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameNotEqualTo(String value) {
			addCriterion("USER_NAME <>", value, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameGreaterThan(String value) {
			addCriterion("USER_NAME >", value, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("USER_NAME >=", value, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameLessThan(String value) {
			addCriterion("USER_NAME <", value, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameLessThanOrEqualTo(
				String value) {
			addCriterion("USER_NAME <=", value, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameLike(String value) {
			addCriterion("USER_NAME like", value, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameNotLike(String value) {
			addCriterion("USER_NAME not like", value, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameIn(List<String> values) {
			addCriterion("USER_NAME in", values, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameNotIn(List<String> values) {
			addCriterion("USER_NAME not in", values, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameBetween(String value1,
				String value2) {
			addCriterion("USER_NAME between", value1, value2, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andUserNameNotBetween(String value1,
				String value2) {
			addCriterion("USER_NAME not between", value1, value2, "userName");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdIsNull() {
			addCriterion("CLASS_ID is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdIsNotNull() {
			addCriterion("CLASS_ID is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdEqualTo(String value) {
			addCriterion("CLASS_ID =", value, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdNotEqualTo(String value) {
			addCriterion("CLASS_ID <>", value, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdGreaterThan(String value) {
			addCriterion("CLASS_ID >", value, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("CLASS_ID >=", value, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdLessThan(String value) {
			addCriterion("CLASS_ID <", value, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdLessThanOrEqualTo(
				String value) {
			addCriterion("CLASS_ID <=", value, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdLike(String value) {
			addCriterion("CLASS_ID like", value, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdNotLike(String value) {
			addCriterion("CLASS_ID not like", value, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdIn(List<String> values) {
			addCriterion("CLASS_ID in", values, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdNotIn(List<String> values) {
			addCriterion("CLASS_ID not in", values, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdBetween(String value1,
				String value2) {
			addCriterion("CLASS_ID between", value1, value2, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andClassIdNotBetween(String value1,
				String value2) {
			addCriterion("CLASS_ID not between", value1, value2, "classId");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterIsNull() {
			addCriterion("SEMETER is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterIsNotNull() {
			addCriterion("SEMETER is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterEqualTo(String value) {
			addCriterion("SEMETER =", value, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterNotEqualTo(String value) {
			addCriterion("SEMETER <>", value, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterGreaterThan(String value) {
			addCriterion("SEMETER >", value, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterGreaterThanOrEqualTo(
				String value) {
			addCriterion("SEMETER >=", value, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterLessThan(String value) {
			addCriterion("SEMETER <", value, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterLessThanOrEqualTo(
				String value) {
			addCriterion("SEMETER <=", value, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterLike(String value) {
			addCriterion("SEMETER like", value, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterNotLike(String value) {
			addCriterion("SEMETER not like", value, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterIn(List<String> values) {
			addCriterion("SEMETER in", values, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterNotIn(List<String> values) {
			addCriterion("SEMETER not in", values, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterBetween(String value1,
				String value2) {
			addCriterion("SEMETER between", value1, value2, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andSemeterNotBetween(String value1,
				String value2) {
			addCriterion("SEMETER not between", value1, value2, "semeter");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagIsNull() {
			addCriterion("FLAG is null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagIsNotNull() {
			addCriterion("FLAG is not null");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagEqualTo(Integer value) {
			addCriterion("FLAG =", value, "flag");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagNotEqualTo(Integer value) {
			addCriterion("FLAG <>", value, "flag");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagGreaterThan(Integer value) {
			addCriterion("FLAG >", value, "flag");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("FLAG >=", value, "flag");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagLessThan(Integer value) {
			addCriterion("FLAG <", value, "flag");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagLessThanOrEqualTo(Integer value) {
			addCriterion("FLAG <=", value, "flag");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagIn(List<Integer> values) {
			addCriterion("FLAG in", values, "flag");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagNotIn(List<Integer> values) {
			addCriterion("FLAG not in", values, "flag");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagBetween(Integer value1,
				Integer value2) {
			addCriterion("FLAG between", value1, value2, "flag");
			return (EduTeacherExample.Criteria) this;
		}

		public EduTeacherExample.Criteria andFlagNotBetween(Integer value1,
				Integer value2) {
			addCriterion("FLAG not between", value1, value2, "flag");
			return (EduTeacherExample.Criteria) this;
		}
	}
}
