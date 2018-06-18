package com.myoa.dao.duties;

import com.myoa.model.duties.UserPost;

import java.util.List;

public abstract interface DutiesManagementMapper {
	public abstract UserPost getUserPostId(Integer paramInteger);

	public abstract List<UserPost> selectUserPostList(UserPost paramUserPost);

	public abstract int updateUserPost(UserPost paramUserPost);

	public abstract int deleteUserPost(Integer paramInteger);

	public abstract int addUserPost(UserPost paramUserPost);
}
