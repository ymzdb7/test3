package com.myoa.service.event;

import com.myoa.model.event.TimeLineViewDept;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface TimeLineViewDeptService
{
  public abstract ToJson<TimeLineViewDept> updateTimeLineViewDept(HttpServletRequest paramHttpServletRequest, TimeLineViewDept paramTimeLineViewDept);

  public abstract ToJson<TimeLineViewDept> addTimeLineViewDept(HttpServletRequest paramHttpServletRequest, TimeLineViewDept paramTimeLineViewDept);
}

