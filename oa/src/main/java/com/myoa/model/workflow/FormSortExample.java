 package com.myoa.model.workflow;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class FormSortExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public FormSortExample()
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
 
   public static class Criteria extends FormSortExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<FormSortExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<FormSortExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<FormSortExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new FormSortExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new FormSortExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new FormSortExample.Criterion(condition, value1, value2));
     }
 
     public FormSortExample.Criteria andSortIdIsNull() {
       addCriterion("SORT_ID is null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdIsNotNull() {
       addCriterion("SORT_ID is not null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdEqualTo(Integer value) {
       addCriterion("SORT_ID =", value, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdNotEqualTo(Integer value) {
       addCriterion("SORT_ID <>", value, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdGreaterThan(Integer value) {
       addCriterion("SORT_ID >", value, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("SORT_ID >=", value, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdLessThan(Integer value) {
       addCriterion("SORT_ID <", value, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdLessThanOrEqualTo(Integer value) {
       addCriterion("SORT_ID <=", value, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdIn(List<Integer> values) {
       addCriterion("SORT_ID in", values, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdNotIn(List<Integer> values) {
       addCriterion("SORT_ID not in", values, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdBetween(Integer value1, Integer value2) {
       addCriterion("SORT_ID between", value1, value2, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortIdNotBetween(Integer value1, Integer value2) {
       addCriterion("SORT_ID not between", value1, value2, "sortId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoIsNull() {
       addCriterion("SORT_NO is null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoIsNotNull() {
       addCriterion("SORT_NO is not null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoEqualTo(Integer value) {
       addCriterion("SORT_NO =", value, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoNotEqualTo(Integer value) {
       addCriterion("SORT_NO <>", value, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoGreaterThan(Integer value) {
       addCriterion("SORT_NO >", value, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoGreaterThanOrEqualTo(Integer value) {
       addCriterion("SORT_NO >=", value, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoLessThan(Integer value) {
       addCriterion("SORT_NO <", value, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoLessThanOrEqualTo(Integer value) {
       addCriterion("SORT_NO <=", value, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoIn(List<Integer> values) {
       addCriterion("SORT_NO in", values, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoNotIn(List<Integer> values) {
       addCriterion("SORT_NO not in", values, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoBetween(Integer value1, Integer value2) {
       addCriterion("SORT_NO between", value1, value2, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNoNotBetween(Integer value1, Integer value2) {
       addCriterion("SORT_NO not between", value1, value2, "sortNo");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameIsNull() {
       addCriterion("SORT_NAME is null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameIsNotNull() {
       addCriterion("SORT_NAME is not null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameEqualTo(String value) {
       addCriterion("SORT_NAME =", value, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameNotEqualTo(String value) {
       addCriterion("SORT_NAME <>", value, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameGreaterThan(String value) {
       addCriterion("SORT_NAME >", value, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameGreaterThanOrEqualTo(String value) {
       addCriterion("SORT_NAME >=", value, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameLessThan(String value) {
       addCriterion("SORT_NAME <", value, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameLessThanOrEqualTo(String value) {
       addCriterion("SORT_NAME <=", value, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameLike(String value) {
       addCriterion("SORT_NAME like", value, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameNotLike(String value) {
       addCriterion("SORT_NAME not like", value, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameIn(List<String> values) {
       addCriterion("SORT_NAME in", values, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameNotIn(List<String> values) {
       addCriterion("SORT_NAME not in", values, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameBetween(String value1, String value2) {
       addCriterion("SORT_NAME between", value1, value2, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortNameNotBetween(String value1, String value2) {
       addCriterion("SORT_NAME not between", value1, value2, "sortName");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentIsNull() {
       addCriterion("SORT_PARENT is null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentIsNotNull() {
       addCriterion("SORT_PARENT is not null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentEqualTo(Integer value) {
       addCriterion("SORT_PARENT =", value, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentNotEqualTo(Integer value) {
       addCriterion("SORT_PARENT <>", value, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentGreaterThan(Integer value) {
       addCriterion("SORT_PARENT >", value, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentGreaterThanOrEqualTo(Integer value) {
       addCriterion("SORT_PARENT >=", value, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentLessThan(Integer value) {
       addCriterion("SORT_PARENT <", value, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentLessThanOrEqualTo(Integer value) {
       addCriterion("SORT_PARENT <=", value, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentIn(List<Integer> values) {
       addCriterion("SORT_PARENT in", values, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentNotIn(List<Integer> values) {
       addCriterion("SORT_PARENT not in", values, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentBetween(Integer value1, Integer value2) {
       addCriterion("SORT_PARENT between", value1, value2, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andSortParentNotBetween(Integer value1, Integer value2) {
       addCriterion("SORT_PARENT not between", value1, value2, "sortParent");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildIsNull() {
       addCriterion("HAVE_CHILD is null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildIsNotNull() {
       addCriterion("HAVE_CHILD is not null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildEqualTo(String value) {
       addCriterion("HAVE_CHILD =", value, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildNotEqualTo(String value) {
       addCriterion("HAVE_CHILD <>", value, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildGreaterThan(String value) {
       addCriterion("HAVE_CHILD >", value, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildGreaterThanOrEqualTo(String value) {
       addCriterion("HAVE_CHILD >=", value, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildLessThan(String value) {
       addCriterion("HAVE_CHILD <", value, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildLessThanOrEqualTo(String value) {
       addCriterion("HAVE_CHILD <=", value, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildLike(String value) {
       addCriterion("HAVE_CHILD like", value, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildNotLike(String value) {
       addCriterion("HAVE_CHILD not like", value, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildIn(List<String> values) {
       addCriterion("HAVE_CHILD in", values, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildNotIn(List<String> values) {
       addCriterion("HAVE_CHILD not in", values, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildBetween(String value1, String value2) {
       addCriterion("HAVE_CHILD between", value1, value2, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andHaveChildNotBetween(String value1, String value2) {
       addCriterion("HAVE_CHILD not between", value1, value2, "haveChild");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdIsNull() {
       addCriterion("DEPT_ID is null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdIsNotNull() {
       addCriterion("DEPT_ID is not null");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdEqualTo(Integer value) {
       addCriterion("DEPT_ID =", value, "deptId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdNotEqualTo(Integer value) {
       addCriterion("DEPT_ID <>", value, "deptId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdGreaterThan(Integer value) {
       addCriterion("DEPT_ID >", value, "deptId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("DEPT_ID >=", value, "deptId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdLessThan(Integer value) {
       addCriterion("DEPT_ID <", value, "deptId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdLessThanOrEqualTo(Integer value) {
       addCriterion("DEPT_ID <=", value, "deptId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdIn(List<Integer> values) {
       addCriterion("DEPT_ID in", values, "deptId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdNotIn(List<Integer> values) {
       addCriterion("DEPT_ID not in", values, "deptId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_ID between", value1, value2, "deptId");
       return (FormSortExample.Criteria)this;
     }
 
     public FormSortExample.Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_ID not between", value1, value2, "deptId");
       return (FormSortExample.Criteria)this;
     }
   }
 }

