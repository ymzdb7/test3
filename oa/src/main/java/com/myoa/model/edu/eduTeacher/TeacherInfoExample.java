package com.myoa.model.edu.eduTeacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherInfoExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public TeacherInfoExample() {
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

	public static class Criteria extends TeacherInfoExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<TeacherInfoExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<TeacherInfoExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<TeacherInfoExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new TeacherInfoExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria
					.add(new TeacherInfoExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new TeacherInfoExample.Criterion(condition,
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

		public TeacherInfoExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ID >=", value, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("ID <=", value, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdBetween(Integer value1,
				Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("NAME >=", value, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("NAME <=", value, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameBetween(String value1,
				String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNameNotBetween(String value1,
				String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationIsNull() {
			addCriterion("NATION is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationIsNotNull() {
			addCriterion("NATION is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationEqualTo(String value) {
			addCriterion("NATION =", value, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationNotEqualTo(String value) {
			addCriterion("NATION <>", value, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationGreaterThan(String value) {
			addCriterion("NATION >", value, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationGreaterThanOrEqualTo(
				String value) {
			addCriterion("NATION >=", value, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationLessThan(String value) {
			addCriterion("NATION <", value, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationLessThanOrEqualTo(
				String value) {
			addCriterion("NATION <=", value, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationLike(String value) {
			addCriterion("NATION like", value, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationNotLike(String value) {
			addCriterion("NATION not like", value, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationIn(List<String> values) {
			addCriterion("NATION in", values, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationNotIn(List<String> values) {
			addCriterion("NATION not in", values, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationBetween(String value1,
				String value2) {
			addCriterion("NATION between", value1, value2, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNationNotBetween(String value1,
				String value2) {
			addCriterion("NATION not between", value1, value2, "nation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexIsNull() {
			addCriterion("SEX is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexIsNotNull() {
			addCriterion("SEX is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexEqualTo(String value) {
			addCriterion("SEX =", value, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexNotEqualTo(String value) {
			addCriterion("SEX <>", value, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexGreaterThan(String value) {
			addCriterion("SEX >", value, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexGreaterThanOrEqualTo(
				String value) {
			addCriterion("SEX >=", value, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexLessThan(String value) {
			addCriterion("SEX <", value, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexLessThanOrEqualTo(String value) {
			addCriterion("SEX <=", value, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexLike(String value) {
			addCriterion("SEX like", value, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexNotLike(String value) {
			addCriterion("SEX not like", value, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexIn(List<String> values) {
			addCriterion("SEX in", values, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexNotIn(List<String> values) {
			addCriterion("SEX not in", values, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexBetween(String value1,
				String value2) {
			addCriterion("SEX between", value1, value2, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSexNotBetween(String value1,
				String value2) {
			addCriterion("SEX not between", value1, value2, "sex");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardIsNull() {
			addCriterion("ID_CARD is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardIsNotNull() {
			addCriterion("ID_CARD is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardEqualTo(String value) {
			addCriterion("ID_CARD =", value, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardNotEqualTo(String value) {
			addCriterion("ID_CARD <>", value, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardGreaterThan(String value) {
			addCriterion("ID_CARD >", value, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardGreaterThanOrEqualTo(
				String value) {
			addCriterion("ID_CARD >=", value, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardLessThan(String value) {
			addCriterion("ID_CARD <", value, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardLessThanOrEqualTo(
				String value) {
			addCriterion("ID_CARD <=", value, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardLike(String value) {
			addCriterion("ID_CARD like", value, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardNotLike(String value) {
			addCriterion("ID_CARD not like", value, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardIn(List<String> values) {
			addCriterion("ID_CARD in", values, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardNotIn(List<String> values) {
			addCriterion("ID_CARD not in", values, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardBetween(String value1,
				String value2) {
			addCriterion("ID_CARD between", value1, value2, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIdCardNotBetween(String value1,
				String value2) {
			addCriterion("ID_CARD not between", value1, value2, "idCard");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxIsNull() {
			addCriterion("SSXX is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxIsNotNull() {
			addCriterion("SSXX is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxEqualTo(String value) {
			addCriterion("SSXX =", value, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxNotEqualTo(String value) {
			addCriterion("SSXX <>", value, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxGreaterThan(String value) {
			addCriterion("SSXX >", value, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxGreaterThanOrEqualTo(
				String value) {
			addCriterion("SSXX >=", value, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxLessThan(String value) {
			addCriterion("SSXX <", value, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxLessThanOrEqualTo(String value) {
			addCriterion("SSXX <=", value, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxLike(String value) {
			addCriterion("SSXX like", value, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxNotLike(String value) {
			addCriterion("SSXX not like", value, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxIn(List<String> values) {
			addCriterion("SSXX in", values, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxNotIn(List<String> values) {
			addCriterion("SSXX not in", values, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxBetween(String value1,
				String value2) {
			addCriterion("SSXX between", value1, value2, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSsxxNotBetween(String value1,
				String value2) {
			addCriterion("SSXX not between", value1, value2, "ssxx");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeIsNull() {
			addCriterion("JOB_STARTIME is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeIsNotNull() {
			addCriterion("JOB_STARTIME is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME =", value, "jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME <>", value, "jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME >", value, "jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME >=", value, "jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME <", value, "jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME <=", value, "jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("JOB_STARTIME in", values, "jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("JOB_STARTIME not in", values,
					"jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("JOB_STARTIME between", value1, value2,
					"jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andJobStartimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("JOB_STARTIME not between", value1, value2,
					"jobStartime");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalIsNull() {
			addCriterion("POLITICAL is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalIsNotNull() {
			addCriterion("POLITICAL is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalEqualTo(String value) {
			addCriterion("POLITICAL =", value, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalNotEqualTo(String value) {
			addCriterion("POLITICAL <>", value, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalGreaterThan(String value) {
			addCriterion("POLITICAL >", value, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalGreaterThanOrEqualTo(
				String value) {
			addCriterion("POLITICAL >=", value, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalLessThan(String value) {
			addCriterion("POLITICAL <", value, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalLessThanOrEqualTo(
				String value) {
			addCriterion("POLITICAL <=", value, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalLike(String value) {
			addCriterion("POLITICAL like", value, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalNotLike(String value) {
			addCriterion("POLITICAL not like", value, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalIn(List<String> values) {
			addCriterion("POLITICAL in", values, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalNotIn(List<String> values) {
			addCriterion("POLITICAL not in", values, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalBetween(String value1,
				String value2) {
			addCriterion("POLITICAL between", value1, value2, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPoliticalNotBetween(
				String value1, String value2) {
			addCriterion("POLITICAL not between", value1, value2, "political");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneIsNull() {
			addCriterion("POHNE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneIsNotNull() {
			addCriterion("POHNE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneEqualTo(String value) {
			addCriterion("POHNE =", value, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneNotEqualTo(String value) {
			addCriterion("POHNE <>", value, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneGreaterThan(String value) {
			addCriterion("POHNE >", value, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneGreaterThanOrEqualTo(
				String value) {
			addCriterion("POHNE >=", value, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneLessThan(String value) {
			addCriterion("POHNE <", value, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneLessThanOrEqualTo(
				String value) {
			addCriterion("POHNE <=", value, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneLike(String value) {
			addCriterion("POHNE like", value, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneNotLike(String value) {
			addCriterion("POHNE not like", value, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneIn(List<String> values) {
			addCriterion("POHNE in", values, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneNotIn(List<String> values) {
			addCriterion("POHNE not in", values, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneBetween(String value1,
				String value2) {
			addCriterion("POHNE between", value1, value2, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPohneNotBetween(String value1,
				String value2) {
			addCriterion("POHNE not between", value1, value2, "pohne");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateIsNull() {
			addCriterion("POST_CATE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateIsNotNull() {
			addCriterion("POST_CATE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateEqualTo(String value) {
			addCriterion("POST_CATE =", value, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateNotEqualTo(String value) {
			addCriterion("POST_CATE <>", value, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateGreaterThan(String value) {
			addCriterion("POST_CATE >", value, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateGreaterThanOrEqualTo(
				String value) {
			addCriterion("POST_CATE >=", value, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateLessThan(String value) {
			addCriterion("POST_CATE <", value, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateLessThanOrEqualTo(
				String value) {
			addCriterion("POST_CATE <=", value, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateLike(String value) {
			addCriterion("POST_CATE like", value, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateNotLike(String value) {
			addCriterion("POST_CATE not like", value, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateIn(List<String> values) {
			addCriterion("POST_CATE in", values, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateNotIn(List<String> values) {
			addCriterion("POST_CATE not in", values, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateBetween(String value1,
				String value2) {
			addCriterion("POST_CATE between", value1, value2, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostCateNotBetween(String value1,
				String value2) {
			addCriterion("POST_CATE not between", value1, value2, "postCate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostIsNull() {
			addCriterion("POST is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostIsNotNull() {
			addCriterion("POST is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEqualTo(String value) {
			addCriterion("POST =", value, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostNotEqualTo(String value) {
			addCriterion("POST <>", value, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostGreaterThan(String value) {
			addCriterion("POST >", value, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostGreaterThanOrEqualTo(
				String value) {
			addCriterion("POST >=", value, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostLessThan(String value) {
			addCriterion("POST <", value, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostLessThanOrEqualTo(String value) {
			addCriterion("POST <=", value, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostLike(String value) {
			addCriterion("POST like", value, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostNotLike(String value) {
			addCriterion("POST not like", value, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostIn(List<String> values) {
			addCriterion("POST in", values, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostNotIn(List<String> values) {
			addCriterion("POST not in", values, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostBetween(String value1,
				String value2) {
			addCriterion("POST between", value1, value2, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostNotBetween(String value1,
				String value2) {
			addCriterion("POST not between", value1, value2, "post");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthIsNull() {
			addCriterion("BIRTH is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthIsNotNull() {
			addCriterion("BIRTH is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthEqualTo(java.util.Date value) {
			addCriterionForJDBCDate("BIRTH =", value, "birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH <>", value, "birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH >", value, "birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH >=", value, "birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthLessThan(java.util.Date value) {
			addCriterionForJDBCDate("BIRTH <", value, "birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH <=", value, "birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BIRTH in", values, "birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BIRTH not in", values, "birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BIRTH between", value1, value2, "birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andBirthNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BIRTH not between", value1, value2,
					"birth");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginIsNull() {
			addCriterion("ORIGIN is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginIsNotNull() {
			addCriterion("ORIGIN is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginEqualTo(String value) {
			addCriterion("ORIGIN =", value, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginNotEqualTo(String value) {
			addCriterion("ORIGIN <>", value, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginGreaterThan(String value) {
			addCriterion("ORIGIN >", value, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginGreaterThanOrEqualTo(
				String value) {
			addCriterion("ORIGIN >=", value, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginLessThan(String value) {
			addCriterion("ORIGIN <", value, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginLessThanOrEqualTo(
				String value) {
			addCriterion("ORIGIN <=", value, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginLike(String value) {
			addCriterion("ORIGIN like", value, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginNotLike(String value) {
			addCriterion("ORIGIN not like", value, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginIn(List<String> values) {
			addCriterion("ORIGIN in", values, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginNotIn(List<String> values) {
			addCriterion("ORIGIN not in", values, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginBetween(String value1,
				String value2) {
			addCriterion("ORIGIN between", value1, value2, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andOriginNotBetween(String value1,
				String value2) {
			addCriterion("ORIGIN not between", value1, value2, "origin");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressIsNull() {
			addCriterion("ADDRESS is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressIsNotNull() {
			addCriterion("ADDRESS is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressEqualTo(String value) {
			addCriterion("ADDRESS =", value, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressNotEqualTo(String value) {
			addCriterion("ADDRESS <>", value, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressGreaterThan(String value) {
			addCriterion("ADDRESS >", value, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("ADDRESS >=", value, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressLessThan(String value) {
			addCriterion("ADDRESS <", value, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressLessThanOrEqualTo(
				String value) {
			addCriterion("ADDRESS <=", value, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressLike(String value) {
			addCriterion("ADDRESS like", value, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressNotLike(String value) {
			addCriterion("ADDRESS not like", value, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressIn(List<String> values) {
			addCriterion("ADDRESS in", values, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressNotIn(List<String> values) {
			addCriterion("ADDRESS not in", values, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressBetween(String value1,
				String value2) {
			addCriterion("ADDRESS between", value1, value2, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andAddressNotBetween(String value1,
				String value2) {
			addCriterion("ADDRESS not between", value1, value2, "address");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressIsNull() {
			addCriterion("POSTAL_ADDRESS is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressIsNotNull() {
			addCriterion("POSTAL_ADDRESS is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressEqualTo(String value) {
			addCriterion("POSTAL_ADDRESS =", value, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressNotEqualTo(
				String value) {
			addCriterion("POSTAL_ADDRESS <>", value, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressGreaterThan(
				String value) {
			addCriterion("POSTAL_ADDRESS >", value, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("POSTAL_ADDRESS >=", value, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressLessThan(String value) {
			addCriterion("POSTAL_ADDRESS <", value, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressLessThanOrEqualTo(
				String value) {
			addCriterion("POSTAL_ADDRESS <=", value, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressLike(String value) {
			addCriterion("POSTAL_ADDRESS like", value, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressNotLike(String value) {
			addCriterion("POSTAL_ADDRESS not like", value, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressIn(
				List<String> values) {
			addCriterion("POSTAL_ADDRESS in", values, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressNotIn(
				List<String> values) {
			addCriterion("POSTAL_ADDRESS not in", values, "postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressBetween(
				String value1, String value2) {
			addCriterion("POSTAL_ADDRESS between", value1, value2,
					"postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostalAddressNotBetween(
				String value1, String value2) {
			addCriterion("POSTAL_ADDRESS not between", value1, value2,
					"postalAddress");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailIsNull() {
			addCriterion("EMAIL is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailIsNotNull() {
			addCriterion("EMAIL is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailEqualTo(String value) {
			addCriterion("EMAIL =", value, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailNotEqualTo(String value) {
			addCriterion("EMAIL <>", value, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailGreaterThan(String value) {
			addCriterion("EMAIL >", value, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailGreaterThanOrEqualTo(
				String value) {
			addCriterion("EMAIL >=", value, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailLessThan(String value) {
			addCriterion("EMAIL <", value, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailLessThanOrEqualTo(
				String value) {
			addCriterion("EMAIL <=", value, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailLike(String value) {
			addCriterion("EMAIL like", value, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailNotLike(String value) {
			addCriterion("EMAIL not like", value, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailIn(List<String> values) {
			addCriterion("EMAIL in", values, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailNotIn(List<String> values) {
			addCriterion("EMAIL not in", values, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailBetween(String value1,
				String value2) {
			addCriterion("EMAIL between", value1, value2, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andEmailNotBetween(String value1,
				String value2) {
			addCriterion("EMAIL not between", value1, value2, "email");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesIsNull() {
			addCriterion("IS_INSERIES is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesIsNotNull() {
			addCriterion("IS_INSERIES is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesEqualTo(String value) {
			addCriterion("IS_INSERIES =", value, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesNotEqualTo(String value) {
			addCriterion("IS_INSERIES <>", value, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesGreaterThan(String value) {
			addCriterion("IS_INSERIES >", value, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_INSERIES >=", value, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesLessThan(String value) {
			addCriterion("IS_INSERIES <", value, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesLessThanOrEqualTo(
				String value) {
			addCriterion("IS_INSERIES <=", value, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesLike(String value) {
			addCriterion("IS_INSERIES like", value, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesNotLike(String value) {
			addCriterion("IS_INSERIES not like", value, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesIn(List<String> values) {
			addCriterion("IS_INSERIES in", values, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesNotIn(
				List<String> values) {
			addCriterion("IS_INSERIES not in", values, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesBetween(String value1,
				String value2) {
			addCriterion("IS_INSERIES between", value1, value2, "isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInseriesNotBetween(
				String value1, String value2) {
			addCriterion("IS_INSERIES not between", value1, value2,
					"isInseries");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostIsNull() {
			addCriterion("IS_INPOST is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostIsNotNull() {
			addCriterion("IS_INPOST is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostEqualTo(String value) {
			addCriterion("IS_INPOST =", value, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostNotEqualTo(String value) {
			addCriterion("IS_INPOST <>", value, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostGreaterThan(String value) {
			addCriterion("IS_INPOST >", value, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_INPOST >=", value, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostLessThan(String value) {
			addCriterion("IS_INPOST <", value, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostLessThanOrEqualTo(
				String value) {
			addCriterion("IS_INPOST <=", value, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostLike(String value) {
			addCriterion("IS_INPOST like", value, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostNotLike(String value) {
			addCriterion("IS_INPOST not like", value, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostIn(List<String> values) {
			addCriterion("IS_INPOST in", values, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostNotIn(List<String> values) {
			addCriterion("IS_INPOST not in", values, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostBetween(String value1,
				String value2) {
			addCriterion("IS_INPOST between", value1, value2, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsInpostNotBetween(String value1,
				String value2) {
			addCriterion("IS_INPOST not between", value1, value2, "isInpost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeIsNull() {
			addCriterion("HEIGHEST_DEGREE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeIsNotNull() {
			addCriterion("HEIGHEST_DEGREE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeEqualTo(String value) {
			addCriterion("HEIGHEST_DEGREE =", value, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeNotEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE <>", value, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeGreaterThan(
				String value) {
			addCriterion("HEIGHEST_DEGREE >", value, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeGreaterThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE >=", value, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeLessThan(
				String value) {
			addCriterion("HEIGHEST_DEGREE <", value, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeLessThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE <=", value, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeLike(String value) {
			addCriterion("HEIGHEST_DEGREE like", value, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeNotLike(String value) {
			addCriterion("HEIGHEST_DEGREE not like", value, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeIn(
				List<String> values) {
			addCriterion("HEIGHEST_DEGREE in", values, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeNotIn(
				List<String> values) {
			addCriterion("HEIGHEST_DEGREE not in", values, "heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_DEGREE between", value1, value2,
					"heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestDegreeNotBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_DEGREE not between", value1, value2,
					"heighestDegree");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduIsNull() {
			addCriterion("HEIGHEST_EDU is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduIsNotNull() {
			addCriterion("HEIGHEST_EDU is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduEqualTo(String value) {
			addCriterion("HEIGHEST_EDU =", value, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduNotEqualTo(String value) {
			addCriterion("HEIGHEST_EDU <>", value, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduGreaterThan(
				String value) {
			addCriterion("HEIGHEST_EDU >", value, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduGreaterThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU >=", value, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduLessThan(String value) {
			addCriterion("HEIGHEST_EDU <", value, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduLessThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU <=", value, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduLike(String value) {
			addCriterion("HEIGHEST_EDU like", value, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduNotLike(String value) {
			addCriterion("HEIGHEST_EDU not like", value, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduIn(List<String> values) {
			addCriterion("HEIGHEST_EDU in", values, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduNotIn(
				List<String> values) {
			addCriterion("HEIGHEST_EDU not in", values, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduBetween(String value1,
				String value2) {
			addCriterion("HEIGHEST_EDU between", value1, value2, "heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduNotBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_EDU not between", value1, value2,
					"heighestEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorIsNull() {
			addCriterion("HEIGHEST_EDU_MAJOR is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorIsNotNull() {
			addCriterion("HEIGHEST_EDU_MAJOR is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR =", value, "heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorNotEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR <>", value, "heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorGreaterThan(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR >", value, "heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorGreaterThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR >=", value, "heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorLessThan(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR <", value, "heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorLessThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR <=", value, "heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorLike(String value) {
			addCriterion("HEIGHEST_EDU_MAJOR like", value, "heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorNotLike(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR not like", value,
					"heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorIn(
				List<String> values) {
			addCriterion("HEIGHEST_EDU_MAJOR in", values, "heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorNotIn(
				List<String> values) {
			addCriterion("HEIGHEST_EDU_MAJOR not in", values,
					"heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_EDU_MAJOR between", value1, value2,
					"heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHeighestEduMajorNotBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_EDU_MAJOR not between", value1, value2,
					"heighestEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateIsNull() {
			addCriterion("MAJOR_DATE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateIsNotNull() {
			addCriterion("MAJOR_DATE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE =", value, "majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE <>", value, "majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE >", value, "majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE >=", value, "majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE <", value, "majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE <=", value, "majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("MAJOR_DATE in", values, "majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("MAJOR_DATE not in", values, "majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("MAJOR_DATE between", value1, value2,
					"majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("MAJOR_DATE not between", value1, value2,
					"majorDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolIsNull() {
			addCriterion("MAJOR_EDU_SCHOOL is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolIsNotNull() {
			addCriterion("MAJOR_EDU_SCHOOL is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolEqualTo(String value) {
			addCriterion("MAJOR_EDU_SCHOOL =", value, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolNotEqualTo(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL <>", value, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolGreaterThan(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL >", value, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolGreaterThanOrEqualTo(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL >=", value, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolLessThan(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL <", value, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolLessThanOrEqualTo(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL <=", value, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolLike(String value) {
			addCriterion("MAJOR_EDU_SCHOOL like", value, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolNotLike(String value) {
			addCriterion("MAJOR_EDU_SCHOOL not like", value, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolIn(
				List<String> values) {
			addCriterion("MAJOR_EDU_SCHOOL in", values, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolNotIn(
				List<String> values) {
			addCriterion("MAJOR_EDU_SCHOOL not in", values, "majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolBetween(
				String value1, String value2) {
			addCriterion("MAJOR_EDU_SCHOOL between", value1, value2,
					"majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMajorEduSchoolNotBetween(
				String value1, String value2) {
			addCriterion("MAJOR_EDU_SCHOOL not between", value1, value2,
					"majorEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduIsNull() {
			addCriterion("FIRST_EDU is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduIsNotNull() {
			addCriterion("FIRST_EDU is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduEqualTo(String value) {
			addCriterion("FIRST_EDU =", value, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduNotEqualTo(String value) {
			addCriterion("FIRST_EDU <>", value, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduGreaterThan(String value) {
			addCriterion("FIRST_EDU >", value, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduGreaterThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU >=", value, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduLessThan(String value) {
			addCriterion("FIRST_EDU <", value, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduLessThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU <=", value, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduLike(String value) {
			addCriterion("FIRST_EDU like", value, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduNotLike(String value) {
			addCriterion("FIRST_EDU not like", value, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduIn(List<String> values) {
			addCriterion("FIRST_EDU in", values, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduNotIn(List<String> values) {
			addCriterion("FIRST_EDU not in", values, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduBetween(String value1,
				String value2) {
			addCriterion("FIRST_EDU between", value1, value2, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduNotBetween(String value1,
				String value2) {
			addCriterion("FIRST_EDU not between", value1, value2, "firstEdu");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorIsNull() {
			addCriterion("FIRST_EDU_MAJOR is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorIsNotNull() {
			addCriterion("FIRST_EDU_MAJOR is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorEqualTo(String value) {
			addCriterion("FIRST_EDU_MAJOR =", value, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorNotEqualTo(
				String value) {
			addCriterion("FIRST_EDU_MAJOR <>", value, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorGreaterThan(
				String value) {
			addCriterion("FIRST_EDU_MAJOR >", value, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorGreaterThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU_MAJOR >=", value, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorLessThan(String value) {
			addCriterion("FIRST_EDU_MAJOR <", value, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorLessThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU_MAJOR <=", value, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorLike(String value) {
			addCriterion("FIRST_EDU_MAJOR like", value, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorNotLike(String value) {
			addCriterion("FIRST_EDU_MAJOR not like", value, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorIn(
				List<String> values) {
			addCriterion("FIRST_EDU_MAJOR in", values, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorNotIn(
				List<String> values) {
			addCriterion("FIRST_EDU_MAJOR not in", values, "firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorBetween(
				String value1, String value2) {
			addCriterion("FIRST_EDU_MAJOR between", value1, value2,
					"firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduMajorNotBetween(
				String value1, String value2) {
			addCriterion("FIRST_EDU_MAJOR not between", value1, value2,
					"firstEduMajor");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateIsNull() {
			addCriterion("FIRST_EDU_DATE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateIsNotNull() {
			addCriterion("FIRST_EDU_DATE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE =", value, "firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE <>", value, "firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE >", value, "firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE >=", value, "firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE <", value, "firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE <=", value, "firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("FIRST_EDU_DATE in", values, "firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("FIRST_EDU_DATE not in", values,
					"firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("FIRST_EDU_DATE between", value1, value2,
					"firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("FIRST_EDU_DATE not between", value1,
					value2, "firstEduDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolIsNull() {
			addCriterion("FIRST_EDU_SCHOOL is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolIsNotNull() {
			addCriterion("FIRST_EDU_SCHOOL is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolEqualTo(String value) {
			addCriterion("FIRST_EDU_SCHOOL =", value, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolNotEqualTo(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL <>", value, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolGreaterThan(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL >", value, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolGreaterThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL >=", value, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolLessThan(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL <", value, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolLessThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL <=", value, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolLike(String value) {
			addCriterion("FIRST_EDU_SCHOOL like", value, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolNotLike(String value) {
			addCriterion("FIRST_EDU_SCHOOL not like", value, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolIn(
				List<String> values) {
			addCriterion("FIRST_EDU_SCHOOL in", values, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolNotIn(
				List<String> values) {
			addCriterion("FIRST_EDU_SCHOOL not in", values, "firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolBetween(
				String value1, String value2) {
			addCriterion("FIRST_EDU_SCHOOL between", value1, value2,
					"firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andFirstEduSchoolNotBetween(
				String value1, String value2) {
			addCriterion("FIRST_EDU_SCHOOL not between", value1, value2,
					"firstEduSchool");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeIsNull() {
			addCriterion("TEACHER_BOOK_TYPE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeIsNotNull() {
			addCriterion("TEACHER_BOOK_TYPE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE =", value, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeNotEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE <>", value, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeGreaterThan(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE >", value, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE >=", value, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeLessThan(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE <", value, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE <=", value, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeLike(String value) {
			addCriterion("TEACHER_BOOK_TYPE like", value, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeNotLike(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE not like", value, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeIn(
				List<String> values) {
			addCriterion("TEACHER_BOOK_TYPE in", values, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeNotIn(
				List<String> values) {
			addCriterion("TEACHER_BOOK_TYPE not in", values, "teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeBetween(
				String value1, String value2) {
			addCriterion("TEACHER_BOOK_TYPE between", value1, value2,
					"teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookTypeNotBetween(
				String value1, String value2) {
			addCriterion("TEACHER_BOOK_TYPE not between", value1, value2,
					"teacherBookType");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoIsNull() {
			addCriterion("TEACHER_BOOK_NO is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoIsNotNull() {
			addCriterion("TEACHER_BOOK_NO is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoEqualTo(String value) {
			addCriterion("TEACHER_BOOK_NO =", value, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoNotEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_NO <>", value, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoGreaterThan(
				String value) {
			addCriterion("TEACHER_BOOK_NO >", value, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_NO >=", value, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoLessThan(String value) {
			addCriterion("TEACHER_BOOK_NO <", value, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_NO <=", value, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoLike(String value) {
			addCriterion("TEACHER_BOOK_NO like", value, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoNotLike(String value) {
			addCriterion("TEACHER_BOOK_NO not like", value, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoIn(
				List<String> values) {
			addCriterion("TEACHER_BOOK_NO in", values, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoNotIn(
				List<String> values) {
			addCriterion("TEACHER_BOOK_NO not in", values, "teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoBetween(
				String value1, String value2) {
			addCriterion("TEACHER_BOOK_NO between", value1, value2,
					"teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeacherBookNoNotBetween(
				String value1, String value2) {
			addCriterion("TEACHER_BOOK_NO not between", value1, value2,
					"teacherBookNo");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeIsNull() {
			addCriterion("GET_HSKBOOK_GRADE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeIsNotNull() {
			addCriterion("GET_HSKBOOK_GRADE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeEqualTo(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE =", value, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeNotEqualTo(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE <>", value, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeGreaterThan(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE >", value, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeGreaterThanOrEqualTo(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE >=", value, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeLessThan(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE <", value, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeLessThanOrEqualTo(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE <=", value, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeLike(String value) {
			addCriterion("GET_HSKBOOK_GRADE like", value, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeNotLike(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE not like", value, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeIn(
				List<String> values) {
			addCriterion("GET_HSKBOOK_GRADE in", values, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeNotIn(
				List<String> values) {
			addCriterion("GET_HSKBOOK_GRADE not in", values, "getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeBetween(
				String value1, String value2) {
			addCriterion("GET_HSKBOOK_GRADE between", value1, value2,
					"getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetHskbookGradeNotBetween(
				String value1, String value2) {
			addCriterion("GET_HSKBOOK_GRADE not between", value1, value2,
					"getHskbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateIsNull() {
			addCriterion("HSKBOOK_DATE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateIsNotNull() {
			addCriterion("HSKBOOK_DATE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE =", value, "hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE <>", value, "hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE >", value, "hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE >=", value, "hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE <", value, "hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE <=", value, "hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("HSKBOOK_DATE in", values, "hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("HSKBOOK_DATE not in", values,
					"hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("HSKBOOK_DATE between", value1, value2,
					"hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andHskbookDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("HSKBOOK_DATE not between", value1, value2,
					"hskbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeIsNull() {
			addCriterion("GET_MHKBOOK_GRADE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeIsNotNull() {
			addCriterion("GET_MHKBOOK_GRADE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeEqualTo(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE =", value, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeNotEqualTo(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE <>", value, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeGreaterThan(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE >", value, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeGreaterThanOrEqualTo(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE >=", value, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeLessThan(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE <", value, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeLessThanOrEqualTo(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE <=", value, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeLike(String value) {
			addCriterion("GET_MHKBOOK_GRADE like", value, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeNotLike(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE not like", value, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeIn(
				List<String> values) {
			addCriterion("GET_MHKBOOK_GRADE in", values, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeNotIn(
				List<String> values) {
			addCriterion("GET_MHKBOOK_GRADE not in", values, "getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeBetween(
				String value1, String value2) {
			addCriterion("GET_MHKBOOK_GRADE between", value1, value2,
					"getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andGetMhkbookGradeNotBetween(
				String value1, String value2) {
			addCriterion("GET_MHKBOOK_GRADE not between", value1, value2,
					"getMhkbookGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateIsNull() {
			addCriterion("MHKBOOK_DATE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateIsNotNull() {
			addCriterion("MHKBOOK_DATE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE =", value, "mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE <>", value, "mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE >", value, "mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE >=", value, "mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE <", value, "mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE <=", value, "mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("MHKBOOK_DATE in", values, "mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("MHKBOOK_DATE not in", values,
					"mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("MHKBOOK_DATE between", value1, value2,
					"mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andMhkbookDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("MHKBOOK_DATE not between", value1, value2,
					"mhkbookDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelIsNull() {
			addCriterion("PUTONGHUA_LEVEL is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelIsNotNull() {
			addCriterion("PUTONGHUA_LEVEL is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelEqualTo(String value) {
			addCriterion("PUTONGHUA_LEVEL =", value, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelNotEqualTo(
				String value) {
			addCriterion("PUTONGHUA_LEVEL <>", value, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelGreaterThan(
				String value) {
			addCriterion("PUTONGHUA_LEVEL >", value, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelGreaterThanOrEqualTo(
				String value) {
			addCriterion("PUTONGHUA_LEVEL >=", value, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelLessThan(
				String value) {
			addCriterion("PUTONGHUA_LEVEL <", value, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelLessThanOrEqualTo(
				String value) {
			addCriterion("PUTONGHUA_LEVEL <=", value, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelLike(String value) {
			addCriterion("PUTONGHUA_LEVEL like", value, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelNotLike(String value) {
			addCriterion("PUTONGHUA_LEVEL not like", value, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelIn(
				List<String> values) {
			addCriterion("PUTONGHUA_LEVEL in", values, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelNotIn(
				List<String> values) {
			addCriterion("PUTONGHUA_LEVEL not in", values, "putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelBetween(
				String value1, String value2) {
			addCriterion("PUTONGHUA_LEVEL between", value1, value2,
					"putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaLevelNotBetween(
				String value1, String value2) {
			addCriterion("PUTONGHUA_LEVEL not between", value1, value2,
					"putonghuaLevel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateIsNull() {
			addCriterion("PUTONGHUA_DATE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateIsNotNull() {
			addCriterion("PUTONGHUA_DATE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE =", value, "putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE <>", value, "putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE >", value, "putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE >=", value, "putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE <", value, "putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE <=", value, "putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("PUTONGHUA_DATE in", values,
					"putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("PUTONGHUA_DATE not in", values,
					"putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("PUTONGHUA_DATE between", value1, value2,
					"putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPutonghuaDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("PUTONGHUA_DATE not between", value1,
					value2, "putonghuaDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateIsNull() {
			addCriterion("START_TEACHING_DATE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateIsNotNull() {
			addCriterion("START_TEACHING_DATE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE =", value,
					"startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE <>", value,
					"startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE >", value,
					"startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE >=", value,
					"startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE <", value,
					"startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE <=", value,
					"startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("START_TEACHING_DATE in", values,
					"startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("START_TEACHING_DATE not in", values,
					"startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("START_TEACHING_DATE between", value1,
					value2, "startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStartTeachingDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("START_TEACHING_DATE not between", value1,
					value2, "startTeachingDate");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalIsNull() {
			addCriterion("POST_EMEPLOY_TECHNICAL is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalIsNotNull() {
			addCriterion("POST_EMEPLOY_TECHNICAL is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalEqualTo(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL =", value,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalNotEqualTo(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL <>", value,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalGreaterThan(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL >", value,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalGreaterThanOrEqualTo(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL >=", value,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalLessThan(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL <", value,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalLessThanOrEqualTo(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL <=", value,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalLike(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL like", value,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalNotLike(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL not like", value,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalIn(
				List<String> values) {
			addCriterion("POST_EMEPLOY_TECHNICAL in", values,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalNotIn(
				List<String> values) {
			addCriterion("POST_EMEPLOY_TECHNICAL not in", values,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalBetween(
				String value1, String value2) {
			addCriterion("POST_EMEPLOY_TECHNICAL between", value1, value2,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andPostEmeployTechnicalNotBetween(
				String value1, String value2) {
			addCriterion("POST_EMEPLOY_TECHNICAL not between", value1, value2,
					"postEmeployTechnical");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostIsNull() {
			addCriterion("PROFESSIONAL_POST is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostIsNotNull() {
			addCriterion("PROFESSIONAL_POST is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostEqualTo(
				String value) {
			addCriterion("PROFESSIONAL_POST =", value, "professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostNotEqualTo(
				String value) {
			addCriterion("PROFESSIONAL_POST <>", value, "professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostGreaterThan(
				String value) {
			addCriterion("PROFESSIONAL_POST >", value, "professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostGreaterThanOrEqualTo(
				String value) {
			addCriterion("PROFESSIONAL_POST >=", value, "professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostLessThan(
				String value) {
			addCriterion("PROFESSIONAL_POST <", value, "professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostLessThanOrEqualTo(
				String value) {
			addCriterion("PROFESSIONAL_POST <=", value, "professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostLike(String value) {
			addCriterion("PROFESSIONAL_POST like", value, "professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostNotLike(
				String value) {
			addCriterion("PROFESSIONAL_POST not like", value,
					"professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostIn(
				List<String> values) {
			addCriterion("PROFESSIONAL_POST in", values, "professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostNotIn(
				List<String> values) {
			addCriterion("PROFESSIONAL_POST not in", values, "professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostBetween(
				String value1, String value2) {
			addCriterion("PROFESSIONAL_POST between", value1, value2,
					"professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andProfessionalPostNotBetween(
				String value1, String value2) {
			addCriterion("PROFESSIONAL_POST not between", value1, value2,
					"professionalPost");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionIsNull() {
			addCriterion("TEACHING_SECTION is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionIsNotNull() {
			addCriterion("TEACHING_SECTION is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionEqualTo(
				String value) {
			addCriterion("TEACHING_SECTION =", value, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionNotEqualTo(
				String value) {
			addCriterion("TEACHING_SECTION <>", value, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionGreaterThan(
				String value) {
			addCriterion("TEACHING_SECTION >", value, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_SECTION >=", value, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionLessThan(
				String value) {
			addCriterion("TEACHING_SECTION <", value, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_SECTION <=", value, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionLike(String value) {
			addCriterion("TEACHING_SECTION like", value, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionNotLike(
				String value) {
			addCriterion("TEACHING_SECTION not like", value, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionIn(
				List<String> values) {
			addCriterion("TEACHING_SECTION in", values, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionNotIn(
				List<String> values) {
			addCriterion("TEACHING_SECTION not in", values, "teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionBetween(
				String value1, String value2) {
			addCriterion("TEACHING_SECTION between", value1, value2,
					"teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSectionNotBetween(
				String value1, String value2) {
			addCriterion("TEACHING_SECTION not between", value1, value2,
					"teachingSection");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeIsNull() {
			addCriterion("TEACHING_GRADE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeIsNotNull() {
			addCriterion("TEACHING_GRADE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeEqualTo(String value) {
			addCriterion("TEACHING_GRADE =", value, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeNotEqualTo(
				String value) {
			addCriterion("TEACHING_GRADE <>", value, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeGreaterThan(
				String value) {
			addCriterion("TEACHING_GRADE >", value, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_GRADE >=", value, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeLessThan(String value) {
			addCriterion("TEACHING_GRADE <", value, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_GRADE <=", value, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeLike(String value) {
			addCriterion("TEACHING_GRADE like", value, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeNotLike(String value) {
			addCriterion("TEACHING_GRADE not like", value, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeIn(
				List<String> values) {
			addCriterion("TEACHING_GRADE in", values, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeNotIn(
				List<String> values) {
			addCriterion("TEACHING_GRADE not in", values, "teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeBetween(
				String value1, String value2) {
			addCriterion("TEACHING_GRADE between", value1, value2,
					"teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingGradeNotBetween(
				String value1, String value2) {
			addCriterion("TEACHING_GRADE not between", value1, value2,
					"teachingGrade");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectIsNull() {
			addCriterion("TEACHING_SUBJECT is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectIsNotNull() {
			addCriterion("TEACHING_SUBJECT is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectEqualTo(
				String value) {
			addCriterion("TEACHING_SUBJECT =", value, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectNotEqualTo(
				String value) {
			addCriterion("TEACHING_SUBJECT <>", value, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectGreaterThan(
				String value) {
			addCriterion("TEACHING_SUBJECT >", value, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_SUBJECT >=", value, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectLessThan(
				String value) {
			addCriterion("TEACHING_SUBJECT <", value, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_SUBJECT <=", value, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectLike(String value) {
			addCriterion("TEACHING_SUBJECT like", value, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectNotLike(
				String value) {
			addCriterion("TEACHING_SUBJECT not like", value, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectIn(
				List<String> values) {
			addCriterion("TEACHING_SUBJECT in", values, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectNotIn(
				List<String> values) {
			addCriterion("TEACHING_SUBJECT not in", values, "teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectBetween(
				String value1, String value2) {
			addCriterion("TEACHING_SUBJECT between", value1, value2,
					"teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachingSubjectNotBetween(
				String value1, String value2) {
			addCriterion("TEACHING_SUBJECT not between", value1, value2,
					"teachingSubject");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionIsNull() {
			addCriterion("NOTEACH_REASION is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionIsNotNull() {
			addCriterion("NOTEACH_REASION is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionEqualTo(String value) {
			addCriterion("NOTEACH_REASION =", value, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionNotEqualTo(
				String value) {
			addCriterion("NOTEACH_REASION <>", value, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionGreaterThan(
				String value) {
			addCriterion("NOTEACH_REASION >", value, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionGreaterThanOrEqualTo(
				String value) {
			addCriterion("NOTEACH_REASION >=", value, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionLessThan(
				String value) {
			addCriterion("NOTEACH_REASION <", value, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionLessThanOrEqualTo(
				String value) {
			addCriterion("NOTEACH_REASION <=", value, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionLike(String value) {
			addCriterion("NOTEACH_REASION like", value, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionNotLike(String value) {
			addCriterion("NOTEACH_REASION not like", value, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionIn(
				List<String> values) {
			addCriterion("NOTEACH_REASION in", values, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionNotIn(
				List<String> values) {
			addCriterion("NOTEACH_REASION not in", values, "noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionBetween(
				String value1, String value2) {
			addCriterion("NOTEACH_REASION between", value1, value2,
					"noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andNoteachReasionNotBetween(
				String value1, String value2) {
			addCriterion("NOTEACH_REASION not between", value1, value2,
					"noteachReasion");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageIsNull() {
			addCriterion("TEACH_LANGUAGE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageIsNotNull() {
			addCriterion("TEACH_LANGUAGE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageEqualTo(String value) {
			addCriterion("TEACH_LANGUAGE =", value, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageNotEqualTo(
				String value) {
			addCriterion("TEACH_LANGUAGE <>", value, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageGreaterThan(
				String value) {
			addCriterion("TEACH_LANGUAGE >", value, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACH_LANGUAGE >=", value, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageLessThan(String value) {
			addCriterion("TEACH_LANGUAGE <", value, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageLessThanOrEqualTo(
				String value) {
			addCriterion("TEACH_LANGUAGE <=", value, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageLike(String value) {
			addCriterion("TEACH_LANGUAGE like", value, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageNotLike(String value) {
			addCriterion("TEACH_LANGUAGE not like", value, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageIn(
				List<String> values) {
			addCriterion("TEACH_LANGUAGE in", values, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageNotIn(
				List<String> values) {
			addCriterion("TEACH_LANGUAGE not in", values, "teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageBetween(
				String value1, String value2) {
			addCriterion("TEACH_LANGUAGE between", value1, value2,
					"teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andTeachLanguageNotBetween(
				String value1, String value2) {
			addCriterion("TEACH_LANGUAGE not between", value1, value2,
					"teachLanguage");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherIsNull() {
			addCriterion("IS_NATIONTEACHER is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherIsNotNull() {
			addCriterion("IS_NATIONTEACHER is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherEqualTo(
				String value) {
			addCriterion("IS_NATIONTEACHER =", value, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherNotEqualTo(
				String value) {
			addCriterion("IS_NATIONTEACHER <>", value, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherGreaterThan(
				String value) {
			addCriterion("IS_NATIONTEACHER >", value, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_NATIONTEACHER >=", value, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherLessThan(
				String value) {
			addCriterion("IS_NATIONTEACHER <", value, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_NATIONTEACHER <=", value, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherLike(String value) {
			addCriterion("IS_NATIONTEACHER like", value, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherNotLike(
				String value) {
			addCriterion("IS_NATIONTEACHER not like", value, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherIn(
				List<String> values) {
			addCriterion("IS_NATIONTEACHER in", values, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherNotIn(
				List<String> values) {
			addCriterion("IS_NATIONTEACHER not in", values, "isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherBetween(
				String value1, String value2) {
			addCriterion("IS_NATIONTEACHER between", value1, value2,
					"isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsNationteacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_NATIONTEACHER not between", value1, value2,
					"isNationteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherIsNull() {
			addCriterion("IS_CHINESETEACHER is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherIsNotNull() {
			addCriterion("IS_CHINESETEACHER is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherEqualTo(
				String value) {
			addCriterion("IS_CHINESETEACHER =", value, "isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherNotEqualTo(
				String value) {
			addCriterion("IS_CHINESETEACHER <>", value, "isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherGreaterThan(
				String value) {
			addCriterion("IS_CHINESETEACHER >", value, "isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_CHINESETEACHER >=", value, "isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherLessThan(
				String value) {
			addCriterion("IS_CHINESETEACHER <", value, "isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_CHINESETEACHER <=", value, "isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherLike(String value) {
			addCriterion("IS_CHINESETEACHER like", value, "isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherNotLike(
				String value) {
			addCriterion("IS_CHINESETEACHER not like", value,
					"isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherIn(
				List<String> values) {
			addCriterion("IS_CHINESETEACHER in", values, "isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherNotIn(
				List<String> values) {
			addCriterion("IS_CHINESETEACHER not in", values, "isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherBetween(
				String value1, String value2) {
			addCriterion("IS_CHINESETEACHER between", value1, value2,
					"isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsChineseteacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_CHINESETEACHER not between", value1, value2,
					"isChineseteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherIsNull() {
			addCriterion("IS_DOUBLETEACHER is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherIsNotNull() {
			addCriterion("IS_DOUBLETEACHER is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherEqualTo(
				String value) {
			addCriterion("IS_DOUBLETEACHER =", value, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherNotEqualTo(
				String value) {
			addCriterion("IS_DOUBLETEACHER <>", value, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherGreaterThan(
				String value) {
			addCriterion("IS_DOUBLETEACHER >", value, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_DOUBLETEACHER >=", value, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherLessThan(
				String value) {
			addCriterion("IS_DOUBLETEACHER <", value, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_DOUBLETEACHER <=", value, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherLike(String value) {
			addCriterion("IS_DOUBLETEACHER like", value, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherNotLike(
				String value) {
			addCriterion("IS_DOUBLETEACHER not like", value, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherIn(
				List<String> values) {
			addCriterion("IS_DOUBLETEACHER in", values, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherNotIn(
				List<String> values) {
			addCriterion("IS_DOUBLETEACHER not in", values, "isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherBetween(
				String value1, String value2) {
			addCriterion("IS_DOUBLETEACHER between", value1, value2,
					"isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsDoubleteacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_DOUBLETEACHER not between", value1, value2,
					"isDoubleteacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelIsNull() {
			addCriterion("DOUBLE_TEACH_MODEL is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelIsNotNull() {
			addCriterion("DOUBLE_TEACH_MODEL is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelEqualTo(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL =", value, "doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelNotEqualTo(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL <>", value, "doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelGreaterThan(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL >", value, "doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelGreaterThanOrEqualTo(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL >=", value, "doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelLessThan(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL <", value, "doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelLessThanOrEqualTo(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL <=", value, "doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelLike(String value) {
			addCriterion("DOUBLE_TEACH_MODEL like", value, "doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelNotLike(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL not like", value,
					"doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelIn(
				List<String> values) {
			addCriterion("DOUBLE_TEACH_MODEL in", values, "doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelNotIn(
				List<String> values) {
			addCriterion("DOUBLE_TEACH_MODEL not in", values,
					"doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelBetween(
				String value1, String value2) {
			addCriterion("DOUBLE_TEACH_MODEL between", value1, value2,
					"doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andDoubleTeachModelNotBetween(
				String value1, String value2) {
			addCriterion("DOUBLE_TEACH_MODEL not between", value1, value2,
					"doubleTeachModel");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityIsNull() {
			addCriterion("IS_ABILITY is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityIsNotNull() {
			addCriterion("IS_ABILITY is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityEqualTo(String value) {
			addCriterion("IS_ABILITY =", value, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityNotEqualTo(String value) {
			addCriterion("IS_ABILITY <>", value, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityGreaterThan(String value) {
			addCriterion("IS_ABILITY >", value, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_ABILITY >=", value, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityLessThan(String value) {
			addCriterion("IS_ABILITY <", value, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityLessThanOrEqualTo(
				String value) {
			addCriterion("IS_ABILITY <=", value, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityLike(String value) {
			addCriterion("IS_ABILITY like", value, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityNotLike(String value) {
			addCriterion("IS_ABILITY not like", value, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityIn(List<String> values) {
			addCriterion("IS_ABILITY in", values, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityNotIn(List<String> values) {
			addCriterion("IS_ABILITY not in", values, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityBetween(String value1,
				String value2) {
			addCriterion("IS_ABILITY between", value1, value2, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsAbilityNotBetween(
				String value1, String value2) {
			addCriterion("IS_ABILITY not between", value1, value2, "isAbility");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherIsNull() {
			addCriterion("IS_ETHNIC_TEACHER is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherIsNotNull() {
			addCriterion("IS_ETHNIC_TEACHER is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherEqualTo(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER =", value, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherNotEqualTo(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER <>", value, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherGreaterThan(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER >", value, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER >=", value, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherLessThan(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER <", value, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER <=", value, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherLike(String value) {
			addCriterion("IS_ETHNIC_TEACHER like", value, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherNotLike(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER not like", value, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherIn(
				List<String> values) {
			addCriterion("IS_ETHNIC_TEACHER in", values, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherNotIn(
				List<String> values) {
			addCriterion("IS_ETHNIC_TEACHER not in", values, "isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherBetween(
				String value1, String value2) {
			addCriterion("IS_ETHNIC_TEACHER between", value1, value2,
					"isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsEthnicTeacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_ETHNIC_TEACHER not between", value1, value2,
					"isEthnicTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherIsNull() {
			addCriterion("IS_SPECIAL_TEACHER is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherIsNotNull() {
			addCriterion("IS_SPECIAL_TEACHER is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TEACHER =", value, "isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherNotEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TEACHER <>", value, "isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherGreaterThan(
				String value) {
			addCriterion("IS_SPECIAL_TEACHER >", value, "isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TEACHER >=", value, "isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherLessThan(
				String value) {
			addCriterion("IS_SPECIAL_TEACHER <", value, "isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TEACHER <=", value, "isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherLike(String value) {
			addCriterion("IS_SPECIAL_TEACHER like", value, "isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherNotLike(
				String value) {
			addCriterion("IS_SPECIAL_TEACHER not like", value,
					"isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherIn(
				List<String> values) {
			addCriterion("IS_SPECIAL_TEACHER in", values, "isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherNotIn(
				List<String> values) {
			addCriterion("IS_SPECIAL_TEACHER not in", values,
					"isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIAL_TEACHER between", value1, value2,
					"isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTeacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIAL_TEACHER not between", value1, value2,
					"isSpecialTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainIsNull() {
			addCriterion("IS_SPECIAL_TRAIN is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainIsNotNull() {
			addCriterion("IS_SPECIAL_TRAIN is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainEqualTo(String value) {
			addCriterion("IS_SPECIAL_TRAIN =", value, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainNotEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN <>", value, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainGreaterThan(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN >", value, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN >=", value, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainLessThan(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN <", value, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainLessThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN <=", value, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainLike(String value) {
			addCriterion("IS_SPECIAL_TRAIN like", value, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainNotLike(String value) {
			addCriterion("IS_SPECIAL_TRAIN not like", value, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainIn(
				List<String> values) {
			addCriterion("IS_SPECIAL_TRAIN in", values, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainNotIn(
				List<String> values) {
			addCriterion("IS_SPECIAL_TRAIN not in", values, "isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIAL_TRAIN between", value1, value2,
					"isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsSpecialTrainNotBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIAL_TRAIN not between", value1, value2,
					"isSpecialTrain");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationIsNull() {
			addCriterion("SITUATION is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationIsNotNull() {
			addCriterion("SITUATION is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationEqualTo(String value) {
			addCriterion("SITUATION =", value, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationNotEqualTo(String value) {
			addCriterion("SITUATION <>", value, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationGreaterThan(String value) {
			addCriterion("SITUATION >", value, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationGreaterThanOrEqualTo(
				String value) {
			addCriterion("SITUATION >=", value, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationLessThan(String value) {
			addCriterion("SITUATION <", value, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationLessThanOrEqualTo(
				String value) {
			addCriterion("SITUATION <=", value, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationLike(String value) {
			addCriterion("SITUATION like", value, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationNotLike(String value) {
			addCriterion("SITUATION not like", value, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationIn(List<String> values) {
			addCriterion("SITUATION in", values, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationNotIn(List<String> values) {
			addCriterion("SITUATION not in", values, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationBetween(String value1,
				String value2) {
			addCriterion("SITUATION between", value1, value2, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andSituationNotBetween(
				String value1, String value2) {
			addCriterion("SITUATION not between", value1, value2, "situation");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherIsNull() {
			addCriterion("IS_BACKONE_TEACHER is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherIsNotNull() {
			addCriterion("IS_BACKONE_TEACHER is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherEqualTo(
				String value) {
			addCriterion("IS_BACKONE_TEACHER =", value, "isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherNotEqualTo(
				String value) {
			addCriterion("IS_BACKONE_TEACHER <>", value, "isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherGreaterThan(
				String value) {
			addCriterion("IS_BACKONE_TEACHER >", value, "isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_BACKONE_TEACHER >=", value, "isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherLessThan(
				String value) {
			addCriterion("IS_BACKONE_TEACHER <", value, "isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_BACKONE_TEACHER <=", value, "isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherLike(String value) {
			addCriterion("IS_BACKONE_TEACHER like", value, "isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherNotLike(
				String value) {
			addCriterion("IS_BACKONE_TEACHER not like", value,
					"isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherIn(
				List<String> values) {
			addCriterion("IS_BACKONE_TEACHER in", values, "isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherNotIn(
				List<String> values) {
			addCriterion("IS_BACKONE_TEACHER not in", values,
					"isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherBetween(
				String value1, String value2) {
			addCriterion("IS_BACKONE_TEACHER between", value1, value2,
					"isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andIsBackoneTeacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_BACKONE_TEACHER not between", value1, value2,
					"isBackoneTeacher");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseIsNull() {
			addCriterion("STAFF_INCREASE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseIsNotNull() {
			addCriterion("STAFF_INCREASE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseEqualTo(String value) {
			addCriterion("STAFF_INCREASE =", value, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseNotEqualTo(
				String value) {
			addCriterion("STAFF_INCREASE <>", value, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseGreaterThan(
				String value) {
			addCriterion("STAFF_INCREASE >", value, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseGreaterThanOrEqualTo(
				String value) {
			addCriterion("STAFF_INCREASE >=", value, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseLessThan(String value) {
			addCriterion("STAFF_INCREASE <", value, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseLessThanOrEqualTo(
				String value) {
			addCriterion("STAFF_INCREASE <=", value, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseLike(String value) {
			addCriterion("STAFF_INCREASE like", value, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseNotLike(String value) {
			addCriterion("STAFF_INCREASE not like", value, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseIn(
				List<String> values) {
			addCriterion("STAFF_INCREASE in", values, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseNotIn(
				List<String> values) {
			addCriterion("STAFF_INCREASE not in", values, "staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseBetween(
				String value1, String value2) {
			addCriterion("STAFF_INCREASE between", value1, value2,
					"staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffIncreaseNotBetween(
				String value1, String value2) {
			addCriterion("STAFF_INCREASE not between", value1, value2,
					"staffIncrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseIsNull() {
			addCriterion("STAFF_DECREASE is null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseIsNotNull() {
			addCriterion("STAFF_DECREASE is not null");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseEqualTo(String value) {
			addCriterion("STAFF_DECREASE =", value, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseNotEqualTo(
				String value) {
			addCriterion("STAFF_DECREASE <>", value, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseGreaterThan(
				String value) {
			addCriterion("STAFF_DECREASE >", value, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseGreaterThanOrEqualTo(
				String value) {
			addCriterion("STAFF_DECREASE >=", value, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseLessThan(String value) {
			addCriterion("STAFF_DECREASE <", value, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseLessThanOrEqualTo(
				String value) {
			addCriterion("STAFF_DECREASE <=", value, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseLike(String value) {
			addCriterion("STAFF_DECREASE like", value, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseNotLike(String value) {
			addCriterion("STAFF_DECREASE not like", value, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseIn(
				List<String> values) {
			addCriterion("STAFF_DECREASE in", values, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseNotIn(
				List<String> values) {
			addCriterion("STAFF_DECREASE not in", values, "staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseBetween(
				String value1, String value2) {
			addCriterion("STAFF_DECREASE between", value1, value2,
					"staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}

		public TeacherInfoExample.Criteria andStaffDecreaseNotBetween(
				String value1, String value2) {
			addCriterion("STAFF_DECREASE not between", value1, value2,
					"staffDecrease");
			return (TeacherInfoExample.Criteria) this;
		}
	}
}