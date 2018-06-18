 package com.myoa.model.documentOrg;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class DocumentOrgExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public DocumentOrgExample()
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
 
   public static class Criteria extends DocumentOrgExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<DocumentOrgExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<DocumentOrgExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<DocumentOrgExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new DocumentOrgExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new DocumentOrgExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new DocumentOrgExample.Criterion(condition, value1, value2));
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
 
     public DocumentOrgExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleIsNull() {
       addCriterion("title is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleIsNotNull() {
       addCriterion("title is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleEqualTo(String value) {
       addCriterion("title =", value, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleNotEqualTo(String value) {
       addCriterion("title <>", value, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleGreaterThan(String value) {
       addCriterion("title >", value, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
       addCriterion("title >=", value, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleLessThan(String value) {
       addCriterion("title <", value, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleLessThanOrEqualTo(String value) {
       addCriterion("title <=", value, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleLike(String value) {
       addCriterion("title like", value, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleNotLike(String value) {
       addCriterion("title not like", value, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleIn(List<String> values) {
       addCriterion("title in", values, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleNotIn(List<String> values) {
       addCriterion("title not in", values, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleBetween(String value1, String value2) {
       addCriterion("title between", value1, value2, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTitleNotBetween(String value1, String value2) {
       addCriterion("title not between", value1, value2, "title");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordIsNull() {
       addCriterion("key_word is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordIsNotNull() {
       addCriterion("key_word is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordEqualTo(String value) {
       addCriterion("key_word =", value, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordNotEqualTo(String value) {
       addCriterion("key_word <>", value, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordGreaterThan(String value) {
       addCriterion("key_word >", value, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordGreaterThanOrEqualTo(String value) {
       addCriterion("key_word >=", value, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordLessThan(String value) {
       addCriterion("key_word <", value, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordLessThanOrEqualTo(String value) {
       addCriterion("key_word <=", value, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordLike(String value) {
       addCriterion("key_word like", value, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordNotLike(String value) {
       addCriterion("key_word not like", value, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordIn(List<String> values) {
       addCriterion("key_word in", values, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordNotIn(List<String> values) {
       addCriterion("key_word not in", values, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordBetween(String value1, String value2) {
       addCriterion("key_word between", value1, value2, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andKeyWordNotBetween(String value1, String value2) {
       addCriterion("key_word not between", value1, value2, "keyWord");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitIsNull() {
       addCriterion("unit is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitIsNotNull() {
       addCriterion("unit is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitEqualTo(String value) {
       addCriterion("unit =", value, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitNotEqualTo(String value) {
       addCriterion("unit <>", value, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitGreaterThan(String value) {
       addCriterion("unit >", value, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitGreaterThanOrEqualTo(String value) {
       addCriterion("unit >=", value, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitLessThan(String value) {
       addCriterion("unit <", value, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitLessThanOrEqualTo(String value) {
       addCriterion("unit <=", value, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitLike(String value) {
       addCriterion("unit like", value, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitNotLike(String value) {
       addCriterion("unit not like", value, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitIn(List<String> values) {
       addCriterion("unit in", values, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitNotIn(List<String> values) {
       addCriterion("unit not in", values, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitBetween(String value1, String value2) {
       addCriterion("unit between", value1, value2, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUnitNotBetween(String value1, String value2) {
       addCriterion("unit not between", value1, value2, "unit");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoIsNull() {
       addCriterion("doc_no is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoIsNotNull() {
       addCriterion("doc_no is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoEqualTo(String value) {
       addCriterion("doc_no =", value, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoNotEqualTo(String value) {
       addCriterion("doc_no <>", value, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoGreaterThan(String value) {
       addCriterion("doc_no >", value, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoGreaterThanOrEqualTo(String value) {
       addCriterion("doc_no >=", value, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoLessThan(String value) {
       addCriterion("doc_no <", value, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoLessThanOrEqualTo(String value) {
       addCriterion("doc_no <=", value, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoLike(String value) {
       addCriterion("doc_no like", value, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoNotLike(String value) {
       addCriterion("doc_no not like", value, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoIn(List<String> values) {
       addCriterion("doc_no in", values, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoNotIn(List<String> values) {
       addCriterion("doc_no not in", values, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoBetween(String value1, String value2) {
       addCriterion("doc_no between", value1, value2, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocNoNotBetween(String value1, String value2) {
       addCriterion("doc_no not between", value1, value2, "docNo");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyIsNull() {
       addCriterion("urgency is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyIsNotNull() {
       addCriterion("urgency is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyEqualTo(String value) {
       addCriterion("urgency =", value, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyNotEqualTo(String value) {
       addCriterion("urgency <>", value, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyGreaterThan(String value) {
       addCriterion("urgency >", value, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyGreaterThanOrEqualTo(String value) {
       addCriterion("urgency >=", value, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyLessThan(String value) {
       addCriterion("urgency <", value, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyLessThanOrEqualTo(String value) {
       addCriterion("urgency <=", value, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyLike(String value) {
       addCriterion("urgency like", value, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyNotLike(String value) {
       addCriterion("urgency not like", value, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyIn(List<String> values) {
       addCriterion("urgency in", values, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyNotIn(List<String> values) {
       addCriterion("urgency not in", values, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyBetween(String value1, String value2) {
       addCriterion("urgency between", value1, value2, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andUrgencyNotBetween(String value1, String value2) {
       addCriterion("urgency not between", value1, value2, "urgency");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyIsNull() {
       addCriterion("secrecy is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyIsNotNull() {
       addCriterion("secrecy is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyEqualTo(String value) {
       addCriterion("secrecy =", value, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyNotEqualTo(String value) {
       addCriterion("secrecy <>", value, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyGreaterThan(String value) {
       addCriterion("secrecy >", value, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyGreaterThanOrEqualTo(String value) {
       addCriterion("secrecy >=", value, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyLessThan(String value) {
       addCriterion("secrecy <", value, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyLessThanOrEqualTo(String value) {
       addCriterion("secrecy <=", value, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyLike(String value) {
       addCriterion("secrecy like", value, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyNotLike(String value) {
       addCriterion("secrecy not like", value, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyIn(List<String> values) {
       addCriterion("secrecy in", values, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyNotIn(List<String> values) {
       addCriterion("secrecy not in", values, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyBetween(String value1, String value2) {
       addCriterion("secrecy between", value1, value2, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andSecrecyNotBetween(String value1, String value2) {
       addCriterion("secrecy not between", value1, value2, "secrecy");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryIsNull() {
       addCriterion("main_delivery is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryIsNotNull() {
       addCriterion("main_delivery is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryEqualTo(String value) {
       addCriterion("main_delivery =", value, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryNotEqualTo(String value) {
       addCriterion("main_delivery <>", value, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryGreaterThan(String value) {
       addCriterion("main_delivery >", value, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryGreaterThanOrEqualTo(String value) {
       addCriterion("main_delivery >=", value, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryLessThan(String value) {
       addCriterion("main_delivery <", value, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryLessThanOrEqualTo(String value) {
       addCriterion("main_delivery <=", value, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryLike(String value) {
       addCriterion("main_delivery like", value, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryNotLike(String value) {
       addCriterion("main_delivery not like", value, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryIn(List<String> values) {
       addCriterion("main_delivery in", values, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryNotIn(List<String> values) {
       addCriterion("main_delivery not in", values, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryBetween(String value1, String value2) {
       addCriterion("main_delivery between", value1, value2, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainDeliveryNotBetween(String value1, String value2) {
       addCriterion("main_delivery not between", value1, value2, "mainDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryIsNull() {
       addCriterion("copy_delivery is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryIsNotNull() {
       addCriterion("copy_delivery is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryEqualTo(String value) {
       addCriterion("copy_delivery =", value, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryNotEqualTo(String value) {
       addCriterion("copy_delivery <>", value, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryGreaterThan(String value) {
       addCriterion("copy_delivery >", value, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryGreaterThanOrEqualTo(String value) {
       addCriterion("copy_delivery >=", value, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryLessThan(String value) {
       addCriterion("copy_delivery <", value, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryLessThanOrEqualTo(String value) {
       addCriterion("copy_delivery <=", value, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryLike(String value) {
       addCriterion("copy_delivery like", value, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryNotLike(String value) {
       addCriterion("copy_delivery not like", value, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryIn(List<String> values) {
       addCriterion("copy_delivery in", values, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryNotIn(List<String> values) {
       addCriterion("copy_delivery not in", values, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryBetween(String value1, String value2) {
       addCriterion("copy_delivery between", value1, value2, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopyDeliveryNotBetween(String value1, String value2) {
       addCriterion("copy_delivery not between", value1, value2, "copyDelivery");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineIsNull() {
       addCriterion("deadline is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineIsNotNull() {
       addCriterion("deadline is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineEqualTo(Integer value) {
       addCriterion("deadline =", value, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineNotEqualTo(Integer value) {
       addCriterion("deadline <>", value, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineGreaterThan(Integer value) {
       addCriterion("deadline >", value, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineGreaterThanOrEqualTo(Integer value) {
       addCriterion("deadline >=", value, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineLessThan(Integer value) {
       addCriterion("deadline <", value, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineLessThanOrEqualTo(Integer value) {
       addCriterion("deadline <=", value, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineIn(List<Integer> values) {
       addCriterion("deadline in", values, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineNotIn(List<Integer> values) {
       addCriterion("deadline not in", values, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineBetween(Integer value1, Integer value2) {
       addCriterion("deadline between", value1, value2, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDeadlineNotBetween(Integer value1, Integer value2) {
       addCriterion("deadline not between", value1, value2, "deadline");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesIsNull() {
       addCriterion("copies is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesIsNotNull() {
       addCriterion("copies is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesEqualTo(Integer value) {
       addCriterion("copies =", value, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesNotEqualTo(Integer value) {
       addCriterion("copies <>", value, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesGreaterThan(Integer value) {
       addCriterion("copies >", value, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesGreaterThanOrEqualTo(Integer value) {
       addCriterion("copies >=", value, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesLessThan(Integer value) {
       addCriterion("copies <", value, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesLessThanOrEqualTo(Integer value) {
       addCriterion("copies <=", value, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesIn(List<Integer> values) {
       addCriterion("copies in", values, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesNotIn(List<Integer> values) {
       addCriterion("copies not in", values, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesBetween(Integer value1, Integer value2) {
       addCriterion("copies between", value1, value2, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCopiesNotBetween(Integer value1, Integer value2) {
       addCriterion("copies not between", value1, value2, "copies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterIsNull() {
       addCriterion("creater is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterIsNotNull() {
       addCriterion("creater is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterEqualTo(String value) {
       addCriterion("creater =", value, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterNotEqualTo(String value) {
       addCriterion("creater <>", value, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterGreaterThan(String value) {
       addCriterion("creater >", value, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterGreaterThanOrEqualTo(String value) {
       addCriterion("creater >=", value, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterLessThan(String value) {
       addCriterion("creater <", value, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterLessThanOrEqualTo(String value) {
       addCriterion("creater <=", value, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterLike(String value) {
       addCriterion("creater like", value, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterNotLike(String value) {
       addCriterion("creater not like", value, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterIn(List<String> values) {
       addCriterion("creater in", values, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterNotIn(List<String> values) {
       addCriterion("creater not in", values, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterBetween(String value1, String value2) {
       addCriterion("creater between", value1, value2, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreaterNotBetween(String value1, String value2) {
       addCriterion("creater not between", value1, value2, "creater");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptIsNull() {
       addCriterion("create_dept is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptIsNotNull() {
       addCriterion("create_dept is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptEqualTo(String value) {
       addCriterion("create_dept =", value, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptNotEqualTo(String value) {
       addCriterion("create_dept <>", value, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptGreaterThan(String value) {
       addCriterion("create_dept >", value, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptGreaterThanOrEqualTo(String value) {
       addCriterion("create_dept >=", value, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptLessThan(String value) {
       addCriterion("create_dept <", value, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptLessThanOrEqualTo(String value) {
       addCriterion("create_dept <=", value, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptLike(String value) {
       addCriterion("create_dept like", value, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptNotLike(String value) {
       addCriterion("create_dept not like", value, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptIn(List<String> values) {
       addCriterion("create_dept in", values, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptNotIn(List<String> values) {
       addCriterion("create_dept not in", values, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptBetween(String value1, String value2) {
       addCriterion("create_dept between", value1, value2, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCreateDeptNotBetween(String value1, String value2) {
       addCriterion("create_dept not between", value1, value2, "createDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptIsNull() {
       addCriterion("print_dept is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptIsNotNull() {
       addCriterion("print_dept is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptEqualTo(String value) {
       addCriterion("print_dept =", value, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptNotEqualTo(String value) {
       addCriterion("print_dept <>", value, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptGreaterThan(String value) {
       addCriterion("print_dept >", value, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptGreaterThanOrEqualTo(String value) {
       addCriterion("print_dept >=", value, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptLessThan(String value) {
       addCriterion("print_dept <", value, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptLessThanOrEqualTo(String value) {
       addCriterion("print_dept <=", value, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptLike(String value) {
       addCriterion("print_dept like", value, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptNotLike(String value) {
       addCriterion("print_dept not like", value, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptIn(List<String> values) {
       addCriterion("print_dept in", values, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptNotIn(List<String> values) {
       addCriterion("print_dept not in", values, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptBetween(String value1, String value2) {
       addCriterion("print_dept between", value1, value2, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDeptNotBetween(String value1, String value2) {
       addCriterion("print_dept not between", value1, value2, "printDept");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateIsNull() {
       addCriterion("print_date is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateIsNotNull() {
       addCriterion("print_date is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("print_date =", value, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("print_date <>", value, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("print_date >", value, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("print_date >=", value, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("print_date <", value, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("print_date <=", value, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("print_date in", values, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("print_date not in", values, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("print_date between", value1, value2, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("print_date not between", value1, value2, "printDate");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeIsNull() {
       addCriterion("document_type is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeIsNotNull() {
       addCriterion("document_type is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeEqualTo(String value) {
       addCriterion("document_type =", value, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeNotEqualTo(String value) {
       addCriterion("document_type <>", value, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeGreaterThan(String value) {
       addCriterion("document_type >", value, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeGreaterThanOrEqualTo(String value) {
       addCriterion("document_type >=", value, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeLessThan(String value) {
       addCriterion("document_type <", value, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeLessThanOrEqualTo(String value) {
       addCriterion("document_type <=", value, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeLike(String value) {
       addCriterion("document_type like", value, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeNotLike(String value) {
       addCriterion("document_type not like", value, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeIn(List<String> values) {
       addCriterion("document_type in", values, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeNotIn(List<String> values) {
       addCriterion("document_type not in", values, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeBetween(String value1, String value2) {
       addCriterion("document_type between", value1, value2, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDocumentTypeNotBetween(String value1, String value2) {
       addCriterion("document_type not between", value1, value2, "documentType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeIsNull() {
       addCriterion("dispatch_type is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeIsNotNull() {
       addCriterion("dispatch_type is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeEqualTo(String value) {
       addCriterion("dispatch_type =", value, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeNotEqualTo(String value) {
       addCriterion("dispatch_type <>", value, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeGreaterThan(String value) {
       addCriterion("dispatch_type >", value, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeGreaterThanOrEqualTo(String value) {
       addCriterion("dispatch_type >=", value, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeLessThan(String value) {
       addCriterion("dispatch_type <", value, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeLessThanOrEqualTo(String value) {
       addCriterion("dispatch_type <=", value, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeLike(String value) {
       addCriterion("dispatch_type like", value, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeNotLike(String value) {
       addCriterion("dispatch_type not like", value, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeIn(List<String> values) {
       addCriterion("dispatch_type in", values, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeNotIn(List<String> values) {
       addCriterion("dispatch_type not in", values, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeBetween(String value1, String value2) {
       addCriterion("dispatch_type between", value1, value2, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andDispatchTypeNotBetween(String value1, String value2) {
       addCriterion("dispatch_type not between", value1, value2, "dispatchType");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileIsNull() {
       addCriterion("main_file is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileIsNotNull() {
       addCriterion("main_file is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileEqualTo(String value) {
       addCriterion("main_file =", value, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNotEqualTo(String value) {
       addCriterion("main_file <>", value, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileGreaterThan(String value) {
       addCriterion("main_file >", value, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileGreaterThanOrEqualTo(String value) {
       addCriterion("main_file >=", value, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileLessThan(String value) {
       addCriterion("main_file <", value, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileLessThanOrEqualTo(String value) {
       addCriterion("main_file <=", value, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileLike(String value) {
       addCriterion("main_file like", value, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNotLike(String value) {
       addCriterion("main_file not like", value, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileIn(List<String> values) {
       addCriterion("main_file in", values, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNotIn(List<String> values) {
       addCriterion("main_file not in", values, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileBetween(String value1, String value2) {
       addCriterion("main_file between", value1, value2, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNotBetween(String value1, String value2) {
       addCriterion("main_file not between", value1, value2, "mainFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameIsNull() {
       addCriterion("main_file_name is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameIsNotNull() {
       addCriterion("main_file_name is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameEqualTo(String value) {
       addCriterion("main_file_name =", value, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameNotEqualTo(String value) {
       addCriterion("main_file_name <>", value, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameGreaterThan(String value) {
       addCriterion("main_file_name >", value, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameGreaterThanOrEqualTo(String value) {
       addCriterion("main_file_name >=", value, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameLessThan(String value) {
       addCriterion("main_file_name <", value, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameLessThanOrEqualTo(String value) {
       addCriterion("main_file_name <=", value, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameLike(String value) {
       addCriterion("main_file_name like", value, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameNotLike(String value) {
       addCriterion("main_file_name not like", value, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameIn(List<String> values) {
       addCriterion("main_file_name in", values, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameNotIn(List<String> values) {
       addCriterion("main_file_name not in", values, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameBetween(String value1, String value2) {
       addCriterion("main_file_name between", value1, value2, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainFileNameNotBetween(String value1, String value2) {
       addCriterion("main_file_name not between", value1, value2, "mainFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesIsNull() {
       addCriterion("pages is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesIsNotNull() {
       addCriterion("pages is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesEqualTo(Integer value) {
       addCriterion("pages =", value, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesNotEqualTo(Integer value) {
       addCriterion("pages <>", value, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesGreaterThan(Integer value) {
       addCriterion("pages >", value, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesGreaterThanOrEqualTo(Integer value) {
       addCriterion("pages >=", value, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesLessThan(Integer value) {
       addCriterion("pages <", value, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesLessThanOrEqualTo(Integer value) {
       addCriterion("pages <=", value, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesIn(List<Integer> values) {
       addCriterion("pages in", values, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesNotIn(List<Integer> values) {
       addCriterion("pages not in", values, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesBetween(Integer value1, Integer value2) {
       addCriterion("pages between", value1, value2, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPagesNotBetween(Integer value1, Integer value2) {
       addCriterion("pages not between", value1, value2, "pages");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileIsNull() {
       addCriterion("main_aip_file is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileIsNotNull() {
       addCriterion("main_aip_file is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileEqualTo(String value) {
       addCriterion("main_aip_file =", value, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNotEqualTo(String value) {
       addCriterion("main_aip_file <>", value, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileGreaterThan(String value) {
       addCriterion("main_aip_file >", value, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileGreaterThanOrEqualTo(String value) {
       addCriterion("main_aip_file >=", value, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileLessThan(String value) {
       addCriterion("main_aip_file <", value, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileLessThanOrEqualTo(String value) {
       addCriterion("main_aip_file <=", value, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileLike(String value) {
       addCriterion("main_aip_file like", value, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNotLike(String value) {
       addCriterion("main_aip_file not like", value, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileIn(List<String> values) {
       addCriterion("main_aip_file in", values, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNotIn(List<String> values) {
       addCriterion("main_aip_file not in", values, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileBetween(String value1, String value2) {
       addCriterion("main_aip_file between", value1, value2, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNotBetween(String value1, String value2) {
       addCriterion("main_aip_file not between", value1, value2, "mainAipFile");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameIsNull() {
       addCriterion("main_aip_file_name is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameIsNotNull() {
       addCriterion("main_aip_file_name is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameEqualTo(String value) {
       addCriterion("main_aip_file_name =", value, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameNotEqualTo(String value) {
       addCriterion("main_aip_file_name <>", value, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameGreaterThan(String value) {
       addCriterion("main_aip_file_name >", value, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameGreaterThanOrEqualTo(String value) {
       addCriterion("main_aip_file_name >=", value, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameLessThan(String value) {
       addCriterion("main_aip_file_name <", value, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameLessThanOrEqualTo(String value) {
       addCriterion("main_aip_file_name <=", value, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameLike(String value) {
       addCriterion("main_aip_file_name like", value, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameNotLike(String value) {
       addCriterion("main_aip_file_name not like", value, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameIn(List<String> values) {
       addCriterion("main_aip_file_name in", values, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameNotIn(List<String> values) {
       addCriterion("main_aip_file_name not in", values, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameBetween(String value1, String value2) {
       addCriterion("main_aip_file_name between", value1, value2, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andMainAipFileNameNotBetween(String value1, String value2) {
       addCriterion("main_aip_file_name not between", value1, value2, "mainAipFileName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagIsNull() {
       addCriterion("public_flag is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagIsNotNull() {
       addCriterion("public_flag is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagEqualTo(String value) {
       addCriterion("public_flag =", value, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagNotEqualTo(String value) {
       addCriterion("public_flag <>", value, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagGreaterThan(String value) {
       addCriterion("public_flag >", value, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagGreaterThanOrEqualTo(String value) {
       addCriterion("public_flag >=", value, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagLessThan(String value) {
       addCriterion("public_flag <", value, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagLessThanOrEqualTo(String value) {
       addCriterion("public_flag <=", value, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagLike(String value) {
       addCriterion("public_flag like", value, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagNotLike(String value) {
       addCriterion("public_flag not like", value, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagIn(List<String> values) {
       addCriterion("public_flag in", values, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagNotIn(List<String> values) {
       addCriterion("public_flag not in", values, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagBetween(String value1, String value2) {
       addCriterion("public_flag between", value1, value2, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPublicFlagNotBetween(String value1, String value2) {
       addCriterion("public_flag not between", value1, value2, "publicFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesIsNull() {
       addCriterion("print_copies is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesIsNotNull() {
       addCriterion("print_copies is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesEqualTo(Integer value) {
       addCriterion("print_copies =", value, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesNotEqualTo(Integer value) {
       addCriterion("print_copies <>", value, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesGreaterThan(Integer value) {
       addCriterion("print_copies >", value, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesGreaterThanOrEqualTo(Integer value) {
       addCriterion("print_copies >=", value, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesLessThan(Integer value) {
       addCriterion("print_copies <", value, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesLessThanOrEqualTo(Integer value) {
       addCriterion("print_copies <=", value, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesIn(List<Integer> values) {
       addCriterion("print_copies in", values, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesNotIn(List<Integer> values) {
       addCriterion("print_copies not in", values, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesBetween(Integer value1, Integer value2) {
       addCriterion("print_copies between", value1, value2, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintCopiesNotBetween(Integer value1, Integer value2) {
       addCriterion("print_copies not between", value1, value2, "printCopies");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserIsNull() {
       addCriterion("print_user is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserIsNotNull() {
       addCriterion("print_user is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserEqualTo(String value) {
       addCriterion("print_user =", value, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserNotEqualTo(String value) {
       addCriterion("print_user <>", value, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserGreaterThan(String value) {
       addCriterion("print_user >", value, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserGreaterThanOrEqualTo(String value) {
       addCriterion("print_user >=", value, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserLessThan(String value) {
       addCriterion("print_user <", value, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserLessThanOrEqualTo(String value) {
       addCriterion("print_user <=", value, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserLike(String value) {
       addCriterion("print_user like", value, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserNotLike(String value) {
       addCriterion("print_user not like", value, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserIn(List<String> values) {
       addCriterion("print_user in", values, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserNotIn(List<String> values) {
       addCriterion("print_user not in", values, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserBetween(String value1, String value2) {
       addCriterion("print_user between", value1, value2, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andPrintUserNotBetween(String value1, String value2) {
       addCriterion("print_user not between", value1, value2, "printUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdIsNull() {
       addCriterion("flow_id is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdIsNotNull() {
       addCriterion("flow_id is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdEqualTo(Integer value) {
       addCriterion("flow_id =", value, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdNotEqualTo(Integer value) {
       addCriterion("flow_id <>", value, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdGreaterThan(Integer value) {
       addCriterion("flow_id >", value, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("flow_id >=", value, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdLessThan(Integer value) {
       addCriterion("flow_id <", value, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdLessThanOrEqualTo(Integer value) {
       addCriterion("flow_id <=", value, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdIn(List<Integer> values) {
       addCriterion("flow_id in", values, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdNotIn(List<Integer> values) {
       addCriterion("flow_id not in", values, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdBetween(Integer value1, Integer value2) {
       addCriterion("flow_id between", value1, value2, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
       addCriterion("flow_id not between", value1, value2, "flowId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdIsNull() {
       addCriterion("run_id is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdIsNotNull() {
       addCriterion("run_id is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdEqualTo(Integer value) {
       addCriterion("run_id =", value, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdNotEqualTo(Integer value) {
       addCriterion("run_id <>", value, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdGreaterThan(Integer value) {
       addCriterion("run_id >", value, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("run_id >=", value, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdLessThan(Integer value) {
       addCriterion("run_id <", value, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdLessThanOrEqualTo(Integer value) {
       addCriterion("run_id <=", value, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdIn(List<Integer> values) {
       addCriterion("run_id in", values, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdNotIn(List<Integer> values) {
       addCriterion("run_id not in", values, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdBetween(Integer value1, Integer value2) {
       addCriterion("run_id between", value1, value2, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andRunIdNotBetween(Integer value1, Integer value2) {
       addCriterion("run_id not between", value1, value2, "runId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameIsNull() {
       addCriterion("flow_run_name is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameIsNotNull() {
       addCriterion("flow_run_name is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameEqualTo(String value) {
       addCriterion("flow_run_name =", value, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameNotEqualTo(String value) {
       addCriterion("flow_run_name <>", value, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameGreaterThan(String value) {
       addCriterion("flow_run_name >", value, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameGreaterThanOrEqualTo(String value) {
       addCriterion("flow_run_name >=", value, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameLessThan(String value) {
       addCriterion("flow_run_name <", value, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameLessThanOrEqualTo(String value) {
       addCriterion("flow_run_name <=", value, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameLike(String value) {
       addCriterion("flow_run_name like", value, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameNotLike(String value) {
       addCriterion("flow_run_name not like", value, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameIn(List<String> values) {
       addCriterion("flow_run_name in", values, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameNotIn(List<String> values) {
       addCriterion("flow_run_name not in", values, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameBetween(String value1, String value2) {
       addCriterion("flow_run_name between", value1, value2, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowRunNameNotBetween(String value1, String value2) {
       addCriterion("flow_run_name not between", value1, value2, "flowRunName");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusIsNull() {
       addCriterion("flow_status is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusIsNotNull() {
       addCriterion("flow_status is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusEqualTo(String value) {
       addCriterion("flow_status =", value, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusNotEqualTo(String value) {
       addCriterion("flow_status <>", value, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusGreaterThan(String value) {
       addCriterion("flow_status >", value, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusGreaterThanOrEqualTo(String value) {
       addCriterion("flow_status >=", value, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusLessThan(String value) {
       addCriterion("flow_status <", value, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusLessThanOrEqualTo(String value) {
       addCriterion("flow_status <=", value, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusLike(String value) {
       addCriterion("flow_status like", value, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusNotLike(String value) {
       addCriterion("flow_status not like", value, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusIn(List<String> values) {
       addCriterion("flow_status in", values, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusNotIn(List<String> values) {
       addCriterion("flow_status not in", values, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusBetween(String value1, String value2) {
       addCriterion("flow_status between", value1, value2, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowStatusNotBetween(String value1, String value2) {
       addCriterion("flow_status not between", value1, value2, "flowStatus");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsIsNull() {
       addCriterion("flow_prcs is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsIsNotNull() {
       addCriterion("flow_prcs is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsEqualTo(String value) {
       addCriterion("flow_prcs =", value, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsNotEqualTo(String value) {
       addCriterion("flow_prcs <>", value, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsGreaterThan(String value) {
       addCriterion("flow_prcs >", value, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsGreaterThanOrEqualTo(String value) {
       addCriterion("flow_prcs >=", value, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsLessThan(String value) {
       addCriterion("flow_prcs <", value, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsLessThanOrEqualTo(String value) {
       addCriterion("flow_prcs <=", value, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsLike(String value) {
       addCriterion("flow_prcs like", value, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsNotLike(String value) {
       addCriterion("flow_prcs not like", value, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsIn(List<String> values) {
       addCriterion("flow_prcs in", values, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsNotIn(List<String> values) {
       addCriterion("flow_prcs not in", values, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsBetween(String value1, String value2) {
       addCriterion("flow_prcs between", value1, value2, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andFlowPrcsNotBetween(String value1, String value2) {
       addCriterion("flow_prcs not between", value1, value2, "flowPrcs");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdIsNull() {
       addCriterion("cur_user_id is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdIsNotNull() {
       addCriterion("cur_user_id is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdEqualTo(String value) {
       addCriterion("cur_user_id =", value, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdNotEqualTo(String value) {
       addCriterion("cur_user_id <>", value, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdGreaterThan(String value) {
       addCriterion("cur_user_id >", value, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("cur_user_id >=", value, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdLessThan(String value) {
       addCriterion("cur_user_id <", value, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdLessThanOrEqualTo(String value) {
       addCriterion("cur_user_id <=", value, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdLike(String value) {
       addCriterion("cur_user_id like", value, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdNotLike(String value) {
       addCriterion("cur_user_id not like", value, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdIn(List<String> values) {
       addCriterion("cur_user_id in", values, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdNotIn(List<String> values) {
       addCriterion("cur_user_id not in", values, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdBetween(String value1, String value2) {
       addCriterion("cur_user_id between", value1, value2, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andCurUserIdNotBetween(String value1, String value2) {
       addCriterion("cur_user_id not between", value1, value2, "curUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdIsNull() {
       addCriterion("all_user_id is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdIsNotNull() {
       addCriterion("all_user_id is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdEqualTo(String value) {
       addCriterion("all_user_id =", value, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdNotEqualTo(String value) {
       addCriterion("all_user_id <>", value, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdGreaterThan(String value) {
       addCriterion("all_user_id >", value, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("all_user_id >=", value, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdLessThan(String value) {
       addCriterion("all_user_id <", value, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdLessThanOrEqualTo(String value) {
       addCriterion("all_user_id <=", value, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdLike(String value) {
       addCriterion("all_user_id like", value, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdNotLike(String value) {
       addCriterion("all_user_id not like", value, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdIn(List<String> values) {
       addCriterion("all_user_id in", values, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdNotIn(List<String> values) {
       addCriterion("all_user_id not in", values, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdBetween(String value1, String value2) {
       addCriterion("all_user_id between", value1, value2, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andAllUserIdNotBetween(String value1, String value2) {
       addCriterion("all_user_id not between", value1, value2, "allUserId");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagIsNull() {
       addCriterion("transfer_flag is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagIsNotNull() {
       addCriterion("transfer_flag is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagEqualTo(Integer value) {
       addCriterion("transfer_flag =", value, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagNotEqualTo(Integer value) {
       addCriterion("transfer_flag <>", value, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagGreaterThan(Integer value) {
       addCriterion("transfer_flag >", value, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagGreaterThanOrEqualTo(Integer value) {
       addCriterion("transfer_flag >=", value, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagLessThan(Integer value) {
       addCriterion("transfer_flag <", value, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagLessThanOrEqualTo(Integer value) {
       addCriterion("transfer_flag <=", value, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagIn(List<Integer> values) {
       addCriterion("transfer_flag in", values, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagNotIn(List<Integer> values) {
       addCriterion("transfer_flag not in", values, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagBetween(Integer value1, Integer value2) {
       addCriterion("transfer_flag between", value1, value2, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferFlagNotBetween(Integer value1, Integer value2) {
       addCriterion("transfer_flag not between", value1, value2, "transferFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagIsNull() {
       addCriterion("org_flag is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagIsNotNull() {
       addCriterion("org_flag is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagEqualTo(Integer value) {
       addCriterion("org_flag =", value, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagNotEqualTo(Integer value) {
       addCriterion("org_flag <>", value, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagGreaterThan(Integer value) {
       addCriterion("org_flag >", value, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagGreaterThanOrEqualTo(Integer value) {
       addCriterion("org_flag >=", value, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagLessThan(Integer value) {
       addCriterion("org_flag <", value, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagLessThanOrEqualTo(Integer value) {
       addCriterion("org_flag <=", value, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagIn(List<Integer> values) {
       addCriterion("org_flag in", values, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagNotIn(List<Integer> values) {
       addCriterion("org_flag not in", values, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagBetween(Integer value1, Integer value2) {
       addCriterion("org_flag between", value1, value2, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andOrgFlagNotBetween(Integer value1, Integer value2) {
       addCriterion("org_flag not between", value1, value2, "orgFlag");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgIsNull() {
       addCriterion("transfer_org is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgIsNotNull() {
       addCriterion("transfer_org is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgEqualTo(String value) {
       addCriterion("transfer_org =", value, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgNotEqualTo(String value) {
       addCriterion("transfer_org <>", value, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgGreaterThan(String value) {
       addCriterion("transfer_org >", value, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgGreaterThanOrEqualTo(String value) {
       addCriterion("transfer_org >=", value, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgLessThan(String value) {
       addCriterion("transfer_org <", value, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgLessThanOrEqualTo(String value) {
       addCriterion("transfer_org <=", value, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgLike(String value) {
       addCriterion("transfer_org like", value, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgNotLike(String value) {
       addCriterion("transfer_org not like", value, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgIn(List<String> values) {
       addCriterion("transfer_org in", values, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgNotIn(List<String> values) {
       addCriterion("transfer_org not in", values, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgBetween(String value1, String value2) {
       addCriterion("transfer_org between", value1, value2, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferOrgNotBetween(String value1, String value2) {
       addCriterion("transfer_org not between", value1, value2, "transferOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserIsNull() {
       addCriterion("transfer_user is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserIsNotNull() {
       addCriterion("transfer_user is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserEqualTo(String value) {
       addCriterion("transfer_user =", value, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserNotEqualTo(String value) {
       addCriterion("transfer_user <>", value, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserGreaterThan(String value) {
       addCriterion("transfer_user >", value, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserGreaterThanOrEqualTo(String value) {
       addCriterion("transfer_user >=", value, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserLessThan(String value) {
       addCriterion("transfer_user <", value, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserLessThanOrEqualTo(String value) {
       addCriterion("transfer_user <=", value, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserLike(String value) {
       addCriterion("transfer_user like", value, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserNotLike(String value) {
       addCriterion("transfer_user not like", value, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserIn(List<String> values) {
       addCriterion("transfer_user in", values, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserNotIn(List<String> values) {
       addCriterion("transfer_user not in", values, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserBetween(String value1, String value2) {
       addCriterion("transfer_user between", value1, value2, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferUserNotBetween(String value1, String value2) {
       addCriterion("transfer_user not between", value1, value2, "transferUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgIsNull() {
       addCriterion("transfer_receive_org is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgIsNotNull() {
       addCriterion("transfer_receive_org is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgEqualTo(String value) {
       addCriterion("transfer_receive_org =", value, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgNotEqualTo(String value) {
       addCriterion("transfer_receive_org <>", value, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgGreaterThan(String value) {
       addCriterion("transfer_receive_org >", value, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgGreaterThanOrEqualTo(String value) {
       addCriterion("transfer_receive_org >=", value, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgLessThan(String value) {
       addCriterion("transfer_receive_org <", value, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgLessThanOrEqualTo(String value) {
       addCriterion("transfer_receive_org <=", value, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgLike(String value) {
       addCriterion("transfer_receive_org like", value, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgNotLike(String value) {
       addCriterion("transfer_receive_org not like", value, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgIn(List<String> values) {
       addCriterion("transfer_receive_org in", values, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgNotIn(List<String> values) {
       addCriterion("transfer_receive_org not in", values, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgBetween(String value1, String value2) {
       addCriterion("transfer_receive_org between", value1, value2, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveOrgNotBetween(String value1, String value2) {
       addCriterion("transfer_receive_org not between", value1, value2, "transferReceiveOrg");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserIsNull() {
       addCriterion("transfer_receive_user is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserIsNotNull() {
       addCriterion("transfer_receive_user is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserEqualTo(String value) {
       addCriterion("transfer_receive_user =", value, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserNotEqualTo(String value) {
       addCriterion("transfer_receive_user <>", value, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserGreaterThan(String value) {
       addCriterion("transfer_receive_user >", value, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserGreaterThanOrEqualTo(String value) {
       addCriterion("transfer_receive_user >=", value, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserLessThan(String value) {
       addCriterion("transfer_receive_user <", value, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserLessThanOrEqualTo(String value) {
       addCriterion("transfer_receive_user <=", value, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserLike(String value) {
       addCriterion("transfer_receive_user like", value, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserNotLike(String value) {
       addCriterion("transfer_receive_user not like", value, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserIn(List<String> values) {
       addCriterion("transfer_receive_user in", values, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserNotIn(List<String> values) {
       addCriterion("transfer_receive_user not in", values, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserBetween(String value1, String value2) {
       addCriterion("transfer_receive_user between", value1, value2, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferReceiveUserNotBetween(String value1, String value2) {
       addCriterion("transfer_receive_user not between", value1, value2, "transferReceiveUser");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeIsNull() {
       addCriterion("transfer_time is null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeIsNotNull() {
       addCriterion("transfer_time is not null");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeEqualTo(java.util.Date value) {
       addCriterion("transfer_time =", value, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeNotEqualTo(java.util.Date value) {
       addCriterion("transfer_time <>", value, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeGreaterThan(java.util.Date value) {
       addCriterion("transfer_time >", value, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("transfer_time >=", value, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeLessThan(java.util.Date value) {
       addCriterion("transfer_time <", value, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("transfer_time <=", value, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeIn(List<java.util.Date> values) {
       addCriterion("transfer_time in", values, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeNotIn(List<java.util.Date> values) {
       addCriterion("transfer_time not in", values, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("transfer_time between", value1, value2, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
 
     public DocumentOrgExample.Criteria andTransferTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("transfer_time not between", value1, value2, "transferTime");
       return (DocumentOrgExample.Criteria)this;
     }
   }
 }

