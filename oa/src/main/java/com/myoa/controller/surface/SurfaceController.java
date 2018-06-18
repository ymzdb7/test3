package com.myoa.controller.surface;

import com.myoa.model.surface.Surface;
import com.myoa.service.surface.SurfaceService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/surface" })
public class SurfaceController {
	private Logger loger = Logger.getLogger(SurfaceController.class);

	@Resource
	private SurfaceService surfaceService;

	@ResponseBody
	@RequestMapping(value = { "/selectSurf" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Surface> selectSurf(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List list = this.surfaceService.getIeTitle();
			tojson.setObject(list);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}

	@RequestMapping(value = { "/updateSurf" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public ToJson<Surface> updateSurf(Surface surface,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		this.loger.debug("ID" + surface.getIeTitle());
		try {
			this.surfaceService.updateSurf(surface);
			tojson.setObject(surface);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}
}
