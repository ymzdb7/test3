 package com.myoa.model.seal;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class SealJingeExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public SealJingeExample()
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
 
   public static class Criteria extends SealJingeExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<SealJingeExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<SealJingeExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<SealJingeExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new SealJingeExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new SealJingeExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new SealJingeExample.Criterion(condition, value1, value2));
     }
 
     public SealJingeExample.Criteria andSealIdIsNull() {
       addCriterion("SEAL_ID is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdIsNotNull() {
       addCriterion("SEAL_ID is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdEqualTo(Integer value) {
       addCriterion("SEAL_ID =", value, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdNotEqualTo(Integer value) {
       addCriterion("SEAL_ID <>", value, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdGreaterThan(Integer value) {
       addCriterion("SEAL_ID >", value, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("SEAL_ID >=", value, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdLessThan(Integer value) {
       addCriterion("SEAL_ID <", value, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdLessThanOrEqualTo(Integer value) {
       addCriterion("SEAL_ID <=", value, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdIn(List<Integer> values) {
       addCriterion("SEAL_ID in", values, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdNotIn(List<Integer> values) {
       addCriterion("SEAL_ID not in", values, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdBetween(Integer value1, Integer value2) {
       addCriterion("SEAL_ID between", value1, value2, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealIdNotBetween(Integer value1, Integer value2) {
       addCriterion("SEAL_ID not between", value1, value2, "sealId");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameIsNull() {
       addCriterion("SEAL_NAME is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameIsNotNull() {
       addCriterion("SEAL_NAME is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameEqualTo(String value) {
       addCriterion("SEAL_NAME =", value, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameNotEqualTo(String value) {
       addCriterion("SEAL_NAME <>", value, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameGreaterThan(String value) {
       addCriterion("SEAL_NAME >", value, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameGreaterThanOrEqualTo(String value) {
       addCriterion("SEAL_NAME >=", value, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameLessThan(String value) {
       addCriterion("SEAL_NAME <", value, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameLessThanOrEqualTo(String value) {
       addCriterion("SEAL_NAME <=", value, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameLike(String value) {
       addCriterion("SEAL_NAME like", value, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameNotLike(String value) {
       addCriterion("SEAL_NAME not like", value, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameIn(List<String> values) {
       addCriterion("SEAL_NAME in", values, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameNotIn(List<String> values) {
       addCriterion("SEAL_NAME not in", values, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameBetween(String value1, String value2) {
       addCriterion("SEAL_NAME between", value1, value2, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andSealNameNotBetween(String value1, String value2) {
       addCriterion("SEAL_NAME not between", value1, value2, "sealName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameIsNull() {
       addCriterion("UNIT_NAME is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameIsNotNull() {
       addCriterion("UNIT_NAME is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameEqualTo(String value) {
       addCriterion("UNIT_NAME =", value, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameNotEqualTo(String value) {
       addCriterion("UNIT_NAME <>", value, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameGreaterThan(String value) {
       addCriterion("UNIT_NAME >", value, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameGreaterThanOrEqualTo(String value) {
       addCriterion("UNIT_NAME >=", value, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameLessThan(String value) {
       addCriterion("UNIT_NAME <", value, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameLessThanOrEqualTo(String value) {
       addCriterion("UNIT_NAME <=", value, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameLike(String value) {
       addCriterion("UNIT_NAME like", value, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameNotLike(String value) {
       addCriterion("UNIT_NAME not like", value, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameIn(List<String> values) {
       addCriterion("UNIT_NAME in", values, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameNotIn(List<String> values) {
       addCriterion("UNIT_NAME not in", values, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameBetween(String value1, String value2) {
       addCriterion("UNIT_NAME between", value1, value2, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andUnitNameNotBetween(String value1, String value2) {
       addCriterion("UNIT_NAME not between", value1, value2, "unitName");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserIsNull() {
       addCriterion("CREATE_USER is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserIsNotNull() {
       addCriterion("CREATE_USER is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserEqualTo(String value) {
       addCriterion("CREATE_USER =", value, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserNotEqualTo(String value) {
       addCriterion("CREATE_USER <>", value, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserGreaterThan(String value) {
       addCriterion("CREATE_USER >", value, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserGreaterThanOrEqualTo(String value) {
       addCriterion("CREATE_USER >=", value, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserLessThan(String value) {
       addCriterion("CREATE_USER <", value, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserLessThanOrEqualTo(String value) {
       addCriterion("CREATE_USER <=", value, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserLike(String value) {
       addCriterion("CREATE_USER like", value, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserNotLike(String value) {
       addCriterion("CREATE_USER not like", value, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserIn(List<String> values) {
       addCriterion("CREATE_USER in", values, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserNotIn(List<String> values) {
       addCriterion("CREATE_USER not in", values, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserBetween(String value1, String value2) {
       addCriterion("CREATE_USER between", value1, value2, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateUserNotBetween(String value1, String value2) {
       addCriterion("CREATE_USER not between", value1, value2, "createUser");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeIsNull() {
       addCriterion("CREATE_TIME is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("CREATE_TIME is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeEqualTo(Date value) {
       addCriterion("CREATE_TIME =", value, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeNotEqualTo(Date value) {
       addCriterion("CREATE_TIME <>", value, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeGreaterThan(Date value) {
       addCriterion("CREATE_TIME >", value, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME >=", value, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeLessThan(Date value) {
       addCriterion("CREATE_TIME <", value, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME <=", value, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeIn(List<Date> values) {
       addCriterion("CREATE_TIME in", values, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeNotIn(List<Date> values) {
       addCriterion("CREATE_TIME not in", values, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME between", value1, value2, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME not between", value1, value2, "createTime");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1IsNull() {
       addCriterion("REMARK1 is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1IsNotNull() {
       addCriterion("REMARK1 is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1EqualTo(String value) {
       addCriterion("REMARK1 =", value, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1NotEqualTo(String value) {
       addCriterion("REMARK1 <>", value, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1GreaterThan(String value) {
       addCriterion("REMARK1 >", value, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK1 >=", value, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1LessThan(String value) {
       addCriterion("REMARK1 <", value, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1LessThanOrEqualTo(String value) {
       addCriterion("REMARK1 <=", value, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1Like(String value) {
       addCriterion("REMARK1 like", value, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1NotLike(String value) {
       addCriterion("REMARK1 not like", value, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1In(List<String> values) {
       addCriterion("REMARK1 in", values, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1NotIn(List<String> values) {
       addCriterion("REMARK1 not in", values, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1Between(String value1, String value2) {
       addCriterion("REMARK1 between", value1, value2, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark1NotBetween(String value1, String value2) {
       addCriterion("REMARK1 not between", value1, value2, "remark1");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2IsNull() {
       addCriterion("REMARK2 is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2IsNotNull() {
       addCriterion("REMARK2 is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2EqualTo(String value) {
       addCriterion("REMARK2 =", value, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2NotEqualTo(String value) {
       addCriterion("REMARK2 <>", value, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2GreaterThan(String value) {
       addCriterion("REMARK2 >", value, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK2 >=", value, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2LessThan(String value) {
       addCriterion("REMARK2 <", value, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2LessThanOrEqualTo(String value) {
       addCriterion("REMARK2 <=", value, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2Like(String value) {
       addCriterion("REMARK2 like", value, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2NotLike(String value) {
       addCriterion("REMARK2 not like", value, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2In(List<String> values) {
       addCriterion("REMARK2 in", values, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2NotIn(List<String> values) {
       addCriterion("REMARK2 not in", values, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2Between(String value1, String value2) {
       addCriterion("REMARK2 between", value1, value2, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark2NotBetween(String value1, String value2) {
       addCriterion("REMARK2 not between", value1, value2, "remark2");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3IsNull() {
       addCriterion("REMARK3 is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3IsNotNull() {
       addCriterion("REMARK3 is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3EqualTo(String value) {
       addCriterion("REMARK3 =", value, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3NotEqualTo(String value) {
       addCriterion("REMARK3 <>", value, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3GreaterThan(String value) {
       addCriterion("REMARK3 >", value, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK3 >=", value, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3LessThan(String value) {
       addCriterion("REMARK3 <", value, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3LessThanOrEqualTo(String value) {
       addCriterion("REMARK3 <=", value, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3Like(String value) {
       addCriterion("REMARK3 like", value, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3NotLike(String value) {
       addCriterion("REMARK3 not like", value, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3In(List<String> values) {
       addCriterion("REMARK3 in", values, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3NotIn(List<String> values) {
       addCriterion("REMARK3 not in", values, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3Between(String value1, String value2) {
       addCriterion("REMARK3 between", value1, value2, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark3NotBetween(String value1, String value2) {
       addCriterion("REMARK3 not between", value1, value2, "remark3");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4IsNull() {
       addCriterion("REMARK4 is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4IsNotNull() {
       addCriterion("REMARK4 is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4EqualTo(String value) {
       addCriterion("REMARK4 =", value, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4NotEqualTo(String value) {
       addCriterion("REMARK4 <>", value, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4GreaterThan(String value) {
       addCriterion("REMARK4 >", value, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK4 >=", value, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4LessThan(String value) {
       addCriterion("REMARK4 <", value, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4LessThanOrEqualTo(String value) {
       addCriterion("REMARK4 <=", value, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4Like(String value) {
       addCriterion("REMARK4 like", value, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4NotLike(String value) {
       addCriterion("REMARK4 not like", value, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4In(List<String> values) {
       addCriterion("REMARK4 in", values, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4NotIn(List<String> values) {
       addCriterion("REMARK4 not in", values, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4Between(String value1, String value2) {
       addCriterion("REMARK4 between", value1, value2, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark4NotBetween(String value1, String value2) {
       addCriterion("REMARK4 not between", value1, value2, "remark4");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5IsNull() {
       addCriterion("REMARK5 is null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5IsNotNull() {
       addCriterion("REMARK5 is not null");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5EqualTo(String value) {
       addCriterion("REMARK5 =", value, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5NotEqualTo(String value) {
       addCriterion("REMARK5 <>", value, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5GreaterThan(String value) {
       addCriterion("REMARK5 >", value, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK5 >=", value, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5LessThan(String value) {
       addCriterion("REMARK5 <", value, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5LessThanOrEqualTo(String value) {
       addCriterion("REMARK5 <=", value, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5Like(String value) {
       addCriterion("REMARK5 like", value, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5NotLike(String value) {
       addCriterion("REMARK5 not like", value, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5In(List<String> values) {
       addCriterion("REMARK5 in", values, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5NotIn(List<String> values) {
       addCriterion("REMARK5 not in", values, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5Between(String value1, String value2) {
       addCriterion("REMARK5 between", value1, value2, "remark5");
       return (SealJingeExample.Criteria)this;
     }
 
     public SealJingeExample.Criteria andRemark5NotBetween(String value1, String value2) {
       addCriterion("REMARK5 not between", value1, value2, "remark5");
       return (SealJingeExample.Criteria)this;
     }
   }
 }

