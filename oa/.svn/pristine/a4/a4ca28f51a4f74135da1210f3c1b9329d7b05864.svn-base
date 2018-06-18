package com.myoa.service.users;

import com.myoa.model.menu.SysFunction;
import com.myoa.model.users.UserFunction;
import com.myoa.util.ToJson;

import java.util.List;

public abstract interface UserFunctionService
{
  public abstract ToJson<SysFunction> getMenu(int paramInt);

  public abstract List<String> getUserNameByFuncId(String paramString);

  public abstract void updateAuthUser(String paramString1, String paramString2);

  public abstract void deleteAuthUser(String paramString1, String paramString2);

  public abstract UserFunction getMenuByUserId(int paramInt);

  public abstract String getUserFunctionStr(String paramString);

  public abstract String getUserFunctionStrById(Integer paramInteger);
}

