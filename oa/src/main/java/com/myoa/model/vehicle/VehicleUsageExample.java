 package com.myoa.model.vehicle;
 
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class VehicleUsageExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public VehicleUsageExample()
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
 
   public static class Criteria extends VehicleUsageExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<VehicleUsageExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<VehicleUsageExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<VehicleUsageExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new VehicleUsageExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new VehicleUsageExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new VehicleUsageExample.Criterion(condition, value1, value2));
     }
 
     public VehicleUsageExample.Criteria andVuIdIsNull() {
       addCriterion("VU_ID is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdIsNotNull() {
       addCriterion("VU_ID is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdEqualTo(Integer value) {
       addCriterion("VU_ID =", value, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdNotEqualTo(Integer value) {
       addCriterion("VU_ID <>", value, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdGreaterThan(Integer value) {
       addCriterion("VU_ID >", value, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("VU_ID >=", value, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdLessThan(Integer value) {
       addCriterion("VU_ID <", value, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdLessThanOrEqualTo(Integer value) {
       addCriterion("VU_ID <=", value, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdIn(List<Integer> values) {
       addCriterion("VU_ID in", values, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdNotIn(List<Integer> values) {
       addCriterion("VU_ID not in", values, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdBetween(Integer value1, Integer value2) {
       addCriterion("VU_ID between", value1, value2, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuIdNotBetween(Integer value1, Integer value2) {
       addCriterion("VU_ID not between", value1, value2, "vuId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdIsNull() {
       addCriterion("V_ID is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdIsNotNull() {
       addCriterion("V_ID is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdEqualTo(String value) {
       addCriterion("V_ID =", value, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdNotEqualTo(String value) {
       addCriterion("V_ID <>", value, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdGreaterThan(String value) {
       addCriterion("V_ID >", value, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdGreaterThanOrEqualTo(String value) {
       addCriterion("V_ID >=", value, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdLessThan(String value) {
       addCriterion("V_ID <", value, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdLessThanOrEqualTo(String value) {
       addCriterion("V_ID <=", value, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdLike(String value) {
       addCriterion("V_ID like", value, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdNotLike(String value) {
       addCriterion("V_ID not like", value, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdIn(List<String> values) {
       addCriterion("V_ID in", values, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdNotIn(List<String> values) {
       addCriterion("V_ID not in", values, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdBetween(String value1, String value2) {
       addCriterion("V_ID between", value1, value2, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVIdNotBetween(String value1, String value2) {
       addCriterion("V_ID not between", value1, value2, "vId");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateIsNull() {
       addCriterion("VU_REQUEST_DATE is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateIsNotNull() {
       addCriterion("VU_REQUEST_DATE is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateEqualTo(Date value) {
       addCriterion("VU_REQUEST_DATE =", value, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateNotEqualTo(Date value) {
       addCriterion("VU_REQUEST_DATE <>", value, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateGreaterThan(Date value) {
       addCriterion("VU_REQUEST_DATE >", value, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateGreaterThanOrEqualTo(Date value) {
       addCriterion("VU_REQUEST_DATE >=", value, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateLessThan(Date value) {
       addCriterion("VU_REQUEST_DATE <", value, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateLessThanOrEqualTo(Date value) {
       addCriterion("VU_REQUEST_DATE <=", value, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateIn(List<Date> values) {
       addCriterion("VU_REQUEST_DATE in", values, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateNotIn(List<Date> values) {
       addCriterion("VU_REQUEST_DATE not in", values, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateBetween(Date value1, Date value2) {
       addCriterion("VU_REQUEST_DATE between", value1, value2, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuRequestDateNotBetween(Date value1, Date value2) {
       addCriterion("VU_REQUEST_DATE not between", value1, value2, "vuRequestDate");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerIsNull() {
       addCriterion("VU_PROPOSER is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerIsNotNull() {
       addCriterion("VU_PROPOSER is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerEqualTo(String value) {
       addCriterion("VU_PROPOSER =", value, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerNotEqualTo(String value) {
       addCriterion("VU_PROPOSER <>", value, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerGreaterThan(String value) {
       addCriterion("VU_PROPOSER >", value, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerGreaterThanOrEqualTo(String value) {
       addCriterion("VU_PROPOSER >=", value, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerLessThan(String value) {
       addCriterion("VU_PROPOSER <", value, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerLessThanOrEqualTo(String value) {
       addCriterion("VU_PROPOSER <=", value, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerLike(String value) {
       addCriterion("VU_PROPOSER like", value, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerNotLike(String value) {
       addCriterion("VU_PROPOSER not like", value, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerIn(List<String> values) {
       addCriterion("VU_PROPOSER in", values, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerNotIn(List<String> values) {
       addCriterion("VU_PROPOSER not in", values, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerBetween(String value1, String value2) {
       addCriterion("VU_PROPOSER between", value1, value2, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuProposerNotBetween(String value1, String value2) {
       addCriterion("VU_PROPOSER not between", value1, value2, "vuProposer");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserIsNull() {
       addCriterion("VU_USER is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserIsNotNull() {
       addCriterion("VU_USER is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserEqualTo(String value) {
       addCriterion("VU_USER =", value, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserNotEqualTo(String value) {
       addCriterion("VU_USER <>", value, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserGreaterThan(String value) {
       addCriterion("VU_USER >", value, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserGreaterThanOrEqualTo(String value) {
       addCriterion("VU_USER >=", value, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserLessThan(String value) {
       addCriterion("VU_USER <", value, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserLessThanOrEqualTo(String value) {
       addCriterion("VU_USER <=", value, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserLike(String value) {
       addCriterion("VU_USER like", value, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserNotLike(String value) {
       addCriterion("VU_USER not like", value, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserIn(List<String> values) {
       addCriterion("VU_USER in", values, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserNotIn(List<String> values) {
       addCriterion("VU_USER not in", values, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserBetween(String value1, String value2) {
       addCriterion("VU_USER between", value1, value2, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuUserNotBetween(String value1, String value2) {
       addCriterion("VU_USER not between", value1, value2, "vuUser");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartIsNull() {
       addCriterion("VU_START is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartIsNotNull() {
       addCriterion("VU_START is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartEqualTo(Date value) {
       addCriterion("VU_START =", value, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartNotEqualTo(Date value) {
       addCriterion("VU_START <>", value, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartGreaterThan(Date value) {
       addCriterion("VU_START >", value, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartGreaterThanOrEqualTo(Date value) {
       addCriterion("VU_START >=", value, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartLessThan(Date value) {
       addCriterion("VU_START <", value, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartLessThanOrEqualTo(Date value) {
       addCriterion("VU_START <=", value, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartIn(List<Date> values) {
       addCriterion("VU_START in", values, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartNotIn(List<Date> values) {
       addCriterion("VU_START not in", values, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartBetween(Date value1, Date value2) {
       addCriterion("VU_START between", value1, value2, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStartNotBetween(Date value1, Date value2) {
       addCriterion("VU_START not between", value1, value2, "vuStart");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndIsNull() {
       addCriterion("VU_END is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndIsNotNull() {
       addCriterion("VU_END is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndEqualTo(Date value) {
       addCriterion("VU_END =", value, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndNotEqualTo(Date value) {
       addCriterion("VU_END <>", value, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndGreaterThan(Date value) {
       addCriterion("VU_END >", value, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndGreaterThanOrEqualTo(Date value) {
       addCriterion("VU_END >=", value, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndLessThan(Date value) {
       addCriterion("VU_END <", value, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndLessThanOrEqualTo(Date value) {
       addCriterion("VU_END <=", value, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndIn(List<Date> values) {
       addCriterion("VU_END in", values, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndNotIn(List<Date> values) {
       addCriterion("VU_END not in", values, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndBetween(Date value1, Date value2) {
       addCriterion("VU_END between", value1, value2, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuEndNotBetween(Date value1, Date value2) {
       addCriterion("VU_END not between", value1, value2, "vuEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndIsNull() {
       addCriterion("VU_FINAL_END is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndIsNotNull() {
       addCriterion("VU_FINAL_END is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndEqualTo(Date value) {
       addCriterion("VU_FINAL_END =", value, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndNotEqualTo(Date value) {
       addCriterion("VU_FINAL_END <>", value, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndGreaterThan(Date value) {
       addCriterion("VU_FINAL_END >", value, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndGreaterThanOrEqualTo(Date value) {
       addCriterion("VU_FINAL_END >=", value, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndLessThan(Date value) {
       addCriterion("VU_FINAL_END <", value, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndLessThanOrEqualTo(Date value) {
       addCriterion("VU_FINAL_END <=", value, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndIn(List<Date> values) {
       addCriterion("VU_FINAL_END in", values, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndNotIn(List<Date> values) {
       addCriterion("VU_FINAL_END not in", values, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndBetween(Date value1, Date value2) {
       addCriterion("VU_FINAL_END between", value1, value2, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuFinalEndNotBetween(Date value1, Date value2) {
       addCriterion("VU_FINAL_END not between", value1, value2, "vuFinalEnd");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageIsNull() {
       addCriterion("VU_MILEAGE is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageIsNotNull() {
       addCriterion("VU_MILEAGE is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageEqualTo(Integer value) {
       addCriterion("VU_MILEAGE =", value, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageNotEqualTo(Integer value) {
       addCriterion("VU_MILEAGE <>", value, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageGreaterThan(Integer value) {
       addCriterion("VU_MILEAGE >", value, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageGreaterThanOrEqualTo(Integer value) {
       addCriterion("VU_MILEAGE >=", value, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageLessThan(Integer value) {
       addCriterion("VU_MILEAGE <", value, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageLessThanOrEqualTo(Integer value) {
       addCriterion("VU_MILEAGE <=", value, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageIn(List<Integer> values) {
       addCriterion("VU_MILEAGE in", values, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageNotIn(List<Integer> values) {
       addCriterion("VU_MILEAGE not in", values, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageBetween(Integer value1, Integer value2) {
       addCriterion("VU_MILEAGE between", value1, value2, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageNotBetween(Integer value1, Integer value2) {
       addCriterion("VU_MILEAGE not between", value1, value2, "vuMileage");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptIsNull() {
       addCriterion("VU_DEPT is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptIsNotNull() {
       addCriterion("VU_DEPT is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptEqualTo(String value) {
       addCriterion("VU_DEPT =", value, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptNotEqualTo(String value) {
       addCriterion("VU_DEPT <>", value, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptGreaterThan(String value) {
       addCriterion("VU_DEPT >", value, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptGreaterThanOrEqualTo(String value) {
       addCriterion("VU_DEPT >=", value, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptLessThan(String value) {
       addCriterion("VU_DEPT <", value, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptLessThanOrEqualTo(String value) {
       addCriterion("VU_DEPT <=", value, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptLike(String value) {
       addCriterion("VU_DEPT like", value, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptNotLike(String value) {
       addCriterion("VU_DEPT not like", value, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptIn(List<String> values) {
       addCriterion("VU_DEPT in", values, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptNotIn(List<String> values) {
       addCriterion("VU_DEPT not in", values, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptBetween(String value1, String value2) {
       addCriterion("VU_DEPT between", value1, value2, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDeptNotBetween(String value1, String value2) {
       addCriterion("VU_DEPT not between", value1, value2, "vuDept");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusIsNull() {
       addCriterion("VU_STATUS is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusIsNotNull() {
       addCriterion("VU_STATUS is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusEqualTo(String value) {
       addCriterion("VU_STATUS =", value, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusNotEqualTo(String value) {
       addCriterion("VU_STATUS <>", value, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusGreaterThan(String value) {
       addCriterion("VU_STATUS >", value, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusGreaterThanOrEqualTo(String value) {
       addCriterion("VU_STATUS >=", value, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusLessThan(String value) {
       addCriterion("VU_STATUS <", value, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusLessThanOrEqualTo(String value) {
       addCriterion("VU_STATUS <=", value, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusLike(String value) {
       addCriterion("VU_STATUS like", value, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusNotLike(String value) {
       addCriterion("VU_STATUS not like", value, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusIn(List<String> values) {
       addCriterion("VU_STATUS in", values, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusNotIn(List<String> values) {
       addCriterion("VU_STATUS not in", values, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusBetween(String value1, String value2) {
       addCriterion("VU_STATUS between", value1, value2, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuStatusNotBetween(String value1, String value2) {
       addCriterion("VU_STATUS not between", value1, value2, "vuStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationIsNull() {
       addCriterion("VU_DESTINATION is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationIsNotNull() {
       addCriterion("VU_DESTINATION is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationEqualTo(String value) {
       addCriterion("VU_DESTINATION =", value, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationNotEqualTo(String value) {
       addCriterion("VU_DESTINATION <>", value, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationGreaterThan(String value) {
       addCriterion("VU_DESTINATION >", value, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationGreaterThanOrEqualTo(String value) {
       addCriterion("VU_DESTINATION >=", value, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationLessThan(String value) {
       addCriterion("VU_DESTINATION <", value, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationLessThanOrEqualTo(String value) {
       addCriterion("VU_DESTINATION <=", value, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationLike(String value) {
       addCriterion("VU_DESTINATION like", value, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationNotLike(String value) {
       addCriterion("VU_DESTINATION not like", value, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationIn(List<String> values) {
       addCriterion("VU_DESTINATION in", values, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationNotIn(List<String> values) {
       addCriterion("VU_DESTINATION not in", values, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationBetween(String value1, String value2) {
       addCriterion("VU_DESTINATION between", value1, value2, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDestinationNotBetween(String value1, String value2) {
       addCriterion("VU_DESTINATION not between", value1, value2, "vuDestination");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorIsNull() {
       addCriterion("VU_OPERATOR is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorIsNotNull() {
       addCriterion("VU_OPERATOR is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorEqualTo(String value) {
       addCriterion("VU_OPERATOR =", value, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorNotEqualTo(String value) {
       addCriterion("VU_OPERATOR <>", value, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorGreaterThan(String value) {
       addCriterion("VU_OPERATOR >", value, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorGreaterThanOrEqualTo(String value) {
       addCriterion("VU_OPERATOR >=", value, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorLessThan(String value) {
       addCriterion("VU_OPERATOR <", value, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorLessThanOrEqualTo(String value) {
       addCriterion("VU_OPERATOR <=", value, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorLike(String value) {
       addCriterion("VU_OPERATOR like", value, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorNotLike(String value) {
       addCriterion("VU_OPERATOR not like", value, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorIn(List<String> values) {
       addCriterion("VU_OPERATOR in", values, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorNotIn(List<String> values) {
       addCriterion("VU_OPERATOR not in", values, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorBetween(String value1, String value2) {
       addCriterion("VU_OPERATOR between", value1, value2, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperatorNotBetween(String value1, String value2) {
       addCriterion("VU_OPERATOR not between", value1, value2, "vuOperator");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverIsNull() {
       addCriterion("VU_DRIVER is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverIsNotNull() {
       addCriterion("VU_DRIVER is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverEqualTo(String value) {
       addCriterion("VU_DRIVER =", value, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverNotEqualTo(String value) {
       addCriterion("VU_DRIVER <>", value, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverGreaterThan(String value) {
       addCriterion("VU_DRIVER >", value, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverGreaterThanOrEqualTo(String value) {
       addCriterion("VU_DRIVER >=", value, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverLessThan(String value) {
       addCriterion("VU_DRIVER <", value, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverLessThanOrEqualTo(String value) {
       addCriterion("VU_DRIVER <=", value, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverLike(String value) {
       addCriterion("VU_DRIVER like", value, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverNotLike(String value) {
       addCriterion("VU_DRIVER not like", value, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverIn(List<String> values) {
       addCriterion("VU_DRIVER in", values, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverNotIn(List<String> values) {
       addCriterion("VU_DRIVER not in", values, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverBetween(String value1, String value2) {
       addCriterion("VU_DRIVER between", value1, value2, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuDriverNotBetween(String value1, String value2) {
       addCriterion("VU_DRIVER not between", value1, value2, "vuDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindIsNull() {
       addCriterion("SMS_REMIND is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindIsNotNull() {
       addCriterion("SMS_REMIND is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindEqualTo(String value) {
       addCriterion("SMS_REMIND =", value, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindNotEqualTo(String value) {
       addCriterion("SMS_REMIND <>", value, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindGreaterThan(String value) {
       addCriterion("SMS_REMIND >", value, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindGreaterThanOrEqualTo(String value) {
       addCriterion("SMS_REMIND >=", value, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindLessThan(String value) {
       addCriterion("SMS_REMIND <", value, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindLessThanOrEqualTo(String value) {
       addCriterion("SMS_REMIND <=", value, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindLike(String value) {
       addCriterion("SMS_REMIND like", value, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindNotLike(String value) {
       addCriterion("SMS_REMIND not like", value, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindIn(List<String> values) {
       addCriterion("SMS_REMIND in", values, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindNotIn(List<String> values) {
       addCriterion("SMS_REMIND not in", values, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindBetween(String value1, String value2) {
       addCriterion("SMS_REMIND between", value1, value2, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindNotBetween(String value1, String value2) {
       addCriterion("SMS_REMIND not between", value1, value2, "smsRemind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindIsNull() {
       addCriterion("SMS2_REMIND is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindIsNotNull() {
       addCriterion("SMS2_REMIND is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindEqualTo(String value) {
       addCriterion("SMS2_REMIND =", value, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindNotEqualTo(String value) {
       addCriterion("SMS2_REMIND <>", value, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindGreaterThan(String value) {
       addCriterion("SMS2_REMIND >", value, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindGreaterThanOrEqualTo(String value) {
       addCriterion("SMS2_REMIND >=", value, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindLessThan(String value) {
       addCriterion("SMS2_REMIND <", value, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindLessThanOrEqualTo(String value) {
       addCriterion("SMS2_REMIND <=", value, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindLike(String value) {
       addCriterion("SMS2_REMIND like", value, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindNotLike(String value) {
       addCriterion("SMS2_REMIND not like", value, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindIn(List<String> values) {
       addCriterion("SMS2_REMIND in", values, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindNotIn(List<String> values) {
       addCriterion("SMS2_REMIND not in", values, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindBetween(String value1, String value2) {
       addCriterion("SMS2_REMIND between", value1, value2, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindNotBetween(String value1, String value2) {
       addCriterion("SMS2_REMIND not between", value1, value2, "sms2Remind");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerIsNull() {
       addCriterion("DEPT_MANAGER is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerIsNotNull() {
       addCriterion("DEPT_MANAGER is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerEqualTo(String value) {
       addCriterion("DEPT_MANAGER =", value, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerNotEqualTo(String value) {
       addCriterion("DEPT_MANAGER <>", value, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerGreaterThan(String value) {
       addCriterion("DEPT_MANAGER >", value, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerGreaterThanOrEqualTo(String value) {
       addCriterion("DEPT_MANAGER >=", value, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerLessThan(String value) {
       addCriterion("DEPT_MANAGER <", value, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerLessThanOrEqualTo(String value) {
       addCriterion("DEPT_MANAGER <=", value, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerLike(String value) {
       addCriterion("DEPT_MANAGER like", value, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerNotLike(String value) {
       addCriterion("DEPT_MANAGER not like", value, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerIn(List<String> values) {
       addCriterion("DEPT_MANAGER in", values, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerNotIn(List<String> values) {
       addCriterion("DEPT_MANAGER not in", values, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerBetween(String value1, String value2) {
       addCriterion("DEPT_MANAGER between", value1, value2, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDeptManagerNotBetween(String value1, String value2) {
       addCriterion("DEPT_MANAGER not between", value1, value2, "deptManager");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagIsNull() {
       addCriterion("SHOW_FLAG is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagIsNotNull() {
       addCriterion("SHOW_FLAG is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagEqualTo(String value) {
       addCriterion("SHOW_FLAG =", value, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagNotEqualTo(String value) {
       addCriterion("SHOW_FLAG <>", value, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagGreaterThan(String value) {
       addCriterion("SHOW_FLAG >", value, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagGreaterThanOrEqualTo(String value) {
       addCriterion("SHOW_FLAG >=", value, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagLessThan(String value) {
       addCriterion("SHOW_FLAG <", value, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagLessThanOrEqualTo(String value) {
       addCriterion("SHOW_FLAG <=", value, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagLike(String value) {
       addCriterion("SHOW_FLAG like", value, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagNotLike(String value) {
       addCriterion("SHOW_FLAG not like", value, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagIn(List<String> values) {
       addCriterion("SHOW_FLAG in", values, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagNotIn(List<String> values) {
       addCriterion("SHOW_FLAG not in", values, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagBetween(String value1, String value2) {
       addCriterion("SHOW_FLAG between", value1, value2, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andShowFlagNotBetween(String value1, String value2) {
       addCriterion("SHOW_FLAG not between", value1, value2, "showFlag");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusIsNull() {
       addCriterion("DMER_STATUS is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusIsNotNull() {
       addCriterion("DMER_STATUS is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusEqualTo(String value) {
       addCriterion("DMER_STATUS =", value, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusNotEqualTo(String value) {
       addCriterion("DMER_STATUS <>", value, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusGreaterThan(String value) {
       addCriterion("DMER_STATUS >", value, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusGreaterThanOrEqualTo(String value) {
       addCriterion("DMER_STATUS >=", value, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusLessThan(String value) {
       addCriterion("DMER_STATUS <", value, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusLessThanOrEqualTo(String value) {
       addCriterion("DMER_STATUS <=", value, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusLike(String value) {
       addCriterion("DMER_STATUS like", value, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusNotLike(String value) {
       addCriterion("DMER_STATUS not like", value, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusIn(List<String> values) {
       addCriterion("DMER_STATUS in", values, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusNotIn(List<String> values) {
       addCriterion("DMER_STATUS not in", values, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusBetween(String value1, String value2) {
       addCriterion("DMER_STATUS between", value1, value2, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andDmerStatusNotBetween(String value1, String value2) {
       addCriterion("DMER_STATUS not between", value1, value2, "dmerStatus");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueIsNull() {
       addCriterion("VU_MILEAGE_TRUE is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueIsNotNull() {
       addCriterion("VU_MILEAGE_TRUE is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueEqualTo(Integer value) {
       addCriterion("VU_MILEAGE_TRUE =", value, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueNotEqualTo(Integer value) {
       addCriterion("VU_MILEAGE_TRUE <>", value, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueGreaterThan(Integer value) {
       addCriterion("VU_MILEAGE_TRUE >", value, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueGreaterThanOrEqualTo(Integer value) {
       addCriterion("VU_MILEAGE_TRUE >=", value, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueLessThan(Integer value) {
       addCriterion("VU_MILEAGE_TRUE <", value, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueLessThanOrEqualTo(Integer value) {
       addCriterion("VU_MILEAGE_TRUE <=", value, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueIn(List<Integer> values) {
       addCriterion("VU_MILEAGE_TRUE in", values, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueNotIn(List<Integer> values) {
       addCriterion("VU_MILEAGE_TRUE not in", values, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueBetween(Integer value1, Integer value2) {
       addCriterion("VU_MILEAGE_TRUE between", value1, value2, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuMileageTrueNotBetween(Integer value1, Integer value2) {
       addCriterion("VU_MILEAGE_TRUE not between", value1, value2, "vuMileageTrue");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesIsNull() {
       addCriterion("VU_PARKING_FEES is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesIsNotNull() {
       addCriterion("VU_PARKING_FEES is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesEqualTo(BigDecimal value) {
       addCriterion("VU_PARKING_FEES =", value, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesNotEqualTo(BigDecimal value) {
       addCriterion("VU_PARKING_FEES <>", value, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesGreaterThan(BigDecimal value) {
       addCriterion("VU_PARKING_FEES >", value, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("VU_PARKING_FEES >=", value, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesLessThan(BigDecimal value) {
       addCriterion("VU_PARKING_FEES <", value, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesLessThanOrEqualTo(BigDecimal value) {
       addCriterion("VU_PARKING_FEES <=", value, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesIn(List<BigDecimal> values) {
       addCriterion("VU_PARKING_FEES in", values, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesNotIn(List<BigDecimal> values) {
       addCriterion("VU_PARKING_FEES not in", values, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("VU_PARKING_FEES between", value1, value2, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuParkingFeesNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("VU_PARKING_FEES not between", value1, value2, "vuParkingFees");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverIsNull() {
       addCriterion("SMS_REMIND_DRIVER is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverIsNotNull() {
       addCriterion("SMS_REMIND_DRIVER is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverEqualTo(String value) {
       addCriterion("SMS_REMIND_DRIVER =", value, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverNotEqualTo(String value) {
       addCriterion("SMS_REMIND_DRIVER <>", value, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverGreaterThan(String value) {
       addCriterion("SMS_REMIND_DRIVER >", value, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverGreaterThanOrEqualTo(String value) {
       addCriterion("SMS_REMIND_DRIVER >=", value, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverLessThan(String value) {
       addCriterion("SMS_REMIND_DRIVER <", value, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverLessThanOrEqualTo(String value) {
       addCriterion("SMS_REMIND_DRIVER <=", value, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverLike(String value) {
       addCriterion("SMS_REMIND_DRIVER like", value, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverNotLike(String value) {
       addCriterion("SMS_REMIND_DRIVER not like", value, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverIn(List<String> values) {
       addCriterion("SMS_REMIND_DRIVER in", values, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverNotIn(List<String> values) {
       addCriterion("SMS_REMIND_DRIVER not in", values, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverBetween(String value1, String value2) {
       addCriterion("SMS_REMIND_DRIVER between", value1, value2, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSmsRemindDriverNotBetween(String value1, String value2) {
       addCriterion("SMS_REMIND_DRIVER not between", value1, value2, "smsRemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverIsNull() {
       addCriterion("SMS2_REMIND_DRIVER is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverIsNotNull() {
       addCriterion("SMS2_REMIND_DRIVER is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverEqualTo(String value) {
       addCriterion("SMS2_REMIND_DRIVER =", value, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverNotEqualTo(String value) {
       addCriterion("SMS2_REMIND_DRIVER <>", value, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverGreaterThan(String value) {
       addCriterion("SMS2_REMIND_DRIVER >", value, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverGreaterThanOrEqualTo(String value) {
       addCriterion("SMS2_REMIND_DRIVER >=", value, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverLessThan(String value) {
       addCriterion("SMS2_REMIND_DRIVER <", value, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverLessThanOrEqualTo(String value) {
       addCriterion("SMS2_REMIND_DRIVER <=", value, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverLike(String value) {
       addCriterion("SMS2_REMIND_DRIVER like", value, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverNotLike(String value) {
       addCriterion("SMS2_REMIND_DRIVER not like", value, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverIn(List<String> values) {
       addCriterion("SMS2_REMIND_DRIVER in", values, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverNotIn(List<String> values) {
       addCriterion("SMS2_REMIND_DRIVER not in", values, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverBetween(String value1, String value2) {
       addCriterion("SMS2_REMIND_DRIVER between", value1, value2, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andSms2RemindDriverNotBetween(String value1, String value2) {
       addCriterion("SMS2_REMIND_DRIVER not between", value1, value2, "sms2RemindDriver");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentIsNull() {
       addCriterion("REMIND_CONTENT is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentIsNotNull() {
       addCriterion("REMIND_CONTENT is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentEqualTo(String value) {
       addCriterion("REMIND_CONTENT =", value, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentNotEqualTo(String value) {
       addCriterion("REMIND_CONTENT <>", value, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentGreaterThan(String value) {
       addCriterion("REMIND_CONTENT >", value, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentGreaterThanOrEqualTo(String value) {
       addCriterion("REMIND_CONTENT >=", value, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentLessThan(String value) {
       addCriterion("REMIND_CONTENT <", value, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentLessThanOrEqualTo(String value) {
       addCriterion("REMIND_CONTENT <=", value, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentLike(String value) {
       addCriterion("REMIND_CONTENT like", value, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentNotLike(String value) {
       addCriterion("REMIND_CONTENT not like", value, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentIn(List<String> values) {
       addCriterion("REMIND_CONTENT in", values, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentNotIn(List<String> values) {
       addCriterion("REMIND_CONTENT not in", values, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentBetween(String value1, String value2) {
       addCriterion("REMIND_CONTENT between", value1, value2, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andRemindContentNotBetween(String value1, String value2) {
       addCriterion("REMIND_CONTENT not between", value1, value2, "remindContent");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackIsNull() {
       addCriterion("IS_BACK is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackIsNotNull() {
       addCriterion("IS_BACK is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackEqualTo(Integer value) {
       addCriterion("IS_BACK =", value, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackNotEqualTo(Integer value) {
       addCriterion("IS_BACK <>", value, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackGreaterThan(Integer value) {
       addCriterion("IS_BACK >", value, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackGreaterThanOrEqualTo(Integer value) {
       addCriterion("IS_BACK >=", value, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackLessThan(Integer value) {
       addCriterion("IS_BACK <", value, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackLessThanOrEqualTo(Integer value) {
       addCriterion("IS_BACK <=", value, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackIn(List<Integer> values) {
       addCriterion("IS_BACK in", values, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackNotIn(List<Integer> values) {
       addCriterion("IS_BACK not in", values, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackBetween(Integer value1, Integer value2) {
       addCriterion("IS_BACK between", value1, value2, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andIsBackNotBetween(Integer value1, Integer value2) {
       addCriterion("IS_BACK not between", value1, value2, "isBack");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1IsNull() {
       addCriterion("VU_OPERATOR1 is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1IsNotNull() {
       addCriterion("VU_OPERATOR1 is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1EqualTo(String value) {
       addCriterion("VU_OPERATOR1 =", value, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1NotEqualTo(String value) {
       addCriterion("VU_OPERATOR1 <>", value, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1GreaterThan(String value) {
       addCriterion("VU_OPERATOR1 >", value, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1GreaterThanOrEqualTo(String value) {
       addCriterion("VU_OPERATOR1 >=", value, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1LessThan(String value) {
       addCriterion("VU_OPERATOR1 <", value, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1LessThanOrEqualTo(String value) {
       addCriterion("VU_OPERATOR1 <=", value, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1Like(String value) {
       addCriterion("VU_OPERATOR1 like", value, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1NotLike(String value) {
       addCriterion("VU_OPERATOR1 not like", value, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1In(List<String> values) {
       addCriterion("VU_OPERATOR1 in", values, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1NotIn(List<String> values) {
       addCriterion("VU_OPERATOR1 not in", values, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1Between(String value1, String value2) {
       addCriterion("VU_OPERATOR1 between", value1, value2, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1NotBetween(String value1, String value2) {
       addCriterion("VU_OPERATOR1 not between", value1, value2, "vuOperator1");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeIsNull() {
       addCriterion("VU_OPERATOR1_SMS_TYPE is null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeIsNotNull() {
       addCriterion("VU_OPERATOR1_SMS_TYPE is not null");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeEqualTo(Integer value) {
       addCriterion("VU_OPERATOR1_SMS_TYPE =", value, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeNotEqualTo(Integer value) {
       addCriterion("VU_OPERATOR1_SMS_TYPE <>", value, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeGreaterThan(Integer value) {
       addCriterion("VU_OPERATOR1_SMS_TYPE >", value, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("VU_OPERATOR1_SMS_TYPE >=", value, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeLessThan(Integer value) {
       addCriterion("VU_OPERATOR1_SMS_TYPE <", value, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeLessThanOrEqualTo(Integer value) {
       addCriterion("VU_OPERATOR1_SMS_TYPE <=", value, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeIn(List<Integer> values) {
       addCriterion("VU_OPERATOR1_SMS_TYPE in", values, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeNotIn(List<Integer> values) {
       addCriterion("VU_OPERATOR1_SMS_TYPE not in", values, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeBetween(Integer value1, Integer value2) {
       addCriterion("VU_OPERATOR1_SMS_TYPE between", value1, value2, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
 
     public VehicleUsageExample.Criteria andVuOperator1SmsTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("VU_OPERATOR1_SMS_TYPE not between", value1, value2, "vuOperator1SmsType");
       return (VehicleUsageExample.Criteria)this;
     }
   }
 }
