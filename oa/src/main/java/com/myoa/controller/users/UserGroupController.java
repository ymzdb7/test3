package com.myoa.controller.users;

import com.myoa.model.users.UserGroup;
import com.myoa.model.users.Users;
import com.myoa.service.users.UserGroupService;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/usergroup" })
public class UserGroupController {
	private Logger loger = Logger.getLogger(UserGroupController.class);

	@Resource
	UserGroupService userGroupService;

	@RequestMapping({ "/userGroup" })
	public String userGroup() {
		return "app/department/userGroup";
	}

	@RequestMapping({ "/addUserGroup" })
	public String addUserGroup() {
		return "app/department/addUserGroup";
	}

	@ResponseBody
	@RequestMapping({ "/insertUserGroup" })
	public ToJson<UserGroup> insertUserGroup(UserGroup userGroup,
			HttpServletRequest request) {
		if (userGroup != null) {
			Users user = (Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users());
			userGroup.setUserId(user.getUserId());
		}
		return this.userGroupService.insertUserGroup(userGroup);
	}

	@ResponseBody
	@RequestMapping({ "/updateUserGroup" })
	public ToJson<UserGroup> updateUserGroup(UserGroup userGroup) {
		return this.userGroupService.updateUserGroup(userGroup);
	}

	@ResponseBody
	@RequestMapping({ "/getAllUserGroup" })
	public ToJson<UserGroup> getAllUserGroup() {
		return this.userGroupService.getAllUserGroup();
	}

	@ResponseBody
	@RequestMapping({ "/delUserGroupByGroupId" })
	public ToJson<UserGroup> delUserGroupByGroupId(String groupId) {
		return this.userGroupService.delUserGroupByGroupId(groupId);
	}

	@ResponseBody
	@RequestMapping({ "/getUserGroupByGroupId" })
	public ToJson<UserGroup> getUserGroupByGroupId(String groupId) {
		return this.userGroupService.getUserGroupByGroupId(groupId);
	}
}
