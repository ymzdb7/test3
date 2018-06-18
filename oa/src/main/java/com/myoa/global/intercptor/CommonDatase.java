package com.myoa.global.intercptor;

import com.myoa.service.common.SysCodeService;
import com.myoa.service.common.UpdateProperty;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonDatase implements InitializingBean {

	@Autowired
	SysCodeService sysCodeService;

	@Autowired
	UpdateProperty updateProperty;

	public void afterPropertiesSet() throws Exception {
		this.sysCodeService.updateResource();
		this.updateProperty.updatePro();
	}
}
