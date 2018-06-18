 package com.myoa.service.workflow.flowtype.impl;
 
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.JSONObject;
import com.myoa.dao.flowRunFeedback.FlowRunFeedbackMapper;
import com.myoa.dao.flowplugin.FlowPluginMapper;
import com.myoa.dao.workflow.FlowProcessMapper;
import com.myoa.dao.workflow.FlowRunPrcsMapper;
import com.myoa.dao.workflow.FlowTiggerMapper;
import com.myoa.model.flowRunFeedback.FlowRunFeedback;
import com.myoa.model.flowplugin.FlowPluginModel;
import com.myoa.model.workflow.FlowProcess;
import com.myoa.model.workflow.FlowProcessList;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.model.workflow.FlowTiggerModel;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.service.work.impl.WorkServiceImpl;
import com.myoa.service.workflow.flowtype.FlowProcessService;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.wrapper.BaseWrappers;

 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.Set;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class FlowProcessServiceImpl
   implements FlowProcessService
 {
 
   @Resource
   private FlowProcessMapper flowProcessMapper;
 
   @Resource
   private DepartmentService departmentService;
 
   @Resource
   private UsersPrivService usersPrivService;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private FlowTiggerMapper flowTiggerMapper;
 
   @Resource
   private FlowPluginMapper flowPluginMapper;
 
   @Resource
   private FlowRunPrcsMapper flowRunPrcsMapper;
 
   @Resource
   FlowRunFeedbackMapper flowRunFeedbackMapper;
 
   @Resource
   WorkServiceImpl workService;
 
   public FlowProcess find(int id)
   {
     Map maps = new HashMap();
     maps.put("id", Integer.valueOf(id));
     FlowProcess flowProcess = this.flowProcessMapper.find(maps);
     return flowProcess;
   }
 
   @Transactional
   public ToJson<FlowProcess> updateByPrimaryKeySelective(FlowProcess record)
   {
     ToJson tojson = new ToJson();
     try {
       L.a(new Object[] { "itemId：" + record.getITEM_ID() });
       L.a(new Object[] { "autoPrcsUser：" + record.getAUTO_PRCS_USER() });
 
       String tlement = record.getSettlementOfCondition();
       if (!StringUtils.checkNull(tlement).booleanValue()) {
         String intoTheCondition = JSONArray.parseObject(tlement).getString("intoTheCondition");
         String transferConditions = JSONArray.parseObject(tlement).getString("transferConditions");
         if (!StringUtils.checkNull(JSONArray.parseObject(intoTheCondition).getString("list")).booleanValue()) {
           record.setPrcsIn(JSONArray.parseObject(intoTheCondition).getString("list"));
         }
         if (!StringUtils.checkNull(JSONArray.parseObject(transferConditions).getString("list")).booleanValue()) {
           record.setPrcsOut(JSONArray.parseObject(transferConditions).getString("list"));
         }
 
         if (!StringUtils.checkNull(JSONArray.parseObject(intoTheCondition).getString("prcsInSet")).booleanValue()) {
           record.setPrcsInSet(JSONArray.parseObject(intoTheCondition).getString("prcsInSet"));
         }
 
         if ((!StringUtils.checkNull(JSONArray.parseObject(intoTheCondition).getString("conditionDesc")).booleanValue()) && (!StringUtils.checkNull(JSONArray.parseObject(transferConditions).getString("conditionDesc")).booleanValue())) {
           String conditions = "";
           if (StringUtils.checkNull(JSONArray.parseObject(intoTheCondition).getString("conditionDesc")).booleanValue())
             conditions = conditions + "";
           else {
             conditions = conditions + JSONArray.parseObject(intoTheCondition).getString("conditionDesc");
           }
           conditions = conditions + "\n";
           if (StringUtils.checkNull(JSONArray.parseObject(transferConditions).getString("conditionDesc")).booleanValue())
             conditions = conditions + "";
           else {
             conditions = conditions + JSONArray.parseObject(transferConditions).getString("conditionDesc");
           }
           record.setConditionDesc(conditions);
         }
         else if (!StringUtils.checkNull(JSONArray.parseObject(intoTheCondition).getString("conditionDesc")).booleanValue()) {
           record.setConditionDesc(JSONArray.parseObject(intoTheCondition).getString("conditionDesc"));
         } else if (!StringUtils.checkNull(JSONArray.parseObject(transferConditions).getString("conditionDesc")).booleanValue()) {
           record.setConditionDesc("\n" + JSONArray.parseObject(transferConditions).getString("conditionDesc"));
         }
         if (!StringUtils.checkNull(JSONArray.parseObject(transferConditions).getString("prcsOutSet")).booleanValue()) {
           record.setPrcsOutSet(JSONArray.parseObject(transferConditions).getString("prcsOutSet"));
         }
 
       }
 
       String prcsItem = record.getPrcsItemTwo();
       if (!StringUtils.checkNull(prcsItem).booleanValue()) {
         JSONObject jsonObject = JSONArray.parseObject(prcsItem);
         if (jsonObject != null) {
           if (!StringUtils.checkNull(jsonObject.getString("prcsItem")).booleanValue()) {
             record.setPrcsItem(jsonObject.getString("prcsItem"));
           }
           if (!StringUtils.checkNull(jsonObject.getString("attachPriv")).booleanValue()) {
             record.setAttachPriv(jsonObject.getString("attachPriv"));
           }
           if (!StringUtils.checkNull(jsonObject.getString("attachEditPriv")).booleanValue()) {
             record.setAttachEditPriv(jsonObject.getString("attachEditPriv"));
           }
           if (!StringUtils.checkNull(jsonObject.getString("attachEditPrivOnline")).booleanValue()) {
             record.setAttachEditPrivOnline(jsonObject.getString("attachEditPrivOnline"));
           }
           if (!StringUtils.checkNull(jsonObject.getString("attachMacroMark")).booleanValue()) {
             record.setAttachMacroMark(jsonObject.getString("attachMacroMark"));
           }
           if (!StringUtils.checkNull(jsonObject.getString("documentEditPriv")).booleanValue()) {
             record.setDocumentEditPriv(jsonObject.getInteger("documentEditPriv"));
           }
           if (!StringUtils.checkNull(jsonObject.getString("documentEditPrivDetail")).booleanValue()) {
             record.setDocumentEditPrivDetail(jsonObject.getString("documentEditPrivDetail"));
           }
         }
 
       }
 
       if (!StringUtils.checkNull(record.getITEM_ID()).booleanValue()) {
         record.setAutoUser(record.getITEM_ID());
       }
       record.setPrcsTo(record.getPrcsTo());
       this.flowProcessMapper.updateByPrimaryKeySelective(record);
       tojson.setFlag(0);
       tojson.setMsg("OK");
     } catch (Exception e) {
       e.printStackTrace();
       tojson.setFlag(1);
       tojson.setMsg("error");
     }
     return tojson;
   }
 
   public List<FlowProcess> findFlowId(int flowId)
   {
     List list = this.flowProcessMapper.findFlowId(flowId);
     return list;
   }
 
   @Transactional
   public ToJson<FlowProcess> delete(int id, String prcsId)
   {
     ToJson toJson = new ToJson();
     try {
       this.flowProcessMapper.deleteByPrimaryKey(Integer.valueOf(id));
       this.flowProcessMapper.deletePrcsId(prcsId + ",");
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   @Transactional(readOnly=true)
   public ToJson<FlowProcessList> flowView(Integer flowId, Integer runId, String userId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       Map map = null;
 
       List lm = new ArrayList();
 
       List list = this.flowProcessMapper.findF(flowId.intValue());
       List runPrcsList = this.flowRunPrcsMapper.selectAllByRunId(runId);
       int len = list.size();
 
       ((FlowProcess)list.get(len - 1)).setSetType("end round");
       ((FlowProcess)list.get(0)).setSetType("start");
       for (int i = 0; i < len; i++) {
         Integer prId = ((FlowProcess)list.get(i)).getPrcsId();
         String prceTo = ((FlowProcess)list.get(i)).getPrcsTo();
         if (StringUtils.checkNull(prceTo).booleanValue()) {
           map = new HashMap();
           map.put("from", Integer.toString(prId.intValue()));
           if (i < len - 1) {
             if (((FlowProcess)list.get(i + 1)).getPrcsId().intValue() == prId.intValue() + 1)
               map.put("to", Integer.toString(((FlowProcess)list.get(i + 1)).getPrcsId().intValue()));
           }
           else {
             map.put("to", "end");
           }
           lm.add(map);
         } else {
           String[] p = prceTo.split(",");
           for (String a : p) {
             if (!"0".equals(a)) {
               map = new HashMap();
               map.put("from", Integer.toString(prId.intValue()));
               map.put("to", a.toString());
               lm.add(map);
             } else {
               map = new HashMap();
               map.put("from", Integer.toString(prId.intValue()));
               map.put("to", "end");
               ((FlowProcess)list.get(i)).setSetType("end round");
               lm.add(map);
             }
           }
         }
       }
 
       List listp = returnChinese(list);
 
       FlowProcessList flowProcessList = new FlowProcessList();
       flowProcessList.setConnections(lm);
       flowProcessList.setDesigndata(listp);
       flowProcessList.setMax(Integer.valueOf(listp.size()));
       flowProcessList.setFlowRunPrcsList(runPrcsList);
       toJson.setObject(flowProcessList);
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       L.e(new Object[] { "FlowProcessServiceImpl flowView:" + e });
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<FlowProcess> insertSelective(FlowProcess record) {
     ToJson toJson = new ToJson();
     try {
       this.flowProcessMapper.insert(record);
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObject(record);
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       e.printStackTrace();
     }
     return toJson;
   }
 
   public FlowProcess findbyprcsId(int flowId, int prcsId)
   {
     Map maps = new HashMap();
     maps.put("folwId", Integer.valueOf(flowId));
     maps.put("prcsId", Integer.valueOf(prcsId));
     FlowProcess flowProcess = this.flowProcessMapper.findbyprcsId(maps);
     return flowProcess;
   }
 
   @Transactional
   public ToJson<FlowProcess> updateTopAndLeft(FlowProcess flowProcess)
   {
     ToJson toJson = new ToJson();
     FlowProcess prcsTo = this.flowProcessMapper.findLine(flowProcess.getId());
     try {
       if ((prcsTo.getPrcsTo().equals("0")) || (prcsTo.getPrcsTo().equals("0,")))
         this.flowProcessMapper.updateTopAndLeft(flowProcess);
       else if (StringUtils.checkNull(prcsTo.getPrcsTo()).booleanValue()) {
         if (flowProcess.getPrcsTo().equals("")) {
           flowProcess.setPrcsTo(prcsTo.getPrcsId().intValue() + 1 + ",");
           this.flowProcessMapper.updateTopAndLeft(flowProcess);
         } else {
           this.flowProcessMapper.updateTopAndLeft(flowProcess);
         }
       }
       if (prcsTo.getPrcsTo() != "") {
         String prcsToI = prcsTo.getPrcsTo();
         StringBuffer prcsTo1 = new StringBuffer(prcsToI);
         String[] prcsToId = flowProcess.getPrcsTo().split(",");
         int len = prcsToId.length;
         for (int i = 0; i < len; i++) {
           if (!prcsToI.contains(prcsToId[i])) {
             prcsTo1.append(prcsToId[i] + ",");
           }
         }
         flowProcess.setPrcsTo(prcsTo1.toString());
         this.flowProcessMapper.updateTopAndLeft(flowProcess);
       }
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       toJson.setTotleNum(Integer.valueOf(1));
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   public String deptName(String name)
   {
     String deptName = null;
 
     return deptName;
   }
 
   @Transactional
   public ToJson<FlowProcess> findPrcessLine(FlowProcess flowProcesse, String toPrcsLine)
   {
     ToJson toJson = new ToJson();
     FlowProcess flowProcess = this.flowProcessMapper.findPrcessLine(flowProcesse.getFlowId(), flowProcesse.getPrcsId());
     FlowProcess fpr = new FlowProcess();
     try {
       if (StringUtils.checkNull(flowProcess.getPrcsTo()).booleanValue()) {
         fpr.setId(flowProcess.getId());
         fpr.setPrcsTo("0");
         this.flowProcessMapper.updateTopAndLeft(fpr);
       } else {
         String[] prcsTo = flowProcess.getPrcsTo().split(",");
         int leng = prcsTo.length;
         if (leng == 1) {
           fpr.setId(flowProcess.getId());
           fpr.setPrcsTo("");
           this.flowProcessMapper.updateTopAndLeft(fpr);
         } else {
           String names = "";
           for (int i = 0; i < leng; i++) {
             String prcsToI = prcsTo[i];
             if (!prcsToI.equals(toPrcsLine)) {
               names = names + prcsToI + ",";
             }
           }
           fpr.setId(flowProcess.getId());
           fpr.setPrcsTo(names);
           this.flowProcessMapper.updateTopAndLeft(fpr);
         }
       }
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "Process findPrcessLine:" + e });
     }
     return toJson;
   }
 
   public Map<Object, String> returnTiggerValue()
   {
     Map maps = new HashMap();
 
     maps.put("BEFORE_FRONTEND", "前台,执行操作前");
     maps.put("AFTER_FRONTEND", "前台,执行操作后");
     maps.put("BEFORE_BACKEND", "后台,执行操作前");
     maps.put("AFTER_BACKEND", "后台,执行操作后");
 
     maps.put("CREATE", "新建操作");
     maps.put("RECEIVE", "接收操作");
     maps.put("SAVE", "保存操作");
     maps.put("TURN", "转交操作");
     maps.put("INTRUST", "委托操作");
     maps.put("BACK", "退回操作");
 
     List<FlowPluginModel> list = this.flowPluginMapper.showFlowPlugin();
     if (list.size() > 0) {
       for (FlowPluginModel flp : list) {
         maps.put(flp.getFlowPluginId(), flp.getFlowPluginName());
       }
     }
     return maps;
   }
 
   public ToJson myFlowView(Integer flowId, Integer runId, String userId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       Map map = null;
 
       List lm = new ArrayList();
 
       List list = this.flowProcessMapper.findF(flowId.intValue());
       List runPrcsList = this.flowRunPrcsMapper.selectMyAll(userId, runId);
       int listLength = list.size();
       int runPrcsListLenth = runPrcsList.size();
 
       if (listLength > runPrcsListLenth) {
         for (int i = listLength - 1; i >= runPrcsListLenth; i--) {
           list.remove(i);
         }
       }
       Date newDate = new Date();
       for (int i = 0; i < runPrcsListLenth; i++) {
         Integer prId = ((FlowProcess)list.get(i)).getPrcsId();
         String prceTo = ((FlowProcess)list.get(i)).getPrcsTo();
         if (StringUtils.checkNull(prceTo).booleanValue()) {
           map = new HashMap();
           map.put("from", Integer.toString(prId.intValue()));
           if (i < runPrcsListLenth - 1) {
             if (((FlowProcess)list.get(i + 1)).getPrcsId().intValue() == prId.intValue() + 1)
               map.put("to", Integer.toString(((FlowProcess)list.get(i + 1)).getPrcsId().intValue()));
           }
           else {
             map.put("to", "end");
           }
           lm.add(map);
         } else {
           String[] p = prceTo.split(",");
           for (String a : p) {
             if (!"0".equals(a)) {
               map = new HashMap();
               map.put("from", Integer.toString(prId.intValue()));
               map.put("to", a.toString());
               lm.add(map);
             } else {
               map = new HashMap();
               map.put("from", Integer.toString(prId.intValue()));
               map.put("to", "end");
               ((FlowProcess)list.get(i)).setSetType("end round");
               lm.add(map);
             }
           }
         }
 
         ((FlowRunPrcs)runPrcsList.get(i)).setUserName(this.usersService.getUserNameById(((FlowRunPrcs)runPrcsList.get(i)).getUserId()));
 
         if (DateFormat.getTime(((FlowRunPrcs)runPrcsList.get(i)).getPrcsTime()).intValue() != -621701856)
         {
           ((FlowRunPrcs)runPrcsList.get(i)).setReceive(DateFormat.getStrTime(DateFormat.getTime(((FlowRunPrcs)runPrcsList.get(i)).getPrcsTime())));
 
           ((FlowRunPrcs)runPrcsList.get(i)).setHandleTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(newDate)).intValue() - DateFormat.getTime(((FlowRunPrcs)runPrcsList.get(i)).getPrcsTime()).intValue())));
         }
 
         if (((DateFormat.getTime(((FlowRunPrcs)runPrcsList.get(i)).getPrcsTime()).intValue() != -621701856) && (((FlowRunPrcs)runPrcsList.get(i)).getPrcsId().intValue() > 1)) || ((DateFormat.getTime(((FlowRunPrcs)runPrcsList.get(i)).getPrcsTime()).intValue() == -621701856) && (((FlowRunPrcs)runPrcsList.get(i)).getPrcsId().intValue() > 1)))
         {
           Integer runIds = ((FlowRunPrcs)runPrcsList.get(i)).getRunId();
           String prcsUser = ((FlowRunPrcs)runPrcsList.get(i)).getUserId();
           Integer prcsId = Integer.valueOf(((FlowRunPrcs)runPrcsList.get(i)).getPrcsId().intValue() - 1);
           Map params = new HashMap();
           params.put("userId", prcsUser);
           params.put("prcsId", prcsId);
           params.put("runId", runId);
           String upTime = this.flowRunPrcsMapper.findTimeBy(params);
           if (!StringUtils.checkNull(upTime).booleanValue())
           {
             ((FlowRunPrcs)runPrcsList.get(i)).setReceiptTime(DateFormat.getStrTime(DateFormat.getTime(upTime)));
 
             ((FlowRunPrcs)runPrcsList.get(i)).setArriveTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(newDate)).intValue() - DateFormat.getTime(((FlowRunPrcs)runPrcsList.get(i)).getReceiptTime()).intValue())));
           }
         } else {
           ((FlowRunPrcs)runPrcsList.get(i)).setReceiptTime(DateFormat.getStrTime(DateFormat.getTime(((FlowRunPrcs)runPrcsList.get(i)).getPrcsTime())));
           ((FlowRunPrcs)runPrcsList.get(i)).setArriveTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(newDate)).intValue() - DateFormat.getTime(((FlowRunPrcs)runPrcsList.get(i)).getPrcsTime()).intValue())));
           ((FlowRunPrcs)runPrcsList.get(i)).setReceive("");
           ((FlowRunPrcs)runPrcsList.get(i)).setHandleTime("");
         }
 
       }
 
       List listp = returnChinese(list);
 
       FlowProcessList flowProcessList = new FlowProcessList();
       flowProcessList.setConnections(lm);
       flowProcessList.setDesigndata(listp);
       flowProcessList.setMax(Integer.valueOf(listp.size()));
       flowProcessList.setFlowRunPrcsList(runPrcsList);
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObject(flowProcessList);
     } catch (Exception e) {
       L.e(new Object[] { "FlowProcessServiceImpl myFlowView:" + e });
     }
     return toJson;
   }
 
   public ToJson getFlowAttachment(String runId, String conpany)
   {
     return this.workService.findworkUpload(runId, conpany);
   }
 
   public ToJson selectFlowFeedBackByRunId(String runId)
   {
     List<FlowRunFeedback> datas = this.flowRunFeedbackMapper.selectFlowFeedBackByRunId(runId);
     for (FlowRunFeedback flowRunFeedback : datas) {
       flowRunFeedback.setEditTime(flowRunFeedback.getEditTime().substring(0, flowRunFeedback.getEditTime().length() - 2));
     }
     ToJson json = new ToJson();
     json.setObj(datas);
     json.setFlag(0);
     json.setMsg("ok");
     return json;
   }
 
   public BaseWrappers getFlowRunPrecsAll(String runId)
   {
     BaseWrappers wrappers = new BaseWrappers();
     wrappers.setStatus(true);
     if (StringUtils.checkNull(runId).booleanValue()) {
       wrappers.setFlag(false);
       wrappers.setMsg("失败");
       return wrappers;
     }
     List<FlowRunPrcs> datas = this.flowRunPrcsMapper.getFlowRunReacsAllByRunId(runId);
     Date newDate = new Date();
     for (FlowRunPrcs runPrcs : datas) {
       if (Integer.parseInt(runPrcs.getPrcsFlag()) <= 2)
       {
         runPrcs.setArriveTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(newDate)).intValue() - DateFormat.getTime(runPrcs.getCreateTime()).intValue())));
 
         if (DateFormat.getTime(runPrcs.getPrcsTime()).intValue() == -621701856) {
           runPrcs.setHandleTime("未接收");
           runPrcs.setPrcsTime("");
         } else {
           runPrcs.setHandleTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(newDate)).intValue() - DateFormat.getTime(runPrcs.getPrcsTime()).intValue())));
         }
       }
       else
       {
         runPrcs.setArriveTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(runPrcs.getDeliverTime()).intValue() - DateFormat.getTime(runPrcs.getCreateTime()).intValue())));
 
         runPrcs.setHandleTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(runPrcs.getDeliverTime()).intValue() - DateFormat.getTime(runPrcs.getPrcsTime()).intValue())));
       }
       runPrcs.setCreateTime(runPrcs.getCreateTime().substring(0, runPrcs.getCreateTime().length() - 2));
       if (!StringUtils.checkNull(runPrcs.getPrcsTime()).booleanValue()) {
         runPrcs.setPrcsTime(runPrcs.getPrcsTime().substring(0, runPrcs.getPrcsTime().length() - 2));
       }
       if (!StringUtils.checkNull(runPrcs.getDeliverTime()).booleanValue()) {
         runPrcs.setDeliverTime(runPrcs.getDeliverTime().substring(0, runPrcs.getDeliverTime().length() - 2));
       }
     }
 
     Map map = new HashMap();
     List flowRunPrcsList = null;
     for (FlowRunPrcs flowRunPrcs : datas) {
       if (map.keySet().contains(flowRunPrcs.getPrcsId())) {
         flowRunPrcsList = (List)map.get(flowRunPrcs.getPrcsId());
         flowRunPrcsList.add(flowRunPrcs);
       } else {
         flowRunPrcsList = new ArrayList();
         flowRunPrcsList.add(flowRunPrcs);
         map.put(flowRunPrcs.getPrcsId(), flowRunPrcsList);
       }
     }
 
     List<FlowRunPrcs> list = (List)map.get(Integer.valueOf(map.size()));
     for (FlowRunPrcs flowRunPrcs : list) {
       if (Integer.parseInt(flowRunPrcs.getPrcsFlag()) < 4) {
         wrappers.setStatus(false);
       }
     }
     wrappers.setDatas(datas);
     wrappers.setFlag(true);
     wrappers.setMsg("0k");
     return wrappers;
   }
 
   public List<FlowProcess> returnChinese(List<FlowProcess> list)
   {
     List listp = new ArrayList();
 
     for (FlowProcess flowProcess : list) {
       if (!StringUtils.checkNull(flowProcess.getPrcsDept()).booleanValue()) {
         flowProcess.setPrcsDeptName(this.departmentService.getDeptNameByDeptId(flowProcess.getPrcsDept(), ","));
       }
       if (!StringUtils.checkNull(flowProcess.getPrcsPriv()).booleanValue()) {
         flowProcess.setPrcsPrivName(this.usersPrivService.getPrivNameByPrivId(flowProcess.getPrcsPriv(), ","));
       }
       if (!StringUtils.checkNull(flowProcess.getPrcsUser()).booleanValue()) {
         flowProcess.setPrcsUserName(this.usersService.getUserNameById(flowProcess.getPrcsUser()));
       }
       List<FlowTiggerModel> flowTiggerModel = this.flowTiggerMapper.selectFlowTigger(flowProcess.getFlowId(), flowProcess.getPrcsId());
       if ((flowTiggerModel != null) && (flowTiggerModel.size() > 0)) {
         List fltm = new ArrayList();
         for (FlowTiggerModel ftm : flowTiggerModel) {
           ftm.setPluginTypeName((String)returnTiggerValue().get(ftm.getPluginType()));
           ftm.setPluginWayName((String)returnTiggerValue().get(ftm.getPluginWay()));
           ftm.setPluginName((String)returnTiggerValue().get(ftm.getPlugin()));
           fltm.add(ftm);
         }
         flowProcess.setFlowTiggerModel(fltm);
       } else {
         flowProcess.setFlowTiggerModel(new ArrayList());
       }
       listp.add(flowProcess);
     }
     return listp;
   }
 }

