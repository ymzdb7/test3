package com.myoa.controller.sys;

import com.myoa.model.users.OrgManage;
import com.myoa.service.sys.SystemInfoService;
import com.myoa.service.users.OrgManageService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping({ "/sys" })
public class OrgManageController {

	@Resource
	private SystemInfoService systemInfoService;

	@Resource
	private OrgManageService orgManageService;

	@ResponseBody
	@RequestMapping(value = { "/getOrgManage" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<OrgManage> getOrgManage(HttpServletRequest request) {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		ContextHolder.setConsumerType(sqlType);
		ToJson toJson = new ToJson(0, "");
		try {
			List orgManageList = this.orgManageService.getOrgManage();
			if ((orgManageList != null) && (orgManageList.size() > 0)) {
				Map stringStringMap = this.systemInfoService
						.getAuthorization(request);
				if ("xoa1001".equals(sqlType)) {
					if ("true".equals(stringStringMap.get("isAuthStr"))) {
						if (!((OrgManage) orgManageList.get(0)).getName()
								.equals(stringStringMap.get("company"))) {
							((OrgManage) orgManageList.get(0))
									.setName((String) stringStringMap
											.get("company"));
							this.orgManageService.editOrgManage(
									(OrgManage) orgManageList.get(0), request);
						}
						toJson.setCode("130130");
						toJson.setMsg("ok");
					} else {
						toJson.setCode("130140");
						toJson.setMsg("未授权（错误代码：130140）");
					}
				}
			}
			toJson.setFlag(0);
			toJson.setObject(orgManageList);
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}
		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/editOrgManage" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<OrgManage> editOrgManage(OrgManage orgManage,
			HttpServletRequest request) throws UnsupportedEncodingException {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		if ((orgManage != null) && (orgManage.getOid() != null)) {
			this.orgManageService.editOrgManage(orgManage, request);
		}

		ToJson toJson = new ToJson(0, "");
		try {
			List orgManageList = this.orgManageService.getOrgManage();
			toJson.setFlag(0);
			toJson.setObject(orgManageList);
			toJson.setMsg("ok");
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}

		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/getOrgManageById" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<OrgManage> getOrgManageById(Integer oid,
			HttpServletRequest request) throws IOException {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson toJson = new ToJson(0, "");
		OrgManage orgManage = null;
		try {
			orgManage = this.orgManageService.getOrgManageById(oid);
			toJson.setMsg("ok");
			toJson.setObject(orgManage);
			toJson.setFlag(0);
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}

		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/addOrgManage" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<OrgManage> addOrgManage(OrgManage orgManage,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.orgManageService.addOrgManage(orgManage, request);
	}

	@ResponseBody
	@RequestMapping({ "/checkOrgManage" })
	public BaseWrapper checkOrgManage(HttpServletRequest request) {
		return this.orgManageService.checkOrgManage(request);
	}

	@RequestMapping({ "/getPostmanagement" })
	public String get(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/post";
	}
}
