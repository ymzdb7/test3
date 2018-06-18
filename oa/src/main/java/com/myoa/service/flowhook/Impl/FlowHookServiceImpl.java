 package com.myoa.service.flowhook.Impl;
 
 import com.myoa.dao.flowhook.FlowHookMapper;
import com.myoa.dao.workflow.FlowTypeModelMapper;
import com.myoa.model.workflow.FlowDetailInfo;
import com.myoa.model.workflow.FlowHookWithBLOBs;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.service.flowhook.FlowHookService;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;

 import java.util.List;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class FlowHookServiceImpl
   implements FlowHookService
 {
 
   @Resource
   private FlowHookMapper flowHookMapper;
 
   @Resource
   private FlowTypeModelMapper flowTypeModelMapper;
 
   @Transactional
   public int saveHook(FlowHookWithBLOBs flowHook)
   {
     return this.flowHookMapper.insertSelective(flowHook);
   }
 
   @Transactional
   public int deleteHook(FlowHookWithBLOBs flowHook) {
     return this.flowHookMapper.deleteByhid(flowHook);
   }
 
   @Transactional
   public int updateHook(FlowHookWithBLOBs flowHook) {
     return this.flowHookMapper.updateByhidSelective(flowHook);
   }
 
   public FlowHookWithBLOBs getHookById(FlowHookWithBLOBs flowHook)
   {
     return this.flowHookMapper.selectByhid(flowHook);
   }
 
   public List<FlowHookWithBLOBs> getHookAll(FlowHookWithBLOBs flowHook)
   {
     List<FlowHookWithBLOBs> flowHookWithBLOBs = this.flowHookMapper.gethookAll(flowHook);
     for (FlowHookWithBLOBs f : flowHookWithBLOBs) {
       Integer flowId = f.getFlowId();
       if (flowId != null) {
         FlowDetailInfo flowDetailInfo = this.flowTypeModelMapper.selectFlowDetailInfo(flowId);
         if ((flowDetailInfo != null) && (flowDetailInfo.getFlowName() != null)) {
           f.setFlowName(flowDetailInfo.getFlowName());
         }
       }
     }
     return flowHookWithBLOBs;
   }
 
   public FlowHookWithBLOBs selectByOrderId(FlowHookWithBLOBs flowHookWithBLOBs)
   {
     return this.flowHookMapper.selectByOrderId(flowHookWithBLOBs);
   }
 
   public FlowHookWithBLOBs selectByName(FlowHookWithBLOBs flowHookWithBLOBs)
   {
     return this.flowHookMapper.selectByName(flowHookWithBLOBs);
   }
 
   public ToJson<FlowHookWithBLOBs> queryFormId(String folwId)
   {
     ToJson flowHookWithBLOBsToJson = new ToJson();
     if (StringUtils.checkNull(folwId).booleanValue()) {
       flowHookWithBLOBsToJson.setFlag(1);
       flowHookWithBLOBsToJson.setMsg("err");
       return flowHookWithBLOBsToJson;
     }
     FlowTypeModel flowTypeModel = this.flowTypeModelMapper.queryOneObject(Integer.valueOf(Integer.parseInt(folwId)));
     if (flowTypeModel != null) {
       flowHookWithBLOBsToJson.setFlag(0);
       flowHookWithBLOBsToJson.setMsg("ok");
       flowHookWithBLOBsToJson.setObject(flowTypeModel);
     } else {
       flowHookWithBLOBsToJson.setFlag(1);
       flowHookWithBLOBsToJson.setMsg("err");
     }
 
     return flowHookWithBLOBsToJson;
   }
 }

