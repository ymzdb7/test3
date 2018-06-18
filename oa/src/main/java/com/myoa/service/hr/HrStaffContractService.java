package com.myoa.service.hr;

import com.myoa.model.hr.HrStaffContract;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import javax.servlet.http.HttpServletRequest;

public abstract interface HrStaffContractService
{
  public abstract ToJson<HrStaffContract> getcontractinfo(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<Object> updateContractInfo(HrStaffContract paramHrStaffContract, String paramString);

  public abstract ToJson<Object> deleteContractInfo(String paramString);

  public abstract ToJson<HrStaffContract> getAllContract(Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<Object> addContract(HttpServletRequest paramHttpServletRequest, HrStaffContract paramHrStaffContract, String paramString);

  public abstract ToJson<HrStaffContract> getTrialContract(String paramString1, String paramString2);

  public abstract ToJson<HrStaffContract> getMaturityContract(HrStaffContract paramHrStaffContract, String paramString1, String paramString2);

  public abstract ToJson<HrStaffContract> getContract(HrStaffContract paramHrStaffContract, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<HrStaffContract> deleteByIds(String paramString);

  public abstract BaseWrapper getContractAnalysis();

  public abstract ToJson<HrStaffContract> getContractInfoByStaffName(Users paramUsers);

  public abstract BaseWrapper getHrCountByType();
}

