package com.myoa.service.portals;

import com.myoa.model.portals.Portals;
import com.myoa.model.portals.PortalsUser;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

import javax.servlet.http.HttpServletRequest;

public abstract interface PortalsService
{
  public abstract ToJson<Portals> addPortals(Portals paramPortals);

  public abstract ToJson<Portals> updatePortals(Portals paramPortals);

  public abstract ToJson<Portals> selPortals(PageParams paramPageParams, Portals paramPortals);

  public abstract ToJson<Portals> deletePortals(String paramString);

  public abstract ToJson<Portals> selPortalsById(Integer paramInteger);

  public abstract ToJson<PortalsUser> selPortalsUser(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Portals> selIndexPortals(HttpServletRequest paramHttpServletRequest);
}

