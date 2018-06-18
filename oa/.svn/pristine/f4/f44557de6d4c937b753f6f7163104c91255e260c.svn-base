package com.myoa.model.edu.teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacheringInfoExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public TeacheringInfoExample() {
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
			TeacheringInfoExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<TeacheringInfoExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<TeacheringInfoExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<TeacheringInfoExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new TeacheringInfoExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new TeacheringInfoExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new TeacheringInfoExample.Criterion(condition,
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

		public TeacheringInfoExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ID >=", value, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("ID <=", value, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdBetween(Integer value1,
				Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("NAME >=", value, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameLessThanOrEqualTo(
				String value) {
			addCriterion("NAME <=", value, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameBetween(String value1,
				String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNameNotBetween(String value1,
				String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationIsNull() {
			addCriterion("NATION is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationIsNotNull() {
			addCriterion("NATION is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationEqualTo(String value) {
			addCriterion("NATION =", value, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationNotEqualTo(String value) {
			addCriterion("NATION <>", value, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationGreaterThan(String value) {
			addCriterion("NATION >", value, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationGreaterThanOrEqualTo(
				String value) {
			addCriterion("NATION >=", value, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationLessThan(String value) {
			addCriterion("NATION <", value, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationLessThanOrEqualTo(
				String value) {
			addCriterion("NATION <=", value, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationLike(String value) {
			addCriterion("NATION like", value, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationNotLike(String value) {
			addCriterion("NATION not like", value, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationIn(List<String> values) {
			addCriterion("NATION in", values, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationNotIn(List<String> values) {
			addCriterion("NATION not in", values, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationBetween(String value1,
				String value2) {
			addCriterion("NATION between", value1, value2, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationNotBetween(
				String value1, String value2) {
			addCriterion("NATION not between", value1, value2, "nation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexIsNull() {
			addCriterion("SEX is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexIsNotNull() {
			addCriterion("SEX is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexEqualTo(String value) {
			addCriterion("SEX =", value, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexNotEqualTo(String value) {
			addCriterion("SEX <>", value, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexGreaterThan(String value) {
			addCriterion("SEX >", value, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexGreaterThanOrEqualTo(
				String value) {
			addCriterion("SEX >=", value, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexLessThan(String value) {
			addCriterion("SEX <", value, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexLessThanOrEqualTo(
				String value) {
			addCriterion("SEX <=", value, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexLike(String value) {
			addCriterion("SEX like", value, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexNotLike(String value) {
			addCriterion("SEX not like", value, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexIn(List<String> values) {
			addCriterion("SEX in", values, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexNotIn(List<String> values) {
			addCriterion("SEX not in", values, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexBetween(String value1,
				String value2) {
			addCriterion("SEX between", value1, value2, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSexNotBetween(String value1,
				String value2) {
			addCriterion("SEX not between", value1, value2, "sex");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeIsNull() {
			addCriterion("ID_CARD_TYPE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeIsNotNull() {
			addCriterion("ID_CARD_TYPE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeEqualTo(String value) {
			addCriterion("ID_CARD_TYPE =", value, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeNotEqualTo(
				String value) {
			addCriterion("ID_CARD_TYPE <>", value, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeGreaterThan(
				String value) {
			addCriterion("ID_CARD_TYPE >", value, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("ID_CARD_TYPE >=", value, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeLessThan(String value) {
			addCriterion("ID_CARD_TYPE <", value, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeLessThanOrEqualTo(
				String value) {
			addCriterion("ID_CARD_TYPE <=", value, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeLike(String value) {
			addCriterion("ID_CARD_TYPE like", value, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeNotLike(String value) {
			addCriterion("ID_CARD_TYPE not like", value, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeIn(
				List<String> values) {
			addCriterion("ID_CARD_TYPE in", values, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeNotIn(
				List<String> values) {
			addCriterion("ID_CARD_TYPE not in", values, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeBetween(
				String value1, String value2) {
			addCriterion("ID_CARD_TYPE between", value1, value2, "idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardTypeNotBetween(
				String value1, String value2) {
			addCriterion("ID_CARD_TYPE not between", value1, value2,
					"idCardType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardIsNull() {
			addCriterion("ID_CARD is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardIsNotNull() {
			addCriterion("ID_CARD is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardEqualTo(String value) {
			addCriterion("ID_CARD =", value, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardNotEqualTo(String value) {
			addCriterion("ID_CARD <>", value, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardGreaterThan(String value) {
			addCriterion("ID_CARD >", value, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardGreaterThanOrEqualTo(
				String value) {
			addCriterion("ID_CARD >=", value, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardLessThan(String value) {
			addCriterion("ID_CARD <", value, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardLessThanOrEqualTo(
				String value) {
			addCriterion("ID_CARD <=", value, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardLike(String value) {
			addCriterion("ID_CARD like", value, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardNotLike(String value) {
			addCriterion("ID_CARD not like", value, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardIn(List<String> values) {
			addCriterion("ID_CARD in", values, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardNotIn(List<String> values) {
			addCriterion("ID_CARD not in", values, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardBetween(String value1,
				String value2) {
			addCriterion("ID_CARD between", value1, value2, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIdCardNotBetween(
				String value1, String value2) {
			addCriterion("ID_CARD not between", value1, value2, "idCard");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxIsNull() {
			addCriterion("SSXX is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxIsNotNull() {
			addCriterion("SSXX is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxEqualTo(String value) {
			addCriterion("SSXX =", value, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxNotEqualTo(String value) {
			addCriterion("SSXX <>", value, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxGreaterThan(String value) {
			addCriterion("SSXX >", value, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxGreaterThanOrEqualTo(
				String value) {
			addCriterion("SSXX >=", value, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxLessThan(String value) {
			addCriterion("SSXX <", value, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxLessThanOrEqualTo(
				String value) {
			addCriterion("SSXX <=", value, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxLike(String value) {
			addCriterion("SSXX like", value, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxNotLike(String value) {
			addCriterion("SSXX not like", value, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxIn(List<String> values) {
			addCriterion("SSXX in", values, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxNotIn(List<String> values) {
			addCriterion("SSXX not in", values, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxBetween(String value1,
				String value2) {
			addCriterion("SSXX between", value1, value2, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSsxxNotBetween(String value1,
				String value2) {
			addCriterion("SSXX not between", value1, value2, "ssxx");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeIsNull() {
			addCriterion("JOB_STARTIME is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeIsNotNull() {
			addCriterion("JOB_STARTIME is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME =", value, "jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME <>", value, "jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME >", value, "jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME >=", value, "jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME <", value, "jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOB_STARTIME <=", value, "jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("JOB_STARTIME in", values, "jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("JOB_STARTIME not in", values,
					"jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("JOB_STARTIME between", value1, value2,
					"jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJobStartimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("JOB_STARTIME not between", value1, value2,
					"jobStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalIsNull() {
			addCriterion("POLITICAL is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalIsNotNull() {
			addCriterion("POLITICAL is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalEqualTo(String value) {
			addCriterion("POLITICAL =", value, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalNotEqualTo(
				String value) {
			addCriterion("POLITICAL <>", value, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalGreaterThan(
				String value) {
			addCriterion("POLITICAL >", value, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalGreaterThanOrEqualTo(
				String value) {
			addCriterion("POLITICAL >=", value, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalLessThan(String value) {
			addCriterion("POLITICAL <", value, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalLessThanOrEqualTo(
				String value) {
			addCriterion("POLITICAL <=", value, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalLike(String value) {
			addCriterion("POLITICAL like", value, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalNotLike(String value) {
			addCriterion("POLITICAL not like", value, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalIn(List<String> values) {
			addCriterion("POLITICAL in", values, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalNotIn(
				List<String> values) {
			addCriterion("POLITICAL not in", values, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalBetween(
				String value1, String value2) {
			addCriterion("POLITICAL between", value1, value2, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPoliticalNotBetween(
				String value1, String value2) {
			addCriterion("POLITICAL not between", value1, value2, "political");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneIsNull() {
			addCriterion("POHNE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneIsNotNull() {
			addCriterion("POHNE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneEqualTo(String value) {
			addCriterion("POHNE =", value, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneNotEqualTo(String value) {
			addCriterion("POHNE <>", value, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneGreaterThan(String value) {
			addCriterion("POHNE >", value, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneGreaterThanOrEqualTo(
				String value) {
			addCriterion("POHNE >=", value, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneLessThan(String value) {
			addCriterion("POHNE <", value, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneLessThanOrEqualTo(
				String value) {
			addCriterion("POHNE <=", value, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneLike(String value) {
			addCriterion("POHNE like", value, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneNotLike(String value) {
			addCriterion("POHNE not like", value, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneIn(List<String> values) {
			addCriterion("POHNE in", values, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneNotIn(List<String> values) {
			addCriterion("POHNE not in", values, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneBetween(String value1,
				String value2) {
			addCriterion("POHNE between", value1, value2, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPohneNotBetween(String value1,
				String value2) {
			addCriterion("POHNE not between", value1, value2, "pohne");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateIsNull() {
			addCriterion("POST_CATE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateIsNotNull() {
			addCriterion("POST_CATE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateEqualTo(String value) {
			addCriterion("POST_CATE =", value, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateNotEqualTo(String value) {
			addCriterion("POST_CATE <>", value, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateGreaterThan(
				String value) {
			addCriterion("POST_CATE >", value, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateGreaterThanOrEqualTo(
				String value) {
			addCriterion("POST_CATE >=", value, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateLessThan(String value) {
			addCriterion("POST_CATE <", value, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateLessThanOrEqualTo(
				String value) {
			addCriterion("POST_CATE <=", value, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateLike(String value) {
			addCriterion("POST_CATE like", value, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateNotLike(String value) {
			addCriterion("POST_CATE not like", value, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateIn(List<String> values) {
			addCriterion("POST_CATE in", values, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateNotIn(
				List<String> values) {
			addCriterion("POST_CATE not in", values, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateBetween(String value1,
				String value2) {
			addCriterion("POST_CATE between", value1, value2, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostCateNotBetween(
				String value1, String value2) {
			addCriterion("POST_CATE not between", value1, value2, "postCate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostIsNull() {
			addCriterion("POST is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostIsNotNull() {
			addCriterion("POST is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEqualTo(String value) {
			addCriterion("POST =", value, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostNotEqualTo(String value) {
			addCriterion("POST <>", value, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostGreaterThan(String value) {
			addCriterion("POST >", value, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostGreaterThanOrEqualTo(
				String value) {
			addCriterion("POST >=", value, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostLessThan(String value) {
			addCriterion("POST <", value, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostLessThanOrEqualTo(
				String value) {
			addCriterion("POST <=", value, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostLike(String value) {
			addCriterion("POST like", value, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostNotLike(String value) {
			addCriterion("POST not like", value, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostIn(List<String> values) {
			addCriterion("POST in", values, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostNotIn(List<String> values) {
			addCriterion("POST not in", values, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostBetween(String value1,
				String value2) {
			addCriterion("POST between", value1, value2, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostNotBetween(String value1,
				String value2) {
			addCriterion("POST not between", value1, value2, "post");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthIsNull() {
			addCriterion("BIRTH is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthIsNotNull() {
			addCriterion("BIRTH is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH =", value, "birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH <>", value, "birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH >", value, "birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH >=", value, "birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH <", value, "birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BIRTH <=", value, "birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BIRTH in", values, "birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BIRTH not in", values, "birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BIRTH between", value1, value2, "birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BIRTH not between", value1, value2,
					"birth");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginIsNull() {
			addCriterion("ORIGIN is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginIsNotNull() {
			addCriterion("ORIGIN is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginEqualTo(String value) {
			addCriterion("ORIGIN =", value, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginNotEqualTo(String value) {
			addCriterion("ORIGIN <>", value, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginGreaterThan(String value) {
			addCriterion("ORIGIN >", value, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginGreaterThanOrEqualTo(
				String value) {
			addCriterion("ORIGIN >=", value, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginLessThan(String value) {
			addCriterion("ORIGIN <", value, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginLessThanOrEqualTo(
				String value) {
			addCriterion("ORIGIN <=", value, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginLike(String value) {
			addCriterion("ORIGIN like", value, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginNotLike(String value) {
			addCriterion("ORIGIN not like", value, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginIn(List<String> values) {
			addCriterion("ORIGIN in", values, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginNotIn(List<String> values) {
			addCriterion("ORIGIN not in", values, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginBetween(String value1,
				String value2) {
			addCriterion("ORIGIN between", value1, value2, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andOriginNotBetween(
				String value1, String value2) {
			addCriterion("ORIGIN not between", value1, value2, "origin");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressIsNull() {
			addCriterion("ADDRESS is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressIsNotNull() {
			addCriterion("ADDRESS is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressEqualTo(String value) {
			addCriterion("ADDRESS =", value, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressNotEqualTo(String value) {
			addCriterion("ADDRESS <>", value, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressGreaterThan(String value) {
			addCriterion("ADDRESS >", value, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("ADDRESS >=", value, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressLessThan(String value) {
			addCriterion("ADDRESS <", value, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressLessThanOrEqualTo(
				String value) {
			addCriterion("ADDRESS <=", value, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressLike(String value) {
			addCriterion("ADDRESS like", value, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressNotLike(String value) {
			addCriterion("ADDRESS not like", value, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressIn(List<String> values) {
			addCriterion("ADDRESS in", values, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressNotIn(
				List<String> values) {
			addCriterion("ADDRESS not in", values, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressBetween(String value1,
				String value2) {
			addCriterion("ADDRESS between", value1, value2, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andAddressNotBetween(
				String value1, String value2) {
			addCriterion("ADDRESS not between", value1, value2, "address");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressIsNull() {
			addCriterion("POSTAL_ADDRESS is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressIsNotNull() {
			addCriterion("POSTAL_ADDRESS is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressEqualTo(
				String value) {
			addCriterion("POSTAL_ADDRESS =", value, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressNotEqualTo(
				String value) {
			addCriterion("POSTAL_ADDRESS <>", value, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressGreaterThan(
				String value) {
			addCriterion("POSTAL_ADDRESS >", value, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("POSTAL_ADDRESS >=", value, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressLessThan(
				String value) {
			addCriterion("POSTAL_ADDRESS <", value, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressLessThanOrEqualTo(
				String value) {
			addCriterion("POSTAL_ADDRESS <=", value, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressLike(String value) {
			addCriterion("POSTAL_ADDRESS like", value, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressNotLike(
				String value) {
			addCriterion("POSTAL_ADDRESS not like", value, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressIn(
				List<String> values) {
			addCriterion("POSTAL_ADDRESS in", values, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressNotIn(
				List<String> values) {
			addCriterion("POSTAL_ADDRESS not in", values, "postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressBetween(
				String value1, String value2) {
			addCriterion("POSTAL_ADDRESS between", value1, value2,
					"postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostalAddressNotBetween(
				String value1, String value2) {
			addCriterion("POSTAL_ADDRESS not between", value1, value2,
					"postalAddress");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailIsNull() {
			addCriterion("EMAIL is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailIsNotNull() {
			addCriterion("EMAIL is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailEqualTo(String value) {
			addCriterion("EMAIL =", value, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailNotEqualTo(String value) {
			addCriterion("EMAIL <>", value, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailGreaterThan(String value) {
			addCriterion("EMAIL >", value, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailGreaterThanOrEqualTo(
				String value) {
			addCriterion("EMAIL >=", value, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailLessThan(String value) {
			addCriterion("EMAIL <", value, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailLessThanOrEqualTo(
				String value) {
			addCriterion("EMAIL <=", value, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailLike(String value) {
			addCriterion("EMAIL like", value, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailNotLike(String value) {
			addCriterion("EMAIL not like", value, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailIn(List<String> values) {
			addCriterion("EMAIL in", values, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailNotIn(List<String> values) {
			addCriterion("EMAIL not in", values, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailBetween(String value1,
				String value2) {
			addCriterion("EMAIL between", value1, value2, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andEmailNotBetween(String value1,
				String value2) {
			addCriterion("EMAIL not between", value1, value2, "email");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesIsNull() {
			addCriterion("IS_INSERIES is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesIsNotNull() {
			addCriterion("IS_INSERIES is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesEqualTo(String value) {
			addCriterion("IS_INSERIES =", value, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesNotEqualTo(
				String value) {
			addCriterion("IS_INSERIES <>", value, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesGreaterThan(
				String value) {
			addCriterion("IS_INSERIES >", value, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_INSERIES >=", value, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesLessThan(String value) {
			addCriterion("IS_INSERIES <", value, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesLessThanOrEqualTo(
				String value) {
			addCriterion("IS_INSERIES <=", value, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesLike(String value) {
			addCriterion("IS_INSERIES like", value, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesNotLike(String value) {
			addCriterion("IS_INSERIES not like", value, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesIn(
				List<String> values) {
			addCriterion("IS_INSERIES in", values, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesNotIn(
				List<String> values) {
			addCriterion("IS_INSERIES not in", values, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesBetween(
				String value1, String value2) {
			addCriterion("IS_INSERIES between", value1, value2, "isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInseriesNotBetween(
				String value1, String value2) {
			addCriterion("IS_INSERIES not between", value1, value2,
					"isInseries");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostIsNull() {
			addCriterion("IS_INPOST is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostIsNotNull() {
			addCriterion("IS_INPOST is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostEqualTo(String value) {
			addCriterion("IS_INPOST =", value, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostNotEqualTo(String value) {
			addCriterion("IS_INPOST <>", value, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostGreaterThan(
				String value) {
			addCriterion("IS_INPOST >", value, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_INPOST >=", value, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostLessThan(String value) {
			addCriterion("IS_INPOST <", value, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostLessThanOrEqualTo(
				String value) {
			addCriterion("IS_INPOST <=", value, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostLike(String value) {
			addCriterion("IS_INPOST like", value, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostNotLike(String value) {
			addCriterion("IS_INPOST not like", value, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostIn(List<String> values) {
			addCriterion("IS_INPOST in", values, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostNotIn(
				List<String> values) {
			addCriterion("IS_INPOST not in", values, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostBetween(String value1,
				String value2) {
			addCriterion("IS_INPOST between", value1, value2, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsInpostNotBetween(
				String value1, String value2) {
			addCriterion("IS_INPOST not between", value1, value2, "isInpost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeIsNull() {
			addCriterion("HEIGHEST_DEGREE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeIsNotNull() {
			addCriterion("HEIGHEST_DEGREE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE =", value, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNotEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE <>", value, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeGreaterThan(
				String value) {
			addCriterion("HEIGHEST_DEGREE >", value, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeGreaterThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE >=", value, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeLessThan(
				String value) {
			addCriterion("HEIGHEST_DEGREE <", value, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeLessThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE <=", value, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeLike(String value) {
			addCriterion("HEIGHEST_DEGREE like", value, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNotLike(
				String value) {
			addCriterion("HEIGHEST_DEGREE not like", value, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeIn(
				List<String> values) {
			addCriterion("HEIGHEST_DEGREE in", values, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNotIn(
				List<String> values) {
			addCriterion("HEIGHEST_DEGREE not in", values, "heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_DEGREE between", value1, value2,
					"heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNotBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_DEGREE not between", value1, value2,
					"heighestDegree");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameIsNull() {
			addCriterion("HEIGHEST_DEGREE_NAME is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameIsNotNull() {
			addCriterion("HEIGHEST_DEGREE_NAME is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE_NAME =", value, "heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameNotEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE_NAME <>", value, "heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameGreaterThan(
				String value) {
			addCriterion("HEIGHEST_DEGREE_NAME >", value, "heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE_NAME >=", value, "heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameLessThan(
				String value) {
			addCriterion("HEIGHEST_DEGREE_NAME <", value, "heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameLessThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_DEGREE_NAME <=", value, "heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameLike(
				String value) {
			addCriterion("HEIGHEST_DEGREE_NAME like", value,
					"heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameNotLike(
				String value) {
			addCriterion("HEIGHEST_DEGREE_NAME not like", value,
					"heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameIn(
				List<String> values) {
			addCriterion("HEIGHEST_DEGREE_NAME in", values,
					"heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameNotIn(
				List<String> values) {
			addCriterion("HEIGHEST_DEGREE_NAME not in", values,
					"heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_DEGREE_NAME between", value1, value2,
					"heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestDegreeNameNotBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_DEGREE_NAME not between", value1, value2,
					"heighestDegreeName");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduIsNull() {
			addCriterion("HEIGHEST_EDU is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduIsNotNull() {
			addCriterion("HEIGHEST_EDU is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduEqualTo(String value) {
			addCriterion("HEIGHEST_EDU =", value, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduNotEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU <>", value, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduGreaterThan(
				String value) {
			addCriterion("HEIGHEST_EDU >", value, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduGreaterThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU >=", value, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduLessThan(
				String value) {
			addCriterion("HEIGHEST_EDU <", value, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduLessThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU <=", value, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduLike(String value) {
			addCriterion("HEIGHEST_EDU like", value, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduNotLike(String value) {
			addCriterion("HEIGHEST_EDU not like", value, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduIn(
				List<String> values) {
			addCriterion("HEIGHEST_EDU in", values, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduNotIn(
				List<String> values) {
			addCriterion("HEIGHEST_EDU not in", values, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_EDU between", value1, value2, "heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduNotBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_EDU not between", value1, value2,
					"heighestEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorIsNull() {
			addCriterion("HEIGHEST_EDU_MAJOR is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorIsNotNull() {
			addCriterion("HEIGHEST_EDU_MAJOR is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR =", value, "heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorNotEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR <>", value, "heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorGreaterThan(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR >", value, "heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorGreaterThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR >=", value, "heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorLessThan(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR <", value, "heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorLessThanOrEqualTo(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR <=", value, "heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorLike(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR like", value, "heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorNotLike(
				String value) {
			addCriterion("HEIGHEST_EDU_MAJOR not like", value,
					"heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorIn(
				List<String> values) {
			addCriterion("HEIGHEST_EDU_MAJOR in", values, "heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorNotIn(
				List<String> values) {
			addCriterion("HEIGHEST_EDU_MAJOR not in", values,
					"heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_EDU_MAJOR between", value1, value2,
					"heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHeighestEduMajorNotBetween(
				String value1, String value2) {
			addCriterion("HEIGHEST_EDU_MAJOR not between", value1, value2,
					"heighestEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateIsNull() {
			addCriterion("MAJOR_DATE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateIsNotNull() {
			addCriterion("MAJOR_DATE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE =", value, "majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE <>", value, "majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE >", value, "majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE >=", value, "majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE <", value, "majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MAJOR_DATE <=", value, "majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("MAJOR_DATE in", values, "majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("MAJOR_DATE not in", values, "majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("MAJOR_DATE between", value1, value2,
					"majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("MAJOR_DATE not between", value1, value2,
					"majorDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolIsNull() {
			addCriterion("MAJOR_EDU_SCHOOL is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolIsNotNull() {
			addCriterion("MAJOR_EDU_SCHOOL is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolEqualTo(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL =", value, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolNotEqualTo(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL <>", value, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolGreaterThan(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL >", value, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolGreaterThanOrEqualTo(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL >=", value, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolLessThan(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL <", value, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolLessThanOrEqualTo(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL <=", value, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolLike(String value) {
			addCriterion("MAJOR_EDU_SCHOOL like", value, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolNotLike(
				String value) {
			addCriterion("MAJOR_EDU_SCHOOL not like", value, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolIn(
				List<String> values) {
			addCriterion("MAJOR_EDU_SCHOOL in", values, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolNotIn(
				List<String> values) {
			addCriterion("MAJOR_EDU_SCHOOL not in", values, "majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolBetween(
				String value1, String value2) {
			addCriterion("MAJOR_EDU_SCHOOL between", value1, value2,
					"majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMajorEduSchoolNotBetween(
				String value1, String value2) {
			addCriterion("MAJOR_EDU_SCHOOL not between", value1, value2,
					"majorEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduIsNull() {
			addCriterion("FIRST_EDU is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduIsNotNull() {
			addCriterion("FIRST_EDU is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduEqualTo(String value) {
			addCriterion("FIRST_EDU =", value, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduNotEqualTo(String value) {
			addCriterion("FIRST_EDU <>", value, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduGreaterThan(
				String value) {
			addCriterion("FIRST_EDU >", value, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduGreaterThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU >=", value, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduLessThan(String value) {
			addCriterion("FIRST_EDU <", value, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduLessThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU <=", value, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduLike(String value) {
			addCriterion("FIRST_EDU like", value, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduNotLike(String value) {
			addCriterion("FIRST_EDU not like", value, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduIn(List<String> values) {
			addCriterion("FIRST_EDU in", values, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduNotIn(
				List<String> values) {
			addCriterion("FIRST_EDU not in", values, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduBetween(String value1,
				String value2) {
			addCriterion("FIRST_EDU between", value1, value2, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduNotBetween(
				String value1, String value2) {
			addCriterion("FIRST_EDU not between", value1, value2, "firstEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorIsNull() {
			addCriterion("FIRST_EDU_MAJOR is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorIsNotNull() {
			addCriterion("FIRST_EDU_MAJOR is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorEqualTo(
				String value) {
			addCriterion("FIRST_EDU_MAJOR =", value, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorNotEqualTo(
				String value) {
			addCriterion("FIRST_EDU_MAJOR <>", value, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorGreaterThan(
				String value) {
			addCriterion("FIRST_EDU_MAJOR >", value, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorGreaterThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU_MAJOR >=", value, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorLessThan(
				String value) {
			addCriterion("FIRST_EDU_MAJOR <", value, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorLessThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU_MAJOR <=", value, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorLike(String value) {
			addCriterion("FIRST_EDU_MAJOR like", value, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorNotLike(
				String value) {
			addCriterion("FIRST_EDU_MAJOR not like", value, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorIn(
				List<String> values) {
			addCriterion("FIRST_EDU_MAJOR in", values, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorNotIn(
				List<String> values) {
			addCriterion("FIRST_EDU_MAJOR not in", values, "firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorBetween(
				String value1, String value2) {
			addCriterion("FIRST_EDU_MAJOR between", value1, value2,
					"firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduMajorNotBetween(
				String value1, String value2) {
			addCriterion("FIRST_EDU_MAJOR not between", value1, value2,
					"firstEduMajor");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateIsNull() {
			addCriterion("FIRST_EDU_DATE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateIsNotNull() {
			addCriterion("FIRST_EDU_DATE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE =", value, "firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE <>", value, "firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE >", value, "firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE >=", value, "firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE <", value, "firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("FIRST_EDU_DATE <=", value, "firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("FIRST_EDU_DATE in", values, "firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("FIRST_EDU_DATE not in", values,
					"firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("FIRST_EDU_DATE between", value1, value2,
					"firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("FIRST_EDU_DATE not between", value1,
					value2, "firstEduDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolIsNull() {
			addCriterion("FIRST_EDU_SCHOOL is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolIsNotNull() {
			addCriterion("FIRST_EDU_SCHOOL is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolEqualTo(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL =", value, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolNotEqualTo(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL <>", value, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolGreaterThan(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL >", value, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolGreaterThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL >=", value, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolLessThan(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL <", value, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolLessThanOrEqualTo(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL <=", value, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolLike(String value) {
			addCriterion("FIRST_EDU_SCHOOL like", value, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolNotLike(
				String value) {
			addCriterion("FIRST_EDU_SCHOOL not like", value, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolIn(
				List<String> values) {
			addCriterion("FIRST_EDU_SCHOOL in", values, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolNotIn(
				List<String> values) {
			addCriterion("FIRST_EDU_SCHOOL not in", values, "firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolBetween(
				String value1, String value2) {
			addCriterion("FIRST_EDU_SCHOOL between", value1, value2,
					"firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andFirstEduSchoolNotBetween(
				String value1, String value2) {
			addCriterion("FIRST_EDU_SCHOOL not between", value1, value2,
					"firstEduSchool");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeIsNull() {
			addCriterion("TEACHER_BOOK_TYPE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeIsNotNull() {
			addCriterion("TEACHER_BOOK_TYPE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE =", value, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeNotEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE <>", value, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeGreaterThan(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE >", value, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE >=", value, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeLessThan(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE <", value, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE <=", value, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeLike(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE like", value, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeNotLike(
				String value) {
			addCriterion("TEACHER_BOOK_TYPE not like", value, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeIn(
				List<String> values) {
			addCriterion("TEACHER_BOOK_TYPE in", values, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeNotIn(
				List<String> values) {
			addCriterion("TEACHER_BOOK_TYPE not in", values, "teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeBetween(
				String value1, String value2) {
			addCriterion("TEACHER_BOOK_TYPE between", value1, value2,
					"teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookTypeNotBetween(
				String value1, String value2) {
			addCriterion("TEACHER_BOOK_TYPE not between", value1, value2,
					"teacherBookType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoIsNull() {
			addCriterion("TEACHER_BOOK_NO is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoIsNotNull() {
			addCriterion("TEACHER_BOOK_NO is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_NO =", value, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoNotEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_NO <>", value, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoGreaterThan(
				String value) {
			addCriterion("TEACHER_BOOK_NO >", value, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_NO >=", value, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoLessThan(
				String value) {
			addCriterion("TEACHER_BOOK_NO <", value, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHER_BOOK_NO <=", value, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoLike(String value) {
			addCriterion("TEACHER_BOOK_NO like", value, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoNotLike(
				String value) {
			addCriterion("TEACHER_BOOK_NO not like", value, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoIn(
				List<String> values) {
			addCriterion("TEACHER_BOOK_NO in", values, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoNotIn(
				List<String> values) {
			addCriterion("TEACHER_BOOK_NO not in", values, "teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoBetween(
				String value1, String value2) {
			addCriterion("TEACHER_BOOK_NO between", value1, value2,
					"teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeacherBookNoNotBetween(
				String value1, String value2) {
			addCriterion("TEACHER_BOOK_NO not between", value1, value2,
					"teacherBookNo");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeIsNull() {
			addCriterion("GET_HSKBOOK_GRADE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeIsNotNull() {
			addCriterion("GET_HSKBOOK_GRADE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeEqualTo(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE =", value, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeNotEqualTo(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE <>", value, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeGreaterThan(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE >", value, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeGreaterThanOrEqualTo(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE >=", value, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeLessThan(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE <", value, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeLessThanOrEqualTo(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE <=", value, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeLike(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE like", value, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeNotLike(
				String value) {
			addCriterion("GET_HSKBOOK_GRADE not like", value, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeIn(
				List<String> values) {
			addCriterion("GET_HSKBOOK_GRADE in", values, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeNotIn(
				List<String> values) {
			addCriterion("GET_HSKBOOK_GRADE not in", values, "getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeBetween(
				String value1, String value2) {
			addCriterion("GET_HSKBOOK_GRADE between", value1, value2,
					"getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetHskbookGradeNotBetween(
				String value1, String value2) {
			addCriterion("GET_HSKBOOK_GRADE not between", value1, value2,
					"getHskbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateIsNull() {
			addCriterion("HSKBOOK_DATE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateIsNotNull() {
			addCriterion("HSKBOOK_DATE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE =", value, "hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE <>", value, "hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE >", value, "hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE >=", value, "hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE <", value, "hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("HSKBOOK_DATE <=", value, "hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("HSKBOOK_DATE in", values, "hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("HSKBOOK_DATE not in", values,
					"hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("HSKBOOK_DATE between", value1, value2,
					"hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHskbookDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("HSKBOOK_DATE not between", value1, value2,
					"hskbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeIsNull() {
			addCriterion("GET_MHKBOOK_GRADE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeIsNotNull() {
			addCriterion("GET_MHKBOOK_GRADE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeEqualTo(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE =", value, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeNotEqualTo(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE <>", value, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeGreaterThan(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE >", value, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeGreaterThanOrEqualTo(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE >=", value, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeLessThan(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE <", value, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeLessThanOrEqualTo(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE <=", value, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeLike(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE like", value, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeNotLike(
				String value) {
			addCriterion("GET_MHKBOOK_GRADE not like", value, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeIn(
				List<String> values) {
			addCriterion("GET_MHKBOOK_GRADE in", values, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeNotIn(
				List<String> values) {
			addCriterion("GET_MHKBOOK_GRADE not in", values, "getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeBetween(
				String value1, String value2) {
			addCriterion("GET_MHKBOOK_GRADE between", value1, value2,
					"getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andGetMhkbookGradeNotBetween(
				String value1, String value2) {
			addCriterion("GET_MHKBOOK_GRADE not between", value1, value2,
					"getMhkbookGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateIsNull() {
			addCriterion("MHKBOOK_DATE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateIsNotNull() {
			addCriterion("MHKBOOK_DATE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE =", value, "mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE <>", value, "mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE >", value, "mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE >=", value, "mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE <", value, "mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("MHKBOOK_DATE <=", value, "mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("MHKBOOK_DATE in", values, "mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("MHKBOOK_DATE not in", values,
					"mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("MHKBOOK_DATE between", value1, value2,
					"mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMhkbookDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("MHKBOOK_DATE not between", value1, value2,
					"mhkbookDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelIsNull() {
			addCriterion("PUTONGHUA_LEVEL is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelIsNotNull() {
			addCriterion("PUTONGHUA_LEVEL is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelEqualTo(
				String value) {
			addCriterion("PUTONGHUA_LEVEL =", value, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelNotEqualTo(
				String value) {
			addCriterion("PUTONGHUA_LEVEL <>", value, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelGreaterThan(
				String value) {
			addCriterion("PUTONGHUA_LEVEL >", value, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelGreaterThanOrEqualTo(
				String value) {
			addCriterion("PUTONGHUA_LEVEL >=", value, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelLessThan(
				String value) {
			addCriterion("PUTONGHUA_LEVEL <", value, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelLessThanOrEqualTo(
				String value) {
			addCriterion("PUTONGHUA_LEVEL <=", value, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelLike(String value) {
			addCriterion("PUTONGHUA_LEVEL like", value, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelNotLike(
				String value) {
			addCriterion("PUTONGHUA_LEVEL not like", value, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelIn(
				List<String> values) {
			addCriterion("PUTONGHUA_LEVEL in", values, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelNotIn(
				List<String> values) {
			addCriterion("PUTONGHUA_LEVEL not in", values, "putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelBetween(
				String value1, String value2) {
			addCriterion("PUTONGHUA_LEVEL between", value1, value2,
					"putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaLevelNotBetween(
				String value1, String value2) {
			addCriterion("PUTONGHUA_LEVEL not between", value1, value2,
					"putonghuaLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateIsNull() {
			addCriterion("PUTONGHUA_DATE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateIsNotNull() {
			addCriterion("PUTONGHUA_DATE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE =", value, "putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE <>", value, "putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE >", value, "putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE >=", value, "putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE <", value, "putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PUTONGHUA_DATE <=", value, "putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("PUTONGHUA_DATE in", values,
					"putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("PUTONGHUA_DATE not in", values,
					"putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("PUTONGHUA_DATE between", value1, value2,
					"putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPutonghuaDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("PUTONGHUA_DATE not between", value1,
					value2, "putonghuaDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateIsNull() {
			addCriterion("START_TEACHING_DATE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateIsNotNull() {
			addCriterion("START_TEACHING_DATE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE =", value,
					"startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE <>", value,
					"startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE >", value,
					"startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE >=", value,
					"startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE <", value,
					"startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("START_TEACHING_DATE <=", value,
					"startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("START_TEACHING_DATE in", values,
					"startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("START_TEACHING_DATE not in", values,
					"startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("START_TEACHING_DATE between", value1,
					value2, "startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStartTeachingDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("START_TEACHING_DATE not between", value1,
					value2, "startTeachingDate");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalIsNull() {
			addCriterion("POST_EMEPLOY_TECHNICAL is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalIsNotNull() {
			addCriterion("POST_EMEPLOY_TECHNICAL is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalEqualTo(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL =", value,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalNotEqualTo(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL <>", value,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalGreaterThan(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL >", value,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalGreaterThanOrEqualTo(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL >=", value,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalLessThan(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL <", value,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalLessThanOrEqualTo(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL <=", value,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalLike(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL like", value,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalNotLike(
				String value) {
			addCriterion("POST_EMEPLOY_TECHNICAL not like", value,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalIn(
				List<String> values) {
			addCriterion("POST_EMEPLOY_TECHNICAL in", values,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalNotIn(
				List<String> values) {
			addCriterion("POST_EMEPLOY_TECHNICAL not in", values,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalBetween(
				String value1, String value2) {
			addCriterion("POST_EMEPLOY_TECHNICAL between", value1, value2,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPostEmeployTechnicalNotBetween(
				String value1, String value2) {
			addCriterion("POST_EMEPLOY_TECHNICAL not between", value1, value2,
					"postEmeployTechnical");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostIsNull() {
			addCriterion("PROFESSIONAL_POST is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostIsNotNull() {
			addCriterion("PROFESSIONAL_POST is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostEqualTo(
				String value) {
			addCriterion("PROFESSIONAL_POST =", value, "professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostNotEqualTo(
				String value) {
			addCriterion("PROFESSIONAL_POST <>", value, "professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostGreaterThan(
				String value) {
			addCriterion("PROFESSIONAL_POST >", value, "professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostGreaterThanOrEqualTo(
				String value) {
			addCriterion("PROFESSIONAL_POST >=", value, "professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostLessThan(
				String value) {
			addCriterion("PROFESSIONAL_POST <", value, "professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostLessThanOrEqualTo(
				String value) {
			addCriterion("PROFESSIONAL_POST <=", value, "professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostLike(
				String value) {
			addCriterion("PROFESSIONAL_POST like", value, "professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostNotLike(
				String value) {
			addCriterion("PROFESSIONAL_POST not like", value,
					"professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostIn(
				List<String> values) {
			addCriterion("PROFESSIONAL_POST in", values, "professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostNotIn(
				List<String> values) {
			addCriterion("PROFESSIONAL_POST not in", values, "professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostBetween(
				String value1, String value2) {
			addCriterion("PROFESSIONAL_POST between", value1, value2,
					"professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andProfessionalPostNotBetween(
				String value1, String value2) {
			addCriterion("PROFESSIONAL_POST not between", value1, value2,
					"professionalPost");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionIsNull() {
			addCriterion("TEACHING_SECTION is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionIsNotNull() {
			addCriterion("TEACHING_SECTION is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionEqualTo(
				String value) {
			addCriterion("TEACHING_SECTION =", value, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionNotEqualTo(
				String value) {
			addCriterion("TEACHING_SECTION <>", value, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionGreaterThan(
				String value) {
			addCriterion("TEACHING_SECTION >", value, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_SECTION >=", value, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionLessThan(
				String value) {
			addCriterion("TEACHING_SECTION <", value, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_SECTION <=", value, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionLike(
				String value) {
			addCriterion("TEACHING_SECTION like", value, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionNotLike(
				String value) {
			addCriterion("TEACHING_SECTION not like", value, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionIn(
				List<String> values) {
			addCriterion("TEACHING_SECTION in", values, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionNotIn(
				List<String> values) {
			addCriterion("TEACHING_SECTION not in", values, "teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionBetween(
				String value1, String value2) {
			addCriterion("TEACHING_SECTION between", value1, value2,
					"teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSectionNotBetween(
				String value1, String value2) {
			addCriterion("TEACHING_SECTION not between", value1, value2,
					"teachingSection");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeIsNull() {
			addCriterion("TEACHING_GRADE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeIsNotNull() {
			addCriterion("TEACHING_GRADE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeEqualTo(
				String value) {
			addCriterion("TEACHING_GRADE =", value, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeNotEqualTo(
				String value) {
			addCriterion("TEACHING_GRADE <>", value, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeGreaterThan(
				String value) {
			addCriterion("TEACHING_GRADE >", value, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_GRADE >=", value, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeLessThan(
				String value) {
			addCriterion("TEACHING_GRADE <", value, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_GRADE <=", value, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeLike(String value) {
			addCriterion("TEACHING_GRADE like", value, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeNotLike(
				String value) {
			addCriterion("TEACHING_GRADE not like", value, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeIn(
				List<String> values) {
			addCriterion("TEACHING_GRADE in", values, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeNotIn(
				List<String> values) {
			addCriterion("TEACHING_GRADE not in", values, "teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeBetween(
				String value1, String value2) {
			addCriterion("TEACHING_GRADE between", value1, value2,
					"teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingGradeNotBetween(
				String value1, String value2) {
			addCriterion("TEACHING_GRADE not between", value1, value2,
					"teachingGrade");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectIsNull() {
			addCriterion("TEACHING_SUBJECT is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectIsNotNull() {
			addCriterion("TEACHING_SUBJECT is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectEqualTo(
				String value) {
			addCriterion("TEACHING_SUBJECT =", value, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectNotEqualTo(
				String value) {
			addCriterion("TEACHING_SUBJECT <>", value, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectGreaterThan(
				String value) {
			addCriterion("TEACHING_SUBJECT >", value, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_SUBJECT >=", value, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectLessThan(
				String value) {
			addCriterion("TEACHING_SUBJECT <", value, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectLessThanOrEqualTo(
				String value) {
			addCriterion("TEACHING_SUBJECT <=", value, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectLike(
				String value) {
			addCriterion("TEACHING_SUBJECT like", value, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectNotLike(
				String value) {
			addCriterion("TEACHING_SUBJECT not like", value, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectIn(
				List<String> values) {
			addCriterion("TEACHING_SUBJECT in", values, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectNotIn(
				List<String> values) {
			addCriterion("TEACHING_SUBJECT not in", values, "teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectBetween(
				String value1, String value2) {
			addCriterion("TEACHING_SUBJECT between", value1, value2,
					"teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachingSubjectNotBetween(
				String value1, String value2) {
			addCriterion("TEACHING_SUBJECT not between", value1, value2,
					"teachingSubject");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionIsNull() {
			addCriterion("NOTEACH_REASION is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionIsNotNull() {
			addCriterion("NOTEACH_REASION is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionEqualTo(
				String value) {
			addCriterion("NOTEACH_REASION =", value, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionNotEqualTo(
				String value) {
			addCriterion("NOTEACH_REASION <>", value, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionGreaterThan(
				String value) {
			addCriterion("NOTEACH_REASION >", value, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionGreaterThanOrEqualTo(
				String value) {
			addCriterion("NOTEACH_REASION >=", value, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionLessThan(
				String value) {
			addCriterion("NOTEACH_REASION <", value, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionLessThanOrEqualTo(
				String value) {
			addCriterion("NOTEACH_REASION <=", value, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionLike(String value) {
			addCriterion("NOTEACH_REASION like", value, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionNotLike(
				String value) {
			addCriterion("NOTEACH_REASION not like", value, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionIn(
				List<String> values) {
			addCriterion("NOTEACH_REASION in", values, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionNotIn(
				List<String> values) {
			addCriterion("NOTEACH_REASION not in", values, "noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionBetween(
				String value1, String value2) {
			addCriterion("NOTEACH_REASION between", value1, value2,
					"noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNoteachReasionNotBetween(
				String value1, String value2) {
			addCriterion("NOTEACH_REASION not between", value1, value2,
					"noteachReasion");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageIsNull() {
			addCriterion("TEACH_LANGUAGE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageIsNotNull() {
			addCriterion("TEACH_LANGUAGE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageEqualTo(
				String value) {
			addCriterion("TEACH_LANGUAGE =", value, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageNotEqualTo(
				String value) {
			addCriterion("TEACH_LANGUAGE <>", value, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageGreaterThan(
				String value) {
			addCriterion("TEACH_LANGUAGE >", value, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageGreaterThanOrEqualTo(
				String value) {
			addCriterion("TEACH_LANGUAGE >=", value, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageLessThan(
				String value) {
			addCriterion("TEACH_LANGUAGE <", value, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageLessThanOrEqualTo(
				String value) {
			addCriterion("TEACH_LANGUAGE <=", value, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageLike(String value) {
			addCriterion("TEACH_LANGUAGE like", value, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageNotLike(
				String value) {
			addCriterion("TEACH_LANGUAGE not like", value, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageIn(
				List<String> values) {
			addCriterion("TEACH_LANGUAGE in", values, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageNotIn(
				List<String> values) {
			addCriterion("TEACH_LANGUAGE not in", values, "teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageBetween(
				String value1, String value2) {
			addCriterion("TEACH_LANGUAGE between", value1, value2,
					"teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andTeachLanguageNotBetween(
				String value1, String value2) {
			addCriterion("TEACH_LANGUAGE not between", value1, value2,
					"teachLanguage");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherIsNull() {
			addCriterion("IS_NATIONTEACHER is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherIsNotNull() {
			addCriterion("IS_NATIONTEACHER is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherEqualTo(
				String value) {
			addCriterion("IS_NATIONTEACHER =", value, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherNotEqualTo(
				String value) {
			addCriterion("IS_NATIONTEACHER <>", value, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherGreaterThan(
				String value) {
			addCriterion("IS_NATIONTEACHER >", value, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_NATIONTEACHER >=", value, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherLessThan(
				String value) {
			addCriterion("IS_NATIONTEACHER <", value, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_NATIONTEACHER <=", value, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherLike(
				String value) {
			addCriterion("IS_NATIONTEACHER like", value, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherNotLike(
				String value) {
			addCriterion("IS_NATIONTEACHER not like", value, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherIn(
				List<String> values) {
			addCriterion("IS_NATIONTEACHER in", values, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherNotIn(
				List<String> values) {
			addCriterion("IS_NATIONTEACHER not in", values, "isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherBetween(
				String value1, String value2) {
			addCriterion("IS_NATIONTEACHER between", value1, value2,
					"isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsNationteacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_NATIONTEACHER not between", value1, value2,
					"isNationteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherIsNull() {
			addCriterion("IS_CHINESETEACHER is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherIsNotNull() {
			addCriterion("IS_CHINESETEACHER is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherEqualTo(
				String value) {
			addCriterion("IS_CHINESETEACHER =", value, "isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherNotEqualTo(
				String value) {
			addCriterion("IS_CHINESETEACHER <>", value, "isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherGreaterThan(
				String value) {
			addCriterion("IS_CHINESETEACHER >", value, "isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_CHINESETEACHER >=", value, "isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherLessThan(
				String value) {
			addCriterion("IS_CHINESETEACHER <", value, "isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_CHINESETEACHER <=", value, "isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherLike(
				String value) {
			addCriterion("IS_CHINESETEACHER like", value, "isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherNotLike(
				String value) {
			addCriterion("IS_CHINESETEACHER not like", value,
					"isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherIn(
				List<String> values) {
			addCriterion("IS_CHINESETEACHER in", values, "isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherNotIn(
				List<String> values) {
			addCriterion("IS_CHINESETEACHER not in", values, "isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherBetween(
				String value1, String value2) {
			addCriterion("IS_CHINESETEACHER between", value1, value2,
					"isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsChineseteacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_CHINESETEACHER not between", value1, value2,
					"isChineseteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherIsNull() {
			addCriterion("IS_DOUBLETEACHER is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherIsNotNull() {
			addCriterion("IS_DOUBLETEACHER is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherEqualTo(
				String value) {
			addCriterion("IS_DOUBLETEACHER =", value, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherNotEqualTo(
				String value) {
			addCriterion("IS_DOUBLETEACHER <>", value, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherGreaterThan(
				String value) {
			addCriterion("IS_DOUBLETEACHER >", value, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_DOUBLETEACHER >=", value, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherLessThan(
				String value) {
			addCriterion("IS_DOUBLETEACHER <", value, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_DOUBLETEACHER <=", value, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherLike(
				String value) {
			addCriterion("IS_DOUBLETEACHER like", value, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherNotLike(
				String value) {
			addCriterion("IS_DOUBLETEACHER not like", value, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherIn(
				List<String> values) {
			addCriterion("IS_DOUBLETEACHER in", values, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherNotIn(
				List<String> values) {
			addCriterion("IS_DOUBLETEACHER not in", values, "isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherBetween(
				String value1, String value2) {
			addCriterion("IS_DOUBLETEACHER between", value1, value2,
					"isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsDoubleteacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_DOUBLETEACHER not between", value1, value2,
					"isDoubleteacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelIsNull() {
			addCriterion("DOUBLE_TEACH_MODEL is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelIsNotNull() {
			addCriterion("DOUBLE_TEACH_MODEL is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelEqualTo(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL =", value, "doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelNotEqualTo(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL <>", value, "doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelGreaterThan(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL >", value, "doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelGreaterThanOrEqualTo(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL >=", value, "doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelLessThan(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL <", value, "doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelLessThanOrEqualTo(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL <=", value, "doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelLike(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL like", value, "doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelNotLike(
				String value) {
			addCriterion("DOUBLE_TEACH_MODEL not like", value,
					"doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelIn(
				List<String> values) {
			addCriterion("DOUBLE_TEACH_MODEL in", values, "doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelNotIn(
				List<String> values) {
			addCriterion("DOUBLE_TEACH_MODEL not in", values,
					"doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelBetween(
				String value1, String value2) {
			addCriterion("DOUBLE_TEACH_MODEL between", value1, value2,
					"doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andDoubleTeachModelNotBetween(
				String value1, String value2) {
			addCriterion("DOUBLE_TEACH_MODEL not between", value1, value2,
					"doubleTeachModel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityIsNull() {
			addCriterion("IS_ABILITY is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityIsNotNull() {
			addCriterion("IS_ABILITY is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityEqualTo(String value) {
			addCriterion("IS_ABILITY =", value, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityNotEqualTo(
				String value) {
			addCriterion("IS_ABILITY <>", value, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityGreaterThan(
				String value) {
			addCriterion("IS_ABILITY >", value, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_ABILITY >=", value, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityLessThan(String value) {
			addCriterion("IS_ABILITY <", value, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityLessThanOrEqualTo(
				String value) {
			addCriterion("IS_ABILITY <=", value, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityLike(String value) {
			addCriterion("IS_ABILITY like", value, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityNotLike(String value) {
			addCriterion("IS_ABILITY not like", value, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityIn(List<String> values) {
			addCriterion("IS_ABILITY in", values, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityNotIn(
				List<String> values) {
			addCriterion("IS_ABILITY not in", values, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityBetween(
				String value1, String value2) {
			addCriterion("IS_ABILITY between", value1, value2, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsAbilityNotBetween(
				String value1, String value2) {
			addCriterion("IS_ABILITY not between", value1, value2, "isAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherIsNull() {
			addCriterion("IS_ETHNIC_TEACHER is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherIsNotNull() {
			addCriterion("IS_ETHNIC_TEACHER is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherEqualTo(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER =", value, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherNotEqualTo(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER <>", value, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherGreaterThan(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER >", value, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER >=", value, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherLessThan(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER <", value, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER <=", value, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherLike(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER like", value, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherNotLike(
				String value) {
			addCriterion("IS_ETHNIC_TEACHER not like", value, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherIn(
				List<String> values) {
			addCriterion("IS_ETHNIC_TEACHER in", values, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherNotIn(
				List<String> values) {
			addCriterion("IS_ETHNIC_TEACHER not in", values, "isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherBetween(
				String value1, String value2) {
			addCriterion("IS_ETHNIC_TEACHER between", value1, value2,
					"isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsEthnicTeacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_ETHNIC_TEACHER not between", value1, value2,
					"isEthnicTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherIsNull() {
			addCriterion("IS_SPECIALLEVEL_TEACHER is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherIsNotNull() {
			addCriterion("IS_SPECIALLEVEL_TEACHER is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherEqualTo(
				String value) {
			addCriterion("IS_SPECIALLEVEL_TEACHER =", value,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherNotEqualTo(
				String value) {
			addCriterion("IS_SPECIALLEVEL_TEACHER <>", value,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherGreaterThan(
				String value) {
			addCriterion("IS_SPECIALLEVEL_TEACHER >", value,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIALLEVEL_TEACHER >=", value,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherLessThan(
				String value) {
			addCriterion("IS_SPECIALLEVEL_TEACHER <", value,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIALLEVEL_TEACHER <=", value,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherLike(
				String value) {
			addCriterion("IS_SPECIALLEVEL_TEACHER like", value,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherNotLike(
				String value) {
			addCriterion("IS_SPECIALLEVEL_TEACHER not like", value,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherIn(
				List<String> values) {
			addCriterion("IS_SPECIALLEVEL_TEACHER in", values,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherNotIn(
				List<String> values) {
			addCriterion("IS_SPECIALLEVEL_TEACHER not in", values,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIALLEVEL_TEACHER between", value1, value2,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpeciallevelTeacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIALLEVEL_TEACHER not between", value1, value2,
					"isSpeciallevelTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainIsNull() {
			addCriterion("IS_SPECIAL_TRAIN is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainIsNotNull() {
			addCriterion("IS_SPECIAL_TRAIN is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN =", value, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainNotEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN <>", value, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainGreaterThan(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN >", value, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN >=", value, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainLessThan(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN <", value, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainLessThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN <=", value, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainLike(String value) {
			addCriterion("IS_SPECIAL_TRAIN like", value, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainNotLike(
				String value) {
			addCriterion("IS_SPECIAL_TRAIN not like", value, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainIn(
				List<String> values) {
			addCriterion("IS_SPECIAL_TRAIN in", values, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainNotIn(
				List<String> values) {
			addCriterion("IS_SPECIAL_TRAIN not in", values, "isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIAL_TRAIN between", value1, value2,
					"isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialTrainNotBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIAL_TRAIN not between", value1, value2,
					"isSpecialTrain");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationIsNull() {
			addCriterion("SITUATION is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationIsNotNull() {
			addCriterion("SITUATION is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationEqualTo(String value) {
			addCriterion("SITUATION =", value, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationNotEqualTo(
				String value) {
			addCriterion("SITUATION <>", value, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationGreaterThan(
				String value) {
			addCriterion("SITUATION >", value, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationGreaterThanOrEqualTo(
				String value) {
			addCriterion("SITUATION >=", value, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationLessThan(String value) {
			addCriterion("SITUATION <", value, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationLessThanOrEqualTo(
				String value) {
			addCriterion("SITUATION <=", value, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationLike(String value) {
			addCriterion("SITUATION like", value, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationNotLike(String value) {
			addCriterion("SITUATION not like", value, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationIn(List<String> values) {
			addCriterion("SITUATION in", values, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationNotIn(
				List<String> values) {
			addCriterion("SITUATION not in", values, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationBetween(
				String value1, String value2) {
			addCriterion("SITUATION between", value1, value2, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andSituationNotBetween(
				String value1, String value2) {
			addCriterion("SITUATION not between", value1, value2, "situation");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherIsNull() {
			addCriterion("IS_BACKONE_TEACHER is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherIsNotNull() {
			addCriterion("IS_BACKONE_TEACHER is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherEqualTo(
				String value) {
			addCriterion("IS_BACKONE_TEACHER =", value, "isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherNotEqualTo(
				String value) {
			addCriterion("IS_BACKONE_TEACHER <>", value, "isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherGreaterThan(
				String value) {
			addCriterion("IS_BACKONE_TEACHER >", value, "isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_BACKONE_TEACHER >=", value, "isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherLessThan(
				String value) {
			addCriterion("IS_BACKONE_TEACHER <", value, "isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_BACKONE_TEACHER <=", value, "isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherLike(
				String value) {
			addCriterion("IS_BACKONE_TEACHER like", value, "isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherNotLike(
				String value) {
			addCriterion("IS_BACKONE_TEACHER not like", value,
					"isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherIn(
				List<String> values) {
			addCriterion("IS_BACKONE_TEACHER in", values, "isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherNotIn(
				List<String> values) {
			addCriterion("IS_BACKONE_TEACHER not in", values,
					"isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherBetween(
				String value1, String value2) {
			addCriterion("IS_BACKONE_TEACHER between", value1, value2,
					"isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsBackoneTeacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_BACKONE_TEACHER not between", value1, value2,
					"isBackoneTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseIsNull() {
			addCriterion("STAFF_INCREASE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseIsNotNull() {
			addCriterion("STAFF_INCREASE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseEqualTo(
				String value) {
			addCriterion("STAFF_INCREASE =", value, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseNotEqualTo(
				String value) {
			addCriterion("STAFF_INCREASE <>", value, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseGreaterThan(
				String value) {
			addCriterion("STAFF_INCREASE >", value, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseGreaterThanOrEqualTo(
				String value) {
			addCriterion("STAFF_INCREASE >=", value, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseLessThan(
				String value) {
			addCriterion("STAFF_INCREASE <", value, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseLessThanOrEqualTo(
				String value) {
			addCriterion("STAFF_INCREASE <=", value, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseLike(String value) {
			addCriterion("STAFF_INCREASE like", value, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseNotLike(
				String value) {
			addCriterion("STAFF_INCREASE not like", value, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseIn(
				List<String> values) {
			addCriterion("STAFF_INCREASE in", values, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseNotIn(
				List<String> values) {
			addCriterion("STAFF_INCREASE not in", values, "staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseBetween(
				String value1, String value2) {
			addCriterion("STAFF_INCREASE between", value1, value2,
					"staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffIncreaseNotBetween(
				String value1, String value2) {
			addCriterion("STAFF_INCREASE not between", value1, value2,
					"staffIncrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseIsNull() {
			addCriterion("STAFF_DECREASE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseIsNotNull() {
			addCriterion("STAFF_DECREASE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseEqualTo(
				String value) {
			addCriterion("STAFF_DECREASE =", value, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseNotEqualTo(
				String value) {
			addCriterion("STAFF_DECREASE <>", value, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseGreaterThan(
				String value) {
			addCriterion("STAFF_DECREASE >", value, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseGreaterThanOrEqualTo(
				String value) {
			addCriterion("STAFF_DECREASE >=", value, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseLessThan(
				String value) {
			addCriterion("STAFF_DECREASE <", value, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseLessThanOrEqualTo(
				String value) {
			addCriterion("STAFF_DECREASE <=", value, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseLike(String value) {
			addCriterion("STAFF_DECREASE like", value, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseNotLike(
				String value) {
			addCriterion("STAFF_DECREASE not like", value, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseIn(
				List<String> values) {
			addCriterion("STAFF_DECREASE in", values, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseNotIn(
				List<String> values) {
			addCriterion("STAFF_DECREASE not in", values, "staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseBetween(
				String value1, String value2) {
			addCriterion("STAFF_DECREASE between", value1, value2,
					"staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffDecreaseNotBetween(
				String value1, String value2) {
			addCriterion("STAFF_DECREASE not between", value1, value2,
					"staffDecrease");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeIsNull() {
			addCriterion("PERSON_CODE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeIsNotNull() {
			addCriterion("PERSON_CODE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeEqualTo(String value) {
			addCriterion("PERSON_CODE =", value, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeNotEqualTo(
				String value) {
			addCriterion("PERSON_CODE <>", value, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeGreaterThan(
				String value) {
			addCriterion("PERSON_CODE >", value, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeGreaterThanOrEqualTo(
				String value) {
			addCriterion("PERSON_CODE >=", value, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeLessThan(String value) {
			addCriterion("PERSON_CODE <", value, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeLessThanOrEqualTo(
				String value) {
			addCriterion("PERSON_CODE <=", value, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeLike(String value) {
			addCriterion("PERSON_CODE like", value, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeNotLike(String value) {
			addCriterion("PERSON_CODE not like", value, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeIn(
				List<String> values) {
			addCriterion("PERSON_CODE in", values, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeNotIn(
				List<String> values) {
			addCriterion("PERSON_CODE not in", values, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeBetween(
				String value1, String value2) {
			addCriterion("PERSON_CODE between", value1, value2, "personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonCodeNotBetween(
				String value1, String value2) {
			addCriterion("PERSON_CODE not between", value1, value2,
					"personCode");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberIsNull() {
			addCriterion("STAFF_NUMBER is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberIsNotNull() {
			addCriterion("STAFF_NUMBER is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberEqualTo(String value) {
			addCriterion("STAFF_NUMBER =", value, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberNotEqualTo(
				String value) {
			addCriterion("STAFF_NUMBER <>", value, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberGreaterThan(
				String value) {
			addCriterion("STAFF_NUMBER >", value, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberGreaterThanOrEqualTo(
				String value) {
			addCriterion("STAFF_NUMBER >=", value, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberLessThan(
				String value) {
			addCriterion("STAFF_NUMBER <", value, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberLessThanOrEqualTo(
				String value) {
			addCriterion("STAFF_NUMBER <=", value, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberLike(String value) {
			addCriterion("STAFF_NUMBER like", value, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberNotLike(String value) {
			addCriterion("STAFF_NUMBER not like", value, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberIn(
				List<String> values) {
			addCriterion("STAFF_NUMBER in", values, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberNotIn(
				List<String> values) {
			addCriterion("STAFF_NUMBER not in", values, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberBetween(
				String value1, String value2) {
			addCriterion("STAFF_NUMBER between", value1, value2, "staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffNumberNotBetween(
				String value1, String value2) {
			addCriterion("STAFF_NUMBER not between", value1, value2,
					"staffNumber");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaIsNull() {
			addCriterion("NATION_AREA is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaIsNotNull() {
			addCriterion("NATION_AREA is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaEqualTo(String value) {
			addCriterion("NATION_AREA =", value, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaNotEqualTo(
				String value) {
			addCriterion("NATION_AREA <>", value, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaGreaterThan(
				String value) {
			addCriterion("NATION_AREA >", value, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaGreaterThanOrEqualTo(
				String value) {
			addCriterion("NATION_AREA >=", value, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaLessThan(String value) {
			addCriterion("NATION_AREA <", value, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaLessThanOrEqualTo(
				String value) {
			addCriterion("NATION_AREA <=", value, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaLike(String value) {
			addCriterion("NATION_AREA like", value, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaNotLike(String value) {
			addCriterion("NATION_AREA not like", value, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaIn(
				List<String> values) {
			addCriterion("NATION_AREA in", values, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaNotIn(
				List<String> values) {
			addCriterion("NATION_AREA not in", values, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaBetween(
				String value1, String value2) {
			addCriterion("NATION_AREA between", value1, value2, "nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNationAreaNotBetween(
				String value1, String value2) {
			addCriterion("NATION_AREA not between", value1, value2,
					"nationArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaIsNull() {
			addCriterion("BIRTH_AREA is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaIsNotNull() {
			addCriterion("BIRTH_AREA is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaEqualTo(String value) {
			addCriterion("BIRTH_AREA =", value, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaNotEqualTo(
				String value) {
			addCriterion("BIRTH_AREA <>", value, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaGreaterThan(
				String value) {
			addCriterion("BIRTH_AREA >", value, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaGreaterThanOrEqualTo(
				String value) {
			addCriterion("BIRTH_AREA >=", value, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaLessThan(String value) {
			addCriterion("BIRTH_AREA <", value, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaLessThanOrEqualTo(
				String value) {
			addCriterion("BIRTH_AREA <=", value, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaLike(String value) {
			addCriterion("BIRTH_AREA like", value, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaNotLike(String value) {
			addCriterion("BIRTH_AREA not like", value, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaIn(List<String> values) {
			addCriterion("BIRTH_AREA in", values, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaNotIn(
				List<String> values) {
			addCriterion("BIRTH_AREA not in", values, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaBetween(
				String value1, String value2) {
			addCriterion("BIRTH_AREA between", value1, value2, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andBirthAreaNotBetween(
				String value1, String value2) {
			addCriterion("BIRTH_AREA not between", value1, value2, "birthArea");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusIsNull() {
			addCriterion("MARITAL_STATUS is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusIsNotNull() {
			addCriterion("MARITAL_STATUS is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusEqualTo(
				String value) {
			addCriterion("MARITAL_STATUS =", value, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusNotEqualTo(
				String value) {
			addCriterion("MARITAL_STATUS <>", value, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusGreaterThan(
				String value) {
			addCriterion("MARITAL_STATUS >", value, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusGreaterThanOrEqualTo(
				String value) {
			addCriterion("MARITAL_STATUS >=", value, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusLessThan(
				String value) {
			addCriterion("MARITAL_STATUS <", value, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusLessThanOrEqualTo(
				String value) {
			addCriterion("MARITAL_STATUS <=", value, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusLike(String value) {
			addCriterion("MARITAL_STATUS like", value, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusNotLike(
				String value) {
			addCriterion("MARITAL_STATUS not like", value, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusIn(
				List<String> values) {
			addCriterion("MARITAL_STATUS in", values, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusNotIn(
				List<String> values) {
			addCriterion("MARITAL_STATUS not in", values, "maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusBetween(
				String value1, String value2) {
			addCriterion("MARITAL_STATUS between", value1, value2,
					"maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andMaritalStatusNotBetween(
				String value1, String value2) {
			addCriterion("MARITAL_STATUS not between", value1, value2,
					"maritalStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthIsNull() {
			addCriterion("HEALTH is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthIsNotNull() {
			addCriterion("HEALTH is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthEqualTo(String value) {
			addCriterion("HEALTH =", value, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthNotEqualTo(String value) {
			addCriterion("HEALTH <>", value, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthGreaterThan(String value) {
			addCriterion("HEALTH >", value, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthGreaterThanOrEqualTo(
				String value) {
			addCriterion("HEALTH >=", value, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthLessThan(String value) {
			addCriterion("HEALTH <", value, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthLessThanOrEqualTo(
				String value) {
			addCriterion("HEALTH <=", value, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthLike(String value) {
			addCriterion("HEALTH like", value, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthNotLike(String value) {
			addCriterion("HEALTH not like", value, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthIn(List<String> values) {
			addCriterion("HEALTH in", values, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthNotIn(List<String> values) {
			addCriterion("HEALTH not in", values, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthBetween(String value1,
				String value2) {
			addCriterion("HEALTH between", value1, value2, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHealthNotBetween(
				String value1, String value2) {
			addCriterion("HEALTH not between", value1, value2, "health");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeIsNull() {
			addCriterion("JOIN_SCHOOL_TIME is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeIsNotNull() {
			addCriterion("JOIN_SCHOOL_TIME is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME =", value,
					"joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME <>", value,
					"joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME >", value,
					"joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME >=", value,
					"joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME <", value,
					"joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME <=", value,
					"joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME in", values,
					"joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME not in", values,
					"joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME between", value1, value2,
					"joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andJoinSchoolTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("JOIN_SCHOOL_TIME not between", value1,
					value2, "joinSchoolTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceIsNull() {
			addCriterion("STAFF_SOURCE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceIsNotNull() {
			addCriterion("STAFF_SOURCE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceEqualTo(String value) {
			addCriterion("STAFF_SOURCE =", value, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceNotEqualTo(
				String value) {
			addCriterion("STAFF_SOURCE <>", value, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceGreaterThan(
				String value) {
			addCriterion("STAFF_SOURCE >", value, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceGreaterThanOrEqualTo(
				String value) {
			addCriterion("STAFF_SOURCE >=", value, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceLessThan(
				String value) {
			addCriterion("STAFF_SOURCE <", value, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceLessThanOrEqualTo(
				String value) {
			addCriterion("STAFF_SOURCE <=", value, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceLike(String value) {
			addCriterion("STAFF_SOURCE like", value, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceNotLike(String value) {
			addCriterion("STAFF_SOURCE not like", value, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceIn(
				List<String> values) {
			addCriterion("STAFF_SOURCE in", values, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceNotIn(
				List<String> values) {
			addCriterion("STAFF_SOURCE not in", values, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceBetween(
				String value1, String value2) {
			addCriterion("STAFF_SOURCE between", value1, value2, "staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffSourceNotBetween(
				String value1, String value2) {
			addCriterion("STAFF_SOURCE not between", value1, value2,
					"staffSource");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeIsNull() {
			addCriterion("STAFF_TYPE is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeIsNotNull() {
			addCriterion("STAFF_TYPE is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeEqualTo(String value) {
			addCriterion("STAFF_TYPE =", value, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeNotEqualTo(
				String value) {
			addCriterion("STAFF_TYPE <>", value, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeGreaterThan(
				String value) {
			addCriterion("STAFF_TYPE >", value, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeGreaterThanOrEqualTo(
				String value) {
			addCriterion("STAFF_TYPE >=", value, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeLessThan(String value) {
			addCriterion("STAFF_TYPE <", value, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeLessThanOrEqualTo(
				String value) {
			addCriterion("STAFF_TYPE <=", value, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeLike(String value) {
			addCriterion("STAFF_TYPE like", value, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeNotLike(String value) {
			addCriterion("STAFF_TYPE not like", value, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeIn(List<String> values) {
			addCriterion("STAFF_TYPE in", values, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeNotIn(
				List<String> values) {
			addCriterion("STAFF_TYPE not in", values, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeBetween(
				String value1, String value2) {
			addCriterion("STAFF_TYPE between", value1, value2, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andStaffTypeNotBetween(
				String value1, String value2) {
			addCriterion("STAFF_TYPE not between", value1, value2, "staffType");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormIsNull() {
			addCriterion("HUMAN_FORM is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormIsNotNull() {
			addCriterion("HUMAN_FORM is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormEqualTo(String value) {
			addCriterion("HUMAN_FORM =", value, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormNotEqualTo(
				String value) {
			addCriterion("HUMAN_FORM <>", value, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormGreaterThan(
				String value) {
			addCriterion("HUMAN_FORM >", value, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormGreaterThanOrEqualTo(
				String value) {
			addCriterion("HUMAN_FORM >=", value, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormLessThan(String value) {
			addCriterion("HUMAN_FORM <", value, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormLessThanOrEqualTo(
				String value) {
			addCriterion("HUMAN_FORM <=", value, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormLike(String value) {
			addCriterion("HUMAN_FORM like", value, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormNotLike(String value) {
			addCriterion("HUMAN_FORM not like", value, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormIn(List<String> values) {
			addCriterion("HUMAN_FORM in", values, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormNotIn(
				List<String> values) {
			addCriterion("HUMAN_FORM not in", values, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormBetween(
				String value1, String value2) {
			addCriterion("HUMAN_FORM between", value1, value2, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andHumanFormNotBetween(
				String value1, String value2) {
			addCriterion("HUMAN_FORM not between", value1, value2, "humanForm");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignIsNull() {
			addCriterion("CONTRACT_SIGN is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignIsNotNull() {
			addCriterion("CONTRACT_SIGN is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignEqualTo(
				String value) {
			addCriterion("CONTRACT_SIGN =", value, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignNotEqualTo(
				String value) {
			addCriterion("CONTRACT_SIGN <>", value, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignGreaterThan(
				String value) {
			addCriterion("CONTRACT_SIGN >", value, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignGreaterThanOrEqualTo(
				String value) {
			addCriterion("CONTRACT_SIGN >=", value, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignLessThan(
				String value) {
			addCriterion("CONTRACT_SIGN <", value, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignLessThanOrEqualTo(
				String value) {
			addCriterion("CONTRACT_SIGN <=", value, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignLike(String value) {
			addCriterion("CONTRACT_SIGN like", value, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignNotLike(
				String value) {
			addCriterion("CONTRACT_SIGN not like", value, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignIn(
				List<String> values) {
			addCriterion("CONTRACT_SIGN in", values, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignNotIn(
				List<String> values) {
			addCriterion("CONTRACT_SIGN not in", values, "contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignBetween(
				String value1, String value2) {
			addCriterion("CONTRACT_SIGN between", value1, value2,
					"contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andContractSignNotBetween(
				String value1, String value2) {
			addCriterion("CONTRACT_SIGN not between", value1, value2,
					"contractSign");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelIsNull() {
			addCriterion("NOW_POST_LEVEL is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelIsNotNull() {
			addCriterion("NOW_POST_LEVEL is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelEqualTo(
				String value) {
			addCriterion("NOW_POST_LEVEL =", value, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelNotEqualTo(
				String value) {
			addCriterion("NOW_POST_LEVEL <>", value, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelGreaterThan(
				String value) {
			addCriterion("NOW_POST_LEVEL >", value, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelGreaterThanOrEqualTo(
				String value) {
			addCriterion("NOW_POST_LEVEL >=", value, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelLessThan(
				String value) {
			addCriterion("NOW_POST_LEVEL <", value, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelLessThanOrEqualTo(
				String value) {
			addCriterion("NOW_POST_LEVEL <=", value, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelLike(String value) {
			addCriterion("NOW_POST_LEVEL like", value, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelNotLike(
				String value) {
			addCriterion("NOW_POST_LEVEL not like", value, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelIn(
				List<String> values) {
			addCriterion("NOW_POST_LEVEL in", values, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelNotIn(
				List<String> values) {
			addCriterion("NOW_POST_LEVEL not in", values, "nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelBetween(
				String value1, String value2) {
			addCriterion("NOW_POST_LEVEL between", value1, value2,
					"nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowPostLevelNotBetween(
				String value1, String value2) {
			addCriterion("NOW_POST_LEVEL not between", value1, value2,
					"nowPostLevel");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdIsNull() {
			addCriterion("IS_FULLTIME_GRD is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdIsNotNull() {
			addCriterion("IS_FULLTIME_GRD is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdEqualTo(
				String value) {
			addCriterion("IS_FULLTIME_GRD =", value, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdNotEqualTo(
				String value) {
			addCriterion("IS_FULLTIME_GRD <>", value, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdGreaterThan(
				String value) {
			addCriterion("IS_FULLTIME_GRD >", value, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_FULLTIME_GRD >=", value, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdLessThan(
				String value) {
			addCriterion("IS_FULLTIME_GRD <", value, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdLessThanOrEqualTo(
				String value) {
			addCriterion("IS_FULLTIME_GRD <=", value, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdLike(String value) {
			addCriterion("IS_FULLTIME_GRD like", value, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdNotLike(
				String value) {
			addCriterion("IS_FULLTIME_GRD not like", value, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdIn(
				List<String> values) {
			addCriterion("IS_FULLTIME_GRD in", values, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdNotIn(
				List<String> values) {
			addCriterion("IS_FULLTIME_GRD not in", values, "isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdBetween(
				String value1, String value2) {
			addCriterion("IS_FULLTIME_GRD between", value1, value2,
					"isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFulltimeGrdNotBetween(
				String value1, String value2) {
			addCriterion("IS_FULLTIME_GRD not between", value1, value2,
					"isFulltimeGrd");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookIsNull() {
			addCriterion("IS_SPECIAL_EDU_BOOK is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookIsNotNull() {
			addCriterion("IS_SPECIAL_EDU_BOOK is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_EDU_BOOK =", value, "isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookNotEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_EDU_BOOK <>", value, "isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookGreaterThan(
				String value) {
			addCriterion("IS_SPECIAL_EDU_BOOK >", value, "isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_EDU_BOOK >=", value, "isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookLessThan(
				String value) {
			addCriterion("IS_SPECIAL_EDU_BOOK <", value, "isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookLessThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIAL_EDU_BOOK <=", value, "isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookLike(
				String value) {
			addCriterion("IS_SPECIAL_EDU_BOOK like", value, "isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookNotLike(
				String value) {
			addCriterion("IS_SPECIAL_EDU_BOOK not like", value,
					"isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookIn(
				List<String> values) {
			addCriterion("IS_SPECIAL_EDU_BOOK in", values, "isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookNotIn(
				List<String> values) {
			addCriterion("IS_SPECIAL_EDU_BOOK not in", values,
					"isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIAL_EDU_BOOK between", value1, value2,
					"isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialEduBookNotBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIAL_EDU_BOOK not between", value1, value2,
					"isSpecialEduBook");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityIsNull() {
			addCriterion("APPLICATION_ABILITY is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityIsNotNull() {
			addCriterion("APPLICATION_ABILITY is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityEqualTo(
				String value) {
			addCriterion("APPLICATION_ABILITY =", value, "applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityNotEqualTo(
				String value) {
			addCriterion("APPLICATION_ABILITY <>", value, "applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityGreaterThan(
				String value) {
			addCriterion("APPLICATION_ABILITY >", value, "applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityGreaterThanOrEqualTo(
				String value) {
			addCriterion("APPLICATION_ABILITY >=", value, "applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityLessThan(
				String value) {
			addCriterion("APPLICATION_ABILITY <", value, "applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityLessThanOrEqualTo(
				String value) {
			addCriterion("APPLICATION_ABILITY <=", value, "applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityLike(
				String value) {
			addCriterion("APPLICATION_ABILITY like", value,
					"applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityNotLike(
				String value) {
			addCriterion("APPLICATION_ABILITY not like", value,
					"applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityIn(
				List<String> values) {
			addCriterion("APPLICATION_ABILITY in", values, "applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityNotIn(
				List<String> values) {
			addCriterion("APPLICATION_ABILITY not in", values,
					"applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityBetween(
				String value1, String value2) {
			addCriterion("APPLICATION_ABILITY between", value1, value2,
					"applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andApplicationAbilityNotBetween(
				String value1, String value2) {
			addCriterion("APPLICATION_ABILITY not between", value1, value2,
					"applicationAbility");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentIsNull() {
			addCriterion("IS_FREE_STUDENT is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentIsNotNull() {
			addCriterion("IS_FREE_STUDENT is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentEqualTo(
				String value) {
			addCriterion("IS_FREE_STUDENT =", value, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentNotEqualTo(
				String value) {
			addCriterion("IS_FREE_STUDENT <>", value, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentGreaterThan(
				String value) {
			addCriterion("IS_FREE_STUDENT >", value, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_FREE_STUDENT >=", value, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentLessThan(
				String value) {
			addCriterion("IS_FREE_STUDENT <", value, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentLessThanOrEqualTo(
				String value) {
			addCriterion("IS_FREE_STUDENT <=", value, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentLike(String value) {
			addCriterion("IS_FREE_STUDENT like", value, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentNotLike(
				String value) {
			addCriterion("IS_FREE_STUDENT not like", value, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentIn(
				List<String> values) {
			addCriterion("IS_FREE_STUDENT in", values, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentNotIn(
				List<String> values) {
			addCriterion("IS_FREE_STUDENT not in", values, "isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentBetween(
				String value1, String value2) {
			addCriterion("IS_FREE_STUDENT between", value1, value2,
					"isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsFreeStudentNotBetween(
				String value1, String value2) {
			addCriterion("IS_FREE_STUDENT not between", value1, value2,
					"isFreeStudent");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduIsNull() {
			addCriterion("IS_PART_EDU is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduIsNotNull() {
			addCriterion("IS_PART_EDU is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduEqualTo(String value) {
			addCriterion("IS_PART_EDU =", value, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduNotEqualTo(
				String value) {
			addCriterion("IS_PART_EDU <>", value, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduGreaterThan(
				String value) {
			addCriterion("IS_PART_EDU >", value, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_PART_EDU >=", value, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduLessThan(String value) {
			addCriterion("IS_PART_EDU <", value, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduLessThanOrEqualTo(
				String value) {
			addCriterion("IS_PART_EDU <=", value, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduLike(String value) {
			addCriterion("IS_PART_EDU like", value, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduNotLike(String value) {
			addCriterion("IS_PART_EDU not like", value, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduIn(List<String> values) {
			addCriterion("IS_PART_EDU in", values, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduNotIn(
				List<String> values) {
			addCriterion("IS_PART_EDU not in", values, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduBetween(
				String value1, String value2) {
			addCriterion("IS_PART_EDU between", value1, value2, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsPartEduNotBetween(
				String value1, String value2) {
			addCriterion("IS_PART_EDU not between", value1, value2, "isPartEdu");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeIsNull() {
			addCriterion("PART_EDU_STARTIME is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeIsNotNull() {
			addCriterion("PART_EDU_STARTIME is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_STARTIME =", value,
					"partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_STARTIME <>", value,
					"partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_STARTIME >", value,
					"partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_STARTIME >=", value,
					"partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_STARTIME <", value,
					"partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_STARTIME <=", value,
					"partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("PART_EDU_STARTIME in", values,
					"partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("PART_EDU_STARTIME not in", values,
					"partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("PART_EDU_STARTIME between", value1,
					value2, "partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduStartimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("PART_EDU_STARTIME not between", value1,
					value2, "partEduStartime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeIsNull() {
			addCriterion("PART_EDU_ENDTIME is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeIsNotNull() {
			addCriterion("PART_EDU_ENDTIME is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME =", value,
					"partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME <>", value,
					"partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME >", value,
					"partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME >=", value,
					"partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME <", value,
					"partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME <=", value,
					"partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME in", values,
					"partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME not in", values,
					"partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME between", value1, value2,
					"partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPartEduEndtimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("PART_EDU_ENDTIME not between", value1,
					value2, "partEduEndtime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherIsNull() {
			addCriterion("IS_SPECIALPOST_TEACHER is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherIsNotNull() {
			addCriterion("IS_SPECIALPOST_TEACHER is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherEqualTo(
				String value) {
			addCriterion("IS_SPECIALPOST_TEACHER =", value,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherNotEqualTo(
				String value) {
			addCriterion("IS_SPECIALPOST_TEACHER <>", value,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherGreaterThan(
				String value) {
			addCriterion("IS_SPECIALPOST_TEACHER >", value,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIALPOST_TEACHER >=", value,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherLessThan(
				String value) {
			addCriterion("IS_SPECIALPOST_TEACHER <", value,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherLessThanOrEqualTo(
				String value) {
			addCriterion("IS_SPECIALPOST_TEACHER <=", value,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherLike(
				String value) {
			addCriterion("IS_SPECIALPOST_TEACHER like", value,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherNotLike(
				String value) {
			addCriterion("IS_SPECIALPOST_TEACHER not like", value,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherIn(
				List<String> values) {
			addCriterion("IS_SPECIALPOST_TEACHER in", values,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherNotIn(
				List<String> values) {
			addCriterion("IS_SPECIALPOST_TEACHER not in", values,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIALPOST_TEACHER between", value1, value2,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsSpecialpostTeacherNotBetween(
				String value1, String value2) {
			addCriterion("IS_SPECIALPOST_TEACHER not between", value1, value2,
					"isSpecialpostTeacher");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachIsNull() {
			addCriterion("IS_HEART_HEALTH_TEACH is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachIsNotNull() {
			addCriterion("IS_HEART_HEALTH_TEACH is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachEqualTo(
				String value) {
			addCriterion("IS_HEART_HEALTH_TEACH =", value, "isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachNotEqualTo(
				String value) {
			addCriterion("IS_HEART_HEALTH_TEACH <>", value,
					"isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachGreaterThan(
				String value) {
			addCriterion("IS_HEART_HEALTH_TEACH >", value, "isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_HEART_HEALTH_TEACH >=", value,
					"isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachLessThan(
				String value) {
			addCriterion("IS_HEART_HEALTH_TEACH <", value, "isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachLessThanOrEqualTo(
				String value) {
			addCriterion("IS_HEART_HEALTH_TEACH <=", value,
					"isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachLike(
				String value) {
			addCriterion("IS_HEART_HEALTH_TEACH like", value,
					"isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachNotLike(
				String value) {
			addCriterion("IS_HEART_HEALTH_TEACH not like", value,
					"isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachIn(
				List<String> values) {
			addCriterion("IS_HEART_HEALTH_TEACH in", values,
					"isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachNotIn(
				List<String> values) {
			addCriterion("IS_HEART_HEALTH_TEACH not in", values,
					"isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachBetween(
				String value1, String value2) {
			addCriterion("IS_HEART_HEALTH_TEACH between", value1, value2,
					"isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andIsHeartHealthTeachNotBetween(
				String value1, String value2) {
			addCriterion("IS_HEART_HEALTH_TEACH not between", value1, value2,
					"isHeartHealthTeach");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusIsNull() {
			addCriterion("PERSON_STATUS is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusIsNotNull() {
			addCriterion("PERSON_STATUS is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusEqualTo(
				String value) {
			addCriterion("PERSON_STATUS =", value, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusNotEqualTo(
				String value) {
			addCriterion("PERSON_STATUS <>", value, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusGreaterThan(
				String value) {
			addCriterion("PERSON_STATUS >", value, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusGreaterThanOrEqualTo(
				String value) {
			addCriterion("PERSON_STATUS >=", value, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusLessThan(
				String value) {
			addCriterion("PERSON_STATUS <", value, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusLessThanOrEqualTo(
				String value) {
			addCriterion("PERSON_STATUS <=", value, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusLike(String value) {
			addCriterion("PERSON_STATUS like", value, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusNotLike(
				String value) {
			addCriterion("PERSON_STATUS not like", value, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusIn(
				List<String> values) {
			addCriterion("PERSON_STATUS in", values, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusNotIn(
				List<String> values) {
			addCriterion("PERSON_STATUS not in", values, "personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusBetween(
				String value1, String value2) {
			addCriterion("PERSON_STATUS between", value1, value2,
					"personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andPersonStatusNotBetween(
				String value1, String value2) {
			addCriterion("PERSON_STATUS not between", value1, value2,
					"personStatus");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeIsNull() {
			addCriterion("CREATE_TIME is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeIsNotNull() {
			addCriterion("CREATE_TIME is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("CREATE_TIME between", value1, value2,
					"createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andCreateTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("CREATE_TIME not between", value1, value2,
					"createTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeIsNull() {
			addCriterion("UPDATE_TIME is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeIsNotNull() {
			addCriterion("UPDATE_TIME is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("UPDATE_TIME between", value1, value2,
					"updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andUpdateTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2,
					"updateTime");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessIsNull() {
			addCriterion("NOW_BUSINESS is null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessIsNotNull() {
			addCriterion("NOW_BUSINESS is not null");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessEqualTo(String value) {
			addCriterion("NOW_BUSINESS =", value, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessNotEqualTo(
				String value) {
			addCriterion("NOW_BUSINESS <>", value, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessGreaterThan(
				String value) {
			addCriterion("NOW_BUSINESS >", value, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessGreaterThanOrEqualTo(
				String value) {
			addCriterion("NOW_BUSINESS >=", value, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessLessThan(
				String value) {
			addCriterion("NOW_BUSINESS <", value, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessLessThanOrEqualTo(
				String value) {
			addCriterion("NOW_BUSINESS <=", value, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessLike(String value) {
			addCriterion("NOW_BUSINESS like", value, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessNotLike(String value) {
			addCriterion("NOW_BUSINESS not like", value, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessIn(
				List<String> values) {
			addCriterion("NOW_BUSINESS in", values, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessNotIn(
				List<String> values) {
			addCriterion("NOW_BUSINESS not in", values, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessBetween(
				String value1, String value2) {
			addCriterion("NOW_BUSINESS between", value1, value2, "nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}

		public TeacheringInfoExample.Criteria andNowBusinessNotBetween(
				String value1, String value2) {
			addCriterion("NOW_BUSINESS not between", value1, value2,
					"nowBusiness");
			return (TeacheringInfoExample.Criteria) this;
		}
	}
}
