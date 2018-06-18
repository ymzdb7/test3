package com.myoa.dao.flowhook;

import com.myoa.model.workflow.FlowHookWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface FlowHookMapper {
	public abstract int insertSelective(FlowHookWithBLOBs paramFlowHookWithBLOBs);

	public abstract int deleteByhid(FlowHookWithBLOBs paramFlowHookWithBLOBs);

	public abstract int updateByhidSelective(
			FlowHookWithBLOBs paramFlowHookWithBLOBs);

	public abstract FlowHookWithBLOBs selectByhid(
			FlowHookWithBLOBs paramFlowHookWithBLOBs);

	public abstract List<FlowHookWithBLOBs> gethookAll(
			FlowHookWithBLOBs paramFlowHookWithBLOBs);

	public abstract FlowHookWithBLOBs selectByOrderId(
			FlowHookWithBLOBs paramFlowHookWithBLOBs);

	public abstract FlowHookWithBLOBs selectByName(
			FlowHookWithBLOBs paramFlowHookWithBLOBs);

	public abstract FlowHookWithBLOBs queryByHmodule(
			@Param("hmodule") String paramString1,
			@Param("flowId") String paramString2);
}
