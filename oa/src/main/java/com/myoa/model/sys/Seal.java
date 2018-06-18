 package com.myoa.model.sys;
 
 import com.myoa.model.enclosure.Attachment;

 import java.util.Date;
import java.util.List;
 
 public class Seal
 {
   private Integer id;
   private String sealId;
   private String deptId;
   private String sealName;
   private Date createTime;
   private String url;
   private String attachmentId;
   private String attachmentName;
   private String name;
   List<Attachment> attachmentList;
 
   public Integer getId()
   {
     return this.id;
   }
 
   public void setId(Integer id)
   {
     this.id = id;
   }
 
   public String getSealId()
   {
     return this.sealId;
   }
 
   public String getAttachmentId() {
     return this.attachmentId;
   }
 
   public void setAttachmentId(String attachmentId) {
     this.attachmentId = attachmentId;
   }
 
   public String getAttachmentName() {
     return this.attachmentName;
   }
 
   public void setAttachmentName(String attachmentName) {
     this.attachmentName = attachmentName;
   }
 
   public List<Attachment> getAttachmentList() {
     return this.attachmentList;
   }
 
   public void setAttachmentList(List<Attachment> attachmentList) {
     this.attachmentList = attachmentList;
   }
 
   public void setSealId(String sealId)
   {
     this.sealId = (sealId == null ? null : sealId.trim());
   }
 
   public String getDeptId()
   {
     return this.deptId;
   }
 
   public void setDeptId(String deptId)
   {
     this.deptId = (deptId == null ? null : deptId.trim());
   }
 
   public String getSealName()
   {
     return this.sealName;
   }
 
   public String getUrl() {
     return this.url;
   }
 
   public void setUrl(String url) {
     this.url = url;
   }
 
   public String getName() {
     return this.name;
   }
 
   public void setName(String name) {
     this.name = name;
   }
 
   public void setSealName(String sealName)
   {
     this.sealName = (sealName == null ? null : sealName.trim());
   }
 
   public Date getCreateTime()
   {
     return this.createTime;
   }
 
   public void setCreateTime(Date createTime)
   {
     this.createTime = createTime;
   }
 }

