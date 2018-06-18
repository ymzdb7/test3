package com.myoa.model.addressGroup;

import java.util.ArrayList;
import java.util.List;

public class AddressGroupExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public AddressGroupExample() {
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

	public static class Criteria extends AddressGroupExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<AddressGroupExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<AddressGroupExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<AddressGroupExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new AddressGroupExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new AddressGroupExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new AddressGroupExample.Criterion(condition,
					value1, value2));
		}

		public AddressGroupExample.Criteria andGroupIdIsNull() {
			addCriterion("GROUP_ID is null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdIsNotNull() {
			addCriterion("GROUP_ID is not null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdEqualTo(Integer value) {
			addCriterion("GROUP_ID =", value, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdNotEqualTo(Integer value) {
			addCriterion("GROUP_ID <>", value, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdGreaterThan(Integer value) {
			addCriterion("GROUP_ID >", value, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("GROUP_ID >=", value, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdLessThan(Integer value) {
			addCriterion("GROUP_ID <", value, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("GROUP_ID <=", value, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdIn(List<Integer> values) {
			addCriterion("GROUP_ID in", values, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdNotIn(List<Integer> values) {
			addCriterion("GROUP_ID not in", values, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdBetween(Integer value1,
				Integer value2) {
			addCriterion("GROUP_ID between", value1, value2, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("GROUP_ID not between", value1, value2, "groupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameIsNull() {
			addCriterion("GROUP_NAME is null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameIsNotNull() {
			addCriterion("GROUP_NAME is not null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameEqualTo(String value) {
			addCriterion("GROUP_NAME =", value, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameNotEqualTo(String value) {
			addCriterion("GROUP_NAME <>", value, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameGreaterThan(String value) {
			addCriterion("GROUP_NAME >", value, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("GROUP_NAME >=", value, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameLessThan(String value) {
			addCriterion("GROUP_NAME <", value, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameLessThanOrEqualTo(
				String value) {
			addCriterion("GROUP_NAME <=", value, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameLike(String value) {
			addCriterion("GROUP_NAME like", value, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameNotLike(String value) {
			addCriterion("GROUP_NAME not like", value, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameIn(List<String> values) {
			addCriterion("GROUP_NAME in", values, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameNotIn(
				List<String> values) {
			addCriterion("GROUP_NAME not in", values, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameBetween(String value1,
				String value2) {
			addCriterion("GROUP_NAME between", value1, value2, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andGroupNameNotBetween(
				String value1, String value2) {
			addCriterion("GROUP_NAME not between", value1, value2, "groupName");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdIsNull() {
			addCriterion("USER_ID is null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdIsNotNull() {
			addCriterion("USER_ID is not null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdEqualTo(String value) {
			addCriterion("USER_ID =", value, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdNotEqualTo(String value) {
			addCriterion("USER_ID <>", value, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdGreaterThan(String value) {
			addCriterion("USER_ID >", value, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("USER_ID >=", value, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdLessThan(String value) {
			addCriterion("USER_ID <", value, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdLessThanOrEqualTo(
				String value) {
			addCriterion("USER_ID <=", value, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdLike(String value) {
			addCriterion("USER_ID like", value, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdNotLike(String value) {
			addCriterion("USER_ID not like", value, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdIn(List<String> values) {
			addCriterion("USER_ID in", values, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdNotIn(List<String> values) {
			addCriterion("USER_ID not in", values, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdBetween(String value1,
				String value2) {
			addCriterion("USER_ID between", value1, value2, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andUserIdNotBetween(String value1,
				String value2) {
			addCriterion("USER_ID not between", value1, value2, "userId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoIsNull() {
			addCriterion("ORDER_NO is null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoIsNotNull() {
			addCriterion("ORDER_NO is not null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoEqualTo(Integer value) {
			addCriterion("ORDER_NO =", value, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoNotEqualTo(Integer value) {
			addCriterion("ORDER_NO <>", value, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoGreaterThan(Integer value) {
			addCriterion("ORDER_NO >", value, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("ORDER_NO >=", value, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoLessThan(Integer value) {
			addCriterion("ORDER_NO <", value, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoLessThanOrEqualTo(
				Integer value) {
			addCriterion("ORDER_NO <=", value, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoIn(List<Integer> values) {
			addCriterion("ORDER_NO in", values, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoNotIn(List<Integer> values) {
			addCriterion("ORDER_NO not in", values, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoBetween(Integer value1,
				Integer value2) {
			addCriterion("ORDER_NO between", value1, value2, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andOrderNoNotBetween(
				Integer value1, Integer value2) {
			addCriterion("ORDER_NO not between", value1, value2, "orderNo");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdIsNull() {
			addCriterion("SHARE_GROUP_ID is null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdIsNotNull() {
			addCriterion("SHARE_GROUP_ID is not null");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdEqualTo(Integer value) {
			addCriterion("SHARE_GROUP_ID =", value, "shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdNotEqualTo(
				Integer value) {
			addCriterion("SHARE_GROUP_ID <>", value, "shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdGreaterThan(
				Integer value) {
			addCriterion("SHARE_GROUP_ID >", value, "shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("SHARE_GROUP_ID >=", value, "shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdLessThan(
				Integer value) {
			addCriterion("SHARE_GROUP_ID <", value, "shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("SHARE_GROUP_ID <=", value, "shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdIn(
				List<Integer> values) {
			addCriterion("SHARE_GROUP_ID in", values, "shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdNotIn(
				List<Integer> values) {
			addCriterion("SHARE_GROUP_ID not in", values, "shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdBetween(
				Integer value1, Integer value2) {
			addCriterion("SHARE_GROUP_ID between", value1, value2,
					"shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}

		public AddressGroupExample.Criteria andShareGroupIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("SHARE_GROUP_ID not between", value1, value2,
					"shareGroupId");
			return (AddressGroupExample.Criteria) this;
		}
	}
}
