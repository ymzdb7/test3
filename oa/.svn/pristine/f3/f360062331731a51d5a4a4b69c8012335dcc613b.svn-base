 package com.myoa.plugin;
 
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.TypeReference;
 import com.alibaba.fastjson.parser.Feature;
import com.myoa.dao.attend.AttendOutMapper;
import com.myoa.dao.flowhook.FlowHookMapper;
import com.myoa.dao.workflow.FlowProcessMapper;
import com.myoa.global.proxy.TriggerSubject;
import com.myoa.model.attend.AttendOut;
import com.myoa.model.workflow.FlowHookWithBLOBs;
import com.myoa.model.workflow.FlowProcess;
import com.myoa.model.workflow.TriggerPlugIn;
import com.myoa.util.common.L;
import com.myoa.util.dataSource.ContextHolder;

 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import java.util.Map.Entry;
 import java.util.Set;
 import javax.annotation.Resource;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class AttendOutTrigger
   implements TriggerSubject
 {
 
   @Autowired
   private FlowHookMapper flowHookMapper;
 
   @Autowired
   private AttendOutMapper attendOutMapper;
 
   @Resource
   private FlowProcessMapper flowProcessMapper;
 
   public void doRun(String company, Object[] ags)
   {
    ContextHolder.setConsumerType(company);
    L.s(new Object[] { "0=||======>runrunrunrun" });
 
    TriggerPlugIn tri = (TriggerPlugIn)ags[0];
   AttendOut attendOut = new AttendOut();
   FlowProcess flowProcess = this.flowProcessMapper.findPrcessLine(Integer.valueOf(Integer.parseInt(tri.getFlowId())), Integer.valueOf(Integer.parseInt(tri.getFlowPrcs())));
 
   if (flowProcess != null) {
     String prcs = flowProcess.getPrcsTo();
     if ((!"".equals(prcs)) && (prcs != null)) {
        prcs = prcs.substring(0, prcs.length() - 1);
         if ("0".equals(prcs)) {
         attendOut.setAllow("1");
         }
         else
         {
           attendOut.setAllow("0");
         }
       }
 
     }
 
     FlowHookWithBLOBs flowHookNew = new FlowHookWithBLOBs();
     flowHookNew.setHid(tri.getHookId());
   FlowHookWithBLOBs flowHook = this.flowHookMapper.selectByhid(flowHookNew);
     Map<Object,Object> flowHookMaps = null;
     if (flowHook != null)
      flowHookMaps = queryTriggerField(tri.getModify(), tri.getReject(), flowHook.getMap(), flowHook.getDataDirection());
     int a;
    if (flowHookMaps != null) {
       for (Map.Entry entry : flowHookMaps.entrySet()) {
        if (entry.getKey().equals("LEADER_ID"))
          attendOut.setLeaderId(entry.getValue().toString());
        else if (entry.getKey().equals("OUT_TYPE"))
         attendOut.setOutType(entry.getValue().toString());
       else if (entry.getKey().equals("OUT_TIME1"))
         attendOut.setOutTime1(entry.getValue().toString());
        else if (entry.getKey().equals("OUT_TIME2"))
           attendOut.setOutTime2(entry.getValue().toString());
         else if (entry.getKey().equals("REASON")) {
         attendOut.setReason(entry.getValue().toString());
         }
       }
       attendOut.setOutId(Integer.valueOf(Integer.parseInt(tri.getTabId())));
      a = this.attendOutMapper.updateByExampleSelective(attendOut);
     }
   }
 
   public Map<Object, Object> queryTriggerField(String modifydata, String fromdate, String maps, Integer num)
   {
    String[] a = maps.split(",");
    Map<Object,Object> map = new HashMap<Object,Object>();
     for (int i = 0; i < a.length; i++) {
      String i1 = a[i];
     String[] i2 = i1.split("=>");
       String i3 = i2[0];
     String i4 = i2[1];
       map.put(i3, i4);
     }
 
    JSONArray json = new JSONArray();
 
     Map<Object,Object> from = (Map)JSONArray.parseObject(fromdate, new TypeReference()
     {
     }
  , new Feature[0]);
 
   List modify = (List)JSONArray.parseObject(modifydata, List.class);
 
    Map analysis = new HashMap();
   Map returnMap = new HashMap();
    for (Iterator i$ = modify.iterator(); i$.hasNext(); ) { 
	            Map<Object,Object> mapmodify = (Map<Object,Object>)i$.next();
     for (Map.Entry entry1 : from.entrySet())
        if (mapmodify.get("key").equals(entry1.getValue()))
        analysis.put(entry1.getKey(), mapmodify.get("value"));
     }
     Map mapmodify;
     Iterator i$;
     Map.Entry entry;
   if ("1".equals(num)) {
       for (i$ = analysis.entrySet().iterator(); i$.hasNext(); ) { entry = (Map.Entry)i$.next();
       for (Map.Entry entry1 : map.entrySet()) {
          if (entry.getKey().equals(entry1.getValue())) {
             returnMap.put(entry1.getKey(), entry.getValue());
           }
         }
 
       }
 
     }
     else if (!"2".equals(num));
    for (i$ = analysis.entrySet().iterator(); i$.hasNext(); ) { entry = (Map.Entry)i$.next();
       for (Map.Entry entry1 : map.entrySet())
        if (entry.getKey().equals(entry1.getKey()))
          returnMap.put(entry1.getValue(), entry.getValue());
     }
   return returnMap;
   }
 }

