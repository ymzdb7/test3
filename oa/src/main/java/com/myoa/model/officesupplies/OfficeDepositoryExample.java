 package com.myoa.model.officesupplies;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class OfficeDepositoryExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public OfficeDepositoryExample()
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
 
   public static class Criteria extends OfficeDepositoryExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<OfficeDepositoryExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<OfficeDepositoryExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<OfficeDepositoryExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new OfficeDepositoryExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new OfficeDepositoryExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new OfficeDepositoryExample.Criterion(condition, value1, value2));
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
 
     public OfficeDepositoryExample.Criteria andIdIsNull() {
       addCriterion("ID is null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdIsNotNull() {
       addCriterion("ID is not null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("ID =", value, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("ID <>", value, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("ID >", value, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ID >=", value, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdLessThan(Integer value) {
       addCriterion("ID <", value, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("ID <=", value, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("ID in", values, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("ID not in", values, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("ID between", value1, value2, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ID not between", value1, value2, "id");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameIsNull() {
       addCriterion("DEPOSITORY_NAME is null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameIsNotNull() {
       addCriterion("DEPOSITORY_NAME is not null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameEqualTo(String value) {
       addCriterion("DEPOSITORY_NAME =", value, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameNotEqualTo(String value) {
       addCriterion("DEPOSITORY_NAME <>", value, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameGreaterThan(String value) {
       addCriterion("DEPOSITORY_NAME >", value, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameGreaterThanOrEqualTo(String value) {
       addCriterion("DEPOSITORY_NAME >=", value, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameLessThan(String value) {
       addCriterion("DEPOSITORY_NAME <", value, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameLessThanOrEqualTo(String value) {
       addCriterion("DEPOSITORY_NAME <=", value, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameLike(String value) {
       addCriterion("DEPOSITORY_NAME like", value, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameNotLike(String value) {
       addCriterion("DEPOSITORY_NAME not like", value, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameIn(List<String> values) {
       addCriterion("DEPOSITORY_NAME in", values, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameNotIn(List<String> values) {
       addCriterion("DEPOSITORY_NAME not in", values, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameBetween(String value1, String value2) {
       addCriterion("DEPOSITORY_NAME between", value1, value2, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andDepositoryNameNotBetween(String value1, String value2) {
       addCriterion("DEPOSITORY_NAME not between", value1, value2, "depositoryName");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdIsNull() {
       addCriterion("PRIV_ID is null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdIsNotNull() {
       addCriterion("PRIV_ID is not null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdEqualTo(String value) {
       addCriterion("PRIV_ID =", value, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdNotEqualTo(String value) {
       addCriterion("PRIV_ID <>", value, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdGreaterThan(String value) {
       addCriterion("PRIV_ID >", value, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdGreaterThanOrEqualTo(String value) {
       addCriterion("PRIV_ID >=", value, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdLessThan(String value) {
       addCriterion("PRIV_ID <", value, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdLessThanOrEqualTo(String value) {
       addCriterion("PRIV_ID <=", value, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdLike(String value) {
       addCriterion("PRIV_ID like", value, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdNotLike(String value) {
       addCriterion("PRIV_ID not like", value, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdIn(List<String> values) {
       addCriterion("PRIV_ID in", values, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdNotIn(List<String> values) {
       addCriterion("PRIV_ID not in", values, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdBetween(String value1, String value2) {
       addCriterion("PRIV_ID between", value1, value2, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andPrivIdNotBetween(String value1, String value2) {
       addCriterion("PRIV_ID not between", value1, value2, "privId");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusIsNull() {
       addCriterion("RETURN_STATUS is null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusIsNotNull() {
       addCriterion("RETURN_STATUS is not null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusEqualTo(Integer value) {
       addCriterion("RETURN_STATUS =", value, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusNotEqualTo(Integer value) {
       addCriterion("RETURN_STATUS <>", value, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusGreaterThan(Integer value) {
       addCriterion("RETURN_STATUS >", value, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("RETURN_STATUS >=", value, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusLessThan(Integer value) {
       addCriterion("RETURN_STATUS <", value, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusLessThanOrEqualTo(Integer value) {
       addCriterion("RETURN_STATUS <=", value, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusIn(List<Integer> values) {
       addCriterion("RETURN_STATUS in", values, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusNotIn(List<Integer> values) {
       addCriterion("RETURN_STATUS not in", values, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusBetween(Integer value1, Integer value2) {
       addCriterion("RETURN_STATUS between", value1, value2, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("RETURN_STATUS not between", value1, value2, "returnStatus");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateIsNull() {
       addCriterion("RETURN_DATE is null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateIsNotNull() {
       addCriterion("RETURN_DATE is not null");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE =", value, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE <>", value, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE >", value, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE >=", value, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE <", value, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE <=", value, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("RETURN_DATE in", values, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("RETURN_DATE not in", values, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("RETURN_DATE between", value1, value2, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
 
     public OfficeDepositoryExample.Criteria andReturnDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("RETURN_DATE not between", value1, value2, "returnDate");
       return (OfficeDepositoryExample.Criteria)this;
     }
   }
 }
