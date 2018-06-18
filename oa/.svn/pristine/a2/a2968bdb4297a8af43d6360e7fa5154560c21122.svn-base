 package com.myoa.service.WFE.WFERunner;
 
 import com.alibaba.fastjson.JSONArray;
import com.myoa.dao.WFE.WFEFlowTypeModelMapper;
import com.myoa.dao.WFE.WFEFormTypeMapper;
import com.myoa.dao.flowRunFeedback.FlowRunFeedbackMapper;
import com.myoa.dao.flowhook.FlowHookMapper;
import com.myoa.dao.flowplugin.FlowPluginMapper;
import com.myoa.dao.work.WorkMapper;
import com.myoa.dao.workflow.FlowTiggerMapper;
import com.myoa.global.proxy.TriggerUtils.Trigger;
import com.myoa.model.department.Department;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.flowRunFeedback.FlowRunFeedback;
import com.myoa.model.flowplugin.FlowPluginModel;
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
import com.myoa.service.WFE.WFE;
import com.myoa.service.WFE.WFEFactory.WFEFlowProcess;
import com.myoa.service.WFE.WFEFactory.WFEFlowType;
import com.myoa.service.WFE.WFEFactory.WFEFormType;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.enclosure.EnclosureService;
import com.myoa.service.sms.SmsService;
import com.myoa.service.users.UsersService;
import com.myoa.service.work.WorkService;
import com.myoa.util.AjaxJson;
import com.myoa.util.Constant;
import com.myoa.util.DateFormat;
import com.myoa.util.FileUploadUtil;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ModuleEnum;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.session.SessionUtils;

 import java.io.OutputStream;
 import java.net.URLEncoder;
 import java.util.ArrayList;
 import java.util.Calendar;
 import java.util.Collections;
 import java.util.Comparator;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import java.util.Map.Entry;
 import java.util.ResourceBundle;
 import java.util.Set;
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
 import org.springframework.stereotype.Service;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.context.request.RequestContextHolder;
 import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class WFEFlowRunInfo extends WFE
 {
 
   @Autowired
   protected WFEFlowType wfeFlowType;
 
   @Autowired
   protected WFEFormType wfeFormType;
 
   @Autowired
   protected WFEFlowProcess wfeFlowProcess;
 
   @Autowired
   protected WFEFlowRun wfeFlowRun;
 
   @Autowired
   protected WFEFlowRunPrcs wfeFlowRunPrcs;
 
   @Autowired
   protected WFEFlowTypeModelMapper wfeFlowTypeModelMapper;
 
   @Autowired
   protected WFEFormTypeMapper wfeFormTypeMapper;
 
   @Autowired
   protected WorkMapper workMapper;
 
   @Autowired
   protected FlowTiggerMapper flowTiggerMapper;
 
   @Autowired
   protected FlowPluginMapper flowPluginMapper;
 
   @Autowired
   protected FlowHookMapper flowHookMapper;
 
   @Autowired
   protected FlowRunFeedbackMapper flowRunFeedbackMapper;
 
   @Autowired
   protected WorkService workService;
   private final int BUILT_IN = 0;
 
   private final int BUILT_OUT = 1;
 
   private final int BUILT_PUSH = 2;
 
   private static int create = 1;
 
   private static int receive = 2;
 
   private static int save = 3;
 
   private static int turn = 4;
 
   private static int intrust = 5;
 
   private static int back = 6;
 
   private static String document = "document";
   private static String attend_leave = "attend_leave";
   private static String attend_evection = "attend_evection";
   private static String attend_out = "attend_out";
 
   public ToJson<FlowFast> workFastAdd(Users users, int flowId, int prcsId, String flowPrcs, String id, HttpServletRequest request, String sqlType, String runName, String preView)
   {
     ToJson tj = new ToJson();
     try
     {
       Department dep = this.departmentService.getDeptById(users.getDeptId().intValue());
 
       FlowFast flowFast = conditionSetting(flowId, flowPrcs);
 
       Map map = allflowProcessBymap(flowFast.getListFp());
 
       FlowProcess flowProcess = (FlowProcess)map.get(flowPrcs);
       flowFast.setFlowProcesses(flowProcess);
 
       flowFast.setUserName(users.getUserName());
 
       String isViewPriv = checkViewPriv(flowFast.getFlowTypeModel().getViewPriv().intValue(), flowProcess.getViewPriv().intValue());
       flowFast.setIsViewPriv(isViewPriv);
       List listView = new ArrayList();
 
       if ("1".equals(isViewPriv)) {
         listView = this.usersService.reAllPrivUser(flowFast.getFlowTypeModel().getViewUser(), flowFast.getFlowTypeModel().getViewDept(), flowFast.getFlowTypeModel().getViewRole());
         flowFast.setListView(listView);
       }
 
       String viewUser = this.usersService.reAllName(listView);
 
       String feedback = flowProcess.getFeedback();
       flowFast.setFeedback(feedback);
 
       flowFast.setAttachPriv(attachPriv(flowProcess));
 
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
       FlowRun flowRun = null;
 
       String beginTime = DateFormat.getStrDate(new Date());
 
       if ((prcsId == 1) && ("".equals(id.trim())))
       {
         flowRun = getRun(runName, flowId, users, beginTime, viewUser);
         int runId = flowRun.getRunId();
         flowRun.setUid(String.valueOf(users.getUid()));
         flowRun.setUserName(users.getUserName());
         flowRun.setEndTime("");
 
         flowRunPrcs = new FlowRunPrcs(runId, prcsId, users.getUserId(), beginTime, "0000-00-00 00:00:00", "2", 1, "1", "0", beginTime, "0000-00-00 00:00:00", users.getDeptId().intValue(), "0");
         this.wfeFlowRunPrcs.save(flowRunPrcs);
       }
       else {
         Map mapCheck = new HashMap();
         mapCheck.put("prcsId", Integer.valueOf(prcsId));
         mapCheck.put("runId", id);
         mapCheck.put("flowPrcs", flowPrcs);
         List<FlowRunPrcs> checkFloRunPrcs = this.wfeFlowRunPrcs.findByRunId(mapCheck);
         if (checkFloRunPrcs.size() > 0) {
           for (FlowRunPrcs flowRunPrcs1 : checkFloRunPrcs) {
             if ("1".equals(preView)) {
               flowRun = this.wfeFlowRun.find(Integer.valueOf(Integer.parseInt(id)));
               Users u = this.usersService.getUsersByuserId(flowRun.getBeginUser());
               flowRun.setUserName(u.getUserName());
               flowFast.setFlowRun(flowRun);
               flowFast.setFlowRunPrcs(flowRunPrcs1);
 
               if ("1".equals(flowProcess.getGatherNode())) {
                 Integer gatherNodePriv = reGatherNodePriv(String.valueOf(flowFast.getFlowRun().getRunId()), Integer.valueOf(Integer.parseInt(flowPrcs)), users.getUserId(), Integer.valueOf(flowId));
                 flowFast.setGatherNodePriv(String.valueOf(gatherNodePriv));
               } else {
                 flowFast.setGatherNodePriv(flowProcess.getGatherNode());
               }
 
               tj.setObject(flowFast);
               tj.setMsg("只显示查询！");
               tj.setFlag(0);
               return tj;
             }
             if ((users.getUserId().equals(flowRunPrcs1.getUserId())) && 
               (Integer.parseInt(flowRunPrcs1.getPrcsFlag()) >= 3)) {
               flowRun = this.wfeFlowRun.find(Integer.valueOf(Integer.parseInt(id)));
               flowRun.setUserName(users.getUserName());
               flowFast.setFlowRun(flowRun);
               flowFast.setFlowRunPrcs(flowRunPrcs1);
               if ("1".equals(flowProcess.getGatherNode())) {
                 Integer gatherNodePriv = reGatherNodePriv(String.valueOf(flowFast.getFlowRun().getRunId()), Integer.valueOf(Integer.parseInt(flowPrcs)), users.getUserId(), Integer.valueOf(flowId));
                 flowFast.setGatherNodePriv(String.valueOf(gatherNodePriv));
               } else {
                 flowFast.setGatherNodePriv(flowProcess.getGatherNode());
               }
               tj.setObject(flowFast);
               tj.setMsg("已转交，不能再进行办理！");
               tj.setFlag(0);
               return tj;
             }
 
           }
 
         }
 
         flowRun = this.wfeFlowRun.find(Integer.valueOf(Integer.parseInt(id)));
 
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
 
         m.put("flowPrcs", flowPrcs);
         List listFloRunPrcs = this.wfeFlowRunPrcs.findByRunId(m);
 
         if ("1".equals(flowProcess.getTopDefault()));
         flowRunPrcs = (FlowRunPrcs)listFloRunPrcs.get(0);
         if (Integer.parseInt(flowRunPrcs.getPrcsFlag()) < 3)
         {
           this.wfeFlowRunPrcs.updateSql(m);
           m.put("prcsFlag", "4");
           m.put("prcsId", Integer.valueOf(prcsId - 1));
           m.remove("prcsTime");
           String parent = flowRunPrcs.getParent();
 
           String aString = parent.substring(parent.indexOf(",") + 1, parent.length());
           m.put("flowPrcs", aString);
           this.wfeFlowRunPrcs.updateSql(m);
         }
       }
       flowFast.setFlowRun(flowRun);
       flowFast.setFlowRunPrcs(flowRunPrcs);
       if ("1".equals(flowProcess.getGatherNode())) {
         Integer gatherNodePriv = reGatherNodePriv(String.valueOf(flowFast.getFlowRun().getRunId()), Integer.valueOf(Integer.parseInt(flowPrcs)), users.getUserId(), Integer.valueOf(flowId));
         flowFast.setGatherNodePriv(String.valueOf(gatherNodePriv));
       } else {
         flowFast.setGatherNodePriv(flowProcess.getGatherNode());
       }
       tj.setObject(flowFast);
       tj.setMsg("OK");
       tj.setFlag(0);
     } catch (Exception e) {
       tj.setMsg(e.getMessage());
       tj.setFlag(1);
     }
     return tj;
   }
 
   public ToJson<FlowFast> nextwork(String flowId, String formdata, String modifydata, String formlength, int runId, String runName, String beginTime, String beginUser, String sqlType, String prcsId, String fromDateReject, String tableNameother, String tabId, String flowPrcs, HttpServletRequest request)
   {
     String workLevel = request.getParameter("workLevel");
     Map mwl = new HashMap();
     mwl.put("runId", Integer.valueOf(runId));
     if (com.myoa.util.common.StringUtils.checkNull(workLevel).booleanValue())
       mwl.put("workLevel", Integer.valueOf(0));
     else {
       mwl.put("workLevel", workLevel);
     }
     this.wfeFlowRun.updateState(mwl);
 
     formdata = formdata.replace("'", "");
     ToJson tj = new ToJson();
 
     Map param = new HashMap();
     JSONArray json = new JSONArray();
 
     String tableName = "flow_data_" + flowId;
 
     List<Map> l = (List<Map>)JSONArray.parseObject(formdata, List.class);
 
     List<Map<String, Object>> lAll = new ArrayList<Map<String, Object>>();
 
     for (int i = 0; i < l.size(); i++) {
       if ((((Map)l.get(i)).size() == 2) && ((String)((Map)l.get(i)).get("key") != "")) {
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
 
     List modify = (List)JSONArray.parseObject(modifydata, List.class);
     List<Map> mAll = new ArrayList();
     for (int i = 0; i < modify.size(); i++) {
       if (((Map)modify.get(i)).size() == 2) {
         mAll.add((Map)modify.get(i));
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
 
         List<String> delkey = new ArrayList();
 
         for (Map map : lAll) {
           if ((!columns.contains((String)map.get("key"))) && 
             (!com.myoa.util.common.StringUtils.checkNull((String)map.get("key")).booleanValue()))
           {
             unusual.add((String)map.get("key"));
           }
 
           Allkey.add((String)map.get("key"));
         }
 
         Iterator it = columns.iterator();
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
           this.workMapper.addcolumn(param);
         }
 
         Map maps = new HashMap();
         maps.put("tableName", tableName);
         maps.put("runId", Integer.valueOf(runId));
 
         Map m = this.workMapper.select(maps);
         key = new ArrayList();
         List value = new ArrayList();
         if ((m == null) || (m.size() == 0)) {
           key.add("RUN_ID");
           value.add(String.valueOf(runId));
           key.add("RUN_NAME");
           value.add(runName);
           key.add("BEGIN_TIME");
           value.add(beginTime);
           key.add("BEGIN_USER");
           value.add(beginUser);
           key.add("FLOW_AUTO_NUM");
           value.add(Integer.valueOf(0));
           key.add("FLOW_AUTO_NUM_YEAR");
           value.add(Integer.valueOf(0));
           key.add("FLOW_AUTO_NUM_MONTH");
           value.add(Integer.valueOf(0));
 
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
           this.workMapper.insert(param);
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
           this.workMapper.update(param);
         }
 
       }
 
       TriggerPlugIn triggerPlugIn = new TriggerPlugIn();
       triggerPlugIn.setFlowId(flowId);
       triggerPlugIn.setFormmat("2");
       triggerPlugIn.setFromId(beginUser);
       triggerPlugIn.setSendTime(DateFormat.getDate(beginTime));
       triggerPlugIn.setSubject(runName);
       String url = request.getScheme() + ":" + request.getServerName() + ":" + request.getServerPort() + "work/workformPreView?flowId=" + Integer.valueOf(flowId) + "&flowStep=" + Integer.valueOf(prcsId) + "&runId=" + runId + "";
 
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
       tj.setFlag(1);
       tj.setMsg("false");
       L.e(new Object[] { "work nextwork:" + e });
     }
     return tj;
   }
 
   public ToJson<FlowRunPrcs> savework(String runId, String runName, String flowId, String prcsId, String prcsFlag, String flowPrcs, String beginTime, String beginUser, String jingbanUser, String viewUser, Users users, String currentPrcsId, String topDefault)
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
 
     this.wfeFlowRunPrcs.updateSql(maps);
     FlowRunPrcs fl = new FlowRunPrcs();
     if (flowPrcs.equals("0"))
     {
       FlowRun flowRun = this.wfeFlowRun.find(Integer.valueOf(runId));
       if ((flowRun != null) && 
         (!com.myoa.util.common.StringUtils.checkNull(viewUser).booleanValue()))
       {
         flowRun.setViewUser(viewUser);
         Map map = new HashMap();
         map.put("runId", runId);
         map.put("viewUser", viewUser);
         this.wfeFlowRun.updateState(map);
       }
 
       Map map = new HashMap();
       map.put("endTime", DateFormat.getStrDate(new Date()));
       map.put("runId", runId);
       this.wfeFlowRun.updateState(map);
       Map updateSatus = new HashMap();
       updateSatus.put("prcsId", prcsId);
       updateSatus.put("runId", runId);
       updateSatus.put("prcsFlag", "4");
       updateSatus.put("userId", users.getUserId());
       this.wfeFlowRunPrcs.updateSql(updateSatus);
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
 
         if (com.myoa.util.common.StringUtils.checkNull(beginUser).booleanValue()) {
           fl.setOpFlag("1");
         }
         else if (beginByUser.equals(jingbanArray[j]))
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
         Map map = new HashMap();
         map.put("prcsId", fl.getPrcsId());
         map.put("runId", Integer.valueOf(Integer.parseInt(runId)));
         map.put("flowPrcs", fl.getFlowPrcs());
         map.put("userId", fl.getUserId());
         List list = this.wfeFlowRunPrcs.selectFind(map);
         if ((list == null) || (list.size() == 0)) {
           this.wfeFlowRunPrcs.save(fl);
         }
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
 
   public FlowFast conditionSetting(int flowId, String flowPrcs)
   {
     FlowFast flowFast = new FlowFast();
 
     FlowTypeModel flowTypeModel = (FlowTypeModel)this.wfeFlowType.selectAllFlow(Integer.valueOf(flowId)).getObject();
 
     FlowFormType flowFormType = this.wfeFormTypeMapper.qureyItemMax(flowTypeModel.getFormId());
     flowFast.setFlowTypeModel(flowTypeModel);
     flowFast.setFlowFormType(flowFormType);
 
     List allFp = this.wfeFlowProcess.findFlowId(flowId);
 
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
 
   private FlowRun getRun(String runName, int flowId, Users users, String beginTime, String viewUser) throws InterruptedException {
     FlowRun flowRun = new FlowRun();
     synchronized (this) {
       int runId = this.wfeFlowRun.getMaxRunId() + 1;
       flowRun = new FlowRun(runId, runName, flowId, users.getUserId(), beginTime, users.getDeptId().intValue(), "0");
       flowRun.setViewUser(viewUser);
       this.wfeFlowRun.save(flowRun);
       flowRun.setUserName(users.getUserName());
     }
     return flowRun;
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
     Integer gatherNodePriv = this.wfeFlowRunPrcs.checkGatherNode(m);
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
     List<FlowProcess> list = this.wfeFlowProcess.findProcseePrcsTo(map1);
     for (FlowProcess flowProcess : list) {
       map.put(flowProcess.getPrcsId(), flowProcess);
       reAll(map, flowId, flowProcess.getPrcsId());
     }
     if (list.size() == 0) {
       return map;
     }
     return map;
   }
 
   public String lexicalParse(String str, FlowTypeModel flowTypeModel, Users users, Department department)
   {
     Calendar now = Calendar.getInstance();
     int autoNum = flowTypeModel.getAutoNum().intValue();
     int autoLength = flowTypeModel.getAutoLen().intValue();
     autoNum++;
     flowTypeModel.setAutoNum(Integer.valueOf(autoNum));
     this.wfeFlowTypeModelMapper.update(flowTypeModel);
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
 
   public String checkViewPriv(int ftViewPriv, int fpViewPriv)
   {
     if ((ftViewPriv == 1) && 
       (fpViewPriv == 1)) {
       return "1";
     }
 
     return "0";
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
       List columns = this.workMapper.showColumns(param);
 
       if (columns.size() == 0) {
         List key = new ArrayList();
         for (Map map : l) {
           key.add((String)map.get("key"));
         }
         Map param1 = new HashMap();
         param1.put("tableName", tableName);
         param1.put("keys", key);
 
         ResourceBundle rb = ResourceBundle.getBundle("jdbc-sql");
         String databaseId = rb.getString("driverClassName");
         if (databaseId.contains("oracle")) {
           this.workMapper.createSequence(param1);
         }
         this.workMapper.createTable(param1);
         columns = this.workMapper.showColumns(param);
       }
       return columns;
     } catch (Exception e) {
       e.printStackTrace();
     }return null;
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
 
   public Map<String, Object> fastAdd(String runId, String flowId)
   {
     Map maps = new HashMap();
     maps.put("tableName", "flow_data_" + flowId);
     maps.put("runId", runId);
     Map m = new HashMap();
     try {
       Map map = this.workMapper.select(maps);
       if ((map != null) && (map.size() != 0)) {
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
       FlowRun flowRun = this.wfeFlowRun.find(Integer.valueOf(Integer.parseInt(runId)));
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
       map.put("attachmentId", flowRun.getAttachmentId() + o[0].toString());
       map.put("attachmentName", flowRun.getAttachmentName() + o[1].toString());
       this.wfeFlowRun.updateAttachment(map);
       json.setObj(list);
       json.setMsg("OK");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       json.setFlag(1);
     }
     return json;
   }
 
   public AjaxJson createGuide(String flowId, Users users, HttpServletRequest request)
   {
     AjaxJson ajaxJson = new AjaxJson();
     String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
     try
     {
       List allFp = this.wfeFlowProcess.findFlowId(Integer.parseInt(flowId));
 
       Department dep = this.departmentService.getDeptById(users.getDeptId().intValue());
       FlowTypeModel flowTypeModel = (FlowTypeModel)this.wfeFlowType.selectAllFlow(Integer.valueOf(Integer.parseInt(flowId))).getObject();
       FlowFormType flowFormType = this.wfeFormTypeMapper.qureyItemMax(flowTypeModel.getFormId());
       String flowName = flowTypeModel.getFlowName();
       String autoName = flowTypeModel.getAutoName();
       String beginTime = DateFormat.getStrDate(new Date());
       String runName = lexicalParse(autoName, flowTypeModel, users, dep);
 
       if (com.myoa.util.common.StringUtils.checkNull(runName.trim()).booleanValue()) {
         runName = flowTypeModel.getFlowName() + " " + DateFormat.getStrDate(new Date());
       }
 
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
 
   public ToJson<Attachment> findworkUpload(String runId, String company)
   {
     ToJson json = new ToJson();
     try
     {
       List attachmentList = new ArrayList();
       FlowRun flowRun = this.wfeFlowRun.find(Integer.valueOf(Integer.parseInt(runId)));
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
       this.flowRunFeedbackMapper.insertSelective(flowRunFeedback);
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
       FlowTypeModel flowTypeModel = this.wfeFlowType.sfTbyrunId(Integer.valueOf(Integer.parseInt(runId)));
       String flowType = flowTypeModel.getFlowType();
       Integer flowId = flowTypeModel.getFlowId();
 
       List<FlowRunFeedback> modelList = selectFlowFeedBackByRunId(runId);
 
       if (flowType.equals("1"))
       {
         List<FlowProcess> allFp = this.wfeFlowProcess.findFlowId(flowId.intValue());
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
 
   public List<FlowRunFeedback> selectFlowFeedBackByRunId(String runId)
   {
     FlowTypeModel flowTypeModel = this.wfeFlowType.sfTbyrunId(Integer.valueOf(Integer.parseInt(runId)));
     String flowType = flowTypeModel.getFlowType();
     Integer flowId = flowTypeModel.getFlowId();
     List list = new ArrayList();
     Map map = new HashMap();
     map.put("runId", Integer.valueOf(Integer.parseInt(runId)));
 
     if (flowType.equals("2"))
       list = this.flowRunFeedbackMapper.selectRunId(map);
     else {
       list = this.flowRunFeedbackMapper.selectFeedBackByRunId(map);
     }
     return list;
   }
 
   public AjaxJson findBranch(String flowId, String runId, String flowPrcs, String currentFlowPrcs, Users users)
   {
     AjaxJson ajaxJson = new AjaxJson();
     Map mAll = new HashMap();
     try {
       String[] fpArray = flowPrcs.split(",");
       for (int j = 0; j < fpArray.length; j++) {
         if (fpArray[j].equals("0"))
           continue;
         List allFp = this.wfeFlowProcess.findFlowId(Integer.parseInt(flowId));
 
         Map map = new HashMap();
         for (int i = 0; i < allFp.size(); i++) {
           FlowProcess flowProcess = (FlowProcess)allFp.get(i);
           map.put(String.valueOf(flowProcess.getPrcsId()), flowProcess);
         }
         FlowProcess flowProcess = (FlowProcess)map.get(fpArray[j]);
 
         FlowFast flowFast = new FlowFast();
         flowFast.setFlowProcesses(flowProcess);
 
         Department dep = this.departmentService.getDeptById(users.getDeptId().intValue());
 
         Map mC = new HashMap();
         mC.put("runId", runId);
         List allFrp = this.wfeFlowRunPrcs.findByRunId(mC);
 
         String uF = flowProcess.getUserFilter();
 
         List<Users> userFilterlist = new ArrayList();
 
         if (flowProcess.getUserFilter().trim() != "") {
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
           autoTypelist = autoTypelist(autoType, dep, users, runId, flowProcess, allFrp);
         }
 
         flowFast.setUserFilter(uF);
         flowFast.setUserFilterlist(userFilterlist);
         flowFast.setAutoType(aT);
         flowFast.setAutoTypelist(autoTypelist);
 
         String prcsUser = flowProcess.getPrcsUser();
 
         String prcsDept = flowProcess.getPrcsDept();
 
         String prcsPriv = flowProcess.getPrcsPriv();
 
         List prcsUserlist = new ArrayList();
 
         List prcsDeptlist = new ArrayList();
 
         List prcsPrivlist = new ArrayList();
 
         List<Users> allUser = new ArrayList();
 
         if (!com.myoa.util.common.StringUtils.checkNull(prcsUser).booleanValue())
         {
           prcsUserlist = this.usersService.getUserByuserId(flowProcess.getPrcsUser());
         }
         if (!com.myoa.util.common.StringUtils.checkNull(prcsDept).booleanValue()) {
           prcsDeptlist = this.usersService.getUserByDeptIds(prcsDept, Integer.valueOf(1));
         }
         if (!com.myoa.util.common.StringUtils.checkNull(prcsPriv).booleanValue()) {
           prcsPrivlist = this.usersService.getUserByDeptIds(prcsPriv, Integer.valueOf(2));
         }
         allUser.addAll(prcsUserlist);
         allUser.addAll(prcsDeptlist);
         allUser.addAll(prcsPrivlist);
 
         Map m = new HashMap();
         for (Users users1 : allUser) {
           m.put(users1.getUid(), users1);
         }
         allUser = new ArrayList(m.values());
 
         if ((userFilterlist != null) && (userFilterlist.size() > 0)) {
           allUser = new ArrayList();
           for (Users u : userFilterlist) {
             if (m.containsKey(u.getUid())) {
               allUser.add(u);
             }
           }
         }
         flowFast.setPrcsUserlist(allUser);
 
         if (currentFlowPrcs.equals(fpArray[j]))
         {
           Iterator it = allUser.iterator();
           while (it.hasNext()) {
             Users u = (Users)it.next();
             if (u.getUid().equals(users.getUid())) {
               it.remove();
             }
           }
         }
         flowFast.setPrcsUserlist(allUser);
 
         if (autoTypelist != null) {
           Users autoUserreturn = (Users)autoTypelist.get(0);
           List a = new ArrayList();
           flowFast.setAutoTypelist(a);
           Iterator it = allUser.iterator();
           while (it.hasNext()) {
             Users u = (Users)it.next();
             if (u.getUid().equals(autoUserreturn.getUid())) {
               flowFast.setAutoTypelist(autoTypelist);
             }
           }
         }
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
       userFilterlist = this.usersService.getUserByDeptIds(flowProcess.getPrcsDept(), Integer.valueOf(1));
       return userFilterlist;
     case 7:
       userFilterlist = this.usersService.getUserByDeptIds(flowProcess.getPrcsPriv(), Integer.valueOf(2));
       return userFilterlist;
     case 8:
       userFilterlist = this.usersService.getUserByDeptIds(users.getDeptIdOther(), Integer.valueOf(1));
       return userFilterlist;
     case 12:
       userFilterlist = this.usersService.getUsersByDeptId(users.getDeptId());
       userFilterlist.addAll(this.usersService.getCUsersByDeptId(users.getDeptId()));
       return userFilterlist;
     case 9:
     case 10:
     case 11: } return userFilterlist;
   }
 
   public List<Users> autoTypelist(Integer autoType, Department dep, Users users, String runId, FlowProcess flowProcess, List<FlowRunPrcs> allfrp)
   {
     List autoTypelist = new ArrayList();
 
     Integer autoBaseUser = flowProcess.getAutoBaseUser();
     Department department;
     switch (autoType.intValue()) {
     case 1:
       FlowRun flowRun = this.wfeFlowRun.find(Integer.valueOf(Integer.parseInt(runId)));
       Users u = this.usersService.findUsersByuserId(flowRun.getBeginUser());
       autoTypelist.add(u);
       return autoTypelist;
     case 2:
       department = null;
       for (FlowRunPrcs flowRunPrcs : allfrp) {
         if (flowRunPrcs.getFlowPrcs().equals(autoBaseUser)) {
           Users users1 = this.usersService.findUsersByuserId(flowRunPrcs.getUserId());
           department = this.departmentService.getDeptById(users1.getDeptId().intValue());
           autoTypelist = this.usersService.getUserByuId(department.getManager());
           return autoTypelist;
         }
       }
 
     case 3:
       autoTypelist = this.usersService.getUserByuId(dep.getManager());
       return autoTypelist;
     case 4:
       for (FlowRunPrcs flowRunPrcs : allfrp) {
         if (flowRunPrcs.getFlowPrcs().equals(autoBaseUser)) {
           Users users1 = this.usersService.findUsersByuserId(flowRunPrcs.getUserId());
           Department d = this.departmentService.getDeptById(users1.getDeptId().intValue());
           Department dparent = this.departmentService.getDeptById(d.getDeptParent().intValue());
           if (dparent != null) {
             autoTypelist = this.usersService.getUserByuId(dparent.getLeader1());
           }
         }
       }
 
       return autoTypelist;
     case 5:
       autoTypelist = this.usersService.getUserByuId(dep.getManager());
       return autoTypelist;
     case 6:
       for (FlowRunPrcs flowRunPrcs : allfrp) {
         if (flowRunPrcs.getFlowPrcs().equals(autoBaseUser)) {
           Users users1 = this.usersService.findUsersByuserId(flowRunPrcs.getUserId());
           Department d = this.departmentService.getDeptById(users1.getDeptId().intValue());
           Department dparent = this.departmentService.getDeptById(d.getDeptParent().intValue());
           if (dparent != null) {
             autoTypelist = this.usersService.getUserByuId(dparent.getLeader2());
           }
         }
       }
 
       return autoTypelist;
     case 7:
       String autoUser = flowProcess.getAutoUser();
       Map map = new HashMap();
       map.put("tableName", "flow_data_" + flowProcess.getFlowId());
       map.put("runId", runId);
       Map maps = this.workMapper.select(map);
       if (maps != null) {
         String userName = (String)maps.get(autoUser);
         Users users1 = this.usersService.getUserByUserName(userName);
         if (users1 != null) {
           autoTypelist.add(users1);
         }
       }
       return autoTypelist;
     case 8:
       String step = flowProcess.getAutoUser();
       for (FlowRunPrcs flowRunPrcs : allfrp) {
         if (step.equals(flowRunPrcs.getFlowPrcs())) {
           String userId = flowRunPrcs.getUserId();
           Users users1 = this.usersService.findUsersByuserId(userId);
           autoTypelist.add(users1);
           return autoTypelist;
         }
       }
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
 
   public ToJson delete(String runId, @RequestParam("AID") String aid, @RequestParam("MODULE") String module, @RequestParam("YM") String ym, @RequestParam("ATTACHMENT_ID") String attachmentId, @RequestParam("ATTACHMENT_NAME") String attachmentName, @RequestParam("COMPANY") String company, HttpServletResponse response, HttpServletRequest request)
   {
     ToJson tj = new ToJson();
     try {
       FlowRun flowRun = this.wfeFlowRun.find(Integer.valueOf(Integer.parseInt(runId)));
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
           this.wfeFlowRun.updateAttachment(map);
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
 
   public ToJson<FlowRunPrcs> getflowprcsdata(String allowBack, String runId, String prcsId, String userId)
   {
     ToJson toJson = new ToJson();
     Map m = new HashMap();
     try {
       switch (Integer.parseInt(allowBack)) {
       case 1:
         m.put("prcsId", Integer.valueOf(Integer.parseInt(prcsId) - 1));
         m.put("runId", runId);
         List<FlowRunPrcs> listFloRunPrcs = this.wfeFlowRunPrcs.findByRunId(m);
         for (FlowRunPrcs flowRunPrcs : listFloRunPrcs) {
           if (flowRunPrcs.getPrcsTime().contains(".")) {
             flowRunPrcs.setPrcsTime(flowRunPrcs.getPrcsTime().substring(0, flowRunPrcs.getPrcsTime().length() - 2));
           }
         }
         toJson.setObj(listFloRunPrcs);
         toJson.setMsg("true");
         toJson.setFlag(0);
         return toJson;
       case 2:
         m.put("prcsId", prcsId);
         m.put("runId", runId);
         m.put("userId", userId);
 
         List list1 = this.wfeFlowRunPrcs.selectFind(m);
         FlowRunPrcs frp = (FlowRunPrcs)list1.get(0);
         List<FlowRunPrcs> list = this.wfeFlowRunPrcs.findlessRunId(m);
         for (FlowRunPrcs flowRunPrcs : list) {
           if (flowRunPrcs.getPrcsTime().contains(".")) {
             flowRunPrcs.setPrcsTime(flowRunPrcs.getPrcsTime().substring(0, flowRunPrcs.getPrcsTime().length() - 2));
           }
         }
         List relist = new ArrayList();
         List reAll = reFrp(list, relist, frp);
 
         Collections.sort(reAll, new Comparator<FlowRunPrcs>()
         {
           public int compare(FlowRunPrcs o1, FlowRunPrcs o2) {
             int i = o1.getPrcsId().intValue() - o2.getPrcsId().intValue();
             if (i == 0) {
               return o1.getFlowPrcs().intValue() - o2.getFlowPrcs().intValue();
             }
             return i;
           }
         });
         toJson.setObj(reAll);
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
 
   public List<FlowRunPrcs> reFrp(List<FlowRunPrcs> list, List<FlowRunPrcs> relist, FlowRunPrcs flowRunPrcs)
   {
     for (FlowRunPrcs frp : list) {
       if (Integer.parseInt(flowRunPrcs.getParent()) == frp.getFlowPrcs().intValue()) {
         relist.add(frp);
         if ("0".equals(frp.getParent())) {
           return relist;
         }
         reFrp(list, relist, frp);
       }
     }
     return relist;
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
       this.wfeFlowRunPrcs.updateSql(maps);
       List thislistFrp = this.wfeFlowRunPrcs.findByRunId(maps);
       maps.put("prcsId", flowPrcs);
       List listFloRunPrcs = this.wfeFlowRunPrcs.findByRunId(maps);
       FlowRunPrcs fp = (FlowRunPrcs)listFloRunPrcs.get(0);
       FlowRun flowRun = this.wfeFlowRun.find(Integer.valueOf(Integer.parseInt(runId)));
 
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
       flowRunPrcs.setParent(String.valueOf(((FlowRunPrcs)thislistFrp.get(0)).getFlowPrcs()));
       this.wfeFlowRunPrcs.save(flowRunPrcs);
       ToJson json = workfeedback(feedback, runId, flowStep, String.valueOf(fp.getFlowPrcs()), users.getUserId());
       HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
 
       this.workService.todoWorkSmsBoby(fp.getUserId(), String.valueOf(fp.getFlowPrcs()), null, runId, flowRun.getRunName(), String.valueOf(flowRun.getFlowId()), flowStep, null, null, null, "", request, "1", users, null, "", "");
 
       String smsUrl = "work/workform?opflag=1&flowId=" + Integer.valueOf(flowRun.getFlowId()) + "&flowStep=" + flowStep + "&runId=" + runId + "&prcsId=" + prcsId;
       this.smsService.updatequerySmsByType("7", users.getUserId(), smsUrl.trim());
 
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
     ToJson toJson = this.wfeFlowRunPrcs.selectEnd(maps, null, null, false);
     List list = toJson.getObj();
     return list;
   }
 
   public List<FlowRunPrcs> getReceivedWorksList(Users users)
   {
     Map maps = new HashMap();
     maps.put("userId", users.getUserId());
     ToJson toJson = this.wfeFlowRunPrcs.selectObject(maps, null, null, false);
     List list = toJson.getObj();
     return list;
   }
 
   public List<FlowRunPrcs> getAllWorksList(Users users)
   {
     Map maps = new HashMap();
     maps.put("userId", users.getUserId());
     ToJson toJson = this.wfeFlowRunPrcs.selectAll(maps, null, null, false);
     List list = toJson.getObj();
     return list;
   }
 
   public static String returnFlag(String prcsFlag)
   {
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
 
   public ToJson<FlowRunPrcs> entrust(String runId, String prcsId, String toId, String flowPrcs, String opFlag, Users users)
   {
     ToJson json = new ToJson();
     try {
       Map map = new HashMap();
       map.put("runId", runId);
       map.put("prcsId", prcsId);
       map.put("prcsFlag", Integer.valueOf(4));
       map.put("opFlag", Integer.valueOf(0));
       this.wfeFlowRunPrcs.updateSql(map);
       FlowRunPrcs flowRunPrcs = new FlowRunPrcs();
       flowRunPrcs.setRunId(Integer.valueOf(Integer.parseInt(runId)));
       flowRunPrcs.setPrcsId(Integer.valueOf(Integer.parseInt(prcsId)));
       flowRunPrcs.setFlowPrcs(Integer.valueOf(Integer.parseInt(flowPrcs)));
       flowRunPrcs.setUserId(toId);
       flowRunPrcs.setPrcsFlag("1");
       flowRunPrcs.setOpFlag("1");
       flowRunPrcs.setOtherUser(users.getUserId() + ",");
       this.wfeFlowRunPrcs.save(flowRunPrcs);
       json.setMsg("true");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("error");
     }
     return json;
   }
 
   public AjaxJson workAttention(Integer runId, String userId, String status)
   {
     AjaxJson ajaxJson = new AjaxJson();
     FlowRun flowRun = this.wfeFlowRun.find(runId);
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
       int a = this.wfeFlowRun.updateState(map);
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
         this.wfeFlowRun.updateState(map);
       } else {
         map.put("runId", runId);
         map.put("delFlag", Integer.valueOf(1));
         this.wfeFlowRun.updateState(map);
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
       this.wfeFlowRunPrcs.updateHandle(maps);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("OK");
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("false");
     }
     return ajaxJson;
   }
 }

