package com.myoa.service.menu;

import com.myoa.model.menu.MobileApp;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

public abstract interface MobileAppService
{
  public abstract List<MobileApp> getMobileAppList(HttpServletRequest paramHttpServletRequest);
}

