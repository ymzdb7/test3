package com.myoa.controller.common;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.myoa.model.common.SysCode;
import com.myoa.service.common.SysCodeService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

@Controller
@Scope("prototype")
@RequestMapping({ "/code" })
public class SysCodeController {
	private Logger loger = Logger.getLogger(SysCodeController.class);

	@Resource
	private SysCodeService sysCodeService;

	@RequestMapping({ "/getCode" })
	@ResponseBody
	public ToJson<SysCode> getCode(String parentNo, HttpServletRequest request,
			HttpServletResponse response) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.sysCodeService.getSysCode(parentNo);
	}

	@ResponseBody
	@RequestMapping(value = { "/syscode/getAllSysCode" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET }, produces = { "application/json;charset=UTF-8" })
	public ToJson<SysCode> getAllSysCode(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			List list = this.sysCodeService.getAllSysCode();
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/syscode/update" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET }, produces = { "application/json;charset=UTF-8" })
	public ToJson<SysCode> update(HttpServletRequest request, SysCode sysCode) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			this.sysCodeService.update(sysCode);
			json.setObject(sysCode);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/deleteSysCode" })
	public ToJson<SysCode> deleteSysCode(HttpServletRequest request,
			SysCode sysCode) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			this.sysCodeService.deleteSysCode(sysCode);

			json.setObject(sysCode);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/addSysMainCode" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<SysCode> addSysMainCode(HttpServletRequest request,
			SysCode sysCode) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			this.sysCodeService.addSysMainCode(sysCode);
			json.setObject(sysCode);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/isCodeOrderExits" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Object> isCodeOrderExits(HttpServletRequest request,
			SysCode sysCode) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Boolean isExits = this.sysCodeService.isCodeOrderExits(sysCode);
			json.setMsg("OK");
			if (isExits.booleanValue())
				json.setFlag(0);
			else
				json.setFlag(1);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/isCodeNoExits" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Object> isCodeNoExits(HttpServletRequest request,
			SysCode sysCode) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Boolean isExits = this.sysCodeService.isCodeNoExits(sysCode);
			if (isExits.booleanValue()) {
				json.setFlag(0);
				json.setMsg("OK");
			} else {
				json.setFlag(1);
				json.setMsg("NO");
			}
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/iseditCodeNoExits" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Object> iseditCodeNoExits(HttpServletRequest request,
			SysCode sysCode) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Boolean isExits = this.sysCodeService.iseditCodeNoExits(sysCode);
			if (isExits.booleanValue()) {
				json.setFlag(0);
				json.setMsg("OK");
			} else {
				json.setFlag(1);
				json.setMsg("NO");
			}
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/editisCodeNoExits" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Object> editisCodeNoExits(HttpServletRequest request,
			SysCode sysCode, String oldCodeNo) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.sysCodeService.editisCodeNoExits(sysCode, oldCodeNo);
	}

	@ResponseBody
	@RequestMapping(value = { "/ChildisCodeNoExits" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Object> ChildisCodeNoExits(HttpServletRequest request,
			SysCode sysCode) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Boolean isExits = this.sysCodeService.ChildisCodeNoExits(sysCode);
			json.setMsg("OK");
			if (isExits.booleanValue()) {
				json.setFlag(0);
			} else {
				json.setFlag(1);
				json.setMsg("NO");
			}
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "addChildSysCode" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<SysCode> addChildSysCode(HttpServletRequest request,
			SysCode sysCode) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			this.sysCodeService.addChildSysCode(sysCode);
			json.setObject(sysCode);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getErrCode" })
	public ToJson<List<SysCode>> getErrSyscode() {
		return this.sysCodeService.getErrSysCode();
	}

	@RequestMapping({ "/ImportCode" })
	@ResponseBody
	public ToJson<Object> recoverMenu(HttpServletRequest request,
			MultipartFile sqlFile) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		String realPath = request.getSession().getServletContext()
				.getRealPath("/");
		ToJson toJson = new ToJson(0, "");
		try {
			if ((sqlFile != null) && (sqlFile.getOriginalFilename() != null)
					&& (!sqlFile.getOriginalFilename().equals(""))) {
				String originalFilename = sqlFile.getOriginalFilename();
				String path = realPath.concat("sys_code.sql");

				File newFile = new File(path);

				sqlFile.transferTo(newFile);

				toJson = this.sysCodeService.recoverCode(request, path);
				toJson.setFlag(0);
				toJson.setMsg("ok");
			}
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}

		return toJson;
	}

	@RequestMapping({ "/ExportCode" })
	@ResponseBody
	public void exportMenu(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			this.sysCodeService.exportCode(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping({ "/getErrInfo" })
	@ResponseBody
	public ToJson<SysCode> getErrInfo(String CodeId) {
		return this.sysCodeService.getErrInfo(CodeId);
	}

	@RequestMapping({ "/deleteErrCode" })
	@ResponseBody
	public ToJson<SysCode> deleteErrCode(String CodeId) {
		return this.sysCodeService.deleteErrCode(CodeId);
	}

	@ResponseBody
	@RequestMapping({ "/getAllCode" })
	public ToJson<List<SysCode>> getAllCode() {
		return this.sysCodeService.getAllCode();
	}

	@ResponseBody
	@RequestMapping({ "/GetDropDownBox" })
	public JSONObject DropDownBox(String CodeNos) {
		String[] split = CodeNos.split(",");
		return this.sysCodeService.DropDownBoxs(split);
	}

	@ResponseBody
	@RequestMapping({ "/updateDabase" })
	public ToJson<Object> updateDabase() {
		return this.sysCodeService.updateDabase();
	}

	@ResponseBody
	@RequestMapping({ "/editDabase" })
	public ToJson<Object> editDabase(HttpServletRequest request,
			HttpServletResponse response) {
		return this.sysCodeService.editDabase(request, response);
	}

	@ResponseBody
	@RequestMapping({ "/getObjectcount" })
	public ToJson<Object> getObjects() {
		return this.sysCodeService.getObjects();
	}

	@ResponseBody
	@RequestMapping({ "/getObjectdetail" })
	public ToJson<Object> getObjectdetail() {
		return this.sysCodeService.getObjectdetail();
	}

	@ResponseBody
	@RequestMapping({ "/updateResource" })
	public ToJson<Object> updateResource() {
		return this.sysCodeService.updateResource();
	}

	@ResponseBody
	@RequestMapping({ "/downLog" })
	public void downLog(HttpServletResponse response, HttpServletRequest request) {
		this.sysCodeService.downLog(response, request);
	}
}
