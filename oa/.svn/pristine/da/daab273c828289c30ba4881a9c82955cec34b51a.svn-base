 package com.myoa.service.workflow.flowtigger.impl;
 
 import com.myoa.dao.attend.AttendLeaveMapper;
import com.myoa.dao.workflow.FlowProcessMapper;
import com.myoa.dao.workflow.FlowTiggerMapper;
import com.myoa.model.attend.AttendLeave;
import com.myoa.model.workflow.FlowTiggerModel;
import com.myoa.service.workflow.flowtigger.FlowTiggerService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;

 import java.util.ArrayList;
 import java.util.List;
 import javax.annotation.Resource;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class FlowTiggerServiceImpl
   implements FlowTiggerService
 {
 
   @Resource
   private FlowTiggerMapper flowTiggerMapper;
 
   @Resource
   private FlowProcessMapper processMapper;
 
   @Autowired
   private AttendLeaveMapper attendLeaveMapper;
   private static final String attend_leave_tableName = "attend_leave";
   private static final String attend_evection_tableName = "attend_evection";
 
   @Transactional
   public ToJson<FlowTiggerModel> saveTigger(FlowTiggerModel flowTiggerModel)
   {
     ToJson toJson = new ToJson();
     List returnList = new ArrayList();
     try {
       if (flowTiggerModel.getIsGlobal().intValue() == 0) {
         this.flowTiggerMapper.save(flowTiggerModel);
         toJson.setObject(flowTiggerModel);
       }
       else {
         List list = this.processMapper.selectShowPrcsId(flowTiggerModel.getFlowId());
         int i = 0; for (int len = list.size(); i < len; i++) {
           flowTiggerModel.setFlowPrcs((Integer)list.get(i));
           this.flowTiggerMapper.save(flowTiggerModel);
           returnList.add(flowTiggerModel);
         }
         toJson.setObj(returnList);
       }
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       L.e(new Object[] { "FlowTiggerModel_SaveError:" + e });
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<FlowTiggerModel> updateTigger(FlowTiggerModel flowTiggerModel)
   {
     ToJson toJson = new ToJson();
     try
     {
       List list = this.flowTiggerMapper.selectTiggerId(flowTiggerModel.getFlowId());
 
       int listLength = list.size();
 
       if (flowTiggerModel.getIsGlobal().intValue() == 0)
       {
         if (listLength == 1) {
           this.flowTiggerMapper.update(flowTiggerModel);
         }
         else {
           List listProcess = this.processMapper.selectShowPrcsId(flowTiggerModel.getFlowId());
           int i = 0; for (int len = listProcess.size(); i < len; i++) {
             if (listProcess.get(i) != flowTiggerModel.getFlowPrcs())
             {
               this.flowTiggerMapper.deleteTigger(((FlowTiggerModel)list.get(i)).getId());
             }
             else {
               this.flowTiggerMapper.update(flowTiggerModel);
             }
           }
 
         }
 
       }
       else if (listLength == 1)
       {
         int flowPrcsId = flowTiggerModel.getId().intValue();
 
         int flowPrcs = flowTiggerModel.getFlowPrcs().intValue();
 
         List listProcess = this.processMapper.selectShowPrcsId(flowTiggerModel.getFlowId());
 
         int i = 0; for (int len = listProcess.size(); i < len; i++) {
           int flowProcessId = ((Integer)listProcess.get(i)).intValue();
           if (flowProcessId != flowPrcs) {
             flowTiggerModel.setFlowPrcs(Integer.valueOf(flowProcessId));
             this.flowTiggerMapper.save(flowTiggerModel);
           } else {
             flowTiggerModel.setId(Integer.valueOf(flowPrcsId));
             flowTiggerModel.setFlowPrcs(Integer.valueOf(flowPrcs));
             this.flowTiggerMapper.update(flowTiggerModel);
           }
         }
       }
       else
       {
         for (int i = 0; i < listLength; i++)
         {
           int flowPrcsId = ((FlowTiggerModel)list.get(i)).getId().intValue();
 
           int flowPrcs = ((FlowTiggerModel)list.get(i)).getFlowPrcs().intValue();
 
           List listProcess = this.processMapper.selectShowPrcsId(flowTiggerModel.getFlowId());
           int len = listProcess.size();
           for (int j = 0; j < len; j++) {
             int flowProcessId = ((Integer)listProcess.get(j)).intValue();
             if (flowProcessId == flowPrcs) {
               flowTiggerModel.setId(Integer.valueOf(flowPrcsId));
               flowTiggerModel.setFlowPrcs(Integer.valueOf(flowProcessId));
               this.flowTiggerMapper.update(flowTiggerModel);
             }
 
           }
 
         }
 
       }
 
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       L.e(new Object[] { "FlowTiggerModel_UpdateError:" + e });
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<FlowTiggerModel> deleteTigger(Integer id)
   {
     ToJson toJson = new ToJson();
     try {
       this.flowTiggerMapper.deleteTigger(id);
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   public ToJson<FlowTiggerModel> modifyFieldProperties(String tableName, String id, Integer runId)
   {
     ToJson flowTiggerModelToJson = new ToJson();
     flowTiggerModelToJson.setMsg("err");
     flowTiggerModelToJson.setFlag(1);
 
     if (StringUtils.checkNull(tableName).booleanValue()) {
       flowTiggerModelToJson.setMsg("缺少必要的请求参数：tableName");
       flowTiggerModelToJson.setFlag(1);
       return flowTiggerModelToJson;
     }
     if ("attend_leave".equals(tableName)) {
       AttendLeave attendLeave = new AttendLeave();
       attendLeave.setLeaveId(Integer.valueOf(Integer.parseInt(id)));
       attendLeave.setRunId(runId);
       if (this.attendLeaveMapper.updateAttendLeave(attendLeave) > 0) {
         flowTiggerModelToJson.setMsg("ok");
         flowTiggerModelToJson.setFlag(0);
       }
     }
     else if (!"attend_evection".equals(tableName));
     return flowTiggerModelToJson;
   }
 }

