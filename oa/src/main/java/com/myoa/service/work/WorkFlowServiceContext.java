 package com.myoa.service.work;
 
 import com.myoa.dao.flowRunFeedback.FlowRunFeedbackMapper;
import com.myoa.dao.flowplugin.FlowPluginMapper;
import com.myoa.dao.work.WorkMapper;
import com.myoa.dao.workflow.FlowProcessMapper;
import com.myoa.dao.workflow.FlowTypeModelMapper;
import com.myoa.service.workflow.flowtype.FlowFormTypeService;
import com.myoa.service.workflow.flowtype.FlowProcessService;
import com.myoa.service.workflow.flowtype.FlowRunPrcsService;
import com.myoa.service.workflow.flowtype.FlowRunService;
import com.myoa.service.workflow.flowtype.FlowTypeService;

 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class WorkFlowServiceContext
 {
 
   @Resource
   private FlowTypeService flowTypeService;
 
   @Resource
   private FlowFormTypeService flowFormTypeService;
 
   @Resource
   private FlowRunService flowRunService;
 
   @Resource
   private FlowRunPrcsService flowRunPrcsService;
 
   @Resource
   private FlowProcessService flowProcessService;
 
   @Resource
   private WorkMapper workMapper;
 
   @Resource
   private FlowPluginMapper flowPluginMapper;
 
   @Resource
   private FlowRunFeedbackMapper flowRunFeedbackMapper;
 
   @Resource
   private FlowProcessMapper flowProcessMapper;
 
   @Resource
   private FlowTypeModelMapper flowTypeModelMapper;
 
   public FlowTypeModelMapper getFlowTypeModelMapper()
   {
     return this.flowTypeModelMapper;
   }
 
   public void setFlowTypeModelMapper(FlowTypeModelMapper flowTypeModelMapper) {
     this.flowTypeModelMapper = flowTypeModelMapper;
   }
 
   public FlowTypeService getFlowTypeService() {
     return this.flowTypeService;
   }
 
   public FlowFormTypeService getFlowFormTypeService() {
     return this.flowFormTypeService;
   }
 
   public FlowRunService getFlowRunService() {
     return this.flowRunService;
   }
 
   public FlowRunPrcsService getFlowRunPrcsService() {
     return this.flowRunPrcsService;
   }
 
   public FlowProcessService getFlowProcessService() {
     return this.flowProcessService;
   }
 
   public WorkMapper getWorkMapper() {
     return this.workMapper;
   }
 
   public FlowPluginMapper getFlowPluginMapper() {
     return this.flowPluginMapper;
   }
 
   public FlowRunFeedbackMapper getFlowRunFeedbackMapper() {
     return this.flowRunFeedbackMapper;
   }
 
   public FlowProcessMapper getFlowProcessMapper() {
     return this.flowProcessMapper;
   }
 }

