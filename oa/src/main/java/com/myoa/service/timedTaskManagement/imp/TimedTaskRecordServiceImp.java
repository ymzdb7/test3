 package com.myoa.service.timedTaskManagement.imp;
 
 import com.myoa.dao.timedTaskManagement.TimedTaskRecordMapper;
import com.myoa.model.timedTaskManagement.TimedTaskRecord;
import com.myoa.service.timedTaskManagement.TimedTaskRecordService;

 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimedTaskRecordServiceImp
   implements TimedTaskRecordService
 {
 
   @Resource
   private TimedTaskRecordMapper timedTaskRecordMapper;
 
   public int insertTimedRecord(TimedTaskRecord timedTaskRecord)
   {
     return this.timedTaskRecordMapper.insertTimedRecord(timedTaskRecord);
   }
 }

