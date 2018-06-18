 package com.myoa.kg.model;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class KgSignatureExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public KgSignatureExample()
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
 
   public static class Criteria extends KgSignatureExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<KgSignatureExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<KgSignatureExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<KgSignatureExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new KgSignatureExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new KgSignatureExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new KgSignatureExample.Criterion(condition, value1, value2));
     }
 
     public KgSignatureExample.Criteria andSignatureIdIsNull() {
       addCriterion("SIGNATURE_ID is null");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdIsNotNull() {
       addCriterion("SIGNATURE_ID is not null");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdEqualTo(Integer value) {
       addCriterion("SIGNATURE_ID =", value, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdNotEqualTo(Integer value) {
       addCriterion("SIGNATURE_ID <>", value, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdGreaterThan(Integer value) {
       addCriterion("SIGNATURE_ID >", value, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("SIGNATURE_ID >=", value, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdLessThan(Integer value) {
       addCriterion("SIGNATURE_ID <", value, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdLessThanOrEqualTo(Integer value) {
       addCriterion("SIGNATURE_ID <=", value, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdIn(List<Integer> values) {
       addCriterion("SIGNATURE_ID in", values, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdNotIn(List<Integer> values) {
       addCriterion("SIGNATURE_ID not in", values, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdBetween(Integer value1, Integer value2) {
       addCriterion("SIGNATURE_ID between", value1, value2, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureIdNotBetween(Integer value1, Integer value2) {
       addCriterion("SIGNATURE_ID not between", value1, value2, "signatureId");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameIsNull() {
       addCriterion("SIGNATURE_NAME is null");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameIsNotNull() {
       addCriterion("SIGNATURE_NAME is not null");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameEqualTo(String value) {
       addCriterion("SIGNATURE_NAME =", value, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameNotEqualTo(String value) {
       addCriterion("SIGNATURE_NAME <>", value, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameGreaterThan(String value) {
       addCriterion("SIGNATURE_NAME >", value, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameGreaterThanOrEqualTo(String value) {
       addCriterion("SIGNATURE_NAME >=", value, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameLessThan(String value) {
       addCriterion("SIGNATURE_NAME <", value, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameLessThanOrEqualTo(String value) {
       addCriterion("SIGNATURE_NAME <=", value, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameLike(String value) {
      addCriterion("SIGNATURE_NAME like", value, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameNotLike(String value) {
       addCriterion("SIGNATURE_NAME not like", value, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameIn(List<String> values) {
       addCriterion("SIGNATURE_NAME in", values, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameNotIn(List<String> values) {
       addCriterion("SIGNATURE_NAME not in", values, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameBetween(String value1, String value2) {
       addCriterion("SIGNATURE_NAME between", value1, value2, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureNameNotBetween(String value1, String value2) {
       addCriterion("SIGNATURE_NAME not between", value1, value2, "signatureName");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidIsNull() {
       addCriterion("SIGNATURE_KGID is null");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidIsNotNull() {
       addCriterion("SIGNATURE_KGID is not null");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidEqualTo(String value) {
       addCriterion("SIGNATURE_KGID =", value, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidNotEqualTo(String value) {
       addCriterion("SIGNATURE_KGID <>", value, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidGreaterThan(String value) {
       addCriterion("SIGNATURE_KGID >", value, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidGreaterThanOrEqualTo(String value) {
       addCriterion("SIGNATURE_KGID >=", value, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidLessThan(String value) {
       addCriterion("SIGNATURE_KGID <", value, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidLessThanOrEqualTo(String value) {
       addCriterion("SIGNATURE_KGID <=", value, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidLike(String value) {
       addCriterion("SIGNATURE_KGID like", value, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidNotLike(String value) {
       addCriterion("SIGNATURE_KGID not like", value, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidIn(List<String> values) {
       addCriterion("SIGNATURE_KGID in", values, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidNotIn(List<String> values) {
       addCriterion("SIGNATURE_KGID not in", values, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidBetween(String value1, String value2) {
       addCriterion("SIGNATURE_KGID between", value1, value2, "signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureKgidNotBetween(String value1, String value2) {
			addCriterion("SIGNATURE_KGID not between", value1, value2,
					"signatureKgid");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusIsNull() {
       addCriterion("SIGNATURE_STATUS is null");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusIsNotNull() {
       addCriterion("SIGNATURE_STATUS is not null");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusEqualTo(Integer value) {
       addCriterion("SIGNATURE_STATUS =", value, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusNotEqualTo(Integer value) {
       addCriterion("SIGNATURE_STATUS <>", value, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusGreaterThan(Integer value) {
       addCriterion("SIGNATURE_STATUS >", value, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("SIGNATURE_STATUS >=", value, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusLessThan(Integer value) {
       addCriterion("SIGNATURE_STATUS <", value, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusLessThanOrEqualTo(Integer value) {
       addCriterion("SIGNATURE_STATUS <=", value, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusIn(List<Integer> values) {
       addCriterion("SIGNATURE_STATUS in", values, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusNotIn(List<Integer> values) {
       addCriterion("SIGNATURE_STATUS not in", values, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusBetween(Integer value1, Integer value2) {
       addCriterion("SIGNATURE_STATUS between", value1, value2, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
 
     public KgSignatureExample.Criteria andSignatureStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("SIGNATURE_STATUS not between", value1, value2, "signatureStatus");
       return (KgSignatureExample.Criteria)this;
     }
   }
 }
