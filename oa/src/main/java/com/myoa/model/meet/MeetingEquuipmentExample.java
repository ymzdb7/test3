 package com.myoa.model.meet;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class MeetingEquuipmentExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public MeetingEquuipmentExample()
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
 
   public static class Criteria extends MeetingEquuipmentExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<MeetingEquuipmentExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<MeetingEquuipmentExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<MeetingEquuipmentExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new MeetingEquuipmentExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new MeetingEquuipmentExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new MeetingEquuipmentExample.Criterion(condition, value1, value2));
     }
 
     public MeetingEquuipmentExample.Criteria andSidIsNull() {
       addCriterion("SID is null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidIsNotNull() {
       addCriterion("SID is not null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidEqualTo(Integer value) {
       addCriterion("SID =", value, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidNotEqualTo(Integer value) {
       addCriterion("SID <>", value, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidGreaterThan(Integer value) {
       addCriterion("SID >", value, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidGreaterThanOrEqualTo(Integer value) {
       addCriterion("SID >=", value, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidLessThan(Integer value) {
       addCriterion("SID <", value, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidLessThanOrEqualTo(Integer value) {
       addCriterion("SID <=", value, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidIn(List<Integer> values) {
       addCriterion("SID in", values, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidNotIn(List<Integer> values) {
       addCriterion("SID not in", values, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidBetween(Integer value1, Integer value2) {
       addCriterion("SID between", value1, value2, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andSidNotBetween(Integer value1, Integer value2) {
       addCriterion("SID not between", value1, value2, "sid");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameIsNull() {
       addCriterion("EQUIPMENT_NAME is null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameIsNotNull() {
       addCriterion("EQUIPMENT_NAME is not null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameEqualTo(String value) {
       addCriterion("EQUIPMENT_NAME =", value, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameNotEqualTo(String value) {
       addCriterion("EQUIPMENT_NAME <>", value, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameGreaterThan(String value) {
       addCriterion("EQUIPMENT_NAME >", value, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
       addCriterion("EQUIPMENT_NAME >=", value, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameLessThan(String value) {
       addCriterion("EQUIPMENT_NAME <", value, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameLessThanOrEqualTo(String value) {
       addCriterion("EQUIPMENT_NAME <=", value, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameLike(String value) {
       addCriterion("EQUIPMENT_NAME like", value, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameNotLike(String value) {
       addCriterion("EQUIPMENT_NAME not like", value, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameIn(List<String> values) {
       addCriterion("EQUIPMENT_NAME in", values, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameNotIn(List<String> values) {
       addCriterion("EQUIPMENT_NAME not in", values, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameBetween(String value1, String value2) {
       addCriterion("EQUIPMENT_NAME between", value1, value2, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNameNotBetween(String value1, String value2) {
       addCriterion("EQUIPMENT_NAME not between", value1, value2, "equipmentName");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoIsNull() {
       addCriterion("EQUIPMENT_NO is null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoIsNotNull() {
       addCriterion("EQUIPMENT_NO is not null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoEqualTo(String value) {
       addCriterion("EQUIPMENT_NO =", value, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoNotEqualTo(String value) {
       addCriterion("EQUIPMENT_NO <>", value, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoGreaterThan(String value) {
       addCriterion("EQUIPMENT_NO >", value, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoGreaterThanOrEqualTo(String value) {
       addCriterion("EQUIPMENT_NO >=", value, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoLessThan(String value) {
       addCriterion("EQUIPMENT_NO <", value, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoLessThanOrEqualTo(String value) {
       addCriterion("EQUIPMENT_NO <=", value, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoLike(String value) {
       addCriterion("EQUIPMENT_NO like", value, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoNotLike(String value) {
       addCriterion("EQUIPMENT_NO not like", value, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoIn(List<String> values) {
       addCriterion("EQUIPMENT_NO in", values, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoNotIn(List<String> values) {
       addCriterion("EQUIPMENT_NO not in", values, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoBetween(String value1, String value2) {
       addCriterion("EQUIPMENT_NO between", value1, value2, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andEquipmentNoNotBetween(String value1, String value2) {
       addCriterion("EQUIPMENT_NO not between", value1, value2, "equipmentNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoIsNull() {
       addCriterion("GROUP_NO is null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoIsNotNull() {
       addCriterion("GROUP_NO is not null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoEqualTo(String value) {
       addCriterion("GROUP_NO =", value, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoNotEqualTo(String value) {
       addCriterion("GROUP_NO <>", value, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoGreaterThan(String value) {
       addCriterion("GROUP_NO >", value, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoGreaterThanOrEqualTo(String value) {
       addCriterion("GROUP_NO >=", value, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoLessThan(String value) {
       addCriterion("GROUP_NO <", value, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoLessThanOrEqualTo(String value) {
       addCriterion("GROUP_NO <=", value, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoLike(String value) {
       addCriterion("GROUP_NO like", value, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoNotLike(String value) {
       addCriterion("GROUP_NO not like", value, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoIn(List<String> values) {
       addCriterion("GROUP_NO in", values, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoNotIn(List<String> values) {
       addCriterion("GROUP_NO not in", values, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoBetween(String value1, String value2) {
       addCriterion("GROUP_NO between", value1, value2, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andGroupNoNotBetween(String value1, String value2) {
       addCriterion("GROUP_NO not between", value1, value2, "groupNo");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusIsNull() {
       addCriterion("STATUS is null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusIsNotNull() {
       addCriterion("STATUS is not null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusEqualTo(Integer value) {
       addCriterion("STATUS =", value, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusNotEqualTo(Integer value) {
       addCriterion("STATUS <>", value, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusGreaterThan(Integer value) {
       addCriterion("STATUS >", value, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("STATUS >=", value, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusLessThan(Integer value) {
       addCriterion("STATUS <", value, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
       addCriterion("STATUS <=", value, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusIn(List<Integer> values) {
       addCriterion("STATUS in", values, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusNotIn(List<Integer> values) {
       addCriterion("STATUS not in", values, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusBetween(Integer value1, Integer value2) {
       addCriterion("STATUS between", value1, value2, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("STATUS not between", value1, value2, "status");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdIsNull() {
       addCriterion("MEETING_ROOM_ID is null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdIsNotNull() {
       addCriterion("MEETING_ROOM_ID is not null");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdEqualTo(Integer value) {
       addCriterion("MEETING_ROOM_ID =", value, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdNotEqualTo(Integer value) {
       addCriterion("MEETING_ROOM_ID <>", value, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdGreaterThan(Integer value) {
       addCriterion("MEETING_ROOM_ID >", value, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("MEETING_ROOM_ID >=", value, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdLessThan(Integer value) {
       addCriterion("MEETING_ROOM_ID <", value, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdLessThanOrEqualTo(Integer value) {
       addCriterion("MEETING_ROOM_ID <=", value, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdIn(List<Integer> values) {
       addCriterion("MEETING_ROOM_ID in", values, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdNotIn(List<Integer> values) {
       addCriterion("MEETING_ROOM_ID not in", values, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdBetween(Integer value1, Integer value2) {
       addCriterion("MEETING_ROOM_ID between", value1, value2, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
 
     public MeetingEquuipmentExample.Criteria andMeetingRoomIdNotBetween(Integer value1, Integer value2) {
       addCriterion("MEETING_ROOM_ID not between", value1, value2, "meetingRoomId");
       return (MeetingEquuipmentExample.Criteria)this;
     }
   }
 }

