package com.myoa.controller.syspara;

import com.myoa.model.common.SysPara;
import com.myoa.model.users.Users;
import com.myoa.service.common.SecureRuleService;
import com.myoa.service.syspara.SysParaService;
import com.myoa.util.AjaxJson;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/syspara" })
public class SysParaController {
	private Logger loger = Logger.getLogger(SysParaController.class);

	@Resource
	private SysParaService sysParaService;

	@Resource
	private SecureRuleService secureRuleService;

	@ResponseBody
	@RequestMapping(value = { "/selectSysPara" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<SysPara> selectSysPara(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List list = this.sysParaService.getIeTitle();

			tojson.setObject(list);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}

	@RequestMapping(value = { "/updateSysPara" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public ToJson<SysPara> updateSysPara(SysPara sysPara,
			HttpServletRequest request, SysParaService surface) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		this.loger.debug("ID" + surface.getIeTitle());
		try {
			this.sysParaService.updateSysPara(sysPara);
			this.sysParaService.updateSysPara1(sysPara);
			tojson.setObject(sysPara);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}

	@ResponseBody
	@RequestMapping(value = { "/selectTheSysPara" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<SysPara> selectTheSysPara(HttpServletRequest request,
			String paraName) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List list = this.sysParaService.getTheSysParam(paraName);

			tojson.setObject(list);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}

	@RequestMapping({ "/updateSysParaByParaName" })
	public String updateSysPara(SysPara sysPara, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			this.sysParaService.updateSysPara(sysPara);
			return "redirect:selectTheSysPara?paraName="
					+ sysPara.getParaName();
		} catch (Exception e) {
		}
		return null;
	}

	@RequestMapping({ "/editSysPara" })
	@ResponseBody
	public ToJson<Object> editSysPara(String usersIds) {
		return this.sysParaService.editSysPara(usersIds);
	}

	@RequestMapping({ "/getUserName" })
	@ResponseBody
	public ToJson<SysPara> getUserName(String paraName) {
		return this.sysParaService.getUserName(paraName);
	}

	@RequestMapping({ "/checkSecureAdmin" })
	@ResponseBody
	public String checkSecureAdmin(HttpServletRequest request) {
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		if (users.getUserId().equals("admin")) {
			return "OK";
		}
		return "当前用户并非三员超级管理员，不可执行该操作";
	}

	@RequestMapping({ "/eduSetParam" })
	@ResponseBody
	public ToJson<SysPara> eduSetParam(String firstDate, String secondDate,
			String initPwd) {
		return this.sysParaService.eduSetParam(firstDate, secondDate, initPwd);
	}

	@RequestMapping({ "/selEduParam" })
	@ResponseBody
	public AjaxJson selEduParam() {
		return this.sysParaService.selEduParam();
	}

	@RequestMapping({ "/eduSetParamIndex" })
	public String eduSetParamIndex() {
		return "app/edu/eduSetParam/setParam";
	}

	@RequestMapping({ "/editOperator" })
	@ResponseBody
	public ToJson<Object> editOperator(String usersIds) {
		return this.sysParaService.editOperator(usersIds);
	}

	@RequestMapping({ "/getStatus" })
	@ResponseBody
	public ToJson<Object> getStatus() {
		return this.sysParaService.getStatus();
	}

	@RequestMapping({ "/getOperator" })
	@ResponseBody
	public ToJson<SysPara> getOperator(String paraName) {
		return this.sysParaService.getOperator(paraName);
	}
}
