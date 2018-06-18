package com.myoa.service.users;

import com.myoa.model.users.UserGroup;
import com.myoa.util.ToJson;

public abstract interface UserGroupService
{
  public abstract ToJson<UserGroup> insertUserGroup(UserGroup paramUserGroup);

  public abstract ToJson<UserGroup> updateUserGroup(UserGroup paramUserGroup);

  public abstract ToJson<UserGroup> getAllUserGroup();

  public abstract ToJson<UserGroup> delUserGroupByGroupId(String paramString);

  public abstract ToJson<UserGroup> getUserGroupByGroupId(String paramString);
}

