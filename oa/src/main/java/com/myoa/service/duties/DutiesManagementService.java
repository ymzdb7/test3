 package com.myoa.service.duties;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.duties.DutiesManagementMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.department.Department;
import com.myoa.model.duties.UserPost;
import com.myoa.service.notify.NotifyService;
import com.myoa.util.Constant;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class DutiesManagementService
 {
 
   @Autowired
   DutiesManagementMapper dutiesManagementMapper;
 
   @Autowired
   SysCodeMapper sysCodeMapper;
 
   @Autowired
   DepartmentMapper departmentMapper;
 
   @Autowired
   NotifyService notifyService;
 
   public ToJson<UserPost> getUserPostId(HttpServletRequest request, Integer postId)
   {
     ToJson<UserPost> toJson = new ToJson<UserPost>(1, "error");
     UserPost list = this.dutiesManagementMapper.getUserPostId(postId);
 
     if (list != null) {
       SysCode sysCode = this.sysCodeMapper.getSingleCode("function", String.valueOf(list.getType()));
       if (sysCode != null)
         list.setTypeName(sysCode.getCodeName());
       else {
         list.setTypeName("");
       }
 
       String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
       ContextHolder.setConsumerType(sqlType);
       if ((list.getAttachmentName() != null) && (list.getAttachmentId() != null)) {
         list.setAttachment(GetAttachmentListUtil.returnAttachment(list.getAttachmentName(), list.getAttachmentId(), sqlType, "userpost"));
       }
 
       Department department = this.departmentMapper.getDeptById(list.getDeptId().intValue());
       if (department != null) {
         list.setDeptName(department.getDeptName());
       }
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
       toJson.setMsg("没有数据");
     }
 
     return toJson;
   }
 
   public ToJson<UserPost> selectUserPostList(UserPost userPost, HttpServletRequest request) {
     ToJson<UserPost> toJson = new ToJson<UserPost>(1, "error");
 
     List<UserPost> list = this.dutiesManagementMapper.selectUserPostList(userPost);
 
     for (UserPost userPost1 : list) {
       SysCode sysCode = this.sysCodeMapper.getSingleCode("function", String.valueOf(userPost1.getType()));
       if (sysCode != null) {
         userPost1.setTypeName(sysCode.getCodeName());
       }
       else
       {
         userPost1.setTypeName("");
       }
 
       Department department = this.departmentMapper.getDeptById(userPost1.getDeptId().intValue());
       if (department != null)
       {
         userPost1.setDeptName(department.getDeptName());
       }
       else userPost1.setTypeName("");
 
     }
 
     if (list != null)
     {
       toJson.setFlag(0);
       toJson.setMsg("查询成功");
       toJson.setObj(list);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("查询数据为空");
     }
 
     return toJson;
   }
 
   public ToJson<UserPost> updateUserPost(UserPost userPost)
   {
     ToJson<UserPost> toJson = new ToJson<UserPost>(1, "error");
     int a = this.dutiesManagementMapper.updateUserPost(userPost);
     if (a > 0) {
       toJson.setFlag(0);
       toJson.setMsg("修改成功");
     } else {
       toJson.setFlag(1);
       toJson.setMsg("修改失败");
     }
     return toJson;
   }
 
   public ToJson<UserPost> deleteUserPost(Integer postId)
   {
     ToJson<UserPost> toJson = new ToJson<UserPost>(1, "error");
     int a = this.dutiesManagementMapper.deleteUserPost(postId);
     if (a > 0) {
       toJson.setFlag(0);
       toJson.setMsg("删除成功");
     } else {
       toJson.setFlag(1);
       toJson.setMsg("删除失败");
     }
     return toJson;
   }
 
   public ToJson<UserPost> addUserPost(UserPost userPost) {
     ToJson<UserPost> toJson = new ToJson<UserPost>(1, "error");
     int a = this.dutiesManagementMapper.addUserPost(userPost);
     if (a > 0) {
       toJson.setFlag(0);
       toJson.setMsg("添加成功");
     } else {
       toJson.setFlag(1);
       toJson.setMsg("添加失败");
     }
     return toJson;
   }
 }

