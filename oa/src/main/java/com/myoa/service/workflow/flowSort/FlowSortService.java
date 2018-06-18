package com.myoa.service.workflow.flowSort;

import com.myoa.model.workflow.FlowSort;
import com.myoa.util.ToJson;

public abstract interface FlowSortService
{
  public abstract ToJson<FlowSort> getFlowTypes();

  public abstract ToJson<FlowSort> getSortAndType();
}

