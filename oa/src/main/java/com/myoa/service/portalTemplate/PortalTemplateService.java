package com.myoa.service.portalTemplate;

import com.myoa.model.portalTemplate.PortalTemplateWithBLOBs;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface PortalTemplateService
{
  public abstract ToJson<PortalTemplateWithBLOBs> selectPortalTemplate(Integer paramInteger);

  public abstract ToJson<PortalTemplateWithBLOBs> selectPortalTemplateById(Integer paramInteger);

  public abstract ToJson<PortalTemplateWithBLOBs> insertPortalTemplate(HttpServletRequest paramHttpServletRequest, PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs);

  public abstract ToJson<PortalTemplateWithBLOBs> upPortalTemplate(PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs);

  public abstract ToJson<PortalTemplateWithBLOBs> delPortalTemplate(PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs);
}

