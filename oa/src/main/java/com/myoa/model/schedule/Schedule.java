 package com.myoa.model.schedule;
 
 public class Schedule
 {
   private Integer id;
   private String subject;
   private String undertake;
   private String location;
   private String attendee;
   private String remark;
   private String leader;
   private Long begin_time;
   private Integer create_user;
   private Long create_time;
   private String schedule_type;
   private Long end_time;
   private Integer order_no;
   private String status;
   private String reason;
   private Integer approver;
   private Integer room_id;
   private Integer is_sure;
   private String begin_date;
   private Integer begin_period;
 
   public Integer getId()
   {
     return this.id;
   }
 
   public void setId(Integer id) {
     this.id = id;
   }
 
   public String getSubject() {
     return this.subject;
   }
 
   public void setSubject(String subject) {
     this.subject = subject;
   }
 
   public String getUndertake() {
     return this.undertake;
   }
 
   public void setUndertake(String undertake) {
     this.undertake = undertake;
   }
 
   public String getLocation() {
     return this.location;
   }
 
   public void setLocation(String location) {
     this.location = location;
   }
 
   public String getAttendee() {
     return this.attendee;
   }
 
   public void setAttendee(String attendee) {
     this.attendee = attendee;
   }
 
   public String getRemark() {
     return this.remark;
   }
 
   public void setRemark(String remark) {
     this.remark = remark;
   }
 
   public String getLeader() {
     return this.leader;
   }
 
   public void setLeader(String leader) {
     this.leader = leader;
   }
 
   public Long getBegin_time() {
     return this.begin_time;
   }
 
   public void setBegin_time(Long begin_time) {
     this.begin_time = begin_time;
   }
 
   public Long getCreate_time() {
     return this.create_time;
   }
 
   public void setCreate_time(Long create_time) {
     this.create_time = create_time;
   }
 
   public Long getEnd_time() {
     return this.end_time;
   }
 
   public void setEnd_time(Long end_time) {
     this.end_time = end_time;
   }
 
   public Integer getCreate_user() {
     return this.create_user;
   }
 
   public void setCreate_user(Integer create_user) {
     this.create_user = create_user;
   }
 
   public String getSchedule_type()
   {
     return this.schedule_type;
   }
 
   public void setSchedule_type(String schedule_type) {
     this.schedule_type = schedule_type;
   }
 
   public Integer getOrder_no()
   {
     return this.order_no;
   }
 
   public void setOrder_no(Integer order_no) {
     this.order_no = order_no;
   }
 
   public String getStatus() {
     return this.status;
   }
 
   public void setStatus(String status) {
     this.status = status;
   }
 
   public String getReason() {
     return this.reason;
   }
 
   public void setReason(String reason) {
     this.reason = reason;
   }
 
   public Integer getApprover() {
     return this.approver;
   }
 
   public void setApprover(Integer approver) {
     this.approver = approver;
   }
 
   public Integer getRoom_id() {
     return this.room_id;
   }
 
   public void setRoom_id(Integer room_id) {
     this.room_id = room_id;
   }
 
   public Integer getIs_sure() {
     return this.is_sure;
   }
 
   public void setIs_sure(Integer is_sure) {
     this.is_sure = is_sure;
   }
 
   public String getBegin_date() {
     return this.begin_date;
   }
 
   public void setBegin_date(String begin_date) {
     this.begin_date = begin_date;
   }
 
   public Integer getBegin_period() {
     return this.begin_period;
   }
 
   public void setBegin_period(Integer begin_period) {
     this.begin_period = begin_period;
   }
 }
