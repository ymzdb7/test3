package com.myoa.dao.users;

import com.myoa.model.users.UserGroup;

import java.util.List;

public abstract interface UserGroupMapper {
	public abstract int insertUserGroup(UserGroup paramUserGroup);

	public abstract int updateUserGroup(UserGroup paramUserGroup);

	public abstract List<UserGroup> getAllUserGroup();

	public abstract int delUserGroupByGroupId(String paramString);

	public abstract UserGroup getUserGroupByGroupId(String paramString);
}
