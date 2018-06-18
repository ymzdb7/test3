package com.myoa.service.users;

import com.myoa.model.users.OrgManage;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

public abstract interface OrgManageService
{
  public abstract ToJson<OrgManage> queryId(String paramString);

  public abstract List<OrgManage> getOrgManage();

  public abstract OrgManage getOrgManageById(Integer paramInteger);

  public abstract void editOrgManage(OrgManage paramOrgManage, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<OrgManage> addOrgManage(OrgManage paramOrgManage, HttpServletRequest paramHttpServletRequest);

  public abstract BaseWrapper checkOrgManage(HttpServletRequest paramHttpServletRequest);
}
