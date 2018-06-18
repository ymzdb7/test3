 package com.myoa.model.portal;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class CapacitySiteInfoExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public CapacitySiteInfoExample()
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
 
   public static class Criteria extends CapacitySiteInfoExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<CapacitySiteInfoExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<CapacitySiteInfoExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<CapacitySiteInfoExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new CapacitySiteInfoExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new CapacitySiteInfoExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new CapacitySiteInfoExample.Criterion(condition, value1, value2));
     }
 
     public CapacitySiteInfoExample.Criteria andSidIsNull() {
       addCriterion("SID is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidIsNotNull() {
       addCriterion("SID is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidEqualTo(Integer value) {
       addCriterion("SID =", value, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidNotEqualTo(Integer value) {
       addCriterion("SID <>", value, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidGreaterThan(Integer value) {
       addCriterion("SID >", value, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidGreaterThanOrEqualTo(Integer value) {
       addCriterion("SID >=", value, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidLessThan(Integer value) {
       addCriterion("SID <", value, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidLessThanOrEqualTo(Integer value) {
       addCriterion("SID <=", value, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidIn(List<Integer> values) {
       addCriterion("SID in", values, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidNotIn(List<Integer> values) {
       addCriterion("SID not in", values, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidBetween(Integer value1, Integer value2) {
       addCriterion("SID between", value1, value2, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSidNotBetween(Integer value1, Integer value2) {
       addCriterion("SID not between", value1, value2, "sid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeIsNull() {
       addCriterion("CR_TIME is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeIsNotNull() {
       addCriterion("CR_TIME is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeEqualTo(Date value) {
       addCriterion("CR_TIME =", value, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeNotEqualTo(Date value) {
       addCriterion("CR_TIME <>", value, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeGreaterThan(Date value) {
       addCriterion("CR_TIME >", value, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("CR_TIME >=", value, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeLessThan(Date value) {
       addCriterion("CR_TIME <", value, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeLessThanOrEqualTo(Date value) {
       addCriterion("CR_TIME <=", value, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeIn(List<Date> values) {
       addCriterion("CR_TIME in", values, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeNotIn(List<Date> values) {
       addCriterion("CR_TIME not in", values, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeBetween(Date value1, Date value2) {
       addCriterion("CR_TIME between", value1, value2, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrTimeNotBetween(Date value1, Date value2) {
       addCriterion("CR_TIME not between", value1, value2, "crTime");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridIsNull() {
       addCriterion("CR_USERID is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridIsNotNull() {
       addCriterion("CR_USERID is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridEqualTo(Integer value) {
       addCriterion("CR_USERID =", value, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridNotEqualTo(Integer value) {
       addCriterion("CR_USERID <>", value, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridGreaterThan(Integer value) {
       addCriterion("CR_USERID >", value, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridGreaterThanOrEqualTo(Integer value) {
       addCriterion("CR_USERID >=", value, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridLessThan(Integer value) {
       addCriterion("CR_USERID <", value, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridLessThanOrEqualTo(Integer value) {
       addCriterion("CR_USERID <=", value, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridIn(List<Integer> values) {
       addCriterion("CR_USERID in", values, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridNotIn(List<Integer> values) {
       addCriterion("CR_USERID not in", values, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridBetween(Integer value1, Integer value2) {
       addCriterion("CR_USERID between", value1, value2, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUseridNotBetween(Integer value1, Integer value2) {
       addCriterion("CR_USERID not between", value1, value2, "crUserid");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameIsNull() {
       addCriterion("CR_USERNAME is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameIsNotNull() {
       addCriterion("CR_USERNAME is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameEqualTo(String value) {
       addCriterion("CR_USERNAME =", value, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameNotEqualTo(String value) {
       addCriterion("CR_USERNAME <>", value, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameGreaterThan(String value) {
       addCriterion("CR_USERNAME >", value, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameGreaterThanOrEqualTo(String value) {
       addCriterion("CR_USERNAME >=", value, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameLessThan(String value) {
       addCriterion("CR_USERNAME <", value, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameLessThanOrEqualTo(String value) {
       addCriterion("CR_USERNAME <=", value, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameLike(String value) {
       addCriterion("CR_USERNAME like", value, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameNotLike(String value) {
       addCriterion("CR_USERNAME not like", value, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameIn(List<String> values) {
       addCriterion("CR_USERNAME in", values, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameNotIn(List<String> values) {
       addCriterion("CR_USERNAME not in", values, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameBetween(String value1, String value2) {
       addCriterion("CR_USERNAME between", value1, value2, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andCrUsernameNotBetween(String value1, String value2) {
       addCriterion("CR_USERNAME not between", value1, value2, "crUsername");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplIsNull() {
       addCriterion("DETAIL_TPL is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplIsNotNull() {
       addCriterion("DETAIL_TPL is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplEqualTo(Integer value) {
       addCriterion("DETAIL_TPL =", value, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplNotEqualTo(Integer value) {
       addCriterion("DETAIL_TPL <>", value, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplGreaterThan(Integer value) {
       addCriterion("DETAIL_TPL >", value, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplGreaterThanOrEqualTo(Integer value) {
       addCriterion("DETAIL_TPL >=", value, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplLessThan(Integer value) {
       addCriterion("DETAIL_TPL <", value, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplLessThanOrEqualTo(Integer value) {
       addCriterion("DETAIL_TPL <=", value, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplIn(List<Integer> values) {
       addCriterion("DETAIL_TPL in", values, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplNotIn(List<Integer> values) {
       addCriterion("DETAIL_TPL not in", values, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplBetween(Integer value1, Integer value2) {
       addCriterion("DETAIL_TPL between", value1, value2, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andDetailTplNotBetween(Integer value1, Integer value2) {
       addCriterion("DETAIL_TPL not between", value1, value2, "detailTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderIsNull() {
       addCriterion("FOLDER is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderIsNotNull() {
       addCriterion("FOLDER is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderEqualTo(String value) {
       addCriterion("FOLDER =", value, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderNotEqualTo(String value) {
       addCriterion("FOLDER <>", value, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderGreaterThan(String value) {
       addCriterion("FOLDER >", value, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderGreaterThanOrEqualTo(String value) {
       addCriterion("FOLDER >=", value, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderLessThan(String value) {
       addCriterion("FOLDER <", value, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderLessThanOrEqualTo(String value) {
       addCriterion("FOLDER <=", value, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderLike(String value) {
       addCriterion("FOLDER like", value, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderNotLike(String value) {
       addCriterion("FOLDER not like", value, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderIn(List<String> values) {
       addCriterion("FOLDER in", values, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderNotIn(List<String> values) {
       addCriterion("FOLDER not in", values, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderBetween(String value1, String value2) {
       addCriterion("FOLDER between", value1, value2, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andFolderNotBetween(String value1, String value2) {
       addCriterion("FOLDER not between", value1, value2, "folder");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplIsNull() {
       addCriterion("INDEX_TPL is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplIsNotNull() {
       addCriterion("INDEX_TPL is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplEqualTo(Integer value) {
       addCriterion("INDEX_TPL =", value, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplNotEqualTo(Integer value) {
       addCriterion("INDEX_TPL <>", value, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplGreaterThan(Integer value) {
       addCriterion("INDEX_TPL >", value, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplGreaterThanOrEqualTo(Integer value) {
       addCriterion("INDEX_TPL >=", value, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplLessThan(Integer value) {
       addCriterion("INDEX_TPL <", value, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplLessThanOrEqualTo(Integer value) {
       addCriterion("INDEX_TPL <=", value, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplIn(List<Integer> values) {
       addCriterion("INDEX_TPL in", values, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplNotIn(List<Integer> values) {
       addCriterion("INDEX_TPL not in", values, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplBetween(Integer value1, Integer value2) {
       addCriterion("INDEX_TPL between", value1, value2, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andIndexTplNotBetween(Integer value1, Integer value2) {
       addCriterion("INDEX_TPL not between", value1, value2, "indexTpl");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathIsNull() {
       addCriterion("PUB_PATH is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathIsNotNull() {
       addCriterion("PUB_PATH is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathEqualTo(String value) {
       addCriterion("PUB_PATH =", value, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathNotEqualTo(String value) {
       addCriterion("PUB_PATH <>", value, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathGreaterThan(String value) {
       addCriterion("PUB_PATH >", value, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathGreaterThanOrEqualTo(String value) {
       addCriterion("PUB_PATH >=", value, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathLessThan(String value) {
       addCriterion("PUB_PATH <", value, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathLessThanOrEqualTo(String value) {
       addCriterion("PUB_PATH <=", value, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathLike(String value) {
       addCriterion("PUB_PATH like", value, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathNotLike(String value) {
       addCriterion("PUB_PATH not like", value, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathIn(List<String> values) {
       addCriterion("PUB_PATH in", values, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathNotIn(List<String> values) {
       addCriterion("PUB_PATH not in", values, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathBetween(String value1, String value2) {
       addCriterion("PUB_PATH between", value1, value2, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubPathNotBetween(String value1, String value2) {
       addCriterion("PUB_PATH not between", value1, value2, "pubPath");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusIsNull() {
       addCriterion("PUB_STATUS is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusIsNotNull() {
       addCriterion("PUB_STATUS is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusEqualTo(Integer value) {
       addCriterion("PUB_STATUS =", value, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusNotEqualTo(Integer value) {
       addCriterion("PUB_STATUS <>", value, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusGreaterThan(Integer value) {
       addCriterion("PUB_STATUS >", value, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("PUB_STATUS >=", value, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusLessThan(Integer value) {
       addCriterion("PUB_STATUS <", value, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusLessThanOrEqualTo(Integer value) {
       addCriterion("PUB_STATUS <=", value, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusIn(List<Integer> values) {
       addCriterion("PUB_STATUS in", values, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusNotIn(List<Integer> values) {
       addCriterion("PUB_STATUS not in", values, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusBetween(Integer value1, Integer value2) {
       addCriterion("PUB_STATUS between", value1, value2, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("PUB_STATUS not between", value1, value2, "pubStatus");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityIsNull() {
       addCriterion("SITE_IDENTITY is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityIsNotNull() {
       addCriterion("SITE_IDENTITY is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityEqualTo(String value) {
       addCriterion("SITE_IDENTITY =", value, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityNotEqualTo(String value) {
       addCriterion("SITE_IDENTITY <>", value, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityGreaterThan(String value) {
       addCriterion("SITE_IDENTITY >", value, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityGreaterThanOrEqualTo(String value) {
       addCriterion("SITE_IDENTITY >=", value, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityLessThan(String value) {
       addCriterion("SITE_IDENTITY <", value, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityLessThanOrEqualTo(String value) {
       addCriterion("SITE_IDENTITY <=", value, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityLike(String value) {
       addCriterion("SITE_IDENTITY like", value, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityNotLike(String value) {
       addCriterion("SITE_IDENTITY not like", value, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityIn(List<String> values) {
       addCriterion("SITE_IDENTITY in", values, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityNotIn(List<String> values) {
       addCriterion("SITE_IDENTITY not in", values, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityBetween(String value1, String value2) {
       addCriterion("SITE_IDENTITY between", value1, value2, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteIdentityNotBetween(String value1, String value2) {
       addCriterion("SITE_IDENTITY not between", value1, value2, "siteIdentity");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameIsNull() {
       addCriterion("SITE_NAME is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameIsNotNull() {
       addCriterion("SITE_NAME is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameEqualTo(String value) {
       addCriterion("SITE_NAME =", value, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameNotEqualTo(String value) {
       addCriterion("SITE_NAME <>", value, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameGreaterThan(String value) {
       addCriterion("SITE_NAME >", value, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameGreaterThanOrEqualTo(String value) {
       addCriterion("SITE_NAME >=", value, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameLessThan(String value) {
       addCriterion("SITE_NAME <", value, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameLessThanOrEqualTo(String value) {
       addCriterion("SITE_NAME <=", value, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameLike(String value) {
       addCriterion("SITE_NAME like", value, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameNotLike(String value) {
       addCriterion("SITE_NAME not like", value, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameIn(List<String> values) {
       addCriterion("SITE_NAME in", values, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameNotIn(List<String> values) {
       addCriterion("SITE_NAME not in", values, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameBetween(String value1, String value2) {
       addCriterion("SITE_NAME between", value1, value2, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSiteNameNotBetween(String value1, String value2) {
       addCriterion("SITE_NAME not between", value1, value2, "siteName");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoIsNull() {
       addCriterion("SORT_NO is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoIsNotNull() {
       addCriterion("SORT_NO is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoEqualTo(Integer value) {
       addCriterion("SORT_NO =", value, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoNotEqualTo(Integer value) {
       addCriterion("SORT_NO <>", value, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoGreaterThan(Integer value) {
       addCriterion("SORT_NO >", value, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoGreaterThanOrEqualTo(Integer value) {
       addCriterion("SORT_NO >=", value, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoLessThan(Integer value) {
       addCriterion("SORT_NO <", value, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoLessThanOrEqualTo(Integer value) {
       addCriterion("SORT_NO <=", value, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoIn(List<Integer> values) {
       addCriterion("SORT_NO in", values, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoNotIn(List<Integer> values) {
       addCriterion("SORT_NO not in", values, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoBetween(Integer value1, Integer value2) {
       addCriterion("SORT_NO between", value1, value2, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andSortNoNotBetween(Integer value1, Integer value2) {
       addCriterion("SORT_NO not between", value1, value2, "sortNo");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtIsNull() {
       addCriterion("PUB_FILE_EXT is null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtIsNotNull() {
       addCriterion("PUB_FILE_EXT is not null");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtEqualTo(String value) {
       addCriterion("PUB_FILE_EXT =", value, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtNotEqualTo(String value) {
       addCriterion("PUB_FILE_EXT <>", value, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtGreaterThan(String value) {
       addCriterion("PUB_FILE_EXT >", value, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtGreaterThanOrEqualTo(String value) {
       addCriterion("PUB_FILE_EXT >=", value, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtLessThan(String value) {
       addCriterion("PUB_FILE_EXT <", value, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtLessThanOrEqualTo(String value) {
       addCriterion("PUB_FILE_EXT <=", value, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtLike(String value) {
       addCriterion("PUB_FILE_EXT like", value, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtNotLike(String value) {
       addCriterion("PUB_FILE_EXT not like", value, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtIn(List<String> values) {
       addCriterion("PUB_FILE_EXT in", values, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtNotIn(List<String> values) {
       addCriterion("PUB_FILE_EXT not in", values, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtBetween(String value1, String value2) {
       addCriterion("PUB_FILE_EXT between", value1, value2, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
 
     public CapacitySiteInfoExample.Criteria andPubFileExtNotBetween(String value1, String value2) {
       addCriterion("PUB_FILE_EXT not between", value1, value2, "pubFileExt");
       return (CapacitySiteInfoExample.Criteria)this;
     }
   }
 }

