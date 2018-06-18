 package com.myoa.model.url;
 
 public class Url
 {
   private Integer urlId;
   private Integer urlNo;
   private String url;
   private String user;
   private String urlType;
   private String subType;
   private String urlIcon;
   private String urlDesc;
 
   public Integer getUrlId()
   {
     return this.urlId;
   }
 
   public void setUrlId(Integer urlId)
   {
     this.urlId = urlId;
   }
 
   public Integer getUrlNo()
   {
     return this.urlNo;
   }
 
   public void setUrlNo(Integer urlNo)
   {
     this.urlNo = urlNo;
   }
 
   public String getUrl()
   {
     return this.url;
   }
 
   public void setUrl(String url)
   {
     this.url = (url == null ? null : url.trim());
   }
 
   public String getUser()
   {
     return this.user;
   }
 
   public void setUser(String user)
   {
     this.user = (user == null ? null : user.trim());
   }
 
   public String getUrlType()
   {
     return this.urlType;
   }
 
   public void setUrlType(String urlType)
   {
     this.urlType = (urlType == null ? null : urlType.trim());
   }
 
   public String getSubType()
   {
     return this.subType;
   }
 
   public void setSubType(String subType)
   {
     this.subType = (subType == null ? null : subType.trim());
   }
 
   public String getUrlIcon()
   {
     return this.urlIcon;
   }
 
   public void setUrlIcon(String urlIcon)
   {
     this.urlIcon = (urlIcon == null ? null : urlIcon.trim());
   }
 
   public String getUrlDesc()
   {
     return this.urlDesc;
   }
 
   public void setUrlDesc(String urlDesc)
   {
     this.urlDesc = (urlDesc == null ? null : urlDesc.trim());
   }
 }

