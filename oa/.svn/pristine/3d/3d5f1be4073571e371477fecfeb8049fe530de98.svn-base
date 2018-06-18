 package com.myoa.service.WFE.WFERunner;
 
 import com.myoa.dao.WFE.WFEFlowRunMapper;
import com.myoa.dao.WFE.WFEFlowRunPrcsMapper;
import com.myoa.dao.work.WorkMapper;
import com.myoa.dao.workflow.FlowProcessMapper;
import com.myoa.dao.workflow.FlowTypeModelMapper;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowProcess;
import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.model.workflow.FlowRunPrcsExcted;
import com.myoa.service.WFE.WFE;
import com.myoa.service.WFE.WFEFactory.WFEFlowProcess;
import com.myoa.service.users.UsersService;
import com.myoa.util.AjaxJson;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.page.PageParams;

 import java.io.OutputStream;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.Set;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class WFEFlowRunPrcs extends WFE
 {
 
   @Autowired
   protected WFEFlowRunPrcsMapper wfeFlowRunPrcsMapper;
 
   @Autowired
   protected FlowTypeModelMapper flowTypeModelMapper;
 
   @Autowired
   protected FlowProcessMapper flowProcessMapper;
 
   @Autowired
   protected WFEFlowProcess wfeFlowProcess;
 
   @Autowired
   protected WFEFlowRunMapper wfeFlowRunMapper;
 
   @Autowired
   protected WorkMapper workMapper;
 
   public void save(FlowRunPrcs flowRunPrcs)
   {
     this.wfeFlowRunPrcsMapper.insert(flowRunPrcs);
   }
 
   public List<FlowRunPrcs> findByRunId(Map<String, Object> maps)
   {
     List list = this.wfeFlowRunPrcsMapper.selectfrp(maps);
     return list;
   }
 
   @Transactional
   public void update(FlowRunPrcsExcted flowRunPrcs) {
     this.wfeFlowRunPrcsMapper.updateByPrimaryKeySelective(flowRunPrcs);
   }
 
   @Transactional
   public int updateSql(Map<String, Object> map) {
     int a = this.wfeFlowRunPrcsMapper.updateSome(map);
     return a;
   }
 
   @Transactional
   public int updateHandle(Map<String, Object> map) {
     int a = this.wfeFlowRunPrcsMapper.updateHandle(map);
     return a;
   }
 
   public List<FlowRunPrcs> findlessRunId(Map<String, Object> maps)
   {
     List list = this.wfeFlowRunPrcsMapper.findlessRunId(maps);
     return list;
   }
 
   public List<FlowRunPrcs> selectFind(Map<String, Object> map)
   {
     List flowRunPrcs = this.wfeFlowRunPrcsMapper.selectFind(map);
     return flowRunPrcs;
   }
 
   public ToJson<FlowRunPrcs> selectObject(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     List<FlowRunPrcs> list = this.wfeFlowRunPrcsMapper.selectObjcet(maps);
     List returnList = new ArrayList();
     int len = list.size();
     if (len > 0) {
       toJson.setTotleNum(pageParams.getTotal());
       Date newDate = new Date();
       for (FlowRunPrcs flowRunPrcs : list) {
         flowRunPrcs.getFlowRun().setUserName(this.usersService.getUserNameById(flowRunPrcs.getFlowRun().getBeginUser()));
         flowRunPrcs.setUserName(this.usersService.getUserNameById(flowRunPrcs.getUserId()));
         flowRunPrcs.setFlowType(this.flowTypeModelMapper.queryOneObject(Integer.valueOf(flowRunPrcs.getFlowRun().getFlowId())));
 
         FlowProcess flowProcess = this.flowProcessMapper.findProcess(Integer.valueOf(flowRunPrcs.getFlowRun().getFlowId()), flowRunPrcs.getFlowPrcs());
         if (flowProcess != null) {
           flowRunPrcs.setFlowProcess(flowProcess);
         }
 
         if (DateFormat.getTime(flowRunPrcs.getPrcsTime()).intValue() != -621701856)
         {
           flowRunPrcs.setReceive(DateFormat.getStrTime(DateFormat.getTime(flowRunPrcs.getPrcsTime())));
 
           flowRunPrcs.setHandleTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(newDate)).intValue() - DateFormat.getTime(flowRunPrcs.getPrcsTime()).intValue())));
         }
 
         String createTime = flowRunPrcs.getCreateTime();
 
         if (((DateFormat.getTime(flowRunPrcs.getPrcsTime()).intValue() != -621701856) && (flowRunPrcs.getPrcsId().intValue() > 1)) || ((DateFormat.getTime(flowRunPrcs.getPrcsTime()).intValue() == -621701856) && (flowRunPrcs.getPrcsId().intValue() > 1)))
         {
           Integer runId = flowRunPrcs.getRunId();
           Integer prcsId = Integer.valueOf(flowRunPrcs.getPrcsId().intValue() - 1);
           String userId = (String)maps.get("userId");
           maps.put("prcsId", prcsId);
           maps.put("runId", runId);
           maps.put("flowPrcs", flowRunPrcs.getFlowPrcs());
 
           flowRunPrcs.setReceiptTime(DateFormat.getStrTime(DateFormat.getTime(createTime)));
 
           flowRunPrcs.setArriveTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(newDate)).intValue() - DateFormat.getTime(flowRunPrcs.getReceiptTime()).intValue())));
         } else {
           flowRunPrcs.setReceiptTime(DateFormat.getStrTime(DateFormat.getTime(createTime)));
           flowRunPrcs.setArriveTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(newDate)).intValue() - DateFormat.getTime(createTime).intValue())));
           flowRunPrcs.setReceive("");
           flowRunPrcs.setHandleTime("");
         }
         Map m = new HashMap();
         m.put("runId", flowRunPrcs.getRunId());
         FlowRun flowRun = this.wfeFlowRunMapper.find(m);
         String userName = this.usersService.getUserNameById(flowRun.getBeginUser());
         flowRunPrcs.setUserName(userName);
         returnList.add(flowRunPrcs);
       }
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObj(returnList);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   public ToJson<FlowRunPrcs> selectEnd(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson(1, "error");
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     List<FlowRunPrcs> list = this.wfeFlowRunPrcsMapper.selectEnd(maps);
     List returnList = new ArrayList();
     int len = list.size();
     if (len > 0) {
       toJson.setTotleNum(pageParams.getTotal());
       for (FlowRunPrcs flowRunPrcs : list) {
         Map m = new HashMap();
         m.put("runId", flowRunPrcs.getRunId());
         FlowRun flowRun = this.wfeFlowRunMapper.find(m);
 
         Map map1 = new HashMap();
         map1.put("prcsId", Integer.valueOf(flowRunPrcs.getPrcsId().intValue() + 1));
         map1.put("runId", flowRunPrcs.getRunId());
         List<FlowRunPrcs> nextFlowRunPrcsList = this.wfeFlowRunPrcsMapper.findNextFrp(map1);
 
         List maxFrp = this.wfeFlowRunPrcsMapper.findMaxFrp(flowRunPrcs.getRunId());
 
         if (nextFlowRunPrcsList.size() == 1) {
           FlowRunPrcs flowRunPrcs1 = (FlowRunPrcs)nextFlowRunPrcsList.get(0);
           if (flowRunPrcs1.getPrcsFlag().equals("1"))
             flowRunPrcs.setState1("已转交，下一步未接收");
           else if (flowRunPrcs1.getPrcsFlag().equals("2"))
             flowRunPrcs.setState1("已转交，下一步办理中");
           else if (flowRunPrcs1.getPrcsFlag().equals("3"))
             flowRunPrcs.setState1("已转交，下一步已办结");
           else if (flowRunPrcs1.getPrcsFlag().equals("4"))
             flowRunPrcs.setState1("已办结");
         }
         else {
           List list1 = new ArrayList();
           int one = 0;
           int two = 0;
           int three = 0;
           int four = 0;
           for (FlowRunPrcs flowRunPrcs1 : nextFlowRunPrcsList) {
             if (flowRunPrcs1.getPrcsFlag().equals("1"))
               one++;
             else if (flowRunPrcs1.getPrcsFlag().equals("2"))
               two++;
             else if (flowRunPrcs1.getPrcsFlag().equals("3"))
               three++;
             else if (flowRunPrcs1.getPrcsFlag().equals("4")) {
               four++;
             }
           }
           if (one == nextFlowRunPrcsList.size())
             flowRunPrcs.setState1("已转交，下一步未接收");
           else if (three == nextFlowRunPrcsList.size())
             flowRunPrcs.setState1("已转交，下一步已办结");
           else {
             flowRunPrcs.setState1("已转交，下一步办理中");
           }
         }
         if (maxFrp.size() > 1) {
           flowRunPrcs.setState2("1");
         } else {
           FlowRunPrcs flowRunPrcs3 = (FlowRunPrcs)maxFrp.get(0);
           flowRunPrcs.setState2("0");
 
           Map map = new HashMap();
           map.put("runId", flowRunPrcs3.getRunId());
           map.put("prcsId", flowRunPrcs3.getFlowPrcs());
           String prcsName = "第" + flowRunPrcs3.getPrcsId() + "步:" + this.flowProcessMapper.findPrcsName(map);
           flowRunPrcs.setBz(prcsName);
           flowRunPrcs.setCurrentPeople(this.usersService.getUserNameById(flowRunPrcs3.getUserId()));
         }
 
         if (StringUtils.checkNull(flowRun.getEndTime()).booleanValue()) {
           flowRunPrcs.setState("执行中");
         } else {
           flowRunPrcs.setState("已结束");
           flowRunPrcs.setState1("已办结");
         }
         flowRunPrcs.getFlowRun().setUserName(this.usersService.getUserNameById(flowRunPrcs.getFlowRun().getBeginUser()));
         flowRunPrcs.setUserName(this.usersService.getUserNameById(flowRunPrcs.getUserId()));
         flowRunPrcs.setFlowType(this.flowTypeModelMapper.queryOneObject(Integer.valueOf(flowRunPrcs.getFlowRun().getFlowId())));
 
         FlowProcess flowProcess = this.flowProcessMapper.findProcess(Integer.valueOf(flowRunPrcs.getFlowRun().getFlowId()), flowRunPrcs.getFlowPrcs());
         if (flowProcess != null) {
           flowRunPrcs.setFlowProcess(flowProcess);
         }
         if (!StringUtils.checkNull(flowRunPrcs.getDeliverTime()).booleanValue()) {
           flowRunPrcs.setDeliverTime(DateFormat.getStrTime(DateFormat.getTime(flowRunPrcs.getDeliverTime())));
         }
         returnList.add(flowRunPrcs);
 
         flowRunPrcs.setArriveTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(new Date())).intValue() - DateFormat.getTime(flowRunPrcs.getCreateTime()).intValue())));
 
         flowRunPrcs.setHandleTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(new Date())).intValue() - DateFormat.getTime(flowRunPrcs.getPrcsTime()).intValue())));
         flowRunPrcs.setCreateTime(flowRunPrcs.getCreateTime().substring(0, flowRunPrcs.getCreateTime().length() - 2));
         flowRunPrcs.setPrcsTime(flowRunPrcs.getPrcsTime().substring(0, flowRunPrcs.getPrcsTime().length() - 2));
         flowRunPrcs.setJbbz("第" + flowRunPrcs.getPrcsId() + "步:" + flowRunPrcs.getFlowProcess().getPrcsName());
       }
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObj(returnList);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   public ToJson<FlowRunPrcs> selectAll(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson(1, "error");
     PageParams pages = new PageParams();
     pages.setPage(page);
     pages.setPageSize(pageSize);
     pages.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pages);
     List<FlowRunPrcs> list = this.wfeFlowRunPrcsMapper.selectAll(maps);
     List returnList = new ArrayList();
     int len = list.size();
     if (len > 0) {
       toJson.setTotleNum(pages.getTotal());
       for (FlowRunPrcs flowRunPrcs : list) {
         Map map = new HashMap();
         map.put("runId", flowRunPrcs.getRunId());
         FlowRun flowRun = this.wfeFlowRunMapper.find(map);
         if (StringUtils.checkNull(flowRun.getEndTime()).booleanValue())
           flowRunPrcs.setState("执行中");
         else {
           flowRunPrcs.setState("已结束");
         }
         flowRunPrcs.getFlowRun().setUserName(this.usersService.getUserNameById(flowRunPrcs.getFlowRun().getBeginUser()));
         flowRunPrcs.setUserName(this.usersService.getUserNameById(flowRunPrcs.getUserId()));
         flowRunPrcs.setFlowType(this.flowTypeModelMapper.queryOneObject(Integer.valueOf(flowRunPrcs.getFlowRun().getFlowId())));
         FlowProcess flowProcess = this.flowProcessMapper.findProcess(Integer.valueOf(flowRunPrcs.getFlowRun().getFlowId()), flowRunPrcs.getFlowPrcs());
         if (flowProcess != null) {
           flowRunPrcs.setFlowProcess(flowProcess);
         }
         returnList.add(flowRunPrcs);
         flowRunPrcs.setJbbz("第" + flowRunPrcs.getPrcsId() + "步:" + flowRunPrcs.getFlowProcess().getPrcsName());
       }
 
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObj(returnList);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   public ToJson<FlowRunPrcs> selectHang(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     List<FlowRunPrcs> list = this.wfeFlowRunPrcsMapper.selectHang(maps);
     List returnList = new ArrayList();
     int len = list.size();
     if (len > 0) {
       toJson.setTotleNum(pageParams.getTotal());
       for (FlowRunPrcs flowRunPrcs : list) {
         flowRunPrcs.setUserName(this.usersService.getUserNameById(flowRunPrcs.getUserId()));
         flowRunPrcs.setFlowType(this.flowTypeModelMapper.queryOneObject(Integer.valueOf(flowRunPrcs.getFlowRun().getFlowId())));
         returnList.add(flowRunPrcs);
       }
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObj(returnList);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   public Integer checkGatherNode(Map<String, Object> maps)
   {
     return this.wfeFlowRunPrcsMapper.checkGatherNode(maps);
   }
 
   public AjaxJson monitoring(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String output, HttpServletRequest request, HttpServletResponse response)
   {
     AjaxJson ajaxJson = new AjaxJson();
     PageParams pages = new PageParams();
     if (!"1".equals(output)) {
       pages.setPage(page);
       pages.setPageSize(pageSize);
       pages.setUseFlag(Boolean.valueOf(useFlag));
       maps.put("page", pages);
     }
     try
     {
       List<FlowRunPrcs> list = this.wfeFlowRunPrcsMapper.monitoring(maps);
       for (FlowRunPrcs flowRunPrcs : list) {
         String time = reTime(flowRunPrcs.getPrcsTime());
         flowRunPrcs.setHandleTime(time);
         String step1 = "第" + flowRunPrcs.getPrcsId() + "步" + ":" + flowRunPrcs.getPrcsName();
         flowRunPrcs.setPrcsName(step1);
         if ((!StringUtils.checkNull(flowRunPrcs.getOpFlag()).booleanValue()) && (flowRunPrcs.getOpFlag().equals("1")))
           flowRunPrcs.setUserName("主办：" + flowRunPrcs.getUserName());
         else {
           flowRunPrcs.setUserName("经办：" + flowRunPrcs.getUserName());
         }
         Date date = new Date();
         if (Integer.parseInt(flowRunPrcs.getPrcsFlag()) <= 2)
         {
           if (DateFormat.getTime(flowRunPrcs.getPrcsTime()).intValue() == -621701856) {
             flowRunPrcs.setHandleTime("未接收");
             flowRunPrcs.setPrcsTime("");
           } else {
             flowRunPrcs.setHandleTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(date)).intValue() - DateFormat.getTime(flowRunPrcs.getPrcsTime()).intValue())));
           }
         }
         else {
           flowRunPrcs.setHandleTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(flowRunPrcs.getDeliverTime()).intValue() - DateFormat.getTime(flowRunPrcs.getPrcsTime()).intValue())));
         }
         flowRunPrcs.setBz(flowRunPrcs.getPrcsTime() + flowRunPrcs.getHandleTime());
 
         Map map = new HashMap();
         map.put("flowId", flowRunPrcs.getFlowId());
         map.put("prcsId", flowRunPrcs.getFlowPrcs());
         FlowProcess flowProcess = this.flowProcessMapper.findbyprcsId(map);
         if (flowProcess != null) {
           flowRunPrcs.setAllowBack(flowProcess.getAllowBack());
         }
         List<FlowRunPrcs> stepList = this.wfeFlowRunPrcsMapper.selByRunId(flowRunPrcs.getRunId());
 
         for (FlowRunPrcs flowStep : stepList) {
           String createTime = reTime(flowStep.getPrcsTime());
           flowStep.setHandleTime(createTime);
           String step = "第" + flowStep.getPrcsId() + "步" + ":" + flowStep.getPrcsName();
           flowStep.setPrcsName(step);
           if ((!StringUtils.checkNull(flowStep.getOpFlag()).booleanValue()) && (flowStep.getOpFlag().equals("1")))
             flowStep.setUserName("主办：" + flowStep.getUserName());
           else {
             flowStep.setUserName("经办：" + flowStep.getUserName());
           }
           Date newDate = new Date();
           if (Integer.parseInt(flowStep.getPrcsFlag()) <= 2)
           {
             if (DateFormat.getTime(flowStep.getPrcsTime()).intValue() == -621701856) {
               flowStep.setHandleTime("未接收");
               flowStep.setPrcsTime("");
             } else {
               flowStep.setHandleTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(DateFormat.getStrDate(newDate)).intValue() - DateFormat.getTime(flowStep.getPrcsTime()).intValue())));
             }
           }
           else
           {
             flowStep.setHandleTime(DateFormat.returnTime(Integer.valueOf(DateFormat.getTime(flowStep.getDeliverTime()).intValue() - DateFormat.getTime(flowStep.getPrcsTime()).intValue())));
           }
 
           Map map1 = new HashMap();
           map.put("flowId", flowStep.getFlowId());
           map.put("prcsId", flowStep.getFlowPrcs());
           FlowProcess flowProcess1 = this.flowProcessMapper.findbyprcsId(map);
           if (flowProcess1 != null) {
             flowStep.setAllowBack(flowProcess1.getAllowBack());
           }
         }
         flowRunPrcs.setFlowStep(stepList);
       }
       if ("1".equals(output)) {
         HSSFWorkbook tableWork = ExcelUtil.makeExcelHead("工作监控", 15);
         String[] secondTitles = { "流水号", "流程类型", "工作名称/文号", "当前步骤", "当前办理人", "办理时间" };
         HSSFWorkbook excelWork = ExcelUtil.makeSecondHead(tableWork, secondTitles);
         String[] beanProperty = { "runId", "flowName", "runName", "prcsName", "userName", "bz" };
         HSSFWorkbook workbook = ExcelUtil.exportExcelData(excelWork, list, beanProperty);
         response.setContentType("text/html;charset=UTF-8");
         OutputStream out = response.getOutputStream();
 
         String filename = "工作监控.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
 
         response.setContentType("application/vnd.ms-excel");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
 
         workbook.write(out);
         out.flush();
         out.close();
       }
       ajaxJson.setTotleNum(pages.getTotal());
       ajaxJson.setMsg("OK");
       ajaxJson.setFlag(true);
       ajaxJson.setObj(list);
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   @Transactional
   public ToJson<FlowRunPrcs> deleteRunPrcs(FlowRunPrcs flowRunPrcs)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       Integer flag = this.wfeFlowRunPrcsMapper.selectPrcs(flowRunPrcs.getId());
       if (flag.intValue() == 1) {
         Map map = new HashMap();
         flowRunPrcs = this.wfeFlowRunPrcsMapper.selectByPrimaryKey(flowRunPrcs.getId());
         map.put("runId", flowRunPrcs.getRunId());
         FlowRun flowRun = this.wfeFlowRunMapper.find(map);
         this.wfeFlowRunPrcsMapper.deleteWork(flowRunPrcs);
         this.wfeFlowRunMapper.deleteByRunId(flowRunPrcs.getRunId());
         map.put("tableName", "flow_data_" + flowRun.getFlowId());
         this.workMapper.deWork(map);
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
       else {
         toJson.setMsg("repetition");
       }
     } catch (Exception e) {
       L.e(new Object[] { "FlowRunPrcsService deleteRunPrcs:" + e });
     }
     return toJson;
   }
 
   @Transactional
   public int updateEnd(Map<String, Object> map)
   {
     int a = this.wfeFlowRunPrcsMapper.updateEnd(map);
     a += this.wfeFlowRunMapper.updateState(map);
     return a;
   }
 
   public AjaxJson workBack(Integer prcsId, Integer flowPrcs, String runId, String userId)
   {
     AjaxJson ajaxJson = new AjaxJson();
     Map map = new HashMap();
     map.put("prcsId", prcsId);
     map.put("flowPrcs", flowPrcs);
     map.put("runId", runId);
     map.put("prcsFlag", Integer.valueOf(3));
     map.put("opFlag", Integer.valueOf(1));
     try
     {
       List flowRunPrcs = this.wfeFlowRunPrcsMapper.selectFind(map);
       if ((flowRunPrcs != null) && (flowRunPrcs.size() > 0)) {
         map.put("prcsId", Integer.valueOf(prcsId.intValue() + 1));
         map.put("flowPrcs", null);
         map.put("runId", runId);
         map.put("prcsFlag", null);
         map.put("opFlag", null);
 
         this.wfeFlowRunPrcsMapper.deleteBycondition(map);
 
         map.put("prcsId", prcsId);
         map.put("flowPrcs", flowPrcs);
         map.put("runId", runId);
         map.put("prcsFlag", Integer.valueOf(2));
         map.put("opFlag", null);
         map.put("deliverTime", "0000-00-00 00:00:00");
         this.wfeFlowRunPrcsMapper.updateSome(map);
       }
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("OK");
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("false");
     }
     return ajaxJson;
   }
 
   public AjaxJson remindSteps(Integer prcsId, String runId)
   {
     AjaxJson ajaxJson = new AjaxJson();
     Map map = new HashMap();
     map.put("prcsId", prcsId);
     map.put("runId", runId);
     map.put("opFlag", null);
     try
     {
       List<FlowRunPrcs> list = this.wfeFlowRunPrcsMapper.selectStep(map);
 
       Map mapList = new HashMap();
       List flowRunPrcsList = null;
       for (FlowRunPrcs flowRunPrcs : list) {
         String prcsName = "第" + flowRunPrcs.getPrcsId() + "步:" + this.flowProcessMapper.findPrcsName(map);
         Users users = this.usersService.findUsersByuserId(flowRunPrcs.getUserId());
         flowRunPrcs.setPrcsName(prcsName);
         flowRunPrcs.setUsers(users);
         if (map.keySet().contains(flowRunPrcs.getPrcsId())) {
           flowRunPrcsList = (List)mapList.get(flowRunPrcs.getPrcsId());
           flowRunPrcsList.add(flowRunPrcs);
         } else {
           flowRunPrcsList = new ArrayList();
           flowRunPrcsList.add(flowRunPrcs);
           mapList.put(flowRunPrcs.getPrcsId(), flowRunPrcsList);
         }
       }
 
       ajaxJson.setObj(mapList);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("OK");
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("false");
     }
     return ajaxJson;
   }
 
   public AjaxJson entrustWork(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     AjaxJson ajaxJson = new AjaxJson();
     PageParams pages = new PageParams();
     pages.setPage(page);
     pages.setPageSize(pageSize);
     pages.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pages);
     List<FlowRunPrcs> list = this.wfeFlowRunPrcsMapper.entrustWork(maps);
     int len = list.size();
     if (len > 0) {
       ajaxJson.setTotleNum(pages.getTotal());
       for (FlowRunPrcs flowRunPrcs : list) {
         flowRunPrcs.setUserName(this.usersService.getUserNameById(flowRunPrcs.getUserId()));
         flowRunPrcs.setFlowType(this.flowTypeModelMapper.queryOneObject(Integer.valueOf(flowRunPrcs.getFlowRun().getFlowId())));
         FlowProcess flowProcess = this.flowProcessMapper.findProcess(Integer.valueOf(flowRunPrcs.getFlowRun().getFlowId()), flowRunPrcs.getFlowPrcs());
         if (flowProcess != null) {
           flowRunPrcs.setFlowProcess(flowProcess);
         }
       }
     }
 
     return null;
   }
 
   public static String reTime(String prcsTime)
     throws Exception
   {
     String format = "yyyy-MM-dd HH:mm:ss";
     long aString = System.currentTimeMillis() / 1000L;
     Integer time = Integer.valueOf(Integer.parseInt(String.valueOf(aString)));
 
     SimpleDateFormat sdf = new SimpleDateFormat(format);
     Long aa = Long.valueOf(sdf.parse(prcsTime).getTime() / 1000L);
 
     Integer end = Integer.valueOf(Integer.parseInt(String.valueOf(aa)));
     Integer re = Integer.valueOf(time.intValue() - end.intValue());
     String aString3 = DateFormat.returnTime(re);
     return aString3;
   }
 }

