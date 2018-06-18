package com.myoa.dao.email;

import com.myoa.dao.base.BaseMapper;
import com.myoa.model.email.Webmail;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface WebmailMapper extends BaseMapper<Webmail> {
	public abstract void deleteWebMail(@Param("mailId") Integer paramInteger);

	public abstract Webmail selectWebMail(@Param("email") String paramString);

	public abstract List<Webmail> selectUserWebMail(
			@Param("userId") String paramString);

	public abstract Webmail selectOneWebMail(
			@Param("userId") String paramString,
			@Param("mailId") Integer paramInteger);
}
