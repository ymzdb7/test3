 package com.myoa.model.vehicle;
 
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class VehicleMaintenanceExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public VehicleMaintenanceExample()
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
 
   public static class Criteria extends VehicleMaintenanceExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<VehicleMaintenanceExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<VehicleMaintenanceExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<VehicleMaintenanceExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new VehicleMaintenanceExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new VehicleMaintenanceExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new VehicleMaintenanceExample.Criterion(condition, value1, value2));
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
 
     public VehicleMaintenanceExample.Criteria andVmIdIsNull() {
       addCriterion("VM_ID is null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdIsNotNull() {
       addCriterion("VM_ID is not null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdEqualTo(Integer value) {
       addCriterion("VM_ID =", value, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdNotEqualTo(Integer value) {
       addCriterion("VM_ID <>", value, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdGreaterThan(Integer value) {
       addCriterion("VM_ID >", value, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("VM_ID >=", value, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdLessThan(Integer value) {
       addCriterion("VM_ID <", value, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdLessThanOrEqualTo(Integer value) {
       addCriterion("VM_ID <=", value, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdIn(List<Integer> values) {
       addCriterion("VM_ID in", values, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdNotIn(List<Integer> values) {
       addCriterion("VM_ID not in", values, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdBetween(Integer value1, Integer value2) {
       addCriterion("VM_ID between", value1, value2, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmIdNotBetween(Integer value1, Integer value2) {
       addCriterion("VM_ID not between", value1, value2, "vmId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdIsNull() {
       addCriterion("V_ID is null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdIsNotNull() {
       addCriterion("V_ID is not null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdEqualTo(String value) {
       addCriterion("V_ID =", value, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdNotEqualTo(String value) {
       addCriterion("V_ID <>", value, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdGreaterThan(String value) {
       addCriterion("V_ID >", value, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdGreaterThanOrEqualTo(String value) {
       addCriterion("V_ID >=", value, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdLessThan(String value) {
       addCriterion("V_ID <", value, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdLessThanOrEqualTo(String value) {
       addCriterion("V_ID <=", value, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdLike(String value) {
       addCriterion("V_ID like", value, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdNotLike(String value) {
       addCriterion("V_ID not like", value, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdIn(List<String> values) {
       addCriterion("V_ID in", values, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdNotIn(List<String> values) {
       addCriterion("V_ID not in", values, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdBetween(String value1, String value2) {
       addCriterion("V_ID between", value1, value2, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVIdNotBetween(String value1, String value2) {
       addCriterion("V_ID not between", value1, value2, "vId");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateIsNull() {
       addCriterion("VM_REQUEST_DATE is null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateIsNotNull() {
       addCriterion("VM_REQUEST_DATE is not null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("VM_REQUEST_DATE =", value, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("VM_REQUEST_DATE <>", value, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("VM_REQUEST_DATE >", value, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("VM_REQUEST_DATE >=", value, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("VM_REQUEST_DATE <", value, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("VM_REQUEST_DATE <=", value, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("VM_REQUEST_DATE in", values, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("VM_REQUEST_DATE not in", values, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("VM_REQUEST_DATE between", value1, value2, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmRequestDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("VM_REQUEST_DATE not between", value1, value2, "vmRequestDate");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeIsNull() {
       addCriterion("VM_TYPE is null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeIsNotNull() {
       addCriterion("VM_TYPE is not null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeEqualTo(String value) {
       addCriterion("VM_TYPE =", value, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeNotEqualTo(String value) {
       addCriterion("VM_TYPE <>", value, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeGreaterThan(String value) {
       addCriterion("VM_TYPE >", value, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeGreaterThanOrEqualTo(String value) {
       addCriterion("VM_TYPE >=", value, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeLessThan(String value) {
       addCriterion("VM_TYPE <", value, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeLessThanOrEqualTo(String value) {
       addCriterion("VM_TYPE <=", value, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeLike(String value) {
       addCriterion("VM_TYPE like", value, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeNotLike(String value) {
       addCriterion("VM_TYPE not like", value, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeIn(List<String> values) {
       addCriterion("VM_TYPE in", values, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeNotIn(List<String> values) {
       addCriterion("VM_TYPE not in", values, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeBetween(String value1, String value2) {
       addCriterion("VM_TYPE between", value1, value2, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmTypeNotBetween(String value1, String value2) {
       addCriterion("VM_TYPE not between", value1, value2, "vmType");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeIsNull() {
       addCriterion("VM_FEE is null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeIsNotNull() {
       addCriterion("VM_FEE is not null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeEqualTo(BigDecimal value) {
       addCriterion("VM_FEE =", value, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeNotEqualTo(BigDecimal value) {
       addCriterion("VM_FEE <>", value, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeGreaterThan(BigDecimal value) {
       addCriterion("VM_FEE >", value, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("VM_FEE >=", value, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeLessThan(BigDecimal value) {
       addCriterion("VM_FEE <", value, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeLessThanOrEqualTo(BigDecimal value) {
       addCriterion("VM_FEE <=", value, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeIn(List<BigDecimal> values) {
       addCriterion("VM_FEE in", values, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeNotIn(List<BigDecimal> values) {
       addCriterion("VM_FEE not in", values, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("VM_FEE between", value1, value2, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmFeeNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("VM_FEE not between", value1, value2, "vmFee");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonIsNull() {
       addCriterion("VM_PERSON is null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonIsNotNull() {
       addCriterion("VM_PERSON is not null");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonEqualTo(String value) {
       addCriterion("VM_PERSON =", value, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonNotEqualTo(String value) {
       addCriterion("VM_PERSON <>", value, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonGreaterThan(String value) {
       addCriterion("VM_PERSON >", value, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonGreaterThanOrEqualTo(String value) {
       addCriterion("VM_PERSON >=", value, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonLessThan(String value) {
       addCriterion("VM_PERSON <", value, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonLessThanOrEqualTo(String value) {
       addCriterion("VM_PERSON <=", value, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonLike(String value) {
       addCriterion("VM_PERSON like", value, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonNotLike(String value) {
       addCriterion("VM_PERSON not like", value, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonIn(List<String> values) {
       addCriterion("VM_PERSON in", values, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonNotIn(List<String> values) {
       addCriterion("VM_PERSON not in", values, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonBetween(String value1, String value2) {
       addCriterion("VM_PERSON between", value1, value2, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
 
     public VehicleMaintenanceExample.Criteria andVmPersonNotBetween(String value1, String value2) {
       addCriterion("VM_PERSON not between", value1, value2, "vmPerson");
       return (VehicleMaintenanceExample.Criteria)this;
     }
   }
 }

