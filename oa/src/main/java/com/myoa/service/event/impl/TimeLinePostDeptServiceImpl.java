 package com.myoa.service.event.impl;
 
 import com.myoa.dao.event.TimeLinePostDeptMapper;
import com.myoa.model.event.TimeLinePostDept;
import com.myoa.service.event.TimeLinePostDeptService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimeLinePostDeptServiceImpl
   implements TimeLinePostDeptService
 {
 
   @Resource
   TimeLinePostDeptMapper timeLinePostDeptMapper;
 
   public ToJson<TimeLinePostDept> updateTimeLinePostDept(HttpServletRequest request, TimeLinePostDept timeLinePostDept)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.timeLinePostDeptMapper.updateTimeLinePostDept(timeLinePostDept);
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
       L.e(new Object[] { "TimeLinePostDeptServiceImpl updateTimeLinePostDept:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLinePostDept> addTimeLinePostDept(HttpServletRequest request, TimeLinePostDept timeLinePostDept)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int b = this.timeLinePostDeptMapper.addTimeLinePostDept(timeLinePostDept);
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
       L.e(new Object[] { "TimeLinePostDeptServiceImpl addTimeLinePostDept:" + e });
     }
     return toJson;
   }
 }
