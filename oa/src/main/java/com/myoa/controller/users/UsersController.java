package com.myoa.controller.users;

import com.myoa.dao.users.UserFunctionMapper;
import com.myoa.model.modulePriv.ModulePriv;
import com.myoa.model.users.UserExt;
import com.myoa.model.users.Users;
import com.myoa.service.syspara.SysParaService;
import com.myoa.service.users.UsersService;
import com.myoa.util.AjaxJson;
import com.myoa.util.Constant;
import com.myoa.util.ExcelUtil;
import com.myoa.util.FileUploadUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.ImgUpUtils;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UsersController {
	private Logger loger = Logger.getLogger(UsersController.class);

	@Resource
	private UsersService usersService;

	@Resource
	SysParaService sysParaService;

	@Resource
	private UserFunctionMapper userFunctionMapper;

	@Autowired
	ImgUpUtils imgUpUtils;

	@RequestMapping({ "/addUsers" })
	public String addUser(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		if (!this.sysParaService.checkIsHaveSecure(user, Integer.valueOf(8))) {
			return "app/common/development";
		}
		return "app/sys/addUser";
	}

	@RequestMapping({ "/controlpanel/theme" })
	public String theme() {
		return "/app/url/theme";
	}

	@RequestMapping({ "/controlpanel/personInfor" })
	public String personInfo(Model model, HttpServletRequest request) {
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		if (!StringUtils.checkNull(users.getUserId()).booleanValue())
			model.addAttribute("userId", users.getUserId());
		else {
			model.addAttribute("userId", "");
		}
		return "/app/url/personInfor";
	}

	@RequestMapping({ "/controlpanel/count" })
	public String count() {
		return "/app/url/count";
	}

	@RequestMapping({ "/controlpanel/modifyInfo" })
	public String modifyInfo() {
		return "/app/url/modifyInfo";
	}

	@RequestMapping({ "/user/goQueryExportUsers" })
	public String goQueryExportUsers() {
		return "app/user/queryExportUsers";
	}

	@RequestMapping({ "/user/goImportUsers" })
	public String goImportUsers() {
		return "app/user/importUsers";
	}

	@RequestMapping({ "/user/goEditUserBatch" })
	public String goEditUserBatch() {
		return "app/user/editUserBatch";
	}

	@RequestMapping({ "/user/goImportEduUsers" })
	public String goImportEduUsers() {
		return "app/user/importEduUsers";
	}

	@ResponseBody
	@RequestMapping(value = { "/user/addUser" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> addUser(Users user, UserExt userExt,
			@RequestParam(required = false) String deptIds,
			@RequestParam(required = false) String privIds,
			@RequestParam(required = false) String userIds,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ModulePriv modulePriv = null;
		if ((!StringUtils.checkNull(deptIds).booleanValue())
				|| (!StringUtils.checkNull(privIds).booleanValue())
				|| (!StringUtils.checkNull(userIds).booleanValue())) {
			modulePriv = new ModulePriv();
			modulePriv.setDeptId(deptIds);
			modulePriv.setPrivId(privIds);
			modulePriv.setUserId(userIds);
		}
		return this.usersService.addUser(user, userExt, modulePriv, request);
	}

	@ResponseBody
	@RequestMapping(value = { "/user/editUser" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> editUser(Users user, UserExt userExt,
			@RequestParam(required = false) String deptIds,
			@RequestParam(required = false) String privIds,
			@RequestParam(required = false) String userIds,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ModulePriv modulePriv = null;
		if ((!StringUtils.checkNull(deptIds).booleanValue())
				|| (!StringUtils.checkNull(privIds).booleanValue())
				|| (!StringUtils.checkNull(userIds).booleanValue())) {
			modulePriv = new ModulePriv();
			modulePriv.setDeptId(deptIds);
			modulePriv.setPrivId(privIds);
			modulePriv.setUserId(userIds);
		}
		return this.usersService.editUser(user, userExt, modulePriv);
	}

	@ResponseBody
	@RequestMapping({ "/user/edit" })
	public ToJson<Users> edit(
			Users user,
			@RequestParam(value = "userExt", required = false) UserExt userExt,
			@RequestParam(value = "imgFile", required = false) MultipartFile imageFile,
			HttpServletRequest request) throws IllegalStateException,
			IOException {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		String realPath = request.getSession().getServletContext()
				.getRealPath("/");
		String resourcePath = "ui/img/user";
		if ((imageFile != null)
				&& (FileUploadUtil.allowUpload(imageFile.getContentType()))) {
			String fileName = FileUploadUtil.rename(imageFile
					.getOriginalFilename());
			File dir = new File(realPath + resourcePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			File file = new File(dir, fileName);
			imageFile.transferTo(file);
			user.setAvatar(fileName);
		}

		return this.usersService.editUser(user, userExt, null);
	}

	@ResponseBody
	@RequestMapping({ "/user/deleteUser" })
	public ToJson<Users> deletesUser(String uids, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			this.usersService.deleteUser(uids);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/findUserByuid" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ToJson<Users> findUserByuid(int uid, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Users users = this.usersService.findUserByuid(uid);

			json.setObject(users);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/findUserByuserId" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ToJson<Users> findUserByuserId(String userId,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			if (StringUtils.checkNull(userId).booleanValue()) {
				json.setMsg("error");
				json.setFlag(1);
			} else {
				Users users = this.usersService.findUsersByuserId(userId);

				json.setObject(users);
				json.setMsg("OK");
				json.setFlag(0);
			}
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getAlluser" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> getAllUser(Map<String, Object> maps, Integer page,
			Integer pageSize, boolean useFlag) {
		ToJson json = new ToJson(0, null);
		try {
			List list = this.usersService.getAlluser(maps, page, pageSize,
					useFlag);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getDeptByMany" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public ToJson<Users> getDeptByMany(Users users, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			List list = this.usersService.getUserByMany(users);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getUserAndDept" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> getUserAndDept(Map<String, Object> maps, Integer page,
			Integer pageSize, boolean useFlag, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			List list = this.usersService.getUserAndDept(maps, page, pageSize,
					useFlag);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getBySearch" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> getBySearch(HttpServletRequest request,
			Map<String, Object> maps) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			request.setCharacterEncoding("UTF-8");
			String search = request.getParameter("search");

			maps = new HashMap();
			maps.put("byName", search);
			maps.put("userId", search);
			maps.put("userName", search);
			maps.put("userPrivName", search);
			maps.put("deptName", search);
			List list = this.usersService.getBySearch(maps);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getByDeptId" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> getByDeptId(HttpServletRequest request,
			Map<String, Object> maps, Integer page, Integer pageSize,
			boolean useFlag) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			request.setCharacterEncoding("UTF-8");
			int deptId = Integer.parseInt(new String(request.getParameter(
					"deptId").getBytes("ISO-8859-1"), "UTF-8"));
			maps = new HashMap();
			maps.put("deptId", Integer.valueOf(deptId));
			List list = this.usersService.getByDeptId(maps, page, pageSize,
					useFlag);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getByUid" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> getByUid(int uid, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Users user = this.usersService.getByUid(uid);
			json.setObject(user);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getUserNameById" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ToJson<Users> getUserNameById(String userIds,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			String userName = this.usersService.getUserNameById(userIds);
			json.setObject(userName);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@RequestMapping(value = { "/user/xsu" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String xs(HttpServletRequest request) {
		return "app/test/xs";
	}

	@ResponseBody
	@RequestMapping({ "/getUserByCondition" })
	public ToJson<Users> getUserByCondition(HttpServletRequest request,
			Users users) {
		ToJson json = new ToJson(0, null);
		try {
			List userList = this.usersService.getUsersByCondition(users);
			json.setObject(userList);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getUserOnline" })
	public ToJson<Users> getUserOnline(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			List userList = this.usersService.getUsersOnline();
			json.setObject(userList);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getUserbyCondition" })
	public ToJson<Users> getUserbyCondition(
			@RequestParam(value = "userId", required = false, defaultValue = "") String userId,
			@RequestParam(value = "userName", required = false, defaultValue = "") String userName,
			@RequestParam(value = "sex", required = false, defaultValue = "") String sex,
			@RequestParam(value = "deptId", required = false, defaultValue = "") String deptId,
			@RequestParam(value = "userPrivNo", required = false, defaultValue = "") String userPrivNo,
			@RequestParam("choice") String choice, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		ContextHolder.setConsumerType(sqlType);
		if ("-1".equals(deptId)) {
			deptId = "";
		}
		Map maps = new HashMap();
		maps.put("userId", userId);
		maps.put("userName", userName);
		maps.put("sex", sex);
		maps.put("deptId", deptId);
		maps.put("userPrivNo", userPrivNo);
		ToJson usersJson = new ToJson();
		List userToJson = null;
		try {
			userToJson = this.usersService.getUserbyCondition(maps);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if ("1".equals(choice)) {
			if (userToJson.size() > 0) {
				usersJson.setFlag(0);
				usersJson.setMsg("ok");
				usersJson.setObj(userToJson);
			} else {
				usersJson.setFlag(1);
				usersJson.setMsg("err");
			}
		} else if ("2".equals(choice)) {
			try {
				HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("用户信息导出", 9);
				String[] secondTitles = { "部门", "姓名", "角色", "辅助角色", "在线时长",
						"性别", "在线时长", "工作电话", "部门电话", "手机", "电子邮件" };
				HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1,
						secondTitles);
				Users user = new Users();

				String[] beanProperty = { "deptName", "userName",
						"userPrivName", "roleAuxiliaryName", "online", "sex",
						"online", "telNoDept", "telNoDept", "departmentPhone",
						"email" };

				HSSFWorkbook workbook = ExcelUtil.exportExcelData(workbook2,
						userToJson, beanProperty);
				ServletOutputStream out = response.getOutputStream();

				String filename = "用户信息导出.xls";
				filename = FileUtils.encodeDownloadFilename(filename,
						request.getHeader("user-agent"));

				response.setContentType("application/vnd.ms-excel");
				response.setHeader("content-disposition",
						"attachment;filename=" + filename);

				workbook.write(out);
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			usersJson.setFlag(1);
			usersJson.setMsg("err");
		}

		return usersJson;
	}

	@ResponseBody
	@RequestMapping({ "user/getUsersByDeptId" })
	public ToJson<Users> getUsersByDeptId(HttpServletRequest request,
			String deptId) {
		ToJson json = new ToJson();
		List usersList = new ArrayList();
		try {
			if (StringUtils.checkNull(deptId).booleanValue()) {
				Users users = (Users) SessionUtils.getSessionInfo(
						request.getSession(), Users.class, new Users());
				usersList = this.usersService.getUsersByDeptId(users
						.getDeptId());
			} else {
				usersList = this.usersService.getUsersByDeptId(Integer
						.valueOf(deptId));
			}
			json.setObj(usersList);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "user/getNullPwUsers" })
	public ToJson<Users> getNullPwUsers(
			@RequestParam(value = "deptId", required = false) Integer deptId) {
		ToJson json = new ToJson();
		try {
			List nullPwUsers = this.usersService.getNullPwUsers(deptId);
			json.setObj(nullPwUsers);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getUsers" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> getByNotLogin(HttpServletRequest request,
			Integer deptId, String notLogin, Map<String, Object> maps,
			Integer page, Integer pageSize, boolean useFlag) {
		ToJson json = new ToJson(0, null);
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		String userFunctionStr = this.userFunctionMapper.getUserFuncIdStr(users
				.getUserId());
		String[] f = userFunctionStr.split(",");
		if (!Arrays.asList(f).contains("33")) {
			json.setFlag(1);
			json.setMsg("越权");
			return json;
		}
		try {
			maps = new HashMap();
			if (deptId != null) {
				maps.put("deptId", deptId);
			}
			if ((notLogin != null) && (notLogin != "")) {
				maps.put("notLogin", notLogin);
			}
			List list = this.usersService.getByDeptId(maps, page, pageSize,
					useFlag);
			json.setObj(list);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "user/clearPassword" })
	public ToJson<Users> clearPassword(String uids) {
		ToJson json = new ToJson();
		try {
			this.usersService.clearPassword(uids);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "user/clearOnLine" })
	public ToJson<Users> clearOnLine(String uids) {
		ToJson json = new ToJson();
		try {
			this.usersService.clearOnLine(uids);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "user/setNotLogin" })
	public ToJson<Users> setNotLogin(String uids) {
		ToJson json = new ToJson();
		try {
			this.usersService.setNotLogin(uids);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "user/editUsersDeptId" })
	public ToJson<Users> editUsersDeptId(Integer deptId, String uids) {
		ToJson json = new ToJson();
		try {
			this.usersService.editUsersDetId(deptId, uids);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "user/getUsersByUids" })
	public ToJson<Users> getUsersByUids(String uids) {
		ToJson json = new ToJson();
		try {
			List usersByUids = this.usersService.getUsersByUids(uids);
			json.setObj(usersByUids);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "users/addAndApplicationUsers" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> addAndApplicationUsers(HttpServletRequest request,
			Users users) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			this.usersService.updateUserTheme(users, request);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/users/showInformation" })
	public ToJson<Users> selectList(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(1, "error");
		try {
			Users users = new Users();
			List list = this.usersService.selectList(users);
			if (list.size() > 0) {
				json.setObj(list);
				json.setMsg("ok");
				json.setFlag(0);
			} else {
				json.setMsg("没有数据！");
				json.setFlag(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@RequestMapping({ "/editPwd" })
	@ResponseBody
	public ToJson<Object> editPwd(HttpServletRequest request, Users user,
			String newPwd) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);

		String msg = null;
		try {
			msg = this.usersService.editPwd(request, user, newPwd);

			if ("ok".equals(msg)) {
				json.setMsg("ok");
				json.setFlag(0);
			} else if ("原密码错误".equals(msg)) {
				json.setFlag(1);
				json.setMsg(msg);
			}
		} catch (Exception e) {
			json.setMsg("1");
			json.setMsg("修改失败");
			L.e(new Object[] { "user editPwd:" + e });
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getLoginUser" })
	public ToJson<String> getLoginUser(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);

		String msg = null;
		try {
			Users user = this.usersService.getLoginUser(request);
			if (user != null) {
				json.setMsg("ok");
				json.setFlag(0);
				json.setObject(user);
			}

		} catch (Exception e) {
			json.setMsg(e.getMessage());
			L.e(new Object[] { "user getLoginUser:" + e });
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getUsersByuserId" })
	public ToJson<String> getUsersByuserId(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());

		String msg = null;
		try {
			Users user = this.usersService.getUsersByuserId(users.getUserId());
			if (user != null) {
				json.setMsg("ok");
				json.setFlag(0);
				json.setObject(user);
			}

		} catch (Exception e) {
			json.setMsg(e.getMessage());
			L.e(new Object[] { "user getUsersByuserId:" + e });
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "user/getNewUsers" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> getNewUsers() {
		return this.usersService.getNewUsers();
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getUserByuid" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ToJson<Users> getUserByuid(int uid, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			Users users = this.usersService.getUserByUid(uid);

			json.setObject(users);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/users/getUserTheme" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public ToJson<Users> getUserTheme(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);

		String msg = null;
		try {
			Users user = this.usersService.getLoginUserTheme(request);
			json.setMsg("ok");
			json.setFlag(0);
			json.setObject(user);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
			L.e(new Object[] { "user getUserTheme:" + e });
		}
		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "user/queryExportUsers" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> queryExportUsers(HttpServletRequest request,
			HttpServletResponse response, Users user, String sortType,
			String isExport, String notLogin) {
		return this.usersService.queryExportUsers(request, response, user,
				sortType, isExport, notLogin);
	}

	@ResponseBody
	@RequestMapping(value = { "/user/insertImportUsers" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> insertImportUsers(HttpServletRequest request,
			HttpServletResponse response, HttpSession session,
			MultipartFile file, String ifUpdate, String psWord, String userPriv) {
		return this.usersService.insertImportUsers(request, response, session,
				file, ifUpdate, psWord, userPriv);
	}

	@ResponseBody
	@RequestMapping(value = { "/user/insertImportUsersByEdu" }, produces = { "application/json;charset=UTF-8" })
	public AjaxJson insertImportUsersByEdu(HttpServletRequest request,
			HttpServletResponse response, HttpSession session,
			MultipartFile file, String ifUpdate, String pw, String userPriv,
			@RequestParam(value = "rule", required = false) String rule) {
		return this.usersService.insertImportUsersByEdu(request, response,
				session, file, ifUpdate, pw, userPriv, rule);
	}

	@ResponseBody
	@RequestMapping(value = { "/user/editUserBatch" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public ToJson<Users> editUserBatch(Users user, UserExt userExt,
			@RequestParam(required = false) String modulePrivIds,
			@RequestParam(required = false) String privIds,
			@RequestParam(required = false) String deptIds,
			@RequestParam(required = false) String uids,
			HttpServletRequest request) {
		return this.usersService.editUserBatch(user, userExt, modulePrivIds,
				privIds, deptIds, uids, request);
	}

	@ResponseBody
	@RequestMapping(value = { "/user/singleSearch" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Users> singleSearch(HttpServletRequest request,
			String searchData) {
		return this.usersService.singleSearch(searchData);
	}

	@ResponseBody
	@RequestMapping(value = { "/user/getAnalysis" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Object> userAnalysis(String type, HttpServletRequest request) {
		return this.usersService.userAnalysis(type);
	}

	@ResponseBody
	@RequestMapping({ "/user/editUserExt" })
	public ToJson<Users> editUserExt(HttpServletRequest request,
			MultipartFile imageFile, Users users, UserExt userExt)
			throws IllegalStateException, IOException {
		return this.usersService
				.editUserExt(request, imageFile, users, userExt);
	}

	@ResponseBody
	@RequestMapping({ "/user/editUserSign" })
	public ToJson editUserSign(HttpServletRequest request, String sign) {
		return this.usersService.editUserSign(request, sign);
	}

	@ResponseBody
	@RequestMapping({ "/user/userCookie" })
	public ToJson userCookie(HttpServletRequest request) {
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		ToJson usersToJson = new ToJson();
		usersToJson.setFlag(0);
		usersToJson.setMsg("ok");
		usersToJson.setObject(users);
		return usersToJson;
	}

	@ResponseBody
	@RequestMapping({ "/user/selectUserAllInfoByName" })
	public ToJson<Users> selectUserAllInfoByName(String byname,
			HttpServletRequest req) {
		ToJson json = new ToJson(0, null);
		try {
			Users user = this.usersService.selectUserAllInfoByName(byname, req);
			json.setObject(user);
			json.setMsg("OK");
			json.setFlag(0);
		} catch (Exception e) {
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/user/upload" })
	public BaseWrapper uploadImg(HttpServletRequest request, MultipartFile file) {
		return this.usersService.uploadImg(request, file);
	}

	@ResponseBody
	@RequestMapping({ "/user/imgae/update" })
	public BaseWrapper updateImg(HttpServletRequest request) {
		return this.imgUpUtils.updateUserImgaes(request);
	}

	@ResponseBody
	@RequestMapping({ "/user/editUserExtNew" })
	public ToJson<Users> editUserExtNew(HttpServletRequest request,
			Users users, UserExt userExt) throws IllegalStateException,
			IOException {
		return this.usersService.editUserExtNew(request, users, userExt);
	}

	@ResponseBody
	@RequestMapping({ "/user/getByName" })
	public ToJson<Users> getByName(String name) {
		return this.usersService.getByName(name);
	}

	@ResponseBody
	@RequestMapping({ "/user/getuserNameByDeptId" })
	public ToJson getuserNameByDeptId(String deptId) {
		if (deptId.endsWith(",")) {
			deptId = deptId.substring(0, deptId.length() - 1);
		}
		return this.usersService.getuserNameByDeptId(Integer.valueOf(deptId));
	}

	@ResponseBody
	@RequestMapping({ "/user/selectuidByName" })
	public ToJson selectuidByName(String userName) {
		return this.usersService.selectuidByName(userName);
	}

	@ResponseBody
	@RequestMapping({ "/user/getUserDepartmentUserexe" })
	public ToJson getUserDepartmentUserexe(String deptId, String dutyType,
			String uids) {
		return this.usersService.getUserDepartmentUserexe(deptId, dutyType,
				uids);
	}

	@ResponseBody
	@RequestMapping({ "/user/checkUserCount" })
	public BaseWrapper checkUserCount(HttpServletRequest request) {
		return this.usersService.checkUserCount(request);
	}
}
