 package com.myoa.model.url;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class UrlExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public UrlExample()
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
 
   public static class Criteria extends UrlExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<UrlExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<UrlExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<UrlExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new UrlExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new UrlExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new UrlExample.Criterion(condition, value1, value2));
     }
 
     public UrlExample.Criteria andUrlIdIsNull() {
       addCriterion("URL_ID is null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdIsNotNull() {
       addCriterion("URL_ID is not null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdEqualTo(Integer value) {
       addCriterion("URL_ID =", value, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdNotEqualTo(Integer value) {
       addCriterion("URL_ID <>", value, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdGreaterThan(Integer value) {
       addCriterion("URL_ID >", value, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("URL_ID >=", value, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdLessThan(Integer value) {
       addCriterion("URL_ID <", value, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdLessThanOrEqualTo(Integer value) {
       addCriterion("URL_ID <=", value, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdIn(List<Integer> values) {
       addCriterion("URL_ID in", values, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdNotIn(List<Integer> values) {
       addCriterion("URL_ID not in", values, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdBetween(Integer value1, Integer value2) {
       addCriterion("URL_ID between", value1, value2, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIdNotBetween(Integer value1, Integer value2) {
       addCriterion("URL_ID not between", value1, value2, "urlId");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoIsNull() {
       addCriterion("URL_NO is null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoIsNotNull() {
       addCriterion("URL_NO is not null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoEqualTo(Integer value) {
       addCriterion("URL_NO =", value, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoNotEqualTo(Integer value) {
       addCriterion("URL_NO <>", value, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoGreaterThan(Integer value) {
       addCriterion("URL_NO >", value, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoGreaterThanOrEqualTo(Integer value) {
       addCriterion("URL_NO >=", value, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoLessThan(Integer value) {
       addCriterion("URL_NO <", value, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoLessThanOrEqualTo(Integer value) {
       addCriterion("URL_NO <=", value, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoIn(List<Integer> values) {
       addCriterion("URL_NO in", values, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoNotIn(List<Integer> values) {
       addCriterion("URL_NO not in", values, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoBetween(Integer value1, Integer value2) {
       addCriterion("URL_NO between", value1, value2, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNoNotBetween(Integer value1, Integer value2) {
       addCriterion("URL_NO not between", value1, value2, "urlNo");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIsNull() {
       addCriterion("URL is null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIsNotNull() {
       addCriterion("URL is not null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlEqualTo(String value) {
       addCriterion("URL =", value, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNotEqualTo(String value) {
       addCriterion("URL <>", value, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlGreaterThan(String value) {
       addCriterion("URL >", value, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlGreaterThanOrEqualTo(String value) {
       addCriterion("URL >=", value, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlLessThan(String value) {
       addCriterion("URL <", value, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlLessThanOrEqualTo(String value) {
       addCriterion("URL <=", value, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlLike(String value) {
       addCriterion("URL like", value, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNotLike(String value) {
       addCriterion("URL not like", value, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIn(List<String> values) {
       addCriterion("URL in", values, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNotIn(List<String> values) {
       addCriterion("URL not in", values, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlBetween(String value1, String value2) {
       addCriterion("URL between", value1, value2, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlNotBetween(String value1, String value2) {
       addCriterion("URL not between", value1, value2, "url");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserIsNull() {
       addCriterion("USER is null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserIsNotNull() {
       addCriterion("USER is not null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserEqualTo(String value) {
       addCriterion("USER =", value, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserNotEqualTo(String value) {
       addCriterion("USER <>", value, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserGreaterThan(String value) {
       addCriterion("USER >", value, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserGreaterThanOrEqualTo(String value) {
       addCriterion("USER >=", value, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserLessThan(String value) {
       addCriterion("USER <", value, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserLessThanOrEqualTo(String value) {
       addCriterion("USER <=", value, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserLike(String value) {
       addCriterion("USER like", value, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserNotLike(String value) {
       addCriterion("USER not like", value, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserIn(List<String> values) {
       addCriterion("USER in", values, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserNotIn(List<String> values) {
       addCriterion("USER not in", values, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserBetween(String value1, String value2) {
       addCriterion("USER between", value1, value2, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUserNotBetween(String value1, String value2) {
       addCriterion("USER not between", value1, value2, "user");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeIsNull() {
       addCriterion("URL_TYPE is null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeIsNotNull() {
       addCriterion("URL_TYPE is not null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeEqualTo(String value) {
       addCriterion("URL_TYPE =", value, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeNotEqualTo(String value) {
       addCriterion("URL_TYPE <>", value, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeGreaterThan(String value) {
       addCriterion("URL_TYPE >", value, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeGreaterThanOrEqualTo(String value) {
       addCriterion("URL_TYPE >=", value, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeLessThan(String value) {
       addCriterion("URL_TYPE <", value, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeLessThanOrEqualTo(String value) {
       addCriterion("URL_TYPE <=", value, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeLike(String value) {
       addCriterion("URL_TYPE like", value, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeNotLike(String value) {
       addCriterion("URL_TYPE not like", value, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeIn(List<String> values) {
       addCriterion("URL_TYPE in", values, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeNotIn(List<String> values) {
       addCriterion("URL_TYPE not in", values, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeBetween(String value1, String value2) {
       addCriterion("URL_TYPE between", value1, value2, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlTypeNotBetween(String value1, String value2) {
       addCriterion("URL_TYPE not between", value1, value2, "urlType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeIsNull() {
       addCriterion("SUB_TYPE is null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeIsNotNull() {
       addCriterion("SUB_TYPE is not null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeEqualTo(String value) {
       addCriterion("SUB_TYPE =", value, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeNotEqualTo(String value) {
       addCriterion("SUB_TYPE <>", value, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeGreaterThan(String value) {
       addCriterion("SUB_TYPE >", value, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeGreaterThanOrEqualTo(String value) {
       addCriterion("SUB_TYPE >=", value, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeLessThan(String value) {
       addCriterion("SUB_TYPE <", value, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeLessThanOrEqualTo(String value) {
       addCriterion("SUB_TYPE <=", value, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeLike(String value) {
       addCriterion("SUB_TYPE like", value, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeNotLike(String value) {
       addCriterion("SUB_TYPE not like", value, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeIn(List<String> values) {
       addCriterion("SUB_TYPE in", values, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeNotIn(List<String> values) {
       addCriterion("SUB_TYPE not in", values, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeBetween(String value1, String value2) {
       addCriterion("SUB_TYPE between", value1, value2, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andSubTypeNotBetween(String value1, String value2) {
       addCriterion("SUB_TYPE not between", value1, value2, "subType");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconIsNull() {
       addCriterion("URL_ICON is null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconIsNotNull() {
       addCriterion("URL_ICON is not null");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconEqualTo(String value) {
       addCriterion("URL_ICON =", value, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconNotEqualTo(String value) {
       addCriterion("URL_ICON <>", value, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconGreaterThan(String value) {
       addCriterion("URL_ICON >", value, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconGreaterThanOrEqualTo(String value) {
       addCriterion("URL_ICON >=", value, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconLessThan(String value) {
       addCriterion("URL_ICON <", value, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconLessThanOrEqualTo(String value) {
       addCriterion("URL_ICON <=", value, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconLike(String value) {
       addCriterion("URL_ICON like", value, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconNotLike(String value) {
       addCriterion("URL_ICON not like", value, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconIn(List<String> values) {
       addCriterion("URL_ICON in", values, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconNotIn(List<String> values) {
       addCriterion("URL_ICON not in", values, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconBetween(String value1, String value2) {
       addCriterion("URL_ICON between", value1, value2, "urlIcon");
       return (UrlExample.Criteria)this;
     }
 
     public UrlExample.Criteria andUrlIconNotBetween(String value1, String value2) {
       addCriterion("URL_ICON not between", value1, value2, "urlIcon");
       return (UrlExample.Criteria)this;
     }
   }
 }

