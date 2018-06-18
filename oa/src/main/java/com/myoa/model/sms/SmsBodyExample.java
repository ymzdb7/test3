 package com.myoa.model.sms;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class SmsBodyExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public SmsBodyExample()
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
 
   public static class Criteria extends SmsBodyExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<SmsBodyExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<SmsBodyExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<SmsBodyExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new SmsBodyExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new SmsBodyExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new SmsBodyExample.Criterion(condition, value1, value2));
     }
 
     public SmsBodyExample.Criteria andBodyIdIsNull() {
       addCriterion("BODY_ID is null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdIsNotNull() {
       addCriterion("BODY_ID is not null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdEqualTo(Integer value) {
       addCriterion("BODY_ID =", value, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdNotEqualTo(Integer value) {
       addCriterion("BODY_ID <>", value, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdGreaterThan(Integer value) {
       addCriterion("BODY_ID >", value, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("BODY_ID >=", value, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdLessThan(Integer value) {
       addCriterion("BODY_ID <", value, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdLessThanOrEqualTo(Integer value) {
       addCriterion("BODY_ID <=", value, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdIn(List<Integer> values) {
       addCriterion("BODY_ID in", values, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdNotIn(List<Integer> values) {
       addCriterion("BODY_ID not in", values, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdBetween(Integer value1, Integer value2) {
       addCriterion("BODY_ID between", value1, value2, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andBodyIdNotBetween(Integer value1, Integer value2) {
       addCriterion("BODY_ID not between", value1, value2, "bodyId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdIsNull() {
       addCriterion("FROM_ID is null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdIsNotNull() {
       addCriterion("FROM_ID is not null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdEqualTo(String value) {
       addCriterion("FROM_ID =", value, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdNotEqualTo(String value) {
       addCriterion("FROM_ID <>", value, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdGreaterThan(String value) {
       addCriterion("FROM_ID >", value, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdGreaterThanOrEqualTo(String value) {
       addCriterion("FROM_ID >=", value, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdLessThan(String value) {
       addCriterion("FROM_ID <", value, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdLessThanOrEqualTo(String value) {
       addCriterion("FROM_ID <=", value, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdLike(String value) {
       addCriterion("FROM_ID like", value, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdNotLike(String value) {
       addCriterion("FROM_ID not like", value, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdIn(List<String> values) {
       addCriterion("FROM_ID in", values, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdNotIn(List<String> values) {
       addCriterion("FROM_ID not in", values, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdBetween(String value1, String value2) {
       addCriterion("FROM_ID between", value1, value2, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andFromIdNotBetween(String value1, String value2) {
       addCriterion("FROM_ID not between", value1, value2, "fromId");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeIsNull() {
       addCriterion("SMS_TYPE is null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeIsNotNull() {
       addCriterion("SMS_TYPE is not null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeEqualTo(String value) {
       addCriterion("SMS_TYPE =", value, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeNotEqualTo(String value) {
       addCriterion("SMS_TYPE <>", value, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeGreaterThan(String value) {
       addCriterion("SMS_TYPE >", value, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeGreaterThanOrEqualTo(String value) {
       addCriterion("SMS_TYPE >=", value, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeLessThan(String value) {
       addCriterion("SMS_TYPE <", value, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeLessThanOrEqualTo(String value) {
       addCriterion("SMS_TYPE <=", value, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeLike(String value) {
       addCriterion("SMS_TYPE like", value, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeNotLike(String value) {
       addCriterion("SMS_TYPE not like", value, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeIn(List<String> values) {
       addCriterion("SMS_TYPE in", values, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeNotIn(List<String> values) {
       addCriterion("SMS_TYPE not in", values, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeBetween(String value1, String value2) {
       addCriterion("SMS_TYPE between", value1, value2, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSmsTypeNotBetween(String value1, String value2) {
       addCriterion("SMS_TYPE not between", value1, value2, "smsType");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeIsNull() {
       addCriterion("SEND_TIME is null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeIsNotNull() {
       addCriterion("SEND_TIME is not null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeEqualTo(Integer value) {
       addCriterion("SEND_TIME =", value, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeNotEqualTo(Integer value) {
       addCriterion("SEND_TIME <>", value, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeGreaterThan(Integer value) {
       addCriterion("SEND_TIME >", value, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeGreaterThanOrEqualTo(Integer value) {
       addCriterion("SEND_TIME >=", value, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeLessThan(Integer value) {
       addCriterion("SEND_TIME <", value, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeLessThanOrEqualTo(Integer value) {
       addCriterion("SEND_TIME <=", value, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeIn(List<Integer> values) {
       addCriterion("SEND_TIME in", values, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeNotIn(List<Integer> values) {
       addCriterion("SEND_TIME not in", values, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeBetween(Integer value1, Integer value2) {
       addCriterion("SEND_TIME between", value1, value2, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andSendTimeNotBetween(Integer value1, Integer value2) {
       addCriterion("SEND_TIME not between", value1, value2, "sendTime");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlIsNull() {
       addCriterion("REMIND_URL is null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlIsNotNull() {
       addCriterion("REMIND_URL is not null");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlEqualTo(String value) {
       addCriterion("REMIND_URL =", value, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlNotEqualTo(String value) {
       addCriterion("REMIND_URL <>", value, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlGreaterThan(String value) {
       addCriterion("REMIND_URL >", value, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlGreaterThanOrEqualTo(String value) {
       addCriterion("REMIND_URL >=", value, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlLessThan(String value) {
       addCriterion("REMIND_URL <", value, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlLessThanOrEqualTo(String value) {
       addCriterion("REMIND_URL <=", value, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlLike(String value) {
       addCriterion("REMIND_URL like", value, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlNotLike(String value) {
       addCriterion("REMIND_URL not like", value, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlIn(List<String> values) {
       addCriterion("REMIND_URL in", values, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlNotIn(List<String> values) {
       addCriterion("REMIND_URL not in", values, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlBetween(String value1, String value2) {
       addCriterion("REMIND_URL between", value1, value2, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
 
     public SmsBodyExample.Criteria andRemindUrlNotBetween(String value1, String value2) {
       addCriterion("REMIND_URL not between", value1, value2, "remindUrl");
       return (SmsBodyExample.Criteria)this;
     }
   }
 }

