 package com.myoa.model.version;
 
 public class Version
 {
   private String ver;
   private String ea;
   private String sn;
   private String code;
 
   public String getVer()
   {
     return this.ver;
   }
 
   public void setVer(String ver)
   {
     this.ver = (ver == null ? null : ver.trim());
   }
 
   public String getEa()
   {
     return this.ea;
   }
 
   public void setEa(String ea)
   {
     this.ea = (ea == null ? null : ea.trim());
   }
 
   public String getSn()
   {
     return this.sn;
   }
 
   public void setSn(String sn)
   {
     this.sn = (sn == null ? null : sn.trim());
   }
 
   public String getCode()
   {
     return this.code;
   }
 
   public void setCode(String code)
   {
     this.code = (code == null ? null : code.trim());
   }
 }

