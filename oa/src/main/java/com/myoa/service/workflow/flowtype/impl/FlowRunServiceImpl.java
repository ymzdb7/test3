 package com.myoa.service.workflow.flowtype.impl;
 
 import com.myoa.dao.workflow.FlowPrivMapper;
import com.myoa.dao.workflow.FlowRunMapper;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowRunModelPrcs;
import com.myoa.model.workflow.FlowRunModelPrcsCount;
import com.myoa.service.workflow.flowtype.FlowRunService;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelUtil;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.page.PageParams;

 import java.io.OutputStream;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class FlowRunServiceImpl
   implements FlowRunService
 {
 
   @Resource
   private FlowRunMapper flowRunMapper;
 
   @Resource
   private FlowPrivMapper flowPrivMapper;
 
   public int getMaxRunId()
   {
     String runId = this.flowRunMapper.getMaxRunId();
     if (StringUtils.checkNull(runId).booleanValue()) {
       return 0;
     }
     return Integer.parseInt(runId);
   }
 
   public void save(FlowRun flowRun)
   {
     this.flowRunMapper.insert(flowRun);
   }
 
   public FlowRun find(Integer runId)
   {
     FlowRun f = this.flowRunMapper.find(runId);
     if (!StringUtils.checkNull(f.getBeginTime()).booleanValue()) {
       f.setBeginTime(DateFormat.getStrTime(DateFormat.getTime(f.getBeginTime())));
     }
     return f;
   }
 
   public int update(FlowRun flowRun)
   {
     int a = this.flowRunMapper.updateByPrimaryKey(flowRun);
     return a;
   }
 
   @Transactional
   public int updateTime(Map<String, Object> map) {
     int a = this.flowRunMapper.updateTime(map);
     return a;
   }
 
   @Transactional
   public int updateAttachment(Map<String, Object> map) {
     int a = this.flowRunMapper.updateAttachment(map);
     return a;
   }
 
   public BaseWrappers queryFlowRun(Integer state, Integer runId, Integer flowId, String runName, String beginDate, String endDate, String workLevel, String status, String userId, Integer page, Integer pageSize, boolean useFlag, Users users, String output, HttpServletResponse response, HttpServletRequest request)
   {
     BaseWrappers baseWrapper = new BaseWrappers();
     Map map = new HashMap();
     PageParams pageParams = new PageParams();
     if (!"1".equals(output)) {
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       map.put("pageParams", pageParams);
     }
     map.put("runId", runId);
     map.put("flowId", flowId);
     map.put("runName", runName);
     map.put("beginDate", beginDate);
     map.put("endDate", endDate);
     map.put("workLevel", workLevel);
     map.put("state", state);
     map.put("status", status);
     if ((!StringUtils.checkNull(userId).booleanValue()) && (userId.indexOf(",") > 0)) {
       userId = userId.substring(0, userId.length() - 1);
     }
     map.put("userId", userId);
     map.put("currentUserId", users.getUserId());
     map.put("currentUid", users.getUid());
     List<FlowRunModelPrcs> flowRuns = new ArrayList();
     try {
       flowRuns = this.flowRunMapper.queryFlowRunBycy(map);
       Map paramMap = new HashMap();
       for (FlowRunModelPrcs flowRunModelPrcs : flowRuns) {
         paramMap.put("flowId", Integer.valueOf(flowRunModelPrcs.getFlowId()));
         paramMap.put("userId", users.getUid());
         paramMap.put("deptId", users.getDeptId());
         paramMap.put("roleId", users.getUserPriv());
         List typeList = this.flowPrivMapper.selPrivByUser(paramMap);
         if (typeList.size() == 5) {
           flowRunModelPrcs.setAll("1");
         }
         if (typeList.contains(Integer.valueOf(1))) {
           flowRunModelPrcs.setManage("1");
         }
         if (typeList.contains(Integer.valueOf(2))) {
           flowRunModelPrcs.setMonitor("1");
         }
         if (typeList.contains(Integer.valueOf(3))) {
           flowRunModelPrcs.setQuery("1");
         }
         if (typeList.contains(Integer.valueOf(4))) {
           flowRunModelPrcs.setEdit("1");
         }
         if (typeList.contains(Integer.valueOf(5))) {
           flowRunModelPrcs.setComment("1");
         }
         if (!StringUtils.checkNull(flowRunModelPrcs.getEndTime()).booleanValue())
           flowRunModelPrcs.setStatus("已结束");
         else {
           flowRunModelPrcs.setStatus("执行中");
         }
       }
       if ("1".equals(output)) {
         HSSFWorkbook tableWork = ExcelUtil.makeExcelHead("工作流工作查询", 15);
         String[] secondTitles = { "流水号", "流程类型", "工作名称/文号", "流程发起人", "开始时间", "公共附件", "状态" };
         HSSFWorkbook excelWork = ExcelUtil.makeSecondHead(tableWork, secondTitles);
         String[] beanProperty = { "runId", "flowName", "runName", "userName", "beginTime", "attachmentName", "status" };
         HSSFWorkbook workbook = ExcelUtil.exportExcelData(excelWork, flowRuns, beanProperty);
         response.setContentType("text/html;charset=UTF-8");
         OutputStream out = response.getOutputStream();
 
         String filename = "工作流工作查询.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
 
         response.setContentType("application/vnd.ms-excel");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
 
         workbook.write(out);
         out.flush();
         out.close();
       }
 
       baseWrapper.setFlag(true);
       baseWrapper.setStatus(true);
       baseWrapper.setDatas(flowRuns);
       baseWrapper.setTotal(pageParams.getTotal());
     } catch (Exception e) {
       e.printStackTrace();
       baseWrapper.setFlag(false);
       baseWrapper.setStatus(false);
       baseWrapper.setMsg(e.getMessage());
     }
     return baseWrapper;
   }
 
   public int updateFocusUser(Map<String, Object> map)
   {
     int a = this.flowRunMapper.updateFocusUser(map);
     return a;
   }
 
   public int updateEnd(Map<String, Object> map) {
     int a = this.flowRunMapper.updateEnd(map);
     return a;
   }
 
   public BaseWrappers queryFlowRunCount(HttpServletRequest request)
   {
     BaseWrappers baseWrapper = new BaseWrappers();
     Map map = new HashMap();
     List flowRunModelPrcsCounts = new ArrayList();
     FlowRunModelPrcsCount queryFlowRunPerformCount = this.flowRunMapper.queryFlowRunPerformCount(map);
     FlowRunModelPrcsCount queryFlowRunEndCount = this.flowRunMapper.queryFlowRunEndCount(map);
     FlowRunModelPrcsCount queryFlowRunArchiveCount = this.flowRunMapper.queryFlowRunArchiveCount(map);
     flowRunModelPrcsCounts.add(queryFlowRunPerformCount);
     flowRunModelPrcsCounts.add(queryFlowRunEndCount);
     flowRunModelPrcsCounts.add(queryFlowRunArchiveCount);
     baseWrapper.setFlag(true);
     baseWrapper.setStatus(true);
     baseWrapper.setDatas(flowRunModelPrcsCounts);
     return baseWrapper;
   }
 }

