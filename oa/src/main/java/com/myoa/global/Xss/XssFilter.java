package com.myoa.global.Xss;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class XssFilter implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		String path = ((HttpServletRequest) request).getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort() + path + "/";

		String strBackUrl = "http://" + request.getServerName();
		int serverPort = request.getServerPort();
		String contextPath = ((HttpServletRequest) request).getContextPath();
		String servletPath = ((HttpServletRequest) request).getServletPath();
		String d = ((HttpServletRequest) request).getQueryString();

		String[] url = { "/workflow/work",
				"/netdiskSettings/editNetdiskJurisdictionSettings",
				"/flowProcess/saveFlow", "/form/", "/flowSetting", "/flowhook",
				"/document" };

		int length = url.length;
		boolean check = true;
		for (int i = 0; i < length; i++) {
			if (servletPath.contains(url[i])) {
				chain.doFilter(request, response);
				check = false;
			}
		}
		if (check)
			chain.doFilter(new XssHttpServletRequestWrapper(
					(HttpServletRequest) request), response);
	}

	public void init(FilterConfig arg0) throws ServletException {
	}
}