package com.myoa.model.edu.eduSchoolBusiness;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EduSchoolBusinessExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduSchoolBusinessExample() {
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
			EduSchoolBusinessExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduSchoolBusinessExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduSchoolBusinessExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduSchoolBusinessExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria
					.add(new EduSchoolBusinessExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduSchoolBusinessExample.Criterion(condition,
					value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduSchoolBusinessExample.Criterion(condition,
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

		public EduSchoolBusinessExample.Criteria andNotifyIdIsNull() {
			addCriterion("NOTIFY_ID is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdIsNotNull() {
			addCriterion("NOTIFY_ID is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdEqualTo(
				Integer value) {
			addCriterion("NOTIFY_ID =", value, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdNotEqualTo(
				Integer value) {
			addCriterion("NOTIFY_ID <>", value, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdGreaterThan(
				Integer value) {
			addCriterion("NOTIFY_ID >", value, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("NOTIFY_ID >=", value, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdLessThan(
				Integer value) {
			addCriterion("NOTIFY_ID <", value, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("NOTIFY_ID <=", value, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdIn(
				List<Integer> values) {
			addCriterion("NOTIFY_ID in", values, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdNotIn(
				List<Integer> values) {
			addCriterion("NOTIFY_ID not in", values, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdBetween(
				Integer value1, Integer value2) {
			addCriterion("NOTIFY_ID between", value1, value2, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andNotifyIdNotBetween(
				Integer value1, Integer value2) {
			addCriterion("NOTIFY_ID not between", value1, value2, "notifyId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptIsNull() {
			addCriterion("FROM_DEPT is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptIsNotNull() {
			addCriterion("FROM_DEPT is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptEqualTo(
				Integer value) {
			addCriterion("FROM_DEPT =", value, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptNotEqualTo(
				Integer value) {
			addCriterion("FROM_DEPT <>", value, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptGreaterThan(
				Integer value) {
			addCriterion("FROM_DEPT >", value, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("FROM_DEPT >=", value, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptLessThan(
				Integer value) {
			addCriterion("FROM_DEPT <", value, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptLessThanOrEqualTo(
				Integer value) {
			addCriterion("FROM_DEPT <=", value, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptIn(
				List<Integer> values) {
			addCriterion("FROM_DEPT in", values, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptNotIn(
				List<Integer> values) {
			addCriterion("FROM_DEPT not in", values, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptBetween(
				Integer value1, Integer value2) {
			addCriterion("FROM_DEPT between", value1, value2, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromDeptNotBetween(
				Integer value1, Integer value2) {
			addCriterion("FROM_DEPT not between", value1, value2, "fromDept");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdIsNull() {
			addCriterion("FROM_ID is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdIsNotNull() {
			addCriterion("FROM_ID is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdEqualTo(String value) {
			addCriterion("FROM_ID =", value, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdNotEqualTo(
				String value) {
			addCriterion("FROM_ID <>", value, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdGreaterThan(
				String value) {
			addCriterion("FROM_ID >", value, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("FROM_ID >=", value, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdLessThan(String value) {
			addCriterion("FROM_ID <", value, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdLessThanOrEqualTo(
				String value) {
			addCriterion("FROM_ID <=", value, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdLike(String value) {
			addCriterion("FROM_ID like", value, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdNotLike(String value) {
			addCriterion("FROM_ID not like", value, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdIn(List<String> values) {
			addCriterion("FROM_ID in", values, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdNotIn(
				List<String> values) {
			addCriterion("FROM_ID not in", values, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdBetween(
				String value1, String value2) {
			addCriterion("FROM_ID between", value1, value2, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFromIdNotBetween(
				String value1, String value2) {
			addCriterion("FROM_ID not between", value1, value2, "fromId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectIsNull() {
			addCriterion("SUBJECT is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectIsNotNull() {
			addCriterion("SUBJECT is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectEqualTo(String value) {
			addCriterion("SUBJECT =", value, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectNotEqualTo(
				String value) {
			addCriterion("SUBJECT <>", value, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectGreaterThan(
				String value) {
			addCriterion("SUBJECT >", value, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectGreaterThanOrEqualTo(
				String value) {
			addCriterion("SUBJECT >=", value, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectLessThan(String value) {
			addCriterion("SUBJECT <", value, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectLessThanOrEqualTo(
				String value) {
			addCriterion("SUBJECT <=", value, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectLike(String value) {
			addCriterion("SUBJECT like", value, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectNotLike(String value) {
			addCriterion("SUBJECT not like", value, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectIn(
				List<String> values) {
			addCriterion("SUBJECT in", values, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectNotIn(
				List<String> values) {
			addCriterion("SUBJECT not in", values, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectBetween(
				String value1, String value2) {
			addCriterion("SUBJECT between", value1, value2, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectNotBetween(
				String value1, String value2) {
			addCriterion("SUBJECT not between", value1, value2, "subject");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeIsNull() {
			addCriterion("SEND_TIME is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeIsNotNull() {
			addCriterion("SEND_TIME is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeEqualTo(
				java.util.Date value) {
			addCriterion("SEND_TIME =", value, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeNotEqualTo(
				java.util.Date value) {
			addCriterion("SEND_TIME <>", value, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeGreaterThan(
				java.util.Date value) {
			addCriterion("SEND_TIME >", value, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterion("SEND_TIME >=", value, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeLessThan(
				java.util.Date value) {
			addCriterion("SEND_TIME <", value, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterion("SEND_TIME <=", value, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeIn(
				List<java.util.Date> values) {
			addCriterion("SEND_TIME in", values, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeNotIn(
				List<java.util.Date> values) {
			addCriterion("SEND_TIME not in", values, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterion("SEND_TIME between", value1, value2, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSendTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterion("SEND_TIME not between", value1, value2, "sendTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateIsNull() {
			addCriterion("BEGIN_DATE is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateIsNotNull() {
			addCriterion("BEGIN_DATE is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateEqualTo(
				Integer value) {
			addCriterion("BEGIN_DATE =", value, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateNotEqualTo(
				Integer value) {
			addCriterion("BEGIN_DATE <>", value, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateGreaterThan(
				Integer value) {
			addCriterion("BEGIN_DATE >", value, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("BEGIN_DATE >=", value, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateLessThan(
				Integer value) {
			addCriterion("BEGIN_DATE <", value, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateLessThanOrEqualTo(
				Integer value) {
			addCriterion("BEGIN_DATE <=", value, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateIn(
				List<Integer> values) {
			addCriterion("BEGIN_DATE in", values, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateNotIn(
				List<Integer> values) {
			addCriterion("BEGIN_DATE not in", values, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateBetween(
				Integer value1, Integer value2) {
			addCriterion("BEGIN_DATE between", value1, value2, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andBeginDateNotBetween(
				Integer value1, Integer value2) {
			addCriterion("BEGIN_DATE not between", value1, value2, "beginDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateIsNull() {
			addCriterion("END_DATE is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateIsNotNull() {
			addCriterion("END_DATE is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateEqualTo(Integer value) {
			addCriterion("END_DATE =", value, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateNotEqualTo(
				Integer value) {
			addCriterion("END_DATE <>", value, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateGreaterThan(
				Integer value) {
			addCriterion("END_DATE >", value, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("END_DATE >=", value, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateLessThan(
				Integer value) {
			addCriterion("END_DATE <", value, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateLessThanOrEqualTo(
				Integer value) {
			addCriterion("END_DATE <=", value, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateIn(
				List<Integer> values) {
			addCriterion("END_DATE in", values, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateNotIn(
				List<Integer> values) {
			addCriterion("END_DATE not in", values, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateBetween(
				Integer value1, Integer value2) {
			addCriterion("END_DATE between", value1, value2, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andEndDateNotBetween(
				Integer value1, Integer value2) {
			addCriterion("END_DATE not between", value1, value2, "endDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintIsNull() {
			addCriterion("PRINT is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintIsNotNull() {
			addCriterion("PRINT is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintEqualTo(String value) {
			addCriterion("PRINT =", value, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintNotEqualTo(String value) {
			addCriterion("PRINT <>", value, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintGreaterThan(
				String value) {
			addCriterion("PRINT >", value, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintGreaterThanOrEqualTo(
				String value) {
			addCriterion("PRINT >=", value, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintLessThan(String value) {
			addCriterion("PRINT <", value, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintLessThanOrEqualTo(
				String value) {
			addCriterion("PRINT <=", value, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintLike(String value) {
			addCriterion("PRINT like", value, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintNotLike(String value) {
			addCriterion("PRINT not like", value, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintIn(List<String> values) {
			addCriterion("PRINT in", values, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintNotIn(
				List<String> values) {
			addCriterion("PRINT not in", values, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintBetween(String value1,
				String value2) {
			addCriterion("PRINT between", value1, value2, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPrintNotBetween(
				String value1, String value2) {
			addCriterion("PRINT not between", value1, value2, "print");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdIsNull() {
			addCriterion("TYPE_ID is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdIsNotNull() {
			addCriterion("TYPE_ID is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdEqualTo(String value) {
			addCriterion("TYPE_ID =", value, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdNotEqualTo(
				String value) {
			addCriterion("TYPE_ID <>", value, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdGreaterThan(
				String value) {
			addCriterion("TYPE_ID >", value, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("TYPE_ID >=", value, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdLessThan(String value) {
			addCriterion("TYPE_ID <", value, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdLessThanOrEqualTo(
				String value) {
			addCriterion("TYPE_ID <=", value, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdLike(String value) {
			addCriterion("TYPE_ID like", value, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdNotLike(String value) {
			addCriterion("TYPE_ID not like", value, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdIn(List<String> values) {
			addCriterion("TYPE_ID in", values, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdNotIn(
				List<String> values) {
			addCriterion("TYPE_ID not in", values, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdBetween(
				String value1, String value2) {
			addCriterion("TYPE_ID between", value1, value2, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTypeIdNotBetween(
				String value1, String value2) {
			addCriterion("TYPE_ID not between", value1, value2, "typeId");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopIsNull() {
			addCriterion("TOP is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopIsNotNull() {
			addCriterion("TOP is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopEqualTo(String value) {
			addCriterion("TOP =", value, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopNotEqualTo(String value) {
			addCriterion("TOP <>", value, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopGreaterThan(String value) {
			addCriterion("TOP >", value, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopGreaterThanOrEqualTo(
				String value) {
			addCriterion("TOP >=", value, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopLessThan(String value) {
			addCriterion("TOP <", value, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopLessThanOrEqualTo(
				String value) {
			addCriterion("TOP <=", value, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopLike(String value) {
			addCriterion("TOP like", value, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopNotLike(String value) {
			addCriterion("TOP not like", value, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopIn(List<String> values) {
			addCriterion("TOP in", values, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopNotIn(List<String> values) {
			addCriterion("TOP not in", values, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopBetween(String value1,
				String value2) {
			addCriterion("TOP between", value1, value2, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopNotBetween(
				String value1, String value2) {
			addCriterion("TOP not between", value1, value2, "top");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysIsNull() {
			addCriterion("TOP_DAYS is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysIsNotNull() {
			addCriterion("TOP_DAYS is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysEqualTo(Integer value) {
			addCriterion("TOP_DAYS =", value, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysNotEqualTo(
				Integer value) {
			addCriterion("TOP_DAYS <>", value, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysGreaterThan(
				Integer value) {
			addCriterion("TOP_DAYS >", value, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("TOP_DAYS >=", value, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysLessThan(
				Integer value) {
			addCriterion("TOP_DAYS <", value, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysLessThanOrEqualTo(
				Integer value) {
			addCriterion("TOP_DAYS <=", value, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysIn(
				List<Integer> values) {
			addCriterion("TOP_DAYS in", values, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysNotIn(
				List<Integer> values) {
			addCriterion("TOP_DAYS not in", values, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysBetween(
				Integer value1, Integer value2) {
			addCriterion("TOP_DAYS between", value1, value2, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andTopDaysNotBetween(
				Integer value1, Integer value2) {
			addCriterion("TOP_DAYS not between", value1, value2, "topDays");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatIsNull() {
			addCriterion("FORMAT is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatIsNotNull() {
			addCriterion("FORMAT is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatEqualTo(String value) {
			addCriterion("FORMAT =", value, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatNotEqualTo(
				String value) {
			addCriterion("FORMAT <>", value, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatGreaterThan(
				String value) {
			addCriterion("FORMAT >", value, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatGreaterThanOrEqualTo(
				String value) {
			addCriterion("FORMAT >=", value, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatLessThan(String value) {
			addCriterion("FORMAT <", value, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatLessThanOrEqualTo(
				String value) {
			addCriterion("FORMAT <=", value, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatLike(String value) {
			addCriterion("FORMAT like", value, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatNotLike(String value) {
			addCriterion("FORMAT not like", value, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatIn(List<String> values) {
			addCriterion("FORMAT in", values, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatNotIn(
				List<String> values) {
			addCriterion("FORMAT not in", values, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatBetween(
				String value1, String value2) {
			addCriterion("FORMAT between", value1, value2, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andFormatNotBetween(
				String value1, String value2) {
			addCriterion("FORMAT not between", value1, value2, "format");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishIsNull() {
			addCriterion("PUBLISH is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishIsNotNull() {
			addCriterion("PUBLISH is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishEqualTo(String value) {
			addCriterion("PUBLISH =", value, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishNotEqualTo(
				String value) {
			addCriterion("PUBLISH <>", value, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishGreaterThan(
				String value) {
			addCriterion("PUBLISH >", value, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishGreaterThanOrEqualTo(
				String value) {
			addCriterion("PUBLISH >=", value, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishLessThan(String value) {
			addCriterion("PUBLISH <", value, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishLessThanOrEqualTo(
				String value) {
			addCriterion("PUBLISH <=", value, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishLike(String value) {
			addCriterion("PUBLISH like", value, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishNotLike(String value) {
			addCriterion("PUBLISH not like", value, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishIn(
				List<String> values) {
			addCriterion("PUBLISH in", values, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishNotIn(
				List<String> values) {
			addCriterion("PUBLISH not in", values, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishBetween(
				String value1, String value2) {
			addCriterion("PUBLISH between", value1, value2, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andPublishNotBetween(
				String value1, String value2) {
			addCriterion("PUBLISH not between", value1, value2, "publish");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerIsNull() {
			addCriterion("AUDITER is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerIsNotNull() {
			addCriterion("AUDITER is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerEqualTo(String value) {
			addCriterion("AUDITER =", value, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerNotEqualTo(
				String value) {
			addCriterion("AUDITER <>", value, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerGreaterThan(
				String value) {
			addCriterion("AUDITER >", value, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerGreaterThanOrEqualTo(
				String value) {
			addCriterion("AUDITER >=", value, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerLessThan(String value) {
			addCriterion("AUDITER <", value, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerLessThanOrEqualTo(
				String value) {
			addCriterion("AUDITER <=", value, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerLike(String value) {
			addCriterion("AUDITER like", value, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerNotLike(String value) {
			addCriterion("AUDITER not like", value, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerIn(
				List<String> values) {
			addCriterion("AUDITER in", values, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerNotIn(
				List<String> values) {
			addCriterion("AUDITER not in", values, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerBetween(
				String value1, String value2) {
			addCriterion("AUDITER between", value1, value2, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditerNotBetween(
				String value1, String value2) {
			addCriterion("AUDITER not between", value1, value2, "auditer");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateIsNull() {
			addCriterion("AUDIT_DATE is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateIsNotNull() {
			addCriterion("AUDIT_DATE is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("AUDIT_DATE =", value, "auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("AUDIT_DATE <>", value, "auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("AUDIT_DATE >", value, "auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("AUDIT_DATE >=", value, "auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("AUDIT_DATE <", value, "auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("AUDIT_DATE <=", value, "auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("AUDIT_DATE in", values, "auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("AUDIT_DATE not in", values, "auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("AUDIT_DATE between", value1, value2,
					"auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andAuditDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("AUDIT_DATE not between", value1, value2,
					"auditDate");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadIsNull() {
			addCriterion("DOWNLOAD is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadIsNotNull() {
			addCriterion("DOWNLOAD is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadEqualTo(String value) {
			addCriterion("DOWNLOAD =", value, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadNotEqualTo(
				String value) {
			addCriterion("DOWNLOAD <>", value, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadGreaterThan(
				String value) {
			addCriterion("DOWNLOAD >", value, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadGreaterThanOrEqualTo(
				String value) {
			addCriterion("DOWNLOAD >=", value, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadLessThan(
				String value) {
			addCriterion("DOWNLOAD <", value, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadLessThanOrEqualTo(
				String value) {
			addCriterion("DOWNLOAD <=", value, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadLike(String value) {
			addCriterion("DOWNLOAD like", value, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadNotLike(String value) {
			addCriterion("DOWNLOAD not like", value, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadIn(
				List<String> values) {
			addCriterion("DOWNLOAD in", values, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadNotIn(
				List<String> values) {
			addCriterion("DOWNLOAD not in", values, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadBetween(
				String value1, String value2) {
			addCriterion("DOWNLOAD between", value1, value2, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andDownloadNotBetween(
				String value1, String value2) {
			addCriterion("DOWNLOAD not between", value1, value2, "download");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorIsNull() {
			addCriterion("LAST_EDITOR is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorIsNotNull() {
			addCriterion("LAST_EDITOR is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorEqualTo(
				String value) {
			addCriterion("LAST_EDITOR =", value, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorNotEqualTo(
				String value) {
			addCriterion("LAST_EDITOR <>", value, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorGreaterThan(
				String value) {
			addCriterion("LAST_EDITOR >", value, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorGreaterThanOrEqualTo(
				String value) {
			addCriterion("LAST_EDITOR >=", value, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorLessThan(
				String value) {
			addCriterion("LAST_EDITOR <", value, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorLessThanOrEqualTo(
				String value) {
			addCriterion("LAST_EDITOR <=", value, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorLike(String value) {
			addCriterion("LAST_EDITOR like", value, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorNotLike(
				String value) {
			addCriterion("LAST_EDITOR not like", value, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorIn(
				List<String> values) {
			addCriterion("LAST_EDITOR in", values, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorNotIn(
				List<String> values) {
			addCriterion("LAST_EDITOR not in", values, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorBetween(
				String value1, String value2) {
			addCriterion("LAST_EDITOR between", value1, value2, "lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditorNotBetween(
				String value1, String value2) {
			addCriterion("LAST_EDITOR not between", value1, value2,
					"lastEditor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeIsNull() {
			addCriterion("LAST_EDIT_TIME is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeIsNotNull() {
			addCriterion("LAST_EDIT_TIME is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeEqualTo(
				java.util.Date value) {
			addCriterion("LAST_EDIT_TIME =", value, "lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeNotEqualTo(
				java.util.Date value) {
			addCriterion("LAST_EDIT_TIME <>", value, "lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeGreaterThan(
				java.util.Date value) {
			addCriterion("LAST_EDIT_TIME >", value, "lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterion("LAST_EDIT_TIME >=", value, "lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeLessThan(
				java.util.Date value) {
			addCriterion("LAST_EDIT_TIME <", value, "lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterion("LAST_EDIT_TIME <=", value, "lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeIn(
				List<java.util.Date> values) {
			addCriterion("LAST_EDIT_TIME in", values, "lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeNotIn(
				List<java.util.Date> values) {
			addCriterion("LAST_EDIT_TIME not in", values, "lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterion("LAST_EDIT_TIME between", value1, value2,
					"lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andLastEditTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterion("LAST_EDIT_TIME not between", value1, value2,
					"lastEditTime");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorIsNull() {
			addCriterion("SUBJECT_COLOR is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorIsNotNull() {
			addCriterion("SUBJECT_COLOR is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorEqualTo(
				String value) {
			addCriterion("SUBJECT_COLOR =", value, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorNotEqualTo(
				String value) {
			addCriterion("SUBJECT_COLOR <>", value, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorGreaterThan(
				String value) {
			addCriterion("SUBJECT_COLOR >", value, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorGreaterThanOrEqualTo(
				String value) {
			addCriterion("SUBJECT_COLOR >=", value, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorLessThan(
				String value) {
			addCriterion("SUBJECT_COLOR <", value, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorLessThanOrEqualTo(
				String value) {
			addCriterion("SUBJECT_COLOR <=", value, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorLike(
				String value) {
			addCriterion("SUBJECT_COLOR like", value, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorNotLike(
				String value) {
			addCriterion("SUBJECT_COLOR not like", value, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorIn(
				List<String> values) {
			addCriterion("SUBJECT_COLOR in", values, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorNotIn(
				List<String> values) {
			addCriterion("SUBJECT_COLOR not in", values, "subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorBetween(
				String value1, String value2) {
			addCriterion("SUBJECT_COLOR between", value1, value2,
					"subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andSubjectColorNotBetween(
				String value1, String value2) {
			addCriterion("SUBJECT_COLOR not between", value1, value2,
					"subjectColor");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordIsNull() {
			addCriterion("KEYWORD is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordIsNotNull() {
			addCriterion("KEYWORD is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordEqualTo(String value) {
			addCriterion("KEYWORD =", value, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordNotEqualTo(
				String value) {
			addCriterion("KEYWORD <>", value, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordGreaterThan(
				String value) {
			addCriterion("KEYWORD >", value, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordGreaterThanOrEqualTo(
				String value) {
			addCriterion("KEYWORD >=", value, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordLessThan(String value) {
			addCriterion("KEYWORD <", value, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordLessThanOrEqualTo(
				String value) {
			addCriterion("KEYWORD <=", value, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordLike(String value) {
			addCriterion("KEYWORD like", value, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordNotLike(String value) {
			addCriterion("KEYWORD not like", value, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordIn(
				List<String> values) {
			addCriterion("KEYWORD in", values, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordNotIn(
				List<String> values) {
			addCriterion("KEYWORD not in", values, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordBetween(
				String value1, String value2) {
			addCriterion("KEYWORD between", value1, value2, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andKeywordNotBetween(
				String value1, String value2) {
			addCriterion("KEYWORD not between", value1, value2, "keyword");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwIsNull() {
			addCriterion("IS_FW is null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwIsNotNull() {
			addCriterion("IS_FW is not null");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwEqualTo(String value) {
			addCriterion("IS_FW =", value, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwNotEqualTo(String value) {
			addCriterion("IS_FW <>", value, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwGreaterThan(String value) {
			addCriterion("IS_FW >", value, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwGreaterThanOrEqualTo(
				String value) {
			addCriterion("IS_FW >=", value, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwLessThan(String value) {
			addCriterion("IS_FW <", value, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwLessThanOrEqualTo(
				String value) {
			addCriterion("IS_FW <=", value, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwLike(String value) {
			addCriterion("IS_FW like", value, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwNotLike(String value) {
			addCriterion("IS_FW not like", value, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwIn(List<String> values) {
			addCriterion("IS_FW in", values, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwNotIn(
				List<String> values) {
			addCriterion("IS_FW not in", values, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwBetween(String value1,
				String value2) {
			addCriterion("IS_FW between", value1, value2, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}

		public EduSchoolBusinessExample.Criteria andIsFwNotBetween(
				String value1, String value2) {
			addCriterion("IS_FW not between", value1, value2, "isFw");
			return (EduSchoolBusinessExample.Criteria) this;
		}
	}
}