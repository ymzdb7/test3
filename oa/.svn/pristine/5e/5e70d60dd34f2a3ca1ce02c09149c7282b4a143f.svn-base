package com.myoa.controller.spirit;

import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.sms.SmsBodyMapper;
import com.myoa.model.common.SysPara;
import com.myoa.model.daiban.Daiban;
import com.myoa.model.users.Users;
import com.myoa.service.todoList.TodolistService;
import com.myoa.service.users.UsersService;
import com.myoa.util.Constant;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/spirit" })
public class SpiritController {
	private final String one = "1";
	private Logger logger = Logger.getLogger(SpiritController.class);

	@Resource
	private UsersService usersService;

	@Resource
	private SysParaMapper sysParaMapper;

	@Resource
	private TodolistService todolistService;

	@Resource
	private SmsBodyMapper smsBodyMapper;

	@RequestMapping({ "/login" })
	public String login(HttpServletRequest request, String company, Model model) {
		request.getSession().setAttribute("loginDateSouse", company);
		L.w(new Object[] { company });
		String a = (String) request.getSession().getAttribute("loginDateSouse");
		L.w(new Object[] { a });
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		String ip = "";
		String gimHost = "";
		SysPara sysParaHost = this.sysParaMapper.querySysPara("IM_HOST");

		SysPara sysParaStutes = this.sysParaMapper.querySysPara("IM_STUTES");
		SysPara sysParaPort = this.sysParaMapper.querySysPara("IM_PORT");

		if ((sysParaStutes != null)
				&& (!StringUtils.checkNull(sysParaStutes.getParaValue())
						.booleanValue())
				&& ("1".equals(sysParaStutes.getParaValue()))) {
			ip = sysParaHost.getParaValue();
			gimHost = sysParaPort.getParaValue();
		}

		model.addAttribute("users", users);
		model.addAttribute("gim_ip", ip);
		model.addAttribute("gim_port", gimHost);

		return "app/spirit/login/login";
	}

	@RequestMapping({ "/main" })
	public String main(Model model, HttpServletRequest request) {
		Set arg = new HashSet();
		arg.add("paraName");
		arg.add("paraValue");
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());

		model.addAllAttributes(SessionUtils.getSessionInfo(
				request.getSession(), arg));

		model.addAttribute("users", users);
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/mains";
	}

	@RequestMapping({ "/menu" })
	public String menu(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/menu";
	}

	@RequestMapping({ "/dh" })
	public String dh(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/dh";
	}

	@RequestMapping({ "/groupChat" })
	public String groupChat(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/groupChat";
	}

	@RequestMapping({ "/newGroupChat" })
	public String newGroupChat(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/newGroupChat";
	}

	@RequestMapping({ "/groupChatLog" })
	public String groupChatLog(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/groupChatLog";
	}

	@RequestMapping({ "/group" })
	public String group(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/group";
	}

	@RequestMapping({ "/countersign" })
	public String countersign(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/countersign";
	}

	@RequestMapping({ "/newgroup" })
	public String newgroup(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/newgroup";
	}

	@RequestMapping({ "/editgroup" })
	public String editgroup(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/editgroup";
	}

	@RequestMapping({ "/managegroup" })
	public String managegroup(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/managegroup";
	}

	@RequestMapping({ "/bq" })
	public String note(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/note";
	}

	@RequestMapping({ "/oaganization" })
	public String oaganization(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/zz";
	}

	@RequestMapping({ "/zz" })
	public String zz(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/zz";
	}

	@RequestMapping({ "/willDoCounts" })
	@ResponseBody
	public BaseWrapper getToDolistCounts(String userId, String companyId,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(companyId);
		BaseWrapper wrappers = new BaseWrapper();
		wrappers.setFlag(false);
		wrappers.setStatus(true);
		if (StringUtils.checkNull(userId).booleanValue()) {
			wrappers.setMsg("无效的用户信息");
			return wrappers;
		}
		if (("undefined".equals(userId))
				&& (StringUtils.checkNull(companyId).booleanValue())) {
			userId = (String) SessionUtils.getSessionInfo(request.getSession(),
					"userId", String.class);
			companyId = (String) request.getSession().getAttribute(
					"loginDateSouse");
		}
		try {
			String sqlType = Constant.MYOA + companyId;
			Daiban db = this.todolistService.list(userId, sqlType, request);
			SessionUtils.putSession(request.getSession(), "userId", userId);
			if (db != null) {
				Integer email = Integer.valueOf(db.getEmail() == null ? 0 : db
						.getEmail().size());
				Integer notify = Integer.valueOf(db.getNotify() == null ? 0
						: db.getNotify().size());
				Integer workFlow = Integer.valueOf(db.getWorkFlow() == null ? 0
						: db.getWorkFlow().size());
				Map map = new HashMap();
				map.put("toId", userId);
				map.put("remindFlag", "3");
				Integer smsBodyCountByMap = this.smsBodyMapper
						.getSmsBodyCountByMap(map);
				Map result = new HashMap();
				result.put("email", email);
				result.put("willDo", Integer.valueOf(notify.intValue()
						+ workFlow.intValue()));
				result.put("willDo", Integer.valueOf(notify.intValue()
						+ workFlow.intValue()));
				result.put("smsDo", smsBodyCountByMap);
				wrappers.setData(result);
				wrappers.setFlag(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			wrappers.setFlag(false);
			wrappers.setMsg(e.getMessage());
		}

		return wrappers;
	}

	@RequestMapping({ "/messageList" })
	public String messageList(HttpServletRequest request, Model model) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Users u = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		if ((u != null) && (u.getUid() != null)) {
			model.addAttribute("uId", u.getUid());
		}
		return "app/spirit/messagelist";
	}

	@RequestMapping({ "/searchBox" })
	public String search(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/spirit/search";
	}

	@RequestMapping({ "/chatRecord" })
	public String chatRecord() {
		return "app/spirit/chatRecord";
	}

	@RequestMapping({ "/webChatRecord" })
	public String webChatRecord() {
		return "app/spirit/webChatRecord";
	}
}
