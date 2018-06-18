package com.myoa.service.site;

import com.myoa.model.site.Site;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface SiteService
{
  public abstract ToJson<Site> selectSite();

  public abstract ToJson<Site> selectSiteById(Site paramSite);

  public abstract ToJson<Site> insertSite(HttpServletRequest paramHttpServletRequest, Site paramSite);

  public abstract ToJson<Site> upSite(Site paramSite);

  public abstract ToJson<Site> delSite(Site paramSite);

  public abstract ToJson<Site> selectSiteByTemp(Site paramSite);
}
