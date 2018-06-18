 package com.myoa.model.meet;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class MeetingRoomExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public MeetingRoomExample()
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
 
   public static class Criteria extends MeetingRoomExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<MeetingRoomExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<MeetingRoomExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<MeetingRoomExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new MeetingRoomExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new MeetingRoomExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new MeetingRoomExample.Criterion(condition, value1, value2));
     }
 
     public MeetingRoomExample.Criteria andSidIsNull() {
       addCriterion("SID is null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidIsNotNull() {
       addCriterion("SID is not null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidEqualTo(Integer value) {
       addCriterion("SID =", value, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidNotEqualTo(Integer value) {
       addCriterion("SID <>", value, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidGreaterThan(Integer value) {
       addCriterion("SID >", value, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidGreaterThanOrEqualTo(Integer value) {
       addCriterion("SID >=", value, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidLessThan(Integer value) {
       addCriterion("SID <", value, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidLessThanOrEqualTo(Integer value) {
       addCriterion("SID <=", value, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidIn(List<Integer> values) {
       addCriterion("SID in", values, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidNotIn(List<Integer> values) {
       addCriterion("SID not in", values, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidBetween(Integer value1, Integer value2) {
       addCriterion("SID between", value1, value2, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andSidNotBetween(Integer value1, Integer value2) {
       addCriterion("SID not between", value1, value2, "sid");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsIsNull() {
       addCriterion("managerIds is null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsIsNotNull() {
       addCriterion("managerIds is not null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsEqualTo(String value) {
       addCriterion("managerIds =", value, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsNotEqualTo(String value) {
       addCriterion("managerIds <>", value, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsGreaterThan(String value) {
       addCriterion("managerIds >", value, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsGreaterThanOrEqualTo(String value) {
       addCriterion("managerIds >=", value, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsLessThan(String value) {
       addCriterion("managerIds <", value, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsLessThanOrEqualTo(String value) {
       addCriterion("managerIds <=", value, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsLike(String value) {
       addCriterion("managerIds like", value, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsNotLike(String value) {
       addCriterion("managerIds not like", value, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsIn(List<String> values) {
       addCriterion("managerIds in", values, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsNotIn(List<String> values) {
       addCriterion("managerIds not in", values, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsBetween(String value1, String value2) {
       addCriterion("managerIds between", value1, value2, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andManageridsNotBetween(String value1, String value2) {
       addCriterion("managerIds not between", value1, value2, "managerids");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityIsNull() {
       addCriterion("MR_CAPACITY is null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityIsNotNull() {
       addCriterion("MR_CAPACITY is not null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityEqualTo(String value) {
       addCriterion("MR_CAPACITY =", value, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityNotEqualTo(String value) {
       addCriterion("MR_CAPACITY <>", value, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityGreaterThan(String value) {
       addCriterion("MR_CAPACITY >", value, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityGreaterThanOrEqualTo(String value) {
       addCriterion("MR_CAPACITY >=", value, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityLessThan(String value) {
       addCriterion("MR_CAPACITY <", value, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityLessThanOrEqualTo(String value) {
       addCriterion("MR_CAPACITY <=", value, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityLike(String value) {
       addCriterion("MR_CAPACITY like", value, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityNotLike(String value) {
       addCriterion("MR_CAPACITY not like", value, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityIn(List<String> values) {
       addCriterion("MR_CAPACITY in", values, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityNotIn(List<String> values) {
       addCriterion("MR_CAPACITY not in", values, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityBetween(String value1, String value2) {
       addCriterion("MR_CAPACITY between", value1, value2, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrCapacityNotBetween(String value1, String value2) {
       addCriterion("MR_CAPACITY not between", value1, value2, "mrCapacity");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameIsNull() {
       addCriterion("MR_NAME is null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameIsNotNull() {
       addCriterion("MR_NAME is not null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameEqualTo(String value) {
       addCriterion("MR_NAME =", value, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameNotEqualTo(String value) {
       addCriterion("MR_NAME <>", value, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameGreaterThan(String value) {
       addCriterion("MR_NAME >", value, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameGreaterThanOrEqualTo(String value) {
       addCriterion("MR_NAME >=", value, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameLessThan(String value) {
       addCriterion("MR_NAME <", value, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameLessThanOrEqualTo(String value) {
       addCriterion("MR_NAME <=", value, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameLike(String value) {
       addCriterion("MR_NAME like", value, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameNotLike(String value) {
       addCriterion("MR_NAME not like", value, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameIn(List<String> values) {
       addCriterion("MR_NAME in", values, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameNotIn(List<String> values) {
       addCriterion("MR_NAME not in", values, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameBetween(String value1, String value2) {
       addCriterion("MR_NAME between", value1, value2, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrNameNotBetween(String value1, String value2) {
       addCriterion("MR_NAME not between", value1, value2, "mrName");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceIsNull() {
       addCriterion("MR_PLACE is null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceIsNotNull() {
       addCriterion("MR_PLACE is not null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceEqualTo(String value) {
       addCriterion("MR_PLACE =", value, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceNotEqualTo(String value) {
       addCriterion("MR_PLACE <>", value, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceGreaterThan(String value) {
       addCriterion("MR_PLACE >", value, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceGreaterThanOrEqualTo(String value) {
       addCriterion("MR_PLACE >=", value, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceLessThan(String value) {
       addCriterion("MR_PLACE <", value, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceLessThanOrEqualTo(String value) {
       addCriterion("MR_PLACE <=", value, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceLike(String value) {
       addCriterion("MR_PLACE like", value, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceNotLike(String value) {
       addCriterion("MR_PLACE not like", value, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceIn(List<String> values) {
       addCriterion("MR_PLACE in", values, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceNotIn(List<String> values) {
       addCriterion("MR_PLACE not in", values, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceBetween(String value1, String value2) {
       addCriterion("MR_PLACE between", value1, value2, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andMrPlaceNotBetween(String value1, String value2) {
       addCriterion("MR_PLACE not between", value1, value2, "mrPlace");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsIsNull() {
       addCriterion("EQUIPMENT_IDS is null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsIsNotNull() {
       addCriterion("EQUIPMENT_IDS is not null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsEqualTo(String value) {
       addCriterion("EQUIPMENT_IDS =", value, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsNotEqualTo(String value) {
       addCriterion("EQUIPMENT_IDS <>", value, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsGreaterThan(String value) {
       addCriterion("EQUIPMENT_IDS >", value, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsGreaterThanOrEqualTo(String value) {
       addCriterion("EQUIPMENT_IDS >=", value, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsLessThan(String value) {
       addCriterion("EQUIPMENT_IDS <", value, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsLessThanOrEqualTo(String value) {
       addCriterion("EQUIPMENT_IDS <=", value, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsLike(String value) {
       addCriterion("EQUIPMENT_IDS like", value, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsNotLike(String value) {
       addCriterion("EQUIPMENT_IDS not like", value, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsIn(List<String> values) {
       addCriterion("EQUIPMENT_IDS in", values, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsNotIn(List<String> values) {
       addCriterion("EQUIPMENT_IDS not in", values, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsBetween(String value1, String value2) {
       addCriterion("EQUIPMENT_IDS between", value1, value2, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentIdsNotBetween(String value1, String value2) {
       addCriterion("EQUIPMENT_IDS not between", value1, value2, "equipmentIds");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesIsNull() {
       addCriterion("EQUIPMENT_NAMES is null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesIsNotNull() {
       addCriterion("EQUIPMENT_NAMES is not null");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesEqualTo(String value) {
       addCriterion("EQUIPMENT_NAMES =", value, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesNotEqualTo(String value) {
       addCriterion("EQUIPMENT_NAMES <>", value, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesGreaterThan(String value) {
       addCriterion("EQUIPMENT_NAMES >", value, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesGreaterThanOrEqualTo(String value) {
       addCriterion("EQUIPMENT_NAMES >=", value, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesLessThan(String value) {
       addCriterion("EQUIPMENT_NAMES <", value, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesLessThanOrEqualTo(String value) {
       addCriterion("EQUIPMENT_NAMES <=", value, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesLike(String value) {
       addCriterion("EQUIPMENT_NAMES like", value, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesNotLike(String value) {
       addCriterion("EQUIPMENT_NAMES not like", value, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesIn(List<String> values) {
       addCriterion("EQUIPMENT_NAMES in", values, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesNotIn(List<String> values) {
       addCriterion("EQUIPMENT_NAMES not in", values, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesBetween(String value1, String value2) {
       addCriterion("EQUIPMENT_NAMES between", value1, value2, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
 
     public MeetingRoomExample.Criteria andEquipmentNamesNotBetween(String value1, String value2) {
       addCriterion("EQUIPMENT_NAMES not between", value1, value2, "equipmentNames");
       return (MeetingRoomExample.Criteria)this;
     }
   }
 }

