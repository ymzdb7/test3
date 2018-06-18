 package com.myoa.service.event.impl;
 
 import com.myoa.dao.event.TimelineEventMapper;
import com.myoa.model.event.TimeLine;
import com.myoa.model.event.TimelineEvent;
import com.myoa.service.event.TimeLineEventService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import java.util.List;
 import java.util.UUID;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimeLineEventServiceImpl
   implements TimeLineEventService
 {
 
   @Resource
   TimelineEventMapper timelineEventMapper;
 
   public ToJson<TimelineEvent> getEventList(HttpServletRequest request, TimelineEvent timelineEvent, TimeLine timeLine)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       timeLine.getUuid();
       List list = this.timelineEventMapper.getEventList(timelineEvent);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("列表为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineEventServiceImpl getEventList:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimelineEvent> getEventDetailByUuid(HttpServletRequest request, String uuid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       TimelineEvent timelineEvent = this.timelineEventMapper.getEventDetailByUuid(uuid);
       if (timelineEvent != null) {
         toJson.setObject(timelineEvent);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("数据为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineEventServiceImpl getDetailByUuid:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimelineEvent> updateInfor(HttpServletRequest request, TimelineEvent timelineEvent)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.timelineEventMapper.updateInfor(timelineEvent);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("更新失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineEventServiceImpl updateInfor:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimelineEvent> addEventInfor(HttpServletRequest request, TimelineEvent timelineEvent, TimeLine timeLine)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       String uuid = UUID.randomUUID().toString().replaceAll("-", "");
       timelineEvent.setUuid(uuid);
       timelineEvent.setTimelineUuid(timeLine.getUuid());
       int c = this.timelineEventMapper.addEventInfor(timelineEvent);
       if (c > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("新建失败");
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineEventServiceImpl addEventInfor:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimelineEvent> deleteEventByUuid(HttpServletRequest request, String uuid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int b = this.timelineEventMapper.deleteEventByUuid(uuid);
       if (b > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("删除失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineEventServiceImpl deleteEventByUuid:" + e });
     }
     return toJson;
   }
 }

