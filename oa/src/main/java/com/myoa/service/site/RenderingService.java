 package com.myoa.service.site;
 
 import com.myoa.dao.portal.SiteTemplateMapper;
import com.myoa.dao.portalColumn.PortalColumnMapper;
import com.myoa.dao.portalTemplate.PortalTemplateMapper;
import com.myoa.dao.site.SiteMapper;
import com.myoa.model.portalTemplate.PortalTemplate;
import com.myoa.model.site.Site;
import com.myoa.util.cms.CMSTemplateUtil;

 import freemarker.template.Configuration;
 import freemarker.template.Template;
 import freemarker.template.TemplateException;
 import java.io.ByteArrayOutputStream;
 import java.io.File;
 import java.io.IOException;
 import java.io.OutputStreamWriter;
 import java.io.Writer;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class RenderingService
 {
 
   @Autowired
   SiteMapper siteMapper;
 
   @Autowired
   SiteTemplateMapper siteTemplateMapper;
 
   @Autowired
   PortalColumnMapper portalColumnMapper;
 
   @Autowired
   PortalTemplateMapper portalTemplateMapper;
 
   public String renderSite(int siteId, Map param, boolean preview, String rootPath)
   {
     Site site = this.siteMapper.selectByPrimaryKey(Integer.valueOf(siteId));
 
     PortalTemplate portalTemplate = this.portalTemplateMapper.selectByPrimaryKey(site.getHomeTemplate());
     if (portalTemplate != null)
     {
       String path = rootPath + File.separator + "cmsTmp" + File.separator + portalTemplate.getPortalId();
       Configuration config = new Configuration();
       ByteArrayOutputStream outStream = null;
       Writer w = null;
       try {
         config.setDirectoryForTemplateLoading(new File(path));
 
         config.setCustomAttribute("siteMapper", this.siteMapper);
 
         config.setCustomAttribute("siteTemplateMapper", this.siteTemplateMapper);
 
         config.setCustomAttribute("portalColumnMapper", this.portalColumnMapper);
 
         config.setCustomAttribute("ROOT_PATH", "/");
         config.setCustomAttribute("SITE_ID", site.getPortalId());
 
         Template template = config.getTemplate(portalTemplate.getTemplateFile(), "UTF-8");
         outStream = new ByteArrayOutputStream();
         w = new OutputStreamWriter(outStream, "UTF-8");
 
         template.process(CMSTemplateUtil.getInstance(), w);
         String str1 = outStream.toString("UTF-8");
         return str1;
       }
       catch (IOException e)
       {
         e.printStackTrace();
       } catch (TemplateException e) {
         e.printStackTrace();
       } finally {
         if (outStream != null)
           try {
             outStream.close();
           }
           catch (IOException e) {
           }
         if (w != null) {
           try {
             w.close();
           }
           catch (IOException e)
           {
           }
         }
       }
     }
     return null;
   }
 }

