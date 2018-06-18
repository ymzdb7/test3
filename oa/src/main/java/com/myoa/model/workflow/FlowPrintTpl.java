 package com.myoa.model.workflow;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 
 public class FlowPrintTpl
 {
   private Integer tId;
   private Integer flowId;
   private String tType;
   private String tName;
   private Date createTime;
 
   public Integer getTId()
   {
     return this.tId;
   }
 
   public void setTId(Integer tId) {
     this.tId = tId;
   }
 
   public Integer getFlowId() {
     return this.flowId;
   }
 
   public void setFlowId(Integer flowId) {
     this.flowId = flowId;
   }
 
   public String getTType() {
     return this.tType;
   }
 
   public void setTType(String tType) {
     this.tType = tType;
   }
 
   public String getTName() {
     return this.tName;
   }
 
   public void setTName(String tName) {
     this.tName = tName;
   }
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   public Date getCreateTime() {
     return this.createTime;
   }
 
   public void setCreateTime(Date createTime) {
     this.createTime = createTime;
   }
 }

