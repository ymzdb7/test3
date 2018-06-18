 package com.myoa.service.workflow.flowtype.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.workflow.FlowFormTypeMapper;
import com.myoa.dao.workflow.FlowRunMapper;
import com.myoa.dao.workflow.FlowTypeModelMapper;
import com.myoa.model.department.Department;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowFormType;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.model.workflow.TMacroCtrl;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.service.work.WorkService;
import com.myoa.service.workflow.flowtype.FlowFormTypeService;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.ipUtil.IpAddr;

 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class FlowFormTypeServiceImpl
   implements FlowFormTypeService
 {
 
   @Resource
   private FlowFormTypeMapper flowFormTypeMapper;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private DepartmentService departmentService;
 
   @Resource
   private UsersPrivService usersPrivService;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   @Resource
   private FlowTypeModelMapper flowTypeModelMapper;
 
   @Resource
   private FlowRunMapper flowRunMapper;
 
   @Resource
   private WorkService workService;
 
   public ToJson<FlowFormType> qureyItemMax(Integer formId)
   {
     ToJson toJson = new ToJson(0, "");
     if (formId != null) {
       FlowFormType folw = this.flowFormTypeMapper.qureyItemMax(formId);
       if (folw != null) {
         toJson.setMsg("ok");
         toJson.setObject(folw);
       }
 
     }
     else
     {
       toJson.setMsg("err");
     }
 
     return toJson;
   }
 
   public ToJson<TMacroCtrl> qureyCtrl(String controlId, String option, HttpServletRequest request, Integer fromId, Integer folwId, String runId, String prcsId, String flowPrcs, String company, String signlock)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     String userId = users.getUserId();
     Integer userPriv = users.getUserPriv();
     Integer deptId = users.getDeptId();
     String[] strArray = null;
     ToJson json = new ToJson();
     TMacroCtrl tM = new TMacroCtrl();
     Date curDate = new Date();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
     String date = sdf.format(curDate);
     String date1 = sdf1.format(curDate);
     StringBuffer bb1 = new StringBuffer();
     StringBuffer bb2 = new StringBuffer();
     StringBuffer bb3 = new StringBuffer();
     Map maps = new HashMap();
     if (tM.getControlId().equals(controlId)) {
       tM.setSYS_USERID(users.getUserId());
       tM.setSYS_USERNAME(users.getUserName());
       tM.setSYS_DEPTNAME(users.getDeptName());
       tM.setSYS_DEPTNAME_SHORT(users.getDeptName());
       tM.setSYS_USERPRIV(users.getUserPrivName());
       tM.setSYS_USERPRIVOTHER(users.getUserPrivName());
       tM.setSYS_USERNAME_DATE(users.getUserName() + " " + date1);
       tM.setSYS_RUNDATETIME(users.getUserName() + " " + date);
       tM.setSYS_IP(IpAddr.getIpAddr(request));
       FlowFormType folw = null;
       if (fromId != null) {
         folw = this.flowFormTypeMapper.qureyItemMax(fromId);
       }
       if (folw != null) {
         tM.setSYS_FORMNAME(folw.getFormName());
       }
       FlowTypeModel folw1 = null;
       if ((folwId != null) && (fromId != null)) {
         folw1 = this.flowTypeModelMapper.selectOnlyType(folwId, fromId);
       }
       if (folw1 != null) {
         tM.setSYS_RUNNAME(folw1.getAutoName());
         tM.setSYS_AUTONUM(folw1.getAutoNum() + "");
         tM.setSYS_AUTONUM_YEAR(folw1.getAutoNumYear() + "");
         tM.setSYS_AUTONUM_MONTH(folw1.getAutoNumMonth() + "");
       }
       if ((!StringUtils.checkNull(runId).booleanValue()) && (!StringUtils.checkNull(flowPrcs).booleanValue())) {
         AjaxJson ajaxJson = this.workService.findworkfeedback(runId, prcsId, flowPrcs, userId, company, signlock);
         tM.setSignText(ajaxJson.getObj());
       }
 
       Department department = this.departmentMapper.getFatherDept(deptId.intValue());
       String manag = department.getManager();
 
       String leader1 = department.getLeader1();
       if ((manag != null) && (!manag.equals(""))) {
         String[] mm = manag.split(",");
         for (int j = 0; j < mm.length; j++) {
           String name2 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(mm[j]) });
           if (name2 != null) {
             bb1.append(name2);
             bb1.append(",");
           }
 
           if (!StringUtils.checkNull(String.valueOf(bb1)).booleanValue()) {
             tM.setSYS_MANAGER1(bb1.toString().substring(0, bb1.toString().length() - 1));
           }
         }
 
       }
 
       if ((leader1 != null) && (!leader1.equals(""))) {
         String[] dd = leader1.split(",");
         for (int j = 0; j < dd.length; j++) {
           String name4 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(dd[j]) });
           if (name4 != null) {
             bb3.append(name4);
             bb3.append(",");
           }
 
           if (!StringUtils.checkNull(String.valueOf(bb3)).booleanValue()) {
             tM.setSYS_MANAGER2(bb3.toString().substring(0, bb3.toString().length() - 1));
           }
         }
       }
 
       List<Department> departments = this.departmentMapper.getDepartmentByParet();
       if (departments != null) {
         for (Department department1 : departments)
         {
           bb2.append(department1.getDeptName());
           bb2.append(",");
         }
         if (!StringUtils.checkNull(String.valueOf(bb2)).booleanValue()) {
           tM.setSYS_MANAGER3(bb2.toString().substring(0, bb2.toString().length() - 1));
         }
 
       }
 
       if (!StringUtils.checkNull(option).booleanValue()) {
         strArray = option.split(",");
         for (int j = 0; j < strArray.length; j++) {
           if ("SYS_LIST_DEPT".equals(strArray[j])) {
             List deptList = this.departmentService.getDatagrid();
             tM.setSYS_LIST_DEPT(deptList);
           }
           if ("SYS_LIST_USER".equals(strArray[j])) {
             List list = this.usersService.getAlluser(maps, Integer.valueOf(1), Integer.valueOf(5), false);
             tM.setSYS_LIST_USER(list);
           }
           if ("SYS_LIST_PRIV".equals(strArray[j])) {
             List list = this.usersPrivService.getAllPriv(maps, Integer.valueOf(1), Integer.valueOf(5), false);
             tM.setSYS_LIST_PRIV(list);
           }
         }
       }
 
       json.setFlag(0);
       json.setMsg("ok");
       json.setObject(tM);
     } else {
       json.setFlag(1);
       json.setMsg("err");
     }
 
     return json;
   }
 }
