package com.myoa.service.sys;

import com.myoa.model.sys.SealWithBLOBs;
import com.myoa.util.ToJson;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

public abstract interface SealService
{
  public abstract ToJson<Object> addSealObject(HttpServletRequest paramHttpServletRequest, SealWithBLOBs paramSealWithBLOBs);

  public abstract ToJson<Object> editSealObject(HttpServletRequest paramHttpServletRequest, SealWithBLOBs paramSealWithBLOBs);

  public abstract List<SealWithBLOBs> getSealByUser(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<SealWithBLOBs> getAllSealInfo(SealWithBLOBs paramSealWithBLOBs, String paramString1, String paramString2);

  public abstract ToJson<SealWithBLOBs> getSealById(String paramString);

  public abstract ToJson<Object> deleteSeal(HttpServletRequest paramHttpServletRequest, String[] paramArrayOfString);

  public abstract ToJson<Object> getSealIdById(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<SealWithBLOBs> getSealBySealId(HttpServletRequest paramHttpServletRequest, String paramString);
}

