 package com.myoa.model.widget;
 
 import java.util.List;
 
 public class WidgetSetModel
 {
   private Integer id;
   private Integer uid;
   private String type;
   private String moduleIds;
   private String bg;
   private List<WidgetModel> on;
   private List<WidgetModel> off;
   private Integer count;
   private List<WidgetDataModel> data;
 
   public String getBg()
   {
     return this.bg;
   }
 
   public void setBg(String bg) {
     this.bg = bg;
   }
 
   public List<WidgetDataModel> getData() {
     return this.data;
   }
 
   public void setData(List<WidgetDataModel> data) {
     this.data = data;
   }
 
   public Integer getId() {
     return this.id;
   }
 
   public void setId(Integer id) {
     this.id = id;
   }
 
   public Integer getUid() {
     return this.uid;
   }
 
   public void setUid(Integer uid) {
     this.uid = uid;
   }
 
   public String getType() {
     return this.type;
   }
 
   public void setType(String type) {
     this.type = type;
   }
 
   public String getModuleIds() {
     return this.moduleIds;
   }
 
   public void setModuleIds(String moduleIds) {
     this.moduleIds = moduleIds;
   }
 
   public List<WidgetModel> getOn() {
     return this.on;
   }
 
   public void setOn(List<WidgetModel> on) {
     this.on = on;
   }
 
   public List<WidgetModel> getOff() {
     return this.off;
   }
 
   public void setOff(List<WidgetModel> off) {
     this.off = off;
   }
 
   public Integer getCount() {
     return this.count;
   }
 
   public void setCount(Integer count) {
     this.count = count;
   }
 }

