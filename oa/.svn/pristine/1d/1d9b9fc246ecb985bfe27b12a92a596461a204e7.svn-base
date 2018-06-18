 package com.myoa.model.smsSettings;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class SmsSettingsExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public SmsSettingsExample()
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
 
   public static class Criteria extends SmsSettingsExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<SmsSettingsExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<SmsSettingsExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<SmsSettingsExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new SmsSettingsExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new SmsSettingsExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new SmsSettingsExample.Criterion(condition, value1, value2));
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
 
     public SmsSettingsExample.Criteria andIdIsNull() {
       addCriterion("ID is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdIsNotNull() {
       addCriterion("ID is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("ID =", value, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("ID <>", value, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("ID >", value, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ID >=", value, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdLessThan(Integer value) {
       addCriterion("ID <", value, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("ID <=", value, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("ID in", values, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("ID not in", values, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("ID between", value1, value2, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ID not between", value1, value2, "id");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameIsNull() {
       addCriterion("NAME is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameIsNotNull() {
       addCriterion("NAME is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameEqualTo(String value) {
       addCriterion("NAME =", value, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameNotEqualTo(String value) {
       addCriterion("NAME <>", value, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameGreaterThan(String value) {
       addCriterion("NAME >", value, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameGreaterThanOrEqualTo(String value) {
       addCriterion("NAME >=", value, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameLessThan(String value) {
       addCriterion("NAME <", value, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameLessThanOrEqualTo(String value) {
       addCriterion("NAME <=", value, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameLike(String value) {
       addCriterion("NAME like", value, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameNotLike(String value) {
       addCriterion("NAME not like", value, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameIn(List<String> values) {
       addCriterion("NAME in", values, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameNotIn(List<String> values) {
       addCriterion("NAME not in", values, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameBetween(String value1, String value2) {
       addCriterion("NAME between", value1, value2, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andNameNotBetween(String value1, String value2) {
       addCriterion("NAME not between", value1, value2, "name");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolIsNull() {
       addCriterion("PROTOCOL is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolIsNotNull() {
       addCriterion("PROTOCOL is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolEqualTo(String value) {
       addCriterion("PROTOCOL =", value, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolNotEqualTo(String value) {
       addCriterion("PROTOCOL <>", value, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolGreaterThan(String value) {
       addCriterion("PROTOCOL >", value, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolGreaterThanOrEqualTo(String value) {
       addCriterion("PROTOCOL >=", value, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolLessThan(String value) {
       addCriterion("PROTOCOL <", value, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolLessThanOrEqualTo(String value) {
       addCriterion("PROTOCOL <=", value, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolLike(String value) {
       addCriterion("PROTOCOL like", value, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolNotLike(String value) {
       addCriterion("PROTOCOL not like", value, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolIn(List<String> values) {
       addCriterion("PROTOCOL in", values, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolNotIn(List<String> values) {
       addCriterion("PROTOCOL not in", values, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolBetween(String value1, String value2) {
       addCriterion("PROTOCOL between", value1, value2, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andProtocolNotBetween(String value1, String value2) {
       addCriterion("PROTOCOL not between", value1, value2, "protocol");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostIsNull() {
       addCriterion("HOST is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostIsNotNull() {
       addCriterion("HOST is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostEqualTo(String value) {
       addCriterion("HOST =", value, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostNotEqualTo(String value) {
       addCriterion("HOST <>", value, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostGreaterThan(String value) {
       addCriterion("HOST >", value, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostGreaterThanOrEqualTo(String value) {
       addCriterion("HOST >=", value, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostLessThan(String value) {
       addCriterion("HOST <", value, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostLessThanOrEqualTo(String value) {
       addCriterion("HOST <=", value, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostLike(String value) {
       addCriterion("HOST like", value, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostNotLike(String value) {
       addCriterion("HOST not like", value, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostIn(List<String> values) {
       addCriterion("HOST in", values, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostNotIn(List<String> values) {
       addCriterion("HOST not in", values, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostBetween(String value1, String value2) {
       addCriterion("HOST between", value1, value2, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andHostNotBetween(String value1, String value2) {
       addCriterion("HOST not between", value1, value2, "host");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortIsNull() {
       addCriterion("PORT is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortIsNotNull() {
       addCriterion("PORT is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortEqualTo(String value) {
       addCriterion("PORT =", value, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortNotEqualTo(String value) {
       addCriterion("PORT <>", value, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortGreaterThan(String value) {
       addCriterion("PORT >", value, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortGreaterThanOrEqualTo(String value) {
       addCriterion("PORT >=", value, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortLessThan(String value) {
       addCriterion("PORT <", value, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortLessThanOrEqualTo(String value) {
       addCriterion("PORT <=", value, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortLike(String value) {
       addCriterion("PORT like", value, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortNotLike(String value) {
       addCriterion("PORT not like", value, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortIn(List<String> values) {
       addCriterion("PORT in", values, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortNotIn(List<String> values) {
       addCriterion("PORT not in", values, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortBetween(String value1, String value2) {
       addCriterion("PORT between", value1, value2, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPortNotBetween(String value1, String value2) {
       addCriterion("PORT not between", value1, value2, "port");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameIsNull() {
       addCriterion("USERNAME is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameIsNotNull() {
       addCriterion("USERNAME is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameEqualTo(String value) {
       addCriterion("USERNAME =", value, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameNotEqualTo(String value) {
       addCriterion("USERNAME <>", value, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameGreaterThan(String value) {
       addCriterion("USERNAME >", value, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameGreaterThanOrEqualTo(String value) {
       addCriterion("USERNAME >=", value, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameLessThan(String value) {
       addCriterion("USERNAME <", value, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameLessThanOrEqualTo(String value) {
       addCriterion("USERNAME <=", value, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameLike(String value) {
       addCriterion("USERNAME like", value, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameNotLike(String value) {
       addCriterion("USERNAME not like", value, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameIn(List<String> values) {
       addCriterion("USERNAME in", values, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameNotIn(List<String> values) {
       addCriterion("USERNAME not in", values, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameBetween(String value1, String value2) {
       addCriterion("USERNAME between", value1, value2, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andUsernameNotBetween(String value1, String value2) {
       addCriterion("USERNAME not between", value1, value2, "username");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdIsNull() {
       addCriterion("PWD is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdIsNotNull() {
       addCriterion("PWD is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdEqualTo(String value) {
       addCriterion("PWD =", value, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdNotEqualTo(String value) {
       addCriterion("PWD <>", value, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdGreaterThan(String value) {
       addCriterion("PWD >", value, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdGreaterThanOrEqualTo(String value) {
       addCriterion("PWD >=", value, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdLessThan(String value) {
       addCriterion("PWD <", value, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdLessThanOrEqualTo(String value) {
       addCriterion("PWD <=", value, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdLike(String value) {
       addCriterion("PWD like", value, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdNotLike(String value) {
       addCriterion("PWD not like", value, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdIn(List<String> values) {
       addCriterion("PWD in", values, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdNotIn(List<String> values) {
       addCriterion("PWD not in", values, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdBetween(String value1, String value2) {
       addCriterion("PWD between", value1, value2, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andPwdNotBetween(String value1, String value2) {
       addCriterion("PWD not between", value1, value2, "pwd");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldIsNull() {
       addCriterion("CONTENT_FIELD is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldIsNotNull() {
       addCriterion("CONTENT_FIELD is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldEqualTo(String value) {
       addCriterion("CONTENT_FIELD =", value, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldNotEqualTo(String value) {
       addCriterion("CONTENT_FIELD <>", value, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldGreaterThan(String value) {
       addCriterion("CONTENT_FIELD >", value, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldGreaterThanOrEqualTo(String value) {
       addCriterion("CONTENT_FIELD >=", value, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldLessThan(String value) {
       addCriterion("CONTENT_FIELD <", value, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldLessThanOrEqualTo(String value) {
       addCriterion("CONTENT_FIELD <=", value, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldLike(String value) {
       addCriterion("CONTENT_FIELD like", value, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldNotLike(String value) {
       addCriterion("CONTENT_FIELD not like", value, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldIn(List<String> values) {
       addCriterion("CONTENT_FIELD in", values, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldNotIn(List<String> values) {
       addCriterion("CONTENT_FIELD not in", values, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldBetween(String value1, String value2) {
       addCriterion("CONTENT_FIELD between", value1, value2, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andContentFieldNotBetween(String value1, String value2) {
       addCriterion("CONTENT_FIELD not between", value1, value2, "contentField");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeIsNull() {
       addCriterion("CODE is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeIsNotNull() {
       addCriterion("CODE is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeEqualTo(String value) {
       addCriterion("CODE =", value, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeNotEqualTo(String value) {
       addCriterion("CODE <>", value, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeGreaterThan(String value) {
       addCriterion("CODE >", value, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeGreaterThanOrEqualTo(String value) {
       addCriterion("CODE >=", value, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeLessThan(String value) {
       addCriterion("CODE <", value, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeLessThanOrEqualTo(String value) {
       addCriterion("CODE <=", value, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeLike(String value) {
       addCriterion("CODE like", value, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeNotLike(String value) {
       addCriterion("CODE not like", value, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeIn(List<String> values) {
       addCriterion("CODE in", values, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeNotIn(List<String> values) {
       addCriterion("CODE not in", values, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeBetween(String value1, String value2) {
       addCriterion("CODE between", value1, value2, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andCodeNotBetween(String value1, String value2) {
       addCriterion("CODE not between", value1, value2, "code");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileIsNull() {
       addCriterion("MOBILE is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileIsNotNull() {
       addCriterion("MOBILE is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileEqualTo(String value) {
       addCriterion("MOBILE =", value, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileNotEqualTo(String value) {
       addCriterion("MOBILE <>", value, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileGreaterThan(String value) {
       addCriterion("MOBILE >", value, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileGreaterThanOrEqualTo(String value) {
       addCriterion("MOBILE >=", value, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileLessThan(String value) {
       addCriterion("MOBILE <", value, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileLessThanOrEqualTo(String value) {
       addCriterion("MOBILE <=", value, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileLike(String value) {
       addCriterion("MOBILE like", value, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileNotLike(String value) {
       addCriterion("MOBILE not like", value, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileIn(List<String> values) {
       addCriterion("MOBILE in", values, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileNotIn(List<String> values) {
       addCriterion("MOBILE not in", values, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileBetween(String value1, String value2) {
       addCriterion("MOBILE between", value1, value2, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andMobileNotBetween(String value1, String value2) {
       addCriterion("MOBILE not between", value1, value2, "mobile");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentIsNull() {
       addCriterion("TIME_CONTENT is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentIsNotNull() {
       addCriterion("TIME_CONTENT is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("TIME_CONTENT =", value, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("TIME_CONTENT <>", value, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("TIME_CONTENT >", value, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("TIME_CONTENT >=", value, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentLessThan(java.util.Date value) {
       addCriterionForJDBCDate("TIME_CONTENT <", value, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("TIME_CONTENT <=", value, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("TIME_CONTENT in", values, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("TIME_CONTENT not in", values, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("TIME_CONTENT between", value1, value2, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andTimeContentNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("TIME_CONTENT not between", value1, value2, "timeContent");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignIsNull() {
       addCriterion("SIGN is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignIsNotNull() {
       addCriterion("SIGN is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignEqualTo(String value) {
       addCriterion("SIGN =", value, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignNotEqualTo(String value) {
       addCriterion("SIGN <>", value, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignGreaterThan(String value) {
       addCriterion("SIGN >", value, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignGreaterThanOrEqualTo(String value) {
       addCriterion("SIGN >=", value, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignLessThan(String value) {
       addCriterion("SIGN <", value, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignLessThanOrEqualTo(String value) {
       addCriterion("SIGN <=", value, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignLike(String value) {
       addCriterion("SIGN like", value, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignNotLike(String value) {
       addCriterion("SIGN not like", value, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignIn(List<String> values) {
       addCriterion("SIGN in", values, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignNotIn(List<String> values) {
       addCriterion("SIGN not in", values, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignBetween(String value1, String value2) {
       addCriterion("SIGN between", value1, value2, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andSignNotBetween(String value1, String value2) {
       addCriterion("SIGN not between", value1, value2, "sign");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationIsNull() {
       addCriterion("LOCATION is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationIsNotNull() {
       addCriterion("LOCATION is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationEqualTo(String value) {
       addCriterion("LOCATION =", value, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationNotEqualTo(String value) {
       addCriterion("LOCATION <>", value, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationGreaterThan(String value) {
       addCriterion("LOCATION >", value, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationGreaterThanOrEqualTo(String value) {
       addCriterion("LOCATION >=", value, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationLessThan(String value) {
       addCriterion("LOCATION <", value, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationLessThanOrEqualTo(String value) {
       addCriterion("LOCATION <=", value, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationLike(String value) {
       addCriterion("LOCATION like", value, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationNotLike(String value) {
       addCriterion("LOCATION not like", value, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationIn(List<String> values) {
       addCriterion("LOCATION in", values, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationNotIn(List<String> values) {
       addCriterion("LOCATION not in", values, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationBetween(String value1, String value2) {
       addCriterion("LOCATION between", value1, value2, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andLocationNotBetween(String value1, String value2) {
       addCriterion("LOCATION not between", value1, value2, "location");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1IsNull() {
       addCriterion("EXTEND_1 is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1IsNotNull() {
       addCriterion("EXTEND_1 is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1EqualTo(String value) {
       addCriterion("EXTEND_1 =", value, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1NotEqualTo(String value) {
       addCriterion("EXTEND_1 <>", value, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1GreaterThan(String value) {
       addCriterion("EXTEND_1 >", value, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1GreaterThanOrEqualTo(String value) {
       addCriterion("EXTEND_1 >=", value, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1LessThan(String value) {
       addCriterion("EXTEND_1 <", value, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1LessThanOrEqualTo(String value) {
       addCriterion("EXTEND_1 <=", value, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1Like(String value) {
       addCriterion("EXTEND_1 like", value, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1NotLike(String value) {
       addCriterion("EXTEND_1 not like", value, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1In(List<String> values) {
       addCriterion("EXTEND_1 in", values, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1NotIn(List<String> values) {
       addCriterion("EXTEND_1 not in", values, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1Between(String value1, String value2) {
       addCriterion("EXTEND_1 between", value1, value2, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend1NotBetween(String value1, String value2) {
       addCriterion("EXTEND_1 not between", value1, value2, "extend1");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2IsNull() {
       addCriterion("EXTEND_2 is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2IsNotNull() {
       addCriterion("EXTEND_2 is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2EqualTo(String value) {
       addCriterion("EXTEND_2 =", value, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2NotEqualTo(String value) {
       addCriterion("EXTEND_2 <>", value, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2GreaterThan(String value) {
       addCriterion("EXTEND_2 >", value, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2GreaterThanOrEqualTo(String value) {
       addCriterion("EXTEND_2 >=", value, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2LessThan(String value) {
       addCriterion("EXTEND_2 <", value, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2LessThanOrEqualTo(String value) {
       addCriterion("EXTEND_2 <=", value, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2Like(String value) {
       addCriterion("EXTEND_2 like", value, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2NotLike(String value) {
       addCriterion("EXTEND_2 not like", value, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2In(List<String> values) {
       addCriterion("EXTEND_2 in", values, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2NotIn(List<String> values) {
       addCriterion("EXTEND_2 not in", values, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2Between(String value1, String value2) {
       addCriterion("EXTEND_2 between", value1, value2, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend2NotBetween(String value1, String value2) {
       addCriterion("EXTEND_2 not between", value1, value2, "extend2");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3IsNull() {
       addCriterion("EXTEND_3 is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3IsNotNull() {
       addCriterion("EXTEND_3 is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3EqualTo(String value) {
       addCriterion("EXTEND_3 =", value, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3NotEqualTo(String value) {
       addCriterion("EXTEND_3 <>", value, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3GreaterThan(String value) {
       addCriterion("EXTEND_3 >", value, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3GreaterThanOrEqualTo(String value) {
       addCriterion("EXTEND_3 >=", value, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3LessThan(String value) {
       addCriterion("EXTEND_3 <", value, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3LessThanOrEqualTo(String value) {
       addCriterion("EXTEND_3 <=", value, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3Like(String value) {
       addCriterion("EXTEND_3 like", value, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3NotLike(String value) {
       addCriterion("EXTEND_3 not like", value, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3In(List<String> values) {
       addCriterion("EXTEND_3 in", values, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3NotIn(List<String> values) {
       addCriterion("EXTEND_3 not in", values, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3Between(String value1, String value2) {
       addCriterion("EXTEND_3 between", value1, value2, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend3NotBetween(String value1, String value2) {
       addCriterion("EXTEND_3 not between", value1, value2, "extend3");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4IsNull() {
       addCriterion("EXTEND_4 is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4IsNotNull() {
       addCriterion("EXTEND_4 is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4EqualTo(String value) {
       addCriterion("EXTEND_4 =", value, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4NotEqualTo(String value) {
       addCriterion("EXTEND_4 <>", value, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4GreaterThan(String value) {
       addCriterion("EXTEND_4 >", value, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4GreaterThanOrEqualTo(String value) {
       addCriterion("EXTEND_4 >=", value, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4LessThan(String value) {
       addCriterion("EXTEND_4 <", value, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4LessThanOrEqualTo(String value) {
       addCriterion("EXTEND_4 <=", value, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4Like(String value) {
       addCriterion("EXTEND_4 like", value, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4NotLike(String value) {
       addCriterion("EXTEND_4 not like", value, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4In(List<String> values) {
       addCriterion("EXTEND_4 in", values, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4NotIn(List<String> values) {
       addCriterion("EXTEND_4 not in", values, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4Between(String value1, String value2) {
       addCriterion("EXTEND_4 between", value1, value2, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend4NotBetween(String value1, String value2) {
       addCriterion("EXTEND_4 not between", value1, value2, "extend4");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5IsNull() {
       addCriterion("EXTEND_5 is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5IsNotNull() {
       addCriterion("EXTEND_5 is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5EqualTo(String value) {
       addCriterion("EXTEND_5 =", value, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5NotEqualTo(String value) {
       addCriterion("EXTEND_5 <>", value, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5GreaterThan(String value) {
       addCriterion("EXTEND_5 >", value, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5GreaterThanOrEqualTo(String value) {
       addCriterion("EXTEND_5 >=", value, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5LessThan(String value) {
       addCriterion("EXTEND_5 <", value, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5LessThanOrEqualTo(String value) {
       addCriterion("EXTEND_5 <=", value, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5Like(String value) {
       addCriterion("EXTEND_5 like", value, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5NotLike(String value) {
       addCriterion("EXTEND_5 not like", value, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5In(List<String> values) {
       addCriterion("EXTEND_5 in", values, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5NotIn(List<String> values) {
       addCriterion("EXTEND_5 not in", values, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5Between(String value1, String value2) {
       addCriterion("EXTEND_5 between", value1, value2, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andExtend5NotBetween(String value1, String value2) {
       addCriterion("EXTEND_5 not between", value1, value2, "extend5");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateIsNull() {
       addCriterion("STATE is null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateIsNotNull() {
       addCriterion("STATE is not null");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateEqualTo(String value) {
       addCriterion("STATE =", value, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateNotEqualTo(String value) {
       addCriterion("STATE <>", value, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateGreaterThan(String value) {
       addCriterion("STATE >", value, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateGreaterThanOrEqualTo(String value) {
       addCriterion("STATE >=", value, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateLessThan(String value) {
       addCriterion("STATE <", value, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateLessThanOrEqualTo(String value) {
       addCriterion("STATE <=", value, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateLike(String value) {
       addCriterion("STATE like", value, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateNotLike(String value) {
       addCriterion("STATE not like", value, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateIn(List<String> values) {
       addCriterion("STATE in", values, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateNotIn(List<String> values) {
       addCriterion("STATE not in", values, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateBetween(String value1, String value2) {
       addCriterion("STATE between", value1, value2, "state");
       return (SmsSettingsExample.Criteria)this;
     }
 
     public SmsSettingsExample.Criteria andStateNotBetween(String value1, String value2) {
       addCriterion("STATE not between", value1, value2, "state");
       return (SmsSettingsExample.Criteria)this;
     }
   }
 }

