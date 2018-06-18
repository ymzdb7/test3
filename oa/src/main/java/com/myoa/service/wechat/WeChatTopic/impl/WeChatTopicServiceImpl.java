 package com.myoa.service.wechat.WeChatTopic.impl;
 
 import com.myoa.dao.wechat.WeChatTopicMapper;
import com.myoa.model.wechat.WeChatTopic;
import com.myoa.service.wechat.WeChatTopic.WeChatTopicService;
import com.myoa.util.ToJson;

 import java.util.List;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class WeChatTopicServiceImpl
   implements WeChatTopicService
 {
 
   @Resource
   private WeChatTopicMapper weChatTopicMapper;
 
   public ToJson<WeChatTopic> selectAllWeChatTopic()
   {
     ToJson json = new ToJson();
     try {
       List weChatTopicList = this.weChatTopicMapper.selectAllWeChatTopic();
       json.setObj(weChatTopicList);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
 
     return json;
   }
   public ToJson<WeChatTopic> updateWeChatTopic(WeChatTopic weChatTopic) {
     ToJson json = new ToJson();
     try {
       this.weChatTopicMapper.updateWeChatTopic(weChatTopic);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 }

