package com.myoa.controller.tiggerplugin;

import com.myoa.service.work.impl.WorkServiceImpl;
import com.myoa.util.Constant;
import com.myoa.util.JsonToProptyOrMapAndList;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "webService" })
public class WebPluginTigger {
	private Logger logger = Logger.getLogger(WebPluginTigger.class);

	@Autowired
	WorkServiceImpl workService;

	@RequestMapping(value = { "/webServiceTigger" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public ToJson webServiceTigger(@RequestBody String userToString,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		this.logger.info("进入服务器");
		Map maps = JsonToProptyOrMapAndList.returnMaps(userToString);
		this.logger.info(JsonToProptyOrMapAndList.returnMaps(userToString));
		this.logger.info("解析获取json数据");

		return null;
	}
}
