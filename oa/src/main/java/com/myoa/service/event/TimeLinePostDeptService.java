package com.myoa.service.event;

import com.myoa.model.event.TimeLinePostDept;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface TimeLinePostDeptService
{
  public abstract ToJson<TimeLinePostDept> updateTimeLinePostDept(HttpServletRequest paramHttpServletRequest, TimeLinePostDept paramTimeLinePostDept);

  public abstract ToJson<TimeLinePostDept> addTimeLinePostDept(HttpServletRequest paramHttpServletRequest, TimeLinePostDept paramTimeLinePostDept);
}

