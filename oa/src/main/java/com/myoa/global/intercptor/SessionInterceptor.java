package com.myoa.global.intercptor;

import com.myoa.global.component.Global;
import com.myoa.model.users.Users;
import com.myoa.util.Constant;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionInterceptor implements HandlerInterceptor {
	private String loginUrl;
	private String welcomUrl;
	private String redirectUrl;
	private String mainUrl;

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

	public String getRedirectUrl() {
		return this.redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getMainUrl() {
		return this.mainUrl;
	}

	public void setMainUrl(String mainUrl) {
		this.mainUrl = mainUrl;
	}

	public boolean preHandle(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Object o) throws Exception {
		String visitUrl = httpServletRequest.getRequestURI();
		if (visitUrl.equals(this.loginUrl)) {
			ContextHolder.setConsumerType("");
			httpServletRequest.getSession().invalidate();
			SessionUtils.cleanUserSession(httpServletRequest.getSession());
			return true;
		}
		Users user = null;
		String testIds = httpServletRequest.getParameter(Global.JSESSIONID);
		if (!StringUtils.checkNull(testIds).booleanValue()) {
			HttpSession session = null;
			CommonSessionContext myContext = CommonSessionContext.getInstance();
			session = myContext.getSession(testIds);
			if (session != null) {
				HttpSession sessionNow = httpServletRequest.getSession();
				ContextHolder.setConsumerType(Constant.MYOA
						+ (String) session.getAttribute("loginDateSouse"));

				user = (Users) SessionUtils.getSessionInfo(session,
						Users.class, new Users());
				SessionUtils.putSession(sessionNow, user);
				SessionUtils.putSession(sessionNow, "loginDateSouse",
						(String) session.getAttribute("loginDateSouse"));

				SessionUtils.putSession(sessionNow, "InterfaceModel",
						(String) session.getAttribute("InterfaceModel"));
			}
			return (user != null) && (user.getUid() != null);
		} else {
			return true;
		}

	}

	public void postHandle(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Object o,
			ModelAndView modelAndView) throws Exception {
		String ids = httpServletRequest.getParameter(Global.JSESSIONID);
		httpServletRequest.setAttribute(Global.JSESSIONID, ids);
	}

	public void afterCompletion(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Object o, Exception e)
			throws Exception {
	}
}