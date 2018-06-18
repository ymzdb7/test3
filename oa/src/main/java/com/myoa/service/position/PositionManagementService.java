 package com.myoa.service.position;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.position.PositionManagementMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.department.Department;
import com.myoa.model.position.UserJob;
import com.myoa.util.Constant;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.dataSource.ContextHolder;

 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class PositionManagementService
 {
 
   @Autowired
   PositionManagementMapper positionManagementMapper;
 
   @Autowired
   SysCodeMapper sysCodeMapper;
 
   @Autowired
   DepartmentMapper departmentMapper;
 
   public ToJson<UserJob> selectUserJobList(UserJob userJob)
   {
     ToJson toJson = new ToJson(1, "error");
 
     List<UserJob> list = this.positionManagementMapper.selectUserJobList(userJob);
 
     int getcount = 0;
     getcount = this.positionManagementMapper.getcount();
 
     for (UserJob userJob1 : list) {
       SysCode sysCode = this.sysCodeMapper.getSingleCode("function", String.valueOf(userJob1.getType()));
       if (sysCode != null)
         userJob1.setTypeName(sysCode.getCodeName());
       else {
         userJob1.setTypeName("");
       }
       Department mapperDeptById = this.departmentMapper.getDeptById(userJob1.getDeptId().intValue());
       if (mapperDeptById != null)
         userJob1.setDeptName(mapperDeptById.getDeptName());
       else {
         userJob1.setDeptName("");
       }
     }
     if (list != null) {
       toJson.setFlag(0);
       toJson.setMsg("查询成功");
       toJson.setObj(list);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("列表为空");
     }
 
     return toJson;
   }
 
   public ToJson<UserJob> updateUserJob(UserJob userJob)
   {
     ToJson toJson = new ToJson(1, "error");
     int a = this.positionManagementMapper.updateUserJob(userJob);
     if (a > 0)
     {
       toJson.setFlag(0);
       toJson.setMsg("修改成功");
     } else {
       toJson.setFlag(1);
       toJson.setMsg("修改失败");
     }
     return toJson;
   }
 
   public ToJson<UserJob> deleteUserJob(Integer jobId)
   {
     ToJson toJson = new ToJson(1, "error");
     int a = this.positionManagementMapper.deleteUserJob(jobId);
     if (a > 0) {
       toJson.setFlag(0);
       toJson.setMsg("删除成功");
     }
     else {
       toJson.setFlag(1);
       toJson.setMsg("删除失败");
     }
 
     return toJson;
   }
 
   public ToJson<UserJob> addUserJob(UserJob userJob)
   {
     ToJson toJson = new ToJson(1, "error");
     int a = this.positionManagementMapper.addUserJob(userJob);
     if (a > 0) {
       toJson.setFlag(0);
       toJson.setMsg("插入成功");
     } else {
       toJson.setFlag(1);
       toJson.setMsg("插入失败");
     }
     return toJson;
   }
 
   public ToJson<UserJob> getUserjobId(HttpServletRequest request, Integer jobId) {
     ToJson toJson = new ToJson(1, "error");
     UserJob list = this.positionManagementMapper.getUserjobId(jobId);
 
     if (list != null) {
       SysCode sysCode = this.sysCodeMapper.getSingleCode("function", String.valueOf(list.getType()));
       if (sysCode != null)
         list.setTypeName(sysCode.getCodeName());
       else {
         list.setTypeName("");
       }
 
       String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
       ContextHolder.setConsumerType(sqlType);
 
       if ((!StringUtils.checkNull(list.getAttachmentName()).booleanValue()) && (!StringUtils.checkNull(list.getAttachmentId()).booleanValue())) {
         list.setAttachment(GetAttachmentListUtil.returnAttachment(list.getAttachmentName(), list.getAttachmentId(), sqlType, "userjob"));
       }
       Department mapperDeptById = this.departmentMapper.getDeptById(list.getDeptId().intValue());
       if (mapperDeptById != null)
         list.setDeptName(mapperDeptById.getDeptName());
       else {
         list.setDeptName("");
       }
 
     }
 
     if (list != null) {
       toJson.setFlag(0);
       toJson.setMsg("查询成功");
       toJson.setObject(list);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("查询数据为空");
     }
 
     return toJson;
   }
 }
