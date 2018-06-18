package com.myoa.global.intercptor;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CommonSessionListener implements HttpSessionListener {
	private CommonSessionContext myc = CommonSessionContext.getInstance();

	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		this.myc.AddSession(httpSessionEvent.getSession());
	}

	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		HttpSession session = httpSessionEvent.getSession();
		this.myc.DelSession(session);
	}
}
