 package com.myoa.model.timedTaskManagement;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class TimedTaskManagementExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public TimedTaskManagementExample()
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
 
   public static class Criteria extends TimedTaskManagementExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<TimedTaskManagementExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<TimedTaskManagementExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<TimedTaskManagementExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TimedTaskManagementExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TimedTaskManagementExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TimedTaskManagementExample.Criterion(condition, value1, value2));
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdIsNull() {
       addCriterion("TTM_ID is null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdIsNotNull() {
       addCriterion("TTM_ID is not null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdEqualTo(Integer value) {
       addCriterion("TTM_ID =", value, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdNotEqualTo(Integer value) {
       addCriterion("TTM_ID <>", value, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdGreaterThan(Integer value) {
       addCriterion("TTM_ID >", value, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("TTM_ID >=", value, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdLessThan(Integer value) {
       addCriterion("TTM_ID <", value, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdLessThanOrEqualTo(Integer value) {
       addCriterion("TTM_ID <=", value, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdIn(List<Integer> values) {
       addCriterion("TTM_ID in", values, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdNotIn(List<Integer> values) {
       addCriterion("TTM_ID not in", values, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdBetween(Integer value1, Integer value2) {
       addCriterion("TTM_ID between", value1, value2, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTtmIdNotBetween(Integer value1, Integer value2) {
       addCriterion("TTM_ID not between", value1, value2, "ttmId");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameIsNull() {
       addCriterion("TASK_NAME is null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameIsNotNull() {
       addCriterion("TASK_NAME is not null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameEqualTo(String value) {
       addCriterion("TASK_NAME =", value, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameNotEqualTo(String value) {
       addCriterion("TASK_NAME <>", value, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameGreaterThan(String value) {
       addCriterion("TASK_NAME >", value, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameGreaterThanOrEqualTo(String value) {
       addCriterion("TASK_NAME >=", value, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameLessThan(String value) {
       addCriterion("TASK_NAME <", value, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameLessThanOrEqualTo(String value) {
       addCriterion("TASK_NAME <=", value, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameLike(String value) {
       addCriterion("TASK_NAME like", value, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameNotLike(String value) {
       addCriterion("TASK_NAME not like", value, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameIn(List<String> values) {
       addCriterion("TASK_NAME in", values, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameNotIn(List<String> values) {
       addCriterion("TASK_NAME not in", values, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameBetween(String value1, String value2) {
       addCriterion("TASK_NAME between", value1, value2, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskNameNotBetween(String value1, String value2) {
       addCriterion("TASK_NAME not between", value1, value2, "taskName");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionIsNull() {
       addCriterion("\"TASK_ DESCRIPTION\" is null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionIsNotNull() {
       addCriterion("\"TASK_ DESCRIPTION\" is not null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionEqualTo(String value) {
       addCriterion("\"TASK_ DESCRIPTION\" =", value, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionNotEqualTo(String value) {
       addCriterion("\"TASK_ DESCRIPTION\" <>", value, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionGreaterThan(String value) {
       addCriterion("\"TASK_ DESCRIPTION\" >", value, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionGreaterThanOrEqualTo(String value) {
       addCriterion("\"TASK_ DESCRIPTION\" >=", value, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionLessThan(String value) {
       addCriterion("\"TASK_ DESCRIPTION\" <", value, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionLessThanOrEqualTo(String value) {
       addCriterion("\"TASK_ DESCRIPTION\" <=", value, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionLike(String value) {
       addCriterion("\"TASK_ DESCRIPTION\" like", value, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionNotLike(String value) {
       addCriterion("\"TASK_ DESCRIPTION\" not like", value, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionIn(List<String> values) {
       addCriterion("\"TASK_ DESCRIPTION\" in", values, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionNotIn(List<String> values) {
       addCriterion("\"TASK_ DESCRIPTION\" not in", values, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionBetween(String value1, String value2) {
       addCriterion("\"TASK_ DESCRIPTION\" between", value1, value2, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskDescriptionNotBetween(String value1, String value2) {
       addCriterion("\"TASK_ DESCRIPTION\" not between", value1, value2, "taskDescription");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetIsNull() {
       addCriterion("TYPE_MET is null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetIsNotNull() {
       addCriterion("TYPE_MET is not null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetEqualTo(Integer value) {
       addCriterion("TYPE_MET =", value, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetNotEqualTo(Integer value) {
       addCriterion("TYPE_MET <>", value, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetGreaterThan(Integer value) {
       addCriterion("TYPE_MET >", value, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetGreaterThanOrEqualTo(Integer value) {
       addCriterion("TYPE_MET >=", value, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetLessThan(Integer value) {
       addCriterion("TYPE_MET <", value, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetLessThanOrEqualTo(Integer value) {
       addCriterion("TYPE_MET <=", value, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetIn(List<Integer> values) {
       addCriterion("TYPE_MET in", values, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetNotIn(List<Integer> values) {
       addCriterion("TYPE_MET not in", values, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetBetween(Integer value1, Integer value2) {
       addCriterion("TYPE_MET between", value1, value2, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTypeMetNotBetween(Integer value1, Integer value2) {
       addCriterion("TYPE_MET not between", value1, value2, "typeMet");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeIsNull() {
       addCriterion("TASK_TYPE is null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeIsNotNull() {
       addCriterion("TASK_TYPE is not null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeEqualTo(Integer value) {
       addCriterion("TASK_TYPE =", value, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeNotEqualTo(Integer value) {
       addCriterion("TASK_TYPE <>", value, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeGreaterThan(Integer value) {
       addCriterion("TASK_TYPE >", value, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("TASK_TYPE >=", value, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeLessThan(Integer value) {
       addCriterion("TASK_TYPE <", value, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeLessThanOrEqualTo(Integer value) {
       addCriterion("TASK_TYPE <=", value, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeIn(List<Integer> values) {
       addCriterion("TASK_TYPE in", values, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeNotIn(List<Integer> values) {
       addCriterion("TASK_TYPE not in", values, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeBetween(Integer value1, Integer value2) {
       addCriterion("TASK_TYPE between", value1, value2, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andTaskTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("TASK_TYPE not between", value1, value2, "taskType");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteIsNull() {
       addCriterion("EXECUTE is null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteIsNotNull() {
       addCriterion("EXECUTE is not null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteEqualTo(Integer value) {
       addCriterion("EXECUTE =", value, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteNotEqualTo(Integer value) {
       addCriterion("EXECUTE <>", value, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteGreaterThan(Integer value) {
       addCriterion("EXECUTE >", value, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteGreaterThanOrEqualTo(Integer value) {
       addCriterion("EXECUTE >=", value, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteLessThan(Integer value) {
       addCriterion("EXECUTE <", value, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteLessThanOrEqualTo(Integer value) {
       addCriterion("EXECUTE <=", value, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteIn(List<Integer> values) {
       addCriterion("EXECUTE in", values, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteNotIn(List<Integer> values) {
       addCriterion("EXECUTE not in", values, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteBetween(Integer value1, Integer value2) {
       addCriterion("EXECUTE between", value1, value2, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andExecuteNotBetween(Integer value1, Integer value2) {
       addCriterion("EXECUTE not between", value1, value2, "execute");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeIsNull() {
       addCriterion("INTWEVAL_TIME is null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeIsNotNull() {
       addCriterion("INTWEVAL_TIME is not null");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeEqualTo(String value) {
       addCriterion("INTWEVAL_TIME =", value, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeNotEqualTo(String value) {
       addCriterion("INTWEVAL_TIME <>", value, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeGreaterThan(String value) {
       addCriterion("INTWEVAL_TIME >", value, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeGreaterThanOrEqualTo(String value) {
       addCriterion("INTWEVAL_TIME >=", value, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeLessThan(String value) {
       addCriterion("INTWEVAL_TIME <", value, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeLessThanOrEqualTo(String value) {
       addCriterion("INTWEVAL_TIME <=", value, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeLike(String value) {
       addCriterion("INTWEVAL_TIME like", value, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeNotLike(String value) {
       addCriterion("INTWEVAL_TIME not like", value, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeIn(List<String> values) {
       addCriterion("INTWEVAL_TIME in", values, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeNotIn(List<String> values) {
       addCriterion("INTWEVAL_TIME not in", values, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeBetween(String value1, String value2) {
       addCriterion("INTWEVAL_TIME between", value1, value2, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
 
     public TimedTaskManagementExample.Criteria andIntwevalTimeNotBetween(String value1, String value2) {
       addCriterion("INTWEVAL_TIME not between", value1, value2, "intwevalTime");
       return (TimedTaskManagementExample.Criteria)this;
     }
   }
 }

