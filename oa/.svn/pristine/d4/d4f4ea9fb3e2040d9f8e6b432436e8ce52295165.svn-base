package com.myoa.service.address;

import com.myoa.model.addressGroup.AddressGroupWithBLOBs;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import javax.servlet.http.HttpServletRequest;

public abstract interface AddressGroupService
{
  public abstract BaseWrapper isExis(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract BaseWrapper addGroup(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2);

  public abstract BaseWrapper getGroups(HttpServletRequest paramHttpServletRequest);

  public abstract BaseWrapper deleteGroups(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract BaseWrapper getGroupInfo(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract BaseWrapper putGroup(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2, String paramString3);

  public abstract ToJson<AddressGroupWithBLOBs> addPublicGroup(HttpServletRequest paramHttpServletRequest, AddressGroupWithBLOBs paramAddressGroupWithBLOBs);

  public abstract ToJson<AddressGroupWithBLOBs> getPublicGroups(HttpServletRequest paramHttpServletRequest, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<AddressGroupWithBLOBs> updatePublicGroup(HttpServletRequest paramHttpServletRequest, AddressGroupWithBLOBs paramAddressGroupWithBLOBs);

  public abstract ToJson<AddressGroupWithBLOBs> selectPublicGroupInfo(Integer paramInteger);

  public abstract BaseWrapper selectAllAddressGroup(HttpServletRequest paramHttpServletRequest);
}

