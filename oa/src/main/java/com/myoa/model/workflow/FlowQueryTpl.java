 package com.myoa.model.workflow;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 
 public class FlowQueryTpl
 {
   private Integer seqId;
   private String tplName;
   private String userId;
   private Integer flowId;
   private String condFormula;
   private Date createTime;
 
   public Integer getSeqId()
   {
     return this.seqId;
   }
 
   public void setSeqId(Integer seqId) {
     this.seqId = seqId;
   }
 
   public String getTplName() {
     return this.tplName;
   }
 
   public void setTplName(String tplName) {
     this.tplName = (tplName == null ? null : tplName.trim());
   }
 
   public String getUserId() {
     return this.userId;
   }
 
   public void setUserId(String userId) {
     this.userId = (userId == null ? null : userId.trim());
   }
 
   public Integer getFlowId() {
     return this.flowId;
   }
 
   public void setFlowId(Integer flowId) {
     this.flowId = flowId;
   }
 
   public String getCondFormula() {
     return this.condFormula;
   }
 
   public void setCondFormula(String condFormula) {
     this.condFormula = (condFormula == null ? null : condFormula.trim());
   }
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   public Date getCreateTime() { return this.createTime; }
 
   public void setCreateTime(Date createTime)
   {
     this.createTime = createTime;
   }
 }

