 package com.myoa.service.work.impl;
 
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.TypeReference;
 import com.alibaba.fastjson.parser.Feature;
import com.myoa.dao.attend.AttendLeaveMapper;
import com.myoa.dao.flowRunFeedback.FlowRunFeedbackMapper;
import com.myoa.dao.flowhook.FlowHookMapper;
import com.myoa.dao.flowplugin.FlowPluginMapper;
import com.myoa.dao.work.WorkMapper;
import com.myoa.dao.workflow.FlowProcessMapper;
import com.myoa.dao.workflow.FlowRunMapper;
import com.myoa.dao.workflow.FlowRunPrcsMapper;
import com.myoa.dao.workflow.FlowTiggerMapper;
import com.myoa.dao.workflow.FlowTypeModelMapper;
import com.myoa.global.proxy.TriggerUtils.Trigger;
import com.myoa.model.department.Department;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.flowRunFeedback.FlowRunFeedback;
import com.myoa.model.flowplugin.FlowPluginModel;
import com.myoa.model.sms.SmsBody;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowFast;
import com.myoa.model.workflow.FlowFormType;
import com.myoa.model.workflow.FlowHookWithBLOBs;
import com.myoa.model.workflow.FlowProcess;
import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.model.workflow.FlowTiggerModel;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.model.workflow.TriggerPlugIn;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.email.impl.EmailServiceImpl;
import com.myoa.service.enclosure.EnclosureService;
import com.myoa.service.sms.SmsService;
import com.myoa.service.users.UsersService;
import com.myoa.service.work.WorkFlowServiceContext;
import com.myoa.service.work.WorkService;
import com.myoa.service.workflow.flowtype.FlowFormTypeService;
import com.myoa.service.workflow.flowtype.FlowProcessService;
import com.myoa.service.workflow.flowtype.FlowRunPrcsService;
import com.myoa.service.workflow.flowtype.FlowRunService;
import com.myoa.service.workflow.flowtype.FlowTypeService;
import com.myoa.util.AjaxJson;
import com.myoa.util.Constant;
import com.myoa.util.DateFormat;
import com.myoa.util.FileUploadUtil;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ModuleEnum;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

 import java.io.OutputStream;
 import java.io.PrintStream;
 import java.net.URLEncoder;
 import java.util.ArrayList;
 import java.util.Calendar;
 import java.util.Collections;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import java.util.Map.Entry;
 import java.util.Set;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFCellStyle;
 import org.apache.poi.hssf.usermodel.HSSFFont;
 import org.apache.poi.hssf.usermodel.HSSFRow;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class WorkServiceImpl
   implements WorkService
 {
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private DepartmentService departmentService;
 
   @Resource
   private EnclosureService enclosureService;
 
   @Resource
   private FlowTiggerMapper flowTiggerMapper;
 
   @Resource
   private FlowPluginMapper flowPluginMapper;
 
   @Resource
   private EmailServiceImpl emailService;
 
   @Resource
   private WorkFlowServiceContext workFlowServiceContext;
 
   @Autowired
   private FlowHookMapper flowHookMapper;
 
   @Autowired
   private AttendLeaveMapper attendLeaveMapper;
 
   @Resource
   private FlowRunMapper flowRunMapper;
 
   @Resource
   private FlowRunPrcsMapper flowRunPrcsMapper;
 
   @Resource
   private SmsService smsService;
 
   @Autowired
   ThreadPoolTaskExecutor threadPoolTaskExecutor;
   private static String document = "document";
   private static String attend_leave = "attend_leave";
   private static String attend_evection = "attend_evection";
   private static String attend_out = "attend_out";
 
   private final int BUILT_IN = 0;
 
   private final int BUILT_OUT = 1;
 
   private final int BUILT_PUSH = 2;
 
   private static int create = 1;
 
   private static int receive = 2;
 
   private static int save = 3;
 
   private static int turn = 4;
 
   private static int intrust = 5;
 
   private static int back = 6;
 
   public void init()
   {
     System.out.println("this is init method1");
   }
 
   public ToJson<FlowFast> nextwork(String flowId, String formdata, String modifydata, String formlength, int runId, String runName, String beginTime, String beginUser, String sqlType, String prcsId, String fromDateReject, String tableNameother, String tabId, String flowPrcs, HttpServletRequest request)
   {
     ToJson tj = new ToJson();
 
     Map param = new HashMap();
     JSONArray json = new JSONArray();
 
     String tableName = "flow_data_" + flowId;
 
     List<Map<String, Object>> l = (List)JSONArray.parseObject(formdata, List.class);
 
     List<Map<String, Object>> lAll = new ArrayList();
 
     for (int i = 0; i < l.size(); i++) {
       if (((Map)l.get(i)).size() == 2) {
         lAll.add(l.get(i));
       }
     }
 
     List keyc = new ArrayList();
     for (Map map : l) {
       if (keyc.contains(map.get("key"))) {
         tj.setMsg("There are duplicate fields in the form parameter!");
         tj.setFlag(1);
         return tj;
       }
       keyc.add((String)map.get("key"));
     }
 
     List<Map> modify = (List)JSONArray.parseObject(modifydata, List.class);
     List<Map> mAll = new ArrayList<Map>();
     for (int i = 0; i < modify.size(); i++) {
       if (((Map)modify.get(i)).size() == 2) {
         mAll.add(modify.get(i));
       }
     }
 
     try
     {
       List<String> columns = createTable(tableName, sqlType, lAll);
       if (columns.size() > 0)
       {
         List key = new ArrayList();
 
         List unusual = new ArrayList();
 
         List Allkey = new ArrayList();
 
         List<String> delkey = new ArrayList<String>();
 
         for (Map map : lAll) {
           if (!columns.contains((String)map.get("key")))
           {
             unusual.add((String)map.get("key"));
           }
 
           Allkey.add((String)map.get("key"));
         }
 
         Iterator<String> it = columns.iterator();
         while (it.hasNext()) {
           String x = (String)it.next();
           if (!x.toUpperCase().contains("DATA")) {
             it.remove();
           }
         }
 
         for (int i = 0; i < columns.size(); i++) {
           if (!Allkey.contains(columns.get(i))) {
             delkey.add(columns.get(i));
           }
         }
 
         if (unusual.size() > 0) {
           param.put("tableName", tableName);
           param.put("keys", unusual);
           this.workFlowServiceContext.getWorkMapper().addcolumn(param);
         }
 
         Map maps = new HashMap();
         maps.put("tableName", tableName);
         maps.put("runId", Integer.valueOf(runId));
 
         Map m = this.workFlowServiceContext.getWorkMapper().select(maps);
         key = new ArrayList();
         List value = new ArrayList();
         if ((m == null) || (m.size() == 0)) {
           key.add("run_id");
           value.add(String.valueOf(runId));
           key.add("run_name");
           value.add(runName);
           key.add("begin_time");
           value.add(beginTime);
           key.add("begin_user");
           value.add(beginUser);
 
           for (Map map : lAll) {
             key.add((String)map.get("key"));
             value.add((String)map.get("value"));
           }
 
           for (String s : delkey) {
             key.add(s);
             value.add("");
           }
           param.put("tableName", tableName);
           param.put("keys", key);
           param.put("values", value);
           this.workFlowServiceContext.getWorkMapper().insert(param);
         }
         else if (mAll.size() != 0) {
           for (Map map : mAll) {
             if (!com.myoa.util.common.StringUtils.checkNull((String)map.get("value")).booleanValue()) {
               key.add((String)map.get("key") + "=" + "'" + (String)map.get("value") + "'");
             }
           }
           param.put("tableName", tableName);
           param.put("keys", key);
           param.put("runId", String.valueOf(runId));
           this.workFlowServiceContext.getWorkMapper().update(param);
         }
 
       }
 
       TriggerPlugIn triggerPlugIn = new TriggerPlugIn();
       triggerPlugIn.setFlowId(flowId);
       triggerPlugIn.setFormmat("2");
       triggerPlugIn.setFromId(beginUser);
       triggerPlugIn.setSendTime(DateFormat.getDate(beginTime));
       triggerPlugIn.setSubject(runName);
       String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/workflow/work/workformPreView?flowId=" + Integer.valueOf(flowId) + "&flowStep=" + Integer.valueOf(prcsId) + "&runId=" + runId + "";
 
       triggerPlugIn.setContent("<a href=" + url + ">" + url + "</a>");
       triggerPlugIn.setToId2("");
       triggerPlugIn.setFlowPrcs(flowPrcs);
       triggerPlugIn.setPrcsId(prcsId);
       triggerPlugIn.setModify(modifydata);
       triggerPlugIn.setReject(fromDateReject);
       triggerPlugIn.setTableName(tableNameother);
       triggerPlugIn.setRunId(runId + "");
       triggerPlugIn.setRunName(runName);
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       triggerPlugIn.setUsers(user);
       triggerPlugIn.setFlag((String)returnMap().get(Integer.valueOf(turn)));
       triggerPlugIn.setRequest(request);
       triggerPlugIn.setSqlType(sqlType);
       triggerPlugIn.setTabId(tabId);
       notifyNotice(triggerPlugIn);
 
       tj.setMsg("OK");
       tj.setFlag(0);
     } catch (Exception e) {
       tj.setMsg(e.getMessage());
       tj.setFlag(1);
       tj.setMsg("false");
       L.e(new Object[] { "work nextwork:" + e });
     }
     return tj;
   }
 
   public List<String> createTable(String tableName, String sqlType, List<Map<String, Object>> l)
   {
     Map param = new HashMap();
     param.put("tableName", tableName);
     if (com.myoa.util.common.StringUtils.checkNull(sqlType).booleanValue())
       param.put("tableSchema", "xoa1001");
     else {
       param.put("tableSchema", sqlType);
     }
     try
     {
       List columns = this.workFlowServiceContext.getWorkMapper().showColumns(param);
 
       if (columns.size() == 0) {
         List key = new ArrayList();
         for (Map map : l) {
           key.add((String)map.get("key"));
         }
         Map param1 = new HashMap();
         param1.put("tableName", tableName);
         param1.put("keys", key);
         this.workFlowServiceContext.getWorkMapper().createTable(param1);
         columns = this.workFlowServiceContext.getWorkMapper().showColumns(param);
       }
       return columns;
     } catch (Exception e) {
       e.printStackTrace();
     }return null;
   }
 
   public Map<String, Object> fastAdd(String runId, String flowId)
   {
     Map maps = new HashMap();
     maps.put("tableName", "flow_data_" + flowId);
     maps.put("runId", runId);
     Map m = new HashMap();
     try {
       Map map = this.workFlowServiceContext.getWorkMapper().select(maps);
       if (map.size() != 0) {
         m.put("obj", map);
         m.put("flag", Boolean.valueOf(true));
         m.put("msg", "OK");
       } else {
         m.put("flag", Boolean.valueOf(false));
         m.put("msg", Boolean.valueOf(false));
       }
     } catch (Exception e) {
       m.put("flag", Boolean.valueOf(false));
       m.put("msg", Boolean.valueOf(false));
     }
     return m;
   }
 
   public ToJson<Attachment> workUpload(MultipartFile[] files, String company, String module, String runId)
   {
     ToJson json = new ToJson();
     Map map = new HashMap();
     try {
       List list = this.enclosureService.upload(files, company, module);
       FlowRun flowRun = this.workFlowServiceContext.getFlowRunService().find(Integer.valueOf(Integer.parseInt(runId)));
       String attcahmentId = flowRun.getAttachmentId();
       String attachmentName = flowRun.getAttachmentName();
       StringBuffer id = new StringBuffer();
       StringBuffer name = new StringBuffer();
       if ((attcahmentId != "") || (attachmentName != "")) {
         id.append(attcahmentId);
         name.append(attachmentName);
       }
 
       Object[] o = FileUploadUtil.reAttachmentAll(list);
       map.put("runId", runId);
       map.put("attachmentId", o[0].toString());
       map.put("attachmentName", o[1].toString());
       this.workFlowServiceContext.getFlowRunService().updateAttachment(map);
       json.setObj(list);
       json.setMsg("OK");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<Attachment> findworkUpload(String runId, String company)
   {
     ToJson json = new ToJson();
     try
     {
       List attachmentList = new ArrayList();
       FlowRun flowRun = this.workFlowServiceContext.getFlowRunService().find(Integer.valueOf(Integer.parseInt(runId)));
       if ((flowRun.getAttachmentId() != "") || (flowRun.getAttachmentName() != "")) {
         String[] attachmentId = flowRun.getAttachmentId().split(",");
         String[] attachmenName = flowRun.getAttachmentName().split("\\*");
 
         for (int i = 0; i < attachmentId.length; i++) {
           String aid = attachmentId[i].substring(0, attachmentId[i].indexOf(64));
           String ym = attachmentId[i].substring(attachmentId[i].indexOf(64) + 1, attachmentId[i].indexOf(95));
           String attachId = attachmentId[i].substring(attachmentId[i].indexOf(95) + 1, attachmentId[i].indexOf(42));
           String fileSize = attachmentId[i].substring(attachmentId[i].indexOf(42) + 1, attachmentId[i].indexOf(124));
           String time = attachmentId[i].substring(attachmentId[i].indexOf(124) + 1, attachmentId[i].length());
           String attachName = attachmenName[i];
           Attachment attachment = new Attachment();
           String attUrl = "AID=" + aid + "&" + "MODULE=" + ModuleEnum.WORKFLOW.getName() + "&" + "COMPANY=" + company + "&" + "YM=" + ym + "&" + "ATTACHMENT_ID=" + attachId + "&" + "ATTACHMENT_NAME=" + attachName;
 
           attachment.setAid(Integer.valueOf(Integer.parseInt(aid)));
           attachment.setYm(ym);
           attachment.setAttachId(Integer.valueOf(Integer.parseInt(attachId)));
           attachment.setAttachName(attachName);
           attachment.setAttUrl(attUrl);
           attachment.setFileSize(fileSize);
           attachment.setTime(time);
           attachmentList.add(attachment);
         }
       }
       json.setObj(attachmentList);
       json.setFlag(0);
       json.setMsg("OK");
     }
     catch (Exception e) {
       L.e(new Object[] { "findworkUpload" + e });
       json.setFlag(1);
       json.setMsg("false");
     }
     return json;
   }
 
   public ToJson<FlowRunFeedback> workfeedback(String content, String runId, String prcsId, String flowPrcs, String userId)
   {
     String editTime = DateFormat.getStrDate(new Date());
     ToJson toJson = new ToJson();
 
     FlowRunFeedback flowRunFeedback = new FlowRunFeedback();
     flowRunFeedback.setContent(content);
     flowRunFeedback.setUserId(userId);
     flowRunFeedback.setPrcsId(Integer.parseInt(prcsId));
     flowRunFeedback.setFlowPrcs(Integer.parseInt(flowPrcs));
     flowRunFeedback.setRunId(Integer.parseInt(runId));
     flowRunFeedback.setEditTime(editTime);
     try
     {
       this.workFlowServiceContext.getFlowRunFeedbackMapper().insertSelective(flowRunFeedback);
       toJson.setObject(flowRunFeedback);
       toJson.setFlag(0);
       toJson.setMsg("OK");
     } catch (Exception e) {
       toJson.setMsg("false");
       toJson.setFlag(1);
       L.e(new Object[] { "workfeedback" + e });
     }
     return toJson;
   }
 
   public AjaxJson findworkfeedback(String runId, String prcsId, String flowPrcs, String userId, String company, String signlock)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       Map map = new HashMap();
       map.put("prcsId", Integer.valueOf(Integer.parseInt(prcsId)));
       map.put("runId", Integer.valueOf(Integer.parseInt(runId)));
       map.put("flowPrcs", flowPrcs);
       map.put("userId", userId);
       FlowTypeModel flowTypeModel = this.workFlowServiceContext.getFlowTypeService().sfTbyrunId(Integer.valueOf(Integer.parseInt(runId)));
       String flowType = flowTypeModel.getFlowType();
       Integer flowId = flowTypeModel.getFlowId();
 
       List<FlowRunFeedback> modelList = selectFlowFeedBackByRunId(runId);
 
       if (flowType.equals("1"))
       {
         List<FlowProcess> allFp = this.workFlowServiceContext.getFlowProcessService().findFlowId(flowId.intValue());
         for (FlowProcess flowProcess : allFp)
         {
           if (!String.valueOf(flowProcess.getPrcsId()).equals(flowPrcs))
           {
             if (flowProcess.getSignlook().equals("2")) {
               Iterator it = modelList.iterator();
               while ((it != null) && (it.hasNext())) {
                 FlowRunFeedback fbm = (FlowRunFeedback)it.next();
                 if (fbm.getFlowPrcs() == flowProcess.getPrcsId().intValue()) {
                   it.remove();
                 }
               }
             }
           }
           else if (flowProcess.getSignlook().equals("1")) {
             Iterator it = modelList.iterator();
             while ((it != null) && (it.hasNext())) {
               FlowRunFeedback fbm = (FlowRunFeedback)it.next();
               if ((fbm.getFlowPrcs() == flowProcess.getPrcsId().intValue()) && (fbm.getUserId() != userId)) {
                 it.remove();
               }
             }
           }
         }
       }
 
       for (FlowRunFeedback flowRunFeedback : modelList) {
         Users users = this.usersService.findUsersByuserId(flowRunFeedback.getUserId());
         String editTime = flowRunFeedback.getEditTime().substring(0, flowRunFeedback.getEditTime().length() - 2);
         flowRunFeedback.setEditTime(editTime);
         flowRunFeedback.setUsers(users);
       }
       for (FlowRunFeedback flowRunFeedback : modelList) {
         String u = flowRunFeedback.getUserId();
         Users users = this.usersService.getUsersByuserId(u);
 
         flowRunFeedback.setUsers(users);
       }
       ajaxJson.setObj(modelList);
       ajaxJson.setMsg("OK");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("false");
     }
     return ajaxJson;
   }
 
   public List<FlowRunFeedback> selectFlowFeedBackByRunId(String runId) {
     FlowTypeModel flowTypeModel = this.workFlowServiceContext.getFlowTypeService().sfTbyrunId(Integer.valueOf(Integer.parseInt(runId)));
     String flowType = flowTypeModel.getFlowType();
     Integer flowId = flowTypeModel.getFlowId();
     List list = new ArrayList();
     Map map = new HashMap();
     map.put("runId", Integer.valueOf(Integer.parseInt(runId)));
 
     if (flowType.equals("2"))
       list = this.workFlowServiceContext.getFlowRunFeedbackMapper().selectRunId(map);
     else {
       list = this.workFlowServiceContext.getFlowRunFeedbackMapper().selectFeedBackByRunId(map);
     }
     return list;
   }
 
   public ToJson<FlowRunPrcs> savework(String runId, String runName, String flowId, String prcsId, String prcsFlag, String flowPrcs, String beginTime, String beginUser, String jingbanUser, String viewUser, Users users, String currentPrcsId)
   {
     ToJson toJson = new ToJson();
     Map maps = new HashMap();
     maps.put("prcsId", Integer.valueOf(Integer.parseInt(prcsId)));
     maps.put("runId", Integer.valueOf(Integer.parseInt(runId)));
     maps.put("prcsFlag", "3");
     maps.put("deliverTime", DateFormat.getStrDate(new Date()));
     maps.put("userId", users.getUserId());
 
     if (!flowPrcs.contains(",")) {
       maps.put("flowPrcs", currentPrcsId);
     }
     this.workFlowServiceContext.getFlowRunPrcsService().updateSql(maps);
     FlowRunPrcs fl = new FlowRunPrcs();
     if (flowPrcs.equals("0"))
     {
       FlowRun flowRun = this.flowRunMapper.selectByPrimaryKey(Integer.valueOf(runId));
       if ((flowRun != null) && 
         (!com.myoa.util.common.StringUtils.checkNull(viewUser).booleanValue()))
       {
         flowRun.setViewUser(viewUser);
         this.flowRunMapper.updateByPrimaryKeySelective(flowRun);
       }
 
       Map map = new HashMap();
       map.put("endTime", DateFormat.getStrDate(new Date()));
       map.put("runId", runId);
       this.workFlowServiceContext.getFlowRunService().updateTime(map);
       Map updateSatus = new HashMap();
       updateSatus.put("prcsId", prcsId);
       updateSatus.put("runId", runId);
       updateSatus.put("prcsFlag", "4");
       updateSatus.put("userId", users.getUserId());
       this.workFlowServiceContext.getFlowRunPrcsService().updateSql(updateSatus);
       try {
         toJson.setObject(fl);
         toJson.setMsg("OK");
         toJson.setFlag(0);
       } catch (Exception e) {
         toJson.setMsg(e.getMessage());
         L.e(new Object[] { "work saveWork:" + e });
       }
       return toJson;
     }
     String[] fpArray = flowPrcs.split(",");
     String[] alljingbanArray = jingbanUser.split("\\|");
     String[] beginUserArray = beginUser.split(",");
     for (int i = 0; i < fpArray.length; i++) {
       String[] jingbanArray = null;
       jingbanArray = alljingbanArray[i].split(",");
       String beginByUser = beginUserArray[i];
       for (int j = 0; j < jingbanArray.length; j++) {
         fl = new FlowRunPrcs();
         if (beginByUser.equals(jingbanArray[j]))
           fl.setOpFlag("1");
         else {
           fl.setOpFlag("0");
         }
         fl.setTopFlag("0");
         fl.setRunId(Integer.valueOf(Integer.parseInt(runId)));
         fl.setPrcsId(Integer.valueOf(Integer.parseInt(prcsId) + 1));
         fl.setPrcsFlag("1");
         fl.setFlowPrcs(Integer.valueOf(Integer.parseInt(fpArray[i])));
         fl.setUserId(jingbanArray[j]);
         fl.setCreateTime(DateFormat.getStrDate(new Date()));
         fl.setPrcsTime("0000-00-00 00:00:00");
         fl.setDeliverTime("0000-00-00 00:00:00");
         fl.setActiveTime("0000-00-00 00:00:00");
         fl.setParent(currentPrcsId);
         this.workFlowServiceContext.getFlowRunPrcsService().save(fl);
       }
     }
     try
     {
       toJson.setMsg("OK");
       toJson.setFlag(0);
     } catch (Exception e) {
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<FlowRunPrcs> getflowprcsdata(String allowBack, String runId, String prcsId)
   {
     ToJson toJson = new ToJson();
     Map m = new HashMap();
     try {
       switch (Integer.parseInt(allowBack)) {
       case 1:
         m.put("prcsId", Integer.valueOf(Integer.parseInt(prcsId) - 1));
         m.put("runId", runId);
         List listFloRunPrcs = this.workFlowServiceContext.getFlowRunPrcsService().findByRunId(m);
         toJson.setObj(listFloRunPrcs);
         toJson.setMsg("true");
         toJson.setFlag(0);
         return toJson;
       case 2:
         m.put("prcsId", prcsId);
         m.put("runId", runId);
         List list = this.workFlowServiceContext.getFlowRunPrcsService().findlessRunId(m);
         toJson.setObj(list);
         toJson.setFlag(0);
         toJson.setMsg("true");
         return toJson;
       }
     } catch (Exception e) {
       L.e(new Object[] { "getflowprcsdate" + e.getMessage() });
       toJson.setFlag(1);
       toJson.setMsg("false");
       return toJson;
     }
     toJson.setFlag(0);
     toJson.setMsg("true");
     return toJson;
   }
 
   public ToJson notifyNotice(TriggerPlugIn triggerPlugIn)
   {
     ToJson FlowFast = workFastAdd(triggerPlugIn.getUsers(), Integer.parseInt(triggerPlugIn.getFlowId()), Integer.parseInt(triggerPlugIn.getPrcsId()), triggerPlugIn.getFlowPrcs(), triggerPlugIn.getRunId(), triggerPlugIn.getRequest(), triggerPlugIn.getSqlType(), triggerPlugIn.getRunName(), null);
 
     triggerPlugIn.setFlowFast((FlowFast)FlowFast.getObject());
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.flowTiggerMapper.selectFlowTigger(Integer.valueOf(Integer.parseInt(triggerPlugIn.getFlowId())), Integer.valueOf(Integer.parseInt(triggerPlugIn.getFlowPrcs())));
       if ((list != null) && (list.size() > 0)) {
         int i = 0; for (int len = list.size(); i < len; i++)
         {
           if ((triggerPlugIn.getFlag().equals(((FlowTiggerModel)list.get(i)).getPluginType())) && (1 == ((FlowTiggerModel)list.get(i)).getActived().intValue())) {
             if ((((FlowTiggerModel)list.get(i)).getPlugin().intValue() != 0) && (((FlowTiggerModel)list.get(i)).getBusinessLogicId().intValue() != 0)) {
               triggerPlugIn.setDistinguish("1");
               FlowPluginModel flowPluginModel = this.flowPluginMapper.selectList(((FlowTiggerModel)list.get(i)).getPlugin());
               FlowHookWithBLOBs flowHook = new FlowHookWithBLOBs();
               flowHook.setHid(((FlowTiggerModel)list.get(i)).getBusinessLogicId());
               FlowHookWithBLOBs flowHook1 = this.flowHookMapper.selectByhid(flowHook);
               if (flowHook1 != null) {
                 triggerPlugIn.setHookId(flowHook1.getHid());
                 if (document.equals(flowHook1.getHmodule()))
                   flowHook1.setHmodule("DocumentTrigger");
                 else if (attend_leave.equals(flowHook1.getHmodule()))
                   flowHook1.setHmodule("AttendLeaveTrigger");
                 else if (attend_evection.equals(flowHook1.getHmodule()))
                   flowHook1.setHmodule("AttendEvectionTrigger");
                 else if (attend_out.equals(flowHook1.getHmodule())) {
                   flowHook1.setHmodule("AttendOutTrigger");
                 }
                 Trigger.run("com.myoa.plugin." + flowHook1.getHmodule(), triggerPlugIn.getSqlType(), new Object[] { triggerPlugIn });
               }
 
               inTigger(flowPluginModel.getFlowPluginFlag(), flowPluginModel.getFlowPluginModel(), triggerPlugIn);
             }
             else if (((FlowTiggerModel)list.get(i)).getPlugin().intValue() != 0) {
               FlowPluginModel flowPluginModel = this.flowPluginMapper.selectList(((FlowTiggerModel)list.get(i)).getPlugin());
               triggerPlugIn.setDistinguish("1");
               inTigger(flowPluginModel.getFlowPluginFlag(), flowPluginModel.getFlowPluginModel(), triggerPlugIn);
             } else if (((FlowTiggerModel)list.get(i)).getBusinessLogicId().intValue() != 0) {
               FlowHookWithBLOBs flowHook = new FlowHookWithBLOBs();
               flowHook.setHid(((FlowTiggerModel)list.get(i)).getBusinessLogicId());
               FlowHookWithBLOBs flowHook1 = this.flowHookMapper.selectByhid(flowHook);
               if (flowHook1 != null) {
                 triggerPlugIn.setDistinguish("1");
                 triggerPlugIn.setHookId(flowHook1.getHid());
                 if (document.equals(flowHook1.getHmodule()))
                   flowHook1.setHmodule("DocumentTrigger");
                 else if (attend_leave.equals(flowHook1.getHmodule()))
                   flowHook1.setHmodule("AttendLeaveTrigger");
                 else if (attend_evection.equals(flowHook1.getHmodule()))
                   flowHook1.setHmodule("AttendEvectionTrigger");
                 else if (attend_out.equals(flowHook1.getHmodule())) {
                   flowHook1.setHmodule("AttendOutTrigger");
                 }
                 Trigger.run("com.myoa.plugin." + flowHook1.getHmodule(), triggerPlugIn.getSqlType(), new Object[] { triggerPlugIn });
               }
             }
           } else {
             toJson.setFlag(0);
             toJson.setMsg("ok");
           }
         }
       }
       else if (!com.myoa.util.common.StringUtils.checkNull(triggerPlugIn.getTableName()).booleanValue())
       {
         if ("document".equals(triggerPlugIn.getTableName())) {
           triggerPlugIn.setDistinguish("1");
           Trigger.run("com.myoa.plugin.DocumentTrigger", triggerPlugIn.getSqlType(), new Object[] { triggerPlugIn });
         }
 
       }
 
     }
     catch (Exception e)
     {
       L.e(new Object[] { "workFlowServiceContext.getFlowRunPrcsService()Impl notifyNotice:" + e });
     }
     return toJson;
   }
 
   public List<Users> userFilterlist(Integer userFilter, Users users, FlowProcess flowProcess)
   {
     List userFilterlist = null;
     switch (userFilter.intValue()) {
     case 1:
       userFilterlist = this.usersService.getUsersByDeptId(users.getDeptId());
       return userFilterlist;
     case 2:
       userFilterlist = this.usersService.getUserByDeptIds(String.valueOf(users.getUserPriv()), Integer.valueOf(2));
       return userFilterlist;
     case 3:
       userFilterlist = this.usersService.getPUsersByDeptId(users.getDeptId());
       return userFilterlist;
     case 4:
       userFilterlist = this.usersService.getCUsersByDeptId(users.getDeptId());
       return userFilterlist;
     case 5:
       userFilterlist = this.usersService.getTUsersByDeptId(users.getDeptId());
       return userFilterlist;
     case 6:
       userFilterlist = this.usersService.getUserByDeptIds(flowProcess.getUserFilterPrcsDept(), Integer.valueOf(1));
       return userFilterlist;
     case 7:
       userFilterlist = this.usersService.getUserByDeptIds(flowProcess.getUserFilterPrcsPriv(), Integer.valueOf(2));
       return userFilterlist;
     case 8:
       userFilterlist = this.usersService.getUserByDeptIds(users.getDeptIdOther(), Integer.valueOf(1));
       return userFilterlist;
     case 9:
       userFilterlist = this.usersService.getUserByDeptIds(flowProcess.getUserFilterPrcsDeptOther(), Integer.valueOf(3));
       return userFilterlist;
     case 10:
       userFilterlist = this.usersService.getUserByDeptIds(users.getUserPrivOther(), Integer.valueOf(2));
       return userFilterlist;
     case 11:
       userFilterlist = this.usersService.getUserByDeptIds(users.getUserPrivOther(), Integer.valueOf(4));
       return userFilterlist;
     case 12:
       userFilterlist = this.usersService.getUsersByDeptId(users.getDeptId());
       userFilterlist.addAll(this.usersService.getCUsersByDeptId(users.getDeptId()));
       return userFilterlist;
     }
     return userFilterlist;
   }
 
   public List<Users> autoTypelist(Integer autoType, Department dep, Users users, String runId, FlowProcess flowProcess)
   {
     List autoTypelist = new ArrayList();
     switch (autoType.intValue()) {
     case 1:
       FlowRun flowRun = this.workFlowServiceContext.getFlowRunService().find(Integer.valueOf(Integer.parseInt(runId)));
       Users u = this.usersService.findUsersByuserId(flowRun.getBeginUser());
       autoTypelist.add(u);
       return autoTypelist;
     case 2:
       autoTypelist = this.usersService.getUserByuId(dep.getManager());
       return autoTypelist;
     case 3:
       autoTypelist = this.usersService.getUserByuId(dep.getManager());
       return autoTypelist;
     case 4:
       autoTypelist = this.usersService.getUserByuId(dep.getLeader1());
       return autoTypelist;
     case 5:
       autoTypelist = this.usersService.getUserByuId(dep.getManager());
       return autoTypelist;
     case 6:
       autoTypelist = this.usersService.getUserByuId(dep.getLeader2());
       return autoTypelist;
     case 7:
       String autoUser = flowProcess.getAutoUser();
       Map map = new HashMap();
       map.put("tableName", "flow_data_" + flowProcess.getFlowId());
       map.put("runId", runId);
       Map maps = this.workFlowServiceContext.getWorkMapper().select(map);
       if (maps != null) {
         String userName = (String)maps.get(autoUser);
         Users users1 = this.usersService.getUserByUserName(userName);
         if (users1 != null) {
           autoTypelist.add(users1);
         }
       }
       return autoTypelist;
     case 8:
       return autoTypelist;
     case 9:
       autoTypelist = this.usersService.getUserByuId(dep.getAssistantId());
       return autoTypelist;
     case 10:
     case 11:
     case 12:
       return autoTypelist;
     case 13:
       return autoTypelist;
     case 14:
       return autoTypelist;
     case 15:
       return autoTypelist;
     }
     return autoTypelist;
   }
 
   public List<Users> allUserlist(List<Users> userFilterlist, List<Users> prcsUserlist, List<Users> prcsDeptlist, List<Users> prcsPrivlist)
   {
     List allUser = new ArrayList();
     if (prcsUserlist != null) {
       allUser.addAll(prcsUserlist);
     }
     if (prcsDeptlist != null) {
       allUser.addAll(prcsDeptlist);
     }
     if (prcsPrivlist != null)
       allUser.addAll(prcsPrivlist);
     Iterator i$;
     if (allUser != null)
       for (i$ = allUser.iterator(); i$.hasNext(); ) { 
	               Users users = (Users)i$.next();
         for (Users users1 : userFilterlist)
           if (users.getUid() == users1.getUid())
             allUser.remove(users);
       }
     Users users;
     return allUser;
   }
 
   public AjaxJson insertprcsdata(String runId, String flowStep, String prcsId, String flowPrcs, Users users, String feedback)
   {
     AjaxJson ajaxJson = new AjaxJson();
     Map maps = new HashMap();
     try {
       maps.put("prcsId", flowStep);
       maps.put("runId", runId);
       maps.put("prcsFlag", "3");
       maps.put("deliverTime", DateFormat.getStrDate(new Date()));
       this.workFlowServiceContext.getFlowRunPrcsService().updateSql(maps);
       maps.put("prcsId", flowPrcs);
       List listFloRunPrcs = this.workFlowServiceContext.getFlowRunPrcsService().findByRunId(maps);
       FlowRunPrcs fp = (FlowRunPrcs)listFloRunPrcs.get(0);
 
       FlowRunPrcs flowRunPrcs = new FlowRunPrcs();
       flowRunPrcs.setRunId(Integer.valueOf(Integer.parseInt(runId)));
 
       flowRunPrcs.setPrcsId(Integer.valueOf(Integer.parseInt(flowStep) + 1));
       flowRunPrcs.setUserId(fp.getUserId());
       flowRunPrcs.setPrcsDept(users.getDeptId());
       flowRunPrcs.setPrcsFlag("1");
       flowRunPrcs.setFlowPrcs(fp.getFlowPrcs());
       flowRunPrcs.setOpFlag("1");
       flowRunPrcs.setTopFlag("0");
       flowRunPrcs.setCreateTime(DateFormat.getStrDate(new Date()));
       flowRunPrcs.setPrcsTime(DateFormat.getStrDate(new Date()));
       flowRunPrcs.setDeliverTime("0000-00-00 00:00:00");
       flowRunPrcs.setActiveTime("0000-00-00 00:00:00");
       flowRunPrcs.setBackFlowPrcs(fp.getFlowPrcs());
       flowRunPrcs.setBackPrcsId(fp.getPrcsId());
       flowRunPrcs.setParent(String.valueOf(fp.getFlowPrcs()));
       this.workFlowServiceContext.getFlowRunPrcsService().save(flowRunPrcs);
       ToJson json = workfeedback(feedback, runId, flowStep, String.valueOf(fp.getFlowPrcs()), users.getUserId());
       ajaxJson.setObj(flowRunPrcs);
       ajaxJson.setMsg("true");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       L.e(new Object[] { "insertprcsDate" + e.getMessage() });
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public AjaxJson findBranch(String flowId, String runId, String flowPrcs, Users users)
   {
     AjaxJson ajaxJson = new AjaxJson();
     Map mAll = new HashMap();
     try {
       String[] fpArray = flowPrcs.split(",");
       for (int j = 0; j < fpArray.length; j++) {
         if (fpArray[j].equals("0"))
           continue;
         List allFp = this.workFlowServiceContext.getFlowProcessService().findFlowId(Integer.parseInt(flowId));
 
         Map map = new HashMap();
         for (int i = 0; i < allFp.size(); i++) {
           FlowProcess flowProcess = (FlowProcess)allFp.get(i);
           map.put(String.valueOf(flowProcess.getPrcsId()), flowProcess);
         }
         FlowProcess flowProcess = (FlowProcess)map.get(fpArray[j]);
 
         FlowFast flowFast = new FlowFast();
 
         Department dep = this.departmentService.getDeptById(users.getDeptId().intValue());
 
         String uF = flowProcess.getUserFilter();
 
         List<Users> userFilterlist = new ArrayList();
 
         if (flowProcess.getUserFilter() != "") {
           Integer userFilter = Integer.valueOf(Integer.parseInt(flowProcess.getUserFilter()));
           userFilterlist = userFilterlist(userFilter, users, flowProcess);
         }
 
         Map map1 = new HashMap();
         for (Users u : userFilterlist) {
           map1.put(u.getUid(), u);
         }
 
         String aT = flowProcess.getAutoType();
         List autoTypelist = null;
         if (aT != "") {
           Integer autoType = Integer.valueOf(Integer.parseInt(aT));
           autoTypelist = autoTypelist(autoType, dep, users, runId, flowProcess);
         }
 
         flowFast.setUserFilter(uF);
         flowFast.setUserFilterlist(userFilterlist);
         flowFast.setAutoType(aT);
         flowFast.setAutoTypelist(autoTypelist);
 
         String prcsUser = flowProcess.getPrcsUser();
 
         List<Users> prcsUserlist = null;
         List<Users> prcsUserlistfilter = new ArrayList<Users>();
         if (prcsUser != "") {
           flowFast.setPrcsUser(prcsUser);
 
           prcsUserlist = this.usersService.getUserByuserId(flowProcess.getPrcsUser());
 
           Iterator it = prcsUserlist.iterator();
           while (it.hasNext()) {
             Users u = (Users)it.next();
             if (map1.containsKey(u.getUid())) {
               it.remove();
             }
           }
           flowFast.setPrcsUserlist(prcsUserlist);
         } else {
           flowFast.setPrcsUser(prcsUser);
           flowFast.setPrcsUserlist(prcsUserlist);
         }
 
         String prcsDept = flowProcess.getPrcsDept();
         List<Users> prcsDeptlist = null;
         List prcsDeptlistFifter = new ArrayList();
         if (!"ALL_DEPT".trim().equals(prcsDept)) {
           flowFast.setPrcsDept(prcsDept);
           prcsDeptlist = this.usersService.getUserByDeptIds(prcsDept, Integer.valueOf(1));
           if (prcsDeptlist != null)
           {
             Iterator it = prcsDeptlist.iterator();
             while (it.hasNext()) {
               Users u = (Users)it.next();
               if (map1.containsKey(u.getUid())) {
                 it.remove();
               }
             }
             flowFast.setPrcsDeptlist(prcsDeptlist);
           }
         } else {
           flowFast.setPrcsDept(prcsDept);
           flowFast.setPrcsDeptlist(prcsDeptlist);
         }
 
         String prcsPriv = flowProcess.getPrcsPriv();
         List<Users> prcsPrivlist = null;
         List prcsPrivlistFifter = new ArrayList();
         if ((prcsPriv != "") && (prcsPriv != null)) {
           flowFast.setPrcsPriv(prcsPriv);
           prcsPrivlist = this.usersService.getUserByDeptIds(prcsPriv, Integer.valueOf(2));
           if (prcsPrivlist != null)
           {
             Iterator it = prcsPrivlist.iterator();
             while (it.hasNext()) {
               Users u = (Users)it.next();
               if (map1.containsKey(u.getUid())) {
                 it.remove();
               }
             }
             flowFast.setPrcsPrivlist(prcsPrivlist);
           }
         } else {
           flowFast.setPrcsPriv(prcsPriv);
           flowFast.setPrcsPrivlist(prcsPrivlist);
         }
 
         Map m = new HashMap();
         if ((prcsUserlist != null) && (prcsUserlist.size() > 0)) {
           for (Users u1 : prcsUserlist) {
             m.put(u1.getUserId(), u1);
           }
         }
         if ((prcsDeptlist != null) && (prcsDeptlist.size() > 0)) {
           for (Users u2 : prcsDeptlist) {
             m.put(u2.getUserId(), u2);
           }
         }
         if ((prcsPrivlist != null) && (prcsPrivlist.size() > 0)) {
           for (Users u3 : prcsPrivlist) {
             m.put(u3.getUserId(), u3);
           }
         }
         List l = new ArrayList(m.values());
         flowFast.setPrcsUserlist(l);
         mAll.put(fpArray[j], flowFast);
       }
 
       ajaxJson.setObj(mAll);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("OK");
     } catch (Exception e) {
       L.e(new Object[] { "findBranch" + e });
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("false");
       return ajaxJson;
     }
     return ajaxJson;
   }
 
   public ToJson delete(String runId, @RequestParam("AID") String aid, @RequestParam("MODULE") String module, @RequestParam("YM") String ym, @RequestParam("ATTACHMENT_ID") String attachmentId, @RequestParam("ATTACHMENT_NAME") String attachmentName, @RequestParam("COMPANY") String company, HttpServletResponse response, HttpServletRequest request)
   {
     ToJson tj = new ToJson();
     try {
       FlowRun flowRun = this.workFlowServiceContext.getFlowRunService().find(Integer.valueOf(Integer.parseInt(runId)));
       StringBuffer id = new StringBuffer();
       StringBuffer name = new StringBuffer();
       tj = this.enclosureService.delete(aid, module, ym, attachmentId, attachmentName, company, response, request);
       if (tj.isFlag()) {
         if ((flowRun.getAttachmentId() != "") || (flowRun.getAttachmentName() != "")) {
           String[] attachmentIds = flowRun.getAttachmentId().split(",");
           String[] attachName = flowRun.getAttachmentName().split("\\*");
           List idsList = new ArrayList();
           Collections.addAll(idsList, attachmentIds);
           List nameList = new ArrayList();
           Collections.addAll(nameList, attachName);
           for (int i = 0; i < attachmentIds.length; i++) {
             String yaid = attachmentIds[i].substring(0, attachmentIds[i].indexOf(64));
             if (yaid.equals(aid)) {
               idsList.remove(attachmentIds[i]);
               attachmentIds = (String[])idsList.toArray(new String[0]);
               break;
             }
           }
           for (int j = 0; j < attachName.length; j++) {
             String yattachName = attachName[j];
             if (yattachName.equals(attachmentName)) {
               nameList.remove(attachName[j]);
               attachName = (String[])nameList.toArray(new String[0]);
               break;
             }
           }
 
           Map map = new HashMap();
           map.put("runId", runId);
           map.put("attachmentId", org.apache.commons.lang.StringUtils.join(attachmentIds, ","));
           map.put("attachmentName", org.apache.commons.lang.StringUtils.join(attachName, "*"));
           this.workFlowServiceContext.getFlowRunService().updateAttachment(map);
         }
         tj.setFlag(0);
         tj.setMsg("true");
         return tj;
       }
       tj.setFlag(1);
       tj.setMsg("false");
       return tj;
     } catch (Exception e) {
       L.e(new Object[] { "delete" + e });
       tj.setFlag(1);
       tj.setMsg("false");
     }return tj;
   }
 
   private void inTigger(Integer flag, String flags, TriggerPlugIn tri)
   {
     ToJson toJson = new ToJson(1, "error");
 
     switch (flag.intValue()) {
     case 0:
       Trigger.run("com.myoa.plugin." + flags, tri.getSqlType(), new Object[] { tri });
     case 1:
     case 2:
     }
   }
 
   private ToJson outTigger(String flags, String format, String fromId, Date sendTime, String subject, String content, String toId2)
   {
     ToJson toJson = new ToJson(1, "error");
 
     return toJson;
   }
 
   public Map<Integer, String> returnMap()
   {
     Map maps = new HashMap();
     maps.put(Integer.valueOf(1), "CREATE");
     maps.put(Integer.valueOf(2), "RECEIVE");
     maps.put(Integer.valueOf(3), "SAVE");
     maps.put(Integer.valueOf(4), "TURN");
     maps.put(Integer.valueOf(5), "INTRUST");
     maps.put(Integer.valueOf(6), "BACK");
     return maps;
   }
 
   public Map<Object, Object> queryTriggerField(String modifydata, String fromdate, String maps)
   {
     String[] a = maps.split(",");
     Map<Object,Object> map = new HashMap();
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
 
     Map<Object,Object> analysis = new HashMap();
     Map<Object,Object> returnMap = new HashMap();
     for (Iterator i$ = modify.iterator(); i$.hasNext(); ) { 
	            Map<Object,Object> mapmodify = (Map)i$.next();
       for (Map.Entry entry1 : from.entrySet())
         if (mapmodify.get("key").equals(entry1.getValue()))
           analysis.put(entry1.getKey(), mapmodify.get("value"));
     }
     Map<Object,Object> mapmodify;
     for (Iterator i$ = analysis.entrySet().iterator(); i$.hasNext(); ) { 
	             Map.Entry entry = (Map.Entry)i$.next();
       for (Map.Entry entry1 : map.entrySet())
         if (entry.getKey().equals(entry1.getValue()))
           returnMap.put(entry1.getKey(), entry.getValue());
     }
     Map.Entry entry;
     return returnMap;
   }
 
   public FlowFast getWorkFromSetting(int flowId)
   {
     FlowFast flowFast = new FlowFast();
 
     FlowTypeModel flowTypeModel = (FlowTypeModel)this.workFlowServiceContext.getFlowTypeService().selectAllFlow(Integer.valueOf(flowId)).getObject();
 
     FlowFormType flowFormType = (FlowFormType)this.workFlowServiceContext.getFlowFormTypeService().qureyItemMax(flowTypeModel.getFormId()).getObject();
     flowFast.setFlowTypeModel(flowTypeModel);
     flowFast.setFlowFormType(flowFormType);
     return flowFast;
   }
 
   public FlowFast conditionSetting(FlowFast flowFast, int flowId, String flowPrcs)
   {
     List allFp = this.workFlowServiceContext.getFlowProcessService().findFlowId(flowId);
 
     Map map = allflowProcessBymap(allFp);
     FlowProcess flowProcess = (FlowProcess)map.get(flowPrcs);
     FlowProcess nextfp = null;
     if ((!flowProcess.getPrcsTo().equals("0,")) && (!flowProcess.getPrcsTo().equals(""))) {
       String[] a = flowProcess.getPrcsTo().split(",");
       String b = a[0];
       nextfp = (FlowProcess)map.get(b);
 
       String prcsIn = nextfp.getPrcsIn();
 
       String prcsInSet = nextfp.getPrcsInSet();
       flowFast.setPrcsIn(prcsIn);
       flowFast.setPrcsInSet(prcsInSet);
       flowFast.setConditionDesc(flowProcess.getConditionDesc());
     }
 
     String prcsOut = flowProcess.getPrcsOut();
 
     String prcsOutSet = flowProcess.getPrcsOutSet();
     flowFast.setPrcsOut(prcsOut);
     flowFast.setPrcsOutSet(prcsOutSet);
 
     flowFast.setPrcsItem(flowProcess.getPrcsItem());
     flowFast.setRequiredItem(flowProcess.getRequiredItem());
     flowFast.setHiddenItem(flowProcess.getHiddenItem());
 
     String signlock = flowProcess.getSignlook();
     flowFast.setSignlock(signlock);
 
     String allowBack = flowProcess.getAllowBack();
     flowFast.setAllowBack(allowBack);
     flowFast.setListFp(allFp);
     return flowFast;
   }
 
   public String attachPriv(FlowProcess flowProcess)
   {
     String[] item = flowProcess.getPrcsItem().split(",");
     String[] arr$ = item; int len$ = arr$.length; int i$ = 0; if (i$ < len$) { String s = arr$[i$];
       if (s.equals("[A@]")) {
         return flowProcess.getAttachPriv();
       }
       return "";
     }
 
     return "";
   }
 
   @Transactional
   public ToJson<FlowFast> workFastAdd(Users users, int flowId, int prcsId, String flowPrcs, String id, HttpServletRequest request, String sqlType, String runName, String preView) {
     ToJson tj = new ToJson();
     try
     {
       Department dep = this.departmentService.getDeptById(users.getDeptId().intValue());
 
       FlowFast flowFast = getWorkFromSetting(flowId);
 
       flowFast = conditionSetting(flowFast, flowId, flowPrcs);
 
       Map map = allflowProcessBymap(flowFast.getListFp());
 
       FlowProcess flowProcess = (FlowProcess)map.get(flowPrcs);
       flowFast.setFlowProcesses(flowProcess);
 
       String isViewPriv = checkViewPriv(flowFast.getFlowTypeModel().getViewPriv().intValue(), flowProcess.getViewPriv().intValue());
       flowFast.setIsViewPriv(isViewPriv);
       List listView = new ArrayList();
 
       if (isViewPriv.equals("1")) {
         listView = this.usersService.reAllPrivUser(flowFast.getFlowTypeModel().getViewUser(), flowFast.getFlowTypeModel().getViewDept(), flowFast.getFlowTypeModel().getViewRole());
         flowFast.setListView(listView);
       }
       String viewUser = this.usersService.reAllName(listView);
 
       String flowName = flowFast.getFlowTypeModel().getFlowName();
       String autoName = flowFast.getFlowTypeModel().getAutoName();
 
       if (com.myoa.util.common.StringUtils.checkNull(runName).booleanValue()) {
         if (autoName != "")
         {
           if (com.myoa.util.common.StringUtils.checkNull(id).booleanValue())
             runName = lexicalParse(autoName, flowFast.getFlowTypeModel(), users, dep);
         }
         else {
           runName = flowFast.getFlowTypeModel().getFlowName() + " " + DateFormat.getStrDate(new Date());
         }
       }
       FlowRunPrcs flowRunPrcs = null;
 
       Map mapCheck = new HashMap();
       mapCheck.put("prcsId", Integer.valueOf(prcsId));
       mapCheck.put("runId", id);
       mapCheck.put("flowPrcs", flowPrcs);
       List<FlowRunPrcs> checkFloRunPrcs = this.workFlowServiceContext.getFlowRunPrcsService().findByRunId(mapCheck);
       if (checkFloRunPrcs.size() > 0) {
         for (FlowRunPrcs flowRunPrcs1 : checkFloRunPrcs) {
           if ("1".equals(preView)) {
             FlowRun flowRun = this.workFlowServiceContext.getFlowRunService().find(Integer.valueOf(Integer.parseInt(id)));
             flowRun.setUserName(users.getUserName());
             flowFast.setFlowRun(flowRun);
             flowFast.setFlowRunPrcs(flowRunPrcs1);
 
             String feedback = flowProcess.getFeedback();
             flowFast.setFeedback(feedback);
             flowFast.setAttachPriv(attachPriv(flowProcess));
 
             Integer gatherNodePriv = reGatherNodePriv(String.valueOf(flowFast.getFlowRun().getRunId()), Integer.valueOf(Integer.parseInt(flowPrcs)), users.getUserId(), Integer.valueOf(flowId));
             flowFast.setGatherNodePriv(String.valueOf(gatherNodePriv));
 
             tj.setObject(flowFast);
             tj.setMsg("只显示查询！");
             tj.setFlag(0);
             return tj;
           }
           if ((users.getUserId().equals(flowRunPrcs1.getUserId())) && 
             (Integer.parseInt(flowRunPrcs1.getPrcsFlag()) >= 3)) {
             FlowRun flowRun = this.workFlowServiceContext.getFlowRunService().find(Integer.valueOf(Integer.parseInt(id)));
             flowRun.setUserName(users.getUserName());
             flowFast.setFlowRun(flowRun);
             flowFast.setFlowRunPrcs(flowRunPrcs1);
             String feedback = flowProcess.getFeedback();
             flowFast.setFeedback(feedback);
             flowFast.setAttachPriv(attachPriv(flowProcess));
 
             Integer gatherNodePriv = reGatherNodePriv(String.valueOf(flowFast.getFlowRun().getRunId()), Integer.valueOf(Integer.parseInt(flowPrcs)), users.getUserId(), Integer.valueOf(flowId));
             flowFast.setGatherNodePriv(String.valueOf(gatherNodePriv));
             tj.setObject(flowFast);
             tj.setMsg("已转交，不能再进行办理！");
             tj.setFlag(0);
             return tj;
           }
         }
       }
 
       String beginTime = DateFormat.getStrDate(new Date());
 
       if ((prcsId == 1) && ("".equals(id.trim()))) {
         FlowRun flowRun = getRun(runName, flowId, users, beginTime, viewUser);
         int runId = flowRun.getRunId();
         flowRun.setUid(String.valueOf(users.getUid()));
         flowRun.setUserName(users.getUserName());
         flowRun.setEndTime("");
 
         flowRunPrcs = new FlowRunPrcs(runId, prcsId, users.getUserId(), beginTime, "0000-00-00 00:00:00", "2", 1, "1", "0", beginTime, "0000-00-00 00:00:00", users.getDeptId().intValue(), "0");
         this.workFlowServiceContext.getFlowRunPrcsService().save(flowRunPrcs);
         flowFast.setFlowRun(flowRun);
         flowFast.setFlowRunPrcs(flowRunPrcs);
 
         String feedback = flowProcess.getFeedback();
         flowFast.setFeedback(feedback);
 
         flowFast.setAttachPriv(attachPriv(flowProcess));
       } else {
         FlowRun flowRun = this.workFlowServiceContext.getFlowRunService().find(Integer.valueOf(Integer.parseInt(id)));
 
         if (com.myoa.util.common.StringUtils.checkNull(flowRun.getEndTime()).booleanValue()) {
           flowRun.setEndTime("");
         }
         Users users1 = this.usersService.getUsersByuserId(flowRun.getBeginUser());
 
         flowRun.setUid(String.valueOf(users1.getUid()));
         flowRun.setUserName(users1.getUserName());
         Map m = new HashMap();
         m.put("runId", id);
         m.put("prcsId", Integer.valueOf(prcsId));
         m.put("prcsFlag", "2");
         m.put("prcsTime", DateFormat.getStrDate(new Date()));
         m.put("userId", users.getUserId());
         m.put("flowPrcs", flowPrcs);
         this.workFlowServiceContext.getFlowRunPrcsService().updateSql(m);
         m.put("prcsId", Integer.valueOf(prcsId));
         List listFloRunPrcs = this.workFlowServiceContext.getFlowRunPrcsService().findByRunId(m);
         flowRunPrcs = (FlowRunPrcs)listFloRunPrcs.get(0);
         m.put("prcsFlag", "4");
         m.put("prcsId", Integer.valueOf(prcsId - 1));
         m.put("userId", null);
         m.put("prcsTime", null);
         String parent = flowRunPrcs.getParent();
 
         if (parent.split(",").length == 1) {
           m.put("flowPrcs", flowRunPrcs.getParent());
         }
         this.workFlowServiceContext.getFlowRunPrcsService().updateSql(m);
         String feedback = flowProcess.getFeedback();
         flowFast.setFeedback(feedback);
         flowFast.setAttachPriv(attachPriv(flowProcess));
         flowFast.setFlowRun(flowRun);
         flowFast.setFlowRunPrcs(flowRunPrcs);
       }
 
       Integer gatherNodePriv = reGatherNodePriv(String.valueOf(flowFast.getFlowRun().getRunId()), Integer.valueOf(Integer.parseInt(flowPrcs)), users.getUserId(), Integer.valueOf(flowId));
       flowFast.setGatherNodePriv(String.valueOf(gatherNodePriv));
       tj.setObject(flowFast);
       tj.setMsg("OK");
       tj.setFlag(0);
     } catch (Exception e) {
       tj.setMsg(e.getMessage());
       tj.setFlag(1);
     }
     return tj;
   }
 
   public Map<String, FlowProcess> allflowProcessBymap(List<FlowProcess> allFp)
   {
     Map map = new HashMap();
 
     for (int i = 0; i < allFp.size(); i++) {
       FlowProcess flowProcess = (FlowProcess)allFp.get(i);
       map.put(String.valueOf(flowProcess.getPrcsId()), flowProcess);
     }
     return map;
   }
 
   public AjaxJson createGuide(String flowId, Users users, HttpServletRequest request)
   {
     AjaxJson ajaxJson = new AjaxJson();
     String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
     try
     {
       List allFp = this.workFlowServiceContext.getFlowProcessService().findFlowId(Integer.parseInt(flowId));
 
       Department dep = this.departmentService.getDeptById(users.getDeptId().intValue());
       FlowTypeModel flowTypeModel = (FlowTypeModel)this.workFlowServiceContext.getFlowTypeService().selectAllFlow(Integer.valueOf(Integer.parseInt(flowId))).getObject();
       FlowFormType flowFormType = (FlowFormType)this.workFlowServiceContext.getFlowFormTypeService().qureyItemMax(flowTypeModel.getFormId()).getObject();
       String flowName = flowTypeModel.getFlowName();
       String autoName = flowTypeModel.getAutoName();
       String beginTime = DateFormat.getStrDate(new Date());
       String runName = lexicalParse(autoName, flowTypeModel, users, dep);
 
       Map attributes = new HashMap();
       attributes.put("AllFlowProcess", allFp);
       attributes.put("runName", runName);
       attributes.put("flowName", flowName);
       attributes.put("formId", flowFormType.getFormId());
 
       attributes.put("flowDesc", flowTypeModel.getFlowDesc());
       attributes.put("flowType", flowTypeModel);
       attributes.put("attachmentId", flowTypeModel.getAttachmentId());
       attributes.put("attachmentName", flowTypeModel.getAttachmentName());
       attributes.put("attachList", GetAttachmentListUtil.returnAttachment(flowTypeModel.getAttachmentName(), flowTypeModel.getAttachmentId(), sqlType, "workflow"));
       ajaxJson.setAttributes(attributes);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("OK");
       return ajaxJson;
     } catch (Exception e) {
       L.e(new Object[] { "createGuide" + e.getMessage() });
       ajaxJson.setMsg("fasle");
       ajaxJson.setFlag(false);
     }return ajaxJson;
   }
 
   public ToJson<FlowFast> exportFlowRun(HttpServletRequest request, Integer flowId, @RequestParam(value="flowStep", required=false) Integer prcsId, @RequestParam(value="prcsId", required=false) String flowProcs, @RequestParam(value="runId", required=false) String runId, @RequestParam(value="runName", required=false) String runName)
   {
     FlowFast flowFast = new FlowFast();
     Map map = fastAdd(runId, String.valueOf(flowId));
 
     return null;
   }
 
   public BaseWrapper getRunName(Users user, Integer flowId, Integer prcsId, String flowProcs)
   {
     BaseWrapper baseWrappers = new BaseWrapper();
 
     Department dep = this.departmentService.getDeptById(user.getDeptId().intValue());
 
     FlowFast flowFast = getWorkFromSetting(flowId.intValue());
 
     flowFast = conditionSetting(flowFast, flowId.intValue(), flowProcs);
     Map map = allflowProcessBymap(flowFast.getListFp());
     FlowProcess flowProcess = (FlowProcess)map.get(flowProcs);
     String flowName = flowFast.getFlowTypeModel().getFlowName();
     String autoName = flowFast.getFlowTypeModel().getAutoName();
     String beginTime = DateFormat.getStrDate(new Date());
     String runName = "";
     if (autoName != "") {
       runName = lexicalParse(autoName, flowFast.getFlowTypeModel(), user, dep);
     }
     baseWrappers.setStatus(true);
     baseWrappers.setFlag(true);
     baseWrappers.setData(runName);
     return baseWrappers;
   }
 
   public void exportExcel(Users users, String type, HttpServletResponse response)
   {
     List resultList = new ArrayList();
     if ("1".equals(type))
       resultList = getReceivedWorksList(users);
     else if ("2".equals(type))
       resultList = getHandledWorksList(users);
     else if ("3".equals(type))
       resultList = getAllWorksList(users);
     else if (!"4".equals(type))
     {
       if (!"5".equals(type));
     }
 
     Calendar c = Calendar.getInstance();
     String time = "" + c.get(1) + (c.get(2) + 1) + c.get(5) + c.get(11) + c.get(12);
     try
     {
       HSSFWorkbook wb = new HSSFWorkbook();
 
       HSSFSheet sheet = wb.createSheet("工作查询列表信息");
 
       HSSFRow row = sheet.createRow(0);
 
       HSSFFont font = wb.createFont();
       font.setFontHeightInPoints((short)12);
       font.setColor((short)32767);
       font.setFontName("宋体");
       font.setBoldweight((short)700);
       font.setItalic(false);
       HSSFCellStyle style = wb.createCellStyle();
       style.setAlignment((short)2);
       style.setFont(font);
 
       HSSFFont font1 = wb.createFont();
       font1.setFontHeightInPoints((short)12);
       font1.setColor((short)32767);
       font1.setFontName("宋体");
       font1.setBoldweight((short)400);
       font1.setItalic(false);
       HSSFCellStyle style1 = wb.createCellStyle();
       style1.setAlignment((short)2);
       style1.setFont(font1);
 
       HSSFCell cell = row.createCell(0);
       List head = new ArrayList();
 
       StringBuffer stringBuffer = new StringBuffer();
 
       String[] d = { "流水号", "流程名称", "我经办的步骤", "发起人", "状态", "到达时间", "已停留" };
 
       String[] b = { "流水号", "流程名称", "工作名称/文号", "发起人", "办结时间", "流程状态" };
       String[] q = { "流水号", "流程名称", "工作名称/文号", "发起人", "办结时间", "流程状态" };
       if ("1".equals(type)) {
         for (int i = 0; i < d.length; i++) {
           cell.setCellValue(d[i]);
           cell.setCellStyle(style);
           cell = row.createCell((short)(i + 1));
         }
 
         Map map = new HashMap();
         for (int m = 0; m < resultList.size(); m++) {
           HSSFRow r = sheet.createRow(m + 1);
 
           FlowRunPrcs flowRunPrcs = (FlowRunPrcs)resultList.get(m);
           map.put(Integer.valueOf(0), flowRunPrcs.getRunId());
           map.put(Integer.valueOf(1), flowRunPrcs.getFlowRun().getRunName());
           map.put(Integer.valueOf(2), "第" + flowRunPrcs.getFlowProcess().getPrcsId() + "步:" + flowRunPrcs.getFlowProcess().getPrcsName());
           map.put(Integer.valueOf(3), flowRunPrcs.getUserName());
           map.put(Integer.valueOf(4), returnFlag(flowRunPrcs.getPrcsFlag()));
           map.put(Integer.valueOf(5), flowRunPrcs.getReceiptTime());
           map.put(Integer.valueOf(6), flowRunPrcs.getArriveTime());
           for (int n = 0; n < map.size(); n++) {
             cell = r.createCell((short)n);
             cell.setCellValue(String.valueOf(map.get(Integer.valueOf(n))));
             cell.setCellStyle(style1);
           }
         }
         stringBuffer.append("待办工作列表").append(time.toString()).append(".xls");
       }
       if ("2".equals(type)) {
         for (int i = 0; i < b.length; i++) {
           cell.setCellValue(b[i]);
           cell.setCellStyle(style);
           cell = row.createCell((short)(i + 1));
         }
 
         Map map = new HashMap();
         for (int m = 0; m < resultList.size(); m++) {
           HSSFRow r = sheet.createRow(m + 1);
 
           FlowRunPrcs flowRunPrcs = (FlowRunPrcs)resultList.get(m);
           map.put(Integer.valueOf(0), flowRunPrcs.getRunId());
           map.put(Integer.valueOf(1), flowRunPrcs.getFlowRun().getRunName());
           map.put(Integer.valueOf(2), "第" + flowRunPrcs.getFlowProcess().getPrcsId() + "步:" + flowRunPrcs.getFlowProcess().getPrcsName());
           map.put(Integer.valueOf(3), flowRunPrcs.getUserName());
           map.put(Integer.valueOf(4), flowRunPrcs.getDeliverTime());
           map.put(Integer.valueOf(5), returnFlag(flowRunPrcs.getPrcsFlag()));
           for (int n = 0; n < map.size(); n++) {
             cell = r.createCell((short)n);
             cell.setCellValue(String.valueOf(map.get(Integer.valueOf(n))));
             cell.setCellStyle(style1);
           }
         }
         stringBuffer.append("办结工作列表").append(time.toString()).append(".xls");
       }
       if ("3".equals(type)) {
         for (int i = 0; i < b.length; i++) {
           cell.setCellValue(b[i]);
           cell.setCellStyle(style);
           cell = row.createCell((short)(i + 1));
         }
 
         Map map = new HashMap();
         for (int m = 0; m < resultList.size(); m++) {
           HSSFRow r = sheet.createRow(m + 1);
 
           FlowRunPrcs flowRunPrcs = (FlowRunPrcs)resultList.get(m);
           map.put(Integer.valueOf(0), flowRunPrcs.getRunId());
           map.put(Integer.valueOf(1), flowRunPrcs.getFlowType().getFlowName());
           map.put(Integer.valueOf(2), flowRunPrcs.getFlowRun().getRunName());
           map.put(Integer.valueOf(3), flowRunPrcs.getUserName());
           map.put(Integer.valueOf(4), "第" + flowRunPrcs.getFlowProcess().getPrcsId() + "步:" + flowRunPrcs.getFlowProcess().getPrcsName());
           map.put(Integer.valueOf(5), returnFlag(flowRunPrcs.getPrcsFlag()));
           for (int n = 0; n < map.size(); n++) {
             cell = r.createCell((short)n);
             cell.setCellValue(String.valueOf(map.get(Integer.valueOf(n))));
             cell.setCellStyle(style1);
           }
         }
         stringBuffer.append("全部工作列表").append(time.toString()).append(".xls");
       }
 
       sheet.setDefaultColumnWidth(15);
       String fileName = stringBuffer.toString();
       response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
 
       response.setContentType("application/msexcel;charset=UTF-8");
       OutputStream out = response.getOutputStream();
       wb.write(out);
       out.close();
     } catch (Exception e) {
       e.printStackTrace();
     }
   }
 
   public List<FlowRunPrcs> getHandledWorksList(Users users)
   {
     Map maps = new HashMap();
     maps.put("userId", users.getUserId());
     ToJson toJson = this.workFlowServiceContext.getFlowRunPrcsService().selectEnd(maps, null, null, false);
     List list = toJson.getObj();
     return list;
   }
 
   public List<FlowRunPrcs> getReceivedWorksList(Users users)
   {
     Map maps = new HashMap();
     maps.put("userId", users.getUserId());
     ToJson toJson = this.workFlowServiceContext.getFlowRunPrcsService().selectObject(maps, null, null, false);
     List list = toJson.getObj();
     return list;
   }
 
   public List<FlowRunPrcs> getAllWorksList(Users users)
   {
     Map maps = new HashMap();
     maps.put("userId", users.getUserId());
     ToJson toJson = this.workFlowServiceContext.getFlowRunPrcsService().selectAll(maps, null, null, false);
     List list = toJson.getObj();
     return list;
   }
 
   public static String returnFlag(String prcsFlag) {
     if (prcsFlag.equals("1")) {
       return "未接收";
     }
     if (prcsFlag.equals("2")) {
       return "办理中";
     }
     if (prcsFlag.equals("3")) {
       return "转交下一步，下一步经办人无人接收";
     }
     if (prcsFlag.equals("4")) {
       return "已办结";
     }
     if (prcsFlag.equals("5")) {
       return "自由流程预设步骤";
     }
     if (prcsFlag.equals("6")) {
       return "已挂起";
     }
     return "";
   }
 
   public String lexicalParse(String str, FlowTypeModel flowTypeModel, Users users, Department department)
   {
     Calendar now = Calendar.getInstance();
     int autoNum = flowTypeModel.getAutoNum().intValue();
     int autoLength = flowTypeModel.getAutoLen().intValue();
     autoNum++;
     flowTypeModel.setAutoNum(Integer.valueOf(autoNum));
     this.workFlowServiceContext.getFlowTypeModelMapper().update(flowTypeModel);
     str = str.replace("{Y}", now.get(1) + "");
     str = str.replace("{M}", now.get(2) + 1 + "");
     str = str.replace("{D}", now.get(5) + "");
     str = str.replace("{H}", now.get(11) + "");
     str = str.replace("{I}", now.get(12) + "");
     str = str.replace("{S}", now.get(13) + "");
     str = str.replace("{F}", flowTypeModel.getFlowName());
     str = str.replace("{U}", users.getUserName());
     str = str.replace("{R}", users.getUserPrivName());
     str = str.replace("{FS}", users.getUserName());
     str = str.replace("{SD}", department.getDeptName());
     str = str.replace("{LD}", this.departmentService.longDepName(department.getDeptId().intValue()));
     str = str.replace("{N}", org.apache.commons.lang.StringUtils.repeat("0", autoLength - String.valueOf(autoNum).length()) + autoNum);
 
     return str;
   }
 
   private FlowRun getRun(String runName, int flowId, Users users, String beginTime, String viewUser) throws InterruptedException {
     FlowRun flowRun = new FlowRun();
     synchronized (this) {
       int runId = this.workFlowServiceContext.getFlowRunService().getMaxRunId() + 1;
       flowRun = new FlowRun(runId, runName, flowId, users.getUserId(), beginTime, users.getDeptId().intValue(), "0");
       flowRun.setViewUser(viewUser);
       this.workFlowServiceContext.getFlowRunService().save(flowRun);
       flowRun.setUserName(users.getUserName());
     }
     return flowRun;
   }
 
   public ToJson<FlowRunPrcs> entrust(String runId, String prcsId, String toId, String flowPrcs, String opFlag, Users users)
   {
     ToJson json = new ToJson();
     try {
       Map map = new HashMap();
       map.put("runId", runId);
       map.put("prcsId", prcsId);
       map.put("prcsFlag", Integer.valueOf(4));
       map.put("opFlag", Integer.valueOf(0));
       this.workFlowServiceContext.getFlowRunPrcsService().updateSql(map);
       FlowRunPrcs flowRunPrcs = new FlowRunPrcs();
       flowRunPrcs.setRunId(Integer.valueOf(Integer.parseInt(runId)));
       flowRunPrcs.setPrcsId(Integer.valueOf(Integer.parseInt(prcsId)));
       flowRunPrcs.setFlowPrcs(Integer.valueOf(Integer.parseInt(flowPrcs)));
       flowRunPrcs.setUserId(toId);
       flowRunPrcs.setPrcsFlag("1");
       flowRunPrcs.setOpFlag("1");
       flowRunPrcs.setOtherUser(users.getUserId() + ",");
       this.workFlowServiceContext.getFlowRunPrcsService().save(flowRunPrcs);
       json.setMsg("true");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("error");
     }
     return json;
   }
 
   public String checkViewPriv(int ftViewPriv, int fpViewPriv)
   {
     if ((ftViewPriv == 1) && 
       (fpViewPriv == 1)) {
       return "1";
     }
 
     return "0";
   }
 
   public Integer reGatherNodePriv(String runId, Integer flowPrcs, String userId, Integer flowId)
   {
     Map m1 = new HashMap();
     StringBuffer stringBuffer = new StringBuffer();
     List listPrcs = new ArrayList();
     List listFlag = new ArrayList();
 
     Map map = reAll(m1, flowId, flowPrcs);
     if (map.size() == 0) {
       return Integer.valueOf(0);
     }
 
     Set entrySet = map.entrySet();
 
     Iterator it2 = entrySet.iterator();
 
     while (it2.hasNext()) {
       Map.Entry me = (Map.Entry)it2.next();
       Integer key2 = (Integer)me.getKey();
       listPrcs.add(key2);
     }
     listFlag.add(Integer.valueOf(1));
     listFlag.add(Integer.valueOf(2));
 
     Map m = new HashMap();
     m.put("runId", runId);
     m.put("flowPrcs", flowPrcs);
     m.put("listPrcs", listPrcs);
     m.put("listFlag", listFlag);
     m.put("userId", userId);
     Integer gatherNodePriv = this.workFlowServiceContext.getFlowRunPrcsService().checkGatherNode(m);
     if (gatherNodePriv == null) {
       return Integer.valueOf(0);
     }
     return Integer.valueOf(1);
   }
 
   public Map<Integer, FlowProcess> reAll(Map<Integer, FlowProcess> map, Integer flowId, Integer flowPrcs)
   {
     Map map1 = new HashMap();
     map1.put("flowId", flowId);
     map1.put("flowPrcs", flowPrcs);
     List<FlowProcess> list = this.workFlowServiceContext.getFlowProcessMapper().findProcseePrcsTo(map1);
     for (FlowProcess flowProcess : list) {
       map.put(flowProcess.getPrcsId(), flowProcess);
       reAll(map, flowId, flowProcess.getPrcsId());
     }
     return map;
   }
 
   public AjaxJson workAttention(Integer runId, String userId, String status)
   {
     AjaxJson ajaxJson = new AjaxJson();
     FlowRun flowRun = this.workFlowServiceContext.getFlowRunService().find(runId);
     String focusUser = flowRun.getFocusUser();
     if (status.equals("0"))
       focusUser = focusUser.replaceAll(userId, "");
     else {
       focusUser = focusUser + userId;
     }
     Map map = new HashMap();
     map.put("runId", runId);
     map.put("userId", focusUser);
     map.put("status", status);
     try {
       int a = this.workFlowServiceContext.getFlowRunService().updateFocusUser(map);
       if (a > 0) {
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("OK");
       } else {
         ajaxJson.setFlag(false);
         ajaxJson.setMsg("false");
       }
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg(e.getMessage());
     }
     return ajaxJson;
   }
 
   public AjaxJson worDelete(Integer runId, String status)
   {
     AjaxJson ajaxJson = new AjaxJson();
     Map map = new HashMap();
     try
     {
       if (status.equals("0")) {
         String endTime = DateFormat.getStrDate(new Date());
         map.put("runId", runId);
         map.put("endTime", endTime);
         this.workFlowServiceContext.getFlowRunService().updateEnd(map);
       } else {
         map.put("runId", runId);
         map.put("delFlag", Integer.valueOf(1));
         this.workFlowServiceContext.getFlowRunService().updateEnd(map);
       }
       ajaxJson.setMsg("OK");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
public void todoWorkSmsBoby(final String beginUser, final String flowPrcs, final String tableName, final String runId, final String runName, final String flowId, final String prcsId, 
		final String currentPrcsId, final String tabId, String flowStep, String smsContent, HttpServletRequest request, final String smsType, final Users users, 
		final String orgadd, final String jingbanUser, final String viewUser)
{
	final String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
	threadPoolTaskExecutor.execute(new Runnable() { 

		public void run()
		{
			ContextHolder.setConsumerType((new StringBuilder()).append(Constant.MYOA).append(sqlType).toString());
			if (!StringUtils.checkNull(smsType).booleanValue())
			{
				String strOrgAdd[] = smsType.split(",");
				for (int j = 0; j < strOrgAdd.length; j++)
					if (!StringUtils.checkNull(strOrgAdd[j]).booleanValue())
                      label0:
						switch (Integer.parseInt(strOrgAdd[j]))
						{
						case 4: // '\004'
						default:
							break;

						case 1: // '\001'
						{
							SmsBody smsBody = new SmsBody();
							if (StringUtils.checkNull(beginUser).booleanValue())
								break;
							String strs[] = beginUser.split(",");
							String strs1[] = flowPrcs.split(",");
							String jingbanStr[] = jingbanUser.split("\\|");
							int i = 0;
							do
							{
								if (i >= strs1.length)
									break label0;
								String jingbanArray[] = null;
								jingbanArray = jingbanStr[i].split(",");
								String beginByUser = strs[i];
								for (int wyq = 0; wyq < jingbanArray.length; wyq++)
								{
									String title = "";
									String context = "";
									String remindUrl;
									String smsContent;
									ToJson toJson;
									if (beginByUser.equals(jingbanArray[wyq]))
									{
										remindUrl = (new StringBuilder()).append("/workflow/work/workform?opflag=1&flowId=").append(flowId).append("&flowStep=").append(Integer.parseInt(prcsId) + 1).append("&runId=").append(runId).append("&prcsId=").append(strs1[i]).toString();
										smsContent = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
										if ("document".equals(tableName))
										{
											title = "您有新的公文需要签阅";
											context = (new StringBuilder()).append("流水号：").append(runId).append("，公文文号：").append(runName).toString();
											remindUrl = (new StringBuilder()).append("/workflow/work/workform?opflag=1&flowId=").append(flowId).append("&flowStep=").append(Integer.parseInt(prcsId) + 1).append("&tableName=").append(tableName).append("&tabId=").append(tabId).append("&runId=").append(runId).append("&prcsId=").append(strs1[i]).append("&isNomalType=false").toString();
											smsBody = new SmsBody(users.getUserId(), "70", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
										} else
										{
											title = "您有新的工作需要办理";
											context = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
											smsBody = new SmsBody(users.getUserId(), "7", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
										}
										smsBody.setToId(beginByUser);
										toJson = smsService.saveSms(smsBody, beginByUser, "1", "1", title, context, sqlType);
										continue;
									}
									remindUrl = (new StringBuilder()).append("/workflow/work/workform?opflag=0&flowId=").append(flowId).append("&flowStep=").append(Integer.parseInt(prcsId) + 1).append("&runId=").append(runId).append("&prcsId=").append(strs1[i]).toString();
									smsContent = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
									if ("document".equals(tableName))
									{
										title = "您有新的公文需要签阅";
										context = (new StringBuilder()).append("流水号：").append(runId).append("，公文文号：").append(runName).toString();
										remindUrl = (new StringBuilder()).append("/workflow/work/workform?opflag=0&flowId=").append(flowId).append("&flowStep=").append(Integer.parseInt(prcsId) + 1).append("&tableName=").append(tableName).append("&tabId=").append(tabId).append("&runId=").append(runId).append("&prcsId=").append(strs1[i]).append("&isNomalType=false").toString();
										smsBody = new SmsBody(users.getUserId(), "70", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
									} else
									{
										title = "您有新的工作需要办理";
										context = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
										smsBody = new SmsBody(users.getUserId(), "7", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
									}
									smsBody.setToId(jingbanArray[wyq]);
									toJson = smsService.saveSms(smsBody, jingbanArray[wyq], "1", "1", title, context, sqlType);
								}

								i++;
							} while (true);
						}

						case 2: // '\002'
						{
							String remindUrl = (new StringBuilder()).append("/workflow/work/workform?opflag=0&flowId=").append(flowId).append("&flowStep=").append(Integer.parseInt(prcsId)).append("&runId=").append(runId).append("&prcsId=").append(flowPrcs).toString();
							String smsContent = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
							String title = "您有新的工作需要办理";
							String context = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
							SmsBody smsBody = new SmsBody(users.getUserId(), "7", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
							smsBody.setToId(beginUser);
							ToJson toJson = smsService.saveSms(smsBody, beginUser, "1", "1", title, context, sqlType);
							break;
						}

						case 3: // '\003'
						{
							FlowRun flowRun = flowRunMapper.find(Integer.valueOf(Integer.parseInt(runId)));
							if (flowRun == null)
								break;
							String title = "";
							String context = "";
							String remindUrl = (new StringBuilder()).append("/workflow/work/workformPreView?flowId=").append(flowId).append("&flowStep=").append(prcsId).append("&runId=").append(runId).append("&prcsId=").append(currentPrcsId).toString();
							String smsContent = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
							SmsBody smsBody;
							if ("document".equals(tableName))
							{
								title = "您有新的公文需要签阅";
								context = (new StringBuilder()).append("流水号：").append(runId).append("，公文文号：").append(runName).toString();
								remindUrl = (new StringBuilder()).append("/workflow/work/workformPreView?flowId=").append(flowId).append("&flowStep=").append(prcsId).append("&tableName=").append(tableName).append("&tabId=").append(tabId).append("&runId=").append(runId).append("&prcsId=").append(currentPrcsId).append("&isNomalType=false&hidden=true").toString();
								smsBody = new SmsBody(users.getUserId(), "70", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
							} else
							{
								title = "您有新的工作需要办理";
								context = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
								smsBody = new SmsBody(users.getUserId(), "7", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
							}
							smsBody.setToId(flowRun.getBeginUser());
							ToJson toJson = smsService.saveSms(smsBody, flowRun.getBeginUser(), "1", "1", title, context, sqlType);
							break;
						}

						case 5: // '\005'
						{
							List flowRunPrcs = flowRunPrcsMapper.findByRunId(Integer.valueOf(Integer.parseInt(runId)));
							Iterator i$ = flowRunPrcs.iterator();
							do
							{
								FlowRunPrcs flowRunPrcs1;
								do
								{
									if (!i$.hasNext())
										break label0;
									flowRunPrcs1 = (FlowRunPrcs)i$.next();
								} while (!"0".equals(flowRunPrcs1.getOpFlag()));
								String title = "";
								String context = "";
								String remindUrl = (new StringBuilder()).append("/workflow/work/workformPreView?flowId=").append(flowId).append("&flowStep=").append(prcsId).append("&runId=").append(runId).append("&prcsId=").append(currentPrcsId).toString();
								String smsContent = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
								SmsBody smsBody;
								if ("document".equals(tableName))
								{
									title = "您有新的公文需要签阅";
									context = (new StringBuilder()).append("流水号：").append(runId).append("，公文文号：").append(runName).toString();
									remindUrl = (new StringBuilder()).append("/workflow/work/workformPreView?flowId=").append(flowId).append("&flowStep=").append(prcsId).append("&tableName=").append(tableName).append("&tabId=").append(tabId).append("&runId=").append(runId).append("&prcsId=").append(currentPrcsId).append("&isNomalType=false&hidden=true").toString();
									smsBody = new SmsBody(users.getUserId(), "70", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
								} else
								{
									title = "您有新的工作需要办理";
									context = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
									smsBody = new SmsBody(users.getUserId(), "7", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
								}
								smsBody.setToId(flowRunPrcs1.getUserId());
								ToJson toJson = smsService.saveSms(smsBody, flowRunPrcs1.getUserId(), "1", "1", title, context, sqlType);
							} while (true);
						}
						}

			}
			if (!StringUtils.checkNull(orgadd).booleanValue())
			{
				SmsBody smsBody = new SmsBody();
				String strOrgAdd[] = orgadd.split(",");
				for (int i = 0; i < strOrgAdd.length; i++)
				{
					String title = "";
					String context = "";
					String remindUrl = (new StringBuilder()).append("/workflow/work/workformPreView?flowId=").append(flowId).append("&flowStep=").append(prcsId).append("&runId=").append(runId).append("&prcsId=").append(currentPrcsId).toString();
					String smsContent = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
					if ("document".equals(tableName))
					{
						title = "您有新的公文需要签阅";
						context = (new StringBuilder()).append("流水号：").append(runId).append("，公文文号：").append(runName).toString();
						remindUrl = (new StringBuilder()).append("/workflow/work/workformPreView?flowId=").append(flowId).append("&flowStep=").append(prcsId).append("&tableName=").append(tableName).append("&tabId=").append(tabId).append("&runId=").append(runId).append("&prcsId=").append(currentPrcsId).append("&isNomalType=false&hidden=true").toString();
						smsBody = new SmsBody(users.getUserId(), "70", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
					} else
					{
						title = "您有新的工作需要办理";
						context = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
						smsBody = new SmsBody(users.getUserId(), "7", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
					}
					smsBody.setToId(strOrgAdd[i]);
					ToJson toJson = smsService.saveSms(smsBody, strOrgAdd[i], "1", "1", title, context, sqlType);
				}

			}
			if (!StringUtils.checkNull(viewUser).booleanValue())
			{
				SmsBody smsBody = new SmsBody();
				String viewUserStr[] = viewUser.split(",");
				for (int i = 0; i < viewUserStr.length; i++)
				{
					String title = "";
					String context = "";
					String remindUrl = (new StringBuilder()).append("/workflow/work/workformPreView?flowId=").append(flowId).append("&flowStep=").append(prcsId).append("&runId=").append(runId).append("&prcsId=").append(currentPrcsId).toString();
					String smsContent = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
					if ("document".equals(tableName))
					{
						title = "您有新的公文需要签阅";
						context = (new StringBuilder()).append("流水号：").append(runId).append("，公文文号：").append(runName).toString();
						remindUrl = (new StringBuilder()).append("/workflow/work/workformPreView?flowId=").append(flowId).append("&flowStep=").append(prcsId).append("&tableName=").append(tableName).append("&tabId=").append(tabId).append("&runId=").append(runId).append("&prcsId=").append(currentPrcsId).append("&isNomalType=false&hidden=true").toString();
						smsBody = new SmsBody(users.getUserId(), "70", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
					} else
					{
						title = "您有新的工作需要办理";
						context = (new StringBuilder()).append("流水号：").append(runId).append("，工作名称/文号：").append(runName).toString();
						smsBody = new SmsBody(users.getUserId(), "7", DateFormat.getTime(DateFormat.getCurrentTime()), remindUrl, smsContent);
					}
					smsBody.setToId(viewUserStr[i]);
					ToJson toJson = smsService.saveSms(smsBody, viewUserStr[i], "1", "1", title, context, sqlType);
				}

			}
		} 
	});
}
 
   public AjaxJson saveHandle(Integer runId, String prcsId, String flowPrcs, Users users)
   {
     AjaxJson ajaxJson = new AjaxJson();
     Map maps = new HashMap();
     try {
       maps.put("prcsId", prcsId);
       maps.put("runId", runId);
       maps.put("prcsFlag", "4");
       maps.put("deliverTime", DateFormat.getStrDate(new Date()));
       maps.put("userId", users.getUserId());
 
       maps.put("flowPrcs", flowPrcs);
       this.workFlowServiceContext.getFlowRunPrcsService().updateSql(maps);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("OK");
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("false");
     }
     return ajaxJson;
   }
 }
