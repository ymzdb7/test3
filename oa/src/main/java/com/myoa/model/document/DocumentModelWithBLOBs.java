 package com.myoa.model.document;
 
 import com.myoa.model.sys.SealWithBLOBs;
import com.myoa.model.workflow.FlowFast;
import com.myoa.util.common.StringUtils;

import java.util.List;
 
 public class DocumentModelWithBLOBs extends DocumentModel
 {
   private String remark;
   private String content;
   private String userName;
   private String tableName;
   private FlowFast flowFastToJson;
   private String prcsName;
   private String prcsId;
   private String startTime;
   private String endTime;
   private String draftType;
   private List<SealWithBLOBs> sealWithBLOBs;
 
   public List<SealWithBLOBs> getSealWithBLOBs()
   {
     return this.sealWithBLOBs;
   }
 
   public void setSealWithBLOBs(List<SealWithBLOBs> sealWithBLOBs) {
     this.sealWithBLOBs = sealWithBLOBs;
   }
 
   public String getDraftType() {
     return this.draftType;
   }
 
   public void setDraftType(String draftType) {
     this.draftType = draftType;
   }
 
   public String getPrcsId() {
     return this.prcsId;
   }
 
   public void setPrcsId(String prcsId) {
     this.prcsId = prcsId;
   }
 
   public String getPrcsName() {
     return this.prcsName;
   }
 
   public void setPrcsName(String prcsName) {
     this.prcsName = (prcsName == null ? "" : prcsName.trim());
   }
 
   public String getTableName() {
     if (StringUtils.checkNull(this.tableName).booleanValue()) {
       return "document";
     }
     return this.tableName;
   }
 
   public void setTableName(String tableName) {
     this.tableName = (tableName == null ? "" : tableName.trim());
   }
 
   public FlowFast getFlowFastToJson() {
     return this.flowFastToJson;
   }
 
   public void setFlowFastToJson(FlowFast flowFastToJson) {
     this.flowFastToJson = flowFastToJson;
   }
 
   public String getUserName() {
     return this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = (userName == null ? "" : userName.trim());
   }
 
   public String getRemark()
   {
     return this.remark;
   }
 
   public void setRemark(String remark)
   {
     this.remark = (remark == null ? "" : remark.trim());
   }
 
   public String getContent()
   {
     return this.content;
   }
 
   public void setContent(String content)
   {
     this.content = (content == null ? "" : content.trim());
   }
 
   public DocumentModelWithBLOBs() {
   }
 
   public DocumentModelWithBLOBs(Integer id, Integer flowId, Integer runId, String flowRunName, String flowStatus, String flowPrcs, String curUserId, String allUserId, String content) {
     super(id, flowId, runId, flowRunName, flowStatus, flowPrcs, curUserId, allUserId);
     this.content = content;
   }
 }

