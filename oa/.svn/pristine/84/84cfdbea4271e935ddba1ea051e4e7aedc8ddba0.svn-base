 package com.myoa.service.edu.eduParent.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.common.SyslogMapper;
import com.myoa.dao.edu.eduDepartment.EduDepartmentMapper;
import com.myoa.dao.edu.eduParent.EduParentMapper;
import com.myoa.dao.users.OrgManageMapper;
import com.myoa.model.common.SysPara;
import com.myoa.model.common.Syslog;
import com.myoa.model.edu.eduDepartment.EduDepartmentWithBLOBs;
import com.myoa.model.edu.eduParent.EduParent;
import com.myoa.model.users.OrgManage;
import com.myoa.service.edu.eduParent.IEduParentService;
import com.myoa.util.common.L;
import com.myoa.util.ipUtil.IpAddr;

 import java.util.Date;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduParentServiceImpl extends ServiceImpl<EduParentMapper, EduParent>
   implements IEduParentService
 {
 
   @Autowired
   EduParentMapper eduParentMapper;
 
   @Autowired
   OrgManageMapper orgManageMapper;
 
   @Autowired
   EduDepartmentMapper eduDepartmentMapper;
 
   @Autowired
   SysParaMapper sysParaMapper;
 
   @Autowired
   SyslogMapper syslogMapper;
 
   public EduParent findUserByName(String byname, HttpServletRequest req)
   {
     EduParent user = this.eduParentMapper.findUserByName(byname);
     if (user != null) {
       String a = "";
       try {
         a = req.getSession().getAttribute("loginDateSouse").toString();
       } catch (NullPointerException e) {
         a = "1005";
       }
       try {
         OrgManage name = this.orgManageMapper.getOrgManageById(Integer.valueOf(Integer.parseInt(a)));
         if (name != null)
           user.setCompanyName(name.getName());
       }
       catch (Exception e) {
         L.a(new Object[] { e.getMessage() });
       }
 
       if (user.getDeptId() != null) {
         EduDepartmentWithBLOBs dep = this.eduDepartmentMapper.queryGetObjectByDeptId(String.valueOf(user.getDeptId()));
         if (dep != null) {
           user.setDeptName(dep.getDeptName());
         }
 
       }
 
       Syslog sysLog = new Syslog();
       sysLog.setLogId(Integer.valueOf(0));
       sysLog.setUserId(user.getUserId());
       sysLog.setTime(new Date());
       String ip = IpAddr.getIpAddress(req);
       sysLog.setIp(ip);
       sysLog.setType(Integer.valueOf(1));
       sysLog.setRemark("");
 
       SysPara sysPara = this.sysParaMapper.querySysPara("IM_HOST");
       SysPara sysPara1 = this.sysParaMapper.querySysPara("IM_PORT");
       String ip1 = sysPara.getParaValue();
       StringBuffer url = req.getRequestURL();
 
       String ipCurren = IpAddr.getInternetIp();
       user.setImRegisterIp(ipCurren);
       this.syslogMapper.save(sysLog);
     }
 
     return user;
   }
 }

