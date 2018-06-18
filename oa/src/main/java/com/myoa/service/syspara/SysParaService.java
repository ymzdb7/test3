package com.myoa.service.syspara;

import com.myoa.model.common.SysPara;
import com.myoa.model.users.Users;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public abstract interface SysParaService
{
  public abstract List<SysPara> getIeTitle();

  public abstract List<SysPara> getIeTitle1();

  public abstract void updateSysPara(SysPara paramSysPara);

  public abstract void updateSysPara1(SysPara paramSysPara);

  public abstract List<SysPara> getTheSysParam(String paramString);

  public abstract ToJson<SysPara> getUserName(String paramString);

  public abstract ToJson<Object> editSysPara(String paramString);

  public abstract boolean checkIsHaveSecure(Users paramUsers, Integer paramInteger);

  public abstract ToJson<Object> getStatus();

  public abstract ToJson<SysPara> eduSetParam(String paramString1, String paramString2, String paramString3);

  public abstract AjaxJson selEduParam();

  public abstract ToJson<Object> editOperator(String paramString);

  public abstract ToJson<SysPara> getOperator(String paramString);
}

