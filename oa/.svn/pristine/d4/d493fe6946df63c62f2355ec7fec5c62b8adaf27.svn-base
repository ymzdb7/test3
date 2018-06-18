package com.myoa.controller.sys;

import com.myoa.model.common.SysPara;
import com.myoa.model.sys.InterfaceModel;
import com.myoa.service.sys.InterFaceService;
import com.myoa.service.syspara.SysParaService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/sys" })
public class InterfaceController {

	@Resource
	private InterFaceService interfaceService;

	@Resource
	private SysParaService sysParaService;

	@ResponseBody
	@RequestMapping({ "/getIndexInfo" })
	public ToJson<InterfaceModel> getInterfaceInfoIeTitle(
			HttpServletRequest request) {
		ToJson json = new ToJson(0, "");
		try {
			InterfaceModel InterfaceModel = this.interfaceService
					.getIndexInfo();
			json.setObject(InterfaceModel);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getStatusText" })
	public ToJson<InterfaceModel> getStatusText(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List interfaceModelList = this.interfaceService.getStaTusText();

			if ((interfaceModelList != null)
					&& (interfaceModelList.size() == 1)) {
				InterfaceModel interfaceModel = (InterfaceModel) interfaceModelList
						.get(0);
				String statusText = interfaceModel.getStatusText();
				String[] statusTextArr = null;
				if (statusText != null) {
					statusTextArr = statusText.split("\\n");
				} else {
					statusTextArr = new String[1];
					statusTextArr[0] = "欢迎使用oa";
				}

				tojson.setObject(statusTextArr);
			}
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setFlag(1);
			tojson.setMsg("err");
		}
		return tojson;
	}

	@ResponseBody
	@RequestMapping(value = { "editStatusText" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<InterfaceModel> editStatusText(InterfaceModel interfaceModel) {
		ToJson tojson = new ToJson(0, "");
		if ((interfaceModel != null)
				&& (interfaceModel.getStatusText() != null)) {
			this.interfaceService.editStatusText(interfaceModel);
			try {
				List interfaceModelList = this.interfaceService.getStaTusText();

				if ((interfaceModelList != null)
						&& (interfaceModelList.size() == 1)) {
					InterfaceModel interfaceModel1 = (InterfaceModel) interfaceModelList
							.get(0);
					String statusText = interfaceModel1.getStatusText();
					String[] statusTextArr = null;
					if (statusText != null) {
						statusTextArr = statusText.split("\\n");
					} else {
						statusTextArr = new String[1];
						statusTextArr[0] = "欢迎使用oa";
					}

					tojson.setObject(statusTextArr);
				}
				tojson.setMsg("ok");
				tojson.setFlag(0);
			} catch (Exception e) {
				tojson.setFlag(1);
				tojson.setMsg("err");
			}
		}

		return tojson;
	}

	@ResponseBody
	@RequestMapping({ "/getInterfaceInfo" })
	public ToJson<InterfaceModel> getInterfaceInfo(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("company")) {
					ContextHolder.setConsumerType(Constant.MYOA
							+ cookie.getValue());
				}
			}

		}

		ToJson tojson = new ToJson(0, "");
		try {
			List interfaceModelList = this.interfaceService
					.getInterfaceInfo(request);
			if ((interfaceModelList != null)
					&& (interfaceModelList.size() == 1)) {
				tojson.setObject(interfaceModelList.get(0));
			}

			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setFlag(1);
			tojson.setMsg("err");
		}

		return tojson;
	}

	@ResponseBody
	@RequestMapping({ "/updateInterfaceInfo" })
	public ToJson<Object> updateInterfaceInfo(HttpServletRequest request,
			InterfaceModel interfaceModel, String LOG_OUT_TEXT,
			String MIIBEIAN, String IM_WINDOW_CAPTION) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			String realPath = request.getSession().getServletContext()
					.getRealPath("/");
			String resourcePath = "ui/img/sys";

			if (!StringUtils.checkNull(MIIBEIAN).booleanValue()) {
				SysPara sysPara = new SysPara();
				sysPara.setParaName("MIIBEIAN");
				sysPara.setParaValue(MIIBEIAN);
				this.sysParaService.updateSysPara(sysPara);
			}

			SysPara sysPara1 = new SysPara();
			sysPara1.setParaName("LOG_OUT_TEXT");
			sysPara1.setParaValue(LOG_OUT_TEXT);
			this.sysParaService.updateSysPara(sysPara1);
			SysPara sysPara2 = new SysPara();
			sysPara2.setParaName("IM_WINDOW_CAPTION");
			sysPara2.setParaValue(IM_WINDOW_CAPTION);
			this.sysParaService.updateSysPara(sysPara2);
			this.interfaceService.updateInterfaceInfo(interfaceModel);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setMsg("err");
			tojson.setFlag(1);
		}

		return tojson;
	}

	@ResponseBody
	@RequestMapping({ "/addinterfaceinfo" })
	public ToJson<InterfaceModel> insertInterfaceInfo(
			HttpServletRequest request, InterfaceModel interfaceModel) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			this.interfaceService.insertInterfaceInfo(interfaceModel);
			json.setObject(interfaceModel);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getThemeSelect" })
	public ToJson<InterfaceModel> getThemeSelect() {
		ToJson json = new ToJson();
		try {
			InterfaceModel themeSelect = this.interfaceService.getThemeSelect();
			json.setObject(themeSelect);
			json.setFlag(0);
			json.setMsg("ok");
		} catch (Exception e) {
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getAvatarUpload" })
	public ToJson<InterfaceModel> getAvatarUpload() {
		ToJson json = new ToJson();
		try {
			InterfaceModel avatarUpload = this.interfaceService
					.getAvatarUpload();
			json.setObject(avatarUpload);
			json.setFlag(0);
			json.setMsg("ok");
		} catch (Exception e) {
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getTemplate" })
	public ToJson<InterfaceModel> getTemplate() {
		ToJson json = new ToJson();
		try {
			InterfaceModel template = this.interfaceService.getTemplate();
			json.setObject(template);
			json.setFlag(0);
			json.setMsg("ok");
		} catch (Exception e) {
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}
}
