 package com.myoa.model.vehicle;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class VehicleExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public VehicleExample()
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
 
   public static class Criteria extends VehicleExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<VehicleExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<VehicleExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<VehicleExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new VehicleExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new VehicleExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new VehicleExample.Criterion(condition, value1, value2));
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
 
     public VehicleExample.Criteria andVIdIsNull() {
       addCriterion("V_ID is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdIsNotNull() {
       addCriterion("V_ID is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdEqualTo(Integer value) {
       addCriterion("V_ID =", value, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdNotEqualTo(Integer value) {
       addCriterion("V_ID <>", value, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdGreaterThan(Integer value) {
       addCriterion("V_ID >", value, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("V_ID >=", value, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdLessThan(Integer value) {
       addCriterion("V_ID <", value, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdLessThanOrEqualTo(Integer value) {
       addCriterion("V_ID <=", value, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdIn(List<Integer> values) {
       addCriterion("V_ID in", values, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdNotIn(List<Integer> values) {
       addCriterion("V_ID not in", values, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdBetween(Integer value1, Integer value2) {
       addCriterion("V_ID between", value1, value2, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVIdNotBetween(Integer value1, Integer value2) {
       addCriterion("V_ID not between", value1, value2, "vId");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelIsNull() {
       addCriterion("V_MODEL is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelIsNotNull() {
       addCriterion("V_MODEL is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelEqualTo(String value) {
       addCriterion("V_MODEL =", value, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelNotEqualTo(String value) {
       addCriterion("V_MODEL <>", value, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelGreaterThan(String value) {
       addCriterion("V_MODEL >", value, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelGreaterThanOrEqualTo(String value) {
       addCriterion("V_MODEL >=", value, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelLessThan(String value) {
       addCriterion("V_MODEL <", value, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelLessThanOrEqualTo(String value) {
       addCriterion("V_MODEL <=", value, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelLike(String value) {
       addCriterion("V_MODEL like", value, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelNotLike(String value) {
       addCriterion("V_MODEL not like", value, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelIn(List<String> values) {
       addCriterion("V_MODEL in", values, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelNotIn(List<String> values) {
       addCriterion("V_MODEL not in", values, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelBetween(String value1, String value2) {
       addCriterion("V_MODEL between", value1, value2, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVModelNotBetween(String value1, String value2) {
       addCriterion("V_MODEL not between", value1, value2, "vModel");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumIsNull() {
       addCriterion("V_NUM is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumIsNotNull() {
       addCriterion("V_NUM is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumEqualTo(String value) {
       addCriterion("V_NUM =", value, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumNotEqualTo(String value) {
       addCriterion("V_NUM <>", value, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumGreaterThan(String value) {
       addCriterion("V_NUM >", value, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumGreaterThanOrEqualTo(String value) {
       addCriterion("V_NUM >=", value, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumLessThan(String value) {
       addCriterion("V_NUM <", value, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumLessThanOrEqualTo(String value) {
       addCriterion("V_NUM <=", value, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumLike(String value) {
       addCriterion("V_NUM like", value, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumNotLike(String value) {
       addCriterion("V_NUM not like", value, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumIn(List<String> values) {
       addCriterion("V_NUM in", values, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumNotIn(List<String> values) {
       addCriterion("V_NUM not in", values, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumBetween(String value1, String value2) {
       addCriterion("V_NUM between", value1, value2, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumNotBetween(String value1, String value2) {
       addCriterion("V_NUM not between", value1, value2, "vNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverIsNull() {
       addCriterion("V_DRIVER is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverIsNotNull() {
       addCriterion("V_DRIVER is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverEqualTo(String value) {
       addCriterion("V_DRIVER =", value, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverNotEqualTo(String value) {
       addCriterion("V_DRIVER <>", value, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverGreaterThan(String value) {
       addCriterion("V_DRIVER >", value, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverGreaterThanOrEqualTo(String value) {
       addCriterion("V_DRIVER >=", value, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverLessThan(String value) {
       addCriterion("V_DRIVER <", value, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverLessThanOrEqualTo(String value) {
       addCriterion("V_DRIVER <=", value, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverLike(String value) {
       addCriterion("V_DRIVER like", value, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverNotLike(String value) {
       addCriterion("V_DRIVER not like", value, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverIn(List<String> values) {
       addCriterion("V_DRIVER in", values, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverNotIn(List<String> values) {
       addCriterion("V_DRIVER not in", values, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverBetween(String value1, String value2) {
       addCriterion("V_DRIVER between", value1, value2, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDriverNotBetween(String value1, String value2) {
       addCriterion("V_DRIVER not between", value1, value2, "vDriver");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeIsNull() {
       addCriterion("V_TYPE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeIsNotNull() {
       addCriterion("V_TYPE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeEqualTo(String value) {
       addCriterion("V_TYPE =", value, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeNotEqualTo(String value) {
       addCriterion("V_TYPE <>", value, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeGreaterThan(String value) {
       addCriterion("V_TYPE >", value, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeGreaterThanOrEqualTo(String value) {
       addCriterion("V_TYPE >=", value, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeLessThan(String value) {
       addCriterion("V_TYPE <", value, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeLessThanOrEqualTo(String value) {
       addCriterion("V_TYPE <=", value, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeLike(String value) {
       addCriterion("V_TYPE like", value, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeNotLike(String value) {
       addCriterion("V_TYPE not like", value, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeIn(List<String> values) {
       addCriterion("V_TYPE in", values, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeNotIn(List<String> values) {
       addCriterion("V_TYPE not in", values, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeBetween(String value1, String value2) {
       addCriterion("V_TYPE between", value1, value2, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTypeNotBetween(String value1, String value2) {
       addCriterion("V_TYPE not between", value1, value2, "vType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateIsNull() {
       addCriterion("V_DATE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateIsNotNull() {
       addCriterion("V_DATE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_DATE =", value, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_DATE <>", value, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("V_DATE >", value, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_DATE >=", value, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("V_DATE <", value, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_DATE <=", value, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_DATE in", values, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_DATE not in", values, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_DATE between", value1, value2, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_DATE not between", value1, value2, "vDate");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceIsNull() {
       addCriterion("V_PRICE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceIsNotNull() {
       addCriterion("V_PRICE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceEqualTo(Integer value) {
       addCriterion("V_PRICE =", value, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceNotEqualTo(Integer value) {
       addCriterion("V_PRICE <>", value, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceGreaterThan(Integer value) {
       addCriterion("V_PRICE >", value, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceGreaterThanOrEqualTo(Integer value) {
       addCriterion("V_PRICE >=", value, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceLessThan(Integer value) {
       addCriterion("V_PRICE <", value, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceLessThanOrEqualTo(Integer value) {
       addCriterion("V_PRICE <=", value, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceIn(List<Integer> values) {
       addCriterion("V_PRICE in", values, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceNotIn(List<Integer> values) {
       addCriterion("V_PRICE not in", values, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceBetween(Integer value1, Integer value2) {
       addCriterion("V_PRICE between", value1, value2, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPriceNotBetween(Integer value1, Integer value2) {
       addCriterion("V_PRICE not between", value1, value2, "vPrice");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumIsNull() {
       addCriterion("V_ENGINE_NUM is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumIsNotNull() {
       addCriterion("V_ENGINE_NUM is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumEqualTo(String value) {
       addCriterion("V_ENGINE_NUM =", value, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumNotEqualTo(String value) {
       addCriterion("V_ENGINE_NUM <>", value, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumGreaterThan(String value) {
       addCriterion("V_ENGINE_NUM >", value, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumGreaterThanOrEqualTo(String value) {
       addCriterion("V_ENGINE_NUM >=", value, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumLessThan(String value) {
       addCriterion("V_ENGINE_NUM <", value, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumLessThanOrEqualTo(String value) {
       addCriterion("V_ENGINE_NUM <=", value, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumLike(String value) {
       addCriterion("V_ENGINE_NUM like", value, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumNotLike(String value) {
       addCriterion("V_ENGINE_NUM not like", value, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumIn(List<String> values) {
       addCriterion("V_ENGINE_NUM in", values, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumNotIn(List<String> values) {
       addCriterion("V_ENGINE_NUM not in", values, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumBetween(String value1, String value2) {
       addCriterion("V_ENGINE_NUM between", value1, value2, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVEngineNumNotBetween(String value1, String value2) {
       addCriterion("V_ENGINE_NUM not between", value1, value2, "vEngineNum");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusIsNull() {
       addCriterion("V_STATUS is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusIsNotNull() {
       addCriterion("V_STATUS is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusEqualTo(String value) {
       addCriterion("V_STATUS =", value, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusNotEqualTo(String value) {
       addCriterion("V_STATUS <>", value, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusGreaterThan(String value) {
       addCriterion("V_STATUS >", value, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusGreaterThanOrEqualTo(String value) {
       addCriterion("V_STATUS >=", value, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusLessThan(String value) {
       addCriterion("V_STATUS <", value, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusLessThanOrEqualTo(String value) {
       addCriterion("V_STATUS <=", value, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusLike(String value) {
       addCriterion("V_STATUS like", value, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusNotLike(String value) {
       addCriterion("V_STATUS not like", value, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusIn(List<String> values) {
       addCriterion("V_STATUS in", values, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusNotIn(List<String> values) {
       addCriterion("V_STATUS not in", values, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusBetween(String value1, String value2) {
       addCriterion("V_STATUS between", value1, value2, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVStatusNotBetween(String value1, String value2) {
       addCriterion("V_STATUS not between", value1, value2, "vStatus");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagIsNull() {
       addCriterion("USEING_FLAG is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagIsNotNull() {
       addCriterion("USEING_FLAG is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagEqualTo(String value) {
       addCriterion("USEING_FLAG =", value, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagNotEqualTo(String value) {
       addCriterion("USEING_FLAG <>", value, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagGreaterThan(String value) {
       addCriterion("USEING_FLAG >", value, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagGreaterThanOrEqualTo(String value) {
       addCriterion("USEING_FLAG >=", value, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagLessThan(String value) {
       addCriterion("USEING_FLAG <", value, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagLessThanOrEqualTo(String value) {
       addCriterion("USEING_FLAG <=", value, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagLike(String value) {
       addCriterion("USEING_FLAG like", value, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagNotLike(String value) {
       addCriterion("USEING_FLAG not like", value, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagIn(List<String> values) {
       addCriterion("USEING_FLAG in", values, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagNotIn(List<String> values) {
       addCriterion("USEING_FLAG not in", values, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagBetween(String value1, String value2) {
       addCriterion("USEING_FLAG between", value1, value2, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andUseingFlagNotBetween(String value1, String value2) {
       addCriterion("USEING_FLAG not between", value1, value2, "useingFlag");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserIsNull() {
       addCriterion("CAR_USER is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserIsNotNull() {
       addCriterion("CAR_USER is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserEqualTo(String value) {
       addCriterion("CAR_USER =", value, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserNotEqualTo(String value) {
       addCriterion("CAR_USER <>", value, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserGreaterThan(String value) {
       addCriterion("CAR_USER >", value, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserGreaterThanOrEqualTo(String value) {
       addCriterion("CAR_USER >=", value, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserLessThan(String value) {
       addCriterion("CAR_USER <", value, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserLessThanOrEqualTo(String value) {
       addCriterion("CAR_USER <=", value, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserLike(String value) {
       addCriterion("CAR_USER like", value, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserNotLike(String value) {
       addCriterion("CAR_USER not like", value, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserIn(List<String> values) {
       addCriterion("CAR_USER in", values, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserNotIn(List<String> values) {
       addCriterion("CAR_USER not in", values, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserBetween(String value1, String value2) {
       addCriterion("CAR_USER between", value1, value2, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andCarUserNotBetween(String value1, String value2) {
       addCriterion("CAR_USER not between", value1, value2, "carUser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoIsNull() {
       addCriterion("V_PHONE_NO is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoIsNotNull() {
       addCriterion("V_PHONE_NO is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoEqualTo(String value) {
       addCriterion("V_PHONE_NO =", value, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoNotEqualTo(String value) {
       addCriterion("V_PHONE_NO <>", value, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoGreaterThan(String value) {
       addCriterion("V_PHONE_NO >", value, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoGreaterThanOrEqualTo(String value) {
       addCriterion("V_PHONE_NO >=", value, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoLessThan(String value) {
       addCriterion("V_PHONE_NO <", value, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoLessThanOrEqualTo(String value) {
       addCriterion("V_PHONE_NO <=", value, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoLike(String value) {
       addCriterion("V_PHONE_NO like", value, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoNotLike(String value) {
       addCriterion("V_PHONE_NO not like", value, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoIn(List<String> values) {
       addCriterion("V_PHONE_NO in", values, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoNotIn(List<String> values) {
       addCriterion("V_PHONE_NO not in", values, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoBetween(String value1, String value2) {
       addCriterion("V_PHONE_NO between", value1, value2, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPhoneNoNotBetween(String value1, String value2) {
       addCriterion("V_PHONE_NO not between", value1, value2, "vPhoneNo");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageIsNull() {
       addCriterion("V_MANAGE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageIsNotNull() {
       addCriterion("V_MANAGE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageEqualTo(String value) {
       addCriterion("V_MANAGE =", value, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageNotEqualTo(String value) {
       addCriterion("V_MANAGE <>", value, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageGreaterThan(String value) {
       addCriterion("V_MANAGE >", value, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageGreaterThanOrEqualTo(String value) {
       addCriterion("V_MANAGE >=", value, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageLessThan(String value) {
       addCriterion("V_MANAGE <", value, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageLessThanOrEqualTo(String value) {
       addCriterion("V_MANAGE <=", value, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageLike(String value) {
       addCriterion("V_MANAGE like", value, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageNotLike(String value) {
       addCriterion("V_MANAGE not like", value, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageIn(List<String> values) {
       addCriterion("V_MANAGE in", values, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageNotIn(List<String> values) {
       addCriterion("V_MANAGE not in", values, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageBetween(String value1, String value2) {
       addCriterion("V_MANAGE between", value1, value2, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVManageNotBetween(String value1, String value2) {
       addCriterion("V_MANAGE not between", value1, value2, "vManage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotIsNull() {
       addCriterion("V_MOT is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotIsNotNull() {
       addCriterion("V_MOT is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT =", value, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT <>", value, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT >", value, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT >=", value, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotLessThan(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT <", value, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT <=", value, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_MOT in", values, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_MOT not in", values, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_MOT between", value1, value2, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_MOT not between", value1, value2, "vMot");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureIsNull() {
       addCriterion("V_INSURE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureIsNotNull() {
       addCriterion("V_INSURE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE =", value, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE <>", value, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE >", value, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE >=", value, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureLessThan(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE <", value, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE <=", value, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_INSURE in", values, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_INSURE not in", values, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_INSURE between", value1, value2, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_INSURE not between", value1, value2, "vInsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsIsNull() {
       addCriterion("V_MOT_SMS is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsIsNotNull() {
       addCriterion("V_MOT_SMS is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT_SMS =", value, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT_SMS <>", value, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT_SMS >", value, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT_SMS >=", value, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsLessThan(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT_SMS <", value, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_MOT_SMS <=", value, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_MOT_SMS in", values, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_MOT_SMS not in", values, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_MOT_SMS between", value1, value2, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_MOT_SMS not between", value1, value2, "vMotSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsIsNull() {
       addCriterion("V_INSURE_SMS is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsIsNotNull() {
       addCriterion("V_INSURE_SMS is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE_SMS =", value, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE_SMS <>", value, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE_SMS >", value, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE_SMS >=", value, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsLessThan(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE_SMS <", value, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_INSURE_SMS <=", value, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_INSURE_SMS in", values, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_INSURE_SMS not in", values, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_INSURE_SMS between", value1, value2, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_INSURE_SMS not between", value1, value2, "vInsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeIsNull() {
       addCriterion("V_MOT_SMS_TYPE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeIsNotNull() {
       addCriterion("V_MOT_SMS_TYPE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeEqualTo(Integer value) {
       addCriterion("V_MOT_SMS_TYPE =", value, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeNotEqualTo(Integer value) {
       addCriterion("V_MOT_SMS_TYPE <>", value, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeGreaterThan(Integer value) {
       addCriterion("V_MOT_SMS_TYPE >", value, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("V_MOT_SMS_TYPE >=", value, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeLessThan(Integer value) {
       addCriterion("V_MOT_SMS_TYPE <", value, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeLessThanOrEqualTo(Integer value) {
       addCriterion("V_MOT_SMS_TYPE <=", value, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeIn(List<Integer> values) {
       addCriterion("V_MOT_SMS_TYPE in", values, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeNotIn(List<Integer> values) {
       addCriterion("V_MOT_SMS_TYPE not in", values, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeBetween(Integer value1, Integer value2) {
       addCriterion("V_MOT_SMS_TYPE between", value1, value2, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMotSmsTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("V_MOT_SMS_TYPE not between", value1, value2, "vMotSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeIsNull() {
       addCriterion("V_INSURE_SMS_TYPE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeIsNotNull() {
       addCriterion("V_INSURE_SMS_TYPE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeEqualTo(Integer value) {
       addCriterion("V_INSURE_SMS_TYPE =", value, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeNotEqualTo(Integer value) {
       addCriterion("V_INSURE_SMS_TYPE <>", value, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeGreaterThan(Integer value) {
       addCriterion("V_INSURE_SMS_TYPE >", value, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("V_INSURE_SMS_TYPE >=", value, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeLessThan(Integer value) {
       addCriterion("V_INSURE_SMS_TYPE <", value, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeLessThanOrEqualTo(Integer value) {
       addCriterion("V_INSURE_SMS_TYPE <=", value, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeIn(List<Integer> values) {
       addCriterion("V_INSURE_SMS_TYPE in", values, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeNotIn(List<Integer> values) {
       addCriterion("V_INSURE_SMS_TYPE not in", values, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeBetween(Integer value1, Integer value2) {
       addCriterion("V_INSURE_SMS_TYPE between", value1, value2, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVInsureSmsTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("V_INSURE_SMS_TYPE not between", value1, value2, "vInsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementIsNull() {
       addCriterion("V_DISPLACEMENT is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementIsNotNull() {
       addCriterion("V_DISPLACEMENT is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementEqualTo(String value) {
       addCriterion("V_DISPLACEMENT =", value, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementNotEqualTo(String value) {
       addCriterion("V_DISPLACEMENT <>", value, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementGreaterThan(String value) {
       addCriterion("V_DISPLACEMENT >", value, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementGreaterThanOrEqualTo(String value) {
       addCriterion("V_DISPLACEMENT >=", value, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementLessThan(String value) {
       addCriterion("V_DISPLACEMENT <", value, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementLessThanOrEqualTo(String value) {
       addCriterion("V_DISPLACEMENT <=", value, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementLike(String value) {
       addCriterion("V_DISPLACEMENT like", value, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementNotLike(String value) {
       addCriterion("V_DISPLACEMENT not like", value, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementIn(List<String> values) {
       addCriterion("V_DISPLACEMENT in", values, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementNotIn(List<String> values) {
       addCriterion("V_DISPLACEMENT not in", values, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementBetween(String value1, String value2) {
       addCriterion("V_DISPLACEMENT between", value1, value2, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDisplacementNotBetween(String value1, String value2) {
       addCriterion("V_DISPLACEMENT not between", value1, value2, "vDisplacement");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorIsNull() {
       addCriterion("V_COLOR is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorIsNotNull() {
       addCriterion("V_COLOR is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorEqualTo(String value) {
       addCriterion("V_COLOR =", value, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorNotEqualTo(String value) {
       addCriterion("V_COLOR <>", value, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorGreaterThan(String value) {
       addCriterion("V_COLOR >", value, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorGreaterThanOrEqualTo(String value) {
       addCriterion("V_COLOR >=", value, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorLessThan(String value) {
       addCriterion("V_COLOR <", value, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorLessThanOrEqualTo(String value) {
       addCriterion("V_COLOR <=", value, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorLike(String value) {
       addCriterion("V_COLOR like", value, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorNotLike(String value) {
       addCriterion("V_COLOR not like", value, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorIn(List<String> values) {
       addCriterion("V_COLOR in", values, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorNotIn(List<String> values) {
       addCriterion("V_COLOR not in", values, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorBetween(String value1, String value2) {
       addCriterion("V_COLOR between", value1, value2, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVColorNotBetween(String value1, String value2) {
       addCriterion("V_COLOR not between", value1, value2, "vColor");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingIsNull() {
       addCriterion("V_SEATING is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingIsNotNull() {
       addCriterion("V_SEATING is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingEqualTo(String value) {
       addCriterion("V_SEATING =", value, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingNotEqualTo(String value) {
       addCriterion("V_SEATING <>", value, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingGreaterThan(String value) {
       addCriterion("V_SEATING >", value, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingGreaterThanOrEqualTo(String value) {
       addCriterion("V_SEATING >=", value, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingLessThan(String value) {
       addCriterion("V_SEATING <", value, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingLessThanOrEqualTo(String value) {
       addCriterion("V_SEATING <=", value, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingLike(String value) {
       addCriterion("V_SEATING like", value, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingNotLike(String value) {
       addCriterion("V_SEATING not like", value, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingIn(List<String> values) {
       addCriterion("V_SEATING in", values, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingNotIn(List<String> values) {
       addCriterion("V_SEATING not in", values, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingBetween(String value1, String value2) {
       addCriterion("V_SEATING between", value1, value2, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVSeatingNotBetween(String value1, String value2) {
       addCriterion("V_SEATING not between", value1, value2, "vSeating");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameIsNull() {
       addCriterion("V_FRAME is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameIsNotNull() {
       addCriterion("V_FRAME is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameEqualTo(String value) {
       addCriterion("V_FRAME =", value, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameNotEqualTo(String value) {
       addCriterion("V_FRAME <>", value, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameGreaterThan(String value) {
       addCriterion("V_FRAME >", value, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameGreaterThanOrEqualTo(String value) {
       addCriterion("V_FRAME >=", value, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameLessThan(String value) {
       addCriterion("V_FRAME <", value, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameLessThanOrEqualTo(String value) {
       addCriterion("V_FRAME <=", value, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameLike(String value) {
       addCriterion("V_FRAME like", value, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameNotLike(String value) {
       addCriterion("V_FRAME not like", value, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameIn(List<String> values) {
       addCriterion("V_FRAME in", values, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameNotIn(List<String> values) {
       addCriterion("V_FRAME not in", values, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameBetween(String value1, String value2) {
       addCriterion("V_FRAME between", value1, value2, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVFrameNotBetween(String value1, String value2) {
       addCriterion("V_FRAME not between", value1, value2, "vFrame");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationIsNull() {
       addCriterion("V_CERTIFICATION is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationIsNotNull() {
       addCriterion("V_CERTIFICATION is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationEqualTo(String value) {
       addCriterion("V_CERTIFICATION =", value, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationNotEqualTo(String value) {
       addCriterion("V_CERTIFICATION <>", value, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationGreaterThan(String value) {
       addCriterion("V_CERTIFICATION >", value, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationGreaterThanOrEqualTo(String value) {
       addCriterion("V_CERTIFICATION >=", value, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationLessThan(String value) {
       addCriterion("V_CERTIFICATION <", value, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationLessThanOrEqualTo(String value) {
       addCriterion("V_CERTIFICATION <=", value, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationLike(String value) {
       addCriterion("V_CERTIFICATION like", value, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationNotLike(String value) {
       addCriterion("V_CERTIFICATION not like", value, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationIn(List<String> values) {
       addCriterion("V_CERTIFICATION in", values, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationNotIn(List<String> values) {
       addCriterion("V_CERTIFICATION not in", values, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationBetween(String value1, String value2) {
       addCriterion("V_CERTIFICATION between", value1, value2, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCertificationNotBetween(String value1, String value2) {
       addCriterion("V_CERTIFICATION not between", value1, value2, "vCertification");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartIsNull() {
       addCriterion("V_DEPART is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartIsNotNull() {
       addCriterion("V_DEPART is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartEqualTo(String value) {
       addCriterion("V_DEPART =", value, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartNotEqualTo(String value) {
       addCriterion("V_DEPART <>", value, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartGreaterThan(String value) {
       addCriterion("V_DEPART >", value, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartGreaterThanOrEqualTo(String value) {
       addCriterion("V_DEPART >=", value, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartLessThan(String value) {
       addCriterion("V_DEPART <", value, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartLessThanOrEqualTo(String value) {
       addCriterion("V_DEPART <=", value, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartLike(String value) {
       addCriterion("V_DEPART like", value, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartNotLike(String value) {
       addCriterion("V_DEPART not like", value, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartIn(List<String> values) {
       addCriterion("V_DEPART in", values, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartNotIn(List<String> values) {
       addCriterion("V_DEPART not in", values, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartBetween(String value1, String value2) {
       addCriterion("V_DEPART between", value1, value2, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartNotBetween(String value1, String value2) {
       addCriterion("V_DEPART not between", value1, value2, "vDepart");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerIsNull() {
       addCriterion("V_ONWER is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerIsNotNull() {
       addCriterion("V_ONWER is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerEqualTo(String value) {
       addCriterion("V_ONWER =", value, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerNotEqualTo(String value) {
       addCriterion("V_ONWER <>", value, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerGreaterThan(String value) {
       addCriterion("V_ONWER >", value, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerGreaterThanOrEqualTo(String value) {
       addCriterion("V_ONWER >=", value, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerLessThan(String value) {
       addCriterion("V_ONWER <", value, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerLessThanOrEqualTo(String value) {
       addCriterion("V_ONWER <=", value, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerLike(String value) {
       addCriterion("V_ONWER like", value, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerNotLike(String value) {
       addCriterion("V_ONWER not like", value, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerIn(List<String> values) {
       addCriterion("V_ONWER in", values, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerNotIn(List<String> values) {
       addCriterion("V_ONWER not in", values, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerBetween(String value1, String value2) {
       addCriterion("V_ONWER between", value1, value2, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerNotBetween(String value1, String value2) {
       addCriterion("V_ONWER not between", value1, value2, "vOnwer");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserIsNull() {
       addCriterion("V_CARUSER is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserIsNotNull() {
       addCriterion("V_CARUSER is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserEqualTo(String value) {
       addCriterion("V_CARUSER =", value, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserNotEqualTo(String value) {
       addCriterion("V_CARUSER <>", value, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserGreaterThan(String value) {
       addCriterion("V_CARUSER >", value, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserGreaterThanOrEqualTo(String value) {
       addCriterion("V_CARUSER >=", value, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserLessThan(String value) {
       addCriterion("V_CARUSER <", value, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserLessThanOrEqualTo(String value) {
       addCriterion("V_CARUSER <=", value, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserLike(String value) {
       addCriterion("V_CARUSER like", value, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserNotLike(String value) {
       addCriterion("V_CARUSER not like", value, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserIn(List<String> values) {
       addCriterion("V_CARUSER in", values, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserNotIn(List<String> values) {
       addCriterion("V_CARUSER not in", values, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserBetween(String value1, String value2) {
       addCriterion("V_CARUSER between", value1, value2, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserNotBetween(String value1, String value2) {
       addCriterion("V_CARUSER not between", value1, value2, "vCaruser");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxIsNull() {
       addCriterion("V_TAX is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxIsNotNull() {
       addCriterion("V_TAX is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxEqualTo(Integer value) {
       addCriterion("V_TAX =", value, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxNotEqualTo(Integer value) {
       addCriterion("V_TAX <>", value, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxGreaterThan(Integer value) {
       addCriterion("V_TAX >", value, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxGreaterThanOrEqualTo(Integer value) {
       addCriterion("V_TAX >=", value, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxLessThan(Integer value) {
       addCriterion("V_TAX <", value, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxLessThanOrEqualTo(Integer value) {
       addCriterion("V_TAX <=", value, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxIn(List<Integer> values) {
       addCriterion("V_TAX in", values, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxNotIn(List<Integer> values) {
       addCriterion("V_TAX not in", values, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxBetween(Integer value1, Integer value2) {
       addCriterion("V_TAX between", value1, value2, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVTaxNotBetween(Integer value1, Integer value2) {
       addCriterion("V_TAX not between", value1, value2, "vTax");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureIsNull() {
       addCriterion("V_BINSURE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureIsNotNull() {
       addCriterion("V_BINSURE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE =", value, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE <>", value, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE >", value, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE >=", value, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureLessThan(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE <", value, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE <=", value, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_BINSURE in", values, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_BINSURE not in", values, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_BINSURE between", value1, value2, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_BINSURE not between", value1, value2, "vBinsure");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsIsNull() {
       addCriterion("V_BINSURE_SMS is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsIsNotNull() {
       addCriterion("V_BINSURE_SMS is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE_SMS =", value, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE_SMS <>", value, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE_SMS >", value, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE_SMS >=", value, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsLessThan(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE_SMS <", value, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("V_BINSURE_SMS <=", value, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_BINSURE_SMS in", values, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("V_BINSURE_SMS not in", values, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_BINSURE_SMS between", value1, value2, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("V_BINSURE_SMS not between", value1, value2, "vBinsureSms");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureIsNull() {
       addCriterion("V_NATURE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureIsNotNull() {
       addCriterion("V_NATURE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureEqualTo(String value) {
       addCriterion("V_NATURE =", value, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureNotEqualTo(String value) {
       addCriterion("V_NATURE <>", value, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureGreaterThan(String value) {
       addCriterion("V_NATURE >", value, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureGreaterThanOrEqualTo(String value) {
       addCriterion("V_NATURE >=", value, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureLessThan(String value) {
       addCriterion("V_NATURE <", value, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureLessThanOrEqualTo(String value) {
       addCriterion("V_NATURE <=", value, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureLike(String value) {
       addCriterion("V_NATURE like", value, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureNotLike(String value) {
       addCriterion("V_NATURE not like", value, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureIn(List<String> values) {
       addCriterion("V_NATURE in", values, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureNotIn(List<String> values) {
       addCriterion("V_NATURE not in", values, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureBetween(String value1, String value2) {
       addCriterion("V_NATURE between", value1, value2, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNatureNotBetween(String value1, String value2) {
       addCriterion("V_NATURE not between", value1, value2, "vNature");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayIsNull() {
       addCriterion("V_PAY is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayIsNotNull() {
       addCriterion("V_PAY is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayEqualTo(String value) {
       addCriterion("V_PAY =", value, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayNotEqualTo(String value) {
       addCriterion("V_PAY <>", value, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayGreaterThan(String value) {
       addCriterion("V_PAY >", value, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayGreaterThanOrEqualTo(String value) {
       addCriterion("V_PAY >=", value, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayLessThan(String value) {
       addCriterion("V_PAY <", value, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayLessThanOrEqualTo(String value) {
       addCriterion("V_PAY <=", value, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayLike(String value) {
       addCriterion("V_PAY like", value, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayNotLike(String value) {
       addCriterion("V_PAY not like", value, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayIn(List<String> values) {
       addCriterion("V_PAY in", values, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayNotIn(List<String> values) {
       addCriterion("V_PAY not in", values, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayBetween(String value1, String value2) {
       addCriterion("V_PAY between", value1, value2, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVPayNotBetween(String value1, String value2) {
       addCriterion("V_PAY not between", value1, value2, "vPay");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageIsNull() {
       addCriterion("V_MILEAGE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageIsNotNull() {
       addCriterion("V_MILEAGE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageEqualTo(String value) {
       addCriterion("V_MILEAGE =", value, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageNotEqualTo(String value) {
       addCriterion("V_MILEAGE <>", value, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageGreaterThan(String value) {
       addCriterion("V_MILEAGE >", value, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageGreaterThanOrEqualTo(String value) {
       addCriterion("V_MILEAGE >=", value, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageLessThan(String value) {
       addCriterion("V_MILEAGE <", value, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageLessThanOrEqualTo(String value) {
       addCriterion("V_MILEAGE <=", value, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageLike(String value) {
       addCriterion("V_MILEAGE like", value, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageNotLike(String value) {
       addCriterion("V_MILEAGE not like", value, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageIn(List<String> values) {
       addCriterion("V_MILEAGE in", values, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageNotIn(List<String> values) {
       addCriterion("V_MILEAGE not in", values, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageBetween(String value1, String value2) {
       addCriterion("V_MILEAGE between", value1, value2, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVMileageNotBetween(String value1, String value2) {
       addCriterion("V_MILEAGE not between", value1, value2, "vMileage");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneIsNull() {
       addCriterion("V_DEPART_PHONE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneIsNotNull() {
       addCriterion("V_DEPART_PHONE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneEqualTo(String value) {
       addCriterion("V_DEPART_PHONE =", value, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneNotEqualTo(String value) {
       addCriterion("V_DEPART_PHONE <>", value, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneGreaterThan(String value) {
       addCriterion("V_DEPART_PHONE >", value, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneGreaterThanOrEqualTo(String value) {
       addCriterion("V_DEPART_PHONE >=", value, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneLessThan(String value) {
       addCriterion("V_DEPART_PHONE <", value, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneLessThanOrEqualTo(String value) {
       addCriterion("V_DEPART_PHONE <=", value, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneLike(String value) {
       addCriterion("V_DEPART_PHONE like", value, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneNotLike(String value) {
       addCriterion("V_DEPART_PHONE not like", value, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneIn(List<String> values) {
       addCriterion("V_DEPART_PHONE in", values, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneNotIn(List<String> values) {
       addCriterion("V_DEPART_PHONE not in", values, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneBetween(String value1, String value2) {
       addCriterion("V_DEPART_PHONE between", value1, value2, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVDepartPhoneNotBetween(String value1, String value2) {
       addCriterion("V_DEPART_PHONE not between", value1, value2, "vDepartPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneIsNull() {
       addCriterion("V_ONWER_PHONE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneIsNotNull() {
       addCriterion("V_ONWER_PHONE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneEqualTo(String value) {
       addCriterion("V_ONWER_PHONE =", value, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneNotEqualTo(String value) {
       addCriterion("V_ONWER_PHONE <>", value, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneGreaterThan(String value) {
       addCriterion("V_ONWER_PHONE >", value, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneGreaterThanOrEqualTo(String value) {
       addCriterion("V_ONWER_PHONE >=", value, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneLessThan(String value) {
       addCriterion("V_ONWER_PHONE <", value, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneLessThanOrEqualTo(String value) {
       addCriterion("V_ONWER_PHONE <=", value, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneLike(String value) {
       addCriterion("V_ONWER_PHONE like", value, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneNotLike(String value) {
       addCriterion("V_ONWER_PHONE not like", value, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneIn(List<String> values) {
       addCriterion("V_ONWER_PHONE in", values, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneNotIn(List<String> values) {
       addCriterion("V_ONWER_PHONE not in", values, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneBetween(String value1, String value2) {
       addCriterion("V_ONWER_PHONE between", value1, value2, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOnwerPhoneNotBetween(String value1, String value2) {
       addCriterion("V_ONWER_PHONE not between", value1, value2, "vOnwerPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneIsNull() {
       addCriterion("V_CARUSER_PHONE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneIsNotNull() {
       addCriterion("V_CARUSER_PHONE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneEqualTo(String value) {
       addCriterion("V_CARUSER_PHONE =", value, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneNotEqualTo(String value) {
       addCriterion("V_CARUSER_PHONE <>", value, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneGreaterThan(String value) {
       addCriterion("V_CARUSER_PHONE >", value, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneGreaterThanOrEqualTo(String value) {
       addCriterion("V_CARUSER_PHONE >=", value, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneLessThan(String value) {
       addCriterion("V_CARUSER_PHONE <", value, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneLessThanOrEqualTo(String value) {
       addCriterion("V_CARUSER_PHONE <=", value, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneLike(String value) {
       addCriterion("V_CARUSER_PHONE like", value, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneNotLike(String value) {
       addCriterion("V_CARUSER_PHONE not like", value, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneIn(List<String> values) {
       addCriterion("V_CARUSER_PHONE in", values, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneNotIn(List<String> values) {
       addCriterion("V_CARUSER_PHONE not in", values, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneBetween(String value1, String value2) {
       addCriterion("V_CARUSER_PHONE between", value1, value2, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVCaruserPhoneNotBetween(String value1, String value2) {
       addCriterion("V_CARUSER_PHONE not between", value1, value2, "vCaruserPhone");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeIsNull() {
       addCriterion("V_BINSURE_SMS_TYPE is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeIsNotNull() {
       addCriterion("V_BINSURE_SMS_TYPE is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeEqualTo(Integer value) {
       addCriterion("V_BINSURE_SMS_TYPE =", value, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeNotEqualTo(Integer value) {
       addCriterion("V_BINSURE_SMS_TYPE <>", value, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeGreaterThan(Integer value) {
       addCriterion("V_BINSURE_SMS_TYPE >", value, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("V_BINSURE_SMS_TYPE >=", value, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeLessThan(Integer value) {
       addCriterion("V_BINSURE_SMS_TYPE <", value, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeLessThanOrEqualTo(Integer value) {
       addCriterion("V_BINSURE_SMS_TYPE <=", value, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeIn(List<Integer> values) {
       addCriterion("V_BINSURE_SMS_TYPE in", values, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeNotIn(List<Integer> values) {
       addCriterion("V_BINSURE_SMS_TYPE not in", values, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeBetween(Integer value1, Integer value2) {
       addCriterion("V_BINSURE_SMS_TYPE between", value1, value2, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVBinsureSmsTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("V_BINSURE_SMS_TYPE not between", value1, value2, "vBinsureSmsType");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersIsNull() {
       addCriterion("V_NUMBERS is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersIsNotNull() {
       addCriterion("V_NUMBERS is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersEqualTo(String value) {
       addCriterion("V_NUMBERS =", value, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersNotEqualTo(String value) {
       addCriterion("V_NUMBERS <>", value, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersGreaterThan(String value) {
       addCriterion("V_NUMBERS >", value, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersGreaterThanOrEqualTo(String value) {
       addCriterion("V_NUMBERS >=", value, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersLessThan(String value) {
       addCriterion("V_NUMBERS <", value, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersLessThanOrEqualTo(String value) {
       addCriterion("V_NUMBERS <=", value, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersLike(String value) {
       addCriterion("V_NUMBERS like", value, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersNotLike(String value) {
       addCriterion("V_NUMBERS not like", value, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersIn(List<String> values) {
       addCriterion("V_NUMBERS in", values, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersNotIn(List<String> values) {
       addCriterion("V_NUMBERS not in", values, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersBetween(String value1, String value2) {
       addCriterion("V_NUMBERS between", value1, value2, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVNumbersNotBetween(String value1, String value2) {
       addCriterion("V_NUMBERS not between", value1, value2, "vNumbers");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilIsNull() {
       addCriterion("V_OIL is null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilIsNotNull() {
       addCriterion("V_OIL is not null");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilEqualTo(String value) {
       addCriterion("V_OIL =", value, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilNotEqualTo(String value) {
       addCriterion("V_OIL <>", value, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilGreaterThan(String value) {
       addCriterion("V_OIL >", value, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilGreaterThanOrEqualTo(String value) {
       addCriterion("V_OIL >=", value, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilLessThan(String value) {
       addCriterion("V_OIL <", value, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilLessThanOrEqualTo(String value) {
       addCriterion("V_OIL <=", value, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilLike(String value) {
       addCriterion("V_OIL like", value, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilNotLike(String value) {
       addCriterion("V_OIL not like", value, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilIn(List<String> values) {
       addCriterion("V_OIL in", values, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilNotIn(List<String> values) {
       addCriterion("V_OIL not in", values, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilBetween(String value1, String value2) {
       addCriterion("V_OIL between", value1, value2, "vOil");
       return (VehicleExample.Criteria)this;
     }
 
     public VehicleExample.Criteria andVOilNotBetween(String value1, String value2) {
       addCriterion("V_OIL not between", value1, value2, "vOil");
       return (VehicleExample.Criteria)this;
     }
   }
 }

