package com.myoa.controller.common;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myoa.util.Constant;
import com.myoa.util.dataSource.ContextHolder;

@Controller
@Scope("prototype")
@RequestMapping({ "/common" })
public class CommonController {
	private Logger loger = Logger.getLogger(CommonController.class);

	@RequestMapping({ "/selectUser" })
	public String addboxPage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/common/selectUser";
	}

	@RequestMapping({ "/hierarchicalselectDept" })
	public String hierarchicalselectDept(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/common/hierarchicalselectDept";
	}

	@RequestMapping({ "/ntko" })
	public String ntko(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/common/ntko";
	}

	@RequestMapping({ "/ntkoPreview" })
	public String ntkoPreview(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/common/ntkoPreview";
	}

	@RequestMapping({ "/selectUserWorkFlow" })
	public String selectUserWorkFlow(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/common/selectUserWorkFlow";
	}

	@RequestMapping({ "/selectPriv" })
	public String addPrivPage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/common/selectPriv";
	}

	@RequestMapping({ "/selectDept" })
	public String addDeptPage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/common/selectDept";
	}

	@RequestMapping({ "/addPageDemo" })
	public String addPageDemo(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/common/addPageDemo";
	}

	@RequestMapping({ "/deptManagement" })
	public String divisionalManagement(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/deptManagement";
	}

	@RequestMapping({ "/roleManagement" })
	public String roleManagement(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/roleManagement";
	}

	@RequestMapping({ "/userManagement" })
	public String userManagement(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/userManagement";
	}

	@RequestMapping({ "/systemCode" })
	public String systemCode(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/sysCode";
	}

	@RequestMapping({ "/selectEduDept" })
	public String selectEduDep(HttpServletRequest request) {
		return "app/common/selectEduDept";
	}

	@RequestMapping({ "/selectEduPriv" })
	public String addEduPrivPage(HttpServletRequest request) {
		return "app/common/selectEduPriv";
	}

	@RequestMapping({ "/selectEduUser" })
	public String addEduUserPage(HttpServletRequest request) {
		return "app/common/selectEduUser";
	}

	@RequestMapping({ "/selectGrade" })
	public String selectGrade(HttpServletRequest request) {
		return "app/common/selectGrade";
	}

	@RequestMapping({ "/selectClazz" })
	public String selectClazz(HttpServletRequest request) {
		return "app/common/selectClazz";
	}

	@RequestMapping({ "/selectAddDept" })
	public String addEduDept(HttpServletRequest request) {
		return "app/common/selectDeptAdd";
	}

	@RequestMapping({ "/managementPortal" })
	public String managementPortal(HttpServletRequest request) {
		return "app/main/managementPortal";
	}

	@RequestMapping({ "/selectSchool" })
	public String selectSchool(HttpServletRequest request) {
		return "app/common/selectSchool";
	}
}
