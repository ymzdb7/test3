 package com.myoa.model.version;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class VersionExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public VersionExample()
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
 
   public static class Criteria extends VersionExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<VersionExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<VersionExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<VersionExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new VersionExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new VersionExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new VersionExample.Criterion(condition, value1, value2));
     }
 
     public VersionExample.Criteria andVerIsNull() {
       addCriterion("VER is null");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerIsNotNull() {
       addCriterion("VER is not null");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerEqualTo(String value) {
       addCriterion("VER =", value, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerNotEqualTo(String value) {
       addCriterion("VER <>", value, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerGreaterThan(String value) {
       addCriterion("VER >", value, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerGreaterThanOrEqualTo(String value) {
       addCriterion("VER >=", value, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerLessThan(String value) {
       addCriterion("VER <", value, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerLessThanOrEqualTo(String value) {
       addCriterion("VER <=", value, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerLike(String value) {
       addCriterion("VER like", value, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerNotLike(String value) {
       addCriterion("VER not like", value, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerIn(List<String> values) {
       addCriterion("VER in", values, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerNotIn(List<String> values) {
       addCriterion("VER not in", values, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerBetween(String value1, String value2) {
       addCriterion("VER between", value1, value2, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andVerNotBetween(String value1, String value2) {
       addCriterion("VER not between", value1, value2, "ver");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaIsNull() {
       addCriterion("EA is null");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaIsNotNull() {
       addCriterion("EA is not null");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaEqualTo(String value) {
       addCriterion("EA =", value, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaNotEqualTo(String value) {
       addCriterion("EA <>", value, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaGreaterThan(String value) {
       addCriterion("EA >", value, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaGreaterThanOrEqualTo(String value) {
       addCriterion("EA >=", value, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaLessThan(String value) {
       addCriterion("EA <", value, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaLessThanOrEqualTo(String value) {
       addCriterion("EA <=", value, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaLike(String value) {
       addCriterion("EA like", value, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaNotLike(String value) {
       addCriterion("EA not like", value, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaIn(List<String> values) {
       addCriterion("EA in", values, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaNotIn(List<String> values) {
       addCriterion("EA not in", values, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaBetween(String value1, String value2) {
       addCriterion("EA between", value1, value2, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andEaNotBetween(String value1, String value2) {
       addCriterion("EA not between", value1, value2, "ea");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnIsNull() {
       addCriterion("SN is null");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnIsNotNull() {
       addCriterion("SN is not null");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnEqualTo(String value) {
       addCriterion("SN =", value, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnNotEqualTo(String value) {
       addCriterion("SN <>", value, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnGreaterThan(String value) {
       addCriterion("SN >", value, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnGreaterThanOrEqualTo(String value) {
       addCriterion("SN >=", value, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnLessThan(String value) {
       addCriterion("SN <", value, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnLessThanOrEqualTo(String value) {
       addCriterion("SN <=", value, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnLike(String value) {
       addCriterion("SN like", value, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnNotLike(String value) {
       addCriterion("SN not like", value, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnIn(List<String> values) {
       addCriterion("SN in", values, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnNotIn(List<String> values) {
       addCriterion("SN not in", values, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnBetween(String value1, String value2) {
       addCriterion("SN between", value1, value2, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andSnNotBetween(String value1, String value2) {
       addCriterion("SN not between", value1, value2, "sn");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeIsNull() {
       addCriterion("CODE is null");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeIsNotNull() {
       addCriterion("CODE is not null");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeEqualTo(String value) {
       addCriterion("CODE =", value, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeNotEqualTo(String value) {
       addCriterion("CODE <>", value, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeGreaterThan(String value) {
       addCriterion("CODE >", value, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeGreaterThanOrEqualTo(String value) {
       addCriterion("CODE >=", value, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeLessThan(String value) {
       addCriterion("CODE <", value, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeLessThanOrEqualTo(String value) {
       addCriterion("CODE <=", value, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeLike(String value) {
       addCriterion("CODE like", value, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeNotLike(String value) {
       addCriterion("CODE not like", value, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeIn(List<String> values) {
       addCriterion("CODE in", values, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeNotIn(List<String> values) {
       addCriterion("CODE not in", values, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeBetween(String value1, String value2) {
       addCriterion("CODE between", value1, value2, "code");
       return (VersionExample.Criteria)this;
     }
 
     public VersionExample.Criteria andCodeNotBetween(String value1, String value2) {
       addCriterion("CODE not between", value1, value2, "code");
       return (VersionExample.Criteria)this;
     }
   }
 }

