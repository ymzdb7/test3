 package com.myoa.plugin;
 
 import com.myoa.dao.notify.NotifyMapper;
import com.myoa.global.proxy.TriggerSubject;
import com.myoa.model.notify.Notify;
import com.myoa.model.workflow.TriggerPlugIn;
import com.myoa.util.dataSource.ContextHolder;

 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class NotifyTrigger
   implements TriggerSubject
 {
 
   @Resource
   private NotifyMapper notifyMapper;
 
   public void doRun(String company, Object[] ags)
   {
    ContextHolder.setConsumerType(company);
    TriggerPlugIn tri = (TriggerPlugIn)ags[0];
    this.notifyMapper.addNotify(new Notify(tri.getFormmat(), tri.getFromId(), tri.getSendTime(), tri.getSubject(), tri.getContent(), "ALL_DEPT", "1"));
   }
 }

