package com.myoa.model.edu.eduElectiveCourse;

import java.util.ArrayList;
import java.util.List;

public class eduElectiveCourseExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public eduElectiveCourseExample() {
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
			eduElectiveCourseExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<eduElectiveCourseExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<eduElectiveCourseExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<eduElectiveCourseExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria
					.add(new eduElectiveCourseExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new eduElectiveCourseExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new eduElectiveCourseExample.Criterion(condition,
					value1, value2));
		}

		public eduElectiveCourseExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ID >=", value, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("ID <=", value, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdBetween(Integer value1,
				Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidIsNull() {
			addCriterion("nid is null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidIsNotNull() {
			addCriterion("nid is not null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidEqualTo(Integer value) {
			addCriterion("nid =", value, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidNotEqualTo(Integer value) {
			addCriterion("nid <>", value, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidGreaterThan(Integer value) {
			addCriterion("nid >", value, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("nid >=", value, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidLessThan(Integer value) {
			addCriterion("nid <", value, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidLessThanOrEqualTo(
				Integer value) {
			addCriterion("nid <=", value, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidIn(List<Integer> values) {
			addCriterion("nid in", values, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidNotIn(
				List<Integer> values) {
			addCriterion("nid not in", values, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidBetween(Integer value1,
				Integer value2) {
			addCriterion("nid between", value1, value2, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andNidNotBetween(
				Integer value1, Integer value2) {
			addCriterion("nid not between", value1, value2, "nid");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameIsNull() {
			addCriterion("course_name is null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameIsNotNull() {
			addCriterion("course_name is not null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameEqualTo(
				String value) {
			addCriterion("course_name =", value, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameNotEqualTo(
				String value) {
			addCriterion("course_name <>", value, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameGreaterThan(
				String value) {
			addCriterion("course_name >", value, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("course_name >=", value, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameLessThan(
				String value) {
			addCriterion("course_name <", value, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameLessThanOrEqualTo(
				String value) {
			addCriterion("course_name <=", value, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameLike(String value) {
			addCriterion("course_name like", value, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameNotLike(
				String value) {
			addCriterion("course_name not like", value, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameIn(
				List<String> values) {
			addCriterion("course_name in", values, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameNotIn(
				List<String> values) {
			addCriterion("course_name not in", values, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameBetween(
				String value1, String value2) {
			addCriterion("course_name between", value1, value2, "courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseNameNotBetween(
				String value1, String value2) {
			addCriterion("course_name not between", value1, value2,
					"courseName");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameIsNull() {
			addCriterion("course_ename is null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameIsNotNull() {
			addCriterion("course_ename is not null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameEqualTo(
				String value) {
			addCriterion("course_ename =", value, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameNotEqualTo(
				String value) {
			addCriterion("course_ename <>", value, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameGreaterThan(
				String value) {
			addCriterion("course_ename >", value, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameGreaterThanOrEqualTo(
				String value) {
			addCriterion("course_ename >=", value, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameLessThan(
				String value) {
			addCriterion("course_ename <", value, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameLessThanOrEqualTo(
				String value) {
			addCriterion("course_ename <=", value, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameLike(String value) {
			addCriterion("course_ename like", value, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameNotLike(
				String value) {
			addCriterion("course_ename not like", value, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameIn(
				List<String> values) {
			addCriterion("course_ename in", values, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameNotIn(
				List<String> values) {
			addCriterion("course_ename not in", values, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameBetween(
				String value1, String value2) {
			addCriterion("course_ename between", value1, value2, "courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseEnameNotBetween(
				String value1, String value2) {
			addCriterion("course_ename not between", value1, value2,
					"courseEname");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaIsNull() {
			addCriterion("course_area is null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaIsNotNull() {
			addCriterion("course_area is not null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaEqualTo(
				String value) {
			addCriterion("course_area =", value, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaNotEqualTo(
				String value) {
			addCriterion("course_area <>", value, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaGreaterThan(
				String value) {
			addCriterion("course_area >", value, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaGreaterThanOrEqualTo(
				String value) {
			addCriterion("course_area >=", value, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaLessThan(
				String value) {
			addCriterion("course_area <", value, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaLessThanOrEqualTo(
				String value) {
			addCriterion("course_area <=", value, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaLike(String value) {
			addCriterion("course_area like", value, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaNotLike(
				String value) {
			addCriterion("course_area not like", value, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaIn(
				List<String> values) {
			addCriterion("course_area in", values, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaNotIn(
				List<String> values) {
			addCriterion("course_area not in", values, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaBetween(
				String value1, String value2) {
			addCriterion("course_area between", value1, value2, "courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCourseAreaNotBetween(
				String value1, String value2) {
			addCriterion("course_area not between", value1, value2,
					"courseArea");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserIsNull() {
			addCriterion("CREATE_USER is null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserIsNotNull() {
			addCriterion("CREATE_USER is not null");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserEqualTo(
				String value) {
			addCriterion("CREATE_USER =", value, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserNotEqualTo(
				String value) {
			addCriterion("CREATE_USER <>", value, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserGreaterThan(
				String value) {
			addCriterion("CREATE_USER >", value, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserGreaterThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER >=", value, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserLessThan(
				String value) {
			addCriterion("CREATE_USER <", value, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserLessThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER <=", value, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserLike(String value) {
			addCriterion("CREATE_USER like", value, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserNotLike(
				String value) {
			addCriterion("CREATE_USER not like", value, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserIn(
				List<String> values) {
			addCriterion("CREATE_USER in", values, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserNotIn(
				List<String> values) {
			addCriterion("CREATE_USER not in", values, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER between", value1, value2, "createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}

		public eduElectiveCourseExample.Criteria andCreateUserNotBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER not between", value1, value2,
					"createUser");
			return (eduElectiveCourseExample.Criteria) this;
		}
	}
}
