 package com.myoa.service.document;
 
 import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myoa.dao.document.DocumentStatisticsMapper;
import com.myoa.dao.workflow.FlowRunMapper;
import com.myoa.dao.workflow.FlowRunPrcsMapper;
import com.myoa.dao.workflow.FlowSortMapper;
import com.myoa.dao.workflow.FlowTypeModelMapper;
import com.myoa.model.document.DocumentDispatchStatistics;
import com.myoa.model.document.DocumentShowModle;
import com.myoa.model.document.DocumentStatusStatistics;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowDetailInfo;
import com.myoa.model.workflow.FlowSort;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.service.workflow.JobClassifyService;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;
 
 @Service
 public class DocumenSortFlowSerivce
 {
 
   @Resource
   private FlowTypeModelMapper flowTypeModelMapper;
 
   @Autowired
   JobClassifyService classifyService;
 
   @Autowired
   DocumentStatisticsMapper documentStatisticsMapper;
 
   @Autowired
   FlowSortMapper flowSortMapper;
 
   @Autowired
   FlowRunMapper flowRunMapper;
 
   @Autowired
   FlowRunPrcsMapper flowRunPrcsMapper;
   private final int STA_DIS = 0;
   private final int STA_STATUS = 2;
 
   public BaseWrappers<DocumentShowModle> sortFlow(HttpServletRequest request, String codeMainId, String codeDetailId)
   {
     BaseWrappers<DocumentShowModle> toJson = new BaseWrappers<DocumentShowModle>();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if (user.getUid() == null) {
       toJson.setFlag(false);
       toJson.setMsg("无法获取用户信息");
       return toJson;
     }
     if (codeMainId == null) {
       toJson.setFlag(false);
       toJson.setMsg("未知的公文类型");
       return toJson;
     }
     if (codeDetailId == null) {
       toJson.setFlag(false);
       toJson.setMsg("未知的发文类型");
       return toJson;
     }
     Map<String,Object> param = new HashMap<String,Object>();
     String privOther = user.getUserPrivOther() == null ? "" : user.getUserPrivOther();
     String[] privIds = privOther.split(",");
     String deptOther = user.getDeptIdOther() == null ? "" : user.getDeptIdOther();
     String[] deptIds = deptOther.split(",");
     param.put("user", user.getUserId() == null ? "" : user.getUserId());
     param.put("deptId", user.getDeptId() == null ? "" : user.getDeptId());
     param.put("privId", user.getUserPriv() == null ? "" : user.getUserPriv());
     if ((privIds != null) && (privIds.length > 0)) {
       param.put("privIds", privIds);
     }
     if ((deptIds != null) && (deptIds.length > 0)) {
       param.put("deptIds", deptIds);
     }
     param.put("mainType", codeMainId);
     param.put("detailType", codeDetailId);
     List<FlowSort> sorts = this.flowSortMapper.documentFlowSortByAuth(param);
     StringBuffer sirtIdsTr = new StringBuffer();
     int i = 0;
     for (FlowSort sort : sorts) {
       sirtIdsTr.append(sort.getSortId());
       if (i != sorts.size()) {
         sirtIdsTr.append(",");
       }
       i++;
     }
     param.put("sortId", sirtIdsTr.toString());
     List<FlowTypeModel> flowTypeModels = this.flowTypeModelMapper.selectFlowAuthOrSearchByCodeId(param);
     List<DocumentShowModle>  datas = factorDats(sorts, flowTypeModels);
     if ((datas != null) && (datas.size() > 0)) {
       toJson.setFlag(true);
       toJson.setMsg("成功");
       toJson.setDatas(datas);
     } else {
       toJson.setFlag(true);
       toJson.setMsg("失败");
     }
     return toJson;
   }
 
   private List<DocumentShowModle> factorDats(List<FlowSort> sorts, List<FlowTypeModel> flowTypeModels)
   {
     List<DocumentShowModle> datas = new ArrayList<DocumentShowModle>();
     for (FlowSort sort : sorts) {
       DocumentShowModle showModle = new DocumentShowModle();
       showModle.setSortName(sort.getSortName());
       showModle.setSortId(sort.getSortId());
       showModle.setSortDetailId(sort.getSortDetailType());
       showModle.setSortMainId(sort.getSortMainType());
       List<FlowTypeModel> newDatas = new ArrayList<FlowTypeModel>();
       for (FlowTypeModel flowTypeModel : flowTypeModels) {
         if (flowTypeModel.getFlowSort() == sort.getSortId()) {
           newDatas.add(flowTypeModel);
         }
       }
       showModle.setFlows(newDatas);
       datas.add(showModle);
     }
     return datas;
   }
 
   @Deprecated
   public BaseWrapper cancelDocument(HttpServletRequest request, Integer runId)
   {
     BaseWrapper wrapper = new BaseWrapper();
     wrapper.setStatus(true);
     if (runId == null) {
       wrapper.setFlag(false);
       wrapper.setMsg("清除数据失败");
       return wrapper;
     }
     String userId = ((Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users())).getUserId();
     Map<String,Object> param = new HashMap<String,Object>();
     param.put("userId", userId);
     param.put("runId", runId);
 
     int a = this.flowRunMapper.cancelRun(param);
     int b = this.flowRunPrcsMapper.cancelRunPrcs(param);
 
     if (a > 0) {
       wrapper.setFlag(true);
       wrapper.setMsg("成功");
       return wrapper;
     }
 
     wrapper.setFlag(false);
     wrapper.setMsg("清除数据失败");
     return wrapper;
   }
 
   public BaseWrappers getStatistics(HttpServletRequest request, Integer staType, String startTime, String endTime)
   {
     BaseWrappers wrapper = new BaseWrappers();
     Map<String,Object> param = new HashMap<String,Object>();
     param.put("startTime", startTime);
     param.put("endTime", endTime);
     switch (staType.intValue())
     {
     case 0:
       wrapper.setDatas(getDispatchData(param));
       break;
     case 2:
       wrapper.setDatas(getStatusData(param));
     }
 
     wrapper.setMsg("ok");
     wrapper.setFlag(true);
 
     return wrapper;
   }
 
   public List<DocumentDispatchStatistics> getDispatchData(Map<String, Object> param)
   {
     List<DocumentDispatchStatistics>  dispatchData = this.documentStatisticsMapper.getDispatchStatistics(param);
     return dispatchData;
   }
 
   public List<DocumentStatusStatistics> getStatusData(Map<String, Object> param)
   {
     List<DocumentStatusStatistics>  dispatchData = this.documentStatisticsMapper.getStatusStatistics(param);
     return dispatchData;
   }
 
   public BaseWrappers<FlowDetailInfo> getDocumentFlowType() {
     BaseWrappers<FlowDetailInfo> wrappers = new BaseWrappers<FlowDetailInfo>();
     wrappers.setStatus(true);
     List<FlowDetailInfo>  datas = this.flowTypeModelMapper.selectDocumentFloeType();
     wrappers.setDatas(datas);
     wrappers.setFlag(true);
     return wrappers;
   }
 }

