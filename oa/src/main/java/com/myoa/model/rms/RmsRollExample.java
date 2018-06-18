 package com.myoa.model.rms;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class RmsRollExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public RmsRollExample()
   {
     this.oredCriteria = new ArrayList();
   }
 
   public void setOrderByClause(String orderByClause)
   {
     this.orderByClause = orderByClause;
   }
 
   public String getOrderByClause()
   {
     return this.orderByClause;
   }
 
   public void setDistinct(boolean distinct)
   {
     this.distinct = distinct;
   }
 
   public boolean isDistinct()
   {
     return this.distinct;
   }
 
   public List<Criteria> getOredCriteria()
   {
     return this.oredCriteria;
   }
 
   public void or(Criteria criteria)
   {
     this.oredCriteria.add(criteria);
   }
 
   public Criteria or()
   {
     Criteria criteria = createCriteriaInternal();
     this.oredCriteria.add(criteria);
     return criteria;
   }
 
   public Criteria createCriteria()
   {
     Criteria criteria = createCriteriaInternal();
     if (this.oredCriteria.size() == 0) {
       this.oredCriteria.add(criteria);
     }
     return criteria;
   }
 
   protected Criteria createCriteriaInternal()
   {
     Criteria criteria = new Criteria();
     return criteria;
   }
 
   public void clear()
   {
     this.oredCriteria.clear();
     this.orderByClause = null;
     this.distinct = false;
   }
 
   public static class Criterion
   {
     private String condition;
     private Object value;
     private Object secondValue;
     private boolean noValue;
     private boolean singleValue;
     private boolean betweenValue;
     private boolean listValue;
     private String typeHandler;
 
     public String getCondition()
     {
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
 
     protected Criterion(String condition)
     {
       this.condition = condition;
       this.typeHandler = null;
       this.noValue = true;
     }
 
     protected Criterion(String condition, Object value, String typeHandler)
     {
       this.condition = condition;
       this.value = value;
       this.typeHandler = typeHandler;
       if ((value instanceof List))
         this.listValue = true;
       else
         this.singleValue = true;
     }
 
     protected Criterion(String condition, Object value)
     {
       this(condition, value, null);
     }
 
     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
     {
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
 
   public static class Criteria extends RmsRollExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<RmsRollExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<RmsRollExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<RmsRollExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new RmsRollExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new RmsRollExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new RmsRollExample.Criterion(condition, value1, value2));
     }
 
     protected void addCriterionForJDBCDate(String condition, java.util.Date value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       addCriterion(condition, new java.sql.Date(value.getTime()), property);
     }
 
     protected void addCriterionForJDBCDate(String condition, List<java.util.Date> values, String property) {
       if ((values == null) || (values.size() == 0)) {
         throw new RuntimeException("Value list for " + property + " cannot be null or empty");
       }
       List dateList = new ArrayList();
       Iterator iter = values.iterator();
       while (iter.hasNext()) {
         dateList.add(new java.sql.Date(((java.util.Date)iter.next()).getTime()));
       }
       addCriterion(condition, dateList, property);
     }
 
     protected void addCriterionForJDBCDate(String condition, java.util.Date value1, java.util.Date value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
     }
 
     public RmsRollExample.Criteria andRollIdIsNull() {
       addCriterion("ROLL_ID is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdIsNotNull() {
       addCriterion("ROLL_ID is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdEqualTo(Integer value) {
       addCriterion("ROLL_ID =", value, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdNotEqualTo(Integer value) {
       addCriterion("ROLL_ID <>", value, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdGreaterThan(Integer value) {
       addCriterion("ROLL_ID >", value, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ROLL_ID >=", value, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdLessThan(Integer value) {
       addCriterion("ROLL_ID <", value, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdLessThanOrEqualTo(Integer value) {
       addCriterion("ROLL_ID <=", value, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdIn(List<Integer> values) {
       addCriterion("ROLL_ID in", values, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdNotIn(List<Integer> values) {
       addCriterion("ROLL_ID not in", values, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdBetween(Integer value1, Integer value2) {
       addCriterion("ROLL_ID between", value1, value2, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ROLL_ID not between", value1, value2, "rollId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdIsNull() {
       addCriterion("ROOM_ID is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdIsNotNull() {
       addCriterion("ROOM_ID is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdEqualTo(Integer value) {
       addCriterion("ROOM_ID =", value, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdNotEqualTo(Integer value) {
       addCriterion("ROOM_ID <>", value, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdGreaterThan(Integer value) {
       addCriterion("ROOM_ID >", value, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ROOM_ID >=", value, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdLessThan(Integer value) {
       addCriterion("ROOM_ID <", value, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdLessThanOrEqualTo(Integer value) {
       addCriterion("ROOM_ID <=", value, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdIn(List<Integer> values) {
       addCriterion("ROOM_ID in", values, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdNotIn(List<Integer> values) {
       addCriterion("ROOM_ID not in", values, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdBetween(Integer value1, Integer value2) {
       addCriterion("ROOM_ID between", value1, value2, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ROOM_ID not between", value1, value2, "roomId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdIsNull() {
       addCriterion("DEPT_ID is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdIsNotNull() {
       addCriterion("DEPT_ID is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdEqualTo(Integer value) {
       addCriterion("DEPT_ID =", value, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdNotEqualTo(Integer value) {
       addCriterion("DEPT_ID <>", value, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdGreaterThan(Integer value) {
       addCriterion("DEPT_ID >", value, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("DEPT_ID >=", value, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdLessThan(Integer value) {
       addCriterion("DEPT_ID <", value, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdLessThanOrEqualTo(Integer value) {
       addCriterion("DEPT_ID <=", value, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdIn(List<Integer> values) {
       addCriterion("DEPT_ID in", values, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdNotIn(List<Integer> values) {
       addCriterion("DEPT_ID not in", values, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_ID between", value1, value2, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_ID not between", value1, value2, "deptId");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeIsNull() {
       addCriterion("ROLL_CODE is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeIsNotNull() {
       addCriterion("ROLL_CODE is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeEqualTo(String value) {
       addCriterion("ROLL_CODE =", value, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeNotEqualTo(String value) {
       addCriterion("ROLL_CODE <>", value, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeGreaterThan(String value) {
       addCriterion("ROLL_CODE >", value, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeGreaterThanOrEqualTo(String value) {
       addCriterion("ROLL_CODE >=", value, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeLessThan(String value) {
       addCriterion("ROLL_CODE <", value, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeLessThanOrEqualTo(String value) {
       addCriterion("ROLL_CODE <=", value, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeLike(String value) {
       addCriterion("ROLL_CODE like", value, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeNotLike(String value) {
       addCriterion("ROLL_CODE not like", value, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeIn(List<String> values) {
       addCriterion("ROLL_CODE in", values, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeNotIn(List<String> values) {
       addCriterion("ROLL_CODE not in", values, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeBetween(String value1, String value2) {
       addCriterion("ROLL_CODE between", value1, value2, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollCodeNotBetween(String value1, String value2) {
       addCriterion("ROLL_CODE not between", value1, value2, "rollCode");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameIsNull() {
       addCriterion("ROLL_NAME is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameIsNotNull() {
       addCriterion("ROLL_NAME is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameEqualTo(String value) {
       addCriterion("ROLL_NAME =", value, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameNotEqualTo(String value) {
       addCriterion("ROLL_NAME <>", value, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameGreaterThan(String value) {
       addCriterion("ROLL_NAME >", value, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameGreaterThanOrEqualTo(String value) {
       addCriterion("ROLL_NAME >=", value, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameLessThan(String value) {
       addCriterion("ROLL_NAME <", value, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameLessThanOrEqualTo(String value) {
       addCriterion("ROLL_NAME <=", value, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameLike(String value) {
       addCriterion("ROLL_NAME like", value, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameNotLike(String value) {
       addCriterion("ROLL_NAME not like", value, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameIn(List<String> values) {
       addCriterion("ROLL_NAME in", values, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameNotIn(List<String> values) {
       addCriterion("ROLL_NAME not in", values, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameBetween(String value1, String value2) {
       addCriterion("ROLL_NAME between", value1, value2, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollNameNotBetween(String value1, String value2) {
       addCriterion("ROLL_NAME not between", value1, value2, "rollName");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsIsNull() {
       addCriterion("YEARS is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsIsNotNull() {
       addCriterion("YEARS is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsEqualTo(String value) {
       addCriterion("YEARS =", value, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsNotEqualTo(String value) {
       addCriterion("YEARS <>", value, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsGreaterThan(String value) {
       addCriterion("YEARS >", value, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsGreaterThanOrEqualTo(String value) {
       addCriterion("YEARS >=", value, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsLessThan(String value) {
       addCriterion("YEARS <", value, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsLessThanOrEqualTo(String value) {
       addCriterion("YEARS <=", value, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsLike(String value) {
       addCriterion("YEARS like", value, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsNotLike(String value) {
       addCriterion("YEARS not like", value, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsIn(List<String> values) {
       addCriterion("YEARS in", values, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsNotIn(List<String> values) {
       addCriterion("YEARS not in", values, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsBetween(String value1, String value2) {
       addCriterion("YEARS between", value1, value2, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andYearsNotBetween(String value1, String value2) {
       addCriterion("YEARS not between", value1, value2, "years");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateIsNull() {
       addCriterion("BEGIN_DATE is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateIsNotNull() {
       addCriterion("BEGIN_DATE is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE =", value, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE <>", value, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE >", value, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE >=", value, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE <", value, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE <=", value, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("BEGIN_DATE in", values, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("BEGIN_DATE not in", values, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("BEGIN_DATE between", value1, value2, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBeginDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("BEGIN_DATE not between", value1, value2, "beginDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateIsNull() {
       addCriterion("END_DATE is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateIsNotNull() {
       addCriterion("END_DATE is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE =", value, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE <>", value, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE >", value, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE >=", value, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE <", value, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE <=", value, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("END_DATE in", values, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("END_DATE not in", values, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEndDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineIsNull() {
       addCriterion("DEADLINE is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineIsNotNull() {
       addCriterion("DEADLINE is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineEqualTo(String value) {
       addCriterion("DEADLINE =", value, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineNotEqualTo(String value) {
       addCriterion("DEADLINE <>", value, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineGreaterThan(String value) {
       addCriterion("DEADLINE >", value, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineGreaterThanOrEqualTo(String value) {
       addCriterion("DEADLINE >=", value, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineLessThan(String value) {
       addCriterion("DEADLINE <", value, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineLessThanOrEqualTo(String value) {
       addCriterion("DEADLINE <=", value, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineLike(String value) {
       addCriterion("DEADLINE like", value, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineNotLike(String value) {
       addCriterion("DEADLINE not like", value, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineIn(List<String> values) {
       addCriterion("DEADLINE in", values, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineNotIn(List<String> values) {
       addCriterion("DEADLINE not in", values, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineBetween(String value1, String value2) {
       addCriterion("DEADLINE between", value1, value2, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDeadlineNotBetween(String value1, String value2) {
       addCriterion("DEADLINE not between", value1, value2, "deadline");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretIsNull() {
       addCriterion("SECRET is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretIsNotNull() {
       addCriterion("SECRET is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretEqualTo(String value) {
       addCriterion("SECRET =", value, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretNotEqualTo(String value) {
       addCriterion("SECRET <>", value, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretGreaterThan(String value) {
       addCriterion("SECRET >", value, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretGreaterThanOrEqualTo(String value) {
       addCriterion("SECRET >=", value, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretLessThan(String value) {
       addCriterion("SECRET <", value, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretLessThanOrEqualTo(String value) {
       addCriterion("SECRET <=", value, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretLike(String value) {
       addCriterion("SECRET like", value, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretNotLike(String value) {
       addCriterion("SECRET not like", value, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretIn(List<String> values) {
       addCriterion("SECRET in", values, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretNotIn(List<String> values) {
       addCriterion("SECRET not in", values, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretBetween(String value1, String value2) {
       addCriterion("SECRET between", value1, value2, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andSecretNotBetween(String value1, String value2) {
       addCriterion("SECRET not between", value1, value2, "secret");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoIsNull() {
       addCriterion("CATEGORY_NO is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoIsNotNull() {
       addCriterion("CATEGORY_NO is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoEqualTo(String value) {
       addCriterion("CATEGORY_NO =", value, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoNotEqualTo(String value) {
       addCriterion("CATEGORY_NO <>", value, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoGreaterThan(String value) {
       addCriterion("CATEGORY_NO >", value, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoGreaterThanOrEqualTo(String value) {
       addCriterion("CATEGORY_NO >=", value, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoLessThan(String value) {
       addCriterion("CATEGORY_NO <", value, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoLessThanOrEqualTo(String value) {
       addCriterion("CATEGORY_NO <=", value, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoLike(String value) {
       addCriterion("CATEGORY_NO like", value, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoNotLike(String value) {
       addCriterion("CATEGORY_NO not like", value, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoIn(List<String> values) {
       addCriterion("CATEGORY_NO in", values, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoNotIn(List<String> values) {
       addCriterion("CATEGORY_NO not in", values, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoBetween(String value1, String value2) {
       addCriterion("CATEGORY_NO between", value1, value2, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCategoryNoNotBetween(String value1, String value2) {
       addCriterion("CATEGORY_NO not between", value1, value2, "categoryNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoIsNull() {
       addCriterion("CATALOG_NO is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoIsNotNull() {
       addCriterion("CATALOG_NO is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoEqualTo(String value) {
       addCriterion("CATALOG_NO =", value, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoNotEqualTo(String value) {
       addCriterion("CATALOG_NO <>", value, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoGreaterThan(String value) {
       addCriterion("CATALOG_NO >", value, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoGreaterThanOrEqualTo(String value) {
       addCriterion("CATALOG_NO >=", value, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoLessThan(String value) {
       addCriterion("CATALOG_NO <", value, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoLessThanOrEqualTo(String value) {
       addCriterion("CATALOG_NO <=", value, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoLike(String value) {
       addCriterion("CATALOG_NO like", value, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoNotLike(String value) {
       addCriterion("CATALOG_NO not like", value, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoIn(List<String> values) {
       addCriterion("CATALOG_NO in", values, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoNotIn(List<String> values) {
       addCriterion("CATALOG_NO not in", values, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoBetween(String value1, String value2) {
       addCriterion("CATALOG_NO between", value1, value2, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCatalogNoNotBetween(String value1, String value2) {
       addCriterion("CATALOG_NO not between", value1, value2, "catalogNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoIsNull() {
       addCriterion("ARCHIVE_NO is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoIsNotNull() {
       addCriterion("ARCHIVE_NO is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoEqualTo(String value) {
       addCriterion("ARCHIVE_NO =", value, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoNotEqualTo(String value) {
       addCriterion("ARCHIVE_NO <>", value, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoGreaterThan(String value) {
       addCriterion("ARCHIVE_NO >", value, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoGreaterThanOrEqualTo(String value) {
       addCriterion("ARCHIVE_NO >=", value, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoLessThan(String value) {
       addCriterion("ARCHIVE_NO <", value, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoLessThanOrEqualTo(String value) {
       addCriterion("ARCHIVE_NO <=", value, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoLike(String value) {
       addCriterion("ARCHIVE_NO like", value, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoNotLike(String value) {
       addCriterion("ARCHIVE_NO not like", value, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoIn(List<String> values) {
       addCriterion("ARCHIVE_NO in", values, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoNotIn(List<String> values) {
       addCriterion("ARCHIVE_NO not in", values, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoBetween(String value1, String value2) {
       addCriterion("ARCHIVE_NO between", value1, value2, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andArchiveNoNotBetween(String value1, String value2) {
       addCriterion("ARCHIVE_NO not between", value1, value2, "archiveNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoIsNull() {
       addCriterion("BOX_NO is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoIsNotNull() {
       addCriterion("BOX_NO is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoEqualTo(String value) {
       addCriterion("BOX_NO =", value, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoNotEqualTo(String value) {
       addCriterion("BOX_NO <>", value, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoGreaterThan(String value) {
       addCriterion("BOX_NO >", value, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoGreaterThanOrEqualTo(String value) {
       addCriterion("BOX_NO >=", value, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoLessThan(String value) {
       addCriterion("BOX_NO <", value, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoLessThanOrEqualTo(String value) {
       addCriterion("BOX_NO <=", value, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoLike(String value) {
       addCriterion("BOX_NO like", value, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoNotLike(String value) {
       addCriterion("BOX_NO not like", value, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoIn(List<String> values) {
       addCriterion("BOX_NO in", values, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoNotIn(List<String> values) {
       addCriterion("BOX_NO not in", values, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoBetween(String value1, String value2) {
       addCriterion("BOX_NO between", value1, value2, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBoxNoNotBetween(String value1, String value2) {
       addCriterion("BOX_NO not between", value1, value2, "boxNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoIsNull() {
       addCriterion("MICRO_NO is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoIsNotNull() {
       addCriterion("MICRO_NO is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoEqualTo(String value) {
       addCriterion("MICRO_NO =", value, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoNotEqualTo(String value) {
       addCriterion("MICRO_NO <>", value, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoGreaterThan(String value) {
       addCriterion("MICRO_NO >", value, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoGreaterThanOrEqualTo(String value) {
       addCriterion("MICRO_NO >=", value, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoLessThan(String value) {
       addCriterion("MICRO_NO <", value, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoLessThanOrEqualTo(String value) {
       addCriterion("MICRO_NO <=", value, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoLike(String value) {
       addCriterion("MICRO_NO like", value, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoNotLike(String value) {
       addCriterion("MICRO_NO not like", value, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoIn(List<String> values) {
       addCriterion("MICRO_NO in", values, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoNotIn(List<String> values) {
       addCriterion("MICRO_NO not in", values, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoBetween(String value1, String value2) {
       addCriterion("MICRO_NO between", value1, value2, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andMicroNoNotBetween(String value1, String value2) {
       addCriterion("MICRO_NO not between", value1, value2, "microNo");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindIsNull() {
       addCriterion("CERTIFICATE_KIND is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindIsNotNull() {
       addCriterion("CERTIFICATE_KIND is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindEqualTo(String value) {
       addCriterion("CERTIFICATE_KIND =", value, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindNotEqualTo(String value) {
       addCriterion("CERTIFICATE_KIND <>", value, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindGreaterThan(String value) {
       addCriterion("CERTIFICATE_KIND >", value, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindGreaterThanOrEqualTo(String value) {
       addCriterion("CERTIFICATE_KIND >=", value, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindLessThan(String value) {
       addCriterion("CERTIFICATE_KIND <", value, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindLessThanOrEqualTo(String value) {
       addCriterion("CERTIFICATE_KIND <=", value, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindLike(String value) {
       addCriterion("CERTIFICATE_KIND like", value, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindNotLike(String value) {
       addCriterion("CERTIFICATE_KIND not like", value, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindIn(List<String> values) {
       addCriterion("CERTIFICATE_KIND in", values, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindNotIn(List<String> values) {
       addCriterion("CERTIFICATE_KIND not in", values, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindBetween(String value1, String value2) {
       addCriterion("CERTIFICATE_KIND between", value1, value2, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateKindNotBetween(String value1, String value2) {
       addCriterion("CERTIFICATE_KIND not between", value1, value2, "certificateKind");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartIsNull() {
       addCriterion("CERTIFICATE_START is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartIsNotNull() {
       addCriterion("CERTIFICATE_START is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartEqualTo(String value) {
       addCriterion("CERTIFICATE_START =", value, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartNotEqualTo(String value) {
       addCriterion("CERTIFICATE_START <>", value, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartGreaterThan(String value) {
       addCriterion("CERTIFICATE_START >", value, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartGreaterThanOrEqualTo(String value) {
       addCriterion("CERTIFICATE_START >=", value, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartLessThan(String value) {
       addCriterion("CERTIFICATE_START <", value, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartLessThanOrEqualTo(String value) {
       addCriterion("CERTIFICATE_START <=", value, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartLike(String value) {
       addCriterion("CERTIFICATE_START like", value, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartNotLike(String value) {
       addCriterion("CERTIFICATE_START not like", value, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartIn(List<String> values) {
       addCriterion("CERTIFICATE_START in", values, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartNotIn(List<String> values) {
       addCriterion("CERTIFICATE_START not in", values, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartBetween(String value1, String value2) {
       addCriterion("CERTIFICATE_START between", value1, value2, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateStartNotBetween(String value1, String value2) {
       addCriterion("CERTIFICATE_START not between", value1, value2, "certificateStart");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndIsNull() {
       addCriterion("CERTIFICATE_END is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndIsNotNull() {
       addCriterion("CERTIFICATE_END is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndEqualTo(String value) {
       addCriterion("CERTIFICATE_END =", value, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndNotEqualTo(String value) {
       addCriterion("CERTIFICATE_END <>", value, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndGreaterThan(String value) {
       addCriterion("CERTIFICATE_END >", value, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndGreaterThanOrEqualTo(String value) {
       addCriterion("CERTIFICATE_END >=", value, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndLessThan(String value) {
       addCriterion("CERTIFICATE_END <", value, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndLessThanOrEqualTo(String value) {
       addCriterion("CERTIFICATE_END <=", value, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndLike(String value) {
       addCriterion("CERTIFICATE_END like", value, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndNotLike(String value) {
       addCriterion("CERTIFICATE_END not like", value, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndIn(List<String> values) {
       addCriterion("CERTIFICATE_END in", values, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndNotIn(List<String> values) {
       addCriterion("CERTIFICATE_END not in", values, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndBetween(String value1, String value2) {
       addCriterion("CERTIFICATE_END between", value1, value2, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andCertificateEndNotBetween(String value1, String value2) {
       addCriterion("CERTIFICATE_END not between", value1, value2, "certificateEnd");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageIsNull() {
       addCriterion("ROLL_PAGE is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageIsNotNull() {
       addCriterion("ROLL_PAGE is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageEqualTo(String value) {
       addCriterion("ROLL_PAGE =", value, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageNotEqualTo(String value) {
       addCriterion("ROLL_PAGE <>", value, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageGreaterThan(String value) {
       addCriterion("ROLL_PAGE >", value, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageGreaterThanOrEqualTo(String value) {
       addCriterion("ROLL_PAGE >=", value, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageLessThan(String value) {
       addCriterion("ROLL_PAGE <", value, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageLessThanOrEqualTo(String value) {
       addCriterion("ROLL_PAGE <=", value, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageLike(String value) {
       addCriterion("ROLL_PAGE like", value, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageNotLike(String value) {
       addCriterion("ROLL_PAGE not like", value, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageIn(List<String> values) {
       addCriterion("ROLL_PAGE in", values, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageNotIn(List<String> values) {
       addCriterion("ROLL_PAGE not in", values, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageBetween(String value1, String value2) {
       addCriterion("ROLL_PAGE between", value1, value2, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRollPageNotBetween(String value1, String value2) {
       addCriterion("ROLL_PAGE not between", value1, value2, "rollPage");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowIsNull() {
       addCriterion("BORROW is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowIsNotNull() {
       addCriterion("BORROW is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowEqualTo(String value) {
       addCriterion("BORROW =", value, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowNotEqualTo(String value) {
       addCriterion("BORROW <>", value, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowGreaterThan(String value) {
       addCriterion("BORROW >", value, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowGreaterThanOrEqualTo(String value) {
       addCriterion("BORROW >=", value, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowLessThan(String value) {
       addCriterion("BORROW <", value, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowLessThanOrEqualTo(String value) {
       addCriterion("BORROW <=", value, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowLike(String value) {
       addCriterion("BORROW like", value, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowNotLike(String value) {
       addCriterion("BORROW not like", value, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowIn(List<String> values) {
       addCriterion("BORROW in", values, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowNotIn(List<String> values) {
       addCriterion("BORROW not in", values, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowBetween(String value1, String value2) {
       addCriterion("BORROW between", value1, value2, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBorrowNotBetween(String value1, String value2) {
       addCriterion("BORROW not between", value1, value2, "borrow");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkIsNull() {
       addCriterion("REMARK is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkIsNotNull() {
       addCriterion("REMARK is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkEqualTo(String value) {
       addCriterion("REMARK =", value, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkNotEqualTo(String value) {
       addCriterion("REMARK <>", value, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkGreaterThan(String value) {
       addCriterion("REMARK >", value, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkGreaterThanOrEqualTo(String value) {
       addCriterion("REMARK >=", value, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkLessThan(String value) {
       addCriterion("REMARK <", value, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkLessThanOrEqualTo(String value) {
       addCriterion("REMARK <=", value, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkLike(String value) {
       addCriterion("REMARK like", value, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkNotLike(String value) {
       addCriterion("REMARK not like", value, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkIn(List<String> values) {
       addCriterion("REMARK in", values, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkNotIn(List<String> values) {
       addCriterion("REMARK not in", values, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkBetween(String value1, String value2) {
       addCriterion("REMARK between", value1, value2, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andRemarkNotBetween(String value1, String value2) {
       addCriterion("REMARK not between", value1, value2, "remark");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserIsNull() {
       addCriterion("ADD_USER is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserIsNotNull() {
       addCriterion("ADD_USER is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserEqualTo(String value) {
       addCriterion("ADD_USER =", value, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserNotEqualTo(String value) {
       addCriterion("ADD_USER <>", value, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserGreaterThan(String value) {
       addCriterion("ADD_USER >", value, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserGreaterThanOrEqualTo(String value) {
       addCriterion("ADD_USER >=", value, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserLessThan(String value) {
       addCriterion("ADD_USER <", value, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserLessThanOrEqualTo(String value) {
       addCriterion("ADD_USER <=", value, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserLike(String value) {
       addCriterion("ADD_USER like", value, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserNotLike(String value) {
       addCriterion("ADD_USER not like", value, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserIn(List<String> values) {
       addCriterion("ADD_USER in", values, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserNotIn(List<String> values) {
       addCriterion("ADD_USER not in", values, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserBetween(String value1, String value2) {
       addCriterion("ADD_USER between", value1, value2, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddUserNotBetween(String value1, String value2) {
       addCriterion("ADD_USER not between", value1, value2, "addUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeIsNull() {
       addCriterion("ADD_TIME is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeIsNotNull() {
       addCriterion("ADD_TIME is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME =", value, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeNotEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME <>", value, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeGreaterThan(java.util.Date value) {
       addCriterion("ADD_TIME >", value, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME >=", value, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeLessThan(java.util.Date value) {
       addCriterion("ADD_TIME <", value, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME <=", value, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeIn(List<java.util.Date> values) {
       addCriterion("ADD_TIME in", values, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeNotIn(List<java.util.Date> values) {
       addCriterion("ADD_TIME not in", values, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_TIME between", value1, value2, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_TIME not between", value1, value2, "addTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserIsNull() {
       addCriterion("DEL_USER is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserIsNotNull() {
       addCriterion("DEL_USER is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserEqualTo(String value) {
       addCriterion("DEL_USER =", value, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserNotEqualTo(String value) {
       addCriterion("DEL_USER <>", value, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserGreaterThan(String value) {
       addCriterion("DEL_USER >", value, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserGreaterThanOrEqualTo(String value) {
       addCriterion("DEL_USER >=", value, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserLessThan(String value) {
       addCriterion("DEL_USER <", value, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserLessThanOrEqualTo(String value) {
       addCriterion("DEL_USER <=", value, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserLike(String value) {
       addCriterion("DEL_USER like", value, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserNotLike(String value) {
       addCriterion("DEL_USER not like", value, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserIn(List<String> values) {
       addCriterion("DEL_USER in", values, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserNotIn(List<String> values) {
       addCriterion("DEL_USER not in", values, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserBetween(String value1, String value2) {
       addCriterion("DEL_USER between", value1, value2, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelUserNotBetween(String value1, String value2) {
       addCriterion("DEL_USER not between", value1, value2, "delUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeIsNull() {
       addCriterion("DEL_TIME is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeIsNotNull() {
       addCriterion("DEL_TIME is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeEqualTo(java.util.Date value) {
       addCriterion("DEL_TIME =", value, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeNotEqualTo(java.util.Date value) {
       addCriterion("DEL_TIME <>", value, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeGreaterThan(java.util.Date value) {
       addCriterion("DEL_TIME >", value, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("DEL_TIME >=", value, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeLessThan(java.util.Date value) {
       addCriterion("DEL_TIME <", value, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("DEL_TIME <=", value, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeIn(List<java.util.Date> values) {
       addCriterion("DEL_TIME in", values, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeNotIn(List<java.util.Date> values) {
       addCriterion("DEL_TIME not in", values, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("DEL_TIME between", value1, value2, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andDelTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("DEL_TIME not between", value1, value2, "delTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserIsNull() {
       addCriterion("MOD_USER is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserIsNotNull() {
       addCriterion("MOD_USER is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserEqualTo(String value) {
       addCriterion("MOD_USER =", value, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserNotEqualTo(String value) {
       addCriterion("MOD_USER <>", value, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserGreaterThan(String value) {
       addCriterion("MOD_USER >", value, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserGreaterThanOrEqualTo(String value) {
       addCriterion("MOD_USER >=", value, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserLessThan(String value) {
       addCriterion("MOD_USER <", value, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserLessThanOrEqualTo(String value) {
       addCriterion("MOD_USER <=", value, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserLike(String value) {
       addCriterion("MOD_USER like", value, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserNotLike(String value) {
       addCriterion("MOD_USER not like", value, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserIn(List<String> values) {
       addCriterion("MOD_USER in", values, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserNotIn(List<String> values) {
       addCriterion("MOD_USER not in", values, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserBetween(String value1, String value2) {
       addCriterion("MOD_USER between", value1, value2, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModUserNotBetween(String value1, String value2) {
       addCriterion("MOD_USER not between", value1, value2, "modUser");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusIsNull() {
       addCriterion("STATUS is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusIsNotNull() {
       addCriterion("STATUS is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusEqualTo(String value) {
       addCriterion("STATUS =", value, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusNotEqualTo(String value) {
       addCriterion("STATUS <>", value, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusGreaterThan(String value) {
       addCriterion("STATUS >", value, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
       addCriterion("STATUS >=", value, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusLessThan(String value) {
       addCriterion("STATUS <", value, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusLessThanOrEqualTo(String value) {
       addCriterion("STATUS <=", value, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusLike(String value) {
       addCriterion("STATUS like", value, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusNotLike(String value) {
       addCriterion("STATUS not like", value, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusIn(List<String> values) {
       addCriterion("STATUS in", values, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusNotIn(List<String> values) {
       addCriterion("STATUS not in", values, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusBetween(String value1, String value2) {
       addCriterion("STATUS between", value1, value2, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andStatusNotBetween(String value1, String value2) {
       addCriterion("STATUS not between", value1, value2, "status");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeIsNull() {
       addCriterion("MOD_TIME is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeIsNotNull() {
       addCriterion("MOD_TIME is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeEqualTo(java.util.Date value) {
       addCriterion("MOD_TIME =", value, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeNotEqualTo(java.util.Date value) {
       addCriterion("MOD_TIME <>", value, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeGreaterThan(java.util.Date value) {
       addCriterion("MOD_TIME >", value, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("MOD_TIME >=", value, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeLessThan(java.util.Date value) {
       addCriterion("MOD_TIME <", value, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("MOD_TIME <=", value, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeIn(List<java.util.Date> values) {
       addCriterion("MOD_TIME in", values, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeNotIn(List<java.util.Date> values) {
       addCriterion("MOD_TIME not in", values, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("MOD_TIME between", value1, value2, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andModTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("MOD_TIME not between", value1, value2, "modTime");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgIsNull() {
       addCriterion("BZJG is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgIsNotNull() {
       addCriterion("BZJG is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgEqualTo(String value) {
       addCriterion("BZJG =", value, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgNotEqualTo(String value) {
       addCriterion("BZJG <>", value, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgGreaterThan(String value) {
       addCriterion("BZJG >", value, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgGreaterThanOrEqualTo(String value) {
       addCriterion("BZJG >=", value, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgLessThan(String value) {
       addCriterion("BZJG <", value, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgLessThanOrEqualTo(String value) {
       addCriterion("BZJG <=", value, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgLike(String value) {
       addCriterion("BZJG like", value, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgNotLike(String value) {
       addCriterion("BZJG not like", value, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgIn(List<String> values) {
       addCriterion("BZJG in", values, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgNotIn(List<String> values) {
       addCriterion("BZJG not in", values, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgBetween(String value1, String value2) {
       addCriterion("BZJG between", value1, value2, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andBzjgNotBetween(String value1, String value2) {
       addCriterion("BZJG not between", value1, value2, "bzjg");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerIsNull() {
       addCriterion("MANAGER is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerIsNotNull() {
       addCriterion("MANAGER is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerEqualTo(String value) {
       addCriterion("MANAGER =", value, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerNotEqualTo(String value) {
       addCriterion("MANAGER <>", value, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerGreaterThan(String value) {
       addCriterion("MANAGER >", value, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerGreaterThanOrEqualTo(String value) {
       addCriterion("MANAGER >=", value, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerLessThan(String value) {
       addCriterion("MANAGER <", value, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerLessThanOrEqualTo(String value) {
       addCriterion("MANAGER <=", value, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerLike(String value) {
       addCriterion("MANAGER like", value, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerNotLike(String value) {
       addCriterion("MANAGER not like", value, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerIn(List<String> values) {
       addCriterion("MANAGER in", values, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerNotIn(List<String> values) {
       addCriterion("MANAGER not in", values, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerBetween(String value1, String value2) {
       addCriterion("MANAGER between", value1, value2, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andManagerNotBetween(String value1, String value2) {
       addCriterion("MANAGER not between", value1, value2, "manager");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptIsNull() {
       addCriterion("EDIT_DEPT is null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptIsNotNull() {
       addCriterion("EDIT_DEPT is not null");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptEqualTo(String value) {
       addCriterion("EDIT_DEPT =", value, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptNotEqualTo(String value) {
       addCriterion("EDIT_DEPT <>", value, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptGreaterThan(String value) {
       addCriterion("EDIT_DEPT >", value, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptGreaterThanOrEqualTo(String value) {
       addCriterion("EDIT_DEPT >=", value, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptLessThan(String value) {
       addCriterion("EDIT_DEPT <", value, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptLessThanOrEqualTo(String value) {
       addCriterion("EDIT_DEPT <=", value, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptLike(String value) {
       addCriterion("EDIT_DEPT like", value, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptNotLike(String value) {
       addCriterion("EDIT_DEPT not like", value, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptIn(List<String> values) {
       addCriterion("EDIT_DEPT in", values, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptNotIn(List<String> values) {
       addCriterion("EDIT_DEPT not in", values, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptBetween(String value1, String value2) {
       addCriterion("EDIT_DEPT between", value1, value2, "editDept");
       return (RmsRollExample.Criteria)this;
     }
 
     public RmsRollExample.Criteria andEditDeptNotBetween(String value1, String value2) {
       addCriterion("EDIT_DEPT not between", value1, value2, "editDept");
       return (RmsRollExample.Criteria)this;
     }
   }
 }

