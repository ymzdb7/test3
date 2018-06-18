 package com.myoa.service.event.impl;
 
 import com.myoa.dao.event.TimeLineViewUserMapper;
import com.myoa.model.event.TimeLineViewUser;
import com.myoa.service.event.TimeLineViewUserService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimeLineViewUserServiceImpl
   implements TimeLineViewUserService
 {
 
   @Resource
   TimeLineViewUserMapper timeLineViewUserMapper;
 
   public ToJson<TimeLineViewUser> updateTimeLineViewUser(HttpServletRequest request, TimeLineViewUser timeLineViewUser)
   {
     ToJson toJson = new ToJson(1, "error");
 
     return toJson;
   }
 
   public ToJson<TimeLineViewUser> addTimeLineViewUser(HttpServletRequest request, TimeLineViewUser timeLineViewUser)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.timeLineViewUserMapper.addTimeLineViewUser(timeLineViewUser);
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
       L.e(new Object[] { "TimeLineViewUserServiceImpl addTimeLineViewUser:" + e });
     }
     return toJson;
   }
 }

