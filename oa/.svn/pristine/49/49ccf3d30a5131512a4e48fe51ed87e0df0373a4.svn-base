 package com.myoa.model.workPlan;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 import org.springframework.format.annotation.DateTimeFormat;
 
 public class WorkDetail
 {
   private Integer detailId;
   private String planId;
 
   @DateTimeFormat(pattern="yyyy-MM-dd HH:MM:ss")
   @JSONField(format="yyyy-MM-dd HH:MM:ss")
   private Date writeTime;
   private String writeTimeStr;
   private Integer percent;
   private String typeFlag;
   private String writer;
   private String writerName;
 
   @DateTimeFormat(pattern="yyyy-MM-dd HH:MM:ss")
   @JSONField(format="yyyy-MM-dd HH:MM:ss")
   private Date current;
 
   public String getWriteTimeStr()
   {
     return this.writeTimeStr;
   }
 
   public void setWriteTimeStr(String writeTimeStr) {
     this.writeTimeStr = writeTimeStr;
   }
 
   public Date getCurrent() {
     return this.current;
   }
 
   public void setCurrent(Date current) {
     this.current = current;
   }
 
   public String getWriterName() {
     return this.writerName == null ? "" : this.writerName;
   }
 
   public void setWriterName(String writerName) {
     this.writerName = writerName;
   }
 
   public Integer getDetailId()
   {
     return this.detailId;
   }
 
   public void setDetailId(Integer detailId)
   {
     this.detailId = detailId;
   }
 
   public String getPlanId()
   {
     return this.planId;
   }
 
   public void setPlanId(String planId)
   {
     this.planId = (planId == null ? null : planId.trim());
   }
 
   public Date getWriteTime()
   {
     return this.writeTime;
   }
 
   public void setWriteTime(Date writeTime)
   {
     this.writeTime = writeTime;
   }
 
   public Integer getPercent()
   {
     return this.percent;
   }
 
   public void setPercent(Integer percent)
   {
     this.percent = percent;
   }
 
   public String getTypeFlag()
   {
     return this.typeFlag;
   }
 
   public void setTypeFlag(String typeFlag)
   {
     this.typeFlag = (typeFlag == null ? null : typeFlag.trim());
   }
 
   public String getWriter()
   {
     return this.writer;
   }
 
   public void setWriter(String writer)
   {
     this.writer = (writer == null ? null : writer.trim());
   }
 }

