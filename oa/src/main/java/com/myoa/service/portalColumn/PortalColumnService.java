package com.myoa.service.portalColumn;

import com.myoa.model.portalColumn.PortalColumn;
import com.myoa.model.portalColumn.TeeZTreeModel;
import com.myoa.model.site.Site;
import com.myoa.util.ToJson;

public abstract interface PortalColumnService
{
  public abstract ToJson<PortalColumn> selectPortalColumn();

  public abstract ToJson selectPortalColumnById(Integer paramInteger);

  public abstract ToJson<Site> selectSite();

  public abstract ToJson<PortalColumn> insertPortalColumn(PortalColumn paramPortalColumn);

  public abstract ToJson<PortalColumn> upPortalColumn(PortalColumn paramPortalColumn);

  public abstract ToJson<PortalColumn> delPortalColumn(Integer[] paramArrayOfInteger);

  public abstract ToJson<TeeZTreeModel> ColumnTree(String paramString, Integer[] paramArrayOfInteger1, Integer[] paramArrayOfInteger2);
}

