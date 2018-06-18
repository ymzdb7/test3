 package com.myoa.model.supervision;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class SupervisionTypeExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public SupervisionTypeExample()
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
 
   public static class Criteria extends SupervisionTypeExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<SupervisionTypeExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<SupervisionTypeExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<SupervisionTypeExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new SupervisionTypeExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new SupervisionTypeExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new SupervisionTypeExample.Criterion(condition, value1, value2));
     }
 
     public SupervisionTypeExample.Criteria andSidIsNull() {
       addCriterion("sid is null");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidIsNotNull() {
       addCriterion("sid is not null");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidEqualTo(Integer value) {
       addCriterion("sid =", value, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidNotEqualTo(Integer value) {
       addCriterion("sid <>", value, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidGreaterThan(Integer value) {
       addCriterion("sid >", value, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidGreaterThanOrEqualTo(Integer value) {
       addCriterion("sid >=", value, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidLessThan(Integer value) {
       addCriterion("sid <", value, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidLessThanOrEqualTo(Integer value) {
       addCriterion("sid <=", value, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidIn(List<Integer> values) {
       addCriterion("sid in", values, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidNotIn(List<Integer> values) {
       addCriterion("sid not in", values, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidBetween(Integer value1, Integer value2) {
       addCriterion("sid between", value1, value2, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andSidNotBetween(Integer value1, Integer value2) {
       addCriterion("sid not between", value1, value2, "sid");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameIsNull() {
       addCriterion("type_name is null");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameIsNotNull() {
       addCriterion("type_name is not null");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameEqualTo(String value) {
       addCriterion("type_name =", value, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameNotEqualTo(String value) {
       addCriterion("type_name <>", value, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameGreaterThan(String value) {
       addCriterion("type_name >", value, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameGreaterThanOrEqualTo(String value) {
       addCriterion("type_name >=", value, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameLessThan(String value) {
       addCriterion("type_name <", value, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameLessThanOrEqualTo(String value) {
       addCriterion("type_name <=", value, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameLike(String value) {
       addCriterion("type_name like", value, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameNotLike(String value) {
       addCriterion("type_name not like", value, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameIn(List<String> values) {
       addCriterion("type_name in", values, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameNotIn(List<String> values) {
       addCriterion("type_name not in", values, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameBetween(String value1, String value2) {
       addCriterion("type_name between", value1, value2, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andTypeNameNotBetween(String value1, String value2) {
       addCriterion("type_name not between", value1, value2, "typeName");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumIsNull() {
       addCriterion("order_num is null");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumIsNotNull() {
       addCriterion("order_num is not null");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumEqualTo(Integer value) {
       addCriterion("order_num =", value, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumNotEqualTo(Integer value) {
       addCriterion("order_num <>", value, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumGreaterThan(Integer value) {
       addCriterion("order_num >", value, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
       addCriterion("order_num >=", value, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumLessThan(Integer value) {
       addCriterion("order_num <", value, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumLessThanOrEqualTo(Integer value) {
       addCriterion("order_num <=", value, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumIn(List<Integer> values) {
       addCriterion("order_num in", values, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumNotIn(List<Integer> values) {
       addCriterion("order_num not in", values, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumBetween(Integer value1, Integer value2) {
       addCriterion("order_num between", value1, value2, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
       addCriterion("order_num not between", value1, value2, "orderNum");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdIsNull() {
       addCriterion("parent_id is null");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdIsNotNull() {
       addCriterion("parent_id is not null");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdEqualTo(Integer value) {
       addCriterion("parent_id =", value, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdNotEqualTo(Integer value) {
       addCriterion("parent_id <>", value, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdGreaterThan(Integer value) {
       addCriterion("parent_id >", value, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("parent_id >=", value, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdLessThan(Integer value) {
       addCriterion("parent_id <", value, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdLessThanOrEqualTo(Integer value) {
       addCriterion("parent_id <=", value, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdIn(List<Integer> values) {
       addCriterion("parent_id in", values, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdNotIn(List<Integer> values) {
       addCriterion("parent_id not in", values, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdBetween(Integer value1, Integer value2) {
       addCriterion("parent_id between", value1, value2, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
 
     public SupervisionTypeExample.Criteria andParentIdNotBetween(Integer value1, Integer value2) {
       addCriterion("parent_id not between", value1, value2, "parentId");
       return (SupervisionTypeExample.Criteria)this;
     }
   }
 }

