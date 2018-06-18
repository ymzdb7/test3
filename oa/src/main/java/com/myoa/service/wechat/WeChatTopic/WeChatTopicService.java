package com.myoa.service.wechat.WeChatTopic;

import com.myoa.model.wechat.WeChatTopic;
import com.myoa.util.ToJson;

public abstract interface WeChatTopicService
{
  public abstract ToJson<WeChatTopic> selectAllWeChatTopic();

  public abstract ToJson<WeChatTopic> updateWeChatTopic(WeChatTopic paramWeChatTopic);
}

