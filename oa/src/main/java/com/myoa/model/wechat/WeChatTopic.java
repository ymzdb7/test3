 package com.myoa.model.wechat;
 
 public class WeChatTopic
 {
   private Integer topicId;
   private String topicName;
   private String takerUIds;
   private Integer count;
 
   public Integer getTopicId()
   {
     return this.topicId;
   }
 
   public void setTopicId(Integer topicId) {
     this.topicId = topicId;
   }
 
   public String getTopicName() {
     return this.topicName;
   }
 
   public void setTopicName(String topicName) {
     this.topicName = topicName;
   }
 
   public String getTakerUIds() {
     return this.takerUIds;
   }
 
   public void setTakerUIds(String takerUIds) {
     this.takerUIds = takerUIds;
   }
 
   public Integer getCount() {
     return this.count;
   }
 
   public void setCount(Integer count) {
     this.count = count;
   }
 }

