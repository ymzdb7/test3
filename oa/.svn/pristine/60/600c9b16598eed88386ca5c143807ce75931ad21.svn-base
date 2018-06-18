 package com.myoa.model.workPlan;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class PlanTypeExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public PlanTypeExample()
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
 
   public static class Criteria extends PlanTypeExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<PlanTypeExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<PlanTypeExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<PlanTypeExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new PlanTypeExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new PlanTypeExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new PlanTypeExample.Criterion(condition, value1, value2));
     }
 
     public PlanTypeExample.Criteria andTypeIdIsNull() {
       addCriterion("TYPE_ID is null");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdIsNotNull() {
       addCriterion("TYPE_ID is not null");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdEqualTo(Integer value) {
       addCriterion("TYPE_ID =", value, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdNotEqualTo(Integer value) {
       addCriterion("TYPE_ID <>", value, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdGreaterThan(Integer value) {
       addCriterion("TYPE_ID >", value, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("TYPE_ID >=", value, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdLessThan(Integer value) {
       addCriterion("TYPE_ID <", value, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdLessThanOrEqualTo(Integer value) {
       addCriterion("TYPE_ID <=", value, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdIn(List<Integer> values) {
       addCriterion("TYPE_ID in", values, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdNotIn(List<Integer> values) {
       addCriterion("TYPE_ID not in", values, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdBetween(Integer value1, Integer value2) {
       addCriterion("TYPE_ID between", value1, value2, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
       addCriterion("TYPE_ID not between", value1, value2, "typeId");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameIsNull() {
       addCriterion("TYPE_NAME is null");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameIsNotNull() {
       addCriterion("TYPE_NAME is not null");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameEqualTo(String value) {
       addCriterion("TYPE_NAME =", value, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameNotEqualTo(String value) {
       addCriterion("TYPE_NAME <>", value, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameGreaterThan(String value) {
       addCriterion("TYPE_NAME >", value, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameGreaterThanOrEqualTo(String value) {
       addCriterion("TYPE_NAME >=", value, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameLessThan(String value) {
       addCriterion("TYPE_NAME <", value, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameLessThanOrEqualTo(String value) {
       addCriterion("TYPE_NAME <=", value, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameLike(String value) {
       addCriterion("TYPE_NAME like", value, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameNotLike(String value) {
       addCriterion("TYPE_NAME not like", value, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameIn(List<String> values) {
       addCriterion("TYPE_NAME in", values, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameNotIn(List<String> values) {
       addCriterion("TYPE_NAME not in", values, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameBetween(String value1, String value2) {
       addCriterion("TYPE_NAME between", value1, value2, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNameNotBetween(String value1, String value2) {
       addCriterion("TYPE_NAME not between", value1, value2, "typeName");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoIsNull() {
       addCriterion("TYPE_NO is null");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoIsNotNull() {
       addCriterion("TYPE_NO is not null");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoEqualTo(Integer value) {
       addCriterion("TYPE_NO =", value, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoNotEqualTo(Integer value) {
       addCriterion("TYPE_NO <>", value, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoGreaterThan(Integer value) {
       addCriterion("TYPE_NO >", value, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoGreaterThanOrEqualTo(Integer value) {
       addCriterion("TYPE_NO >=", value, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoLessThan(Integer value) {
       addCriterion("TYPE_NO <", value, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoLessThanOrEqualTo(Integer value) {
       addCriterion("TYPE_NO <=", value, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoIn(List<Integer> values) {
       addCriterion("TYPE_NO in", values, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoNotIn(List<Integer> values) {
       addCriterion("TYPE_NO not in", values, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoBetween(Integer value1, Integer value2) {
       addCriterion("TYPE_NO between", value1, value2, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
 
     public PlanTypeExample.Criteria andTypeNoNotBetween(Integer value1, Integer value2) {
       addCriterion("TYPE_NO not between", value1, value2, "typeNo");
       return (PlanTypeExample.Criteria)this;
     }
   }
 }

