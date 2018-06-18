package com.myoa.controller.timedTaskManagement;

import com.myoa.model.timedTaskManagement.TimedTaskManagement;
import com.myoa.model.timedTaskManagement.TimedTaskRecord;
import com.myoa.model.users.Users;
import com.myoa.service.timedTaskManagement.TimedTaskManagementService;
import com.myoa.service.timedTaskManagement.TimedTaskRecordService;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/TimedTaskManagementController" })
public class TimedTaskManagementController {

	@Resource
	private TimedTaskManagementService timedTaskManagementService;

	@Resource
	private TimedTaskRecordService timedTaskRecordService;

	@RequestMapping({ "/selectTimedTaskKey" })
	@ResponseBody
	public ToJson selectTimedTaskKey(HttpServletRequest request) {
		ToJson json = new ToJson();
		String ttmids = request.getParameter("ttmId");
		if (ttmids != null) {
			Integer ttmId = Integer.valueOf(ttmids);
			TimedTaskManagement timedTaskManagement = this.timedTaskManagementService
					.selectTimedTaskKey(ttmId);
			if (timedTaskManagement != null) {
				json.setObject(timedTaskManagement);
				json.setFlag(0);
				json.setMsg("ok");
				return json;
			}
			json.setFlag(0);
			json.setMsg("err");
			return json;
		}
		json.setFlag(0);
		json.setMsg("err");
		return json;
	}

	@RequestMapping({ "/TimedSelect" })
	@ResponseBody
	public ToJson TimedSelect() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ToJson json = new ToJson();
		List<TimedTaskManagement> list = this.timedTaskManagementService
				.selectTimeManagerTo();
		for (TimedTaskManagement timedTaskManagement : list) {
			if (timedTaskManagement.getExecutionTime() != null) {
				try {
					String dates = formatter.format(timedTaskManagement
							.getExecutionTime());
					Date date = formatter.parse(dates);
					timedTaskManagement.setExecutionTime(date);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (list.size() > 0) {
			json.setObj(list);
			json.setMsg("ok");
			json.setFlag(0);
			return json;
		}
		json.setMsg("ok,wu");
		json.setFlag(0);
		return json;
	}

	@RequestMapping({ "/imedTaskManagement" })
	public String imedTaskManagement() {
		return "app/timedTaskManagement/timedTaskManagement";
	}

	@RequestMapping({ "/updateTimedTaskManagement" })
	@ResponseBody
	@Transient
	public ToJson updateTimedTaskManagement(HttpServletRequest request) {
		ToJson json = new ToJson();
		Map map = new HashMap();
		if (request.getParameter("execute") != null) {
			map.put("execute", Integer.valueOf(request.getParameter("execute")));
		}
		if (request.getParameter("intwevalTime") != null) {
			map.put("intwevalTime", request.getParameter("intwevalTime") + "");
		}
		if (request.getParameter("executionTimeat") != null) {
			map.put("executionTimeat", request.getParameter("executionTimeat")
					+ "");
		}
		if (request.getParameter("ttmId") != null) {
			Integer ttmId = Integer.valueOf(request.getParameter("ttmId")
					.toString());
			map.put("ttmId", ttmId);
			int i = this.timedTaskManagementService
					.updateTimedTaskManagement(map);
			if (i > 0) {
				json.setMsg("ok");
				json.setFlag(0);
				return json;
			}
			json.setMsg("err");
			json.setFlag(0);
			return json;
		}
		json.setMsg("err");
		json.setFlag(0);
		return json;
	}

	@RequestMapping({ "/stactTo" })
	@ResponseBody
	@Transient
	public ToJson stactTo(HttpServletRequest request, Integer ttmId,
			Integer taskType) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		Date date = new Date();
		try {
			date = df.parse(df.format(date));
		} catch (Exception e) {
			e.printStackTrace();
		}
		ToJson json = new ToJson();

		TimedTaskManagement timedTaskManagement1 = this.timedTaskManagementService
				.selectTimedTaskOne(ttmId, taskType);
		switch (ttmId.intValue()) {
		case 1:
			staticTte(timedTaskManagement1, ttmId, user, date);
			break;
		case 2:
			staticTte(timedTaskManagement1, ttmId, user, date);
			break;
		case 3:
			staticTte(timedTaskManagement1, ttmId, user, date);
			break;
		case 4:
			staticTte(timedTaskManagement1, ttmId, user, date);
			break;
		}

		return json;
	}

	private ToJson staticTte(TimedTaskManagement timedTaskManagement1,
			Integer ttmId, Users user, Date date) {
		ToJson json = new ToJson();
		TimedTaskRecord timedTaskRecord = null;
		if (timedTaskManagement1 != null) {
			timedTaskRecord.setTtmId(ttmId);
			timedTaskRecord.setUserId(user.getUserId());
			timedTaskRecord.setExecutionTime(date);
			timedTaskRecord.setResult(Integer.valueOf(0));
			timedTaskRecord.setLishiTime(timedTaskManagement1.getLishiTime());

			int t = this.timedTaskRecordService
					.insertTimedRecord(timedTaskRecord);
			if (t > 0) {
				json.setFlag(0);
				json.setMsg("ok");
				return json;
			}
			json.setFlag(1);
			json.setMsg("err");
		} else {
			timedTaskRecord.setTtmId(ttmId);
			timedTaskRecord.setUserId(user.getUserId());
			timedTaskRecord.setExecutionTime(date);
			timedTaskRecord.setResult(Integer.valueOf(0));
			timedTaskRecord.setLishiTime(date);

			int t = this.timedTaskRecordService
					.insertTimedRecord(timedTaskRecord);
			if (t > 0) {
				json.setFlag(0);
				json.setMsg("ok");
				return json;
			}
			json.setFlag(1);
			json.setMsg("err");
		}

		return json;
	}
}
