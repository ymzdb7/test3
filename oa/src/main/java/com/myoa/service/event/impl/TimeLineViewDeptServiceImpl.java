 package com.myoa.service.event.impl;
 
 import com.myoa.dao.event.TimeLineViewDeptMapper;
import com.myoa.model.event.TimeLineViewDept;
import com.myoa.service.event.TimeLineViewDeptService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimeLineViewDeptServiceImpl
   implements TimeLineViewDeptService
 {
 
   @Resource
   TimeLineViewDeptMapper timeLineViewDeptMapper;
 
   public ToJson<TimeLineViewDept> updateTimeLineViewDept(HttpServletRequest request, TimeLineViewDept timeLineViewDept)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.timeLineViewDeptMapper.updateTimeLineViewDept(timeLineViewDept);
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
       L.e(new Object[] { "TimeLineViewDeptServiceImpl updateTimeLineViewDept:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLineViewDept> addTimeLineViewDept(HttpServletRequest request, TimeLineViewDept timeLineViewDept)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int b = this.timeLineViewDeptMapper.addTimeLineViewDept(timeLineViewDept);
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
       L.e(new Object[] { "TimeLineViewDeptServiceImpl addTimeLineViewDept:" + e });
     }
     return null;
   }
 }
