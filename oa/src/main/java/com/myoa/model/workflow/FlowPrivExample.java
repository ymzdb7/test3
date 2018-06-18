 package com.myoa.model.workflow;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class FlowPrivExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public FlowPrivExample()
   {
     this.oredCriteria = new ArrayList();
   }
 
   public void setOrderByClause(String orderByClause) {
     this.orderByClause = orderByClause;
   }
 
   public String getOrderByClause() {
     return this.orderByClause;
   }
 
   public void setDistinct(boolean distinct) {
     this.distinct = distinct;
   }
 
   public boolean isDistinct() {
     return this.distinct;
   }
 
   public List<Criteria> getOredCriteria() {
     return this.oredCriteria;
   }
 
   public void or(Criteria criteria) {
     this.oredCriteria.add(criteria);
   }
 
   public Criteria or() {
     Criteria criteria = createCriteriaInternal();
     this.oredCriteria.add(criteria);
     return criteria;
   }
 
   public Criteria createCriteria() {
     Criteria criteria = createCriteriaInternal();
     if (this.oredCriteria.size() == 0) {
       this.oredCriteria.add(criteria);
     }
     return criteria;
   }
 
   protected Criteria createCriteriaInternal() {
     Criteria criteria = new Criteria();
     return criteria;
   }
 
   public void clear() {
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
 
   public static class Criteria extends FlowPrivExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<FlowPrivExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<FlowPrivExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<FlowPrivExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new FlowPrivExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property)
     {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
 
       this.criteria.add(new FlowPrivExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property)
     {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
 
       this.criteria.add(new FlowPrivExample.Criterion(condition, value1, value2));
     }
 
     public FlowPrivExample.Criteria andIdIsNull() {
       addCriterion("ID is null");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdIsNotNull() {
       addCriterion("ID is not null");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("ID =", value, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("ID <>", value, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("ID >", value, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ID >=", value, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdLessThan(Integer value) {
       addCriterion("ID <", value, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("ID <=", value, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("ID in", values, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("ID not in", values, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("ID between", value1, value2, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ID not between", value1, value2, "id");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdIsNull() {
       addCriterion("FLOW_ID is null");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdIsNotNull() {
       addCriterion("FLOW_ID is not null");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdEqualTo(Integer value) {
       addCriterion("FLOW_ID =", value, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdNotEqualTo(Integer value) {
       addCriterion("FLOW_ID <>", value, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdGreaterThan(Integer value) {
       addCriterion("FLOW_ID >", value, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("FLOW_ID >=", value, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdLessThan(Integer value) {
       addCriterion("FLOW_ID <", value, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdLessThanOrEqualTo(Integer value) {
       addCriterion("FLOW_ID <=", value, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdIn(List<Integer> values) {
       addCriterion("FLOW_ID in", values, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdNotIn(List<Integer> values) {
       addCriterion("FLOW_ID not in", values, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdBetween(Integer value1, Integer value2) {
       addCriterion("FLOW_ID between", value1, value2, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
       addCriterion("FLOW_ID not between", value1, value2, "flowId");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeIsNull() {
       addCriterion("PRIV_TYPE is null");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeIsNotNull() {
       addCriterion("PRIV_TYPE is not null");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeEqualTo(Integer value) {
       addCriterion("PRIV_TYPE =", value, "privType");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeNotEqualTo(Integer value) {
       addCriterion("PRIV_TYPE <>", value, "privType");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeGreaterThan(Integer value) {
       addCriterion("PRIV_TYPE >", value, "privType");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("PRIV_TYPE >=", value, "privType");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeLessThan(Integer value) {
       addCriterion("PRIV_TYPE <", value, "privType");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeLessThanOrEqualTo(Integer value) {
       addCriterion("PRIV_TYPE <=", value, "privType");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeIn(List<Integer> values) {
       addCriterion("PRIV_TYPE in", values, "privType");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeNotIn(List<Integer> values) {
       addCriterion("PRIV_TYPE not in", values, "privType");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeBetween(Integer value1, Integer value2) {
       addCriterion("PRIV_TYPE between", value1, value2, "privType");
       return (FlowPrivExample.Criteria)this;
     }
 
     public FlowPrivExample.Criteria andPrivTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("PRIV_TYPE not between", value1, value2, "privType");
       return (FlowPrivExample.Criteria)this;
     }
   }
 }

