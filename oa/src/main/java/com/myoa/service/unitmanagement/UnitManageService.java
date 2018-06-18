package com.myoa.service.unitmanagement;

import com.myoa.model.unitmanagement.UnitManage;

import javax.servlet.http.HttpServletRequest;

public abstract interface UnitManageService
{
  public abstract UnitManage showUnitManage(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract void addUnitManage(UnitManage paramUnitManage);

  public abstract void update(UnitManage paramUnitManage);
}

