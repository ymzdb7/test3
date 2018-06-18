package com.myoa.dao.wechat;

import com.myoa.model.wechat.WeChat;

import java.util.List;
import java.util.Map;

public abstract interface WeChatMapper {
	public abstract int insertWeChat(WeChat paramWeChat);

	public abstract List<WeChat> selectWeChat(Map<String, Object> paramMap);

	public abstract int updateWeChatByPrimaryKey(WeChat paramWeChat);

	public abstract WeChat selectWeChatByPrimaryKey(Integer paramInteger);

	public abstract int deleteByPrimaryKey(Integer paramInteger);
}