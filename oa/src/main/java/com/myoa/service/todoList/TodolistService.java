package com.myoa.service.todoList;

import com.myoa.model.daiban.Daiban;
import com.myoa.model.menu.SysFunction;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import javax.servlet.http.HttpServletRequest;

public abstract interface TodolistService
{
  public abstract Daiban list(String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest)
    throws Exception;

  public abstract Daiban readList(String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest)
    throws Exception;

  public abstract Daiban readTotal(String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest, String paramString3)
    throws Exception;

  public abstract BaseWrapper readHaveMsgList(String paramString1, String paramString2, String paramString3, HttpServletRequest paramHttpServletRequest)
    throws Exception;

  public abstract BaseWrapper readHaveList(String paramString1, String paramString2, String paramString3, HttpServletRequest paramHttpServletRequest)
    throws Exception;

  public abstract Daiban delete(Integer paramInteger, String paramString);

  public abstract ToJson<Users> queryUserByUserId(String paramString);

  public abstract ToJson<Users> queryCountByUserId(String paramString);

  public abstract ToJson<SysFunction> getSysFunctionByName(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<SysFunction> getCountSysFunctionByName(String paramString);

  public abstract BaseWrapper smsListByType(String paramString1, HttpServletRequest paramHttpServletRequest, String paramString2);

  public abstract BaseWrapper getUserFunctionByUserId(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract BaseWrapper getWillDocSendOrReceive(String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest);
}

