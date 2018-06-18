package com.myoa.service.supervision;

import com.myoa.model.supervision.Supervision;
import com.myoa.util.ToJson;
import com.myoa.util.treeUtil.TreeGirdNode;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface SupervisionService
{
  public abstract ToJson<Supervision> getSupManageByTypeId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<TreeGirdNode> getSupManageMenu(HttpServletRequest paramHttpServletRequest, Supervision paramSupervision);

  public abstract ToJson<Supervision> addSupervision(HttpServletRequest paramHttpServletRequest, Supervision paramSupervision);

  public abstract ToJson<Supervision> deleteSupervisionBySid(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<Supervision> getSupAssistDetail(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<Supervision> selectCountList(Map<String, String> paramMap, Integer paramInteger, String paramString1, String paramString2, String paramString3);

  public abstract ToJson<Supervision> queryCountSupervisionByStatus();

  public abstract ToJson<Supervision> getSupApplyTaskList(Integer paramInteger1, Integer paramInteger2, HttpServletRequest paramHttpServletRequest);

  public abstract Supervision queryCountByDept(Integer paramInteger, Map<String, Object> paramMap);

  public abstract ToJson<Supervision> updateSupStatus(Supervision paramSupervision, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Supervision> updateSupervision(HttpServletRequest paramHttpServletRequest, Supervision paramSupervision);
}
