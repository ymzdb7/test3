 package com.myoa.util.common.wrapper;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 import java.util.List;
 
 public class BaseWrappers<T>
 {
   boolean status;
   boolean flag;
   String msg;
   Date time;
   List<T> datas;
   Integer total;
 
   public BaseWrappers()
   {
     this.time = new Date();
   }
 
   public BaseWrappers(boolean status, boolean flag, String msg, List<T> datas)
   {
     this.status = status;
     this.flag = flag;
     this.msg = msg;
     this.time = new Date();
     this.datas = datas;
   }
   public boolean isStatus() {
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
   public Date getTime() { if (this.time == null) {
       this.time = new Date();
     }
     return this.time; }
 
   public void setTime(Date time) {
     this.time = time;
   }
   public List<T> getDatas() {
     return this.datas;
   }
   public void setDatas(List<T> datas) {
     this.datas = datas;
   }
   public Integer getTotal() {
     return this.total;
   }
 
   public void setTotal(Integer total) {
     this.total = total;
   }
 }

