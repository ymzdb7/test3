 package com.myoa.model.portal;
 
 public class SiteTemplate
 {
   private Integer sid;
   private Integer siteId;
   private String tplDesc;
   private String tplFileName;
   private String tplName;
 
   public Integer getSid()
   {
     return this.sid;
   }
 
   public void setSid(Integer sid)
   {
     this.sid = sid;
   }
 
   public Integer getSiteId()
   {
     return this.siteId;
   }
 
   public void setSiteId(Integer siteId)
   {
     this.siteId = siteId;
   }
 
   public String getTplDesc()
   {
     return this.tplDesc;
   }
 
   public void setTplDesc(String tplDesc)
   {
     this.tplDesc = (tplDesc == null ? null : tplDesc.trim());
   }
 
   public String getTplFileName()
   {
     return this.tplFileName;
   }
 
   public void setTplFileName(String tplFileName)
   {
     this.tplFileName = (tplFileName == null ? null : tplFileName.trim());
   }
 
   public String getTplName()
   {
     return this.tplName;
   }
 
   public void setTplName(String tplName)
   {
     this.tplName = (tplName == null ? null : tplName.trim());
   }
 }
