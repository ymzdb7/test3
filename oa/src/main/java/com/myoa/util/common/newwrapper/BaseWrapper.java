 package com.myoa.util.common.newwrapper;
 
 import com.myoa.util.DateFormat;

import java.util.Date;
 
 public class BaseWrapper
 {
   protected Integer status;
   protected String flag;
   protected String msg;
   protected String time;
 
   public Integer getStatus()
   {
     return this.status;
   }
 
   public void setStatus(Integer status) {
     this.status = status;
   }
 
   public String getFlag() {
     return this.flag;
   }
 
   public void setFlag(String flag) {
     this.flag = flag;
   }
 
   public String getMsg() {
     return this.msg;
   }
 
   public void setMsg(String msg) {
     this.msg = msg;
   }
 
   public String getTime() {
     if (this.time == null) {
       this.time = DateFormat.getStrDate(new Date());
     }
     return this.time;
   }
 
   public void setTime(String time)
   {
     this.time = time;
   }
 }

