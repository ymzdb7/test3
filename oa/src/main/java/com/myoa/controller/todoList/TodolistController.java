package com.myoa.controller.todoList;

import com.myoa.model.daiban.Daiban;
import com.myoa.model.menu.SysFunction;
import com.myoa.model.users.Users;
import com.myoa.service.email.EmailService;
import com.myoa.service.notify.NotifyService;
import com.myoa.service.todoList.TodolistService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodolistController {
	private Logger loger = Logger.getLogger(TodolistController.class);

	@Resource
	private TodolistService todolistService;

	@Resource
	private EmailService emailService;

	@Resource
	private NotifyService notifyService;

	@ResponseBody
	@RequestMapping(value = { "/todoList/list" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Daiban> list(HttpServletRequest request,
			@RequestParam(value = "userId", required = false) String userId) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			String sqlType = Constant.MYOA
					+ (String) request.getSession().getAttribute(
							"loginDateSouse");

			if (!StringUtils.checkNull(userId).booleanValue()) {
				Daiban db = this.todolistService.list(userId, sqlType, request);
				json.setObject(db);
				json.setMsg("OK");
				json.setFlag(0);
			} else {
				Users user = (Users) SessionUtils.getSessionInfo(
						request.getSession(), Users.class, new Users());
				Daiban db = this.todolistService.list(
						String.valueOf(user.getUserId()), sqlType, request);
				json.setObject(db);
				json.setMsg("OK");
				json.setFlag(0);
			}
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/todoList/readList" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Daiban> readList(HttpServletRequest request,
			@RequestParam(value = "userId", required = false) String userId) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			String sqlType = Constant.MYOA
					+ (String) request.getSession().getAttribute(
							"loginDateSouse");

			if (!StringUtils.checkNull(userId).booleanValue()) {
				Daiban db = this.todolistService.readList(userId, sqlType,
						request);
				json.setObject(db);
				json.setMsg("OK");
				json.setFlag(0);
			} else {
				Users user = (Users) SessionUtils.getSessionInfo(
						request.getSession(), Users.class, new Users());
				Daiban db = this.todolistService.readList(
						String.valueOf(user.getUserId()), sqlType, request);
				json.setObject(db);
				json.setMsg("OK");
				json.setFlag(0);
			}
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/todoList/readHaveList" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper readHaveList(String classification,
			HttpServletRequest request,
			@RequestParam(value = "userId", required = false) String userId)
			throws Exception {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		if (!StringUtils.checkNull(userId).booleanValue()) {
			return this.todolistService.readHaveList(classification, userId,
					sqlType, request);
		}
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.todolistService.readHaveList(classification,
				user.getUserId(), sqlType, request);
	}

	@ResponseBody
	@RequestMapping(value = { "/todoList/readTotal" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Daiban> readTotal(HttpServletRequest request,
			@RequestParam(value = "userId", required = false) String userId,
			String superfluity) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			String sqlType = Constant.MYOA
					+ (String) request.getSession().getAttribute(
							"loginDateSouse");

			if (!StringUtils.checkNull(userId).booleanValue()) {
				Daiban db = this.todolistService.readTotal(userId, sqlType,
						request, superfluity);
				json.setObject(db);
				json.setMsg("OK");
				json.setFlag(0);
			} else {
				Users user = (Users) SessionUtils.getSessionInfo(
						request.getSession(), Users.class, new Users());
				Daiban db = this.todolistService.readTotal(
						String.valueOf(user.getUserId()), sqlType, request,
						superfluity);
				json.setObject(db);
				json.setMsg("OK");
				json.setFlag(0);
			}
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/todoList/delete" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Daiban> delete(HttpServletRequest request, Integer qid,
			String type, String deleteFlag) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			String returnRes;
			if (type.equals("email")) {
				returnRes = this.emailService.deleteInEmail(qid, deleteFlag);
			}
			if (type.equals("notify")) {
				this.notifyService.delete(qid);
			}
			if (json.getObj().size() > 0) {
				json.setFlag(0);
				json.setMsg("ok");
			} else {
				json.setFlag(1);
				json.setMsg("error");
			}
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/todoList/queryUserByUserId" })
	public ToJson<Users> queryUserByUserId(String userName) {
		if (StringUtils.checkNull(userName).booleanValue()) {
			userName = "";
		}
		return this.todolistService.queryUserByUserId(userName.trim());
	}

	@ResponseBody
	@RequestMapping({ "/todoList/queryCountByUserId" })
	public ToJson<Users> queryCountByUserId(String userName) {
		if (StringUtils.checkNull(userName).booleanValue()) {
			userName = "";
		}
		return this.todolistService.queryCountByUserId(userName.trim());
	}

	@ResponseBody
	@RequestMapping({ "/todoList/getSysFunctionByName" })
	public ToJson<SysFunction> getSysFunctionByName(String funName,
			HttpServletRequest request) {
		return this.todolistService.getSysFunctionByName(funName.trim(),
				request);
	}

	@ResponseBody
	@RequestMapping({ "/todoList/getCountSysFunctionByName" })
	public ToJson<SysFunction> getCountSysFunctionByName(String funName) {
		return this.todolistService.getCountSysFunctionByName(funName.trim());
	}

	@ResponseBody
	@RequestMapping({ "/todoList/smsListByType" })
	public BaseWrapper SmsListByType(String userId, HttpServletRequest request,
			String type) {
		return this.todolistService.smsListByType(userId, request, type);
	}

	@ResponseBody
	@RequestMapping({ "/todoList/getUserFunctionByUserId" })
	public BaseWrapper getUserFunctionByUserId(String userId,
			HttpServletRequest request) {
		return this.todolistService.getUserFunctionByUserId(userId, request);
	}

	@ResponseBody
	@RequestMapping({ "/todoList/getWillDocSendOrReceive" })
	public BaseWrapper getWillDocSendOrReceive(String userId,
			String documentType, HttpServletRequest request) {
		return this.todolistService.getWillDocSendOrReceive(userId,
				documentType, request);
	}
}
