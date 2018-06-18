package com.myoa.controller.edu.eduScore;

import com.myoa.model.edu.eduScore.EduScore;
import com.myoa.model.edu.eduTeacher.EduTeacher;
import com.myoa.model.users.Users;
import com.myoa.service.edu.eduScore.IEduScoreService;
import com.myoa.service.edu.eduStudent.IEduStudentService;
import com.myoa.service.edu.eduTeacher.EduTeacherService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.beans.Transient;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/eduScore" })
public class EduScoreController {

	@Autowired
	private EduTeacherService eduTeacherService;

	@Autowired
	private IEduStudentService eduStudentService;

	@Autowired
	private IEduScoreService eduScoreService;

	@RequestMapping({ "/userTsf" })
	@ResponseBody
	public ToJson<Map<String, Object>> userTsf(HttpServletRequest request) {
		ToJson json = new ToJson();
		try {
			EduTeacher eduTeacher = new EduTeacher();
			Users users = (Users) SessionUtils.getSessionInfo(
					request.getSession(), Users.class, new Users());
			String name = users.getUserName();
			String id = users.getUserId();
			eduTeacher.setUserId(id);
			eduTeacher.setUserName(name);

			json = this.eduTeacherService.UsersTeacherIdselect(eduTeacher);
			json.setFlag(0);
			json.setMsg("ok");
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
		}
		return json;
	}

	@RequestMapping({ "/classStudent" })
	@ResponseBody
	public ToJson<Map> classStudent(HttpServletRequest request) {
		return this.eduStudentService.studentSelect(request
				.getParameter("graseClass"));
	}

	@RequestMapping({ "/getKeMu" })
	@ResponseBody
	public ToJson<String> getKeMu() {
		return this.eduTeacherService.getKeMu();
	}

	@Transient
	@RequestMapping({ "/eudScoreInsert" })
	public ToJson eudScoreInsert(List<EduScore> edulist) {
		ToJson json = new ToJson();
		try {
			for (EduScore eduscore : edulist) {
				this.eduScoreService.eudScoreInsert(eduscore);
				json.setFlag(0);
				json.setMsg("ok");
			}
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
		}
		return json;
	}

	@RequestMapping({ "/yearSelect" })
	@ResponseBody
	public ToJson yearSelect(HttpServletRequest request) {
		return this.eduScoreService.yearSelect(request
				.getParameter("schollYear"));
	}

	@RequestMapping({ "/wordEduScoreInsert" })
	@ResponseBody
	public ToJson wordEduScoreInsert(MultipartFile file,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		return this.eduScoreService.wordEduScoreInsert(file, request, response,
				session);
	}

	@RequestMapping({ "/yearClassSelect" })
	@ResponseBody
	public ToJson yearClassSelect(Map<String, String> maps) {
		return this.eduScoreService.yearClassSelect(maps);
	}

	@RequestMapping({ "/eduScoreTww" })
	@ResponseBody
	public ToJson eduScoreTww(HttpServletRequest request) {
		return this.eduScoreService.eduScoreTww(request);
	}

	@RequestMapping({ "/eduScoreTwwSelect" })
	@ResponseBody
	public ToJson eduScoreTwwSelect(HttpServletRequest request) {
		return this.eduScoreService.eduScoreTwwSelect(request);
	}

	@RequestMapping({ "/scoreIndex" })
	public String scoreIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduScore/index";
	}

	@RequestMapping({ "/scoreInput" })
	public String scoreInput(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduScore/scoreInput";
	}

	@RequestMapping({ "/scoreManage" })
	public String scoreManage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduScore/scoreManage";
	}

	@RequestMapping({ "/scoreManageImport" })
	public String scoreManageImport(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduScore/scoreManageImport";
	}

	@RequestMapping({ "/scoreJurisdiction" })
	public String scoreJurisdiction(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduScore/scoreJurisdiction";
	}
}
