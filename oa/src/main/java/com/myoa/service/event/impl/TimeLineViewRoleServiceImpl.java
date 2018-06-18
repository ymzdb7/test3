 package com.myoa.service.event.impl;
 
 import com.myoa.dao.event.TimeLineViewRoleMapper;
import com.myoa.model.event.TimeLineViewRole;
import com.myoa.service.event.TimeLineViewRoleService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimeLineViewRoleServiceImpl
   implements TimeLineViewRoleService
 {
 
   @Resource
   TimeLineViewRoleMapper timeLineViewRoleMapper;
 
   public ToJson<TimeLineViewRole> addTimeLineViewRole(HttpServletRequest request, TimeLineViewRole timeLineViewRole)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.timeLineViewRoleMapper.addTimeLineViewRole(timeLineViewRole);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("新建失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineViewRoleServiceImpl addTimeLineViewRole:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLineViewRole> updateTimeLineViewRole(HttpServletRequest request, TimeLineViewRole timeLineViewRole)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int b = this.timeLineViewRoleMapper.updateTimeLineViewRole(timeLineViewRole);
       if (b > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("修改失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineViewRoleServiceImpl updateTimeLineViewRole:" + e });
     }
     return toJson;
   }
 }

