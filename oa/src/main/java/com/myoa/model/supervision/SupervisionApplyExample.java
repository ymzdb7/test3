 package com.myoa.model.supervision;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class SupervisionApplyExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public SupervisionApplyExample()
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
 
   public static class Criteria extends SupervisionApplyExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<SupervisionApplyExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<SupervisionApplyExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<SupervisionApplyExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new SupervisionApplyExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new SupervisionApplyExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new SupervisionApplyExample.Criterion(condition, value1, value2));
     }
 
     public SupervisionApplyExample.Criteria andSidIsNull() {
       addCriterion("sid is null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidIsNotNull() {
       addCriterion("sid is not null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidEqualTo(Integer value) {
       addCriterion("sid =", value, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidNotEqualTo(Integer value) {
       addCriterion("sid <>", value, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidGreaterThan(Integer value) {
       addCriterion("sid >", value, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidGreaterThanOrEqualTo(Integer value) {
       addCriterion("sid >=", value, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidLessThan(Integer value) {
       addCriterion("sid <", value, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidLessThanOrEqualTo(Integer value) {
       addCriterion("sid <=", value, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidIn(List<Integer> values) {
       addCriterion("sid in", values, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidNotIn(List<Integer> values) {
       addCriterion("sid not in", values, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidBetween(Integer value1, Integer value2) {
       addCriterion("sid between", value1, value2, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSidNotBetween(Integer value1, Integer value2) {
       addCriterion("sid not between", value1, value2, "sid");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusIsNull() {
       addCriterion("status is null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusIsNotNull() {
       addCriterion("status is not null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusEqualTo(Integer value) {
       addCriterion("status =", value, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusNotEqualTo(Integer value) {
       addCriterion("status <>", value, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusGreaterThan(Integer value) {
       addCriterion("status >", value, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("status >=", value, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusLessThan(Integer value) {
       addCriterion("status <", value, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
       addCriterion("status <=", value, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusIn(List<Integer> values) {
       addCriterion("status in", values, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusNotIn(List<Integer> values) {
       addCriterion("status not in", values, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusBetween(Integer value1, Integer value2) {
       addCriterion("status between", value1, value2, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("status not between", value1, value2, "status");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentIsNull() {
       addCriterion("content is null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentIsNotNull() {
       addCriterion("content is not null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentEqualTo(String value) {
       addCriterion("content =", value, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentNotEqualTo(String value) {
       addCriterion("content <>", value, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentGreaterThan(String value) {
       addCriterion("content >", value, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentGreaterThanOrEqualTo(String value) {
       addCriterion("content >=", value, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentLessThan(String value) {
       addCriterion("content <", value, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentLessThanOrEqualTo(String value) {
       addCriterion("content <=", value, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentLike(String value) {
       addCriterion("content like", value, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentNotLike(String value) {
       addCriterion("content not like", value, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentIn(List<String> values) {
       addCriterion("content in", values, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentNotIn(List<String> values) {
       addCriterion("content not in", values, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentBetween(String value1, String value2) {
       addCriterion("content between", value1, value2, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andContentNotBetween(String value1, String value2) {
       addCriterion("content not between", value1, value2, "content");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeEqualTo(Integer value) {
       addCriterion("type =", value, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeNotEqualTo(Integer value) {
       addCriterion("type <>", value, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeGreaterThan(Integer value) {
       addCriterion("type >", value, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("type >=", value, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeLessThan(Integer value) {
       addCriterion("type <", value, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeLessThanOrEqualTo(Integer value) {
       addCriterion("type <=", value, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeIn(List<Integer> values) {
       addCriterion("type in", values, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeNotIn(List<Integer> values) {
       addCriterion("type not in", values, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeBetween(Integer value1, Integer value2) {
       addCriterion("type between", value1, value2, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("type not between", value1, value2, "type");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeIsNull() {
       addCriterion("create_time is null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("create_time is not null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeEqualTo(Date value) {
       addCriterion("create_time =", value, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeNotEqualTo(Date value) {
       addCriterion("create_time <>", value, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeGreaterThan(Date value) {
       addCriterion("create_time >", value, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("create_time >=", value, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeLessThan(Date value) {
       addCriterion("create_time <", value, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
       addCriterion("create_time <=", value, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeIn(List<Date> values) {
       addCriterion("create_time in", values, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeNotIn(List<Date> values) {
       addCriterion("create_time not in", values, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
       addCriterion("create_time between", value1, value2, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
       addCriterion("create_time not between", value1, value2, "createTime");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonIsNull() {
       addCriterion("reason is null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonIsNotNull() {
       addCriterion("reason is not null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonEqualTo(String value) {
       addCriterion("reason =", value, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonNotEqualTo(String value) {
       addCriterion("reason <>", value, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonGreaterThan(String value) {
       addCriterion("reason >", value, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonGreaterThanOrEqualTo(String value) {
       addCriterion("reason >=", value, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonLessThan(String value) {
       addCriterion("reason <", value, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonLessThanOrEqualTo(String value) {
       addCriterion("reason <=", value, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonLike(String value) {
       addCriterion("reason like", value, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonNotLike(String value) {
       addCriterion("reason not like", value, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonIn(List<String> values) {
       addCriterion("reason in", values, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonNotIn(List<String> values) {
       addCriterion("reason not in", values, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonBetween(String value1, String value2) {
       addCriterion("reason between", value1, value2, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andReasonNotBetween(String value1, String value2) {
       addCriterion("reason not between", value1, value2, "reason");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdIsNull() {
       addCriterion("creater_id is null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdIsNotNull() {
       addCriterion("creater_id is not null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdEqualTo(Integer value) {
       addCriterion("creater_id =", value, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdNotEqualTo(Integer value) {
       addCriterion("creater_id <>", value, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdGreaterThan(Integer value) {
       addCriterion("creater_id >", value, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("creater_id >=", value, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdLessThan(Integer value) {
       addCriterion("creater_id <", value, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdLessThanOrEqualTo(Integer value) {
       addCriterion("creater_id <=", value, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdIn(List<Integer> values) {
       addCriterion("creater_id in", values, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdNotIn(List<Integer> values) {
       addCriterion("creater_id not in", values, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdBetween(Integer value1, Integer value2) {
       addCriterion("creater_id between", value1, value2, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andCreaterIdNotBetween(Integer value1, Integer value2) {
       addCriterion("creater_id not between", value1, value2, "createrId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdIsNull() {
       addCriterion("sup_id is null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdIsNotNull() {
       addCriterion("sup_id is not null");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdEqualTo(Integer value) {
       addCriterion("sup_id =", value, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdNotEqualTo(Integer value) {
       addCriterion("sup_id <>", value, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdGreaterThan(Integer value) {
       addCriterion("sup_id >", value, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("sup_id >=", value, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdLessThan(Integer value) {
       addCriterion("sup_id <", value, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdLessThanOrEqualTo(Integer value) {
       addCriterion("sup_id <=", value, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdIn(List<Integer> values) {
       addCriterion("sup_id in", values, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdNotIn(List<Integer> values) {
       addCriterion("sup_id not in", values, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdBetween(Integer value1, Integer value2) {
       addCriterion("sup_id between", value1, value2, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
 
     public SupervisionApplyExample.Criteria andSupIdNotBetween(Integer value1, Integer value2) {
       addCriterion("sup_id not between", value1, value2, "supId");
       return (SupervisionApplyExample.Criteria)this;
     }
   }
 }
