 package com.myoa.service.flowplugin.impl;
 
 import com.myoa.dao.flowplugin.FlowPluginMapper;
import com.myoa.model.flowplugin.FlowPluginModel;
import com.myoa.service.flowplugin.FlowPluginService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class FlowPluginServiceImpl
   implements FlowPluginService
 {
 
   @Resource
   private FlowPluginMapper flowPluginMapper;
 
   @Transactional
   public ToJson<FlowPluginModel> save(FlowPluginModel flowPluginModel)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       this.flowPluginMapper.save(flowPluginModel);
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObject(flowPluginModel);
     } catch (Exception e) {
       L.e(new Object[] { "FlowPluginServiceImpl save:" + e });
     }
     return toJson;
   }
 
   public ToJson selectList(Integer flowPluginId)
   {
     ToJson toJson = new ToJson(1, "error");
     FlowPluginModel flowPluginModel = this.flowPluginMapper.selectList(flowPluginId);
     if (flowPluginModel != null) {
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObject(flowPluginModel);
     }
     return toJson;
   }
 
   @Transactional(readOnly=true)
   public ToJson showPlugin()
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       toJson.setObj(this.flowPluginMapper.showFlowPlugin());
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       L.e(new Object[] { "FlowPluginServiceImpl showPlugin:" + e });
     }
     return toJson;
   }
 }
