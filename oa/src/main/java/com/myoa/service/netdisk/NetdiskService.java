package com.myoa.service.netdisk;

import com.myoa.model.netdisk.Netdisk;
import com.myoa.model.netdisk.NetdiskWrapper;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public abstract interface NetdiskService
{
  public static final int AUTH_TYPE_VISIT = 1;
  public static final int AUTH_TYPE_NEW = 17;
  public static final int AUTH_TYPE_MANGER = 18;
  public static final int AUTH_TYPE_DOWN = 19;

  public abstract BaseWrapper addNetdisk(Netdisk paramNetdisk);

  public abstract List<Netdisk> selectNetdisk();

  public abstract void delete(Integer paramInteger);

  public abstract int editNetdisk(Netdisk paramNetdisk);

  public abstract int editNetdiskJurisdiction(Map<String, Object> paramMap);

  public abstract NetdiskWrapper queryById(Integer paramInteger);

  public abstract BaseWrappers getNetDiskMenu(HttpServletRequest paramHttpServletRequest);

  public abstract BaseWrappers selectNetdiskBySearch(HttpServletRequest paramHttpServletRequest, String paramString1, Integer paramInteger1, Integer paramInteger2, String paramString2, String paramString3);

  public abstract boolean checkAuth(HttpServletRequest paramHttpServletRequest, String paramString, Integer paramInteger);

  public abstract Netdisk queryNetdiskold(String paramString);
}

