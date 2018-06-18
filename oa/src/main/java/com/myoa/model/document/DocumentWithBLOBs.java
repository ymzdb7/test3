 package com.myoa.model.document;
 
 public class DocumentWithBLOBs extends Document
 {
   private String content;
   private String remark;
 
   public String getContent()
   {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = (content == null ? null : content.trim());
   }
 
   public String getRemark() {
     return this.remark;
   }
 
   public void setRemark(String remark) {
     this.remark = (remark == null ? null : remark.trim());
   }
 }

