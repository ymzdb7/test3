package com.myoa.controller.attend;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.attend.AttendSet;
import com.myoa.model.users.Users;
import com.myoa.service.attend.AttendSetService;
import com.myoa.util.Constant;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

@Controller
@RequestMapping({ "/attendSet" })
public class AttendSetController {

	@Autowired
	private AttendSetService attendSetService;

	@RequestMapping(value = { "/newAttendSet" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrapper newAttendSet(AttendSet attendSet, String commute1,
			String commute2, String commute3, String commute4, String commute5,
			String commute6, String atime1Setother, String atime2Setother,
			String atime3Setother, String atime4Setother,
			String atime5Setother, String atime6Setother) {
		return this.attendSetService.newAttendSet(attendSet, commute1,
				commute2, commute3, commute4, commute5, commute6,
				atime1Setother, atime2Setother, atime3Setother, atime4Setother,
				atime5Setother, atime6Setother);
	}

	@RequestMapping(value = { "/updateAttendSet" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrapper updateAttendSet(AttendSet attendSet, String commute1,
			String commute2, String commute3, String commute4, String commute5,
			String commute6, String atime1Setother, String atime2Setother,
			String atime3Setother, String atime4Setother,
			String atime5Setother, String atime6Setother) {
		return this.attendSetService.updateAttendSet(attendSet, commute1,
				commute2, commute3, commute4, commute5, commute6,
				atime1Setother, atime2Setother, atime3Setother, atime4Setother,
				atime5Setother, atime6Setother);
	}

	@RequestMapping(value = { "/selsectAttendSet" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrapper selsectAttendSet(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.attendSetService.selectAttendSet();
	}

	@RequestMapping(value = { "/queryAttendSetId" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrapper queryAttendSetId(HttpServletRequest request, String sid) {
		Integer uid = ((Users) SessionUtils.getSessionInfo(
				request.getSession(), Users.class, new Users())).getUid();
		return this.attendSetService.queryAttendSetId(sid, uid, request);
	}

	@RequestMapping(value = { "/queryAttendSetIdDemo" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrapper queryAttendSetIdDemo(HttpServletRequest request,
			String sid) {
		Integer uid = ((Users) SessionUtils.getSessionInfo(
				request.getSession(), Users.class, new Users())).getUid();
		return this.attendSetService.queryAttendSetIdDemo(sid, uid, request);
	}

	@RequestMapping(value = { "/delAttendSetbyId" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrapper delAttendSetbyId(HttpServletRequest request, String sid) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.attendSetService.delAttendSetbyId(sid);
	}
}
