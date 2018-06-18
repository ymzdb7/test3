package com.myoa.service.workflow.flowtype;

import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.model.workflow.FlowRunPrcsExcted;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;

import java.util.List;
import java.util.Map;

public abstract interface FlowRunPrcsService
{
  public abstract void save(FlowRunPrcs paramFlowRunPrcs);

  public abstract ToJson<FlowRunPrcs> selectObject(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<FlowRunPrcs> selectEnd(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<FlowRunPrcs> selectHang(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<FlowRunPrcs> selectAll(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract List<FlowRunPrcs> findByRunId(Map<String, Object> paramMap);

  public abstract void update(FlowRunPrcsExcted paramFlowRunPrcsExcted);

  public abstract int updateSql(Map<String, Object> paramMap);

  public abstract ToJson<FlowRunPrcs> deleteRunPrcs(FlowRunPrcs paramFlowRunPrcs);

  public abstract List<FlowRunPrcs> findlessRunId(Map<String, Object> paramMap);

  public abstract AjaxJson entrustWork(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract Integer checkGatherNode(Map<String, Object> paramMap);

  public abstract AjaxJson monitoring(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<FlowRunPrcs> entrust(FlowRunPrcs paramFlowRunPrcs, String paramString);

  public abstract ToJson resumeExe(Integer paramInteger1, Integer paramInteger2);
}

