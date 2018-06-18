 package com.myoa.model.workPlan;
 
 import com.alibaba.fastjson.annotation.JSONField;
import com.myoa.util.DateFormat;

 import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
 
 public class WorkPlan
 {
   private Integer planId;
   private String name;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date beginDate;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date endDate;
   private String endDateStr;
   private String type;
   private String typeName;
   private String status;
   private String statusName;
   private String toId;
   private String toName;
   private String creator;
   private String creatorName;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date createDate;
   private String suspendFlag;
   private String publish;
   private Integer uidPartFlag;
   private String smsFlag;
   private String clearEndClearFlag;
   private Integer statusFlag;
   private Date current;
   private Integer time;
 
   public Integer getTime()
   {
     return this.time;
   }
 
   public void setTime(Integer time) {
     this.time = time;
   }
 
   public Integer getUidPartFlag() {
     return this.uidPartFlag;
   }
 
   public void setUidPartFlag(Integer uidPartFlag) {
     this.uidPartFlag = uidPartFlag;
   }
 
   public Date getCurrent() {
     return this.current;
   }
 
   public void setCurrent(Date current) {
     this.current = current;
   }
 
   public Integer getStatusFlag() {
     return Integer.valueOf(this.statusFlag == null ? 0 : this.statusFlag.intValue());
   }
 
   public void setStatusFlag(Integer statusFlag) {
     this.statusFlag = statusFlag;
   }
 
   public String getClearEndClearFlag() {
     return this.clearEndClearFlag;
   }
 
   public void setClearEndClearFlag(String clearEndClearFlag) {
     this.clearEndClearFlag = clearEndClearFlag;
   }
 
   public String getStatus() {
     return this.status;
   }
 
   public void setStatus(String status) {
     this.status = status;
   }
 
   public String getStatusName() {
     return this.statusName == null ? "" : this.statusName;
   }
 
   public void setStatusName(String statusName) {
     this.statusName = statusName;
   }
 
   public String getToName() {
     return this.toName == null ? "" : this.toName;
   }
 
   public void setToName(String toName) {
     this.toName = toName;
   }
 
   public String getCreatorName() {
     return this.creatorName == null ? "" : this.creatorName;
   }
 
   public void setCreatorName(String creatorName) {
     this.creatorName = creatorName;
   }
 
   public String getTypeName() {
     return this.typeName == null ? "" : this.typeName;
   }
 
   public void setTypeName(String typeName) {
     this.typeName = typeName;
   }
 
   public Integer getPlanId()
   {
     return this.planId;
   }
 
   public void setPlanId(Integer planId)
   {
     this.planId = planId;
   }
 
   public String getName()
   {
     return this.name;
   }
 
   public void setName(String name)
   {
     this.name = (name == null ? null : name.trim());
   }
 
   public Date getBeginDate()
   {
     return this.beginDate;
   }
 
   public void setBeginDate(Date beginDate)
   {
     this.beginDate = beginDate;
   }
 
   public Date getEndDate()
   {
     return this.endDate;
   }
 
   public String getEndDateStr() {
     return this.endDate == null ? "" : DateFormat.getDatestr(this.endDate);
   }
 
   public void setEndDateStr(String endDateStr) {
     this.endDateStr = endDateStr;
   }
 
   public void setEndDate(Date endDate)
   {
     this.endDate = endDate;
   }
 
   public String getType()
   {
     return this.type;
   }
 
   public void setType(String type)
   {
     this.type = (type == null ? null : type.trim());
   }
 
   public String getToId()
   {
     return this.toId;
   }
 
   public void setToId(String toId)
   {
     this.toId = (toId == null ? null : toId.trim());
   }
 
   public String getCreator()
   {
     return this.creator;
   }
 
   public void setCreator(String creator)
   {
     this.creator = (creator == null ? null : creator.trim());
   }
 
   public Date getCreateDate()
   {
     return this.createDate;
   }
 
   public void setCreateDate(Date createDate)
   {
     this.createDate = createDate;
   }
 
   public String getSuspendFlag()
   {
     return this.suspendFlag;
   }
 
   public void setSuspendFlag(String suspendFlag)
   {
     this.suspendFlag = (suspendFlag == null ? null : suspendFlag.trim());
   }
 
   public String getPublish()
   {
     return this.publish;
   }
 
   public void setPublish(String publish)
   {
     this.publish = (publish == null ? null : publish.trim());
   }
 
   public String getSmsFlag()
   {
     return this.smsFlag;
   }
 
   public void setSmsFlag(String smsFlag)
   {
     this.smsFlag = (smsFlag == null ? null : smsFlag.trim());
   }
 }

