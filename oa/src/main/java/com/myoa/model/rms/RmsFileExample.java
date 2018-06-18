 package com.myoa.model.rms;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class RmsFileExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public RmsFileExample()
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
 
   public static class Criteria extends RmsFileExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<RmsFileExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<RmsFileExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<RmsFileExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new RmsFileExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new RmsFileExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new RmsFileExample.Criterion(condition, value1, value2));
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
 
     public RmsFileExample.Criteria andFileIdIsNull() {
       addCriterion("FILE_ID is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdIsNotNull() {
       addCriterion("FILE_ID is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdEqualTo(Integer value) {
       addCriterion("FILE_ID =", value, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdNotEqualTo(Integer value) {
       addCriterion("FILE_ID <>", value, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdGreaterThan(Integer value) {
       addCriterion("FILE_ID >", value, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("FILE_ID >=", value, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdLessThan(Integer value) {
       addCriterion("FILE_ID <", value, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdLessThanOrEqualTo(Integer value) {
       addCriterion("FILE_ID <=", value, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdIn(List<Integer> values) {
       addCriterion("FILE_ID in", values, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdNotIn(List<Integer> values) {
       addCriterion("FILE_ID not in", values, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdBetween(Integer value1, Integer value2) {
       addCriterion("FILE_ID between", value1, value2, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileIdNotBetween(Integer value1, Integer value2) {
       addCriterion("FILE_ID not between", value1, value2, "fileId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdIsNull() {
       addCriterion("ROLL_ID is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdIsNotNull() {
       addCriterion("ROLL_ID is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdEqualTo(Integer value) {
       addCriterion("ROLL_ID =", value, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdNotEqualTo(Integer value) {
       addCriterion("ROLL_ID <>", value, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdGreaterThan(Integer value) {
       addCriterion("ROLL_ID >", value, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ROLL_ID >=", value, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdLessThan(Integer value) {
       addCriterion("ROLL_ID <", value, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdLessThanOrEqualTo(Integer value) {
       addCriterion("ROLL_ID <=", value, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdIn(List<Integer> values) {
       addCriterion("ROLL_ID in", values, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdNotIn(List<Integer> values) {
       addCriterion("ROLL_ID not in", values, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdBetween(Integer value1, Integer value2) {
       addCriterion("ROLL_ID between", value1, value2, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRollIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ROLL_ID not between", value1, value2, "rollId");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserIsNull() {
       addCriterion("ADD_USER is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserIsNotNull() {
       addCriterion("ADD_USER is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserEqualTo(String value) {
       addCriterion("ADD_USER =", value, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserNotEqualTo(String value) {
       addCriterion("ADD_USER <>", value, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserGreaterThan(String value) {
       addCriterion("ADD_USER >", value, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserGreaterThanOrEqualTo(String value) {
       addCriterion("ADD_USER >=", value, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserLessThan(String value) {
       addCriterion("ADD_USER <", value, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserLessThanOrEqualTo(String value) {
       addCriterion("ADD_USER <=", value, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserLike(String value) {
       addCriterion("ADD_USER like", value, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserNotLike(String value) {
       addCriterion("ADD_USER not like", value, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserIn(List<String> values) {
       addCriterion("ADD_USER in", values, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserNotIn(List<String> values) {
       addCriterion("ADD_USER not in", values, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserBetween(String value1, String value2) {
       addCriterion("ADD_USER between", value1, value2, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddUserNotBetween(String value1, String value2) {
       addCriterion("ADD_USER not between", value1, value2, "addUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeIsNull() {
       addCriterion("ADD_TIME is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeIsNotNull() {
       addCriterion("ADD_TIME is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME =", value, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeNotEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME <>", value, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeGreaterThan(java.util.Date value) {
       addCriterion("ADD_TIME >", value, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME >=", value, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeLessThan(java.util.Date value) {
       addCriterion("ADD_TIME <", value, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME <=", value, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeIn(List<java.util.Date> values) {
       addCriterion("ADD_TIME in", values, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeNotIn(List<java.util.Date> values) {
       addCriterion("ADD_TIME not in", values, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_TIME between", value1, value2, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_TIME not between", value1, value2, "addTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserIsNull() {
       addCriterion("DEL_USER is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserIsNotNull() {
       addCriterion("DEL_USER is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserEqualTo(String value) {
       addCriterion("DEL_USER =", value, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserNotEqualTo(String value) {
       addCriterion("DEL_USER <>", value, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserGreaterThan(String value) {
       addCriterion("DEL_USER >", value, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserGreaterThanOrEqualTo(String value) {
       addCriterion("DEL_USER >=", value, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserLessThan(String value) {
       addCriterion("DEL_USER <", value, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserLessThanOrEqualTo(String value) {
       addCriterion("DEL_USER <=", value, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserLike(String value) {
       addCriterion("DEL_USER like", value, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserNotLike(String value) {
       addCriterion("DEL_USER not like", value, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserIn(List<String> values) {
       addCriterion("DEL_USER in", values, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserNotIn(List<String> values) {
       addCriterion("DEL_USER not in", values, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserBetween(String value1, String value2) {
       addCriterion("DEL_USER between", value1, value2, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelUserNotBetween(String value1, String value2) {
       addCriterion("DEL_USER not between", value1, value2, "delUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeIsNull() {
       addCriterion("DEL_TIME is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeIsNotNull() {
       addCriterion("DEL_TIME is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeEqualTo(java.util.Date value) {
       addCriterion("DEL_TIME =", value, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeNotEqualTo(java.util.Date value) {
       addCriterion("DEL_TIME <>", value, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeGreaterThan(java.util.Date value) {
       addCriterion("DEL_TIME >", value, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("DEL_TIME >=", value, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeLessThan(java.util.Date value) {
       addCriterion("DEL_TIME <", value, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("DEL_TIME <=", value, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeIn(List<java.util.Date> values) {
       addCriterion("DEL_TIME in", values, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeNotIn(List<java.util.Date> values) {
       addCriterion("DEL_TIME not in", values, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("DEL_TIME between", value1, value2, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDelTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("DEL_TIME not between", value1, value2, "delTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserIsNull() {
       addCriterion("MOD_USER is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserIsNotNull() {
       addCriterion("MOD_USER is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserEqualTo(String value) {
       addCriterion("MOD_USER =", value, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserNotEqualTo(String value) {
       addCriterion("MOD_USER <>", value, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserGreaterThan(String value) {
       addCriterion("MOD_USER >", value, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserGreaterThanOrEqualTo(String value) {
       addCriterion("MOD_USER >=", value, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserLessThan(String value) {
       addCriterion("MOD_USER <", value, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserLessThanOrEqualTo(String value) {
       addCriterion("MOD_USER <=", value, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserLike(String value) {
       addCriterion("MOD_USER like", value, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserNotLike(String value) {
       addCriterion("MOD_USER not like", value, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserIn(List<String> values) {
       addCriterion("MOD_USER in", values, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserNotIn(List<String> values) {
       addCriterion("MOD_USER not in", values, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserBetween(String value1, String value2) {
       addCriterion("MOD_USER between", value1, value2, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModUserNotBetween(String value1, String value2) {
       addCriterion("MOD_USER not between", value1, value2, "modUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeIsNull() {
       addCriterion("MOD_TIME is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeIsNotNull() {
       addCriterion("MOD_TIME is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeEqualTo(java.util.Date value) {
       addCriterion("MOD_TIME =", value, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeNotEqualTo(java.util.Date value) {
       addCriterion("MOD_TIME <>", value, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeGreaterThan(java.util.Date value) {
       addCriterion("MOD_TIME >", value, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("MOD_TIME >=", value, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeLessThan(java.util.Date value) {
       addCriterion("MOD_TIME <", value, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("MOD_TIME <=", value, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeIn(List<java.util.Date> values) {
       addCriterion("MOD_TIME in", values, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeNotIn(List<java.util.Date> values) {
       addCriterion("MOD_TIME not in", values, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("MOD_TIME between", value1, value2, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andModTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("MOD_TIME not between", value1, value2, "modTime");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserIsNull() {
       addCriterion("CONFIRM_USER is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserIsNotNull() {
       addCriterion("CONFIRM_USER is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserEqualTo(String value) {
       addCriterion("CONFIRM_USER =", value, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserNotEqualTo(String value) {
       addCriterion("CONFIRM_USER <>", value, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserGreaterThan(String value) {
       addCriterion("CONFIRM_USER >", value, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserGreaterThanOrEqualTo(String value) {
       addCriterion("CONFIRM_USER >=", value, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserLessThan(String value) {
       addCriterion("CONFIRM_USER <", value, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserLessThanOrEqualTo(String value) {
       addCriterion("CONFIRM_USER <=", value, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserLike(String value) {
       addCriterion("CONFIRM_USER like", value, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserNotLike(String value) {
       addCriterion("CONFIRM_USER not like", value, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserIn(List<String> values) {
       addCriterion("CONFIRM_USER in", values, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserNotIn(List<String> values) {
       addCriterion("CONFIRM_USER not in", values, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserBetween(String value1, String value2) {
       addCriterion("CONFIRM_USER between", value1, value2, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmUserNotBetween(String value1, String value2) {
       addCriterion("CONFIRM_USER not between", value1, value2, "confirmUser");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeIsNull() {
       addCriterion("FILE_CODE is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeIsNotNull() {
       addCriterion("FILE_CODE is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeEqualTo(String value) {
       addCriterion("FILE_CODE =", value, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeNotEqualTo(String value) {
       addCriterion("FILE_CODE <>", value, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeGreaterThan(String value) {
       addCriterion("FILE_CODE >", value, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeGreaterThanOrEqualTo(String value) {
       addCriterion("FILE_CODE >=", value, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeLessThan(String value) {
       addCriterion("FILE_CODE <", value, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeLessThanOrEqualTo(String value) {
       addCriterion("FILE_CODE <=", value, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeLike(String value) {
       addCriterion("FILE_CODE like", value, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeNotLike(String value) {
       addCriterion("FILE_CODE not like", value, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeIn(List<String> values) {
       addCriterion("FILE_CODE in", values, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeNotIn(List<String> values) {
       addCriterion("FILE_CODE not in", values, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeBetween(String value1, String value2) {
       addCriterion("FILE_CODE between", value1, value2, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileCodeNotBetween(String value1, String value2) {
       addCriterion("FILE_CODE not between", value1, value2, "fileCode");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleIsNull() {
       addCriterion("FILE_TITLE is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleIsNotNull() {
       addCriterion("FILE_TITLE is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleEqualTo(String value) {
       addCriterion("FILE_TITLE =", value, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleNotEqualTo(String value) {
       addCriterion("FILE_TITLE <>", value, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleGreaterThan(String value) {
       addCriterion("FILE_TITLE >", value, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleGreaterThanOrEqualTo(String value) {
       addCriterion("FILE_TITLE >=", value, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleLessThan(String value) {
       addCriterion("FILE_TITLE <", value, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleLessThanOrEqualTo(String value) {
       addCriterion("FILE_TITLE <=", value, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleLike(String value) {
       addCriterion("FILE_TITLE like", value, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleNotLike(String value) {
       addCriterion("FILE_TITLE not like", value, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleIn(List<String> values) {
       addCriterion("FILE_TITLE in", values, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleNotIn(List<String> values) {
       addCriterion("FILE_TITLE not in", values, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleBetween(String value1, String value2) {
       addCriterion("FILE_TITLE between", value1, value2, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitleNotBetween(String value1, String value2) {
       addCriterion("FILE_TITLE not between", value1, value2, "fileTitle");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0IsNull() {
       addCriterion("FILE_TITLE0 is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0IsNotNull() {
       addCriterion("FILE_TITLE0 is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0EqualTo(String value) {
       addCriterion("FILE_TITLE0 =", value, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0NotEqualTo(String value) {
       addCriterion("FILE_TITLE0 <>", value, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0GreaterThan(String value) {
       addCriterion("FILE_TITLE0 >", value, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0GreaterThanOrEqualTo(String value) {
       addCriterion("FILE_TITLE0 >=", value, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0LessThan(String value) {
       addCriterion("FILE_TITLE0 <", value, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0LessThanOrEqualTo(String value) {
       addCriterion("FILE_TITLE0 <=", value, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0Like(String value) {
       addCriterion("FILE_TITLE0 like", value, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0NotLike(String value) {
       addCriterion("FILE_TITLE0 not like", value, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0In(List<String> values) {
       addCriterion("FILE_TITLE0 in", values, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0NotIn(List<String> values) {
       addCriterion("FILE_TITLE0 not in", values, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0Between(String value1, String value2) {
       addCriterion("FILE_TITLE0 between", value1, value2, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTitle0NotBetween(String value1, String value2) {
       addCriterion("FILE_TITLE0 not between", value1, value2, "fileTitle0");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectIsNull() {
       addCriterion("FILE_SUBJECT is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectIsNotNull() {
       addCriterion("FILE_SUBJECT is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectEqualTo(String value) {
       addCriterion("FILE_SUBJECT =", value, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectNotEqualTo(String value) {
       addCriterion("FILE_SUBJECT <>", value, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectGreaterThan(String value) {
       addCriterion("FILE_SUBJECT >", value, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectGreaterThanOrEqualTo(String value) {
       addCriterion("FILE_SUBJECT >=", value, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectLessThan(String value) {
       addCriterion("FILE_SUBJECT <", value, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectLessThanOrEqualTo(String value) {
       addCriterion("FILE_SUBJECT <=", value, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectLike(String value) {
       addCriterion("FILE_SUBJECT like", value, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectNotLike(String value) {
       addCriterion("FILE_SUBJECT not like", value, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectIn(List<String> values) {
       addCriterion("FILE_SUBJECT in", values, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectNotIn(List<String> values) {
       addCriterion("FILE_SUBJECT not in", values, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectBetween(String value1, String value2) {
       addCriterion("FILE_SUBJECT between", value1, value2, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileSubjectNotBetween(String value1, String value2) {
       addCriterion("FILE_SUBJECT not between", value1, value2, "fileSubject");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitIsNull() {
       addCriterion("SEND_UNIT is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitIsNotNull() {
       addCriterion("SEND_UNIT is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitEqualTo(String value) {
       addCriterion("SEND_UNIT =", value, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitNotEqualTo(String value) {
       addCriterion("SEND_UNIT <>", value, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitGreaterThan(String value) {
       addCriterion("SEND_UNIT >", value, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitGreaterThanOrEqualTo(String value) {
       addCriterion("SEND_UNIT >=", value, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitLessThan(String value) {
       addCriterion("SEND_UNIT <", value, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitLessThanOrEqualTo(String value) {
       addCriterion("SEND_UNIT <=", value, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitLike(String value) {
       addCriterion("SEND_UNIT like", value, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitNotLike(String value) {
       addCriterion("SEND_UNIT not like", value, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitIn(List<String> values) {
       addCriterion("SEND_UNIT in", values, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitNotIn(List<String> values) {
       addCriterion("SEND_UNIT not in", values, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitBetween(String value1, String value2) {
       addCriterion("SEND_UNIT between", value1, value2, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendUnitNotBetween(String value1, String value2) {
       addCriterion("SEND_UNIT not between", value1, value2, "sendUnit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateIsNull() {
       addCriterion("SEND_DATE is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateIsNotNull() {
       addCriterion("SEND_DATE is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("SEND_DATE =", value, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("SEND_DATE <>", value, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("SEND_DATE >", value, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("SEND_DATE >=", value, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("SEND_DATE <", value, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("SEND_DATE <=", value, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("SEND_DATE in", values, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("SEND_DATE not in", values, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("SEND_DATE between", value1, value2, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSendDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("SEND_DATE not between", value1, value2, "sendDate");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretIsNull() {
       addCriterion("SECRET is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretIsNotNull() {
       addCriterion("SECRET is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretEqualTo(String value) {
       addCriterion("SECRET =", value, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretNotEqualTo(String value) {
       addCriterion("SECRET <>", value, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretGreaterThan(String value) {
       addCriterion("SECRET >", value, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretGreaterThanOrEqualTo(String value) {
       addCriterion("SECRET >=", value, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretLessThan(String value) {
       addCriterion("SECRET <", value, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretLessThanOrEqualTo(String value) {
       addCriterion("SECRET <=", value, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretLike(String value) {
       addCriterion("SECRET like", value, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretNotLike(String value) {
       addCriterion("SECRET not like", value, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretIn(List<String> values) {
       addCriterion("SECRET in", values, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretNotIn(List<String> values) {
       addCriterion("SECRET not in", values, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretBetween(String value1, String value2) {
       addCriterion("SECRET between", value1, value2, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andSecretNotBetween(String value1, String value2) {
       addCriterion("SECRET not between", value1, value2, "secret");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyIsNull() {
       addCriterion("URGENCY is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyIsNotNull() {
       addCriterion("URGENCY is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyEqualTo(String value) {
       addCriterion("URGENCY =", value, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyNotEqualTo(String value) {
       addCriterion("URGENCY <>", value, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyGreaterThan(String value) {
       addCriterion("URGENCY >", value, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyGreaterThanOrEqualTo(String value) {
       addCriterion("URGENCY >=", value, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyLessThan(String value) {
       addCriterion("URGENCY <", value, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyLessThanOrEqualTo(String value) {
       addCriterion("URGENCY <=", value, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyLike(String value) {
       addCriterion("URGENCY like", value, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyNotLike(String value) {
       addCriterion("URGENCY not like", value, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyIn(List<String> values) {
       addCriterion("URGENCY in", values, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyNotIn(List<String> values) {
       addCriterion("URGENCY not in", values, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyBetween(String value1, String value2) {
       addCriterion("URGENCY between", value1, value2, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andUrgencyNotBetween(String value1, String value2) {
       addCriterion("URGENCY not between", value1, value2, "urgency");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindIsNull() {
       addCriterion("FILE_KIND is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindIsNotNull() {
       addCriterion("FILE_KIND is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindEqualTo(String value) {
       addCriterion("FILE_KIND =", value, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindNotEqualTo(String value) {
       addCriterion("FILE_KIND <>", value, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindGreaterThan(String value) {
       addCriterion("FILE_KIND >", value, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindGreaterThanOrEqualTo(String value) {
       addCriterion("FILE_KIND >=", value, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindLessThan(String value) {
       addCriterion("FILE_KIND <", value, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindLessThanOrEqualTo(String value) {
       addCriterion("FILE_KIND <=", value, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindLike(String value) {
       addCriterion("FILE_KIND like", value, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindNotLike(String value) {
       addCriterion("FILE_KIND not like", value, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindIn(List<String> values) {
       addCriterion("FILE_KIND in", values, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindNotIn(List<String> values) {
       addCriterion("FILE_KIND not in", values, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindBetween(String value1, String value2) {
       addCriterion("FILE_KIND between", value1, value2, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileKindNotBetween(String value1, String value2) {
       addCriterion("FILE_KIND not between", value1, value2, "fileKind");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeIsNull() {
       addCriterion("FILE_TYPE is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeIsNotNull() {
       addCriterion("FILE_TYPE is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeEqualTo(String value) {
       addCriterion("FILE_TYPE =", value, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeNotEqualTo(String value) {
       addCriterion("FILE_TYPE <>", value, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeGreaterThan(String value) {
       addCriterion("FILE_TYPE >", value, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeGreaterThanOrEqualTo(String value) {
       addCriterion("FILE_TYPE >=", value, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeLessThan(String value) {
       addCriterion("FILE_TYPE <", value, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeLessThanOrEqualTo(String value) {
       addCriterion("FILE_TYPE <=", value, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeLike(String value) {
       addCriterion("FILE_TYPE like", value, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeNotLike(String value) {
       addCriterion("FILE_TYPE not like", value, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeIn(List<String> values) {
       addCriterion("FILE_TYPE in", values, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeNotIn(List<String> values) {
       addCriterion("FILE_TYPE not in", values, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeBetween(String value1, String value2) {
       addCriterion("FILE_TYPE between", value1, value2, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFileTypeNotBetween(String value1, String value2) {
       addCriterion("FILE_TYPE not between", value1, value2, "fileType");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageIsNull() {
       addCriterion("FILE_PAGE is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageIsNotNull() {
       addCriterion("FILE_PAGE is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageEqualTo(String value) {
       addCriterion("FILE_PAGE =", value, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageNotEqualTo(String value) {
       addCriterion("FILE_PAGE <>", value, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageGreaterThan(String value) {
       addCriterion("FILE_PAGE >", value, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageGreaterThanOrEqualTo(String value) {
       addCriterion("FILE_PAGE >=", value, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageLessThan(String value) {
       addCriterion("FILE_PAGE <", value, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageLessThanOrEqualTo(String value) {
       addCriterion("FILE_PAGE <=", value, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageLike(String value) {
       addCriterion("FILE_PAGE like", value, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageNotLike(String value) {
       addCriterion("FILE_PAGE not like", value, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageIn(List<String> values) {
       addCriterion("FILE_PAGE in", values, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageNotIn(List<String> values) {
       addCriterion("FILE_PAGE not in", values, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageBetween(String value1, String value2) {
       addCriterion("FILE_PAGE between", value1, value2, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andFilePageNotBetween(String value1, String value2) {
       addCriterion("FILE_PAGE not between", value1, value2, "filePage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageIsNull() {
       addCriterion("PRINT_PAGE is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageIsNotNull() {
       addCriterion("PRINT_PAGE is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageEqualTo(String value) {
       addCriterion("PRINT_PAGE =", value, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageNotEqualTo(String value) {
       addCriterion("PRINT_PAGE <>", value, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageGreaterThan(String value) {
       addCriterion("PRINT_PAGE >", value, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageGreaterThanOrEqualTo(String value) {
       addCriterion("PRINT_PAGE >=", value, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageLessThan(String value) {
       addCriterion("PRINT_PAGE <", value, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageLessThanOrEqualTo(String value) {
       addCriterion("PRINT_PAGE <=", value, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageLike(String value) {
       addCriterion("PRINT_PAGE like", value, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageNotLike(String value) {
       addCriterion("PRINT_PAGE not like", value, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageIn(List<String> values) {
       addCriterion("PRINT_PAGE in", values, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageNotIn(List<String> values) {
       addCriterion("PRINT_PAGE not in", values, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageBetween(String value1, String value2) {
       addCriterion("PRINT_PAGE between", value1, value2, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintPageNotBetween(String value1, String value2) {
       addCriterion("PRINT_PAGE not between", value1, value2, "printPage");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowIsNull() {
       addCriterion("BORROW is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowIsNotNull() {
       addCriterion("BORROW is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowEqualTo(String value) {
       addCriterion("BORROW =", value, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowNotEqualTo(String value) {
       addCriterion("BORROW <>", value, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowGreaterThan(String value) {
       addCriterion("BORROW >", value, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowGreaterThanOrEqualTo(String value) {
       addCriterion("BORROW >=", value, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowLessThan(String value) {
       addCriterion("BORROW <", value, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowLessThanOrEqualTo(String value) {
       addCriterion("BORROW <=", value, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowLike(String value) {
       addCriterion("BORROW like", value, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowNotLike(String value) {
       addCriterion("BORROW not like", value, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowIn(List<String> values) {
       addCriterion("BORROW in", values, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowNotIn(List<String> values) {
       addCriterion("BORROW not in", values, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowBetween(String value1, String value2) {
       addCriterion("BORROW between", value1, value2, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowNotBetween(String value1, String value2) {
       addCriterion("BORROW not between", value1, value2, "borrow");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkIsNull() {
       addCriterion("REMARK is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkIsNotNull() {
       addCriterion("REMARK is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkEqualTo(String value) {
       addCriterion("REMARK =", value, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkNotEqualTo(String value) {
       addCriterion("REMARK <>", value, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkGreaterThan(String value) {
       addCriterion("REMARK >", value, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkGreaterThanOrEqualTo(String value) {
       addCriterion("REMARK >=", value, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkLessThan(String value) {
       addCriterion("REMARK <", value, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkLessThanOrEqualTo(String value) {
       addCriterion("REMARK <=", value, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkLike(String value) {
       addCriterion("REMARK like", value, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkNotLike(String value) {
       addCriterion("REMARK not like", value, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkIn(List<String> values) {
       addCriterion("REMARK in", values, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkNotIn(List<String> values) {
       addCriterion("REMARK not in", values, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkBetween(String value1, String value2) {
       addCriterion("REMARK between", value1, value2, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andRemarkNotBetween(String value1, String value2) {
       addCriterion("REMARK not between", value1, value2, "remark");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusIsNull() {
       addCriterion("BORROW_STATUS is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusIsNotNull() {
       addCriterion("BORROW_STATUS is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusEqualTo(String value) {
       addCriterion("BORROW_STATUS =", value, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusNotEqualTo(String value) {
       addCriterion("BORROW_STATUS <>", value, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusGreaterThan(String value) {
       addCriterion("BORROW_STATUS >", value, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusGreaterThanOrEqualTo(String value) {
       addCriterion("BORROW_STATUS >=", value, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusLessThan(String value) {
       addCriterion("BORROW_STATUS <", value, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusLessThanOrEqualTo(String value) {
       addCriterion("BORROW_STATUS <=", value, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusLike(String value) {
       addCriterion("BORROW_STATUS like", value, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusNotLike(String value) {
       addCriterion("BORROW_STATUS not like", value, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusIn(List<String> values) {
       addCriterion("BORROW_STATUS in", values, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusNotIn(List<String> values) {
       addCriterion("BORROW_STATUS not in", values, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusBetween(String value1, String value2) {
       addCriterion("BORROW_STATUS between", value1, value2, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andBorrowStatusNotBetween(String value1, String value2) {
       addCriterion("BORROW_STATUS not between", value1, value2, "borrowStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusIsNull() {
       addCriterion("CONFIRM_STATUS is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusIsNotNull() {
       addCriterion("CONFIRM_STATUS is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusEqualTo(String value) {
       addCriterion("CONFIRM_STATUS =", value, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusNotEqualTo(String value) {
       addCriterion("CONFIRM_STATUS <>", value, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusGreaterThan(String value) {
       addCriterion("CONFIRM_STATUS >", value, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusGreaterThanOrEqualTo(String value) {
       addCriterion("CONFIRM_STATUS >=", value, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusLessThan(String value) {
       addCriterion("CONFIRM_STATUS <", value, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusLessThanOrEqualTo(String value) {
       addCriterion("CONFIRM_STATUS <=", value, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusLike(String value) {
       addCriterion("CONFIRM_STATUS like", value, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusNotLike(String value) {
       addCriterion("CONFIRM_STATUS not like", value, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusIn(List<String> values) {
       addCriterion("CONFIRM_STATUS in", values, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusNotIn(List<String> values) {
       addCriterion("CONFIRM_STATUS not in", values, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusBetween(String value1, String value2) {
       addCriterion("CONFIRM_STATUS between", value1, value2, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andConfirmStatusNotBetween(String value1, String value2) {
       addCriterion("CONFIRM_STATUS not between", value1, value2, "confirmStatus");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnIsNull() {
       addCriterion("DOWNLOAD_YN is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnIsNotNull() {
       addCriterion("DOWNLOAD_YN is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnEqualTo(Integer value) {
       addCriterion("DOWNLOAD_YN =", value, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnNotEqualTo(Integer value) {
       addCriterion("DOWNLOAD_YN <>", value, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnGreaterThan(Integer value) {
       addCriterion("DOWNLOAD_YN >", value, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnGreaterThanOrEqualTo(Integer value) {
       addCriterion("DOWNLOAD_YN >=", value, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnLessThan(Integer value) {
       addCriterion("DOWNLOAD_YN <", value, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnLessThanOrEqualTo(Integer value) {
       addCriterion("DOWNLOAD_YN <=", value, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnIn(List<Integer> values) {
       addCriterion("DOWNLOAD_YN in", values, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnNotIn(List<Integer> values) {
       addCriterion("DOWNLOAD_YN not in", values, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnBetween(Integer value1, Integer value2) {
       addCriterion("DOWNLOAD_YN between", value1, value2, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadYnNotBetween(Integer value1, Integer value2) {
       addCriterion("DOWNLOAD_YN not between", value1, value2, "downloadYn");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditIsNull() {
       addCriterion("ISAUDIT is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditIsNotNull() {
       addCriterion("ISAUDIT is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditEqualTo(String value) {
       addCriterion("ISAUDIT =", value, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditNotEqualTo(String value) {
       addCriterion("ISAUDIT <>", value, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditGreaterThan(String value) {
       addCriterion("ISAUDIT >", value, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditGreaterThanOrEqualTo(String value) {
       addCriterion("ISAUDIT >=", value, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditLessThan(String value) {
       addCriterion("ISAUDIT <", value, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditLessThanOrEqualTo(String value) {
       addCriterion("ISAUDIT <=", value, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditLike(String value) {
       addCriterion("ISAUDIT like", value, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditNotLike(String value) {
       addCriterion("ISAUDIT not like", value, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditIn(List<String> values) {
       addCriterion("ISAUDIT in", values, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditNotIn(List<String> values) {
       addCriterion("ISAUDIT not in", values, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditBetween(String value1, String value2) {
       addCriterion("ISAUDIT between", value1, value2, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andIsauditNotBetween(String value1, String value2) {
       addCriterion("ISAUDIT not between", value1, value2, "isaudit");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadIsNull() {
       addCriterion("DOWNLOAD is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadIsNotNull() {
       addCriterion("DOWNLOAD is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadEqualTo(Integer value) {
       addCriterion("DOWNLOAD =", value, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadNotEqualTo(Integer value) {
       addCriterion("DOWNLOAD <>", value, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadGreaterThan(Integer value) {
       addCriterion("DOWNLOAD >", value, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadGreaterThanOrEqualTo(Integer value) {
       addCriterion("DOWNLOAD >=", value, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadLessThan(Integer value) {
       addCriterion("DOWNLOAD <", value, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadLessThanOrEqualTo(Integer value) {
       addCriterion("DOWNLOAD <=", value, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadIn(List<Integer> values) {
       addCriterion("DOWNLOAD in", values, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadNotIn(List<Integer> values) {
       addCriterion("DOWNLOAD not in", values, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadBetween(Integer value1, Integer value2) {
       addCriterion("DOWNLOAD between", value1, value2, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andDownloadNotBetween(Integer value1, Integer value2) {
       addCriterion("DOWNLOAD not between", value1, value2, "download");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintIsNull() {
       addCriterion("PRINT is null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintIsNotNull() {
       addCriterion("PRINT is not null");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintEqualTo(Integer value) {
       addCriterion("PRINT =", value, "print");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintNotEqualTo(Integer value) {
       addCriterion("PRINT <>", value, "print");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintGreaterThan(Integer value) {
       addCriterion("PRINT >", value, "print");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintGreaterThanOrEqualTo(Integer value) {
       addCriterion("PRINT >=", value, "print");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintLessThan(Integer value) {
       addCriterion("PRINT <", value, "print");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintLessThanOrEqualTo(Integer value) {
       addCriterion("PRINT <=", value, "print");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintIn(List<Integer> values) {
       addCriterion("PRINT in", values, "print");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintNotIn(List<Integer> values) {
       addCriterion("PRINT not in", values, "print");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintBetween(Integer value1, Integer value2) {
       addCriterion("PRINT between", value1, value2, "print");
       return (RmsFileExample.Criteria)this;
     }
 
     public RmsFileExample.Criteria andPrintNotBetween(Integer value1, Integer value2) {
       addCriterion("PRINT not between", value1, value2, "print");
       return (RmsFileExample.Criteria)this;
     }
   }
 }

