package com.myoa.dao.worldnews;

import com.myoa.model.worldnews.NewsComment;

import java.util.List;

public abstract interface NewsCommentMapper {
	public abstract void addNewsComment(NewsComment paramNewsComment);

	public abstract List<NewsComment> getNewsCommentInfo(String paramString);

	public abstract int getCount(Integer paramInteger);

	public abstract void deleteComment(Integer paramInteger);

	public abstract List<NewsComment> getCommentByparentId(Integer paramInteger);

	public abstract void deleteRelateComment(Integer paramInteger);

	public abstract int getNewsCount(Integer paramInteger);

	public abstract NewsComment getNewsCommentById(Integer paramInteger);
}