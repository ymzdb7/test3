package com.myoa.controller.widget;

import com.myoa.model.widget.WidgetSetModel;
import com.myoa.service.widget.WidgetService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/widget" })
public class WidgetController {

	@Resource
	private WidgetService widgetService;

	@ResponseBody
	@RequestMapping({ "/getMsg" })
	public ToJson<WidgetSetModel> getMsg(HttpServletRequest request,
			String cityName) {
		return this.widgetService.getWidgetToDoMsg(request, cityName);
	}

	@ResponseBody
	@RequestMapping({ "/getWeather" })
	public ToJson<WidgetSetModel> getWeather(HttpServletRequest request,
			String cityName) {
		return this.widgetService.getWeather(request, cityName);
	}

	@ResponseBody
	@RequestMapping({ "/getWidgetMsg" })
	public ToJson<WidgetSetModel> getWidgetMsg(HttpServletRequest request) {
		return this.widgetService.getWidgetMsg(request);
	}

	@ResponseBody
	@RequestMapping({ "/getByUid" })
	public ToJson<WidgetSetModel> getByUid(HttpServletRequest request) {
		return this.widgetService.getUserSetByUid(request);
	}

	@ResponseBody
	@RequestMapping({ "/edit" })
	public ToJson<WidgetSetModel> edit(HttpServletRequest request,
			WidgetSetModel widgetModel) {
		return this.widgetService.editWidgetSetModel(request, widgetModel);
	}
}
