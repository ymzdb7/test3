 package com.myoa.util.common.wrapper;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 
 public class BaseWrapper
 {
   boolean status;
   boolean flag;
   String msg;
   Date time;
   Object data;
   String code;
 
   public BaseWrapper()
   {
     this.time = new Date();
     this.status = true;
   }
 
   public BaseWrapper(boolean status, boolean flag, String msg, Object data)
   {
     this.status = status;
     this.flag = flag;
     this.msg = msg;
     this.time = new Date();
     this.data = data;
   }
 
   public String getCode() {
     return this.code == null ? "0" : this.code;
   }
 
   public void setCode(String code) {
     this.code = code;
   }
 
   public Object getData() {
     return this.data;
   }
 
   public void setData(Object data) {
     this.data = data;
   }
   public boolean getStatus() {
     return this.status;
   }
 
   public void setStatus(boolean status) {
     this.status = status;
   }
 
   public boolean isFlag() {
     return this.flag;
   }
 
   public void setFlag(boolean flag) {
     this.flag = flag;
   }
 
   public String getMsg() {
     return this.msg;
   }
 
   public void setMsg(String msg) {
     this.msg = msg;
   }
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   public Date getTime() {
     if (this.time == null) {
       this.time = new Date();
     }
     return this.time;
   }
 
   public void setTime(Date time) {
     this.time = time;
   }
 }
