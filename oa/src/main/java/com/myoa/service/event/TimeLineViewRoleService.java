package com.myoa.service.event;

import com.myoa.model.event.TimeLineViewRole;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface TimeLineViewRoleService
{
  public abstract ToJson<TimeLineViewRole> addTimeLineViewRole(HttpServletRequest paramHttpServletRequest, TimeLineViewRole paramTimeLineViewRole);

  public abstract ToJson<TimeLineViewRole> updateTimeLineViewRole(HttpServletRequest paramHttpServletRequest, TimeLineViewRole paramTimeLineViewRole);
}

