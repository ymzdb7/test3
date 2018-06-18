package com.myoa.model.edu.eduYear;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EduYearExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public EduYearExample() {
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

	public static class Criteria extends EduYearExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<EduYearExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<EduYearExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<EduYearExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new EduYearExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduYearExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new EduYearExample.Criterion(condition, value1,
					value2));
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

		public EduYearExample.Criteria andYearIdIsNull() {
			addCriterion("YEAR_ID is null");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdIsNotNull() {
			addCriterion("YEAR_ID is not null");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdEqualTo(Integer value) {
			addCriterion("YEAR_ID =", value, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdNotEqualTo(Integer value) {
			addCriterion("YEAR_ID <>", value, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdGreaterThan(Integer value) {
			addCriterion("YEAR_ID >", value, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("YEAR_ID >=", value, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdLessThan(Integer value) {
			addCriterion("YEAR_ID <", value, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdLessThanOrEqualTo(Integer value) {
			addCriterion("YEAR_ID <=", value, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdIn(List<Integer> values) {
			addCriterion("YEAR_ID in", values, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdNotIn(List<Integer> values) {
			addCriterion("YEAR_ID not in", values, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdBetween(Integer value1,
				Integer value2) {
			addCriterion("YEAR_ID between", value1, value2, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("YEAR_ID not between", value1, value2, "yearId");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearNameIsNull() {
			addCriterion("YEAR_NAME is null");
			return (EduYearExample.Criteria) this;
		}

		public EduYearExample.Criteria andYearNameIsNotNull() {
			addCriterion("YEAR_NAME is not null");
			return (EduYearExample.Criteria) this;
		}
 
     public EduYearExample.Criteria andYearNameEqualTo(String value) {
       addCriterion("YEAR_NAME =", value, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameNotEqualTo(String value) {
       addCriterion("YEAR_NAME <>", value, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameGreaterThan(String value) {
       addCriterion("YEAR_NAME >", value, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameGreaterThanOrEqualTo(String value) {
       addCriterion("YEAR_NAME >=", value, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameLessThan(String value) {
       addCriterion("YEAR_NAME <", value, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameLessThanOrEqualTo(String value) {
       addCriterion("YEAR_NAME <=", value, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameLike(String value) {
       addCriterion("YEAR_NAME like", value, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameNotLike(String value) {
       addCriterion("YEAR_NAME not like", value, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameIn(List<String> values) {
       addCriterion("YEAR_NAME in", values, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameNotIn(List<String> values) {
       addCriterion("YEAR_NAME not in", values, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameBetween(String value1, String value2) {
       addCriterion("YEAR_NAME between", value1, value2, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearNameNotBetween(String value1, String value2) {
       addCriterion("YEAR_NAME not between", value1, value2, "yearName");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeIsNull() {
       addCriterion("YEAR_CODE is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeIsNotNull() {
       addCriterion("YEAR_CODE is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeEqualTo(String value) {
       addCriterion("YEAR_CODE =", value, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeNotEqualTo(String value) {
       addCriterion("YEAR_CODE <>", value, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeGreaterThan(String value) {
       addCriterion("YEAR_CODE >", value, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeGreaterThanOrEqualTo(String value) {
       addCriterion("YEAR_CODE >=", value, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeLessThan(String value) {
       addCriterion("YEAR_CODE <", value, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeLessThanOrEqualTo(String value) {
       addCriterion("YEAR_CODE <=", value, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeLike(String value) {
       addCriterion("YEAR_CODE like", value, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeNotLike(String value) {
       addCriterion("YEAR_CODE not like", value, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeIn(List<String> values) {
       addCriterion("YEAR_CODE in", values, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeNotIn(List<String> values) {
       addCriterion("YEAR_CODE not in", values, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeBetween(String value1, String value2) {
       addCriterion("YEAR_CODE between", value1, value2, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andYearCodeNotBetween(String value1, String value2) {
       addCriterion("YEAR_CODE not between", value1, value2, "yearCode");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearIsNull() {
       addCriterion("SCHOOL_YEAR is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearIsNotNull() {
       addCriterion("SCHOOL_YEAR is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearEqualTo(String value) {
       addCriterion("SCHOOL_YEAR =", value, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearNotEqualTo(String value) {
       addCriterion("SCHOOL_YEAR <>", value, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearGreaterThan(String value) {
       addCriterion("SCHOOL_YEAR >", value, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearGreaterThanOrEqualTo(String value) {
       addCriterion("SCHOOL_YEAR >=", value, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearLessThan(String value) {
       addCriterion("SCHOOL_YEAR <", value, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearLessThanOrEqualTo(String value) {
       addCriterion("SCHOOL_YEAR <=", value, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearLike(String value) {
       addCriterion("SCHOOL_YEAR like", value, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearNotLike(String value) {
       addCriterion("SCHOOL_YEAR not like", value, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearIn(List<String> values) {
       addCriterion("SCHOOL_YEAR in", values, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearNotIn(List<String> values) {
       addCriterion("SCHOOL_YEAR not in", values, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearBetween(String value1, String value2) {
       addCriterion("SCHOOL_YEAR between", value1, value2, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andSchoolYearNotBetween(String value1, String value2) {
       addCriterion("SCHOOL_YEAR not between", value1, value2, "schoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearIsNull() {
       addCriterion("DEFAULT_SCHOOL_YEAR is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearIsNotNull() {
       addCriterion("DEFAULT_SCHOOL_YEAR is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearEqualTo(String value) {
       addCriterion("DEFAULT_SCHOOL_YEAR =", value, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearNotEqualTo(String value) {
       addCriterion("DEFAULT_SCHOOL_YEAR <>", value, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearGreaterThan(String value) {
       addCriterion("DEFAULT_SCHOOL_YEAR >", value, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearGreaterThanOrEqualTo(String value) {
       addCriterion("DEFAULT_SCHOOL_YEAR >=", value, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearLessThan(String value) {
       addCriterion("DEFAULT_SCHOOL_YEAR <", value, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearLessThanOrEqualTo(String value) {
       addCriterion("DEFAULT_SCHOOL_YEAR <=", value, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearLike(String value) {
       addCriterion("DEFAULT_SCHOOL_YEAR like", value, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearNotLike(String value) {
       addCriterion("DEFAULT_SCHOOL_YEAR not like", value, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearIn(List<String> values) {
       addCriterion("DEFAULT_SCHOOL_YEAR in", values, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearNotIn(List<String> values) {
       addCriterion("DEFAULT_SCHOOL_YEAR not in", values, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearBetween(String value1, String value2) {
       addCriterion("DEFAULT_SCHOOL_YEAR between", value1, value2, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andDefaultSchoolYearNotBetween(String value1, String value2) {
       addCriterion("DEFAULT_SCHOOL_YEAR not between", value1, value2, "defaultSchoolYear");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledIsNull() {
       addCriterion("ENABLED is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledIsNotNull() {
       addCriterion("ENABLED is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledEqualTo(String value) {
       addCriterion("ENABLED =", value, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledNotEqualTo(String value) {
       addCriterion("ENABLED <>", value, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledGreaterThan(String value) {
       addCriterion("ENABLED >", value, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledGreaterThanOrEqualTo(String value) {
       addCriterion("ENABLED >=", value, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledLessThan(String value) {
       addCriterion("ENABLED <", value, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledLessThanOrEqualTo(String value) {
       addCriterion("ENABLED <=", value, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledLike(String value) {
       addCriterion("ENABLED like", value, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledNotLike(String value) {
       addCriterion("ENABLED not like", value, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledIn(List<String> values) {
       addCriterion("ENABLED in", values, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledNotIn(List<String> values) {
       addCriterion("ENABLED not in", values, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledBetween(String value1, String value2) {
       addCriterion("ENABLED between", value1, value2, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andEnabledNotBetween(String value1, String value2) {
       addCriterion("ENABLED not between", value1, value2, "enabled");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionIsNull() {
       addCriterion("POSITION is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionIsNotNull() {
       addCriterion("POSITION is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionEqualTo(String value) {
       addCriterion("POSITION =", value, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionNotEqualTo(String value) {
       addCriterion("POSITION <>", value, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionGreaterThan(String value) {
       addCriterion("POSITION >", value, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionGreaterThanOrEqualTo(String value) {
       addCriterion("POSITION >=", value, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionLessThan(String value) {
       addCriterion("POSITION <", value, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionLessThanOrEqualTo(String value) {
       addCriterion("POSITION <=", value, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionLike(String value) {
       addCriterion("POSITION like", value, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionNotLike(String value) {
       addCriterion("POSITION not like", value, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionIn(List<String> values) {
       addCriterion("POSITION in", values, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionNotIn(List<String> values) {
       addCriterion("POSITION not in", values, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionBetween(String value1, String value2) {
       addCriterion("POSITION between", value1, value2, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andPositionNotBetween(String value1, String value2) {
       addCriterion("POSITION not between", value1, value2, "position");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserIsNull() {
       addCriterion("CREATE_USER is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserIsNotNull() {
       addCriterion("CREATE_USER is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserEqualTo(String value) {
       addCriterion("CREATE_USER =", value, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserNotEqualTo(String value) {
       addCriterion("CREATE_USER <>", value, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserGreaterThan(String value) {
       addCriterion("CREATE_USER >", value, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserGreaterThanOrEqualTo(String value) {
       addCriterion("CREATE_USER >=", value, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserLessThan(String value) {
       addCriterion("CREATE_USER <", value, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserLessThanOrEqualTo(String value) {
       addCriterion("CREATE_USER <=", value, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserLike(String value) {
       addCriterion("CREATE_USER like", value, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserNotLike(String value) {
       addCriterion("CREATE_USER not like", value, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserIn(List<String> values) {
       addCriterion("CREATE_USER in", values, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserNotIn(List<String> values) {
       addCriterion("CREATE_USER not in", values, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserBetween(String value1, String value2) {
       addCriterion("CREATE_USER between", value1, value2, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateUserNotBetween(String value1, String value2) {
       addCriterion("CREATE_USER not between", value1, value2, "createUser");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeIsNull() {
       addCriterion("CREATE_TIME is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("CREATE_TIME is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeLessThan(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andCreateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeIsNull() {
       addCriterion("UPDATE_TIME is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeIsNotNull() {
       addCriterion("UPDATE_TIME is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeLessThan(java.util.Date value) {
       addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1IsNull() {
       addCriterion("NOTE1 is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1IsNotNull() {
       addCriterion("NOTE1 is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1EqualTo(String value) {
       addCriterion("NOTE1 =", value, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1NotEqualTo(String value) {
       addCriterion("NOTE1 <>", value, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1GreaterThan(String value) {
       addCriterion("NOTE1 >", value, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1GreaterThanOrEqualTo(String value) {
       addCriterion("NOTE1 >=", value, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1LessThan(String value) {
       addCriterion("NOTE1 <", value, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1LessThanOrEqualTo(String value) {
       addCriterion("NOTE1 <=", value, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1Like(String value) {
       addCriterion("NOTE1 like", value, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1NotLike(String value) {
       addCriterion("NOTE1 not like", value, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1In(List<String> values) {
       addCriterion("NOTE1 in", values, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1NotIn(List<String> values) {
       addCriterion("NOTE1 not in", values, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1Between(String value1, String value2) {
       addCriterion("NOTE1 between", value1, value2, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote1NotBetween(String value1, String value2) {
       addCriterion("NOTE1 not between", value1, value2, "note1");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2IsNull() {
       addCriterion("NOTE2 is null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2IsNotNull() {
       addCriterion("NOTE2 is not null");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2EqualTo(String value) {
       addCriterion("NOTE2 =", value, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2NotEqualTo(String value) {
       addCriterion("NOTE2 <>", value, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2GreaterThan(String value) {
       addCriterion("NOTE2 >", value, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2GreaterThanOrEqualTo(String value) {
       addCriterion("NOTE2 >=", value, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2LessThan(String value) {
       addCriterion("NOTE2 <", value, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2LessThanOrEqualTo(String value) {
       addCriterion("NOTE2 <=", value, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2Like(String value) {
       addCriterion("NOTE2 like", value, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2NotLike(String value) {
       addCriterion("NOTE2 not like", value, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2In(List<String> values) {
       addCriterion("NOTE2 in", values, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2NotIn(List<String> values) {
       addCriterion("NOTE2 not in", values, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2Between(String value1, String value2) {
       addCriterion("NOTE2 between", value1, value2, "note2");
       return (EduYearExample.Criteria)this;
     }
 
     public EduYearExample.Criteria andNote2NotBetween(String value1, String value2) {
       addCriterion("NOTE2 not between", value1, value2, "note2");
       return (EduYearExample.Criteria)this;
     }
   }
 }
