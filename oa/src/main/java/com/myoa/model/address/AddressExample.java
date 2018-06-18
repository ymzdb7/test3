 package com.myoa.model.address;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class AddressExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public AddressExample()
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
 
   public static class Criteria extends AddressExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<AddressExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<AddressExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<AddressExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new AddressExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
      this.criteria.add(new AddressExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new AddressExample.Criterion(condition, value1, value2));
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
 
     public AddressExample.Criteria andAddIdIsNull() {
       addCriterion("ADD_ID is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdIsNotNull() {
       addCriterion("ADD_ID is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdEqualTo(Integer value) {
       addCriterion("ADD_ID =", value, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdNotEqualTo(Integer value) {
       addCriterion("ADD_ID <>", value, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdGreaterThan(Integer value) {
       addCriterion("ADD_ID >", value, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ADD_ID >=", value, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdLessThan(Integer value) {
       addCriterion("ADD_ID <", value, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdLessThanOrEqualTo(Integer value) {
       addCriterion("ADD_ID <=", value, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdIn(List<Integer> values) {
       addCriterion("ADD_ID in", values, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdNotIn(List<Integer> values) {
       addCriterion("ADD_ID not in", values, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdBetween(Integer value1, Integer value2) {
       addCriterion("ADD_ID between", value1, value2, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ADD_ID not between", value1, value2, "addId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdIsNull() {
       addCriterion("USER_ID is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdIsNotNull() {
       addCriterion("USER_ID is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdEqualTo(String value) {
       addCriterion("USER_ID =", value, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdNotEqualTo(String value) {
       addCriterion("USER_ID <>", value, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdGreaterThan(String value) {
       addCriterion("USER_ID >", value, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("USER_ID >=", value, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdLessThan(String value) {
       addCriterion("USER_ID <", value, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdLessThanOrEqualTo(String value) {
       addCriterion("USER_ID <=", value, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdLike(String value) {
       addCriterion("USER_ID like", value, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdNotLike(String value) {
       addCriterion("USER_ID not like", value, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdIn(List<String> values) {
       addCriterion("USER_ID in", values, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdNotIn(List<String> values) {
       addCriterion("USER_ID not in", values, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdBetween(String value1, String value2) {
       addCriterion("USER_ID between", value1, value2, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andUserIdNotBetween(String value1, String value2) {
       addCriterion("USER_ID not between", value1, value2, "userId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdIsNull() {
       addCriterion("GROUP_ID is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdIsNotNull() {
       addCriterion("GROUP_ID is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdEqualTo(Integer value) {
       addCriterion("GROUP_ID =", value, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdNotEqualTo(Integer value) {
       addCriterion("GROUP_ID <>", value, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdGreaterThan(Integer value) {
       addCriterion("GROUP_ID >", value, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("GROUP_ID >=", value, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdLessThan(Integer value) {
       addCriterion("GROUP_ID <", value, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdLessThanOrEqualTo(Integer value) {
       addCriterion("GROUP_ID <=", value, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdIn(List<Integer> values) {
       addCriterion("GROUP_ID in", values, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdNotIn(List<Integer> values) {
       addCriterion("GROUP_ID not in", values, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdBetween(Integer value1, Integer value2) {
       addCriterion("GROUP_ID between", value1, value2, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
       addCriterion("GROUP_ID not between", value1, value2, "groupId");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameIsNull() {
       addCriterion("PSN_NAME is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameIsNotNull() {
       addCriterion("PSN_NAME is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameEqualTo(String value) {
       addCriterion("PSN_NAME =", value, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameNotEqualTo(String value) {
       addCriterion("PSN_NAME <>", value, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameGreaterThan(String value) {
       addCriterion("PSN_NAME >", value, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameGreaterThanOrEqualTo(String value) {
       addCriterion("PSN_NAME >=", value, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameLessThan(String value) {
       addCriterion("PSN_NAME <", value, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameLessThanOrEqualTo(String value) {
       addCriterion("PSN_NAME <=", value, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameLike(String value) {
       addCriterion("PSN_NAME like", value, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameNotLike(String value) {
       addCriterion("PSN_NAME not like", value, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameIn(List<String> values) {
       addCriterion("PSN_NAME in", values, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameNotIn(List<String> values) {
       addCriterion("PSN_NAME not in", values, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameBetween(String value1, String value2) {
       addCriterion("PSN_NAME between", value1, value2, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNameNotBetween(String value1, String value2) {
       addCriterion("PSN_NAME not between", value1, value2, "psnName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexIsNull() {
       addCriterion("SEX is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexIsNotNull() {
       addCriterion("SEX is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexEqualTo(String value) {
       addCriterion("SEX =", value, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexNotEqualTo(String value) {
       addCriterion("SEX <>", value, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexGreaterThan(String value) {
       addCriterion("SEX >", value, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexGreaterThanOrEqualTo(String value) {
       addCriterion("SEX >=", value, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexLessThan(String value) {
       addCriterion("SEX <", value, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexLessThanOrEqualTo(String value) {
       addCriterion("SEX <=", value, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexLike(String value) {
       addCriterion("SEX like", value, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexNotLike(String value) {
       addCriterion("SEX not like", value, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexIn(List<String> values) {
       addCriterion("SEX in", values, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexNotIn(List<String> values) {
       addCriterion("SEX not in", values, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexBetween(String value1, String value2) {
       addCriterion("SEX between", value1, value2, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSexNotBetween(String value1, String value2) {
       addCriterion("SEX not between", value1, value2, "sex");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameIsNull() {
       addCriterion("NICK_NAME is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameIsNotNull() {
       addCriterion("NICK_NAME is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameEqualTo(String value) {
       addCriterion("NICK_NAME =", value, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameNotEqualTo(String value) {
       addCriterion("NICK_NAME <>", value, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameGreaterThan(String value) {
       addCriterion("NICK_NAME >", value, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameGreaterThanOrEqualTo(String value) {
       addCriterion("NICK_NAME >=", value, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameLessThan(String value) {
       addCriterion("NICK_NAME <", value, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameLessThanOrEqualTo(String value) {
       addCriterion("NICK_NAME <=", value, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameLike(String value) {
       addCriterion("NICK_NAME like", value, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameNotLike(String value) {
       addCriterion("NICK_NAME not like", value, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameIn(List<String> values) {
       addCriterion("NICK_NAME in", values, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameNotIn(List<String> values) {
       addCriterion("NICK_NAME not in", values, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameBetween(String value1, String value2) {
       addCriterion("NICK_NAME between", value1, value2, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andNickNameNotBetween(String value1, String value2) {
       addCriterion("NICK_NAME not between", value1, value2, "nickName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayIsNull() {
       addCriterion("BIRTHDAY is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayIsNotNull() {
       addCriterion("BIRTHDAY is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayLessThan(java.util.Date value) {
       addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBirthdayNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationIsNull() {
       addCriterion("MINISTRATION is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationIsNotNull() {
       addCriterion("MINISTRATION is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationEqualTo(String value) {
       addCriterion("MINISTRATION =", value, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationNotEqualTo(String value) {
       addCriterion("MINISTRATION <>", value, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationGreaterThan(String value) {
       addCriterion("MINISTRATION >", value, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationGreaterThanOrEqualTo(String value) {
       addCriterion("MINISTRATION >=", value, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationLessThan(String value) {
       addCriterion("MINISTRATION <", value, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationLessThanOrEqualTo(String value) {
       addCriterion("MINISTRATION <=", value, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationLike(String value) {
       addCriterion("MINISTRATION like", value, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationNotLike(String value) {
       addCriterion("MINISTRATION not like", value, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationIn(List<String> values) {
       addCriterion("MINISTRATION in", values, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationNotIn(List<String> values) {
       addCriterion("MINISTRATION not in", values, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationBetween(String value1, String value2) {
       addCriterion("MINISTRATION between", value1, value2, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMinistrationNotBetween(String value1, String value2) {
       addCriterion("MINISTRATION not between", value1, value2, "ministration");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateIsNull() {
       addCriterion("MATE is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateIsNotNull() {
       addCriterion("MATE is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateEqualTo(String value) {
       addCriterion("MATE =", value, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateNotEqualTo(String value) {
       addCriterion("MATE <>", value, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateGreaterThan(String value) {
       addCriterion("MATE >", value, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateGreaterThanOrEqualTo(String value) {
       addCriterion("MATE >=", value, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateLessThan(String value) {
       addCriterion("MATE <", value, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateLessThanOrEqualTo(String value) {
       addCriterion("MATE <=", value, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateLike(String value) {
       addCriterion("MATE like", value, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateNotLike(String value) {
       addCriterion("MATE not like", value, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateIn(List<String> values) {
       addCriterion("MATE in", values, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateNotIn(List<String> values) {
       addCriterion("MATE not in", values, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateBetween(String value1, String value2) {
       addCriterion("MATE between", value1, value2, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMateNotBetween(String value1, String value2) {
       addCriterion("MATE not between", value1, value2, "mate");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildIsNull() {
       addCriterion("CHILD is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildIsNotNull() {
       addCriterion("CHILD is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildEqualTo(String value) {
       addCriterion("CHILD =", value, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildNotEqualTo(String value) {
       addCriterion("CHILD <>", value, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildGreaterThan(String value) {
       addCriterion("CHILD >", value, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildGreaterThanOrEqualTo(String value) {
       addCriterion("CHILD >=", value, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildLessThan(String value) {
       addCriterion("CHILD <", value, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildLessThanOrEqualTo(String value) {
       addCriterion("CHILD <=", value, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildLike(String value) {
       addCriterion("CHILD like", value, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildNotLike(String value) {
       addCriterion("CHILD not like", value, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildIn(List<String> values) {
       addCriterion("CHILD in", values, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildNotIn(List<String> values) {
       addCriterion("CHILD not in", values, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildBetween(String value1, String value2) {
       addCriterion("CHILD between", value1, value2, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andChildNotBetween(String value1, String value2) {
       addCriterion("CHILD not between", value1, value2, "child");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameIsNull() {
       addCriterion("DEPT_NAME is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameIsNotNull() {
       addCriterion("DEPT_NAME is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameEqualTo(String value) {
       addCriterion("DEPT_NAME =", value, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameNotEqualTo(String value) {
       addCriterion("DEPT_NAME <>", value, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameGreaterThan(String value) {
       addCriterion("DEPT_NAME >", value, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameGreaterThanOrEqualTo(String value) {
       addCriterion("DEPT_NAME >=", value, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameLessThan(String value) {
       addCriterion("DEPT_NAME <", value, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameLessThanOrEqualTo(String value) {
       addCriterion("DEPT_NAME <=", value, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameLike(String value) {
       addCriterion("DEPT_NAME like", value, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameNotLike(String value) {
       addCriterion("DEPT_NAME not like", value, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameIn(List<String> values) {
       addCriterion("DEPT_NAME in", values, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameNotIn(List<String> values) {
       addCriterion("DEPT_NAME not in", values, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameBetween(String value1, String value2) {
       addCriterion("DEPT_NAME between", value1, value2, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andDeptNameNotBetween(String value1, String value2) {
       addCriterion("DEPT_NAME not between", value1, value2, "deptName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptIsNull() {
       addCriterion("ADD_DEPT is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptIsNotNull() {
       addCriterion("ADD_DEPT is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptEqualTo(String value) {
       addCriterion("ADD_DEPT =", value, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptNotEqualTo(String value) {
       addCriterion("ADD_DEPT <>", value, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptGreaterThan(String value) {
       addCriterion("ADD_DEPT >", value, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptGreaterThanOrEqualTo(String value) {
       addCriterion("ADD_DEPT >=", value, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptLessThan(String value) {
       addCriterion("ADD_DEPT <", value, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptLessThanOrEqualTo(String value) {
       addCriterion("ADD_DEPT <=", value, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptLike(String value) {
       addCriterion("ADD_DEPT like", value, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptNotLike(String value) {
       addCriterion("ADD_DEPT not like", value, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptIn(List<String> values) {
       addCriterion("ADD_DEPT in", values, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptNotIn(List<String> values) {
       addCriterion("ADD_DEPT not in", values, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptBetween(String value1, String value2) {
       addCriterion("ADD_DEPT between", value1, value2, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddDeptNotBetween(String value1, String value2) {
       addCriterion("ADD_DEPT not between", value1, value2, "addDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptIsNull() {
       addCriterion("POST_NO_DEPT is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptIsNotNull() {
       addCriterion("POST_NO_DEPT is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptEqualTo(String value) {
       addCriterion("POST_NO_DEPT =", value, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptNotEqualTo(String value) {
       addCriterion("POST_NO_DEPT <>", value, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptGreaterThan(String value) {
       addCriterion("POST_NO_DEPT >", value, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptGreaterThanOrEqualTo(String value) {
       addCriterion("POST_NO_DEPT >=", value, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptLessThan(String value) {
       addCriterion("POST_NO_DEPT <", value, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptLessThanOrEqualTo(String value) {
       addCriterion("POST_NO_DEPT <=", value, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptLike(String value) {
       addCriterion("POST_NO_DEPT like", value, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptNotLike(String value) {
       addCriterion("POST_NO_DEPT not like", value, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptIn(List<String> values) {
       addCriterion("POST_NO_DEPT in", values, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptNotIn(List<String> values) {
       addCriterion("POST_NO_DEPT not in", values, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptBetween(String value1, String value2) {
       addCriterion("POST_NO_DEPT between", value1, value2, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoDeptNotBetween(String value1, String value2) {
       addCriterion("POST_NO_DEPT not between", value1, value2, "postNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptIsNull() {
       addCriterion("TEL_NO_DEPT is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptIsNotNull() {
       addCriterion("TEL_NO_DEPT is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptEqualTo(String value) {
       addCriterion("TEL_NO_DEPT =", value, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptNotEqualTo(String value) {
       addCriterion("TEL_NO_DEPT <>", value, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptGreaterThan(String value) {
       addCriterion("TEL_NO_DEPT >", value, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptGreaterThanOrEqualTo(String value) {
       addCriterion("TEL_NO_DEPT >=", value, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptLessThan(String value) {
       addCriterion("TEL_NO_DEPT <", value, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptLessThanOrEqualTo(String value) {
       addCriterion("TEL_NO_DEPT <=", value, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptLike(String value) {
       addCriterion("TEL_NO_DEPT like", value, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptNotLike(String value) {
       addCriterion("TEL_NO_DEPT not like", value, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptIn(List<String> values) {
       addCriterion("TEL_NO_DEPT in", values, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptNotIn(List<String> values) {
       addCriterion("TEL_NO_DEPT not in", values, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptBetween(String value1, String value2) {
       addCriterion("TEL_NO_DEPT between", value1, value2, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoDeptNotBetween(String value1, String value2) {
       addCriterion("TEL_NO_DEPT not between", value1, value2, "telNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptIsNull() {
       addCriterion("FAX_NO_DEPT is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptIsNotNull() {
       addCriterion("FAX_NO_DEPT is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptEqualTo(String value) {
       addCriterion("FAX_NO_DEPT =", value, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptNotEqualTo(String value) {
       addCriterion("FAX_NO_DEPT <>", value, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptGreaterThan(String value) {
       addCriterion("FAX_NO_DEPT >", value, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptGreaterThanOrEqualTo(String value) {
       addCriterion("FAX_NO_DEPT >=", value, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptLessThan(String value) {
       addCriterion("FAX_NO_DEPT <", value, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptLessThanOrEqualTo(String value) {
       addCriterion("FAX_NO_DEPT <=", value, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptLike(String value) {
       addCriterion("FAX_NO_DEPT like", value, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptNotLike(String value) {
       addCriterion("FAX_NO_DEPT not like", value, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptIn(List<String> values) {
       addCriterion("FAX_NO_DEPT in", values, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptNotIn(List<String> values) {
       addCriterion("FAX_NO_DEPT not in", values, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptBetween(String value1, String value2) {
       addCriterion("FAX_NO_DEPT between", value1, value2, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andFaxNoDeptNotBetween(String value1, String value2) {
       addCriterion("FAX_NO_DEPT not between", value1, value2, "faxNoDept");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeIsNull() {
       addCriterion("ADD_HOME is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeIsNotNull() {
       addCriterion("ADD_HOME is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeEqualTo(String value) {
       addCriterion("ADD_HOME =", value, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeNotEqualTo(String value) {
       addCriterion("ADD_HOME <>", value, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeGreaterThan(String value) {
       addCriterion("ADD_HOME >", value, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeGreaterThanOrEqualTo(String value) {
       addCriterion("ADD_HOME >=", value, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeLessThan(String value) {
       addCriterion("ADD_HOME <", value, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeLessThanOrEqualTo(String value) {
       addCriterion("ADD_HOME <=", value, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeLike(String value) {
       addCriterion("ADD_HOME like", value, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeNotLike(String value) {
       addCriterion("ADD_HOME not like", value, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeIn(List<String> values) {
       addCriterion("ADD_HOME in", values, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeNotIn(List<String> values) {
       addCriterion("ADD_HOME not in", values, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeBetween(String value1, String value2) {
       addCriterion("ADD_HOME between", value1, value2, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddHomeNotBetween(String value1, String value2) {
       addCriterion("ADD_HOME not between", value1, value2, "addHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeIsNull() {
       addCriterion("POST_NO_HOME is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeIsNotNull() {
       addCriterion("POST_NO_HOME is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeEqualTo(String value) {
       addCriterion("POST_NO_HOME =", value, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeNotEqualTo(String value) {
       addCriterion("POST_NO_HOME <>", value, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeGreaterThan(String value) {
       addCriterion("POST_NO_HOME >", value, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeGreaterThanOrEqualTo(String value) {
       addCriterion("POST_NO_HOME >=", value, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeLessThan(String value) {
       addCriterion("POST_NO_HOME <", value, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeLessThanOrEqualTo(String value) {
       addCriterion("POST_NO_HOME <=", value, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeLike(String value) {
       addCriterion("POST_NO_HOME like", value, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeNotLike(String value) {
       addCriterion("POST_NO_HOME not like", value, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeIn(List<String> values) {
       addCriterion("POST_NO_HOME in", values, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeNotIn(List<String> values) {
       addCriterion("POST_NO_HOME not in", values, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeBetween(String value1, String value2) {
       addCriterion("POST_NO_HOME between", value1, value2, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPostNoHomeNotBetween(String value1, String value2) {
       addCriterion("POST_NO_HOME not between", value1, value2, "postNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeIsNull() {
       addCriterion("TEL_NO_HOME is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeIsNotNull() {
       addCriterion("TEL_NO_HOME is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeEqualTo(String value) {
       addCriterion("TEL_NO_HOME =", value, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeNotEqualTo(String value) {
       addCriterion("TEL_NO_HOME <>", value, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeGreaterThan(String value) {
       addCriterion("TEL_NO_HOME >", value, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeGreaterThanOrEqualTo(String value) {
       addCriterion("TEL_NO_HOME >=", value, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeLessThan(String value) {
       addCriterion("TEL_NO_HOME <", value, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeLessThanOrEqualTo(String value) {
       addCriterion("TEL_NO_HOME <=", value, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeLike(String value) {
       addCriterion("TEL_NO_HOME like", value, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeNotLike(String value) {
       addCriterion("TEL_NO_HOME not like", value, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeIn(List<String> values) {
       addCriterion("TEL_NO_HOME in", values, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeNotIn(List<String> values) {
       addCriterion("TEL_NO_HOME not in", values, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeBetween(String value1, String value2) {
       addCriterion("TEL_NO_HOME between", value1, value2, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andTelNoHomeNotBetween(String value1, String value2) {
       addCriterion("TEL_NO_HOME not between", value1, value2, "telNoHome");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoIsNull() {
       addCriterion("MOBIL_NO is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoIsNotNull() {
       addCriterion("MOBIL_NO is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoEqualTo(String value) {
       addCriterion("MOBIL_NO =", value, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoNotEqualTo(String value) {
       addCriterion("MOBIL_NO <>", value, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoGreaterThan(String value) {
       addCriterion("MOBIL_NO >", value, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoGreaterThanOrEqualTo(String value) {
       addCriterion("MOBIL_NO >=", value, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoLessThan(String value) {
       addCriterion("MOBIL_NO <", value, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoLessThanOrEqualTo(String value) {
       addCriterion("MOBIL_NO <=", value, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoLike(String value) {
       addCriterion("MOBIL_NO like", value, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoNotLike(String value) {
       addCriterion("MOBIL_NO not like", value, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoIn(List<String> values) {
       addCriterion("MOBIL_NO in", values, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoNotIn(List<String> values) {
       addCriterion("MOBIL_NO not in", values, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoBetween(String value1, String value2) {
       addCriterion("MOBIL_NO between", value1, value2, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andMobilNoNotBetween(String value1, String value2) {
       addCriterion("MOBIL_NO not between", value1, value2, "mobilNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoIsNull() {
       addCriterion("BP_NO is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoIsNotNull() {
       addCriterion("BP_NO is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoEqualTo(String value) {
       addCriterion("BP_NO =", value, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoNotEqualTo(String value) {
       addCriterion("BP_NO <>", value, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoGreaterThan(String value) {
       addCriterion("BP_NO >", value, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoGreaterThanOrEqualTo(String value) {
       addCriterion("BP_NO >=", value, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoLessThan(String value) {
       addCriterion("BP_NO <", value, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoLessThanOrEqualTo(String value) {
       addCriterion("BP_NO <=", value, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoLike(String value) {
       addCriterion("BP_NO like", value, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoNotLike(String value) {
       addCriterion("BP_NO not like", value, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoIn(List<String> values) {
       addCriterion("BP_NO in", values, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoNotIn(List<String> values) {
       addCriterion("BP_NO not in", values, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoBetween(String value1, String value2) {
       addCriterion("BP_NO between", value1, value2, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andBpNoNotBetween(String value1, String value2) {
       addCriterion("BP_NO not between", value1, value2, "bpNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailIsNull() {
       addCriterion("EMAIL is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailIsNotNull() {
       addCriterion("EMAIL is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailEqualTo(String value) {
       addCriterion("EMAIL =", value, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailNotEqualTo(String value) {
       addCriterion("EMAIL <>", value, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailGreaterThan(String value) {
       addCriterion("EMAIL >", value, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailGreaterThanOrEqualTo(String value) {
       addCriterion("EMAIL >=", value, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailLessThan(String value) {
       addCriterion("EMAIL <", value, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailLessThanOrEqualTo(String value) {
       addCriterion("EMAIL <=", value, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailLike(String value) {
       addCriterion("EMAIL like", value, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailNotLike(String value) {
       addCriterion("EMAIL not like", value, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailIn(List<String> values) {
       addCriterion("EMAIL in", values, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailNotIn(List<String> values) {
       addCriterion("EMAIL not in", values, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailBetween(String value1, String value2) {
       addCriterion("EMAIL between", value1, value2, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andEmailNotBetween(String value1, String value2) {
       addCriterion("EMAIL not between", value1, value2, "email");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoIsNull() {
       addCriterion("OICQ_NO is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoIsNotNull() {
       addCriterion("OICQ_NO is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoEqualTo(String value) {
       addCriterion("OICQ_NO =", value, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoNotEqualTo(String value) {
       addCriterion("OICQ_NO <>", value, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoGreaterThan(String value) {
       addCriterion("OICQ_NO >", value, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoGreaterThanOrEqualTo(String value) {
       addCriterion("OICQ_NO >=", value, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoLessThan(String value) {
       addCriterion("OICQ_NO <", value, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoLessThanOrEqualTo(String value) {
       addCriterion("OICQ_NO <=", value, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoLike(String value) {
       addCriterion("OICQ_NO like", value, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoNotLike(String value) {
       addCriterion("OICQ_NO not like", value, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoIn(List<String> values) {
       addCriterion("OICQ_NO in", values, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoNotIn(List<String> values) {
       addCriterion("OICQ_NO not in", values, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoBetween(String value1, String value2) {
       addCriterion("OICQ_NO between", value1, value2, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andOicqNoNotBetween(String value1, String value2) {
       addCriterion("OICQ_NO not between", value1, value2, "oicqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoIsNull() {
       addCriterion("ICQ_NO is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoIsNotNull() {
       addCriterion("ICQ_NO is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoEqualTo(String value) {
       addCriterion("ICQ_NO =", value, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoNotEqualTo(String value) {
       addCriterion("ICQ_NO <>", value, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoGreaterThan(String value) {
       addCriterion("ICQ_NO >", value, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoGreaterThanOrEqualTo(String value) {
       addCriterion("ICQ_NO >=", value, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoLessThan(String value) {
       addCriterion("ICQ_NO <", value, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoLessThanOrEqualTo(String value) {
       addCriterion("ICQ_NO <=", value, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoLike(String value) {
       addCriterion("ICQ_NO like", value, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoNotLike(String value) {
       addCriterion("ICQ_NO not like", value, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoIn(List<String> values) {
       addCriterion("ICQ_NO in", values, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoNotIn(List<String> values) {
       addCriterion("ICQ_NO not in", values, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoBetween(String value1, String value2) {
       addCriterion("ICQ_NO between", value1, value2, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andIcqNoNotBetween(String value1, String value2) {
       addCriterion("ICQ_NO not between", value1, value2, "icqNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoIsNull() {
       addCriterion("PSN_NO is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoIsNotNull() {
       addCriterion("PSN_NO is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoEqualTo(Integer value) {
       addCriterion("PSN_NO =", value, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoNotEqualTo(Integer value) {
       addCriterion("PSN_NO <>", value, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoGreaterThan(Integer value) {
       addCriterion("PSN_NO >", value, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoGreaterThanOrEqualTo(Integer value) {
       addCriterion("PSN_NO >=", value, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoLessThan(Integer value) {
       addCriterion("PSN_NO <", value, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoLessThanOrEqualTo(Integer value) {
       addCriterion("PSN_NO <=", value, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoIn(List<Integer> values) {
       addCriterion("PSN_NO in", values, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoNotIn(List<Integer> values) {
       addCriterion("PSN_NO not in", values, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoBetween(Integer value1, Integer value2) {
       addCriterion("PSN_NO between", value1, value2, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPsnNoNotBetween(Integer value1, Integer value2) {
       addCriterion("PSN_NO not between", value1, value2, "psnNo");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagIsNull() {
       addCriterion("SMS_FLAG is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagIsNotNull() {
       addCriterion("SMS_FLAG is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagEqualTo(String value) {
       addCriterion("SMS_FLAG =", value, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagNotEqualTo(String value) {
       addCriterion("SMS_FLAG <>", value, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagGreaterThan(String value) {
       addCriterion("SMS_FLAG >", value, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagGreaterThanOrEqualTo(String value) {
       addCriterion("SMS_FLAG >=", value, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagLessThan(String value) {
       addCriterion("SMS_FLAG <", value, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagLessThanOrEqualTo(String value) {
       addCriterion("SMS_FLAG <=", value, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagLike(String value) {
       addCriterion("SMS_FLAG like", value, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagNotLike(String value) {
       addCriterion("SMS_FLAG not like", value, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagIn(List<String> values) {
       addCriterion("SMS_FLAG in", values, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagNotIn(List<String> values) {
       addCriterion("SMS_FLAG not in", values, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagBetween(String value1, String value2) {
       addCriterion("SMS_FLAG between", value1, value2, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andSmsFlagNotBetween(String value1, String value2) {
       addCriterion("SMS_FLAG not between", value1, value2, "smsFlag");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameIsNull() {
       addCriterion("ADD_SHARE_NAME is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameIsNotNull() {
       addCriterion("ADD_SHARE_NAME is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameEqualTo(String value) {
       addCriterion("ADD_SHARE_NAME =", value, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameNotEqualTo(String value) {
       addCriterion("ADD_SHARE_NAME <>", value, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameGreaterThan(String value) {
       addCriterion("ADD_SHARE_NAME >", value, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameGreaterThanOrEqualTo(String value) {
       addCriterion("ADD_SHARE_NAME >=", value, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameLessThan(String value) {
       addCriterion("ADD_SHARE_NAME <", value, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameLessThanOrEqualTo(String value) {
       addCriterion("ADD_SHARE_NAME <=", value, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameLike(String value) {
       addCriterion("ADD_SHARE_NAME like", value, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameNotLike(String value) {
       addCriterion("ADD_SHARE_NAME not like", value, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameIn(List<String> values) {
       addCriterion("ADD_SHARE_NAME in", values, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameNotIn(List<String> values) {
       addCriterion("ADD_SHARE_NAME not in", values, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameBetween(String value1, String value2) {
       addCriterion("ADD_SHARE_NAME between", value1, value2, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddShareNameNotBetween(String value1, String value2) {
       addCriterion("ADD_SHARE_NAME not between", value1, value2, "addShareName");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartIsNull() {
       addCriterion("ADD_START is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartIsNotNull() {
       addCriterion("ADD_START is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartEqualTo(java.util.Date value) {
       addCriterion("ADD_START =", value, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartNotEqualTo(java.util.Date value) {
       addCriterion("ADD_START <>", value, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartGreaterThan(java.util.Date value) {
       addCriterion("ADD_START >", value, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_START >=", value, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartLessThan(java.util.Date value) {
       addCriterion("ADD_START <", value, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartLessThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_START <=", value, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartIn(List<java.util.Date> values) {
       addCriterion("ADD_START in", values, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartNotIn(List<java.util.Date> values) {
       addCriterion("ADD_START not in", values, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_START between", value1, value2, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddStartNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_START not between", value1, value2, "addStart");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndIsNull() {
       addCriterion("ADD_END is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndIsNotNull() {
       addCriterion("ADD_END is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndEqualTo(java.util.Date value) {
       addCriterion("ADD_END =", value, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndNotEqualTo(java.util.Date value) {
       addCriterion("ADD_END <>", value, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndGreaterThan(java.util.Date value) {
       addCriterion("ADD_END >", value, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_END >=", value, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndLessThan(java.util.Date value) {
       addCriterion("ADD_END <", value, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndLessThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_END <=", value, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndIn(List<java.util.Date> values) {
       addCriterion("ADD_END in", values, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndNotIn(List<java.util.Date> values) {
       addCriterion("ADD_END not in", values, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_END between", value1, value2, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andAddEndNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_END not between", value1, value2, "addEnd");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebIsNull() {
       addCriterion("PER_WEB is null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebIsNotNull() {
       addCriterion("PER_WEB is not null");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebEqualTo(String value) {
       addCriterion("PER_WEB =", value, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebNotEqualTo(String value) {
       addCriterion("PER_WEB <>", value, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebGreaterThan(String value) {
       addCriterion("PER_WEB >", value, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebGreaterThanOrEqualTo(String value) {
       addCriterion("PER_WEB >=", value, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebLessThan(String value) {
       addCriterion("PER_WEB <", value, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebLessThanOrEqualTo(String value) {
       addCriterion("PER_WEB <=", value, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebLike(String value) {
       addCriterion("PER_WEB like", value, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebNotLike(String value) {
       addCriterion("PER_WEB not like", value, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebIn(List<String> values) {
       addCriterion("PER_WEB in", values, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebNotIn(List<String> values) {
       addCriterion("PER_WEB not in", values, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebBetween(String value1, String value2) {
       addCriterion("PER_WEB between", value1, value2, "perWeb");
       return (AddressExample.Criteria)this;
     }
 
     public AddressExample.Criteria andPerWebNotBetween(String value1, String value2) {
       addCriterion("PER_WEB not between", value1, value2, "perWeb");
       return (AddressExample.Criteria)this;
     }
   }
 }
