 package com.myoa.model.workflow;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class FlowRuleExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public FlowRuleExample()
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
 
   public static class Criteria extends FlowRuleExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<FlowRuleExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<FlowRuleExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<FlowRuleExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new FlowRuleExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new FlowRuleExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new FlowRuleExample.Criterion(condition, value1, value2));
     }
 
     public FlowRuleExample.Criteria andRuleIdIsNull() {
       addCriterion("RULE_ID is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdIsNotNull() {
       addCriterion("RULE_ID is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdEqualTo(Integer value) {
       addCriterion("RULE_ID =", value, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdNotEqualTo(Integer value) {
       addCriterion("RULE_ID <>", value, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdGreaterThan(Integer value) {
       addCriterion("RULE_ID >", value, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("RULE_ID >=", value, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdLessThan(Integer value) {
       addCriterion("RULE_ID <", value, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdLessThanOrEqualTo(Integer value) {
       addCriterion("RULE_ID <=", value, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdIn(List<Integer> values) {
       addCriterion("RULE_ID in", values, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdNotIn(List<Integer> values) {
       addCriterion("RULE_ID not in", values, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdBetween(Integer value1, Integer value2) {
       addCriterion("RULE_ID between", value1, value2, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andRuleIdNotBetween(Integer value1, Integer value2) {
       addCriterion("RULE_ID not between", value1, value2, "ruleId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdIsNull() {
       addCriterion("FLOW_ID is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdIsNotNull() {
       addCriterion("FLOW_ID is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdEqualTo(Integer value) {
       addCriterion("FLOW_ID =", value, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdNotEqualTo(Integer value) {
       addCriterion("FLOW_ID <>", value, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdGreaterThan(Integer value) {
       addCriterion("FLOW_ID >", value, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("FLOW_ID >=", value, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdLessThan(Integer value) {
       addCriterion("FLOW_ID <", value, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdLessThanOrEqualTo(Integer value) {
       addCriterion("FLOW_ID <=", value, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdIn(List<Integer> values) {
       addCriterion("FLOW_ID in", values, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdNotIn(List<Integer> values) {
       addCriterion("FLOW_ID not in", values, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdBetween(Integer value1, Integer value2) {
       addCriterion("FLOW_ID between", value1, value2, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
       addCriterion("FLOW_ID not between", value1, value2, "flowId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdIsNull() {
       addCriterion("USER_ID is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdIsNotNull() {
       addCriterion("USER_ID is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdEqualTo(String value) {
       addCriterion("USER_ID =", value, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdNotEqualTo(String value) {
       addCriterion("USER_ID <>", value, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdGreaterThan(String value) {
       addCriterion("USER_ID >", value, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("USER_ID >=", value, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdLessThan(String value) {
       addCriterion("USER_ID <", value, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdLessThanOrEqualTo(String value) {
       addCriterion("USER_ID <=", value, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdLike(String value) {
       addCriterion("USER_ID like", value, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdNotLike(String value) {
       addCriterion("USER_ID not like", value, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdIn(List<String> values) {
       addCriterion("USER_ID in", values, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdNotIn(List<String> values) {
       addCriterion("USER_ID not in", values, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdBetween(String value1, String value2) {
       addCriterion("USER_ID between", value1, value2, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUserIdNotBetween(String value1, String value2) {
       addCriterion("USER_ID not between", value1, value2, "userId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdIsNull() {
       addCriterion("TO_ID is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdIsNotNull() {
       addCriterion("TO_ID is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdEqualTo(String value) {
       addCriterion("TO_ID =", value, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdNotEqualTo(String value) {
       addCriterion("TO_ID <>", value, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdGreaterThan(String value) {
       addCriterion("TO_ID >", value, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdGreaterThanOrEqualTo(String value) {
       addCriterion("TO_ID >=", value, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdLessThan(String value) {
       addCriterion("TO_ID <", value, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdLessThanOrEqualTo(String value) {
       addCriterion("TO_ID <=", value, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdLike(String value) {
       addCriterion("TO_ID like", value, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdNotLike(String value) {
       addCriterion("TO_ID not like", value, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdIn(List<String> values) {
       addCriterion("TO_ID in", values, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdNotIn(List<String> values) {
       addCriterion("TO_ID not in", values, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdBetween(String value1, String value2) {
       addCriterion("TO_ID between", value1, value2, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andToIdNotBetween(String value1, String value2) {
       addCriterion("TO_ID not between", value1, value2, "toId");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateIsNull() {
       addCriterion("BEGIN_DATE is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateIsNotNull() {
       addCriterion("BEGIN_DATE is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateEqualTo(Date value) {
       addCriterion("BEGIN_DATE =", value, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateNotEqualTo(Date value) {
       addCriterion("BEGIN_DATE <>", value, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateGreaterThan(Date value) {
       addCriterion("BEGIN_DATE >", value, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
       addCriterion("BEGIN_DATE >=", value, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateLessThan(Date value) {
       addCriterion("BEGIN_DATE <", value, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateLessThanOrEqualTo(Date value) {
       addCriterion("BEGIN_DATE <=", value, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateIn(List<Date> values) {
       addCriterion("BEGIN_DATE in", values, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateNotIn(List<Date> values) {
       addCriterion("BEGIN_DATE not in", values, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateBetween(Date value1, Date value2) {
       addCriterion("BEGIN_DATE between", value1, value2, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andBeginDateNotBetween(Date value1, Date value2) {
       addCriterion("BEGIN_DATE not between", value1, value2, "beginDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateIsNull() {
       addCriterion("END_DATE is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateIsNotNull() {
       addCriterion("END_DATE is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateEqualTo(Date value) {
       addCriterion("END_DATE =", value, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateNotEqualTo(Date value) {
       addCriterion("END_DATE <>", value, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateGreaterThan(Date value) {
       addCriterion("END_DATE >", value, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateGreaterThanOrEqualTo(Date value) {
       addCriterion("END_DATE >=", value, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateLessThan(Date value) {
       addCriterion("END_DATE <", value, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateLessThanOrEqualTo(Date value) {
       addCriterion("END_DATE <=", value, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateIn(List<Date> values) {
       addCriterion("END_DATE in", values, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateNotIn(List<Date> values) {
       addCriterion("END_DATE not in", values, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateBetween(Date value1, Date value2) {
       addCriterion("END_DATE between", value1, value2, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andEndDateNotBetween(Date value1, Date value2) {
       addCriterion("END_DATE not between", value1, value2, "endDate");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusIsNull() {
       addCriterion("STATUS is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusIsNotNull() {
       addCriterion("STATUS is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusEqualTo(String value) {
       addCriterion("STATUS =", value, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusNotEqualTo(String value) {
       addCriterion("STATUS <>", value, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusGreaterThan(String value) {
       addCriterion("STATUS >", value, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
       addCriterion("STATUS >=", value, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusLessThan(String value) {
       addCriterion("STATUS <", value, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusLessThanOrEqualTo(String value) {
       addCriterion("STATUS <=", value, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusLike(String value) {
       addCriterion("STATUS like", value, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusNotLike(String value) {
       addCriterion("STATUS not like", value, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusIn(List<String> values) {
       addCriterion("STATUS in", values, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusNotIn(List<String> values) {
       addCriterion("STATUS not in", values, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusBetween(String value1, String value2) {
       addCriterion("STATUS between", value1, value2, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andStatusNotBetween(String value1, String value2) {
       addCriterion("STATUS not between", value1, value2, "status");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeIsNull() {
       addCriterion("create_time is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("create_time is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeEqualTo(Date value) {
       addCriterion("create_time =", value, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeNotEqualTo(Date value) {
       addCriterion("create_time <>", value, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeGreaterThan(Date value) {
       addCriterion("create_time >", value, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("create_time >=", value, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeLessThan(Date value) {
       addCriterion("create_time <", value, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
       addCriterion("create_time <=", value, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeIn(List<Date> values) {
       addCriterion("create_time in", values, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeNotIn(List<Date> values) {
       addCriterion("create_time not in", values, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
       addCriterion("create_time between", value1, value2, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
       addCriterion("create_time not between", value1, value2, "createTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserIsNull() {
       addCriterion("create_user is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserIsNotNull() {
       addCriterion("create_user is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserEqualTo(String value) {
       addCriterion("create_user =", value, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserNotEqualTo(String value) {
       addCriterion("create_user <>", value, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserGreaterThan(String value) {
       addCriterion("create_user >", value, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserGreaterThanOrEqualTo(String value) {
       addCriterion("create_user >=", value, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserLessThan(String value) {
       addCriterion("create_user <", value, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserLessThanOrEqualTo(String value) {
       addCriterion("create_user <=", value, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserLike(String value) {
       addCriterion("create_user like", value, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserNotLike(String value) {
       addCriterion("create_user not like", value, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserIn(List<String> values) {
       addCriterion("create_user in", values, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserNotIn(List<String> values) {
       addCriterion("create_user not in", values, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserBetween(String value1, String value2) {
       addCriterion("create_user between", value1, value2, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andCreateUserNotBetween(String value1, String value2) {
       addCriterion("create_user not between", value1, value2, "createUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeIsNull() {
       addCriterion("update_time is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeIsNotNull() {
       addCriterion("update_time is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeEqualTo(Date value) {
       addCriterion("update_time =", value, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeNotEqualTo(Date value) {
       addCriterion("update_time <>", value, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeGreaterThan(Date value) {
       addCriterion("update_time >", value, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("update_time >=", value, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeLessThan(Date value) {
       addCriterion("update_time <", value, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
       addCriterion("update_time <=", value, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeIn(List<Date> values) {
       addCriterion("update_time in", values, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeNotIn(List<Date> values) {
       addCriterion("update_time not in", values, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
       addCriterion("update_time between", value1, value2, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
       addCriterion("update_time not between", value1, value2, "updateTime");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserIsNull() {
       addCriterion("update_user is null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserIsNotNull() {
       addCriterion("update_user is not null");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserEqualTo(String value) {
       addCriterion("update_user =", value, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserNotEqualTo(String value) {
       addCriterion("update_user <>", value, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserGreaterThan(String value) {
       addCriterion("update_user >", value, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
       addCriterion("update_user >=", value, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserLessThan(String value) {
       addCriterion("update_user <", value, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserLessThanOrEqualTo(String value) {
       addCriterion("update_user <=", value, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserLike(String value) {
       addCriterion("update_user like", value, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserNotLike(String value) {
       addCriterion("update_user not like", value, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserIn(List<String> values) {
       addCriterion("update_user in", values, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserNotIn(List<String> values) {
       addCriterion("update_user not in", values, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserBetween(String value1, String value2) {
       addCriterion("update_user between", value1, value2, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
 
     public FlowRuleExample.Criteria andUpdateUserNotBetween(String value1, String value2) {
       addCriterion("update_user not between", value1, value2, "updateUser");
       return (FlowRuleExample.Criteria)this;
     }
   }
 }

