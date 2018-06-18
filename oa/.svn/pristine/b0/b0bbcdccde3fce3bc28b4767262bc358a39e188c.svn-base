package com.myoa.model.edu.eduTrainingPlanRecord;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EduTrainingRecordExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduTrainingRecordExample() {
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
			EduTrainingRecordExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduTrainingRecordExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduTrainingRecordExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduTrainingRecordExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria
					.add(new EduTrainingRecordExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduTrainingRecordExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduTrainingRecordExample.Criterion(condition,
					value1, value2));
		}

		public EduTrainingRecordExample.Criteria andRecordIdIsNull() {
			addCriterion("RECORD_ID is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdIsNotNull() {
			addCriterion("RECORD_ID is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdEqualTo(
				Integer value) {
			addCriterion("RECORD_ID =", value, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdNotEqualTo(
				Integer value) {
			addCriterion("RECORD_ID <>", value, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdGreaterThan(
				Integer value) {
			addCriterion("RECORD_ID >", value, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("RECORD_ID >=", value, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdLessThan(
				Integer value) {
			addCriterion("RECORD_ID <", value, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("RECORD_ID <=", value, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdIn(
				List<Integer> values) {
			addCriterion("RECORD_ID in", values, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdNotIn(
				List<Integer> values) {
			addCriterion("RECORD_ID not in", values, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdBetween(
				Integer value1, Integer value2) {
			addCriterion("RECORD_ID between", value1, value2, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andRecordIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("RECORD_ID not between", value1, value2, "recordId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdIsNull() {
			addCriterion("CREATE_USER_ID is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdIsNotNull() {
			addCriterion("CREATE_USER_ID is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdEqualTo(
				String value) {
			addCriterion("CREATE_USER_ID =", value, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdNotEqualTo(
				String value) {
			addCriterion("CREATE_USER_ID <>", value, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdGreaterThan(
				String value) {
			addCriterion("CREATE_USER_ID >", value, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER_ID >=", value, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdLessThan(
				String value) {
			addCriterion("CREATE_USER_ID <", value, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdLessThanOrEqualTo(
				String value) {
			addCriterion("CREATE_USER_ID <=", value, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdLike(
				String value) {
			addCriterion("CREATE_USER_ID like", value, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdNotLike(
				String value) {
			addCriterion("CREATE_USER_ID not like", value, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdIn(
				List<String> values) {
			addCriterion("CREATE_USER_ID in", values, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdNotIn(
				List<String> values) {
			addCriterion("CREATE_USER_ID not in", values, "createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER_ID between", value1, value2,
					"createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateUserIdNotBetween(
				String value1, String value2) {
			addCriterion("CREATE_USER_ID not between", value1, value2,
					"createUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdIsNull() {
			addCriterion("CREATE_DEPT_ID is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdIsNotNull() {
			addCriterion("CREATE_DEPT_ID is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdEqualTo(
				Integer value) {
			addCriterion("CREATE_DEPT_ID =", value, "createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdNotEqualTo(
				Integer value) {
			addCriterion("CREATE_DEPT_ID <>", value, "createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdGreaterThan(
				Integer value) {
			addCriterion("CREATE_DEPT_ID >", value, "createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("CREATE_DEPT_ID >=", value, "createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdLessThan(
				Integer value) {
			addCriterion("CREATE_DEPT_ID <", value, "createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("CREATE_DEPT_ID <=", value, "createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdIn(
				List<Integer> values) {
			addCriterion("CREATE_DEPT_ID in", values, "createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdNotIn(
				List<Integer> values) {
			addCriterion("CREATE_DEPT_ID not in", values, "createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdBetween(
				Integer value1, Integer value2) {
			addCriterion("CREATE_DEPT_ID between", value1, value2,
					"createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andCreateDeptIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("CREATE_DEPT_ID not between", value1, value2,
					"createDeptId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdIsNull() {
			addCriterion("STAFF_USER_ID is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdIsNotNull() {
			addCriterion("STAFF_USER_ID is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdEqualTo(
				String value) {
			addCriterion("STAFF_USER_ID =", value, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdNotEqualTo(
				String value) {
			addCriterion("STAFF_USER_ID <>", value, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdGreaterThan(
				String value) {
			addCriterion("STAFF_USER_ID >", value, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("STAFF_USER_ID >=", value, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdLessThan(
				String value) {
			addCriterion("STAFF_USER_ID <", value, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdLessThanOrEqualTo(
				String value) {
			addCriterion("STAFF_USER_ID <=", value, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdLike(String value) {
			addCriterion("STAFF_USER_ID like", value, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdNotLike(
				String value) {
			addCriterion("STAFF_USER_ID not like", value, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdIn(
				List<String> values) {
			addCriterion("STAFF_USER_ID in", values, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdNotIn(
				List<String> values) {
			addCriterion("STAFF_USER_ID not in", values, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdBetween(
				String value1, String value2) {
			addCriterion("STAFF_USER_ID between", value1, value2, "staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andStaffUserIdNotBetween(
				String value1, String value2) {
			addCriterion("STAFF_USER_ID not between", value1, value2,
					"staffUserId");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoIsNull() {
			addCriterion("T_PLAN_NO is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoIsNotNull() {
			addCriterion("T_PLAN_NO is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoEqualTo(String value) {
			addCriterion("T_PLAN_NO =", value, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoNotEqualTo(
				String value) {
			addCriterion("T_PLAN_NO <>", value, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoGreaterThan(
				String value) {
			addCriterion("T_PLAN_NO >", value, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoGreaterThanOrEqualTo(
				String value) {
			addCriterion("T_PLAN_NO >=", value, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoLessThan(String value) {
			addCriterion("T_PLAN_NO <", value, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoLessThanOrEqualTo(
				String value) {
			addCriterion("T_PLAN_NO <=", value, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoLike(String value) {
			addCriterion("T_PLAN_NO like", value, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoNotLike(String value) {
			addCriterion("T_PLAN_NO not like", value, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoIn(
				List<String> values) {
			addCriterion("T_PLAN_NO in", values, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoNotIn(
				List<String> values) {
			addCriterion("T_PLAN_NO not in", values, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoBetween(
				String value1, String value2) {
			addCriterion("T_PLAN_NO between", value1, value2, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNoNotBetween(
				String value1, String value2) {
			addCriterion("T_PLAN_NO not between", value1, value2, "tPlanNo");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameIsNull() {
			addCriterion("T_PLAN_NAME is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameIsNotNull() {
			addCriterion("T_PLAN_NAME is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameEqualTo(
				String value) {
			addCriterion("T_PLAN_NAME =", value, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameNotEqualTo(
				String value) {
			addCriterion("T_PLAN_NAME <>", value, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameGreaterThan(
				String value) {
			addCriterion("T_PLAN_NAME >", value, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("T_PLAN_NAME >=", value, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameLessThan(
				String value) {
			addCriterion("T_PLAN_NAME <", value, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameLessThanOrEqualTo(
				String value) {
			addCriterion("T_PLAN_NAME <=", value, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameLike(String value) {
			addCriterion("T_PLAN_NAME like", value, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameNotLike(
				String value) {
			addCriterion("T_PLAN_NAME not like", value, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameIn(
				List<String> values) {
			addCriterion("T_PLAN_NAME in", values, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameNotIn(
				List<String> values) {
			addCriterion("T_PLAN_NAME not in", values, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameBetween(
				String value1, String value2) {
			addCriterion("T_PLAN_NAME between", value1, value2, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTPlanNameNotBetween(
				String value1, String value2) {
			addCriterion("T_PLAN_NAME not between", value1, value2, "tPlanName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameIsNull() {
			addCriterion("T_INSTITUTION_NAME is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameIsNotNull() {
			addCriterion("T_INSTITUTION_NAME is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameEqualTo(
				String value) {
			addCriterion("T_INSTITUTION_NAME =", value, "tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameNotEqualTo(
				String value) {
			addCriterion("T_INSTITUTION_NAME <>", value, "tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameGreaterThan(
				String value) {
			addCriterion("T_INSTITUTION_NAME >", value, "tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameGreaterThanOrEqualTo(
				String value) {
			addCriterion("T_INSTITUTION_NAME >=", value, "tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameLessThan(
				String value) {
			addCriterion("T_INSTITUTION_NAME <", value, "tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameLessThanOrEqualTo(
				String value) {
			addCriterion("T_INSTITUTION_NAME <=", value, "tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameLike(
				String value) {
			addCriterion("T_INSTITUTION_NAME like", value, "tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameNotLike(
				String value) {
			addCriterion("T_INSTITUTION_NAME not like", value,
					"tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameIn(
				List<String> values) {
			addCriterion("T_INSTITUTION_NAME in", values, "tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameNotIn(
				List<String> values) {
			addCriterion("T_INSTITUTION_NAME not in", values,
					"tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameBetween(
				String value1, String value2) {
			addCriterion("T_INSTITUTION_NAME between", value1, value2,
					"tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTInstitutionNameNotBetween(
				String value1, String value2) {
			addCriterion("T_INSTITUTION_NAME not between", value1, value2,
					"tInstitutionName");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostIsNull() {
			addCriterion("TRAINNING_COST is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostIsNotNull() {
			addCriterion("TRAINNING_COST is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostEqualTo(
				BigDecimal value) {
			addCriterion("TRAINNING_COST =", value, "trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostNotEqualTo(
				BigDecimal value) {
			addCriterion("TRAINNING_COST <>", value, "trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostGreaterThan(
				BigDecimal value) {
			addCriterion("TRAINNING_COST >", value, "trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostGreaterThanOrEqualTo(
				BigDecimal value) {
			addCriterion("TRAINNING_COST >=", value, "trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostLessThan(
				BigDecimal value) {
			addCriterion("TRAINNING_COST <", value, "trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostLessThanOrEqualTo(
				BigDecimal value) {
			addCriterion("TRAINNING_COST <=", value, "trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostIn(
				List<BigDecimal> values) {
			addCriterion("TRAINNING_COST in", values, "trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostNotIn(
				List<BigDecimal> values) {
			addCriterion("TRAINNING_COST not in", values, "trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostBetween(
				BigDecimal value1, BigDecimal value2) {
			addCriterion("TRAINNING_COST between", value1, value2,
					"trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTrainningCostNotBetween(
				BigDecimal value1, BigDecimal value2) {
			addCriterion("TRAINNING_COST not between", value1, value2,
					"trainningCost");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsIsNull() {
			addCriterion("T_EXAM_RESULTS is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsIsNotNull() {
			addCriterion("T_EXAM_RESULTS is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsEqualTo(
				BigDecimal value) {
			addCriterion("T_EXAM_RESULTS =", value, "tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsNotEqualTo(
				BigDecimal value) {
			addCriterion("T_EXAM_RESULTS <>", value, "tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsGreaterThan(
				BigDecimal value) {
			addCriterion("T_EXAM_RESULTS >", value, "tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsGreaterThanOrEqualTo(
				BigDecimal value) {
			addCriterion("T_EXAM_RESULTS >=", value, "tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsLessThan(
				BigDecimal value) {
			addCriterion("T_EXAM_RESULTS <", value, "tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsLessThanOrEqualTo(
				BigDecimal value) {
			addCriterion("T_EXAM_RESULTS <=", value, "tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsIn(
				List<BigDecimal> values) {
			addCriterion("T_EXAM_RESULTS in", values, "tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsNotIn(
				List<BigDecimal> values) {
			addCriterion("T_EXAM_RESULTS not in", values, "tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsBetween(
				BigDecimal value1, BigDecimal value2) {
			addCriterion("T_EXAM_RESULTS between", value1, value2,
					"tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamResultsNotBetween(
				BigDecimal value1, BigDecimal value2) {
			addCriterion("T_EXAM_RESULTS not between", value1, value2,
					"tExamResults");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelIsNull() {
			addCriterion("T_EXAM_LEVEL is null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelIsNotNull() {
			addCriterion("T_EXAM_LEVEL is not null");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelEqualTo(
				Integer value) {
			addCriterion("T_EXAM_LEVEL =", value, "tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelNotEqualTo(
				Integer value) {
			addCriterion("T_EXAM_LEVEL <>", value, "tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelGreaterThan(
				Integer value) {
			addCriterion("T_EXAM_LEVEL >", value, "tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("T_EXAM_LEVEL >=", value, "tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelLessThan(
				Integer value) {
			addCriterion("T_EXAM_LEVEL <", value, "tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelLessThanOrEqualTo(
				Integer value) {
			addCriterion("T_EXAM_LEVEL <=", value, "tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelIn(
				List<Integer> values) {
			addCriterion("T_EXAM_LEVEL in", values, "tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelNotIn(
				List<Integer> values) {
			addCriterion("T_EXAM_LEVEL not in", values, "tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelBetween(
				Integer value1, Integer value2) {
			addCriterion("T_EXAM_LEVEL between", value1, value2, "tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}

		public EduTrainingRecordExample.Criteria andTExamLevelNotBetween(
				Integer value1, Integer value2) {
			addCriterion("T_EXAM_LEVEL not between", value1, value2,
					"tExamLevel");
			return (EduTrainingRecordExample.Criteria) this;
		}
	}
}
