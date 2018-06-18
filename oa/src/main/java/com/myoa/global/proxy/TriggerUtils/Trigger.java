package com.myoa.global.proxy.TriggerUtils;

import com.myoa.global.proxy.ProxyHandle;
import com.myoa.global.proxy.SpringContextUtil;
import com.myoa.global.proxy.TriggerSubject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.context.ApplicationContext;

public class Trigger {
	public static ExecutorService cachedThreadPool = Executors
			.newCachedThreadPool();

	public static void run(final String clazzName, final String company,
			final Object[] agrs) {
		cachedThreadPool.execute(new Runnable() {
			public void run() {
				try {
					Class clazz = Class.forName(clazzName);
					Constructor cons = clazz
							.getDeclaredConstructor(new Class[0]);

					ApplicationContext ac = SpringContextUtil
							.getApplicationContext();
					TriggerSubject a = (TriggerSubject) Proxy.newProxyInstance(
							TriggerSubject.class.getClassLoader(),
							new Class[] { TriggerSubject.class },
							new ProxyHandle(ac.getBean(clazz)));

					a.doRun(company, agrs);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}