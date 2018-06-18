package com.myoa.service.WFE;

import com.myoa.dao.WFE.WFEFlowRunMapper;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.enclosure.EnclosureService;
import com.myoa.service.sms.SmsService;
import com.myoa.service.syspara.SysParaService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;

import org.springframework.beans.factory.annotation.Autowired;

public class WFE
{

  @Autowired
  protected SmsService smsService;

  @Autowired
  protected SysParaService sysParaService;

  @Autowired
  protected UsersService usersService;

  @Autowired
  protected DepartmentService departmentService;

  @Autowired
  protected UsersPrivService usersPrivService;

  @Autowired
  protected EnclosureService enclosureService;

  @Autowired
  protected WFEFlowRunMapper wfeFlowRunMapper;
}

