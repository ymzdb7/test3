package com.myoa.dao.position;

import com.myoa.model.position.UserJob;

import java.util.List;

public abstract interface PositionManagementMapper {
	public abstract UserJob getUserjobId(Integer paramInteger);

	public abstract List<UserJob> selectUserJobList(UserJob paramUserJob);

	public abstract int updateUserJob(UserJob paramUserJob);

	public abstract int deleteUserJob(Integer paramInteger);

	public abstract int addUserJob(UserJob paramUserJob);

	public abstract int getcount();
}
