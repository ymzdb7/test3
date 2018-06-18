 package com.myoa.model.hr;
 
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 public class HrStaffLeaveExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public HrStaffLeaveExample()
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
 
   public static class Criteria extends HrStaffLeaveExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<HrStaffLeaveExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<HrStaffLeaveExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<HrStaffLeaveExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new HrStaffLeaveExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new HrStaffLeaveExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new HrStaffLeaveExample.Criterion(condition, value1, value2));
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
 
     public HrStaffLeaveExample.Criteria andLeaveIdIsNull() {
       addCriterion("LEAVE_ID is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdIsNotNull() {
       addCriterion("LEAVE_ID is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdEqualTo(Integer value) {
       addCriterion("LEAVE_ID =", value, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdNotEqualTo(Integer value) {
       addCriterion("LEAVE_ID <>", value, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdGreaterThan(Integer value) {
       addCriterion("LEAVE_ID >", value, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("LEAVE_ID >=", value, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdLessThan(Integer value) {
       addCriterion("LEAVE_ID <", value, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdLessThanOrEqualTo(Integer value) {
       addCriterion("LEAVE_ID <=", value, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdIn(List<Integer> values) {
       addCriterion("LEAVE_ID in", values, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdNotIn(List<Integer> values) {
       addCriterion("LEAVE_ID not in", values, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdBetween(Integer value1, Integer value2) {
       addCriterion("LEAVE_ID between", value1, value2, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveIdNotBetween(Integer value1, Integer value2) {
       addCriterion("LEAVE_ID not between", value1, value2, "leaveId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdIsNull() {
       addCriterion("CREATE_USER_ID is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdIsNotNull() {
       addCriterion("CREATE_USER_ID is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdEqualTo(String value) {
       addCriterion("CREATE_USER_ID =", value, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdNotEqualTo(String value) {
       addCriterion("CREATE_USER_ID <>", value, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdGreaterThan(String value) {
       addCriterion("CREATE_USER_ID >", value, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("CREATE_USER_ID >=", value, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdLessThan(String value) {
       addCriterion("CREATE_USER_ID <", value, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdLessThanOrEqualTo(String value) {
       addCriterion("CREATE_USER_ID <=", value, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdLike(String value) {
       addCriterion("CREATE_USER_ID like", value, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdNotLike(String value) {
       addCriterion("CREATE_USER_ID not like", value, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdIn(List<String> values) {
       addCriterion("CREATE_USER_ID in", values, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdNotIn(List<String> values) {
       addCriterion("CREATE_USER_ID not in", values, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdBetween(String value1, String value2) {
       addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateUserIdNotBetween(String value1, String value2) {
       addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdIsNull() {
       addCriterion("CREATE_DEPT_ID is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdIsNotNull() {
       addCriterion("CREATE_DEPT_ID is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdEqualTo(Integer value) {
       addCriterion("CREATE_DEPT_ID =", value, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdNotEqualTo(Integer value) {
       addCriterion("CREATE_DEPT_ID <>", value, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdGreaterThan(Integer value) {
       addCriterion("CREATE_DEPT_ID >", value, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("CREATE_DEPT_ID >=", value, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdLessThan(Integer value) {
       addCriterion("CREATE_DEPT_ID <", value, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdLessThanOrEqualTo(Integer value) {
       addCriterion("CREATE_DEPT_ID <=", value, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdIn(List<Integer> values) {
       addCriterion("CREATE_DEPT_ID in", values, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdNotIn(List<Integer> values) {
       addCriterion("CREATE_DEPT_ID not in", values, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdBetween(Integer value1, Integer value2) {
       addCriterion("CREATE_DEPT_ID between", value1, value2, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andCreateDeptIdNotBetween(Integer value1, Integer value2) {
       addCriterion("CREATE_DEPT_ID not between", value1, value2, "createDeptId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanIsNull() {
       addCriterion("QUIT_TIME_PLAN is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanIsNotNull() {
       addCriterion("QUIT_TIME_PLAN is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN =", value, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN <>", value, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN >", value, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN >=", value, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanLessThan(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN <", value, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN <=", value, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN in", values, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN not in", values, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN between", value1, value2, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimePlanNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("QUIT_TIME_PLAN not between", value1, value2, "quitTimePlan");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeIsNull() {
       addCriterion("QUIT_TYPE is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeIsNotNull() {
       addCriterion("QUIT_TYPE is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeEqualTo(String value) {
       addCriterion("QUIT_TYPE =", value, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeNotEqualTo(String value) {
       addCriterion("QUIT_TYPE <>", value, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeGreaterThan(String value) {
       addCriterion("QUIT_TYPE >", value, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeGreaterThanOrEqualTo(String value) {
       addCriterion("QUIT_TYPE >=", value, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeLessThan(String value) {
       addCriterion("QUIT_TYPE <", value, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeLessThanOrEqualTo(String value) {
       addCriterion("QUIT_TYPE <=", value, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeLike(String value) {
       addCriterion("QUIT_TYPE like", value, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeNotLike(String value) {
       addCriterion("QUIT_TYPE not like", value, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeIn(List<String> values) {
       addCriterion("QUIT_TYPE in", values, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeNotIn(List<String> values) {
       addCriterion("QUIT_TYPE not in", values, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeBetween(String value1, String value2) {
       addCriterion("QUIT_TYPE between", value1, value2, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTypeNotBetween(String value1, String value2) {
       addCriterion("QUIT_TYPE not between", value1, value2, "quitType");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeIsNull() {
       addCriterion("LAST_SALARY_TIME is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeIsNotNull() {
       addCriterion("LAST_SALARY_TIME is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("LAST_SALARY_TIME =", value, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("LAST_SALARY_TIME <>", value, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("LAST_SALARY_TIME >", value, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("LAST_SALARY_TIME >=", value, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeLessThan(java.util.Date value) {
       addCriterionForJDBCDate("LAST_SALARY_TIME <", value, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("LAST_SALARY_TIME <=", value, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("LAST_SALARY_TIME in", values, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("LAST_SALARY_TIME not in", values, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("LAST_SALARY_TIME between", value1, value2, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastSalaryTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("LAST_SALARY_TIME not between", value1, value2, "lastSalaryTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactIsNull() {
       addCriterion("QUIT_TIME_FACT is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactIsNotNull() {
       addCriterion("QUIT_TIME_FACT is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_FACT =", value, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_FACT <>", value, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_FACT >", value, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_FACT >=", value, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactLessThan(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_FACT <", value, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("QUIT_TIME_FACT <=", value, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("QUIT_TIME_FACT in", values, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("QUIT_TIME_FACT not in", values, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("QUIT_TIME_FACT between", value1, value2, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andQuitTimeFactNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("QUIT_TIME_FACT not between", value1, value2, "quitTimeFact");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonIsNull() {
       addCriterion("LEAVE_PERSON is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonIsNotNull() {
       addCriterion("LEAVE_PERSON is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonEqualTo(String value) {
       addCriterion("LEAVE_PERSON =", value, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonNotEqualTo(String value) {
       addCriterion("LEAVE_PERSON <>", value, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonGreaterThan(String value) {
       addCriterion("LEAVE_PERSON >", value, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonGreaterThanOrEqualTo(String value) {
       addCriterion("LEAVE_PERSON >=", value, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonLessThan(String value) {
       addCriterion("LEAVE_PERSON <", value, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonLessThanOrEqualTo(String value) {
       addCriterion("LEAVE_PERSON <=", value, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonLike(String value) {
       addCriterion("LEAVE_PERSON like", value, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonNotLike(String value) {
       addCriterion("LEAVE_PERSON not like", value, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonIn(List<String> values) {
       addCriterion("LEAVE_PERSON in", values, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonNotIn(List<String> values) {
       addCriterion("LEAVE_PERSON not in", values, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonBetween(String value1, String value2) {
       addCriterion("LEAVE_PERSON between", value1, value2, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeavePersonNotBetween(String value1, String value2) {
       addCriterion("LEAVE_PERSON not between", value1, value2, "leavePerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonIsNull() {
       addCriterion("DESPACHO_PERSON is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonIsNotNull() {
       addCriterion("DESPACHO_PERSON is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonEqualTo(String value) {
       addCriterion("DESPACHO_PERSON =", value, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonNotEqualTo(String value) {
       addCriterion("DESPACHO_PERSON <>", value, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonGreaterThan(String value) {
       addCriterion("DESPACHO_PERSON >", value, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonGreaterThanOrEqualTo(String value) {
       addCriterion("DESPACHO_PERSON >=", value, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonLessThan(String value) {
       addCriterion("DESPACHO_PERSON <", value, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonLessThanOrEqualTo(String value) {
       addCriterion("DESPACHO_PERSON <=", value, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonLike(String value) {
       addCriterion("DESPACHO_PERSON like", value, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonNotLike(String value) {
       addCriterion("DESPACHO_PERSON not like", value, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonIn(List<String> values) {
       addCriterion("DESPACHO_PERSON in", values, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonNotIn(List<String> values) {
       addCriterion("DESPACHO_PERSON not in", values, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonBetween(String value1, String value2) {
       addCriterion("DESPACHO_PERSON between", value1, value2, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andDespachoPersonNotBetween(String value1, String value2) {
       addCriterion("DESPACHO_PERSON not between", value1, value2, "despachoPerson");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionIsNull() {
       addCriterion("POSITION is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionIsNotNull() {
       addCriterion("POSITION is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionEqualTo(String value) {
       addCriterion("POSITION =", value, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionNotEqualTo(String value) {
       addCriterion("POSITION <>", value, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionGreaterThan(String value) {
       addCriterion("POSITION >", value, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionGreaterThanOrEqualTo(String value) {
       addCriterion("POSITION >=", value, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionLessThan(String value) {
       addCriterion("POSITION <", value, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionLessThanOrEqualTo(String value) {
       addCriterion("POSITION <=", value, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionLike(String value) {
       addCriterion("POSITION like", value, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionNotLike(String value) {
       addCriterion("POSITION not like", value, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionIn(List<String> values) {
       addCriterion("POSITION in", values, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionNotIn(List<String> values) {
       addCriterion("POSITION not in", values, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionBetween(String value1, String value2) {
       addCriterion("POSITION between", value1, value2, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andPositionNotBetween(String value1, String value2) {
       addCriterion("POSITION not between", value1, value2, "position");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeIsNull() {
       addCriterion("ADD_TIME is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeIsNotNull() {
       addCriterion("ADD_TIME is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME =", value, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeNotEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME <>", value, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeGreaterThan(java.util.Date value) {
       addCriterion("ADD_TIME >", value, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME >=", value, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeLessThan(java.util.Date value) {
       addCriterion("ADD_TIME <", value, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("ADD_TIME <=", value, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeIn(List<java.util.Date> values) {
       addCriterion("ADD_TIME in", values, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeNotIn(List<java.util.Date> values) {
       addCriterion("ADD_TIME not in", values, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_TIME between", value1, value2, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("ADD_TIME not between", value1, value2, "addTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeIsNull() {
       addCriterion("LAST_UPDATE_TIME is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeIsNotNull() {
       addCriterion("LAST_UPDATE_TIME is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeEqualTo(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeNotEqualTo(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeGreaterThan(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeLessThan(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeLessThanOrEqualTo(java.util.Date value) {
       addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeIn(List<java.util.Date> values) {
       addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeNotIn(List<java.util.Date> values) {
       addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLastUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdIsNull() {
       addCriterion("ATTACHMENT_ID is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdIsNotNull() {
       addCriterion("ATTACHMENT_ID is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdEqualTo(String value) {
       addCriterion("ATTACHMENT_ID =", value, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdNotEqualTo(String value) {
       addCriterion("ATTACHMENT_ID <>", value, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdGreaterThan(String value) {
       addCriterion("ATTACHMENT_ID >", value, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdGreaterThanOrEqualTo(String value) {
       addCriterion("ATTACHMENT_ID >=", value, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdLessThan(String value) {
       addCriterion("ATTACHMENT_ID <", value, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdLessThanOrEqualTo(String value) {
       addCriterion("ATTACHMENT_ID <=", value, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdLike(String value) {
       addCriterion("ATTACHMENT_ID like", value, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdNotLike(String value) {
       addCriterion("ATTACHMENT_ID not like", value, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdIn(List<String> values) {
       addCriterion("ATTACHMENT_ID in", values, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdNotIn(List<String> values) {
       addCriterion("ATTACHMENT_ID not in", values, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdBetween(String value1, String value2) {
       addCriterion("ATTACHMENT_ID between", value1, value2, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentIdNotBetween(String value1, String value2) {
       addCriterion("ATTACHMENT_ID not between", value1, value2, "attachmentId");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameIsNull() {
       addCriterion("ATTACHMENT_NAME is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameIsNotNull() {
       addCriterion("ATTACHMENT_NAME is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameEqualTo(String value) {
       addCriterion("ATTACHMENT_NAME =", value, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameNotEqualTo(String value) {
       addCriterion("ATTACHMENT_NAME <>", value, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameGreaterThan(String value) {
       addCriterion("ATTACHMENT_NAME >", value, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameGreaterThanOrEqualTo(String value) {
       addCriterion("ATTACHMENT_NAME >=", value, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameLessThan(String value) {
       addCriterion("ATTACHMENT_NAME <", value, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameLessThanOrEqualTo(String value) {
       addCriterion("ATTACHMENT_NAME <=", value, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameLike(String value) {
       addCriterion("ATTACHMENT_NAME like", value, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameNotLike(String value) {
       addCriterion("ATTACHMENT_NAME not like", value, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameIn(List<String> values) {
       addCriterion("ATTACHMENT_NAME in", values, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameNotIn(List<String> values) {
       addCriterion("ATTACHMENT_NAME not in", values, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameBetween(String value1, String value2) {
       addCriterion("ATTACHMENT_NAME between", value1, value2, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andAttachmentNameNotBetween(String value1, String value2) {
       addCriterion("ATTACHMENT_NAME not between", value1, value2, "attachmentName");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateIsNull() {
       addCriterion("APPLICATION_DATE is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateIsNotNull() {
       addCriterion("APPLICATION_DATE is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("APPLICATION_DATE =", value, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateNotEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("APPLICATION_DATE <>", value, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateGreaterThan(java.util.Date value) {
       addCriterionForJDBCDate("APPLICATION_DATE >", value, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateGreaterThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("APPLICATION_DATE >=", value, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateLessThan(java.util.Date value) {
       addCriterionForJDBCDate("APPLICATION_DATE <", value, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateLessThanOrEqualTo(java.util.Date value) {
       addCriterionForJDBCDate("APPLICATION_DATE <=", value, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("APPLICATION_DATE in", values, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateNotIn(List<java.util.Date> values) {
       addCriterionForJDBCDate("APPLICATION_DATE not in", values, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("APPLICATION_DATE between", value1, value2, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andApplicationDateNotBetween(java.util.Date value1, java.util.Date value2) {
       addCriterionForJDBCDate("APPLICATION_DATE not between", value1, value2, "applicationDate");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptIsNull() {
       addCriterion("LEAVE_DEPT is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptIsNotNull() {
       addCriterion("LEAVE_DEPT is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptEqualTo(String value) {
       addCriterion("LEAVE_DEPT =", value, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptNotEqualTo(String value) {
       addCriterion("LEAVE_DEPT <>", value, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptGreaterThan(String value) {
       addCriterion("LEAVE_DEPT >", value, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptGreaterThanOrEqualTo(String value) {
       addCriterion("LEAVE_DEPT >=", value, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptLessThan(String value) {
       addCriterion("LEAVE_DEPT <", value, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptLessThanOrEqualTo(String value) {
       addCriterion("LEAVE_DEPT <=", value, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptLike(String value) {
       addCriterion("LEAVE_DEPT like", value, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptNotLike(String value) {
       addCriterion("LEAVE_DEPT not like", value, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptIn(List<String> values) {
       addCriterion("LEAVE_DEPT in", values, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptNotIn(List<String> values) {
       addCriterion("LEAVE_DEPT not in", values, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptBetween(String value1, String value2) {
       addCriterion("LEAVE_DEPT between", value1, value2, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andLeaveDeptNotBetween(String value1, String value2) {
       addCriterion("LEAVE_DEPT not between", value1, value2, "leaveDept");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementIsNull() {
       addCriterion("IS_REINSTATEMENT is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementIsNotNull() {
       addCriterion("IS_REINSTATEMENT is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementEqualTo(Integer value) {
       addCriterion("IS_REINSTATEMENT =", value, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementNotEqualTo(Integer value) {
       addCriterion("IS_REINSTATEMENT <>", value, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementGreaterThan(Integer value) {
       addCriterion("IS_REINSTATEMENT >", value, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementGreaterThanOrEqualTo(Integer value) {
       addCriterion("IS_REINSTATEMENT >=", value, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementLessThan(Integer value) {
       addCriterion("IS_REINSTATEMENT <", value, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementLessThanOrEqualTo(Integer value) {
       addCriterion("IS_REINSTATEMENT <=", value, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementIn(List<Integer> values) {
       addCriterion("IS_REINSTATEMENT in", values, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementNotIn(List<Integer> values) {
       addCriterion("IS_REINSTATEMENT not in", values, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementBetween(Integer value1, Integer value2) {
       addCriterion("IS_REINSTATEMENT between", value1, value2, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsReinstatementNotBetween(Integer value1, Integer value2) {
       addCriterion("IS_REINSTATEMENT not between", value1, value2, "isReinstatement");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryIsNull() {
       addCriterion("SALARY is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryIsNotNull() {
       addCriterion("SALARY is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryEqualTo(Integer value) {
       addCriterion("SALARY =", value, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryNotEqualTo(Integer value) {
       addCriterion("SALARY <>", value, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryGreaterThan(Integer value) {
       addCriterion("SALARY >", value, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
       addCriterion("SALARY >=", value, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryLessThan(Integer value) {
       addCriterion("SALARY <", value, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryLessThanOrEqualTo(Integer value) {
       addCriterion("SALARY <=", value, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryIn(List<Integer> values) {
       addCriterion("SALARY in", values, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryNotIn(List<Integer> values) {
       addCriterion("SALARY not in", values, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryBetween(Integer value1, Integer value2) {
       addCriterion("SALARY between", value1, value2, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andSalaryNotBetween(Integer value1, Integer value2) {
       addCriterion("SALARY not between", value1, value2, "salary");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoIsNull() {
       addCriterion("STAFF_CARD_NO is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoIsNotNull() {
       addCriterion("STAFF_CARD_NO is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoEqualTo(String value) {
       addCriterion("STAFF_CARD_NO =", value, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoNotEqualTo(String value) {
       addCriterion("STAFF_CARD_NO <>", value, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoGreaterThan(String value) {
       addCriterion("STAFF_CARD_NO >", value, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoGreaterThanOrEqualTo(String value) {
       addCriterion("STAFF_CARD_NO >=", value, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoLessThan(String value) {
       addCriterion("STAFF_CARD_NO <", value, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoLessThanOrEqualTo(String value) {
       addCriterion("STAFF_CARD_NO <=", value, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoLike(String value) {
       addCriterion("STAFF_CARD_NO like", value, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoNotLike(String value) {
       addCriterion("STAFF_CARD_NO not like", value, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoIn(List<String> values) {
       addCriterion("STAFF_CARD_NO in", values, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoNotIn(List<String> values) {
       addCriterion("STAFF_CARD_NO not in", values, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoBetween(String value1, String value2) {
       addCriterion("STAFF_CARD_NO between", value1, value2, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andStaffCardNoNotBetween(String value1, String value2) {
       addCriterion("STAFF_CARD_NO not between", value1, value2, "staffCardNo");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistIsNull() {
       addCriterion("IS_BLACKLIST is null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistIsNotNull() {
       addCriterion("IS_BLACKLIST is not null");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistEqualTo(Boolean value) {
       addCriterion("IS_BLACKLIST =", value, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistNotEqualTo(Boolean value) {
       addCriterion("IS_BLACKLIST <>", value, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistGreaterThan(Boolean value) {
       addCriterion("IS_BLACKLIST >", value, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistGreaterThanOrEqualTo(Boolean value) {
       addCriterion("IS_BLACKLIST >=", value, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistLessThan(Boolean value) {
       addCriterion("IS_BLACKLIST <", value, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistLessThanOrEqualTo(Boolean value) {
       addCriterion("IS_BLACKLIST <=", value, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistIn(List<Boolean> values) {
       addCriterion("IS_BLACKLIST in", values, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistNotIn(List<Boolean> values) {
       addCriterion("IS_BLACKLIST not in", values, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistBetween(Boolean value1, Boolean value2) {
       addCriterion("IS_BLACKLIST between", value1, value2, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
 
     public HrStaffLeaveExample.Criteria andIsBlacklistNotBetween(Boolean value1, Boolean value2) {
       addCriterion("IS_BLACKLIST not between", value1, value2, "isBlacklist");
       return (HrStaffLeaveExample.Criteria)this;
     }
   }
 }
