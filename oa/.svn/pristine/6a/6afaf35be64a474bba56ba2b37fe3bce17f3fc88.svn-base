package com.myoa.service.supervision;

import com.myoa.model.supervision.SupervisionType;
import com.myoa.util.ToJson;
import com.myoa.util.treeUtil.TreeGirdNode;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface SupervisionTypeService
{
  public abstract ToJson<SupervisionType> getSupervisionTypeDetail(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<SupervisionType> updateSupervisionType(HttpServletRequest paramHttpServletRequest, SupervisionType paramSupervisionType);

  public abstract ToJson<SupervisionType> addSupervisionType(HttpServletRequest paramHttpServletRequest, SupervisionType paramSupervisionType);

  public abstract ToJson<SupervisionType> deleteSupervisionTypeBySid(Integer paramInteger);

  public abstract ToJson<SupervisionType> getSupervisionTypeList(SupervisionType paramSupervisionType, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<TreeGirdNode> getSupTypeList(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<SupervisionType> getSupNameSelect(HttpServletRequest paramHttpServletRequest, SupervisionType paramSupervisionType);
}

