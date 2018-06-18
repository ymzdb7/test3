 package com.myoa.model.sms3;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 import org.springframework.format.annotation.DateTimeFormat;
 
 public class Sms3
 {
   private Integer smsId;
   private String phone;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date sendTime;
   private String content;
 
   public Integer getSmsId()
   {
     return this.smsId;
   }
 
   public void setSmsId(Integer smsId)
   {
     this.smsId = smsId;
   }
 
   public String getPhone()
   {
     return this.phone;
   }
 
   public void setPhone(String phone)
   {
     this.phone = (phone == null ? null : phone.trim());
   }
 
   public Date getSendTime()
   {
     return this.sendTime;
   }
 
   public void setSendTime(Date sendTime)
   {
     this.sendTime = sendTime;
   }
 
   public String getContent()
   {
     return this.content;
   }
 
   public void setContent(String content)
   {
     this.content = (content == null ? null : content.trim());
   }
 }

