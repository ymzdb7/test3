package com.myoa.model.edu.eduCourse;

import java.util.ArrayList;
import java.util.List;

public class EduCourseExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduCourseExample() {
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

	public static class Criteria extends EduCourseExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduCourseExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduCourseExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduCourseExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new EduCourseExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduCourseExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduCourseExample.Criterion(condition, value1,
					value2));
		}

		public EduCourseExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("ID >=", value, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("ID <=", value, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdBetween(Integer value1,
				Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdIsNull() {
			addCriterion("COURSE_ID is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdIsNotNull() {
			addCriterion("COURSE_ID is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdEqualTo(String value) {
			addCriterion("COURSE_ID =", value, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdNotEqualTo(String value) {
			addCriterion("COURSE_ID <>", value, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdGreaterThan(String value) {
			addCriterion("COURSE_ID >", value, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("COURSE_ID >=", value, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdLessThan(String value) {
			addCriterion("COURSE_ID <", value, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdLessThanOrEqualTo(
				String value) {
			addCriterion("COURSE_ID <=", value, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdLike(String value) {
			addCriterion("COURSE_ID like", value, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdNotLike(String value) {
			addCriterion("COURSE_ID not like", value, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdIn(List<String> values) {
			addCriterion("COURSE_ID in", values, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdNotIn(List<String> values) {
			addCriterion("COURSE_ID not in", values, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdBetween(String value1,
				String value2) {
			addCriterion("COURSE_ID between", value1, value2, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseIdNotBetween(String value1,
				String value2) {
			addCriterion("COURSE_ID not between", value1, value2, "courseId");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoIsNull() {
			addCriterion("ORDER_NO is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoIsNotNull() {
			addCriterion("ORDER_NO is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoEqualTo(Integer value) {
			addCriterion("ORDER_NO =", value, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoNotEqualTo(Integer value) {
			addCriterion("ORDER_NO <>", value, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoGreaterThan(Integer value) {
			addCriterion("ORDER_NO >", value, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ORDER_NO >=", value, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoLessThan(Integer value) {
			addCriterion("ORDER_NO <", value, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoLessThanOrEqualTo(
				Integer value) {
			addCriterion("ORDER_NO <=", value, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoIn(List<Integer> values) {
			addCriterion("ORDER_NO in", values, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoNotIn(List<Integer> values) {
			addCriterion("ORDER_NO not in", values, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoBetween(Integer value1,
				Integer value2) {
			addCriterion("ORDER_NO between", value1, value2, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andOrderNoNotBetween(Integer value1,
				Integer value2) {
			addCriterion("ORDER_NO not between", value1, value2, "orderNo");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageIsNull() {
			addCriterion("STAGE is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageIsNotNull() {
			addCriterion("STAGE is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageEqualTo(String value) {
			addCriterion("STAGE =", value, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageNotEqualTo(String value) {
			addCriterion("STAGE <>", value, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageGreaterThan(String value) {
			addCriterion("STAGE >", value, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageGreaterThanOrEqualTo(
				String value) {
			addCriterion("STAGE >=", value, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageLessThan(String value) {
			addCriterion("STAGE <", value, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageLessThanOrEqualTo(String value) {
			addCriterion("STAGE <=", value, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageLike(String value) {
			addCriterion("STAGE like", value, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageNotLike(String value) {
			addCriterion("STAGE not like", value, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageIn(List<String> values) {
			addCriterion("STAGE in", values, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageNotIn(List<String> values) {
			addCriterion("STAGE not in", values, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageBetween(String value1,
				String value2) {
			addCriterion("STAGE between", value1, value2, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andStageNotBetween(String value1,
				String value2) {
			addCriterion("STAGE not between", value1, value2, "stage");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameIsNull() {
			addCriterion("COURSE_NAME is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameIsNotNull() {
			addCriterion("COURSE_NAME is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameEqualTo(String value) {
			addCriterion("COURSE_NAME =", value, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameNotEqualTo(String value) {
			addCriterion("COURSE_NAME <>", value, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameGreaterThan(String value) {
			addCriterion("COURSE_NAME >", value, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("COURSE_NAME >=", value, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameLessThan(String value) {
			addCriterion("COURSE_NAME <", value, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameLessThanOrEqualTo(
				String value) {
			addCriterion("COURSE_NAME <=", value, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameLike(String value) {
			addCriterion("COURSE_NAME like", value, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameNotLike(String value) {
			addCriterion("COURSE_NAME not like", value, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameIn(List<String> values) {
			addCriterion("COURSE_NAME in", values, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameNotIn(List<String> values) {
			addCriterion("COURSE_NAME not in", values, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameBetween(String value1,
				String value2) {
			addCriterion("COURSE_NAME between", value1, value2, "courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseNameNotBetween(String value1,
				String value2) {
			addCriterion("COURSE_NAME not between", value1, value2,
					"courseName");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreIsNull() {
			addCriterion("COURSE_SCORE is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreIsNotNull() {
			addCriterion("COURSE_SCORE is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreEqualTo(String value) {
			addCriterion("COURSE_SCORE =", value, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreNotEqualTo(String value) {
			addCriterion("COURSE_SCORE <>", value, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreGreaterThan(String value) {
			addCriterion("COURSE_SCORE >", value, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreGreaterThanOrEqualTo(
				String value) {
			addCriterion("COURSE_SCORE >=", value, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreLessThan(String value) {
			addCriterion("COURSE_SCORE <", value, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreLessThanOrEqualTo(
				String value) {
			addCriterion("COURSE_SCORE <=", value, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreLike(String value) {
			addCriterion("COURSE_SCORE like", value, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreNotLike(String value) {
			addCriterion("COURSE_SCORE not like", value, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreIn(List<String> values) {
			addCriterion("COURSE_SCORE in", values, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreNotIn(List<String> values) {
			addCriterion("COURSE_SCORE not in", values, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreBetween(String value1,
				String value2) {
			addCriterion("COURSE_SCORE between", value1, value2, "courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseScoreNotBetween(
				String value1, String value2) {
			addCriterion("COURSE_SCORE not between", value1, value2,
					"courseScore");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserIsNull() {
			addCriterion("CREATE_USER is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserIsNotNull() {
			addCriterion("CREATE_USER is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserEqualTo(String value) {
			addCriterion("CREATE_USER =", value, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserNotEqualTo(String value) {
			addCriterion("CREATE_USER <>", value, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserGreaterThan(String value) {
			addCriterion("CREATE_USER >", value, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserGreaterThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER >=", value, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserLessThan(String value) {
			addCriterion("CREATE_USER <", value, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserLessThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER <=", value, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserLike(String value) {
			addCriterion("CREATE_USER like", value, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserNotLike(String value) {
			addCriterion("CREATE_USER not like", value, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserIn(List<String> values) {
			addCriterion("CREATE_USER in", values, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserNotIn(List<String> values) {
			addCriterion("CREATE_USER not in", values, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserBetween(String value1,
				String value2) {
			addCriterion("CREATE_USER between", value1, value2, "createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreateUserNotBetween(String value1,
				String value2) {
			addCriterion("CREATE_USER not between", value1, value2,
					"createUser");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenIsNull() {
			addCriterion("HIDDEN is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenIsNotNull() {
			addCriterion("HIDDEN is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenEqualTo(Integer value) {
			addCriterion("HIDDEN =", value, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenNotEqualTo(Integer value) {
			addCriterion("HIDDEN <>", value, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenGreaterThan(Integer value) {
			addCriterion("HIDDEN >", value, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("HIDDEN >=", value, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenLessThan(Integer value) {
			addCriterion("HIDDEN <", value, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenLessThanOrEqualTo(
				Integer value) {
			addCriterion("HIDDEN <=", value, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenIn(List<Integer> values) {
			addCriterion("HIDDEN in", values, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenNotIn(List<Integer> values) {
			addCriterion("HIDDEN not in", values, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenBetween(Integer value1,
				Integer value2) {
			addCriterion("HIDDEN between", value1, value2, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andHiddenNotBetween(Integer value1,
				Integer value2) {
			addCriterion("HIDDEN not between", value1, value2, "hidden");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmIsNull() {
			addCriterion("REALM is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmIsNotNull() {
			addCriterion("REALM is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmEqualTo(String value) {
			addCriterion("REALM =", value, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmNotEqualTo(String value) {
			addCriterion("REALM <>", value, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmGreaterThan(String value) {
			addCriterion("REALM >", value, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmGreaterThanOrEqualTo(
				String value) {
			addCriterion("REALM >=", value, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmLessThan(String value) {
			addCriterion("REALM <", value, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmLessThanOrEqualTo(String value) {
			addCriterion("REALM <=", value, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmLike(String value) {
			addCriterion("REALM like", value, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmNotLike(String value) {
			addCriterion("REALM not like", value, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmIn(List<String> values) {
			addCriterion("REALM in", values, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmNotIn(List<String> values) {
			addCriterion("REALM not in", values, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmBetween(String value1,
				String value2) {
			addCriterion("REALM between", value1, value2, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andRealmNotBetween(String value1,
				String value2) {
			addCriterion("REALM not between", value1, value2, "realm");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeIsNull() {
			addCriterion("COURSE_TYPE is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeIsNotNull() {
			addCriterion("COURSE_TYPE is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeEqualTo(String value) {
			addCriterion("COURSE_TYPE =", value, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeNotEqualTo(String value) {
			addCriterion("COURSE_TYPE <>", value, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeGreaterThan(String value) {
			addCriterion("COURSE_TYPE >", value, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("COURSE_TYPE >=", value, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeLessThan(String value) {
			addCriterion("COURSE_TYPE <", value, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeLessThanOrEqualTo(
				String value) {
			addCriterion("COURSE_TYPE <=", value, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeLike(String value) {
			addCriterion("COURSE_TYPE like", value, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeNotLike(String value) {
			addCriterion("COURSE_TYPE not like", value, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeIn(List<String> values) {
			addCriterion("COURSE_TYPE in", values, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeNotIn(List<String> values) {
			addCriterion("COURSE_TYPE not in", values, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeBetween(String value1,
				String value2) {
			addCriterion("COURSE_TYPE between", value1, value2, "courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCourseTypeNotBetween(String value1,
				String value2) {
			addCriterion("COURSE_TYPE not between", value1, value2,
					"courseType");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentIsNull() {
			addCriterion("DEPARTMENT is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentIsNotNull() {
			addCriterion("DEPARTMENT is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentEqualTo(String value) {
			addCriterion("DEPARTMENT =", value, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentNotEqualTo(String value) {
			addCriterion("DEPARTMENT <>", value, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentGreaterThan(String value) {
			addCriterion("DEPARTMENT >", value, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentGreaterThanOrEqualTo(
				String value) {
			addCriterion("DEPARTMENT >=", value, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentLessThan(String value) {
			addCriterion("DEPARTMENT <", value, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentLessThanOrEqualTo(
				String value) {
			addCriterion("DEPARTMENT <=", value, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentLike(String value) {
			addCriterion("DEPARTMENT like", value, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentNotLike(String value) {
			addCriterion("DEPARTMENT not like", value, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentIn(List<String> values) {
			addCriterion("DEPARTMENT in", values, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentNotIn(List<String> values) {
			addCriterion("DEPARTMENT not in", values, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentBetween(String value1,
				String value2) {
			addCriterion("DEPARTMENT between", value1, value2, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andDepartmentNotBetween(String value1,
				String value2) {
			addCriterion("DEPARTMENT not between", value1, value2, "department");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursIsNull() {
			addCriterion("CREDIT_HOURS is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursIsNotNull() {
			addCriterion("CREDIT_HOURS is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursEqualTo(Integer value) {
			addCriterion("CREDIT_HOURS =", value, "creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursNotEqualTo(Integer value) {
			addCriterion("CREDIT_HOURS <>", value, "creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursGreaterThan(Integer value) {
			addCriterion("CREDIT_HOURS >", value, "creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("CREDIT_HOURS >=", value, "creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursLessThan(Integer value) {
			addCriterion("CREDIT_HOURS <", value, "creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursLessThanOrEqualTo(
				Integer value) {
			addCriterion("CREDIT_HOURS <=", value, "creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursIn(List<Integer> values) {
			addCriterion("CREDIT_HOURS in", values, "creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursNotIn(
				List<Integer> values) {
			addCriterion("CREDIT_HOURS not in", values, "creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursBetween(Integer value1,
				Integer value2) {
			addCriterion("CREDIT_HOURS between", value1, value2, "creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andCreditHoursNotBetween(
				Integer value1, Integer value2) {
			addCriterion("CREDIT_HOURS not between", value1, value2,
					"creditHours");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberIsNull() {
			addCriterion("MAX_MEMBER is null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberIsNotNull() {
			addCriterion("MAX_MEMBER is not null");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberEqualTo(Integer value) {
			addCriterion("MAX_MEMBER =", value, "maxMember");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberNotEqualTo(Integer value) {
			addCriterion("MAX_MEMBER <>", value, "maxMember");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberGreaterThan(Integer value) {
			addCriterion("MAX_MEMBER >", value, "maxMember");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("MAX_MEMBER >=", value, "maxMember");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberLessThan(Integer value) {
			addCriterion("MAX_MEMBER <", value, "maxMember");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberLessThanOrEqualTo(
				Integer value) {
			addCriterion("MAX_MEMBER <=", value, "maxMember");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberIn(List<Integer> values) {
			addCriterion("MAX_MEMBER in", values, "maxMember");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberNotIn(List<Integer> values) {
			addCriterion("MAX_MEMBER not in", values, "maxMember");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberBetween(Integer value1,
				Integer value2) {
			addCriterion("MAX_MEMBER between", value1, value2, "maxMember");
			return (EduCourseExample.Criteria) this;
		}

		public EduCourseExample.Criteria andMaxMemberNotBetween(Integer value1,
				Integer value2) {
			addCriterion("MAX_MEMBER not between", value1, value2, "maxMember");
			return (EduCourseExample.Criteria) this;
		}
	}
}
