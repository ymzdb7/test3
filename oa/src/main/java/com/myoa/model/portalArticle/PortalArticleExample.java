 package com.myoa.model.portalArticle;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class PortalArticleExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public PortalArticleExample()
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
 
   public static class Criteria extends PortalArticleExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<PortalArticleExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<PortalArticleExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<PortalArticleExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new PortalArticleExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new PortalArticleExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new PortalArticleExample.Criterion(condition, value1, value2));
     }
 
     public PortalArticleExample.Criteria andArticleIdIsNull() {
       addCriterion("ARTICLE_ID is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdIsNotNull() {
       addCriterion("ARTICLE_ID is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdEqualTo(Integer value) {
       addCriterion("ARTICLE_ID =", value, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdNotEqualTo(Integer value) {
       addCriterion("ARTICLE_ID <>", value, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdGreaterThan(Integer value) {
       addCriterion("ARTICLE_ID >", value, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("ARTICLE_ID >=", value, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdLessThan(Integer value) {
       addCriterion("ARTICLE_ID <", value, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdLessThanOrEqualTo(Integer value) {
       addCriterion("ARTICLE_ID <=", value, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdIn(List<Integer> values) {
       addCriterion("ARTICLE_ID in", values, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdNotIn(List<Integer> values) {
       addCriterion("ARTICLE_ID not in", values, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdBetween(Integer value1, Integer value2) {
       addCriterion("ARTICLE_ID between", value1, value2, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
       addCriterion("ARTICLE_ID not between", value1, value2, "articleId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdIsNull() {
       addCriterion("COLUMN_ID is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdIsNotNull() {
       addCriterion("COLUMN_ID is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdEqualTo(Integer value) {
       addCriterion("COLUMN_ID =", value, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdNotEqualTo(Integer value) {
       addCriterion("COLUMN_ID <>", value, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdGreaterThan(Integer value) {
       addCriterion("COLUMN_ID >", value, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("COLUMN_ID >=", value, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdLessThan(Integer value) {
       addCriterion("COLUMN_ID <", value, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdLessThanOrEqualTo(Integer value) {
       addCriterion("COLUMN_ID <=", value, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdIn(List<Integer> values) {
       addCriterion("COLUMN_ID in", values, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdNotIn(List<Integer> values) {
       addCriterion("COLUMN_ID not in", values, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdBetween(Integer value1, Integer value2) {
       addCriterion("COLUMN_ID between", value1, value2, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andColumnIdNotBetween(Integer value1, Integer value2) {
       addCriterion("COLUMN_ID not between", value1, value2, "columnId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeIsNull() {
       addCriterion("CREATE_TIME is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("CREATE_TIME is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeEqualTo(Date value) {
       addCriterion("CREATE_TIME =", value, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeNotEqualTo(Date value) {
       addCriterion("CREATE_TIME <>", value, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeGreaterThan(Date value) {
       addCriterion("CREATE_TIME >", value, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME >=", value, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeLessThan(Date value) {
       addCriterion("CREATE_TIME <", value, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME <=", value, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeIn(List<Date> values) {
       addCriterion("CREATE_TIME in", values, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeNotIn(List<Date> values) {
       addCriterion("CREATE_TIME not in", values, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME between", value1, value2, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME not between", value1, value2, "CreateTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserIsNull() {
       addCriterion("CREATE_USER is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserIsNotNull() {
       addCriterion("CREATE_USER is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserEqualTo(String value) {
       addCriterion("CREATE_USER =", value, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNotEqualTo(String value) {
       addCriterion("CREATE_USER <>", value, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserGreaterThan(String value) {
       addCriterion("CREATE_USER >", value, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserGreaterThanOrEqualTo(String value) {
       addCriterion("CREATE_USER >=", value, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserLessThan(String value) {
       addCriterion("CREATE_USER <", value, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserLessThanOrEqualTo(String value) {
       addCriterion("CREATE_USER <=", value, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserLike(String value) {
       addCriterion("CREATE_USER like", value, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNotLike(String value) {
       addCriterion("CREATE_USER not like", value, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserIn(List<String> values) {
       addCriterion("CREATE_USER in", values, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNotIn(List<String> values) {
       addCriterion("CREATE_USER not in", values, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserBetween(String value1, String value2) {
       addCriterion("CREATE_USER between", value1, value2, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNotBetween(String value1, String value2) {
       addCriterion("CREATE_USER not between", value1, value2, "createUser");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameIsNull() {
       addCriterion("CREATE_USER_NAME is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameIsNotNull() {
       addCriterion("CREATE_USER_NAME is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameEqualTo(String value) {
       addCriterion("CREATE_USER_NAME =", value, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameNotEqualTo(String value) {
       addCriterion("CREATE_USER_NAME <>", value, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameGreaterThan(String value) {
       addCriterion("CREATE_USER_NAME >", value, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
       addCriterion("CREATE_USER_NAME >=", value, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameLessThan(String value) {
       addCriterion("CREATE_USER_NAME <", value, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameLessThanOrEqualTo(String value) {
       addCriterion("CREATE_USER_NAME <=", value, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameLike(String value) {
       addCriterion("CREATE_USER_NAME like", value, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameNotLike(String value) {
       addCriterion("CREATE_USER_NAME not like", value, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameIn(List<String> values) {
       addCriterion("CREATE_USER_NAME in", values, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameNotIn(List<String> values) {
       addCriterion("CREATE_USER_NAME not in", values, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameBetween(String value1, String value2) {
       addCriterion("CREATE_USER_NAME between", value1, value2, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andCreateUserNameNotBetween(String value1, String value2) {
       addCriterion("CREATE_USER_NAME not between", value1, value2, "createUserName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordIsNull() {
       addCriterion("KEY_WORD is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordIsNotNull() {
       addCriterion("KEY_WORD is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordEqualTo(String value) {
       addCriterion("KEY_WORD =", value, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordNotEqualTo(String value) {
       addCriterion("KEY_WORD <>", value, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordGreaterThan(String value) {
       addCriterion("KEY_WORD >", value, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordGreaterThanOrEqualTo(String value) {
       addCriterion("KEY_WORD >=", value, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordLessThan(String value) {
       addCriterion("KEY_WORD <", value, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordLessThanOrEqualTo(String value) {
       addCriterion("KEY_WORD <=", value, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordLike(String value) {
       addCriterion("KEY_WORD like", value, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordNotLike(String value) {
       addCriterion("KEY_WORD not like", value, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordIn(List<String> values) {
       addCriterion("KEY_WORD in", values, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordNotIn(List<String> values) {
       addCriterion("KEY_WORD not in", values, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordBetween(String value1, String value2) {
       addCriterion("KEY_WORD between", value1, value2, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andKeyWordNotBetween(String value1, String value2) {
       addCriterion("KEY_WORD not between", value1, value2, "keyWord");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceIsNull() {
       addCriterion("ARTICLE_SOURCE is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceIsNotNull() {
       addCriterion("ARTICLE_SOURCE is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceEqualTo(String value) {
       addCriterion("ARTICLE_SOURCE =", value, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceNotEqualTo(String value) {
       addCriterion("ARTICLE_SOURCE <>", value, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceGreaterThan(String value) {
       addCriterion("ARTICLE_SOURCE >", value, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceGreaterThanOrEqualTo(String value) {
       addCriterion("ARTICLE_SOURCE >=", value, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceLessThan(String value) {
       addCriterion("ARTICLE_SOURCE <", value, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceLessThanOrEqualTo(String value) {
       addCriterion("ARTICLE_SOURCE <=", value, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceLike(String value) {
       addCriterion("ARTICLE_SOURCE like", value, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceNotLike(String value) {
       addCriterion("ARTICLE_SOURCE not like", value, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceIn(List<String> values) {
       addCriterion("ARTICLE_SOURCE in", values, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceNotIn(List<String> values) {
       addCriterion("ARTICLE_SOURCE not in", values, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceBetween(String value1, String value2) {
       addCriterion("ARTICLE_SOURCE between", value1, value2, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andArticleSourceNotBetween(String value1, String value2) {
       addCriterion("ARTICLE_SOURCE not between", value1, value2, "articleSource");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorIsNull() {
       addCriterion("AUTHOR is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorIsNotNull() {
       addCriterion("AUTHOR is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorEqualTo(String value) {
       addCriterion("AUTHOR =", value, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorNotEqualTo(String value) {
       addCriterion("AUTHOR <>", value, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorGreaterThan(String value) {
       addCriterion("AUTHOR >", value, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorGreaterThanOrEqualTo(String value) {
       addCriterion("AUTHOR >=", value, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorLessThan(String value) {
       addCriterion("AUTHOR <", value, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorLessThanOrEqualTo(String value) {
       addCriterion("AUTHOR <=", value, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorLike(String value) {
       addCriterion("AUTHOR like", value, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorNotLike(String value) {
       addCriterion("AUTHOR not like", value, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorIn(List<String> values) {
       addCriterion("AUTHOR in", values, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorNotIn(List<String> values) {
       addCriterion("AUTHOR not in", values, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorBetween(String value1, String value2) {
       addCriterion("AUTHOR between", value1, value2, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorNotBetween(String value1, String value2) {
       addCriterion("AUTHOR not between", value1, value2, "author");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeIsNull() {
       addCriterion("AUTHOR_TIME is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeIsNotNull() {
       addCriterion("AUTHOR_TIME is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeEqualTo(Date value) {
       addCriterion("AUTHOR_TIME =", value, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeNotEqualTo(Date value) {
       addCriterion("AUTHOR_TIME <>", value, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeGreaterThan(Date value) {
       addCriterion("AUTHOR_TIME >", value, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("AUTHOR_TIME >=", value, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeLessThan(Date value) {
       addCriterion("AUTHOR_TIME <", value, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeLessThanOrEqualTo(Date value) {
       addCriterion("AUTHOR_TIME <=", value, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeIn(List<Date> values) {
       addCriterion("AUTHOR_TIME in", values, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeNotIn(List<Date> values) {
       addCriterion("AUTHOR_TIME not in", values, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeBetween(Date value1, Date value2) {
       addCriterion("AUTHOR_TIME between", value1, value2, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuthorTimeNotBetween(Date value1, Date value2) {
       addCriterion("AUTHOR_TIME not between", value1, value2, "authorTime");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnIsNull() {
       addCriterion("TOP_YN is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnIsNotNull() {
       addCriterion("TOP_YN is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnEqualTo(String value) {
       addCriterion("TOP_YN =", value, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnNotEqualTo(String value) {
       addCriterion("TOP_YN <>", value, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnGreaterThan(String value) {
       addCriterion("TOP_YN >", value, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnGreaterThanOrEqualTo(String value) {
       addCriterion("TOP_YN >=", value, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnLessThan(String value) {
       addCriterion("TOP_YN <", value, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnLessThanOrEqualTo(String value) {
       addCriterion("TOP_YN <=", value, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnLike(String value) {
       addCriterion("TOP_YN like", value, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnNotLike(String value) {
       addCriterion("TOP_YN not like", value, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnIn(List<String> values) {
       addCriterion("TOP_YN in", values, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnNotIn(List<String> values) {
       addCriterion("TOP_YN not in", values, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnBetween(String value1, String value2) {
       addCriterion("TOP_YN between", value1, value2, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andTopYnNotBetween(String value1, String value2) {
       addCriterion("TOP_YN not between", value1, value2, "topYn");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateIsNull() {
       addCriterion("AUDIT_STATE is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateIsNotNull() {
       addCriterion("AUDIT_STATE is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateEqualTo(String value) {
       addCriterion("AUDIT_STATE =", value, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateNotEqualTo(String value) {
       addCriterion("AUDIT_STATE <>", value, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateGreaterThan(String value) {
       addCriterion("AUDIT_STATE >", value, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateGreaterThanOrEqualTo(String value) {
       addCriterion("AUDIT_STATE >=", value, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateLessThan(String value) {
       addCriterion("AUDIT_STATE <", value, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateLessThanOrEqualTo(String value) {
       addCriterion("AUDIT_STATE <=", value, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateLike(String value) {
       addCriterion("AUDIT_STATE like", value, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateNotLike(String value) {
       addCriterion("AUDIT_STATE not like", value, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateIn(List<String> values) {
       addCriterion("AUDIT_STATE in", values, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateNotIn(List<String> values) {
       addCriterion("AUDIT_STATE not in", values, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateBetween(String value1, String value2) {
       addCriterion("AUDIT_STATE between", value1, value2, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAuditStateNotBetween(String value1, String value2) {
       addCriterion("AUDIT_STATE not between", value1, value2, "auditState");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdIsNull() {
       addCriterion("THUMBNAIL_ID is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdIsNotNull() {
       addCriterion("THUMBNAIL_ID is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdEqualTo(String value) {
       addCriterion("THUMBNAIL_ID =", value, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdNotEqualTo(String value) {
       addCriterion("THUMBNAIL_ID <>", value, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdGreaterThan(String value) {
       addCriterion("THUMBNAIL_ID >", value, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdGreaterThanOrEqualTo(String value) {
       addCriterion("THUMBNAIL_ID >=", value, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdLessThan(String value) {
       addCriterion("THUMBNAIL_ID <", value, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdLessThanOrEqualTo(String value) {
       addCriterion("THUMBNAIL_ID <=", value, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdLike(String value) {
       addCriterion("THUMBNAIL_ID like", value, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdNotLike(String value) {
       addCriterion("THUMBNAIL_ID not like", value, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdIn(List<String> values) {
       addCriterion("THUMBNAIL_ID in", values, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdNotIn(List<String> values) {
       addCriterion("THUMBNAIL_ID not in", values, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdBetween(String value1, String value2) {
       addCriterion("THUMBNAIL_ID between", value1, value2, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailIdNotBetween(String value1, String value2) {
       addCriterion("THUMBNAIL_ID not between", value1, value2, "thumbnailId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameIsNull() {
       addCriterion("THUMBNAIL_NAME is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameIsNotNull() {
       addCriterion("THUMBNAIL_NAME is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameEqualTo(String value) {
       addCriterion("THUMBNAIL_NAME =", value, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameNotEqualTo(String value) {
       addCriterion("THUMBNAIL_NAME <>", value, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameGreaterThan(String value) {
       addCriterion("THUMBNAIL_NAME >", value, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameGreaterThanOrEqualTo(String value) {
       addCriterion("THUMBNAIL_NAME >=", value, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameLessThan(String value) {
       addCriterion("THUMBNAIL_NAME <", value, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameLessThanOrEqualTo(String value) {
       addCriterion("THUMBNAIL_NAME <=", value, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameLike(String value) {
       addCriterion("THUMBNAIL_NAME like", value, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameNotLike(String value) {
       addCriterion("THUMBNAIL_NAME not like", value, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameIn(List<String> values) {
       addCriterion("THUMBNAIL_NAME in", values, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameNotIn(List<String> values) {
       addCriterion("THUMBNAIL_NAME not in", values, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameBetween(String value1, String value2) {
       addCriterion("THUMBNAIL_NAME between", value1, value2, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andThumbnailNameNotBetween(String value1, String value2) {
       addCriterion("THUMBNAIL_NAME not between", value1, value2, "thumbnailName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdIsNull() {
       addCriterion("ATTACHMENT_ID is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdIsNotNull() {
       addCriterion("ATTACHMENT_ID is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdEqualTo(String value) {
       addCriterion("ATTACHMENT_ID =", value, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdNotEqualTo(String value) {
       addCriterion("ATTACHMENT_ID <>", value, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdGreaterThan(String value) {
       addCriterion("ATTACHMENT_ID >", value, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdGreaterThanOrEqualTo(String value) {
       addCriterion("ATTACHMENT_ID >=", value, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdLessThan(String value) {
       addCriterion("ATTACHMENT_ID <", value, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdLessThanOrEqualTo(String value) {
       addCriterion("ATTACHMENT_ID <=", value, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdLike(String value) {
       addCriterion("ATTACHMENT_ID like", value, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdNotLike(String value) {
       addCriterion("ATTACHMENT_ID not like", value, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdIn(List<String> values) {
       addCriterion("ATTACHMENT_ID in", values, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdNotIn(List<String> values) {
       addCriterion("ATTACHMENT_ID not in", values, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdBetween(String value1, String value2) {
       addCriterion("ATTACHMENT_ID between", value1, value2, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentIdNotBetween(String value1, String value2) {
       addCriterion("ATTACHMENT_ID not between", value1, value2, "attachmentId");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameIsNull() {
       addCriterion("ATTACHMENT_NAME is null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameIsNotNull() {
       addCriterion("ATTACHMENT_NAME is not null");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameEqualTo(String value) {
       addCriterion("ATTACHMENT_NAME =", value, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameNotEqualTo(String value) {
       addCriterion("ATTACHMENT_NAME <>", value, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameGreaterThan(String value) {
       addCriterion("ATTACHMENT_NAME >", value, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameGreaterThanOrEqualTo(String value) {
       addCriterion("ATTACHMENT_NAME >=", value, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameLessThan(String value) {
       addCriterion("ATTACHMENT_NAME <", value, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameLessThanOrEqualTo(String value) {
       addCriterion("ATTACHMENT_NAME <=", value, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameLike(String value) {
       addCriterion("ATTACHMENT_NAME like", value, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameNotLike(String value) {
       addCriterion("ATTACHMENT_NAME not like", value, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameIn(List<String> values) {
       addCriterion("ATTACHMENT_NAME in", values, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameNotIn(List<String> values) {
       addCriterion("ATTACHMENT_NAME not in", values, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameBetween(String value1, String value2) {
       addCriterion("ATTACHMENT_NAME between", value1, value2, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
 
     public PortalArticleExample.Criteria andAttachmentNameNotBetween(String value1, String value2) {
       addCriterion("ATTACHMENT_NAME not between", value1, value2, "attachmentName");
       return (PortalArticleExample.Criteria)this;
     }
   }
 }
