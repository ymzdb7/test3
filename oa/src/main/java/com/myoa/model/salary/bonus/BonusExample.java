 package com.myoa.model.salary.bonus;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class BonusExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public BonusExample()
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
 
   public static class Criteria extends BonusExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<BonusExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<BonusExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<BonusExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new BonusExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new BonusExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new BonusExample.Criterion(condition, value1, value2));
     }
 
     public BonusExample.Criteria andBonusIdIsNull() {
       addCriterion("BONUS_ID is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdIsNotNull() {
       addCriterion("BONUS_ID is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdEqualTo(Integer value) {
       addCriterion("BONUS_ID =", value, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdNotEqualTo(Integer value) {
       addCriterion("BONUS_ID <>", value, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdGreaterThan(Integer value) {
       addCriterion("BONUS_ID >", value, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("BONUS_ID >=", value, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdLessThan(Integer value) {
       addCriterion("BONUS_ID <", value, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdLessThanOrEqualTo(Integer value) {
       addCriterion("BONUS_ID <=", value, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdIn(List<Integer> values) {
       addCriterion("BONUS_ID in", values, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdNotIn(List<Integer> values) {
       addCriterion("BONUS_ID not in", values, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdBetween(Integer value1, Integer value2) {
       addCriterion("BONUS_ID between", value1, value2, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andBonusIdNotBetween(Integer value1, Integer value2) {
       addCriterion("BONUS_ID not between", value1, value2, "bonusId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdIsNull() {
       addCriterion("HEAD_ID is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdIsNotNull() {
       addCriterion("HEAD_ID is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdEqualTo(Integer value) {
       addCriterion("HEAD_ID =", value, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdNotEqualTo(Integer value) {
       addCriterion("HEAD_ID <>", value, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdGreaterThan(Integer value) {
       addCriterion("HEAD_ID >", value, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("HEAD_ID >=", value, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdLessThan(Integer value) {
       addCriterion("HEAD_ID <", value, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdLessThanOrEqualTo(Integer value) {
       addCriterion("HEAD_ID <=", value, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdIn(List<Integer> values) {
       addCriterion("HEAD_ID in", values, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdNotIn(List<Integer> values) {
       addCriterion("HEAD_ID not in", values, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdBetween(Integer value1, Integer value2) {
       addCriterion("HEAD_ID between", value1, value2, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andHeadIdNotBetween(Integer value1, Integer value2) {
       addCriterion("HEAD_ID not between", value1, value2, "headId");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1IsNull() {
       addCriterion("DATA_1 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1IsNotNull() {
       addCriterion("DATA_1 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1EqualTo(String value) {
       addCriterion("DATA_1 =", value, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1NotEqualTo(String value) {
       addCriterion("DATA_1 <>", value, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1GreaterThan(String value) {
       addCriterion("DATA_1 >", value, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_1 >=", value, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1LessThan(String value) {
       addCriterion("DATA_1 <", value, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1LessThanOrEqualTo(String value) {
       addCriterion("DATA_1 <=", value, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1Like(String value) {
       addCriterion("DATA_1 like", value, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1NotLike(String value) {
       addCriterion("DATA_1 not like", value, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1In(List<String> values) {
       addCriterion("DATA_1 in", values, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1NotIn(List<String> values) {
       addCriterion("DATA_1 not in", values, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1Between(String value1, String value2) {
       addCriterion("DATA_1 between", value1, value2, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData1NotBetween(String value1, String value2) {
       addCriterion("DATA_1 not between", value1, value2, "data1");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2IsNull() {
       addCriterion("DATA_2 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2IsNotNull() {
       addCriterion("DATA_2 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2EqualTo(String value) {
       addCriterion("DATA_2 =", value, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2NotEqualTo(String value) {
       addCriterion("DATA_2 <>", value, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2GreaterThan(String value) {
       addCriterion("DATA_2 >", value, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_2 >=", value, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2LessThan(String value) {
       addCriterion("DATA_2 <", value, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2LessThanOrEqualTo(String value) {
       addCriterion("DATA_2 <=", value, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2Like(String value) {
       addCriterion("DATA_2 like", value, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2NotLike(String value) {
       addCriterion("DATA_2 not like", value, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2In(List<String> values) {
       addCriterion("DATA_2 in", values, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2NotIn(List<String> values) {
       addCriterion("DATA_2 not in", values, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2Between(String value1, String value2) {
       addCriterion("DATA_2 between", value1, value2, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData2NotBetween(String value1, String value2) {
       addCriterion("DATA_2 not between", value1, value2, "data2");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3IsNull() {
       addCriterion("DATA_3 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3IsNotNull() {
       addCriterion("DATA_3 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3EqualTo(String value) {
       addCriterion("DATA_3 =", value, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3NotEqualTo(String value) {
       addCriterion("DATA_3 <>", value, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3GreaterThan(String value) {
       addCriterion("DATA_3 >", value, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_3 >=", value, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3LessThan(String value) {
       addCriterion("DATA_3 <", value, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3LessThanOrEqualTo(String value) {
       addCriterion("DATA_3 <=", value, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3Like(String value) {
       addCriterion("DATA_3 like", value, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3NotLike(String value) {
       addCriterion("DATA_3 not like", value, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3In(List<String> values) {
       addCriterion("DATA_3 in", values, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3NotIn(List<String> values) {
       addCriterion("DATA_3 not in", values, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3Between(String value1, String value2) {
       addCriterion("DATA_3 between", value1, value2, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData3NotBetween(String value1, String value2) {
       addCriterion("DATA_3 not between", value1, value2, "data3");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4IsNull() {
       addCriterion("DATA_4 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4IsNotNull() {
       addCriterion("DATA_4 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4EqualTo(String value) {
       addCriterion("DATA_4 =", value, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4NotEqualTo(String value) {
       addCriterion("DATA_4 <>", value, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4GreaterThan(String value) {
       addCriterion("DATA_4 >", value, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_4 >=", value, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4LessThan(String value) {
       addCriterion("DATA_4 <", value, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4LessThanOrEqualTo(String value) {
       addCriterion("DATA_4 <=", value, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4Like(String value) {
       addCriterion("DATA_4 like", value, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4NotLike(String value) {
       addCriterion("DATA_4 not like", value, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4In(List<String> values) {
       addCriterion("DATA_4 in", values, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4NotIn(List<String> values) {
       addCriterion("DATA_4 not in", values, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4Between(String value1, String value2) {
       addCriterion("DATA_4 between", value1, value2, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData4NotBetween(String value1, String value2) {
       addCriterion("DATA_4 not between", value1, value2, "data4");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5IsNull() {
       addCriterion("DATA_5 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5IsNotNull() {
       addCriterion("DATA_5 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5EqualTo(String value) {
       addCriterion("DATA_5 =", value, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5NotEqualTo(String value) {
       addCriterion("DATA_5 <>", value, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5GreaterThan(String value) {
       addCriterion("DATA_5 >", value, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_5 >=", value, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5LessThan(String value) {
       addCriterion("DATA_5 <", value, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5LessThanOrEqualTo(String value) {
       addCriterion("DATA_5 <=", value, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5Like(String value) {
       addCriterion("DATA_5 like", value, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5NotLike(String value) {
       addCriterion("DATA_5 not like", value, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5In(List<String> values) {
       addCriterion("DATA_5 in", values, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5NotIn(List<String> values) {
       addCriterion("DATA_5 not in", values, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5Between(String value1, String value2) {
       addCriterion("DATA_5 between", value1, value2, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData5NotBetween(String value1, String value2) {
       addCriterion("DATA_5 not between", value1, value2, "data5");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6IsNull() {
       addCriterion("DATA_6 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6IsNotNull() {
       addCriterion("DATA_6 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6EqualTo(String value) {
       addCriterion("DATA_6 =", value, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6NotEqualTo(String value) {
       addCriterion("DATA_6 <>", value, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6GreaterThan(String value) {
       addCriterion("DATA_6 >", value, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_6 >=", value, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6LessThan(String value) {
       addCriterion("DATA_6 <", value, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6LessThanOrEqualTo(String value) {
       addCriterion("DATA_6 <=", value, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6Like(String value) {
       addCriterion("DATA_6 like", value, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6NotLike(String value) {
       addCriterion("DATA_6 not like", value, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6In(List<String> values) {
       addCriterion("DATA_6 in", values, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6NotIn(List<String> values) {
       addCriterion("DATA_6 not in", values, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6Between(String value1, String value2) {
       addCriterion("DATA_6 between", value1, value2, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData6NotBetween(String value1, String value2) {
       addCriterion("DATA_6 not between", value1, value2, "data6");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7IsNull() {
       addCriterion("DATA_7 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7IsNotNull() {
       addCriterion("DATA_7 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7EqualTo(String value) {
       addCriterion("DATA_7 =", value, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7NotEqualTo(String value) {
       addCriterion("DATA_7 <>", value, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7GreaterThan(String value) {
       addCriterion("DATA_7 >", value, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_7 >=", value, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7LessThan(String value) {
       addCriterion("DATA_7 <", value, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7LessThanOrEqualTo(String value) {
       addCriterion("DATA_7 <=", value, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7Like(String value) {
       addCriterion("DATA_7 like", value, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7NotLike(String value) {
       addCriterion("DATA_7 not like", value, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7In(List<String> values) {
       addCriterion("DATA_7 in", values, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7NotIn(List<String> values) {
       addCriterion("DATA_7 not in", values, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7Between(String value1, String value2) {
       addCriterion("DATA_7 between", value1, value2, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData7NotBetween(String value1, String value2) {
       addCriterion("DATA_7 not between", value1, value2, "data7");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8IsNull() {
       addCriterion("DATA_8 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8IsNotNull() {
       addCriterion("DATA_8 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8EqualTo(String value) {
       addCriterion("DATA_8 =", value, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8NotEqualTo(String value) {
       addCriterion("DATA_8 <>", value, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8GreaterThan(String value) {
       addCriterion("DATA_8 >", value, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_8 >=", value, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8LessThan(String value) {
       addCriterion("DATA_8 <", value, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8LessThanOrEqualTo(String value) {
       addCriterion("DATA_8 <=", value, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8Like(String value) {
       addCriterion("DATA_8 like", value, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8NotLike(String value) {
       addCriterion("DATA_8 not like", value, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8In(List<String> values) {
       addCriterion("DATA_8 in", values, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8NotIn(List<String> values) {
       addCriterion("DATA_8 not in", values, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8Between(String value1, String value2) {
       addCriterion("DATA_8 between", value1, value2, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData8NotBetween(String value1, String value2) {
       addCriterion("DATA_8 not between", value1, value2, "data8");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9IsNull() {
       addCriterion("DATA_9 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9IsNotNull() {
       addCriterion("DATA_9 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9EqualTo(String value) {
       addCriterion("DATA_9 =", value, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9NotEqualTo(String value) {
       addCriterion("DATA_9 <>", value, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9GreaterThan(String value) {
       addCriterion("DATA_9 >", value, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_9 >=", value, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9LessThan(String value) {
       addCriterion("DATA_9 <", value, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9LessThanOrEqualTo(String value) {
       addCriterion("DATA_9 <=", value, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9Like(String value) {
       addCriterion("DATA_9 like", value, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9NotLike(String value) {
       addCriterion("DATA_9 not like", value, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9In(List<String> values) {
       addCriterion("DATA_9 in", values, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9NotIn(List<String> values) {
       addCriterion("DATA_9 not in", values, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9Between(String value1, String value2) {
       addCriterion("DATA_9 between", value1, value2, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData9NotBetween(String value1, String value2) {
       addCriterion("DATA_9 not between", value1, value2, "data9");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10IsNull() {
       addCriterion("DATA_10 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10IsNotNull() {
       addCriterion("DATA_10 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10EqualTo(String value) {
       addCriterion("DATA_10 =", value, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10NotEqualTo(String value) {
       addCriterion("DATA_10 <>", value, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10GreaterThan(String value) {
       addCriterion("DATA_10 >", value, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_10 >=", value, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10LessThan(String value) {
       addCriterion("DATA_10 <", value, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10LessThanOrEqualTo(String value) {
       addCriterion("DATA_10 <=", value, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10Like(String value) {
       addCriterion("DATA_10 like", value, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10NotLike(String value) {
       addCriterion("DATA_10 not like", value, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10In(List<String> values) {
       addCriterion("DATA_10 in", values, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10NotIn(List<String> values) {
       addCriterion("DATA_10 not in", values, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10Between(String value1, String value2) {
       addCriterion("DATA_10 between", value1, value2, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData10NotBetween(String value1, String value2) {
       addCriterion("DATA_10 not between", value1, value2, "data10");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11IsNull() {
       addCriterion("DATA_11 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11IsNotNull() {
       addCriterion("DATA_11 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11EqualTo(String value) {
       addCriterion("DATA_11 =", value, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11NotEqualTo(String value) {
       addCriterion("DATA_11 <>", value, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11GreaterThan(String value) {
       addCriterion("DATA_11 >", value, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_11 >=", value, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11LessThan(String value) {
       addCriterion("DATA_11 <", value, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11LessThanOrEqualTo(String value) {
       addCriterion("DATA_11 <=", value, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11Like(String value) {
       addCriterion("DATA_11 like", value, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11NotLike(String value) {
       addCriterion("DATA_11 not like", value, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11In(List<String> values) {
       addCriterion("DATA_11 in", values, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11NotIn(List<String> values) {
       addCriterion("DATA_11 not in", values, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11Between(String value1, String value2) {
       addCriterion("DATA_11 between", value1, value2, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData11NotBetween(String value1, String value2) {
       addCriterion("DATA_11 not between", value1, value2, "data11");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12IsNull() {
       addCriterion("DATA_12 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12IsNotNull() {
       addCriterion("DATA_12 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12EqualTo(String value) {
       addCriterion("DATA_12 =", value, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12NotEqualTo(String value) {
       addCriterion("DATA_12 <>", value, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12GreaterThan(String value) {
       addCriterion("DATA_12 >", value, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_12 >=", value, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12LessThan(String value) {
       addCriterion("DATA_12 <", value, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12LessThanOrEqualTo(String value) {
       addCriterion("DATA_12 <=", value, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12Like(String value) {
       addCriterion("DATA_12 like", value, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12NotLike(String value) {
       addCriterion("DATA_12 not like", value, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12In(List<String> values) {
       addCriterion("DATA_12 in", values, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12NotIn(List<String> values) {
       addCriterion("DATA_12 not in", values, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12Between(String value1, String value2) {
       addCriterion("DATA_12 between", value1, value2, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData12NotBetween(String value1, String value2) {
       addCriterion("DATA_12 not between", value1, value2, "data12");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13IsNull() {
       addCriterion("DATA_13 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13IsNotNull() {
       addCriterion("DATA_13 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13EqualTo(String value) {
       addCriterion("DATA_13 =", value, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13NotEqualTo(String value) {
       addCriterion("DATA_13 <>", value, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13GreaterThan(String value) {
       addCriterion("DATA_13 >", value, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_13 >=", value, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13LessThan(String value) {
       addCriterion("DATA_13 <", value, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13LessThanOrEqualTo(String value) {
       addCriterion("DATA_13 <=", value, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13Like(String value) {
       addCriterion("DATA_13 like", value, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13NotLike(String value) {
       addCriterion("DATA_13 not like", value, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13In(List<String> values) {
       addCriterion("DATA_13 in", values, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13NotIn(List<String> values) {
       addCriterion("DATA_13 not in", values, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13Between(String value1, String value2) {
       addCriterion("DATA_13 between", value1, value2, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData13NotBetween(String value1, String value2) {
       addCriterion("DATA_13 not between", value1, value2, "data13");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14IsNull() {
       addCriterion("DATA_14 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14IsNotNull() {
       addCriterion("DATA_14 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14EqualTo(String value) {
       addCriterion("DATA_14 =", value, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14NotEqualTo(String value) {
       addCriterion("DATA_14 <>", value, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14GreaterThan(String value) {
       addCriterion("DATA_14 >", value, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_14 >=", value, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14LessThan(String value) {
       addCriterion("DATA_14 <", value, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14LessThanOrEqualTo(String value) {
       addCriterion("DATA_14 <=", value, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14Like(String value) {
       addCriterion("DATA_14 like", value, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14NotLike(String value) {
       addCriterion("DATA_14 not like", value, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14In(List<String> values) {
       addCriterion("DATA_14 in", values, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14NotIn(List<String> values) {
       addCriterion("DATA_14 not in", values, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14Between(String value1, String value2) {
       addCriterion("DATA_14 between", value1, value2, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData14NotBetween(String value1, String value2) {
       addCriterion("DATA_14 not between", value1, value2, "data14");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15IsNull() {
       addCriterion("DATA_15 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15IsNotNull() {
       addCriterion("DATA_15 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15EqualTo(String value) {
       addCriterion("DATA_15 =", value, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15NotEqualTo(String value) {
       addCriterion("DATA_15 <>", value, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15GreaterThan(String value) {
       addCriterion("DATA_15 >", value, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_15 >=", value, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15LessThan(String value) {
       addCriterion("DATA_15 <", value, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15LessThanOrEqualTo(String value) {
       addCriterion("DATA_15 <=", value, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15Like(String value) {
       addCriterion("DATA_15 like", value, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15NotLike(String value) {
       addCriterion("DATA_15 not like", value, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15In(List<String> values) {
       addCriterion("DATA_15 in", values, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15NotIn(List<String> values) {
       addCriterion("DATA_15 not in", values, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15Between(String value1, String value2) {
       addCriterion("DATA_15 between", value1, value2, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData15NotBetween(String value1, String value2) {
       addCriterion("DATA_15 not between", value1, value2, "data15");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16IsNull() {
       addCriterion("DATA_16 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16IsNotNull() {
       addCriterion("DATA_16 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16EqualTo(String value) {
       addCriterion("DATA_16 =", value, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16NotEqualTo(String value) {
       addCriterion("DATA_16 <>", value, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16GreaterThan(String value) {
       addCriterion("DATA_16 >", value, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_16 >=", value, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16LessThan(String value) {
       addCriterion("DATA_16 <", value, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16LessThanOrEqualTo(String value) {
       addCriterion("DATA_16 <=", value, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16Like(String value) {
       addCriterion("DATA_16 like", value, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16NotLike(String value) {
       addCriterion("DATA_16 not like", value, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16In(List<String> values) {
       addCriterion("DATA_16 in", values, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16NotIn(List<String> values) {
       addCriterion("DATA_16 not in", values, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16Between(String value1, String value2) {
       addCriterion("DATA_16 between", value1, value2, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData16NotBetween(String value1, String value2) {
       addCriterion("DATA_16 not between", value1, value2, "data16");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17IsNull() {
       addCriterion("DATA_17 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17IsNotNull() {
       addCriterion("DATA_17 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17EqualTo(String value) {
       addCriterion("DATA_17 =", value, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17NotEqualTo(String value) {
       addCriterion("DATA_17 <>", value, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17GreaterThan(String value) {
       addCriterion("DATA_17 >", value, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_17 >=", value, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17LessThan(String value) {
       addCriterion("DATA_17 <", value, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17LessThanOrEqualTo(String value) {
       addCriterion("DATA_17 <=", value, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17Like(String value) {
       addCriterion("DATA_17 like", value, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17NotLike(String value) {
       addCriterion("DATA_17 not like", value, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17In(List<String> values) {
       addCriterion("DATA_17 in", values, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17NotIn(List<String> values) {
       addCriterion("DATA_17 not in", values, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17Between(String value1, String value2) {
       addCriterion("DATA_17 between", value1, value2, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData17NotBetween(String value1, String value2) {
       addCriterion("DATA_17 not between", value1, value2, "data17");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18IsNull() {
       addCriterion("DATA_18 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18IsNotNull() {
       addCriterion("DATA_18 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18EqualTo(String value) {
       addCriterion("DATA_18 =", value, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18NotEqualTo(String value) {
       addCriterion("DATA_18 <>", value, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18GreaterThan(String value) {
       addCriterion("DATA_18 >", value, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_18 >=", value, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18LessThan(String value) {
       addCriterion("DATA_18 <", value, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18LessThanOrEqualTo(String value) {
       addCriterion("DATA_18 <=", value, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18Like(String value) {
       addCriterion("DATA_18 like", value, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18NotLike(String value) {
       addCriterion("DATA_18 not like", value, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18In(List<String> values) {
       addCriterion("DATA_18 in", values, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18NotIn(List<String> values) {
       addCriterion("DATA_18 not in", values, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18Between(String value1, String value2) {
       addCriterion("DATA_18 between", value1, value2, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData18NotBetween(String value1, String value2) {
       addCriterion("DATA_18 not between", value1, value2, "data18");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19IsNull() {
       addCriterion("DATA_19 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19IsNotNull() {
       addCriterion("DATA_19 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19EqualTo(String value) {
       addCriterion("DATA_19 =", value, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19NotEqualTo(String value) {
       addCriterion("DATA_19 <>", value, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19GreaterThan(String value) {
       addCriterion("DATA_19 >", value, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_19 >=", value, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19LessThan(String value) {
       addCriterion("DATA_19 <", value, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19LessThanOrEqualTo(String value) {
       addCriterion("DATA_19 <=", value, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19Like(String value) {
       addCriterion("DATA_19 like", value, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19NotLike(String value) {
       addCriterion("DATA_19 not like", value, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19In(List<String> values) {
       addCriterion("DATA_19 in", values, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19NotIn(List<String> values) {
       addCriterion("DATA_19 not in", values, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19Between(String value1, String value2) {
       addCriterion("DATA_19 between", value1, value2, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData19NotBetween(String value1, String value2) {
       addCriterion("DATA_19 not between", value1, value2, "data19");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20IsNull() {
       addCriterion("DATA_20 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20IsNotNull() {
       addCriterion("DATA_20 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20EqualTo(String value) {
       addCriterion("DATA_20 =", value, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20NotEqualTo(String value) {
       addCriterion("DATA_20 <>", value, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20GreaterThan(String value) {
       addCriterion("DATA_20 >", value, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_20 >=", value, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20LessThan(String value) {
       addCriterion("DATA_20 <", value, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20LessThanOrEqualTo(String value) {
       addCriterion("DATA_20 <=", value, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20Like(String value) {
       addCriterion("DATA_20 like", value, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20NotLike(String value) {
       addCriterion("DATA_20 not like", value, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20In(List<String> values) {
       addCriterion("DATA_20 in", values, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20NotIn(List<String> values) {
       addCriterion("DATA_20 not in", values, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20Between(String value1, String value2) {
       addCriterion("DATA_20 between", value1, value2, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData20NotBetween(String value1, String value2) {
       addCriterion("DATA_20 not between", value1, value2, "data20");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21IsNull() {
       addCriterion("DATA_21 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21IsNotNull() {
       addCriterion("DATA_21 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21EqualTo(String value) {
       addCriterion("DATA_21 =", value, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21NotEqualTo(String value) {
       addCriterion("DATA_21 <>", value, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21GreaterThan(String value) {
       addCriterion("DATA_21 >", value, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_21 >=", value, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21LessThan(String value) {
       addCriterion("DATA_21 <", value, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21LessThanOrEqualTo(String value) {
       addCriterion("DATA_21 <=", value, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21Like(String value) {
       addCriterion("DATA_21 like", value, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21NotLike(String value) {
       addCriterion("DATA_21 not like", value, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21In(List<String> values) {
       addCriterion("DATA_21 in", values, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21NotIn(List<String> values) {
       addCriterion("DATA_21 not in", values, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21Between(String value1, String value2) {
       addCriterion("DATA_21 between", value1, value2, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData21NotBetween(String value1, String value2) {
       addCriterion("DATA_21 not between", value1, value2, "data21");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22IsNull() {
       addCriterion("DATA_22 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22IsNotNull() {
       addCriterion("DATA_22 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22EqualTo(String value) {
       addCriterion("DATA_22 =", value, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22NotEqualTo(String value) {
       addCriterion("DATA_22 <>", value, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22GreaterThan(String value) {
       addCriterion("DATA_22 >", value, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_22 >=", value, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22LessThan(String value) {
       addCriterion("DATA_22 <", value, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22LessThanOrEqualTo(String value) {
       addCriterion("DATA_22 <=", value, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22Like(String value) {
       addCriterion("DATA_22 like", value, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22NotLike(String value) {
       addCriterion("DATA_22 not like", value, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22In(List<String> values) {
       addCriterion("DATA_22 in", values, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22NotIn(List<String> values) {
       addCriterion("DATA_22 not in", values, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22Between(String value1, String value2) {
       addCriterion("DATA_22 between", value1, value2, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData22NotBetween(String value1, String value2) {
       addCriterion("DATA_22 not between", value1, value2, "data22");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23IsNull() {
       addCriterion("DATA_23 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23IsNotNull() {
       addCriterion("DATA_23 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23EqualTo(String value) {
       addCriterion("DATA_23 =", value, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23NotEqualTo(String value) {
       addCriterion("DATA_23 <>", value, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23GreaterThan(String value) {
       addCriterion("DATA_23 >", value, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_23 >=", value, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23LessThan(String value) {
       addCriterion("DATA_23 <", value, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23LessThanOrEqualTo(String value) {
       addCriterion("DATA_23 <=", value, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23Like(String value) {
       addCriterion("DATA_23 like", value, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23NotLike(String value) {
       addCriterion("DATA_23 not like", value, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23In(List<String> values) {
       addCriterion("DATA_23 in", values, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23NotIn(List<String> values) {
       addCriterion("DATA_23 not in", values, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23Between(String value1, String value2) {
       addCriterion("DATA_23 between", value1, value2, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData23NotBetween(String value1, String value2) {
       addCriterion("DATA_23 not between", value1, value2, "data23");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24IsNull() {
       addCriterion("DATA_24 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24IsNotNull() {
       addCriterion("DATA_24 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24EqualTo(String value) {
       addCriterion("DATA_24 =", value, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24NotEqualTo(String value) {
       addCriterion("DATA_24 <>", value, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24GreaterThan(String value) {
       addCriterion("DATA_24 >", value, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_24 >=", value, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24LessThan(String value) {
       addCriterion("DATA_24 <", value, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24LessThanOrEqualTo(String value) {
       addCriterion("DATA_24 <=", value, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24Like(String value) {
       addCriterion("DATA_24 like", value, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24NotLike(String value) {
       addCriterion("DATA_24 not like", value, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24In(List<String> values) {
       addCriterion("DATA_24 in", values, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24NotIn(List<String> values) {
       addCriterion("DATA_24 not in", values, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24Between(String value1, String value2) {
       addCriterion("DATA_24 between", value1, value2, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData24NotBetween(String value1, String value2) {
       addCriterion("DATA_24 not between", value1, value2, "data24");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25IsNull() {
       addCriterion("DATA_25 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25IsNotNull() {
       addCriterion("DATA_25 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25EqualTo(String value) {
       addCriterion("DATA_25 =", value, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25NotEqualTo(String value) {
       addCriterion("DATA_25 <>", value, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25GreaterThan(String value) {
       addCriterion("DATA_25 >", value, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_25 >=", value, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25LessThan(String value) {
       addCriterion("DATA_25 <", value, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25LessThanOrEqualTo(String value) {
       addCriterion("DATA_25 <=", value, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25Like(String value) {
       addCriterion("DATA_25 like", value, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25NotLike(String value) {
       addCriterion("DATA_25 not like", value, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25In(List<String> values) {
       addCriterion("DATA_25 in", values, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25NotIn(List<String> values) {
       addCriterion("DATA_25 not in", values, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25Between(String value1, String value2) {
       addCriterion("DATA_25 between", value1, value2, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData25NotBetween(String value1, String value2) {
       addCriterion("DATA_25 not between", value1, value2, "data25");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26IsNull() {
       addCriterion("DATA_26 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26IsNotNull() {
       addCriterion("DATA_26 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26EqualTo(String value) {
       addCriterion("DATA_26 =", value, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26NotEqualTo(String value) {
       addCriterion("DATA_26 <>", value, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26GreaterThan(String value) {
       addCriterion("DATA_26 >", value, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_26 >=", value, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26LessThan(String value) {
       addCriterion("DATA_26 <", value, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26LessThanOrEqualTo(String value) {
       addCriterion("DATA_26 <=", value, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26Like(String value) {
       addCriterion("DATA_26 like", value, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26NotLike(String value) {
       addCriterion("DATA_26 not like", value, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26In(List<String> values) {
       addCriterion("DATA_26 in", values, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26NotIn(List<String> values) {
       addCriterion("DATA_26 not in", values, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26Between(String value1, String value2) {
       addCriterion("DATA_26 between", value1, value2, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData26NotBetween(String value1, String value2) {
       addCriterion("DATA_26 not between", value1, value2, "data26");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27IsNull() {
       addCriterion("DATA_27 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27IsNotNull() {
       addCriterion("DATA_27 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27EqualTo(String value) {
       addCriterion("DATA_27 =", value, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27NotEqualTo(String value) {
       addCriterion("DATA_27 <>", value, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27GreaterThan(String value) {
       addCriterion("DATA_27 >", value, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_27 >=", value, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27LessThan(String value) {
       addCriterion("DATA_27 <", value, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27LessThanOrEqualTo(String value) {
       addCriterion("DATA_27 <=", value, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27Like(String value) {
       addCriterion("DATA_27 like", value, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27NotLike(String value) {
       addCriterion("DATA_27 not like", value, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27In(List<String> values) {
       addCriterion("DATA_27 in", values, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27NotIn(List<String> values) {
       addCriterion("DATA_27 not in", values, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27Between(String value1, String value2) {
       addCriterion("DATA_27 between", value1, value2, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData27NotBetween(String value1, String value2) {
       addCriterion("DATA_27 not between", value1, value2, "data27");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28IsNull() {
       addCriterion("DATA_28 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28IsNotNull() {
       addCriterion("DATA_28 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28EqualTo(String value) {
       addCriterion("DATA_28 =", value, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28NotEqualTo(String value) {
       addCriterion("DATA_28 <>", value, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28GreaterThan(String value) {
       addCriterion("DATA_28 >", value, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_28 >=", value, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28LessThan(String value) {
       addCriterion("DATA_28 <", value, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28LessThanOrEqualTo(String value) {
       addCriterion("DATA_28 <=", value, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28Like(String value) {
       addCriterion("DATA_28 like", value, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28NotLike(String value) {
       addCriterion("DATA_28 not like", value, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28In(List<String> values) {
       addCriterion("DATA_28 in", values, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28NotIn(List<String> values) {
       addCriterion("DATA_28 not in", values, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28Between(String value1, String value2) {
       addCriterion("DATA_28 between", value1, value2, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData28NotBetween(String value1, String value2) {
       addCriterion("DATA_28 not between", value1, value2, "data28");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29IsNull() {
       addCriterion("DATA_29 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29IsNotNull() {
       addCriterion("DATA_29 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29EqualTo(String value) {
       addCriterion("DATA_29 =", value, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29NotEqualTo(String value) {
       addCriterion("DATA_29 <>", value, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29GreaterThan(String value) {
       addCriterion("DATA_29 >", value, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_29 >=", value, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29LessThan(String value) {
       addCriterion("DATA_29 <", value, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29LessThanOrEqualTo(String value) {
       addCriterion("DATA_29 <=", value, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29Like(String value) {
       addCriterion("DATA_29 like", value, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29NotLike(String value) {
       addCriterion("DATA_29 not like", value, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29In(List<String> values) {
       addCriterion("DATA_29 in", values, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29NotIn(List<String> values) {
       addCriterion("DATA_29 not in", values, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29Between(String value1, String value2) {
       addCriterion("DATA_29 between", value1, value2, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData29NotBetween(String value1, String value2) {
       addCriterion("DATA_29 not between", value1, value2, "data29");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30IsNull() {
       addCriterion("DATA_30 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30IsNotNull() {
       addCriterion("DATA_30 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30EqualTo(String value) {
       addCriterion("DATA_30 =", value, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30NotEqualTo(String value) {
       addCriterion("DATA_30 <>", value, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30GreaterThan(String value) {
       addCriterion("DATA_30 >", value, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_30 >=", value, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30LessThan(String value) {
       addCriterion("DATA_30 <", value, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30LessThanOrEqualTo(String value) {
       addCriterion("DATA_30 <=", value, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30Like(String value) {
       addCriterion("DATA_30 like", value, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30NotLike(String value) {
       addCriterion("DATA_30 not like", value, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30In(List<String> values) {
       addCriterion("DATA_30 in", values, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30NotIn(List<String> values) {
       addCriterion("DATA_30 not in", values, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30Between(String value1, String value2) {
       addCriterion("DATA_30 between", value1, value2, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData30NotBetween(String value1, String value2) {
       addCriterion("DATA_30 not between", value1, value2, "data30");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31IsNull() {
       addCriterion("DATA_31 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31IsNotNull() {
       addCriterion("DATA_31 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31EqualTo(String value) {
       addCriterion("DATA_31 =", value, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31NotEqualTo(String value) {
       addCriterion("DATA_31 <>", value, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31GreaterThan(String value) {
       addCriterion("DATA_31 >", value, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_31 >=", value, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31LessThan(String value) {
       addCriterion("DATA_31 <", value, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31LessThanOrEqualTo(String value) {
       addCriterion("DATA_31 <=", value, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31Like(String value) {
       addCriterion("DATA_31 like", value, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31NotLike(String value) {
       addCriterion("DATA_31 not like", value, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31In(List<String> values) {
       addCriterion("DATA_31 in", values, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31NotIn(List<String> values) {
       addCriterion("DATA_31 not in", values, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31Between(String value1, String value2) {
       addCriterion("DATA_31 between", value1, value2, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData31NotBetween(String value1, String value2) {
       addCriterion("DATA_31 not between", value1, value2, "data31");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32IsNull() {
       addCriterion("DATA_32 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32IsNotNull() {
       addCriterion("DATA_32 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32EqualTo(String value) {
       addCriterion("DATA_32 =", value, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32NotEqualTo(String value) {
       addCriterion("DATA_32 <>", value, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32GreaterThan(String value) {
       addCriterion("DATA_32 >", value, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_32 >=", value, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32LessThan(String value) {
       addCriterion("DATA_32 <", value, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32LessThanOrEqualTo(String value) {
       addCriterion("DATA_32 <=", value, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32Like(String value) {
       addCriterion("DATA_32 like", value, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32NotLike(String value) {
       addCriterion("DATA_32 not like", value, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32In(List<String> values) {
       addCriterion("DATA_32 in", values, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32NotIn(List<String> values) {
       addCriterion("DATA_32 not in", values, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32Between(String value1, String value2) {
       addCriterion("DATA_32 between", value1, value2, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData32NotBetween(String value1, String value2) {
       addCriterion("DATA_32 not between", value1, value2, "data32");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33IsNull() {
       addCriterion("DATA_33 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33IsNotNull() {
       addCriterion("DATA_33 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33EqualTo(String value) {
       addCriterion("DATA_33 =", value, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33NotEqualTo(String value) {
       addCriterion("DATA_33 <>", value, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33GreaterThan(String value) {
       addCriterion("DATA_33 >", value, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_33 >=", value, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33LessThan(String value) {
       addCriterion("DATA_33 <", value, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33LessThanOrEqualTo(String value) {
       addCriterion("DATA_33 <=", value, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33Like(String value) {
       addCriterion("DATA_33 like", value, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33NotLike(String value) {
       addCriterion("DATA_33 not like", value, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33In(List<String> values) {
       addCriterion("DATA_33 in", values, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33NotIn(List<String> values) {
       addCriterion("DATA_33 not in", values, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33Between(String value1, String value2) {
       addCriterion("DATA_33 between", value1, value2, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData33NotBetween(String value1, String value2) {
       addCriterion("DATA_33 not between", value1, value2, "data33");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34IsNull() {
       addCriterion("DATA_34 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34IsNotNull() {
       addCriterion("DATA_34 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34EqualTo(String value) {
       addCriterion("DATA_34 =", value, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34NotEqualTo(String value) {
       addCriterion("DATA_34 <>", value, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34GreaterThan(String value) {
       addCriterion("DATA_34 >", value, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_34 >=", value, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34LessThan(String value) {
       addCriterion("DATA_34 <", value, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34LessThanOrEqualTo(String value) {
       addCriterion("DATA_34 <=", value, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34Like(String value) {
       addCriterion("DATA_34 like", value, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34NotLike(String value) {
       addCriterion("DATA_34 not like", value, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34In(List<String> values) {
       addCriterion("DATA_34 in", values, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34NotIn(List<String> values) {
       addCriterion("DATA_34 not in", values, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34Between(String value1, String value2) {
       addCriterion("DATA_34 between", value1, value2, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData34NotBetween(String value1, String value2) {
       addCriterion("DATA_34 not between", value1, value2, "data34");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35IsNull() {
       addCriterion("DATA_35 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35IsNotNull() {
       addCriterion("DATA_35 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35EqualTo(String value) {
       addCriterion("DATA_35 =", value, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35NotEqualTo(String value) {
       addCriterion("DATA_35 <>", value, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35GreaterThan(String value) {
       addCriterion("DATA_35 >", value, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_35 >=", value, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35LessThan(String value) {
       addCriterion("DATA_35 <", value, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35LessThanOrEqualTo(String value) {
       addCriterion("DATA_35 <=", value, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35Like(String value) {
       addCriterion("DATA_35 like", value, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35NotLike(String value) {
       addCriterion("DATA_35 not like", value, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35In(List<String> values) {
       addCriterion("DATA_35 in", values, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35NotIn(List<String> values) {
       addCriterion("DATA_35 not in", values, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35Between(String value1, String value2) {
       addCriterion("DATA_35 between", value1, value2, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData35NotBetween(String value1, String value2) {
       addCriterion("DATA_35 not between", value1, value2, "data35");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36IsNull() {
       addCriterion("DATA_36 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36IsNotNull() {
       addCriterion("DATA_36 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36EqualTo(String value) {
       addCriterion("DATA_36 =", value, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36NotEqualTo(String value) {
       addCriterion("DATA_36 <>", value, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36GreaterThan(String value) {
       addCriterion("DATA_36 >", value, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_36 >=", value, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36LessThan(String value) {
       addCriterion("DATA_36 <", value, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36LessThanOrEqualTo(String value) {
       addCriterion("DATA_36 <=", value, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36Like(String value) {
       addCriterion("DATA_36 like", value, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36NotLike(String value) {
       addCriterion("DATA_36 not like", value, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36In(List<String> values) {
       addCriterion("DATA_36 in", values, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36NotIn(List<String> values) {
       addCriterion("DATA_36 not in", values, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36Between(String value1, String value2) {
       addCriterion("DATA_36 between", value1, value2, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData36NotBetween(String value1, String value2) {
       addCriterion("DATA_36 not between", value1, value2, "data36");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37IsNull() {
       addCriterion("DATA_37 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37IsNotNull() {
       addCriterion("DATA_37 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37EqualTo(String value) {
       addCriterion("DATA_37 =", value, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37NotEqualTo(String value) {
       addCriterion("DATA_37 <>", value, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37GreaterThan(String value) {
       addCriterion("DATA_37 >", value, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_37 >=", value, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37LessThan(String value) {
       addCriterion("DATA_37 <", value, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37LessThanOrEqualTo(String value) {
       addCriterion("DATA_37 <=", value, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37Like(String value) {
       addCriterion("DATA_37 like", value, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37NotLike(String value) {
       addCriterion("DATA_37 not like", value, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37In(List<String> values) {
       addCriterion("DATA_37 in", values, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37NotIn(List<String> values) {
       addCriterion("DATA_37 not in", values, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37Between(String value1, String value2) {
       addCriterion("DATA_37 between", value1, value2, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData37NotBetween(String value1, String value2) {
       addCriterion("DATA_37 not between", value1, value2, "data37");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38IsNull() {
       addCriterion("DATA_38 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38IsNotNull() {
       addCriterion("DATA_38 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38EqualTo(String value) {
       addCriterion("DATA_38 =", value, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38NotEqualTo(String value) {
       addCriterion("DATA_38 <>", value, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38GreaterThan(String value) {
       addCriterion("DATA_38 >", value, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_38 >=", value, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38LessThan(String value) {
       addCriterion("DATA_38 <", value, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38LessThanOrEqualTo(String value) {
       addCriterion("DATA_38 <=", value, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38Like(String value) {
       addCriterion("DATA_38 like", value, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38NotLike(String value) {
       addCriterion("DATA_38 not like", value, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38In(List<String> values) {
       addCriterion("DATA_38 in", values, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38NotIn(List<String> values) {
       addCriterion("DATA_38 not in", values, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38Between(String value1, String value2) {
       addCriterion("DATA_38 between", value1, value2, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData38NotBetween(String value1, String value2) {
       addCriterion("DATA_38 not between", value1, value2, "data38");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39IsNull() {
       addCriterion("DATA_39 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39IsNotNull() {
       addCriterion("DATA_39 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39EqualTo(String value) {
       addCriterion("DATA_39 =", value, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39NotEqualTo(String value) {
       addCriterion("DATA_39 <>", value, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39GreaterThan(String value) {
       addCriterion("DATA_39 >", value, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_39 >=", value, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39LessThan(String value) {
       addCriterion("DATA_39 <", value, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39LessThanOrEqualTo(String value) {
       addCriterion("DATA_39 <=", value, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39Like(String value) {
       addCriterion("DATA_39 like", value, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39NotLike(String value) {
       addCriterion("DATA_39 not like", value, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39In(List<String> values) {
       addCriterion("DATA_39 in", values, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39NotIn(List<String> values) {
       addCriterion("DATA_39 not in", values, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39Between(String value1, String value2) {
       addCriterion("DATA_39 between", value1, value2, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData39NotBetween(String value1, String value2) {
       addCriterion("DATA_39 not between", value1, value2, "data39");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40IsNull() {
       addCriterion("DATA_40 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40IsNotNull() {
       addCriterion("DATA_40 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40EqualTo(String value) {
       addCriterion("DATA_40 =", value, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40NotEqualTo(String value) {
       addCriterion("DATA_40 <>", value, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40GreaterThan(String value) {
       addCriterion("DATA_40 >", value, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_40 >=", value, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40LessThan(String value) {
       addCriterion("DATA_40 <", value, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40LessThanOrEqualTo(String value) {
       addCriterion("DATA_40 <=", value, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40Like(String value) {
       addCriterion("DATA_40 like", value, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40NotLike(String value) {
       addCriterion("DATA_40 not like", value, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40In(List<String> values) {
       addCriterion("DATA_40 in", values, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40NotIn(List<String> values) {
       addCriterion("DATA_40 not in", values, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40Between(String value1, String value2) {
       addCriterion("DATA_40 between", value1, value2, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData40NotBetween(String value1, String value2) {
       addCriterion("DATA_40 not between", value1, value2, "data40");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41IsNull() {
       addCriterion("DATA_41 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41IsNotNull() {
       addCriterion("DATA_41 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41EqualTo(String value) {
       addCriterion("DATA_41 =", value, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41NotEqualTo(String value) {
       addCriterion("DATA_41 <>", value, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41GreaterThan(String value) {
       addCriterion("DATA_41 >", value, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_41 >=", value, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41LessThan(String value) {
       addCriterion("DATA_41 <", value, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41LessThanOrEqualTo(String value) {
       addCriterion("DATA_41 <=", value, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41Like(String value) {
       addCriterion("DATA_41 like", value, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41NotLike(String value) {
       addCriterion("DATA_41 not like", value, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41In(List<String> values) {
       addCriterion("DATA_41 in", values, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41NotIn(List<String> values) {
       addCriterion("DATA_41 not in", values, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41Between(String value1, String value2) {
       addCriterion("DATA_41 between", value1, value2, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData41NotBetween(String value1, String value2) {
       addCriterion("DATA_41 not between", value1, value2, "data41");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42IsNull() {
       addCriterion("DATA_42 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42IsNotNull() {
       addCriterion("DATA_42 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42EqualTo(String value) {
       addCriterion("DATA_42 =", value, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42NotEqualTo(String value) {
       addCriterion("DATA_42 <>", value, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42GreaterThan(String value) {
       addCriterion("DATA_42 >", value, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_42 >=", value, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42LessThan(String value) {
       addCriterion("DATA_42 <", value, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42LessThanOrEqualTo(String value) {
       addCriterion("DATA_42 <=", value, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42Like(String value) {
       addCriterion("DATA_42 like", value, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42NotLike(String value) {
       addCriterion("DATA_42 not like", value, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42In(List<String> values) {
       addCriterion("DATA_42 in", values, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42NotIn(List<String> values) {
       addCriterion("DATA_42 not in", values, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42Between(String value1, String value2) {
       addCriterion("DATA_42 between", value1, value2, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData42NotBetween(String value1, String value2) {
       addCriterion("DATA_42 not between", value1, value2, "data42");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43IsNull() {
       addCriterion("DATA_43 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43IsNotNull() {
       addCriterion("DATA_43 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43EqualTo(String value) {
       addCriterion("DATA_43 =", value, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43NotEqualTo(String value) {
       addCriterion("DATA_43 <>", value, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43GreaterThan(String value) {
       addCriterion("DATA_43 >", value, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_43 >=", value, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43LessThan(String value) {
       addCriterion("DATA_43 <", value, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43LessThanOrEqualTo(String value) {
       addCriterion("DATA_43 <=", value, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43Like(String value) {
       addCriterion("DATA_43 like", value, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43NotLike(String value) {
       addCriterion("DATA_43 not like", value, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43In(List<String> values) {
       addCriterion("DATA_43 in", values, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43NotIn(List<String> values) {
       addCriterion("DATA_43 not in", values, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43Between(String value1, String value2) {
       addCriterion("DATA_43 between", value1, value2, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData43NotBetween(String value1, String value2) {
       addCriterion("DATA_43 not between", value1, value2, "data43");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44IsNull() {
       addCriterion("DATA_44 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44IsNotNull() {
       addCriterion("DATA_44 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44EqualTo(String value) {
       addCriterion("DATA_44 =", value, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44NotEqualTo(String value) {
       addCriterion("DATA_44 <>", value, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44GreaterThan(String value) {
       addCriterion("DATA_44 >", value, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_44 >=", value, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44LessThan(String value) {
       addCriterion("DATA_44 <", value, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44LessThanOrEqualTo(String value) {
       addCriterion("DATA_44 <=", value, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44Like(String value) {
       addCriterion("DATA_44 like", value, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44NotLike(String value) {
       addCriterion("DATA_44 not like", value, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44In(List<String> values) {
       addCriterion("DATA_44 in", values, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44NotIn(List<String> values) {
       addCriterion("DATA_44 not in", values, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44Between(String value1, String value2) {
       addCriterion("DATA_44 between", value1, value2, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData44NotBetween(String value1, String value2) {
       addCriterion("DATA_44 not between", value1, value2, "data44");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45IsNull() {
       addCriterion("DATA_45 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45IsNotNull() {
       addCriterion("DATA_45 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45EqualTo(String value) {
       addCriterion("DATA_45 =", value, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45NotEqualTo(String value) {
       addCriterion("DATA_45 <>", value, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45GreaterThan(String value) {
       addCriterion("DATA_45 >", value, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_45 >=", value, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45LessThan(String value) {
       addCriterion("DATA_45 <", value, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45LessThanOrEqualTo(String value) {
       addCriterion("DATA_45 <=", value, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45Like(String value) {
       addCriterion("DATA_45 like", value, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45NotLike(String value) {
       addCriterion("DATA_45 not like", value, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45In(List<String> values) {
       addCriterion("DATA_45 in", values, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45NotIn(List<String> values) {
       addCriterion("DATA_45 not in", values, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45Between(String value1, String value2) {
       addCriterion("DATA_45 between", value1, value2, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData45NotBetween(String value1, String value2) {
       addCriterion("DATA_45 not between", value1, value2, "data45");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46IsNull() {
       addCriterion("DATA_46 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46IsNotNull() {
       addCriterion("DATA_46 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46EqualTo(String value) {
       addCriterion("DATA_46 =", value, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46NotEqualTo(String value) {
       addCriterion("DATA_46 <>", value, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46GreaterThan(String value) {
       addCriterion("DATA_46 >", value, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_46 >=", value, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46LessThan(String value) {
       addCriterion("DATA_46 <", value, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46LessThanOrEqualTo(String value) {
       addCriterion("DATA_46 <=", value, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46Like(String value) {
       addCriterion("DATA_46 like", value, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46NotLike(String value) {
       addCriterion("DATA_46 not like", value, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46In(List<String> values) {
       addCriterion("DATA_46 in", values, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46NotIn(List<String> values) {
       addCriterion("DATA_46 not in", values, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46Between(String value1, String value2) {
       addCriterion("DATA_46 between", value1, value2, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData46NotBetween(String value1, String value2) {
       addCriterion("DATA_46 not between", value1, value2, "data46");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47IsNull() {
       addCriterion("DATA_47 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47IsNotNull() {
       addCriterion("DATA_47 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47EqualTo(String value) {
       addCriterion("DATA_47 =", value, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47NotEqualTo(String value) {
       addCriterion("DATA_47 <>", value, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47GreaterThan(String value) {
       addCriterion("DATA_47 >", value, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_47 >=", value, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47LessThan(String value) {
       addCriterion("DATA_47 <", value, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47LessThanOrEqualTo(String value) {
       addCriterion("DATA_47 <=", value, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47Like(String value) {
       addCriterion("DATA_47 like", value, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47NotLike(String value) {
       addCriterion("DATA_47 not like", value, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47In(List<String> values) {
       addCriterion("DATA_47 in", values, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47NotIn(List<String> values) {
       addCriterion("DATA_47 not in", values, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47Between(String value1, String value2) {
       addCriterion("DATA_47 between", value1, value2, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData47NotBetween(String value1, String value2) {
       addCriterion("DATA_47 not between", value1, value2, "data47");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48IsNull() {
       addCriterion("DATA_48 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48IsNotNull() {
       addCriterion("DATA_48 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48EqualTo(String value) {
       addCriterion("DATA_48 =", value, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48NotEqualTo(String value) {
       addCriterion("DATA_48 <>", value, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48GreaterThan(String value) {
       addCriterion("DATA_48 >", value, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_48 >=", value, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48LessThan(String value) {
       addCriterion("DATA_48 <", value, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48LessThanOrEqualTo(String value) {
       addCriterion("DATA_48 <=", value, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48Like(String value) {
       addCriterion("DATA_48 like", value, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48NotLike(String value) {
       addCriterion("DATA_48 not like", value, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48In(List<String> values) {
       addCriterion("DATA_48 in", values, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48NotIn(List<String> values) {
       addCriterion("DATA_48 not in", values, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48Between(String value1, String value2) {
       addCriterion("DATA_48 between", value1, value2, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData48NotBetween(String value1, String value2) {
       addCriterion("DATA_48 not between", value1, value2, "data48");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49IsNull() {
       addCriterion("DATA_49 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49IsNotNull() {
       addCriterion("DATA_49 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49EqualTo(String value) {
       addCriterion("DATA_49 =", value, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49NotEqualTo(String value) {
       addCriterion("DATA_49 <>", value, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49GreaterThan(String value) {
       addCriterion("DATA_49 >", value, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_49 >=", value, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49LessThan(String value) {
       addCriterion("DATA_49 <", value, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49LessThanOrEqualTo(String value) {
       addCriterion("DATA_49 <=", value, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49Like(String value) {
       addCriterion("DATA_49 like", value, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49NotLike(String value) {
       addCriterion("DATA_49 not like", value, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49In(List<String> values) {
       addCriterion("DATA_49 in", values, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49NotIn(List<String> values) {
       addCriterion("DATA_49 not in", values, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49Between(String value1, String value2) {
       addCriterion("DATA_49 between", value1, value2, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData49NotBetween(String value1, String value2) {
       addCriterion("DATA_49 not between", value1, value2, "data49");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50IsNull() {
       addCriterion("DATA_50 is null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50IsNotNull() {
       addCriterion("DATA_50 is not null");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50EqualTo(String value) {
       addCriterion("DATA_50 =", value, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50NotEqualTo(String value) {
       addCriterion("DATA_50 <>", value, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50GreaterThan(String value) {
       addCriterion("DATA_50 >", value, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50GreaterThanOrEqualTo(String value) {
       addCriterion("DATA_50 >=", value, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50LessThan(String value) {
       addCriterion("DATA_50 <", value, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50LessThanOrEqualTo(String value) {
       addCriterion("DATA_50 <=", value, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50Like(String value) {
       addCriterion("DATA_50 like", value, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50NotLike(String value) {
       addCriterion("DATA_50 not like", value, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50In(List<String> values) {
       addCriterion("DATA_50 in", values, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50NotIn(List<String> values) {
       addCriterion("DATA_50 not in", values, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50Between(String value1, String value2) {
       addCriterion("DATA_50 between", value1, value2, "data50");
       return (BonusExample.Criteria)this;
     }
 
     public BonusExample.Criteria andData50NotBetween(String value1, String value2) {
       addCriterion("DATA_50 not between", value1, value2, "data50");
       return (BonusExample.Criteria)this;
     }
   }
 }

