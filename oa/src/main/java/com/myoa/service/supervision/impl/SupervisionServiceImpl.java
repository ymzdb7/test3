 package com.myoa.service.supervision.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.supervision.SupervisionMapper;
import com.myoa.dao.supervision.SupervisionTypeMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.department.Department;
import com.myoa.model.supervision.Supervision;
import com.myoa.model.supervision.SupervisionType;
import com.myoa.model.users.Users;
import com.myoa.service.supervision.SupervisionService;
import com.myoa.service.users.UsersService;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.treeUtil.CheckTree;
import com.myoa.util.treeUtil.SuperviseTreeUtil;
import com.myoa.util.treeUtil.TreeGirdNode;

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.LinkedList;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
 
 @Service
 public class SupervisionServiceImpl
   implements SupervisionService
 {
 
   @Resource
   SupervisionMapper supervisionMapper;
 
   @Resource
   SupervisionTypeMapper supervisionTypeMapper;
 
   @Resource
   UsersMapper usersMapper;
 
   @Resource
   DepartmentMapper departmentMapper;
 
   @Resource
   private UsersService usersService;
 
   public ToJson<Supervision> getSupManageByTypeId(HttpServletRequest request, Integer typeId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List<Supervision> list = this.supervisionMapper.getSupManageByTypeId(typeId);
       if (list != null) {
         for (Supervision supervision : list)
         {
           if (!StringUtils.checkNull(supervision.getEndTime()).booleanValue()) {
             supervision.setEndTime(supervision.getEndTime().substring(0, supervision.getEndTime().length() - 2));
           }
 
           String nameStrings = checkAll(supervision.getUserId());
           supervision.setUserPrivName(nameStrings);
         }
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("数据信息为空");
       }
       toJson.setFlag(0);
     }
     catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<TreeGirdNode> getSupManageMenu(HttpServletRequest request, Supervision supervision)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       Map map = new HashMap();
       map.put("userId", request.getSession().getAttribute("userId"));
       map.put("userPriv", request.getSession().getAttribute("userPriv"));
       map.put("deptId", request.getSession().getAttribute("deptId"));
       List list = new LinkedList();
       list = this.supervisionTypeMapper.getSupManageMenu(supervision);
       List rootList = new ArrayList();
       Iterator total = list.iterator();
       String userId = (String)map.get("userId");
       while (total.hasNext()) {
         SupervisionType type = (SupervisionType)total.next();
 
         if ((type.getParentId() == null) || (type.getParentId().intValue() == 0)) {
           if ("admin".equals(userId)) {
             rootList.add(type);
             total.remove();
             continue;
           }
           boolean flag = CheckTree.checkAll(type.getUserId(), map);
           if (flag) {
             rootList.add(type);
             total.remove();
           }
         }
       }
       SuperviseTreeUtil sup = new SuperviseTreeUtil(rootList, list, map);
       List totalListAdmin = new LinkedList();
       totalListAdmin = sup.getTreeGirdNode();
 
       toJson.setObj(totalListAdmin);
       toJson.setMsg("ok");
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<Supervision> addSupervision(HttpServletRequest request, Supervision supervision)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       supervision.setManagerId(supervision.getManagerId().substring(0, supervision.getManagerId().length() - 1));
       supervision.setLeaderId(supervision.getLeaderId().substring(0, supervision.getLeaderId().length() - 1));
       supervision.setCreaterId((String)request.getSession().getAttribute("userId"));
       supervision.setCreaterTime(DateFormat.getCurrentTime());
       int a = this.supervisionMapper.addSupervision(supervision);
       if (a > 0) {
         toJson.setObject(supervision);
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("err");
         throw new Exception();
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<Supervision> deleteSupervisionBySid(HttpServletRequest request, Integer sid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       this.supervisionMapper.deleteSupervisionBySid(sid);
       if (sid != null)
         toJson.setMsg("ok");
       else {
         toJson.setMsg("err");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<Supervision> selectCountList(Map<String, String> mapParamter, Integer sid, String beginDate, String endDate, String typeId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       String type1 = (String)mapParamter.get("type1");
       String type2 = (String)mapParamter.get("type2");
       String type3 = (String)mapParamter.get("type3");
       String deptId = (String)mapParamter.get("deptId");
 
       Map objectMap = new HashMap();
       if ((!StringUtils.checkNull(beginDate).booleanValue()) && (!StringUtils.checkNull(endDate).booleanValue())) {
         objectMap.put("beginDate", beginDate);
         objectMap.put("endDate", endDate);
       }
       if (!StringUtils.checkNull(typeId).booleanValue()) {
         objectMap.put("typeId", typeId);
       }
 
       objectMap.put("deptId", deptId);
 
       switch (Integer.parseInt(type1)) {
       case 1:
         List<Department> deptList = this.departmentMapper.getAllDepartment();
         List maplist = new LinkedList();
         for (Department dept : deptList) {
           Supervision map = queryCountByDept(dept.getDeptId(), objectMap);
           map.setDeptName(dept.getDeptName());
           maplist.add(map);
         }
         toJson.setObj(maplist);
         break;
       case 2:
         List<SupervisionType> list = this.supervisionTypeMapper.selectAll();
         List maplist2 = new LinkedList();
         for (SupervisionType s : list) {
           Supervision sp = queryCountByType(s.getSid(), objectMap);
           sp.setTypeId(s.getSid());
           sp.setDeptName(s.getTypeName());
           maplist2.add(sp);
         }
         toJson.setObj(maplist2);
         break;
       case 3:
         Supervision sp = queryCount(objectMap);
         toJson.setObject(sp);
       }
 
     }
     catch (Exception e)
     {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "Supervision selectCountList" + e });
     }
     return toJson;
   }
 
   public ToJson<Supervision> getSupAssistDetail(HttpServletRequest request, Integer sid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       Supervision supervision2 = new Supervision();
       supervision2.setSid(sid);
       supervision2.setManagerId((String)request.getSession().getAttribute("userId"));
       Supervision supervision = this.supervisionMapper.getSupAssistDetail(supervision2);
 
       if (supervision != null) {
         if (!StringUtils.checkNull(supervision.getBeginTime()).booleanValue()) {
           supervision.setBeginTime(supervision.getBeginTime().substring(0, supervision.getBeginTime().length() - 2));
         }
         if (!StringUtils.checkNull(supervision.getEndTime()).booleanValue()) {
           supervision.setEndTime(supervision.getEndTime().substring(0, supervision.getEndTime().length() - 2));
         }
         String userId = checkAll(supervision.getUserId() == null ? "" : supervision.getUserId());
         supervision.setUserPrivName(userId);
         toJson.setObject(supervision);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("数据为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "SupervisionServiceImpl getSupAssistDetail:" + e });
     }
     return toJson;
   }
 
   public String checkAll(String checkString)
   {
     StringBuffer sb = new StringBuffer("");
     Map mapParam = new HashMap();
 
     if (checkString != null)
     {
       String checkUserId = checkString.substring(0, checkString.length() == 0 ? 0 : checkString.length() - 1);
       if ((checkUserId != null) && (!"".equals(checkUserId))) {
         checkUserId = "'" + checkUserId.replace(",", "','") + "'";
         mapParam.put("checkUserId", checkUserId);
         List<String> listCheckUserId = this.usersMapper.getUserNames(mapParam);
         sb.append(getString(listCheckUserId));
         for (String s : listCheckUserId)
           sb.append("");
       }
       else {
         sb.append("");
       }
     }
     return sb.toString();
   }
 
   private Supervision queryCount(Map<String, Object> objectMap)
   {
     Supervision sp = this.supervisionMapper.queryCount();
     return sp;
   }
 
   public Supervision queryCountByDept(Integer deptId, Map<String, Object> map)
   {
     Supervision paraSup = new Supervision();
     paraSup.setDeptId(deptId);
     if ((!StringUtils.checkNull((String)map.get("beginDate")).booleanValue()) && (!StringUtils.checkNull((String)map.get("endDate")).booleanValue())) {
       paraSup.setBeginDate((String)map.get("beginDate"));
       paraSup.setEndDate((String)map.get("endDate"));
     }
     if (!StringUtils.checkNull((String)map.get("typeId")).booleanValue()) {
       paraSup.setTypeId(Integer.valueOf(Integer.parseInt((String)map.get("typeId"))));
     }
     paraSup = this.supervisionMapper.queryCountSupervisionByStatus(paraSup);
     return paraSup;
   }
   public Supervision queryCountByType(Integer typeId, Map<String, Object> objectMap) {
     objectMap.put("typeId", typeId);
     Supervision paraSup = new Supervision();
     paraSup = this.supervisionMapper.queryCountByType(paraSup);
     return paraSup;
   }
 
   public ToJson<Supervision> queryCountSupervisionByStatus()
   {
     ToJson toJson = new ToJson(1, "error");
     Supervision supervision = new Supervision();
     Supervision paraSup = new Supervision();
     try {
       int count = this.supervisionMapper.queryCountSupervisionByStatus();
       toJson.setTotleNum(Integer.valueOf(count));
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<Supervision> getSupApplyTaskList(Integer status, Integer sid, HttpServletRequest request)
   {
     ToJson toJson = new ToJson(1, "error");
     Supervision supervision = new Supervision();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     supervision.setUserId(user.getUserId());
     supervision.setManagerId(user.getUserId());
     supervision.setStatus(status);
     try {
       List<Supervision> list = this.supervisionMapper.getSupApplyTaskList1(supervision);
       if (list != null) {
         for (Supervision supervision1 : list) {
           if (!StringUtils.checkNull(supervision1.getRealEndTime()).booleanValue())
             supervision1.setRealEndTime(supervision1.getRealEndTime().substring(0, supervision1.getRealEndTime().length() - 2));
           if (!StringUtils.checkNull(supervision1.getEndTime()).booleanValue())
             supervision1.setEndTime(supervision1.getEndTime().substring(0, supervision1.getEndTime().length() - 2));
           String userid = checkAll(supervision1.getUserId());
           supervision1.setUserPrivName(userid);
         }
         toJson.setObject(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public String getString(List<String> Strings) {
     StringBuffer sb = new StringBuffer("");
     for (String s : Strings) {
       sb.append(s);
       sb.append(",");
     }
     return sb.toString();
   }
 
   public ToJson<Supervision> updateSupStatus(Supervision supervision, HttpServletRequest request)
   {
     ToJson tojson = new ToJson(1, "修改失败！");
     int a = this.supervisionMapper.updateByPrimaryKeySelective(supervision);
     if (a > 0) {
       tojson.setFlag(0);
       tojson.setMsg("操作成功");
     }
     return tojson;
   }
 
   public ToJson<Supervision> updateSupervision(HttpServletRequest request, Supervision supervision)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       supervision.setManagerId(supervision.getManagerId().substring(0, supervision.getManagerId().length() - 1));
       supervision.setLeaderId(supervision.getLeaderId().substring(0, supervision.getLeaderId().length() - 1));
       int a = this.supervisionMapper.updateSupervision(supervision);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("更新失败");
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 }

