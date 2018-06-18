package com.myoa.controller.login;

import com.alibaba.fastjson.JSONObject;
import com.ibatis.common.resources.Resources;
import com.myoa.dao.sys.SysInterfaceMapper;
import com.myoa.dao.users.UserFunctionMapper;
import com.myoa.global.component.Global;
import com.myoa.global.intercptor.CommonSessionContext;
import com.myoa.model.common.SysPara;
import com.myoa.model.sys.InterfaceModel;
import com.myoa.model.users.OrgManage;
import com.myoa.model.users.Users;
import com.myoa.service.sms.SmsService;
import com.myoa.service.sys.SysLogService;
import com.myoa.service.users.OrgManageService;
import com.myoa.service.users.UsersService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.MobileCheck;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;
import com.myoa.util.ipUtil.MachineCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
@Scope("prototype")
public class loginController {
	private Logger loger = Logger.getLogger(loginController.class);

	@Resource
	private UsersService usersService;

	@Resource
	private OrgManageService orgManageService;

	@Value("${app_login_path_php}")
	private String url;
	private String charset = "utf-8";

	@Autowired
	UserFunctionMapper userFunctionMapper;

	@Resource
	private SysInterfaceMapper sysInterfaceMapper;

	@Resource
	private SysLogService sysLogService;

	@Resource
	private SmsService smsService;

	@RequestMapping(name = "index", value = { "/", "" })
	public String index(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("---------------------+++=---------");
		List interfaceModels = this.sysInterfaceMapper.getInterfaceInfo();
		String url = "";
		switch (Integer.parseInt(((InterfaceModel) interfaceModels.get(0))
				.getTemplate())) {
		case 1:
			url = "defaultIndex2";
			break;
		case 2:
			url = "defaultIndex";
			break;
		case 3:
			url = "defaultIndex3";
			break;
		case 4:
			url = "defaultIndex4";
			break;
		case 5:
			url = "defaultIndex5";
			break;
		case 6:
			url = "defaultIndex6";
			break;
		case 7:
			url = "defaultIndex7";
			break;
		default:
			url = "defaultIndex2";
		}

		return "forward:" + url;
	}

	@RequestMapping(name = Constant.MYOA, value = { "/xoa", "/xtd" })
	public String xoa(HttpServletRequest request, String url) {
		return "redirect:" + url;
	}

	@RequestMapping({ "login/index" })
	public String login() {
		System.out.println("--------------------------------");
		return "login/index";
	}

	@RequestMapping({ "/cont" })
	public String cont() {
		return "app/main/cont";
	}

	@RequestMapping({ "/lunbo" })
	public String lunbo() {
		return "app/main/lunbo";
	}

	@RequestMapping({ "/defaultIndex" })
	public String defaultIndex() {
		return "login/default/index";
	}

	@RequestMapping({ "/defaultIndex2" })
	public String defaultIndex2() {
		return "login/default/index2";
	}

	@RequestMapping({ "/defaultIndex3" })
	public String defaultIndex3() {
		return "login/default/index3";
	}

	@RequestMapping({ "/defaultIndex4" })
	public String defaultIndex4() {
		return "login/default/index4";
	}

	@RequestMapping({ "/defaultIndex5" })
	public String defaultIndex5() {
		return "login/default/index5";
	}

	@RequestMapping({ "/defaultIndex6" })
	public String defaultIndex6() {
		return "login/default/index6";
	}

	@RequestMapping({ "/defaultIndex7" })
	public String defaultIndex7() {
		return "login/default/index7";
	}

	@RequestMapping({ "/intranetBlue" })
	public String intranetBlue() {
		return "app/main/intranetBlue";
	}

	@RequestMapping({ "/intranetRed" })
	public String intranetRed() {
		return "app/main/intranetRed";
	}

	@RequestMapping({ "/defaultIndexErr" })
	public String defaultIndexErr() {
		return "login/default/403";
	}

