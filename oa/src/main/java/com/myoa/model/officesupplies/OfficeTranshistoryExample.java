 package com.myoa.model.officesupplies;
 
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class OfficeTranshistoryExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public OfficeTranshistoryExample()
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
 
   public static class Criteria extends OfficeTranshistoryExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<OfficeTranshistoryExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<OfficeTranshistoryExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<OfficeTranshistoryExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new OfficeTranshistoryExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new OfficeTranshistoryExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new OfficeTranshistoryExample.Criterion(condition, value1, value2));
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
 
     public OfficeTranshistoryExample.Criteria andTransIdIsNull() {
       addCriterion("TRANS_ID is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdIsNotNull() {
       addCriterion("TRANS_ID is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdEqualTo(Integer value) {
       addCriterion("TRANS_ID =", value, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdNotEqualTo(Integer value) {
       addCriterion("TRANS_ID <>", value, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdGreaterThan(Integer value) {
       addCriterion("TRANS_ID >", value, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("TRANS_ID >=", value, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdLessThan(Integer value) {
       addCriterion("TRANS_ID <", value, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdLessThanOrEqualTo(Integer value) {
       addCriterion("TRANS_ID <=", value, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdIn(List<Integer> values) {
       addCriterion("TRANS_ID in", values, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdNotIn(List<Integer> values) {
       addCriterion("TRANS_ID not in", values, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdBetween(Integer value1, Integer value2) {
       addCriterion("TRANS_ID between", value1, value2, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransIdNotBetween(Integer value1, Integer value2) {
       addCriterion("TRANS_ID not between", value1, value2, "transId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdIsNull() {
       addCriterion("PRO_ID is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdIsNotNull() {
       addCriterion("PRO_ID is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdEqualTo(Integer value) {
       addCriterion("PRO_ID =", value, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdNotEqualTo(Integer value) {
       addCriterion("PRO_ID <>", value, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdGreaterThan(Integer value) {
       addCriterion("PRO_ID >", value, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("PRO_ID >=", value, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdLessThan(Integer value) {
       addCriterion("PRO_ID <", value, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdLessThanOrEqualTo(Integer value) {
       addCriterion("PRO_ID <=", value, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdIn(List<Integer> values) {
       addCriterion("PRO_ID in", values, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdNotIn(List<Integer> values) {
       addCriterion("PRO_ID not in", values, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdBetween(Integer value1, Integer value2) {
       addCriterion("PRO_ID between", value1, value2, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProIdNotBetween(Integer value1, Integer value2) {
       addCriterion("PRO_ID not between", value1, value2, "proId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerIsNull() {
       addCriterion("BORROWER is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerIsNotNull() {
       addCriterion("BORROWER is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerEqualTo(String value) {
       addCriterion("BORROWER =", value, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerNotEqualTo(String value) {
       addCriterion("BORROWER <>", value, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerGreaterThan(String value) {
       addCriterion("BORROWER >", value, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerGreaterThanOrEqualTo(String value) {
       addCriterion("BORROWER >=", value, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerLessThan(String value) {
       addCriterion("BORROWER <", value, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerLessThanOrEqualTo(String value) {
       addCriterion("BORROWER <=", value, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerLike(String value) {
       addCriterion("BORROWER like", value, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerNotLike(String value) {
       addCriterion("BORROWER not like", value, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerIn(List<String> values) {
       addCriterion("BORROWER in", values, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerNotIn(List<String> values) {
       addCriterion("BORROWER not in", values, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerBetween(String value1, String value2) {
       addCriterion("BORROWER between", value1, value2, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBorrowerNotBetween(String value1, String value2) {
       addCriterion("BORROWER not between", value1, value2, "borrower");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagIsNull() {
       addCriterion("TRANS_FLAG is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagIsNotNull() {
       addCriterion("TRANS_FLAG is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagEqualTo(String value) {
       addCriterion("TRANS_FLAG =", value, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagNotEqualTo(String value) {
       addCriterion("TRANS_FLAG <>", value, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagGreaterThan(String value) {
       addCriterion("TRANS_FLAG >", value, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagGreaterThanOrEqualTo(String value) {
       addCriterion("TRANS_FLAG >=", value, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagLessThan(String value) {
       addCriterion("TRANS_FLAG <", value, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagLessThanOrEqualTo(String value) {
       addCriterion("TRANS_FLAG <=", value, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagLike(String value) {
       addCriterion("TRANS_FLAG like", value, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagNotLike(String value) {
       addCriterion("TRANS_FLAG not like", value, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagIn(List<String> values) {
       addCriterion("TRANS_FLAG in", values, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagNotIn(List<String> values) {
       addCriterion("TRANS_FLAG not in", values, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagBetween(String value1, String value2) {
       addCriterion("TRANS_FLAG between", value1, value2, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransFlagNotBetween(String value1, String value2) {
       addCriterion("TRANS_FLAG not between", value1, value2, "transFlag");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyIsNull() {
       addCriterion("TRANS_QTY is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyIsNotNull() {
       addCriterion("TRANS_QTY is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyEqualTo(Integer value) {
       addCriterion("TRANS_QTY =", value, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyNotEqualTo(Integer value) {
       addCriterion("TRANS_QTY <>", value, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyGreaterThan(Integer value) {
       addCriterion("TRANS_QTY >", value, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyGreaterThanOrEqualTo(Integer value) {
       addCriterion("TRANS_QTY >=", value, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyLessThan(Integer value) {
       addCriterion("TRANS_QTY <", value, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyLessThanOrEqualTo(Integer value) {
       addCriterion("TRANS_QTY <=", value, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyIn(List<Integer> values) {
       addCriterion("TRANS_QTY in", values, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyNotIn(List<Integer> values) {
       addCriterion("TRANS_QTY not in", values, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyBetween(Integer value1, Integer value2) {
       addCriterion("TRANS_QTY between", value1, value2, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransQtyNotBetween(Integer value1, Integer value2) {
       addCriterion("TRANS_QTY not between", value1, value2, "transQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceIsNull() {
       addCriterion("PRICE is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceIsNotNull() {
       addCriterion("PRICE is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceEqualTo(BigDecimal value) {
       addCriterion("PRICE =", value, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceNotEqualTo(BigDecimal value) {
       addCriterion("PRICE <>", value, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceGreaterThan(BigDecimal value) {
       addCriterion("PRICE >", value, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("PRICE >=", value, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceLessThan(BigDecimal value) {
       addCriterion("PRICE <", value, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
       addCriterion("PRICE <=", value, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceIn(List<BigDecimal> values) {
       addCriterion("PRICE in", values, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceNotIn(List<BigDecimal> values) {
       addCriterion("PRICE not in", values, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PRICE between", value1, value2, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PRICE not between", value1, value2, "price");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateIsNull() {
       addCriterion("TRANS_DATE is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateIsNotNull() {
       addCriterion("TRANS_DATE is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("TRANS_DATE =", value, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("TRANS_DATE <>", value, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("TRANS_DATE >", value, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("TRANS_DATE >=", value, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("TRANS_DATE <", value, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("TRANS_DATE <=", value, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("TRANS_DATE in", values, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("TRANS_DATE not in", values, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("TRANS_DATE between", value1, value2, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("TRANS_DATE not between", value1, value2, "transDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorIsNull() {
       addCriterion("OPERATOR is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorIsNotNull() {
       addCriterion("OPERATOR is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorEqualTo(String value) {
       addCriterion("OPERATOR =", value, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorNotEqualTo(String value) {
       addCriterion("OPERATOR <>", value, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorGreaterThan(String value) {
       addCriterion("OPERATOR >", value, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorGreaterThanOrEqualTo(String value) {
       addCriterion("OPERATOR >=", value, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorLessThan(String value) {
       addCriterion("OPERATOR <", value, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorLessThanOrEqualTo(String value) {
       addCriterion("OPERATOR <=", value, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorLike(String value) {
       addCriterion("OPERATOR like", value, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorNotLike(String value) {
       addCriterion("OPERATOR not like", value, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorIn(List<String> values) {
       addCriterion("OPERATOR in", values, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorNotIn(List<String> values) {
       addCriterion("OPERATOR not in", values, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorBetween(String value1, String value2) {
       addCriterion("OPERATOR between", value1, value2, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andOperatorNotBetween(String value1, String value2) {
       addCriterion("OPERATOR not between", value1, value2, "operator");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateIsNull() {
       addCriterion("TRANS_STATE is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateIsNotNull() {
       addCriterion("TRANS_STATE is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateEqualTo(String value) {
       addCriterion("TRANS_STATE =", value, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateNotEqualTo(String value) {
       addCriterion("TRANS_STATE <>", value, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateGreaterThan(String value) {
       addCriterion("TRANS_STATE >", value, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateGreaterThanOrEqualTo(String value) {
       addCriterion("TRANS_STATE >=", value, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateLessThan(String value) {
       addCriterion("TRANS_STATE <", value, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateLessThanOrEqualTo(String value) {
       addCriterion("TRANS_STATE <=", value, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateLike(String value) {
       addCriterion("TRANS_STATE like", value, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateNotLike(String value) {
       addCriterion("TRANS_STATE not like", value, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateIn(List<String> values) {
       addCriterion("TRANS_STATE in", values, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateNotIn(List<String> values) {
       addCriterion("TRANS_STATE not in", values, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateBetween(String value1, String value2) {
       addCriterion("TRANS_STATE between", value1, value2, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andTransStateNotBetween(String value1, String value2) {
       addCriterion("TRANS_STATE not between", value1, value2, "transState");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyIsNull() {
       addCriterion("FACT_QTY is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyIsNotNull() {
       addCriterion("FACT_QTY is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyEqualTo(Integer value) {
       addCriterion("FACT_QTY =", value, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyNotEqualTo(Integer value) {
       addCriterion("FACT_QTY <>", value, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyGreaterThan(Integer value) {
       addCriterion("FACT_QTY >", value, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyGreaterThanOrEqualTo(Integer value) {
       addCriterion("FACT_QTY >=", value, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyLessThan(Integer value) {
       addCriterion("FACT_QTY <", value, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyLessThanOrEqualTo(Integer value) {
       addCriterion("FACT_QTY <=", value, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyIn(List<Integer> values) {
       addCriterion("FACT_QTY in", values, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyNotIn(List<Integer> values) {
       addCriterion("FACT_QTY not in", values, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyBetween(Integer value1, Integer value2) {
       addCriterion("FACT_QTY between", value1, value2, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andFactQtyNotBetween(Integer value1, Integer value2) {
       addCriterion("FACT_QTY not between", value1, value2, "factQty");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyIsNull() {
       addCriterion("COMPANY is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyIsNotNull() {
       addCriterion("COMPANY is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyEqualTo(String value) {
       addCriterion("COMPANY =", value, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyNotEqualTo(String value) {
       addCriterion("COMPANY <>", value, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyGreaterThan(String value) {
       addCriterion("COMPANY >", value, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyGreaterThanOrEqualTo(String value) {
       addCriterion("COMPANY >=", value, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyLessThan(String value) {
       addCriterion("COMPANY <", value, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyLessThanOrEqualTo(String value) {
       addCriterion("COMPANY <=", value, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyLike(String value) {
       addCriterion("COMPANY like", value, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyNotLike(String value) {
       addCriterion("COMPANY not like", value, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyIn(List<String> values) {
       addCriterion("COMPANY in", values, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyNotIn(List<String> values) {
       addCriterion("COMPANY not in", values, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyBetween(String value1, String value2) {
       addCriterion("COMPANY between", value1, value2, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCompanyNotBetween(String value1, String value2) {
       addCriterion("COMPANY not between", value1, value2, "company");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandIsNull() {
       addCriterion("BAND is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandIsNotNull() {
       addCriterion("BAND is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandEqualTo(String value) {
       addCriterion("BAND =", value, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandNotEqualTo(String value) {
       addCriterion("BAND <>", value, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandGreaterThan(String value) {
       addCriterion("BAND >", value, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandGreaterThanOrEqualTo(String value) {
       addCriterion("BAND >=", value, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandLessThan(String value) {
       addCriterion("BAND <", value, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandLessThanOrEqualTo(String value) {
       addCriterion("BAND <=", value, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandLike(String value) {
       addCriterion("BAND like", value, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandNotLike(String value) {
       addCriterion("BAND not like", value, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandIn(List<String> values) {
       addCriterion("BAND in", values, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandNotIn(List<String> values) {
       addCriterion("BAND not in", values, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandBetween(String value1, String value2) {
       addCriterion("BAND between", value1, value2, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andBandNotBetween(String value1, String value2) {
       addCriterion("BAND not between", value1, value2, "band");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoIsNull() {
       addCriterion("CYCLE_NO is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoIsNotNull() {
       addCriterion("CYCLE_NO is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoEqualTo(Integer value) {
       addCriterion("CYCLE_NO =", value, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoNotEqualTo(Integer value) {
       addCriterion("CYCLE_NO <>", value, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoGreaterThan(Integer value) {
       addCriterion("CYCLE_NO >", value, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoGreaterThanOrEqualTo(Integer value) {
       addCriterion("CYCLE_NO >=", value, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoLessThan(Integer value) {
       addCriterion("CYCLE_NO <", value, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoLessThanOrEqualTo(Integer value) {
       addCriterion("CYCLE_NO <=", value, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoIn(List<Integer> values) {
       addCriterion("CYCLE_NO in", values, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoNotIn(List<Integer> values) {
       addCriterion("CYCLE_NO not in", values, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoBetween(Integer value1, Integer value2) {
       addCriterion("CYCLE_NO between", value1, value2, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNoNotBetween(Integer value1, Integer value2) {
       addCriterion("CYCLE_NO not between", value1, value2, "cycleNo");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleIsNull() {
       addCriterion("CYCLE is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleIsNotNull() {
       addCriterion("CYCLE is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleEqualTo(String value) {
       addCriterion("CYCLE =", value, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNotEqualTo(String value) {
       addCriterion("CYCLE <>", value, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleGreaterThan(String value) {
       addCriterion("CYCLE >", value, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleGreaterThanOrEqualTo(String value) {
       addCriterion("CYCLE >=", value, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleLessThan(String value) {
       addCriterion("CYCLE <", value, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleLessThanOrEqualTo(String value) {
       addCriterion("CYCLE <=", value, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleLike(String value) {
       addCriterion("CYCLE like", value, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNotLike(String value) {
       addCriterion("CYCLE not like", value, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleIn(List<String> values) {
       addCriterion("CYCLE in", values, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNotIn(List<String> values) {
       addCriterion("CYCLE not in", values, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleBetween(String value1, String value2) {
       addCriterion("CYCLE between", value1, value2, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andCycleNotBetween(String value1, String value2) {
       addCriterion("CYCLE not between", value1, value2, "cycle");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdIsNull() {
       addCriterion("DEPT_ID is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdIsNotNull() {
       addCriterion("DEPT_ID is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdEqualTo(Integer value) {
       addCriterion("DEPT_ID =", value, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdNotEqualTo(Integer value) {
       addCriterion("DEPT_ID <>", value, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdGreaterThan(Integer value) {
       addCriterion("DEPT_ID >", value, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("DEPT_ID >=", value, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdLessThan(Integer value) {
       addCriterion("DEPT_ID <", value, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdLessThanOrEqualTo(Integer value) {
       addCriterion("DEPT_ID <=", value, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdIn(List<Integer> values) {
       addCriterion("DEPT_ID in", values, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdNotIn(List<Integer> values) {
       addCriterion("DEPT_ID not in", values, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_ID between", value1, value2, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_ID not between", value1, value2, "deptId");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperIsNull() {
       addCriterion("PRO_KEEPER is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperIsNotNull() {
       addCriterion("PRO_KEEPER is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperEqualTo(String value) {
       addCriterion("PRO_KEEPER =", value, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperNotEqualTo(String value) {
       addCriterion("PRO_KEEPER <>", value, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperGreaterThan(String value) {
       addCriterion("PRO_KEEPER >", value, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperGreaterThanOrEqualTo(String value) {
       addCriterion("PRO_KEEPER >=", value, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperLessThan(String value) {
       addCriterion("PRO_KEEPER <", value, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperLessThanOrEqualTo(String value) {
       addCriterion("PRO_KEEPER <=", value, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperLike(String value) {
       addCriterion("PRO_KEEPER like", value, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperNotLike(String value) {
       addCriterion("PRO_KEEPER not like", value, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperIn(List<String> values) {
       addCriterion("PRO_KEEPER in", values, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperNotIn(List<String> values) {
       addCriterion("PRO_KEEPER not in", values, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperBetween(String value1, String value2) {
       addCriterion("PRO_KEEPER between", value1, value2, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andProKeeperNotBetween(String value1, String value2) {
       addCriterion("PRO_KEEPER not between", value1, value2, "proKeeper");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorIsNull() {
       addCriterion("GRANTOR is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorIsNotNull() {
       addCriterion("GRANTOR is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorEqualTo(String value) {
       addCriterion("GRANTOR =", value, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorNotEqualTo(String value) {
       addCriterion("GRANTOR <>", value, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorGreaterThan(String value) {
       addCriterion("GRANTOR >", value, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorGreaterThanOrEqualTo(String value) {
       addCriterion("GRANTOR >=", value, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorLessThan(String value) {
       addCriterion("GRANTOR <", value, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorLessThanOrEqualTo(String value) {
       addCriterion("GRANTOR <=", value, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorLike(String value) {
       addCriterion("GRANTOR like", value, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorNotLike(String value) {
       addCriterion("GRANTOR not like", value, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorIn(List<String> values) {
       addCriterion("GRANTOR in", values, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorNotIn(List<String> values) {
       addCriterion("GRANTOR not in", values, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorBetween(String value1, String value2) {
       addCriterion("GRANTOR between", value1, value2, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantorNotBetween(String value1, String value2) {
       addCriterion("GRANTOR not between", value1, value2, "grantor");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusIsNull() {
       addCriterion("GRANT_STATUS is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusIsNotNull() {
       addCriterion("GRANT_STATUS is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusEqualTo(String value) {
       addCriterion("GRANT_STATUS =", value, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusNotEqualTo(String value) {
       addCriterion("GRANT_STATUS <>", value, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusGreaterThan(String value) {
       addCriterion("GRANT_STATUS >", value, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusGreaterThanOrEqualTo(String value) {
       addCriterion("GRANT_STATUS >=", value, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusLessThan(String value) {
       addCriterion("GRANT_STATUS <", value, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusLessThanOrEqualTo(String value) {
       addCriterion("GRANT_STATUS <=", value, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusLike(String value) {
       addCriterion("GRANT_STATUS like", value, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusNotLike(String value) {
       addCriterion("GRANT_STATUS not like", value, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusIn(List<String> values) {
       addCriterion("GRANT_STATUS in", values, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusNotIn(List<String> values) {
       addCriterion("GRANT_STATUS not in", values, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusBetween(String value1, String value2) {
       addCriterion("GRANT_STATUS between", value1, value2, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andGrantStatusNotBetween(String value1, String value2) {
       addCriterion("GRANT_STATUS not between", value1, value2, "grantStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerIsNull() {
       addCriterion("DEPT_MANAGER is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerIsNotNull() {
       addCriterion("DEPT_MANAGER is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerEqualTo(String value) {
       addCriterion("DEPT_MANAGER =", value, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerNotEqualTo(String value) {
       addCriterion("DEPT_MANAGER <>", value, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerGreaterThan(String value) {
       addCriterion("DEPT_MANAGER >", value, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerGreaterThanOrEqualTo(String value) {
       addCriterion("DEPT_MANAGER >=", value, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerLessThan(String value) {
       addCriterion("DEPT_MANAGER <", value, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerLessThanOrEqualTo(String value) {
       addCriterion("DEPT_MANAGER <=", value, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerLike(String value) {
       addCriterion("DEPT_MANAGER like", value, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerNotLike(String value) {
       addCriterion("DEPT_MANAGER not like", value, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerIn(List<String> values) {
       addCriterion("DEPT_MANAGER in", values, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerNotIn(List<String> values) {
       addCriterion("DEPT_MANAGER not in", values, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerBetween(String value1, String value2) {
       addCriterion("DEPT_MANAGER between", value1, value2, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptManagerNotBetween(String value1, String value2) {
       addCriterion("DEPT_MANAGER not between", value1, value2, "deptManager");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusIsNull() {
       addCriterion("DEPT_STATUS is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusIsNotNull() {
       addCriterion("DEPT_STATUS is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusEqualTo(Integer value) {
       addCriterion("DEPT_STATUS =", value, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusNotEqualTo(Integer value) {
       addCriterion("DEPT_STATUS <>", value, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusGreaterThan(Integer value) {
       addCriterion("DEPT_STATUS >", value, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("DEPT_STATUS >=", value, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusLessThan(Integer value) {
       addCriterion("DEPT_STATUS <", value, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusLessThanOrEqualTo(Integer value) {
       addCriterion("DEPT_STATUS <=", value, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusIn(List<Integer> values) {
       addCriterion("DEPT_STATUS in", values, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusNotIn(List<Integer> values) {
       addCriterion("DEPT_STATUS not in", values, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_STATUS between", value1, value2, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andDeptStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_STATUS not between", value1, value2, "deptStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusIsNull() {
       addCriterion("RETURN_STATUS is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusIsNotNull() {
       addCriterion("RETURN_STATUS is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusEqualTo(Integer value) {
       addCriterion("RETURN_STATUS =", value, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusNotEqualTo(Integer value) {
       addCriterion("RETURN_STATUS <>", value, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusGreaterThan(Integer value) {
       addCriterion("RETURN_STATUS >", value, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("RETURN_STATUS >=", value, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusLessThan(Integer value) {
       addCriterion("RETURN_STATUS <", value, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusLessThanOrEqualTo(Integer value) {
       addCriterion("RETURN_STATUS <=", value, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusIn(List<Integer> values) {
       addCriterion("RETURN_STATUS in", values, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusNotIn(List<Integer> values) {
       addCriterion("RETURN_STATUS not in", values, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusBetween(Integer value1, Integer value2) {
       addCriterion("RETURN_STATUS between", value1, value2, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("RETURN_STATUS not between", value1, value2, "returnStatus");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateIsNull() {
       addCriterion("RETURN_DATE is null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateIsNotNull() {
       addCriterion("RETURN_DATE is not null");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE =", value, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE <>", value, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE >", value, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE >=", value, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE <", value, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RETURN_DATE <=", value, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("RETURN_DATE in", values, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("RETURN_DATE not in", values, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("RETURN_DATE between", value1, value2, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
 
     public OfficeTranshistoryExample.Criteria andReturnDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("RETURN_DATE not between", value1, value2, "returnDate");
       return (OfficeTranshistoryExample.Criteria)this;
     }
   }
 }
