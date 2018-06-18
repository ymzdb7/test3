 package com.myoa.model.duties;
 
 import com.myoa.model.enclosure.Attachment;

 import java.util.ArrayList;
import java.util.List;
 
 public class UserPost
 {
   private Integer postId;
   private String postName;
   private Integer type;
   private String level;
   private String postNo;
   private Integer deptId;
   private String duty;
   private String description;
   private String attachmentId;
   private String attachmentName;
   private String typeName;
   private String deptName;
   private List<Attachment> attachment = new ArrayList();
 
   public void setAttachment(List<Attachment> attachment) {
     this.attachment = attachment;
   }
 
   public List<Attachment> getAttachment()
   {
     return this.attachment;
   }
 
   public Integer getPostId() {
     return this.postId;
   }
 
   public void setPostId(Integer postId) {
     this.postId = postId;
   }
 
   public String getPostName() {
     return this.postName == null ? "" : this.postName;
   }
 
   public void setPostName(String postName) {
     this.postName = postName;
   }
 
   public Integer getType() {
     return Integer.valueOf(this.type == null ? 0 : this.type.intValue());
   }
 
   public void setType(Integer type) {
     this.type = type;
   }
 
   public String getLevel() {
     return this.level == null ? "" : this.level;
   }
 
   public void setLevel(String level) {
     this.level = level;
   }
 
   public String getPostNo() {
     return this.postNo == null ? "" : this.postNo;
   }
 
   public void setPostNo(String postNo) {
     this.postNo = postNo;
   }
 
   public Integer getDeptId() {
     return Integer.valueOf(this.deptId == null ? 0 : this.deptId.intValue());
   }
 
   public void setDeptId(Integer deptId) {
     this.deptId = deptId;
   }
 
   public String getDuty() {
     return this.duty == null ? "" : this.duty;
   }
 
   public void setDuty(String duty) {
     this.duty = duty;
   }
 
   public String getDescription() {
     return this.description == null ? "" : this.description;
   }
 
   public void setDescription(String description) {
     this.description = description;
   }
 
   public String getAttachmentId() {
     return this.attachmentId == null ? "" : this.attachmentId;
   }
 
   public void setAttachmentId(String attachmentId) {
     this.attachmentId = attachmentId;
   }
 
   public String getAttachmentName() {
     return this.attachmentName == null ? "" : this.attachmentName;
   }
 
   public void setAttachmentName(String attachmentName) {
     this.attachmentName = attachmentName;
   }
 
   public String getTypeName() {
     return this.typeName == null ? "" : this.typeName;
   }
 
   public void setTypeName(String typeName) {
     this.typeName = typeName;
   }
 
   public String getDeptName() {
     return this.deptName == null ? "" : this.deptName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 }

