 package com.myoa.model.workflow;
 
 public class FlowPrintTplWithBLOBs extends FlowPrintTpl
 {
   private String content;
   private String flowPrcs;
 
   public String getContent()
   {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = (content == null ? null : content.trim());
   }
 
   public String getFlowPrcs() {
     return this.flowPrcs;
   }
 
   public void setFlowPrcs(String flowPrcs) {
     this.flowPrcs = (flowPrcs == null ? null : flowPrcs.trim());
   }
 }
