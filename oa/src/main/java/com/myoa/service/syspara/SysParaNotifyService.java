package com.myoa.service.syspara;

import com.myoa.model.notify.Notify;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface SysParaNotifyService
{
  public abstract ToJson<Object> editNotify(String paramString1, String paramString2, String paramString3, String paramString4);

  public abstract ToJson<Object> selectNotify();

  public abstract ToJson<Object> getDeptManagers(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Notify> getApprovedNotifyList(String paramString, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4, Boolean paramBoolean);

  public abstract ToJson<Notify> getPendingNotifyList(String paramString, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4, Boolean paramBoolean);

  public abstract ToJson<Object> getNotifyTypeList();

  public abstract ToJson<Object> getNotifyCode();
}

