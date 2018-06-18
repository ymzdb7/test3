package com.myoa.controller.workPlan;

import com.myoa.model.users.Users;
import com.myoa.model.workPlan.WorkPlanWithBLOBs;
import com.myoa.service.workPlan.WorkPlanService;
import com.myoa.util.DateCompute;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/workPlan" })
public class WorkPlanController {

	@Resource
	private WorkPlanService workPlanService;

	@RequestMapping({ "/index" })
	public String index() {
		return "app/workPlan/index";
	}

	@RequestMapping({ "/workPlanManager" })
	public String workPlanManager() {
		return "app/workPlan/workPlanManager";
	}

	@RequestMapping({ "/workPlanEdit" })
	public String workPlanEdit(int editFlag, int planId,
			Map<String, Object> map, HttpServletRequest request) {
		map.put("editFlag", Integer.valueOf(editFlag));
		map.put("planId", Integer.valueOf(planId));
		return "app/workPlan/workPlanEdit";
	}

	@RequestMapping({ "/workPlanQuery" })
	public String workPlanQuery() {
		return "app/workPlan/workPlanQuery";
	}

	@RequestMapping({ "/workPlanQueryIndex" })
	public String workPlanQueryIndex() {
		return "app/workPlan/workPlanQueryIndex";
	}

	@RequestMapping({ "/workPlanTypeSetting" })
	public String workPlanTypeSetting() {
		return "app/workPlan/workPlanTypeSetting";
	}

	@RequestMapping({ "/workPlanQuList" })
	public String workPlanQuList(int time, Map<String, Object> map) {
		map.put("time", Integer.valueOf(time));
		return "app/workPlan/workPlanQuList";
	}

	@RequestMapping({ "/workPlanQuQuery" })
	public String workPlanQuQuery() {
		return "app/workPlan/workPlanQuQuery";
	}

	@ResponseBody
	@RequestMapping({ "/selectWorkPlanByCond" })
	ToJson<WorkPlanWithBLOBs> selectWorkPlanByCond(
			@RequestParam(value = "output", required = false, defaultValue = "0") int output,
			WorkPlanWithBLOBs workPlanWithBLOBs, HttpServletRequest request,
			HttpServletResponse response, HttpSession session, Integer page,
			Integer pageSize, boolean useFlag) {
		try {
			Date date = new Date();
			String[] weekArray = DateCompute.getWeekInterval().split(",");
			String[] monthArray = DateCompute.getMonthInterval().split(",");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Users user = (Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users());
			if (workPlanWithBLOBs != null)
				if (workPlanWithBLOBs.getTime().intValue() == 1) {
					workPlanWithBLOBs.setCurrentUser(String.valueOf(user
							.getUid()));

					workPlanWithBLOBs.setCurrent(sdf.parse(sdf
							.format(new Date())));
				} else if (workPlanWithBLOBs.getTime().intValue() == 2) {
					workPlanWithBLOBs.setCurrentUser(String.valueOf(user
							.getUid()));
					workPlanWithBLOBs.setBeginDate(sdf.parse(weekArray[0]));
					workPlanWithBLOBs.setEndDate(sdf.parse(weekArray[1]));
				} else if (workPlanWithBLOBs.getTime().intValue() == 3) {
					workPlanWithBLOBs.setCurrentUser(String.valueOf(user
							.getUid()));
					workPlanWithBLOBs.setBeginDate(sdf.parse(monthArray[0]));
					workPlanWithBLOBs.setEndDate(sdf.parse(monthArray[1]));
				} else if (workPlanWithBLOBs.getTime().intValue() == 0) {
					workPlanWithBLOBs.setCurrentUser(String.valueOf(user
							.getUid()));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.workPlanService.selectWorkPlanByCond(output,
				workPlanWithBLOBs, request, response, session, page, pageSize,
				useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/insertWorkPlan" })
	ToJson<WorkPlanWithBLOBs> insertWorkPlan(
			WorkPlanWithBLOBs workPlanWithBLOBs, HttpServletRequest request) {
		return this.workPlanService.insertWorkPlan(workPlanWithBLOBs, request);
	}

	@ResponseBody
	@RequestMapping({ "/updateWorkPlanById" })
	ToJson<WorkPlanWithBLOBs> updateWorkPlanById(
			WorkPlanWithBLOBs workPlanWithBLOBs) {
		return this.workPlanService.updateWorkPlanById(workPlanWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/delWorkPlanById" })
	ToJson<WorkPlanWithBLOBs> delWorkPlanById(int planId) {
		return this.workPlanService.delWorkPlanById(planId);
	}

	@ResponseBody
	@RequestMapping({ "/deleteWorkPlanByIds" })
	public ToJson<WorkPlanWithBLOBs> deleteWorkPlanByIds(String planIds) {
		return this.workPlanService.deleteWorkPlanByIds(planIds);
	}

	@ResponseBody
	@RequestMapping({ "/selectWorkPlanById" })
	ToJson<WorkPlanWithBLOBs> selectWorkPlanById(int planId) {
		return this.workPlanService.selectWorkPlanById(planId);
	}
}
