package com.myoa.controller.duties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myoa.model.duties.UserPost;
import com.myoa.service.duties.DutiesManagementService;
import com.myoa.util.ToJson;

@RestController
@RequestMapping({ "/duties" })
public class DutiesManagementController {

	@Autowired
	DutiesManagementService dutiesManagementService;

	@RequestMapping({ "/getUserPostId" })
	public ToJson<UserPost> getUserPostId(HttpServletRequest request,
			Integer postId) {
		ToJson toJson = this.dutiesManagementService.getUserPostId(request,
				postId);

		return toJson;
	}

	@RequestMapping({ "/selectUserPostList" })
	public ToJson<UserPost> selectUserPostList(UserPost userPost,
			HttpServletRequest request) {
		ToJson toJson = this.dutiesManagementService.selectUserPostList(
				userPost, request);

		return toJson;
	}

	@RequestMapping({ "/updateUserPost" })
	public ToJson<UserPost> updateUserPost(UserPost userPost) {
		ToJson toJson = this.dutiesManagementService.updateUserPost(userPost);

		return toJson;
	}

	@RequestMapping({ "/deleteUserPost" })
	public ToJson<UserPost> deleteUserPost(Integer postId) {
		ToJson toJson = this.dutiesManagementService.deleteUserPost(postId);

		return toJson;
	}

	@RequestMapping({ "/addUserPost" })
	public ToJson<UserPost> addUserPost(UserPost userPost) {
		ToJson toJson = this.dutiesManagementService.addUserPost(userPost);

		return toJson;
	}
}
