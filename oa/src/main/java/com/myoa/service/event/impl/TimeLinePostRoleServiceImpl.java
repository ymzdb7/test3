 package com.myoa.service.event.impl;
 
 import com.myoa.dao.event.TimeLinePostRoleMapper;
import com.myoa.model.event.TimeLinePostRole;
import com.myoa.service.event.TimeLinePostRoleService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimeLinePostRoleServiceImpl
   implements TimeLinePostRoleService
 {
 
   @Resource
   TimeLinePostRoleMapper timeLinePostRoleMapper;
 
   public ToJson<TimeLinePostRole> updateTimeLinePostRole(HttpServletRequest request, TimeLinePostRole timeLinePostRole)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.timeLinePostRoleMapper.updateTimeLinePostRole(timeLinePostRole);
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
       L.e(new Object[] { "TimeLinePostUserServiceImpl updateTimeLinePostRole:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLinePostRole> addTimeLinePostRole(HttpServletRequest request, TimeLinePostRole timeLinePostRole)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int b = this.timeLinePostRoleMapper.addTimeLinePostRole(timeLinePostRole);
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
       L.e(new Object[] { "TimeLinePostUserServiceImpl addTimeLinePostRole:" + e });
     }
     return toJson;
   }
 }
