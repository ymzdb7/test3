package com.myoa.dao.flowplugin;

import com.myoa.dao.base.BaseMapper;
import com.myoa.model.flowplugin.FlowPluginModel;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowPluginMapper extends BaseMapper<FlowPluginModel> {
	public abstract FlowPluginModel selectList(
			@Param("flowPluginId") Integer paramInteger);

	public abstract String selectFlowPlugin(
			@Param("flowPluginId") Integer paramInteger);

	public abstract List<FlowPluginModel> showFlowPlugin();
}
