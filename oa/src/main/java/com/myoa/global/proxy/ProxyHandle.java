package com.myoa.global.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandle implements InvocationHandler {
	private Object proxied;

	public ProxyHandle(Object proxied) {
		this.proxied = proxied;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(this.proxied, args);
	}
}
