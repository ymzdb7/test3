package com.myoa.service.worldnews;

import com.myoa.model.users.Users;
import com.myoa.model.worldnews.NewsComment;
import com.myoa.util.ToJson;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

public abstract interface NewsCommentService
{
  public abstract void addNewsComment(HttpServletRequest paramHttpServletRequest, NewsComment paramNewsComment);

  public abstract List<NewsComment> getNewsCommentInfo(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<Users> getUser(HttpServletRequest paramHttpServletRequest);

  public abstract int getCount(String paramString);

  public abstract String deleteComment(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract int getNewsCount(String paramString);
}

