package com.myoa.service.supervision;

import com.myoa.model.supervision.SupFeedBack;
import com.myoa.model.supervision.SupFeedBackReply;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface SupFeedBackServise
{
  public abstract ToJson<Object> getSupDetail(HttpServletRequest paramHttpServletRequest, SupFeedBack paramSupFeedBack, SupFeedBackReply paramSupFeedBackReply);

  public abstract ToJson<SupFeedBack> deleteSupFeedBack(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<SupFeedBack> updateSupFeedBack(HttpServletRequest paramHttpServletRequest, SupFeedBack paramSupFeedBack);

  public abstract ToJson<SupFeedBack> addSupFeedBack(HttpServletRequest paramHttpServletRequest, SupFeedBack paramSupFeedBack);

  public abstract ToJson<SupFeedBack> getSupFeedBackList(HttpServletRequest paramHttpServletRequest, SupFeedBack paramSupFeedBack);
}

