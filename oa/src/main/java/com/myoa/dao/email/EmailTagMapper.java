package com.myoa.dao.email;

import com.myoa.model.email.EmailTagModel;

public abstract interface EmailTagMapper {
	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(EmailTagModel paramEmailTagModel);

	public abstract int insertSelective(EmailTagModel paramEmailTagModel);

	public abstract EmailTagModel selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByPrimaryKeySelective(
			EmailTagModel paramEmailTagModel);

	public abstract int updateByPrimaryKey(EmailTagModel paramEmailTagModel);
}