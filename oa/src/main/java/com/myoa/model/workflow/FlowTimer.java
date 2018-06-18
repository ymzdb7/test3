 package com.myoa.model.workflow;
 
 import com.alibaba.fastjson.annotation.JSONField;
import com.myoa.global.jsondate.DateSerializerHMS;

 import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonSerialize;
 
 public class FlowTimer
 {
   private Integer tid;
   private Integer flowId;
   private String type;
   private String remindDate;
 
   @JsonSerialize(using=DateSerializerHMS.class)
   private Date remindTime;
   private Date lastTime;
 
   public Integer getTid()
   {
     return this.tid;
   }
 
   public void setTid(Integer tid) {
     this.tid = tid;
   }
 
   public Integer getFlowId() {
     return this.flowId;
   }
 
   public void setFlowId(Integer flowId) {
     this.flowId = flowId;
   }
 
   public String getType() {
     return this.type;
   }
 
   public void setType(String type) {
     this.type = (type == null ? null : type.trim());
   }
 
   public String getRemindDate() {
     return this.remindDate;
   }
 
   public void setRemindDate(String remindDate) {
     this.remindDate = (remindDate == null ? null : remindDate.trim());
   }
 
   @JSONField(format="HH:mm:ss")
   public Date getRemindTime() {
     return this.remindTime;
   }
 
   public void setRemindTime(Date remindTime) {
     this.remindTime = remindTime;
   }
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   public Date getLastTime() { return this.lastTime; }
 
   public void setLastTime(Date lastTime)
   {
     this.lastTime = lastTime;
   }
 }

