package com.myoa.service.rms;

import com.myoa.model.rms.RmsRollRoom;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

import javax.servlet.http.HttpServletRequest;

public abstract interface RmsRollRoomService
{
  public abstract ToJson<RmsRollRoom> save(RmsRollRoom paramRmsRollRoom, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<RmsRollRoom> update(RmsRollRoom paramRmsRollRoom, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<RmsRollRoom> delete(RmsRollRoom paramRmsRollRoom, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<RmsRollRoom> query(RmsRollRoom paramRmsRollRoom, PageParams paramPageParams);

  public abstract ToJson<RmsRollRoom> selectById(Integer paramInteger);

  public abstract ToJson<RmsRollRoom> selectAll();
}

