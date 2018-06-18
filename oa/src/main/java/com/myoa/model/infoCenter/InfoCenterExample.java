 package com.myoa.model.infoCenter;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class InfoCenterExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public InfoCenterExample()
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
 
   public static class Criteria extends InfoCenterExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<InfoCenterExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<InfoCenterExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<InfoCenterExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new InfoCenterExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new InfoCenterExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new InfoCenterExample.Criterion(condition, value1, value2));
     }
 
     public InfoCenterExample.Criteria andInfoIdIsNull() {
       addCriterion("INFO_ID is null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdIsNotNull() {
       addCriterion("INFO_ID is not null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdEqualTo(Integer value) {
       addCriterion("INFO_ID =", value, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdNotEqualTo(Integer value) {
       addCriterion("INFO_ID <>", value, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdGreaterThan(Integer value) {
       addCriterion("INFO_ID >", value, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("INFO_ID >=", value, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdLessThan(Integer value) {
       addCriterion("INFO_ID <", value, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdLessThanOrEqualTo(Integer value) {
       addCriterion("INFO_ID <=", value, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdIn(List<Integer> values) {
       addCriterion("INFO_ID in", values, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdNotIn(List<Integer> values) {
       addCriterion("INFO_ID not in", values, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdBetween(Integer value1, Integer value2) {
       addCriterion("INFO_ID between", value1, value2, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
       addCriterion("INFO_ID not between", value1, value2, "infoId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoIsNull() {
       addCriterion("INFO_NO is null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoIsNotNull() {
       addCriterion("INFO_NO is not null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoEqualTo(Integer value) {
       addCriterion("INFO_NO =", value, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoNotEqualTo(Integer value) {
       addCriterion("INFO_NO <>", value, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoGreaterThan(Integer value) {
       addCriterion("INFO_NO >", value, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoGreaterThanOrEqualTo(Integer value) {
       addCriterion("INFO_NO >=", value, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoLessThan(Integer value) {
       addCriterion("INFO_NO <", value, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoLessThanOrEqualTo(Integer value) {
       addCriterion("INFO_NO <=", value, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoIn(List<Integer> values) {
       addCriterion("INFO_NO in", values, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoNotIn(List<Integer> values) {
       addCriterion("INFO_NO not in", values, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoBetween(Integer value1, Integer value2) {
       addCriterion("INFO_NO between", value1, value2, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoNoNotBetween(Integer value1, Integer value2) {
       addCriterion("INFO_NO not between", value1, value2, "infoNo");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1IsNull() {
       addCriterion("INFO_NAME1 is null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1IsNotNull() {
       addCriterion("INFO_NAME1 is not null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1EqualTo(String value) {
       addCriterion("INFO_NAME1 =", value, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1NotEqualTo(String value) {
       addCriterion("INFO_NAME1 <>", value, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1GreaterThan(String value) {
       addCriterion("INFO_NAME1 >", value, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1GreaterThanOrEqualTo(String value) {
       addCriterion("INFO_NAME1 >=", value, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1LessThan(String value) {
       addCriterion("INFO_NAME1 <", value, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1LessThanOrEqualTo(String value) {
       addCriterion("INFO_NAME1 <=", value, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1Like(String value) {
       addCriterion("INFO_NAME1 like", value, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1NotLike(String value) {
       addCriterion("INFO_NAME1 not like", value, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1In(List<String> values) {
       addCriterion("INFO_NAME1 in", values, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1NotIn(List<String> values) {
       addCriterion("INFO_NAME1 not in", values, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1Between(String value1, String value2) {
       addCriterion("INFO_NAME1 between", value1, value2, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName1NotBetween(String value1, String value2) {
       addCriterion("INFO_NAME1 not between", value1, value2, "infoName1");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2IsNull() {
       addCriterion("INFO_NAME2 is null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2IsNotNull() {
       addCriterion("INFO_NAME2 is not null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2EqualTo(String value) {
       addCriterion("INFO_NAME2 =", value, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2NotEqualTo(String value) {
       addCriterion("INFO_NAME2 <>", value, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2GreaterThan(String value) {
       addCriterion("INFO_NAME2 >", value, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2GreaterThanOrEqualTo(String value) {
       addCriterion("INFO_NAME2 >=", value, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2LessThan(String value) {
       addCriterion("INFO_NAME2 <", value, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2LessThanOrEqualTo(String value) {
       addCriterion("INFO_NAME2 <=", value, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2Like(String value) {
       addCriterion("INFO_NAME2 like", value, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2NotLike(String value) {
       addCriterion("INFO_NAME2 not like", value, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2In(List<String> values) {
       addCriterion("INFO_NAME2 in", values, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2NotIn(List<String> values) {
       addCriterion("INFO_NAME2 not in", values, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2Between(String value1, String value2) {
       addCriterion("INFO_NAME2 between", value1, value2, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName2NotBetween(String value1, String value2) {
       addCriterion("INFO_NAME2 not between", value1, value2, "infoName2");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3IsNull() {
       addCriterion("INFO_NAME3 is null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3IsNotNull() {
       addCriterion("INFO_NAME3 is not null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3EqualTo(String value) {
       addCriterion("INFO_NAME3 =", value, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3NotEqualTo(String value) {
       addCriterion("INFO_NAME3 <>", value, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3GreaterThan(String value) {
       addCriterion("INFO_NAME3 >", value, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3GreaterThanOrEqualTo(String value) {
       addCriterion("INFO_NAME3 >=", value, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3LessThan(String value) {
       addCriterion("INFO_NAME3 <", value, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3LessThanOrEqualTo(String value) {
       addCriterion("INFO_NAME3 <=", value, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3Like(String value) {
       addCriterion("INFO_NAME3 like", value, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3NotLike(String value) {
       addCriterion("INFO_NAME3 not like", value, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3In(List<String> values) {
       addCriterion("INFO_NAME3 in", values, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3NotIn(List<String> values) {
       addCriterion("INFO_NAME3 not in", values, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3Between(String value1, String value2) {
       addCriterion("INFO_NAME3 between", value1, value2, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName3NotBetween(String value1, String value2) {
       addCriterion("INFO_NAME3 not between", value1, value2, "infoName3");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4IsNull() {
       addCriterion("INFO_NAME4 is null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4IsNotNull() {
       addCriterion("INFO_NAME4 is not null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4EqualTo(String value) {
       addCriterion("INFO_NAME4 =", value, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4NotEqualTo(String value) {
       addCriterion("INFO_NAME4 <>", value, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4GreaterThan(String value) {
       addCriterion("INFO_NAME4 >", value, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4GreaterThanOrEqualTo(String value) {
       addCriterion("INFO_NAME4 >=", value, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4LessThan(String value) {
       addCriterion("INFO_NAME4 <", value, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4LessThanOrEqualTo(String value) {
       addCriterion("INFO_NAME4 <=", value, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4Like(String value) {
       addCriterion("INFO_NAME4 like", value, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4NotLike(String value) {
       addCriterion("INFO_NAME4 not like", value, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4In(List<String> values) {
       addCriterion("INFO_NAME4 in", values, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4NotIn(List<String> values) {
       addCriterion("INFO_NAME4 not in", values, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4Between(String value1, String value2) {
       addCriterion("INFO_NAME4 between", value1, value2, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName4NotBetween(String value1, String value2) {
       addCriterion("INFO_NAME4 not between", value1, value2, "infoName4");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5IsNull() {
       addCriterion("INFO_NAME5 is null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5IsNotNull() {
       addCriterion("INFO_NAME5 is not null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5EqualTo(String value) {
       addCriterion("INFO_NAME5 =", value, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5NotEqualTo(String value) {
       addCriterion("INFO_NAME5 <>", value, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5GreaterThan(String value) {
       addCriterion("INFO_NAME5 >", value, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5GreaterThanOrEqualTo(String value) {
       addCriterion("INFO_NAME5 >=", value, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5LessThan(String value) {
       addCriterion("INFO_NAME5 <", value, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5LessThanOrEqualTo(String value) {
       addCriterion("INFO_NAME5 <=", value, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5Like(String value) {
       addCriterion("INFO_NAME5 like", value, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5NotLike(String value) {
       addCriterion("INFO_NAME5 not like", value, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5In(List<String> values) {
       addCriterion("INFO_NAME5 in", values, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5NotIn(List<String> values) {
       addCriterion("INFO_NAME5 not in", values, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5Between(String value1, String value2) {
       addCriterion("INFO_NAME5 between", value1, value2, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoName5NotBetween(String value1, String value2) {
       addCriterion("INFO_NAME5 not between", value1, value2, "infoName5");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdIsNull() {
       addCriterion("INFO_FUNC_ID is null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdIsNotNull() {
       addCriterion("INFO_FUNC_ID is not null");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdEqualTo(Integer value) {
       addCriterion("INFO_FUNC_ID =", value, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdNotEqualTo(Integer value) {
       addCriterion("INFO_FUNC_ID <>", value, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdGreaterThan(Integer value) {
       addCriterion("INFO_FUNC_ID >", value, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("INFO_FUNC_ID >=", value, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdLessThan(Integer value) {
       addCriterion("INFO_FUNC_ID <", value, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdLessThanOrEqualTo(Integer value) {
       addCriterion("INFO_FUNC_ID <=", value, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdIn(List<Integer> values) {
       addCriterion("INFO_FUNC_ID in", values, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdNotIn(List<Integer> values) {
       addCriterion("INFO_FUNC_ID not in", values, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdBetween(Integer value1, Integer value2) {
       addCriterion("INFO_FUNC_ID between", value1, value2, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
 
     public InfoCenterExample.Criteria andInfoFuncIdNotBetween(Integer value1, Integer value2) {
       addCriterion("INFO_FUNC_ID not between", value1, value2, "infoFuncId");
       return (InfoCenterExample.Criteria)this;
     }
   }
 }
