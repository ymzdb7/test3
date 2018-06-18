package com.myoa.dao.email;

import com.myoa.dao.base.BaseMapper;
import com.myoa.model.email.EmailBoxModel;

import org.apache.ibatis.annotations.Param;

public abstract interface EmailBoxMapper extends BaseMapper<EmailBoxModel> {
	public abstract void deleteBox(Integer paramInteger);

	public abstract Integer selectNameCount(
			@Param("boxName") String paramString1,
			@Param("userId") String paramString2);

	public abstract Integer selectBoxIdCount(
			@Param("boxNo") Integer paramInteger,
			@Param("userId") String paramString);

	public abstract Integer selectBoxUpdate(
			@Param("boxNo") Integer paramInteger,
			@Param("boxName") String paramString1,
			@Param("userId") String paramString2);
}
