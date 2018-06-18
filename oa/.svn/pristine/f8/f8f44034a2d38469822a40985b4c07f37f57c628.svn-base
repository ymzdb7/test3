 package com.myoa.service.footprint.impl;
 
 import com.myoa.dao.footprint.FootSetMapper;
import com.myoa.model.footprint.FootSet;
import com.myoa.service.footprint.FootSetSerivce;

 import java.util.List;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class FootSetServiceImpl
   implements FootSetSerivce
 {
 
   @Resource
   private FootSetMapper footSetMapper;
 
   public String getTime()
   {
     List list = this.footSetMapper.getTime();
     String time = null;
     if ((list != null) && (list.size() == 1)) {
       FootSet footSet = (FootSet)list.get(0);
       if (footSet.getTime() != null)
         time = footSet.getTime();
     }
     else
     {
       time = "60";
     }
 
     return time;
   }
 
   public void editUpdateTime(String time)
   {
     String updateTime = null;
 
     if (time == null)
     {
       updateTime = "60";
     }
     else updateTime = time;
 
     this.footSetMapper.editUpdateTime(updateTime);
   }
 }

