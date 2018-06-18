 package com.myoa.model.seal;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class SealJingeKeyExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public SealJingeKeyExample()
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
 
   public static class Criteria extends SealJingeKeyExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<SealJingeKeyExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<SealJingeKeyExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<SealJingeKeyExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new SealJingeKeyExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new SealJingeKeyExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new SealJingeKeyExample.Criterion(condition, value1, value2));
     }
 
     public SealJingeKeyExample.Criteria andKeyIdIsNull() {
       addCriterion("KEY_ID is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdIsNotNull() {
       addCriterion("KEY_ID is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdEqualTo(Integer value) {
       addCriterion("KEY_ID =", value, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdNotEqualTo(Integer value) {
       addCriterion("KEY_ID <>", value, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdGreaterThan(Integer value) {
       addCriterion("KEY_ID >", value, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("KEY_ID >=", value, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdLessThan(Integer value) {
       addCriterion("KEY_ID <", value, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdLessThanOrEqualTo(Integer value) {
       addCriterion("KEY_ID <=", value, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdIn(List<Integer> values) {
       addCriterion("KEY_ID in", values, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdNotIn(List<Integer> values) {
       addCriterion("KEY_ID not in", values, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdBetween(Integer value1, Integer value2) {
       addCriterion("KEY_ID between", value1, value2, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyIdNotBetween(Integer value1, Integer value2) {
       addCriterion("KEY_ID not between", value1, value2, "keyId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdIsNull() {
       addCriterion("SEAL_ID is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdIsNotNull() {
       addCriterion("SEAL_ID is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdEqualTo(Integer value) {
       addCriterion("SEAL_ID =", value, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdNotEqualTo(Integer value) {
       addCriterion("SEAL_ID <>", value, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdGreaterThan(Integer value) {
       addCriterion("SEAL_ID >", value, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("SEAL_ID >=", value, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdLessThan(Integer value) {
       addCriterion("SEAL_ID <", value, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdLessThanOrEqualTo(Integer value) {
       addCriterion("SEAL_ID <=", value, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdIn(List<Integer> values) {
       addCriterion("SEAL_ID in", values, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdNotIn(List<Integer> values) {
       addCriterion("SEAL_ID not in", values, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdBetween(Integer value1, Integer value2) {
       addCriterion("SEAL_ID between", value1, value2, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andSealIdNotBetween(Integer value1, Integer value2) {
       addCriterion("SEAL_ID not between", value1, value2, "sealId");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoIsNull() {
       addCriterion("KEY_NO is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoIsNotNull() {
       addCriterion("KEY_NO is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoEqualTo(String value) {
       addCriterion("KEY_NO =", value, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoNotEqualTo(String value) {
       addCriterion("KEY_NO <>", value, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoGreaterThan(String value) {
       addCriterion("KEY_NO >", value, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoGreaterThanOrEqualTo(String value) {
       addCriterion("KEY_NO >=", value, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoLessThan(String value) {
       addCriterion("KEY_NO <", value, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoLessThanOrEqualTo(String value) {
       addCriterion("KEY_NO <=", value, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoLike(String value) {
       addCriterion("KEY_NO like", value, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoNotLike(String value) {
       addCriterion("KEY_NO not like", value, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoIn(List<String> values) {
       addCriterion("KEY_NO in", values, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoNotIn(List<String> values) {
       addCriterion("KEY_NO not in", values, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoBetween(String value1, String value2) {
       addCriterion("KEY_NO between", value1, value2, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andKeyNoNotBetween(String value1, String value2) {
       addCriterion("KEY_NO not between", value1, value2, "keyNo");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrIsNull() {
       addCriterion("USER_ID_STR is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrIsNotNull() {
       addCriterion("USER_ID_STR is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrEqualTo(String value) {
       addCriterion("USER_ID_STR =", value, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrNotEqualTo(String value) {
       addCriterion("USER_ID_STR <>", value, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrGreaterThan(String value) {
       addCriterion("USER_ID_STR >", value, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrGreaterThanOrEqualTo(String value) {
       addCriterion("USER_ID_STR >=", value, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrLessThan(String value) {
       addCriterion("USER_ID_STR <", value, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrLessThanOrEqualTo(String value) {
       addCriterion("USER_ID_STR <=", value, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrLike(String value) {
       addCriterion("USER_ID_STR like", value, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrNotLike(String value) {
       addCriterion("USER_ID_STR not like", value, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrIn(List<String> values) {
       addCriterion("USER_ID_STR in", values, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrNotIn(List<String> values) {
       addCriterion("USER_ID_STR not in", values, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrBetween(String value1, String value2) {
       addCriterion("USER_ID_STR between", value1, value2, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andUserIdStrNotBetween(String value1, String value2) {
       addCriterion("USER_ID_STR not between", value1, value2, "userIdStr");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserIsNull() {
       addCriterion("CREATE_USER is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserIsNotNull() {
       addCriterion("CREATE_USER is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserEqualTo(String value) {
       addCriterion("CREATE_USER =", value, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserNotEqualTo(String value) {
       addCriterion("CREATE_USER <>", value, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserGreaterThan(String value) {
       addCriterion("CREATE_USER >", value, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserGreaterThanOrEqualTo(String value) {
       addCriterion("CREATE_USER >=", value, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserLessThan(String value) {
       addCriterion("CREATE_USER <", value, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserLessThanOrEqualTo(String value) {
       addCriterion("CREATE_USER <=", value, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserLike(String value) {
       addCriterion("CREATE_USER like", value, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserNotLike(String value) {
       addCriterion("CREATE_USER not like", value, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserIn(List<String> values) {
       addCriterion("CREATE_USER in", values, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserNotIn(List<String> values) {
       addCriterion("CREATE_USER not in", values, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserBetween(String value1, String value2) {
       addCriterion("CREATE_USER between", value1, value2, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateUserNotBetween(String value1, String value2) {
       addCriterion("CREATE_USER not between", value1, value2, "createUser");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeIsNull() {
       addCriterion("CREATE_TIME is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("CREATE_TIME is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeEqualTo(Date value) {
       addCriterion("CREATE_TIME =", value, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeNotEqualTo(Date value) {
       addCriterion("CREATE_TIME <>", value, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeGreaterThan(Date value) {
       addCriterion("CREATE_TIME >", value, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME >=", value, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeLessThan(Date value) {
       addCriterion("CREATE_TIME <", value, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME <=", value, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeIn(List<Date> values) {
       addCriterion("CREATE_TIME in", values, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeNotIn(List<Date> values) {
       addCriterion("CREATE_TIME not in", values, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME between", value1, value2, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME not between", value1, value2, "createTime");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1IsNull() {
       addCriterion("REMARK1 is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1IsNotNull() {
       addCriterion("REMARK1 is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1EqualTo(String value) {
       addCriterion("REMARK1 =", value, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1NotEqualTo(String value) {
       addCriterion("REMARK1 <>", value, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1GreaterThan(String value) {
       addCriterion("REMARK1 >", value, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK1 >=", value, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1LessThan(String value) {
       addCriterion("REMARK1 <", value, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1LessThanOrEqualTo(String value) {
       addCriterion("REMARK1 <=", value, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1Like(String value) {
       addCriterion("REMARK1 like", value, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1NotLike(String value) {
       addCriterion("REMARK1 not like", value, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1In(List<String> values) {
       addCriterion("REMARK1 in", values, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1NotIn(List<String> values) {
       addCriterion("REMARK1 not in", values, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1Between(String value1, String value2) {
       addCriterion("REMARK1 between", value1, value2, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark1NotBetween(String value1, String value2) {
       addCriterion("REMARK1 not between", value1, value2, "remark1");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2IsNull() {
       addCriterion("REMARK2 is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2IsNotNull() {
       addCriterion("REMARK2 is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2EqualTo(String value) {
       addCriterion("REMARK2 =", value, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2NotEqualTo(String value) {
       addCriterion("REMARK2 <>", value, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2GreaterThan(String value) {
       addCriterion("REMARK2 >", value, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK2 >=", value, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2LessThan(String value) {
       addCriterion("REMARK2 <", value, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2LessThanOrEqualTo(String value) {
       addCriterion("REMARK2 <=", value, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2Like(String value) {
       addCriterion("REMARK2 like", value, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2NotLike(String value) {
       addCriterion("REMARK2 not like", value, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2In(List<String> values) {
       addCriterion("REMARK2 in", values, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2NotIn(List<String> values) {
       addCriterion("REMARK2 not in", values, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2Between(String value1, String value2) {
       addCriterion("REMARK2 between", value1, value2, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark2NotBetween(String value1, String value2) {
       addCriterion("REMARK2 not between", value1, value2, "remark2");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3IsNull() {
       addCriterion("REMARK3 is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3IsNotNull() {
       addCriterion("REMARK3 is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3EqualTo(String value) {
       addCriterion("REMARK3 =", value, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3NotEqualTo(String value) {
       addCriterion("REMARK3 <>", value, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3GreaterThan(String value) {
       addCriterion("REMARK3 >", value, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK3 >=", value, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3LessThan(String value) {
       addCriterion("REMARK3 <", value, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3LessThanOrEqualTo(String value) {
       addCriterion("REMARK3 <=", value, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3Like(String value) {
       addCriterion("REMARK3 like", value, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3NotLike(String value) {
       addCriterion("REMARK3 not like", value, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3In(List<String> values) {
       addCriterion("REMARK3 in", values, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3NotIn(List<String> values) {
       addCriterion("REMARK3 not in", values, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3Between(String value1, String value2) {
       addCriterion("REMARK3 between", value1, value2, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark3NotBetween(String value1, String value2) {
       addCriterion("REMARK3 not between", value1, value2, "remark3");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4IsNull() {
       addCriterion("REMARK4 is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4IsNotNull() {
       addCriterion("REMARK4 is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4EqualTo(String value) {
       addCriterion("REMARK4 =", value, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4NotEqualTo(String value) {
       addCriterion("REMARK4 <>", value, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4GreaterThan(String value) {
       addCriterion("REMARK4 >", value, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK4 >=", value, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4LessThan(String value) {
       addCriterion("REMARK4 <", value, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4LessThanOrEqualTo(String value) {
       addCriterion("REMARK4 <=", value, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4Like(String value) {
       addCriterion("REMARK4 like", value, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4NotLike(String value) {
       addCriterion("REMARK4 not like", value, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4In(List<String> values) {
       addCriterion("REMARK4 in", values, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4NotIn(List<String> values) {
       addCriterion("REMARK4 not in", values, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4Between(String value1, String value2) {
       addCriterion("REMARK4 between", value1, value2, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark4NotBetween(String value1, String value2) {
       addCriterion("REMARK4 not between", value1, value2, "remark4");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5IsNull() {
       addCriterion("REMARK5 is null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5IsNotNull() {
       addCriterion("REMARK5 is not null");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5EqualTo(String value) {
       addCriterion("REMARK5 =", value, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5NotEqualTo(String value) {
       addCriterion("REMARK5 <>", value, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5GreaterThan(String value) {
       addCriterion("REMARK5 >", value, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5GreaterThanOrEqualTo(String value) {
       addCriterion("REMARK5 >=", value, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5LessThan(String value) {
       addCriterion("REMARK5 <", value, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5LessThanOrEqualTo(String value) {
       addCriterion("REMARK5 <=", value, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5Like(String value) {
       addCriterion("REMARK5 like", value, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5NotLike(String value) {
       addCriterion("REMARK5 not like", value, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5In(List<String> values) {
       addCriterion("REMARK5 in", values, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5NotIn(List<String> values) {
       addCriterion("REMARK5 not in", values, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5Between(String value1, String value2) {
       addCriterion("REMARK5 between", value1, value2, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
 
     public SealJingeKeyExample.Criteria andRemark5NotBetween(String value1, String value2) {
       addCriterion("REMARK5 not between", value1, value2, "remark5");
       return (SealJingeKeyExample.Criteria)this;
     }
   }
 }

