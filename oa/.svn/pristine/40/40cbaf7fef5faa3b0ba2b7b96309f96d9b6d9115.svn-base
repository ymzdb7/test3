 package com.myoa.model.sms2;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class Sms2Example
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public Sms2Example()
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
 
   public static class Criteria extends Sms2Example.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<Sms2Example.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<Sms2Example.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<Sms2Example.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new Sms2Example.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new Sms2Example.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new Sms2Example.Criterion(condition, value1, value2));
     }
 
     public Sms2Example.Criteria andSmsIdIsNull() {
       addCriterion("SMS_ID is null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdIsNotNull() {
       addCriterion("SMS_ID is not null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdEqualTo(Integer value) {
       addCriterion("SMS_ID =", value, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdNotEqualTo(Integer value) {
       addCriterion("SMS_ID <>", value, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdGreaterThan(Integer value) {
       addCriterion("SMS_ID >", value, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("SMS_ID >=", value, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdLessThan(Integer value) {
       addCriterion("SMS_ID <", value, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdLessThanOrEqualTo(Integer value) {
       addCriterion("SMS_ID <=", value, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdIn(List<Integer> values) {
       addCriterion("SMS_ID in", values, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdNotIn(List<Integer> values) {
       addCriterion("SMS_ID not in", values, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdBetween(Integer value1, Integer value2) {
       addCriterion("SMS_ID between", value1, value2, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSmsIdNotBetween(Integer value1, Integer value2) {
       addCriterion("SMS_ID not between", value1, value2, "smsId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdIsNull() {
       addCriterion("FROM_ID is null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdIsNotNull() {
       addCriterion("FROM_ID is not null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdEqualTo(String value) {
       addCriterion("FROM_ID =", value, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdNotEqualTo(String value) {
       addCriterion("FROM_ID <>", value, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdGreaterThan(String value) {
       addCriterion("FROM_ID >", value, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdGreaterThanOrEqualTo(String value) {
       addCriterion("FROM_ID >=", value, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdLessThan(String value) {
       addCriterion("FROM_ID <", value, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdLessThanOrEqualTo(String value) {
       addCriterion("FROM_ID <=", value, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdLike(String value) {
       addCriterion("FROM_ID like", value, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdNotLike(String value) {
       addCriterion("FROM_ID not like", value, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdIn(List<String> values) {
       addCriterion("FROM_ID in", values, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdNotIn(List<String> values) {
       addCriterion("FROM_ID not in", values, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdBetween(String value1, String value2) {
       addCriterion("FROM_ID between", value1, value2, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andFromIdNotBetween(String value1, String value2) {
       addCriterion("FROM_ID not between", value1, value2, "fromId");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneIsNull() {
       addCriterion("PHONE is null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneIsNotNull() {
       addCriterion("PHONE is not null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneEqualTo(String value) {
       addCriterion("PHONE =", value, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneNotEqualTo(String value) {
       addCriterion("PHONE <>", value, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneGreaterThan(String value) {
       addCriterion("PHONE >", value, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneGreaterThanOrEqualTo(String value) {
       addCriterion("PHONE >=", value, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneLessThan(String value) {
       addCriterion("PHONE <", value, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneLessThanOrEqualTo(String value) {
       addCriterion("PHONE <=", value, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneLike(String value) {
       addCriterion("PHONE like", value, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneNotLike(String value) {
       addCriterion("PHONE not like", value, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneIn(List<String> values) {
       addCriterion("PHONE in", values, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneNotIn(List<String> values) {
       addCriterion("PHONE not in", values, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneBetween(String value1, String value2) {
       addCriterion("PHONE between", value1, value2, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andPhoneNotBetween(String value1, String value2) {
       addCriterion("PHONE not between", value1, value2, "phone");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeIsNull() {
       addCriterion("SEND_TIME is null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeIsNotNull() {
       addCriterion("SEND_TIME is not null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeEqualTo(Date value) {
       addCriterion("SEND_TIME =", value, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeNotEqualTo(Date value) {
       addCriterion("SEND_TIME <>", value, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeGreaterThan(Date value) {
       addCriterion("SEND_TIME >", value, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("SEND_TIME >=", value, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeLessThan(Date value) {
       addCriterion("SEND_TIME <", value, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeLessThanOrEqualTo(Date value) {
       addCriterion("SEND_TIME <=", value, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeIn(List<Date> values) {
       addCriterion("SEND_TIME in", values, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeNotIn(List<Date> values) {
       addCriterion("SEND_TIME not in", values, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeBetween(Date value1, Date value2) {
       addCriterion("SEND_TIME between", value1, value2, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendTimeNotBetween(Date value1, Date value2) {
       addCriterion("SEND_TIME not between", value1, value2, "sendTime");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagIsNull() {
       addCriterion("SEND_FLAG is null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagIsNotNull() {
       addCriterion("SEND_FLAG is not null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagEqualTo(String value) {
       addCriterion("SEND_FLAG =", value, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagNotEqualTo(String value) {
       addCriterion("SEND_FLAG <>", value, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagGreaterThan(String value) {
       addCriterion("SEND_FLAG >", value, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagGreaterThanOrEqualTo(String value) {
       addCriterion("SEND_FLAG >=", value, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagLessThan(String value) {
       addCriterion("SEND_FLAG <", value, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagLessThanOrEqualTo(String value) {
       addCriterion("SEND_FLAG <=", value, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagLike(String value) {
       addCriterion("SEND_FLAG like", value, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagNotLike(String value) {
       addCriterion("SEND_FLAG not like", value, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagIn(List<String> values) {
       addCriterion("SEND_FLAG in", values, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagNotIn(List<String> values) {
       addCriterion("SEND_FLAG not in", values, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagBetween(String value1, String value2) {
       addCriterion("SEND_FLAG between", value1, value2, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendFlagNotBetween(String value1, String value2) {
       addCriterion("SEND_FLAG not between", value1, value2, "sendFlag");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumIsNull() {
       addCriterion("SEND_NUM is null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumIsNotNull() {
       addCriterion("SEND_NUM is not null");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumEqualTo(Byte value) {
       addCriterion("SEND_NUM =", value, "sendNum");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumNotEqualTo(Byte value) {
       addCriterion("SEND_NUM <>", value, "sendNum");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumGreaterThan(Byte value) {
       addCriterion("SEND_NUM >", value, "sendNum");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumGreaterThanOrEqualTo(Byte value) {
       addCriterion("SEND_NUM >=", value, "sendNum");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumLessThan(Byte value) {
       addCriterion("SEND_NUM <", value, "sendNum");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumLessThanOrEqualTo(Byte value) {
       addCriterion("SEND_NUM <=", value, "sendNum");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumIn(List<Byte> values) {
       addCriterion("SEND_NUM in", values, "sendNum");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumNotIn(List<Byte> values) {
       addCriterion("SEND_NUM not in", values, "sendNum");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumBetween(Byte value1, Byte value2) {
       addCriterion("SEND_NUM between", value1, value2, "sendNum");
       return (Sms2Example.Criteria)this;
     }
 
     public Sms2Example.Criteria andSendNumNotBetween(Byte value1, Byte value2) {
       addCriterion("SEND_NUM not between", value1, value2, "sendNum");
       return (Sms2Example.Criteria)this;
     }
   }
 }

