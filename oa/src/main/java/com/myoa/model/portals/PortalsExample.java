 package com.myoa.model.portals;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class PortalsExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public PortalsExample()
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
 
   public static class Criteria extends PortalsExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<PortalsExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<PortalsExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<PortalsExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new PortalsExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new PortalsExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new PortalsExample.Criterion(condition, value1, value2));
     }
 
     public PortalsExample.Criteria andPortalsIdIsNull() {
       addCriterion("portals_id is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdIsNotNull() {
       addCriterion("portals_id is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdEqualTo(Integer value) {
       addCriterion("portals_id =", value, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdNotEqualTo(Integer value) {
       addCriterion("portals_id <>", value, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdGreaterThan(Integer value) {
       addCriterion("portals_id >", value, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("portals_id >=", value, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdLessThan(Integer value) {
       addCriterion("portals_id <", value, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdLessThanOrEqualTo(Integer value) {
       addCriterion("portals_id <=", value, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdIn(List<Integer> values) {
       addCriterion("portals_id in", values, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdNotIn(List<Integer> values) {
       addCriterion("portals_id not in", values, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdBetween(Integer value1, Integer value2) {
       addCriterion("portals_id between", value1, value2, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsIdNotBetween(Integer value1, Integer value2) {
       addCriterion("portals_id not between", value1, value2, "portalsId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoIsNull() {
       addCriterion("portals_no is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoIsNotNull() {
       addCriterion("portals_no is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoEqualTo(Integer value) {
       addCriterion("portals_no =", value, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoNotEqualTo(Integer value) {
       addCriterion("portals_no <>", value, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoGreaterThan(Integer value) {
       addCriterion("portals_no >", value, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoGreaterThanOrEqualTo(Integer value) {
       addCriterion("portals_no >=", value, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoLessThan(Integer value) {
       addCriterion("portals_no <", value, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoLessThanOrEqualTo(Integer value) {
       addCriterion("portals_no <=", value, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoIn(List<Integer> values) {
       addCriterion("portals_no in", values, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoNotIn(List<Integer> values) {
       addCriterion("portals_no not in", values, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoBetween(Integer value1, Integer value2) {
       addCriterion("portals_no between", value1, value2, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalsNoNotBetween(Integer value1, Integer value2) {
       addCriterion("portals_no not between", value1, value2, "portalsNo");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameIsNull() {
       addCriterion("portal_name is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameIsNotNull() {
       addCriterion("portal_name is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameEqualTo(String value) {
       addCriterion("portal_name =", value, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameNotEqualTo(String value) {
       addCriterion("portal_name <>", value, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameGreaterThan(String value) {
       addCriterion("portal_name >", value, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameGreaterThanOrEqualTo(String value) {
       addCriterion("portal_name >=", value, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameLessThan(String value) {
       addCriterion("portal_name <", value, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameLessThanOrEqualTo(String value) {
       addCriterion("portal_name <=", value, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameLike(String value) {
       addCriterion("portal_name like", value, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameNotLike(String value) {
       addCriterion("portal_name not like", value, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameIn(List<String> values) {
       addCriterion("portal_name in", values, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameNotIn(List<String> values) {
       addCriterion("portal_name not in", values, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameBetween(String value1, String value2) {
       addCriterion("portal_name between", value1, value2, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalNameNotBetween(String value1, String value2) {
       addCriterion("portal_name not between", value1, value2, "portalName");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeIsNull() {
       addCriterion("portal_type is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeIsNotNull() {
       addCriterion("portal_type is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeEqualTo(Integer value) {
       addCriterion("portal_type =", value, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeNotEqualTo(Integer value) {
       addCriterion("portal_type <>", value, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeGreaterThan(Integer value) {
       addCriterion("portal_type >", value, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("portal_type >=", value, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeLessThan(Integer value) {
       addCriterion("portal_type <", value, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeLessThanOrEqualTo(Integer value) {
       addCriterion("portal_type <=", value, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeIn(List<Integer> values) {
       addCriterion("portal_type in", values, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeNotIn(List<Integer> values) {
       addCriterion("portal_type not in", values, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeBetween(Integer value1, Integer value2) {
       addCriterion("portal_type between", value1, value2, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("portal_type not between", value1, value2, "portalType");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkIsNull() {
       addCriterion("portal_link is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkIsNotNull() {
       addCriterion("portal_link is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkEqualTo(String value) {
       addCriterion("portal_link =", value, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkNotEqualTo(String value) {
       addCriterion("portal_link <>", value, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkGreaterThan(String value) {
       addCriterion("portal_link >", value, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkGreaterThanOrEqualTo(String value) {
       addCriterion("portal_link >=", value, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkLessThan(String value) {
       addCriterion("portal_link <", value, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkLessThanOrEqualTo(String value) {
       addCriterion("portal_link <=", value, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkLike(String value) {
       addCriterion("portal_link like", value, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkNotLike(String value) {
       addCriterion("portal_link not like", value, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkIn(List<String> values) {
       addCriterion("portal_link in", values, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkNotIn(List<String> values) {
       addCriterion("portal_link not in", values, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkBetween(String value1, String value2) {
       addCriterion("portal_link between", value1, value2, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andPortalLinkNotBetween(String value1, String value2) {
       addCriterion("portal_link not between", value1, value2, "portalLink");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdIsNull() {
       addCriterion("module_id is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdIsNotNull() {
       addCriterion("module_id is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdEqualTo(String value) {
       addCriterion("module_id =", value, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdNotEqualTo(String value) {
       addCriterion("module_id <>", value, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdGreaterThan(String value) {
       addCriterion("module_id >", value, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdGreaterThanOrEqualTo(String value) {
       addCriterion("module_id >=", value, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdLessThan(String value) {
       addCriterion("module_id <", value, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdLessThanOrEqualTo(String value) {
       addCriterion("module_id <=", value, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdLike(String value) {
       addCriterion("module_id like", value, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdNotLike(String value) {
       addCriterion("module_id not like", value, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdIn(List<String> values) {
       addCriterion("module_id in", values, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdNotIn(List<String> values) {
       addCriterion("module_id not in", values, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdBetween(String value1, String value2) {
       addCriterion("module_id between", value1, value2, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andModuleIdNotBetween(String value1, String value2) {
       addCriterion("module_id not between", value1, value2, "moduleId");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagIsNull() {
       addCriterion("use_flag is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagIsNotNull() {
       addCriterion("use_flag is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagEqualTo(Integer value) {
       addCriterion("use_flag =", value, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagNotEqualTo(Integer value) {
       addCriterion("use_flag <>", value, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagGreaterThan(Integer value) {
       addCriterion("use_flag >", value, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagGreaterThanOrEqualTo(Integer value) {
       addCriterion("use_flag >=", value, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagLessThan(Integer value) {
       addCriterion("use_flag <", value, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagLessThanOrEqualTo(Integer value) {
       addCriterion("use_flag <=", value, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagIn(List<Integer> values) {
       addCriterion("use_flag in", values, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagNotIn(List<Integer> values) {
       addCriterion("use_flag not in", values, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagBetween(Integer value1, Integer value2) {
       addCriterion("use_flag between", value1, value2, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andUseFlagNotBetween(Integer value1, Integer value2) {
       addCriterion("use_flag not between", value1, value2, "useFlag");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptIsNull() {
       addCriterion("access_priv_dept is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptIsNotNull() {
       addCriterion("access_priv_dept is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptEqualTo(String value) {
       addCriterion("access_priv_dept =", value, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptNotEqualTo(String value) {
       addCriterion("access_priv_dept <>", value, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptGreaterThan(String value) {
       addCriterion("access_priv_dept >", value, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptGreaterThanOrEqualTo(String value) {
       addCriterion("access_priv_dept >=", value, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptLessThan(String value) {
       addCriterion("access_priv_dept <", value, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptLessThanOrEqualTo(String value) {
       addCriterion("access_priv_dept <=", value, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptLike(String value) {
       addCriterion("access_priv_dept like", value, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptNotLike(String value) {
       addCriterion("access_priv_dept not like", value, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptIn(List<String> values) {
       addCriterion("access_priv_dept in", values, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptNotIn(List<String> values) {
       addCriterion("access_priv_dept not in", values, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptBetween(String value1, String value2) {
       addCriterion("access_priv_dept between", value1, value2, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivDeptNotBetween(String value1, String value2) {
       addCriterion("access_priv_dept not between", value1, value2, "accessPrivDept");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivIsNull() {
       addCriterion("access_priv_priv is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivIsNotNull() {
       addCriterion("access_priv_priv is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivEqualTo(String value) {
       addCriterion("access_priv_priv =", value, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivNotEqualTo(String value) {
       addCriterion("access_priv_priv <>", value, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivGreaterThan(String value) {
       addCriterion("access_priv_priv >", value, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivGreaterThanOrEqualTo(String value) {
       addCriterion("access_priv_priv >=", value, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivLessThan(String value) {
       addCriterion("access_priv_priv <", value, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivLessThanOrEqualTo(String value) {
       addCriterion("access_priv_priv <=", value, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivLike(String value) {
       addCriterion("access_priv_priv like", value, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivNotLike(String value) {
       addCriterion("access_priv_priv not like", value, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivIn(List<String> values) {
       addCriterion("access_priv_priv in", values, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivNotIn(List<String> values) {
       addCriterion("access_priv_priv not in", values, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivBetween(String value1, String value2) {
       addCriterion("access_priv_priv between", value1, value2, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivPrivNotBetween(String value1, String value2) {
       addCriterion("access_priv_priv not between", value1, value2, "accessPrivPriv");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserIsNull() {
       addCriterion("access_priv_user is null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserIsNotNull() {
       addCriterion("access_priv_user is not null");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserEqualTo(String value) {
       addCriterion("access_priv_user =", value, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserNotEqualTo(String value) {
       addCriterion("access_priv_user <>", value, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserGreaterThan(String value) {
       addCriterion("access_priv_user >", value, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserGreaterThanOrEqualTo(String value) {
       addCriterion("access_priv_user >=", value, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserLessThan(String value) {
       addCriterion("access_priv_user <", value, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserLessThanOrEqualTo(String value) {
       addCriterion("access_priv_user <=", value, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserLike(String value) {
       addCriterion("access_priv_user like", value, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserNotLike(String value) {
       addCriterion("access_priv_user not like", value, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserIn(List<String> values) {
       addCriterion("access_priv_user in", values, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserNotIn(List<String> values) {
       addCriterion("access_priv_user not in", values, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserBetween(String value1, String value2) {
       addCriterion("access_priv_user between", value1, value2, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
 
     public PortalsExample.Criteria andAccessPrivUserNotBetween(String value1, String value2) {
       addCriterion("access_priv_user not between", value1, value2, "accessPrivUser");
       return (PortalsExample.Criteria)this;
     }
   }
 }
