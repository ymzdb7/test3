 package com.myoa.model.strstatus;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class StrstatusExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public StrstatusExample()
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
 
   public static class Criteria extends StrstatusExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<StrstatusExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<StrstatusExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<StrstatusExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new StrstatusExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new StrstatusExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new StrstatusExample.Criterion(condition, value1, value2));
     }
 
     public StrstatusExample.Criteria andIdIsNull() {
       addCriterion("ID is null");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdIsNotNull() {
       addCriterion("ID is not null");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("ID =", value, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("ID <>", value, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("ID >", value, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ID >=", value, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdLessThan(Integer value) {
       addCriterion("ID <", value, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("ID <=", value, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("ID in", values, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("ID not in", values, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("ID between", value1, value2, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ID not between", value1, value2, "id");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentIsNull() {
       addCriterion("CONTENT is null");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentIsNotNull() {
       addCriterion("CONTENT is not null");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentEqualTo(String value) {
       addCriterion("CONTENT =", value, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentNotEqualTo(String value) {
       addCriterion("CONTENT <>", value, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentGreaterThan(String value) {
       addCriterion("CONTENT >", value, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentGreaterThanOrEqualTo(String value) {
       addCriterion("CONTENT >=", value, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentLessThan(String value) {
       addCriterion("CONTENT <", value, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentLessThanOrEqualTo(String value) {
       addCriterion("CONTENT <=", value, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentLike(String value) {
       addCriterion("CONTENT like", value, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentNotLike(String value) {
       addCriterion("CONTENT not like", value, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentIn(List<String> values) {
       addCriterion("CONTENT in", values, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentNotIn(List<String> values) {
       addCriterion("CONTENT not in", values, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentBetween(String value1, String value2) {
       addCriterion("CONTENT between", value1, value2, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andContentNotBetween(String value1, String value2) {
       addCriterion("CONTENT not between", value1, value2, "content");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateIsNull() {
       addCriterion("STATE is null");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateIsNotNull() {
       addCriterion("STATE is not null");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateEqualTo(String value) {
       addCriterion("STATE =", value, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateNotEqualTo(String value) {
       addCriterion("STATE <>", value, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateGreaterThan(String value) {
       addCriterion("STATE >", value, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateGreaterThanOrEqualTo(String value) {
       addCriterion("STATE >=", value, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateLessThan(String value) {
       addCriterion("STATE <", value, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateLessThanOrEqualTo(String value) {
       addCriterion("STATE <=", value, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateLike(String value) {
       addCriterion("STATE like", value, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateNotLike(String value) {
       addCriterion("STATE not like", value, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateIn(List<String> values) {
       addCriterion("STATE in", values, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateNotIn(List<String> values) {
       addCriterion("STATE not in", values, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateBetween(String value1, String value2) {
       addCriterion("STATE between", value1, value2, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStateNotBetween(String value1, String value2) {
       addCriterion("STATE not between", value1, value2, "state");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlIsNull() {
       addCriterion("STRING_SQL is null");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlIsNotNull() {
       addCriterion("STRING_SQL is not null");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlEqualTo(String value) {
       addCriterion("STRING_SQL =", value, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlNotEqualTo(String value) {
       addCriterion("STRING_SQL <>", value, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlGreaterThan(String value) {
       addCriterion("STRING_SQL >", value, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlGreaterThanOrEqualTo(String value) {
       addCriterion("STRING_SQL >=", value, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlLessThan(String value) {
       addCriterion("STRING_SQL <", value, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlLessThanOrEqualTo(String value) {
       addCriterion("STRING_SQL <=", value, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlLike(String value) {
       addCriterion("STRING_SQL like", value, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlNotLike(String value) {
       addCriterion("STRING_SQL not like", value, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlIn(List<String> values) {
       addCriterion("STRING_SQL in", values, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlNotIn(List<String> values) {
       addCriterion("STRING_SQL not in", values, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlBetween(String value1, String value2) {
       addCriterion("STRING_SQL between", value1, value2, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
 
     public StrstatusExample.Criteria andStringSqlNotBetween(String value1, String value2) {
       addCriterion("STRING_SQL not between", value1, value2, "stringSql");
       return (StrstatusExample.Criteria)this;
     }
   }
 }

