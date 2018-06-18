 package com.myoa.model.vehicle;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class VehicleOilCardExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public VehicleOilCardExample()
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
 
   public static class Criteria extends VehicleOilCardExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<VehicleOilCardExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<VehicleOilCardExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<VehicleOilCardExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new VehicleOilCardExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new VehicleOilCardExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new VehicleOilCardExample.Criterion(condition, value1, value2));
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
 
     public VehicleOilCardExample.Criteria andIdIsNull() {
       addCriterion("ID is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdIsNotNull() {
       addCriterion("ID is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("ID =", value, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("ID <>", value, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("ID >", value, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ID >=", value, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdLessThan(Integer value) {
       addCriterion("ID <", value, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("ID <=", value, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("ID in", values, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("ID not in", values, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("ID between", value1, value2, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ID not between", value1, value2, "id");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdIsNull() {
       addCriterion("OC_ID is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdIsNotNull() {
       addCriterion("OC_ID is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdEqualTo(String value) {
       addCriterion("OC_ID =", value, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdNotEqualTo(String value) {
       addCriterion("OC_ID <>", value, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdGreaterThan(String value) {
       addCriterion("OC_ID >", value, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdGreaterThanOrEqualTo(String value) {
       addCriterion("OC_ID >=", value, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdLessThan(String value) {
       addCriterion("OC_ID <", value, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdLessThanOrEqualTo(String value) {
       addCriterion("OC_ID <=", value, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdLike(String value) {
       addCriterion("OC_ID like", value, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdNotLike(String value) {
       addCriterion("OC_ID not like", value, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdIn(List<String> values) {
       addCriterion("OC_ID in", values, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdNotIn(List<String> values) {
       addCriterion("OC_ID not in", values, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdBetween(String value1, String value2) {
       addCriterion("OC_ID between", value1, value2, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcIdNotBetween(String value1, String value2) {
       addCriterion("OC_ID not between", value1, value2, "ocId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateIsNull() {
       addCriterion("OC_DATE is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateIsNotNull() {
       addCriterion("OC_DATE is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("OC_DATE =", value, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("OC_DATE <>", value, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("OC_DATE >", value, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("OC_DATE >=", value, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("OC_DATE <", value, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("OC_DATE <=", value, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("OC_DATE in", values, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("OC_DATE not in", values, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("OC_DATE between", value1, value2, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("OC_DATE not between", value1, value2, "ocDate");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledIsNull() {
       addCriterion("RECORDER_HANDLED is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledIsNotNull() {
       addCriterion("RECORDER_HANDLED is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledEqualTo(String value) {
       addCriterion("RECORDER_HANDLED =", value, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledNotEqualTo(String value) {
       addCriterion("RECORDER_HANDLED <>", value, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledGreaterThan(String value) {
       addCriterion("RECORDER_HANDLED >", value, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledGreaterThanOrEqualTo(String value) {
       addCriterion("RECORDER_HANDLED >=", value, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledLessThan(String value) {
       addCriterion("RECORDER_HANDLED <", value, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledLessThanOrEqualTo(String value) {
       addCriterion("RECORDER_HANDLED <=", value, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledLike(String value) {
       addCriterion("RECORDER_HANDLED like", value, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledNotLike(String value) {
       addCriterion("RECORDER_HANDLED not like", value, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledIn(List<String> values) {
       addCriterion("RECORDER_HANDLED in", values, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledNotIn(List<String> values) {
       addCriterion("RECORDER_HANDLED not in", values, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledBetween(String value1, String value2) {
       addCriterion("RECORDER_HANDLED between", value1, value2, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andRecorderHandledNotBetween(String value1, String value2) {
       addCriterion("RECORDER_HANDLED not between", value1, value2, "recorderHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledIsNull() {
       addCriterion("OC_HANDLED is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledIsNotNull() {
       addCriterion("OC_HANDLED is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledEqualTo(String value) {
       addCriterion("OC_HANDLED =", value, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledNotEqualTo(String value) {
       addCriterion("OC_HANDLED <>", value, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledGreaterThan(String value) {
       addCriterion("OC_HANDLED >", value, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledGreaterThanOrEqualTo(String value) {
       addCriterion("OC_HANDLED >=", value, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledLessThan(String value) {
       addCriterion("OC_HANDLED <", value, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledLessThanOrEqualTo(String value) {
       addCriterion("OC_HANDLED <=", value, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledLike(String value) {
       addCriterion("OC_HANDLED like", value, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledNotLike(String value) {
       addCriterion("OC_HANDLED not like", value, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledIn(List<String> values) {
       addCriterion("OC_HANDLED in", values, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledNotIn(List<String> values) {
       addCriterion("OC_HANDLED not in", values, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledBetween(String value1, String value2) {
       addCriterion("OC_HANDLED between", value1, value2, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcHandledNotBetween(String value1, String value2) {
       addCriterion("OC_HANDLED not between", value1, value2, "ocHandled");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyIsNull() {
       addCriterion("OC_COMPANY is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyIsNotNull() {
       addCriterion("OC_COMPANY is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyEqualTo(String value) {
       addCriterion("OC_COMPANY =", value, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyNotEqualTo(String value) {
       addCriterion("OC_COMPANY <>", value, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyGreaterThan(String value) {
       addCriterion("OC_COMPANY >", value, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyGreaterThanOrEqualTo(String value) {
       addCriterion("OC_COMPANY >=", value, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyLessThan(String value) {
       addCriterion("OC_COMPANY <", value, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyLessThanOrEqualTo(String value) {
       addCriterion("OC_COMPANY <=", value, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyLike(String value) {
       addCriterion("OC_COMPANY like", value, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyNotLike(String value) {
       addCriterion("OC_COMPANY not like", value, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyIn(List<String> values) {
       addCriterion("OC_COMPANY in", values, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyNotIn(List<String> values) {
       addCriterion("OC_COMPANY not in", values, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyBetween(String value1, String value2) {
       addCriterion("OC_COMPANY between", value1, value2, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcCompanyNotBetween(String value1, String value2) {
       addCriterion("OC_COMPANY not between", value1, value2, "ocCompany");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordIsNull() {
       addCriterion("OC_PASSWORD is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordIsNotNull() {
       addCriterion("OC_PASSWORD is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordEqualTo(String value) {
       addCriterion("OC_PASSWORD =", value, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordNotEqualTo(String value) {
       addCriterion("OC_PASSWORD <>", value, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordGreaterThan(String value) {
       addCriterion("OC_PASSWORD >", value, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordGreaterThanOrEqualTo(String value) {
       addCriterion("OC_PASSWORD >=", value, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordLessThan(String value) {
       addCriterion("OC_PASSWORD <", value, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordLessThanOrEqualTo(String value) {
       addCriterion("OC_PASSWORD <=", value, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordLike(String value) {
       addCriterion("OC_PASSWORD like", value, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordNotLike(String value) {
       addCriterion("OC_PASSWORD not like", value, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordIn(List<String> values) {
       addCriterion("OC_PASSWORD in", values, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordNotIn(List<String> values) {
       addCriterion("OC_PASSWORD not in", values, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordBetween(String value1, String value2) {
       addCriterion("OC_PASSWORD between", value1, value2, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcPasswordNotBetween(String value1, String value2) {
       addCriterion("OC_PASSWORD not between", value1, value2, "ocPassword");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusIsNull() {
       addCriterion("OC_STATUS is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusIsNotNull() {
       addCriterion("OC_STATUS is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusEqualTo(String value) {
       addCriterion("OC_STATUS =", value, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusNotEqualTo(String value) {
       addCriterion("OC_STATUS <>", value, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusGreaterThan(String value) {
       addCriterion("OC_STATUS >", value, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusGreaterThanOrEqualTo(String value) {
       addCriterion("OC_STATUS >=", value, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusLessThan(String value) {
       addCriterion("OC_STATUS <", value, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusLessThanOrEqualTo(String value) {
       addCriterion("OC_STATUS <=", value, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusLike(String value) {
       addCriterion("OC_STATUS like", value, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusNotLike(String value) {
       addCriterion("OC_STATUS not like", value, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusIn(List<String> values) {
       addCriterion("OC_STATUS in", values, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusNotIn(List<String> values) {
       addCriterion("OC_STATUS not in", values, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusBetween(String value1, String value2) {
       addCriterion("OC_STATUS between", value1, value2, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andOcStatusNotBetween(String value1, String value2) {
       addCriterion("OC_STATUS not between", value1, value2, "ocStatus");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdIsNull() {
       addCriterion("V_ID is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdIsNotNull() {
       addCriterion("V_ID is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdEqualTo(Integer value) {
       addCriterion("V_ID =", value, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdNotEqualTo(Integer value) {
       addCriterion("V_ID <>", value, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdGreaterThan(Integer value) {
       addCriterion("V_ID >", value, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("V_ID >=", value, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdLessThan(Integer value) {
       addCriterion("V_ID <", value, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdLessThanOrEqualTo(Integer value) {
       addCriterion("V_ID <=", value, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdIn(List<Integer> values) {
       addCriterion("V_ID in", values, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdNotIn(List<Integer> values) {
       addCriterion("V_ID not in", values, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdBetween(Integer value1, Integer value2) {
       addCriterion("V_ID between", value1, value2, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVIdNotBetween(Integer value1, Integer value2) {
       addCriterion("V_ID not between", value1, value2, "vId");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumIsNull() {
       addCriterion("V_NUM is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumIsNotNull() {
       addCriterion("V_NUM is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumEqualTo(String value) {
       addCriterion("V_NUM =", value, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumNotEqualTo(String value) {
       addCriterion("V_NUM <>", value, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumGreaterThan(String value) {
       addCriterion("V_NUM >", value, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumGreaterThanOrEqualTo(String value) {
       addCriterion("V_NUM >=", value, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumLessThan(String value) {
       addCriterion("V_NUM <", value, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumLessThanOrEqualTo(String value) {
       addCriterion("V_NUM <=", value, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumLike(String value) {
       addCriterion("V_NUM like", value, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumNotLike(String value) {
       addCriterion("V_NUM not like", value, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumIn(List<String> values) {
       addCriterion("V_NUM in", values, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumNotIn(List<String> values) {
       addCriterion("V_NUM not in", values, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumBetween(String value1, String value2) {
       addCriterion("V_NUM between", value1, value2, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVNumNotBetween(String value1, String value2) {
       addCriterion("V_NUM not between", value1, value2, "vNum");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptIsNull() {
       addCriterion("V_DEPT is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptIsNotNull() {
       addCriterion("V_DEPT is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptEqualTo(String value) {
       addCriterion("V_DEPT =", value, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptNotEqualTo(String value) {
       addCriterion("V_DEPT <>", value, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptGreaterThan(String value) {
       addCriterion("V_DEPT >", value, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptGreaterThanOrEqualTo(String value) {
       addCriterion("V_DEPT >=", value, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptLessThan(String value) {
       addCriterion("V_DEPT <", value, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptLessThanOrEqualTo(String value) {
       addCriterion("V_DEPT <=", value, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptLike(String value) {
       addCriterion("V_DEPT like", value, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptNotLike(String value) {
       addCriterion("V_DEPT not like", value, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptIn(List<String> values) {
       addCriterion("V_DEPT in", values, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptNotIn(List<String> values) {
       addCriterion("V_DEPT not in", values, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptBetween(String value1, String value2) {
       addCriterion("V_DEPT between", value1, value2, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVDeptNotBetween(String value1, String value2) {
       addCriterion("V_DEPT not between", value1, value2, "vDept");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeIsNull() {
       addCriterion("V_TYPE is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeIsNotNull() {
       addCriterion("V_TYPE is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeEqualTo(String value) {
       addCriterion("V_TYPE =", value, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeNotEqualTo(String value) {
       addCriterion("V_TYPE <>", value, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeGreaterThan(String value) {
       addCriterion("V_TYPE >", value, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeGreaterThanOrEqualTo(String value) {
       addCriterion("V_TYPE >=", value, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeLessThan(String value) {
       addCriterion("V_TYPE <", value, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeLessThanOrEqualTo(String value) {
       addCriterion("V_TYPE <=", value, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeLike(String value) {
       addCriterion("V_TYPE like", value, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeNotLike(String value) {
       addCriterion("V_TYPE not like", value, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeIn(List<String> values) {
       addCriterion("V_TYPE in", values, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeNotIn(List<String> values) {
       addCriterion("V_TYPE not in", values, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeBetween(String value1, String value2) {
       addCriterion("V_TYPE between", value1, value2, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVTypeNotBetween(String value1, String value2) {
       addCriterion("V_TYPE not between", value1, value2, "vType");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerIsNull() {
       addCriterion("V_ONWER is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerIsNotNull() {
       addCriterion("V_ONWER is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerEqualTo(String value) {
       addCriterion("V_ONWER =", value, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerNotEqualTo(String value) {
       addCriterion("V_ONWER <>", value, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerGreaterThan(String value) {
       addCriterion("V_ONWER >", value, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerGreaterThanOrEqualTo(String value) {
       addCriterion("V_ONWER >=", value, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerLessThan(String value) {
       addCriterion("V_ONWER <", value, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerLessThanOrEqualTo(String value) {
       addCriterion("V_ONWER <=", value, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerLike(String value) {
       addCriterion("V_ONWER like", value, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerNotLike(String value) {
       addCriterion("V_ONWER not like", value, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerIn(List<String> values) {
       addCriterion("V_ONWER in", values, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerNotIn(List<String> values) {
       addCriterion("V_ONWER not in", values, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerBetween(String value1, String value2) {
       addCriterion("V_ONWER between", value1, value2, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVOnwerNotBetween(String value1, String value2) {
       addCriterion("V_ONWER not between", value1, value2, "vOnwer");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserIsNull() {
       addCriterion("V_USER is null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserIsNotNull() {
       addCriterion("V_USER is not null");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserEqualTo(String value) {
       addCriterion("V_USER =", value, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserNotEqualTo(String value) {
       addCriterion("V_USER <>", value, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserGreaterThan(String value) {
       addCriterion("V_USER >", value, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserGreaterThanOrEqualTo(String value) {
       addCriterion("V_USER >=", value, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserLessThan(String value) {
       addCriterion("V_USER <", value, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserLessThanOrEqualTo(String value) {
       addCriterion("V_USER <=", value, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserLike(String value) {
       addCriterion("V_USER like", value, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserNotLike(String value) {
       addCriterion("V_USER not like", value, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserIn(List<String> values) {
       addCriterion("V_USER in", values, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserNotIn(List<String> values) {
       addCriterion("V_USER not in", values, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserBetween(String value1, String value2) {
       addCriterion("V_USER between", value1, value2, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
 
     public VehicleOilCardExample.Criteria andVUserNotBetween(String value1, String value2) {
       addCriterion("V_USER not between", value1, value2, "vUser");
       return (VehicleOilCardExample.Criteria)this;
     }
   }
 }

