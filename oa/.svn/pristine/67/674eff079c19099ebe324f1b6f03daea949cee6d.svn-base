 package com.myoa.model.im;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class ImChatDataExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public ImChatDataExample()
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
 
   public static class Criteria extends ImChatDataExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<ImChatDataExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<ImChatDataExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<ImChatDataExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new ImChatDataExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new ImChatDataExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new ImChatDataExample.Criterion(condition, value1, value2));
     }
 
     public ImChatDataExample.Criteria andListIdIsNull() {
       addCriterion("LIST_ID is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdIsNotNull() {
       addCriterion("LIST_ID is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdEqualTo(Integer value) {
       addCriterion("LIST_ID =", value, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdNotEqualTo(Integer value) {
       addCriterion("LIST_ID <>", value, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdGreaterThan(Integer value) {
       addCriterion("LIST_ID >", value, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("LIST_ID >=", value, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdLessThan(Integer value) {
       addCriterion("LIST_ID <", value, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdLessThanOrEqualTo(Integer value) {
       addCriterion("LIST_ID <=", value, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdIn(List<Integer> values) {
       addCriterion("LIST_ID in", values, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdNotIn(List<Integer> values) {
       addCriterion("LIST_ID not in", values, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdBetween(Integer value1, Integer value2) {
       addCriterion("LIST_ID between", value1, value2, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andListIdNotBetween(Integer value1, Integer value2) {
       addCriterion("LIST_ID not between", value1, value2, "listId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidIsNull() {
       addCriterion("FROM_UID is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidIsNotNull() {
       addCriterion("FROM_UID is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidEqualTo(String value) {
       addCriterion("FROM_UID =", value, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidNotEqualTo(String value) {
       addCriterion("FROM_UID <>", value, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidGreaterThan(String value) {
       addCriterion("FROM_UID >", value, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidGreaterThanOrEqualTo(String value) {
       addCriterion("FROM_UID >=", value, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidLessThan(String value) {
       addCriterion("FROM_UID <", value, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidLessThanOrEqualTo(String value) {
       addCriterion("FROM_UID <=", value, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidLike(String value) {
       addCriterion("FROM_UID like", value, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidNotLike(String value) {
       addCriterion("FROM_UID not like", value, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidIn(List<String> values) {
       addCriterion("FROM_UID in", values, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidNotIn(List<String> values) {
       addCriterion("FROM_UID not in", values, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidBetween(String value1, String value2) {
       addCriterion("FROM_UID between", value1, value2, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andFromUidNotBetween(String value1, String value2) {
       addCriterion("FROM_UID not between", value1, value2, "fromUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidIsNull() {
       addCriterion("TO_UID is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidIsNotNull() {
       addCriterion("TO_UID is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidEqualTo(String value) {
       addCriterion("TO_UID =", value, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidNotEqualTo(String value) {
       addCriterion("TO_UID <>", value, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidGreaterThan(String value) {
       addCriterion("TO_UID >", value, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidGreaterThanOrEqualTo(String value) {
       addCriterion("TO_UID >=", value, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidLessThan(String value) {
       addCriterion("TO_UID <", value, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidLessThanOrEqualTo(String value) {
       addCriterion("TO_UID <=", value, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidLike(String value) {
       addCriterion("TO_UID like", value, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidNotLike(String value) {
       addCriterion("TO_UID not like", value, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidIn(List<String> values) {
       addCriterion("TO_UID in", values, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidNotIn(List<String> values) {
       addCriterion("TO_UID not in", values, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidBetween(String value1, String value2) {
       addCriterion("TO_UID between", value1, value2, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andToUidNotBetween(String value1, String value2) {
       addCriterion("TO_UID not between", value1, value2, "toUid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromIsNull() {
       addCriterion("OF_FROM is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromIsNotNull() {
       addCriterion("OF_FROM is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromEqualTo(String value) {
       addCriterion("OF_FROM =", value, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromNotEqualTo(String value) {
       addCriterion("OF_FROM <>", value, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromGreaterThan(String value) {
       addCriterion("OF_FROM >", value, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromGreaterThanOrEqualTo(String value) {
       addCriterion("OF_FROM >=", value, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromLessThan(String value) {
       addCriterion("OF_FROM <", value, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromLessThanOrEqualTo(String value) {
       addCriterion("OF_FROM <=", value, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromLike(String value) {
       addCriterion("OF_FROM like", value, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromNotLike(String value) {
       addCriterion("OF_FROM not like", value, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromIn(List<String> values) {
       addCriterion("OF_FROM in", values, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromNotIn(List<String> values) {
       addCriterion("OF_FROM not in", values, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromBetween(String value1, String value2) {
       addCriterion("OF_FROM between", value1, value2, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfFromNotBetween(String value1, String value2) {
       addCriterion("OF_FROM not between", value1, value2, "ofFrom");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToIsNull() {
       addCriterion("OF_TO is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToIsNotNull() {
       addCriterion("OF_TO is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToEqualTo(String value) {
       addCriterion("OF_TO =", value, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToNotEqualTo(String value) {
       addCriterion("OF_TO <>", value, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToGreaterThan(String value) {
       addCriterion("OF_TO >", value, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToGreaterThanOrEqualTo(String value) {
       addCriterion("OF_TO >=", value, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToLessThan(String value) {
       addCriterion("OF_TO <", value, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToLessThanOrEqualTo(String value) {
       addCriterion("OF_TO <=", value, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToLike(String value) {
       addCriterion("OF_TO like", value, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToNotLike(String value) {
       addCriterion("OF_TO not like", value, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToIn(List<String> values) {
       addCriterion("OF_TO in", values, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToNotIn(List<String> values) {
       addCriterion("OF_TO not in", values, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToBetween(String value1, String value2) {
       addCriterion("OF_TO between", value1, value2, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andOfToNotBetween(String value1, String value2) {
       addCriterion("OF_TO not between", value1, value2, "ofTo");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeIsNull() {
       addCriterion("LAST_TIME is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeIsNotNull() {
       addCriterion("LAST_TIME is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeEqualTo(String value) {
       addCriterion("LAST_TIME =", value, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeNotEqualTo(String value) {
       addCriterion("LAST_TIME <>", value, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeGreaterThan(String value) {
       addCriterion("LAST_TIME >", value, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeGreaterThanOrEqualTo(String value) {
       addCriterion("LAST_TIME >=", value, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeLessThan(String value) {
       addCriterion("LAST_TIME <", value, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeLessThanOrEqualTo(String value) {
       addCriterion("LAST_TIME <=", value, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeLike(String value) {
       addCriterion("LAST_TIME like", value, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeNotLike(String value) {
       addCriterion("LAST_TIME not like", value, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeIn(List<String> values) {
       addCriterion("LAST_TIME in", values, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeNotIn(List<String> values) {
       addCriterion("LAST_TIME not in", values, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeBetween(String value1, String value2) {
       addCriterion("LAST_TIME between", value1, value2, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastTimeNotBetween(String value1, String value2) {
       addCriterion("LAST_TIME not between", value1, value2, "lastTime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeIsNull() {
       addCriterion("LAST_ATIME is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeIsNotNull() {
       addCriterion("LAST_ATIME is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeEqualTo(String value) {
       addCriterion("LAST_ATIME =", value, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeNotEqualTo(String value) {
       addCriterion("LAST_ATIME <>", value, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeGreaterThan(String value) {
       addCriterion("LAST_ATIME >", value, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeGreaterThanOrEqualTo(String value) {
       addCriterion("LAST_ATIME >=", value, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeLessThan(String value) {
       addCriterion("LAST_ATIME <", value, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeLessThanOrEqualTo(String value) {
       addCriterion("LAST_ATIME <=", value, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeLike(String value) {
       addCriterion("LAST_ATIME like", value, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeNotLike(String value) {
       addCriterion("LAST_ATIME not like", value, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeIn(List<String> values) {
       addCriterion("LAST_ATIME in", values, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeNotIn(List<String> values) {
       addCriterion("LAST_ATIME not in", values, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeBetween(String value1, String value2) {
       addCriterion("LAST_ATIME between", value1, value2, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastAtimeNotBetween(String value1, String value2) {
       addCriterion("LAST_ATIME not between", value1, value2, "lastAtime");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdIsNull() {
       addCriterion("LAST_FILE_ID is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdIsNotNull() {
       addCriterion("LAST_FILE_ID is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdEqualTo(String value) {
       addCriterion("LAST_FILE_ID =", value, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdNotEqualTo(String value) {
       addCriterion("LAST_FILE_ID <>", value, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdGreaterThan(String value) {
       addCriterion("LAST_FILE_ID >", value, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdGreaterThanOrEqualTo(String value) {
       addCriterion("LAST_FILE_ID >=", value, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdLessThan(String value) {
       addCriterion("LAST_FILE_ID <", value, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdLessThanOrEqualTo(String value) {
       addCriterion("LAST_FILE_ID <=", value, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdLike(String value) {
       addCriterion("LAST_FILE_ID like", value, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdNotLike(String value) {
       addCriterion("LAST_FILE_ID not like", value, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdIn(List<String> values) {
       addCriterion("LAST_FILE_ID in", values, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdNotIn(List<String> values) {
       addCriterion("LAST_FILE_ID not in", values, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdBetween(String value1, String value2) {
       addCriterion("LAST_FILE_ID between", value1, value2, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileIdNotBetween(String value1, String value2) {
       addCriterion("LAST_FILE_ID not between", value1, value2, "lastFileId");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameIsNull() {
       addCriterion("LAST_FILE_NAME is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameIsNotNull() {
       addCriterion("LAST_FILE_NAME is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameEqualTo(String value) {
       addCriterion("LAST_FILE_NAME =", value, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameNotEqualTo(String value) {
       addCriterion("LAST_FILE_NAME <>", value, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameGreaterThan(String value) {
       addCriterion("LAST_FILE_NAME >", value, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameGreaterThanOrEqualTo(String value) {
       addCriterion("LAST_FILE_NAME >=", value, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameLessThan(String value) {
       addCriterion("LAST_FILE_NAME <", value, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameLessThanOrEqualTo(String value) {
       addCriterion("LAST_FILE_NAME <=", value, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameLike(String value) {
       addCriterion("LAST_FILE_NAME like", value, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameNotLike(String value) {
       addCriterion("LAST_FILE_NAME not like", value, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameIn(List<String> values) {
       addCriterion("LAST_FILE_NAME in", values, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameNotIn(List<String> values) {
       addCriterion("LAST_FILE_NAME not in", values, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameBetween(String value1, String value2) {
       addCriterion("LAST_FILE_NAME between", value1, value2, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastFileNameNotBetween(String value1, String value2) {
       addCriterion("LAST_FILE_NAME not between", value1, value2, "lastFileName");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlIsNull() {
       addCriterion("LAST_THUMBNAIL_URL is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlIsNotNull() {
       addCriterion("LAST_THUMBNAIL_URL is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlEqualTo(String value) {
       addCriterion("LAST_THUMBNAIL_URL =", value, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlNotEqualTo(String value) {
       addCriterion("LAST_THUMBNAIL_URL <>", value, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlGreaterThan(String value) {
       addCriterion("LAST_THUMBNAIL_URL >", value, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlGreaterThanOrEqualTo(String value) {
       addCriterion("LAST_THUMBNAIL_URL >=", value, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlLessThan(String value) {
       addCriterion("LAST_THUMBNAIL_URL <", value, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlLessThanOrEqualTo(String value) {
       addCriterion("LAST_THUMBNAIL_URL <=", value, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlLike(String value) {
       addCriterion("LAST_THUMBNAIL_URL like", value, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlNotLike(String value) {
       addCriterion("LAST_THUMBNAIL_URL not like", value, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlIn(List<String> values) {
       addCriterion("LAST_THUMBNAIL_URL in", values, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlNotIn(List<String> values) {
       addCriterion("LAST_THUMBNAIL_URL not in", values, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlBetween(String value1, String value2) {
       addCriterion("LAST_THUMBNAIL_URL between", value1, value2, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andLastThumbnailUrlNotBetween(String value1, String value2) {
       addCriterion("LAST_THUMBNAIL_URL not between", value1, value2, "lastThumbnailUrl");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeIsNull() {
       addCriterion("TYPE is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeIsNotNull() {
       addCriterion("TYPE is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeEqualTo(String value) {
       addCriterion("TYPE =", value, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("TYPE <>", value, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("TYPE >", value, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("TYPE >=", value, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeLessThan(String value) {
       addCriterion("TYPE <", value, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("TYPE <=", value, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeLike(String value) {
       addCriterion("TYPE like", value, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeNotLike(String value) {
       addCriterion("TYPE not like", value, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeIn(List<String> values) {
       addCriterion("TYPE in", values, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("TYPE not in", values, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("TYPE between", value1, value2, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("TYPE not between", value1, value2, "type");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeIsNull() {
       addCriterion("MSG_TYPE is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeIsNotNull() {
       addCriterion("MSG_TYPE is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeEqualTo(String value) {
       addCriterion("MSG_TYPE =", value, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeNotEqualTo(String value) {
       addCriterion("MSG_TYPE <>", value, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeGreaterThan(String value) {
       addCriterion("MSG_TYPE >", value, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
       addCriterion("MSG_TYPE >=", value, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeLessThan(String value) {
       addCriterion("MSG_TYPE <", value, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeLessThanOrEqualTo(String value) {
       addCriterion("MSG_TYPE <=", value, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeLike(String value) {
       addCriterion("MSG_TYPE like", value, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeNotLike(String value) {
       addCriterion("MSG_TYPE not like", value, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeIn(List<String> values) {
       addCriterion("MSG_TYPE in", values, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeNotIn(List<String> values) {
       addCriterion("MSG_TYPE not in", values, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeBetween(String value1, String value2) {
       addCriterion("MSG_TYPE between", value1, value2, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgTypeNotBetween(String value1, String value2) {
       addCriterion("MSG_TYPE not between", value1, value2, "msgType");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreIsNull() {
       addCriterion("UID_IGNORE is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreIsNotNull() {
       addCriterion("UID_IGNORE is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreEqualTo(String value) {
       addCriterion("UID_IGNORE =", value, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreNotEqualTo(String value) {
       addCriterion("UID_IGNORE <>", value, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreGreaterThan(String value) {
       addCriterion("UID_IGNORE >", value, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreGreaterThanOrEqualTo(String value) {
       addCriterion("UID_IGNORE >=", value, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreLessThan(String value) {
       addCriterion("UID_IGNORE <", value, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreLessThanOrEqualTo(String value) {
       addCriterion("UID_IGNORE <=", value, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreLike(String value) {
       addCriterion("UID_IGNORE like", value, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreNotLike(String value) {
       addCriterion("UID_IGNORE not like", value, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreIn(List<String> values) {
       addCriterion("UID_IGNORE in", values, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreNotIn(List<String> values) {
       addCriterion("UID_IGNORE not in", values, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreBetween(String value1, String value2) {
       addCriterion("UID_IGNORE between", value1, value2, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUidIgnoreNotBetween(String value1, String value2) {
       addCriterion("UID_IGNORE not between", value1, value2, "uidIgnore");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidIsNull() {
       addCriterion("UUID is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidIsNotNull() {
       addCriterion("UUID is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidEqualTo(String value) {
       addCriterion("UUID =", value, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidNotEqualTo(String value) {
       addCriterion("UUID <>", value, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidGreaterThan(String value) {
       addCriterion("UUID >", value, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidGreaterThanOrEqualTo(String value) {
       addCriterion("UUID >=", value, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidLessThan(String value) {
       addCriterion("UUID <", value, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidLessThanOrEqualTo(String value) {
       addCriterion("UUID <=", value, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidLike(String value) {
       addCriterion("UUID like", value, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidNotLike(String value) {
       addCriterion("UUID not like", value, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidIn(List<String> values) {
       addCriterion("UUID in", values, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidNotIn(List<String> values) {
       addCriterion("UUID not in", values, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidBetween(String value1, String value2) {
       addCriterion("UUID between", value1, value2, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andUuidNotBetween(String value1, String value2) {
       addCriterion("UUID not between", value1, value2, "uuid");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeIsNull() {
       addCriterion("msg_free is null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeIsNotNull() {
       addCriterion("msg_free is not null");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeEqualTo(String value) {
       addCriterion("msg_free =", value, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeNotEqualTo(String value) {
       addCriterion("msg_free <>", value, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeGreaterThan(String value) {
       addCriterion("msg_free >", value, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeGreaterThanOrEqualTo(String value) {
       addCriterion("msg_free >=", value, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeLessThan(String value) {
       addCriterion("msg_free <", value, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeLessThanOrEqualTo(String value) {
       addCriterion("msg_free <=", value, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeLike(String value) {
       addCriterion("msg_free like", value, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeNotLike(String value) {
       addCriterion("msg_free not like", value, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeIn(List<String> values) {
       addCriterion("msg_free in", values, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeNotIn(List<String> values) {
       addCriterion("msg_free not in", values, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeBetween(String value1, String value2) {
       addCriterion("msg_free between", value1, value2, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
 
     public ImChatDataExample.Criteria andMsgFreeNotBetween(String value1, String value2) {
       addCriterion("msg_free not between", value1, value2, "msgFree");
       return (ImChatDataExample.Criteria)this;
     }
   }
 }

