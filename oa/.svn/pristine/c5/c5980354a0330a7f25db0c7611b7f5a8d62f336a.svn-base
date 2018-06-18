 package com.myoa.model.event;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class TimelineEventExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public TimelineEventExample()
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
 
   public static class Criteria extends TimelineEventExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<TimelineEventExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }

    public List<TimelineEventExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TimelineEventExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TimelineEventExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TimelineEventExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TimelineEventExample.Criterion(condition, value1, value2));
    }

    public TimelineEventExample.Criteria andUuidIsNull() {
      addCriterion("UUID is null");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andUuidIsNotNull() {
      addCriterion("UUID is not null");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andUuidEqualTo(String value) {
      addCriterion("UUID =", value, "uuid");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andUuidNotEqualTo(String value) {
      addCriterion("UUID <>", value, "uuid");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andUuidGreaterThan(String value) {
      addCriterion("UUID >", value, "uuid");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andUuidGreaterThanOrEqualTo(String value) {
      addCriterion("UUID >=", value, "uuid");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andUuidLessThan(String value) {
      addCriterion("UUID <", value, "uuid");
      return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUuidLessThanOrEqualTo(String value) {
       addCriterion("UUID <=", value, "uuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUuidLike(String value) {
       addCriterion("UUID like", value, "uuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUuidNotLike(String value) {
       addCriterion("UUID not like", value, "uuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUuidIn(List<String> values) {
       addCriterion("UUID in", values, "uuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUuidNotIn(List<String> values) {
       addCriterion("UUID not in", values, "uuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUuidBetween(String value1, String value2) {
       addCriterion("UUID between", value1, value2, "uuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUuidNotBetween(String value1, String value2) {
       addCriterion("UUID not between", value1, value2, "uuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeIsNull() {
       addCriterion("CR_TIME is null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeIsNotNull() {
       addCriterion("CR_TIME is not null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeEqualTo(Date value) {
       addCriterion("CR_TIME =", value, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeNotEqualTo(Date value) {
       addCriterion("CR_TIME <>", value, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeGreaterThan(Date value) {
       addCriterion("CR_TIME >", value, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("CR_TIME >=", value, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeLessThan(Date value) {
       addCriterion("CR_TIME <", value, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeLessThanOrEqualTo(Date value) {
       addCriterion("CR_TIME <=", value, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeIn(List<Date> values) {
       addCriterion("CR_TIME in", values, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeNotIn(List<Date> values) {
       addCriterion("CR_TIME not in", values, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeBetween(Date value1, Date value2) {
       addCriterion("CR_TIME between", value1, value2, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrTimeNotBetween(Date value1, Date value2) {
       addCriterion("CR_TIME not between", value1, value2, "crTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeIsNull() {
       addCriterion("END_TIME is null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeIsNotNull() {
       addCriterion("END_TIME is not null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeEqualTo(Date value) {
       addCriterion("END_TIME =", value, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeNotEqualTo(Date value) {
       addCriterion("END_TIME <>", value, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeGreaterThan(Date value) {
       addCriterion("END_TIME >", value, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("END_TIME >=", value, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeLessThan(Date value) {
       addCriterion("END_TIME <", value, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeLessThanOrEqualTo(Date value) {
       addCriterion("END_TIME <=", value, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeIn(List<Date> values) {
       addCriterion("END_TIME in", values, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeNotIn(List<Date> values) {
       addCriterion("END_TIME not in", values, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeBetween(Date value1, Date value2) {
       addCriterion("END_TIME between", value1, value2, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andEndTimeNotBetween(Date value1, Date value2) {
       addCriterion("END_TIME not between", value1, value2, "endTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeIsNull() {
       addCriterion("LAST_EDIT_TIME is null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeIsNotNull() {
       addCriterion("LAST_EDIT_TIME is not null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeEqualTo(Date value) {
       addCriterion("LAST_EDIT_TIME =", value, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeNotEqualTo(Date value) {
       addCriterion("LAST_EDIT_TIME <>", value, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeGreaterThan(Date value) {
       addCriterion("LAST_EDIT_TIME >", value, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("LAST_EDIT_TIME >=", value, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeLessThan(Date value) {
       addCriterion("LAST_EDIT_TIME <", value, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeLessThanOrEqualTo(Date value) {
       addCriterion("LAST_EDIT_TIME <=", value, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeIn(List<Date> values) {
       addCriterion("LAST_EDIT_TIME in", values, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeNotIn(List<Date> values) {
       addCriterion("LAST_EDIT_TIME not in", values, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeBetween(Date value1, Date value2) {
       addCriterion("LAST_EDIT_TIME between", value1, value2, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andLastEditTimeNotBetween(Date value1, Date value2) {
       addCriterion("LAST_EDIT_TIME not between", value1, value2, "lastEditTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeIsNull() {
       addCriterion("START_TIME is null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeIsNotNull() {
       addCriterion("START_TIME is not null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeEqualTo(Date value) {
       addCriterion("START_TIME =", value, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeNotEqualTo(Date value) {
       addCriterion("START_TIME <>", value, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeGreaterThan(Date value) {
       addCriterion("START_TIME >", value, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("START_TIME >=", value, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeLessThan(Date value) {
       addCriterion("START_TIME <", value, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeLessThanOrEqualTo(Date value) {
       addCriterion("START_TIME <=", value, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeIn(List<Date> values) {
       addCriterion("START_TIME in", values, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeNotIn(List<Date> values) {
       addCriterion("START_TIME not in", values, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeBetween(Date value1, Date value2) {
       addCriterion("START_TIME between", value1, value2, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andStartTimeNotBetween(Date value1, Date value2) {
       addCriterion("START_TIME not between", value1, value2, "startTime");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTitleIsNull() {
       addCriterion("TITLE_ is null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTitleIsNotNull() {
       addCriterion("TITLE_ is not null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTitleEqualTo(String value) {
       addCriterion("TITLE_ =", value, "title");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTitleNotEqualTo(String value) {
       addCriterion("TITLE_ <>", value, "title");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTitleGreaterThan(String value) {
       addCriterion("TITLE_ >", value, "title");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
       addCriterion("TITLE_ >=", value, "title");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTitleLessThan(String value) {
       addCriterion("TITLE_ <", value, "title");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTitleLessThanOrEqualTo(String value) {
      addCriterion("TITLE_ <=", value, "title");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andTitleLike(String value) {
      addCriterion("TITLE_ like", value, "title");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andTitleNotLike(String value) {
      addCriterion("TITLE_ not like", value, "title");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andTitleIn(List<String> values) {
      addCriterion("TITLE_ in", values, "title");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andTitleNotIn(List<String> values) {
      addCriterion("TITLE_ not in", values, "title");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andTitleBetween(String value1, String value2) {
      addCriterion("TITLE_ between", value1, value2, "title");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andTitleNotBetween(String value1, String value2) {
      addCriterion("TITLE_ not between", value1, value2, "title");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andCrUserIdIsNull() {
      addCriterion("CR_USER_ID is null");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andCrUserIdIsNotNull() {
      addCriterion("CR_USER_ID is not null");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andCrUserIdEqualTo(Integer value) {
      addCriterion("CR_USER_ID =", value, "crUserId");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andCrUserIdNotEqualTo(Integer value) {
      addCriterion("CR_USER_ID <>", value, "crUserId");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andCrUserIdGreaterThan(Integer value) {
      addCriterion("CR_USER_ID >", value, "crUserId");
      return (TimelineEventExample.Criteria)this;
    }

    public TimelineEventExample.Criteria andCrUserIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("CR_USER_ID >=", value, "crUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrUserIdLessThan(Integer value) {
       addCriterion("CR_USER_ID <", value, "crUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrUserIdLessThanOrEqualTo(Integer value) {
       addCriterion("CR_USER_ID <=", value, "crUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrUserIdIn(List<Integer> values) {
       addCriterion("CR_USER_ID in", values, "crUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrUserIdNotIn(List<Integer> values) {
       addCriterion("CR_USER_ID not in", values, "crUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrUserIdBetween(Integer value1, Integer value2) {
       addCriterion("CR_USER_ID between", value1, value2, "crUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andCrUserIdNotBetween(Integer value1, Integer value2) {
       addCriterion("CR_USER_ID not between", value1, value2, "crUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdIsNull() {
       addCriterion("UPDATE_USER_ID is null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdIsNotNull() {
       addCriterion("UPDATE_USER_ID is not null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdEqualTo(Integer value) {
       addCriterion("UPDATE_USER_ID =", value, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdNotEqualTo(Integer value) {
       addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdGreaterThan(Integer value) {
       addCriterion("UPDATE_USER_ID >", value, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdLessThan(Integer value) {
       addCriterion("UPDATE_USER_ID <", value, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdLessThanOrEqualTo(Integer value) {
       addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdIn(List<Integer> values) {
       addCriterion("UPDATE_USER_ID in", values, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdNotIn(List<Integer> values) {
       addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdBetween(Integer value1, Integer value2) {
       addCriterion("UPDATE_USER_ID between", value1, value2, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andUpdateUserIdNotBetween(Integer value1, Integer value2) {
       addCriterion("UPDATE_USER_ID not between", value1, value2, "updateUserId");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidIsNull() {
       addCriterion("TIMELINE_UUID is null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidIsNotNull() {
       addCriterion("TIMELINE_UUID is not null");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidEqualTo(String value) {
       addCriterion("TIMELINE_UUID =", value, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidNotEqualTo(String value) {
       addCriterion("TIMELINE_UUID <>", value, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidGreaterThan(String value) {
       addCriterion("TIMELINE_UUID >", value, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidGreaterThanOrEqualTo(String value) {
       addCriterion("TIMELINE_UUID >=", value, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidLessThan(String value) {
       addCriterion("TIMELINE_UUID <", value, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidLessThanOrEqualTo(String value) {
       addCriterion("TIMELINE_UUID <=", value, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidLike(String value) {
       addCriterion("TIMELINE_UUID like", value, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidNotLike(String value) {
       addCriterion("TIMELINE_UUID not like", value, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidIn(List<String> values) {
       addCriterion("TIMELINE_UUID in", values, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidNotIn(List<String> values) {
       addCriterion("TIMELINE_UUID not in", values, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidBetween(String value1, String value2) {
       addCriterion("TIMELINE_UUID between", value1, value2, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
 
     public TimelineEventExample.Criteria andTimelineUuidNotBetween(String value1, String value2) {
       addCriterion("TIMELINE_UUID not between", value1, value2, "timelineUuid");
       return (TimelineEventExample.Criteria)this;
     }
   }
 }

