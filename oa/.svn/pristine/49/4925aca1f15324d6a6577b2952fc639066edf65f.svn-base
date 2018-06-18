 package com.myoa.service.supervision.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.supervision.SupervisionMapper;
import com.myoa.dao.supervision.SupervisionTypeMapper;
import com.myoa.dao.users.UserPrivMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.supervision.SupervisionType;
import com.myoa.service.supervision.SupervisionTypeService;
import com.myoa.util.ToJson;
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
 public class SupervisionTypeServiceImpl
   implements SupervisionTypeService
 {
 
   @Resource
   SupervisionTypeMapper supervisionTypeMapper;
 
   @Resource
   UsersMapper usersMapper;
 
   @Resource
   SupervisionMapper supervisionMapper;
 
   @Resource
   DepartmentMapper departmentMapper;
 
   @Resource
   UserPrivMapper userPrivMapper;
 
   public ToJson<SupervisionType> getSupervisionTypeDetail(HttpServletRequest request, Integer sid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       SupervisionType supervisionType = this.supervisionTypeMapper.getSupervisionTypeDetail(sid);
       if (supervisionType != null) {
         String range = checkAll(supervisionType.getUserId());
         String[] checkStrings = range.split("\\|");
         String[] checkStringOr = (supervisionType.getUserId() == null ? "" : supervisionType.getUserId()).split("\\|");
 
         if ((checkStrings.length == 1) && 
           (checkStringOr.length > 0)) {
           supervisionType.setDeptName(checkStrings[0]);
           supervisionType.setDeptId(checkStringOr[0]);
           supervisionType.setUserPrivName("");
           supervisionType.setUserPrivId("");
           supervisionType.setUserName("");
           supervisionType.setUserId("");
         }
 
         if ((checkStrings.length == 2) && 
           (checkStringOr.length > 0)) {
           supervisionType.setDeptName(checkStrings[0]);
           supervisionType.setDeptId(checkStringOr[0]);
           supervisionType.setUserPrivName(checkStrings[1]);
           supervisionType.setUserPrivId(checkStringOr[1]);
           supervisionType.setUserName("");
           supervisionType.setUserId("");
         }
 
         if ((checkStrings.length == 3) && 
           (checkStringOr.length > 0)) {
           supervisionType.setDeptName(checkStrings[0]);
           supervisionType.setDeptId(checkStringOr[0]);
           supervisionType.setUserPrivName(checkStrings[1]);
           supervisionType.setUserPrivId(checkStringOr[1]);
           supervisionType.setUserName(checkStrings[2]);
           supervisionType.setUserId(checkStringOr[2]);
         }
 
         toJson.setObject(supervisionType);
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("没有详细信息");
         toJson.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<SupervisionType> updateSupervisionType(HttpServletRequest request, SupervisionType supervisionType)
   {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       if (supervisionType.getParentId().intValue() == -1) {
         supervisionType.setParentId(Integer.valueOf(0));
       }
       int a = this.supervisionTypeMapper.updateSupervisionType(supervisionType);
 
       toJson.setObject(supervisionType);
       toJson.setMsg("ok");
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<SupervisionType> addSupervisionType(HttpServletRequest request, SupervisionType supervisionType)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.supervisionTypeMapper.addSupervisionType(supervisionType);
       if (a > 0) {
         toJson.setObject(supervisionType);
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("保存失败");
         throw new Exception();
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<SupervisionType> deleteSupervisionTypeBySid(Integer sid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       this.supervisionTypeMapper.deleteSupervisionTypeBySid(sid);
       if (sid.intValue() != 0)
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
 
   public ToJson<SupervisionType> getSupervisionTypeList(SupervisionType supervisionType, HttpServletRequest request)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List<SupervisionType> list = this.supervisionTypeMapper.getSupervisionTypeList(supervisionType);
       for (SupervisionType type : list) {
         String nameStrings = checkAll(type.getUserId());
         String[] checkStrings = nameStrings.split("\\|");
 
         if (checkStrings.length == 1) {
           type.setDeptName(checkStrings[0]);
           type.setUserPrivName("");
           type.setUserName("");
         }
 
         if (checkStrings.length == 2) {
           type.setDeptName(checkStrings[0]);
           type.setUserPrivName(checkStrings[1]);
           type.setUserName("");
         }
 
         if (checkStrings.length == 3) {
           type.setDeptName(checkStrings[0]);
           type.setUserPrivName(checkStrings[1]);
           type.setUserName(checkStrings[2]);
         }
       }
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("err");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<TreeGirdNode> getSupTypeList(HttpServletRequest request)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       Map map = new HashMap();
       map.put("userId", request.getSession().getAttribute("userId"));
       map.put("userPriv", request.getSession().getAttribute("userPriv"));
       map.put("deptId", request.getSession().getAttribute("deptId"));
       String userId = (String)map.get("userId");
       List list = new LinkedList();
       list = this.supervisionTypeMapper.getSupManageMenu(null);
       List rootList = new ArrayList();
       Iterator total = list.iterator();
       while (total.hasNext()) {
         SupervisionType type = (SupervisionType)total.next();
         String useriD = checkAll(type.getUserId());
         type.setUserName(useriD);
         if (((type.getParentId().intValue() == 0) || (type.getParentId() == null)) && 
           (type.getUserId() != null)) {
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
 
   public String checkAll(String checkString)
   {
     StringBuffer sb = new StringBuffer("");
     Map mapParam = new HashMap();
 
     String[] checkStrings = checkString.split("\\|");
     if (checkStrings.length == 0) {
       return sb.toString();
     }
 
     if (checkStrings.length == 1) {
       String checkDept = checkStrings[0].substring(0, checkStrings[0].length() == 0 ? 0 : checkStrings[0].length() - 1);
       if ((checkDept != null) && (!"".equals(checkDept))) {
         checkDept = "'" + checkDept.replace(",", "','") + "'";
         mapParam.put("checkDept", checkDept);
         List listd = this.departmentMapper.getDeptNames(mapParam);
         sb.append(getString(listd)).append("|");
       } else {
         sb.append("").append("|").append("").append("|");
       }
 
     }
 
     if (checkStrings.length == 2) {
       String checkDept = checkStrings[0].substring(0, checkStrings[0].length() == 0 ? 0 : checkStrings[0].length() - 1);
       if ((checkDept != null) && (!"".equals(checkDept))) {
         checkDept = "'" + checkDept.replace(",", "','") + "'";
         mapParam.put("checkDept", checkDept);
         List listd = this.departmentMapper.getDeptNames(mapParam);
         sb.append(getString(listd)).append("|");
       } else {
         sb.append("").append("|");
       }
       String checkUserPriv = checkStrings[1].substring(0, checkStrings[1].length() == 0 ? 0 : checkStrings[1].length() - 1);
       if ((checkUserPriv != null) && (!"".equals(checkUserPriv))) {
         checkUserPriv = "'" + checkUserPriv.replace(",", "','") + "'";
         mapParam.put("checkUserPriv", checkUserPriv);
         List listup = this.userPrivMapper.getUserPNames(mapParam);
 
         sb.append(getString(listup)).append("|");
       } else {
         sb.append("").append("|");
       }
     }
 
     if (checkStrings.length == 3) {
       String checkDept = checkStrings[0].substring(0, checkStrings[0].length() == 0 ? 0 : checkStrings[0].length() - 1);
       if ((checkDept != null) && (!"".equals(checkDept))) {
         checkDept = "'" + checkDept.replace(",", "','") + "'";
         mapParam.put("checkDept", checkDept);
         List listd = this.departmentMapper.getDeptNames(mapParam);
         sb.append(getString(listd)).append("|");
       } else {
         sb.append("").append("|");
       }
       String checkUserPriv = checkStrings[1].substring(0, checkStrings[1].length() == 0 ? 0 : checkStrings[1].length() - 1);
       if ((checkUserPriv != null) && (!"".equals(checkUserPriv)))
       {
         mapParam.put("checkUserPriv", checkUserPriv);
         List<String> listup = this.userPrivMapper.getUserPNames(mapParam);
         for (String s : listup)
           sb.append(s).append(",");
       }
       else
       {
         sb.append("").append("|");
       }
       String checkUserId = checkStrings[2].substring(0, checkStrings[2].length() == 0 ? 0 : checkStrings[2].length() - 1);
       if ((checkUserId != null) && (!"".equals(checkUserId))) {
         checkUserId = "'" + checkUserId.replace(",", "','") + "'";
         mapParam.put("checkUserId", checkUserId);
         List listCheckUserId = this.usersMapper.getUserNames(mapParam);
         sb.append("|");
         sb.append(getString(listCheckUserId));
       } else {
         sb.append("");
       }
     }
     return sb.toString();
   }
 
   public String getString(List<String> Strings) {
     StringBuffer sb = new StringBuffer("");
     if (Strings == null) {
       return "";
     }
     for (String s : Strings) {
       sb.append(s);
       sb.append(",");
     }
     return sb.toString();
   }
 
   public ToJson<SupervisionType> getSupNameSelect(HttpServletRequest request, SupervisionType supervisionType)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.supervisionTypeMapper.getSupNameSelect(supervisionType);
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 }

