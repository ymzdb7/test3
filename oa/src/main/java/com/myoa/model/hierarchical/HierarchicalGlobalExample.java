 package com.myoa.model.hierarchical;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class HierarchicalGlobalExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public HierarchicalGlobalExample()
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
 
   public static class Criteria extends HierarchicalGlobalExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<HierarchicalGlobalExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<HierarchicalGlobalExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<HierarchicalGlobalExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new HierarchicalGlobalExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new HierarchicalGlobalExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new HierarchicalGlobalExample.Criterion(condition, value1, value2));
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdIsNull() {
       addCriterion("GLOBAL_ID is null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdIsNotNull() {
       addCriterion("GLOBAL_ID is not null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdEqualTo(Integer value) {
       addCriterion("GLOBAL_ID =", value, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdNotEqualTo(Integer value) {
       addCriterion("GLOBAL_ID <>", value, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdGreaterThan(Integer value) {
       addCriterion("GLOBAL_ID >", value, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("GLOBAL_ID >=", value, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdLessThan(Integer value) {
       addCriterion("GLOBAL_ID <", value, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdLessThanOrEqualTo(Integer value) {
       addCriterion("GLOBAL_ID <=", value, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdIn(List<Integer> values) {
       addCriterion("GLOBAL_ID in", values, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdNotIn(List<Integer> values) {
       addCriterion("GLOBAL_ID not in", values, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdBetween(Integer value1, Integer value2) {
       addCriterion("GLOBAL_ID between", value1, value2, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalIdNotBetween(Integer value1, Integer value2) {
       addCriterion("GLOBAL_ID not between", value1, value2, "globalId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdIsNull() {
       addCriterion("MODEL_ID is null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdIsNotNull() {
       addCriterion("MODEL_ID is not null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdEqualTo(String value) {
       addCriterion("MODEL_ID =", value, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdNotEqualTo(String value) {
       addCriterion("MODEL_ID <>", value, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdGreaterThan(String value) {
       addCriterion("MODEL_ID >", value, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdGreaterThanOrEqualTo(String value) {
       addCriterion("MODEL_ID >=", value, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdLessThan(String value) {
       addCriterion("MODEL_ID <", value, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdLessThanOrEqualTo(String value) {
       addCriterion("MODEL_ID <=", value, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdLike(String value) {
       addCriterion("MODEL_ID like", value, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdNotLike(String value) {
       addCriterion("MODEL_ID not like", value, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdIn(List<String> values) {
       addCriterion("MODEL_ID in", values, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdNotIn(List<String> values) {
       addCriterion("MODEL_ID not in", values, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdBetween(String value1, String value2) {
       addCriterion("MODEL_ID between", value1, value2, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andModelIdNotBetween(String value1, String value2) {
       addCriterion("MODEL_ID not between", value1, value2, "modelId");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonIsNull() {
       addCriterion("GLOBAL_PERSON is null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonIsNotNull() {
       addCriterion("GLOBAL_PERSON is not null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonEqualTo(String value) {
       addCriterion("GLOBAL_PERSON =", value, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonNotEqualTo(String value) {
       addCriterion("GLOBAL_PERSON <>", value, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonGreaterThan(String value) {
       addCriterion("GLOBAL_PERSON >", value, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonGreaterThanOrEqualTo(String value) {
       addCriterion("GLOBAL_PERSON >=", value, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonLessThan(String value) {
       addCriterion("GLOBAL_PERSON <", value, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonLessThanOrEqualTo(String value) {
       addCriterion("GLOBAL_PERSON <=", value, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonLike(String value) {
       addCriterion("GLOBAL_PERSON like", value, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonNotLike(String value) {
       addCriterion("GLOBAL_PERSON not like", value, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonIn(List<String> values) {
       addCriterion("GLOBAL_PERSON in", values, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonNotIn(List<String> values) {
       addCriterion("GLOBAL_PERSON not in", values, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonBetween(String value1, String value2) {
       addCriterion("GLOBAL_PERSON between", value1, value2, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPersonNotBetween(String value1, String value2) {
       addCriterion("GLOBAL_PERSON not between", value1, value2, "globalPerson");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptIsNull() {
       addCriterion("GLOBAL_DEPT is null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptIsNotNull() {
       addCriterion("GLOBAL_DEPT is not null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptEqualTo(String value) {
       addCriterion("GLOBAL_DEPT =", value, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptNotEqualTo(String value) {
       addCriterion("GLOBAL_DEPT <>", value, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptGreaterThan(String value) {
       addCriterion("GLOBAL_DEPT >", value, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptGreaterThanOrEqualTo(String value) {
       addCriterion("GLOBAL_DEPT >=", value, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptLessThan(String value) {
       addCriterion("GLOBAL_DEPT <", value, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptLessThanOrEqualTo(String value) {
       addCriterion("GLOBAL_DEPT <=", value, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptLike(String value) {
       addCriterion("GLOBAL_DEPT like", value, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptNotLike(String value) {
       addCriterion("GLOBAL_DEPT not like", value, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptIn(List<String> values) {
       addCriterion("GLOBAL_DEPT in", values, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptNotIn(List<String> values) {
       addCriterion("GLOBAL_DEPT not in", values, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptBetween(String value1, String value2) {
       addCriterion("GLOBAL_DEPT between", value1, value2, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalDeptNotBetween(String value1, String value2) {
       addCriterion("GLOBAL_DEPT not between", value1, value2, "globalDept");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivIsNull() {
       addCriterion("GLOBAL_PRIV is null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivIsNotNull() {
       addCriterion("GLOBAL_PRIV is not null");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivEqualTo(String value) {
       addCriterion("GLOBAL_PRIV =", value, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivNotEqualTo(String value) {
       addCriterion("GLOBAL_PRIV <>", value, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivGreaterThan(String value) {
       addCriterion("GLOBAL_PRIV >", value, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivGreaterThanOrEqualTo(String value) {
       addCriterion("GLOBAL_PRIV >=", value, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivLessThan(String value) {
       addCriterion("GLOBAL_PRIV <", value, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivLessThanOrEqualTo(String value) {
       addCriterion("GLOBAL_PRIV <=", value, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivLike(String value) {
       addCriterion("GLOBAL_PRIV like", value, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivNotLike(String value) {
       addCriterion("GLOBAL_PRIV not like", value, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivIn(List<String> values) {
       addCriterion("GLOBAL_PRIV in", values, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivNotIn(List<String> values) {
       addCriterion("GLOBAL_PRIV not in", values, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivBetween(String value1, String value2) {
       addCriterion("GLOBAL_PRIV between", value1, value2, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
 
     public HierarchicalGlobalExample.Criteria andGlobalPrivNotBetween(String value1, String value2) {
       addCriterion("GLOBAL_PRIV not between", value1, value2, "globalPriv");
       return (HierarchicalGlobalExample.Criteria)this;
     }
   }
 }

