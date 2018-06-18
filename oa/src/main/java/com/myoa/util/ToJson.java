 package com.myoa.util;
 
 import java.util.ArrayList;
 import java.util.List;
 
 public class ToJson<T>
 {
   private List<T> obj = new ArrayList<T>();
   private Object object;
   private boolean flag;
   private String msg;
   private String code;
   private String token;
   private Integer totleNum;
   private Integer draftsCount;
   private Integer hairboxCount;
   private Integer inboxCount;
   private Object obj1;
 
   public Integer getDraftsCount()
   {
     return this.draftsCount;
   }
 
   public void setDraftsCount(Integer draftsCount) {
     this.draftsCount = draftsCount;
   }
 
   public Integer getHairboxCount() {
     return this.hairboxCount;
   }
 
   public void setHairboxCount(Integer hairboxCount) {
     this.hairboxCount = hairboxCount;
   }
 
   public Integer getInboxCount() {
     return this.inboxCount;
   }
 
   public void setInboxCount(Integer inboxCount) {
     this.inboxCount = inboxCount;
   }
 
   public Object getObj1()
   {
     return this.obj1;
   }
 
   public void setObj1(Object obj1) {
     this.obj1 = obj1;
   }
 
   public ToJson(int flag, String msg)
   {
     if (flag == 0)
       this.flag = true;
     else {
       this.flag = false;
     }
     this.msg = msg;
   }
 
   public ToJson()
   {
   }
 
   public List<T> getObj()
   {
     return this.obj;
   }
 
   public void setObj(List<T> obj)
   {
     this.obj = obj;
   }
 
   public String getMsg()
   {
     return this.msg;
   }
 
   public void setMsg(String msg)
   {
     this.msg = msg;
   }
 
   public Object getObject()
   {
     return this.object;
   }
 
   public void setObject(Object object)
   {
     this.object = object;
   }
 
   public boolean isFlag()
   {
     return this.flag;
   }
 
   public void setFlag(int flag)
   {
     if (flag == 0)
       this.flag = true;
     else
       this.flag = false;
   }
 
   public Integer getTotleNum()
   {
     return this.totleNum;
   }
 
   public void setTotleNum(Integer totleNum)
   {
     this.totleNum = totleNum;
   }
 
   public String getCode()
   {
     return this.code;
   }
 
   public void setCode(String code) {
     this.code = code;
   }
 
   public String getToken() {
     return this.token;
   }
 
   public void setToken(String token) {
     this.token = token;
   }
 }

