 package com.myoa.model.sms3;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class Sms3Example
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public Sms3Example()
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
 
   public static class Criteria extends Sms3Example.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<Sms3Example.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<Sms3Example.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<Sms3Example.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new Sms3Example.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new Sms3Example.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new Sms3Example.Criterion(condition, value1, value2));
     }
 
     public Sms3Example.Criteria andSmsIdIsNull() {
       addCriterion("SMS_ID is null");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdIsNotNull() {
       addCriterion("SMS_ID is not null");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdEqualTo(Integer value) {
       addCriterion("SMS_ID =", value, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdNotEqualTo(Integer value) {
       addCriterion("SMS_ID <>", value, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdGreaterThan(Integer value) {
       addCriterion("SMS_ID >", value, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("SMS_ID >=", value, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdLessThan(Integer value) {
       addCriterion("SMS_ID <", value, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdLessThanOrEqualTo(Integer value) {
       addCriterion("SMS_ID <=", value, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdIn(List<Integer> values) {
       addCriterion("SMS_ID in", values, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdNotIn(List<Integer> values) {
       addCriterion("SMS_ID not in", values, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdBetween(Integer value1, Integer value2) {
       addCriterion("SMS_ID between", value1, value2, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSmsIdNotBetween(Integer value1, Integer value2) {
       addCriterion("SMS_ID not between", value1, value2, "smsId");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneIsNull() {
       addCriterion("PHONE is null");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneIsNotNull() {
       addCriterion("PHONE is not null");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneEqualTo(String value) {
       addCriterion("PHONE =", value, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneNotEqualTo(String value) {
       addCriterion("PHONE <>", value, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneGreaterThan(String value) {
       addCriterion("PHONE >", value, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneGreaterThanOrEqualTo(String value) {
       addCriterion("PHONE >=", value, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneLessThan(String value) {
       addCriterion("PHONE <", value, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneLessThanOrEqualTo(String value) {
       addCriterion("PHONE <=", value, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneLike(String value) {
       addCriterion("PHONE like", value, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneNotLike(String value) {
       addCriterion("PHONE not like", value, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneIn(List<String> values) {
       addCriterion("PHONE in", values, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneNotIn(List<String> values) {
       addCriterion("PHONE not in", values, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneBetween(String value1, String value2) {
       addCriterion("PHONE between", value1, value2, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andPhoneNotBetween(String value1, String value2) {
       addCriterion("PHONE not between", value1, value2, "phone");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeIsNull() {
       addCriterion("SEND_TIME is null");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeIsNotNull() {
       addCriterion("SEND_TIME is not null");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeEqualTo(Date value) {
       addCriterion("SEND_TIME =", value, "sendTime");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeNotEqualTo(Date value) {
       addCriterion("SEND_TIME <>", value, "sendTime");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeGreaterThan(Date value) {
       addCriterion("SEND_TIME >", value, "sendTime");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("SEND_TIME >=", value, "sendTime");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeLessThan(Date value) {
       addCriterion("SEND_TIME <", value, "sendTime");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeLessThanOrEqualTo(Date value) {
       addCriterion("SEND_TIME <=", value, "sendTime");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeIn(List<Date> values) {
       addCriterion("SEND_TIME in", values, "sendTime");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeNotIn(List<Date> values) {
       addCriterion("SEND_TIME not in", values, "sendTime");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeBetween(Date value1, Date value2) {
       addCriterion("SEND_TIME between", value1, value2, "sendTime");
       return (Sms3Example.Criteria)this;
     }
 
     public Sms3Example.Criteria andSendTimeNotBetween(Date value1, Date value2) {
       addCriterion("SEND_TIME not between", value1, value2, "sendTime");
       return (Sms3Example.Criteria)this;
     }
   }
 }
