 package com.myoa.model.workPlan;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class WorkPlanExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public WorkPlanExample()
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
 
   public static class Criteria extends WorkPlanExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<WorkPlanExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<WorkPlanExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<WorkPlanExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new WorkPlanExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new WorkPlanExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new WorkPlanExample.Criterion(condition, value1, value2));
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
 
     public WorkPlanExample.Criteria andPlanIdIsNull() {
       addCriterion("PLAN_ID is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdIsNotNull() {
       addCriterion("PLAN_ID is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdEqualTo(Integer value) {
       addCriterion("PLAN_ID =", value, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdNotEqualTo(Integer value) {
       addCriterion("PLAN_ID <>", value, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdGreaterThan(Integer value) {
       addCriterion("PLAN_ID >", value, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("PLAN_ID >=", value, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdLessThan(Integer value) {
       addCriterion("PLAN_ID <", value, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdLessThanOrEqualTo(Integer value) {
       addCriterion("PLAN_ID <=", value, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdIn(List<Integer> values) {
       addCriterion("PLAN_ID in", values, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdNotIn(List<Integer> values) {
       addCriterion("PLAN_ID not in", values, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdBetween(Integer value1, Integer value2) {
       addCriterion("PLAN_ID between", value1, value2, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPlanIdNotBetween(Integer value1, Integer value2) {
       addCriterion("PLAN_ID not between", value1, value2, "planId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameIsNull() {
       addCriterion("NAME is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameIsNotNull() {
       addCriterion("NAME is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameEqualTo(String value) {
       addCriterion("NAME =", value, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameNotEqualTo(String value) {
       addCriterion("NAME <>", value, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameGreaterThan(String value) {
       addCriterion("NAME >", value, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameGreaterThanOrEqualTo(String value) {
       addCriterion("NAME >=", value, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameLessThan(String value) {
       addCriterion("NAME <", value, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameLessThanOrEqualTo(String value) {
       addCriterion("NAME <=", value, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameLike(String value) {
       addCriterion("NAME like", value, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameNotLike(String value) {
       addCriterion("NAME not like", value, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameIn(List<String> values) {
       addCriterion("NAME in", values, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameNotIn(List<String> values) {
       addCriterion("NAME not in", values, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameBetween(String value1, String value2) {
       addCriterion("NAME between", value1, value2, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andNameNotBetween(String value1, String value2) {
       addCriterion("NAME not between", value1, value2, "name");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateIsNull() {
       addCriterion("BEGIN_DATE is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateIsNotNull() {
       addCriterion("BEGIN_DATE is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE =", value, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE <>", value, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE >", value, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE >=", value, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE <", value, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_DATE <=", value, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("BEGIN_DATE in", values, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("BEGIN_DATE not in", values, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("BEGIN_DATE between", value1, value2, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andBeginDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("BEGIN_DATE not between", value1, value2, "beginDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateIsNull() {
       addCriterion("END_DATE is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateIsNotNull() {
       addCriterion("END_DATE is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE =", value, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE <>", value, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE >", value, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE >=", value, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE <", value, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("END_DATE <=", value, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("END_DATE in", values, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("END_DATE not in", values, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andEndDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeIsNull() {
       addCriterion("TYPE is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeIsNotNull() {
       addCriterion("TYPE is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeEqualTo(String value) {
       addCriterion("TYPE =", value, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("TYPE <>", value, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("TYPE >", value, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("TYPE >=", value, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeLessThan(String value) {
       addCriterion("TYPE <", value, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("TYPE <=", value, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeLike(String value) {
       addCriterion("TYPE like", value, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeNotLike(String value) {
       addCriterion("TYPE not like", value, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeIn(List<String> values) {
       addCriterion("TYPE in", values, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("TYPE not in", values, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("TYPE between", value1, value2, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("TYPE not between", value1, value2, "type");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdIsNull() {
       addCriterion("TO_ID is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdIsNotNull() {
       addCriterion("TO_ID is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdEqualTo(String value) {
       addCriterion("TO_ID =", value, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdNotEqualTo(String value) {
       addCriterion("TO_ID <>", value, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdGreaterThan(String value) {
       addCriterion("TO_ID >", value, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdGreaterThanOrEqualTo(String value) {
       addCriterion("TO_ID >=", value, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdLessThan(String value) {
       addCriterion("TO_ID <", value, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdLessThanOrEqualTo(String value) {
       addCriterion("TO_ID <=", value, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdLike(String value) {
       addCriterion("TO_ID like", value, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdNotLike(String value) {
       addCriterion("TO_ID not like", value, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdIn(List<String> values) {
       addCriterion("TO_ID in", values, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdNotIn(List<String> values) {
       addCriterion("TO_ID not in", values, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdBetween(String value1, String value2) {
       addCriterion("TO_ID between", value1, value2, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andToIdNotBetween(String value1, String value2) {
       addCriterion("TO_ID not between", value1, value2, "toId");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorIsNull() {
       addCriterion("CREATOR is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorIsNotNull() {
       addCriterion("CREATOR is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorEqualTo(String value) {
       addCriterion("CREATOR =", value, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorNotEqualTo(String value) {
       addCriterion("CREATOR <>", value, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorGreaterThan(String value) {
       addCriterion("CREATOR >", value, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorGreaterThanOrEqualTo(String value) {
       addCriterion("CREATOR >=", value, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorLessThan(String value) {
       addCriterion("CREATOR <", value, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorLessThanOrEqualTo(String value) {
       addCriterion("CREATOR <=", value, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorLike(String value) {
       addCriterion("CREATOR like", value, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorNotLike(String value) {
       addCriterion("CREATOR not like", value, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorIn(List<String> values) {
       addCriterion("CREATOR in", values, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorNotIn(List<String> values) {
       addCriterion("CREATOR not in", values, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorBetween(String value1, String value2) {
       addCriterion("CREATOR between", value1, value2, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreatorNotBetween(String value1, String value2) {
       addCriterion("CREATOR not between", value1, value2, "creator");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateIsNull() {
       addCriterion("CREATE_DATE is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateIsNotNull() {
       addCriterion("CREATE_DATE is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andCreateDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagIsNull() {
       addCriterion("SUSPEND_FLAG is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagIsNotNull() {
       addCriterion("SUSPEND_FLAG is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagEqualTo(String value) {
       addCriterion("SUSPEND_FLAG =", value, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagNotEqualTo(String value) {
       addCriterion("SUSPEND_FLAG <>", value, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagGreaterThan(String value) {
       addCriterion("SUSPEND_FLAG >", value, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagGreaterThanOrEqualTo(String value) {
       addCriterion("SUSPEND_FLAG >=", value, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagLessThan(String value) {
       addCriterion("SUSPEND_FLAG <", value, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagLessThanOrEqualTo(String value) {
       addCriterion("SUSPEND_FLAG <=", value, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagLike(String value) {
       addCriterion("SUSPEND_FLAG like", value, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagNotLike(String value) {
       addCriterion("SUSPEND_FLAG not like", value, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagIn(List<String> values) {
       addCriterion("SUSPEND_FLAG in", values, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagNotIn(List<String> values) {
       addCriterion("SUSPEND_FLAG not in", values, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagBetween(String value1, String value2) {
       addCriterion("SUSPEND_FLAG between", value1, value2, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSuspendFlagNotBetween(String value1, String value2) {
       addCriterion("SUSPEND_FLAG not between", value1, value2, "suspendFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishIsNull() {
       addCriterion("PUBLISH is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishIsNotNull() {
       addCriterion("PUBLISH is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishEqualTo(String value) {
       addCriterion("PUBLISH =", value, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishNotEqualTo(String value) {
       addCriterion("PUBLISH <>", value, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishGreaterThan(String value) {
       addCriterion("PUBLISH >", value, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishGreaterThanOrEqualTo(String value) {
       addCriterion("PUBLISH >=", value, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishLessThan(String value) {
       addCriterion("PUBLISH <", value, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishLessThanOrEqualTo(String value) {
       addCriterion("PUBLISH <=", value, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishLike(String value) {
       addCriterion("PUBLISH like", value, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishNotLike(String value) {
       addCriterion("PUBLISH not like", value, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishIn(List<String> values) {
       addCriterion("PUBLISH in", values, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishNotIn(List<String> values) {
       addCriterion("PUBLISH not in", values, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishBetween(String value1, String value2) {
       addCriterion("PUBLISH between", value1, value2, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andPublishNotBetween(String value1, String value2) {
       addCriterion("PUBLISH not between", value1, value2, "publish");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagIsNull() {
       addCriterion("SMS_FLAG is null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagIsNotNull() {
       addCriterion("SMS_FLAG is not null");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagEqualTo(String value) {
       addCriterion("SMS_FLAG =", value, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagNotEqualTo(String value) {
       addCriterion("SMS_FLAG <>", value, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagGreaterThan(String value) {
       addCriterion("SMS_FLAG >", value, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagGreaterThanOrEqualTo(String value) {
       addCriterion("SMS_FLAG >=", value, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagLessThan(String value) {
       addCriterion("SMS_FLAG <", value, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagLessThanOrEqualTo(String value) {
       addCriterion("SMS_FLAG <=", value, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagLike(String value) {
       addCriterion("SMS_FLAG like", value, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagNotLike(String value) {
       addCriterion("SMS_FLAG not like", value, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagIn(List<String> values) {
       addCriterion("SMS_FLAG in", values, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagNotIn(List<String> values) {
       addCriterion("SMS_FLAG not in", values, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagBetween(String value1, String value2) {
       addCriterion("SMS_FLAG between", value1, value2, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
 
     public WorkPlanExample.Criteria andSmsFlagNotBetween(String value1, String value2) {
       addCriterion("SMS_FLAG not between", value1, value2, "smsFlag");
       return (WorkPlanExample.Criteria)this;
     }
   }
 }

