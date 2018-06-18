 package com.myoa.model.meet;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 
 public class MeetingAttendConfirmExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public MeetingAttendConfirmExample()
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
 
   public static class Criteria extends MeetingAttendConfirmExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<MeetingAttendConfirmExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<MeetingAttendConfirmExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<MeetingAttendConfirmExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new MeetingAttendConfirmExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new MeetingAttendConfirmExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new MeetingAttendConfirmExample.Criterion(condition, value1, value2));
     }
 
     public MeetingAttendConfirmExample.Criteria andSidIsNull() {
       addCriterion("SID is null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidIsNotNull() {
       addCriterion("SID is not null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidEqualTo(Integer value) {
       addCriterion("SID =", value, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidNotEqualTo(Integer value) {
       addCriterion("SID <>", value, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidGreaterThan(Integer value) {
       addCriterion("SID >", value, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidGreaterThanOrEqualTo(Integer value) {
       addCriterion("SID >=", value, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidLessThan(Integer value) {
       addCriterion("SID <", value, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidLessThanOrEqualTo(Integer value) {
       addCriterion("SID <=", value, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidIn(List<Integer> values) {
       addCriterion("SID in", values, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidNotIn(List<Integer> values) {
       addCriterion("SID not in", values, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidBetween(Integer value1, Integer value2) {
       addCriterion("SID between", value1, value2, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andSidNotBetween(Integer value1, Integer value2) {
       addCriterion("SID not between", value1, value2, "sid");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagIsNull() {
       addCriterion("ATTEND_FLAG is null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagIsNotNull() {
       addCriterion("ATTEND_FLAG is not null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagEqualTo(Integer value) {
       addCriterion("ATTEND_FLAG =", value, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagNotEqualTo(Integer value) {
       addCriterion("ATTEND_FLAG <>", value, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagGreaterThan(Integer value) {
       addCriterion("ATTEND_FLAG >", value, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagGreaterThanOrEqualTo(Integer value) {
       addCriterion("ATTEND_FLAG >=", value, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagLessThan(Integer value) {
       addCriterion("ATTEND_FLAG <", value, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagLessThanOrEqualTo(Integer value) {
       addCriterion("ATTEND_FLAG <=", value, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagIn(List<Integer> values) {
       addCriterion("ATTEND_FLAG in", values, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagNotIn(List<Integer> values) {
       addCriterion("ATTEND_FLAG not in", values, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagBetween(Integer value1, Integer value2) {
       addCriterion("ATTEND_FLAG between", value1, value2, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andAttendFlagNotBetween(Integer value1, Integer value2) {
       addCriterion("ATTEND_FLAG not between", value1, value2, "attendFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeIsNull() {
       addCriterion("CONFIRM_TIME is null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeIsNotNull() {
       addCriterion("CONFIRM_TIME is not null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeEqualTo(Date value) {
       addCriterion("CONFIRM_TIME =", value, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeNotEqualTo(Date value) {
       addCriterion("CONFIRM_TIME <>", value, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeGreaterThan(Date value) {
       addCriterion("CONFIRM_TIME >", value, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("CONFIRM_TIME >=", value, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeLessThan(Date value) {
       addCriterion("CONFIRM_TIME <", value, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
       addCriterion("CONFIRM_TIME <=", value, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeIn(List<Date> values) {
       addCriterion("CONFIRM_TIME in", values, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeNotIn(List<Date> values) {
       addCriterion("CONFIRM_TIME not in", values, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeBetween(Date value1, Date value2) {
       addCriterion("CONFIRM_TIME between", value1, value2, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
       addCriterion("CONFIRM_TIME not between", value1, value2, "confirmTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeIsNull() {
       addCriterion("CREATE_TIME is null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("CREATE_TIME is not null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeEqualTo(Date value) {
       addCriterion("CREATE_TIME =", value, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeNotEqualTo(Date value) {
       addCriterion("CREATE_TIME <>", value, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeGreaterThan(Date value) {
       addCriterion("CREATE_TIME >", value, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME >=", value, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeLessThan(Date value) {
       addCriterion("CREATE_TIME <", value, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
       addCriterion("CREATE_TIME <=", value, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeIn(List<Date> values) {
       addCriterion("CREATE_TIME in", values, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeNotIn(List<Date> values) {
       addCriterion("CREATE_TIME not in", values, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME between", value1, value2, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
       addCriterion("CREATE_TIME not between", value1, value2, "createTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdIsNull() {
       addCriterion("MEETING_ID is null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdIsNotNull() {
       addCriterion("MEETING_ID is not null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdEqualTo(Integer value) {
       addCriterion("MEETING_ID =", value, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdNotEqualTo(Integer value) {
       addCriterion("MEETING_ID <>", value, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdGreaterThan(Integer value) {
       addCriterion("MEETING_ID >", value, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("MEETING_ID >=", value, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdLessThan(Integer value) {
       addCriterion("MEETING_ID <", value, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdLessThanOrEqualTo(Integer value) {
       addCriterion("MEETING_ID <=", value, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdIn(List<Integer> values) {
       addCriterion("MEETING_ID in", values, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdNotIn(List<Integer> values) {
       addCriterion("MEETING_ID not in", values, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdBetween(Integer value1, Integer value2) {
       addCriterion("MEETING_ID between", value1, value2, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andMeetingIdNotBetween(Integer value1, Integer value2) {
       addCriterion("MEETING_ID not between", value1, value2, "meetingId");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagIsNull() {
       addCriterion("READ_FLAG is null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagIsNotNull() {
       addCriterion("READ_FLAG is not null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagEqualTo(Integer value) {
       addCriterion("READ_FLAG =", value, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagNotEqualTo(Integer value) {
       addCriterion("READ_FLAG <>", value, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagGreaterThan(Integer value) {
       addCriterion("READ_FLAG >", value, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagGreaterThanOrEqualTo(Integer value) {
       addCriterion("READ_FLAG >=", value, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagLessThan(Integer value) {
       addCriterion("READ_FLAG <", value, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagLessThanOrEqualTo(Integer value) {
       addCriterion("READ_FLAG <=", value, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagIn(List<Integer> values) {
       addCriterion("READ_FLAG in", values, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagNotIn(List<Integer> values) {
       addCriterion("READ_FLAG not in", values, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagBetween(Integer value1, Integer value2) {
       addCriterion("READ_FLAG between", value1, value2, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadFlagNotBetween(Integer value1, Integer value2) {
       addCriterion("READ_FLAG not between", value1, value2, "readFlag");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeIsNull() {
       addCriterion("READING_TIME is null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeIsNotNull() {
       addCriterion("READING_TIME is not null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeEqualTo(Date value) {
       addCriterion("READING_TIME =", value, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeNotEqualTo(Date value) {
       addCriterion("READING_TIME <>", value, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeGreaterThan(Date value) {
       addCriterion("READING_TIME >", value, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeGreaterThanOrEqualTo(Date value) {
       addCriterion("READING_TIME >=", value, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeLessThan(Date value) {
       addCriterion("READING_TIME <", value, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeLessThanOrEqualTo(Date value) {
       addCriterion("READING_TIME <=", value, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeIn(List<Date> values) {
       addCriterion("READING_TIME in", values, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeNotIn(List<Date> values) {
       addCriterion("READING_TIME not in", values, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeBetween(Date value1, Date value2) {
       addCriterion("READING_TIME between", value1, value2, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andReadingTimeNotBetween(Date value1, Date value2) {
       addCriterion("READING_TIME not between", value1, value2, "readingTime");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkIsNull() {
       addCriterion("REMARK is null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkIsNotNull() {
       addCriterion("REMARK is not null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkEqualTo(String value) {
       addCriterion("REMARK =", value, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkNotEqualTo(String value) {
       addCriterion("REMARK <>", value, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkGreaterThan(String value) {
       addCriterion("REMARK >", value, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkGreaterThanOrEqualTo(String value) {
       addCriterion("REMARK >=", value, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkLessThan(String value) {
       addCriterion("REMARK <", value, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkLessThanOrEqualTo(String value) {
       addCriterion("REMARK <=", value, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkLike(String value) {
       addCriterion("REMARK like", value, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkNotLike(String value) {
       addCriterion("REMARK not like", value, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkIn(List<String> values) {
       addCriterion("REMARK in", values, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkNotIn(List<String> values) {
       addCriterion("REMARK not in", values, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkBetween(String value1, String value2) {
       addCriterion("REMARK between", value1, value2, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andRemarkNotBetween(String value1, String value2) {
       addCriterion("REMARK not between", value1, value2, "remark");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserIsNull() {
       addCriterion("CREATE_USER is null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserIsNotNull() {
       addCriterion("CREATE_USER is not null");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserEqualTo(Integer value) {
       addCriterion("CREATE_USER =", value, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserNotEqualTo(Integer value) {
       addCriterion("CREATE_USER <>", value, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserGreaterThan(Integer value) {
       addCriterion("CREATE_USER >", value, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
       addCriterion("CREATE_USER >=", value, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserLessThan(Integer value) {
       addCriterion("CREATE_USER <", value, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserLessThanOrEqualTo(Integer value) {
       addCriterion("CREATE_USER <=", value, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserIn(List<Integer> values) {
       addCriterion("CREATE_USER in", values, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserNotIn(List<Integer> values) {
       addCriterion("CREATE_USER not in", values, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserBetween(Integer value1, Integer value2) {
       addCriterion("CREATE_USER between", value1, value2, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
 
     public MeetingAttendConfirmExample.Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
       addCriterion("CREATE_USER not between", value1, value2, "createUser");
       return (MeetingAttendConfirmExample.Criteria)this;
     }
   }
 }

