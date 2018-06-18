package com.myoa.model.edu.eduLearnPhase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EduLearnPhaseExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduLearnPhaseExample() {
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

	public static class Criteria extends EduLearnPhaseExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduLearnPhaseExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduLearnPhaseExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduLearnPhaseExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new EduLearnPhaseExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduLearnPhaseExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduLearnPhaseExample.Criterion(condition,
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

		public EduLearnPhaseExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ID >=", value, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("ID <=", value, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdBetween(Integer value1,
				Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("NAME >=", value, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameLessThanOrEqualTo(
				String value) {
			addCriterion("NAME <=", value, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameBetween(String value1,
				String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andNameNotBetween(String value1,
				String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeIsNull() {
			addCriterion("CODE is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeIsNotNull() {
			addCriterion("CODE is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeEqualTo(String value) {
			addCriterion("CODE =", value, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeNotEqualTo(String value) {
			addCriterion("CODE <>", value, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeGreaterThan(String value) {
			addCriterion("CODE >", value, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeGreaterThanOrEqualTo(
				String value) {
			addCriterion("CODE >=", value, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeLessThan(String value) {
			addCriterion("CODE <", value, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeLessThanOrEqualTo(
				String value) {
			addCriterion("CODE <=", value, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeLike(String value) {
			addCriterion("CODE like", value, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeNotLike(String value) {
			addCriterion("CODE not like", value, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeIn(List<String> values) {
			addCriterion("CODE in", values, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeNotIn(List<String> values) {
			addCriterion("CODE not in", values, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeBetween(String value1,
				String value2) {
			addCriterion("CODE between", value1, value2, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCodeNotBetween(String value1,
				String value2) {
			addCriterion("CODE not between", value1, value2, "code");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderIsNull() {
			addCriterion("LEADER is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderIsNotNull() {
			addCriterion("LEADER is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderEqualTo(String value) {
			addCriterion("LEADER =", value, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderNotEqualTo(String value) {
			addCriterion("LEADER <>", value, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderGreaterThan(String value) {
			addCriterion("LEADER >", value, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderGreaterThanOrEqualTo(
				String value) {
			addCriterion("LEADER >=", value, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderLessThan(String value) {
			addCriterion("LEADER <", value, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderLessThanOrEqualTo(
				String value) {
			addCriterion("LEADER <=", value, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderLike(String value) {
			addCriterion("LEADER like", value, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderNotLike(String value) {
			addCriterion("LEADER not like", value, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderIn(List<String> values) {
			addCriterion("LEADER in", values, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderNotIn(List<String> values) {
			addCriterion("LEADER not in", values, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderBetween(String value1,
				String value2) {
			addCriterion("LEADER between", value1, value2, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andLeaderNotBetween(String value1,
				String value2) {
			addCriterion("LEADER not between", value1, value2, "leader");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoIsNull() {
			addCriterion("FACULTY_NO is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoIsNotNull() {
			addCriterion("FACULTY_NO is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoEqualTo(String value) {
			addCriterion("FACULTY_NO =", value, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoNotEqualTo(String value) {
			addCriterion("FACULTY_NO <>", value, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoGreaterThan(
				String value) {
			addCriterion("FACULTY_NO >", value, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoGreaterThanOrEqualTo(
				String value) {
			addCriterion("FACULTY_NO >=", value, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoLessThan(String value) {
			addCriterion("FACULTY_NO <", value, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoLessThanOrEqualTo(
				String value) {
			addCriterion("FACULTY_NO <=", value, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoLike(String value) {
			addCriterion("FACULTY_NO like", value, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoNotLike(String value) {
			addCriterion("FACULTY_NO not like", value, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoIn(List<String> values) {
			addCriterion("FACULTY_NO in", values, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoNotIn(
				List<String> values) {
			addCriterion("FACULTY_NO not in", values, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoBetween(String value1,
				String value2) {
			addCriterion("FACULTY_NO between", value1, value2, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNoNotBetween(
				String value1, String value2) {
			addCriterion("FACULTY_NO not between", value1, value2, "facultyNo");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameIsNull() {
			addCriterion("FACULTY_NAME is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameIsNotNull() {
			addCriterion("FACULTY_NAME is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameEqualTo(String value) {
			addCriterion("FACULTY_NAME =", value, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameNotEqualTo(
				String value) {
			addCriterion("FACULTY_NAME <>", value, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameGreaterThan(
				String value) {
			addCriterion("FACULTY_NAME >", value, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("FACULTY_NAME >=", value, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameLessThan(String value) {
			addCriterion("FACULTY_NAME <", value, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameLessThanOrEqualTo(
				String value) {
			addCriterion("FACULTY_NAME <=", value, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameLike(String value) {
			addCriterion("FACULTY_NAME like", value, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameNotLike(String value) {
			addCriterion("FACULTY_NAME not like", value, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameIn(
				List<String> values) {
			addCriterion("FACULTY_NAME in", values, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameNotIn(
				List<String> values) {
			addCriterion("FACULTY_NAME not in", values, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameBetween(
				String value1, String value2) {
			addCriterion("FACULTY_NAME between", value1, value2, "facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andFacultyNameNotBetween(
				String value1, String value2) {
			addCriterion("FACULTY_NAME not between", value1, value2,
					"facultyName");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledIsNull() {
			addCriterion("IS_ENABLED is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledIsNotNull() {
			addCriterion("IS_ENABLED is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledEqualTo(String value) {
			addCriterion("IS_ENABLED =", value, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledNotEqualTo(String value) {
			addCriterion("IS_ENABLED <>", value, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledGreaterThan(
				String value) {
			addCriterion("IS_ENABLED >", value, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_ENABLED >=", value, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledLessThan(String value) {
			addCriterion("IS_ENABLED <", value, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledLessThanOrEqualTo(
				String value) {
			addCriterion("IS_ENABLED <=", value, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledLike(String value) {
			addCriterion("IS_ENABLED like", value, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledNotLike(String value) {
			addCriterion("IS_ENABLED not like", value, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledIn(List<String> values) {
			addCriterion("IS_ENABLED in", values, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledNotIn(
				List<String> values) {
			addCriterion("IS_ENABLED not in", values, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledBetween(String value1,
				String value2) {
			addCriterion("IS_ENABLED between", value1, value2, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andIsEnabledNotBetween(
				String value1, String value2) {
			addCriterion("IS_ENABLED not between", value1, value2, "isEnabled");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionIsNull() {
			addCriterion("POSOTION is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionIsNotNull() {
			addCriterion("POSOTION is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionEqualTo(String value) {
			addCriterion("POSOTION =", value, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionNotEqualTo(String value) {
			addCriterion("POSOTION <>", value, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionGreaterThan(String value) {
			addCriterion("POSOTION >", value, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionGreaterThanOrEqualTo(
				String value) {
			addCriterion("POSOTION >=", value, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionLessThan(String value) {
			addCriterion("POSOTION <", value, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionLessThanOrEqualTo(
				String value) {
			addCriterion("POSOTION <=", value, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionLike(String value) {
			addCriterion("POSOTION like", value, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionNotLike(String value) {
			addCriterion("POSOTION not like", value, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionIn(List<String> values) {
			addCriterion("POSOTION in", values, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionNotIn(
				List<String> values) {
			addCriterion("POSOTION not in", values, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionBetween(String value1,
				String value2) {
			addCriterion("POSOTION between", value1, value2, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andPosotionNotBetween(
				String value1, String value2) {
			addCriterion("POSOTION not between", value1, value2, "posotion");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkIsNull() {
			addCriterion("REMARK is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkIsNotNull() {
			addCriterion("REMARK is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkEqualTo(String value) {
			addCriterion("REMARK =", value, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkNotEqualTo(String value) {
			addCriterion("REMARK <>", value, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkGreaterThan(String value) {
			addCriterion("REMARK >", value, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkGreaterThanOrEqualTo(
				String value) {
			addCriterion("REMARK >=", value, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkLessThan(String value) {
			addCriterion("REMARK <", value, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkLessThanOrEqualTo(
				String value) {
			addCriterion("REMARK <=", value, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkLike(String value) {
			addCriterion("REMARK like", value, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkNotLike(String value) {
			addCriterion("REMARK not like", value, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkIn(List<String> values) {
			addCriterion("REMARK in", values, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkNotIn(List<String> values) {
			addCriterion("REMARK not in", values, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkBetween(String value1,
				String value2) {
			addCriterion("REMARK between", value1, value2, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andRemarkNotBetween(String value1,
				String value2) {
			addCriterion("REMARK not between", value1, value2, "remark");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeIsNull() {
			addCriterion("CREATE_TIME is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeIsNotNull() {
			addCriterion("CREATE_TIME is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("CREATE_TIME between", value1, value2,
					"createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("CREATE_TIME not between", value1, value2,
					"createTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserIsNull() {
			addCriterion("CREATE_USER is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserIsNotNull() {
			addCriterion("CREATE_USER is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserEqualTo(String value) {
			addCriterion("CREATE_USER =", value, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserNotEqualTo(
				String value) {
			addCriterion("CREATE_USER <>", value, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserGreaterThan(
				String value) {
			addCriterion("CREATE_USER >", value, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserGreaterThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER >=", value, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserLessThan(String value) {
			addCriterion("CREATE_USER <", value, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserLessThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER <=", value, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserLike(String value) {
			addCriterion("CREATE_USER like", value, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserNotLike(String value) {
			addCriterion("CREATE_USER not like", value, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserIn(List<String> values) {
			addCriterion("CREATE_USER in", values, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserNotIn(
				List<String> values) {
			addCriterion("CREATE_USER not in", values, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER between", value1, value2, "createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andCreateUserNotBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER not between", value1, value2,
					"createUser");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeIsNull() {
			addCriterion("EDIT_TIME is null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeIsNotNull() {
			addCriterion("EDIT_TIME is not null");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME =", value, "editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME <>", value, "editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME >", value, "editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME >=", value, "editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME <", value, "editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME <=", value, "editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("EDIT_TIME in", values, "editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("EDIT_TIME not in", values, "editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("EDIT_TIME between", value1, value2,
					"editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}

		public EduLearnPhaseExample.Criteria andEditTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("EDIT_TIME not between", value1, value2,
					"editTime");
			return (EduLearnPhaseExample.Criteria) this;
		}
	}
}
