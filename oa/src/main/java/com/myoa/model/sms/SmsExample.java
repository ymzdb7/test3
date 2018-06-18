 package com.myoa.model.sms;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class SmsExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public SmsExample()
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
 
   public static class Criteria extends SmsExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<SmsExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<SmsExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<SmsExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new SmsExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new SmsExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new SmsExample.Criterion(condition, value1, value2));
     }
 
     public SmsExample.Criteria andSmsIdIsNull() {
       addCriterion("SMS_ID is null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdIsNotNull() {
       addCriterion("SMS_ID is not null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdEqualTo(Integer value) {
       addCriterion("SMS_ID =", value, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdNotEqualTo(Integer value) {
       addCriterion("SMS_ID <>", value, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdGreaterThan(Integer value) {
       addCriterion("SMS_ID >", value, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("SMS_ID >=", value, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdLessThan(Integer value) {
       addCriterion("SMS_ID <", value, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdLessThanOrEqualTo(Integer value) {
       addCriterion("SMS_ID <=", value, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdIn(List<Integer> values) {
       addCriterion("SMS_ID in", values, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdNotIn(List<Integer> values) {
       addCriterion("SMS_ID not in", values, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdBetween(Integer value1, Integer value2) {
       addCriterion("SMS_ID between", value1, value2, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andSmsIdNotBetween(Integer value1, Integer value2) {
       addCriterion("SMS_ID not between", value1, value2, "smsId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdIsNull() {
       addCriterion("TO_ID is null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdIsNotNull() {
       addCriterion("TO_ID is not null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdEqualTo(String value) {
       addCriterion("TO_ID =", value, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdNotEqualTo(String value) {
       addCriterion("TO_ID <>", value, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdGreaterThan(String value) {
       addCriterion("TO_ID >", value, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdGreaterThanOrEqualTo(String value) {
       addCriterion("TO_ID >=", value, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdLessThan(String value) {
       addCriterion("TO_ID <", value, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdLessThanOrEqualTo(String value) {
       addCriterion("TO_ID <=", value, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdLike(String value) {
       addCriterion("TO_ID like", value, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdNotLike(String value) {
       addCriterion("TO_ID not like", value, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdIn(List<String> values) {
       addCriterion("TO_ID in", values, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdNotIn(List<String> values) {
       addCriterion("TO_ID not in", values, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdBetween(String value1, String value2) {
       addCriterion("TO_ID between", value1, value2, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andToIdNotBetween(String value1, String value2) {
       addCriterion("TO_ID not between", value1, value2, "toId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagIsNull() {
       addCriterion("REMIND_FLAG is null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagIsNotNull() {
       addCriterion("REMIND_FLAG is not null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagEqualTo(String value) {
       addCriterion("REMIND_FLAG =", value, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagNotEqualTo(String value) {
       addCriterion("REMIND_FLAG <>", value, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagGreaterThan(String value) {
       addCriterion("REMIND_FLAG >", value, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagGreaterThanOrEqualTo(String value) {
       addCriterion("REMIND_FLAG >=", value, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagLessThan(String value) {
       addCriterion("REMIND_FLAG <", value, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagLessThanOrEqualTo(String value) {
       addCriterion("REMIND_FLAG <=", value, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagLike(String value) {
       addCriterion("REMIND_FLAG like", value, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagNotLike(String value) {
       addCriterion("REMIND_FLAG not like", value, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagIn(List<String> values) {
       addCriterion("REMIND_FLAG in", values, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagNotIn(List<String> values) {
       addCriterion("REMIND_FLAG not in", values, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagBetween(String value1, String value2) {
       addCriterion("REMIND_FLAG between", value1, value2, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindFlagNotBetween(String value1, String value2) {
       addCriterion("REMIND_FLAG not between", value1, value2, "remindFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagIsNull() {
       addCriterion("DELETE_FLAG is null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagIsNotNull() {
       addCriterion("DELETE_FLAG is not null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagEqualTo(String value) {
       addCriterion("DELETE_FLAG =", value, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagNotEqualTo(String value) {
       addCriterion("DELETE_FLAG <>", value, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagGreaterThan(String value) {
       addCriterion("DELETE_FLAG >", value, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
       addCriterion("DELETE_FLAG >=", value, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagLessThan(String value) {
       addCriterion("DELETE_FLAG <", value, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagLessThanOrEqualTo(String value) {
       addCriterion("DELETE_FLAG <=", value, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagLike(String value) {
       addCriterion("DELETE_FLAG like", value, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagNotLike(String value) {
       addCriterion("DELETE_FLAG not like", value, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagIn(List<String> values) {
       addCriterion("DELETE_FLAG in", values, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagNotIn(List<String> values) {
       addCriterion("DELETE_FLAG not in", values, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagBetween(String value1, String value2) {
       addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andDeleteFlagNotBetween(String value1, String value2) {
       addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdIsNull() {
       addCriterion("BODY_ID is null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdIsNotNull() {
       addCriterion("BODY_ID is not null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdEqualTo(Integer value) {
       addCriterion("BODY_ID =", value, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdNotEqualTo(Integer value) {
       addCriterion("BODY_ID <>", value, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdGreaterThan(Integer value) {
       addCriterion("BODY_ID >", value, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("BODY_ID >=", value, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdLessThan(Integer value) {
       addCriterion("BODY_ID <", value, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdLessThanOrEqualTo(Integer value) {
       addCriterion("BODY_ID <=", value, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdIn(List<Integer> values) {
       addCriterion("BODY_ID in", values, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdNotIn(List<Integer> values) {
       addCriterion("BODY_ID not in", values, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdBetween(Integer value1, Integer value2) {
       addCriterion("BODY_ID between", value1, value2, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andBodyIdNotBetween(Integer value1, Integer value2) {
       addCriterion("BODY_ID not between", value1, value2, "bodyId");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeIsNull() {
       addCriterion("REMIND_TIME is null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeIsNotNull() {
       addCriterion("REMIND_TIME is not null");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeEqualTo(Integer value) {
       addCriterion("REMIND_TIME =", value, "remindTime");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeNotEqualTo(Integer value) {
       addCriterion("REMIND_TIME <>", value, "remindTime");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeGreaterThan(Integer value) {
       addCriterion("REMIND_TIME >", value, "remindTime");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeGreaterThanOrEqualTo(Integer value) {
       addCriterion("REMIND_TIME >=", value, "remindTime");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeLessThan(Integer value) {
       addCriterion("REMIND_TIME <", value, "remindTime");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeLessThanOrEqualTo(Integer value) {
       addCriterion("REMIND_TIME <=", value, "remindTime");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeIn(List<Integer> values) {
       addCriterion("REMIND_TIME in", values, "remindTime");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeNotIn(List<Integer> values) {
       addCriterion("REMIND_TIME not in", values, "remindTime");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeBetween(Integer value1, Integer value2) {
       addCriterion("REMIND_TIME between", value1, value2, "remindTime");
       return (SmsExample.Criteria)this;
     }
 
     public SmsExample.Criteria andRemindTimeNotBetween(Integer value1, Integer value2) {
       addCriterion("REMIND_TIME not between", value1, value2, "remindTime");
       return (SmsExample.Criteria)this;
     }
   }
 }
