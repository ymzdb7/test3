package com.myoa.service.workflow.flowtype;

import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowRun;
import com.myoa.util.common.wrapper.BaseWrappers;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.transaction.annotation.Transactional;

public abstract interface FlowRunService
{
  @Transactional(readOnly=true)
  public abstract int getMaxRunId();

  public abstract void save(FlowRun paramFlowRun);

  public abstract FlowRun find(Integer paramInteger);

  public abstract int update(FlowRun paramFlowRun);

  public abstract int updateTime(Map<String, Object> paramMap);

  public abstract int updateAttachment(Map<String, Object> paramMap);

  public abstract BaseWrappers queryFlowRun(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Integer paramInteger4, Integer paramInteger5, boolean paramBoolean, Users paramUsers, String paramString7, HttpServletResponse paramHttpServletResponse, HttpServletRequest paramHttpServletRequest);

  public abstract int updateFocusUser(Map<String, Object> paramMap);

  public abstract int updateEnd(Map<String, Object> paramMap);

  public abstract BaseWrappers queryFlowRunCount(HttpServletRequest paramHttpServletRequest);
}
