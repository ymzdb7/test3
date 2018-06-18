package com.myoa.controller.position;

import com.myoa.model.position.UserJob;
import com.myoa.service.position.PositionManagementService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/position" })
public class PositionManagementController {

	@Autowired
	PositionManagementService positionManagementService;

	@RequestMapping({ "/selectUserJob" })
	public ToJson<UserJob> selectUserJob(UserJob userJob) {
		ToJson toJson = this.positionManagementService
				.selectUserJobList(userJob);
		return toJson;
	}

	@RequestMapping({ "/updateUserJob" })
	public ToJson<UserJob> updateUserJob(UserJob userJob) {
		ToJson toJson = this.positionManagementService.updateUserJob(userJob);

		return toJson;
	}

	@RequestMapping({ "/deleteUserJob" })
	public ToJson<UserJob> deleteUserJob(Integer jobId) {
		ToJson toJson = this.positionManagementService.deleteUserJob(jobId);
		return toJson;
	}

	@RequestMapping({ "/addUserJob" })
	public ToJson<UserJob> addUserJob(UserJob userJob) {
		ToJson toJson = this.positionManagementService.addUserJob(userJob);

		return toJson;
	}

	@RequestMapping({ "/getUserjobId" })
	public ToJson<UserJob> getUserjobId(HttpServletRequest request,
			Integer jobId) {
		ToJson toJson = this.positionManagementService.getUserjobId(request,
				jobId);

		return toJson;
	}
}
