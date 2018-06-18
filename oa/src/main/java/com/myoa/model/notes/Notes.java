 package com.myoa.model.notes;
 
 public class Notes
 {
   private Integer noteId;
   private Integer uid;
   private String content;
   private String color;
   private String showFlag;
   private Integer createTime;
   private Integer editTime;
 
   public Integer getNoteId()
   {
     return this.noteId;
   }
 
   public void setNoteId(Integer noteId) {
     this.noteId = noteId;
   }
 
   public Integer getUid() {
     return this.uid;
   }
 
   public void setUid(Integer uid) {
     this.uid = uid;
   }
 
   public String getColor() {
     return this.color;
   }
 
   public void setColor(String color) {
     this.color = color;
   }
 
   public String getContent() {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = content;
   }
 
   public String getShowFlag() {
     return this.showFlag;
   }
 
   public void setShowFlag(String showFlag) {
     this.showFlag = showFlag;
   }
 
   public Integer getCreateTime() {
     return this.createTime;
   }
 
   public void setCreateTime(Integer createTime) {
     this.createTime = createTime;
   }
 
   public Integer getEditTime() {
     return this.editTime;
   }
 
   public void setEditTime(Integer editTime) {
     this.editTime = editTime;
   }
 }

