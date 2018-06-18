 package com.myoa.model.sys;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class SealExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public SealExample()
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
 
   public static class Criteria extends SealExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<SealExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<SealExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<SealExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new SealExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new SealExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new SealExample.Criterion(condition, value1, value2));
     }
 
     public SealExample.Criteria andIdIsNull() {
       addCriterion("ID is null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdIsNotNull() {
       addCriterion("ID is not null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("ID =", value, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("ID <>", value, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("ID >", value, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ID >=", value, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdLessThan(Integer value) {
       addCriterion("ID <", value, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("ID <=", value, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("ID in", values, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("ID not in", values, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("ID between", value1, value2, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ID not between", value1, value2, "id");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdIsNull() {
       addCriterion("SEAL_ID is null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdIsNotNull() {
       addCriterion("SEAL_ID is not null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdEqualTo(String value) {
       addCriterion("SEAL_ID =", value, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdNotEqualTo(String value) {
       addCriterion("SEAL_ID <>", value, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdGreaterThan(String value) {
       addCriterion("SEAL_ID >", value, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdGreaterThanOrEqualTo(String value) {
       addCriterion("SEAL_ID >=", value, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdLessThan(String value) {
       addCriterion("SEAL_ID <", value, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdLessThanOrEqualTo(String value) {
       addCriterion("SEAL_ID <=", value, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdLike(String value) {
       addCriterion("SEAL_ID like", value, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdNotLike(String value) {
       addCriterion("SEAL_ID not like", value, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdIn(List<String> values) {
       addCriterion("SEAL_ID in", values, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdNotIn(List<String> values) {
       addCriterion("SEAL_ID not in", values, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdBetween(String value1, String value2) {
       addCriterion("SEAL_ID between", value1, value2, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealIdNotBetween(String value1, String value2) {
       addCriterion("SEAL_ID not between", value1, value2, "sealId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdIsNull() {
       addCriterion("DEPT_ID is null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdIsNotNull() {
       addCriterion("DEPT_ID is not null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdEqualTo(String value) {
       addCriterion("DEPT_ID =", value, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdNotEqualTo(String value) {
       addCriterion("DEPT_ID <>", value, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdGreaterThan(String value) {
       addCriterion("DEPT_ID >", value, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdGreaterThanOrEqualTo(String value) {
       addCriterion("DEPT_ID >=", value, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdLessThan(String value) {
       addCriterion("DEPT_ID <", value, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdLessThanOrEqualTo(String value) {
       addCriterion("DEPT_ID <=", value, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdLike(String value) {
       addCriterion("DEPT_ID like", value, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdNotLike(String value) {
       addCriterion("DEPT_ID not like", value, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdIn(List<String> values) {
       addCriterion("DEPT_ID in", values, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdNotIn(List<String> values) {
       addCriterion("DEPT_ID not in", values, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdBetween(String value1, String value2) {
       addCriterion("DEPT_ID between", value1, value2, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andDeptIdNotBetween(String value1, String value2) {
       addCriterion("DEPT_ID not between", value1, value2, "deptId");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameIsNull() {
       addCriterion("SEAL_NAME is null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameIsNotNull() {
       addCriterion("SEAL_NAME is not null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameEqualTo(String value) {
       addCriterion("SEAL_NAME =", value, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameNotEqualTo(String value) {
       addCriterion("SEAL_NAME <>", value, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameGreaterThan(String value) {
       addCriterion("SEAL_NAME >", value, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameGreaterThanOrEqualTo(String value) {
       addCriterion("SEAL_NAME >=", value, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameLessThan(String value) {
       addCriterion("SEAL_NAME <", value, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameLessThanOrEqualTo(String value) {
       addCriterion("SEAL_NAME <=", value, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameLike(String value) {
       addCriterion("SEAL_NAME like", value, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameNotLike(String value) {
       addCriterion("SEAL_NAME not like", value, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameIn(List<String> values) {
       addCriterion("SEAL_NAME in", values, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameNotIn(List<String> values) {
       addCriterion("SEAL_NAME not in", values, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameBetween(String value1, String value2) {
       addCriterion("SEAL_NAME between", value1, value2, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andSealNameNotBetween(String value1, String value2) {
       addCriterion("SEAL_NAME not between", value1, value2, "sealName");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeIsNull() {
       addCriterion("CREATE_TIME is null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("CREATE_TIME is not null");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeEqualTo(Date value) {
       addCriterion("CREATE_TIME =", value, "createTime");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeNotEqualTo(Date value) {
       addCriterion("CREATE_TIME <>", value, "createTime");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeGreaterThan(Date value) {
       addCriterion("CREATE_TIME >", value, "createTime");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME >=", value, "createTime");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeLessThan(Date value) {
       addCriterion("CREATE_TIME <", value, "createTime");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME <=", value, "createTime");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeIn(List<Date> values) {
       addCriterion("CREATE_TIME in", values, "createTime");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeNotIn(List<Date> values) {
       addCriterion("CREATE_TIME not in", values, "createTime");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME between", value1, value2, "createTime");
       return (SealExample.Criteria)this;
     }
 
     public SealExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME not between", value1, value2, "createTime");
       return (SealExample.Criteria)this;
     }
   }
 }

