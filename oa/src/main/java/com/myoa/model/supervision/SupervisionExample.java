 package com.myoa.model.supervision;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class SupervisionExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public SupervisionExample()
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
 
   public static class Criteria extends SupervisionExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<SupervisionExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<SupervisionExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<SupervisionExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new SupervisionExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new SupervisionExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new SupervisionExample.Criterion(condition, value1, value2));
     }
 
     public SupervisionExample.Criteria andSidIsNull() {
       addCriterion("sid is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidIsNotNull() {
       addCriterion("sid is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidEqualTo(Integer value) {
       addCriterion("sid =", value, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidNotEqualTo(Integer value) {
       addCriterion("sid <>", value, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidGreaterThan(Integer value) {
       addCriterion("sid >", value, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidGreaterThanOrEqualTo(Integer value) {
       addCriterion("sid >=", value, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidLessThan(Integer value) {
       addCriterion("sid <", value, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidLessThanOrEqualTo(Integer value) {
       addCriterion("sid <=", value, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidIn(List<Integer> values) {
       addCriterion("sid in", values, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidNotIn(List<Integer> values) {
       addCriterion("sid not in", values, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidBetween(Integer value1, Integer value2) {
       addCriterion("sid between", value1, value2, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSidNotBetween(Integer value1, Integer value2) {
       addCriterion("sid not between", value1, value2, "sid");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameIsNull() {
       addCriterion("sup_name is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameIsNotNull() {
       addCriterion("sup_name is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameEqualTo(String value) {
       addCriterion("sup_name =", value, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameNotEqualTo(String value) {
       addCriterion("sup_name <>", value, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameGreaterThan(String value) {
       addCriterion("sup_name >", value, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameGreaterThanOrEqualTo(String value) {
       addCriterion("sup_name >=", value, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameLessThan(String value) {
       addCriterion("sup_name <", value, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameLessThanOrEqualTo(String value) {
       addCriterion("sup_name <=", value, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameLike(String value) {
       addCriterion("sup_name like", value, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameNotLike(String value) {
       addCriterion("sup_name not like", value, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameIn(List<String> values) {
       addCriterion("sup_name in", values, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameNotIn(List<String> values) {
       addCriterion("sup_name not in", values, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameBetween(String value1, String value2) {
       addCriterion("sup_name between", value1, value2, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andSupNameNotBetween(String value1, String value2) {
       addCriterion("sup_name not between", value1, value2, "supName");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdIsNull() {
       addCriterion("type_id is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdIsNotNull() {
       addCriterion("type_id is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdEqualTo(Integer value) {
       addCriterion("type_id =", value, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdNotEqualTo(Integer value) {
       addCriterion("type_id <>", value, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdGreaterThan(Integer value) {
       addCriterion("type_id >", value, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("type_id >=", value, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdLessThan(Integer value) {
       addCriterion("type_id <", value, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdLessThanOrEqualTo(Integer value) {
       addCriterion("type_id <=", value, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdIn(List<Integer> values) {
       addCriterion("type_id in", values, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdNotIn(List<Integer> values) {
       addCriterion("type_id not in", values, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdBetween(Integer value1, Integer value2) {
       addCriterion("type_id between", value1, value2, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
       addCriterion("type_id not between", value1, value2, "typeId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdIsNull() {
       addCriterion("leader_id is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdIsNotNull() {
       addCriterion("leader_id is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdEqualTo(Integer value) {
       addCriterion("leader_id =", value, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdNotEqualTo(Integer value) {
       addCriterion("leader_id <>", value, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdGreaterThan(Integer value) {
       addCriterion("leader_id >", value, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("leader_id >=", value, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdLessThan(Integer value) {
       addCriterion("leader_id <", value, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdLessThanOrEqualTo(Integer value) {
       addCriterion("leader_id <=", value, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdIn(List<Integer> values) {
       addCriterion("leader_id in", values, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdNotIn(List<Integer> values) {
       addCriterion("leader_id not in", values, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdBetween(Integer value1, Integer value2) {
       addCriterion("leader_id between", value1, value2, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andLeaderIdNotBetween(Integer value1, Integer value2) {
       addCriterion("leader_id not between", value1, value2, "leaderId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdIsNull() {
       addCriterion("manager_id is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdIsNotNull() {
       addCriterion("manager_id is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdEqualTo(Integer value) {
       addCriterion("manager_id =", value, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdNotEqualTo(Integer value) {
       addCriterion("manager_id <>", value, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdGreaterThan(Integer value) {
       addCriterion("manager_id >", value, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("manager_id >=", value, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdLessThan(Integer value) {
       addCriterion("manager_id <", value, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdLessThanOrEqualTo(Integer value) {
       addCriterion("manager_id <=", value, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdIn(List<Integer> values) {
       addCriterion("manager_id in", values, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdNotIn(List<Integer> values) {
       addCriterion("manager_id not in", values, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdBetween(Integer value1, Integer value2) {
       addCriterion("manager_id between", value1, value2, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
       addCriterion("manager_id not between", value1, value2, "managerId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeIsNull() {
       addCriterion("end_time is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeIsNotNull() {
       addCriterion("end_time is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeEqualTo(Date value) {
       addCriterion("end_time =", value, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeNotEqualTo(Date value) {
       addCriterion("end_time <>", value, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeGreaterThan(Date value) {
       addCriterion("end_time >", value, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("end_time >=", value, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeLessThan(Date value) {
       addCriterion("end_time <", value, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeLessThanOrEqualTo(Date value) {
       addCriterion("end_time <=", value, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeIn(List<Date> values) {
       addCriterion("end_time in", values, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeNotIn(List<Date> values) {
       addCriterion("end_time not in", values, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeBetween(Date value1, Date value2) {
       addCriterion("end_time between", value1, value2, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andEndTimeNotBetween(Date value1, Date value2) {
       addCriterion("end_time not between", value1, value2, "endTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeIsNull() {
       addCriterion("begin_time is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeIsNotNull() {
       addCriterion("begin_time is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeEqualTo(Date value) {
       addCriterion("begin_time =", value, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeNotEqualTo(Date value) {
       addCriterion("begin_time <>", value, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeGreaterThan(Date value) {
       addCriterion("begin_time >", value, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("begin_time >=", value, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeLessThan(Date value) {
       addCriterion("begin_time <", value, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeLessThanOrEqualTo(Date value) {
       addCriterion("begin_time <=", value, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeIn(List<Date> values) {
       addCriterion("begin_time in", values, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeNotIn(List<Date> values) {
       addCriterion("begin_time not in", values, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeBetween(Date value1, Date value2) {
       addCriterion("begin_time between", value1, value2, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andBeginTimeNotBetween(Date value1, Date value2) {
       addCriterion("begin_time not between", value1, value2, "beginTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentIsNull() {
       addCriterion("content is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentIsNotNull() {
       addCriterion("content is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentEqualTo(String value) {
       addCriterion("content =", value, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentNotEqualTo(String value) {
       addCriterion("content <>", value, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentGreaterThan(String value) {
       addCriterion("content >", value, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentGreaterThanOrEqualTo(String value) {
       addCriterion("content >=", value, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentLessThan(String value) {
       addCriterion("content <", value, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentLessThanOrEqualTo(String value) {
       addCriterion("content <=", value, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentLike(String value) {
       addCriterion("content like", value, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentNotLike(String value) {
       addCriterion("content not like", value, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentIn(List<String> values) {
       addCriterion("content in", values, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentNotIn(List<String> values) {
       addCriterion("content not in", values, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentBetween(String value1, String value2) {
       addCriterion("content between", value1, value2, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andContentNotBetween(String value1, String value2) {
       addCriterion("content not between", value1, value2, "content");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdIsNull() {
       addCriterion("creater_id is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdIsNotNull() {
       addCriterion("creater_id is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdEqualTo(Integer value) {
       addCriterion("creater_id =", value, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdNotEqualTo(Integer value) {
       addCriterion("creater_id <>", value, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdGreaterThan(Integer value) {
       addCriterion("creater_id >", value, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("creater_id >=", value, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdLessThan(Integer value) {
       addCriterion("creater_id <", value, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdLessThanOrEqualTo(Integer value) {
       addCriterion("creater_id <=", value, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdIn(List<Integer> values) {
       addCriterion("creater_id in", values, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdNotIn(List<Integer> values) {
       addCriterion("creater_id not in", values, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdBetween(Integer value1, Integer value2) {
       addCriterion("creater_id between", value1, value2, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterIdNotBetween(Integer value1, Integer value2) {
       addCriterion("creater_id not between", value1, value2, "createrId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeIsNull() {
       addCriterion("creater_time is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeIsNotNull() {
       addCriterion("creater_time is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeEqualTo(Date value) {
       addCriterion("creater_time =", value, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeNotEqualTo(Date value) {
       addCriterion("creater_time <>", value, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeGreaterThan(Date value) {
       addCriterion("creater_time >", value, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("creater_time >=", value, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeLessThan(Date value) {
       addCriterion("creater_time <", value, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
       addCriterion("creater_time <=", value, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeIn(List<Date> values) {
       addCriterion("creater_time in", values, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeNotIn(List<Date> values) {
       addCriterion("creater_time not in", values, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeBetween(Date value1, Date value2) {
       addCriterion("creater_time between", value1, value2, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
       addCriterion("creater_time not between", value1, value2, "createrTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusIsNull() {
       addCriterion("status is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusIsNotNull() {
       addCriterion("status is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusEqualTo(Integer value) {
       addCriterion("status =", value, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusNotEqualTo(Integer value) {
       addCriterion("status <>", value, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusGreaterThan(Integer value) {
       addCriterion("status >", value, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("status >=", value, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusLessThan(Integer value) {
       addCriterion("status <", value, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
       addCriterion("status <=", value, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusIn(List<Integer> values) {
       addCriterion("status in", values, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusNotIn(List<Integer> values) {
       addCriterion("status not in", values, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusBetween(Integer value1, Integer value2) {
       addCriterion("status between", value1, value2, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("status not between", value1, value2, "status");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdIsNull() {
       addCriterion("parent_id is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdIsNotNull() {
       addCriterion("parent_id is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdEqualTo(Integer value) {
       addCriterion("parent_id =", value, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdNotEqualTo(Integer value) {
       addCriterion("parent_id <>", value, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdGreaterThan(Integer value) {
       addCriterion("parent_id >", value, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("parent_id >=", value, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdLessThan(Integer value) {
       addCriterion("parent_id <", value, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdLessThanOrEqualTo(Integer value) {
       addCriterion("parent_id <=", value, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdIn(List<Integer> values) {
       addCriterion("parent_id in", values, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdNotIn(List<Integer> values) {
       addCriterion("parent_id not in", values, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdBetween(Integer value1, Integer value2) {
       addCriterion("parent_id between", value1, value2, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andParentIdNotBetween(Integer value1, Integer value2) {
       addCriterion("parent_id not between", value1, value2, "parentId");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeIsNull() {
       addCriterion("real_end_time is null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeIsNotNull() {
       addCriterion("real_end_time is not null");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeEqualTo(Date value) {
       addCriterion("real_end_time =", value, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeNotEqualTo(Date value) {
       addCriterion("real_end_time <>", value, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeGreaterThan(Date value) {
       addCriterion("real_end_time >", value, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("real_end_time >=", value, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeLessThan(Date value) {
       addCriterion("real_end_time <", value, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeLessThanOrEqualTo(Date value) {
       addCriterion("real_end_time <=", value, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeIn(List<Date> values) {
       addCriterion("real_end_time in", values, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeNotIn(List<Date> values) {
       addCriterion("real_end_time not in", values, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeBetween(Date value1, Date value2) {
       addCriterion("real_end_time between", value1, value2, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
 
     public SupervisionExample.Criteria andRealEndTimeNotBetween(Date value1, Date value2) {
       addCriterion("real_end_time not between", value1, value2, "realEndTime");
       return (SupervisionExample.Criteria)this;
     }
   }
 }

