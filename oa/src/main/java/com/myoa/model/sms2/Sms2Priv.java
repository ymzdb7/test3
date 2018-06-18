 package com.myoa.model.sms2;
 
 public class Sms2Priv
 {
   private String outToSelf;
   private String typePriv;
   private String remindPriv;
   private String outPriv;
   private String sms2RemindPriv;
   private String codeName;
   private String codeNo;
   private String paraValue;
   private String column1;
   private String column2;
   private String column3;
   private String thingRemind;
   private String thingDefault;
   private String smsDefault;
   private StringBuffer mobileNo;
   private String userId;
   private String userName;
   private String toId;
   private String privId;
   private StringBuffer mobileString;
   private Integer resendHour;
   private Integer resendMinute;
   private String attendeeOut;
   private String startTime;
 
   public String getStartTime()
   {
     return this.startTime;
   }
 
   public void setStartTime(String startTime) {
     this.startTime = startTime;
   }
 
   public String getAttendeeOut() {
     return this.attendeeOut;
   }
 
   public void setAttendeeOut(String attendeeOut) {
     this.attendeeOut = attendeeOut;
   }
 
   public Integer getResendMinute() {
     return this.resendMinute;
   }
 
   public void setResendMinute(Integer resendMinute) {
     this.resendMinute = resendMinute;
   }
 
   public Integer getResendHour()
   {
     return this.resendHour;
   }
 
   public void setResendHour(Integer resendHour) {
     this.resendHour = resendHour;
   }
 
   public StringBuffer getMobileString() {
     return this.mobileString;
   }
 
   public void setMobileString(StringBuffer mobileString) {
     this.mobileString = mobileString;
   }
 
   public String getToId() {
     return this.toId;
   }
 
   public void setToId(String toId) {
     this.toId = toId;
   }
 
   public String getPrivId() {
     return this.privId;
   }
 
   public void setPrivId(String privId) {
     this.privId = privId;
   }
 
   public String getUserId() {
     return this.userId;
   }
 
   public String getUserName() {
     return this.userName;
   }
 
   public void setUserId(String userId) {
     this.userId = userId;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public StringBuffer getMobileNo() {
     return this.mobileNo;
   }
 
   public void setMobileNo(StringBuffer mobileNo) {
     this.mobileNo = mobileNo;
   }
 
   public String getThingRemind() {
     return this.thingRemind;
   }
 
   public String getThingDefault() {
     return this.thingDefault;
   }
 
   public String getSmsDefault() {
     return this.smsDefault;
   }
 
   public void setThingRemind(String thingRemind) {
     this.thingRemind = thingRemind;
   }
 
   public void setThingDefault(String thingDefault) {
     this.thingDefault = thingDefault;
   }
 
   public void setSmsDefault(String smsDefault) {
     this.smsDefault = smsDefault;
   }
 
   public String getColumn1() {
     return this.column1;
   }
 
   public String getColumn2() {
     return this.column2;
   }
 
   public String getColumn3() {
     return this.column3;
   }
 
   public void setColumn1(String column1) {
     this.column1 = column1;
   }
 
   public void setColumn2(String column2) {
     this.column2 = column2;
   }
 
   public void setColumn3(String column3) {
     this.column3 = column3;
   }
 
   public String getParaValue() {
     return this.paraValue;
   }
 
   public void setParaValue(String paraValue) {
     this.paraValue = paraValue;
   }
 
   public void setCodeName(String codeName) {
     this.codeName = codeName;
   }
 
   public String getCodeName() {
     return this.codeName;
   }
 
   public String getCodeNo()
   {
     return this.codeNo;
   }
 
   public void setCodeNo(String codeNo) {
     this.codeNo = codeNo;
   }
 
   public String getOutToSelf()
   {
     return this.outToSelf;
   }
 
   public void setOutToSelf(String outToSelf)
   {
     this.outToSelf = (outToSelf == null ? null : outToSelf.trim());
   }
 
   public String getTypePriv()
   {
     return this.typePriv;
   }
 
   public void setTypePriv(String typePriv)
   {
     this.typePriv = (typePriv == null ? null : typePriv.trim());
   }
 
   public String getRemindPriv()
   {
     return this.remindPriv;
   }
 
   public void setRemindPriv(String remindPriv)
   {
     this.remindPriv = (remindPriv == null ? null : remindPriv.trim());
   }
 
   public String getOutPriv()
   {
     return this.outPriv;
   }
 
   public void setOutPriv(String outPriv)
   {
     this.outPriv = (outPriv == null ? null : outPriv.trim());
   }
 
   public String getSms2RemindPriv()
   {
     return this.sms2RemindPriv;
   }
 
   public void setSms2RemindPriv(String sms2RemindPriv)
   {
     this.sms2RemindPriv = (sms2RemindPriv == null ? null : sms2RemindPriv.trim());
   }
 }

