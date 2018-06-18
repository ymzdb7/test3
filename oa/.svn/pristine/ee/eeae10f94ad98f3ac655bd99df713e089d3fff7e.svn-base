 package com.myoa.service.schedule.impl;
 
 import com.myoa.dao.schedule.ScheduleMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.schedule.ResultLeaderActivity;
import com.myoa.model.schedule.Schedule;
import com.myoa.service.schedule.ScheduleService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class ScheduleServiceImpl
   implements ScheduleService
 {
 
   @Resource
   private ScheduleMapper scheduleDao;
 
   @Resource
   private UsersMapper userdao;
 
   public ToJson<Schedule> saveSchedule(Schedule schedule)
   {
     ToJson json = new ToJson();
     try
     {
       schedule.setStatus("0");
 
       int count = this.scheduleDao.saveSchedule(schedule);
       if (count > 0) {
         json.setMsg("创建成功");
         json.setFlag(0);
       }
     }
     catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "ScheduleServiceImpl saveSchedule:" + e });
     }
     return json;
   }
 
   public ToJson<Schedule> commitSchedule(int id)
   {
     ToJson json = new ToJson();
     Map map = new HashMap();
     map.put("id", Integer.valueOf(id));
     map.put("status", Integer.valueOf(1));
     int count = this.scheduleDao.commitSchedule(map);
     if (count > 0) {
       json.setMsg("已提交");
       json.setFlag(0);
     }
 
     return json;
   }
 
   public ToJson<ResultLeaderActivity> queryLeaderActiveAll(Schedule schedules)
   {
     ToJson json = new ToJson();
     List result = new ArrayList();
     Map map = new HashMap();
     ResultLeaderActivity res = null;
     SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
     SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
     map.put("schedule", schedules);
     List<Schedule> list = this.scheduleDao.queryLeaderActiveAll(map);
     if (list != null) {
       for (Schedule schedule : list) {
         res = new ResultLeaderActivity();
         Date d = new Date(schedule.getBegin_time().longValue());
         String date = sdf.format(d);
         String datex = date.substring(5, 10);
 
         String date2 = date.substring(11, 16);
 
         String schedule_type = schedule.getSchedule_type();
         if ("538fe83ee8ee9".equalsIgnoreCase(schedule_type)) {
           schedule_type = "局内会议";
         }
 
         String userName = this.userdao.getUsernameById(schedule.getCreate_user().intValue());
         String status = schedule.getStatus();
         int num = Integer.parseInt(status);
         if (0 == num) {
           status = "未审批";
         }
         if (1 == num) {
           status = "已审批";
         }
 
         int hours = d.getHours();
         String str = null;
         if (hours > 12)
           str = "下午";
         else {
           str = "上午";
         }
         res.setId(schedule.getId());
         res.setDate(datex);
         res.setDateAmong(str);
         res.setTime(date2);
         res.setScheduleType(schedule_type);
         res.setSubject(schedule.getSubject());
         res.setAppUser(userName);
         res.setStatus(status);
         res.setUndertake(schedule.getUndertake());
         res.setLocation(schedule.getLocation());
         res.setAttentee(schedule.getAttendee());
         res.setRemark(schedule.getRemark());
         result.add(res);
       }
     }
     if (result != null) {
       json.setObj(result);
       json.setMsg("ok");
       json.setFlag(0);
     }
     return json;
   }
 }
