package com.myoa.service.menu;

import com.myoa.model.common.SysParaExtend;
import com.myoa.model.menu.SysFunction;
import com.myoa.model.menu.SysMenu;
import com.myoa.util.ToJson;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface MenuService
{
  public abstract List<SysMenu> getAll(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract List<SysMenu> getAllWithEmpty(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract List<SysFunction> getDadMenu(String paramString1, String paramString2);

  public abstract void updateSysMenu(SysMenu paramSysMenu);

  public abstract void addSysMenu(SysMenu paramSysMenu);

  public abstract void deleteSysMenu(String paramString);

  public abstract ToJson<SysFunction> addFunctionMenu(SysFunction paramSysFunction, String paramString);

  public abstract void editSysFunction(SysFunction paramSysFunction);

  public abstract List<SysFunction> findChildMenu(String paramString1, String paramString2);

  public abstract List<SysMenu> getTheFirstMenu(String paramString1, String paramString2);

  public abstract ToJson<Integer> findMaxId();

  public abstract List<SysFunction> getMenus(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2);

  public abstract List<SysMenu> getAllMenu(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract List<SysFunction> getSysFunctionByName(String paramString);

  public abstract int getCountSysFunctionByName(String paramString);

  public abstract List<SysFunction> getPriMenu(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<List<SysFunction>> getErrMenu();

  public abstract ToJson<Object> recoverMenu(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract void exportMenu(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse);

  public abstract ToJson<Object> editMenuPara(SysParaExtend paramSysParaExtend);

  public abstract ToJson<SysParaExtend> getParaInfo();

  public abstract SysFunction getSysFunctionByFid(Integer paramInteger);
}