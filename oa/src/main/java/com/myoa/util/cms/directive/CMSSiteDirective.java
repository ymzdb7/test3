 package com.myoa.util.cms.directive;
 
 import com.myoa.dao.site.SiteMapper;
import com.myoa.model.site.Site;
import com.myoa.model.site.SiteExample;
import com.myoa.model.site.SiteExample.Criteria;
import com.myoa.util.common.StringUtils;

 import freemarker.core.Environment;
 import freemarker.template.TemplateDirectiveBody;
 import freemarker.template.TemplateDirectiveModel;
 import freemarker.template.TemplateException;
 import freemarker.template.TemplateModel;
 import java.io.IOException;
 import java.io.Writer;
 import java.util.HashMap;
 import java.util.List;
import java.util.Map;
 
 public class CMSSiteDirective
   implements TemplateDirectiveModel
 {
   public void execute(Environment environment, Map map, TemplateModel[] templateModels, TemplateDirectiveBody templateDirectiveBody)
     throws TemplateException, IOException
   {
     String siteIdFromParam = StringUtils.getString(map.get("id"));
 
     int siteId = StringUtils.getInteger(environment.getCustomAttribute("SITE_ID"), 0);
 
     int curChannelId = StringUtils.getInteger(environment.getCustomAttribute("CHANNEL_ID"), 0);
 
     SiteMapper siteMapper = (SiteMapper)environment.getCustomAttribute("siteMapper");
 
     Object loopObj = environment.getCustomAttribute("loopObj");
 
     Writer w = environment.getOut();
 
     Site site = null;
     if (!"".equals(siteIdFromParam)) {
       SiteExample example = new SiteExample();
       SiteExample.Criteria criteria = example.createCriteria();
       criteria.andPortalMarkEqualTo(siteIdFromParam);
       List sites = siteMapper.selectByExample(example);
       if ((sites != null) && (sites.size() > 0))
         site = (Site)sites.get(0);
     }
     else {
       site = siteMapper.selectByPrimaryKey(Integer.valueOf(siteId));
     }
     if (site == null) {
       return;
     }
     Map param = new HashMap();
     param.put("siteId", site.getPortalId());
     param.put("siteMark", site.getPortalMark());
     param.put("siteName", site.getPortalName());
     param.put("siteNo", site.getSortNo());
     param.put("sitePath", site.getPath());
 
     environment.setCustomAttribute("loopObj", param);
     if (templateDirectiveBody != null) {
       templateDirectiveBody.render(w);
     }
 
     environment.setCustomAttribute("loopObj", loopObj);
   }
 }
