 package com.myoa.model.hr;
 
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class HrStaffInfoExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public HrStaffInfoExample()
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
 
   public static class Criteria extends HrStaffInfoExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<HrStaffInfoExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<HrStaffInfoExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<HrStaffInfoExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new HrStaffInfoExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new HrStaffInfoExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new HrStaffInfoExample.Criterion(condition, value1, value2));
     }
 
     protected void addCriterionForJDBCDate(String condition, java.util.Date value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       addCriterion(condition, new java.sql.Date(value.getTime()), property);
     }
 
     protected void addCriterionForJDBCDate(String condition, List<java.util.Date> values, String property) {
       if ((values == null) || (values.size() == 0)) {
         throw new RuntimeException("Value list for " + property + " cannot be null or empty");
       }
       List dateList = new ArrayList();
       Iterator iter = values.iterator();
       while (iter.hasNext()) {
         dateList.add(new java.sql.Date(((java.util.Date)iter.next()).getTime()));
       }
       addCriterion(condition, dateList, property);
     }
 
     protected void addCriterionForJDBCDate(String condition, java.util.Date value1, java.util.Date value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
     }
 
     public HrStaffInfoExample.Criteria andStaffIdIsNull() {
       addCriterion("STAFF_ID is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdIsNotNull() {
       addCriterion("STAFF_ID is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdEqualTo(Integer value) {
       addCriterion("STAFF_ID =", value, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdNotEqualTo(Integer value) {
       addCriterion("STAFF_ID <>", value, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdGreaterThan(Integer value) {
       addCriterion("STAFF_ID >", value, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("STAFF_ID >=", value, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdLessThan(Integer value) {
       addCriterion("STAFF_ID <", value, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdLessThanOrEqualTo(Integer value) {
       addCriterion("STAFF_ID <=", value, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdIn(List<Integer> values) {
       addCriterion("STAFF_ID in", values, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdNotIn(List<Integer> values) {
       addCriterion("STAFF_ID not in", values, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdBetween(Integer value1, Integer value2) {
       addCriterion("STAFF_ID between", value1, value2, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
       addCriterion("STAFF_ID not between", value1, value2, "staffId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdIsNull() {
       addCriterion("CREATE_USER_ID is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdIsNotNull() {
       addCriterion("CREATE_USER_ID is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdEqualTo(String value) {
       addCriterion("CREATE_USER_ID =", value, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdNotEqualTo(String value) {
       addCriterion("CREATE_USER_ID <>", value, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdGreaterThan(String value) {
       addCriterion("CREATE_USER_ID >", value, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("CREATE_USER_ID >=", value, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdLessThan(String value) {
       addCriterion("CREATE_USER_ID <", value, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdLessThanOrEqualTo(String value) {
       addCriterion("CREATE_USER_ID <=", value, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdLike(String value) {
       addCriterion("CREATE_USER_ID like", value, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdNotLike(String value) {
       addCriterion("CREATE_USER_ID not like", value, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdIn(List<String> values) {
       addCriterion("CREATE_USER_ID in", values, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdNotIn(List<String> values) {
       addCriterion("CREATE_USER_ID not in", values, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdBetween(String value1, String value2) {
       addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateUserIdNotBetween(String value1, String value2) {
       addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdIsNull() {
       addCriterion("CREATE_DEPT_ID is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdIsNotNull() {
       addCriterion("CREATE_DEPT_ID is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdEqualTo(Integer value) {
       addCriterion("CREATE_DEPT_ID =", value, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdNotEqualTo(Integer value) {
       addCriterion("CREATE_DEPT_ID <>", value, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdGreaterThan(Integer value) {
       addCriterion("CREATE_DEPT_ID >", value, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("CREATE_DEPT_ID >=", value, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdLessThan(Integer value) {
       addCriterion("CREATE_DEPT_ID <", value, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdLessThanOrEqualTo(Integer value) {
       addCriterion("CREATE_DEPT_ID <=", value, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdIn(List<Integer> values) {
       addCriterion("CREATE_DEPT_ID in", values, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdNotIn(List<Integer> values) {
       addCriterion("CREATE_DEPT_ID not in", values, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdBetween(Integer value1, Integer value2) {
       addCriterion("CREATE_DEPT_ID between", value1, value2, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andCreateDeptIdNotBetween(Integer value1, Integer value2) {
       addCriterion("CREATE_DEPT_ID not between", value1, value2, "createDeptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdIsNull() {
       addCriterion("USER_ID is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdIsNotNull() {
       addCriterion("USER_ID is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdEqualTo(String value) {
       addCriterion("USER_ID =", value, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdNotEqualTo(String value) {
       addCriterion("USER_ID <>", value, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdGreaterThan(String value) {
       addCriterion("USER_ID >", value, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("USER_ID >=", value, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdLessThan(String value) {
       addCriterion("USER_ID <", value, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdLessThanOrEqualTo(String value) {
       addCriterion("USER_ID <=", value, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdLike(String value) {
       addCriterion("USER_ID like", value, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdNotLike(String value) {
       addCriterion("USER_ID not like", value, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdIn(List<String> values) {
       addCriterion("USER_ID in", values, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdNotIn(List<String> values) {
       addCriterion("USER_ID not in", values, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdBetween(String value1, String value2) {
       addCriterion("USER_ID between", value1, value2, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andUserIdNotBetween(String value1, String value2) {
       addCriterion("USER_ID not between", value1, value2, "userId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdIsNull() {
       addCriterion("DEPT_ID is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdIsNotNull() {
       addCriterion("DEPT_ID is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdEqualTo(Integer value) {
       addCriterion("DEPT_ID =", value, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdNotEqualTo(Integer value) {
       addCriterion("DEPT_ID <>", value, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdGreaterThan(Integer value) {
       addCriterion("DEPT_ID >", value, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("DEPT_ID >=", value, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdLessThan(Integer value) {
       addCriterion("DEPT_ID <", value, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdLessThanOrEqualTo(Integer value) {
       addCriterion("DEPT_ID <=", value, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdIn(List<Integer> values) {
       addCriterion("DEPT_ID in", values, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdNotIn(List<Integer> values) {
       addCriterion("DEPT_ID not in", values, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_ID between", value1, value2, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_ID not between", value1, value2, "deptId");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoIsNull() {
       addCriterion("STAFF_NO is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoIsNotNull() {
       addCriterion("STAFF_NO is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoEqualTo(String value) {
       addCriterion("STAFF_NO =", value, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoNotEqualTo(String value) {
       addCriterion("STAFF_NO <>", value, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoGreaterThan(String value) {
       addCriterion("STAFF_NO >", value, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_NO >=", value, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoLessThan(String value) {
       addCriterion("STAFF_NO <", value, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoLessThanOrEqualTo(String value) {
       addCriterion("STAFF_NO <=", value, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoLike(String value) {
       addCriterion("STAFF_NO like", value, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoNotLike(String value) {
       addCriterion("STAFF_NO not like", value, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoIn(List<String> values) {
       addCriterion("STAFF_NO in", values, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoNotIn(List<String> values) {
       addCriterion("STAFF_NO not in", values, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoBetween(String value1, String value2) {
       addCriterion("STAFF_NO between", value1, value2, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNoNotBetween(String value1, String value2) {
       addCriterion("STAFF_NO not between", value1, value2, "staffNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoIsNull() {
       addCriterion("WORK_NO is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoIsNotNull() {
       addCriterion("WORK_NO is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoEqualTo(String value) {
       addCriterion("WORK_NO =", value, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoNotEqualTo(String value) {
       addCriterion("WORK_NO <>", value, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoGreaterThan(String value) {
       addCriterion("WORK_NO >", value, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoGreaterThanOrEqualTo(String value) {
       addCriterion("WORK_NO >=", value, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoLessThan(String value) {
       addCriterion("WORK_NO <", value, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoLessThanOrEqualTo(String value) {
       addCriterion("WORK_NO <=", value, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoLike(String value) {
       addCriterion("WORK_NO like", value, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoNotLike(String value) {
       addCriterion("WORK_NO not like", value, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoIn(List<String> values) {
       addCriterion("WORK_NO in", values, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoNotIn(List<String> values) {
       addCriterion("WORK_NO not in", values, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoBetween(String value1, String value2) {
       addCriterion("WORK_NO between", value1, value2, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkNoNotBetween(String value1, String value2) {
       addCriterion("WORK_NO not between", value1, value2, "workNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameIsNull() {
       addCriterion("PHOTO_NAME is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameIsNotNull() {
       addCriterion("PHOTO_NAME is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameEqualTo(String value) {
       addCriterion("PHOTO_NAME =", value, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameNotEqualTo(String value) {
       addCriterion("PHOTO_NAME <>", value, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameGreaterThan(String value) {
       addCriterion("PHOTO_NAME >", value, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameGreaterThanOrEqualTo(String value) {
       addCriterion("PHOTO_NAME >=", value, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameLessThan(String value) {
       addCriterion("PHOTO_NAME <", value, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameLessThanOrEqualTo(String value) {
       addCriterion("PHOTO_NAME <=", value, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameLike(String value) {
       addCriterion("PHOTO_NAME like", value, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameNotLike(String value) {
       addCriterion("PHOTO_NAME not like", value, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameIn(List<String> values) {
       addCriterion("PHOTO_NAME in", values, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameNotIn(List<String> values) {
       addCriterion("PHOTO_NAME not in", values, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameBetween(String value1, String value2) {
       addCriterion("PHOTO_NAME between", value1, value2, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPhotoNameNotBetween(String value1, String value2) {
       addCriterion("PHOTO_NAME not between", value1, value2, "photoName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeIsNull() {
       addCriterion("WORK_TYPE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeIsNotNull() {
       addCriterion("WORK_TYPE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeEqualTo(String value) {
       addCriterion("WORK_TYPE =", value, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeNotEqualTo(String value) {
       addCriterion("WORK_TYPE <>", value, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeGreaterThan(String value) {
       addCriterion("WORK_TYPE >", value, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeGreaterThanOrEqualTo(String value) {
       addCriterion("WORK_TYPE >=", value, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeLessThan(String value) {
       addCriterion("WORK_TYPE <", value, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeLessThanOrEqualTo(String value) {
       addCriterion("WORK_TYPE <=", value, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeLike(String value) {
       addCriterion("WORK_TYPE like", value, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeNotLike(String value) {
       addCriterion("WORK_TYPE not like", value, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeIn(List<String> values) {
       addCriterion("WORK_TYPE in", values, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeNotIn(List<String> values) {
       addCriterion("WORK_TYPE not in", values, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeBetween(String value1, String value2) {
       addCriterion("WORK_TYPE between", value1, value2, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkTypeNotBetween(String value1, String value2) {
       addCriterion("WORK_TYPE not between", value1, value2, "workType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameIsNull() {
       addCriterion("STAFF_NAME is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameIsNotNull() {
       addCriterion("STAFF_NAME is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameEqualTo(String value) {
       addCriterion("STAFF_NAME =", value, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameNotEqualTo(String value) {
       addCriterion("STAFF_NAME <>", value, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameGreaterThan(String value) {
       addCriterion("STAFF_NAME >", value, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_NAME >=", value, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameLessThan(String value) {
       addCriterion("STAFF_NAME <", value, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameLessThanOrEqualTo(String value) {
       addCriterion("STAFF_NAME <=", value, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameLike(String value) {
       addCriterion("STAFF_NAME like", value, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameNotLike(String value) {
       addCriterion("STAFF_NAME not like", value, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameIn(List<String> values) {
       addCriterion("STAFF_NAME in", values, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameNotIn(List<String> values) {
       addCriterion("STAFF_NAME not in", values, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameBetween(String value1, String value2) {
       addCriterion("STAFF_NAME between", value1, value2, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNameNotBetween(String value1, String value2) {
       addCriterion("STAFF_NAME not between", value1, value2, "staffName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameIsNull() {
       addCriterion("STAFF_E_NAME is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameIsNotNull() {
       addCriterion("STAFF_E_NAME is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameEqualTo(String value) {
       addCriterion("STAFF_E_NAME =", value, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameNotEqualTo(String value) {
       addCriterion("STAFF_E_NAME <>", value, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameGreaterThan(String value) {
       addCriterion("STAFF_E_NAME >", value, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_E_NAME >=", value, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameLessThan(String value) {
       addCriterion("STAFF_E_NAME <", value, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameLessThanOrEqualTo(String value) {
       addCriterion("STAFF_E_NAME <=", value, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameLike(String value) {
       addCriterion("STAFF_E_NAME like", value, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameNotLike(String value) {
       addCriterion("STAFF_E_NAME not like", value, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameIn(List<String> values) {
       addCriterion("STAFF_E_NAME in", values, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameNotIn(List<String> values) {
       addCriterion("STAFF_E_NAME not in", values, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameBetween(String value1, String value2) {
       addCriterion("STAFF_E_NAME between", value1, value2, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffENameNotBetween(String value1, String value2) {
       addCriterion("STAFF_E_NAME not between", value1, value2, "staffEName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoIsNull() {
       addCriterion("STAFF_CARD_NO is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoIsNotNull() {
       addCriterion("STAFF_CARD_NO is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoEqualTo(String value) {
       addCriterion("STAFF_CARD_NO =", value, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoNotEqualTo(String value) {
       addCriterion("STAFF_CARD_NO <>", value, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoGreaterThan(String value) {
       addCriterion("STAFF_CARD_NO >", value, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_CARD_NO >=", value, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoLessThan(String value) {
       addCriterion("STAFF_CARD_NO <", value, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoLessThanOrEqualTo(String value) {
       addCriterion("STAFF_CARD_NO <=", value, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoLike(String value) {
       addCriterion("STAFF_CARD_NO like", value, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoNotLike(String value) {
       addCriterion("STAFF_CARD_NO not like", value, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoIn(List<String> values) {
       addCriterion("STAFF_CARD_NO in", values, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoNotIn(List<String> values) {
       addCriterion("STAFF_CARD_NO not in", values, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoBetween(String value1, String value2) {
       addCriterion("STAFF_CARD_NO between", value1, value2, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCardNoNotBetween(String value1, String value2) {
       addCriterion("STAFF_CARD_NO not between", value1, value2, "staffCardNo");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexIsNull() {
       addCriterion("STAFF_SEX is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexIsNotNull() {
       addCriterion("STAFF_SEX is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexEqualTo(String value) {
       addCriterion("STAFF_SEX =", value, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexNotEqualTo(String value) {
       addCriterion("STAFF_SEX <>", value, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexGreaterThan(String value) {
       addCriterion("STAFF_SEX >", value, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_SEX >=", value, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexLessThan(String value) {
       addCriterion("STAFF_SEX <", value, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexLessThanOrEqualTo(String value) {
       addCriterion("STAFF_SEX <=", value, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexLike(String value) {
       addCriterion("STAFF_SEX like", value, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexNotLike(String value) {
       addCriterion("STAFF_SEX not like", value, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexIn(List<String> values) {
       addCriterion("STAFF_SEX in", values, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexNotIn(List<String> values) {
       addCriterion("STAFF_SEX not in", values, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexBetween(String value1, String value2) {
       addCriterion("STAFF_SEX between", value1, value2, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSexNotBetween(String value1, String value2) {
       addCriterion("STAFF_SEX not between", value1, value2, "staffSex");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthIsNull() {
       addCriterion("STAFF_BIRTH is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthIsNotNull() {
       addCriterion("STAFF_BIRTH is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_BIRTH =", value, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_BIRTH <>", value, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_BIRTH >", value, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_BIRTH >=", value, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthLessThan(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_BIRTH <", value, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_BIRTH <=", value, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("STAFF_BIRTH in", values, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("STAFF_BIRTH not in", values, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("STAFF_BIRTH between", value1, value2, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffBirthNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("STAFF_BIRTH not between", value1, value2, "staffBirth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarIsNull() {
       addCriterion("IS_LUNAR is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarIsNotNull() {
       addCriterion("IS_LUNAR is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarEqualTo(String value) {
       addCriterion("IS_LUNAR =", value, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarNotEqualTo(String value) {
       addCriterion("IS_LUNAR <>", value, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarGreaterThan(String value) {
       addCriterion("IS_LUNAR >", value, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarGreaterThanOrEqualTo(String value) {
       addCriterion("IS_LUNAR >=", value, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarLessThan(String value) {
       addCriterion("IS_LUNAR <", value, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarLessThanOrEqualTo(String value) {
       addCriterion("IS_LUNAR <=", value, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarLike(String value) {
       addCriterion("IS_LUNAR like", value, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarNotLike(String value) {
       addCriterion("IS_LUNAR not like", value, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarIn(List<String> values) {
       addCriterion("IS_LUNAR in", values, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarNotIn(List<String> values) {
       addCriterion("IS_LUNAR not in", values, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarBetween(String value1, String value2) {
       addCriterion("IS_LUNAR between", value1, value2, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsLunarNotBetween(String value1, String value2) {
       addCriterion("IS_LUNAR not between", value1, value2, "isLunar");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeIsNull() {
       addCriterion("STAFF_AGE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeIsNotNull() {
       addCriterion("STAFF_AGE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeEqualTo(String value) {
       addCriterion("STAFF_AGE =", value, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeNotEqualTo(String value) {
       addCriterion("STAFF_AGE <>", value, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeGreaterThan(String value) {
       addCriterion("STAFF_AGE >", value, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_AGE >=", value, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeLessThan(String value) {
       addCriterion("STAFF_AGE <", value, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeLessThanOrEqualTo(String value) {
       addCriterion("STAFF_AGE <=", value, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeLike(String value) {
       addCriterion("STAFF_AGE like", value, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeNotLike(String value) {
       addCriterion("STAFF_AGE not like", value, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeIn(List<String> values) {
       addCriterion("STAFF_AGE in", values, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeNotIn(List<String> values) {
       addCriterion("STAFF_AGE not in", values, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeBetween(String value1, String value2) {
       addCriterion("STAFF_AGE between", value1, value2, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffAgeNotBetween(String value1, String value2) {
       addCriterion("STAFF_AGE not between", value1, value2, "staffAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceIsNull() {
       addCriterion("STAFF_NATIVE_PLACE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceIsNotNull() {
       addCriterion("STAFF_NATIVE_PLACE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceEqualTo(String value) {
       addCriterion("STAFF_NATIVE_PLACE =", value, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceNotEqualTo(String value) {
       addCriterion("STAFF_NATIVE_PLACE <>", value, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceGreaterThan(String value) {
       addCriterion("STAFF_NATIVE_PLACE >", value, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_NATIVE_PLACE >=", value, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceLessThan(String value) {
       addCriterion("STAFF_NATIVE_PLACE <", value, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceLessThanOrEqualTo(String value) {
       addCriterion("STAFF_NATIVE_PLACE <=", value, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceLike(String value) {
       addCriterion("STAFF_NATIVE_PLACE like", value, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceNotLike(String value) {
       addCriterion("STAFF_NATIVE_PLACE not like", value, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceIn(List<String> values) {
       addCriterion("STAFF_NATIVE_PLACE in", values, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceNotIn(List<String> values) {
       addCriterion("STAFF_NATIVE_PLACE not in", values, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceBetween(String value1, String value2) {
       addCriterion("STAFF_NATIVE_PLACE between", value1, value2, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlaceNotBetween(String value1, String value2) {
       addCriterion("STAFF_NATIVE_PLACE not between", value1, value2, "staffNativePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceIsNull() {
       addCriterion("STAFF_DOMICILE_PLACE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceIsNotNull() {
       addCriterion("STAFF_DOMICILE_PLACE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceEqualTo(String value) {
       addCriterion("STAFF_DOMICILE_PLACE =", value, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceNotEqualTo(String value) {
       addCriterion("STAFF_DOMICILE_PLACE <>", value, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceGreaterThan(String value) {
       addCriterion("STAFF_DOMICILE_PLACE >", value, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_DOMICILE_PLACE >=", value, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceLessThan(String value) {
       addCriterion("STAFF_DOMICILE_PLACE <", value, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceLessThanOrEqualTo(String value) {
       addCriterion("STAFF_DOMICILE_PLACE <=", value, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceLike(String value) {
       addCriterion("STAFF_DOMICILE_PLACE like", value, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceNotLike(String value) {
       addCriterion("STAFF_DOMICILE_PLACE not like", value, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceIn(List<String> values) {
       addCriterion("STAFF_DOMICILE_PLACE in", values, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceNotIn(List<String> values) {
       addCriterion("STAFF_DOMICILE_PLACE not in", values, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceBetween(String value1, String value2) {
       addCriterion("STAFF_DOMICILE_PLACE between", value1, value2, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffDomicilePlaceNotBetween(String value1, String value2) {
       addCriterion("STAFF_DOMICILE_PLACE not between", value1, value2, "staffDomicilePlace");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPIsNull() {
       addCriterion("YES_OTHER_P is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPIsNotNull() {
       addCriterion("YES_OTHER_P is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPEqualTo(String value) {
       addCriterion("YES_OTHER_P =", value, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPNotEqualTo(String value) {
       addCriterion("YES_OTHER_P <>", value, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPGreaterThan(String value) {
       addCriterion("YES_OTHER_P >", value, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPGreaterThanOrEqualTo(String value) {
       addCriterion("YES_OTHER_P >=", value, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPLessThan(String value) {
       addCriterion("YES_OTHER_P <", value, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPLessThanOrEqualTo(String value) {
       addCriterion("YES_OTHER_P <=", value, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPLike(String value) {
       addCriterion("YES_OTHER_P like", value, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPNotLike(String value) {
       addCriterion("YES_OTHER_P not like", value, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPIn(List<String> values) {
       addCriterion("YES_OTHER_P in", values, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPNotIn(List<String> values) {
       addCriterion("YES_OTHER_P not in", values, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPBetween(String value1, String value2) {
       addCriterion("YES_OTHER_P between", value1, value2, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOtherPNotBetween(String value1, String value2) {
       addCriterion("YES_OTHER_P not between", value1, value2, "yesOtherP");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityIsNull() {
       addCriterion("STAFF_NATIONALITY is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityIsNotNull() {
       addCriterion("STAFF_NATIONALITY is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityEqualTo(String value) {
       addCriterion("STAFF_NATIONALITY =", value, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityNotEqualTo(String value) {
       addCriterion("STAFF_NATIONALITY <>", value, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityGreaterThan(String value) {
       addCriterion("STAFF_NATIONALITY >", value, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_NATIONALITY >=", value, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityLessThan(String value) {
       addCriterion("STAFF_NATIONALITY <", value, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityLessThanOrEqualTo(String value) {
       addCriterion("STAFF_NATIONALITY <=", value, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityLike(String value) {
       addCriterion("STAFF_NATIONALITY like", value, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityNotLike(String value) {
       addCriterion("STAFF_NATIONALITY not like", value, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityIn(List<String> values) {
       addCriterion("STAFF_NATIONALITY in", values, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityNotIn(List<String> values) {
       addCriterion("STAFF_NATIONALITY not in", values, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityBetween(String value1, String value2) {
       addCriterion("STAFF_NATIONALITY between", value1, value2, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNationalityNotBetween(String value1, String value2) {
       addCriterion("STAFF_NATIONALITY not between", value1, value2, "staffNationality");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusIsNull() {
       addCriterion("STAFF_MARITAL_STATUS is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusIsNotNull() {
       addCriterion("STAFF_MARITAL_STATUS is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusEqualTo(String value) {
       addCriterion("STAFF_MARITAL_STATUS =", value, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusNotEqualTo(String value) {
       addCriterion("STAFF_MARITAL_STATUS <>", value, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusGreaterThan(String value) {
       addCriterion("STAFF_MARITAL_STATUS >", value, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_MARITAL_STATUS >=", value, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusLessThan(String value) {
       addCriterion("STAFF_MARITAL_STATUS <", value, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusLessThanOrEqualTo(String value) {
       addCriterion("STAFF_MARITAL_STATUS <=", value, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusLike(String value) {
       addCriterion("STAFF_MARITAL_STATUS like", value, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusNotLike(String value) {
       addCriterion("STAFF_MARITAL_STATUS not like", value, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusIn(List<String> values) {
       addCriterion("STAFF_MARITAL_STATUS in", values, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusNotIn(List<String> values) {
       addCriterion("STAFF_MARITAL_STATUS not in", values, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusBetween(String value1, String value2) {
       addCriterion("STAFF_MARITAL_STATUS between", value1, value2, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMaritalStatusNotBetween(String value1, String value2) {
       addCriterion("STAFF_MARITAL_STATUS not between", value1, value2, "staffMaritalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusIsNull() {
       addCriterion("STAFF_POLITICAL_STATUS is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusIsNotNull() {
       addCriterion("STAFF_POLITICAL_STATUS is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusEqualTo(String value) {
       addCriterion("STAFF_POLITICAL_STATUS =", value, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusNotEqualTo(String value) {
       addCriterion("STAFF_POLITICAL_STATUS <>", value, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusGreaterThan(String value) {
       addCriterion("STAFF_POLITICAL_STATUS >", value, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_POLITICAL_STATUS >=", value, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusLessThan(String value) {
       addCriterion("STAFF_POLITICAL_STATUS <", value, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusLessThanOrEqualTo(String value) {
       addCriterion("STAFF_POLITICAL_STATUS <=", value, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusLike(String value) {
       addCriterion("STAFF_POLITICAL_STATUS like", value, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusNotLike(String value) {
       addCriterion("STAFF_POLITICAL_STATUS not like", value, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusIn(List<String> values) {
       addCriterion("STAFF_POLITICAL_STATUS in", values, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusNotIn(List<String> values) {
       addCriterion("STAFF_POLITICAL_STATUS not in", values, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusBetween(String value1, String value2) {
       addCriterion("STAFF_POLITICAL_STATUS between", value1, value2, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPoliticalStatusNotBetween(String value1, String value2) {
       addCriterion("STAFF_POLITICAL_STATUS not between", value1, value2, "staffPoliticalStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeIsNull() {
       addCriterion("JOIN_PARTY_TIME is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeIsNotNull() {
       addCriterion("JOIN_PARTY_TIME is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME =", value, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME <>", value, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME >", value, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME >=", value, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeLessThan(java.util.Date value) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME <", value, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME <=", value, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME in", values, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME not in", values, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME between", value1, value2, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJoinPartyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("JOIN_PARTY_TIME not between", value1, value2, "joinPartyTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneIsNull() {
       addCriterion("STAFF_PHONE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneIsNotNull() {
       addCriterion("STAFF_PHONE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneEqualTo(String value) {
       addCriterion("STAFF_PHONE =", value, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneNotEqualTo(String value) {
       addCriterion("STAFF_PHONE <>", value, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneGreaterThan(String value) {
       addCriterion("STAFF_PHONE >", value, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_PHONE >=", value, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneLessThan(String value) {
       addCriterion("STAFF_PHONE <", value, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneLessThanOrEqualTo(String value) {
       addCriterion("STAFF_PHONE <=", value, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneLike(String value) {
       addCriterion("STAFF_PHONE like", value, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneNotLike(String value) {
       addCriterion("STAFF_PHONE not like", value, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneIn(List<String> values) {
       addCriterion("STAFF_PHONE in", values, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneNotIn(List<String> values) {
       addCriterion("STAFF_PHONE not in", values, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneBetween(String value1, String value2) {
       addCriterion("STAFF_PHONE between", value1, value2, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffPhoneNotBetween(String value1, String value2) {
       addCriterion("STAFF_PHONE not between", value1, value2, "staffPhone");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileIsNull() {
       addCriterion("STAFF_MOBILE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileIsNotNull() {
       addCriterion("STAFF_MOBILE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileEqualTo(String value) {
       addCriterion("STAFF_MOBILE =", value, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileNotEqualTo(String value) {
       addCriterion("STAFF_MOBILE <>", value, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileGreaterThan(String value) {
       addCriterion("STAFF_MOBILE >", value, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_MOBILE >=", value, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileLessThan(String value) {
       addCriterion("STAFF_MOBILE <", value, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileLessThanOrEqualTo(String value) {
       addCriterion("STAFF_MOBILE <=", value, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileLike(String value) {
       addCriterion("STAFF_MOBILE like", value, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileNotLike(String value) {
       addCriterion("STAFF_MOBILE not like", value, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileIn(List<String> values) {
       addCriterion("STAFF_MOBILE in", values, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileNotIn(List<String> values) {
       addCriterion("STAFF_MOBILE not in", values, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileBetween(String value1, String value2) {
       addCriterion("STAFF_MOBILE between", value1, value2, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMobileNotBetween(String value1, String value2) {
       addCriterion("STAFF_MOBILE not between", value1, value2, "staffMobile");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartIsNull() {
       addCriterion("STAFF_LITTLE_SMART is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartIsNotNull() {
       addCriterion("STAFF_LITTLE_SMART is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartEqualTo(String value) {
       addCriterion("STAFF_LITTLE_SMART =", value, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartNotEqualTo(String value) {
       addCriterion("STAFF_LITTLE_SMART <>", value, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartGreaterThan(String value) {
       addCriterion("STAFF_LITTLE_SMART >", value, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_LITTLE_SMART >=", value, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartLessThan(String value) {
       addCriterion("STAFF_LITTLE_SMART <", value, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartLessThanOrEqualTo(String value) {
       addCriterion("STAFF_LITTLE_SMART <=", value, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartLike(String value) {
       addCriterion("STAFF_LITTLE_SMART like", value, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartNotLike(String value) {
       addCriterion("STAFF_LITTLE_SMART not like", value, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartIn(List<String> values) {
       addCriterion("STAFF_LITTLE_SMART in", values, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartNotIn(List<String> values) {
       addCriterion("STAFF_LITTLE_SMART not in", values, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartBetween(String value1, String value2) {
       addCriterion("STAFF_LITTLE_SMART between", value1, value2, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffLittleSmartNotBetween(String value1, String value2) {
       addCriterion("STAFF_LITTLE_SMART not between", value1, value2, "staffLittleSmart");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailIsNull() {
       addCriterion("STAFF_EMAIL is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailIsNotNull() {
       addCriterion("STAFF_EMAIL is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailEqualTo(String value) {
       addCriterion("STAFF_EMAIL =", value, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailNotEqualTo(String value) {
       addCriterion("STAFF_EMAIL <>", value, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailGreaterThan(String value) {
       addCriterion("STAFF_EMAIL >", value, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_EMAIL >=", value, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailLessThan(String value) {
       addCriterion("STAFF_EMAIL <", value, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailLessThanOrEqualTo(String value) {
       addCriterion("STAFF_EMAIL <=", value, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailLike(String value) {
       addCriterion("STAFF_EMAIL like", value, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailNotLike(String value) {
       addCriterion("STAFF_EMAIL not like", value, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailIn(List<String> values) {
       addCriterion("STAFF_EMAIL in", values, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailNotIn(List<String> values) {
       addCriterion("STAFF_EMAIL not in", values, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailBetween(String value1, String value2) {
       addCriterion("STAFF_EMAIL between", value1, value2, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffEmailNotBetween(String value1, String value2) {
       addCriterion("STAFF_EMAIL not between", value1, value2, "staffEmail");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnIsNull() {
       addCriterion("STAFF_MSN is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnIsNotNull() {
       addCriterion("STAFF_MSN is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnEqualTo(String value) {
       addCriterion("STAFF_MSN =", value, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnNotEqualTo(String value) {
       addCriterion("STAFF_MSN <>", value, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnGreaterThan(String value) {
       addCriterion("STAFF_MSN >", value, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_MSN >=", value, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnLessThan(String value) {
       addCriterion("STAFF_MSN <", value, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnLessThanOrEqualTo(String value) {
       addCriterion("STAFF_MSN <=", value, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnLike(String value) {
       addCriterion("STAFF_MSN like", value, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnNotLike(String value) {
       addCriterion("STAFF_MSN not like", value, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnIn(List<String> values) {
       addCriterion("STAFF_MSN in", values, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnNotIn(List<String> values) {
       addCriterion("STAFF_MSN not in", values, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnBetween(String value1, String value2) {
       addCriterion("STAFF_MSN between", value1, value2, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMsnNotBetween(String value1, String value2) {
       addCriterion("STAFF_MSN not between", value1, value2, "staffMsn");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqIsNull() {
       addCriterion("STAFF_QQ is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqIsNotNull() {
       addCriterion("STAFF_QQ is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqEqualTo(String value) {
       addCriterion("STAFF_QQ =", value, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqNotEqualTo(String value) {
       addCriterion("STAFF_QQ <>", value, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqGreaterThan(String value) {
       addCriterion("STAFF_QQ >", value, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_QQ >=", value, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqLessThan(String value) {
       addCriterion("STAFF_QQ <", value, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqLessThanOrEqualTo(String value) {
       addCriterion("STAFF_QQ <=", value, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqLike(String value) {
       addCriterion("STAFF_QQ like", value, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqNotLike(String value) {
       addCriterion("STAFF_QQ not like", value, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqIn(List<String> values) {
       addCriterion("STAFF_QQ in", values, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqNotIn(List<String> values) {
       addCriterion("STAFF_QQ not in", values, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqBetween(String value1, String value2) {
       addCriterion("STAFF_QQ between", value1, value2, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffQqNotBetween(String value1, String value2) {
       addCriterion("STAFF_QQ not between", value1, value2, "staffQq");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressIsNull() {
       addCriterion("HOME_ADDRESS is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressIsNotNull() {
       addCriterion("HOME_ADDRESS is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressEqualTo(String value) {
       addCriterion("HOME_ADDRESS =", value, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressNotEqualTo(String value) {
       addCriterion("HOME_ADDRESS <>", value, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressGreaterThan(String value) {
       addCriterion("HOME_ADDRESS >", value, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
       addCriterion("HOME_ADDRESS >=", value, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressLessThan(String value) {
       addCriterion("HOME_ADDRESS <", value, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressLessThanOrEqualTo(String value) {
       addCriterion("HOME_ADDRESS <=", value, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressLike(String value) {
       addCriterion("HOME_ADDRESS like", value, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressNotLike(String value) {
       addCriterion("HOME_ADDRESS not like", value, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressIn(List<String> values) {
       addCriterion("HOME_ADDRESS in", values, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressNotIn(List<String> values) {
       addCriterion("HOME_ADDRESS not in", values, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressBetween(String value1, String value2) {
       addCriterion("HOME_ADDRESS between", value1, value2, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andHomeAddressNotBetween(String value1, String value2) {
       addCriterion("HOME_ADDRESS not between", value1, value2, "homeAddress");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactIsNull() {
       addCriterion("OTHER_CONTACT is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactIsNotNull() {
       addCriterion("OTHER_CONTACT is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactEqualTo(String value) {
       addCriterion("OTHER_CONTACT =", value, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactNotEqualTo(String value) {
       addCriterion("OTHER_CONTACT <>", value, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactGreaterThan(String value) {
       addCriterion("OTHER_CONTACT >", value, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactGreaterThanOrEqualTo(String value) {
       addCriterion("OTHER_CONTACT >=", value, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactLessThan(String value) {
       addCriterion("OTHER_CONTACT <", value, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactLessThanOrEqualTo(String value) {
       addCriterion("OTHER_CONTACT <=", value, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactLike(String value) {
       addCriterion("OTHER_CONTACT like", value, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactNotLike(String value) {
       addCriterion("OTHER_CONTACT not like", value, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactIn(List<String> values) {
       addCriterion("OTHER_CONTACT in", values, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactNotIn(List<String> values) {
       addCriterion("OTHER_CONTACT not in", values, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactBetween(String value1, String value2) {
       addCriterion("OTHER_CONTACT between", value1, value2, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andOtherContactNotBetween(String value1, String value2) {
       addCriterion("OTHER_CONTACT not between", value1, value2, "otherContact");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningIsNull() {
       addCriterion("JOB_BEGINNING is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningIsNotNull() {
       addCriterion("JOB_BEGINNING is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("JOB_BEGINNING =", value, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("JOB_BEGINNING <>", value, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("JOB_BEGINNING >", value, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("JOB_BEGINNING >=", value, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningLessThan(java.util.Date value) {
       addCriterionForJDBCDate("JOB_BEGINNING <", value, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("JOB_BEGINNING <=", value, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("JOB_BEGINNING in", values, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("JOB_BEGINNING not in", values, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("JOB_BEGINNING between", value1, value2, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobBeginningNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("JOB_BEGINNING not between", value1, value2, "jobBeginning");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeIsNull() {
       addCriterion("WORK_AGE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeIsNotNull() {
       addCriterion("WORK_AGE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeEqualTo(String value) {
       addCriterion("WORK_AGE =", value, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeNotEqualTo(String value) {
       addCriterion("WORK_AGE <>", value, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeGreaterThan(String value) {
       addCriterion("WORK_AGE >", value, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeGreaterThanOrEqualTo(String value) {
       addCriterion("WORK_AGE >=", value, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeLessThan(String value) {
       addCriterion("WORK_AGE <", value, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeLessThanOrEqualTo(String value) {
       addCriterion("WORK_AGE <=", value, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeLike(String value) {
       addCriterion("WORK_AGE like", value, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeNotLike(String value) {
       addCriterion("WORK_AGE not like", value, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeIn(List<String> values) {
       addCriterion("WORK_AGE in", values, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeNotIn(List<String> values) {
       addCriterion("WORK_AGE not in", values, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeBetween(String value1, String value2) {
       addCriterion("WORK_AGE between", value1, value2, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkAgeNotBetween(String value1, String value2) {
       addCriterion("WORK_AGE not between", value1, value2, "workAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthIsNull() {
       addCriterion("STAFF_HEALTH is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthIsNotNull() {
       addCriterion("STAFF_HEALTH is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthEqualTo(String value) {
       addCriterion("STAFF_HEALTH =", value, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthNotEqualTo(String value) {
       addCriterion("STAFF_HEALTH <>", value, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthGreaterThan(String value) {
       addCriterion("STAFF_HEALTH >", value, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_HEALTH >=", value, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthLessThan(String value) {
       addCriterion("STAFF_HEALTH <", value, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthLessThanOrEqualTo(String value) {
       addCriterion("STAFF_HEALTH <=", value, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthLike(String value) {
       addCriterion("STAFF_HEALTH like", value, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthNotLike(String value) {
       addCriterion("STAFF_HEALTH not like", value, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthIn(List<String> values) {
       addCriterion("STAFF_HEALTH in", values, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthNotIn(List<String> values) {
       addCriterion("STAFF_HEALTH not in", values, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthBetween(String value1, String value2) {
       addCriterion("STAFF_HEALTH between", value1, value2, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHealthNotBetween(String value1, String value2) {
       addCriterion("STAFF_HEALTH not between", value1, value2, "staffHealth");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolIsNull() {
       addCriterion("STAFF_HIGHEST_SCHOOL is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolIsNotNull() {
       addCriterion("STAFF_HIGHEST_SCHOOL is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolEqualTo(String value) {
       addCriterion("STAFF_HIGHEST_SCHOOL =", value, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolNotEqualTo(String value) {
       addCriterion("STAFF_HIGHEST_SCHOOL <>", value, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolGreaterThan(String value) {
       addCriterion("STAFF_HIGHEST_SCHOOL >", value, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_HIGHEST_SCHOOL >=", value, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolLessThan(String value) {
       addCriterion("STAFF_HIGHEST_SCHOOL <", value, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolLessThanOrEqualTo(String value) {
       addCriterion("STAFF_HIGHEST_SCHOOL <=", value, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolLike(String value) {
       addCriterion("STAFF_HIGHEST_SCHOOL like", value, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolNotLike(String value) {
       addCriterion("STAFF_HIGHEST_SCHOOL not like", value, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolIn(List<String> values) {
       addCriterion("STAFF_HIGHEST_SCHOOL in", values, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolNotIn(List<String> values) {
       addCriterion("STAFF_HIGHEST_SCHOOL not in", values, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolBetween(String value1, String value2) {
       addCriterion("STAFF_HIGHEST_SCHOOL between", value1, value2, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestSchoolNotBetween(String value1, String value2) {
       addCriterion("STAFF_HIGHEST_SCHOOL not between", value1, value2, "staffHighestSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeIsNull() {
       addCriterion("STAFF_HIGHEST_DEGREE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeIsNotNull() {
       addCriterion("STAFF_HIGHEST_DEGREE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeEqualTo(String value) {
       addCriterion("STAFF_HIGHEST_DEGREE =", value, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeNotEqualTo(String value) {
       addCriterion("STAFF_HIGHEST_DEGREE <>", value, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeGreaterThan(String value) {
       addCriterion("STAFF_HIGHEST_DEGREE >", value, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_HIGHEST_DEGREE >=", value, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeLessThan(String value) {
       addCriterion("STAFF_HIGHEST_DEGREE <", value, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeLessThanOrEqualTo(String value) {
       addCriterion("STAFF_HIGHEST_DEGREE <=", value, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeLike(String value) {
       addCriterion("STAFF_HIGHEST_DEGREE like", value, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeNotLike(String value) {
       addCriterion("STAFF_HIGHEST_DEGREE not like", value, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeIn(List<String> values) {
       addCriterion("STAFF_HIGHEST_DEGREE in", values, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeNotIn(List<String> values) {
       addCriterion("STAFF_HIGHEST_DEGREE not in", values, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeBetween(String value1, String value2) {
       addCriterion("STAFF_HIGHEST_DEGREE between", value1, value2, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffHighestDegreeNotBetween(String value1, String value2) {
       addCriterion("STAFF_HIGHEST_DEGREE not between", value1, value2, "staffHighestDegree");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateIsNull() {
       addCriterion("GRADUATION_DATE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateIsNotNull() {
       addCriterion("GRADUATION_DATE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("GRADUATION_DATE =", value, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("GRADUATION_DATE <>", value, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("GRADUATION_DATE >", value, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("GRADUATION_DATE >=", value, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("GRADUATION_DATE <", value, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("GRADUATION_DATE <=", value, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("GRADUATION_DATE in", values, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("GRADUATION_DATE not in", values, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("GRADUATION_DATE between", value1, value2, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("GRADUATION_DATE not between", value1, value2, "graduationDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolIsNull() {
       addCriterion("GRADUATION_SCHOOL is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolIsNotNull() {
       addCriterion("GRADUATION_SCHOOL is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolEqualTo(String value) {
       addCriterion("GRADUATION_SCHOOL =", value, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolNotEqualTo(String value) {
       addCriterion("GRADUATION_SCHOOL <>", value, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolGreaterThan(String value) {
       addCriterion("GRADUATION_SCHOOL >", value, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolGreaterThanOrEqualTo(String value) {
       addCriterion("GRADUATION_SCHOOL >=", value, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolLessThan(String value) {
       addCriterion("GRADUATION_SCHOOL <", value, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolLessThanOrEqualTo(String value) {
       addCriterion("GRADUATION_SCHOOL <=", value, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolLike(String value) {
       addCriterion("GRADUATION_SCHOOL like", value, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolNotLike(String value) {
       addCriterion("GRADUATION_SCHOOL not like", value, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolIn(List<String> values) {
       addCriterion("GRADUATION_SCHOOL in", values, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolNotIn(List<String> values) {
       addCriterion("GRADUATION_SCHOOL not in", values, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolBetween(String value1, String value2) {
       addCriterion("GRADUATION_SCHOOL between", value1, value2, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andGraduationSchoolNotBetween(String value1, String value2) {
       addCriterion("GRADUATION_SCHOOL not between", value1, value2, "graduationSchool");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorIsNull() {
       addCriterion("STAFF_MAJOR is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorIsNotNull() {
       addCriterion("STAFF_MAJOR is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorEqualTo(String value) {
       addCriterion("STAFF_MAJOR =", value, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorNotEqualTo(String value) {
       addCriterion("STAFF_MAJOR <>", value, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorGreaterThan(String value) {
       addCriterion("STAFF_MAJOR >", value, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_MAJOR >=", value, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorLessThan(String value) {
       addCriterion("STAFF_MAJOR <", value, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorLessThanOrEqualTo(String value) {
       addCriterion("STAFF_MAJOR <=", value, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorLike(String value) {
       addCriterion("STAFF_MAJOR like", value, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorNotLike(String value) {
       addCriterion("STAFF_MAJOR not like", value, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorIn(List<String> values) {
       addCriterion("STAFF_MAJOR in", values, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorNotIn(List<String> values) {
       addCriterion("STAFF_MAJOR not in", values, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorBetween(String value1, String value2) {
       addCriterion("STAFF_MAJOR between", value1, value2, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffMajorNotBetween(String value1, String value2) {
       addCriterion("STAFF_MAJOR not between", value1, value2, "staffMajor");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelIsNull() {
       addCriterion("COMPUTER_LEVEL is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelIsNotNull() {
       addCriterion("COMPUTER_LEVEL is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelEqualTo(String value) {
       addCriterion("COMPUTER_LEVEL =", value, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelNotEqualTo(String value) {
       addCriterion("COMPUTER_LEVEL <>", value, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelGreaterThan(String value) {
       addCriterion("COMPUTER_LEVEL >", value, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelGreaterThanOrEqualTo(String value) {
       addCriterion("COMPUTER_LEVEL >=", value, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelLessThan(String value) {
       addCriterion("COMPUTER_LEVEL <", value, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelLessThanOrEqualTo(String value) {
       addCriterion("COMPUTER_LEVEL <=", value, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelLike(String value) {
       addCriterion("COMPUTER_LEVEL like", value, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelNotLike(String value) {
       addCriterion("COMPUTER_LEVEL not like", value, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelIn(List<String> values) {
       addCriterion("COMPUTER_LEVEL in", values, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelNotIn(List<String> values) {
       addCriterion("COMPUTER_LEVEL not in", values, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelBetween(String value1, String value2) {
       addCriterion("COMPUTER_LEVEL between", value1, value2, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andComputerLevelNotBetween(String value1, String value2) {
       addCriterion("COMPUTER_LEVEL not between", value1, value2, "computerLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1IsNull() {
       addCriterion("FOREIGN_LANGUAGE1 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1IsNotNull() {
       addCriterion("FOREIGN_LANGUAGE1 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1EqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE1 =", value, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1NotEqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE1 <>", value, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1GreaterThan(String value) {
       addCriterion("FOREIGN_LANGUAGE1 >", value, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1GreaterThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE1 >=", value, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1LessThan(String value) {
       addCriterion("FOREIGN_LANGUAGE1 <", value, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1LessThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE1 <=", value, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1Like(String value) {
       addCriterion("FOREIGN_LANGUAGE1 like", value, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1NotLike(String value) {
       addCriterion("FOREIGN_LANGUAGE1 not like", value, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1In(List<String> values) {
       addCriterion("FOREIGN_LANGUAGE1 in", values, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1NotIn(List<String> values) {
       addCriterion("FOREIGN_LANGUAGE1 not in", values, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1Between(String value1, String value2) {
       addCriterion("FOREIGN_LANGUAGE1 between", value1, value2, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage1NotBetween(String value1, String value2) {
       addCriterion("FOREIGN_LANGUAGE1 not between", value1, value2, "foreignLanguage1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1IsNull() {
       addCriterion("FOREIGN_LEVEL1 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1IsNotNull() {
       addCriterion("FOREIGN_LEVEL1 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1EqualTo(String value) {
       addCriterion("FOREIGN_LEVEL1 =", value, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1NotEqualTo(String value) {
       addCriterion("FOREIGN_LEVEL1 <>", value, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1GreaterThan(String value) {
       addCriterion("FOREIGN_LEVEL1 >", value, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1GreaterThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LEVEL1 >=", value, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1LessThan(String value) {
       addCriterion("FOREIGN_LEVEL1 <", value, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1LessThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LEVEL1 <=", value, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1Like(String value) {
       addCriterion("FOREIGN_LEVEL1 like", value, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1NotLike(String value) {
       addCriterion("FOREIGN_LEVEL1 not like", value, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1In(List<String> values) {
       addCriterion("FOREIGN_LEVEL1 in", values, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1NotIn(List<String> values) {
       addCriterion("FOREIGN_LEVEL1 not in", values, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1Between(String value1, String value2) {
       addCriterion("FOREIGN_LEVEL1 between", value1, value2, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel1NotBetween(String value1, String value2) {
       addCriterion("FOREIGN_LEVEL1 not between", value1, value2, "foreignLevel1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2IsNull() {
       addCriterion("FOREIGN_LANGUAGE2 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2IsNotNull() {
       addCriterion("FOREIGN_LANGUAGE2 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2EqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE2 =", value, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2NotEqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE2 <>", value, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2GreaterThan(String value) {
       addCriterion("FOREIGN_LANGUAGE2 >", value, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2GreaterThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE2 >=", value, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2LessThan(String value) {
       addCriterion("FOREIGN_LANGUAGE2 <", value, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2LessThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE2 <=", value, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2Like(String value) {
       addCriterion("FOREIGN_LANGUAGE2 like", value, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2NotLike(String value) {
       addCriterion("FOREIGN_LANGUAGE2 not like", value, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2In(List<String> values) {
       addCriterion("FOREIGN_LANGUAGE2 in", values, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2NotIn(List<String> values) {
       addCriterion("FOREIGN_LANGUAGE2 not in", values, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2Between(String value1, String value2) {
       addCriterion("FOREIGN_LANGUAGE2 between", value1, value2, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage2NotBetween(String value1, String value2) {
       addCriterion("FOREIGN_LANGUAGE2 not between", value1, value2, "foreignLanguage2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2IsNull() {
       addCriterion("FOREIGN_LEVEL2 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2IsNotNull() {
       addCriterion("FOREIGN_LEVEL2 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2EqualTo(String value) {
       addCriterion("FOREIGN_LEVEL2 =", value, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2NotEqualTo(String value) {
       addCriterion("FOREIGN_LEVEL2 <>", value, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2GreaterThan(String value) {
       addCriterion("FOREIGN_LEVEL2 >", value, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2GreaterThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LEVEL2 >=", value, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2LessThan(String value) {
       addCriterion("FOREIGN_LEVEL2 <", value, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2LessThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LEVEL2 <=", value, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2Like(String value) {
       addCriterion("FOREIGN_LEVEL2 like", value, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2NotLike(String value) {
       addCriterion("FOREIGN_LEVEL2 not like", value, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2In(List<String> values) {
       addCriterion("FOREIGN_LEVEL2 in", values, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2NotIn(List<String> values) {
       addCriterion("FOREIGN_LEVEL2 not in", values, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2Between(String value1, String value2) {
       addCriterion("FOREIGN_LEVEL2 between", value1, value2, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel2NotBetween(String value1, String value2) {
       addCriterion("FOREIGN_LEVEL2 not between", value1, value2, "foreignLevel2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3IsNull() {
       addCriterion("FOREIGN_LANGUAGE3 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3IsNotNull() {
       addCriterion("FOREIGN_LANGUAGE3 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3EqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE3 =", value, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3NotEqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE3 <>", value, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3GreaterThan(String value) {
       addCriterion("FOREIGN_LANGUAGE3 >", value, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3GreaterThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE3 >=", value, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3LessThan(String value) {
       addCriterion("FOREIGN_LANGUAGE3 <", value, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3LessThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LANGUAGE3 <=", value, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3Like(String value) {
       addCriterion("FOREIGN_LANGUAGE3 like", value, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3NotLike(String value) {
       addCriterion("FOREIGN_LANGUAGE3 not like", value, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3In(List<String> values) {
       addCriterion("FOREIGN_LANGUAGE3 in", values, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3NotIn(List<String> values) {
       addCriterion("FOREIGN_LANGUAGE3 not in", values, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3Between(String value1, String value2) {
       addCriterion("FOREIGN_LANGUAGE3 between", value1, value2, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLanguage3NotBetween(String value1, String value2) {
       addCriterion("FOREIGN_LANGUAGE3 not between", value1, value2, "foreignLanguage3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3IsNull() {
       addCriterion("FOREIGN_LEVEL3 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3IsNotNull() {
       addCriterion("FOREIGN_LEVEL3 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3EqualTo(String value) {
       addCriterion("FOREIGN_LEVEL3 =", value, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3NotEqualTo(String value) {
       addCriterion("FOREIGN_LEVEL3 <>", value, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3GreaterThan(String value) {
       addCriterion("FOREIGN_LEVEL3 >", value, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3GreaterThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LEVEL3 >=", value, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3LessThan(String value) {
       addCriterion("FOREIGN_LEVEL3 <", value, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3LessThanOrEqualTo(String value) {
       addCriterion("FOREIGN_LEVEL3 <=", value, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3Like(String value) {
       addCriterion("FOREIGN_LEVEL3 like", value, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3NotLike(String value) {
       addCriterion("FOREIGN_LEVEL3 not like", value, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3In(List<String> values) {
       addCriterion("FOREIGN_LEVEL3 in", values, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3NotIn(List<String> values) {
       addCriterion("FOREIGN_LEVEL3 not in", values, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3Between(String value1, String value2) {
       addCriterion("FOREIGN_LEVEL3 between", value1, value2, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andForeignLevel3NotBetween(String value1, String value2) {
       addCriterion("FOREIGN_LEVEL3 not between", value1, value2, "foreignLevel3");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsIsNull() {
       addCriterion("STAFF_SKILLS is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsIsNotNull() {
       addCriterion("STAFF_SKILLS is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsEqualTo(String value) {
       addCriterion("STAFF_SKILLS =", value, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsNotEqualTo(String value) {
       addCriterion("STAFF_SKILLS <>", value, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsGreaterThan(String value) {
       addCriterion("STAFF_SKILLS >", value, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_SKILLS >=", value, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsLessThan(String value) {
       addCriterion("STAFF_SKILLS <", value, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsLessThanOrEqualTo(String value) {
       addCriterion("STAFF_SKILLS <=", value, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsLike(String value) {
       addCriterion("STAFF_SKILLS like", value, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsNotLike(String value) {
       addCriterion("STAFF_SKILLS not like", value, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsIn(List<String> values) {
       addCriterion("STAFF_SKILLS in", values, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsNotIn(List<String> values) {
       addCriterion("STAFF_SKILLS not in", values, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsBetween(String value1, String value2) {
       addCriterion("STAFF_SKILLS between", value1, value2, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffSkillsNotBetween(String value1, String value2) {
       addCriterion("STAFF_SKILLS not between", value1, value2, "staffSkills");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationIsNull() {
       addCriterion("STAFF_OCCUPATION is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationIsNotNull() {
       addCriterion("STAFF_OCCUPATION is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationEqualTo(String value) {
       addCriterion("STAFF_OCCUPATION =", value, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationNotEqualTo(String value) {
       addCriterion("STAFF_OCCUPATION <>", value, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationGreaterThan(String value) {
       addCriterion("STAFF_OCCUPATION >", value, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_OCCUPATION >=", value, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationLessThan(String value) {
       addCriterion("STAFF_OCCUPATION <", value, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationLessThanOrEqualTo(String value) {
       addCriterion("STAFF_OCCUPATION <=", value, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationLike(String value) {
       addCriterion("STAFF_OCCUPATION like", value, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationNotLike(String value) {
       addCriterion("STAFF_OCCUPATION not like", value, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationIn(List<String> values) {
       addCriterion("STAFF_OCCUPATION in", values, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationNotIn(List<String> values) {
       addCriterion("STAFF_OCCUPATION not in", values, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationBetween(String value1, String value2) {
       addCriterion("STAFF_OCCUPATION between", value1, value2, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffOccupationNotBetween(String value1, String value2) {
       addCriterion("STAFF_OCCUPATION not between", value1, value2, "staffOccupation");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelIsNull() {
       addCriterion("ADMINISTRATION_LEVEL is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelIsNotNull() {
       addCriterion("ADMINISTRATION_LEVEL is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelEqualTo(String value) {
       addCriterion("ADMINISTRATION_LEVEL =", value, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelNotEqualTo(String value) {
       addCriterion("ADMINISTRATION_LEVEL <>", value, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelGreaterThan(String value) {
       addCriterion("ADMINISTRATION_LEVEL >", value, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelGreaterThanOrEqualTo(String value) {
       addCriterion("ADMINISTRATION_LEVEL >=", value, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelLessThan(String value) {
       addCriterion("ADMINISTRATION_LEVEL <", value, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelLessThanOrEqualTo(String value) {
       addCriterion("ADMINISTRATION_LEVEL <=", value, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelLike(String value) {
       addCriterion("ADMINISTRATION_LEVEL like", value, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelNotLike(String value) {
       addCriterion("ADMINISTRATION_LEVEL not like", value, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelIn(List<String> values) {
       addCriterion("ADMINISTRATION_LEVEL in", values, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelNotIn(List<String> values) {
       addCriterion("ADMINISTRATION_LEVEL not in", values, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelBetween(String value1, String value2) {
       addCriterion("ADMINISTRATION_LEVEL between", value1, value2, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAdministrationLevelNotBetween(String value1, String value2) {
       addCriterion("ADMINISTRATION_LEVEL not between", value1, value2, "administrationLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionIsNull() {
       addCriterion("JOB_POSITION is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionIsNotNull() {
       addCriterion("JOB_POSITION is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionEqualTo(String value) {
       addCriterion("JOB_POSITION =", value, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionNotEqualTo(String value) {
       addCriterion("JOB_POSITION <>", value, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionGreaterThan(String value) {
       addCriterion("JOB_POSITION >", value, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionGreaterThanOrEqualTo(String value) {
       addCriterion("JOB_POSITION >=", value, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionLessThan(String value) {
       addCriterion("JOB_POSITION <", value, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionLessThanOrEqualTo(String value) {
       addCriterion("JOB_POSITION <=", value, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionLike(String value) {
       addCriterion("JOB_POSITION like", value, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionNotLike(String value) {
       addCriterion("JOB_POSITION not like", value, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionIn(List<String> values) {
       addCriterion("JOB_POSITION in", values, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionNotIn(List<String> values) {
       addCriterion("JOB_POSITION not in", values, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionBetween(String value1, String value2) {
       addCriterion("JOB_POSITION between", value1, value2, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobPositionNotBetween(String value1, String value2) {
       addCriterion("JOB_POSITION not between", value1, value2, "jobPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionIsNull() {
       addCriterion("PRESENT_POSITION is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionIsNotNull() {
       addCriterion("PRESENT_POSITION is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionEqualTo(String value) {
       addCriterion("PRESENT_POSITION =", value, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionNotEqualTo(String value) {
       addCriterion("PRESENT_POSITION <>", value, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionGreaterThan(String value) {
       addCriterion("PRESENT_POSITION >", value, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionGreaterThanOrEqualTo(String value) {
       addCriterion("PRESENT_POSITION >=", value, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionLessThan(String value) {
       addCriterion("PRESENT_POSITION <", value, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionLessThanOrEqualTo(String value) {
       addCriterion("PRESENT_POSITION <=", value, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionLike(String value) {
       addCriterion("PRESENT_POSITION like", value, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionNotLike(String value) {
       addCriterion("PRESENT_POSITION not like", value, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionIn(List<String> values) {
       addCriterion("PRESENT_POSITION in", values, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionNotIn(List<String> values) {
       addCriterion("PRESENT_POSITION not in", values, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionBetween(String value1, String value2) {
       addCriterion("PRESENT_POSITION between", value1, value2, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPresentPositionNotBetween(String value1, String value2) {
       addCriterion("PRESENT_POSITION not between", value1, value2, "presentPosition");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedIsNull() {
       addCriterion("DATES_EMPLOYED is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedIsNotNull() {
       addCriterion("DATES_EMPLOYED is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("DATES_EMPLOYED =", value, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("DATES_EMPLOYED <>", value, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("DATES_EMPLOYED >", value, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("DATES_EMPLOYED >=", value, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedLessThan(java.util.Date value) {
       addCriterionForJDBCDate("DATES_EMPLOYED <", value, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("DATES_EMPLOYED <=", value, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("DATES_EMPLOYED in", values, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("DATES_EMPLOYED not in", values, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("DATES_EMPLOYED between", value1, value2, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDatesEmployedNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("DATES_EMPLOYED not between", value1, value2, "datesEmployed");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeIsNull() {
       addCriterion("JOB_AGE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeIsNotNull() {
       addCriterion("JOB_AGE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeEqualTo(String value) {
       addCriterion("JOB_AGE =", value, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeNotEqualTo(String value) {
       addCriterion("JOB_AGE <>", value, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeGreaterThan(String value) {
       addCriterion("JOB_AGE >", value, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeGreaterThanOrEqualTo(String value) {
       addCriterion("JOB_AGE >=", value, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeLessThan(String value) {
       addCriterion("JOB_AGE <", value, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeLessThanOrEqualTo(String value) {
       addCriterion("JOB_AGE <=", value, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeLike(String value) {
       addCriterion("JOB_AGE like", value, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeNotLike(String value) {
       addCriterion("JOB_AGE not like", value, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeIn(List<String> values) {
       addCriterion("JOB_AGE in", values, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeNotIn(List<String> values) {
       addCriterion("JOB_AGE not in", values, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeBetween(String value1, String value2) {
       addCriterion("JOB_AGE between", value1, value2, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andJobAgeNotBetween(String value1, String value2) {
       addCriterion("JOB_AGE not between", value1, value2, "jobAge");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeIsNull() {
       addCriterion("BEGIN_SALSRY_TIME is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeIsNotNull() {
       addCriterion("BEGIN_SALSRY_TIME is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME =", value, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME <>", value, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME >", value, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME >=", value, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeLessThan(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME <", value, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME <=", value, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME in", values, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME not in", values, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME between", value1, value2, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeginSalsryTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("BEGIN_SALSRY_TIME not between", value1, value2, "beginSalsryTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusIsNull() {
       addCriterion("WORK_STATUS is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusIsNotNull() {
       addCriterion("WORK_STATUS is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusEqualTo(String value) {
       addCriterion("WORK_STATUS =", value, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusNotEqualTo(String value) {
       addCriterion("WORK_STATUS <>", value, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusGreaterThan(String value) {
       addCriterion("WORK_STATUS >", value, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusGreaterThanOrEqualTo(String value) {
       addCriterion("WORK_STATUS >=", value, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusLessThan(String value) {
       addCriterion("WORK_STATUS <", value, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusLessThanOrEqualTo(String value) {
       addCriterion("WORK_STATUS <=", value, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusLike(String value) {
       addCriterion("WORK_STATUS like", value, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusNotLike(String value) {
       addCriterion("WORK_STATUS not like", value, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusIn(List<String> values) {
       addCriterion("WORK_STATUS in", values, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusNotIn(List<String> values) {
       addCriterion("WORK_STATUS not in", values, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusBetween(String value1, String value2) {
       addCriterion("WORK_STATUS between", value1, value2, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkStatusNotBetween(String value1, String value2) {
       addCriterion("WORK_STATUS not between", value1, value2, "workStatus");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsIsNull() {
       addCriterion("STAFF_CS is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsIsNotNull() {
       addCriterion("STAFF_CS is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CS =", value, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CS <>", value, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CS >", value, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CS >=", value, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsLessThan(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CS <", value, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CS <=", value, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("STAFF_CS in", values, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("STAFF_CS not in", values, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("STAFF_CS between", value1, value2, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCsNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("STAFF_CS not between", value1, value2, "staffCs");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrIsNull() {
       addCriterion("STAFF_CTR is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrIsNotNull() {
       addCriterion("STAFF_CTR is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CTR =", value, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CTR <>", value, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CTR >", value, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CTR >=", value, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrLessThan(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CTR <", value, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("STAFF_CTR <=", value, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("STAFF_CTR in", values, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("STAFF_CTR not in", values, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("STAFF_CTR between", value1, value2, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCtrNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("STAFF_CTR not between", value1, value2, "staffCtr");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyIsNull() {
       addCriterion("STAFF_COMPANY is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyIsNotNull() {
       addCriterion("STAFF_COMPANY is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyEqualTo(String value) {
       addCriterion("STAFF_COMPANY =", value, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyNotEqualTo(String value) {
       addCriterion("STAFF_COMPANY <>", value, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyGreaterThan(String value) {
       addCriterion("STAFF_COMPANY >", value, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_COMPANY >=", value, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyLessThan(String value) {
       addCriterion("STAFF_COMPANY <", value, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyLessThanOrEqualTo(String value) {
       addCriterion("STAFF_COMPANY <=", value, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyLike(String value) {
       addCriterion("STAFF_COMPANY like", value, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyNotLike(String value) {
       addCriterion("STAFF_COMPANY not like", value, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyIn(List<String> values) {
       addCriterion("STAFF_COMPANY in", values, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyNotIn(List<String> values) {
       addCriterion("STAFF_COMPANY not in", values, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyBetween(String value1, String value2) {
       addCriterion("STAFF_COMPANY between", value1, value2, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffCompanyNotBetween(String value1, String value2) {
       addCriterion("STAFF_COMPANY not between", value1, value2, "staffCompany");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeIsNull() {
       addCriterion("ADD_TIME is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeIsNotNull() {
       addCriterion("ADD_TIME is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME =", value, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeNotEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME <>", value, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeGreaterThan(java.util.Date value) {
       addCriterion("ADD_TIME >", value, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME >=", value, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeLessThan(java.util.Date value) {
       addCriterion("ADD_TIME <", value, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME <=", value, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeIn(List<java.util.Date> values) {
       addCriterion("ADD_TIME in", values, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeNotIn(List<java.util.Date> values) {
       addCriterion("ADD_TIME not in", values, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_TIME between", value1, value2, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_TIME not between", value1, value2, "addTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeIsNull() {
       addCriterion("LAST_UPDATE_TIME is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeIsNotNull() {
       addCriterion("LAST_UPDATE_TIME is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeEqualTo(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeNotEqualTo(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeGreaterThan(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeLessThan(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeIn(List<java.util.Date> values) {
       addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeNotIn(List<java.util.Date> values) {
       addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLastUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeIsNull() {
       addCriterion("LEAVE_TYPE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeIsNotNull() {
       addCriterion("LEAVE_TYPE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeEqualTo(BigDecimal value) {
       addCriterion("LEAVE_TYPE =", value, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeNotEqualTo(BigDecimal value) {
       addCriterion("LEAVE_TYPE <>", value, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeGreaterThan(BigDecimal value) {
       addCriterion("LEAVE_TYPE >", value, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("LEAVE_TYPE >=", value, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeLessThan(BigDecimal value) {
       addCriterion("LEAVE_TYPE <", value, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeLessThanOrEqualTo(BigDecimal value) {
       addCriterion("LEAVE_TYPE <=", value, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeIn(List<BigDecimal> values) {
       addCriterion("LEAVE_TYPE in", values, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeNotIn(List<BigDecimal> values) {
       addCriterion("LEAVE_TYPE not in", values, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("LEAVE_TYPE between", value1, value2, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andLeaveTypeNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("LEAVE_TYPE not between", value1, value2, "leaveType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeIsNull() {
       addCriterion("STAFF_TYPE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeIsNotNull() {
       addCriterion("STAFF_TYPE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeEqualTo(String value) {
       addCriterion("STAFF_TYPE =", value, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeNotEqualTo(String value) {
       addCriterion("STAFF_TYPE <>", value, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeGreaterThan(String value) {
       addCriterion("STAFF_TYPE >", value, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_TYPE >=", value, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeLessThan(String value) {
       addCriterion("STAFF_TYPE <", value, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeLessThanOrEqualTo(String value) {
       addCriterion("STAFF_TYPE <=", value, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeLike(String value) {
       addCriterion("STAFF_TYPE like", value, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeNotLike(String value) {
       addCriterion("STAFF_TYPE not like", value, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeIn(List<String> values) {
       addCriterion("STAFF_TYPE in", values, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeNotIn(List<String> values) {
       addCriterion("STAFF_TYPE not in", values, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeBetween(String value1, String value2) {
       addCriterion("STAFF_TYPE between", value1, value2, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffTypeNotBetween(String value1, String value2) {
       addCriterion("STAFF_TYPE not between", value1, value2, "staffType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotIsNull() {
       addCriterion("YES_OR_NOT is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotIsNotNull() {
       addCriterion("YES_OR_NOT is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotEqualTo(String value) {
       addCriterion("YES_OR_NOT =", value, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotNotEqualTo(String value) {
       addCriterion("YES_OR_NOT <>", value, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotGreaterThan(String value) {
       addCriterion("YES_OR_NOT >", value, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotGreaterThanOrEqualTo(String value) {
       addCriterion("YES_OR_NOT >=", value, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotLessThan(String value) {
       addCriterion("YES_OR_NOT <", value, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotLessThanOrEqualTo(String value) {
       addCriterion("YES_OR_NOT <=", value, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotLike(String value) {
       addCriterion("YES_OR_NOT like", value, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotNotLike(String value) {
       addCriterion("YES_OR_NOT not like", value, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotIn(List<String> values) {
       addCriterion("YES_OR_NOT in", values, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotNotIn(List<String> values) {
       addCriterion("YES_OR_NOT not in", values, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotBetween(String value1, String value2) {
       addCriterion("YES_OR_NOT between", value1, value2, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andYesOrNotNotBetween(String value1, String value2) {
       addCriterion("YES_OR_NOT not between", value1, value2, "yesOrNot");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateIsNull() {
       addCriterion("RECORD_DATE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateIsNotNull() {
       addCriterion("RECORD_DATE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RECORD_DATE =", value, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RECORD_DATE <>", value, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("RECORD_DATE >", value, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RECORD_DATE >=", value, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("RECORD_DATE <", value, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("RECORD_DATE <=", value, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("RECORD_DATE in", values, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("RECORD_DATE not in", values, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("RECORD_DATE between", value1, value2, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andRecordDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("RECORD_DATE not between", value1, value2, "recordDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelIsNull() {
       addCriterion("WORK_LEVEL is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelIsNotNull() {
       addCriterion("WORK_LEVEL is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelEqualTo(String value) {
       addCriterion("WORK_LEVEL =", value, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelNotEqualTo(String value) {
       addCriterion("WORK_LEVEL <>", value, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelGreaterThan(String value) {
       addCriterion("WORK_LEVEL >", value, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelGreaterThanOrEqualTo(String value) {
       addCriterion("WORK_LEVEL >=", value, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelLessThan(String value) {
       addCriterion("WORK_LEVEL <", value, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelLessThanOrEqualTo(String value) {
       addCriterion("WORK_LEVEL <=", value, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelLike(String value) {
       addCriterion("WORK_LEVEL like", value, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelNotLike(String value) {
       addCriterion("WORK_LEVEL not like", value, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelIn(List<String> values) {
       addCriterion("WORK_LEVEL in", values, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelNotIn(List<String> values) {
       addCriterion("WORK_LEVEL not in", values, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelBetween(String value1, String value2) {
       addCriterion("WORK_LEVEL between", value1, value2, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkLevelNotBetween(String value1, String value2) {
       addCriterion("WORK_LEVEL not between", value1, value2, "workLevel");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2IsNull() {
       addCriterion("STAFF_NATIVE_PLACE2 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2IsNotNull() {
       addCriterion("STAFF_NATIVE_PLACE2 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2EqualTo(String value) {
       addCriterion("STAFF_NATIVE_PLACE2 =", value, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2NotEqualTo(String value) {
       addCriterion("STAFF_NATIVE_PLACE2 <>", value, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2GreaterThan(String value) {
       addCriterion("STAFF_NATIVE_PLACE2 >", value, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2GreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_NATIVE_PLACE2 >=", value, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2LessThan(String value) {
       addCriterion("STAFF_NATIVE_PLACE2 <", value, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2LessThanOrEqualTo(String value) {
       addCriterion("STAFF_NATIVE_PLACE2 <=", value, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2Like(String value) {
       addCriterion("STAFF_NATIVE_PLACE2 like", value, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2NotLike(String value) {
       addCriterion("STAFF_NATIVE_PLACE2 not like", value, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2In(List<String> values) {
       addCriterion("STAFF_NATIVE_PLACE2 in", values, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2NotIn(List<String> values) {
       addCriterion("STAFF_NATIVE_PLACE2 not in", values, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2Between(String value1, String value2) {
       addCriterion("STAFF_NATIVE_PLACE2 between", value1, value2, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andStaffNativePlace2NotBetween(String value1, String value2) {
       addCriterion("STAFF_NATIVE_PLACE2 not between", value1, value2, "staffNativePlace2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobIsNull() {
       addCriterion("WORK_JOB is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobIsNotNull() {
       addCriterion("WORK_JOB is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobEqualTo(String value) {
       addCriterion("WORK_JOB =", value, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobNotEqualTo(String value) {
       addCriterion("WORK_JOB <>", value, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobGreaterThan(String value) {
       addCriterion("WORK_JOB >", value, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobGreaterThanOrEqualTo(String value) {
       addCriterion("WORK_JOB >=", value, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobLessThan(String value) {
       addCriterion("WORK_JOB <", value, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobLessThanOrEqualTo(String value) {
       addCriterion("WORK_JOB <=", value, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobLike(String value) {
       addCriterion("WORK_JOB like", value, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobNotLike(String value) {
       addCriterion("WORK_JOB not like", value, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobIn(List<String> values) {
       addCriterion("WORK_JOB in", values, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobNotIn(List<String> values) {
       addCriterion("WORK_JOB not in", values, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobBetween(String value1, String value2) {
       addCriterion("WORK_JOB between", value1, value2, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andWorkJobNotBetween(String value1, String value2) {
       addCriterion("WORK_JOB not between", value1, value2, "workJob");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameIsNull() {
       addCriterion("BEFORE_NAME is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameIsNotNull() {
       addCriterion("BEFORE_NAME is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameEqualTo(String value) {
       addCriterion("BEFORE_NAME =", value, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameNotEqualTo(String value) {
       addCriterion("BEFORE_NAME <>", value, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameGreaterThan(String value) {
       addCriterion("BEFORE_NAME >", value, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameGreaterThanOrEqualTo(String value) {
       addCriterion("BEFORE_NAME >=", value, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameLessThan(String value) {
       addCriterion("BEFORE_NAME <", value, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameLessThanOrEqualTo(String value) {
       addCriterion("BEFORE_NAME <=", value, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameLike(String value) {
       addCriterion("BEFORE_NAME like", value, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameNotLike(String value) {
       addCriterion("BEFORE_NAME not like", value, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameIn(List<String> values) {
       addCriterion("BEFORE_NAME in", values, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameNotIn(List<String> values) {
       addCriterion("BEFORE_NAME not in", values, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameBetween(String value1, String value2) {
       addCriterion("BEFORE_NAME between", value1, value2, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBeforeNameNotBetween(String value1, String value2) {
       addCriterion("BEFORE_NAME not between", value1, value2, "beforeName");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateIsNull() {
       addCriterion("BIRTH_REMIND_DATE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateIsNotNull() {
       addCriterion("BIRTH_REMIND_DATE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateEqualTo(String value) {
       addCriterion("BIRTH_REMIND_DATE =", value, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateNotEqualTo(String value) {
       addCriterion("BIRTH_REMIND_DATE <>", value, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateGreaterThan(String value) {
       addCriterion("BIRTH_REMIND_DATE >", value, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateGreaterThanOrEqualTo(String value) {
       addCriterion("BIRTH_REMIND_DATE >=", value, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateLessThan(String value) {
       addCriterion("BIRTH_REMIND_DATE <", value, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateLessThanOrEqualTo(String value) {
       addCriterion("BIRTH_REMIND_DATE <=", value, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateLike(String value) {
       addCriterion("BIRTH_REMIND_DATE like", value, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateNotLike(String value) {
       addCriterion("BIRTH_REMIND_DATE not like", value, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateIn(List<String> values) {
       addCriterion("BIRTH_REMIND_DATE in", values, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateNotIn(List<String> values) {
       addCriterion("BIRTH_REMIND_DATE not in", values, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateBetween(String value1, String value2) {
       addCriterion("BIRTH_REMIND_DATE between", value1, value2, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBirthRemindDateNotBetween(String value1, String value2) {
       addCriterion("BIRTH_REMIND_DATE not between", value1, value2, "birthRemindDate");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1IsNull() {
       addCriterion("BANK1 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1IsNotNull() {
       addCriterion("BANK1 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1EqualTo(String value) {
       addCriterion("BANK1 =", value, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1NotEqualTo(String value) {
       addCriterion("BANK1 <>", value, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1GreaterThan(String value) {
       addCriterion("BANK1 >", value, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1GreaterThanOrEqualTo(String value) {
       addCriterion("BANK1 >=", value, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1LessThan(String value) {
       addCriterion("BANK1 <", value, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1LessThanOrEqualTo(String value) {
       addCriterion("BANK1 <=", value, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1Like(String value) {
       addCriterion("BANK1 like", value, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1NotLike(String value) {
       addCriterion("BANK1 not like", value, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1In(List<String> values) {
       addCriterion("BANK1 in", values, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1NotIn(List<String> values) {
       addCriterion("BANK1 not in", values, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1Between(String value1, String value2) {
       addCriterion("BANK1 between", value1, value2, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank1NotBetween(String value1, String value2) {
       addCriterion("BANK1 not between", value1, value2, "bank1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1IsNull() {
       addCriterion("BANK_ACCOUNT1 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1IsNotNull() {
       addCriterion("BANK_ACCOUNT1 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1EqualTo(String value) {
       addCriterion("BANK_ACCOUNT1 =", value, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1NotEqualTo(String value) {
       addCriterion("BANK_ACCOUNT1 <>", value, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1GreaterThan(String value) {
       addCriterion("BANK_ACCOUNT1 >", value, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1GreaterThanOrEqualTo(String value) {
       addCriterion("BANK_ACCOUNT1 >=", value, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1LessThan(String value) {
       addCriterion("BANK_ACCOUNT1 <", value, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1LessThanOrEqualTo(String value) {
       addCriterion("BANK_ACCOUNT1 <=", value, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1Like(String value) {
       addCriterion("BANK_ACCOUNT1 like", value, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1NotLike(String value) {
       addCriterion("BANK_ACCOUNT1 not like", value, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1In(List<String> values) {
       addCriterion("BANK_ACCOUNT1 in", values, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1NotIn(List<String> values) {
       addCriterion("BANK_ACCOUNT1 not in", values, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1Between(String value1, String value2) {
       addCriterion("BANK_ACCOUNT1 between", value1, value2, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount1NotBetween(String value1, String value2) {
       addCriterion("BANK_ACCOUNT1 not between", value1, value2, "bankAccount1");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2IsNull() {
       addCriterion("BANK2 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2IsNotNull() {
       addCriterion("BANK2 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2EqualTo(String value) {
       addCriterion("BANK2 =", value, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2NotEqualTo(String value) {
       addCriterion("BANK2 <>", value, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2GreaterThan(String value) {
       addCriterion("BANK2 >", value, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2GreaterThanOrEqualTo(String value) {
       addCriterion("BANK2 >=", value, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2LessThan(String value) {
       addCriterion("BANK2 <", value, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2LessThanOrEqualTo(String value) {
       addCriterion("BANK2 <=", value, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2Like(String value) {
       addCriterion("BANK2 like", value, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2NotLike(String value) {
       addCriterion("BANK2 not like", value, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2In(List<String> values) {
       addCriterion("BANK2 in", values, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2NotIn(List<String> values) {
       addCriterion("BANK2 not in", values, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2Between(String value1, String value2) {
       addCriterion("BANK2 between", value1, value2, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBank2NotBetween(String value1, String value2) {
       addCriterion("BANK2 not between", value1, value2, "bank2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2IsNull() {
       addCriterion("BANK_ACCOUNT2 is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2IsNotNull() {
       addCriterion("BANK_ACCOUNT2 is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2EqualTo(String value) {
       addCriterion("BANK_ACCOUNT2 =", value, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2NotEqualTo(String value) {
       addCriterion("BANK_ACCOUNT2 <>", value, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2GreaterThan(String value) {
       addCriterion("BANK_ACCOUNT2 >", value, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2GreaterThanOrEqualTo(String value) {
       addCriterion("BANK_ACCOUNT2 >=", value, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2LessThan(String value) {
       addCriterion("BANK_ACCOUNT2 <", value, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2LessThanOrEqualTo(String value) {
       addCriterion("BANK_ACCOUNT2 <=", value, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2Like(String value) {
       addCriterion("BANK_ACCOUNT2 like", value, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2NotLike(String value) {
       addCriterion("BANK_ACCOUNT2 not like", value, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2In(List<String> values) {
       addCriterion("BANK_ACCOUNT2 in", values, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2NotIn(List<String> values) {
       addCriterion("BANK_ACCOUNT2 not in", values, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2Between(String value1, String value2) {
       addCriterion("BANK_ACCOUNT2 between", value1, value2, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBankAccount2NotBetween(String value1, String value2) {
       addCriterion("BANK_ACCOUNT2 not between", value1, value2, "bankAccount2");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeIsNull() {
       addCriterion("BLOOD_TYPE is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeIsNotNull() {
       addCriterion("BLOOD_TYPE is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeEqualTo(String value) {
       addCriterion("BLOOD_TYPE =", value, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeNotEqualTo(String value) {
       addCriterion("BLOOD_TYPE <>", value, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeGreaterThan(String value) {
       addCriterion("BLOOD_TYPE >", value, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeGreaterThanOrEqualTo(String value) {
       addCriterion("BLOOD_TYPE >=", value, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeLessThan(String value) {
       addCriterion("BLOOD_TYPE <", value, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeLessThanOrEqualTo(String value) {
       addCriterion("BLOOD_TYPE <=", value, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeLike(String value) {
       addCriterion("BLOOD_TYPE like", value, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeNotLike(String value) {
       addCriterion("BLOOD_TYPE not like", value, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeIn(List<String> values) {
       addCriterion("BLOOD_TYPE in", values, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeNotIn(List<String> values) {
       addCriterion("BLOOD_TYPE not in", values, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeBetween(String value1, String value2) {
       addCriterion("BLOOD_TYPE between", value1, value2, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andBloodTypeNotBetween(String value1, String value2) {
       addCriterion("BLOOD_TYPE not between", value1, value2, "bloodType");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsIsNull() {
       addCriterion("IS_EXPERTS is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsIsNotNull() {
       addCriterion("IS_EXPERTS is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsEqualTo(String value) {
       addCriterion("IS_EXPERTS =", value, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsNotEqualTo(String value) {
       addCriterion("IS_EXPERTS <>", value, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsGreaterThan(String value) {
       addCriterion("IS_EXPERTS >", value, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsGreaterThanOrEqualTo(String value) {
       addCriterion("IS_EXPERTS >=", value, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsLessThan(String value) {
       addCriterion("IS_EXPERTS <", value, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsLessThanOrEqualTo(String value) {
       addCriterion("IS_EXPERTS <=", value, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsLike(String value) {
       addCriterion("IS_EXPERTS like", value, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsNotLike(String value) {
       addCriterion("IS_EXPERTS not like", value, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsIn(List<String> values) {
       addCriterion("IS_EXPERTS in", values, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsNotIn(List<String> values) {
       addCriterion("IS_EXPERTS not in", values, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsBetween(String value1, String value2) {
       addCriterion("IS_EXPERTS between", value1, value2, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andIsExpertsNotBetween(String value1, String value2) {
       addCriterion("IS_EXPERTS not between", value1, value2, "isExperts");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderIsNull() {
       addCriterion("DIRECTLY_UNDER is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderIsNotNull() {
       addCriterion("DIRECTLY_UNDER is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderEqualTo(String value) {
       addCriterion("DIRECTLY_UNDER =", value, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderNotEqualTo(String value) {
       addCriterion("DIRECTLY_UNDER <>", value, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderGreaterThan(String value) {
       addCriterion("DIRECTLY_UNDER >", value, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderGreaterThanOrEqualTo(String value) {
       addCriterion("DIRECTLY_UNDER >=", value, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderLessThan(String value) {
       addCriterion("DIRECTLY_UNDER <", value, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderLessThanOrEqualTo(String value) {
       addCriterion("DIRECTLY_UNDER <=", value, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderLike(String value) {
       addCriterion("DIRECTLY_UNDER like", value, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderNotLike(String value) {
       addCriterion("DIRECTLY_UNDER not like", value, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderIn(List<String> values) {
       addCriterion("DIRECTLY_UNDER in", values, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderNotIn(List<String> values) {
       addCriterion("DIRECTLY_UNDER not in", values, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderBetween(String value1, String value2) {
       addCriterion("DIRECTLY_UNDER between", value1, value2, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlyUnderNotBetween(String value1, String value2) {
       addCriterion("DIRECTLY_UNDER not between", value1, value2, "directlyUnder");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorIsNull() {
       addCriterion("DIRECTLY_SUPERIOR is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorIsNotNull() {
       addCriterion("DIRECTLY_SUPERIOR is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorEqualTo(String value) {
       addCriterion("DIRECTLY_SUPERIOR =", value, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorNotEqualTo(String value) {
       addCriterion("DIRECTLY_SUPERIOR <>", value, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorGreaterThan(String value) {
       addCriterion("DIRECTLY_SUPERIOR >", value, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorGreaterThanOrEqualTo(String value) {
       addCriterion("DIRECTLY_SUPERIOR >=", value, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorLessThan(String value) {
       addCriterion("DIRECTLY_SUPERIOR <", value, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorLessThanOrEqualTo(String value) {
       addCriterion("DIRECTLY_SUPERIOR <=", value, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorLike(String value) {
       addCriterion("DIRECTLY_SUPERIOR like", value, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorNotLike(String value) {
       addCriterion("DIRECTLY_SUPERIOR not like", value, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorIn(List<String> values) {
       addCriterion("DIRECTLY_SUPERIOR in", values, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorNotIn(List<String> values) {
       addCriterion("DIRECTLY_SUPERIOR not in", values, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorBetween(String value1, String value2) {
       addCriterion("DIRECTLY_SUPERIOR between", value1, value2, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andDirectlySuperiorNotBetween(String value1, String value2) {
       addCriterion("DIRECTLY_SUPERIOR not between", value1, value2, "directlySuperior");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeIsNull() {
       addCriterion("PART_TIME is null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeIsNotNull() {
       addCriterion("PART_TIME is not null");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeEqualTo(String value) {
       addCriterion("PART_TIME =", value, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeNotEqualTo(String value) {
       addCriterion("PART_TIME <>", value, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeGreaterThan(String value) {
       addCriterion("PART_TIME >", value, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeGreaterThanOrEqualTo(String value) {
       addCriterion("PART_TIME >=", value, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeLessThan(String value) {
       addCriterion("PART_TIME <", value, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeLessThanOrEqualTo(String value) {
       addCriterion("PART_TIME <=", value, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeLike(String value) {
       addCriterion("PART_TIME like", value, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeNotLike(String value) {
       addCriterion("PART_TIME not like", value, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeIn(List<String> values) {
       addCriterion("PART_TIME in", values, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeNotIn(List<String> values) {
       addCriterion("PART_TIME not in", values, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeBetween(String value1, String value2) {
       addCriterion("PART_TIME between", value1, value2, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
 
     public HrStaffInfoExample.Criteria andPartTimeNotBetween(String value1, String value2) {
       addCriterion("PART_TIME not between", value1, value2, "partTime");
       return (HrStaffInfoExample.Criteria)this;
     }
   }
 }
