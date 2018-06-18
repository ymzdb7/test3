 package com.myoa.model.meet;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class MeetingExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria;
 
   public MeetingExample()
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
 
   public static class Criteria extends MeetingExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<MeetingExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<MeetingExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<MeetingExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new MeetingExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new MeetingExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new MeetingExample.Criterion(condition, value1, value2));
     }
 
     public MeetingExample.Criteria andSidIsNull() {
       addCriterion("SID is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidIsNotNull() {
       addCriterion("SID is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidEqualTo(Integer value) {
       addCriterion("SID =", value, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidNotEqualTo(Integer value) {
       addCriterion("SID <>", value, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidGreaterThan(Integer value) {
       addCriterion("SID >", value, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidGreaterThanOrEqualTo(Integer value) {
       addCriterion("SID >=", value, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidLessThan(Integer value) {
       addCriterion("SID <", value, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidLessThanOrEqualTo(Integer value) {
       addCriterion("SID <=", value, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidIn(List<Integer> values) {
       addCriterion("SID in", values, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidNotIn(List<Integer> values) {
       addCriterion("SID not in", values, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidBetween(Integer value1, Integer value2) {
       addCriterion("SID between", value1, value2, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSidNotBetween(Integer value1, Integer value2) {
       addCriterion("SID not between", value1, value2, "sid");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeIsNull() {
       addCriterion("CREATE_TIME is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeIsNotNull() {
       addCriterion("CREATE_TIME is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeEqualTo(Long value) {
       addCriterion("CREATE_TIME =", value, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeNotEqualTo(Long value) {
       addCriterion("CREATE_TIME <>", value, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeGreaterThan(Long value) {
       addCriterion("CREATE_TIME >", value, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
       addCriterion("CREATE_TIME >=", value, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeLessThan(Long value) {
       addCriterion("CREATE_TIME <", value, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeLessThanOrEqualTo(Long value) {
       addCriterion("CREATE_TIME <=", value, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeIn(List<Long> values) {
       addCriterion("CREATE_TIME in", values, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeNotIn(List<Long> values) {
       addCriterion("CREATE_TIME not in", values, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeBetween(Long value1, Long value2) {
       addCriterion("CREATE_TIME between", value1, value2, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andCreateTimeNotBetween(Long value1, Long value2) {
       addCriterion("CREATE_TIME not between", value1, value2, "createTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeIsNull() {
       addCriterion("END_TIME is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeIsNotNull() {
       addCriterion("END_TIME is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeEqualTo(Long value) {
       addCriterion("END_TIME =", value, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeNotEqualTo(Long value) {
       addCriterion("END_TIME <>", value, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeGreaterThan(Long value) {
       addCriterion("END_TIME >", value, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
       addCriterion("END_TIME >=", value, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeLessThan(Long value) {
       addCriterion("END_TIME <", value, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeLessThanOrEqualTo(Long value) {
       addCriterion("END_TIME <=", value, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeIn(List<Long> values) {
       addCriterion("END_TIME in", values, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeNotIn(List<Long> values) {
       addCriterion("END_TIME not in", values, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeBetween(Long value1, Long value2) {
       addCriterion("END_TIME between", value1, value2, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andEndTimeNotBetween(Long value1, Long value2) {
       addCriterion("END_TIME not between", value1, value2, "endTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarIsNull() {
       addCriterion("IS_WRITE_CALEDNAR is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarIsNotNull() {
       addCriterion("IS_WRITE_CALEDNAR is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarEqualTo(Integer value) {
       addCriterion("IS_WRITE_CALEDNAR =", value, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarNotEqualTo(Integer value) {
       addCriterion("IS_WRITE_CALEDNAR <>", value, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarGreaterThan(Integer value) {
       addCriterion("IS_WRITE_CALEDNAR >", value, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarGreaterThanOrEqualTo(Integer value) {
       addCriterion("IS_WRITE_CALEDNAR >=", value, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarLessThan(Integer value) {
       addCriterion("IS_WRITE_CALEDNAR <", value, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarLessThanOrEqualTo(Integer value) {
       addCriterion("IS_WRITE_CALEDNAR <=", value, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarIn(List<Integer> values) {
       addCriterion("IS_WRITE_CALEDNAR in", values, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarNotIn(List<Integer> values) {
       addCriterion("IS_WRITE_CALEDNAR not in", values, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarBetween(Integer value1, Integer value2) {
       addCriterion("IS_WRITE_CALEDNAR between", value1, value2, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsWriteCalednarNotBetween(Integer value1, Integer value2) {
       addCriterion("IS_WRITE_CALEDNAR not between", value1, value2, "isWriteCalednar");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameIsNull() {
       addCriterion("MEET_NAME is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameIsNotNull() {
       addCriterion("MEET_NAME is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameEqualTo(String value) {
       addCriterion("MEET_NAME =", value, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameNotEqualTo(String value) {
       addCriterion("MEET_NAME <>", value, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameGreaterThan(String value) {
       addCriterion("MEET_NAME >", value, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameGreaterThanOrEqualTo(String value) {
       addCriterion("MEET_NAME >=", value, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameLessThan(String value) {
       addCriterion("MEET_NAME <", value, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameLessThanOrEqualTo(String value) {
       addCriterion("MEET_NAME <=", value, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameLike(String value) {
       addCriterion("MEET_NAME like", value, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameNotLike(String value) {
       addCriterion("MEET_NAME not like", value, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameIn(List<String> values) {
       addCriterion("MEET_NAME in", values, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameNotIn(List<String> values) {
       addCriterion("MEET_NAME not in", values, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameBetween(String value1, String value2) {
       addCriterion("MEET_NAME between", value1, value2, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetNameNotBetween(String value1, String value2) {
       addCriterion("MEET_NAME not between", value1, value2, "meetName");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourIsNull() {
       addCriterion("RESEND_HOUR is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourIsNotNull() {
       addCriterion("RESEND_HOUR is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourEqualTo(Integer value) {
       addCriterion("RESEND_HOUR =", value, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourNotEqualTo(Integer value) {
       addCriterion("RESEND_HOUR <>", value, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourGreaterThan(Integer value) {
       addCriterion("RESEND_HOUR >", value, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourGreaterThanOrEqualTo(Integer value) {
       addCriterion("RESEND_HOUR >=", value, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourLessThan(Integer value) {
       addCriterion("RESEND_HOUR <", value, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourLessThanOrEqualTo(Integer value) {
       addCriterion("RESEND_HOUR <=", value, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourIn(List<Integer> values) {
       addCriterion("RESEND_HOUR in", values, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourNotIn(List<Integer> values) {
       addCriterion("RESEND_HOUR not in", values, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourBetween(Integer value1, Integer value2) {
       addCriterion("RESEND_HOUR between", value1, value2, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendHourNotBetween(Integer value1, Integer value2) {
       addCriterion("RESEND_HOUR not between", value1, value2, "resendHour");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteIsNull() {
       addCriterion("RESEND_MINUTE is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteIsNotNull() {
       addCriterion("RESEND_MINUTE is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteEqualTo(Integer value) {
       addCriterion("RESEND_MINUTE =", value, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteNotEqualTo(Integer value) {
       addCriterion("RESEND_MINUTE <>", value, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteGreaterThan(Integer value) {
       addCriterion("RESEND_MINUTE >", value, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteGreaterThanOrEqualTo(Integer value) {
       addCriterion("RESEND_MINUTE >=", value, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteLessThan(Integer value) {
       addCriterion("RESEND_MINUTE <", value, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteLessThanOrEqualTo(Integer value) {
       addCriterion("RESEND_MINUTE <=", value, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteIn(List<Integer> values) {
       addCriterion("RESEND_MINUTE in", values, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteNotIn(List<Integer> values) {
       addCriterion("RESEND_MINUTE not in", values, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteBetween(Integer value1, Integer value2) {
       addCriterion("RESEND_MINUTE between", value1, value2, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendMinuteNotBetween(Integer value1, Integer value2) {
       addCriterion("RESEND_MINUTE not between", value1, value2, "resendMinute");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralIsNull() {
       addCriterion("RESEND_SEVERAL is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralIsNotNull() {
       addCriterion("RESEND_SEVERAL is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralEqualTo(Integer value) {
       addCriterion("RESEND_SEVERAL =", value, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralNotEqualTo(Integer value) {
       addCriterion("RESEND_SEVERAL <>", value, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralGreaterThan(Integer value) {
       addCriterion("RESEND_SEVERAL >", value, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralGreaterThanOrEqualTo(Integer value) {
       addCriterion("RESEND_SEVERAL >=", value, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralLessThan(Integer value) {
       addCriterion("RESEND_SEVERAL <", value, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralLessThanOrEqualTo(Integer value) {
       addCriterion("RESEND_SEVERAL <=", value, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralIn(List<Integer> values) {
       addCriterion("RESEND_SEVERAL in", values, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralNotIn(List<Integer> values) {
       addCriterion("RESEND_SEVERAL not in", values, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralBetween(Integer value1, Integer value2) {
       addCriterion("RESEND_SEVERAL between", value1, value2, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andResendSeveralNotBetween(Integer value1, Integer value2) {
       addCriterion("RESEND_SEVERAL not between", value1, value2, "resendSeveral");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindIsNull() {
       addCriterion("SMS2_REMIND is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindIsNotNull() {
       addCriterion("SMS2_REMIND is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindEqualTo(String value) {
       addCriterion("SMS2_REMIND =", value, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindNotEqualTo(String value) {
       addCriterion("SMS2_REMIND <>", value, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindGreaterThan(String value) {
       addCriterion("SMS2_REMIND >", value, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindGreaterThanOrEqualTo(String value) {
       addCriterion("SMS2_REMIND >=", value, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindLessThan(String value) {
       addCriterion("SMS2_REMIND <", value, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindLessThanOrEqualTo(String value) {
       addCriterion("SMS2_REMIND <=", value, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindLike(String value) {
       addCriterion("SMS2_REMIND like", value, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindNotLike(String value) {
       addCriterion("SMS2_REMIND not like", value, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindIn(List<String> values) {
       addCriterion("SMS2_REMIND in", values, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindNotIn(List<String> values) {
       addCriterion("SMS2_REMIND not in", values, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindBetween(String value1, String value2) {
       addCriterion("SMS2_REMIND between", value1, value2, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSms2RemindNotBetween(String value1, String value2) {
       addCriterion("SMS2_REMIND not between", value1, value2, "sms2Remind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindIsNull() {
       addCriterion("SMS_REMIND is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindIsNotNull() {
       addCriterion("SMS_REMIND is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindEqualTo(String value) {
       addCriterion("SMS_REMIND =", value, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindNotEqualTo(String value) {
       addCriterion("SMS_REMIND <>", value, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindGreaterThan(String value) {
       addCriterion("SMS_REMIND >", value, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindGreaterThanOrEqualTo(String value) {
       addCriterion("SMS_REMIND >=", value, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindLessThan(String value) {
       addCriterion("SMS_REMIND <", value, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindLessThanOrEqualTo(String value) {
       addCriterion("SMS_REMIND <=", value, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindLike(String value) {
       addCriterion("SMS_REMIND like", value, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindNotLike(String value) {
       addCriterion("SMS_REMIND not like", value, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindIn(List<String> values) {
       addCriterion("SMS_REMIND in", values, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindNotIn(List<String> values) {
       addCriterion("SMS_REMIND not in", values, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindBetween(String value1, String value2) {
       addCriterion("SMS_REMIND between", value1, value2, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSmsRemindNotBetween(String value1, String value2) {
       addCriterion("SMS_REMIND not between", value1, value2, "smsRemind");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeIsNull() {
       addCriterion("START_TIME is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeIsNotNull() {
       addCriterion("START_TIME is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeEqualTo(Long value) {
       addCriterion("START_TIME =", value, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeNotEqualTo(Long value) {
       addCriterion("START_TIME <>", value, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeGreaterThan(Long value) {
       addCriterion("START_TIME >", value, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeGreaterThanOrEqualTo(Long value) {
       addCriterion("START_TIME >=", value, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeLessThan(Long value) {
       addCriterion("START_TIME <", value, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeLessThanOrEqualTo(Long value) {
       addCriterion("START_TIME <=", value, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeIn(List<Long> values) {
       addCriterion("START_TIME in", values, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeNotIn(List<Long> values) {
       addCriterion("START_TIME not in", values, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeBetween(Long value1, Long value2) {
       addCriterion("START_TIME between", value1, value2, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStartTimeNotBetween(Long value1, Long value2) {
       addCriterion("START_TIME not between", value1, value2, "startTime");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusIsNull() {
       addCriterion("STATUS is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusIsNotNull() {
       addCriterion("STATUS is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusEqualTo(Integer value) {
       addCriterion("STATUS =", value, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusNotEqualTo(Integer value) {
       addCriterion("STATUS <>", value, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusGreaterThan(Integer value) {
       addCriterion("STATUS >", value, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("STATUS >=", value, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusLessThan(Integer value) {
       addCriterion("STATUS <", value, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
       addCriterion("STATUS <=", value, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusIn(List<Integer> values) {
       addCriterion("STATUS in", values, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusNotIn(List<Integer> values) {
       addCriterion("STATUS not in", values, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusBetween(Integer value1, Integer value2) {
       addCriterion("STATUS between", value1, value2, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("STATUS not between", value1, value2, "status");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectIsNull() {
       addCriterion("SUBJECT is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectIsNotNull() {
       addCriterion("SUBJECT is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectEqualTo(String value) {
       addCriterion("SUBJECT =", value, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectNotEqualTo(String value) {
       addCriterion("SUBJECT <>", value, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectGreaterThan(String value) {
       addCriterion("SUBJECT >", value, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectGreaterThanOrEqualTo(String value) {
       addCriterion("SUBJECT >=", value, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectLessThan(String value) {
       addCriterion("SUBJECT <", value, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectLessThanOrEqualTo(String value) {
       addCriterion("SUBJECT <=", value, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectLike(String value) {
       addCriterion("SUBJECT like", value, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectNotLike(String value) {
       addCriterion("SUBJECT not like", value, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectIn(List<String> values) {
       addCriterion("SUBJECT in", values, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectNotIn(List<String> values) {
       addCriterion("SUBJECT not in", values, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectBetween(String value1, String value2) {
       addCriterion("SUBJECT between", value1, value2, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andSubjectNotBetween(String value1, String value2) {
       addCriterion("SUBJECT not between", value1, value2, "subject");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdIsNull() {
       addCriterion("MANAGER_ID is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdIsNotNull() {
       addCriterion("MANAGER_ID is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdEqualTo(Integer value) {
       addCriterion("MANAGER_ID =", value, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdNotEqualTo(Integer value) {
       addCriterion("MANAGER_ID <>", value, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdGreaterThan(Integer value) {
       addCriterion("MANAGER_ID >", value, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("MANAGER_ID >=", value, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdLessThan(Integer value) {
       addCriterion("MANAGER_ID <", value, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdLessThanOrEqualTo(Integer value) {
       addCriterion("MANAGER_ID <=", value, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdIn(List<Integer> values) {
       addCriterion("MANAGER_ID in", values, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdNotIn(List<Integer> values) {
       addCriterion("MANAGER_ID not in", values, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdBetween(Integer value1, Integer value2) {
       addCriterion("MANAGER_ID between", value1, value2, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
       addCriterion("MANAGER_ID not between", value1, value2, "managerId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdIsNull() {
       addCriterion("MEET_ROOM_ID is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdIsNotNull() {
       addCriterion("MEET_ROOM_ID is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdEqualTo(Integer value) {
       addCriterion("MEET_ROOM_ID =", value, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdNotEqualTo(Integer value) {
       addCriterion("MEET_ROOM_ID <>", value, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdGreaterThan(Integer value) {
       addCriterion("MEET_ROOM_ID >", value, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("MEET_ROOM_ID >=", value, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdLessThan(Integer value) {
       addCriterion("MEET_ROOM_ID <", value, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdLessThanOrEqualTo(Integer value) {
       addCriterion("MEET_ROOM_ID <=", value, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdIn(List<Integer> values) {
       addCriterion("MEET_ROOM_ID in", values, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdNotIn(List<Integer> values) {
       addCriterion("MEET_ROOM_ID not in", values, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdBetween(Integer value1, Integer value2) {
       addCriterion("MEET_ROOM_ID between", value1, value2, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andMeetRoomIdNotBetween(Integer value1, Integer value2) {
       addCriterion("MEET_ROOM_ID not between", value1, value2, "meetRoomId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdIsNull() {
       addCriterion("USER_ID is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdIsNotNull() {
       addCriterion("USER_ID is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdEqualTo(Integer value) {
       addCriterion("USER_ID =", value, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdNotEqualTo(Integer value) {
       addCriterion("USER_ID <>", value, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdGreaterThan(Integer value) {
       addCriterion("USER_ID >", value, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("USER_ID >=", value, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdLessThan(Integer value) {
       addCriterion("USER_ID <", value, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdLessThanOrEqualTo(Integer value) {
       addCriterion("USER_ID <=", value, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdIn(List<Integer> values) {
       addCriterion("USER_ID in", values, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdNotIn(List<Integer> values) {
       addCriterion("USER_ID not in", values, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdBetween(Integer value1, Integer value2) {
       addCriterion("USER_ID between", value1, value2, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andUserIdNotBetween(Integer value1, Integer value2) {
       addCriterion("USER_ID not between", value1, value2, "userId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdIsNull() {
       addCriterion("RECORDER_ID is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdIsNotNull() {
       addCriterion("RECORDER_ID is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdEqualTo(Integer value) {
       addCriterion("RECORDER_ID =", value, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdNotEqualTo(Integer value) {
       addCriterion("RECORDER_ID <>", value, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdGreaterThan(Integer value) {
       addCriterion("RECORDER_ID >", value, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("RECORDER_ID >=", value, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdLessThan(Integer value) {
       addCriterion("RECORDER_ID <", value, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdLessThanOrEqualTo(Integer value) {
       addCriterion("RECORDER_ID <=", value, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdIn(List<Integer> values) {
       addCriterion("RECORDER_ID in", values, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdNotIn(List<Integer> values) {
       addCriterion("RECORDER_ID not in", values, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdBetween(Integer value1, Integer value2) {
       addCriterion("RECORDER_ID between", value1, value2, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andRecorderIdNotBetween(Integer value1, Integer value2) {
       addCriterion("RECORDER_ID not between", value1, value2, "recorderId");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryIsNull() {
       addCriterion("ISUPLOADSUMMARY is null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryIsNotNull() {
       addCriterion("ISUPLOADSUMMARY is not null");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryEqualTo(String value) {
       addCriterion("ISUPLOADSUMMARY =", value, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryNotEqualTo(String value) {
       addCriterion("ISUPLOADSUMMARY <>", value, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryGreaterThan(String value) {
       addCriterion("ISUPLOADSUMMARY >", value, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryGreaterThanOrEqualTo(String value) {
       addCriterion("ISUPLOADSUMMARY >=", value, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryLessThan(String value) {
       addCriterion("ISUPLOADSUMMARY <", value, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryLessThanOrEqualTo(String value) {
       addCriterion("ISUPLOADSUMMARY <=", value, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryLike(String value) {
       addCriterion("ISUPLOADSUMMARY like", value, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryNotLike(String value) {
       addCriterion("ISUPLOADSUMMARY not like", value, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryIn(List<String> values) {
       addCriterion("ISUPLOADSUMMARY in", values, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryNotIn(List<String> values) {
       addCriterion("ISUPLOADSUMMARY not in", values, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryBetween(String value1, String value2) {
       addCriterion("ISUPLOADSUMMARY between", value1, value2, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
 
     public MeetingExample.Criteria andIsuploadsummaryNotBetween(String value1, String value2) {
       addCriterion("ISUPLOADSUMMARY not between", value1, value2, "isuploadsummary");
       return (MeetingExample.Criteria)this;
     }
   }
 }

