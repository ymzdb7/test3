package com.myoa.service.hr;

import com.myoa.model.hr.HrStaffInfo;
import com.myoa.model.hr.HrStaffLeave;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public abstract interface HrStaffLeaveService
{
  public abstract ToJson<HrStaffInfo> querytLeavePersonByDeptId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<HrStaffLeave> getLeaveUsersByDeptId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<HrStaffLeave> addLeaveInfor(HrStaffLeave paramHrStaffLeave, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<HrStaffLeave> getLeaveUserByDeptId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);
}

