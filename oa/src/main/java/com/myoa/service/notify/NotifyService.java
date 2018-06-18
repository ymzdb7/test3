package com.myoa.service.notify;

import com.myoa.model.department.Department;
import com.myoa.model.notify.Notify;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface NotifyService
{
  public abstract ToJson<Notify> selectNotify(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString)
    throws Exception;

  public abstract ToJson<Notify> selectNotifyManage(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString1, String paramString2)
    throws Exception;

  public abstract ToJson<Notify> unreadNotify(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString1, String paramString2)
    throws Exception;

  public abstract ToJson<Notify> readNotify(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString1, String paramString2)
    throws Exception;

  public abstract List<Notify> getNotifyById(String paramString);

  public abstract void updateNotify(Notify paramNotify, String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest);

  public abstract Notify getNotifyById(Integer paramInteger);

  public abstract int addNotify(Notify paramNotify, String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest);

  public abstract void delete(Integer paramInteger);

  public abstract Notify queryById(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString1, String paramString2, String paramString3)
    throws Exception;

  public abstract ToJson<Notify> deleteByids(String[] paramArrayOfString);

  public abstract void queryDeleteByStaleDated();

  public abstract ToJson<Notify> updateByids(String[] paramArrayOfString, String paramString);

  public abstract ToJson<Notify> ConsultTheSituationNotify(String paramString);

  public abstract ToJson<Department> getNotifyGroupFromDept(Notify paramNotify);

  public abstract ToJson<Notify> getNotifyByFromDept(Notify paramNotify);

  public abstract ToJson<Notify> getNotifyByFromIdAndDept(Notify paramNotify);

  public abstract ToJson<Notify> getNotifyByNotifyId(String paramString);

  public abstract ToJson<Notify> outputNotify(int paramInt, Notify paramNotify, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse);

  public abstract BaseWrapper selectByType();
}
