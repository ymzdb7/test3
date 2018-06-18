 package com.myoa.model.book;
 
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.List;
 
 public class BookInfoExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public BookInfoExample()
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
 
   public static class Criteria extends BookInfoExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<BookInfoExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<BookInfoExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<BookInfoExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new BookInfoExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new BookInfoExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new BookInfoExample.Criterion(condition, value1, value2));
     }
 
     public BookInfoExample.Criteria andBookIdIsNull() {
       addCriterion("BOOK_ID is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdIsNotNull() {
       addCriterion("BOOK_ID is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdEqualTo(Integer value) {
       addCriterion("BOOK_ID =", value, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdNotEqualTo(Integer value) {
       addCriterion("BOOK_ID <>", value, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdGreaterThan(Integer value) {
       addCriterion("BOOK_ID >", value, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("BOOK_ID >=", value, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdLessThan(Integer value) {
       addCriterion("BOOK_ID <", value, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdLessThanOrEqualTo(Integer value) {
       addCriterion("BOOK_ID <=", value, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdIn(List<Integer> values) {
       addCriterion("BOOK_ID in", values, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdNotIn(List<Integer> values) {
       addCriterion("BOOK_ID not in", values, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdBetween(Integer value1, Integer value2) {
       addCriterion("BOOK_ID between", value1, value2, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookIdNotBetween(Integer value1, Integer value2) {
       addCriterion("BOOK_ID not between", value1, value2, "bookId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnIsNull() {
       addCriterion("ISBN is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnIsNotNull() {
       addCriterion("ISBN is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnEqualTo(String value) {
       addCriterion("ISBN =", value, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnNotEqualTo(String value) {
       addCriterion("ISBN <>", value, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnGreaterThan(String value) {
       addCriterion("ISBN >", value, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnGreaterThanOrEqualTo(String value) {
       addCriterion("ISBN >=", value, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnLessThan(String value) {
       addCriterion("ISBN <", value, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnLessThanOrEqualTo(String value) {
       addCriterion("ISBN <=", value, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnLike(String value) {
       addCriterion("ISBN like", value, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnNotLike(String value) {
       addCriterion("ISBN not like", value, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnIn(List<String> values) {
       addCriterion("ISBN in", values, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnNotIn(List<String> values) {
       addCriterion("ISBN not in", values, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnBetween(String value1, String value2) {
       addCriterion("ISBN between", value1, value2, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andIsbnNotBetween(String value1, String value2) {
       addCriterion("ISBN not between", value1, value2, "isbn");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdIsNull() {
       addCriterion("TYPE_ID is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdIsNotNull() {
       addCriterion("TYPE_ID is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdEqualTo(Integer value) {
       addCriterion("TYPE_ID =", value, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdNotEqualTo(Integer value) {
       addCriterion("TYPE_ID <>", value, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdGreaterThan(Integer value) {
       addCriterion("TYPE_ID >", value, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("TYPE_ID >=", value, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdLessThan(Integer value) {
       addCriterion("TYPE_ID <", value, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdLessThanOrEqualTo(Integer value) {
       addCriterion("TYPE_ID <=", value, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdIn(List<Integer> values) {
       addCriterion("TYPE_ID in", values, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdNotIn(List<Integer> values) {
       addCriterion("TYPE_ID not in", values, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdBetween(Integer value1, Integer value2) {
       addCriterion("TYPE_ID between", value1, value2, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
       addCriterion("TYPE_ID not between", value1, value2, "typeId");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptIsNull() {
       addCriterion("DEPT is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptIsNotNull() {
       addCriterion("DEPT is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptEqualTo(Integer value) {
       addCriterion("DEPT =", value, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptNotEqualTo(Integer value) {
       addCriterion("DEPT <>", value, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptGreaterThan(Integer value) {
       addCriterion("DEPT >", value, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptGreaterThanOrEqualTo(Integer value) {
       addCriterion("DEPT >=", value, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptLessThan(Integer value) {
       addCriterion("DEPT <", value, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptLessThanOrEqualTo(Integer value) {
       addCriterion("DEPT <=", value, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptIn(List<Integer> values) {
       addCriterion("DEPT in", values, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptNotIn(List<Integer> values) {
       addCriterion("DEPT not in", values, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptBetween(Integer value1, Integer value2) {
       addCriterion("DEPT between", value1, value2, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andDeptNotBetween(Integer value1, Integer value2) {
       addCriterion("DEPT not between", value1, value2, "dept");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameIsNull() {
       addCriterion("BOOK_NAME is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameIsNotNull() {
       addCriterion("BOOK_NAME is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameEqualTo(String value) {
       addCriterion("BOOK_NAME =", value, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameNotEqualTo(String value) {
       addCriterion("BOOK_NAME <>", value, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameGreaterThan(String value) {
       addCriterion("BOOK_NAME >", value, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameGreaterThanOrEqualTo(String value) {
       addCriterion("BOOK_NAME >=", value, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameLessThan(String value) {
       addCriterion("BOOK_NAME <", value, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameLessThanOrEqualTo(String value) {
       addCriterion("BOOK_NAME <=", value, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameLike(String value) {
       addCriterion("BOOK_NAME like", value, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameNotLike(String value) {
       addCriterion("BOOK_NAME not like", value, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameIn(List<String> values) {
       addCriterion("BOOK_NAME in", values, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameNotIn(List<String> values) {
       addCriterion("BOOK_NAME not in", values, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameBetween(String value1, String value2) {
       addCriterion("BOOK_NAME between", value1, value2, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNameNotBetween(String value1, String value2) {
       addCriterion("BOOK_NAME not between", value1, value2, "bookName");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAuthorIsNull() {
       addCriterion("AUTHOR is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAuthorIsNotNull() {
       addCriterion("AUTHOR is not null");
       return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorEqualTo(String value) {
      addCriterion("AUTHOR =", value, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorNotEqualTo(String value) {
      addCriterion("AUTHOR <>", value, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorGreaterThan(String value) {
      addCriterion("AUTHOR >", value, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorGreaterThanOrEqualTo(String value) {
      addCriterion("AUTHOR >=", value, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorLessThan(String value) {
      addCriterion("AUTHOR <", value, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorLessThanOrEqualTo(String value) {
      addCriterion("AUTHOR <=", value, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorLike(String value) {
      addCriterion("AUTHOR like", value, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorNotLike(String value) {
      addCriterion("AUTHOR not like", value, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorIn(List<String> values) {
      addCriterion("AUTHOR in", values, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorNotIn(List<String> values) {
      addCriterion("AUTHOR not in", values, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorBetween(String value1, String value2) {
      addCriterion("AUTHOR between", value1, value2, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andAuthorNotBetween(String value1, String value2) {
      addCriterion("AUTHOR not between", value1, value2, "author");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateIsNull() {
      addCriterion("PUB_DATE is null");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateIsNotNull() {
      addCriterion("PUB_DATE is not null");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateEqualTo(String value) {
      addCriterion("PUB_DATE =", value, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateNotEqualTo(String value) {
      addCriterion("PUB_DATE <>", value, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateGreaterThan(String value) {
      addCriterion("PUB_DATE >", value, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateGreaterThanOrEqualTo(String value) {
      addCriterion("PUB_DATE >=", value, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateLessThan(String value) {
      addCriterion("PUB_DATE <", value, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateLessThanOrEqualTo(String value) {
      addCriterion("PUB_DATE <=", value, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateLike(String value) {
      addCriterion("PUB_DATE like", value, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateNotLike(String value) {
      addCriterion("PUB_DATE not like", value, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateIn(List<String> values) {
      addCriterion("PUB_DATE in", values, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateNotIn(List<String> values) {
      addCriterion("PUB_DATE not in", values, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateBetween(String value1, String value2) {
      addCriterion("PUB_DATE between", value1, value2, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubDateNotBetween(String value1, String value2) {
      addCriterion("PUB_DATE not between", value1, value2, "pubDate");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubHouseIsNull() {
      addCriterion("PUB_HOUSE is null");
      return (BookInfoExample.Criteria)this;
    }

    public BookInfoExample.Criteria andPubHouseIsNotNull() {
       addCriterion("PUB_HOUSE is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseEqualTo(String value) {
       addCriterion("PUB_HOUSE =", value, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseNotEqualTo(String value) {
       addCriterion("PUB_HOUSE <>", value, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseGreaterThan(String value) {
       addCriterion("PUB_HOUSE >", value, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseGreaterThanOrEqualTo(String value) {
       addCriterion("PUB_HOUSE >=", value, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseLessThan(String value) {
       addCriterion("PUB_HOUSE <", value, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseLessThanOrEqualTo(String value) {
       addCriterion("PUB_HOUSE <=", value, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseLike(String value) {
       addCriterion("PUB_HOUSE like", value, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseNotLike(String value) {
       addCriterion("PUB_HOUSE not like", value, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseIn(List<String> values) {
       addCriterion("PUB_HOUSE in", values, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseNotIn(List<String> values) {
       addCriterion("PUB_HOUSE not in", values, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseBetween(String value1, String value2) {
       addCriterion("PUB_HOUSE between", value1, value2, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPubHouseNotBetween(String value1, String value2) {
       addCriterion("PUB_HOUSE not between", value1, value2, "pubHouse");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtIsNull() {
       addCriterion("AMT is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtIsNotNull() {
       addCriterion("AMT is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtEqualTo(Integer value) {
       addCriterion("AMT =", value, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtNotEqualTo(Integer value) {
       addCriterion("AMT <>", value, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtGreaterThan(Integer value) {
       addCriterion("AMT >", value, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtGreaterThanOrEqualTo(Integer value) {
       addCriterion("AMT >=", value, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtLessThan(Integer value) {
       addCriterion("AMT <", value, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtLessThanOrEqualTo(Integer value) {
       addCriterion("AMT <=", value, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtIn(List<Integer> values) {
       addCriterion("AMT in", values, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtNotIn(List<Integer> values) {
       addCriterion("AMT not in", values, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtBetween(Integer value1, Integer value2) {
       addCriterion("AMT between", value1, value2, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAmtNotBetween(Integer value1, Integer value2) {
       addCriterion("AMT not between", value1, value2, "amt");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceIsNull() {
       addCriterion("PRICE is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceIsNotNull() {
       addCriterion("PRICE is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceEqualTo(BigDecimal value) {
       addCriterion("PRICE =", value, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceNotEqualTo(BigDecimal value) {
       addCriterion("PRICE <>", value, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceGreaterThan(BigDecimal value) {
       addCriterion("PRICE >", value, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("PRICE >=", value, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceLessThan(BigDecimal value) {
       addCriterion("PRICE <", value, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
       addCriterion("PRICE <=", value, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceIn(List<BigDecimal> values) {
       addCriterion("PRICE in", values, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceNotIn(List<BigDecimal> values) {
       addCriterion("PRICE not in", values, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PRICE between", value1, value2, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PRICE not between", value1, value2, "price");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaIsNull() {
       addCriterion("AREA is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaIsNotNull() {
       addCriterion("AREA is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaEqualTo(String value) {
       addCriterion("AREA =", value, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaNotEqualTo(String value) {
       addCriterion("AREA <>", value, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaGreaterThan(String value) {
       addCriterion("AREA >", value, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaGreaterThanOrEqualTo(String value) {
       addCriterion("AREA >=", value, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaLessThan(String value) {
       addCriterion("AREA <", value, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaLessThanOrEqualTo(String value) {
       addCriterion("AREA <=", value, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaLike(String value) {
       addCriterion("AREA like", value, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaNotLike(String value) {
       addCriterion("AREA not like", value, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaIn(List<String> values) {
       addCriterion("AREA in", values, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaNotIn(List<String> values) {
       addCriterion("AREA not in", values, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaBetween(String value1, String value2) {
       addCriterion("AREA between", value1, value2, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andAreaNotBetween(String value1, String value2) {
       addCriterion("AREA not between", value1, value2, "area");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendIsNull() {
       addCriterion("LEND is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendIsNotNull() {
       addCriterion("LEND is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendEqualTo(String value) {
       addCriterion("LEND =", value, "lend");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendNotEqualTo(String value) {
       addCriterion("LEND <>", value, "lend");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendGreaterThan(String value) {
       addCriterion("LEND >", value, "lend");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendGreaterThanOrEqualTo(String value) {
       addCriterion("LEND >=", value, "lend");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendLessThan(String value) {
       addCriterion("LEND <", value, "lend");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendLessThanOrEqualTo(String value) {
       addCriterion("LEND <=", value, "lend");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendLike(String value) {
       addCriterion("LEND like", value, "lend");
			return (BookInfoExample.Criteria) this;
		}

		public BookInfoExample.Criteria andLendNotLike(String value) {
			addCriterion("LEND not like", value, "lend");
			return (BookInfoExample.Criteria) this;
		}

		public BookInfoExample.Criteria andLendIn(List<String> values) {
			addCriterion("LEND in", values, "lend");
			return (BookInfoExample.Criteria) this;
		}

		public BookInfoExample.Criteria andLendNotIn(List<String> values) {
			addCriterion("LEND not in", values, "lend");
			return (BookInfoExample.Criteria) this;
		}

     public BookInfoExample.Criteria andLendBetween(String value1, String value2) {
       addCriterion("LEND between", value1, value2, "lend");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andLendNotBetween(String value1, String value2) {
       addCriterion("LEND not between", value1, value2, "lend");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonIsNull() {
       addCriterion("BORR_PERSON is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonIsNotNull() {
       addCriterion("BORR_PERSON is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonEqualTo(String value) {
       addCriterion("BORR_PERSON =", value, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonNotEqualTo(String value) {
       addCriterion("BORR_PERSON <>", value, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonGreaterThan(String value) {
       addCriterion("BORR_PERSON >", value, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonGreaterThanOrEqualTo(String value) {
       addCriterion("BORR_PERSON >=", value, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonLessThan(String value) {
       addCriterion("BORR_PERSON <", value, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonLessThanOrEqualTo(String value) {
       addCriterion("BORR_PERSON <=", value, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonLike(String value) {
       addCriterion("BORR_PERSON like", value, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonNotLike(String value) {
       addCriterion("BORR_PERSON not like", value, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonIn(List<String> values) {
       addCriterion("BORR_PERSON in", values, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonNotIn(List<String> values) {
       addCriterion("BORR_PERSON not in", values, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonBetween(String value1, String value2) {
       addCriterion("BORR_PERSON between", value1, value2, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBorrPersonNotBetween(String value1, String value2) {
       addCriterion("BORR_PERSON not between", value1, value2, "borrPerson");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoIsNull() {
       addCriterion("MEMO is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoIsNotNull() {
       addCriterion("MEMO is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoEqualTo(String value) {
       addCriterion("MEMO =", value, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoNotEqualTo(String value) {
       addCriterion("MEMO <>", value, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoGreaterThan(String value) {
       addCriterion("MEMO >", value, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoGreaterThanOrEqualTo(String value) {
       addCriterion("MEMO >=", value, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoLessThan(String value) {
       addCriterion("MEMO <", value, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoLessThanOrEqualTo(String value) {
       addCriterion("MEMO <=", value, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoLike(String value) {
       addCriterion("MEMO like", value, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoNotLike(String value) {
       addCriterion("MEMO not like", value, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoIn(List<String> values) {
       addCriterion("MEMO in", values, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoNotIn(List<String> values) {
       addCriterion("MEMO not in", values, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoBetween(String value1, String value2) {
       addCriterion("MEMO between", value1, value2, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andMemoNotBetween(String value1, String value2) {
       addCriterion("MEMO not between", value1, value2, "memo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoIsNull() {
       addCriterion("BOOK_NO is null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoIsNotNull() {
       addCriterion("BOOK_NO is not null");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoEqualTo(String value) {
       addCriterion("BOOK_NO =", value, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoNotEqualTo(String value) {
       addCriterion("BOOK_NO <>", value, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoGreaterThan(String value) {
       addCriterion("BOOK_NO >", value, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoGreaterThanOrEqualTo(String value) {
       addCriterion("BOOK_NO >=", value, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoLessThan(String value) {
       addCriterion("BOOK_NO <", value, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoLessThanOrEqualTo(String value) {
       addCriterion("BOOK_NO <=", value, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoLike(String value) {
       addCriterion("BOOK_NO like", value, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoNotLike(String value) {
       addCriterion("BOOK_NO not like", value, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoIn(List<String> values) {
       addCriterion("BOOK_NO in", values, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoNotIn(List<String> values) {
       addCriterion("BOOK_NO not in", values, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoBetween(String value1, String value2) {
       addCriterion("BOOK_NO between", value1, value2, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
 
     public BookInfoExample.Criteria andBookNoNotBetween(String value1, String value2) {
       addCriterion("BOOK_NO not between", value1, value2, "bookNo");
       return (BookInfoExample.Criteria)this;
     }
   }
 }

