package com.myoa.service.event;

import com.myoa.model.event.TimeLine;
import com.myoa.model.event.TimeLinePostDept;
import com.myoa.model.event.TimeLinePostRole;
import com.myoa.model.event.TimeLinePostUser;
import com.myoa.model.event.TimeLineViewDept;
import com.myoa.model.event.TimeLineViewRole;
import com.myoa.model.event.TimeLineViewUser;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface TimeLineService
{
  public abstract ToJson<TimeLine> getDetailByUuid(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<TimeLine> getTimeLineByUuid(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<TimeLine> getInforList(HttpServletRequest paramHttpServletRequest, TimeLine paramTimeLine);

  public abstract ToJson<TimeLine> getInforList1(HttpServletRequest paramHttpServletRequest, TimeLine paramTimeLine);

  public abstract ToJson<TimeLine> updateData(HttpServletRequest paramHttpServletRequest, TimeLine paramTimeLine, TimeLinePostDept paramTimeLinePostDept, TimeLinePostRole paramTimeLinePostRole, TimeLinePostUser paramTimeLinePostUser, TimeLineViewDept paramTimeLineViewDept, TimeLineViewRole paramTimeLineViewRole, TimeLineViewUser paramTimeLineViewUser, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6);

  public abstract ToJson<TimeLine> deleteByUuid(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<TimeLine> addData(HttpServletRequest paramHttpServletRequest, TimeLine paramTimeLine, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6);

  public abstract List<TimeLine> getTimelines(HttpServletRequest paramHttpServletRequest)
    throws UnsupportedEncodingException;

  public abstract List<TimeLine> getPageTimelines(HttpServletRequest paramHttpServletRequest, PageParams paramPageParams, Map paramMap)
    throws UnsupportedEncodingException;

  public abstract List<TimeLine> postTimelines(HttpServletRequest paramHttpServletRequest, PageParams paramPageParams, String paramString);

  public abstract ToJson<Object> getTimelineCode(HttpServletRequest paramHttpServletRequest, String paramString);
}

