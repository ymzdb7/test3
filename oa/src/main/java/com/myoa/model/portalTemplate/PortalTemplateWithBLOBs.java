 package com.myoa.model.portalTemplate;
 
 public class PortalTemplateWithBLOBs extends PortalTemplate
 {
   private String templateName;
   private String templateDesc;
   private String templateContent;
 
   public String getTemplateName()
   {
     return this.templateName;
   }
 
   public void setTemplateName(String templateName)
   {
     this.templateName = (templateName == null ? null : templateName.trim());
   }
 
   public String getTemplateDesc()
   {
     return this.templateDesc;
   }
 
   public void setTemplateDesc(String templateDesc)
   {
     this.templateDesc = (templateDesc == null ? null : templateDesc.trim());
   }
 }

