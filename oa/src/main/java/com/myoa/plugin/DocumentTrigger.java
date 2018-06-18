 package com.myoa.plugin;
 
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.TypeReference;
 import com.alibaba.fastjson.parser.Feature;
import com.myoa.dao.document.DocumentModelMapper;
import com.myoa.dao.flowhook.FlowHookMapper;
import com.myoa.dao.workflow.FlowProcessMapper;
import com.myoa.dao.workflow.FlowRunPrcsMapper;
import com.myoa.global.proxy.TriggerSubject;
import com.myoa.model.attend.AttendLeave;
import com.myoa.model.document.DocumentModel;
import com.myoa.model.document.DocumentModelWithBLOBs;
import com.myoa.model.workflow.FlowHookWithBLOBs;
import com.myoa.model.workflow.FlowProcess;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.model.workflow.TriggerPlugIn;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
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
 public class DocumentTrigger
   implements TriggerSubject
 {
 
   @Resource
   private DocumentModelMapper documentModelMapper;
 
   @Resource
   private FlowProcessMapper flowProcessMapper;
 
   @Resource
   private FlowRunPrcsMapper flowRunPrcsMapper;
 
   @Autowired
   private FlowHookMapper flowHookMapper;
 
   public void doRun(String company, Object[] ags)
   {
   ContextHolder.setConsumerType(company);
   TriggerPlugIn tri = (TriggerPlugIn)ags[0];
    DocumentModelWithBLOBs documentModel = new DocumentModelWithBLOBs();
   documentModel.setId(Integer.valueOf(Integer.parseInt(tri.getTabId())));
  if ("1".equals(tri.getDistinguish())) {
     documentModel.setFlowId(Integer.valueOf(Integer.parseInt(tri.getFlowId())));
     documentModel.setFlowRunName(tri.getRunName());
   FlowProcess flowProcess = this.flowProcessMapper.findPrcessLine(Integer.valueOf(Integer.parseInt(tri.getFlowId())), Integer.valueOf(Integer.parseInt(tri.getPrcsId())));
 
   if (flowProcess != null) {
       String prcs = flowProcess.getPrcsTo();
       if ((!"".equals(prcs)) && (prcs != null)) {
         prcs = prcs.substring(0, prcs.length() - 1);
           if ("0".equals(prcs)) {
          documentModel.setFlowStatus("1");
           }
           else {
            documentModel.setFlowStatus("0");
           }
         }
         documentModel.setFlowPrcs(tri.getFlowPrcs());
       Map maps = new HashMap();
        maps.put("prcsId", tri.getPrcsId());
       maps.put("runId", tri.getRunId());
 
       List flowRunPrcs = this.flowRunPrcsMapper.selectfrp(maps);
        Iterator iterator = flowRunPrcs.iterator();
       StringBuffer stb = new StringBuffer();
 
      while (iterator.hasNext()) {
          FlowRunPrcs flowRunPrcs1 = (FlowRunPrcs)iterator.next();
           if ("1".equals(flowRunPrcs1.getOpFlag())) {
             documentModel.setCurUserId(flowRunPrcs1.getUserId());
            DocumentModel documentModel1 = this.documentModelMapper.selectByPrimaryKey(Integer.valueOf(Integer.parseInt(tri.getTabId())));
          if (!StringUtils.checkNull(documentModel1.getAllUserId()).booleanValue()) {
              String[] str = documentModel1.getAllUserId().split(",");
              for (int i = 0; i < str.length; i++)
                 if (!str[i].equals(flowRunPrcs1.getUserId()))
                   documentModel.setAllUserId(documentModel1.getAllUserId() + flowRunPrcs1.getUserId() + ",");
             }
             else
             {
              documentModel.setAllUserId(flowRunPrcs1.getUserId() + ",");
             }
           }
         }
 
       }
 
       FlowHookWithBLOBs flowHookNew = new FlowHookWithBLOBs();
      flowHookNew.setHid(tri.getHookId());
       FlowHookWithBLOBs flowHook = this.flowHookMapper.selectByhid(flowHookNew);
      Map<Object,Object> flowHookMaps = null;
      if (flowHook != null) {
        flowHookMaps = queryTriggerField(tri.getModify(), tri.getReject(), flowHook.getMap(), flowHook.getDataDirection());
       }
 
      AttendLeave attendLeave = new AttendLeave();
       if (flowHookMaps != null) {
        for (Map.Entry entry : flowHookMaps.entrySet()) {
         if (entry.getKey().equals("key_word"))
          documentModel.setKeyWord(entry.getValue().toString());
          else if (entry.getKey().equals("unit"))
           documentModel.setUnit(entry.getValue().toString());
          else if (entry.getKey().equals("doc_no"))
            documentModel.setDocNo(entry.getValue().toString());
         else if (entry.getKey().equals("urgency"))
           documentModel.setUrgency(entry.getValue().toString());
          else if (entry.getKey().equals("secrecy"))
            documentModel.setSecrecy(entry.getValue().toString());
          else if (entry.getKey().equals("main_delivery"))
            documentModel.setMainDelivery(entry.getValue().toString());
      else if (entry.getKey().equals("copy_delivery"))
            documentModel.setCopyDelivery(entry.getValue().toString());
          else if (entry.getKey().equals("deadline"))
            documentModel.setDeadline(Integer.valueOf(entry.getValue().toString()));
          else if (entry.getKey().equals("copies"))
             documentModel.setCopies(Integer.valueOf(entry.getValue().toString()));
          else if (entry.getKey().equals("remark"))
             documentModel.setRemark(entry.getValue().toString());
         else if (entry.getKey().equals("creater"))
            documentModel.setCreater(entry.getValue().toString());
          else if (entry.getKey().equals("create_dept"))
            documentModel.setCreateDept(entry.getValue().toString());
         else if (entry.getKey().equals("print_dept"))
            documentModel.setPrintDept(entry.getValue().toString());
         else if (entry.getKey().equals("print_date")) {
            documentModel.setPrintDate(entry.getValue().toString());
           }
         }
 
       }
 
     }
 
     int a = this.documentModelMapper.updateByPrimaryKeySelective(documentModel);
    L.s(new Object[] { "0=||=======>documentTrigger!" });
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

