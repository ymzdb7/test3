package com.myoa.model.edu.schoolRollInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SchoolRollInfoExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public SchoolRollInfoExample() {
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
			SchoolRollInfoExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<SchoolRollInfoExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<SchoolRollInfoExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<SchoolRollInfoExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new SchoolRollInfoExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new SchoolRollInfoExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new SchoolRollInfoExample.Criterion(condition,
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

		public SchoolRollInfoExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ID >=", value, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("ID <=", value, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdBetween(Integer value1,
				Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeIsNull() {
			addCriterion("SCHOOL_CODE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeIsNotNull() {
			addCriterion("SCHOOL_CODE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeEqualTo(String value) {
			addCriterion("SCHOOL_CODE =", value, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeNotEqualTo(
				String value) {
			addCriterion("SCHOOL_CODE <>", value, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeGreaterThan(
				String value) {
			addCriterion("SCHOOL_CODE >", value, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeGreaterThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_CODE >=", value, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeLessThan(String value) {
			addCriterion("SCHOOL_CODE <", value, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeLessThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_CODE <=", value, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeLike(String value) {
			addCriterion("SCHOOL_CODE like", value, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeNotLike(String value) {
			addCriterion("SCHOOL_CODE not like", value, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeIn(
				List<String> values) {
			addCriterion("SCHOOL_CODE in", values, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeNotIn(
				List<String> values) {
			addCriterion("SCHOOL_CODE not in", values, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_CODE between", value1, value2, "schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolCodeNotBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_CODE not between", value1, value2,
					"schoolCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameIsNull() {
			addCriterion("SCHOOL_NAME is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameIsNotNull() {
			addCriterion("SCHOOL_NAME is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameEqualTo(String value) {
			addCriterion("SCHOOL_NAME =", value, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameNotEqualTo(
				String value) {
			addCriterion("SCHOOL_NAME <>", value, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameGreaterThan(
				String value) {
			addCriterion("SCHOOL_NAME >", value, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_NAME >=", value, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameLessThan(String value) {
			addCriterion("SCHOOL_NAME <", value, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameLessThanOrEqualTo(
				String value) {
			addCriterion("SCHOOL_NAME <=", value, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameLike(String value) {
			addCriterion("SCHOOL_NAME like", value, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameNotLike(String value) {
			addCriterion("SCHOOL_NAME not like", value, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameIn(
				List<String> values) {
			addCriterion("SCHOOL_NAME in", values, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameNotIn(
				List<String> values) {
			addCriterion("SCHOOL_NAME not in", values, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_NAME between", value1, value2, "schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSchoolNameNotBetween(
				String value1, String value2) {
			addCriterion("SCHOOL_NAME not between", value1, value2,
					"schoolName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("NAME >=", value, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameLessThanOrEqualTo(
				String value) {
			addCriterion("NAME <=", value, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameBetween(String value1,
				String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNameNotBetween(String value1,
				String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexIsNull() {
			addCriterion("SEX is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexIsNotNull() {
			addCriterion("SEX is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexEqualTo(String value) {
			addCriterion("SEX =", value, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexNotEqualTo(String value) {
			addCriterion("SEX <>", value, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexGreaterThan(String value) {
			addCriterion("SEX >", value, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexGreaterThanOrEqualTo(
				String value) {
			addCriterion("SEX >=", value, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexLessThan(String value) {
			addCriterion("SEX <", value, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexLessThanOrEqualTo(
				String value) {
			addCriterion("SEX <=", value, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexLike(String value) {
			addCriterion("SEX like", value, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexNotLike(String value) {
			addCriterion("SEX not like", value, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexIn(List<String> values) {
			addCriterion("SEX in", values, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexNotIn(List<String> values) {
			addCriterion("SEX not in", values, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexBetween(String value1,
				String value2) {
			addCriterion("SEX between", value1, value2, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSexNotBetween(String value1,
				String value2) {
			addCriterion("SEX not between", value1, value2, "sex");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithIsNull() {
			addCriterion("BRITH is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithIsNotNull() {
			addCriterion("BRITH is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BRITH =", value, "brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BRITH <>", value, "brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("BRITH >", value, "brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BRITH >=", value, "brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("BRITH <", value, "brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BRITH <=", value, "brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BRITH in", values, "brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BRITH not in", values, "brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BRITH between", value1, value2, "brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBrithNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BRITH not between", value1, value2,
					"brith");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoIsNull() {
			addCriterion("DISTRICT_NO is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoIsNotNull() {
			addCriterion("DISTRICT_NO is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoEqualTo(String value) {
			addCriterion("DISTRICT_NO =", value, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoNotEqualTo(
				String value) {
			addCriterion("DISTRICT_NO <>", value, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoGreaterThan(
				String value) {
			addCriterion("DISTRICT_NO >", value, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoGreaterThanOrEqualTo(
				String value) {
			addCriterion("DISTRICT_NO >=", value, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoLessThan(String value) {
			addCriterion("DISTRICT_NO <", value, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoLessThanOrEqualTo(
				String value) {
			addCriterion("DISTRICT_NO <=", value, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoLike(String value) {
			addCriterion("DISTRICT_NO like", value, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoNotLike(String value) {
			addCriterion("DISTRICT_NO not like", value, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoIn(
				List<String> values) {
			addCriterion("DISTRICT_NO in", values, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoNotIn(
				List<String> values) {
			addCriterion("DISTRICT_NO not in", values, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoBetween(
				String value1, String value2) {
			addCriterion("DISTRICT_NO between", value1, value2, "districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDistrictNoNotBetween(
				String value1, String value2) {
			addCriterion("DISTRICT_NO not between", value1, value2,
					"districtNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginIsNull() {
			addCriterion("ORIGIN is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginIsNotNull() {
			addCriterion("ORIGIN is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginEqualTo(String value) {
			addCriterion("ORIGIN =", value, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginNotEqualTo(String value) {
			addCriterion("ORIGIN <>", value, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginGreaterThan(String value) {
			addCriterion("ORIGIN >", value, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginGreaterThanOrEqualTo(
				String value) {
			addCriterion("ORIGIN >=", value, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginLessThan(String value) {
			addCriterion("ORIGIN <", value, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginLessThanOrEqualTo(
				String value) {
			addCriterion("ORIGIN <=", value, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginLike(String value) {
			addCriterion("ORIGIN like", value, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginNotLike(String value) {
			addCriterion("ORIGIN not like", value, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginIn(List<String> values) {
			addCriterion("ORIGIN in", values, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginNotIn(List<String> values) {
			addCriterion("ORIGIN not in", values, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginBetween(String value1,
				String value2) {
			addCriterion("ORIGIN between", value1, value2, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOriginNotBetween(
				String value1, String value2) {
			addCriterion("ORIGIN not between", value1, value2, "origin");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationIsNull() {
			addCriterion("NATION is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationIsNotNull() {
			addCriterion("NATION is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationEqualTo(String value) {
			addCriterion("NATION =", value, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationNotEqualTo(String value) {
			addCriterion("NATION <>", value, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationGreaterThan(String value) {
			addCriterion("NATION >", value, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationGreaterThanOrEqualTo(
				String value) {
			addCriterion("NATION >=", value, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationLessThan(String value) {
			addCriterion("NATION <", value, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationLessThanOrEqualTo(
				String value) {
			addCriterion("NATION <=", value, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationLike(String value) {
			addCriterion("NATION like", value, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationNotLike(String value) {
			addCriterion("NATION not like", value, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationIn(List<String> values) {
			addCriterion("NATION in", values, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationNotIn(List<String> values) {
			addCriterion("NATION not in", values, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationBetween(String value1,
				String value2) {
			addCriterion("NATION between", value1, value2, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationNotBetween(
				String value1, String value2) {
			addCriterion("NATION not between", value1, value2, "nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityIsNull() {
			addCriterion("NATIONALITY is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityIsNotNull() {
			addCriterion("NATIONALITY is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityEqualTo(String value) {
			addCriterion("NATIONALITY =", value, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityNotEqualTo(
				String value) {
			addCriterion("NATIONALITY <>", value, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityGreaterThan(
				String value) {
			addCriterion("NATIONALITY >", value, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityGreaterThanOrEqualTo(
				String value) {
			addCriterion("NATIONALITY >=", value, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityLessThan(
				String value) {
			addCriterion("NATIONALITY <", value, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityLessThanOrEqualTo(
				String value) {
			addCriterion("NATIONALITY <=", value, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityLike(String value) {
			addCriterion("NATIONALITY like", value, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityNotLike(String value) {
			addCriterion("NATIONALITY not like", value, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityIn(
				List<String> values) {
			addCriterion("NATIONALITY in", values, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityNotIn(
				List<String> values) {
			addCriterion("NATIONALITY not in", values, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityBetween(
				String value1, String value2) {
			addCriterion("NATIONALITY between", value1, value2, "nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andNationalityNotBetween(
				String value1, String value2) {
			addCriterion("NATIONALITY not between", value1, value2,
					"nationality");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeIsNull() {
			addCriterion("CARD_TYPE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeIsNotNull() {
			addCriterion("CARD_TYPE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeEqualTo(String value) {
			addCriterion("CARD_TYPE =", value, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeNotEqualTo(String value) {
			addCriterion("CARD_TYPE <>", value, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeGreaterThan(
				String value) {
			addCriterion("CARD_TYPE >", value, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("CARD_TYPE >=", value, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeLessThan(String value) {
			addCriterion("CARD_TYPE <", value, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeLessThanOrEqualTo(
				String value) {
			addCriterion("CARD_TYPE <=", value, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeLike(String value) {
			addCriterion("CARD_TYPE like", value, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeNotLike(String value) {
			addCriterion("CARD_TYPE not like", value, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeIn(List<String> values) {
			addCriterion("CARD_TYPE in", values, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeNotIn(
				List<String> values) {
			addCriterion("CARD_TYPE not in", values, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeBetween(String value1,
				String value2) {
			addCriterion("CARD_TYPE between", value1, value2, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardTypeNotBetween(
				String value1, String value2) {
			addCriterion("CARD_TYPE not between", value1, value2, "cardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionIsNull() {
			addCriterion("REGION is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionIsNotNull() {
			addCriterion("REGION is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionEqualTo(String value) {
			addCriterion("REGION =", value, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionNotEqualTo(String value) {
			addCriterion("REGION <>", value, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionGreaterThan(String value) {
			addCriterion("REGION >", value, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionGreaterThanOrEqualTo(
				String value) {
			addCriterion("REGION >=", value, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionLessThan(String value) {
			addCriterion("REGION <", value, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionLessThanOrEqualTo(
				String value) {
			addCriterion("REGION <=", value, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionLike(String value) {
			addCriterion("REGION like", value, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionNotLike(String value) {
			addCriterion("REGION not like", value, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionIn(List<String> values) {
			addCriterion("REGION in", values, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionNotIn(List<String> values) {
			addCriterion("REGION not in", values, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionBetween(String value1,
				String value2) {
			addCriterion("REGION between", value1, value2, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegionNotBetween(
				String value1, String value2) {
			addCriterion("REGION not between", value1, value2, "region");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthIsNull() {
			addCriterion("HEALTH is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthIsNotNull() {
			addCriterion("HEALTH is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthEqualTo(String value) {
			addCriterion("HEALTH =", value, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthNotEqualTo(String value) {
			addCriterion("HEALTH <>", value, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthGreaterThan(String value) {
			addCriterion("HEALTH >", value, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthGreaterThanOrEqualTo(
				String value) {
			addCriterion("HEALTH >=", value, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthLessThan(String value) {
			addCriterion("HEALTH <", value, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthLessThanOrEqualTo(
				String value) {
			addCriterion("HEALTH <=", value, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthLike(String value) {
			addCriterion("HEALTH like", value, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthNotLike(String value) {
			addCriterion("HEALTH not like", value, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthIn(List<String> values) {
			addCriterion("HEALTH in", values, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthNotIn(List<String> values) {
			addCriterion("HEALTH not in", values, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthBetween(String value1,
				String value2) {
			addCriterion("HEALTH between", value1, value2, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHealthNotBetween(
				String value1, String value2) {
			addCriterion("HEALTH not between", value1, value2, "health");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalIsNull() {
			addCriterion("POLITICAL is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalIsNotNull() {
			addCriterion("POLITICAL is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalEqualTo(String value) {
			addCriterion("POLITICAL =", value, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalNotEqualTo(
				String value) {
			addCriterion("POLITICAL <>", value, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalGreaterThan(
				String value) {
			addCriterion("POLITICAL >", value, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalGreaterThanOrEqualTo(
				String value) {
			addCriterion("POLITICAL >=", value, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalLessThan(String value) {
			addCriterion("POLITICAL <", value, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalLessThanOrEqualTo(
				String value) {
			addCriterion("POLITICAL <=", value, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalLike(String value) {
			addCriterion("POLITICAL like", value, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalNotLike(String value) {
			addCriterion("POLITICAL not like", value, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalIn(List<String> values) {
			addCriterion("POLITICAL in", values, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalNotIn(
				List<String> values) {
			addCriterion("POLITICAL not in", values, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalBetween(
				String value1, String value2) {
			addCriterion("POLITICAL between", value1, value2, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPoliticalNotBetween(
				String value1, String value2) {
			addCriterion("POLITICAL not between", value1, value2, "political");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdIsNull() {
			addCriterion("CARD_ID is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdIsNotNull() {
			addCriterion("CARD_ID is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdEqualTo(String value) {
			addCriterion("CARD_ID =", value, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdNotEqualTo(String value) {
			addCriterion("CARD_ID <>", value, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdGreaterThan(String value) {
			addCriterion("CARD_ID >", value, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("CARD_ID >=", value, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdLessThan(String value) {
			addCriterion("CARD_ID <", value, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdLessThanOrEqualTo(
				String value) {
			addCriterion("CARD_ID <=", value, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdLike(String value) {
			addCriterion("CARD_ID like", value, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdNotLike(String value) {
			addCriterion("CARD_ID not like", value, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdIn(List<String> values) {
			addCriterion("CARD_ID in", values, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdNotIn(List<String> values) {
			addCriterion("CARD_ID not in", values, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdBetween(String value1,
				String value2) {
			addCriterion("CARD_ID between", value1, value2, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardIdNotBetween(
				String value1, String value2) {
			addCriterion("CARD_ID not between", value1, value2, "cardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationIsNull() {
			addCriterion("REGISTRATION is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationIsNotNull() {
			addCriterion("REGISTRATION is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationEqualTo(
				String value) {
			addCriterion("REGISTRATION =", value, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationNotEqualTo(
				String value) {
			addCriterion("REGISTRATION <>", value, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationGreaterThan(
				String value) {
			addCriterion("REGISTRATION >", value, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationGreaterThanOrEqualTo(
				String value) {
			addCriterion("REGISTRATION >=", value, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationLessThan(
				String value) {
			addCriterion("REGISTRATION <", value, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationLessThanOrEqualTo(
				String value) {
			addCriterion("REGISTRATION <=", value, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationLike(String value) {
			addCriterion("REGISTRATION like", value, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationNotLike(
				String value) {
			addCriterion("REGISTRATION not like", value, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationIn(
				List<String> values) {
			addCriterion("REGISTRATION in", values, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationNotIn(
				List<String> values) {
			addCriterion("REGISTRATION not in", values, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationBetween(
				String value1, String value2) {
			addCriterion("REGISTRATION between", value1, value2, "registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrationNotBetween(
				String value1, String value2) {
			addCriterion("REGISTRATION not between", value1, value2,
					"registration");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictIsNull() {
			addCriterion("REGISTR_DISTRICT is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictIsNotNull() {
			addCriterion("REGISTR_DISTRICT is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictEqualTo(
				String value) {
			addCriterion("REGISTR_DISTRICT =", value, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictNotEqualTo(
				String value) {
			addCriterion("REGISTR_DISTRICT <>", value, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictGreaterThan(
				String value) {
			addCriterion("REGISTR_DISTRICT >", value, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictGreaterThanOrEqualTo(
				String value) {
			addCriterion("REGISTR_DISTRICT >=", value, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictLessThan(
				String value) {
			addCriterion("REGISTR_DISTRICT <", value, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictLessThanOrEqualTo(
				String value) {
			addCriterion("REGISTR_DISTRICT <=", value, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictLike(
				String value) {
			addCriterion("REGISTR_DISTRICT like", value, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictNotLike(
				String value) {
			addCriterion("REGISTR_DISTRICT not like", value, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictIn(
				List<String> values) {
			addCriterion("REGISTR_DISTRICT in", values, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictNotIn(
				List<String> values) {
			addCriterion("REGISTR_DISTRICT not in", values, "registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictBetween(
				String value1, String value2) {
			addCriterion("REGISTR_DISTRICT between", value1, value2,
					"registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegistrDistrictNotBetween(
				String value1, String value2) {
			addCriterion("REGISTR_DISTRICT not between", value1, value2,
					"registrDistrict");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdIsNull() {
			addCriterion("LEARN_PHASE_ID is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdIsNotNull() {
			addCriterion("LEARN_PHASE_ID is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdEqualTo(
				Integer value) {
			addCriterion("LEARN_PHASE_ID =", value, "learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdNotEqualTo(
				Integer value) {
			addCriterion("LEARN_PHASE_ID <>", value, "learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdGreaterThan(
				Integer value) {
			addCriterion("LEARN_PHASE_ID >", value, "learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("LEARN_PHASE_ID >=", value, "learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdLessThan(
				Integer value) {
			addCriterion("LEARN_PHASE_ID <", value, "learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("LEARN_PHASE_ID <=", value, "learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdIn(
				List<Integer> values) {
			addCriterion("LEARN_PHASE_ID in", values, "learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdNotIn(
				List<Integer> values) {
			addCriterion("LEARN_PHASE_ID not in", values, "learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdBetween(
				Integer value1, Integer value2) {
			addCriterion("LEARN_PHASE_ID between", value1, value2,
					"learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLearnPhaseIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("LEARN_PHASE_ID not between", value1, value2,
					"learnPhaseId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdIsNull() {
			addCriterion("GRADE_ID is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdIsNotNull() {
			addCriterion("GRADE_ID is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdEqualTo(Integer value) {
			addCriterion("GRADE_ID =", value, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdNotEqualTo(Integer value) {
			addCriterion("GRADE_ID <>", value, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdGreaterThan(
				Integer value) {
			addCriterion("GRADE_ID >", value, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("GRADE_ID >=", value, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdLessThan(Integer value) {
			addCriterion("GRADE_ID <", value, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("GRADE_ID <=", value, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdIn(List<Integer> values) {
			addCriterion("GRADE_ID in", values, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdNotIn(
				List<Integer> values) {
			addCriterion("GRADE_ID not in", values, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdBetween(Integer value1,
				Integer value2) {
			addCriterion("GRADE_ID between", value1, value2, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGradeIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("GRADE_ID not between", value1, value2, "gradeId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdIsNull() {
			addCriterion("CLASS_ID is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdIsNotNull() {
			addCriterion("CLASS_ID is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdEqualTo(String value) {
			addCriterion("CLASS_ID =", value, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdNotEqualTo(String value) {
			addCriterion("CLASS_ID <>", value, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdGreaterThan(String value) {
			addCriterion("CLASS_ID >", value, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("CLASS_ID >=", value, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdLessThan(String value) {
			addCriterion("CLASS_ID <", value, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdLessThanOrEqualTo(
				String value) {
			addCriterion("CLASS_ID <=", value, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdLike(String value) {
			addCriterion("CLASS_ID like", value, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdNotLike(String value) {
			addCriterion("CLASS_ID not like", value, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdIn(List<String> values) {
			addCriterion("CLASS_ID in", values, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdNotIn(
				List<String> values) {
			addCriterion("CLASS_ID not in", values, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdBetween(String value1,
				String value2) {
			addCriterion("CLASS_ID between", value1, value2, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andClassIdNotBetween(
				String value1, String value2) {
			addCriterion("CLASS_ID not between", value1, value2, "classId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateIsNull() {
			addCriterion("ENTRANCE_DATE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateIsNotNull() {
			addCriterion("ENTRANCE_DATE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("ENTRANCE_DATE =", value, "entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("ENTRANCE_DATE <>", value, "entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("ENTRANCE_DATE >", value, "entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("ENTRANCE_DATE >=", value, "entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("ENTRANCE_DATE <", value, "entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("ENTRANCE_DATE <=", value, "entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("ENTRANCE_DATE in", values, "entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("ENTRANCE_DATE not in", values,
					"entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("ENTRANCE_DATE between", value1, value2,
					"entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("ENTRANCE_DATE not between", value1,
					value2, "entranceDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayIsNull() {
			addCriterion("ENTRANCE_WAY is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayIsNotNull() {
			addCriterion("ENTRANCE_WAY is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayEqualTo(String value) {
			addCriterion("ENTRANCE_WAY =", value, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayNotEqualTo(
				String value) {
			addCriterion("ENTRANCE_WAY <>", value, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayGreaterThan(
				String value) {
			addCriterion("ENTRANCE_WAY >", value, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayGreaterThanOrEqualTo(
				String value) {
			addCriterion("ENTRANCE_WAY >=", value, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayLessThan(
				String value) {
			addCriterion("ENTRANCE_WAY <", value, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayLessThanOrEqualTo(
				String value) {
			addCriterion("ENTRANCE_WAY <=", value, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayLike(String value) {
			addCriterion("ENTRANCE_WAY like", value, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayNotLike(String value) {
			addCriterion("ENTRANCE_WAY not like", value, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayIn(
				List<String> values) {
			addCriterion("ENTRANCE_WAY in", values, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayNotIn(
				List<String> values) {
			addCriterion("ENTRANCE_WAY not in", values, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayBetween(
				String value1, String value2) {
			addCriterion("ENTRANCE_WAY between", value1, value2, "entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEntranceWayNotBetween(
				String value1, String value2) {
			addCriterion("ENTRANCE_WAY not between", value1, value2,
					"entranceWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayIsNull() {
			addCriterion("STUDY_WAY is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayIsNotNull() {
			addCriterion("STUDY_WAY is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayEqualTo(String value) {
			addCriterion("STUDY_WAY =", value, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayNotEqualTo(String value) {
			addCriterion("STUDY_WAY <>", value, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayGreaterThan(
				String value) {
			addCriterion("STUDY_WAY >", value, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayGreaterThanOrEqualTo(
				String value) {
			addCriterion("STUDY_WAY >=", value, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayLessThan(String value) {
			addCriterion("STUDY_WAY <", value, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayLessThanOrEqualTo(
				String value) {
			addCriterion("STUDY_WAY <=", value, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayLike(String value) {
			addCriterion("STUDY_WAY like", value, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayNotLike(String value) {
			addCriterion("STUDY_WAY not like", value, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayIn(List<String> values) {
			addCriterion("STUDY_WAY in", values, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayNotIn(
				List<String> values) {
			addCriterion("STUDY_WAY not in", values, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayBetween(String value1,
				String value2) {
			addCriterion("STUDY_WAY between", value1, value2, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStudyWayNotBetween(
				String value1, String value2) {
			addCriterion("STUDY_WAY not between", value1, value2, "studyWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressIsNull() {
			addCriterion("ADDRESS is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressIsNotNull() {
			addCriterion("ADDRESS is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressEqualTo(String value) {
			addCriterion("ADDRESS =", value, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressNotEqualTo(String value) {
			addCriterion("ADDRESS <>", value, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressGreaterThan(String value) {
			addCriterion("ADDRESS >", value, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("ADDRESS >=", value, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressLessThan(String value) {
			addCriterion("ADDRESS <", value, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressLessThanOrEqualTo(
				String value) {
			addCriterion("ADDRESS <=", value, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressLike(String value) {
			addCriterion("ADDRESS like", value, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressNotLike(String value) {
			addCriterion("ADDRESS not like", value, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressIn(List<String> values) {
			addCriterion("ADDRESS in", values, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressNotIn(
				List<String> values) {
			addCriterion("ADDRESS not in", values, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressBetween(String value1,
				String value2) {
			addCriterion("ADDRESS between", value1, value2, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAddressNotBetween(
				String value1, String value2) {
			addCriterion("ADDRESS not between", value1, value2, "address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressIsNull() {
			addCriterion("MAIL_ADDRESS is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressIsNotNull() {
			addCriterion("MAIL_ADDRESS is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressEqualTo(String value) {
			addCriterion("MAIL_ADDRESS =", value, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressNotEqualTo(
				String value) {
			addCriterion("MAIL_ADDRESS <>", value, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressGreaterThan(
				String value) {
			addCriterion("MAIL_ADDRESS >", value, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("MAIL_ADDRESS >=", value, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressLessThan(
				String value) {
			addCriterion("MAIL_ADDRESS <", value, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressLessThanOrEqualTo(
				String value) {
			addCriterion("MAIL_ADDRESS <=", value, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressLike(String value) {
			addCriterion("MAIL_ADDRESS like", value, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressNotLike(String value) {
			addCriterion("MAIL_ADDRESS not like", value, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressIn(
				List<String> values) {
			addCriterion("MAIL_ADDRESS in", values, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressNotIn(
				List<String> values) {
			addCriterion("MAIL_ADDRESS not in", values, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressBetween(
				String value1, String value2) {
			addCriterion("MAIL_ADDRESS between", value1, value2, "mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMailAddressNotBetween(
				String value1, String value2) {
			addCriterion("MAIL_ADDRESS not between", value1, value2,
					"mailAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressIsNull() {
			addCriterion("HOMR_ADDRESS is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressIsNotNull() {
			addCriterion("HOMR_ADDRESS is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressEqualTo(String value) {
			addCriterion("HOMR_ADDRESS =", value, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressNotEqualTo(
				String value) {
			addCriterion("HOMR_ADDRESS <>", value, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressGreaterThan(
				String value) {
			addCriterion("HOMR_ADDRESS >", value, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("HOMR_ADDRESS >=", value, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressLessThan(
				String value) {
			addCriterion("HOMR_ADDRESS <", value, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressLessThanOrEqualTo(
				String value) {
			addCriterion("HOMR_ADDRESS <=", value, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressLike(String value) {
			addCriterion("HOMR_ADDRESS like", value, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressNotLike(String value) {
			addCriterion("HOMR_ADDRESS not like", value, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressIn(
				List<String> values) {
			addCriterion("HOMR_ADDRESS in", values, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressNotIn(
				List<String> values) {
			addCriterion("HOMR_ADDRESS not in", values, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressBetween(
				String value1, String value2) {
			addCriterion("HOMR_ADDRESS between", value1, value2, "homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomrAddressNotBetween(
				String value1, String value2) {
			addCriterion("HOMR_ADDRESS not between", value1, value2,
					"homrAddress");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneIsNull() {
			addCriterion("PHONE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneIsNotNull() {
			addCriterion("PHONE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneEqualTo(String value) {
			addCriterion("PHONE =", value, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneNotEqualTo(String value) {
			addCriterion("PHONE <>", value, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneGreaterThan(String value) {
			addCriterion("PHONE >", value, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneGreaterThanOrEqualTo(
				String value) {
			addCriterion("PHONE >=", value, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneLessThan(String value) {
			addCriterion("PHONE <", value, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneLessThanOrEqualTo(
				String value) {
			addCriterion("PHONE <=", value, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneLike(String value) {
			addCriterion("PHONE like", value, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneNotLike(String value) {
			addCriterion("PHONE not like", value, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneIn(List<String> values) {
			addCriterion("PHONE in", values, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneNotIn(List<String> values) {
			addCriterion("PHONE not in", values, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneBetween(String value1,
				String value2) {
			addCriterion("PHONE between", value1, value2, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPhoneNotBetween(String value1,
				String value2) {
			addCriterion("PHONE not between", value1, value2, "phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeIsNull() {
			addCriterion("POSTAL_CODE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeIsNotNull() {
			addCriterion("POSTAL_CODE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeEqualTo(String value) {
			addCriterion("POSTAL_CODE =", value, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeNotEqualTo(
				String value) {
			addCriterion("POSTAL_CODE <>", value, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeGreaterThan(
				String value) {
			addCriterion("POSTAL_CODE >", value, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeGreaterThanOrEqualTo(
				String value) {
			addCriterion("POSTAL_CODE >=", value, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeLessThan(String value) {
			addCriterion("POSTAL_CODE <", value, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeLessThanOrEqualTo(
				String value) {
			addCriterion("POSTAL_CODE <=", value, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeLike(String value) {
			addCriterion("POSTAL_CODE like", value, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeNotLike(String value) {
			addCriterion("POSTAL_CODE not like", value, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeIn(
				List<String> values) {
			addCriterion("POSTAL_CODE in", values, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeNotIn(
				List<String> values) {
			addCriterion("POSTAL_CODE not in", values, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeBetween(
				String value1, String value2) {
			addCriterion("POSTAL_CODE between", value1, value2, "postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPostalCodeNotBetween(
				String value1, String value2) {
			addCriterion("POSTAL_CODE not between", value1, value2,
					"postalCode");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildIsNull() {
			addCriterion("ONLY_CHILD is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildIsNotNull() {
			addCriterion("ONLY_CHILD is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildEqualTo(String value) {
			addCriterion("ONLY_CHILD =", value, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildNotEqualTo(
				String value) {
			addCriterion("ONLY_CHILD <>", value, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildGreaterThan(
				String value) {
			addCriterion("ONLY_CHILD >", value, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildGreaterThanOrEqualTo(
				String value) {
			addCriterion("ONLY_CHILD >=", value, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildLessThan(String value) {
			addCriterion("ONLY_CHILD <", value, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildLessThanOrEqualTo(
				String value) {
			addCriterion("ONLY_CHILD <=", value, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildLike(String value) {
			addCriterion("ONLY_CHILD like", value, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildNotLike(String value) {
			addCriterion("ONLY_CHILD not like", value, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildIn(List<String> values) {
			addCriterion("ONLY_CHILD in", values, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildNotIn(
				List<String> values) {
			addCriterion("ONLY_CHILD not in", values, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildBetween(
				String value1, String value2) {
			addCriterion("ONLY_CHILD between", value1, value2, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOnlyChildNotBetween(
				String value1, String value2) {
			addCriterion("ONLY_CHILD not between", value1, value2, "onlyChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationIsNull() {
			addCriterion("PRE_EDUCATION is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationIsNotNull() {
			addCriterion("PRE_EDUCATION is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationEqualTo(
				String value) {
			addCriterion("PRE_EDUCATION =", value, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationNotEqualTo(
				String value) {
			addCriterion("PRE_EDUCATION <>", value, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationGreaterThan(
				String value) {
			addCriterion("PRE_EDUCATION >", value, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationGreaterThanOrEqualTo(
				String value) {
			addCriterion("PRE_EDUCATION >=", value, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationLessThan(
				String value) {
			addCriterion("PRE_EDUCATION <", value, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationLessThanOrEqualTo(
				String value) {
			addCriterion("PRE_EDUCATION <=", value, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationLike(String value) {
			addCriterion("PRE_EDUCATION like", value, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationNotLike(
				String value) {
			addCriterion("PRE_EDUCATION not like", value, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationIn(
				List<String> values) {
			addCriterion("PRE_EDUCATION in", values, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationNotIn(
				List<String> values) {
			addCriterion("PRE_EDUCATION not in", values, "preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationBetween(
				String value1, String value2) {
			addCriterion("PRE_EDUCATION between", value1, value2,
					"preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreEducationNotBetween(
				String value1, String value2) {
			addCriterion("PRE_EDUCATION not between", value1, value2,
					"preEducation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildIsNull() {
			addCriterion("LEFT_CHILD is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildIsNotNull() {
			addCriterion("LEFT_CHILD is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildEqualTo(String value) {
			addCriterion("LEFT_CHILD =", value, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildNotEqualTo(
				String value) {
			addCriterion("LEFT_CHILD <>", value, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildGreaterThan(
				String value) {
			addCriterion("LEFT_CHILD >", value, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildGreaterThanOrEqualTo(
				String value) {
			addCriterion("LEFT_CHILD >=", value, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildLessThan(String value) {
			addCriterion("LEFT_CHILD <", value, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildLessThanOrEqualTo(
				String value) {
			addCriterion("LEFT_CHILD <=", value, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildLike(String value) {
			addCriterion("LEFT_CHILD like", value, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildNotLike(String value) {
			addCriterion("LEFT_CHILD not like", value, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildIn(List<String> values) {
			addCriterion("LEFT_CHILD in", values, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildNotIn(
				List<String> values) {
			addCriterion("LEFT_CHILD not in", values, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildBetween(
				String value1, String value2) {
			addCriterion("LEFT_CHILD between", value1, value2, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andLeftChildNotBetween(
				String value1, String value2) {
			addCriterion("LEFT_CHILD not between", value1, value2, "leftChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundIsNull() {
			addCriterion("APPLIED_FUND is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundIsNotNull() {
			addCriterion("APPLIED_FUND is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundEqualTo(String value) {
			addCriterion("APPLIED_FUND =", value, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundNotEqualTo(
				String value) {
			addCriterion("APPLIED_FUND <>", value, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundGreaterThan(
				String value) {
			addCriterion("APPLIED_FUND >", value, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundGreaterThanOrEqualTo(
				String value) {
			addCriterion("APPLIED_FUND >=", value, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundLessThan(
				String value) {
			addCriterion("APPLIED_FUND <", value, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundLessThanOrEqualTo(
				String value) {
			addCriterion("APPLIED_FUND <=", value, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundLike(String value) {
			addCriterion("APPLIED_FUND like", value, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundNotLike(String value) {
			addCriterion("APPLIED_FUND not like", value, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundIn(
				List<String> values) {
			addCriterion("APPLIED_FUND in", values, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundNotIn(
				List<String> values) {
			addCriterion("APPLIED_FUND not in", values, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundBetween(
				String value1, String value2) {
			addCriterion("APPLIED_FUND between", value1, value2, "appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAppliedFundNotBetween(
				String value1, String value2) {
			addCriterion("APPLIED_FUND not between", value1, value2,
					"appliedFund");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementIsNull() {
			addCriterion("SUPPLEMENT is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementIsNotNull() {
			addCriterion("SUPPLEMENT is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementEqualTo(String value) {
			addCriterion("SUPPLEMENT =", value, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementNotEqualTo(
				String value) {
			addCriterion("SUPPLEMENT <>", value, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementGreaterThan(
				String value) {
			addCriterion("SUPPLEMENT >", value, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementGreaterThanOrEqualTo(
				String value) {
			addCriterion("SUPPLEMENT >=", value, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementLessThan(String value) {
			addCriterion("SUPPLEMENT <", value, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementLessThanOrEqualTo(
				String value) {
			addCriterion("SUPPLEMENT <=", value, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementLike(String value) {
			addCriterion("SUPPLEMENT like", value, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementNotLike(String value) {
			addCriterion("SUPPLEMENT not like", value, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementIn(
				List<String> values) {
			addCriterion("SUPPLEMENT in", values, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementNotIn(
				List<String> values) {
			addCriterion("SUPPLEMENT not in", values, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementBetween(
				String value1, String value2) {
			addCriterion("SUPPLEMENT between", value1, value2, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSupplementNotBetween(
				String value1, String value2) {
			addCriterion("SUPPLEMENT not between", value1, value2, "supplement");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanIsNull() {
			addCriterion("ORPHAN is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanIsNotNull() {
			addCriterion("ORPHAN is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanEqualTo(String value) {
			addCriterion("ORPHAN =", value, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanNotEqualTo(String value) {
			addCriterion("ORPHAN <>", value, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanGreaterThan(String value) {
			addCriterion("ORPHAN >", value, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanGreaterThanOrEqualTo(
				String value) {
			addCriterion("ORPHAN >=", value, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanLessThan(String value) {
			addCriterion("ORPHAN <", value, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanLessThanOrEqualTo(
				String value) {
			addCriterion("ORPHAN <=", value, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanLike(String value) {
			addCriterion("ORPHAN like", value, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanNotLike(String value) {
			addCriterion("ORPHAN not like", value, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanIn(List<String> values) {
			addCriterion("ORPHAN in", values, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanNotIn(List<String> values) {
			addCriterion("ORPHAN not in", values, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanBetween(String value1,
				String value2) {
			addCriterion("ORPHAN between", value1, value2, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andOrphanNotBetween(
				String value1, String value2) {
			addCriterion("ORPHAN not between", value1, value2, "orphan");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildIsNull() {
			addCriterion("MARTYRS_CHILD is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildIsNotNull() {
			addCriterion("MARTYRS_CHILD is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildEqualTo(
				String value) {
			addCriterion("MARTYRS_CHILD =", value, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildNotEqualTo(
				String value) {
			addCriterion("MARTYRS_CHILD <>", value, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildGreaterThan(
				String value) {
			addCriterion("MARTYRS_CHILD >", value, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildGreaterThanOrEqualTo(
				String value) {
			addCriterion("MARTYRS_CHILD >=", value, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildLessThan(
				String value) {
			addCriterion("MARTYRS_CHILD <", value, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildLessThanOrEqualTo(
				String value) {
			addCriterion("MARTYRS_CHILD <=", value, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildLike(String value) {
			addCriterion("MARTYRS_CHILD like", value, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildNotLike(
				String value) {
			addCriterion("MARTYRS_CHILD not like", value, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildIn(
				List<String> values) {
			addCriterion("MARTYRS_CHILD in", values, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildNotIn(
				List<String> values) {
			addCriterion("MARTYRS_CHILD not in", values, "martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildBetween(
				String value1, String value2) {
			addCriterion("MARTYRS_CHILD between", value1, value2,
					"martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMartyrsChildNotBetween(
				String value1, String value2) {
			addCriterion("MARTYRS_CHILD not between", value1, value2,
					"martyrsChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceIsNull() {
			addCriterion("GO_DISTANCE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceIsNotNull() {
			addCriterion("GO_DISTANCE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceEqualTo(String value) {
			addCriterion("GO_DISTANCE =", value, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceNotEqualTo(
				String value) {
			addCriterion("GO_DISTANCE <>", value, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceGreaterThan(
				String value) {
			addCriterion("GO_DISTANCE >", value, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceGreaterThanOrEqualTo(
				String value) {
			addCriterion("GO_DISTANCE >=", value, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceLessThan(String value) {
			addCriterion("GO_DISTANCE <", value, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceLessThanOrEqualTo(
				String value) {
			addCriterion("GO_DISTANCE <=", value, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceLike(String value) {
			addCriterion("GO_DISTANCE like", value, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceNotLike(String value) {
			addCriterion("GO_DISTANCE not like", value, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceIn(
				List<String> values) {
			addCriterion("GO_DISTANCE in", values, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceNotIn(
				List<String> values) {
			addCriterion("GO_DISTANCE not in", values, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceBetween(
				String value1, String value2) {
			addCriterion("GO_DISTANCE between", value1, value2, "goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoDistanceNotBetween(
				String value1, String value2) {
			addCriterion("GO_DISTANCE not between", value1, value2,
					"goDistance");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayIsNull() {
			addCriterion("GO_WAY is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayIsNotNull() {
			addCriterion("GO_WAY is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayEqualTo(String value) {
			addCriterion("GO_WAY =", value, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayNotEqualTo(String value) {
			addCriterion("GO_WAY <>", value, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayGreaterThan(String value) {
			addCriterion("GO_WAY >", value, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayGreaterThanOrEqualTo(
				String value) {
			addCriterion("GO_WAY >=", value, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayLessThan(String value) {
			addCriterion("GO_WAY <", value, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayLessThanOrEqualTo(
				String value) {
			addCriterion("GO_WAY <=", value, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayLike(String value) {
			addCriterion("GO_WAY like", value, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayNotLike(String value) {
			addCriterion("GO_WAY not like", value, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayIn(List<String> values) {
			addCriterion("GO_WAY in", values, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayNotIn(List<String> values) {
			addCriterion("GO_WAY not in", values, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayBetween(String value1,
				String value2) {
			addCriterion("GO_WAY between", value1, value2, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGoWayNotBetween(String value1,
				String value2) {
			addCriterion("GO_WAY not between", value1, value2, "goWay");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusIsNull() {
			addCriterion("TAKE_BUS is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusIsNotNull() {
			addCriterion("TAKE_BUS is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusEqualTo(String value) {
			addCriterion("TAKE_BUS =", value, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusNotEqualTo(String value) {
			addCriterion("TAKE_BUS <>", value, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusGreaterThan(String value) {
			addCriterion("TAKE_BUS >", value, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusGreaterThanOrEqualTo(
				String value) {
			addCriterion("TAKE_BUS >=", value, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusLessThan(String value) {
			addCriterion("TAKE_BUS <", value, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusLessThanOrEqualTo(
				String value) {
			addCriterion("TAKE_BUS <=", value, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusLike(String value) {
			addCriterion("TAKE_BUS like", value, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusNotLike(String value) {
			addCriterion("TAKE_BUS not like", value, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusIn(List<String> values) {
			addCriterion("TAKE_BUS in", values, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusNotIn(
				List<String> values) {
			addCriterion("TAKE_BUS not in", values, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusBetween(String value1,
				String value2) {
			addCriterion("TAKE_BUS between", value1, value2, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andTakeBusNotBetween(
				String value1, String value2) {
			addCriterion("TAKE_BUS not between", value1, value2, "takeBus");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameIsNull() {
			addCriterion("PRE_NAME is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameIsNotNull() {
			addCriterion("PRE_NAME is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameEqualTo(String value) {
			addCriterion("PRE_NAME =", value, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameNotEqualTo(String value) {
			addCriterion("PRE_NAME <>", value, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameGreaterThan(String value) {
			addCriterion("PRE_NAME >", value, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("PRE_NAME >=", value, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameLessThan(String value) {
			addCriterion("PRE_NAME <", value, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameLessThanOrEqualTo(
				String value) {
			addCriterion("PRE_NAME <=", value, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameLike(String value) {
			addCriterion("PRE_NAME like", value, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameNotLike(String value) {
			addCriterion("PRE_NAME not like", value, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameIn(List<String> values) {
			addCriterion("PRE_NAME in", values, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameNotIn(
				List<String> values) {
			addCriterion("PRE_NAME not in", values, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameBetween(String value1,
				String value2) {
			addCriterion("PRE_NAME between", value1, value2, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andPreNameNotBetween(
				String value1, String value2) {
			addCriterion("PRE_NAME not between", value1, value2, "preName");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateIsNull() {
			addCriterion("CARD_VALI_DATE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateIsNotNull() {
			addCriterion("CARD_VALI_DATE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateEqualTo(
				String value) {
			addCriterion("CARD_VALI_DATE =", value, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateNotEqualTo(
				String value) {
			addCriterion("CARD_VALI_DATE <>", value, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateGreaterThan(
				String value) {
			addCriterion("CARD_VALI_DATE >", value, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateGreaterThanOrEqualTo(
				String value) {
			addCriterion("CARD_VALI_DATE >=", value, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateLessThan(
				String value) {
			addCriterion("CARD_VALI_DATE <", value, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateLessThanOrEqualTo(
				String value) {
			addCriterion("CARD_VALI_DATE <=", value, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateLike(String value) {
			addCriterion("CARD_VALI_DATE like", value, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateNotLike(
				String value) {
			addCriterion("CARD_VALI_DATE not like", value, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateIn(
				List<String> values) {
			addCriterion("CARD_VALI_DATE in", values, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateNotIn(
				List<String> values) {
			addCriterion("CARD_VALI_DATE not in", values, "cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateBetween(
				String value1, String value2) {
			addCriterion("CARD_VALI_DATE between", value1, value2,
					"cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCardValiDateNotBetween(
				String value1, String value2) {
			addCriterion("CARD_VALI_DATE not between", value1, value2,
					"cardValiDate");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeIsNull() {
			addCriterion("BLOOD_TYPE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeIsNotNull() {
			addCriterion("BLOOD_TYPE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeEqualTo(String value) {
			addCriterion("BLOOD_TYPE =", value, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeNotEqualTo(
				String value) {
			addCriterion("BLOOD_TYPE <>", value, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeGreaterThan(
				String value) {
			addCriterion("BLOOD_TYPE >", value, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("BLOOD_TYPE >=", value, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeLessThan(String value) {
			addCriterion("BLOOD_TYPE <", value, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeLessThanOrEqualTo(
				String value) {
			addCriterion("BLOOD_TYPE <=", value, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeLike(String value) {
			addCriterion("BLOOD_TYPE like", value, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeNotLike(String value) {
			addCriterion("BLOOD_TYPE not like", value, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeIn(List<String> values) {
			addCriterion("BLOOD_TYPE in", values, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeNotIn(
				List<String> values) {
			addCriterion("BLOOD_TYPE not in", values, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeBetween(
				String value1, String value2) {
			addCriterion("BLOOD_TYPE between", value1, value2, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andBloodTypeNotBetween(
				String value1, String value2) {
			addCriterion("BLOOD_TYPE not between", value1, value2, "bloodType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyIsNull() {
			addCriterion("SPECIALTY is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyIsNotNull() {
			addCriterion("SPECIALTY is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyEqualTo(String value) {
			addCriterion("SPECIALTY =", value, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyNotEqualTo(
				String value) {
			addCriterion("SPECIALTY <>", value, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyGreaterThan(
				String value) {
			addCriterion("SPECIALTY >", value, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyGreaterThanOrEqualTo(
				String value) {
			addCriterion("SPECIALTY >=", value, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyLessThan(String value) {
			addCriterion("SPECIALTY <", value, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyLessThanOrEqualTo(
				String value) {
			addCriterion("SPECIALTY <=", value, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyLike(String value) {
			addCriterion("SPECIALTY like", value, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyNotLike(String value) {
			addCriterion("SPECIALTY not like", value, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyIn(List<String> values) {
			addCriterion("SPECIALTY in", values, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyNotIn(
				List<String> values) {
			addCriterion("SPECIALTY not in", values, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyBetween(
				String value1, String value2) {
			addCriterion("SPECIALTY between", value1, value2, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andSpecialtyNotBetween(
				String value1, String value2) {
			addCriterion("SPECIALTY not between", value1, value2, "specialty");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumIsNull() {
			addCriterion("AUXILIARY_NUM is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumIsNotNull() {
			addCriterion("AUXILIARY_NUM is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumEqualTo(
				String value) {
			addCriterion("AUXILIARY_NUM =", value, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumNotEqualTo(
				String value) {
			addCriterion("AUXILIARY_NUM <>", value, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumGreaterThan(
				String value) {
			addCriterion("AUXILIARY_NUM >", value, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumGreaterThanOrEqualTo(
				String value) {
			addCriterion("AUXILIARY_NUM >=", value, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumLessThan(
				String value) {
			addCriterion("AUXILIARY_NUM <", value, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumLessThanOrEqualTo(
				String value) {
			addCriterion("AUXILIARY_NUM <=", value, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumLike(String value) {
			addCriterion("AUXILIARY_NUM like", value, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumNotLike(
				String value) {
			addCriterion("AUXILIARY_NUM not like", value, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumIn(
				List<String> values) {
			addCriterion("AUXILIARY_NUM in", values, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumNotIn(
				List<String> values) {
			addCriterion("AUXILIARY_NUM not in", values, "auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumBetween(
				String value1, String value2) {
			addCriterion("AUXILIARY_NUM between", value1, value2,
					"auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andAuxiliaryNumNotBetween(
				String value1, String value2) {
			addCriterion("AUXILIARY_NUM not between", value1, value2,
					"auxiliaryNum");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoIsNull() {
			addCriterion("STU_NO is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoIsNotNull() {
			addCriterion("STU_NO is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoEqualTo(String value) {
			addCriterion("STU_NO =", value, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoNotEqualTo(String value) {
			addCriterion("STU_NO <>", value, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoGreaterThan(String value) {
			addCriterion("STU_NO >", value, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoGreaterThanOrEqualTo(
				String value) {
			addCriterion("STU_NO >=", value, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoLessThan(String value) {
			addCriterion("STU_NO <", value, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoLessThanOrEqualTo(
				String value) {
			addCriterion("STU_NO <=", value, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoLike(String value) {
			addCriterion("STU_NO like", value, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoNotLike(String value) {
			addCriterion("STU_NO not like", value, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoIn(List<String> values) {
			addCriterion("STU_NO in", values, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoNotIn(List<String> values) {
			addCriterion("STU_NO not in", values, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoBetween(String value1,
				String value2) {
			addCriterion("STU_NO between", value1, value2, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuNoNotBetween(String value1,
				String value2) {
			addCriterion("STU_NO not between", value1, value2, "stuNo");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceIsNull() {
			addCriterion("STU_SOURCE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceIsNotNull() {
			addCriterion("STU_SOURCE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceEqualTo(String value) {
			addCriterion("STU_SOURCE =", value, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceNotEqualTo(
				String value) {
			addCriterion("STU_SOURCE <>", value, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceGreaterThan(
				String value) {
			addCriterion("STU_SOURCE >", value, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceGreaterThanOrEqualTo(
				String value) {
			addCriterion("STU_SOURCE >=", value, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceLessThan(String value) {
			addCriterion("STU_SOURCE <", value, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceLessThanOrEqualTo(
				String value) {
			addCriterion("STU_SOURCE <=", value, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceLike(String value) {
			addCriterion("STU_SOURCE like", value, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceNotLike(String value) {
			addCriterion("STU_SOURCE not like", value, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceIn(List<String> values) {
			addCriterion("STU_SOURCE in", values, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceNotIn(
				List<String> values) {
			addCriterion("STU_SOURCE not in", values, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceBetween(
				String value1, String value2) {
			addCriterion("STU_SOURCE between", value1, value2, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andStuSourceNotBetween(
				String value1, String value2) {
			addCriterion("STU_SOURCE not between", value1, value2, "stuSource");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailIsNull() {
			addCriterion("E_MAIL is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailIsNotNull() {
			addCriterion("E_MAIL is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailEqualTo(String value) {
			addCriterion("E_MAIL =", value, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailNotEqualTo(String value) {
			addCriterion("E_MAIL <>", value, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailGreaterThan(String value) {
			addCriterion("E_MAIL >", value, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailGreaterThanOrEqualTo(
				String value) {
			addCriterion("E_MAIL >=", value, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailLessThan(String value) {
			addCriterion("E_MAIL <", value, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailLessThanOrEqualTo(
				String value) {
			addCriterion("E_MAIL <=", value, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailLike(String value) {
			addCriterion("E_MAIL like", value, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailNotLike(String value) {
			addCriterion("E_MAIL not like", value, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailIn(List<String> values) {
			addCriterion("E_MAIL in", values, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailNotIn(List<String> values) {
			addCriterion("E_MAIL not in", values, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailBetween(String value1,
				String value2) {
			addCriterion("E_MAIL between", value1, value2, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEMailNotBetween(String value1,
				String value2) {
			addCriterion("E_MAIL not between", value1, value2, "eMail");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageIsNull() {
			addCriterion("HOME_PAGE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageIsNotNull() {
			addCriterion("HOME_PAGE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageEqualTo(String value) {
			addCriterion("HOME_PAGE =", value, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageNotEqualTo(String value) {
			addCriterion("HOME_PAGE <>", value, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageGreaterThan(
				String value) {
			addCriterion("HOME_PAGE >", value, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageGreaterThanOrEqualTo(
				String value) {
			addCriterion("HOME_PAGE >=", value, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageLessThan(String value) {
			addCriterion("HOME_PAGE <", value, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageLessThanOrEqualTo(
				String value) {
			addCriterion("HOME_PAGE <=", value, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageLike(String value) {
			addCriterion("HOME_PAGE like", value, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageNotLike(String value) {
			addCriterion("HOME_PAGE not like", value, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageIn(List<String> values) {
			addCriterion("HOME_PAGE in", values, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageNotIn(
				List<String> values) {
			addCriterion("HOME_PAGE not in", values, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageBetween(String value1,
				String value2) {
			addCriterion("HOME_PAGE between", value1, value2, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHomePageNotBetween(
				String value1, String value2) {
			addCriterion("HOME_PAGE not between", value1, value2, "homePage");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeIsNull() {
			addCriterion("DISABILITY_TYPE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeIsNotNull() {
			addCriterion("DISABILITY_TYPE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeEqualTo(
				String value) {
			addCriterion("DISABILITY_TYPE =", value, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeNotEqualTo(
				String value) {
			addCriterion("DISABILITY_TYPE <>", value, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeGreaterThan(
				String value) {
			addCriterion("DISABILITY_TYPE >", value, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("DISABILITY_TYPE >=", value, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeLessThan(
				String value) {
			addCriterion("DISABILITY_TYPE <", value, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeLessThanOrEqualTo(
				String value) {
			addCriterion("DISABILITY_TYPE <=", value, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeLike(String value) {
			addCriterion("DISABILITY_TYPE like", value, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeNotLike(
				String value) {
			addCriterion("DISABILITY_TYPE not like", value, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeIn(
				List<String> values) {
			addCriterion("DISABILITY_TYPE in", values, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeNotIn(
				List<String> values) {
			addCriterion("DISABILITY_TYPE not in", values, "disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeBetween(
				String value1, String value2) {
			addCriterion("DISABILITY_TYPE between", value1, value2,
					"disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andDisabilityTypeNotBetween(
				String value1, String value2) {
			addCriterion("DISABILITY_TYPE not between", value1, value2,
					"disabilityType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeIsNull() {
			addCriterion("GOVERN_DEGREE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeIsNotNull() {
			addCriterion("GOVERN_DEGREE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeEqualTo(
				String value) {
			addCriterion("GOVERN_DEGREE =", value, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeNotEqualTo(
				String value) {
			addCriterion("GOVERN_DEGREE <>", value, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeGreaterThan(
				String value) {
			addCriterion("GOVERN_DEGREE >", value, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeGreaterThanOrEqualTo(
				String value) {
			addCriterion("GOVERN_DEGREE >=", value, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeLessThan(
				String value) {
			addCriterion("GOVERN_DEGREE <", value, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeLessThanOrEqualTo(
				String value) {
			addCriterion("GOVERN_DEGREE <=", value, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeLike(String value) {
			addCriterion("GOVERN_DEGREE like", value, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeNotLike(
				String value) {
			addCriterion("GOVERN_DEGREE not like", value, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeIn(
				List<String> values) {
			addCriterion("GOVERN_DEGREE in", values, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeNotIn(
				List<String> values) {
			addCriterion("GOVERN_DEGREE not in", values, "governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeBetween(
				String value1, String value2) {
			addCriterion("GOVERN_DEGREE between", value1, value2,
					"governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andGovernDegreeNotBetween(
				String value1, String value2) {
			addCriterion("GOVERN_DEGREE not between", value1, value2,
					"governDegree");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyIsNull() {
			addCriterion("REGULAR_STUDY is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyIsNotNull() {
			addCriterion("REGULAR_STUDY is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyEqualTo(
				String value) {
			addCriterion("REGULAR_STUDY =", value, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyNotEqualTo(
				String value) {
			addCriterion("REGULAR_STUDY <>", value, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyGreaterThan(
				String value) {
			addCriterion("REGULAR_STUDY >", value, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyGreaterThanOrEqualTo(
				String value) {
			addCriterion("REGULAR_STUDY >=", value, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyLessThan(
				String value) {
			addCriterion("REGULAR_STUDY <", value, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyLessThanOrEqualTo(
				String value) {
			addCriterion("REGULAR_STUDY <=", value, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyLike(String value) {
			addCriterion("REGULAR_STUDY like", value, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyNotLike(
				String value) {
			addCriterion("REGULAR_STUDY not like", value, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyIn(
				List<String> values) {
			addCriterion("REGULAR_STUDY in", values, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyNotIn(
				List<String> values) {
			addCriterion("REGULAR_STUDY not in", values, "regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyBetween(
				String value1, String value2) {
			addCriterion("REGULAR_STUDY between", value1, value2,
					"regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andRegularStudyNotBetween(
				String value1, String value2) {
			addCriterion("REGULAR_STUDY not between", value1, value2,
					"regularStudy");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenIsNull() {
			addCriterion("HIDDEN is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenIsNotNull() {
			addCriterion("HIDDEN is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenEqualTo(String value) {
			addCriterion("HIDDEN =", value, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenNotEqualTo(String value) {
			addCriterion("HIDDEN <>", value, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenGreaterThan(String value) {
			addCriterion("HIDDEN >", value, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenGreaterThanOrEqualTo(
				String value) {
			addCriterion("HIDDEN >=", value, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenLessThan(String value) {
			addCriterion("HIDDEN <", value, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenLessThanOrEqualTo(
				String value) {
			addCriterion("HIDDEN <=", value, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenLike(String value) {
			addCriterion("HIDDEN like", value, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenNotLike(String value) {
			addCriterion("HIDDEN not like", value, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenIn(List<String> values) {
			addCriterion("HIDDEN in", values, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenNotIn(List<String> values) {
			addCriterion("HIDDEN not in", values, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenBetween(String value1,
				String value2) {
			addCriterion("HIDDEN between", value1, value2, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andHiddenNotBetween(
				String value1, String value2) {
			addCriterion("HIDDEN not between", value1, value2, "hidden");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameIsNull() {
			addCriterion("MEMBER1_NAME is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameIsNotNull() {
			addCriterion("MEMBER1_NAME is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameEqualTo(String value) {
			addCriterion("MEMBER1_NAME =", value, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameNotEqualTo(
				String value) {
			addCriterion("MEMBER1_NAME <>", value, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameGreaterThan(
				String value) {
			addCriterion("MEMBER1_NAME >", value, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_NAME >=", value, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameLessThan(
				String value) {
			addCriterion("MEMBER1_NAME <", value, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_NAME <=", value, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameLike(String value) {
			addCriterion("MEMBER1_NAME like", value, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameNotLike(String value) {
			addCriterion("MEMBER1_NAME not like", value, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameIn(
				List<String> values) {
			addCriterion("MEMBER1_NAME in", values, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameNotIn(
				List<String> values) {
			addCriterion("MEMBER1_NAME not in", values, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_NAME between", value1, value2, "member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NameNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_NAME not between", value1, value2,
					"member1Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationIsNull() {
			addCriterion("MEMBER1_RELATION is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationIsNotNull() {
			addCriterion("MEMBER1_RELATION is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationEqualTo(
				String value) {
			addCriterion("MEMBER1_RELATION =", value, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationNotEqualTo(
				String value) {
			addCriterion("MEMBER1_RELATION <>", value, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationGreaterThan(
				String value) {
			addCriterion("MEMBER1_RELATION >", value, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_RELATION >=", value, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationLessThan(
				String value) {
			addCriterion("MEMBER1_RELATION <", value, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_RELATION <=", value, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationLike(
				String value) {
			addCriterion("MEMBER1_RELATION like", value, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationNotLike(
				String value) {
			addCriterion("MEMBER1_RELATION not like", value, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationIn(
				List<String> values) {
			addCriterion("MEMBER1_RELATION in", values, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationNotIn(
				List<String> values) {
			addCriterion("MEMBER1_RELATION not in", values, "member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_RELATION between", value1, value2,
					"member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_RELATION not between", value1, value2,
					"member1Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescIsNull() {
			addCriterion("MEMBER1_RELATION_DESC is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescIsNotNull() {
			addCriterion("MEMBER1_RELATION_DESC is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescEqualTo(
				String value) {
			addCriterion("MEMBER1_RELATION_DESC =", value,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescNotEqualTo(
				String value) {
			addCriterion("MEMBER1_RELATION_DESC <>", value,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescGreaterThan(
				String value) {
			addCriterion("MEMBER1_RELATION_DESC >", value,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_RELATION_DESC >=", value,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescLessThan(
				String value) {
			addCriterion("MEMBER1_RELATION_DESC <", value,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_RELATION_DESC <=", value,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescLike(
				String value) {
			addCriterion("MEMBER1_RELATION_DESC like", value,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescNotLike(
				String value) {
			addCriterion("MEMBER1_RELATION_DESC not like", value,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescIn(
				List<String> values) {
			addCriterion("MEMBER1_RELATION_DESC in", values,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescNotIn(
				List<String> values) {
			addCriterion("MEMBER1_RELATION_DESC not in", values,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_RELATION_DESC between", value1, value2,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1RelationDescNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_RELATION_DESC not between", value1, value2,
					"member1RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressIsNull() {
			addCriterion("MEMBER1_ADDRESS is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressIsNotNull() {
			addCriterion("MEMBER1_ADDRESS is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressEqualTo(
				String value) {
			addCriterion("MEMBER1_ADDRESS =", value, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressNotEqualTo(
				String value) {
			addCriterion("MEMBER1_ADDRESS <>", value, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressGreaterThan(
				String value) {
			addCriterion("MEMBER1_ADDRESS >", value, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_ADDRESS >=", value, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressLessThan(
				String value) {
			addCriterion("MEMBER1_ADDRESS <", value, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_ADDRESS <=", value, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressLike(String value) {
			addCriterion("MEMBER1_ADDRESS like", value, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressNotLike(
				String value) {
			addCriterion("MEMBER1_ADDRESS not like", value, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressIn(
				List<String> values) {
			addCriterion("MEMBER1_ADDRESS in", values, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressNotIn(
				List<String> values) {
			addCriterion("MEMBER1_ADDRESS not in", values, "member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_ADDRESS between", value1, value2,
					"member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1AddressNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_ADDRESS not between", value1, value2,
					"member1Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictIsNull() {
			addCriterion("MEMBER1_DISTRICT is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictIsNotNull() {
			addCriterion("MEMBER1_DISTRICT is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictEqualTo(
				String value) {
			addCriterion("MEMBER1_DISTRICT =", value, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictNotEqualTo(
				String value) {
			addCriterion("MEMBER1_DISTRICT <>", value, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictGreaterThan(
				String value) {
			addCriterion("MEMBER1_DISTRICT >", value, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_DISTRICT >=", value, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictLessThan(
				String value) {
			addCriterion("MEMBER1_DISTRICT <", value, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_DISTRICT <=", value, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictLike(
				String value) {
			addCriterion("MEMBER1_DISTRICT like", value, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictNotLike(
				String value) {
			addCriterion("MEMBER1_DISTRICT not like", value, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictIn(
				List<String> values) {
			addCriterion("MEMBER1_DISTRICT in", values, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictNotIn(
				List<String> values) {
			addCriterion("MEMBER1_DISTRICT not in", values, "member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_DISTRICT between", value1, value2,
					"member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1DistrictNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_DISTRICT not between", value1, value2,
					"member1District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneIsNull() {
			addCriterion("MEMBER1_PHONE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneIsNotNull() {
			addCriterion("MEMBER1_PHONE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneEqualTo(
				String value) {
			addCriterion("MEMBER1_PHONE =", value, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneNotEqualTo(
				String value) {
			addCriterion("MEMBER1_PHONE <>", value, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneGreaterThan(
				String value) {
			addCriterion("MEMBER1_PHONE >", value, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_PHONE >=", value, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneLessThan(
				String value) {
			addCriterion("MEMBER1_PHONE <", value, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_PHONE <=", value, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneLike(String value) {
			addCriterion("MEMBER1_PHONE like", value, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneNotLike(
				String value) {
			addCriterion("MEMBER1_PHONE not like", value, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneIn(
				List<String> values) {
			addCriterion("MEMBER1_PHONE in", values, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneNotIn(
				List<String> values) {
			addCriterion("MEMBER1_PHONE not in", values, "member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_PHONE between", value1, value2,
					"member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PhoneNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_PHONE not between", value1, value2,
					"member1Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperIsNull() {
			addCriterion("MEMBER1_KEEPER is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperIsNotNull() {
			addCriterion("MEMBER1_KEEPER is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperEqualTo(
				String value) {
			addCriterion("MEMBER1_KEEPER =", value, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperNotEqualTo(
				String value) {
			addCriterion("MEMBER1_KEEPER <>", value, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperGreaterThan(
				String value) {
			addCriterion("MEMBER1_KEEPER >", value, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_KEEPER >=", value, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperLessThan(
				String value) {
			addCriterion("MEMBER1_KEEPER <", value, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_KEEPER <=", value, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperLike(String value) {
			addCriterion("MEMBER1_KEEPER like", value, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperNotLike(
				String value) {
			addCriterion("MEMBER1_KEEPER not like", value, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperIn(
				List<String> values) {
			addCriterion("MEMBER1_KEEPER in", values, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperNotIn(
				List<String> values) {
			addCriterion("MEMBER1_KEEPER not in", values, "member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_KEEPER between", value1, value2,
					"member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1KeeperNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_KEEPER not between", value1, value2,
					"member1Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeIsNull() {
			addCriterion("MEMBER1_CARD_TYPE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeIsNotNull() {
			addCriterion("MEMBER1_CARD_TYPE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeEqualTo(
				String value) {
			addCriterion("MEMBER1_CARD_TYPE =", value, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeNotEqualTo(
				String value) {
			addCriterion("MEMBER1_CARD_TYPE <>", value, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeGreaterThan(
				String value) {
			addCriterion("MEMBER1_CARD_TYPE >", value, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_CARD_TYPE >=", value, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeLessThan(
				String value) {
			addCriterion("MEMBER1_CARD_TYPE <", value, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_CARD_TYPE <=", value, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeLike(
				String value) {
			addCriterion("MEMBER1_CARD_TYPE like", value, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeNotLike(
				String value) {
			addCriterion("MEMBER1_CARD_TYPE not like", value, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeIn(
				List<String> values) {
			addCriterion("MEMBER1_CARD_TYPE in", values, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeNotIn(
				List<String> values) {
			addCriterion("MEMBER1_CARD_TYPE not in", values, "member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_CARD_TYPE between", value1, value2,
					"member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardTypeNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_CARD_TYPE not between", value1, value2,
					"member1CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdIsNull() {
			addCriterion("MEMBER1_CARD_ID is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdIsNotNull() {
			addCriterion("MEMBER1_CARD_ID is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdEqualTo(
				String value) {
			addCriterion("MEMBER1_CARD_ID =", value, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdNotEqualTo(
				String value) {
			addCriterion("MEMBER1_CARD_ID <>", value, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdGreaterThan(
				String value) {
			addCriterion("MEMBER1_CARD_ID >", value, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_CARD_ID >=", value, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdLessThan(
				String value) {
			addCriterion("MEMBER1_CARD_ID <", value, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_CARD_ID <=", value, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdLike(String value) {
			addCriterion("MEMBER1_CARD_ID like", value, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdNotLike(
				String value) {
			addCriterion("MEMBER1_CARD_ID not like", value, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdIn(
				List<String> values) {
			addCriterion("MEMBER1_CARD_ID in", values, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdNotIn(
				List<String> values) {
			addCriterion("MEMBER1_CARD_ID not in", values, "member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_CARD_ID between", value1, value2,
					"member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1CardIdNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_CARD_ID not between", value1, value2,
					"member1CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationIsNull() {
			addCriterion("MEMBER1_NATION is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationIsNotNull() {
			addCriterion("MEMBER1_NATION is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationEqualTo(
				String value) {
			addCriterion("MEMBER1_NATION =", value, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationNotEqualTo(
				String value) {
			addCriterion("MEMBER1_NATION <>", value, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationGreaterThan(
				String value) {
			addCriterion("MEMBER1_NATION >", value, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_NATION >=", value, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationLessThan(
				String value) {
			addCriterion("MEMBER1_NATION <", value, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_NATION <=", value, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationLike(String value) {
			addCriterion("MEMBER1_NATION like", value, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationNotLike(
				String value) {
			addCriterion("MEMBER1_NATION not like", value, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationIn(
				List<String> values) {
			addCriterion("MEMBER1_NATION in", values, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationNotIn(
				List<String> values) {
			addCriterion("MEMBER1_NATION not in", values, "member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_NATION between", value1, value2,
					"member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1NationNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_NATION not between", value1, value2,
					"member1Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceIsNull() {
			addCriterion("MEMBER1_WORKPLACE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceIsNotNull() {
			addCriterion("MEMBER1_WORKPLACE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceEqualTo(
				String value) {
			addCriterion("MEMBER1_WORKPLACE =", value, "member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceNotEqualTo(
				String value) {
			addCriterion("MEMBER1_WORKPLACE <>", value, "member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceGreaterThan(
				String value) {
			addCriterion("MEMBER1_WORKPLACE >", value, "member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_WORKPLACE >=", value, "member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceLessThan(
				String value) {
			addCriterion("MEMBER1_WORKPLACE <", value, "member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_WORKPLACE <=", value, "member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceLike(
				String value) {
			addCriterion("MEMBER1_WORKPLACE like", value, "member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceNotLike(
				String value) {
			addCriterion("MEMBER1_WORKPLACE not like", value,
					"member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceIn(
				List<String> values) {
			addCriterion("MEMBER1_WORKPLACE in", values, "member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceNotIn(
				List<String> values) {
			addCriterion("MEMBER1_WORKPLACE not in", values, "member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_WORKPLACE between", value1, value2,
					"member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1WorkplaceNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_WORKPLACE not between", value1, value2,
					"member1Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostIsNull() {
			addCriterion("MEMBER1_POST is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostIsNotNull() {
			addCriterion("MEMBER1_POST is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostEqualTo(String value) {
			addCriterion("MEMBER1_POST =", value, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostNotEqualTo(
				String value) {
			addCriterion("MEMBER1_POST <>", value, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostGreaterThan(
				String value) {
			addCriterion("MEMBER1_POST >", value, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_POST >=", value, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostLessThan(
				String value) {
			addCriterion("MEMBER1_POST <", value, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER1_POST <=", value, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostLike(String value) {
			addCriterion("MEMBER1_POST like", value, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostNotLike(String value) {
			addCriterion("MEMBER1_POST not like", value, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostIn(
				List<String> values) {
			addCriterion("MEMBER1_POST in", values, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostNotIn(
				List<String> values) {
			addCriterion("MEMBER1_POST not in", values, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_POST between", value1, value2, "member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember1PostNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER1_POST not between", value1, value2,
					"member1Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameIsNull() {
			addCriterion("MEMBER2_NAME is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameIsNotNull() {
			addCriterion("MEMBER2_NAME is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameEqualTo(String value) {
			addCriterion("MEMBER2_NAME =", value, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameNotEqualTo(
				String value) {
			addCriterion("MEMBER2_NAME <>", value, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameGreaterThan(
				String value) {
			addCriterion("MEMBER2_NAME >", value, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_NAME >=", value, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameLessThan(
				String value) {
			addCriterion("MEMBER2_NAME <", value, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_NAME <=", value, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameLike(String value) {
			addCriterion("MEMBER2_NAME like", value, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameNotLike(String value) {
			addCriterion("MEMBER2_NAME not like", value, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameIn(
				List<String> values) {
			addCriterion("MEMBER2_NAME in", values, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameNotIn(
				List<String> values) {
			addCriterion("MEMBER2_NAME not in", values, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_NAME between", value1, value2, "member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NameNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_NAME not between", value1, value2,
					"member2Name");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationIsNull() {
			addCriterion("MEMBER2_RELATION is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationIsNotNull() {
			addCriterion("MEMBER2_RELATION is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationEqualTo(
				String value) {
			addCriterion("MEMBER2_RELATION =", value, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationNotEqualTo(
				String value) {
			addCriterion("MEMBER2_RELATION <>", value, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationGreaterThan(
				String value) {
			addCriterion("MEMBER2_RELATION >", value, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_RELATION >=", value, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationLessThan(
				String value) {
			addCriterion("MEMBER2_RELATION <", value, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_RELATION <=", value, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationLike(
				String value) {
			addCriterion("MEMBER2_RELATION like", value, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationNotLike(
				String value) {
			addCriterion("MEMBER2_RELATION not like", value, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationIn(
				List<String> values) {
			addCriterion("MEMBER2_RELATION in", values, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationNotIn(
				List<String> values) {
			addCriterion("MEMBER2_RELATION not in", values, "member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_RELATION between", value1, value2,
					"member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_RELATION not between", value1, value2,
					"member2Relation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescIsNull() {
			addCriterion("MEMBER2_RELATION_DESC is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescIsNotNull() {
			addCriterion("MEMBER2_RELATION_DESC is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescEqualTo(
				String value) {
			addCriterion("MEMBER2_RELATION_DESC =", value,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescNotEqualTo(
				String value) {
			addCriterion("MEMBER2_RELATION_DESC <>", value,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescGreaterThan(
				String value) {
			addCriterion("MEMBER2_RELATION_DESC >", value,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_RELATION_DESC >=", value,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescLessThan(
				String value) {
			addCriterion("MEMBER2_RELATION_DESC <", value,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_RELATION_DESC <=", value,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescLike(
				String value) {
			addCriterion("MEMBER2_RELATION_DESC like", value,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescNotLike(
				String value) {
			addCriterion("MEMBER2_RELATION_DESC not like", value,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescIn(
				List<String> values) {
			addCriterion("MEMBER2_RELATION_DESC in", values,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescNotIn(
				List<String> values) {
			addCriterion("MEMBER2_RELATION_DESC not in", values,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_RELATION_DESC between", value1, value2,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2RelationDescNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_RELATION_DESC not between", value1, value2,
					"member2RelationDesc");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressIsNull() {
			addCriterion("MEMBER2_ADDRESS is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressIsNotNull() {
			addCriterion("MEMBER2_ADDRESS is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressEqualTo(
				String value) {
			addCriterion("MEMBER2_ADDRESS =", value, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressNotEqualTo(
				String value) {
			addCriterion("MEMBER2_ADDRESS <>", value, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressGreaterThan(
				String value) {
			addCriterion("MEMBER2_ADDRESS >", value, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_ADDRESS >=", value, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressLessThan(
				String value) {
			addCriterion("MEMBER2_ADDRESS <", value, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_ADDRESS <=", value, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressLike(String value) {
			addCriterion("MEMBER2_ADDRESS like", value, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressNotLike(
				String value) {
			addCriterion("MEMBER2_ADDRESS not like", value, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressIn(
				List<String> values) {
			addCriterion("MEMBER2_ADDRESS in", values, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressNotIn(
				List<String> values) {
			addCriterion("MEMBER2_ADDRESS not in", values, "member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_ADDRESS between", value1, value2,
					"member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2AddressNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_ADDRESS not between", value1, value2,
					"member2Address");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictIsNull() {
			addCriterion("MEMBER2_DISTRICT is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictIsNotNull() {
			addCriterion("MEMBER2_DISTRICT is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictEqualTo(
				String value) {
			addCriterion("MEMBER2_DISTRICT =", value, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictNotEqualTo(
				String value) {
			addCriterion("MEMBER2_DISTRICT <>", value, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictGreaterThan(
				String value) {
			addCriterion("MEMBER2_DISTRICT >", value, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_DISTRICT >=", value, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictLessThan(
				String value) {
			addCriterion("MEMBER2_DISTRICT <", value, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_DISTRICT <=", value, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictLike(
				String value) {
			addCriterion("MEMBER2_DISTRICT like", value, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictNotLike(
				String value) {
			addCriterion("MEMBER2_DISTRICT not like", value, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictIn(
				List<String> values) {
			addCriterion("MEMBER2_DISTRICT in", values, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictNotIn(
				List<String> values) {
			addCriterion("MEMBER2_DISTRICT not in", values, "member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_DISTRICT between", value1, value2,
					"member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2DistrictNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_DISTRICT not between", value1, value2,
					"member2District");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneIsNull() {
			addCriterion("MEMBER2_PHONE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneIsNotNull() {
			addCriterion("MEMBER2_PHONE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneEqualTo(
				String value) {
			addCriterion("MEMBER2_PHONE =", value, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneNotEqualTo(
				String value) {
			addCriterion("MEMBER2_PHONE <>", value, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneGreaterThan(
				String value) {
			addCriterion("MEMBER2_PHONE >", value, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_PHONE >=", value, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneLessThan(
				String value) {
			addCriterion("MEMBER2_PHONE <", value, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_PHONE <=", value, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneLike(String value) {
			addCriterion("MEMBER2_PHONE like", value, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneNotLike(
				String value) {
			addCriterion("MEMBER2_PHONE not like", value, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneIn(
				List<String> values) {
			addCriterion("MEMBER2_PHONE in", values, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneNotIn(
				List<String> values) {
			addCriterion("MEMBER2_PHONE not in", values, "member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_PHONE between", value1, value2,
					"member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PhoneNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_PHONE not between", value1, value2,
					"member2Phone");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperIsNull() {
			addCriterion("MEMBER2_KEEPER is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperIsNotNull() {
			addCriterion("MEMBER2_KEEPER is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperEqualTo(
				String value) {
			addCriterion("MEMBER2_KEEPER =", value, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperNotEqualTo(
				String value) {
			addCriterion("MEMBER2_KEEPER <>", value, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperGreaterThan(
				String value) {
			addCriterion("MEMBER2_KEEPER >", value, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_KEEPER >=", value, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperLessThan(
				String value) {
			addCriterion("MEMBER2_KEEPER <", value, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_KEEPER <=", value, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperLike(String value) {
			addCriterion("MEMBER2_KEEPER like", value, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperNotLike(
				String value) {
			addCriterion("MEMBER2_KEEPER not like", value, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperIn(
				List<String> values) {
			addCriterion("MEMBER2_KEEPER in", values, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperNotIn(
				List<String> values) {
			addCriterion("MEMBER2_KEEPER not in", values, "member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_KEEPER between", value1, value2,
					"member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2KeeperNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_KEEPER not between", value1, value2,
					"member2Keeper");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeIsNull() {
			addCriterion("MEMBER2_CARD_TYPE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeIsNotNull() {
			addCriterion("MEMBER2_CARD_TYPE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeEqualTo(
				String value) {
			addCriterion("MEMBER2_CARD_TYPE =", value, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeNotEqualTo(
				String value) {
			addCriterion("MEMBER2_CARD_TYPE <>", value, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeGreaterThan(
				String value) {
			addCriterion("MEMBER2_CARD_TYPE >", value, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_CARD_TYPE >=", value, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeLessThan(
				String value) {
			addCriterion("MEMBER2_CARD_TYPE <", value, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_CARD_TYPE <=", value, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeLike(
				String value) {
			addCriterion("MEMBER2_CARD_TYPE like", value, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeNotLike(
				String value) {
			addCriterion("MEMBER2_CARD_TYPE not like", value, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeIn(
				List<String> values) {
			addCriterion("MEMBER2_CARD_TYPE in", values, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeNotIn(
				List<String> values) {
			addCriterion("MEMBER2_CARD_TYPE not in", values, "member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_CARD_TYPE between", value1, value2,
					"member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardTypeNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_CARD_TYPE not between", value1, value2,
					"member2CardType");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdIsNull() {
			addCriterion("MEMBER2_CARD_ID is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdIsNotNull() {
			addCriterion("MEMBER2_CARD_ID is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdEqualTo(
				String value) {
			addCriterion("MEMBER2_CARD_ID =", value, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdNotEqualTo(
				String value) {
			addCriterion("MEMBER2_CARD_ID <>", value, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdGreaterThan(
				String value) {
			addCriterion("MEMBER2_CARD_ID >", value, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_CARD_ID >=", value, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdLessThan(
				String value) {
			addCriterion("MEMBER2_CARD_ID <", value, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_CARD_ID <=", value, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdLike(String value) {
			addCriterion("MEMBER2_CARD_ID like", value, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdNotLike(
				String value) {
			addCriterion("MEMBER2_CARD_ID not like", value, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdIn(
				List<String> values) {
			addCriterion("MEMBER2_CARD_ID in", values, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdNotIn(
				List<String> values) {
			addCriterion("MEMBER2_CARD_ID not in", values, "member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_CARD_ID between", value1, value2,
					"member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2CardIdNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_CARD_ID not between", value1, value2,
					"member2CardId");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationIsNull() {
			addCriterion("MEMBER2_NATION is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationIsNotNull() {
			addCriterion("MEMBER2_NATION is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationEqualTo(
				String value) {
			addCriterion("MEMBER2_NATION =", value, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationNotEqualTo(
				String value) {
			addCriterion("MEMBER2_NATION <>", value, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationGreaterThan(
				String value) {
			addCriterion("MEMBER2_NATION >", value, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_NATION >=", value, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationLessThan(
				String value) {
			addCriterion("MEMBER2_NATION <", value, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_NATION <=", value, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationLike(String value) {
			addCriterion("MEMBER2_NATION like", value, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationNotLike(
				String value) {
			addCriterion("MEMBER2_NATION not like", value, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationIn(
				List<String> values) {
			addCriterion("MEMBER2_NATION in", values, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationNotIn(
				List<String> values) {
			addCriterion("MEMBER2_NATION not in", values, "member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_NATION between", value1, value2,
					"member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2NationNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_NATION not between", value1, value2,
					"member2Nation");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceIsNull() {
			addCriterion("MEMBER2_WORKPLACE is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceIsNotNull() {
			addCriterion("MEMBER2_WORKPLACE is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceEqualTo(
				String value) {
			addCriterion("MEMBER2_WORKPLACE =", value, "member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceNotEqualTo(
				String value) {
			addCriterion("MEMBER2_WORKPLACE <>", value, "member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceGreaterThan(
				String value) {
			addCriterion("MEMBER2_WORKPLACE >", value, "member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_WORKPLACE >=", value, "member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceLessThan(
				String value) {
			addCriterion("MEMBER2_WORKPLACE <", value, "member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_WORKPLACE <=", value, "member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceLike(
				String value) {
			addCriterion("MEMBER2_WORKPLACE like", value, "member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceNotLike(
				String value) {
			addCriterion("MEMBER2_WORKPLACE not like", value,
					"member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceIn(
				List<String> values) {
			addCriterion("MEMBER2_WORKPLACE in", values, "member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceNotIn(
				List<String> values) {
			addCriterion("MEMBER2_WORKPLACE not in", values, "member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_WORKPLACE between", value1, value2,
					"member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2WorkplaceNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_WORKPLACE not between", value1, value2,
					"member2Workplace");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostIsNull() {
			addCriterion("MEMBER2_POST is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostIsNotNull() {
			addCriterion("MEMBER2_POST is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostEqualTo(String value) {
			addCriterion("MEMBER2_POST =", value, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostNotEqualTo(
				String value) {
			addCriterion("MEMBER2_POST <>", value, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostGreaterThan(
				String value) {
			addCriterion("MEMBER2_POST >", value, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostGreaterThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_POST >=", value, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostLessThan(
				String value) {
			addCriterion("MEMBER2_POST <", value, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostLessThanOrEqualTo(
				String value) {
			addCriterion("MEMBER2_POST <=", value, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostLike(String value) {
			addCriterion("MEMBER2_POST like", value, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostNotLike(String value) {
			addCriterion("MEMBER2_POST not like", value, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostIn(
				List<String> values) {
			addCriterion("MEMBER2_POST in", values, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostNotIn(
				List<String> values) {
			addCriterion("MEMBER2_POST not in", values, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_POST between", value1, value2, "member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMember2PostNotBetween(
				String value1, String value2) {
			addCriterion("MEMBER2_POST not between", value1, value2,
					"member2Post");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildIsNull() {
			addCriterion("MIGRANT_CHILD is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildIsNotNull() {
			addCriterion("MIGRANT_CHILD is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildEqualTo(
				String value) {
			addCriterion("MIGRANT_CHILD =", value, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildNotEqualTo(
				String value) {
			addCriterion("MIGRANT_CHILD <>", value, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildGreaterThan(
				String value) {
			addCriterion("MIGRANT_CHILD >", value, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildGreaterThanOrEqualTo(
				String value) {
			addCriterion("MIGRANT_CHILD >=", value, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildLessThan(
				String value) {
			addCriterion("MIGRANT_CHILD <", value, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildLessThanOrEqualTo(
				String value) {
			addCriterion("MIGRANT_CHILD <=", value, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildLike(String value) {
			addCriterion("MIGRANT_CHILD like", value, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildNotLike(
				String value) {
			addCriterion("MIGRANT_CHILD not like", value, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildIn(
				List<String> values) {
			addCriterion("MIGRANT_CHILD in", values, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildNotIn(
				List<String> values) {
			addCriterion("MIGRANT_CHILD not in", values, "migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildBetween(
				String value1, String value2) {
			addCriterion("MIGRANT_CHILD between", value1, value2,
					"migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andMigrantChildNotBetween(
				String value1, String value2) {
			addCriterion("MIGRANT_CHILD not between", value1, value2,
					"migrantChild");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserIsNull() {
			addCriterion("CREATE_USER is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserIsNotNull() {
			addCriterion("CREATE_USER is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserEqualTo(String value) {
			addCriterion("CREATE_USER =", value, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserNotEqualTo(
				String value) {
			addCriterion("CREATE_USER <>", value, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserGreaterThan(
				String value) {
			addCriterion("CREATE_USER >", value, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserGreaterThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER >=", value, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserLessThan(String value) {
			addCriterion("CREATE_USER <", value, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserLessThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER <=", value, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserLike(String value) {
			addCriterion("CREATE_USER like", value, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserNotLike(String value) {
			addCriterion("CREATE_USER not like", value, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserIn(
				List<String> values) {
			addCriterion("CREATE_USER in", values, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserNotIn(
				List<String> values) {
			addCriterion("CREATE_USER not in", values, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER between", value1, value2, "createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateUserNotBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER not between", value1, value2,
					"createUser");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeIsNull() {
			addCriterion("CREATE_TIME is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeIsNotNull() {
			addCriterion("CREATE_TIME is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("CREATE_TIME between", value1, value2,
					"createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andCreateTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("CREATE_TIME not between", value1, value2,
					"createTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeIsNull() {
			addCriterion("EDIT_TIME is null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeIsNotNull() {
			addCriterion("EDIT_TIME is not null");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME =", value, "editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME <>", value, "editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME >", value, "editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME >=", value, "editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME <", value, "editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("EDIT_TIME <=", value, "editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("EDIT_TIME in", values, "editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("EDIT_TIME not in", values, "editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("EDIT_TIME between", value1, value2,
					"editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}

		public SchoolRollInfoExample.Criteria andEditTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("EDIT_TIME not between", value1, value2,
					"editTime");
			return (SchoolRollInfoExample.Criteria) this;
		}
	}
}
