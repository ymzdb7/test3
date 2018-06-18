 package com.myoa.model.hr;
 
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.List;
 
 public class HrInsuranceParaExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public HrInsuranceParaExample()
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
 
   public static class Criteria extends HrInsuranceParaExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<HrInsuranceParaExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<HrInsuranceParaExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<HrInsuranceParaExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new HrInsuranceParaExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new HrInsuranceParaExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new HrInsuranceParaExample.Criterion(condition, value1, value2));
     }
 
     public HrInsuranceParaExample.Criteria andParaIdIsNull() {
       addCriterion("PARA_ID is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdIsNotNull() {
       addCriterion("PARA_ID is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdEqualTo(Integer value) {
       addCriterion("PARA_ID =", value, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdNotEqualTo(Integer value) {
       addCriterion("PARA_ID <>", value, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdGreaterThan(Integer value) {
       addCriterion("PARA_ID >", value, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("PARA_ID >=", value, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdLessThan(Integer value) {
       addCriterion("PARA_ID <", value, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdLessThanOrEqualTo(Integer value) {
       addCriterion("PARA_ID <=", value, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdIn(List<Integer> values) {
       addCriterion("PARA_ID in", values, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdNotIn(List<Integer> values) {
       addCriterion("PARA_ID not in", values, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdBetween(Integer value1, Integer value2) {
       addCriterion("PARA_ID between", value1, value2, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andParaIdNotBetween(Integer value1, Integer value2) {
       addCriterion("PARA_ID not between", value1, value2, "paraId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdIsNull() {
       addCriterion("CREATE_USER_ID is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdIsNotNull() {
       addCriterion("CREATE_USER_ID is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdEqualTo(String value) {
       addCriterion("CREATE_USER_ID =", value, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdNotEqualTo(String value) {
       addCriterion("CREATE_USER_ID <>", value, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdGreaterThan(String value) {
       addCriterion("CREATE_USER_ID >", value, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
       addCriterion("CREATE_USER_ID >=", value, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdLessThan(String value) {
       addCriterion("CREATE_USER_ID <", value, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdLessThanOrEqualTo(String value) {
       addCriterion("CREATE_USER_ID <=", value, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdLike(String value) {
       addCriterion("CREATE_USER_ID like", value, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdNotLike(String value) {
       addCriterion("CREATE_USER_ID not like", value, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdIn(List<String> values) {
       addCriterion("CREATE_USER_ID in", values, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdNotIn(List<String> values) {
       addCriterion("CREATE_USER_ID not in", values, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdBetween(String value1, String value2) {
       addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateUserIdNotBetween(String value1, String value2) {
       addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdIsNull() {
       addCriterion("CREATE_DEPT_ID is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdIsNotNull() {
       addCriterion("CREATE_DEPT_ID is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdEqualTo(String value) {
       addCriterion("CREATE_DEPT_ID =", value, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdNotEqualTo(String value) {
       addCriterion("CREATE_DEPT_ID <>", value, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdGreaterThan(String value) {
       addCriterion("CREATE_DEPT_ID >", value, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdGreaterThanOrEqualTo(String value) {
       addCriterion("CREATE_DEPT_ID >=", value, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdLessThan(String value) {
       addCriterion("CREATE_DEPT_ID <", value, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdLessThanOrEqualTo(String value) {
       addCriterion("CREATE_DEPT_ID <=", value, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdLike(String value) {
       addCriterion("CREATE_DEPT_ID like", value, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdNotLike(String value) {
       addCriterion("CREATE_DEPT_ID not like", value, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdIn(List<String> values) {
       addCriterion("CREATE_DEPT_ID in", values, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdNotIn(List<String> values) {
       addCriterion("CREATE_DEPT_ID not in", values, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdBetween(String value1, String value2) {
       addCriterion("CREATE_DEPT_ID between", value1, value2, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andCreateDeptIdNotBetween(String value1, String value2) {
       addCriterion("CREATE_DEPT_ID not between", value1, value2, "createDeptId");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeIsNull() {
       addCriterion("HR_STAFF_TYPE is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeIsNotNull() {
       addCriterion("HR_STAFF_TYPE is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeEqualTo(String value) {
       addCriterion("HR_STAFF_TYPE =", value, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeNotEqualTo(String value) {
       addCriterion("HR_STAFF_TYPE <>", value, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeGreaterThan(String value) {
       addCriterion("HR_STAFF_TYPE >", value, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeGreaterThanOrEqualTo(String value) {
       addCriterion("HR_STAFF_TYPE >=", value, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeLessThan(String value) {
       addCriterion("HR_STAFF_TYPE <", value, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeLessThanOrEqualTo(String value) {
       addCriterion("HR_STAFF_TYPE <=", value, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeLike(String value) {
       addCriterion("HR_STAFF_TYPE like", value, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeNotLike(String value) {
       addCriterion("HR_STAFF_TYPE not like", value, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeIn(List<String> values) {
       addCriterion("HR_STAFF_TYPE in", values, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeNotIn(List<String> values) {
       addCriterion("HR_STAFF_TYPE not in", values, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeBetween(String value1, String value2) {
       addCriterion("HR_STAFF_TYPE between", value1, value2, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHrStaffTypeNotBetween(String value1, String value2) {
       addCriterion("HR_STAFF_TYPE not between", value1, value2, "hrStaffType");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayIsNull() {
       addCriterion("PENSION_U_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayIsNotNull() {
       addCriterion("PENSION_U_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayEqualTo(BigDecimal value) {
       addCriterion("PENSION_U_PAY =", value, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayNotEqualTo(BigDecimal value) {
       addCriterion("PENSION_U_PAY <>", value, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayGreaterThan(BigDecimal value) {
       addCriterion("PENSION_U_PAY >", value, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("PENSION_U_PAY >=", value, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayLessThan(BigDecimal value) {
       addCriterion("PENSION_U_PAY <", value, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("PENSION_U_PAY <=", value, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayIn(List<BigDecimal> values) {
       addCriterion("PENSION_U_PAY in", values, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayNotIn(List<BigDecimal> values) {
       addCriterion("PENSION_U_PAY not in", values, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PENSION_U_PAY between", value1, value2, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PENSION_U_PAY not between", value1, value2, "pensionUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddIsNull() {
       addCriterion("PENSION_U_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddIsNotNull() {
       addCriterion("PENSION_U_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddEqualTo(BigDecimal value) {
       addCriterion("PENSION_U_PAY_ADD =", value, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddNotEqualTo(BigDecimal value) {
       addCriterion("PENSION_U_PAY_ADD <>", value, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddGreaterThan(BigDecimal value) {
       addCriterion("PENSION_U_PAY_ADD >", value, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("PENSION_U_PAY_ADD >=", value, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddLessThan(BigDecimal value) {
       addCriterion("PENSION_U_PAY_ADD <", value, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("PENSION_U_PAY_ADD <=", value, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddIn(List<BigDecimal> values) {
       addCriterion("PENSION_U_PAY_ADD in", values, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddNotIn(List<BigDecimal> values) {
       addCriterion("PENSION_U_PAY_ADD not in", values, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PENSION_U_PAY_ADD between", value1, value2, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionUPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PENSION_U_PAY_ADD not between", value1, value2, "pensionUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayIsNull() {
       addCriterion("PENSION_P_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayIsNotNull() {
       addCriterion("PENSION_P_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayEqualTo(BigDecimal value) {
       addCriterion("PENSION_P_PAY =", value, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayNotEqualTo(BigDecimal value) {
       addCriterion("PENSION_P_PAY <>", value, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayGreaterThan(BigDecimal value) {
       addCriterion("PENSION_P_PAY >", value, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("PENSION_P_PAY >=", value, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayLessThan(BigDecimal value) {
       addCriterion("PENSION_P_PAY <", value, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("PENSION_P_PAY <=", value, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayIn(List<BigDecimal> values) {
       addCriterion("PENSION_P_PAY in", values, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayNotIn(List<BigDecimal> values) {
       addCriterion("PENSION_P_PAY not in", values, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PENSION_P_PAY between", value1, value2, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PENSION_P_PAY not between", value1, value2, "pensionPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddIsNull() {
       addCriterion("PENSION_P_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddIsNotNull() {
       addCriterion("PENSION_P_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddEqualTo(BigDecimal value) {
       addCriterion("PENSION_P_PAY_ADD =", value, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddNotEqualTo(BigDecimal value) {
       addCriterion("PENSION_P_PAY_ADD <>", value, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddGreaterThan(BigDecimal value) {
       addCriterion("PENSION_P_PAY_ADD >", value, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("PENSION_P_PAY_ADD >=", value, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddLessThan(BigDecimal value) {
       addCriterion("PENSION_P_PAY_ADD <", value, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("PENSION_P_PAY_ADD <=", value, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddIn(List<BigDecimal> values) {
       addCriterion("PENSION_P_PAY_ADD in", values, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddNotIn(List<BigDecimal> values) {
       addCriterion("PENSION_P_PAY_ADD not in", values, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PENSION_P_PAY_ADD between", value1, value2, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andPensionPPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("PENSION_P_PAY_ADD not between", value1, value2, "pensionPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayIsNull() {
       addCriterion("HEALTH_P_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayIsNotNull() {
       addCriterion("HEALTH_P_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayEqualTo(BigDecimal value) {
       addCriterion("HEALTH_P_PAY =", value, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayNotEqualTo(BigDecimal value) {
       addCriterion("HEALTH_P_PAY <>", value, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayGreaterThan(BigDecimal value) {
       addCriterion("HEALTH_P_PAY >", value, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("HEALTH_P_PAY >=", value, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayLessThan(BigDecimal value) {
       addCriterion("HEALTH_P_PAY <", value, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("HEALTH_P_PAY <=", value, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayIn(List<BigDecimal> values) {
       addCriterion("HEALTH_P_PAY in", values, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayNotIn(List<BigDecimal> values) {
       addCriterion("HEALTH_P_PAY not in", values, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HEALTH_P_PAY between", value1, value2, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HEALTH_P_PAY not between", value1, value2, "healthPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddIsNull() {
       addCriterion("HEALTH_P_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddIsNotNull() {
       addCriterion("HEALTH_P_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddEqualTo(BigDecimal value) {
       addCriterion("HEALTH_P_PAY_ADD =", value, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddNotEqualTo(BigDecimal value) {
       addCriterion("HEALTH_P_PAY_ADD <>", value, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddGreaterThan(BigDecimal value) {
       addCriterion("HEALTH_P_PAY_ADD >", value, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("HEALTH_P_PAY_ADD >=", value, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddLessThan(BigDecimal value) {
       addCriterion("HEALTH_P_PAY_ADD <", value, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("HEALTH_P_PAY_ADD <=", value, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddIn(List<BigDecimal> values) {
       addCriterion("HEALTH_P_PAY_ADD in", values, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddNotIn(List<BigDecimal> values) {
       addCriterion("HEALTH_P_PAY_ADD not in", values, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HEALTH_P_PAY_ADD between", value1, value2, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthPPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HEALTH_P_PAY_ADD not between", value1, value2, "healthPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayIsNull() {
       addCriterion("HEALTH_U_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayIsNotNull() {
       addCriterion("HEALTH_U_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayEqualTo(BigDecimal value) {
       addCriterion("HEALTH_U_PAY =", value, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayNotEqualTo(BigDecimal value) {
       addCriterion("HEALTH_U_PAY <>", value, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayGreaterThan(BigDecimal value) {
       addCriterion("HEALTH_U_PAY >", value, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("HEALTH_U_PAY >=", value, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayLessThan(BigDecimal value) {
       addCriterion("HEALTH_U_PAY <", value, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("HEALTH_U_PAY <=", value, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayIn(List<BigDecimal> values) {
       addCriterion("HEALTH_U_PAY in", values, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayNotIn(List<BigDecimal> values) {
       addCriterion("HEALTH_U_PAY not in", values, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HEALTH_U_PAY between", value1, value2, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HEALTH_U_PAY not between", value1, value2, "healthUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddIsNull() {
       addCriterion("HEALTH_U_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddIsNotNull() {
       addCriterion("HEALTH_U_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddEqualTo(BigDecimal value) {
       addCriterion("HEALTH_U_PAY_ADD =", value, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddNotEqualTo(BigDecimal value) {
       addCriterion("HEALTH_U_PAY_ADD <>", value, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddGreaterThan(BigDecimal value) {
       addCriterion("HEALTH_U_PAY_ADD >", value, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("HEALTH_U_PAY_ADD >=", value, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddLessThan(BigDecimal value) {
       addCriterion("HEALTH_U_PAY_ADD <", value, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("HEALTH_U_PAY_ADD <=", value, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddIn(List<BigDecimal> values) {
       addCriterion("HEALTH_U_PAY_ADD in", values, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddNotIn(List<BigDecimal> values) {
       addCriterion("HEALTH_U_PAY_ADD not in", values, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HEALTH_U_PAY_ADD between", value1, value2, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHealthUPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HEALTH_U_PAY_ADD not between", value1, value2, "healthUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayIsNull() {
       addCriterion("UNEMPLOYMENT_P_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayIsNotNull() {
       addCriterion("UNEMPLOYMENT_P_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY =", value, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayNotEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY <>", value, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayGreaterThan(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY >", value, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY >=", value, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayLessThan(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY <", value, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY <=", value, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayIn(List<BigDecimal> values) {
       addCriterion("UNEMPLOYMENT_P_PAY in", values, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayNotIn(List<BigDecimal> values) {
       addCriterion("UNEMPLOYMENT_P_PAY not in", values, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("UNEMPLOYMENT_P_PAY between", value1, value2, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("UNEMPLOYMENT_P_PAY not between", value1, value2, "unemploymentPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddIsNull() {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddIsNotNull() {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD =", value, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddNotEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD <>", value, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddGreaterThan(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD >", value, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD >=", value, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddLessThan(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD <", value, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD <=", value, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddIn(List<BigDecimal> values) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD in", values, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddNotIn(List<BigDecimal> values) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD not in", values, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD between", value1, value2, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentPPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("UNEMPLOYMENT_P_PAY_ADD not between", value1, value2, "unemploymentPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayIsNull() {
       addCriterion("UNEMPLOYMENT_U_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayIsNotNull() {
       addCriterion("UNEMPLOYMENT_U_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY =", value, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayNotEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY <>", value, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayGreaterThan(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY >", value, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY >=", value, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayLessThan(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY <", value, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY <=", value, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayIn(List<BigDecimal> values) {
       addCriterion("UNEMPLOYMENT_U_PAY in", values, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayNotIn(List<BigDecimal> values) {
       addCriterion("UNEMPLOYMENT_U_PAY not in", values, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("UNEMPLOYMENT_U_PAY between", value1, value2, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("UNEMPLOYMENT_U_PAY not between", value1, value2, "unemploymentUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddIsNull() {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddIsNotNull() {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD =", value, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddNotEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD <>", value, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddGreaterThan(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD >", value, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD >=", value, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddLessThan(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD <", value, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD <=", value, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddIn(List<BigDecimal> values) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD in", values, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddNotIn(List<BigDecimal> values) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD not in", values, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD between", value1, value2, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andUnemploymentUPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("UNEMPLOYMENT_U_PAY_ADD not between", value1, value2, "unemploymentUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayIsNull() {
       addCriterion("HOUSING_P_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayIsNotNull() {
       addCriterion("HOUSING_P_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayEqualTo(BigDecimal value) {
       addCriterion("HOUSING_P_PAY =", value, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayNotEqualTo(BigDecimal value) {
       addCriterion("HOUSING_P_PAY <>", value, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayGreaterThan(BigDecimal value) {
       addCriterion("HOUSING_P_PAY >", value, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("HOUSING_P_PAY >=", value, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayLessThan(BigDecimal value) {
       addCriterion("HOUSING_P_PAY <", value, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("HOUSING_P_PAY <=", value, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayIn(List<BigDecimal> values) {
       addCriterion("HOUSING_P_PAY in", values, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayNotIn(List<BigDecimal> values) {
       addCriterion("HOUSING_P_PAY not in", values, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HOUSING_P_PAY between", value1, value2, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HOUSING_P_PAY not between", value1, value2, "housingPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddIsNull() {
       addCriterion("HOUSING_P_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddIsNotNull() {
       addCriterion("HOUSING_P_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddEqualTo(BigDecimal value) {
       addCriterion("HOUSING_P_PAY_ADD =", value, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddNotEqualTo(BigDecimal value) {
       addCriterion("HOUSING_P_PAY_ADD <>", value, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddGreaterThan(BigDecimal value) {
       addCriterion("HOUSING_P_PAY_ADD >", value, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("HOUSING_P_PAY_ADD >=", value, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddLessThan(BigDecimal value) {
       addCriterion("HOUSING_P_PAY_ADD <", value, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("HOUSING_P_PAY_ADD <=", value, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddIn(List<BigDecimal> values) {
       addCriterion("HOUSING_P_PAY_ADD in", values, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddNotIn(List<BigDecimal> values) {
       addCriterion("HOUSING_P_PAY_ADD not in", values, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HOUSING_P_PAY_ADD between", value1, value2, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingPPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HOUSING_P_PAY_ADD not between", value1, value2, "housingPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayIsNull() {
       addCriterion("HOUSING_U_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayIsNotNull() {
       addCriterion("HOUSING_U_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayEqualTo(BigDecimal value) {
       addCriterion("HOUSING_U_PAY =", value, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayNotEqualTo(BigDecimal value) {
       addCriterion("HOUSING_U_PAY <>", value, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayGreaterThan(BigDecimal value) {
       addCriterion("HOUSING_U_PAY >", value, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("HOUSING_U_PAY >=", value, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayLessThan(BigDecimal value) {
       addCriterion("HOUSING_U_PAY <", value, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("HOUSING_U_PAY <=", value, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayIn(List<BigDecimal> values) {
       addCriterion("HOUSING_U_PAY in", values, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayNotIn(List<BigDecimal> values) {
       addCriterion("HOUSING_U_PAY not in", values, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HOUSING_U_PAY between", value1, value2, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HOUSING_U_PAY not between", value1, value2, "housingUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddIsNull() {
       addCriterion("HOUSING_U_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddIsNotNull() {
       addCriterion("HOUSING_U_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddEqualTo(BigDecimal value) {
       addCriterion("HOUSING_U_PAY_ADD =", value, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddNotEqualTo(BigDecimal value) {
       addCriterion("HOUSING_U_PAY_ADD <>", value, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddGreaterThan(BigDecimal value) {
       addCriterion("HOUSING_U_PAY_ADD >", value, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("HOUSING_U_PAY_ADD >=", value, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddLessThan(BigDecimal value) {
       addCriterion("HOUSING_U_PAY_ADD <", value, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("HOUSING_U_PAY_ADD <=", value, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddIn(List<BigDecimal> values) {
       addCriterion("HOUSING_U_PAY_ADD in", values, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddNotIn(List<BigDecimal> values) {
       addCriterion("HOUSING_U_PAY_ADD not in", values, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HOUSING_U_PAY_ADD between", value1, value2, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andHousingUPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("HOUSING_U_PAY_ADD not between", value1, value2, "housingUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayIsNull() {
       addCriterion("INJURY_U_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayIsNotNull() {
       addCriterion("INJURY_U_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayEqualTo(BigDecimal value) {
       addCriterion("INJURY_U_PAY =", value, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayNotEqualTo(BigDecimal value) {
       addCriterion("INJURY_U_PAY <>", value, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayGreaterThan(BigDecimal value) {
       addCriterion("INJURY_U_PAY >", value, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("INJURY_U_PAY >=", value, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayLessThan(BigDecimal value) {
       addCriterion("INJURY_U_PAY <", value, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("INJURY_U_PAY <=", value, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayIn(List<BigDecimal> values) {
       addCriterion("INJURY_U_PAY in", values, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayNotIn(List<BigDecimal> values) {
       addCriterion("INJURY_U_PAY not in", values, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("INJURY_U_PAY between", value1, value2, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("INJURY_U_PAY not between", value1, value2, "injuryUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddIsNull() {
       addCriterion("INJURY_U_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddIsNotNull() {
       addCriterion("INJURY_U_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddEqualTo(BigDecimal value) {
       addCriterion("INJURY_U_PAY_ADD =", value, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddNotEqualTo(BigDecimal value) {
       addCriterion("INJURY_U_PAY_ADD <>", value, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddGreaterThan(BigDecimal value) {
       addCriterion("INJURY_U_PAY_ADD >", value, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("INJURY_U_PAY_ADD >=", value, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddLessThan(BigDecimal value) {
       addCriterion("INJURY_U_PAY_ADD <", value, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("INJURY_U_PAY_ADD <=", value, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddIn(List<BigDecimal> values) {
       addCriterion("INJURY_U_PAY_ADD in", values, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddNotIn(List<BigDecimal> values) {
       addCriterion("INJURY_U_PAY_ADD not in", values, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("INJURY_U_PAY_ADD between", value1, value2, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryUPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("INJURY_U_PAY_ADD not between", value1, value2, "injuryUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayIsNull() {
       addCriterion("INJURY_P_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayIsNotNull() {
       addCriterion("INJURY_P_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayEqualTo(BigDecimal value) {
       addCriterion("INJURY_P_PAY =", value, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayNotEqualTo(BigDecimal value) {
       addCriterion("INJURY_P_PAY <>", value, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayGreaterThan(BigDecimal value) {
       addCriterion("INJURY_P_PAY >", value, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("INJURY_P_PAY >=", value, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayLessThan(BigDecimal value) {
       addCriterion("INJURY_P_PAY <", value, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("INJURY_P_PAY <=", value, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayIn(List<BigDecimal> values) {
       addCriterion("INJURY_P_PAY in", values, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayNotIn(List<BigDecimal> values) {
       addCriterion("INJURY_P_PAY not in", values, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("INJURY_P_PAY between", value1, value2, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("INJURY_P_PAY not between", value1, value2, "injuryPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddIsNull() {
       addCriterion("INJURY_P_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddIsNotNull() {
       addCriterion("INJURY_P_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddEqualTo(BigDecimal value) {
       addCriterion("INJURY_P_PAY_ADD =", value, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddNotEqualTo(BigDecimal value) {
       addCriterion("INJURY_P_PAY_ADD <>", value, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddGreaterThan(BigDecimal value) {
       addCriterion("INJURY_P_PAY_ADD >", value, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("INJURY_P_PAY_ADD >=", value, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddLessThan(BigDecimal value) {
       addCriterion("INJURY_P_PAY_ADD <", value, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("INJURY_P_PAY_ADD <=", value, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddIn(List<BigDecimal> values) {
       addCriterion("INJURY_P_PAY_ADD in", values, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddNotIn(List<BigDecimal> values) {
       addCriterion("INJURY_P_PAY_ADD not in", values, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("INJURY_P_PAY_ADD between", value1, value2, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andInjuryPPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("INJURY_P_PAY_ADD not between", value1, value2, "injuryPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayIsNull() {
       addCriterion("MATERNITY_U_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayIsNotNull() {
       addCriterion("MATERNITY_U_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY =", value, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayNotEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY <>", value, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayGreaterThan(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY >", value, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY >=", value, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayLessThan(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY <", value, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY <=", value, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayIn(List<BigDecimal> values) {
       addCriterion("MATERNITY_U_PAY in", values, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayNotIn(List<BigDecimal> values) {
       addCriterion("MATERNITY_U_PAY not in", values, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("MATERNITY_U_PAY between", value1, value2, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("MATERNITY_U_PAY not between", value1, value2, "maternityUPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddIsNull() {
       addCriterion("MATERNITY_U_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddIsNotNull() {
       addCriterion("MATERNITY_U_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY_ADD =", value, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddNotEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY_ADD <>", value, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddGreaterThan(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY_ADD >", value, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY_ADD >=", value, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddLessThan(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY_ADD <", value, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_U_PAY_ADD <=", value, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddIn(List<BigDecimal> values) {
       addCriterion("MATERNITY_U_PAY_ADD in", values, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddNotIn(List<BigDecimal> values) {
       addCriterion("MATERNITY_U_PAY_ADD not in", values, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("MATERNITY_U_PAY_ADD between", value1, value2, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityUPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("MATERNITY_U_PAY_ADD not between", value1, value2, "maternityUPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayIsNull() {
       addCriterion("MATERNITY_P_PAY is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayIsNotNull() {
       addCriterion("MATERNITY_P_PAY is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY =", value, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayNotEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY <>", value, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayGreaterThan(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY >", value, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY >=", value, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayLessThan(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY <", value, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayLessThanOrEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY <=", value, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayIn(List<BigDecimal> values) {
       addCriterion("MATERNITY_P_PAY in", values, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayNotIn(List<BigDecimal> values) {
       addCriterion("MATERNITY_P_PAY not in", values, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("MATERNITY_P_PAY between", value1, value2, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("MATERNITY_P_PAY not between", value1, value2, "maternityPPay");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddIsNull() {
       addCriterion("MATERNITY_P_PAY_ADD is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddIsNotNull() {
       addCriterion("MATERNITY_P_PAY_ADD is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY_ADD =", value, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddNotEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY_ADD <>", value, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddGreaterThan(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY_ADD >", value, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddGreaterThanOrEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY_ADD >=", value, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddLessThan(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY_ADD <", value, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddLessThanOrEqualTo(BigDecimal value) {
       addCriterion("MATERNITY_P_PAY_ADD <=", value, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddIn(List<BigDecimal> values) {
       addCriterion("MATERNITY_P_PAY_ADD in", values, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddNotIn(List<BigDecimal> values) {
       addCriterion("MATERNITY_P_PAY_ADD not in", values, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("MATERNITY_P_PAY_ADD between", value1, value2, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andMaternityPPayAddNotBetween(BigDecimal value1, BigDecimal value2) {
       addCriterion("MATERNITY_P_PAY_ADD not between", value1, value2, "maternityPPayAdd");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherIsNull() {
       addCriterion("YES_OTHER is null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherIsNotNull() {
       addCriterion("YES_OTHER is not null");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherEqualTo(String value) {
       addCriterion("YES_OTHER =", value, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherNotEqualTo(String value) {
       addCriterion("YES_OTHER <>", value, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherGreaterThan(String value) {
       addCriterion("YES_OTHER >", value, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherGreaterThanOrEqualTo(String value) {
       addCriterion("YES_OTHER >=", value, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherLessThan(String value) {
       addCriterion("YES_OTHER <", value, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherLessThanOrEqualTo(String value) {
       addCriterion("YES_OTHER <=", value, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherLike(String value) {
       addCriterion("YES_OTHER like", value, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherNotLike(String value) {
       addCriterion("YES_OTHER not like", value, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherIn(List<String> values) {
       addCriterion("YES_OTHER in", values, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherNotIn(List<String> values) {
       addCriterion("YES_OTHER not in", values, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherBetween(String value1, String value2) {
       addCriterion("YES_OTHER between", value1, value2, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
 
     public HrInsuranceParaExample.Criteria andYesOtherNotBetween(String value1, String value2) {
       addCriterion("YES_OTHER not between", value1, value2, "yesOther");
       return (HrInsuranceParaExample.Criteria)this;
     }
   }
 }

