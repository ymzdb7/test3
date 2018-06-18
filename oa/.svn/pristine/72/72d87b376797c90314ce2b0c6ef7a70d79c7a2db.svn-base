
package com.myoa.util.sendUtil;

import java.io.PrintStream;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


public class SendBodyUtil
{

	ThreadPoolTaskExecutor threadPoolTaskExecutor;

	public SendBodyUtil()
	{
	}

	public void sendSms(final StringBuffer mobileString, final StringBuffer contextString, final String protocol, final String host, final String port, final String username, final String pwd, 
			final String content_field, final String code, final String mobile, final String time_content, final String sign, final String location, final String extend_1, 
			final String extend_2, final String extend_3, final String extend_4, final String extend_5, final String startTime)
	{
		threadPoolTaskExecutor.execute(new Runnable() { 
			public void run()
			{
				try
				{
					System.out.print("11111111111");
					send.doPost(mobileString, contextString, protocol, host, port, username, pwd, content_field, code, mobile, time_content, sign, location, extend_1, extend_2, extend_3, extend_4, extend_5, startTime);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}