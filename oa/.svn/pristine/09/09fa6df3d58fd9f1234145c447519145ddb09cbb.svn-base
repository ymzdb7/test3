package com.myoa.controller.sys;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.myoa.dao.common.SecureLogMapper;
import com.myoa.dao.common.SysParaMapper;
import com.myoa.model.common.SecureLog;
import com.myoa.model.common.SysPara;
import com.myoa.model.notify.Notify;
import com.myoa.model.users.Users;
import com.myoa.service.sys.InterFaceService;
import com.myoa.service.syspara.SysParaNotifyService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.util.AjaxJson;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;
import com.myoa.util.ipUtil.IpAddr;

import java.net.InetAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.codec.digest.Md5Crypt;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/sys" })
public class sysController {
	private Logger loger = Logger.getLogger(sysController.class);

	@Resource
	private SysParaMapper sysParaMapper;

	@Resource
	private SecureLogMapper secureLogMapper;

	@Resource
	private UsersService usersService;

	@Resource
	UsersPrivService usersPrivService;

	@Resource
	SysParaNotifyService sysParaNotifyService;

	@Resource
	InterFaceService interFaceService;

	@RequestMapping({ "/organizational" })
	public String companyInfo(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));
		return "app/sys/Organizational";
	}

	@RequestMapping({ "/statusBar" })
	public String statusBar(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/statusBar";
	}

	@RequestMapping({ "/sysInfo" })
	public String sysInfo(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/sysInfo";
	}

	@RequestMapping({ "/interfaceSettings" })
	public String interfaceSettings(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/interfaceSettings";
	}

	@RequestMapping({ "/menuSetting" })
	public String menuSetting(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/menuSetting";
	}

	@RequestMapping({ "/userInfor" })
	public String userInfor(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/userInfor";
	}

	@RequestMapping({ "/userDetails" })
	public String userDetails(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/userDetails";
	}

	@RequestMapping({ "/underdevelopment" })
	public String underdevelopment(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/underdevelopment";
	}

	@RequestMapping({ "/secure_rule" })
	public String secure_rule(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/secure_rule";
	}

	@RequestMapping({ "/secureIndex" })
	public String secureIndex(HttpServletRequest request,
			Map<String, Object> map) {
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		String sy = (String) SessionUtils.getSessionInfo(request.getSession(),
				"sysuperPwd", String.class);
		if (StringUtils.checkNull(sy).booleanValue()) {
			map.put("sign", Integer.valueOf(0));
			if (users.getUserId().equals("admin")) {
				return "app/sys/secureIndex";
			}
			return "app/common/development";
		}

		map.put("sign", Integer.valueOf(1));
		if (users.getUserId().equals("admin")) {
			return "app/sys/secureIndex";
		}
		return "app/common/development";
	}

	@RequestMapping({ "/checkpwd" })
	@ResponseBody
	public AjaxJson checkpwd(HttpServletRequest request, String password,
			Map<String, Object> map) {
		AjaxJson ajaxJson = new AjaxJson();
		try {
			SysPara sysPara = this.sysParaMapper
					.querySysPara("SECURE_SUPER_PASS");
			String sypwd = sysPara.getParaValue();
			if ((StringUtils.checkNull(password).booleanValue())
					&& (sypwd.equals("tVHbkPWW57Hw."))) {
				SessionUtils.putSession(request.getSession(), "sysuperPwd",
						sypwd);
				ajaxJson.setMsg("OK");
				ajaxJson.setFlag(true);
				return ajaxJson;
			}

			String md5Password = Md5Crypt.md5Crypt(password.getBytes(), sypwd);
			if (sypwd.equals(md5Password)) {
				if (password == "") {
					password = "OK";
				}
				SessionUtils.putSession(request.getSession(), "sysuperPwd",
						password);
				ajaxJson.setMsg("OK");
				ajaxJson.setFlag(true);
				return ajaxJson;
			}
			ajaxJson.setFlag(false);
			ajaxJson.setMsg("false");
		} catch (Exception e) {
			e.printStackTrace();
			ajaxJson.setFlag(false);
			ajaxJson.setMsg("false");
		}
		return ajaxJson;
	}

	@RequestMapping({ "/secureRule" })
	public String secureRule(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/secureRule";
	}

	@RequestMapping({ "/secureManager" })
	public String secureManager(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/secureManager";
	}

	@RequestMapping({ "/getSecureRule" })
	public String getSecureRule() {
		return "app/sys/seIndex2";
	}

	@RequestMapping({ "/secureIndex1" })
	public String secure1(HttpServletRequest request) {
		return "app/sys/seIndex";
	}

	@RequestMapping({ "/secureIndex3" })
	public String secure3(HttpServletRequest request) {
		return "app/sys/index3";
	}

	@RequestMapping({ "/setSuperPwd" })
	public String setSuperPwd(HttpServletRequest request) {
		return "app/sys/setSysSuperPassword";
	}

	@RequestMapping({ "/savesy" })
	@ResponseBody
	public AjaxJson savesy(HttpServletRequest request, String swith,
			String syser, String safer, String auditor, String userPriv) {
		AjaxJson ajaxJson = new AjaxJson();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("swith", swith);
		jsonObject.put("syser", syser);
		jsonObject.put("safer", safer);
		jsonObject.put("auditor", auditor);
		jsonObject.put("userPriv", userPriv);
		String secureSwitch = jsonObject.toString();
		SysPara sysPara = new SysPara();
		sysPara.setParaName("SECURE_SWITCH");
		sysPara.setParaValue(secureSwitch);
		try {
			this.sysParaMapper.updateSysPara(sysPara);
			SecureLog secureLog = new SecureLog();
			if (swith.equals("1")) {
				String remark = "启用三员安全管理";
				secureLog.setRemark(remark);
			}
			if (swith.equals("0")) {
				String remark = "关闭三员安全管理";
				secureLog.setRemark(remark);
			}
			Date date = new Date();
			long time = date.getTime();
			int i1 = Math.abs((int) time);
			secureLog.setLogTime(Integer.valueOf(i1));
			InetAddress currentIp = IpAddr.getCurrentIp();
			secureLog.setIp(currentIp.toString().substring(1,
					currentIp.toString().length()));

			Users users = (Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users());
			Integer uid = users.getUid();
			secureLog.setUid(uid);
			int i2 = this.secureLogMapper.insertSelective(secureLog);
			ajaxJson.setFlag(true);
			ajaxJson.setMsg("true");
		} catch (Exception e) {
			e.printStackTrace();
			ajaxJson.setFlag(false);
			ajaxJson.setMsg(e.getMessage());
		}
		return ajaxJson;
	}

	@RequestMapping({ "/checkSy" })
	@ResponseBody
	public AjaxJson checkSy(HttpServletRequest request) {
		AjaxJson ajaxJson = new AjaxJson();
		SysPara sysPara = this.sysParaMapper.querySysPara("SECURE_SWITCH");
		String paraValue = sysPara.getParaValue();
		Map param = new HashMap();
		JSONArray json = new JSONArray();
		param = (Map) JSONArray.parseObject(paraValue, Map.class);
		String swith = (String) param.get("swith");
		String syser = (String) param.get("syser");
		String safer = (String) param.get("safer");
		String auditor = (String) param.get("auditor");
		String userPriv = (String) param.get("userPriv");
		List syserList = this.usersService.getUserByuId(syser);
		List saferList = this.usersService.getUserByuId(safer);
		List auditorList = this.usersService.getUserByuId(auditor);
		Map map = new HashMap();
		map.put("syser", syserList);
		map.put("safer", saferList);
		map.put("auditor", auditorList);
		map.put("switch", swith);
		map.put("userPriv", userPriv);
		ajaxJson.setAttributes(map);
		return ajaxJson;
	}

	@RequestMapping({ "/checkSuperPwd" })
	@ResponseBody
	public AjaxJson checkSuperPwd(String password, HttpServletRequest request) {
		AjaxJson ajaxJson = new AjaxJson();
		try {
			SysPara sysPara = this.sysParaMapper
					.querySysPara("SECURE_SUPER_PASS");
			String paraValue = sysPara.getParaValue();
			String md5Password = Md5Crypt.md5Crypt(password.getBytes(),
					paraValue);
			if (paraValue.equals(md5Password)) {
				ajaxJson.setFlag(false);
				ajaxJson.setMsg("OK");
			} else {
				ajaxJson.setFlag(true);
				ajaxJson.setMsg("false");
			}
		} catch (Exception e) {
			e.printStackTrace();
			ajaxJson.setMsg(e.getMessage());
			ajaxJson.setFlag(false);
		}
		return ajaxJson;
	}

	@RequestMapping({ "/updateSuperPwd" })
	@ResponseBody
	public AjaxJson updateSuperPwd(String password, HttpServletRequest request) {
		AjaxJson ajaxJson = new AjaxJson();
		try {
			SysPara sysPara = new SysPara();
			sysPara.setParaName("SECURE_SUPER_PASS");
			sysPara.setParaValue(this.usersService.getEncryptString(password
					.trim()));
			SessionUtils.putSession(request.getSession(), "sysuperPwd", "");
			this.sysParaMapper.updateSysPara(sysPara);
			ajaxJson.setFlag(true);
			ajaxJson.setMsg("OK");
		} catch (Exception e) {
			e.printStackTrace();
			ajaxJson.setMsg(e.getMessage());
			ajaxJson.setFlag(false);
		}
		return ajaxJson;
	}

	@ResponseBody
	@RequestMapping({ "/editNotify" })
	public ToJson<Object> editNotify(String singls, String manager,
			String edit, String userIds) {
		return this.sysParaNotifyService.editNotify(singls, manager, edit,
				userIds);
	}

	@ResponseBody
	@RequestMapping({ "/selectNotify" })
	public ToJson<Object> selectNotify() {
		return this.sysParaNotifyService.selectNotify();
	}

	@ResponseBody
	@RequestMapping({ "/getDeptManagers" })
	public ToJson<Object> getDeptManagers(HttpServletRequest request) {
		return this.sysParaNotifyService.getDeptManagers(request);
	}

	@ResponseBody
	@RequestMapping({ "/getApprovedNotifyList" })
	public ToJson<Notify> getApprovedNotifyList(String typeId, Integer start,
			Integer size, @RequestParam("page") Integer page,
			@RequestParam("pageSize") Integer pageSize,
			@RequestParam("useFlag") Boolean useFlag) {
		return this.sysParaNotifyService.getApprovedNotifyList(typeId, start,
				size, page, pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/getPendingNotifyList" })
	public ToJson<Notify> getPendingNotifyList(String typeId, Integer start,
			Integer size, @RequestParam("page") Integer page,
			@RequestParam("pageSize") Integer pageSize,
			@RequestParam("useFlag") Boolean useFlag) {
		return this.sysParaNotifyService.getPendingNotifyList(typeId, start,
				size, page, pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/getNotifyTypeList" })
	public ToJson<Object> getNotifyTypeList() {
		return this.sysParaNotifyService.getNotifyTypeList();
	}

	@ResponseBody
	@RequestMapping({ "/getNotifyCode" })
	public ToJson<Object> getNotifyCode() {
		return this.sysParaNotifyService.getNotifyCode();
	}

	@ResponseBody
	@RequestMapping({ "/pushMessage" })
	public BaseWrapper pushMessage(String userId, String app,
			HttpServletRequest request, String title, String content)
			throws JSONException {
		return this.interFaceService.pushMessage(userId, app, request, title,
				content);
	}
}