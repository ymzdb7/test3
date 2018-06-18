 package com.myoa.model.workPlan;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class WorkDetailExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public WorkDetailExample()
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
 
   public static class Criteria extends WorkDetailExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<WorkDetailExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<WorkDetailExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<WorkDetailExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new WorkDetailExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new WorkDetailExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new WorkDetailExample.Criterion(condition, value1, value2));
     }
 
     public WorkDetailExample.Criteria andDetailIdIsNull() {
       addCriterion("DETAIL_ID is null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdIsNotNull() {
       addCriterion("DETAIL_ID is not null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdEqualTo(Integer value) {
       addCriterion("DETAIL_ID =", value, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdNotEqualTo(Integer value) {
       addCriterion("DETAIL_ID <>", value, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdGreaterThan(Integer value) {
       addCriterion("DETAIL_ID >", value, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("DETAIL_ID >=", value, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdLessThan(Integer value) {
       addCriterion("DETAIL_ID <", value, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdLessThanOrEqualTo(Integer value) {
       addCriterion("DETAIL_ID <=", value, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdIn(List<Integer> values) {
       addCriterion("DETAIL_ID in", values, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdNotIn(List<Integer> values) {
       addCriterion("DETAIL_ID not in", values, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdBetween(Integer value1, Integer value2) {
       addCriterion("DETAIL_ID between", value1, value2, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
       addCriterion("DETAIL_ID not between", value1, value2, "detailId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdIsNull() {
       addCriterion("PLAN_ID is null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdIsNotNull() {
       addCriterion("PLAN_ID is not null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdEqualTo(String value) {
       addCriterion("PLAN_ID =", value, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdNotEqualTo(String value) {
       addCriterion("PLAN_ID <>", value, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdGreaterThan(String value) {
       addCriterion("PLAN_ID >", value, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdGreaterThanOrEqualTo(String value) {
       addCriterion("PLAN_ID >=", value, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdLessThan(String value) {
       addCriterion("PLAN_ID <", value, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdLessThanOrEqualTo(String value) {
       addCriterion("PLAN_ID <=", value, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdLike(String value) {
       addCriterion("PLAN_ID like", value, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdNotLike(String value) {
       addCriterion("PLAN_ID not like", value, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdIn(List<String> values) {
       addCriterion("PLAN_ID in", values, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdNotIn(List<String> values) {
       addCriterion("PLAN_ID not in", values, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdBetween(String value1, String value2) {
       addCriterion("PLAN_ID between", value1, value2, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPlanIdNotBetween(String value1, String value2) {
       addCriterion("PLAN_ID not between", value1, value2, "planId");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeIsNull() {
       addCriterion("WRITE_TIME is null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeIsNotNull() {
       addCriterion("WRITE_TIME is not null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeEqualTo(Date value) {
       addCriterion("WRITE_TIME =", value, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeNotEqualTo(Date value) {
       addCriterion("WRITE_TIME <>", value, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeGreaterThan(Date value) {
       addCriterion("WRITE_TIME >", value, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("WRITE_TIME >=", value, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeLessThan(Date value) {
       addCriterion("WRITE_TIME <", value, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeLessThanOrEqualTo(Date value) {
       addCriterion("WRITE_TIME <=", value, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeIn(List<Date> values) {
       addCriterion("WRITE_TIME in", values, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeNotIn(List<Date> values) {
       addCriterion("WRITE_TIME not in", values, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeBetween(Date value1, Date value2) {
       addCriterion("WRITE_TIME between", value1, value2, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriteTimeNotBetween(Date value1, Date value2) {
       addCriterion("WRITE_TIME not between", value1, value2, "writeTime");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentIsNull() {
       addCriterion("PERCENT is null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentIsNotNull() {
       addCriterion("PERCENT is not null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentEqualTo(Integer value) {
       addCriterion("PERCENT =", value, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentNotEqualTo(Integer value) {
       addCriterion("PERCENT <>", value, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentGreaterThan(Integer value) {
       addCriterion("PERCENT >", value, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentGreaterThanOrEqualTo(Integer value) {
       addCriterion("PERCENT >=", value, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentLessThan(Integer value) {
       addCriterion("PERCENT <", value, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentLessThanOrEqualTo(Integer value) {
       addCriterion("PERCENT <=", value, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentIn(List<Integer> values) {
       addCriterion("PERCENT in", values, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentNotIn(List<Integer> values) {
       addCriterion("PERCENT not in", values, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentBetween(Integer value1, Integer value2) {
       addCriterion("PERCENT between", value1, value2, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andPercentNotBetween(Integer value1, Integer value2) {
       addCriterion("PERCENT not between", value1, value2, "percent");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagIsNull() {
       addCriterion("TYPE_FLAG is null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagIsNotNull() {
       addCriterion("TYPE_FLAG is not null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagEqualTo(String value) {
       addCriterion("TYPE_FLAG =", value, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagNotEqualTo(String value) {
       addCriterion("TYPE_FLAG <>", value, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagGreaterThan(String value) {
       addCriterion("TYPE_FLAG >", value, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagGreaterThanOrEqualTo(String value) {
       addCriterion("TYPE_FLAG >=", value, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagLessThan(String value) {
       addCriterion("TYPE_FLAG <", value, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagLessThanOrEqualTo(String value) {
       addCriterion("TYPE_FLAG <=", value, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagLike(String value) {
       addCriterion("TYPE_FLAG like", value, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagNotLike(String value) {
       addCriterion("TYPE_FLAG not like", value, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagIn(List<String> values) {
       addCriterion("TYPE_FLAG in", values, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagNotIn(List<String> values) {
       addCriterion("TYPE_FLAG not in", values, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagBetween(String value1, String value2) {
       addCriterion("TYPE_FLAG between", value1, value2, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andTypeFlagNotBetween(String value1, String value2) {
       addCriterion("TYPE_FLAG not between", value1, value2, "typeFlag");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterIsNull() {
       addCriterion("WRITER is null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterIsNotNull() {
       addCriterion("WRITER is not null");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterEqualTo(String value) {
       addCriterion("WRITER =", value, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterNotEqualTo(String value) {
       addCriterion("WRITER <>", value, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterGreaterThan(String value) {
       addCriterion("WRITER >", value, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterGreaterThanOrEqualTo(String value) {
       addCriterion("WRITER >=", value, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterLessThan(String value) {
       addCriterion("WRITER <", value, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterLessThanOrEqualTo(String value) {
       addCriterion("WRITER <=", value, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterLike(String value) {
       addCriterion("WRITER like", value, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterNotLike(String value) {
       addCriterion("WRITER not like", value, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterIn(List<String> values) {
       addCriterion("WRITER in", values, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterNotIn(List<String> values) {
       addCriterion("WRITER not in", values, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterBetween(String value1, String value2) {
       addCriterion("WRITER between", value1, value2, "writer");
       return (WorkDetailExample.Criteria)this;
     }
 
     public WorkDetailExample.Criteria andWriterNotBetween(String value1, String value2) {
       addCriterion("WRITER not between", value1, value2, "writer");
       return (WorkDetailExample.Criteria)this;
     }
   }
 }

