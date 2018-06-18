 package com.myoa.service.users.impl;
 
 import com.myoa.dao.users.UserGroupMapper;
import com.myoa.model.users.UserGroup;
import com.myoa.model.users.Users;
import com.myoa.service.users.UserGroupService;
import com.myoa.service.users.UsersService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;

 import java.util.List;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class UserGroupServiceImpl
   implements UserGroupService
 {
 
   @Resource
   private UserGroupMapper userGroupMapper;
 
   @Resource
   private UsersService usersService;
 
   @Transactional
   public ToJson<UserGroup> insertUserGroup(UserGroup userGroup)
   {
     ToJson json = new ToJson(1, "error");
     int count = 0;
     try {
       if (userGroup != null) {
         userGroup.setUserStr("");
         count = this.userGroupMapper.insertUserGroup(userGroup);
       }
       if (count != 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg(e.getMessage());
       L.e(new Object[] { "UserGroupServiceImpl insertUserGroup:" + e });
     }
     return json;
   }
 
   @Transactional
   public ToJson<UserGroup> updateUserGroup(UserGroup userGroup)
   {
     ToJson json = new ToJson(1, "error");
     int count = 0;
     try {
       if (userGroup != null) {
         count = this.userGroupMapper.updateUserGroup(userGroup);
       }
       if (count != 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "UserGroupServiceImpl updateUserGroup:" + e });
     }
     return json;
   }
 
   public ToJson<UserGroup> getAllUserGroup()
   {
     ToJson json = new ToJson(1, "error");
     int count = 0;
     try {
       List userGroupList = this.userGroupMapper.getAllUserGroup();
       if ((userGroupList != null) && (userGroupList.size() > 0)) {
         json.setObj(userGroupList);
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "UserGroupServiceImpl getAllUserGroup:" + e });
     }
     return json;
   }
 
   @Transactional
   public ToJson<UserGroup> delUserGroupByGroupId(String groupId)
   {
     ToJson json = new ToJson(1, "error");
     int count = 0;
     try {
       if (!StringUtils.checkNull(groupId).booleanValue()) {
         count = this.userGroupMapper.delUserGroupByGroupId(groupId);
       }
       if (count != 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "UserGroupServiceImpl delUserGroupByGroupId:" + e });
     }
     return json;
   }
 
   public ToJson<UserGroup> getUserGroupByGroupId(String groupId)
   {
     ToJson json = new ToJson(1, "error");
     UserGroup userGroup = new UserGroup();
     try {
       if (!StringUtils.checkNull(groupId).booleanValue()) {
         userGroup = this.userGroupMapper.getUserGroupByGroupId(groupId);
         StringBuffer userNameStr = new StringBuffer();
         if ((userGroup != null) && 
           (!StringUtils.checkNull(userGroup.getUserStr()).booleanValue())) {
           List <Users>usersList = this.usersService.getUsersByUids(userGroup.getUserStr());
           for (Users users : usersList) {
             if ((users != null) && 
               (!StringUtils.checkNull(users.getUserName()).booleanValue())) {
               userNameStr.append(users.getUserName() + ",");
             }
           }
 
           userGroup.setUserName(userNameStr.toString());
         }
 
         json.setObject(userGroup);
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "UserGroupServiceImpl getUserGroupByGroupId:" + e });
     }
     return json;
   }
 }
