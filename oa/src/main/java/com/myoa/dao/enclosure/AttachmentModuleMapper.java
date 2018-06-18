package com.myoa.dao.enclosure;

import com.myoa.model.enclosure.AttachmentModule;

public abstract interface AttachmentModuleMapper {
	public abstract int deleteByPrimaryKey(Byte paramByte);

	public abstract int insert(AttachmentModule paramAttachmentModule);

	public abstract int insertSelective(AttachmentModule paramAttachmentModule);

	public abstract AttachmentModule selectByPrimaryKey(Byte paramByte);

	public abstract int updateByPrimaryKeySelective(
			AttachmentModule paramAttachmentModule);

	public abstract int updateByPrimaryKey(
			AttachmentModule paramAttachmentModule);
}