 package com.myoa.service.users.impl;
 
 import com.myoa.dao.attend.AttendSetMapper;
import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.common.SyslogMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.duties.DutiesManagementMapper;
import com.myoa.dao.hr.HrStaffInfoMapper;
import com.myoa.dao.modulePriv.ModulePrivMapper;
import com.myoa.dao.sys.SysInterfaceMapper;
import com.myoa.dao.users.OrgManageMapper;
import com.myoa.dao.users.UserExtMapper;
import com.myoa.dao.users.UserFunctionMapper;
import com.myoa.dao.users.UserPrivMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.attend.AttendSet;
import com.myoa.model.common.SysPara;
import com.myoa.model.common.Syslog;
import com.myoa.model.department.Department;
import com.myoa.model.duties.UserPost;
import com.myoa.model.modulePriv.ModulePriv;
import com.myoa.model.sys.InterfaceModel;
import com.myoa.model.users.OrgManage;
import com.myoa.model.users.UserExt;
import com.myoa.model.users.UserFunction;
import com.myoa.model.users.UserPriv;
import com.myoa.model.users.Users;
import com.myoa.service.sys.SystemInfoService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.util.AjaxJson;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelRead;
import com.myoa.util.ExcelUtil;
import com.myoa.util.FileUploadUtil;
import com.myoa.util.PinYinUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.encrypt.EncryptSalt;
import com.myoa.util.ipUtil.IpAddr;
import com.myoa.util.page.PageParams;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.net.InetAddress;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Collection;
 import java.util.Collections;
 import java.util.Comparator;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.TreeSet;
 import java.util.UUID;
 import javax.annotation.Resource;
 import javax.servlet.ServletContext;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.commons.codec.digest.Md5Crypt;
 import org.apache.ibatis.exceptions.TooManyResultsException;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.Row;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class UsersServiceImpl
   implements UsersService
 {
   private final String one = "1";
 
   @Resource
   SystemInfoService systemInfoService;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private SyslogMapper syslogMapper;
 
   @Resource
   private UsersPrivService usersPrivService;
 
   @Resource
   private OrgManageMapper orgManageMapper;
 
   @Resource
   private UserExtMapper userExtMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   @Resource
   private UserPrivMapper userPrivMapper;
 
   @Resource
   private ModulePrivMapper modulePrivMapper;
 
   @Resource
   private UserFunctionMapper userFunctionMapper;
 
   @Resource
   private SysParaMapper sysParaMapper;
 
   @Resource
   private AttendSetMapper attendSetMapper;
 
   @Resource
   private SysInterfaceMapper sysInterfaceMapper;
 
   @Resource
   private HrStaffInfoMapper hrStaffInfoMapper;
 
   @Resource
   private DutiesManagementMapper managementMapper;
 
   @Transactional
   public ToJson<Users> addUser(Users user, UserExt userExt, ModulePriv modulePriv, HttpServletRequest request) { ToJson tojson = new ToJson();
     UserFunction userFunction = new UserFunction();
 
     Users usersByuserId = this.usersMapper.getUsersBybyname(user.getByname());
     if ((usersByuserId != null) && (usersByuserId.getByname().equals(user.getByname()))) {
       tojson.setObject(usersByuserId);
       tojson.setMsg("此用户名已存在，请修改");
       tojson.setFlag(1);
       return tojson;
     }
     boolean userToMany;
     if (request.getSession() == null)
       userToMany = false;
     else {
       userToMany = isUserToMany(request);
     }
 
     if (!userToMany) {
       if (user != null)
       {
         if (user.getPassword() != null) {
           String password = user.getPassword();
           password = getEncryptString(password.trim());
           user.setPassword(password);
         }
 
         if (!com.myoa.util.common.StringUtils.checkNull(user.getUserName()).booleanValue()) {
           String fistSpell = PinYinUtil.getFirstSpell(user.getUserName());
           StringBuffer sb = new StringBuffer();
           for (int i = 0; i < fistSpell.length(); i++) {
             sb.append(new StringBuilder().append(fistSpell.charAt(i)).append("*").toString());
           }
           user.setUserNameIndex(sb.toString());
         }
 
         if (user.getUserPriv() != null) {
           UserPriv userPriv = this.userPrivMapper.selectByPrimaryKey(user.getUserPriv().intValue());
           if (userPriv != null) {
             user.setUserPrivNo(userPriv.getPrivNo());
             user.setUserPrivName(userPriv.getPrivName());
             if (userPriv.getFuncIdStr() != null)
               userFunction.setUserFunCidStr(userPriv.getFuncIdStr());
             else {
               userFunction.setUserFunCidStr("1,");
             }
           }
         }
         if (!com.myoa.util.common.StringUtils.checkNull(user.getUserPrivOther()).booleanValue()) {
           String[] strings = user.getUserPrivOther().split(",");
           StringBuffer privaNoBuffer = new StringBuffer();
           StringBuffer privaNameBuffer = new StringBuffer();
           StringBuffer funcIdStrBuffer = new StringBuffer();
           for (int i = 0; i < strings.length; i++) {
             UserPriv userPriv = this.userPrivMapper.selectByPrimaryKey(Integer.parseInt(strings[i]));
             if (userPriv != null) {
               privaNoBuffer.append(new StringBuilder().append(userPriv.getUserPriv()).append(",").toString());
               privaNameBuffer.append(new StringBuilder().append(userPriv.getPrivName()).append(",").toString());
               if (userPriv.getFuncIdStr() != null) {
                 funcIdStrBuffer.append(userPriv.getFuncIdStr());
               }
             }
           }
           user.setUserPrivOther(String.valueOf(privaNoBuffer));
           user.setUserPrivOtherName(String.valueOf(privaNameBuffer));
           userFunction.setUserFunCidStr(new StringBuilder().append(userFunction.getUserFunCidStr()).append(String.valueOf(funcIdStrBuffer)).toString());
         }
 
         user.setAvatar(user.getSex());
       }
       try
       {
         if ((!com.myoa.util.common.StringUtils.checkNull(user.getUserName()).booleanValue()) && (user.getDeptId() != null) && (user.getUserPriv() != null)) {
           this.usersMapper.insert(user);
           user.setUserId(user.getUid().toString());
           this.usersMapper.editUser(user);
           userExt.setUid(user.getUid());
           userExt.setUserId(user.getUserId());
           this.userExtMapper.addUserExt(userExt);
 
           userFunction.setUid(user.getUid().intValue());
           userFunction.setUserId(user.getUserId());
           if (!com.myoa.util.common.StringUtils.checkNull(userFunction.getUserFunCidStr()).booleanValue()) {
             TreeSet ts = new TreeSet();
             int len1 = userFunction.getUserFunCidStr().split(",").length;
             String[] ss = userFunction.getUserFunCidStr().split(",");
             for (int i1 = 0; i1 < len1; i1++) {
               ts.add(new StringBuilder().append(ss[i1]).append("").toString());
             }
 
             Iterator i1 = ts.iterator();
             StringBuilder sb1 = new StringBuilder();
             while (i1.hasNext()) {
               sb1.append(new StringBuilder().append((String)i1.next()).append(",").toString());
             }
             userFunction.setUserFunCidStr(String.valueOf(sb1));
           }
 
           this.userFunctionMapper.insertUserFun(userFunction);
           if (modulePriv != null) {
             modulePriv.setUid(user.getUid());
             if ((!com.myoa.util.common.StringUtils.checkNull(modulePriv.getDeptId()).booleanValue()) || (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getPrivId()).booleanValue()) || (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getUserId()).booleanValue())) {
               modulePriv.setUid(user.getUid());
               modulePriv.setModuleId(Integer.valueOf(0));
               modulePriv.setDeptPriv("1");
               modulePriv.setRolePriv("2");
               this.modulePrivMapper.addModulePriv(modulePriv);
             }
           }
 
           tojson.setObject(user);
           tojson.setFlag(0);
           tojson.setMsg("OK");
         } else {
           tojson.setFlag(1);
           tojson.setMsg("新建失败");
         }
       } catch (Exception e) {
         e.printStackTrace();
         tojson.setFlag(1);
         tojson.setMsg("新建失败");
       }
       return tojson;
     }
 
     tojson.setFlag(1);
     tojson.setMsg("用户超过授权限制");
 
     return tojson;
   }
 
   @Transactional
   public ToJson<Users> editUser(Users user, UserExt userExt, ModulePriv modulePriv)
   {
     ToJson tojson = new ToJson();
     UserFunction userFunction = new UserFunction();
     if (user != null)
     {
       if ((user.getByname() != null) && (user.getByname() != "")) {
         Users usersByuserId = this.usersMapper.getUsersBybyname(user.getByname());
         if ((usersByuserId != null) && (!usersByuserId.getUid().equals(user.getUid())) && (usersByuserId.getByname().equals(user.getByname()))) {
           tojson.setObject(usersByuserId);
           tojson.setMsg("此用户名已存在，请重新修改");
           tojson.setFlag(1);
           return tojson;
         }
       }
 
       if ((user.getPassword() != null) && (!"tVHbkPWW57Hw.".equals(user.getPassword()))) {
         Users byUid = this.usersMapper.getByUid(user.getUid().intValue());
         if ((byUid.getPassword() == null) || (!byUid.getPassword().equals(user.getPassword()))) {
           String password = user.getPassword();
           password = getEncryptString(password.trim());
           user.setPassword(password);
         }
 
       }
 
       if (user.getUserName() != null) {
         String fistSpell = PinYinUtil.getFirstSpell(user.getUserName());
         StringBuffer sb = new StringBuffer();
         for (int i = 0; i < fistSpell.length(); i++) {
           sb.append(new StringBuilder().append(fistSpell.charAt(i)).append("*").toString());
         }
         user.setUserNameIndex(sb.toString());
       }
 
       if (user.getUserPriv() != null) {
         UserPriv userPriv = this.userPrivMapper.selectByPrimaryKey(user.getUserPriv().intValue());
         if (userPriv != null) {
           user.setUserPrivNo(userPriv.getPrivNo());
           user.setUserPrivName(userPriv.getPrivName());
 
           if (!com.myoa.util.common.StringUtils.checkNull(userPriv.getFuncIdStr()).booleanValue()) {
             userFunction.setUserFunCidStr(userPriv.getFuncIdStr());
           }
         }
       }
       if (!com.myoa.util.common.StringUtils.checkNull(user.getUserPrivOther()).booleanValue()) {
         String[] strings = user.getUserPrivOther().split(",");
         StringBuffer privaNoBuffer = new StringBuffer();
         StringBuffer privaNameBuffer = new StringBuffer();
         StringBuffer funcIdStrBuffer = new StringBuffer();
         for (int i = 0; i < strings.length; i++) {
           UserPriv userPriv = this.userPrivMapper.selectByPrimaryKey(Integer.parseInt(strings[i]));
           if (userPriv != null) {
             privaNoBuffer.append(new StringBuilder().append(userPriv.getUserPriv()).append(",").toString());
             privaNameBuffer.append(new StringBuilder().append(userPriv.getPrivName()).append(",").toString());
             if (userPriv.getFuncIdStr() != null) {
               funcIdStrBuffer.append(userPriv.getFuncIdStr());
             }
           }
         }
         user.setUserPrivOther(String.valueOf(privaNoBuffer));
         user.setUserPrivOtherName(String.valueOf(privaNameBuffer));
         userFunction.setUserFunCidStr(new StringBuilder().append(userFunction.getUserFunCidStr()).append(String.valueOf(funcIdStrBuffer)).toString());
       }
 
     }
 
     try
     {
       if ((user.getDeptId() != null) && (user.getDeptId().equals(Integer.valueOf(0)))) {
         user.setNotLogin(Byte.valueOf("1"));
         user.setNotMobileLogin(Integer.valueOf(1));
       }
       this.usersMapper.editUser(user);
       user = this.usersMapper.selectUserByUId(user.getUid());
 
       if (modulePriv != null) {
         modulePriv.setUid(user.getUid());
         modulePriv.setModuleId(Integer.valueOf(0));
         modulePriv.setDeptPriv("1");
         modulePriv.setRolePriv("2");
 
         ModulePriv modulePrivByUid = this.modulePrivMapper.getModulePrivSingle(modulePriv);
         if (modulePrivByUid != null) {
           if ((!com.myoa.util.common.StringUtils.checkNull(modulePriv.getDeptId()).booleanValue()) || (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getPrivId()).booleanValue()) || (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getUserId()).booleanValue()))
             this.modulePrivMapper.updateModulePriv(modulePriv);
         }
         else {
           this.modulePrivMapper.addModulePriv(modulePriv);
         }
       }
       if (userExt != null) {
         userExt.setUserId(user.getUserId());
         this.userExtMapper.updateUserExtByUid(userExt);
       }
       userFunction.setUid(user.getUid().intValue());
       userFunction.setUserId(user.getUserId());
       if (!com.myoa.util.common.StringUtils.checkNull(userFunction.getUserFunCidStr()).booleanValue()) {
         TreeSet ts = new TreeSet();
         int len1 = userFunction.getUserFunCidStr().split(",").length;
         String[] ss = userFunction.getUserFunCidStr().split(",");
         for (int i1 = 0; i1 < len1; i1++) {
           ts.add(new StringBuilder().append(ss[i1]).append("").toString());
         }
 
         Iterator i1 = ts.iterator();
         StringBuilder sb1 = new StringBuilder();
         while (i1.hasNext()) {
           sb1.append(new StringBuilder().append((String)i1.next()).append(",").toString());
         }
         userFunction.setUserFunCidStr(String.valueOf(sb1));
         this.userFunctionMapper.updateUserFun(userFunction);
       }
 
       user = this.usersMapper.findUserByuid(user.getUid().intValue());
       tojson.setObject(user);
       tojson.setFlag(0);
       tojson.setMsg("OK");
     } catch (Exception e) {
       e.printStackTrace();
       tojson.setFlag(1);
       tojson.setMsg("error");
     }
     return tojson;
   }
 
   public void deleteUser(String uids)
   {
     Integer index = null;
     String[] split = uids.split(",");
     for (int i = 0; i < split.length; i++) {
       if (split[i].equals("1")) {
         index = Integer.valueOf(i);
       }
     }
     if (index != null) {
       split[index.intValue()] = "a";
     }
     this.usersMapper.deleteUser(split);
     this.userExtMapper.deleteUserExtByUids(split);
     this.modulePrivMapper.deleteModulePrivByUids(split);
     this.userFunctionMapper.deleteUserFun(split);
   }
 
   public List<Users> getAlluser(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     return this.usersMapper.getAlluser(maps);
   }
 
   public List<Users> getUserByMany(Users user)
   {
     List list = this.usersMapper.getUserByMany(user);
     return list;
   }
 
   public List<Users> getUserAndDept(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     return this.usersMapper.getUserAndDept(maps);
   }
 
   public Users findUserByuid(int uid)
   {
     Users user = this.usersMapper.findUserByuid(uid);
     if (user != null) {
       StringBuffer sb = new StringBuffer();
 
       if (!com.myoa.util.common.StringUtils.checkNull(user.getUserPrivOther()).booleanValue()) {
         List<UserPriv> privNameByIds = this.modulePrivMapper.getPrivNameByIds(user.getUserPrivOther().split(","));
         if (privNameByIds != null) {
           for (UserPriv entity : privNameByIds) {
             sb.append(new StringBuilder().append(entity.getPrivName()).append(",").toString());
           }
           user.setUserPrivOtherName(sb.toString());
         }
         sb.setLength(0);
       }
 
       if (!com.myoa.util.common.StringUtils.checkNull(user.getDeptIdOther()).booleanValue()) {
         List<Department> deptNameByIds = this.modulePrivMapper.getDeptNameByIds(user.getDeptIdOther().split(","));
         if (deptNameByIds != null) {
           for (Department entity : deptNameByIds) {
             sb.append(new StringBuilder().append(entity.getDeptName()).append(",").toString());
           }
           user.setDeptOtherName(sb.toString());
         }
         sb.setLength(0);
       }
       if (user.getDutyType() != null) {
         AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(user.getUserExt().getDutyType().shortValue()));
         if (attendSet != null) {
           String dutyTypeName = attendSet.getTitle();
           user.setDutyTypeName(dutyTypeName);
           sb.setLength(0);
         }
         user.setDutyTypeName("");
         sb.setLength(0);
       }
 
       if ((user.getPostId() != null) && (user.getPostId().intValue() != 0)) {
         if (this.managementMapper.getUserPostId(user.getPostId()) != null) {
           String postName = this.managementMapper.getUserPostId(user.getPostId()).getPostName();
           user.setPostName(postName);
         } else {
           user.setPostName("");
         }
       }
 
       ModulePriv modulePriv = new ModulePriv();
       modulePriv.setModuleId(Integer.valueOf(0));
       modulePriv.setUid(Integer.valueOf(uid));
       modulePriv = this.modulePrivMapper.getModulePrivSingle(modulePriv);
 
       if (modulePriv != null) {
         user.setModulePriv(modulePriv);
         if (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getUserId()).booleanValue()) {
           List<Users> usersByUids = this.usersMapper.getUsersByUids(modulePriv.getUserId().split(","));
           if (usersByUids != null) {
             for (Users entity : usersByUids) {
               sb.append(new StringBuilder().append(entity.getUserName()).append(",").toString());
             }
             modulePriv.setUserName(sb.toString());
           }
           sb.setLength(0);
         }
         if (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getPrivId()).booleanValue()) {
           List<UserPriv> privNameByIds = this.modulePrivMapper.getPrivNameByIds(modulePriv.getPrivId().split(","));
           if (privNameByIds != null) {
             for (UserPriv entity : privNameByIds) {
               sb.append(new StringBuilder().append(entity.getPrivName()).append(",").toString());
             }
             modulePriv.setPrivName(sb.toString());
           }
           sb.setLength(0);
         }
         if (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getDeptId()).booleanValue()) {
           List<Department> deptNameByIds = this.modulePrivMapper.getDeptNameByIds(modulePriv.getDeptId().split(","));
           if (deptNameByIds != null) {
             for (Department entity : deptNameByIds) {
               sb.append(new StringBuilder().append(entity.getDeptName()).append(",").toString());
             }
             modulePriv.setDeptName(sb.toString());
           }
           sb.setLength(0);
         }
       }
 
       if (com.myoa.util.common.StringUtils.checkNull(user.getAvatar()).booleanValue()) {
         user.setAvatar(user.getSex());
       }
     }
     return user;
   }
 
   public Users findUserByName(String byname, HttpServletRequest req)
   {
     Users user = this.usersMapper.findUserByName(byname);
     if (user != null) {
       String a = "";
       try {
         a = req.getSession().getAttribute("loginDateSouse").toString();
       } catch (NullPointerException e) {
         a = "1001";
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
         Department dep = this.departmentMapper.getDeptById(user.getDeptId().intValue());
         if (dep != null) {
           user.setDeptName(dep.getDeptName());
         }
 
       }
 
       Syslog sysLog = new Syslog();
       sysLog.setLogId(Integer.valueOf(0));
       sysLog.setUserId(user.getUserId());
       String ip = "";
       SysPara sysParaHost = this.sysParaMapper.querySysPara("IM_HOST");
 
       SysPara sysParaStutes = this.sysParaMapper.querySysPara("IM_STUTES");
       SysPara sysParaPort = this.sysParaMapper.querySysPara("IM_PORT");
 
       if ((sysParaStutes != null) && (!com.myoa.util.common.StringUtils.checkNull(sysParaStutes.getParaValue()).booleanValue())) {
         if ("1".equals(sysParaStutes.getParaValue())) {
           user.setGimPort(sysParaPort.getParaValue());
           user.setGimHost(sysParaHost.getParaValue());
           user.setImRegisterIp(sysParaHost.getParaValue());
         } else {
           user.setGimPort("");
           user.setGimHost("");
           user.setImRegisterIp("");
         }
       }
 
       sysLog.setTime(new Date());
 
       sysLog.setIp(ip);
       sysLog.setType(Integer.valueOf(1));
       sysLog.setRemark("");
       user.setImRegisterIp(ip);
       this.syslogMapper.save(sysLog);
     }
 
     return user;
   }
 
   public Users selectUserAllInfoByName(String byname, HttpServletRequest req)
   {
     Users user = this.usersMapper.selectUserAllInfoByName(byname);
     if (user != null) {
       String a = "";
       try {
         a = req.getSession().getAttribute("loginDateSouse").toString();
       } catch (NullPointerException e) {
         a = "1001";
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
         Department dep = this.departmentMapper.getDeptById(user.getDeptId().intValue());
         if (dep != null) {
           user.setDeptName(dep.getDeptName());
         }
 
       }
 
       Syslog sysLog = new Syslog();
       sysLog.setLogId(Integer.valueOf(0));
       sysLog.setUserId(user.getUserId());
       String ip = "";
       SysPara sysParaHost = this.sysParaMapper.querySysPara("IM_HOST");
 
       SysPara sysParaStutes = this.sysParaMapper.querySysPara("IM_STUTES");
       SysPara sysParaPort = this.sysParaMapper.querySysPara("IM_PORT");
 
       if ((sysParaStutes != null) && (!com.myoa.util.common.StringUtils.checkNull(sysParaStutes.getParaValue()).booleanValue())) {
         if ("1".equals(sysParaStutes.getParaValue())) {
           user.setGimPort(sysParaPort.getParaValue());
           user.setGimHost(sysParaHost.getParaValue());
           user.setImRegisterIp(sysParaHost.getParaValue());
         } else {
           user.setGimPort("");
           user.setGimHost("");
           user.setImRegisterIp("");
         }
       }
 
       sysLog.setTime(new Date());
 
       sysLog.setIp(IpAddr.getIpAddress(req));
       sysLog.setType(Integer.valueOf(1));
       String userAgent = req.getParameter("userAgent");
       if ("mobile".equals(userAgent))
         sysLog.setRemark("mobile");
       else {
         sysLog.setRemark("web");
       }
 
       StringBuffer url = req.getRequestURL();
 
       this.syslogMapper.save(sysLog);
     }
 
     return user;
   }
 
   public List<Users> getBySearch(Map<String, Object> maps)
   {
     return this.usersMapper.getBySearch(maps);
   }
 
   public List<Users> getByDeptId(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     List<Users> users = this.usersMapper.getByDeptId(maps);
     for (Users entity : users) {
       if ("tVHbkPWW57Hw.".equals(entity.getPassword())) {
         entity.setPassword("");
       }
 
       if (entity.getLastVisitTime() != null)
       {
         long times = System.currentTimeMillis() - entity.getLastVisitTime().getTime();
         long day = times / 86400000L;
         long hour = times / 3600000L - day * 24L;
         long min = times / 60000L - day * 24L * 60L - hour * 60L;
 
         StringBuffer sb = new StringBuffer();
         if (day > 0L) {
           sb.append(new StringBuilder().append(day).append("天").toString());
         }
         if (hour > 0L) {
           sb.append(new StringBuilder().append(hour).append("小时").toString());
         }
         if (min > 0L) {
           sb.append(new StringBuilder().append(min).append("分").toString());
         }
         entity.setIdleTime(sb.toString());
       } else {
         entity.setIdleTime("未曾登陆");
       }
       if (entity.getDeptId().intValue() == 0) {
         entity.setDeptName("离职或外部人员");
       }
     }
     return users;
   }
 
   public Users getByUid(int uid)
   {
     Users users = this.usersMapper.getByUid(uid);
     return users;
   }
 
   public List<Users> getAllByUid(String uids)
   {
     if (com.myoa.util.common.StringUtils.checkNull(uids).booleanValue()) {
       return new ArrayList();
     }
     String[] s = uids.split(",");
     List list = new ArrayList();
     for (int i = 0; i < s.length; i++) {
       Users users = this.usersMapper.getByUid(Integer.parseInt(s[i]));
       list.add(users);
     }
     return list;
   }
 
   public String getUserNameById(String userIds)
   {
     if (com.myoa.util.common.StringUtils.checkNull(userIds).booleanValue()) {
       return null;
     }
 
     StringBuffer sb = new StringBuffer();
     String[] temp = userIds.split(",");
     for (int i = 0; i < temp.length; i++) {
       if (!com.myoa.util.common.StringUtils.checkNull(temp[i]).booleanValue()) {
         String userName = this.usersMapper.getUsernameByUserId(temp[i]);
         if (!com.myoa.util.common.StringUtils.checkNull(userName).booleanValue()) {
           if (i < temp.length - 1)
             sb.append(userName).append(",");
           else {
             sb.append(userName);
           }
         }
       }
     }
     return sb.toString();
   }
 
   public String getUserNameById(String userIds, String flag)
   {
     if (com.myoa.util.common.StringUtils.checkNull(userIds).booleanValue()) {
       return null;
     }
 
     StringBuffer sb = new StringBuffer();
     String[] temp = userIds.split(flag);
     for (int i = 0; i < temp.length; i++) {
       if (!com.myoa.util.common.StringUtils.checkNull(temp[i]).booleanValue()) {
         String userName = this.usersMapper.getUsernameByUserId(temp[i]);
         if (!com.myoa.util.common.StringUtils.checkNull(userName).booleanValue()) {
           if (i < temp.length - 1)
             sb.append(userName).append(",");
           else {
             sb.append(userName);
           }
         }
       }
     }
     return sb.toString();
   }
 
   public String findUsersByuid(int[] uid)
   {
     if (uid == null) {
       return null;
     }
 
     StringBuffer sb = new StringBuffer();
     for (int i = 0; i < uid.length; i++) {
       if (uid.length == 1) {
         String userName = this.usersMapper.getUsernameById(uid[i]);
         return userName;
       }
       String userName = this.usersMapper.getUsernameById(uid[i]);
       if (i < uid.length - 1)
         sb.append(userName).append(",");
       else {
         sb.append(userName);
       }
     }
 
     return sb.toString();
   }
 
   public String findUsersByuid(String userIds)
   {
     if (com.myoa.util.common.StringUtils.checkNull(userIds).booleanValue()) {
       return null;
     }
 
     StringBuffer sb = new StringBuffer();
     String[] temp = userIds.split(",");
     for (int i = 0; i < temp.length; i++) {
       if (!com.myoa.util.common.StringUtils.checkNull(temp[i]).booleanValue()) {
         String userName = this.usersMapper.getUsernameById(temp[i]);
         if ((userName != "") && (userName != null)) {
           if (i < temp.length - 1)
             sb.append(userName).append(",");
           else {
             sb.append(userName);
           }
         }
       }
     }
     return sb.toString();
   }
 
   public String findUsersByuidReturn(String userIds)
   {
     if (com.myoa.util.common.StringUtils.checkNull(userIds).booleanValue()) {
       return "";
     }
 
     StringBuffer sb = new StringBuffer();
     String[] temp = userIds.split(",");
     for (int i = 0; i < temp.length; i++) {
       if (!com.myoa.util.common.StringUtils.checkNull(temp[i]).booleanValue()) {
         String userName = this.usersMapper.getUsernameById(temp[i]);
         if ((userName != "") && (userName != null)) {
           if (i < temp.length - 1)
             sb.append(userName).append(",");
           else {
             sb.append(userName);
           }
         }
       }
     }
     return sb.toString();
   }
 
   public Users findUsersByuserId(String userId)
   {
     Users users = this.usersMapper.findUsersByuserId(userId);
     if ((users.getPostId() != null) && (users.getPostId().intValue() != 0)) {
       String postName = this.managementMapper.getUserPostId(users.getPostId()) == null ? "" : this.managementMapper.getUserPostId(users.getPostId()).getPostName();
       users.setPostName(postName);
     }
     return users;
   }
 
   public List<Users> getUsersByCondition(Users users)
   {
     List usersList = new ArrayList();
 
     if ((users != null) && (users.getDeptId() != null))
       usersList = this.usersMapper.getUserByDeptId(users);
     else if ((users != null) && (users.getUserPriv() != null)) {
       usersList = this.usersMapper.getUserByRoleId(users);
     }
 
     return usersList;
   }
 
   public List<Users> getUsersOnline()
   {
     return this.usersMapper.getUserOnline();
   }
 
   public List<Users> getUserbyCondition(Map<String, Object> maps)
   {
     List <Users>usersList = this.usersMapper.getUserbyCondition(maps);
     StringBuffer s2 = new StringBuffer();
     for (Users users : usersList) {
       users.setDepartmentPhone(users.getDep().getTelNo());
       if ((users.getUserPrivOther() != null) && (!users.getUserPrivOther().equals(""))) {
         String userOther = users.getUserPrivOther();
         String[] strArray2 = userOther.split(",");
         for (int i = 0; i < strArray2.length; i++) {
           String name3 = this.usersPrivService.getPrivNameById(new int[] { Integer.parseInt(strArray2[i]) });
           if (name3 != null) {
             s2.append(name3);
             s2.append(",");
             users.setRoleAuxiliaryName(s2.toString());
           }
         }
       }
 
     }
 
     return usersList;
   }
 
   @Transactional
   public ToJson<Users> edit(Integer uid, String userName, String sex, Date birthday, String email, String oicqNo, String mobilNo, String telNoDept, String avatar)
   {
     ToJson tojson = new ToJson();
     Users u = new Users();
     u.setUid(uid);
     u.setUserName(userName);
     u.setSex(sex);
     u.setBirthday(birthday);
     u.setEmail(email);
     u.setOicqNo(oicqNo);
     u.setMobilNo(mobilNo);
     u.setTelNoDept(telNoDept);
     u.setAvatar(avatar);
     try {
       this.usersMapper.editUser(u);
       tojson.setFlag(0);
       tojson.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       tojson.setFlag(1);
       tojson.setMsg("false");
     }
     return tojson;
   }
 
   public Boolean checkPassWord(String userName, String password)
   {
     if ("".equals(password.trim())) {
       List usersList = this.usersMapper.checkPassWord(userName);
 
       if ((usersList != null) && (usersList.size() > 0))
       {
         if ("tVHbkPWW57Hw.".equals(((Users)usersList.get(0)).getPassword())) {
           return Boolean.valueOf(true);
         }
       }
 
     }
 
     if ((userName != null) && (password != null))
     {
       List<Users> usersList = this.usersMapper.checkPassWord(userName);
 
       if ((usersList != null) && (usersList.size() > 0))
       {
         for (Users users : usersList) {
           String truePassword1 = users.getPassword();
           try {
             String md5Password = Md5Crypt.md5Crypt(password.getBytes(), truePassword1);
             if ((md5Password != null) && (md5Password.equals(truePassword1)))
               return Boolean.valueOf(true);
           }
           catch (Exception e) {
             return Boolean.valueOf(false);
           }
         }
       }
 
     }
 
     return Boolean.valueOf(false);
   }
 
   public String getEncryptString(String password)
   {
     String md5WithSalt = null;
 
     if ((password != null) && (!"".equals(password.trim()))) {
       md5WithSalt = Md5Crypt.md5Crypt(password.trim().getBytes(), "$1$".concat(EncryptSalt.getRandomSalt(12)));
     }
 
     if ((password != null) && ("".equals(password.trim()))) {
       md5WithSalt = "tVHbkPWW57Hw.";
     }
     return md5WithSalt;
   }
 
   public List<Users> getUsersByDeptId(Integer deptId)
   {
     if (deptId != null) {
       return this.usersMapper.getUsersByDeptId(deptId);
     }
     return null;
   }
 
   public List<Users> getUserByDeptIds(String conditions, Integer flag)
   {
     if (com.myoa.util.common.StringUtils.checkNull(conditions).booleanValue()) {
       return null;
     }
 
     Map map = new HashMap();
     List l = new ArrayList();
     String[] temp = conditions.split(",");
     for (int i = 0; i < temp.length; i++) {
       if (!com.myoa.util.common.StringUtils.checkNull(temp[i]).booleanValue()) {
         List list = new ArrayList();
         List list1 = new ArrayList();
         switch (flag.intValue()) {
         case 1:
           map.put("deptId", temp[i]);
           list = this.usersMapper.getdepId(map);
           if (list.size() <= 0) continue;
           l.addAll(list); break;
         case 2:
           map.put("userPriv", temp[i]);
           list = this.usersMapper.getdepId(map);
 
           if (list.size() > 0) {
             l.addAll(list);
           }
           if (list1.size() <= 0) continue;
           l.addAll(list1); break;
         case 3:
           map.put("deptIdOther", temp[i]);
           list = this.usersMapper.getdepId(map);
           if (list.size() <= 0) break;
           l.addAll(list);
         case 4:
           map.put("userPrivOther", temp[i]);
           list = this.usersMapper.getdepId(map);
           if (list.size() > 0) {
             l.addAll(list);
           }
 
         }
 
       }
 
     }
 
     return l;
   }
 
   public List<Users> getUserByuserId(String userIds)
   {
     if (com.myoa.util.common.StringUtils.checkNull(userIds).booleanValue()) {
       return null;
     }
     List l = new ArrayList();
     String[] temp = userIds.split(",");
     for (int i = 0; i < temp.length; i++) {
       if (!com.myoa.util.common.StringUtils.checkNull(temp[i]).booleanValue()) {
         Users users = this.usersMapper.findUsersByuserId(temp[i]);
         if (users != null) {
           l.add(users);
         }
       }
     }
     return l;
   }
 
   public List<Users> getUserByuId(String uIds)
   {
     if (com.myoa.util.common.StringUtils.checkNull(uIds).booleanValue()) {
       return null;
     }
     List l = new ArrayList();
     String[] temp = uIds.split(",");
     for (int i = 0; i < temp.length; i++) {
       if (!com.myoa.util.common.StringUtils.checkNull(temp[i]).booleanValue()) {
         Users users = this.usersMapper.getByUid(Integer.parseInt(temp[i]));
         if (users != null) {
           l.add(users);
         }
       }
     }
     return l;
   }
 
   public String getUserPrivByuId(Integer uId)
   {
     return this.usersMapper.getUserPrivByuId(uId);
   }
 
   public List<Users> getNullPwUsers(Integer deptId)
   {
     return this.usersMapper.getNullPwUsers(deptId);
   }
 
   public List<Users> getPUsersByDeptId(Integer deptId)
   {
     if (deptId != null) {
       return this.usersMapper.getPUsersByDeptId(deptId);
     }
     return null;
   }
 
   public List<Users> getCUsersByDeptId(Integer deptId)
   {
     if (deptId != null) {
       return this.usersMapper.getPUsersByDeptId(deptId);
     }
     return null;
   }
 
   public List<Users> getTUsersByDeptId(Integer deptId)
   {
     if (deptId != null) {
       return this.usersMapper.getTUsersByDeptId(deptId);
     }
     return null;
   }
 
   public void clearPassword(String uids)
   {
     if (!com.myoa.util.common.StringUtils.checkNull(uids).booleanValue()) {
       String[] split = uids.split(",");
       if ((split != null) && (split.length > 0))
         this.usersMapper.clearPassword(split);
     }
   }
 
   public void clearOnLine(String uids)
   {
     if (!com.myoa.util.common.StringUtils.checkNull(uids).booleanValue()) {
       String[] split = uids.split(",");
       if ((split != null) && (split.length > 0))
         this.usersMapper.clearOnLine(split);
     }
   }
 
   public void setNotLogin(String uids)
   {
     if (!com.myoa.util.common.StringUtils.checkNull(uids).booleanValue()) {
       String[] split = uids.split(",");
       if ((split != null) && (split.length > 0))
         this.usersMapper.setNotLogin(split);
     }
   }
 
   public void editUsersDetId(Integer deptId, String uids)
   {
     if ((!com.myoa.util.common.StringUtils.checkNull(uids).booleanValue()) && (deptId != null)) {
       String[] split = uids.split(",");
       if ((split != null) && (split.length > 0))
         this.usersMapper.editUsersDetId(deptId, split);
     }
   }
 
   public List<Users> getUsersByUids(String uids)
   {
     if (!com.myoa.util.common.StringUtils.checkNull(uids).booleanValue()) {
       String[] split = uids.split(",");
       if ((split != null) && (split.length > 0)) {
         return this.usersMapper.getUsersByUids(split);
       }
       return null;
     }
 
     return null;
   }
 
   public List<Users> deptHaveUser(String deptNO)
   {
     return this.usersMapper.deptHaveUser(deptNO);
   }
 
   public void addU(Users users)
   {
     this.usersMapper.addU(users);
   }
 
   public List<Users> selectList(Users users)
   {
     List list = this.usersMapper.selectList(users);
     return list;
   }
 
   public ToJson<Users> queryUserByUserId(String userName)
   {
     ToJson json = new ToJson(1, "error");
     if (com.myoa.util.common.StringUtils.checkNull(userName).booleanValue()) {
       json.setMsg("查询不能为空");
       return json;
     }
     try {
       List<Users> userList = new ArrayList();
       if (!com.myoa.util.common.StringUtils.checkNull(userName).booleanValue()) {
         userList = this.usersMapper.queryUserByUserId(userName);
 
         for (Users u : userList) {
           if (com.myoa.util.common.StringUtils.checkNull(u.getAvatar()).booleanValue()) {
             u.setAvatar(u.getSex());
           }
         }
       }
       json.setObj(userList);
       json.setMsg("OK");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { new StringBuilder().append("UsersServiceImpl queryUserByUserId:").append(e).toString() });
     }
     return json;
   }
 
   public int queryCountByUserId(String userName)
   {
     int count = 0;
     if (!com.myoa.util.common.StringUtils.checkNull(userName).booleanValue()) {
       count = this.usersMapper.queryCountByUserId(userName);
     }
     return count;
   }
 
   public int getUserCount()
   {
     return this.usersMapper.getUserCount();
   }
 
   public String editPwd(HttpServletRequest request, Users user, String newPwd)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
     int uid = users.getUid().intValue();
     Users selectUser = this.usersMapper.getUserByUid(uid);
     String encryPwd = getEncryptString(newPwd);
     String uPass = user.getPassword();
     String sPass = selectUser.getPassword();
     if (uPass.equals("")) {
       if (sPass.equals("tVHbkPWW57Hw.")) {
         String lastPassTime = DateFormat.getCurrentTime();
         user.setPassword(encryPwd);
         Map map = new HashMap();
         map.put("pwd", encryPwd);
         map.put("uid", users.getUserId());
         map.put("lastPassTime", lastPassTime);
         int total = this.usersMapper.updatePwd(map);
         if (total > 0)
         {
           Syslog syslog = new Syslog();
           syslog.setUserId(new StringBuilder().append(users.getUserId()).append("").toString());
           syslog.setType(Integer.valueOf(14));
           syslog.setTypeName("修改登录密码");
           syslog.setRemark("");
           InetAddress currentIp = IpAddr.getCurrentIp();
           syslog.setIp(currentIp.toString().substring(1, currentIp.toString().length()));
           syslog.setTime(new Date(System.currentTimeMillis()));
           this.syslogMapper.save(syslog);
         }
       }
       else {
         return "原密码错误";
       }
     }
     else {
       if (sPass.equals("tVHbkPWW57Hw.")) {
         return "原密码错误";
       }
       String md5Password = Md5Crypt.md5Crypt(uPass.getBytes(), sPass);
       if (sPass.equals(md5Password))
       {
         String lastPassTime = DateFormat.getCurrentTime();
         user.setPassword(encryPwd);
         Map map = new HashMap();
         map.put("pwd", encryPwd);
         map.put("uid", users.getUserId());
         map.put("lastPassTime", lastPassTime);
         int total = this.usersMapper.updatePwd(map);
         if (total > 0)
         {
           Syslog syslog = new Syslog();
           syslog.setUserId(new StringBuilder().append(users.getUserId()).append("").toString());
           syslog.setType(Integer.valueOf(14));
           syslog.setTypeName("修改登录密码");
           syslog.setRemark("");
           InetAddress currentIp = IpAddr.getCurrentIp();
           syslog.setIp(currentIp.toString().substring(1, currentIp.toString().length()));
           syslog.setTime(new Date(System.currentTimeMillis()));
           this.syslogMapper.save(syslog);
         }
       } else {
         return "原密码错误";
       }
 
     }
 
     return "ok";
   }
 
   public Users getLoginUser(HttpServletRequest request)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     users.getUid();
     users.getUserId();
     users.getByname();
     StringBuffer sb = new StringBuffer();
     Users temp = this.usersMapper.findUsersByuserId(users.getUserId());
 
     if ((temp != null) && (!com.myoa.util.common.StringUtils.checkNull(temp.getUserPrivOther()).booleanValue())) {
       List <UserPriv>privNameByIds = this.modulePrivMapper.getPrivNameByIds(temp.getUserPrivOther().split(","));
       if (privNameByIds != null) {
         for (UserPriv entity : privNameByIds) {
           sb.append(new StringBuilder().append(entity.getPrivName()).append(",").toString());
         }
         users.setUserPrivOtherName(sb.toString());
       }
       sb.setLength(0);
     }
 
     return users;
   }
 
   public boolean isUserToMany(HttpServletRequest request)
   {
     int authUser = this.systemInfoService.getAuthUser(request);
 
     int userCount = getUserCount();
 
     return userCount >= authUser;
   }
 
   public ToJson<Users> getNewUsers()
   {
     ToJson json = new ToJson();
     try
     {
       List <Users>newUsers = this.usersMapper.getNewUsers();
       for (Users entity : newUsers) {
         if ("tVHbkPWW57Hw.".equals(entity.getPassword())) {
           entity.setPassword("");
         }
 
         if (entity.getLastVisitTime() != null)
         {
           long times = System.currentTimeMillis() - entity.getLastVisitTime().getTime();
           long day = times / 86400000L;
           long hour = times / 3600000L - day * 24L;
           long min = times / 60000L - day * 24L * 60L - hour * 60L;
 
           StringBuffer sb = new StringBuffer();
           if (day > 0L) {
             sb.append(new StringBuilder().append(day).append("天").toString());
           }
           if (hour > 0L) {
             sb.append(new StringBuilder().append(hour).append("小时").toString());
           }
           if (min > 0L) {
             sb.append(new StringBuilder().append(min).append("分").toString());
           }
           entity.setIdleTime(sb.toString());
         } else {
           entity.setIdleTime("未曾登陆");
         }
         if (entity.getDeptId().intValue() == 0) {
           entity.setDeptName("离职或外部人员");
         }
       }
       json.setObj(newUsers);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public int getCanLoginUser()
   {
     return this.usersMapper.getLoginUserCount().intValue();
   }
 
   public Users getUserByUid(int uid)
   {
     Users user = this.usersMapper.getUserByUid(uid);
     StringBuffer sb = new StringBuffer();
 
     if ((user != null) && (!com.myoa.util.common.StringUtils.checkNull(user.getUserPrivOther()).booleanValue())) {
       List <UserPriv>privNameByIds = this.modulePrivMapper.getPrivNameByIds(user.getUserPrivOther().split(","));
       if (privNameByIds != null) {
         for (UserPriv entity : privNameByIds) {
           sb.append(new StringBuilder().append(entity.getPrivName()).append(",").toString());
         }
         user.setUserPrivOtherName(sb.toString());
       }
       sb.setLength(0);
     }
 
     if (!com.myoa.util.common.StringUtils.checkNull(user.getDeptIdOther()).booleanValue()) {
       List <Department>deptNameByIds = this.modulePrivMapper.getDeptNameByIds(user.getDeptIdOther().split(","));
       if (deptNameByIds != null) {
         for (Department entity : deptNameByIds) {
           sb.append(new StringBuilder().append(entity.getDeptName()).append(",").toString());
         }
         user.setDeptOtherName(sb.toString());
       }
       sb.setLength(0);
     }
     ModulePriv modulePriv = new ModulePriv();
     modulePriv.setUid(Integer.valueOf(uid));
     modulePriv.setModuleId(Integer.valueOf(0));
     modulePriv = this.modulePrivMapper.getModulePrivSingle(modulePriv);
 
     if (modulePriv != null) {
       user.setModulePriv(modulePriv);
       if (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getUserId()).booleanValue()) {
         List <Users>usersByUids = this.usersMapper.getUsersByUids(modulePriv.getUserId().split(","));
         if (usersByUids != null) {
           for (Users entity : usersByUids) {
             sb.append(new StringBuilder().append(entity.getUserName()).append(",").toString());
           }
           modulePriv.setUserName(sb.toString());
         }
         sb.setLength(0);
       }
       if (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getPrivId()).booleanValue()) {
         List<UserPriv> privNameByIds = this.modulePrivMapper.getPrivNameByIds(modulePriv.getPrivId().split(","));
         if (privNameByIds != null) {
           for (UserPriv entity : privNameByIds) {
             sb.append(new StringBuilder().append(entity.getPrivName()).append(",").toString());
           }
           modulePriv.setPrivName(sb.toString());
         }
         sb.setLength(0);
       }
       if (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getDeptId()).booleanValue()) {
         List<Department> deptNameByIds = this.modulePrivMapper.getDeptNameByIds(modulePriv.getDeptId().split(","));
         if (deptNameByIds != null) {
           for (Department entity : deptNameByIds) {
             sb.append(new StringBuilder().append(entity.getDeptName()).append(",").toString());
           }
           modulePriv.setDeptName(sb.toString());
         }
         sb.setLength(0);
       }
     }
 
     return user;
   }
 
   public void updateUserTheme(Users users, HttpServletRequest request)
   {
     Users loginUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     loginUser.setMenuType(users.getMenuType());
     loginUser.setTheme(users.getTheme());
     loginUser.setBkground(users.getBkground());
     loginUser.setMenuExpand(users.getMenuExpand());
     loginUser.setPanel(users.getPanel());
     loginUser.setCallSound(users.getCallSound());
 
     this.usersMapper.updateUserTheme(loginUser);
     String theme = new StringBuilder().append("theme").append(users.getTheme()).toString();
     SessionUtils.putSession(request.getSession(), "InterfaceModel", theme);
   }
 
   public Users getLoginUserTheme(HttpServletRequest request)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Integer uid = users.getUid();
     Users users1 = this.usersMapper.getUserByUid(uid.intValue());
     if ((users1 != null) && (0 == users1.getTheme().byteValue())) {
       List interfaceModels = this.sysInterfaceMapper.getInterfaceInfo();
       users1.setTheme(Byte.valueOf((byte)Integer.parseInt(((InterfaceModel)interfaceModels.get(0)).getTheme())));
     }
     String theme = (String)SessionUtils.getSessionInfo(request.getSession(), "InterfaceModel", String.class);
     SessionUtils.putSession(request.getSession(), "InterfaceModel", theme);
 
     return users1;
   }
 
   public ToJson<Users> queryExportUsers(HttpServletRequest request, HttpServletResponse response, Users user, String sortType, String isExport, String notLogin)
   {
     ToJson json = new ToJson();
     try
     {
       Users sessionInfouser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String userFunctionStr = this.userFunctionMapper.getUserFuncIdStr(sessionInfouser.getUserId());
       String[] f = userFunctionStr.split(",");
       if (!Arrays.asList(f).contains("33")) {
         json.setFlag(1);
         json.setMsg("越权");
         return json;
       }
 
       Map map = new HashMap();
 
       map.put("byname", user.getByname());
       map.put("userName", user.getUserName());
       map.put("mobileNo", user.getMobilNo());
       map.put("sex", user.getSex());
       map.put("postPriv", user.getPostPriv());
       map.put("notViewUser", user.getNotViewUser());
       map.put("notViewTable", user.getNotViewTable());
       map.put("dutyType", user.getDutyType());
       map.put("sortType", sortType);
 
       if (!com.myoa.util.common.StringUtils.checkNull(notLogin).booleanValue()) {
         map.put("notLogin", notLogin);
       }
 
       if (!com.myoa.util.common.StringUtils.checkNull(user.getUserPrivs()).booleanValue()) {
         String[] userPrivsArr = user.getUserPrivs().split(",");
         map.put("userPrivs", userPrivsArr);
       }
 
       if (!com.myoa.util.common.StringUtils.checkNull(user.getDeptIds()).booleanValue()) {
         if ((user.getDeptId() != null) && (user.getDeptId().intValue() != 0)) {
           user.setDeptIds(new StringBuilder().append(user.getDeptIds()).append(user.getDeptId()).toString());
         }
         String[] deptIdsArr = user.getDeptIds().split(",");
         map.put("deptIds", deptIdsArr);
         if (deptIdsArr.length > 1)
           map.put("deptIda", Integer.valueOf(-1));
         else if (deptIdsArr.length == 1)
           map.put("deptIda", deptIdsArr[0]);
       }
       else if ((user.getDeptId() != null) && (user.getDeptId().intValue() > 0)) {
         user.setDeptIds(new StringBuilder().append(user.getDeptId()).append(",").toString());
         String[] deptIdsArr = user.getDeptIds().split(",");
         map.put("deptIds", deptIdsArr);
         map.put("deptIda", user.getDeptId());
       } else if ((user.getDeptId() != null) && (user.getDeptId().equals(Integer.valueOf(0)))) {
         map.put("deptIda", Integer.valueOf(0));
       }
 
       List<Users> users = this.usersMapper.queryExportUsers(map);
       for (Users entity : users) {
         if ("tVHbkPWW57Hw.".equals(entity.getPassword())) {
           entity.setPassword("");
         }
 
         if (entity.getLastVisitTime() != null)
         {
           long times = System.currentTimeMillis() - entity.getLastVisitTime().getTime();
           long day = times / 86400000L;
           long hour = times / 3600000L - day * 24L;
           long min = times / 60000L - day * 24L * 60L - hour * 60L;
 
           StringBuffer sb = new StringBuffer();
           if (day > 0L) {
             sb.append(new StringBuilder().append(day).append("天").toString());
           }
           if (hour > 0L) {
             sb.append(new StringBuilder().append(hour).append("小时").toString());
           }
           if (min > 0L) {
             sb.append(new StringBuilder().append(min).append("分").toString());
           }
           entity.setIdleTime(sb.toString());
         } else {
           entity.setIdleTime("未曾登陆");
         }
         if (entity.getDeptId().intValue() == 0) {
           entity.setDeptName("离职或外部人员");
         }
       }
       if (users != null) {
         json.setObj(users);
         json.setFlag(0);
         json.setMsg("ok");
       } else {
         json.setFlag(1);
         json.setMsg("err");
       }
 
       if ("yes".equals(isExport)) {
         HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("OA用户信息", 9);
         String[] secondTitles = { "id", "用户名", "部门", "姓名", "性别", "生日", "角色", "用户排序号", "管理范围", "手机", "ip", "工作电话", "工作传真", "家庭地址", "邮编", "家庭电话", "E-mail", "QQ", "MSN" };
         HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
         String[] beanProperty = { "uid", "byname", "deptName", "userName", "sexName", "birthdayStr", "userPrivName", "userNo", "postPriv", "mobilNo", "bindIp", "telNoDept", "faxNoDept", "addHome", "postNoHome", "telNoHome", "email", "oicqNo", "msn" };
 
         HSSFWorkbook workbook = ExcelUtil.exportExcelData(workbook2, users, beanProperty);
         ServletOutputStream out = response.getOutputStream();
 
         String filename = "OA用户信息表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel");
         response.setHeader("content-disposition", new StringBuilder().append("attachment;filename=").append(filename).toString());
         workbook.write(out);
         out.close();
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<Users> insertImportUsers(HttpServletRequest request, HttpServletResponse response, HttpSession session, MultipartFile file, String ifUpdate, String psWord, String userPrivName)
   {
     ToJson json = new ToJson();
     try
     {
       ResourceBundle rb = ResourceBundle.getBundle("upload");
       String osName = System.getProperty("os.name");
       StringBuffer path = new StringBuffer();
       if (osName.toLowerCase().startsWith("win"))
         path = path.append(rb.getString("upload.win"));
       else {
         path = path.append(rb.getString("upload.linux"));
       }
 
       if (file.isEmpty()) {
         json.setMsg("请上传文件！");
         json.setFlag(1);
         return json;
       }
       String fileName = file.getOriginalFilename();
       if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
         String uuid = UUID.randomUUID().toString().replaceAll("-", "");
         int pos = fileName.indexOf(".");
         String extName = fileName.substring(pos);
         String newFileName = new StringBuilder().append(uuid).append(extName).toString();
         File dest = new File(path.toString(), newFileName);
         file.transferTo(dest);
 
         String readPath = path.append(System.getProperty("file.separator")).append(newFileName).toString();
         InputStream in = new FileInputStream(readPath);
         HSSFWorkbook excelObj = new HSSFWorkbook(in);
         HSSFSheet sheetObj = excelObj.getSheetAt(0);
         Row row = sheetObj.getRow(0);
         int colNum = row.getPhysicalNumberOfCells();
         int lastRowNum = sheetObj.getLastRowNum();
         List saveList = new ArrayList();
         int updateCount = 0;
         int insertCount = 0;
         Users entity = null;
         UserFunction userFunction = new UserFunction();
         for (int i = 1; i <= lastRowNum; i++) {
           entity = new Users();
           row = sheetObj.getRow(i);
           if (row != null) {
             for (int j = 0; j < colNum; j++) {
               Cell cell = row.getCell(j);
               if (cell != null) {
                 if (j != 5) {
                   cell.setCellType(1);
                 }
                 switch (j) {
                 case 0:
                   entity.setByname(cell.getStringCellValue());
                   break;
                 case 1:
                   if (cell.getStringCellValue().trim().equals("")) {
                     if (psWord.equals("")) continue;
                     entity.setPassword(psWord);
                   }
                   else {
                     entity.setPassword(cell.getStringCellValue().trim());
                   }
                   break;
                 case 2:
                   entity.setDeptName(cell.getStringCellValue());
                   break;
                 case 3:
                   entity.setUserName(cell.getStringCellValue());
                   break;
                 case 4:
                   String sex = cell.getStringCellValue();
                   if ("男".equals(sex)) {
                     entity.setAvatar("0");
                     entity.setSex("0");
                   } else if ("女".equals(sex)) {
                     entity.setAvatar("1");
                     entity.setSex("1");
                   }
                   if (!com.myoa.util.common.StringUtils.checkNull(sex).booleanValue()) continue;
                   entity.setAvatar("0");
                   entity.setSex("0"); break;
                 case 5:
                   entity.setBirthday(cell.getDateCellValue());
                   break;
                 case 6:
                   if (com.myoa.util.common.StringUtils.checkNull(cell.getStringCellValue().trim()).booleanValue())
                     entity.setUserPrivName(userPrivName);
                   else {
                     entity.setUserPrivName(cell.getStringCellValue().trim());
                   }
                   break;
                 case 7:
                   entity.setUserNo(Short.valueOf(com.myoa.util.common.StringUtils.checkNull(cell.getStringCellValue()).booleanValue() ? "10" : cell.getStringCellValue().trim()));
                   break;
                 case 8:
                   String postPrivName = cell.getStringCellValue();
                   if (postPrivName != null) {
                     if ("全体".equals(postPrivName))
                       entity.setPostPriv("1");
                     else
                       entity.setPostPriv("0");
                   }
                   else {
                     entity.setPostPriv("0");
                   }
                   break;
                 case 9:
                   entity.setMobilNo(cell.getStringCellValue());
                   break;
                 case 10:
                   entity.setBindIp(cell.getStringCellValue());
                   break;
                 case 11:
                   entity.setTelNoDept(cell.getStringCellValue());
                   break;
                 case 12:
                   entity.setFaxNoDept(cell.getStringCellValue());
                   break;
                 case 13:
                   entity.setAddHome(cell.getStringCellValue());
                   break;
                 case 14:
                   entity.setPostNoHome(cell.getStringCellValue());
                   break;
                 case 15:
                   entity.setTelNoHome(cell.getStringCellValue());
                   break;
                 case 16:
                   entity.setEmail(cell.getStringCellValue());
                   break;
                 case 17:
                   entity.setOicqNo(cell.getStringCellValue());
                   break;
                 case 18:
                   entity.setMsn(cell.getStringCellValue());
                   break;
                 case 19:
                   entity.setIdNumber(cell.getStringCellValue());
                   break;
                 case 20:
                   entity.setTraNumber(cell.getStringCellValue());
                   break;
                 case 21:
                   entity.setSubject(cell.getStringCellValue());
                 }
               }
 
             }
 
           }
 
           Users usersByuserId = this.usersMapper.getUsersBybyname(entity.getByname());
           if ((usersByuserId != null) && (usersByuserId.getByname().equals(entity.getByname()))) {
             entity.setSaveMsg("此用户名已存在，请修改");
             saveList.add(entity);
           }
           else
           {
             if (entity.getPassword() != null)
               entity.setPassword(getEncryptString(entity.getPassword().trim()));
             else {
               entity.setPassword("tVHbkPWW57Hw.");
             }
 
             if (entity.getUserName() != null) {
               String fistSpell = PinYinUtil.getFirstSpell(entity.getUserName());
               StringBuffer sb = new StringBuffer();
               for (int j = 0; j < fistSpell.length(); j++) {
                 sb.append(new StringBuilder().append(fistSpell.charAt(j)).append("*").toString());
               }
               entity.setUserNameIndex(sb.toString());
             }
 
             if (entity.getDeptName() != null) {
               Department d = new Department();
               d.setDeptName(entity.getDeptName());
               List parentList = this.departmentMapper.getDeptIdByDeptName(entity.getDeptName());
               String deptId = "";
               if (parentList.size() > 0) {
                 deptId = (String)parentList.get(0);
               }
               if ((deptId != null) && (deptId != "")) {
                 entity.setDeptId(Integer.valueOf(deptId));
               } else {
                 entity.setSaveMsg("失败，部门不存在");
                 saveList.add(entity);
                 continue;
               }
             }
 
             if (entity.getUserPrivName() != null) {
               UserPriv userPriv = null;
               try {
                 userPriv = this.userPrivMapper.getUserPrivByName(entity.getUserPrivName());
               } catch (TooManyResultsException exception) {
                 List userPrivsByName = this.userPrivMapper.getUserPrivsByName(entity.getUserPrivName());
                 if ((userPrivsByName != null) && (userPrivsByName.size() > 0)) {
                   userPriv = (UserPriv)userPrivsByName.get(0);
                 }
               }
               if (userPriv != null) {
                 entity.setUserPriv(userPriv.getUserPriv());
                 entity.setUserPrivNo(userPriv.getPrivNo());
                 if (userPriv.getFuncIdStr() != null)
                   userFunction.setUserFunCidStr(userPriv.getFuncIdStr());
                 else
                   userFunction.setUserFunCidStr("1,");
               }
               else {
                 List alluserPriv = this.userPrivMapper.getAlluserPriv(null);
                 Collections.sort(alluserPriv, new Comparator<UserPriv>()
                 {
                   public int compare(UserPriv o1, UserPriv o2) {
                     if (o1.getPrivNo().shortValue() > o2.getPrivNo().shortValue())
                       return 1;
                     if (o1.getPrivNo().shortValue() < o2.getPrivNo().shortValue()) {
                       return -1;
                     }
                     return 0;
                   }
                 });
                 UserPriv userPriv1 = (UserPriv)alluserPriv.get(alluserPriv.size() - 1);
                 entity.setUserPriv(userPriv1.getUserPriv());
                 entity.setUserPrivNo(userPriv1.getPrivNo());
                 entity.setUserPrivName(userPriv1.getPrivName());
                 if (userPriv1.getFuncIdStr() != null)
                   userFunction.setUserFunCidStr(userPriv1.getFuncIdStr());
                 else {
                   userFunction.setUserFunCidStr("1,");
                 }
               }
             }
             entity.setNotLogin(Byte.valueOf("0"));
             entity.setImRange(Byte.valueOf("1"));
             Users userByName = this.usersMapper.findUserByName(entity.getByname());
             if ((userByName != null) && (!com.myoa.util.common.StringUtils.checkNull(ifUpdate).booleanValue()) && (ifUpdate.equals("yes")))
             {
               entity.setUid(userByName.getUid());
               entity.setUserId(userByName.getUserId());
               this.usersMapper.editUser(entity);
 
               userFunction.setUid(entity.getUid().intValue());
               userFunction.setUserId(entity.getUserId());
               this.userFunctionMapper.updateUserFun(userFunction);
 
               entity.setSaveMsg("更新成功");
               saveList.add(entity);
               updateCount++; } else {
               if (userByName != null)
                 continue;
               this.usersMapper.insert(entity);
 
               entity.setUserId(entity.getUid().toString());
               this.usersMapper.editUser(entity);
 
               UserExt userExt = new UserExt();
               userExt.setDutyType(entity.getDutyType());
               userExt.setUid(entity.getUid());
               userExt.setUserId(entity.getUserId());
               this.userExtMapper.addUserExt(userExt);
 
               userFunction.setUid(entity.getUid().intValue());
               userFunction.setUserId(entity.getUserId());
               this.userFunctionMapper.insertUserFun(userFunction);
 
               entity.setSaveMsg("保存成功");
               saveList.add(entity);
               insertCount++;
             }
           }
         }
         if ((saveList != null) && (saveList.size() > 0) && (saveList.get(0) != null)) {
           ((Users)saveList.get(0)).setInsertCount(insertCount);
           ((Users)saveList.get(0)).setUpdateCount(updateCount);
         }
 
         json.setObj(saveList);
         json.setFlag(0);
         json.setMsg("ok");
         dest.delete();
       } else {
         json.setMsg("文件类型不正确！");
         json.setFlag(1);
         return json;
       }
     }
     catch (Exception e) {
       e.printStackTrace();
       json.setMsg("数据保存异常");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<Users> editUserBatch(Users user, UserExt userExt, String modulePrivIds, String privIds, String deptIds, String uids, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     List<String> uidsList = new ArrayList();
     StringBuffer sb = new StringBuffer();
     if (!com.myoa.util.common.StringUtils.checkNull(uids).booleanValue()) {
       uidsList.addAll(Arrays.asList(uids.split(",")));
       List<Users> usersByUids = this.usersMapper.getUsersByUids(uids.split(","));
       sb.append("人员：");
       for (Users entity : usersByUids) {
         sb.append(new StringBuilder().append(entity.getUserName()).append(",").toString());
       }
 
     }
 
     if (!com.myoa.util.common.StringUtils.checkNull(deptIds).booleanValue()) {
       String[] deptIdsArr = deptIds.split(",");
       sb.append(" 部门：");
       for (String did : deptIdsArr) {
         Department deptById = this.departmentMapper.getDeptById(Integer.parseInt(did));
         sb.append(new StringBuilder().append(deptById.getDeptName()).append(",").toString());
       }
       List<Users> usersByDeptIds = this.usersMapper.getUsersByDeptIds(deptIdsArr);
       if ((usersByDeptIds != null) && (usersByDeptIds.size() > 0)) {
         for (Users entity : usersByDeptIds) {
           uidsList.add(entity.getUid().toString());
         }
       }
     }
 
     if (!com.myoa.util.common.StringUtils.checkNull(privIds).booleanValue()) {
       String[] privIdsArr = privIds.split(",");
       sb.append(" 角色：");
       for (String pid : privIdsArr) {
         String privNameById = this.userPrivMapper.getPrivNameById(Integer.valueOf(pid));
         sb.append(privNameById);
       }
       List <Users>usersByPrivIds = this.usersMapper.getUsersByPrivIds(privIdsArr);
       if ((usersByPrivIds != null) && (usersByPrivIds.size() > 0)) {
         for (Users entity : usersByPrivIds) {
           uidsList.add(entity.getUid().toString());
         }
       }
     }
 
     UserFunction userFunction = new UserFunction();
     ModulePriv modulePriv = null;
     if (!com.myoa.util.common.StringUtils.checkNull(modulePrivIds).booleanValue()) {
       modulePriv = new ModulePriv();
       modulePriv.setPrivId(modulePrivIds);
     }
 
     if (user != null)
     {
       if ((user.getPassword() != null) && (!"tVHbkPWW57Hw.".equals(user.getPassword()))) {
         String password = user.getPassword();
         password = getEncryptString(password.trim());
         user.setPassword(password);
       }
 
       if (user.getUserPriv() != null) {
         UserPriv userPriv = this.userPrivMapper.selectByPrimaryKey(user.getUserPriv().intValue());
         if (userPriv != null) {
           user.setUserPrivNo(userPriv.getPrivNo());
           user.setUserPrivName(userPriv.getPrivName());
 
           if (!com.myoa.util.common.StringUtils.checkNull(userPriv.getFuncIdStr()).booleanValue()) {
             userFunction.setUserFunCidStr(userPriv.getFuncIdStr());
           }
         }
       }
 
       if ((user.getDeptId() != null) && (user.getDeptId().intValue() == -1)) {
         user.setDeptId(null);
       }
       if ((user.getPostPriv() != null) && (user.getPostPriv().equals(""))) {
         user.setPostPriv(null);
       }
       if ((user.getIsLunar() != null) && (user.getIsLunar().equals(""))) {
         user.setIsLunar(null);
       }
       if ((user.getMobilNoHidden() != null) && (user.getMobilNoHidden().equals(""))) {
         user.setMobilNoHidden(null);
       }
       if ((user.getNotViewTable() != null) && (user.getNotViewTable().equals("")))
         user.setNotViewTable(null);
     }
     try
     {
       if ((uidsList != null) && (uidsList.size() > 0)) {
         if ((user.getDeptId() != null) && (user.getDeptId().equals(Integer.valueOf(0)))) {
           user.setNotLogin(Byte.valueOf("1"));
           user.setNotMobileLogin(Integer.valueOf(1));
         }
         this.usersMapper.editUserBatch(uidsList, user);
 
         if (userExt != null) {
           this.userExtMapper.updateUserExtByUids(uidsList, userExt);
         }
 
         if ((userFunction != null) && (userFunction.getUserFunCidStr() != null)) {
           this.userFunctionMapper.updateUserFunByUids(uidsList, userFunction);
         }
 
         if (modulePriv != null) {
           for (String uid : uidsList) {
             modulePriv.setUid(Integer.valueOf(uid));
             modulePriv.setModuleId(Integer.valueOf(0));
             modulePriv.setDeptPriv("1");
             modulePriv.setRolePriv("2");
 
             ModulePriv modulePrivByUid = this.modulePrivMapper.getModulePrivSingle(modulePriv);
             if (modulePrivByUid != null) {
               if ((!com.myoa.util.common.StringUtils.checkNull(modulePriv.getDeptId()).booleanValue()) || (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getPrivId()).booleanValue()) || (!com.myoa.util.common.StringUtils.checkNull(modulePriv.getUserId()).booleanValue()))
                 this.modulePrivMapper.updateModulePriv(modulePriv);
             }
             else {
               this.modulePrivMapper.addModulePriv(modulePriv);
             }
           }
         }
         Users nowuUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
         Syslog syslog = new Syslog();
         syslog.setUserId(nowuUser.getUserId());
         syslog.setType(Integer.valueOf(19));
         syslog.setTypeName("用户批量设置");
         syslog.setRemark(sb.toString());
         InetAddress currentIp = IpAddr.getCurrentIp();
         syslog.setIp(currentIp.toString().substring(1, currentIp.toString().length()));
         syslog.setTime(new Date(System.currentTimeMillis()));
         this.syslogMapper.save(syslog);
         json.setFlag(0);
         json.setMsg("OK");
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public Users getUsersByuserId(String userId)
   {
     return this.usersMapper.getUsersByuserId(userId);
   }
 
   public List<Users> selectFileUserSignerAll()
   {
     return this.usersMapper.selectFileUserSignerAll();
   }
 
   public List<Users> selectFileUserSigner(Map<String, Object> mapUser)
   {
     return this.usersMapper.selectFileUserSigner(mapUser);
   }
 
   public ToJson<Users> singleSearch(String searchData)
   {
     ToJson json = new ToJson();
     try {
       if (!com.myoa.util.common.StringUtils.checkNull(searchData).booleanValue()) {
         List users = this.usersMapper.singleSearch(searchData);
         json.setObj(users);
         json.setFlag(0);
         json.setMsg("ok");
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("ok");
     }
     return json;
   }
 
   public ToJson<Object> userAnalysis(String type)
   {
     List<Users> users = this.usersMapper.getAllInfo();
     ToJson data = new ToJson();
     HashMap analysis = new HashMap();
     if ("age".equals(type))
     {
       Date temp = new Date();
       for (Users u : users) {
         Date birthday = u.getBirthday();
         if (birthday != null)
         {
        	        long years = (temp.getTime() - birthday.getTime()) / 86400000L / 365L;

	           int i = (int)years / 5;
           if ((i >= 0) && (analysis.containsKey(new StringBuilder().append("age").append(i * 5).toString())))
             analysis.put(new StringBuilder().append("age").append(i * 5).toString(), Integer.valueOf(((Integer)analysis.get(new StringBuilder().append("age").append(i * 5).toString())).intValue() + 1));
           else {
             analysis.put(new StringBuilder().append("age").append(i * 5).toString(), Integer.valueOf(1));
           }
         }
       }
       data.setObject(analysis);
       data.setFlag(0);
       return data;
     }if ("sex".equals(type)) {
       for (Users u : users) {
         String sex = "0".equals(u.getSex()) ? "男" : "女";
         if (sex != "") {
           if (analysis.containsKey(sex))
             analysis.put(sex, Integer.valueOf(((Integer)analysis.get(sex)).intValue() + 1));
           else {
             analysis.put(sex, Integer.valueOf(1));
           }
         }
       }
       data.setObject(analysis);
       data.setFlag(0);
       return data;
     }
     data.setMsg("参数错误");
 
     data.setFlag(1);
     return data;
   }
 
   public Users getUserByUserName(String userName)
   {
     return this.usersMapper.getUserByUserName(userName);
   }
 
   public void deleteUserByDeptId(String deptId)
   {
     this.usersMapper.deleteUserByDeptId(deptId);
   }
 
   public ToJson<Users> editUserExt(HttpServletRequest request, MultipartFile imageFile, Users users, UserExt userExt)
     throws IllegalStateException, IOException
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (imageFile != null) {
         String imageType = imageFile.getContentType();
         boolean b = FileUploadUtil.allowUpload(imageType);
         if (!b) {
           toJson.setMsg("图片格式不正确");
           return toJson;
         }
       }
       String realPath = request.getSession().getServletContext().getRealPath("/");
       String resourcePath = "uiuser";
       Users usersTemp = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       users.setUid(usersTemp.getUid());
 
       Users temp = this.usersMapper.findUsersByuserId(usersTemp.getUserId());
       if ((temp != null) && 
         (!com.myoa.util.common.StringUtils.checkNull(temp.getPhoto()).booleanValue())) {
         File temp1 = new File(new StringBuilder().append(realPath).append(resourcePath).append(temp.getPhoto()).toString());
         if (temp1.exists()) {
           temp1.delete();
         }
 
       }
 
       if (imageFile != null) {
         if (FileUploadUtil.allowUpload(imageFile.getContentType())) {
           String fileName = FileUploadUtil.rename(imageFile.getOriginalFilename());
           File dir = new File(new StringBuilder().append(realPath).append(resourcePath).toString());
           if (!dir.exists()) {
             dir.mkdirs();
           }
           File file = new File(dir, fileName);
           imageFile.transferTo(file);
           users.setAvatar(fileName);
         }
       }
       else users.setAvatar(usersTemp.getSex());
 
       users.setAvatar128("");
       int count = this.usersMapper.editUser(users);
       userExt.setUid(usersTemp.getUid());
       userExt.setUserId(usersTemp.getUserId());
       count += this.userExtMapper.updateUserExtByUid(userExt);
       if (count > 1) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson editUserSign(HttpServletRequest request, String sign)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if (!com.myoa.util.common.StringUtils.checkNull(users.getUserId()).booleanValue()) {
       Users u = new Users();
       u.setUid(users.getUid());
       u.setMyStatus(sign);
       this.usersMapper.editUser(u);
     }
     ToJson toJson = new ToJson();
     toJson.setFlag(0);
     toJson.setMsg("Ok");
     return toJson;
   }
 
   public ToJson<Users> insertImportUsersByEdu1(HttpServletRequest request, HttpServletResponse response, HttpSession session, MultipartFile file, String ifUpdate, String pw, String uPrivName)
   {
     ToJson json = new ToJson();
     try
     {
       StringBuffer path = getPath();
 
       String fileName = file.getOriginalFilename();
       if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
         String uuid = UUID.randomUUID().toString().replaceAll("-", "");
         String extName = fileName.substring(fileName.lastIndexOf(".") + 1);
 
         String newFileName = new StringBuilder().append(uuid).append(extName).toString();
         File dest = new File(path.toString(), newFileName);
         file.transferTo(dest);
 
         String readPath = path.append(System.getProperty("file.separator")).append(newFileName).toString();
         InputStream in = new FileInputStream(readPath);
         HSSFWorkbook excelObj = new HSSFWorkbook(in);
         HSSFSheet sheetObj = excelObj.getSheetAt(0);
         Row row = sheetObj.getRow(0);
         int colNum = row.getPhysicalNumberOfCells();
         int lastRowNum = sheetObj.getLastRowNum();
         List saveList = new ArrayList();
         int updateCount = 0;
         int insertCount = 0;
         Users entity = null;
         UserFunction userFunction = new UserFunction();
         for (int i = 1; i <= lastRowNum; i++) {
           entity = new Users();
           row = sheetObj.getRow(i);
           if (row != null) {
             for (int j = 0; j < colNum; j++) {
               Cell cell = row.getCell(j);
               if (cell != null) {
                 if (j != 5) {
                   cell.setCellType(1);
                 }
                 switch (j) {
                 case 0:
                   if (cell.getCellType() == 1) {
                     entity.setByname(cell.getStringCellValue().trim()); } else {
                     if (cell.getCellType() != 0) continue;
                     entity.setByname(String.valueOf(cell.getNumericCellValue()).trim()); } break;
                 case 1:
                   if (cell.getStringCellValue().trim().equals("")) {
                     if (pw.equals("")) continue;
                     entity.setPassword(pw);
                   }
                   else {
                     entity.setPassword(cell.getStringCellValue().trim());
                   }
                   break;
                 case 2:
                   entity.setDeptName(cell.getStringCellValue().trim());
                   break;
                 case 3:
                   entity.setUserName(cell.getStringCellValue().trim());
                   break;
                 case 4:
                   String sex = cell.getStringCellValue().trim();
                   if ("男".equals(sex)) {
                     entity.setSex("0");
                     entity.setAvatar("0"); } else {
                     if (!"女".equals(sex)) continue;
                     entity.setSex("1");
                     entity.setAvatar("1"); } break;
                 case 5:
                   entity.setBirthday(cell.getDateCellValue());
                   break;
                 case 6:
                   if (com.myoa.util.common.StringUtils.checkNull(cell.getStringCellValue().trim()).booleanValue())
                     entity.setUserPrivName(uPrivName);
                   else {
                     entity.setUserPrivName(cell.getStringCellValue().trim());
                   }
                   break;
                 case 7:
                   entity.setUserNo(Short.valueOf(cell.getStringCellValue() == "" ? "10" : cell.getStringCellValue().trim()));
                   break;
                 case 8:
                   String postPrivName = cell.getStringCellValue().trim();
                   if (postPrivName != null) {
                     if ("全体".equals(postPrivName))
                       entity.setPostPriv("1");
                     else
                       entity.setPostPriv("0");
                   }
                   else {
                     entity.setPostPriv("0");
                   }
                   break;
                 case 9:
                   entity.setMobilNo(cell.getStringCellValue().trim());
                   break;
                 case 10:
                   entity.setBindIp(cell.getStringCellValue().trim());
                   break;
                 case 11:
                   entity.setTelNoDept(cell.getStringCellValue().trim());
                   break;
                 case 12:
                   entity.setFaxNoDept(cell.getStringCellValue().trim());
                   break;
                 case 13:
                   entity.setAddHome(cell.getStringCellValue().trim());
                   break;
                 case 14:
                   entity.setPostNoHome(cell.getStringCellValue().trim());
                   break;
                 case 15:
                   entity.setTelNoHome(cell.getStringCellValue().trim());
                   break;
                 case 16:
                   entity.setEmail(cell.getStringCellValue().trim());
                   break;
                 case 17:
                   entity.setOicqNo(cell.getStringCellValue().trim());
                   break;
                 case 18:
                   entity.setMsn(cell.getStringCellValue().trim());
                   break;
                 case 19:
                   entity.setIdNumber(cell.getStringCellValue().trim());
                   break;
                 case 20:
                   entity.setTraNumber(cell.getStringCellValue().trim());
                   break;
                 case 21:
                   entity.setSubject(cell.getStringCellValue().trim());
                 }
               }
 
             }
 
           }
 
           Users usersByuserId = this.usersMapper.getUsersBybyname(entity.getByname());
           if ((usersByuserId != null) && (usersByuserId.getByname().equals(entity.getByname()))) {
             this.usersMapper.updateUserByName(entity);
             entity.setSaveMsg("更新成功");
             saveList.add(entity);
             updateCount++;
           }
 
           if (entity.getPassword() != null)
             entity.setPassword(getEncryptString(entity.getPassword().trim()));
           else {
             entity.setPassword("tVHbkPWW57Hw.");
           }
 
           if (entity.getUserName() != null) {
             String fistSpell = PinYinUtil.getFirstSpell(entity.getUserName());
             StringBuffer sb = new StringBuffer();
             for (int j = 0; j < fistSpell.length(); j++) {
               sb.append(new StringBuilder().append(fistSpell.charAt(j)).append("*").toString());
             }
             entity.setUserNameIndex(sb.toString());
           }
 
           if (entity.getDeptName() != null) {
             Department d = new Department();
             d.setDeptName(entity.getDeptName());
             List nameList = this.departmentMapper.getDeptIdByDeptName(entity.getDeptName());
             String deptId = "";
             if (nameList.size() > 0) {
               deptId = (String)nameList.get(0);
             }
             if ((deptId != null) && (deptId != "")) {
               entity.setDeptId(Integer.valueOf(deptId));
             } else {
               entity.setSaveMsg("失败，部门不存在");
               saveList.add(entity);
               continue;
             }
           }
 
           if (entity.getUserPrivName() != null) {
             UserPriv userPriv = this.userPrivMapper.getUserPrivByName(entity.getUserPrivName());
             if (userPriv != null) {
               entity.setUserPriv(userPriv.getUserPriv());
               entity.setUserPrivNo(userPriv.getPrivNo());
               if (userPriv.getFuncIdStr() != null)
                 userFunction.setUserFunCidStr(userPriv.getFuncIdStr());
               else
                 userFunction.setUserFunCidStr("1,");
             }
             else {
               List alluserPriv = this.userPrivMapper.getAlluserPriv(null);
               Collections.sort(alluserPriv, new Comparator<UserPriv>()
               {
                 public int compare(UserPriv o1, UserPriv o2) {
                   if (o1.getPrivNo().shortValue() > o2.getPrivNo().shortValue())
                     return 1;
                   if (o1.getPrivNo().shortValue() < o2.getPrivNo().shortValue()) {
                     return -1;
                   }
                   return 0;
                 }
               });
               UserPriv userPriv1 = (UserPriv)alluserPriv.get(alluserPriv.size() - 1);
               entity.setUserPriv(userPriv1.getUserPriv());
               entity.setUserPrivNo(userPriv1.getPrivNo());
               entity.setUserPrivName(userPriv1.getPrivName());
               if (userPriv1.getFuncIdStr() != null)
                 userFunction.setUserFunCidStr(userPriv1.getFuncIdStr());
               else {
                 userFunction.setUserFunCidStr("1,");
               }
             }
           }
           entity.setNotLogin(Byte.valueOf("0"));
           entity.setImRange(Byte.valueOf("1"));
           Users userByName = this.usersMapper.findUserByName(entity.getByname());
           if ((userByName != null) && (!com.myoa.util.common.StringUtils.checkNull(ifUpdate).booleanValue()) && (ifUpdate.equals("yes")))
           {
             entity.setUid(userByName.getUid());
             entity.setUserId(userByName.getUserId());
             this.usersMapper.editUser(entity);
 
             userFunction.setUid(entity.getUid().intValue());
             userFunction.setUserId(entity.getUserId());
             this.userFunctionMapper.updateUserFun(userFunction);
 
             entity.setSaveMsg("更新成功");
             saveList.add(entity);
             updateCount++;
           } else if (userByName == null) {
             if (com.myoa.util.common.StringUtils.checkNull(entity.getByname()).booleanValue())
             {
               String maxUserId = this.usersMapper.getMaxUserId();
 
               String serial = maxUserId.substring(maxUserId.length() - 3);
 
               String rule = maxUserId.substring(0, maxUserId.length() - 3);
               int newSerial = Integer.parseInt(serial) + 1;
               serial = new StringBuilder().append(org.apache.commons.lang.StringUtils.repeat("0", 3 - String.valueOf(newSerial).length())).append(newSerial).toString();
               String userId = new StringBuilder().append(rule).append(serial).toString();
               entity.setByname(userId);
             } else {
               entity.setUserId(entity.getByname());
             }
 
             this.usersMapper.insert(entity);
             entity.setUserId(entity.getUid().toString());
             this.usersMapper.editUser(entity);
 
             UserExt userExt = new UserExt();
             userExt.setDutyType(entity.getDutyType());
             userExt.setUid(entity.getUid());
             userExt.setUserId(entity.getUserId());
             this.userExtMapper.addUserExt(userExt);
 
             userFunction.setUid(entity.getUid().intValue());
             userFunction.setUserId(entity.getUserId());
             this.userFunctionMapper.insertUserFun(userFunction);
 
             entity.setSaveMsg("保存成功");
             saveList.add(entity);
             insertCount++;
           }
         }
         if ((saveList != null) && (saveList.size() > 0) && (saveList.get(0) != null)) {
           ((Users)saveList.get(0)).setInsertCount(insertCount);
           ((Users)saveList.get(0)).setUpdateCount(updateCount);
         }
 
         json.setObj(saveList);
         json.setFlag(0);
         json.setMsg("ok");
         dest.delete();
       } else {
         json.setMsg("文件类型不正确！");
         json.setFlag(1);
         return json;
       }
     }
     catch (Exception e)
     {
       StringBuffer path = getPath();
       String fileName = file.getOriginalFilename();
       if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
         String uuid = UUID.randomUUID().toString().replaceAll("-", "");
         String extName = fileName.substring(fileName.lastIndexOf(".") + 1);
 
         String newFileName = new StringBuilder().append(uuid).append(extName).toString();
         File dest = new File(path.toString(), newFileName);
         dest.delete();
       }
       e.printStackTrace();
       json.setMsg("数据保存异常");
       json.setFlag(1);
     }
     return json;
   }
 
   public StringBuffer getPath()
   {
     ResourceBundle rb = ResourceBundle.getBundle("upload");
     String osName = System.getProperty("os.name");
     StringBuffer path = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       path = path.append(rb.getString("upload.win"));
     else {
       path = path.append(rb.getString("upload.linux"));
     }
     return path;
   }
 
   public void insetErrLog(String userName)
   {
     Syslog sysLog = new Syslog();
     sysLog.setLogId(Integer.valueOf(0));
     sysLog.setUserId(userName);
     String ip = IpAddr.getInternetIp();
     sysLog.setTime(new Date());
     sysLog.setIp(ip);
     sysLog.setType(Integer.valueOf(2));
     sysLog.setRemark("");
     this.syslogMapper.save(sysLog);
   }
 
   public List<Users> getUserPrivOther(String userPriv)
   {
     return this.usersMapper.getUserPrivOther(userPriv);
   }
 
   @Transactional
   public AjaxJson insertImportUsersByEdu(HttpServletRequest request, HttpServletResponse response, HttpSession session, MultipartFile file, String ifUpdate, String pw, String uPrivName, String rule)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try
     {
       StringBuffer path = getPath();
 
       if (file.isEmpty()) {
         ajaxJson.setMsg("请上传文件！");
         ajaxJson.setFlag(false);
         return ajaxJson;
       }
       String fileName = file.getOriginalFilename();
       if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx")))
       {
         List list = new ExcelRead().readExcel(file);
         Users user = null;
 
         String maxUserId = this.usersMapper.getMaxUserId();
 
         List saveList = new ArrayList();
         UserFunction userFunction = new UserFunction();
         int updateCount = 0;
         int insertCount = 0;
 
         for (int j = 0; j < list.size(); j++) {
           user = new Users();
           Map map = (Map)list.get(j);
 
           String IdNumber = map.get("身份证号").toString();
 
           if (com.myoa.util.common.StringUtils.checkNull(map.get("用户名") == null ? null : map.get("用户名").toString()).booleanValue())
           {
             String serial = maxUserId.substring(maxUserId.length() - 3);
 
             String rule1 = maxUserId.substring(0, maxUserId.length() - 3);
             int newSerial = Integer.parseInt(serial) + 1;
             serial = new StringBuilder().append(org.apache.commons.lang.StringUtils.repeat("0", 3 - String.valueOf(newSerial).length())).append(newSerial).toString();
             String byName = new StringBuilder().append(rule1).append(serial).toString();
             maxUserId = byName;
             user.setByname(byName);
             Users usersByIdNumber = this.usersMapper.getUserByIdNumber(IdNumber);
             if (usersByIdNumber != null)
             {
               user.setByname(usersByIdNumber.getByname());
             }
           } else {
             user.setByname(map.get("用户名").toString());
           }
 
           user.setDeptName(map.get("部门").toString());
           user.setUserName(map.get("姓名").toString());
 
           String sex = map.get("性别").toString().trim();
           if ("男".equals(sex)) {
             user.setSex("0");
             user.setAvatar("0");
           } else if ("女".equals(sex)) {
             user.setSex("1");
             user.setAvatar("1");
           } else {
             user.setSaveMsg("失败，性别输入错误！");
             saveList.add(user);
             continue;
           }
           if (com.myoa.util.common.StringUtils.checkNull(map.get("角色").toString().trim()).booleanValue()) {
             user.setUserPrivName(uPrivName);
           }
           user.setUserPrivName(map.get("角色").toString().trim());
           user.setMobilNo(map.get("手机").toString().trim());
           user.setTelNoDept(map.get("工作电话").toString().trim());
           user.setEmail(map.get("E-mail").toString().trim());
           user.setOicqNo(map.get("QQ").toString().trim());
           user.setIdNumber(map.get("身份证号").toString().trim());
           user.setTraNumber(map.get("培训编号").toString().trim());
           user.setSubject(map.get("学科").toString().trim());
           user.setPassword(pw);
 
           if (user.getPassword() != null) {
             user.setPassword(getEncryptString(user.getPassword().trim()));
           }
 
           if (user.getUserName() != null) {
             String fistSpell = PinYinUtil.getFirstSpell(user.getUserName());
             StringBuffer sb = new StringBuffer();
             for (int k = 0; k < fistSpell.length(); k++) {
               sb.append(new StringBuilder().append(fistSpell.charAt(k)).append("*").toString());
             }
             user.setUserNameIndex(sb.toString());
           }
 
           if (user.getDeptName() != null) {
             Department d = new Department();
             d.setDeptName(user.getDeptName());
             List nameList = this.departmentMapper.getDeptIdByDeptName(user.getDeptName());
             String deptId = "";
             if (nameList.size() > 0) {
               deptId = (String)nameList.get(0);
             }
             if (!com.myoa.util.common.StringUtils.checkNull(deptId).booleanValue()) {
               user.setDeptId(Integer.valueOf(deptId));
             } else {
               user.setSaveMsg("失败，部门不存在");
               saveList.add(user);
               continue;
             }
           }
 
           if (user.getUserPrivName() != null) {
             UserPriv userPriv = this.userPrivMapper.getUserPrivByName(user.getUserPrivName());
             if (userPriv != null) {
               user.setUserPriv(userPriv.getUserPriv());
               user.setUserPrivNo(userPriv.getPrivNo());
 
               if (userPriv.getFuncIdStr() != null)
                 userFunction.setUserFunCidStr(userPriv.getFuncIdStr());
               else
                 userFunction.setUserFunCidStr("1,");
             }
             else {
               user.setSaveMsg("失败，角色不存在");
               saveList.add(user);
               continue;
             }
           } else {
             user.setSaveMsg("失败，角色未填写");
             saveList.add(user);
             continue;
           }
           user.setNotLogin(Byte.valueOf("0"));
           user.setImRange(Byte.valueOf("1"));
 
           Users userByName = this.usersMapper.importUserByName(user.getByname());
           if ((userByName != null) && (!com.myoa.util.common.StringUtils.checkNull(ifUpdate).booleanValue()) && (ifUpdate.equals("yes")))
           {
             user.setUid(userByName.getUid());
             user.setUserId(userByName.getUserId());
             this.usersMapper.editUser(user);
 
             userFunction.setUid(user.getUid().intValue());
             userFunction.setUserId(user.getUserId());
             this.userFunctionMapper.updateUserFun(userFunction);
 
             user.setSaveMsg("更新成功");
             saveList.add(user);
             updateCount++; } else {
             if (userByName != null)
               continue;
             this.usersMapper.insert(user);
 
             user.setUserId(user.getUid().toString());
             this.usersMapper.editUser(user);
 
             UserExt userExt = new UserExt();
             userExt.setDutyType(user.getDutyType());
             userExt.setUid(user.getUid());
             userExt.setUserId(user.getUserId());
             this.userExtMapper.addUserExt(userExt);
 
             userFunction.setUid(user.getUid().intValue());
             userFunction.setUserId(user.getUserId());
             this.userFunctionMapper.insertUserFun(userFunction);
 
             user.setSaveMsg("保存成功");
             saveList.add(user);
             insertCount++;
           }
         }
 
         if ((saveList != null) && (saveList.size() > 0) && (saveList.get(0) != null)) {
           ((Users)saveList.get(0)).setInsertCount(insertCount);
           ((Users)saveList.get(0)).setUpdateCount(updateCount);
         }
 
         ajaxJson.setObj(saveList);
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("ok");
       } else {
         ajaxJson.setMsg("文件类型不正确！");
         ajaxJson.setFlag(false);
         return ajaxJson;
       }
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public Department createDep(String deptName)
   {
     List nameList = this.departmentMapper.getDeptIdByDeptName(deptName.trim());
     String deptId = "";
     if (nameList.size() > 0) {
       deptId = (String)nameList.get(0);
     }
     Department department = new Department();
     if (com.myoa.util.common.StringUtils.checkNull(deptId).booleanValue())
     {
       department.setDeptName(deptName);
       this.departmentMapper.insertDept(department);
     }
 
     return department;
   }
 
   public String getByName()
   {
     String maxUserId = this.usersMapper.getMaxUserId();
 
     String serial = maxUserId.substring(maxUserId.length() - 3);
 
     String rule = maxUserId.substring(0, maxUserId.length() - 3);
     int newSerial = Integer.parseInt(serial) + 1;
     serial = new StringBuilder().append(org.apache.commons.lang.StringUtils.repeat("0", 3 - String.valueOf(newSerial).length())).append(newSerial).toString();
     String byName = new StringBuilder().append(rule).append(serial).toString();
     return byName;
   }
 
   public List<Users> getUsersBydepIds(String deptIds)
   {
     if (com.myoa.util.common.StringUtils.checkNull(deptIds).booleanValue()) {
       return null;
     }
     List l = new ArrayList();
     String[] temp = deptIds.split(",");
     for (int i = 0; i < temp.length; i++) {
       if (!com.myoa.util.common.StringUtils.checkNull(temp[i]).booleanValue()) {
         Users users = this.usersMapper.findUsersByuserId(temp[i]);
         if (users != null) {
           l.add(users);
         }
       }
     }
     return l;
   }
 
   public List<Users> reAllPrivUser(String privUser, String privDept, String privRole)
   {
     String[] user = privUser.split(",");
     String[] dept = privDept.split(",");
     String[] role = privRole.split(",");
     List<Users> listUser = getUserByuserId(privUser);
     List listDept = getUserByDeptIds(privDept, Integer.valueOf(1));
     List listRole = getUserByDeptIds(privRole, Integer.valueOf(2));
     listUser.addAll(listDept);
     listUser.addAll(listRole);
     Map map = new HashMap();
     for (Users users : listUser) {
       map.put(users.getUserId(), users);
     }
     Collection valueCollection = map.values();
     List valueList = new ArrayList(valueCollection);
     return valueList;
   }
 
   public String reAllName(List<Users> list)
   {
     StringBuffer stringBuffer = new StringBuffer();
     for (Users users : list) {
       stringBuffer.append(users.getUserId()).append(",");
     }
     return stringBuffer.toString();
   }
 
   public void updateLoginTime(Users users)
   {
     this.usersMapper.updateLoginTime(users);
   }
 
   public List<Users> LoginUserList()
   {
     return this.usersMapper.LoginUserList();
   }
 
   public BaseWrapper uploadImg(HttpServletRequest request, MultipartFile file)
   {
     BaseWrapper wrapper = new BaseWrapper();
     try {
       Users usersTemp = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       if ((usersTemp == null) || (usersTemp.getUid() == null)) {
         wrapper.setFlag(false);
         wrapper.setMsg("用户信息不正确");
         return wrapper;
       }
       if (file != null) {
         String imageType = file.getContentType();
         boolean b = FileUploadUtil.allowUpload(imageType);
         if (!b) {
           wrapper.setFlag(false);
           wrapper.setMsg("图片格式不正确");
           return wrapper;
         }
       } else {
         wrapper.setFlag(false);
         wrapper.setMsg("图片不存在");
         return wrapper;
       }
       String realPath = request.getSession().getServletContext().getRealPath("/");
       String resourcePath = "uiuser";
       Users users = new Users();
 
       String fileName = FileUploadUtil.rename(file.getOriginalFilename());
       File dir = new File(new StringBuilder().append(realPath).append(resourcePath).toString());
       if (!dir.exists()) {
         dir.mkdirs();
       }
       File realfile = new File(dir, fileName);
       file.transferTo(realfile);
       String fileName128 = FileUploadUtil.rename(fileName, "s");
       String newImg = FileUploadUtil.zipImageFile(realfile.getAbsolutePath(), 128, 128, 1.0F, fileName128, dir.getAbsolutePath());
       wrapper.setFlag(true);
       wrapper.setData(fileName128);
       wrapper.setMsg(fileName);
     }
     catch (Exception e)
     {
       e.printStackTrace();
     }
     return wrapper;
   }
 
   public ToJson<Users> editUserExtNew(HttpServletRequest request, Users users, UserExt userExt)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       String realPath = request.getSession().getServletContext().getRealPath("/");
       String resourcePath = "uiuser";
       Users usersTemp = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       users.setUid(usersTemp.getUid());
 
       Users temp = this.usersMapper.findUsersByuserId(usersTemp.getUserId());
       if ((temp != null) && 
         (!com.myoa.util.common.StringUtils.checkNull(temp.getPhoto()).booleanValue())) {
         File temp1 = new File(new StringBuilder().append(realPath).append(resourcePath).append(temp.getPhoto()).toString());
         if (temp1.exists()) {
           temp1.delete();
         }
       }
 
       int count = this.usersMapper.editUser(users);
       userExt.setUid(usersTemp.getUid());
       userExt.setUserId(usersTemp.getUserId());
       count += this.userExtMapper.updateUserExtByUid(userExt);
       if (count > 1) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return toJson;
   }
 
   public ToJson<Users> getByName(String name)
   {
     ToJson json = new ToJson(1, "error");
     try {
       List list = this.usersMapper.getByName(name);
       json.setObj(list);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Users> getuserNameByDeptId(Integer deptId)
   {
     ToJson toJson = new ToJson(1, "error");
     List list = this.usersMapper.getuserNameByDeptId(deptId);
     if (list != null)
     {
       toJson.setMsg("查询成功");
       toJson.setFlag(0);
       toJson.setObj(list);
     } else {
       toJson.setMsg("数据为空");
       toJson.setFlag(1);
     }
 
     return toJson;
   }
 
   public ToJson<Integer> selectuidByName(String userName)
   {
     List list = this.usersMapper.selectuidByName(userName);
 
     ToJson toJson = new ToJson();
 
     if (list != null) {
       toJson.setMsg("查询成功");
       toJson.setObj(list);
     }
 
     return toJson;
   }
 
   public ToJson<Users> getUserDepartmentUserexe(String deptId, String dutyType, String uids)
   {
     ToJson toJson = new ToJson(1, "ERROR");
     Map map = new HashMap();
 
     map.put("deptId", deptId);
 
     map.put("dutyType", dutyType);
 
     map.put("uid", uids);
     List list = this.usersMapper.getUserDepartmentUserexe(map);
 
     if (list != null) {
       toJson.setFlag(0);
       toJson.setMsg("查询成功");
       toJson.setObj(list);
     }
     else {
       toJson.setFlag(1);
       toJson.setMsg("数据为空");
     }
 
     return null;
   }
 
   public BaseWrapper checkUserCount(HttpServletRequest request)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     int authUser = this.systemInfoService.getAuthUser(request);
     int userCount = getUserCount();
     if (userCount < authUser) {
       baseWrapper.setMsg("用户成功");
       baseWrapper.setFlag(true);
     } else {
       baseWrapper.setMsg("用户新建数量超过限制");
       baseWrapper.setFlag(false);
     }
 
     return baseWrapper;
   }
 }
