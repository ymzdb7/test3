package com.myoa.global.intercptor;

import com.myoa.global.component.Global;
import com.myoa.model.users.Users;
import com.myoa.service.sys.impl.SystemInfoServiceImpl;
import com.myoa.util.Constant;
import com.myoa.util.DateFormat;
import com.myoa.util.common.L;
import com.myoa.util.common.MobileCheck;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CommonInterceptor implements HandlerInterceptor {

	@Autowired
	CommonFunctionMemory commonFunctionMemory;

	@Autowired
	SystemInfoServiceImpl systemInfoService;
	private List<String> ignoreUrls;
	private String loginUrl;
	private String welcomUrl;
	private String redirectUrl;
	private String mainUrl;

	public String getMainUrl() {
		return this.mainUrl;
	}

	public void setMainUrl(String mainUrl) {
		this.mainUrl = mainUrl;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getLoginUrl() {
		return this.loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getWelcomUrl() {
		return this.welcomUrl;
	}

	public void setWelcomUrl(String welcomUrl) {
		this.welcomUrl = welcomUrl;
	}

	public List<String> getIgnoreUrls() {
		return this.ignoreUrls;
	}

	public void setIgnoreUrls(List<String> ignoreUrls) {
		this.ignoreUrls = ignoreUrls;
	}

	public boolean preHandle(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Object handler)
			throws Exception {
		String visitUrl = httpServletRequest.getRequestURI();
		System.out.println(visitUrl);
		long startTime = System.currentTimeMillis();
		httpServletRequest.setAttribute("startTime", Long.valueOf(startTime));
		if ((handler instanceof HandlerMethod)) {
			HandlerMethod h = (HandlerMethod) handler;
			CommonRequestModel model = new CommonRequestModel();
			model.setUrl(visitUrl);
			model.setVisitTime(DateFormat.getStrDate(new Date()));
			model.setController(h.getBean().getClass().getName());
			model.setMethod(h.getMethod().getName());

			L.s(new Object[] { model });
		}

		if (visitUrl.equals(this.redirectUrl)) {
			ContextHolder.setConsumerType("");
			return true;
		}

		L.s(new Object[] { this.loginUrl, "loginUrlloginUrl", visitUrl });
		if (visitUrl.equals(this.welcomUrl)) {
			ContextHolder.setConsumerType("");
			httpServletRequest.getSession().invalidate();
			SessionUtils.cleanUserSession(httpServletRequest.getSession());
			return true;
		}

		for (String url : this.ignoreUrls) {

			if (visitUrl.indexOf(url) >= 0) {
				return true;
			}
		}

		if (visitUrl.equals(this.loginUrl)) {
			String loginId = "default";
			if (MobileCheck.isMobileDevice(httpServletRequest
					.getHeader("user-agent"))) {
				httpServletRequest.getSession().invalidate();
				SessionUtils.cleanUserSession(httpServletRequest.getSession());
			}
			Map param = httpServletRequest.getParameterMap();
			if ((param != null) && (param.get("loginId") != null)) {
				String[] value = (String[]) param.get("loginId");
				if ((value != null) && (value.length == 1))
					loginId = value[0];
				else {
					loginId = Arrays.toString(value);
				}
			}
			String dbsource = new StringBuilder().append(Constant.MYOA)
					.append(loginId).toString();
			L.w(new Object[] { "数据库切换到：", dbsource });
			ContextHolder.setConsumerType(dbsource);
			return true;
		}

		Map endLecDate = this.systemInfoService
				.getEndLecDate(httpServletRequest);
		String useEndDate = (String) endLecDate.get("useEndDate");
		String endLecDateStr = (String) endLecDate.get("endLecDateStr");
		L.s(new Object[] { useEndDate, "0=||===========>", endLecDateStr });
		if (checkTimeOut(useEndDate, endLecDateStr)) {
			if (MobileCheck.isMobileDevice(httpServletRequest
					.getHeader("user-agent")))
				httpServletResponse.sendError(
						403,
						new StringBuilder()
								.append(httpServletRequest.getContextPath())
								.append(this.welcomUrl).toString());
			else {
				httpServletResponse.sendRedirect(new StringBuilder()
						.append(httpServletRequest.getContextPath())
						.append(this.redirectUrl).append("?imageType=")
						.append("100030").toString());
			}
			return false;
		}
		String testIds = httpServletRequest.getParameter(Global.JSESSIONID);

		String testId = httpServletRequest.getHeader(Global.JSESSIONID);
		L.s(new Object[] { "0=||================>testId" });
		L.s(new Object[] { testId });
		Cookie[] cookies = httpServletRequest.getCookies();
		L.s(new Object[] { "0=||================>sessionTest" });
		Users user = null;
		String functionIdStr = null;
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				L.s(new Object[] { cookie });
				CommonSessionContext myContext = CommonSessionContext
						.getInstance();
				HttpSession session = null;
				if (MobileCheck.isMobileDevice(httpServletRequest
						.getHeader("user-agent"))) {
					if (cookie.getName().contains("JSESSIONID")) {
						String sessionId = cookie.getValue();
						L.s(new Object[] { sessionId });
						session = myContext.getSession(sessionId);
					}
				} else if (cookie.getName().contains(Global.JSESSIONID)) {
					String sessionId = cookie.getValue();
					session = myContext.getSession(sessionId);
					L.s(new Object[] { sessionId });
				}

				L.w(new Object[] { session });
				if (session != null) {
					HttpSession sessionNow = httpServletRequest.getSession();
					ContextHolder
							.setConsumerType(new StringBuilder()
									.append(Constant.MYOA)
									.append((String) session
											.getAttribute("loginDateSouse"))
									.toString());

					user = (Users) SessionUtils.getSessionInfo(session,
							Users.class, new Users());
					functionIdStr = (String) SessionUtils.getSessionInfo(
							session, "functionIdStr", String.class);
					SessionUtils.putSession(sessionNow, user);
					SessionUtils.putSession(sessionNow, "functionIdStr",
							functionIdStr);
					SessionUtils.putSession(sessionNow, "loginDateSouse",
							(String) session.getAttribute("loginDateSouse"));

					SessionUtils.putSession(sessionNow, "InterfaceModel",
							(String) session.getAttribute("InterfaceModel"));
				}

			}

		}

		if (!StringUtils.checkNull(testIds).booleanValue()) {
			HttpSession session = null;
			CommonSessionContext myContext = CommonSessionContext.getInstance();
			session = myContext.getSession(testIds);
			if (session != null) {
				HttpSession sessionNow = httpServletRequest.getSession();
				ContextHolder
						.setConsumerType(new StringBuilder()
								.append(Constant.MYOA)
								.append((String) session
										.getAttribute("loginDateSouse"))
								.toString());

				user = (Users) SessionUtils.getSessionInfo(session,
						Users.class, new Users());
				functionIdStr = (String) SessionUtils.getSessionInfo(session,
						"functionIdStr", String.class);
				SessionUtils.putSession(sessionNow, user);
				SessionUtils.putSession(sessionNow, "functionIdStr",
						functionIdStr);
				SessionUtils.putSession(sessionNow, "loginDateSouse",
						(String) session.getAttribute("loginDateSouse"));

				SessionUtils.putSession(sessionNow, "InterfaceModel",
						(String) session.getAttribute("InterfaceModel"));
			}
		}

		if ((user != null) && (user.getUid() != null)) {
			return true;
		}

		if (MobileCheck.isMobileDevice(httpServletRequest
				.getHeader("user-agent")))
			httpServletResponse.sendError(
					403,
					new StringBuilder()
							.append(httpServletRequest.getContextPath())
							.append(this.welcomUrl).toString());
		else {
			httpServletResponse.sendRedirect(new StringBuilder()
					.append(httpServletRequest.getContextPath())
					.append(this.redirectUrl).append("?imageType=")
					.append("403 ").toString());
		}
		return false;
	}

	private boolean checkTimeOut(String useEndDate, String endLecDateStr) {
		try {
			Date now = new Date();
			if (StringUtils.checkNull(endLecDateStr).booleanValue()) {
				return true;
			}
			if ("永久使用".equals(endLecDateStr)) {
				return false;
			}
			Date timeOut = DateFormat.DateToStr(endLecDateStr);
			if (timeOut.getTime() < now.getTime()) {
				return true;
			}

			if (StringUtils.checkNull(useEndDate).booleanValue())
				return true;
			if (useEndDate.equals("0000-00-00")) {
				return false;
			}
			timeOut = DateFormat.DateToStr(useEndDate);
			if (timeOut.getTime() < now.getTime())
				return true;
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}

	public void postHandle(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Object o,
			ModelAndView modelAndView) throws Exception {
	}

	public void afterCompletion(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Object o, Exception e)
			throws Exception {
	}

	private String getParamString(Map<String, String[]> map) {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry e : map.entrySet()) {
			sb.append((String) e.getKey()).append("=");
			String[] value = (String[]) e.getValue();
			if ((value != null) && (value.length == 1))
				sb.append(value[0]).append("\t");
			else {
				sb.append(Arrays.toString(value)).append("\t");
			}
		}
		return sb.toString();
	}
}
