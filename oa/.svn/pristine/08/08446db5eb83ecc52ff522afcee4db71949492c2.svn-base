 package com.myoa.service.event.impl;
 
 import com.myoa.dao.event.TimeLinePostUserMapper;
import com.myoa.model.event.TimeLinePostUser;
import com.myoa.service.event.TimeLinePostUserService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimeLinePostUserServiceImpl
   implements TimeLinePostUserService
 {
 
   @Resource
   TimeLinePostUserMapper timeLinePostUserMapper;
 
   public ToJson<TimeLinePostUser> updateTimeLinePostUser(TimeLinePostUser timeLinePostUser)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.timeLinePostUserMapper.updateTimeLinePostUser(timeLinePostUser);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("修改失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLinePostUserServiceImpl updateTimeLinePostUser:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLinePostUser> addTimeLinePostUser(TimeLinePostUser timeLinePostUser)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int b = this.timeLinePostUserMapper.addTimeLinePostUser(timeLinePostUser);
       if (b > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("新建失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLinePostUserServiceImpl addTimeLinePostUser:" + e });
     }
     return toJson;
   }
 }

