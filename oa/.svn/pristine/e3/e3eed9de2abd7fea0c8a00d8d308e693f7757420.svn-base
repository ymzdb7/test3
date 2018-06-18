 package com.myoa.model.template;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class TemplateModuleExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public TemplateModuleExample()
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
 
   public static class Criteria extends TemplateModuleExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<TemplateModuleExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<TemplateModuleExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<TemplateModuleExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TemplateModuleExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TemplateModuleExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TemplateModuleExample.Criterion(condition, value1, value2));
     }
 
     public TemplateModuleExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameIsNull() {
       addCriterion("name is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameIsNotNull() {
       addCriterion("name is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameEqualTo(String value) {
       addCriterion("name =", value, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameNotEqualTo(String value) {
       addCriterion("name <>", value, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameGreaterThan(String value) {
       addCriterion("name >", value, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameGreaterThanOrEqualTo(String value) {
       addCriterion("name >=", value, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameLessThan(String value) {
       addCriterion("name <", value, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameLessThanOrEqualTo(String value) {
       addCriterion("name <=", value, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameLike(String value) {
       addCriterion("name like", value, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameNotLike(String value) {
       addCriterion("name not like", value, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameIn(List<String> values) {
       addCriterion("name in", values, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameNotIn(List<String> values) {
       addCriterion("name not in", values, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameBetween(String value1, String value2) {
       addCriterion("name between", value1, value2, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andNameNotBetween(String value1, String value2) {
       addCriterion("name not between", value1, value2, "name");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeEqualTo(String value) {
       addCriterion("type =", value, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("type <>", value, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("type >", value, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("type >=", value, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeLessThan(String value) {
       addCriterion("type <", value, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("type <=", value, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeLike(String value) {
       addCriterion("type like", value, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeNotLike(String value) {
       addCriterion("type not like", value, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeIn(List<String> values) {
       addCriterion("type in", values, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("type not in", values, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("type between", value1, value2, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("type not between", value1, value2, "type");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserIsNull() {
       addCriterion("priv_user is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserIsNotNull() {
       addCriterion("priv_user is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserEqualTo(String value) {
       addCriterion("priv_user =", value, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserNotEqualTo(String value) {
       addCriterion("priv_user <>", value, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserGreaterThan(String value) {
       addCriterion("priv_user >", value, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserGreaterThanOrEqualTo(String value) {
       addCriterion("priv_user >=", value, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserLessThan(String value) {
       addCriterion("priv_user <", value, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserLessThanOrEqualTo(String value) {
       addCriterion("priv_user <=", value, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserLike(String value) {
       addCriterion("priv_user like", value, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserNotLike(String value) {
       addCriterion("priv_user not like", value, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserIn(List<String> values) {
       addCriterion("priv_user in", values, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserNotIn(List<String> values) {
       addCriterion("priv_user not in", values, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserBetween(String value1, String value2) {
       addCriterion("priv_user between", value1, value2, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivUserNotBetween(String value1, String value2) {
       addCriterion("priv_user not between", value1, value2, "privUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgIsNull() {
       addCriterion("priv_org is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgIsNotNull() {
       addCriterion("priv_org is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgEqualTo(String value) {
       addCriterion("priv_org =", value, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgNotEqualTo(String value) {
       addCriterion("priv_org <>", value, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgGreaterThan(String value) {
       addCriterion("priv_org >", value, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgGreaterThanOrEqualTo(String value) {
       addCriterion("priv_org >=", value, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgLessThan(String value) {
       addCriterion("priv_org <", value, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgLessThanOrEqualTo(String value) {
       addCriterion("priv_org <=", value, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgLike(String value) {
       addCriterion("priv_org like", value, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgNotLike(String value) {
       addCriterion("priv_org not like", value, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgIn(List<String> values) {
       addCriterion("priv_org in", values, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgNotIn(List<String> values) {
       addCriterion("priv_org not in", values, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgBetween(String value1, String value2) {
       addCriterion("priv_org between", value1, value2, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivOrgNotBetween(String value1, String value2) {
       addCriterion("priv_org not between", value1, value2, "privOrg");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleIsNull() {
       addCriterion("priv_role is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleIsNotNull() {
       addCriterion("priv_role is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleEqualTo(String value) {
       addCriterion("priv_role =", value, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleNotEqualTo(String value) {
       addCriterion("priv_role <>", value, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleGreaterThan(String value) {
       addCriterion("priv_role >", value, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleGreaterThanOrEqualTo(String value) {
       addCriterion("priv_role >=", value, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleLessThan(String value) {
       addCriterion("priv_role <", value, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleLessThanOrEqualTo(String value) {
       addCriterion("priv_role <=", value, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleLike(String value) {
       addCriterion("priv_role like", value, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleNotLike(String value) {
       addCriterion("priv_role not like", value, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleIn(List<String> values) {
       addCriterion("priv_role in", values, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleNotIn(List<String> values) {
       addCriterion("priv_role not in", values, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleBetween(String value1, String value2) {
       addCriterion("priv_role between", value1, value2, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andPrivRoleNotBetween(String value1, String value2) {
       addCriterion("priv_role not between", value1, value2, "privRole");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdIsNull() {
       addCriterion("category_id is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdIsNotNull() {
       addCriterion("category_id is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdEqualTo(String value) {
       addCriterion("category_id =", value, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdNotEqualTo(String value) {
       addCriterion("category_id <>", value, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdGreaterThan(String value) {
       addCriterion("category_id >", value, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
       addCriterion("category_id >=", value, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdLessThan(String value) {
       addCriterion("category_id <", value, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdLessThanOrEqualTo(String value) {
       addCriterion("category_id <=", value, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdLike(String value) {
       addCriterion("category_id like", value, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdNotLike(String value) {
       addCriterion("category_id not like", value, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdIn(List<String> values) {
       addCriterion("category_id in", values, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdNotIn(List<String> values) {
       addCriterion("category_id not in", values, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdBetween(String value1, String value2) {
       addCriterion("category_id between", value1, value2, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCategoryIdNotBetween(String value1, String value2) {
       addCriterion("category_id not between", value1, value2, "categoryId");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeIsNull() {
       addCriterion("create_time is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("create_time is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeEqualTo(Integer value) {
       addCriterion("create_time =", value, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeNotEqualTo(Integer value) {
       addCriterion("create_time <>", value, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeGreaterThan(Integer value) {
       addCriterion("create_time >", value, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
       addCriterion("create_time >=", value, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeLessThan(Integer value) {
       addCriterion("create_time <", value, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
       addCriterion("create_time <=", value, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeIn(List<Integer> values) {
       addCriterion("create_time in", values, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeNotIn(List<Integer> values) {
       addCriterion("create_time not in", values, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeBetween(Integer value1, Integer value2) {
       addCriterion("create_time between", value1, value2, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
       addCriterion("create_time not between", value1, value2, "createTime");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserIsNull() {
       addCriterion("create_user is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserIsNotNull() {
       addCriterion("create_user is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserEqualTo(Integer value) {
       addCriterion("create_user =", value, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserNotEqualTo(Integer value) {
       addCriterion("create_user <>", value, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserGreaterThan(Integer value) {
       addCriterion("create_user >", value, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
       addCriterion("create_user >=", value, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserLessThan(Integer value) {
       addCriterion("create_user <", value, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserLessThanOrEqualTo(Integer value) {
       addCriterion("create_user <=", value, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserIn(List<Integer> values) {
       addCriterion("create_user in", values, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserNotIn(List<Integer> values) {
       addCriterion("create_user not in", values, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserBetween(Integer value1, Integer value2) {
       addCriterion("create_user between", value1, value2, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
       addCriterion("create_user not between", value1, value2, "createUser");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlIsNull() {
       addCriterion("att_url is null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlIsNotNull() {
       addCriterion("att_url is not null");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlEqualTo(String value) {
       addCriterion("att_url =", value, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlNotEqualTo(String value) {
       addCriterion("att_url <>", value, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlGreaterThan(String value) {
       addCriterion("att_url >", value, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlGreaterThanOrEqualTo(String value) {
       addCriterion("att_url >=", value, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlLessThan(String value) {
       addCriterion("att_url <", value, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlLessThanOrEqualTo(String value) {
       addCriterion("att_url <=", value, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlLike(String value) {
       addCriterion("att_url like", value, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlNotLike(String value) {
       addCriterion("att_url not like", value, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlIn(List<String> values) {
       addCriterion("att_url in", values, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlNotIn(List<String> values) {
       addCriterion("att_url not in", values, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlBetween(String value1, String value2) {
       addCriterion("att_url between", value1, value2, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
 
     public TemplateModuleExample.Criteria andAttUrlNotBetween(String value1, String value2) {
       addCriterion("att_url not between", value1, value2, "attUrl");
       return (TemplateModuleExample.Criteria)this;
     }
   }
 }

