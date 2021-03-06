package com.myoa.controller.calender;

import com.myoa.dao.users.UsersMapper;
import com.myoa.model.calender.Calendar;
import com.myoa.model.users.Users;
import com.myoa.service.calender.CalenderService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalenderController {
	private Logger loger = LoggerFactory.getLogger(CalenderController.class);

	@Resource
	private CalenderService calenderService;

	@Resource
	private UsersMapper usersMapper;

	@RequestMapping({ "/schedule/index" })
	public String index(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/calendar/index";
	}

	@RequestMapping({ "/schedule/query" })
	public String ScheduleInquiry(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/calendar/query";
	}

	@RequestMapping({ "/schedule/info" })
	public String info(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/calendar/info";
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/getschedule" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> getschedule(HttpServletRequest request,
			String calTime, String endTime,
			@RequestParam(value = "userId", required = false) String userId) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			if (StringUtils.checkNull(userId).booleanValue()) {
				userId = ((Users) SessionUtils.getSessionInfo(
						request.getSession(), Users.class, new Users()))
						.getUserId();
			}
			List list = this.calenderService.getschedule(
					Integer.parseInt(calTime), Integer.parseInt(endTime),
					userId);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/getscheduleBycId" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> getscheduleBycId(HttpServletRequest request,
			String userId,
			@RequestParam(value = "time", required = false) String calTime) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			List list = new ArrayList();
			if (!StringUtils.checkNull(calTime).booleanValue()) {
				list = this.calenderService.getscheduleBycId(userId, calTime);
			} else
				list = this.calenderService.getscheduleBycId(userId);

			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/getAllschedule" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> getAllschedule(HttpServletRequest request,
			String userId) {
		ToJson json = new ToJson(0, null);
		try {
			List list = this.calenderService.getAllschedule(userId);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
			json.setMsg("fasle");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/getAllscheduleinfo" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> getAllscheduleinfo(Map<String, Object> maps,
			HttpServletRequest request, Integer deptId) {
		ToJson json = new ToJson(1, "error");
		try {
			List list = this.calenderService.getAllscheduleinfo(deptId);
			json.setObj(list);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
			json.setMsg("false");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/getscheduleByDay" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> getscheduleByDay(HttpServletRequest request,
			String userId, int time) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			List list = this.calenderService.getscheduleByDay(userId, time);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/addCalender" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> addCalender(
			HttpServletRequest request,
			@RequestParam("calType") String calType,
			@RequestParam("content") String content,
			@RequestParam("calTime") String calTime,
			@RequestParam("endTime") String endTime,
			@RequestParam("userId") String userId,
			@RequestParam("calLevel") String calLevel,
			@RequestParam(value = "owner", required = false, defaultValue = "") String owner,
			@RequestParam(value = "taker", required = false, defaultValue = "") String taker,
			@RequestParam(value = "beforeDay", required = false, defaultValue = "0") String beforeDay,
			@RequestParam(value = "beforeHour", required = false, defaultValue = "0") String beforeHour,
			@RequestParam(value = "beforeMin", required = false, defaultValue = "0") String beforeMin) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Calendar c = new Calendar();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

			c.setUserId(userId);
			c.setEndTime(Integer.valueOf(Integer.parseInt(endTime)));
			c.setCalTime(Integer.valueOf(Integer.parseInt(calTime)));
			c.setContent(content);
			c.setCalType(calType);
			c.setCalLevel(calLevel);
			c.setManagerId("");
			c.setOverStatus("");

			c.setBeforeRemaind(beforeDay + "|" + beforeHour + "|" + beforeMin);
			c.setAddTime(new Date());
			c.setOwner(owner);
			c.setTaker(taker);
			byte a = 0;
			c.setAllday(Byte.valueOf(a));
			c.setFromModule(Byte.valueOf(a));
			c.setUrl("");
			c.setmId(Integer.valueOf(1));
			c.setResId(Integer.valueOf(1));
			this.calenderService.insertSelective(c);
			json.setObject(c);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/delete" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> delete(HttpServletRequest request, String calId) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			this.calenderService.delete(Integer.parseInt(calId), request);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/editCalender" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> editCalender(
			HttpServletRequest request,
			@RequestParam("calType") String calType,
			@RequestParam("content") String content,
			@RequestParam("calTime") String calTime,
			@RequestParam("endTime") String endTime,
			@RequestParam("userId") String userId,
			@RequestParam("calLevel") String calLevel,
			@RequestParam("calId") String calId,
			@RequestParam(value = "owner", required = false) String owner,
			@RequestParam(value = "taker", required = false) String taker,
			@RequestParam(value = "beforeDay", required = false, defaultValue = "0") String beforeDay,
			@RequestParam(value = "beforeHour", required = false, defaultValue = "0") String beforeHour,
			@RequestParam(value = "beforeMin", required = false, defaultValue = "0") String beforeMin) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Calendar c = new Calendar();
			c.setUserId(userId);
			c.setEndTime(Integer.valueOf(Integer.parseInt(endTime)));
			c.setCalTime(Integer.valueOf(Integer.parseInt(calTime)));
			c.setContent(content);
			c.setCalType(calType);
			c.setCalLevel(calLevel);
			c.setCalId(Integer.valueOf(Integer.parseInt(calId)));
			c.setOwner(owner);
			c.setTaker(taker);
			c.setBeforeRemaind(beforeDay + "|" + beforeHour + "|" + beforeMin);
			int count = this.calenderService.update(c);
			if (count > 0) {
				json.setObject(c);
				json.setMsg("OK");
				json.setFlag(0);
			}
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/getscheduleByDate" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> getscheduleByDate(HttpServletRequest request,
			Date date) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);

		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/addMCalender" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> addMCalender(HttpServletRequest request,
			@RequestParam("calType") String calType,
			@RequestParam("content") String content,
			@RequestParam("calTime") String calTime,
			@RequestParam("endTime") String endTime,
			@RequestParam("userId") String userId,
			@RequestParam("calLevel") String calLevel) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		List list = new ArrayList();
		try {
			String[] calTypes = calType.split("\\*");
			String[] contents = content.split("\\*");
			String[] calTimes = calTime.split("\\*");
			String[] endTimes = endTime.split("\\*");
			String[] userIds = userId.split("\\*");
			String[] calLevels = calLevel.split("\\*");
			for (int i = 0; i < calTypes.length; i++) {
				Calendar c = new Calendar();

				c.setUserId(userIds[i]);
				c.setEndTime(Integer.valueOf(Integer.parseInt(endTimes[i])));
				c.setCalTime(Integer.valueOf(Integer.parseInt(calTimes[i])));
				c.setContent(contents[i]);
				c.setCalType(calTypes[i]);
				c.setCalLevel(calLevels[i]);
				c.setManagerId("");
				c.setOverStatus("");
				c.setBeforeRemaind("");
				c.setAddTime(new Date());
				c.setOwner("");
				c.setTaker("");
				byte a = 0;
				c.setAllday(Byte.valueOf(a));
				c.setFromModule(Byte.valueOf(a));
				c.setUrl("");
				c.setmId(Integer.valueOf(1));
				c.setResId(Integer.valueOf(1));
				this.calenderService.insertSelective(c);
				list.add(c);
			}
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/getscheduleByTakerAndOwner" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> getscheduleByTakerAndOwner(
			HttpServletRequest request, String userId,
			@RequestParam(value = "calTime", required = false) String calTime) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(1, "error");
		try {
			Users user = (Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users());
			userId = user.getUserId();
			List<Calendar> list = new ArrayList<Calendar>();
			if (!StringUtils.checkNull(calTime).booleanValue())
				list = this.calenderService.getscheduleByTakerAndOwner(userId,
						calTime);
			else {
				list = this.calenderService.getscheduleByTakerAndOwner(userId);
			}

			if (list.size() > 0) {
				for (Calendar calendar : list) {
					if (!StringUtils.checkNull(calendar.getTaker())
							.booleanValue()) {
						String[] takerArr = calendar.getTaker().split(",");
						StringBuffer takeName = new StringBuffer();
						for (String takerId : takerArr) {
							if ((StringUtils.checkNull(takerId).booleanValue())
									|| (StringUtils.checkNull(this.usersMapper
											.getUsernameByUserId(takerId))
											.booleanValue()))
								continue;
							takeName.append(this.usersMapper
									.getUsernameByUserId(takerId) + ",");
						}

						calendar.setTakeName(takeName.toString());
					}
					if (!StringUtils.checkNull(calendar.getOwner())
							.booleanValue()) {
						String[] owerArr = calendar.getOwner().split(",");
						StringBuffer owerName = new StringBuffer();
						for (String owerId : owerArr) {
							if ((StringUtils.checkNull(owerId).booleanValue())
									|| (StringUtils.checkNull(this.usersMapper
											.getUsernameByUserId(owerId))
											.booleanValue()))
								continue;
							owerName.append(this.usersMapper
									.getUsernameByUserId(owerId) + ",");
						}

						calendar.setOwnerName(owerName.toString());
					}
				}
			}
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/getAllSchedule" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> getScheduleByUserIdAndType(
			HttpServletRequest request) {
		return this.calenderService.getScheduleByUserIdAndType(request);
	}

	@ResponseBody
	@RequestMapping(value = { "/schedule/getAllScheduleByDeptIdAndDate" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Calendar> getAllScheduleByDeptIdAndDate(String userId,
			String deptId) {
		return this.calenderService.getAllScheduleByDeptIdAndDate(userId,
				deptId);
	}
}
