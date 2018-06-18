package com.myoa.service.flowplugin;

import com.myoa.model.flowplugin.FlowPluginModel;
import com.myoa.util.ToJson;

public abstract interface FlowPluginService
{
  public abstract ToJson<FlowPluginModel> save(FlowPluginModel paramFlowPluginModel);

  public abstract ToJson selectList(Integer paramInteger);

  public abstract ToJson showPlugin();
}

