 package com.myoa.model.workflow;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class FlowQueryTplExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public FlowQueryTplExample()
   {
     this.oredCriteria = new ArrayList();
   }
 
   public void setOrderByClause(String orderByClause) {
     this.orderByClause = orderByClause;
   }
 
   public String getOrderByClause() {
     return this.orderByClause;
   }
 
   public void setDistinct(boolean distinct) {
     this.distinct = distinct;
   }
 
   public boolean isDistinct() {
     return this.distinct;
   }
 
   public List<Criteria> getOredCriteria() {
     return this.oredCriteria;
   }
 
   public void or(Criteria criteria) {
     this.oredCriteria.add(criteria);
   }
 
   public Criteria or() {
     Criteria criteria = createCriteriaInternal();
     this.oredCriteria.add(criteria);
     return criteria;
   }
 
   public Criteria createCriteria() {
     Criteria criteria = createCriteriaInternal();
     if (this.oredCriteria.size() == 0) {
       this.oredCriteria.add(criteria);
     }
     return criteria;
   }
 
   protected Criteria createCriteriaInternal() {
     Criteria criteria = new Criteria();
     return criteria;
   }
 
   public void clear() {
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
 
   public static class Criteria extends FlowQueryTplExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<FlowQueryTplExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<FlowQueryTplExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<FlowQueryTplExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new FlowQueryTplExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property)
     {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
 
       this.criteria.add(new FlowQueryTplExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property)
     {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
 
       this.criteria.add(new FlowQueryTplExample.Criterion(condition, value1, value2));
     }
 
     public FlowQueryTplExample.Criteria andSeqIdIsNull() {
       addCriterion("SEQ_ID is null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdIsNotNull() {
       addCriterion("SEQ_ID is not null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdEqualTo(Integer value) {
       addCriterion("SEQ_ID =", value, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdNotEqualTo(Integer value) {
       addCriterion("SEQ_ID <>", value, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdGreaterThan(Integer value) {
       addCriterion("SEQ_ID >", value, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("SEQ_ID >=", value, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdLessThan(Integer value) {
       addCriterion("SEQ_ID <", value, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdLessThanOrEqualTo(Integer value) {
       addCriterion("SEQ_ID <=", value, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdIn(List<Integer> values) {
       addCriterion("SEQ_ID in", values, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdNotIn(List<Integer> values) {
       addCriterion("SEQ_ID not in", values, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdBetween(Integer value1, Integer value2) {
       addCriterion("SEQ_ID between", value1, value2, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andSeqIdNotBetween(Integer value1, Integer value2) {
       addCriterion("SEQ_ID not between", value1, value2, "seqId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameIsNull() {
       addCriterion("TPL_NAME is null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameIsNotNull() {
       addCriterion("TPL_NAME is not null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameEqualTo(String value) {
       addCriterion("TPL_NAME =", value, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameNotEqualTo(String value) {
       addCriterion("TPL_NAME <>", value, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameGreaterThan(String value) {
       addCriterion("TPL_NAME >", value, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameGreaterThanOrEqualTo(String value) {
       addCriterion("TPL_NAME >=", value, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameLessThan(String value) {
       addCriterion("TPL_NAME <", value, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameLessThanOrEqualTo(String value) {
       addCriterion("TPL_NAME <=", value, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameLike(String value) {
       addCriterion("TPL_NAME like", value, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameNotLike(String value) {
       addCriterion("TPL_NAME not like", value, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameIn(List<String> values) {
       addCriterion("TPL_NAME in", values, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameNotIn(List<String> values) {
       addCriterion("TPL_NAME not in", values, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameBetween(String value1, String value2) {
       addCriterion("TPL_NAME between", value1, value2, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andTplNameNotBetween(String value1, String value2) {
       addCriterion("TPL_NAME not between", value1, value2, "tplName");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdIsNull() {
       addCriterion("USER_ID is null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdIsNotNull() {
       addCriterion("USER_ID is not null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdEqualTo(String value) {
       addCriterion("USER_ID =", value, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdNotEqualTo(String value) {
       addCriterion("USER_ID <>", value, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdGreaterThan(String value) {
       addCriterion("USER_ID >", value, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("USER_ID >=", value, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdLessThan(String value) {
       addCriterion("USER_ID <", value, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdLessThanOrEqualTo(String value) {
       addCriterion("USER_ID <=", value, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdLike(String value) {
       addCriterion("USER_ID like", value, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdNotLike(String value) {
       addCriterion("USER_ID not like", value, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdIn(List<String> values) {
       addCriterion("USER_ID in", values, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdNotIn(List<String> values) {
       addCriterion("USER_ID not in", values, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdBetween(String value1, String value2) {
       addCriterion("USER_ID between", value1, value2, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andUserIdNotBetween(String value1, String value2) {
       addCriterion("USER_ID not between", value1, value2, "userId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdIsNull() {
       addCriterion("FLOW_ID is null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdIsNotNull() {
       addCriterion("FLOW_ID is not null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdEqualTo(Integer value) {
       addCriterion("FLOW_ID =", value, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdNotEqualTo(Integer value) {
       addCriterion("FLOW_ID <>", value, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdGreaterThan(Integer value) {
       addCriterion("FLOW_ID >", value, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("FLOW_ID >=", value, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdLessThan(Integer value) {
       addCriterion("FLOW_ID <", value, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdLessThanOrEqualTo(Integer value) {
       addCriterion("FLOW_ID <=", value, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdIn(List<Integer> values) {
       addCriterion("FLOW_ID in", values, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdNotIn(List<Integer> values) {
       addCriterion("FLOW_ID not in", values, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdBetween(Integer value1, Integer value2) {
       addCriterion("FLOW_ID between", value1, value2, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
       addCriterion("FLOW_ID not between", value1, value2, "flowId");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaIsNull() {
       addCriterion("COND_FORMULA is null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaIsNotNull() {
       addCriterion("COND_FORMULA is not null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaEqualTo(String value) {
       addCriterion("COND_FORMULA =", value, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaNotEqualTo(String value) {
       addCriterion("COND_FORMULA <>", value, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaGreaterThan(String value) {
       addCriterion("COND_FORMULA >", value, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaGreaterThanOrEqualTo(String value) {
       addCriterion("COND_FORMULA >=", value, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaLessThan(String value) {
       addCriterion("COND_FORMULA <", value, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaLessThanOrEqualTo(String value) {
       addCriterion("COND_FORMULA <=", value, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaLike(String value) {
       addCriterion("COND_FORMULA like", value, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaNotLike(String value) {
       addCriterion("COND_FORMULA not like", value, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaIn(List<String> values) {
       addCriterion("COND_FORMULA in", values, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaNotIn(List<String> values) {
       addCriterion("COND_FORMULA not in", values, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaBetween(String value1, String value2) {
       addCriterion("COND_FORMULA between", value1, value2, "condFormula");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCondFormulaNotBetween(String value1, String value2) {
       addCriterion("COND_FORMULA not between", value1, value2, "condFormula");
 
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeIsNull() {
       addCriterion("CREATE_TIME is null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("CREATE_TIME is not null");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeEqualTo(Date value) {
       addCriterion("CREATE_TIME =", value, "createTime");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeNotEqualTo(Date value) {
       addCriterion("CREATE_TIME <>", value, "createTime");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeGreaterThan(Date value) {
       addCriterion("CREATE_TIME >", value, "createTime");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME >=", value, "createTime");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeLessThan(Date value) {
       addCriterion("CREATE_TIME <", value, "createTime");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME <=", value, "createTime");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeIn(List<Date> values) {
       addCriterion("CREATE_TIME in", values, "createTime");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeNotIn(List<Date> values) {
       addCriterion("CREATE_TIME not in", values, "createTime");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME between", value1, value2, "createTime");
       return (FlowQueryTplExample.Criteria)this;
     }
 
     public FlowQueryTplExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME not between", value1, value2, "createTime");
 
       return (FlowQueryTplExample.Criteria)this;
     }
   }
 }
