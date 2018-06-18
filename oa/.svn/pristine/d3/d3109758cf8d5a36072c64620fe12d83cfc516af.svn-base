package com.myoa.service.workflow.flowtype;

import com.myoa.model.workflow.FlowProcess;
import com.myoa.model.workflow.FlowProcessList;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrappers;

import java.util.List;

public abstract interface FlowProcessService
{
  public abstract FlowProcess find(int paramInt);

  public abstract ToJson<FlowProcess> updateByPrimaryKeySelective(FlowProcess paramFlowProcess);

  public abstract List<FlowProcess> findFlowId(int paramInt);

  public abstract ToJson<FlowProcess> delete(int paramInt, String paramString);

  public abstract ToJson<FlowProcessList> flowView(Integer paramInteger1, Integer paramInteger2, String paramString);

  public abstract ToJson<FlowProcess> insertSelective(FlowProcess paramFlowProcess);

  public abstract FlowProcess findbyprcsId(int paramInt1, int paramInt2);

  public abstract ToJson<FlowProcess> updateTopAndLeft(FlowProcess paramFlowProcess);

  public abstract ToJson<FlowProcess> findPrcessLine(FlowProcess paramFlowProcess, String paramString);

  public abstract ToJson myFlowView(Integer paramInteger1, Integer paramInteger2, String paramString);

  public abstract ToJson getFlowAttachment(String paramString1, String paramString2);

  public abstract ToJson selectFlowFeedBackByRunId(String paramString);

  public abstract BaseWrappers getFlowRunPrecsAll(String paramString);
}

