 package com.myoa.service.edu.eduDepartment;
 
 import com.myoa.dao.edu.eduDepartment.EduDepartmentMapper;
import com.myoa.model.edu.eduDepartment.EduDepartment;
import com.myoa.model.edu.eduDepartment.EduDepartmentWithBLOBs;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;

 import java.util.ArrayList;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduDepartmentService
 {
 
   @Autowired
   private EduDepartmentMapper eduDepartmentMapper;
 
   public ToJson<EduDepartmentWithBLOBs> queryListByDeptId(String deptParent, HttpServletRequest request)
   {
     ToJson<EduDepartmentWithBLOBs> baseWrappers = new ToJson<EduDepartmentWithBLOBs>();
 
     if (StringUtils.checkNull(deptParent).booleanValue()) {
       baseWrappers.setFlag(1);
       baseWrappers.setMsg("err");
       return baseWrappers;
     }
     List eduDepart = this.eduDepartmentMapper.queryListByDeptId(deptParent);
     if ((eduDepart != null) && (eduDepart.size() > 0)) {
       baseWrappers.setFlag(0);
       baseWrappers.setMsg("ok");
       baseWrappers.setObj(eduDepart);
       return baseWrappers;
     }
     baseWrappers.setFlag(1);
     baseWrappers.setMsg("err");
     return baseWrappers;
   }
 
   public ToJson<EduDepartmentWithBLOBs> queryGetObjectByDeptId(String deptParent, HttpServletRequest request) {
     ToJson baseWrappers = new ToJson();
 
     if (StringUtils.checkNull(deptParent).booleanValue()) {
       baseWrappers.setFlag(1);
       baseWrappers.setMsg("err");
       return baseWrappers;
     }
     EduDepartmentWithBLOBs eduDepartmentWithBLOBs = this.eduDepartmentMapper.queryGetObjectByDeptId(deptParent);
     baseWrappers.setFlag(0);
     baseWrappers.setMsg("ok");
     baseWrappers.setObject(eduDepartmentWithBLOBs);
     return baseWrappers;
   }
 
   public ToJson<EduDepartmentWithBLOBs> queryGetObj(HttpServletRequest request) {
     ToJson baseWrappers = new ToJson();
 
     List eduDepart = this.eduDepartmentMapper.queryListByDeptId("2");
     if ((eduDepart != null) && (eduDepart.size() > 0)) {
       baseWrappers.setFlag(0);
       baseWrappers.setMsg("ok");
       baseWrappers.setObj(eduDepart);
       return baseWrappers;
     }
     baseWrappers.setFlag(1);
     baseWrappers.setMsg("err");
     return baseWrappers;
   }
   public ToJson<EduDepartmentWithBLOBs> updateEduDepartmentWithBLOBs(EduDepartmentWithBLOBs eduDepartmentWithBLOBs, HttpServletRequest request) {
     ToJson baseWrappers = new ToJson();
     int num = this.eduDepartmentMapper.updateEduDepartmentWithBLOBs(eduDepartmentWithBLOBs);
     if (num > 0) {
       baseWrappers.setFlag(0);
       baseWrappers.setMsg("ok");
 
       return baseWrappers;
     }
 
     baseWrappers.setFlag(1);
     baseWrappers.setMsg("err");
 
     return baseWrappers;
   }
 
   public ToJson<EduDepartmentWithBLOBs> addEduDepartmentWithBLOBs(EduDepartmentWithBLOBs eduDepartmentWithBLOBs, HttpServletRequest request)
   {
     ToJson baseWrappers = new ToJson();
     EduDepartment findEduDepartment = this.eduDepartmentMapper.getClazzByNameParent(eduDepartmentWithBLOBs.getDeptName(), eduDepartmentWithBLOBs.getDeptParent());
     if (findEduDepartment != null) {
       baseWrappers.setFlag(1);
       baseWrappers.setMsg("部门已存在！");
       return baseWrappers;
     }
     EduDepartmentWithBLOBs eduDepartmentWithBLOBsById = this.eduDepartmentMapper.selectByDepId(eduDepartmentWithBLOBs.getDeptParent());
     if (eduDepartmentWithBLOBsById != null) {
       String parentDeptNo = eduDepartmentWithBLOBsById.getDeptNo();
       String deptNo = parentDeptNo + eduDepartmentWithBLOBs.getDeptNo();
       eduDepartmentWithBLOBs.setDeptNo(deptNo);
     }
     int num = this.eduDepartmentMapper.insertSelective(eduDepartmentWithBLOBs);
     if (num > 0) {
       baseWrappers.setFlag(0);
       baseWrappers.setMsg("新建成功");
       return baseWrappers;
     }
     baseWrappers.setFlag(1);
     baseWrappers.setMsg("新建失败");
 
     return baseWrappers;
   }
 
   public ToJson<EduDepartmentWithBLOBs> deleteEduDepartmentWithBLOBs(String deptId, String deptNo, HttpServletRequest request)
   {
     ToJson baseWrappers = new ToJson();
     List eduDepart = this.eduDepartmentMapper.queryListBydeptNO(deptNo);
     if ((eduDepart == null) || (eduDepart.size() == 0)) {
       int num = this.eduDepartmentMapper.deleteEduDepartmentWithBLOBs(deptId);
       if (num > 0) {
         baseWrappers.setFlag(0);
         baseWrappers.setMsg("ok");
 
         return baseWrappers;
       }
 
       baseWrappers.setFlag(1);
       baseWrappers.setMsg("err");
 
       return baseWrappers;
     }
 
     baseWrappers.setMsg("该部门下有人员，请处理后再删除该部门");
     baseWrappers.setFlag(1);
     return baseWrappers;
   }
 
   public ToJson<EduDepartmentWithBLOBs> queryObjectsBydeptParent(String deptParent, HttpServletRequest request)
   {
     ToJson json = new ToJson(1, "err");
     try {
       List eduDepartmentWithBLOBs = this.eduDepartmentMapper.queryObjectsBydeptParent(deptParent);
       json.setFlag(0);
       json.setMsg("ok");
       json.setObj(eduDepartmentWithBLOBs);
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<EduDepartmentWithBLOBs> getObjByDeptId(String deptParent, HttpServletRequest request)
   {
     ToJson baseWrappers = new ToJson();
 
     if (StringUtils.checkNull(deptParent).booleanValue()) {
       baseWrappers.setFlag(1);
       baseWrappers.setMsg("err");
       return baseWrappers;
     }
 
     EduDepartmentWithBLOBs eduDepartmentWithBLOBs = this.eduDepartmentMapper.queryGetObjectByDeptId(deptParent);
 
     baseWrappers.setFlag(0);
     baseWrappers.setMsg("ok");
     List list = new ArrayList();
     list.add(eduDepartmentWithBLOBs);
     baseWrappers.setObj(list);
     return baseWrappers;
   }
 
   public List<EduDepartmentWithBLOBs> getEduDeptUser(int deptId)
   {
     List list = this.eduDepartmentMapper.getChDeptEduUser(deptId);
 
     List<EduDepartmentWithBLOBs> list1 = new ArrayList();
 
     EduDepartmentWithBLOBs eduDepartment = this.eduDepartmentMapper.queryGetObjectByDeptId(String.valueOf(deptId));
     if (eduDepartment.getDeptName().equals("家长")) {
       list1 = this.eduDepartmentMapper.queryUserParent(deptId);
     } else {
       list1 = this.eduDepartmentMapper.getChDept(String.valueOf(deptId));
       for (EduDepartmentWithBLOBs dep : list1) {
         EduDepartmentWithBLOBs eduDepartmentWithBLOBs = this.eduDepartmentMapper.queryGetObjectByDeptId(dep.getDeptParent().toString());
         dep.setDeptParentName(eduDepartmentWithBLOBs.getDeptName());
         List list2 = new ArrayList();
         list2 = this.eduDepartmentMapper.queryObjectsBydeptParent(dep.getDeptId().toString());
         if (list2.size() != 0)
           dep.setIsHaveCh("1");
         else {
           dep.setIsHaveCh("0");
         }
       }
     }
     if ((list.size() != 0) && (list1.size() != 0)) {
       for (int i = 0; i < list1.size(); i++) {
         list.add(list1.get(i));
       }
       return list;
     }
     if ((list.size() != 0) && (list1.size() == 0)) {
       return list;
     }
     if ((list.size() == 0) && (list1.size() != 0)) {
       return list1;
     }
     if ((list.size() == 0) && (list1.size() == 0)) {
       return list;
     }
     return list;
   }
 
   public List<EduDepartmentWithBLOBs> getAllOrg()
   {
     List<EduDepartmentWithBLOBs> list = this.eduDepartmentMapper.queryListByDeptId("0");
     for (EduDepartmentWithBLOBs eduDepartmentWithBLOBs : list)
     {
       List<EduDepartmentWithBLOBs> list1 = this.eduDepartmentMapper.getChDept(String.valueOf(eduDepartmentWithBLOBs.getDeptId()));
       eduDepartmentWithBLOBs.setSonDep(list1);
       for (EduDepartmentWithBLOBs eduDepartmentWithBLOBs1 : list1) {
         List liseDept = this.eduDepartmentMapper.getDeptByDeptNo(eduDepartmentWithBLOBs1.getDeptNo());
         if (liseDept.size() > 1) {
           List<EduDepartmentWithBLOBs> list2 = this.eduDepartmentMapper.getChDept(String.valueOf(eduDepartmentWithBLOBs1.getDeptId()));
           eduDepartmentWithBLOBs1.setSonDep(list2);
           for (EduDepartmentWithBLOBs eduDepartmentWithBLOBs2 : list2)
           {
             List list3 = this.eduDepartmentMapper.getChDeptEduUser(eduDepartmentWithBLOBs2.getDeptId().intValue());
             eduDepartmentWithBLOBs2.setSonUser(list3);
           }
         }
 
         List list3 = this.eduDepartmentMapper.getChDeptEduUser(eduDepartmentWithBLOBs1.getDeptId().intValue());
         eduDepartmentWithBLOBs1.setSonUser(list3);
       }
     }
     return list;
   }
 
   public AjaxJson getDpNameByIds(String deptIds)
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       String[] deptArray = deptIds.split(",");
       StringBuffer stringBuffer = new StringBuffer();
       for (int i = 0; i < deptArray.length; i++) {
         EduDepartmentWithBLOBs eduDepartmentWithBLOBs = this.eduDepartmentMapper.queryGetObjectByDeptId(deptArray[i]);
         if (eduDepartmentWithBLOBs != null) {
           String deptName = eduDepartmentWithBLOBs.getDeptName();
           stringBuffer.append(deptName).append(",");
         }
       }
       ajaxJson.setObj(stringBuffer.toString());
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("OK");
     } catch (Exception e) {
       ajaxJson.setMsg(e.getMessage());
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public AjaxJson getAllGrade()
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       List list = this.eduDepartmentMapper.getAllGrade();
       ajaxJson.setObj(list);
       ajaxJson.setMsg("OK");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 
   public AjaxJson getClazz()
   {
     AjaxJson ajaxJson = new AjaxJson();
     try {
       List list = this.eduDepartmentMapper.getClazz();
       ajaxJson.setObj(list);
       ajaxJson.setMsg("OK");
       ajaxJson.setFlag(true);
     } catch (Exception e) {
       e.printStackTrace();
       ajaxJson.setMsg("false");
       ajaxJson.setFlag(false);
     }
     return ajaxJson;
   }
 }

