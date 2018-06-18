package com.myoa.controller.workflow;

import com.myoa.model.users.Users;
import com.myoa.service.syspara.SysParaService;
import com.myoa.util.Constant;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.io.PrintStream;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/flowSetting" })
public class FlowSettingPageController {

	@Resource
	SysParaService sysParaService;

	@RequestMapping({ "/index" })
	public String indexPage(Model model, Integer flowId,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		System.out.println("页面获取参数：" + flowId);
		model.addAttribute("flowId", flowId);
		return "app/workflow/flowsettting/index";
	}

	@RequestMapping({ "/processDesignTool" })
	public String processDesignToolpage() {
		return "app/workflow/flowsettting/processDesignTool";
	}

	@RequestMapping({ "/processDesignliucheng" })
	public String processDesignliucheng() {
		return "app/workflow/flowsettting/processDesignliucheng";
	}

	@RequestMapping({ "/processDesignToolTwo" })
	public String processDesignToolTwopage() {
		return "app/workflow/flowsettting/processDesignToolTwo";
	}

	@RequestMapping({ "/processDesignToolTwoO" })
	public String processDesignToolTwopageO() {
		return "app/workflow/flowsettting/processDesignToolTwoO";
	}

	@RequestMapping({ "/processDesignToolTwoT" })
	public String processDesignToolTwopageT() {
		return "app/workflow/flowsettting/processDesignToolTwoT";
	}

	@RequestMapping({ "/processDesignToolTwoThelog" })
	public String processDesignToolTwoThelog() {
		return "app/workflow/flowsettting/processDesignToolTwoThelog";
	}

	@RequestMapping({ "/processDesignToolTwoView" })
	public String processDesignToolTwoView() {
		return "app/workflow/flowsettting/processDesignToolTwoView";
	}

	@RequestMapping({ "/processDesignToolsT" })
	public String processDesignToolsT() {
		return "app/workflow/flowsettting/processDesignToolsT";
	}

	@RequestMapping({ "/processDesignToolsTlc" })
	public String processDesignToolsTlc() {
		return "app/workflow/flowsettting/processDesignToolsTliucheng";
	}

	@RequestMapping({ "/flowSettingMain" })
	public String flowSettingMain() {
		return "app/workflow/flowsettting/theDesignProcess/main";
	}

	@RequestMapping({ "/theHomePage" })
	public String theHomePage() {
		return "app/workflow/flowsettting/theDesignProcess/theHomePage";
	}

	@RequestMapping({ "/attributeTwo" })
	public String attributeTwo() {
		return "app/workflow/flowsettting/theDesignProcess/designProcessSection/attribute";
	}

	@RequestMapping({ "/stepsTwo" })
	public String stepsTwo() {
		return "app/workflow/flowsettting/theDesignProcess/designProcessSection/steps";
	}

	@RequestMapping({ "/permissions" })
	public String permissions(HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		if (!this.sysParaService.checkIsHaveSecure(user, Integer.valueOf(8))) {
			return "app/common/development";
		}
		return "app/workflow/flowsettting/theDesignProcess/permissions";
	}

	@RequestMapping({ "/timingTask" })
	public String timingTask() {
		return "app/workflow/flowsettting/theDesignProcess/timingTask";
	}

	@RequestMapping({ "/configureTemplateQuery" })
	public String configureTemplateQuery() {
		return "app/workflow/flowsettting/theDesignProcess/configureTemplateQuery";
	}

	@RequestMapping({ "/applicationLayoutFile" })
	public String applicationLayoutFile() {
		return "app/workflow/flowsettting/theDesignProcess/applicationLayoutFile";
	}

	@RequestMapping({ "/attributeThree" })
	public String attributeThree() {
		return "app/workflow/flowsettting/theDesignProcess/designProcessSection/attributeTwo";
	}
}
