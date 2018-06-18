package com.myoa.model.fixAssets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduFixAssetsExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduFixAssetsExample() {
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

	public static class Criteria extends EduFixAssetsExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduFixAssetsExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduFixAssetsExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduFixAssetsExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new EduFixAssetsExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduFixAssetsExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduFixAssetsExample.Criterion(condition,
					value1, value2));
		}

		public EduFixAssetsExample.Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdEqualTo(String value) {
			addCriterion("ID =", value, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdNotEqualTo(String value) {
			addCriterion("ID <>", value, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdGreaterThan(String value) {
			addCriterion("ID >", value, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("ID >=", value, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdLessThan(String value) {
			addCriterion("ID <", value, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("ID <=", value, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdLike(String value) {
			addCriterion("ID like", value, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdNotLike(String value) {
			addCriterion("ID not like", value, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdIn(List<String> values) {
			addCriterion("ID in", values, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdNotIn(List<String> values) {
			addCriterion("ID not in", values, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdBetween(String value1,
				String value2) {
			addCriterion("ID between", value1, value2, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andIdNotBetween(String value1,
				String value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameIsNull() {
			addCriterion("ASSETS_NAME is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameIsNotNull() {
			addCriterion("ASSETS_NAME is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameEqualTo(String value) {
			addCriterion("ASSETS_NAME =", value, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameNotEqualTo(String value) {
			addCriterion("ASSETS_NAME <>", value, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameGreaterThan(
				String value) {
			addCriterion("ASSETS_NAME >", value, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("ASSETS_NAME >=", value, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameLessThan(String value) {
			addCriterion("ASSETS_NAME <", value, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameLessThanOrEqualTo(
				String value) {
			addCriterion("ASSETS_NAME <=", value, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameLike(String value) {
			addCriterion("ASSETS_NAME like", value, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameNotLike(String value) {
			addCriterion("ASSETS_NAME not like", value, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameIn(List<String> values) {
			addCriterion("ASSETS_NAME in", values, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameNotIn(
				List<String> values) {
			addCriterion("ASSETS_NAME not in", values, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameBetween(String value1,
				String value2) {
			addCriterion("ASSETS_NAME between", value1, value2, "assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andAssetsNameNotBetween(
				String value1, String value2) {
			addCriterion("ASSETS_NAME not between", value1, value2,
					"assetsName");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeIsNull() {
			addCriterion("BUY_TIME is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeIsNotNull() {
			addCriterion("BUY_TIME is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeEqualTo(Date value) {
			addCriterion("BUY_TIME =", value, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeNotEqualTo(Date value) {
			addCriterion("BUY_TIME <>", value, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeGreaterThan(Date value) {
			addCriterion("BUY_TIME >", value, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeGreaterThanOrEqualTo(
				Date value) {
			addCriterion("BUY_TIME >=", value, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeLessThan(Date value) {
			addCriterion("BUY_TIME <", value, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeLessThanOrEqualTo(
				Date value) {
			addCriterion("BUY_TIME <=", value, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeIn(List<Date> values) {
			addCriterion("BUY_TIME in", values, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeNotIn(List<Date> values) {
			addCriterion("BUY_TIME not in", values, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeBetween(Date value1,
				Date value2) {
			addCriterion("BUY_TIME between", value1, value2, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andBuyTimeNotBetween(Date value1,
				Date value2) {
			addCriterion("BUY_TIME not between", value1, value2, "buyTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoIsNull() {
			addCriterion("INFO is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoIsNotNull() {
			addCriterion("INFO is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoEqualTo(String value) {
			addCriterion("INFO =", value, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoNotEqualTo(String value) {
			addCriterion("INFO <>", value, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoGreaterThan(String value) {
			addCriterion("INFO >", value, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoGreaterThanOrEqualTo(
				String value) {
			addCriterion("INFO >=", value, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoLessThan(String value) {
			addCriterion("INFO <", value, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoLessThanOrEqualTo(
				String value) {
			addCriterion("INFO <=", value, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoLike(String value) {
			addCriterion("INFO like", value, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoNotLike(String value) {
			addCriterion("INFO not like", value, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoIn(List<String> values) {
			addCriterion("INFO in", values, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoNotIn(List<String> values) {
			addCriterion("INFO not in", values, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoBetween(String value1,
				String value2) {
			addCriterion("INFO between", value1, value2, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andInfoNotBetween(String value1,
				String value2) {
			addCriterion("INFO not between", value1, value2, "info");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberIsNull() {
			addCriterion("NUMBER is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberIsNotNull() {
			addCriterion("NUMBER is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberEqualTo(Integer value) {
			addCriterion("NUMBER =", value, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberNotEqualTo(Integer value) {
			addCriterion("NUMBER <>", value, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberGreaterThan(Integer value) {
			addCriterion("NUMBER >", value, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("NUMBER >=", value, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberLessThan(Integer value) {
			addCriterion("NUMBER <", value, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberLessThanOrEqualTo(
				Integer value) {
			addCriterion("NUMBER <=", value, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberIn(List<Integer> values) {
			addCriterion("NUMBER in", values, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberNotIn(List<Integer> values) {
			addCriterion("NUMBER not in", values, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberBetween(Integer value1,
				Integer value2) {
			addCriterion("NUMBER between", value1, value2, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andNumberNotBetween(Integer value1,
				Integer value2) {
			addCriterion("NUMBER not between", value1, value2, "number");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressIsNull() {
			addCriterion("LOCATION_ADDRESS is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressIsNotNull() {
			addCriterion("LOCATION_ADDRESS is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressEqualTo(
				String value) {
			addCriterion("LOCATION_ADDRESS =", value, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressNotEqualTo(
				String value) {
			addCriterion("LOCATION_ADDRESS <>", value, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressGreaterThan(
				String value) {
			addCriterion("LOCATION_ADDRESS >", value, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressGreaterThanOrEqualTo(
				String value) {
			addCriterion("LOCATION_ADDRESS >=", value, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressLessThan(
				String value) {
			addCriterion("LOCATION_ADDRESS <", value, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressLessThanOrEqualTo(
				String value) {
			addCriterion("LOCATION_ADDRESS <=", value, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressLike(String value) {
			addCriterion("LOCATION_ADDRESS like", value, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressNotLike(
				String value) {
			addCriterion("LOCATION_ADDRESS not like", value, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressIn(
				List<String> values) {
			addCriterion("LOCATION_ADDRESS in", values, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressNotIn(
				List<String> values) {
			addCriterion("LOCATION_ADDRESS not in", values, "locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressBetween(
				String value1, String value2) {
			addCriterion("LOCATION_ADDRESS between", value1, value2,
					"locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andLocationAddressNotBetween(
				String value1, String value2) {
			addCriterion("LOCATION_ADDRESS not between", value1, value2,
					"locationAddress");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionIsNull() {
			addCriterion("CUSTODION is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionIsNotNull() {
			addCriterion("CUSTODION is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionEqualTo(String value) {
			addCriterion("CUSTODION =", value, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionNotEqualTo(String value) {
			addCriterion("CUSTODION <>", value, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionGreaterThan(String value) {
			addCriterion("CUSTODION >", value, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionGreaterThanOrEqualTo(
				String value) {
			addCriterion("CUSTODION >=", value, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionLessThan(String value) {
			addCriterion("CUSTODION <", value, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionLessThanOrEqualTo(
				String value) {
			addCriterion("CUSTODION <=", value, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionLike(String value) {
			addCriterion("CUSTODION like", value, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionNotLike(String value) {
			addCriterion("CUSTODION not like", value, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionIn(List<String> values) {
			addCriterion("CUSTODION in", values, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionNotIn(
				List<String> values) {
			addCriterion("CUSTODION not in", values, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionBetween(String value1,
				String value2) {
			addCriterion("CUSTODION between", value1, value2, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCustodionNotBetween(
				String value1, String value2) {
			addCriterion("CUSTODION not between", value1, value2, "custodion");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusIsNull() {
			addCriterion("STATUS is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusIsNotNull() {
			addCriterion("STATUS is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusEqualTo(String value) {
			addCriterion("STATUS =", value, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusNotEqualTo(String value) {
			addCriterion("STATUS <>", value, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusGreaterThan(String value) {
			addCriterion("STATUS >", value, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusGreaterThanOrEqualTo(
				String value) {
			addCriterion("STATUS >=", value, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusLessThan(String value) {
			addCriterion("STATUS <", value, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusLessThanOrEqualTo(
				String value) {
			addCriterion("STATUS <=", value, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusLike(String value) {
			addCriterion("STATUS like", value, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusNotLike(String value) {
			addCriterion("STATUS not like", value, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusIn(List<String> values) {
			addCriterion("STATUS in", values, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusNotIn(List<String> values) {
			addCriterion("STATUS not in", values, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusBetween(String value1,
				String value2) {
			addCriterion("STATUS between", value1, value2, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andStatusNotBetween(String value1,
				String value2) {
			addCriterion("STATUS not between", value1, value2, "status");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageIsNull() {
			addCriterion("IMAGE is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageIsNotNull() {
			addCriterion("IMAGE is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageEqualTo(String value) {
			addCriterion("IMAGE =", value, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageNotEqualTo(String value) {
			addCriterion("IMAGE <>", value, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageGreaterThan(String value) {
			addCriterion("IMAGE >", value, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageGreaterThanOrEqualTo(
				String value) {
			addCriterion("IMAGE >=", value, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageLessThan(String value) {
			addCriterion("IMAGE <", value, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageLessThanOrEqualTo(
				String value) {
			addCriterion("IMAGE <=", value, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageLike(String value) {
			addCriterion("IMAGE like", value, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageNotLike(String value) {
			addCriterion("IMAGE not like", value, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageIn(List<String> values) {
			addCriterion("IMAGE in", values, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageNotIn(List<String> values) {
			addCriterion("IMAGE not in", values, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageBetween(String value1,
				String value2) {
			addCriterion("IMAGE between", value1, value2, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andImageNotBetween(String value1,
				String value2) {
			addCriterion("IMAGE not between", value1, value2, "image");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeIsNull() {
			addCriterion("REMAKE is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeIsNotNull() {
			addCriterion("REMAKE is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeEqualTo(String value) {
			addCriterion("REMAKE =", value, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeNotEqualTo(String value) {
			addCriterion("REMAKE <>", value, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeGreaterThan(String value) {
			addCriterion("REMAKE >", value, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeGreaterThanOrEqualTo(
				String value) {
			addCriterion("REMAKE >=", value, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeLessThan(String value) {
			addCriterion("REMAKE <", value, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeLessThanOrEqualTo(
				String value) {
			addCriterion("REMAKE <=", value, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeLike(String value) {
			addCriterion("REMAKE like", value, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeNotLike(String value) {
			addCriterion("REMAKE not like", value, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeIn(List<String> values) {
			addCriterion("REMAKE in", values, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeNotIn(List<String> values) {
			addCriterion("REMAKE not in", values, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeBetween(String value1,
				String value2) {
			addCriterion("REMAKE between", value1, value2, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andRemakeNotBetween(String value1,
				String value2) {
			addCriterion("REMAKE not between", value1, value2, "remake");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeIsNull() {
			addCriterion("QR_CODE is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeIsNotNull() {
			addCriterion("QR_CODE is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeEqualTo(String value) {
			addCriterion("QR_CODE =", value, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeNotEqualTo(String value) {
			addCriterion("QR_CODE <>", value, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeGreaterThan(String value) {
			addCriterion("QR_CODE >", value, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeGreaterThanOrEqualTo(
				String value) {
			addCriterion("QR_CODE >=", value, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeLessThan(String value) {
			addCriterion("QR_CODE <", value, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeLessThanOrEqualTo(
				String value) {
			addCriterion("QR_CODE <=", value, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeLike(String value) {
			addCriterion("QR_CODE like", value, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeNotLike(String value) {
			addCriterion("QR_CODE not like", value, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeIn(List<String> values) {
			addCriterion("QR_CODE in", values, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeNotIn(List<String> values) {
			addCriterion("QR_CODE not in", values, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeBetween(String value1,
				String value2) {
			addCriterion("QR_CODE between", value1, value2, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andQrCodeNotBetween(String value1,
				String value2) {
			addCriterion("QR_CODE not between", value1, value2, "qrCode");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterIsNull() {
			addCriterion("CREATER is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterIsNotNull() {
			addCriterion("CREATER is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterEqualTo(String value) {
			addCriterion("CREATER =", value, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterNotEqualTo(String value) {
			addCriterion("CREATER <>", value, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterGreaterThan(String value) {
			addCriterion("CREATER >", value, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterGreaterThanOrEqualTo(
				String value) {
			addCriterion("CREATER >=", value, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterLessThan(String value) {
			addCriterion("CREATER <", value, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterLessThanOrEqualTo(
				String value) {
			addCriterion("CREATER <=", value, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterLike(String value) {
			addCriterion("CREATER like", value, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterNotLike(String value) {
			addCriterion("CREATER not like", value, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterIn(List<String> values) {
			addCriterion("CREATER in", values, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterNotIn(List<String> values) {
			addCriterion("CREATER not in", values, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterBetween(String value1,
				String value2) {
			addCriterion("CREATER between", value1, value2, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterNotBetween(String value1,
				String value2) {
			addCriterion("CREATER not between", value1, value2, "creater");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeIsNull() {
			addCriterion("CREATER_TIME is null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeIsNotNull() {
			addCriterion("CREATER_TIME is not null");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeEqualTo(Date value) {
			addCriterion("CREATER_TIME =", value, "createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeNotEqualTo(Date value) {
			addCriterion("CREATER_TIME <>", value, "createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeGreaterThan(Date value) {
			addCriterion("CREATER_TIME >", value, "createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeGreaterThanOrEqualTo(
				Date value) {
			addCriterion("CREATER_TIME >=", value, "createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeLessThan(Date value) {
			addCriterion("CREATER_TIME <", value, "createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeLessThanOrEqualTo(
				Date value) {
			addCriterion("CREATER_TIME <=", value, "createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeIn(List<Date> values) {
			addCriterion("CREATER_TIME in", values, "createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeNotIn(
				List<Date> values) {
			addCriterion("CREATER_TIME not in", values, "createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeBetween(Date value1,
				Date value2) {
			addCriterion("CREATER_TIME between", value1, value2, "createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}

		public EduFixAssetsExample.Criteria andCreaterTimeNotBetween(
				Date value1, Date value2) {
			addCriterion("CREATER_TIME not between", value1, value2,
					"createrTime");
			return (EduFixAssetsExample.Criteria) this;
		}
	}
}
