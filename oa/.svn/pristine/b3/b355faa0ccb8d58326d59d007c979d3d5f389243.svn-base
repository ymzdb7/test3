 package com.myoa.model.hr;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class HrCodeExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public HrCodeExample()
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
 
   public static class Criteria extends HrCodeExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<HrCodeExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<HrCodeExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<HrCodeExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new HrCodeExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new HrCodeExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new HrCodeExample.Criterion(condition, value1, value2));
     }
 
     public HrCodeExample.Criteria andCodeIdIsNull() {
       addCriterion("CODE_ID is null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdIsNotNull() {
       addCriterion("CODE_ID is not null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdEqualTo(Integer value) {
       addCriterion("CODE_ID =", value, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdNotEqualTo(Integer value) {
       addCriterion("CODE_ID <>", value, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdGreaterThan(Integer value) {
       addCriterion("CODE_ID >", value, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("CODE_ID >=", value, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdLessThan(Integer value) {
       addCriterion("CODE_ID <", value, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdLessThanOrEqualTo(Integer value) {
       addCriterion("CODE_ID <=", value, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdIn(List<Integer> values) {
       addCriterion("CODE_ID in", values, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdNotIn(List<Integer> values) {
       addCriterion("CODE_ID not in", values, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdBetween(Integer value1, Integer value2) {
       addCriterion("CODE_ID between", value1, value2, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeIdNotBetween(Integer value1, Integer value2) {
       addCriterion("CODE_ID not between", value1, value2, "codeId");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoIsNull() {
       addCriterion("CODE_NO is null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoIsNotNull() {
       addCriterion("CODE_NO is not null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoEqualTo(String value) {
       addCriterion("CODE_NO =", value, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoNotEqualTo(String value) {
       addCriterion("CODE_NO <>", value, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoGreaterThan(String value) {
       addCriterion("CODE_NO >", value, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoGreaterThanOrEqualTo(String value) {
       addCriterion("CODE_NO >=", value, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoLessThan(String value) {
       addCriterion("CODE_NO <", value, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoLessThanOrEqualTo(String value) {
       addCriterion("CODE_NO <=", value, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoLike(String value) {
       addCriterion("CODE_NO like", value, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoNotLike(String value) {
       addCriterion("CODE_NO not like", value, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoIn(List<String> values) {
       addCriterion("CODE_NO in", values, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoNotIn(List<String> values) {
       addCriterion("CODE_NO not in", values, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoBetween(String value1, String value2) {
       addCriterion("CODE_NO between", value1, value2, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeNoNotBetween(String value1, String value2) {
       addCriterion("CODE_NO not between", value1, value2, "codeNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderIsNull() {
       addCriterion("CODE_ORDER is null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderIsNotNull() {
       addCriterion("CODE_ORDER is not null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderEqualTo(String value) {
       addCriterion("CODE_ORDER =", value, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderNotEqualTo(String value) {
       addCriterion("CODE_ORDER <>", value, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderGreaterThan(String value) {
       addCriterion("CODE_ORDER >", value, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderGreaterThanOrEqualTo(String value) {
       addCriterion("CODE_ORDER >=", value, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderLessThan(String value) {
       addCriterion("CODE_ORDER <", value, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderLessThanOrEqualTo(String value) {
       addCriterion("CODE_ORDER <=", value, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderLike(String value) {
       addCriterion("CODE_ORDER like", value, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderNotLike(String value) {
       addCriterion("CODE_ORDER not like", value, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderIn(List<String> values) {
       addCriterion("CODE_ORDER in", values, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderNotIn(List<String> values) {
       addCriterion("CODE_ORDER not in", values, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderBetween(String value1, String value2) {
       addCriterion("CODE_ORDER between", value1, value2, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeOrderNotBetween(String value1, String value2) {
       addCriterion("CODE_ORDER not between", value1, value2, "codeOrder");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoIsNull() {
       addCriterion("PARENT_NO is null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoIsNotNull() {
       addCriterion("PARENT_NO is not null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoEqualTo(String value) {
       addCriterion("PARENT_NO =", value, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoNotEqualTo(String value) {
       addCriterion("PARENT_NO <>", value, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoGreaterThan(String value) {
       addCriterion("PARENT_NO >", value, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoGreaterThanOrEqualTo(String value) {
       addCriterion("PARENT_NO >=", value, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoLessThan(String value) {
       addCriterion("PARENT_NO <", value, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoLessThanOrEqualTo(String value) {
       addCriterion("PARENT_NO <=", value, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoLike(String value) {
       addCriterion("PARENT_NO like", value, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoNotLike(String value) {
       addCriterion("PARENT_NO not like", value, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoIn(List<String> values) {
       addCriterion("PARENT_NO in", values, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoNotIn(List<String> values) {
       addCriterion("PARENT_NO not in", values, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoBetween(String value1, String value2) {
       addCriterion("PARENT_NO between", value1, value2, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andParentNoNotBetween(String value1, String value2) {
       addCriterion("PARENT_NO not between", value1, value2, "parentNo");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagIsNull() {
       addCriterion("CODE_FLAG is null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagIsNotNull() {
       addCriterion("CODE_FLAG is not null");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagEqualTo(String value) {
       addCriterion("CODE_FLAG =", value, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagNotEqualTo(String value) {
       addCriterion("CODE_FLAG <>", value, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagGreaterThan(String value) {
       addCriterion("CODE_FLAG >", value, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagGreaterThanOrEqualTo(String value) {
       addCriterion("CODE_FLAG >=", value, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagLessThan(String value) {
       addCriterion("CODE_FLAG <", value, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagLessThanOrEqualTo(String value) {
       addCriterion("CODE_FLAG <=", value, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagLike(String value) {
       addCriterion("CODE_FLAG like", value, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagNotLike(String value) {
       addCriterion("CODE_FLAG not like", value, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagIn(List<String> values) {
       addCriterion("CODE_FLAG in", values, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagNotIn(List<String> values) {
       addCriterion("CODE_FLAG not in", values, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagBetween(String value1, String value2) {
       addCriterion("CODE_FLAG between", value1, value2, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
 
     public HrCodeExample.Criteria andCodeFlagNotBetween(String value1, String value2) {
       addCriterion("CODE_FLAG not between", value1, value2, "codeFlag");
       return (HrCodeExample.Criteria)this;
     }
   }
 }

