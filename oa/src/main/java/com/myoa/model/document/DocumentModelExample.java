package com.myoa.model.document;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DocumentModelExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public DocumentModelExample()
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

 public static class Criteria extends DocumentModelExample.GeneratedCriteria
 {
 }

 protected static abstract class GeneratedCriteria
 {
   protected List<DocumentModelExample.Criterion> criteria;

   protected GeneratedCriteria()
   {
     this.criteria = new ArrayList();
   }

   public boolean isValid() {
     return this.criteria.size() > 0;
   }

   public List<DocumentModelExample.Criterion> getAllCriteria() {
     return this.criteria;
   }

   public List<DocumentModelExample.Criterion> getCriteria() {
     return this.criteria;
   }

   protected void addCriterion(String condition) {
     if (condition == null) {
       throw new RuntimeException("Value for condition cannot be null");
     }
     this.criteria.add(new DocumentModelExample.Criterion(condition));
   }

   protected void addCriterion(String condition, Object value, String property) {
     if (value == null) {
       throw new RuntimeException("Value for " + property + " cannot be null");
     }
     this.criteria.add(new DocumentModelExample.Criterion(condition, value));
   }

   protected void addCriterion(String condition, Object value1, Object value2, String property) {
     if ((value1 == null) || (value2 == null)) {
       throw new RuntimeException("Between values for " + property + " cannot be null");
     }
     this.criteria.add(new DocumentModelExample.Criterion(condition, value1, value2));
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

    public DocumentModelExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleIsNull() {
       addCriterion("title is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleIsNotNull() {
       addCriterion("title is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleEqualTo(String value) {
       addCriterion("title =", value, "title");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleNotEqualTo(String value) {
       addCriterion("title <>", value, "title");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleGreaterThan(String value) {
       addCriterion("title >", value, "title");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
       addCriterion("title >=", value, "title");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleLessThan(String value) {
       addCriterion("title <", value, "title");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleLessThanOrEqualTo(String value) {
       addCriterion("title <=", value, "title");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleLike(String value) {
       addCriterion("title like", value, "title");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andTitleNotLike(String value) {
      addCriterion("title not like", value, "title");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andTitleIn(List<String> values) {
      addCriterion("title in", values, "title");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andTitleNotIn(List<String> values) {
      addCriterion("title not in", values, "title");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andTitleBetween(String value1, String value2) {
      addCriterion("title between", value1, value2, "title");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andTitleNotBetween(String value1, String value2) {
      addCriterion("title not between", value1, value2, "title");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andKeyWordIsNull() {
      addCriterion("key_word is null");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andKeyWordIsNotNull() {
      addCriterion("key_word is not null");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andKeyWordEqualTo(String value) {
      addCriterion("key_word =", value, "keyWord");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andKeyWordNotEqualTo(String value) {
      addCriterion("key_word <>", value, "keyWord");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andKeyWordGreaterThan(String value) {
      addCriterion("key_word >", value, "keyWord");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andKeyWordGreaterThanOrEqualTo(String value) {
      addCriterion("key_word >=", value, "keyWord");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andKeyWordLessThan(String value) {
      addCriterion("key_word <", value, "keyWord");
      return (DocumentModelExample.Criteria)this;
    }

    public DocumentModelExample.Criteria andKeyWordLessThanOrEqualTo(String value) {
      addCriterion("key_word <=", value, "keyWord");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andKeyWordLike(String value) {
       addCriterion("key_word like", value, "keyWord");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andKeyWordNotLike(String value) {
       addCriterion("key_word not like", value, "keyWord");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andKeyWordIn(List<String> values) {
       addCriterion("key_word in", values, "keyWord");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andKeyWordNotIn(List<String> values) {
       addCriterion("key_word not in", values, "keyWord");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andKeyWordBetween(String value1, String value2) {
       addCriterion("key_word between", value1, value2, "keyWord");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andKeyWordNotBetween(String value1, String value2) {
       addCriterion("key_word not between", value1, value2, "keyWord");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitIsNull() {
       addCriterion("unit is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitIsNotNull() {
       addCriterion("unit is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitEqualTo(String value) {
       addCriterion("unit =", value, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitNotEqualTo(String value) {
       addCriterion("unit <>", value, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitGreaterThan(String value) {
       addCriterion("unit >", value, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitGreaterThanOrEqualTo(String value) {
       addCriterion("unit >=", value, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitLessThan(String value) {
       addCriterion("unit <", value, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitLessThanOrEqualTo(String value) {
       addCriterion("unit <=", value, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitLike(String value) {
       addCriterion("unit like", value, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitNotLike(String value) {
       addCriterion("unit not like", value, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitIn(List<String> values) {
       addCriterion("unit in", values, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitNotIn(List<String> values) {
       addCriterion("unit not in", values, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitBetween(String value1, String value2) {
       addCriterion("unit between", value1, value2, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUnitNotBetween(String value1, String value2) {
       addCriterion("unit not between", value1, value2, "unit");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoIsNull() {
       addCriterion("doc_no is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoIsNotNull() {
       addCriterion("doc_no is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoEqualTo(String value) {
       addCriterion("doc_no =", value, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoNotEqualTo(String value) {
       addCriterion("doc_no <>", value, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoGreaterThan(String value) {
       addCriterion("doc_no >", value, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoGreaterThanOrEqualTo(String value) {
       addCriterion("doc_no >=", value, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoLessThan(String value) {
       addCriterion("doc_no <", value, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoLessThanOrEqualTo(String value) {
       addCriterion("doc_no <=", value, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoLike(String value) {
       addCriterion("doc_no like", value, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoNotLike(String value) {
       addCriterion("doc_no not like", value, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoIn(List<String> values) {
       addCriterion("doc_no in", values, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoNotIn(List<String> values) {
       addCriterion("doc_no not in", values, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoBetween(String value1, String value2) {
       addCriterion("doc_no between", value1, value2, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocNoNotBetween(String value1, String value2) {
       addCriterion("doc_no not between", value1, value2, "docNo");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyIsNull() {
       addCriterion("urgency is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyIsNotNull() {
       addCriterion("urgency is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyEqualTo(String value) {
       addCriterion("urgency =", value, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyNotEqualTo(String value) {
       addCriterion("urgency <>", value, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyGreaterThan(String value) {
       addCriterion("urgency >", value, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyGreaterThanOrEqualTo(String value) {
       addCriterion("urgency >=", value, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyLessThan(String value) {
       addCriterion("urgency <", value, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyLessThanOrEqualTo(String value) {
       addCriterion("urgency <=", value, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyLike(String value) {
       addCriterion("urgency like", value, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyNotLike(String value) {
       addCriterion("urgency not like", value, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyIn(List<String> values) {
       addCriterion("urgency in", values, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyNotIn(List<String> values) {
       addCriterion("urgency not in", values, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyBetween(String value1, String value2) {
       addCriterion("urgency between", value1, value2, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andUrgencyNotBetween(String value1, String value2) {
       addCriterion("urgency not between", value1, value2, "urgency");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyIsNull() {
       addCriterion("secrecy is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyIsNotNull() {
       addCriterion("secrecy is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyEqualTo(String value) {
       addCriterion("secrecy =", value, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyNotEqualTo(String value) {
       addCriterion("secrecy <>", value, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyGreaterThan(String value) {
       addCriterion("secrecy >", value, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyGreaterThanOrEqualTo(String value) {
       addCriterion("secrecy >=", value, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyLessThan(String value) {
       addCriterion("secrecy <", value, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyLessThanOrEqualTo(String value) {
       addCriterion("secrecy <=", value, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyLike(String value) {
       addCriterion("secrecy like", value, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyNotLike(String value) {
       addCriterion("secrecy not like", value, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyIn(List<String> values) {
       addCriterion("secrecy in", values, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyNotIn(List<String> values) {
       addCriterion("secrecy not in", values, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyBetween(String value1, String value2) {
       addCriterion("secrecy between", value1, value2, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andSecrecyNotBetween(String value1, String value2) {
       addCriterion("secrecy not between", value1, value2, "secrecy");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryIsNull() {
       addCriterion("main_delivery is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryIsNotNull() {
       addCriterion("main_delivery is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryEqualTo(String value) {
       addCriterion("main_delivery =", value, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryNotEqualTo(String value) {
       addCriterion("main_delivery <>", value, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryGreaterThan(String value) {
       addCriterion("main_delivery >", value, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryGreaterThanOrEqualTo(String value) {
       addCriterion("main_delivery >=", value, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryLessThan(String value) {
       addCriterion("main_delivery <", value, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryLessThanOrEqualTo(String value) {
       addCriterion("main_delivery <=", value, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryLike(String value) {
       addCriterion("main_delivery like", value, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryNotLike(String value) {
       addCriterion("main_delivery not like", value, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryIn(List<String> values) {
       addCriterion("main_delivery in", values, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryNotIn(List<String> values) {
       addCriterion("main_delivery not in", values, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryBetween(String value1, String value2) {
       addCriterion("main_delivery between", value1, value2, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainDeliveryNotBetween(String value1, String value2) {
       addCriterion("main_delivery not between", value1, value2, "mainDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryIsNull() {
       addCriterion("copy_delivery is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryIsNotNull() {
       addCriterion("copy_delivery is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryEqualTo(String value) {
       addCriterion("copy_delivery =", value, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryNotEqualTo(String value) {
       addCriterion("copy_delivery <>", value, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryGreaterThan(String value) {
       addCriterion("copy_delivery >", value, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryGreaterThanOrEqualTo(String value) {
       addCriterion("copy_delivery >=", value, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryLessThan(String value) {
       addCriterion("copy_delivery <", value, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryLessThanOrEqualTo(String value) {
       addCriterion("copy_delivery <=", value, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryLike(String value) {
       addCriterion("copy_delivery like", value, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryNotLike(String value) {
       addCriterion("copy_delivery not like", value, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryIn(List<String> values) {
       addCriterion("copy_delivery in", values, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryNotIn(List<String> values) {
       addCriterion("copy_delivery not in", values, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryBetween(String value1, String value2) {
       addCriterion("copy_delivery between", value1, value2, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopyDeliveryNotBetween(String value1, String value2) {
       addCriterion("copy_delivery not between", value1, value2, "copyDelivery");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineIsNull() {
       addCriterion("deadline is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineIsNotNull() {
       addCriterion("deadline is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineEqualTo(Integer value) {
       addCriterion("deadline =", value, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineNotEqualTo(Integer value) {
       addCriterion("deadline <>", value, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineGreaterThan(Integer value) {
       addCriterion("deadline >", value, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineGreaterThanOrEqualTo(Integer value) {
       addCriterion("deadline >=", value, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineLessThan(Integer value) {
       addCriterion("deadline <", value, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineLessThanOrEqualTo(Integer value) {
       addCriterion("deadline <=", value, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineIn(List<Integer> values) {
       addCriterion("deadline in", values, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineNotIn(List<Integer> values) {
       addCriterion("deadline not in", values, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineBetween(Integer value1, Integer value2) {
       addCriterion("deadline between", value1, value2, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDeadlineNotBetween(Integer value1, Integer value2) {
       addCriterion("deadline not between", value1, value2, "deadline");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesIsNull() {
       addCriterion("copies is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesIsNotNull() {
       addCriterion("copies is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesEqualTo(Integer value) {
       addCriterion("copies =", value, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesNotEqualTo(Integer value) {
       addCriterion("copies <>", value, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesGreaterThan(Integer value) {
       addCriterion("copies >", value, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesGreaterThanOrEqualTo(Integer value) {
       addCriterion("copies >=", value, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesLessThan(Integer value) {
       addCriterion("copies <", value, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesLessThanOrEqualTo(Integer value) {
       addCriterion("copies <=", value, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesIn(List<Integer> values) {
       addCriterion("copies in", values, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesNotIn(List<Integer> values) {
       addCriterion("copies not in", values, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesBetween(Integer value1, Integer value2) {
       addCriterion("copies between", value1, value2, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCopiesNotBetween(Integer value1, Integer value2) {
       addCriterion("copies not between", value1, value2, "copies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterIsNull() {
       addCriterion("creater is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterIsNotNull() {
       addCriterion("creater is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterEqualTo(String value) {
       addCriterion("creater =", value, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterNotEqualTo(String value) {
       addCriterion("creater <>", value, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterGreaterThan(String value) {
       addCriterion("creater >", value, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterGreaterThanOrEqualTo(String value) {
       addCriterion("creater >=", value, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterLessThan(String value) {
       addCriterion("creater <", value, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterLessThanOrEqualTo(String value) {
       addCriterion("creater <=", value, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterLike(String value) {
       addCriterion("creater like", value, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterNotLike(String value) {
       addCriterion("creater not like", value, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterIn(List<String> values) {
       addCriterion("creater in", values, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterNotIn(List<String> values) {
       addCriterion("creater not in", values, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterBetween(String value1, String value2) {
       addCriterion("creater between", value1, value2, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreaterNotBetween(String value1, String value2) {
       addCriterion("creater not between", value1, value2, "creater");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptIsNull() {
       addCriterion("create_dept is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptIsNotNull() {
       addCriterion("create_dept is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptEqualTo(String value) {
       addCriterion("create_dept =", value, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptNotEqualTo(String value) {
       addCriterion("create_dept <>", value, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptGreaterThan(String value) {
       addCriterion("create_dept >", value, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptGreaterThanOrEqualTo(String value) {
       addCriterion("create_dept >=", value, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptLessThan(String value) {
       addCriterion("create_dept <", value, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptLessThanOrEqualTo(String value) {
       addCriterion("create_dept <=", value, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptLike(String value) {
       addCriterion("create_dept like", value, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptNotLike(String value) {
       addCriterion("create_dept not like", value, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptIn(List<String> values) {
       addCriterion("create_dept in", values, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptNotIn(List<String> values) {
       addCriterion("create_dept not in", values, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptBetween(String value1, String value2) {
       addCriterion("create_dept between", value1, value2, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCreateDeptNotBetween(String value1, String value2) {
       addCriterion("create_dept not between", value1, value2, "createDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptIsNull() {
       addCriterion("print_dept is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptIsNotNull() {
       addCriterion("print_dept is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptEqualTo(String value) {
       addCriterion("print_dept =", value, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptNotEqualTo(String value) {
       addCriterion("print_dept <>", value, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptGreaterThan(String value) {
       addCriterion("print_dept >", value, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptGreaterThanOrEqualTo(String value) {
       addCriterion("print_dept >=", value, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptLessThan(String value) {
       addCriterion("print_dept <", value, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptLessThanOrEqualTo(String value) {
       addCriterion("print_dept <=", value, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptLike(String value) {
       addCriterion("print_dept like", value, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptNotLike(String value) {
       addCriterion("print_dept not like", value, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptIn(List<String> values) {
       addCriterion("print_dept in", values, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptNotIn(List<String> values) {
       addCriterion("print_dept not in", values, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptBetween(String value1, String value2) {
       addCriterion("print_dept between", value1, value2, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDeptNotBetween(String value1, String value2) {
       addCriterion("print_dept not between", value1, value2, "printDept");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateIsNull() {
       addCriterion("print_date is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateIsNotNull() {
       addCriterion("print_date is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("print_date =", value, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("print_date <>", value, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("print_date >", value, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("print_date >=", value, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("print_date <", value, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("print_date <=", value, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("print_date in", values, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("print_date not in", values, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("print_date between", value1, value2, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("print_date not between", value1, value2, "printDate");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeIsNull() {
       addCriterion("document_type is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeIsNotNull() {
       addCriterion("document_type is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeEqualTo(String value) {
       addCriterion("document_type =", value, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeNotEqualTo(String value) {
       addCriterion("document_type <>", value, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeGreaterThan(String value) {
       addCriterion("document_type >", value, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeGreaterThanOrEqualTo(String value) {
       addCriterion("document_type >=", value, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeLessThan(String value) {
       addCriterion("document_type <", value, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeLessThanOrEqualTo(String value) {
       addCriterion("document_type <=", value, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeLike(String value) {
       addCriterion("document_type like", value, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeNotLike(String value) {
       addCriterion("document_type not like", value, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeIn(List<String> values) {
       addCriterion("document_type in", values, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeNotIn(List<String> values) {
       addCriterion("document_type not in", values, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeBetween(String value1, String value2) {
       addCriterion("document_type between", value1, value2, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDocumentTypeNotBetween(String value1, String value2) {
       addCriterion("document_type not between", value1, value2, "documentType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeIsNull() {
       addCriterion("dispatch_type is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeIsNotNull() {
       addCriterion("dispatch_type is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeEqualTo(String value) {
       addCriterion("dispatch_type =", value, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeNotEqualTo(String value) {
       addCriterion("dispatch_type <>", value, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeGreaterThan(String value) {
       addCriterion("dispatch_type >", value, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeGreaterThanOrEqualTo(String value) {
       addCriterion("dispatch_type >=", value, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeLessThan(String value) {
       addCriterion("dispatch_type <", value, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeLessThanOrEqualTo(String value) {
       addCriterion("dispatch_type <=", value, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeLike(String value) {
       addCriterion("dispatch_type like", value, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeNotLike(String value) {
       addCriterion("dispatch_type not like", value, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeIn(List<String> values) {
       addCriterion("dispatch_type in", values, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeNotIn(List<String> values) {
       addCriterion("dispatch_type not in", values, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeBetween(String value1, String value2) {
       addCriterion("dispatch_type between", value1, value2, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andDispatchTypeNotBetween(String value1, String value2) {
       addCriterion("dispatch_type not between", value1, value2, "dispatchType");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileIsNull() {
       addCriterion("main_file is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileIsNotNull() {
       addCriterion("main_file is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileEqualTo(String value) {
       addCriterion("main_file =", value, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNotEqualTo(String value) {
       addCriterion("main_file <>", value, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileGreaterThan(String value) {
       addCriterion("main_file >", value, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileGreaterThanOrEqualTo(String value) {
       addCriterion("main_file >=", value, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileLessThan(String value) {
       addCriterion("main_file <", value, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileLessThanOrEqualTo(String value) {
       addCriterion("main_file <=", value, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileLike(String value) {
       addCriterion("main_file like", value, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNotLike(String value) {
       addCriterion("main_file not like", value, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileIn(List<String> values) {
       addCriterion("main_file in", values, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNotIn(List<String> values) {
       addCriterion("main_file not in", values, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileBetween(String value1, String value2) {
       addCriterion("main_file between", value1, value2, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNotBetween(String value1, String value2) {
       addCriterion("main_file not between", value1, value2, "mainFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameIsNull() {
       addCriterion("main_file_name is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameIsNotNull() {
       addCriterion("main_file_name is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameEqualTo(String value) {
       addCriterion("main_file_name =", value, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameNotEqualTo(String value) {
       addCriterion("main_file_name <>", value, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameGreaterThan(String value) {
       addCriterion("main_file_name >", value, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameGreaterThanOrEqualTo(String value) {
       addCriterion("main_file_name >=", value, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameLessThan(String value) {
       addCriterion("main_file_name <", value, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameLessThanOrEqualTo(String value) {
       addCriterion("main_file_name <=", value, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameLike(String value) {
       addCriterion("main_file_name like", value, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameNotLike(String value) {
       addCriterion("main_file_name not like", value, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameIn(List<String> values) {
       addCriterion("main_file_name in", values, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameNotIn(List<String> values) {
       addCriterion("main_file_name not in", values, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameBetween(String value1, String value2) {
       addCriterion("main_file_name between", value1, value2, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainFileNameNotBetween(String value1, String value2) {
       addCriterion("main_file_name not between", value1, value2, "mainFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesIsNull() {
       addCriterion("pages is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesIsNotNull() {
       addCriterion("pages is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesEqualTo(Integer value) {
       addCriterion("pages =", value, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesNotEqualTo(Integer value) {
       addCriterion("pages <>", value, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesGreaterThan(Integer value) {
       addCriterion("pages >", value, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesGreaterThanOrEqualTo(Integer value) {
       addCriterion("pages >=", value, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesLessThan(Integer value) {
       addCriterion("pages <", value, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesLessThanOrEqualTo(Integer value) {
       addCriterion("pages <=", value, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesIn(List<Integer> values) {
       addCriterion("pages in", values, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesNotIn(List<Integer> values) {
       addCriterion("pages not in", values, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesBetween(Integer value1, Integer value2) {
       addCriterion("pages between", value1, value2, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPagesNotBetween(Integer value1, Integer value2) {
       addCriterion("pages not between", value1, value2, "pages");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileIsNull() {
       addCriterion("main_aip_file is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileIsNotNull() {
       addCriterion("main_aip_file is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileEqualTo(String value) {
       addCriterion("main_aip_file =", value, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNotEqualTo(String value) {
       addCriterion("main_aip_file <>", value, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileGreaterThan(String value) {
       addCriterion("main_aip_file >", value, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileGreaterThanOrEqualTo(String value) {
       addCriterion("main_aip_file >=", value, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileLessThan(String value) {
       addCriterion("main_aip_file <", value, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileLessThanOrEqualTo(String value) {
       addCriterion("main_aip_file <=", value, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileLike(String value) {
       addCriterion("main_aip_file like", value, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNotLike(String value) {
       addCriterion("main_aip_file not like", value, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileIn(List<String> values) {
       addCriterion("main_aip_file in", values, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNotIn(List<String> values) {
       addCriterion("main_aip_file not in", values, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileBetween(String value1, String value2) {
       addCriterion("main_aip_file between", value1, value2, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNotBetween(String value1, String value2) {
       addCriterion("main_aip_file not between", value1, value2, "mainAipFile");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameIsNull() {
       addCriterion("main_aip_file_name is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameIsNotNull() {
       addCriterion("main_aip_file_name is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameEqualTo(String value) {
       addCriterion("main_aip_file_name =", value, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameNotEqualTo(String value) {
       addCriterion("main_aip_file_name <>", value, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameGreaterThan(String value) {
       addCriterion("main_aip_file_name >", value, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameGreaterThanOrEqualTo(String value) {
       addCriterion("main_aip_file_name >=", value, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameLessThan(String value) {
       addCriterion("main_aip_file_name <", value, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameLessThanOrEqualTo(String value) {
       addCriterion("main_aip_file_name <=", value, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameLike(String value) {
       addCriterion("main_aip_file_name like", value, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameNotLike(String value) {
       addCriterion("main_aip_file_name not like", value, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameIn(List<String> values) {
       addCriterion("main_aip_file_name in", values, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameNotIn(List<String> values) {
       addCriterion("main_aip_file_name not in", values, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameBetween(String value1, String value2) {
       addCriterion("main_aip_file_name between", value1, value2, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andMainAipFileNameNotBetween(String value1, String value2) {
       addCriterion("main_aip_file_name not between", value1, value2, "mainAipFileName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagIsNull() {
       addCriterion("public_flag is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagIsNotNull() {
       addCriterion("public_flag is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagEqualTo(String value) {
       addCriterion("public_flag =", value, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagNotEqualTo(String value) {
       addCriterion("public_flag <>", value, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagGreaterThan(String value) {
       addCriterion("public_flag >", value, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagGreaterThanOrEqualTo(String value) {
       addCriterion("public_flag >=", value, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagLessThan(String value) {
       addCriterion("public_flag <", value, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagLessThanOrEqualTo(String value) {
       addCriterion("public_flag <=", value, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagLike(String value) {
       addCriterion("public_flag like", value, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagNotLike(String value) {
       addCriterion("public_flag not like", value, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagIn(List<String> values) {
       addCriterion("public_flag in", values, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagNotIn(List<String> values) {
       addCriterion("public_flag not in", values, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagBetween(String value1, String value2) {
       addCriterion("public_flag between", value1, value2, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPublicFlagNotBetween(String value1, String value2) {
       addCriterion("public_flag not between", value1, value2, "publicFlag");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesIsNull() {
       addCriterion("print_copies is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesIsNotNull() {
       addCriterion("print_copies is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesEqualTo(Integer value) {
       addCriterion("print_copies =", value, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesNotEqualTo(Integer value) {
       addCriterion("print_copies <>", value, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesGreaterThan(Integer value) {
       addCriterion("print_copies >", value, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesGreaterThanOrEqualTo(Integer value) {
       addCriterion("print_copies >=", value, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesLessThan(Integer value) {
       addCriterion("print_copies <", value, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesLessThanOrEqualTo(Integer value) {
       addCriterion("print_copies <=", value, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesIn(List<Integer> values) {
       addCriterion("print_copies in", values, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesNotIn(List<Integer> values) {
       addCriterion("print_copies not in", values, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesBetween(Integer value1, Integer value2) {
       addCriterion("print_copies between", value1, value2, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintCopiesNotBetween(Integer value1, Integer value2) {
       addCriterion("print_copies not between", value1, value2, "printCopies");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserIsNull() {
       addCriterion("print_user is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserIsNotNull() {
       addCriterion("print_user is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserEqualTo(String value) {
       addCriterion("print_user =", value, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserNotEqualTo(String value) {
       addCriterion("print_user <>", value, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserGreaterThan(String value) {
       addCriterion("print_user >", value, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserGreaterThanOrEqualTo(String value) {
       addCriterion("print_user >=", value, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserLessThan(String value) {
       addCriterion("print_user <", value, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserLessThanOrEqualTo(String value) {
       addCriterion("print_user <=", value, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserLike(String value) {
       addCriterion("print_user like", value, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserNotLike(String value) {
       addCriterion("print_user not like", value, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserIn(List<String> values) {
       addCriterion("print_user in", values, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserNotIn(List<String> values) {
       addCriterion("print_user not in", values, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserBetween(String value1, String value2) {
       addCriterion("print_user between", value1, value2, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andPrintUserNotBetween(String value1, String value2) {
       addCriterion("print_user not between", value1, value2, "printUser");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdIsNull() {
       addCriterion("flow_id is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdIsNotNull() {
       addCriterion("flow_id is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdEqualTo(Integer value) {
       addCriterion("flow_id =", value, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdNotEqualTo(Integer value) {
       addCriterion("flow_id <>", value, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdGreaterThan(Integer value) {
       addCriterion("flow_id >", value, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("flow_id >=", value, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdLessThan(Integer value) {
       addCriterion("flow_id <", value, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdLessThanOrEqualTo(Integer value) {
       addCriterion("flow_id <=", value, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdIn(List<Integer> values) {
       addCriterion("flow_id in", values, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdNotIn(List<Integer> values) {
       addCriterion("flow_id not in", values, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdBetween(Integer value1, Integer value2) {
       addCriterion("flow_id between", value1, value2, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
       addCriterion("flow_id not between", value1, value2, "flowId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdIsNull() {
       addCriterion("run_id is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdIsNotNull() {
       addCriterion("run_id is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdEqualTo(Integer value) {
       addCriterion("run_id =", value, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdNotEqualTo(Integer value) {
       addCriterion("run_id <>", value, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdGreaterThan(Integer value) {
       addCriterion("run_id >", value, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("run_id >=", value, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdLessThan(Integer value) {
       addCriterion("run_id <", value, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdLessThanOrEqualTo(Integer value) {
       addCriterion("run_id <=", value, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdIn(List<Integer> values) {
       addCriterion("run_id in", values, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdNotIn(List<Integer> values) {
       addCriterion("run_id not in", values, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdBetween(Integer value1, Integer value2) {
       addCriterion("run_id between", value1, value2, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andRunIdNotBetween(Integer value1, Integer value2) {
       addCriterion("run_id not between", value1, value2, "runId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameIsNull() {
       addCriterion("flow_run_name is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameIsNotNull() {
       addCriterion("flow_run_name is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameEqualTo(String value) {
       addCriterion("flow_run_name =", value, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameNotEqualTo(String value) {
       addCriterion("flow_run_name <>", value, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameGreaterThan(String value) {
       addCriterion("flow_run_name >", value, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameGreaterThanOrEqualTo(String value) {
       addCriterion("flow_run_name >=", value, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameLessThan(String value) {
       addCriterion("flow_run_name <", value, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameLessThanOrEqualTo(String value) {
       addCriterion("flow_run_name <=", value, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameLike(String value) {
       addCriterion("flow_run_name like", value, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameNotLike(String value) {
       addCriterion("flow_run_name not like", value, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameIn(List<String> values) {
       addCriterion("flow_run_name in", values, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameNotIn(List<String> values) {
       addCriterion("flow_run_name not in", values, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameBetween(String value1, String value2) {
       addCriterion("flow_run_name between", value1, value2, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowRunNameNotBetween(String value1, String value2) {
       addCriterion("flow_run_name not between", value1, value2, "flowRunName");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusIsNull() {
       addCriterion("flow_status is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusIsNotNull() {
       addCriterion("flow_status is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusEqualTo(String value) {
       addCriterion("flow_status =", value, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusNotEqualTo(String value) {
       addCriterion("flow_status <>", value, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusGreaterThan(String value) {
       addCriterion("flow_status >", value, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusGreaterThanOrEqualTo(String value) {
       addCriterion("flow_status >=", value, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusLessThan(String value) {
       addCriterion("flow_status <", value, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusLessThanOrEqualTo(String value) {
       addCriterion("flow_status <=", value, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusLike(String value) {
       addCriterion("flow_status like", value, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusNotLike(String value) {
       addCriterion("flow_status not like", value, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusIn(List<String> values) {
       addCriterion("flow_status in", values, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusNotIn(List<String> values) {
       addCriterion("flow_status not in", values, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusBetween(String value1, String value2) {
       addCriterion("flow_status between", value1, value2, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowStatusNotBetween(String value1, String value2) {
       addCriterion("flow_status not between", value1, value2, "flowStatus");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsIsNull() {
       addCriterion("flow_prcs is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsIsNotNull() {
       addCriterion("flow_prcs is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsEqualTo(String value) {
       addCriterion("flow_prcs =", value, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsNotEqualTo(String value) {
       addCriterion("flow_prcs <>", value, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsGreaterThan(String value) {
       addCriterion("flow_prcs >", value, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsGreaterThanOrEqualTo(String value) {
       addCriterion("flow_prcs >=", value, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsLessThan(String value) {
       addCriterion("flow_prcs <", value, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsLessThanOrEqualTo(String value) {
       addCriterion("flow_prcs <=", value, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsLike(String value) {
       addCriterion("flow_prcs like", value, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsNotLike(String value) {
       addCriterion("flow_prcs not like", value, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsIn(List<String> values) {
       addCriterion("flow_prcs in", values, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsNotIn(List<String> values) {
       addCriterion("flow_prcs not in", values, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsBetween(String value1, String value2) {
       addCriterion("flow_prcs between", value1, value2, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andFlowPrcsNotBetween(String value1, String value2) {
       addCriterion("flow_prcs not between", value1, value2, "flowPrcs");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdIsNull() {
       addCriterion("cur_user_id is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdIsNotNull() {
       addCriterion("cur_user_id is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdEqualTo(String value) {
       addCriterion("cur_user_id =", value, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdNotEqualTo(String value) {
       addCriterion("cur_user_id <>", value, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdGreaterThan(String value) {
       addCriterion("cur_user_id >", value, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("cur_user_id >=", value, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdLessThan(String value) {
       addCriterion("cur_user_id <", value, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdLessThanOrEqualTo(String value) {
       addCriterion("cur_user_id <=", value, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdLike(String value) {
       addCriterion("cur_user_id like", value, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdNotLike(String value) {
       addCriterion("cur_user_id not like", value, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdIn(List<String> values) {
       addCriterion("cur_user_id in", values, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdNotIn(List<String> values) {
       addCriterion("cur_user_id not in", values, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdBetween(String value1, String value2) {
       addCriterion("cur_user_id between", value1, value2, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andCurUserIdNotBetween(String value1, String value2) {
       addCriterion("cur_user_id not between", value1, value2, "curUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdIsNull() {
       addCriterion("all_user_id is null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdIsNotNull() {
       addCriterion("all_user_id is not null");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdEqualTo(String value) {
       addCriterion("all_user_id =", value, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdNotEqualTo(String value) {
       addCriterion("all_user_id <>", value, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdGreaterThan(String value) {
       addCriterion("all_user_id >", value, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("all_user_id >=", value, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdLessThan(String value) {
       addCriterion("all_user_id <", value, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdLessThanOrEqualTo(String value) {
       addCriterion("all_user_id <=", value, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdLike(String value) {
       addCriterion("all_user_id like", value, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdNotLike(String value) {
       addCriterion("all_user_id not like", value, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdIn(List<String> values) {
       addCriterion("all_user_id in", values, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdNotIn(List<String> values) {
       addCriterion("all_user_id not in", values, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdBetween(String value1, String value2) {
       addCriterion("all_user_id between", value1, value2, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
 
     public DocumentModelExample.Criteria andAllUserIdNotBetween(String value1, String value2) {
       addCriterion("all_user_id not between", value1, value2, "allUserId");
       return (DocumentModelExample.Criteria)this;
     }
   }
 }
