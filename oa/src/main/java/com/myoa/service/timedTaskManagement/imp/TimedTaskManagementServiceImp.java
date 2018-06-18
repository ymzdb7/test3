 package com.myoa.service.timedTaskManagement.imp;
 
 import com.myoa.dao.timedTaskManagement.TimedTaskManagementMapper;
import com.myoa.dao.timedTaskManagement.TimedTaskRecordMapper;
import com.myoa.model.timedTaskManagement.TimedTaskManagement;
import com.myoa.service.timedTaskManagement.TimedTaskManagementService;
import com.myoa.util.ToJson;

 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimedTaskManagementServiceImp
   implements TimedTaskManagementService
 {
 
   @Resource
   private TimedTaskManagementMapper timedTaskManagementMapper;
 
   @Resource
   private TimedTaskRecordMapper timedTaskRecordMapper;
 
   public ToJson selectTimedTask()
   {
     SimpleDateFormat dft = new SimpleDateFormat("HH:mm:ss");
     ToJson json = new ToJson();
     List timeTos = new ArrayList();
     TimedTaskManagement timedTaskManagement = null;
     TimedTaskManagement timedTaskManagement1 = null;
     TimedTaskManagement timedTaskManagement2 = null;
 
     Integer[] ttmids = this.timedTaskManagementMapper.selectTimedTaskId();
     for (int i = 0; i < ttmids.length; i++) {
       List list = this.timedTaskManagementMapper.selectTimedTask(ttmids[i]);
       timedTaskManagement1 = (TimedTaskManagement)list.get(0);
       for (int t = 0; t < list.size(); t++) {
         try {
           timedTaskManagement2 = (TimedTaskManagement)list.get(t + 1);
           if (!dft.parse(timedTaskManagement1.getExecutionTimeat()).after(dft.parse(timedTaskManagement2.getExecutionTimeat())))
           {
             timedTaskManagement1 = timedTaskManagement2;
           }
           timedTaskManagement = timedTaskManagement1;
         } catch (Exception e) {
           e.printStackTrace();
         }
       }
 
       timeTos.add(timedTaskManagement);
     }
     if (timeTos.size() > 0) {
       json.setObj(timeTos);
       json.setMsg("ok");
       json.setFlag(0);
       return json;
     }
     json.setMsg("err");
     json.setFlag(0);
     return json;
   }
 
   public TimedTaskManagement selectTimedTaskOne(Integer tmmid, Integer taskType)
   {
     SimpleDateFormat dft = new SimpleDateFormat("HH:mm:ss");
     TimedTaskManagement timedTaskManagement = null;
     TimedTaskManagement timedTaskManagement1 = null;
     TimedTaskManagement timedTaskManagement2 = null;
     Map map = new HashMap();
     map.put("tmmid", tmmid);
     map.put("taskType", taskType);
 
     List timedTaskRecordlist = this.timedTaskRecordMapper.selectTimedTaskTypese(tmmid);
     if (timedTaskRecordlist.size() > 1) {
       List list = this.timedTaskManagementMapper.selectTimedTaskType(map);
       timedTaskManagement1 = (TimedTaskManagement)list.get(0);
       for (int t = 0; t < list.size(); t++)
         try {
           timedTaskManagement2 = (TimedTaskManagement)list.get(t + 1);
           if (!dft.parse(timedTaskManagement1.getExecutionTimeat()).after(dft.parse(timedTaskManagement2.getExecutionTimeat())))
           {
             timedTaskManagement1 = timedTaskManagement2;
           }
           timedTaskManagement = timedTaskManagement1;
         } catch (Exception e) {
           e.printStackTrace();
         }
     }
     else if (timedTaskRecordlist.size() == 1) {
       List list = this.timedTaskManagementMapper.selectTimedTaskType(map);
       timedTaskManagement = (TimedTaskManagement)list.get(0);
     }
 
     return timedTaskManagement;
   }
 
   public List<TimedTaskManagement> selectTimeManagerTo()
   {
     return this.timedTaskManagementMapper.selectTimeManager();
   }
 
   public Integer[] selectTimedTaskId()
   {
     return this.timedTaskManagementMapper.selectTimedTaskId();
   }
 
   public TimedTaskManagement selectTimedTaskKey(Integer ttmId)
   {
     return this.timedTaskManagementMapper.selectTimedTaskKey(ttmId);
   }
 
   public int updateTimedTaskManagement(Map<String, Object> map)
   {
     return this.timedTaskManagementMapper.updateTimedTaskManagement(map);
   }
 }

