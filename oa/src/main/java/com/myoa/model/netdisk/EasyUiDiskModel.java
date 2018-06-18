 package com.myoa.model.netdisk;
 
 import java.util.List;
 import java.util.Map;
 
 public class EasyUiDiskModel
 {
   Integer id;
   String text;
   Map<String, String> attributes;
   List<EasyUiDiskModel> children;
 
   public Integer getId()
   {
     return this.id;
   }
 
   public void setId(Integer id) {
     this.id = id;
   }
 
   public String getText() {
     return this.text;
   }
 
   public void setText(String text) {
     this.text = text;
   }
 
   public Map<String, String> getAttributes() {
     return this.attributes;
   }
 
   public void setAttributes(Map<String, String> attributes) {
     this.attributes = attributes;
   }
 
   public List<EasyUiDiskModel> getChildren() {
     return this.children;
   }
 
   public void setChildren(List<EasyUiDiskModel> children) {
     this.children = children;
   }
 }
