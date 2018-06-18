package com.myoa.global.proxy;

import com.myoa.dao.notify.NotifyMapper;
import com.myoa.model.notify.Notify;
import com.myoa.util.common.L;
import com.myoa.util.dataSource.ContextHolder;

import java.util.Date;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class testTrigger implements TriggerSubject {

	@Resource
	private NotifyMapper notifyMapper;

	public void doRun(String company, Object[] ags) {
		ContextHolder.setConsumerType(company);
		this.notifyMapper.addNotify(new Notify(ags[0].toString(), ags[1]
				.toString(), (Date) ags[2], ags[3].toString(), ags[4]
				.toString(), ags[5].toString(), ags[6].toString()));

		L.s(new Object[] { "0==||==============================>", "触发器执行的",
				ags[0].toString(), ags[1].toString(), (Date) ags[2],
				ags[3].toString(), ags[4].toString(), ags[5].toString(),
				ags[6].toString() });
	}
}
