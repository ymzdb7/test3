 package com.myoa.model.document;
 
 public class FlowTypeDocumentDocument
 {
   Integer flowId;
   String flowName;
   String documentType;
 
   public Integer getFlowId()
   {
     return this.flowId;
   }
 
   public void setFlowId(Integer flowId) {
     this.flowId = flowId;
   }
 
   public String getFlowName() {
     return this.flowName;
   }
 
   public void setFlowName(String flowName) {
     this.flowName = flowName;
   }
 
   public String getDocumentType() {
     return this.documentType;
   }
 
   public void setDocumentType(String documentType) {
     this.documentType = documentType;
   }
 }
