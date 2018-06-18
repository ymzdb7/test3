 package com.myoa.model.sms2;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 import org.springframework.format.annotation.DateTimeFormat;
 
 public class Sms2
 {
   private Integer smsId;
   private String fromId;
   private String phone;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date sendTime;
   private String sendFlag;
   private Byte sendNum;
   private String content;
 
   public Integer getSmsId()
   {
     return this.smsId;
   }
 
   public void setSmsId(Integer smsId)
   {
     this.smsId = smsId;
   }
 
   public String getFromId()
   {
     return this.fromId;
   }
 
   public void setFromId(String fromId)
   {
     this.fromId = (fromId == null ? null : fromId.trim());
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
 
   public String getSendFlag()
   {
     return this.sendFlag;
   }
 
   public void setSendFlag(String sendFlag)
   {
     this.sendFlag = (sendFlag == null ? null : sendFlag.trim());
   }
 
   public Byte getSendNum()
   {
     return this.sendNum;
   }
 
   public void setSendNum(Byte sendNum)
   {
     this.sendNum = sendNum;
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

