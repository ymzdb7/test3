package com.myoa.service.wechat.weChat;

import com.myoa.model.users.Users;
import com.myoa.model.wechat.LikeUser;
import com.myoa.model.wechat.WeChat;
import com.myoa.util.ToJson;

import java.util.Map;

public abstract interface WeChatService
{
  public abstract ToJson<WeChat> insertWeChat(WeChat paramWeChat, Users paramUsers);

  public abstract ToJson<WeChat> selectWeChat(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString, Users paramUsers);

  public abstract ToJson<WeChat> updateWeChatByPrimaryKey(Integer paramInteger, Users paramUsers);

  public abstract ToJson<WeChat> selectWeChatByPrimaryKey(Integer paramInteger, String paramString);

  public abstract ToJson<WeChat> deleteByPrimaryKey(Integer paramInteger);

  public abstract ToJson<LikeUser> getLikeUser(Integer paramInteger);
}

