package com.myoa.service.supervision;

import com.myoa.model.supervision.SupervisionApply;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface SupervisionApplyService
{
  public abstract ToJson<SupervisionApply> updateStatus(HttpServletRequest paramHttpServletRequest, SupervisionApply paramSupervisionApply);

  public abstract ToJson<SupervisionApply> getStatusInfor(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<SupervisionApply> insertSupApply(HttpServletRequest paramHttpServletRequest, SupervisionApply paramSupervisionApply);

  public abstract ToJson<SupervisionApply> getSupApplyByStatus(HttpServletRequest paramHttpServletRequest, SupervisionApply paramSupervisionApply);
}

