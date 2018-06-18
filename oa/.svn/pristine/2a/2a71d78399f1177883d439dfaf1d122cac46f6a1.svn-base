 package com.myoa.model.portalColumn;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class PortalColumnExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public PortalColumnExample()
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
 
   public static class Criteria extends PortalColumnExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<PortalColumnExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<PortalColumnExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<PortalColumnExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new PortalColumnExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new PortalColumnExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new PortalColumnExample.Criterion(condition, value1, value2));
     }
 
     public PortalColumnExample.Criteria andColumnIdIsNull() {
       addCriterion("COLUMN_ID is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdIsNotNull() {
       addCriterion("COLUMN_ID is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdEqualTo(Integer value) {
       addCriterion("COLUMN_ID =", value, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdNotEqualTo(Integer value) {
       addCriterion("COLUMN_ID <>", value, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdGreaterThan(Integer value) {
       addCriterion("COLUMN_ID >", value, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("COLUMN_ID >=", value, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdLessThan(Integer value) {
       addCriterion("COLUMN_ID <", value, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdLessThanOrEqualTo(Integer value) {
       addCriterion("COLUMN_ID <=", value, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdIn(List<Integer> values) {
       addCriterion("COLUMN_ID in", values, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdNotIn(List<Integer> values) {
       addCriterion("COLUMN_ID not in", values, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdBetween(Integer value1, Integer value2) {
       addCriterion("COLUMN_ID between", value1, value2, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnIdNotBetween(Integer value1, Integer value2) {
       addCriterion("COLUMN_ID not between", value1, value2, "columnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdIsNull() {
       addCriterion("PORTAL_ID is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdIsNotNull() {
       addCriterion("PORTAL_ID is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdEqualTo(Integer value) {
       addCriterion("PORTAL_ID =", value, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdNotEqualTo(Integer value) {
       addCriterion("PORTAL_ID <>", value, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdGreaterThan(Integer value) {
       addCriterion("PORTAL_ID >", value, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("PORTAL_ID >=", value, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdLessThan(Integer value) {
       addCriterion("PORTAL_ID <", value, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdLessThanOrEqualTo(Integer value) {
       addCriterion("PORTAL_ID <=", value, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdIn(List<Integer> values) {
       addCriterion("PORTAL_ID in", values, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdNotIn(List<Integer> values) {
       addCriterion("PORTAL_ID not in", values, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdBetween(Integer value1, Integer value2) {
       addCriterion("PORTAL_ID between", value1, value2, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPortalIdNotBetween(Integer value1, Integer value2) {
       addCriterion("PORTAL_ID not between", value1, value2, "portalId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoIsNull() {
       addCriterion("SORT_NO is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoIsNotNull() {
       addCriterion("SORT_NO is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoEqualTo(String value) {
       addCriterion("SORT_NO =", value, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoNotEqualTo(String value) {
       addCriterion("SORT_NO <>", value, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoGreaterThan(String value) {
       addCriterion("SORT_NO >", value, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoGreaterThanOrEqualTo(String value) {
       addCriterion("SORT_NO >=", value, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoLessThan(String value) {
       addCriterion("SORT_NO <", value, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoLessThanOrEqualTo(String value) {
       addCriterion("SORT_NO <=", value, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoLike(String value) {
       addCriterion("SORT_NO like", value, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoNotLike(String value) {
       addCriterion("SORT_NO not like", value, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoIn(List<String> values) {
       addCriterion("SORT_NO in", values, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoNotIn(List<String> values) {
       addCriterion("SORT_NO not in", values, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoBetween(String value1, String value2) {
       addCriterion("SORT_NO between", value1, value2, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andSortNoNotBetween(String value1, String value2) {
       addCriterion("SORT_NO not between", value1, value2, "sortNo");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkIsNull() {
       addCriterion("COLUMN_MARK is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkIsNotNull() {
       addCriterion("COLUMN_MARK is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkEqualTo(String value) {
       addCriterion("COLUMN_MARK =", value, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkNotEqualTo(String value) {
       addCriterion("COLUMN_MARK <>", value, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkGreaterThan(String value) {
       addCriterion("COLUMN_MARK >", value, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkGreaterThanOrEqualTo(String value) {
       addCriterion("COLUMN_MARK >=", value, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkLessThan(String value) {
       addCriterion("COLUMN_MARK <", value, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkLessThanOrEqualTo(String value) {
       addCriterion("COLUMN_MARK <=", value, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkLike(String value) {
       addCriterion("COLUMN_MARK like", value, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkNotLike(String value) {
       addCriterion("COLUMN_MARK not like", value, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkIn(List<String> values) {
       addCriterion("COLUMN_MARK in", values, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkNotIn(List<String> values) {
       addCriterion("COLUMN_MARK not in", values, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkBetween(String value1, String value2) {
       addCriterion("COLUMN_MARK between", value1, value2, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andColumnMarkNotBetween(String value1, String value2) {
       addCriterion("COLUMN_MARK not between", value1, value2, "columnMark");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeIsNull() {
       addCriterion("PAGE_SIZE is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeIsNotNull() {
       addCriterion("PAGE_SIZE is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeEqualTo(Integer value) {
       addCriterion("PAGE_SIZE =", value, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeNotEqualTo(Integer value) {
       addCriterion("PAGE_SIZE <>", value, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeGreaterThan(Integer value) {
       addCriterion("PAGE_SIZE >", value, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeGreaterThanOrEqualTo(Integer value) {
       addCriterion("PAGE_SIZE >=", value, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeLessThan(Integer value) {
       addCriterion("PAGE_SIZE <", value, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeLessThanOrEqualTo(Integer value) {
       addCriterion("PAGE_SIZE <=", value, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeIn(List<Integer> values) {
       addCriterion("PAGE_SIZE in", values, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeNotIn(List<Integer> values) {
       addCriterion("PAGE_SIZE not in", values, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeBetween(Integer value1, Integer value2) {
       addCriterion("PAGE_SIZE between", value1, value2, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPageSizeNotBetween(Integer value1, Integer value2) {
       addCriterion("PAGE_SIZE not between", value1, value2, "pageSize");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdIsNull() {
       addCriterion("PARENT_COLUMN_ID is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdIsNotNull() {
       addCriterion("PARENT_COLUMN_ID is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdEqualTo(Integer value) {
       addCriterion("PARENT_COLUMN_ID =", value, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdNotEqualTo(Integer value) {
       addCriterion("PARENT_COLUMN_ID <>", value, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdGreaterThan(Integer value) {
       addCriterion("PARENT_COLUMN_ID >", value, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("PARENT_COLUMN_ID >=", value, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdLessThan(Integer value) {
       addCriterion("PARENT_COLUMN_ID <", value, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdLessThanOrEqualTo(Integer value) {
       addCriterion("PARENT_COLUMN_ID <=", value, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdIn(List<Integer> values) {
       addCriterion("PARENT_COLUMN_ID in", values, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdNotIn(List<Integer> values) {
       addCriterion("PARENT_COLUMN_ID not in", values, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdBetween(Integer value1, Integer value2) {
       addCriterion("PARENT_COLUMN_ID between", value1, value2, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andParentColumnIdNotBetween(Integer value1, Integer value2) {
       addCriterion("PARENT_COLUMN_ID not between", value1, value2, "parentColumnId");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathIsNull() {
       addCriterion("PATH is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathIsNotNull() {
       addCriterion("PATH is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathEqualTo(Integer value) {
       addCriterion("PATH =", value, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathNotEqualTo(Integer value) {
       addCriterion("PATH <>", value, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathGreaterThan(Integer value) {
       addCriterion("PATH >", value, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathGreaterThanOrEqualTo(Integer value) {
       addCriterion("PATH >=", value, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathLessThan(Integer value) {
       addCriterion("PATH <", value, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathLessThanOrEqualTo(Integer value) {
       addCriterion("PATH <=", value, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathIn(List<Integer> values) {
       addCriterion("PATH in", values, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathNotIn(List<Integer> values) {
       addCriterion("PATH not in", values, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathBetween(Integer value1, Integer value2) {
       addCriterion("PATH between", value1, value2, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andPathNotBetween(Integer value1, Integer value2) {
       addCriterion("PATH not between", value1, value2, "path");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateIsNull() {
       addCriterion("LIST_TEMPLATE is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateIsNotNull() {
       addCriterion("LIST_TEMPLATE is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateEqualTo(Integer value) {
       addCriterion("LIST_TEMPLATE =", value, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateNotEqualTo(Integer value) {
       addCriterion("LIST_TEMPLATE <>", value, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateGreaterThan(Integer value) {
       addCriterion("LIST_TEMPLATE >", value, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateGreaterThanOrEqualTo(Integer value) {
       addCriterion("LIST_TEMPLATE >=", value, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateLessThan(Integer value) {
       addCriterion("LIST_TEMPLATE <", value, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateLessThanOrEqualTo(Integer value) {
       addCriterion("LIST_TEMPLATE <=", value, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateIn(List<Integer> values) {
       addCriterion("LIST_TEMPLATE in", values, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateNotIn(List<Integer> values) {
       addCriterion("LIST_TEMPLATE not in", values, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateBetween(Integer value1, Integer value2) {
       addCriterion("LIST_TEMPLATE between", value1, value2, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andListTemplateNotBetween(Integer value1, Integer value2) {
       addCriterion("LIST_TEMPLATE not between", value1, value2, "listTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateIsNull() {
       addCriterion("DETAIL_TEMPLATE is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateIsNotNull() {
       addCriterion("DETAIL_TEMPLATE is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateEqualTo(Integer value) {
       addCriterion("DETAIL_TEMPLATE =", value, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateNotEqualTo(Integer value) {
       addCriterion("DETAIL_TEMPLATE <>", value, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateGreaterThan(Integer value) {
       addCriterion("DETAIL_TEMPLATE >", value, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateGreaterThanOrEqualTo(Integer value) {
       addCriterion("DETAIL_TEMPLATE >=", value, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateLessThan(Integer value) {
       addCriterion("DETAIL_TEMPLATE <", value, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateLessThanOrEqualTo(Integer value) {
       addCriterion("DETAIL_TEMPLATE <=", value, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateIn(List<Integer> values) {
       addCriterion("DETAIL_TEMPLATE in", values, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateNotIn(List<Integer> values) {
       addCriterion("DETAIL_TEMPLATE not in", values, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateBetween(Integer value1, Integer value2) {
       addCriterion("DETAIL_TEMPLATE between", value1, value2, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andDetailTemplateNotBetween(Integer value1, Integer value2) {
       addCriterion("DETAIL_TEMPLATE not between", value1, value2, "detailTemplate");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnIsNull() {
       addCriterion("AUDIT_YN is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnIsNotNull() {
       addCriterion("AUDIT_YN is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnEqualTo(String value) {
       addCriterion("AUDIT_YN =", value, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnNotEqualTo(String value) {
       addCriterion("AUDIT_YN <>", value, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnGreaterThan(String value) {
       addCriterion("AUDIT_YN >", value, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnGreaterThanOrEqualTo(String value) {
       addCriterion("AUDIT_YN >=", value, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnLessThan(String value) {
       addCriterion("AUDIT_YN <", value, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnLessThanOrEqualTo(String value) {
       addCriterion("AUDIT_YN <=", value, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnLike(String value) {
       addCriterion("AUDIT_YN like", value, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnNotLike(String value) {
       addCriterion("AUDIT_YN not like", value, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnIn(List<String> values) {
       addCriterion("AUDIT_YN in", values, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnNotIn(List<String> values) {
       addCriterion("AUDIT_YN not in", values, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnBetween(String value1, String value2) {
       addCriterion("AUDIT_YN between", value1, value2, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditYnNotBetween(String value1, String value2) {
       addCriterion("AUDIT_YN not between", value1, value2, "auditYn");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserIsNull() {
       addCriterion("AUDIT_USER is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserIsNotNull() {
       addCriterion("AUDIT_USER is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserEqualTo(String value) {
       addCriterion("AUDIT_USER =", value, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserNotEqualTo(String value) {
       addCriterion("AUDIT_USER <>", value, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserGreaterThan(String value) {
       addCriterion("AUDIT_USER >", value, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserGreaterThanOrEqualTo(String value) {
       addCriterion("AUDIT_USER >=", value, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserLessThan(String value) {
       addCriterion("AUDIT_USER <", value, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserLessThanOrEqualTo(String value) {
       addCriterion("AUDIT_USER <=", value, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserLike(String value) {
       addCriterion("AUDIT_USER like", value, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserNotLike(String value) {
       addCriterion("AUDIT_USER not like", value, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserIn(List<String> values) {
       addCriterion("AUDIT_USER in", values, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserNotIn(List<String> values) {
       addCriterion("AUDIT_USER not in", values, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserBetween(String value1, String value2) {
       addCriterion("AUDIT_USER between", value1, value2, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAuditUserNotBetween(String value1, String value2) {
       addCriterion("AUDIT_USER not between", value1, value2, "auditUser");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixIsNull() {
       addCriterion("APPENDIX is null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixIsNotNull() {
       addCriterion("APPENDIX is not null");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixEqualTo(String value) {
       addCriterion("APPENDIX =", value, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixNotEqualTo(String value) {
       addCriterion("APPENDIX <>", value, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixGreaterThan(String value) {
       addCriterion("APPENDIX >", value, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixGreaterThanOrEqualTo(String value) {
       addCriterion("APPENDIX >=", value, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixLessThan(String value) {
       addCriterion("APPENDIX <", value, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixLessThanOrEqualTo(String value) {
       addCriterion("APPENDIX <=", value, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixLike(String value) {
       addCriterion("APPENDIX like", value, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixNotLike(String value) {
       addCriterion("APPENDIX not like", value, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixIn(List<String> values) {
       addCriterion("APPENDIX in", values, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixNotIn(List<String> values) {
       addCriterion("APPENDIX not in", values, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixBetween(String value1, String value2) {
       addCriterion("APPENDIX between", value1, value2, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
 
     public PortalColumnExample.Criteria andAppendixNotBetween(String value1, String value2) {
       addCriterion("APPENDIX not between", value1, value2, "appendix");
       return (PortalColumnExample.Criteria)this;
     }
   }
 }

