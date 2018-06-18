 package com.myoa.model.sms2;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class Sms2PrivExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public Sms2PrivExample()
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
 
   public static class Criteria extends Sms2PrivExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<Sms2PrivExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<Sms2PrivExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<Sms2PrivExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new Sms2PrivExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new Sms2PrivExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new Sms2PrivExample.Criterion(condition, value1, value2));
     }
 
     public Sms2PrivExample.Criteria andOutToSelfIsNull() {
       addCriterion("OUT_TO_SELF is null");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfIsNotNull() {
       addCriterion("OUT_TO_SELF is not null");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfEqualTo(String value) {
       addCriterion("OUT_TO_SELF =", value, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfNotEqualTo(String value) {
       addCriterion("OUT_TO_SELF <>", value, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfGreaterThan(String value) {
       addCriterion("OUT_TO_SELF >", value, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfGreaterThanOrEqualTo(String value) {
       addCriterion("OUT_TO_SELF >=", value, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfLessThan(String value) {
       addCriterion("OUT_TO_SELF <", value, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfLessThanOrEqualTo(String value) {
       addCriterion("OUT_TO_SELF <=", value, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfLike(String value) {
       addCriterion("OUT_TO_SELF like", value, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfNotLike(String value) {
       addCriterion("OUT_TO_SELF not like", value, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfIn(List<String> values) {
       addCriterion("OUT_TO_SELF in", values, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfNotIn(List<String> values) {
       addCriterion("OUT_TO_SELF not in", values, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfBetween(String value1, String value2) {
       addCriterion("OUT_TO_SELF between", value1, value2, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
 
     public Sms2PrivExample.Criteria andOutToSelfNotBetween(String value1, String value2) {
       addCriterion("OUT_TO_SELF not between", value1, value2, "outToSelf");
       return (Sms2PrivExample.Criteria)this;
     }
   }
 }
