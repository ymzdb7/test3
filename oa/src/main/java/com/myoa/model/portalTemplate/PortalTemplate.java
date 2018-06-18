 package com.myoa.model.portalTemplate;
 
 public class PortalTemplate
 {
   private Integer templateId;
   private Integer portalId;
   private String templateFile;
 
   public Integer getTemplateId()
   {
     return this.templateId;
   }
 
   public void setTemplateId(Integer templateId)
   {
     this.templateId = templateId;
   }
 
   public Integer getPortalId()
   {
     return this.portalId;
   }
 
   public void setPortalId(Integer portalId)
   {
     this.portalId = portalId;
   }
 
   public String getTemplateFile()
   {
     return this.templateFile;
   }
 
   public void setTemplateFile(String templateFile)
   {
     this.templateFile = (templateFile == null ? null : templateFile.trim());
   }
 }

