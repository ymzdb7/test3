 package com.myoa.util;
 
 import com.myoa.service.common.SysCodeService;
import com.myoa.util.dataSource.ContextHolder;

 import java.util.Calendar;
 import java.util.Date;
 import java.util.List;
 import java.util.TimerTask;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
 @Component
 public class TimeRchSpringQtz extends TimerTask
 {
 
   @Autowired
   private SysCodeService sysCodeService;
   private SpringQtz springQtz;
 
   public SpringQtz getSpringQtz()
   {
     return this.springQtz;
   }
 
   public void setSpringQtz(SpringQtz springQtz) {
     this.springQtz = springQtz;
   }
 
   public void run()
   {
     List orgManages = this.sysCodeService.queryId();
     Date date = new Date();
     Calendar cal = Calendar.getInstance();
 
     ContextHolder.setConsumerType("1001");
     try {
       this.springQtz.riCheng(Integer.valueOf(1001), date);
       cal.setTime(date);
       int week = cal.get(7) - 1;
       if ((week == 1) || (week == 2) || (week == 3) || (week == 4) || (week == 5))
         this.springQtz.springQtzBean(Integer.valueOf(1001), date);
     }
     catch (Exception e) {
       e.printStackTrace();
     }
   }
 }

