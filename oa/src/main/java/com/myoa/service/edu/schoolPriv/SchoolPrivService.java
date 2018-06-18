 package com.myoa.service.edu.schoolPriv;
 
 import com.myoa.dao.edu.schoolPriv.SchoolPrivMapper;
import com.myoa.dao.edu.schoolRollInfo.SchoolRollInfoMapper;
import com.myoa.dao.edu.teacher.TeacheringInfoMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.edu.schoolPriv.SchoolPriv;
import com.myoa.model.users.Users;
import com.myoa.service.department.DepartmentService;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class SchoolPrivService
 {
 
   @Resource
   private SchoolPrivMapper schoolPrivMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private DepartmentService departmentService;
 
   @Resource
   private TeacheringInfoMapper teacheringInfoMapper;
 
   @Resource
   private SchoolRollInfoMapper schoolRollInfoMapper;
 
   public ToJson<SchoolPriv> addSchoolPriv(HttpServletRequest request, SchoolPriv schoolPriv)
   {
     ToJson json = new ToJson();
     try {
       int count = this.schoolPrivMapper.insertSelective(schoolPriv);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg(e.getMessage());
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<SchoolPriv> deleteSchoolPriv(HttpServletRequest request, Integer id)
   {
     ToJson json = new ToJson();
     try {
       int count = this.schoolPrivMapper.deleteByPrimaryKey(id);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg(e.getMessage());
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<SchoolPriv> selectByPrimaryKey(HttpServletRequest request, Integer id)
   {
     ToJson json = new ToJson();
     try {
       SchoolPriv schoolPriv = this.schoolPrivMapper.selectByPrimaryKey(id);
       if (schoolPriv != null) {
         if ((schoolPriv.getPersonUid() != null) && (!"".equals(schoolPriv.getPersonUid()))) {
           String[] roleManagerArray = schoolPriv.getPersonUid().split(",");
           StringBuffer userName = new StringBuffer();
           for (String str : roleManagerArray) {
             String userName1 = this.usersMapper.getUsernameById(str);
             if (userName1 != null) {
               userName.append(userName1 + ",");
             }
           }
           schoolPriv.setRoleManagerText(userName.toString());
         } else {
           schoolPriv.setRoleManagerText("");
         }
         if ((schoolPriv.getShcoolNum() != null) && (!"".equals(schoolPriv.getShcoolNum()))) {
           if (!StringUtils.checkNull(schoolPriv.getShcoolNum()).booleanValue()) {
             String depName = this.departmentService.getDeptNameByDeptId(schoolPriv.getShcoolNum(), ",");
 
             schoolPriv.setUserPrivText(depName);
           }
         }
         else {
           schoolPriv.setUserPrivText("");
         }
       }
       json.setObject(schoolPriv);
       json.setMsg("ok");
       json.setFlag(0);
     }
     catch (Exception e) {
       e.printStackTrace();
       json.setMsg(e.getMessage());
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<SchoolPriv> updateSchoolPriv(HttpServletRequest request, SchoolPriv schoolPriv)
   {
     ToJson json = new ToJson();
     try {
       int count = this.schoolPrivMapper.updateByPrimaryKeySelective(schoolPriv);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg(e.getMessage());
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<SchoolPriv> selectAll(HttpServletRequest request, SchoolPriv schoolPriv)
   {
     ToJson json = new ToJson();
     try {
       List<SchoolPriv> schoolPrivList = this.schoolPrivMapper.selectList(schoolPriv);
       if ((schoolPrivList != null) && (schoolPrivList.size() > 0)) {
         for (SchoolPriv priv : schoolPrivList) {
           if ((priv.getPersonUid() != null) && (!"".equals(priv.getPersonUid()))) {
             String[] roleManagerArray = priv.getPersonUid().split(",");
             StringBuffer userName = new StringBuffer();
             for (String str : roleManagerArray) {
               String userName1 = this.usersMapper.getUsernameById(str);
               if (userName1 != null) {
                 userName.append(userName1 + ",");
               }
             }
             priv.setRoleManagerText(userName.toString());
           } else {
             priv.setRoleManagerText("");
           }
           if ((priv.getShcoolNum() != null) && (!"".equals(priv.getShcoolNum()))) {
             if (!StringUtils.checkNull(priv.getShcoolNum()).booleanValue()) {
               String depName = this.departmentService.getDeptNameByDeptId(priv.getShcoolNum(), ",");
 
               priv.setUserPrivText(depName);
             }
           }
           else {
             priv.setUserPrivText("");
           }
         }
       }
 
       json.setObj(schoolPrivList);
       json.setMsg("ok");
       json.setFlag(0);
     }
     catch (Exception e) {
       e.printStackTrace();
       json.setMsg(e.getMessage());
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<SchoolPriv> selectObjectBySelf(HttpServletRequest request, SchoolPriv schoolPriv, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson();
 
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     Map paramap = new HashMap();
     paramap.put("page", pageParams);
 
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Integer uid = users.getUid();
     schoolPriv.setPersonUid(String.valueOf(uid));
     try {
       List<SchoolPriv> schoolPrivs = this.schoolPrivMapper.selectList(schoolPriv);
       StringBuffer numStr = new StringBuffer();
       for (SchoolPriv temp : schoolPrivs) {
         if (!StringUtils.checkNull(temp.getShcoolNum()).booleanValue()) {
           numStr.append(temp.getShcoolNum());
         }
       }
       List<String> numList = new ArrayList();
       boolean result = true;
       if (!StringUtils.checkNull(numStr.toString()).booleanValue()) {
         String[] numArray = numStr.toString().split(",");
         for (String temp1 : numArray) {
           for (String temp2 : numList) {
             if ((!StringUtils.checkNull(temp1).booleanValue()) && (temp1.equals(temp2))) {
               result = false;
             }
           }
           if (result) {
             numList.add(temp1);
           }
         }
       }
       Map map = new HashMap();
       if ((!StringUtils.checkNull(schoolPriv.getModularId()).booleanValue()) && ("1".equals(schoolPriv.getModularId())))
       {
         List list = new ArrayList();
         if ((numList != null) && (numList.size() > 0)) {
           paramap.put("numList", numList);
           paramap.put("schoolNum", schoolPriv.getShcoolNum());
           list = this.teacheringInfoMapper.selectObjectByNo(paramap);
         }
         map.put("object", list);
       } else if ((!StringUtils.checkNull(schoolPriv.getModularId()).booleanValue()) && (("2".equals(schoolPriv.getModularId())) || ("3".equals(schoolPriv.getModularId())))) {
         List list = new ArrayList();
         if ((numList != null) && (numList.size() > 0)) {
           paramap.put("numList", numList);
           paramap.put("schoolNum", schoolPriv.getShcoolNum());
           paramap.put("flag", schoolPriv.getFlag());
           list = this.schoolRollInfoMapper.selObjBySchoolCode(paramap);
         }
         map.put("object", list);
       }
       json.setObject(map);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 }