	@RequestMapping({ "/oa2xoa" })
	public String oa2xoa(HttpServletRequest request) {
		try {
			String classpath = getClass().getResource("/").getPath();
			String webappRoot = classpath.replaceAll("WEB-INF/classes/",
					"ui/file/properties/");
			File file = new File(webappRoot + "jdbc.txt");
			String urltd_oa = new String();
			String unametd_oa = new String();
			String passwordtd_oa = new String();

			if ((file.isFile()) && (file.exists())) {
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file));

				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				int i = 1;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					if (i == 1) {
						urltd_oa = lineTxt;
					} else if (i == 2)
						unametd_oa = lineTxt;
					else {
						passwordtd_oa = lineTxt;
					}
					i++;
				}
				read.close();
			}
			Properties props = Resources
					.getResourceAsProperties("jdbc-sql.properties");
			String url = urltd_oa;
			String driver = props.getProperty("driverClassName");
			String username = unametd_oa;
			String password = passwordtd_oa;
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url, username,
					password);
			String sql = "SELECT VER FROM version ";
			Statement st = conn.createStatement();
			ResultSet resultSet = st.executeQuery(sql);
			Object object = new Object();

			if (resultSet.next()) {
				object = resultSet.getObject(1);
			}
			String softVersion = "2018.03.16.1";
			if (!object.toString().equals(softVersion))
				return "app/common/updateDatebase";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "app/common/noupdateDatebase";
	}

	@RequestMapping(value = { "/branchOfLanding" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String getCompanyAll(@RequestParam("loginId") String loginId,
			HttpServletRequest request, HttpServletResponse response) {
		request.getSession().setAttribute("loginDateSouse", loginId);
		String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class
				.getName() + ".LOCALE";

		Object locale = request.getSession().getAttribute(
				LOCALE_SESSION_ATTRIBUTE_NAME);

		return "login/" + loginId + "/login";
	}

	@RequestMapping(value = { "/getCompanyAll" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson<OrgManage> logins(HttpServletRequest request, String locales) {
		ContextHolder.setConsumerType("xoa1001");
		String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class
				.getName() + ".LOCALE";
		SessionUtils.putSession(request.getSession(),
				"LOCALE_SESSION_ATTRIBUTE_NAME", request.getSession()
						.getAttribute(LOCALE_SESSION_ATTRIBUTE_NAME));
		Object locale = SessionUtils.getSessionInfo(request.getSession(),
				"LOCALE_SESSION_ATTRIBUTE_NAME", Object.class);
		String loc;
		if (locale != null)
			loc = locale.toString();
		else {
			loc = "zh_CN";
		}
		return this.orgManageService.queryId(loc);
	}

	@RequestMapping({ "/mainmin" })
	public String mainmin(HttpServletRequest request, Model model) {
		return "app/main/indexmin";
	}

	@RequestMapping({ "/main" })
	public String loginSuccess(HttpServletRequest request, Model model) {
		String theme = (String) SessionUtils.getSessionInfo(
				request.getSession(), "InterfaceModel", String.class);
		model.addAttribute("theme", theme);
		return "app/main/index";
	}

	@RequestMapping(value = { "/login" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<Users> loginEnter(@RequestParam("username") String username,
			@RequestParam("password") String password, String loginId,
			String userAgent, String locales, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods",
				"GET, POST, PUT, DELETE, OPTIONS");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		response.addHeader("Access-Control-Max-Age", "1800");
		if (StringUtils.checkNull(loginId).booleanValue()) {
			loginId = (String) request.getSession().getAttribute(
					"loginDateSouse");
		}

		if ("mobile".equals(userAgent)) {
			SessionUtils.putSession(request.getSession(), "loginDateSouse",
					loginId);
			SessionUtils.putSession(request.getSession(),
					"LOCALE_SESSION_ATTRIBUTE_NAME", locales);
		} else if ("pcc".equals(userAgent)) {
			SessionUtils.putSession(request.getSession(), "loginDateSouse",
					loginId);
			SessionUtils.putSession(request.getSession(),
					"LOCALE_SESSION_ATTRIBUTE_NAME", locales);
		}

		ToJson json = new ToJson(0, null);
		if (StringUtils.checkNull(username).booleanValue()) {
			json.setFlag(1);
			json.setCode("100010 ");
			json.setMsg("用户名或用户不存在");
			return json;
		}
		ContextHolder.setConsumerType(Constant.MYOA + loginId);
		Users user = this.usersService.selectUserAllInfoByName(username,
				request);
		if (user == null) {
			request.getSession().setAttribute("message", "errOne");
			json.setMsg("用户名或用户不存在");
			json.setCode("100010 ");
			json.setFlag(1);
			return json;
		}

		Map createMap = new HashMap();
		createMap.put("userid", username);
		createMap.put("password", password);
		String httpOrgCreateTestRtn = null;
		Boolean isPassWordRight = this.usersService.checkPassWord(username,
				password);
		if (isPassWordRight.booleanValue())
			httpOrgCreateTestRtn = "ok\n\n";
		else {
			httpOrgCreateTestRtn = "err\n\n";
		}
		if (httpOrgCreateTestRtn.trim().equals("ok")) {
			if (MobileCheck.isMobileDevice(request.getHeader("user-agent"))) {
				if (user.getNotMobileLogin().intValue() == 1) {
					request.getSession().setAttribute("message", "禁止登录");
					json.setMsg("用户禁止登录");
					json.setCode("100050 ");
					json.setFlag(1);
					return json;
				}
			} else if (user.getNotLogin().byteValue() == 1) {
				request.getSession().setAttribute("message", "禁止登录");
				json.setMsg("用户禁止登录");
				json.setCode("100050 ");
				json.setFlag(1);
				return json;
			}

			SessionUtils.putSession(request.getSession(), user);
			Map params = new HashMap();
			params.put("paraName", user.getPara().getParaName());
			params.put("paraValue", user.getPara().getParaValue());
			String functionIdStr = this.userFunctionMapper
					.getUserFuncIdStr(user.getUserId());
			SessionUtils.putSession(request.getSession(), params);
			SessionUtils.putSession(request.getSession(), "functionIdStr",
					functionIdStr);

			json.setMsg(request.getSession().getId());
			json.setToken(request.getSession().getId());

			List interfaceModels = this.sysInterfaceMapper.getInterfaceInfo();
			if (0 == user.getTheme().byteValue()) {
				user.setTheme(Byte.valueOf((byte) Integer
						.parseInt(((InterfaceModel) interfaceModels.get(0))
								.getTheme())));
			}
			String theme = "theme" + user.getTheme();
			SessionUtils.putSession(request.getSession(), "InterfaceModel",
					theme);
			if (StringUtils.checkNull(
					((InterfaceModel) interfaceModels.get(0)).getIeTitle())
					.booleanValue())
				user.setInterfaceTitle("");
			else {
				user.setInterfaceTitle(((InterfaceModel) interfaceModels.get(0))
						.getIeTitle());
			}

			if ((MachineCode.get16CharMacs() != null)
					&& (MachineCode.get16CharMacs().size() > 0)) {
				user.setAppPropulsionId((String) MachineCode.get16CharMacs()
						.get(0));
			}
			json.setObject(user);
			json.setFlag(0);
			user.setLastVisitTime(new Date());
			this.usersService.updateLoginTime(user);
		} else if (httpOrgCreateTestRtn.trim().equals("err")) {
			this.usersService.insetErrLog(username);
			request.getSession().setAttribute("message", "errOne");
			json.setMsg("用户密码错误");
			json.setCode("100010 ");
			json.setFlag(1);
			return json;
		}
		return json;
	}

	@RequestMapping(value = { "/jsonp/login" }, produces = { "application/json;charset=UTF-8" })
	public void jsnopLoginEnter(@RequestParam("username") String username,
			@RequestParam("password") String password, String loginId,
			String userAgent, String locales, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods",
				"GET, POST, PUT, DELETE, OPTIONS");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		response.addHeader("Access-Control-Max-Age", "1800");
		boolean jsonP = false;
		String cb = request.getParameter("callback");
		if (cb != null) {
			jsonP = true;
			response.setContentType("text/javascript");
		} else {
			response.setContentType("application/x-json");
		}
		PrintWriter out = null;
		out = response.getWriter();
		if (jsonP) {
			out.write(cb + "(");
		}

		if (StringUtils.checkNull(loginId).booleanValue()) {
			loginId = (String) request.getSession().getAttribute(
					"loginDateSouse");
		} else if ("mobile".equals(userAgent)) {
			SessionUtils.putSession(request.getSession(), "loginDateSouse",
					loginId);
			SessionUtils.putSession(request.getSession(),
					"LOCALE_SESSION_ATTRIBUTE_NAME", locales);
		} else if ("pcc".equals(userAgent)) {
			SessionUtils.putSession(request.getSession(), "loginDateSouse",
					loginId);
		}

		ToJson json = new ToJson(0, null);
		if (StringUtils.checkNull(username).booleanValue()) {
			json.setFlag(1);
			json.setCode("100010 ");
			json.setMsg("用户名或用户不存在");

			out.append(JSONObject.toJSONString(json));
			if (jsonP) {
				out.write(");");
			}
			out.flush();
			out.close();
		}
		ContextHolder.setConsumerType(Constant.MYOA + loginId);
		Users user = this.usersService.selectUserAllInfoByName(username,
				request);
		if (user == null) {
			request.getSession().setAttribute("message", "errOne");
			json.setMsg("用户名或用户不存在");
			json.setCode("100010 ");
			json.setFlag(1);
			out.append(JSONObject.toJSONString(json));
			if (jsonP) {
				out.write(");");
			}
			out.flush();
			out.close();
		}

		Map createMap = new HashMap();
		createMap.put("userid", username);
		createMap.put("password", password);
		String httpOrgCreateTestRtn = null;
		Boolean isPassWordRight = this.usersService.checkPassWord(username,
				password);
		if (isPassWordRight.booleanValue())
			httpOrgCreateTestRtn = "ok\n\n";
		else {
			httpOrgCreateTestRtn = "err\n\n";
		}
		if (httpOrgCreateTestRtn.trim().equals("ok")) {
			if (MobileCheck.isMobileDevice(request.getHeader("user-agent"))) {
				if (user.getNotMobileLogin().intValue() == 1) {
					request.getSession().setAttribute("message", "禁止登录");
					json.setMsg("用户禁止登录");
					json.setCode("100050 ");
					json.setFlag(1);
					out.append(JSONObject.toJSONString(json));
					if (jsonP) {
						out.write(");");
					}
					out.flush();
					out.close();
				}
			} else if (user.getNotLogin().byteValue() == 1) {
				request.getSession().setAttribute("message", "禁止登录");
				json.setMsg("用户禁止登录");
				json.setCode("100050 ");
				json.setFlag(1);
				out.append(JSONObject.toJSONString(json));
				if (jsonP) {
					out.write(");");
				}
				out.flush();
				out.close();
			}

			SessionUtils.putSession(request.getSession(), user);
			Map params = new HashMap();
			params.put("paraName", user.getPara().getParaName());
			params.put("paraValue", user.getPara().getParaValue());
			String functionIdStr = this.userFunctionMapper
					.getUserFuncIdStr(user.getUserId());
			SessionUtils.putSession(request.getSession(), params);
			SessionUtils.putSession(request.getSession(), "functionIdStr",
					functionIdStr);

			json.setMsg(request.getSession().getId());
			json.setToken(request.getSession().getId());

			List interfaceModels = this.sysInterfaceMapper.getInterfaceInfo();
			if (0 == user.getTheme().byteValue()) {
				user.setTheme(Byte.valueOf((byte) Integer
						.parseInt(((InterfaceModel) interfaceModels.get(0))
								.getTheme())));
			}
			String theme = "theme" + user.getTheme();
			SessionUtils.putSession(request.getSession(), "InterfaceModel",
					theme);
			if (StringUtils.checkNull(
					((InterfaceModel) interfaceModels.get(0)).getIeTitle())
					.booleanValue())
				user.setInterfaceTitle("");
			else {
				user.setInterfaceTitle(((InterfaceModel) interfaceModels.get(0))
						.getIeTitle());
			}

			System.out.println("0=||===============》登录机器码："
					+ (String) MachineCode.get16CharMacs().get(0));
			user.setAppPropulsionId((String) MachineCode.get16CharMacs().get(0));
			json.setObject(user);
			json.setFlag(0);
			user.setLastVisitTime(new Date());
			this.usersService.updateLoginTime(user);
		} else if (httpOrgCreateTestRtn.trim().equals("err")) {
			this.usersService.insetErrLog(username);
			request.getSession().setAttribute("message", "errOne");
			json.setMsg("用户密码错误");
			json.setCode("100010 ");
			json.setFlag(1);
			out.append(JSONObject.toJSONString(json));
			if (jsonP) {
				out.write(");");
			}
			out.flush();
			out.close();
		}
		out.append(JSONObject.toJSONString(json));
		if (jsonP) {
			out.write(");");
		}
		out.flush();
		out.close();
	}

	@RequestMapping(value = { "/logOut" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrapper logOut(HttpServletRequest request) {
		BaseWrapper wrapper = new BaseWrapper();
		request.getSession().invalidate();
		SessionUtils.cleanUserSession(request.getSession());
		wrapper.setFlag(true);
		wrapper.setStatus(true);
		wrapper.setMsg("注销成功");
		return wrapper;
	}

	@ResponseBody
	@RequestMapping({ "/checkPassword" })
	public ToJson<Object> checkPassword(HttpServletRequest request,
			String userName, String password) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Boolean isPassWordRight = this.usersService.checkPassWord(userName,
					password);

			if ((isPassWordRight != null) && (isPassWordRight.booleanValue())) {
				json.setFlag(0);
				json.setMsg("OK");
			} else {
				json.setFlag(1);
			}
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/login/multilingual" })
	public ToJson<Object> multilingual(String locales,
			HttpServletRequest request) {
		ToJson toJson = new ToJson();
		CommonSessionContext myContext = CommonSessionContext.getInstance();
		if (!StringUtils.checkNull(locales).booleanValue()) {
			HttpSession session = null;
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().contains(Global.JSESSIONID)) {
						String sessionId = cookie.getValue();
						session = myContext.getSession(sessionId);
						SessionUtils.putSession(session,
								"LOCALE_SESSION_ATTRIBUTE_NAME", locales);
					}
				}

			}

			toJson.setFlag(0);
			toJson.setMsg("ok");
			toJson.setObject(locales);
		}

		return toJson;
	}
}
