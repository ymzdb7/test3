package com.myoa.controller.edu.eduElectiveStudentCount;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.edu.eduElectiveStudent.EduElectiveStudent;
import com.myoa.model.edu.eduElectiveStudentCount.EduElectiveStudentCount;
import com.myoa.service.edu.eduElectiveStudent.IEduElectiveStudentService;
import com.myoa.service.edu.eduElectiveStudentCount.IEduElectiveStudentCountService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

@Controller
@RequestMapping({ "/eduElectiveStudentCount" })
public class EduElectiveStudentCountController {

	@Autowired
	private IEduElectiveStudentCountService eduElectiveStudentCountService;

	@Autowired
	private IEduElectiveStudentService eduElectiveStudentService;

	@RequestMapping({ "/StatisticsIndex" })
	public String StatisticsIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduElectiveStatistics/index";
	}

	@RequestMapping({ "/classStatistics" })
	public String classStatistics(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduElectiveStatistics/classStatistics";
	}

	@RequestMapping({ "/courseStatisticsDetails" })
	public String courseStatisticsDetails(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduElectiveStatistics/courseStatisticsDetails";
	}

	@RequestMapping({ "/courseStatisticsChange" })
	public String courseStatisticsChange(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduElectiveStatistics/courseStatisticsChange";
	}

	@RequestMapping({ "/statisticsDetails" })
	public String statisticsDetails(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduElectiveStatistics/statisticsDetails";
	}

	@RequestMapping({ "/statisticsChange" })
	public String statisticsChange(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduElectiveStatistics/statisticsChange";
	}

	@RequestMapping({ "/onClassStatistics" })
	public String onClassStatistics(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduElectiveStatistics/onClassStatistics";
	}

	@RequestMapping({ "/allStatistics" })
	public String allStatistics(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduElectiveStatistics/allStatistics";
	}

	@RequestMapping({ "/courseDetails" })
	public String courseDetails(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/eduElectiveStatistics/courseDetails";
	}

	@RequestMapping({ "/eudSelectStudentCount" })
	@ResponseBody
	public ToJson<EduElectiveStudentCount> eudSelectStudentCount(
			EduElectiveStudentCount eduElectiveStudentCount) {
		return this.eduElectiveStudentCountService
				.eudSelectStudentCount(eduElectiveStudentCount);
	}

	@RequestMapping({ "/eudSelectClassStudentCount" })
	@ResponseBody
	public ToJson eudSelectClassStudentCount(HttpServletRequest request) {
		Map map = new HashMap();
		map.put("nid", request.getParameter("nid"));
		map.put("zhuangtai", request.getParameter("zhuangtai"));
		map.put("sid", request.getParameter("sid"));
		return this.eduElectiveStudentCountService
				.eudSelectClassStudentCount(map);
	}

	@RequestMapping({ "/eduElecctiveStudentCountSum" })
	@ResponseBody
	public ToJson eduElecctiveStudentCountSum(HttpServletRequest request) {
		Map map = new HashMap();
		map.put("id", request.getParameter("id1"));
		map.put("className", request.getParameter("className"));
		map.put("term", request.getParameter("term"));
		map.put("sid", request.getParameter("sid"));
		map.put("nid", request.getParameter("nid"));
		return this.eduElectiveStudentCountService
				.eduElecctiveStudentCountSum(map);
	}

	@RequestMapping({ "/eduElecctiveStudentCountUpdate" })
	@ResponseBody
	public ToJson eduElecctiveStudentCountUpdate(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		return this.eduElectiveStudentCountService
				.eduElecctiveStudentCountUpdate(Integer.valueOf(id));
	}

	public ToJson eduElecctiveStudentCountUpdateAccumulation(
			HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		return this.eduElectiveStudentCountService
				.eduElecctiveStudentCountUpdateAccumulation(Integer.valueOf(id));
	}

	public ToJson eduElecctiveStudentCountInsert(
			EduElectiveStudentCount eduElectiveStudentCount) {
		return this.eduElectiveStudentCountService
				.eduElecctiveStudentCountInsert(eduElectiveStudentCount);
	}

	@ResponseBody
	@RequestMapping({ "/eduElectiveStudentTiaoKe" })
	public ToJson eduElectiveStudentTiaoKe(HttpServletRequest request) {
		ToJson json = new ToJson();
		String[] studentId = request.getParameterValues("studentId[]");
		EduElectiveStudent eduElectiveStudent = null;
		EduElectiveStudent[] eduElectiveStudent1 = null;
		int count = 0;
		try {
			for (int i = 0; studentId.length > i; i++) {
				ToJson json1 = this.eduElectiveStudentCountService
						.eduElectiveOneSelect(studentId[i]);
				EduElectiveStudentCount eduElectiveStudentCount = (EduElectiveStudentCount) json1
						.getObject();
				if (eduElectiveStudentCount != null) {
					Integer sid = Integer.valueOf(request.getParameter("sid"));
					String studentName = request.getParameter("studentName");
					Integer nid = Integer.valueOf(request.getParameter("nid"));
					String year = request.getParameter("year");
					Integer classId = Integer.valueOf(request
							.getParameter("classId"));
					String teachComments = request
							.getParameter("teachComments");
					String studentComments = request
							.getParameter("studentComments");
					eduElectiveStudent.setSid(sid);
					eduElectiveStudent.setStudentName(studentName);
					eduElectiveStudent.setNid(nid);
					eduElectiveStudent.setYear(year);
					eduElectiveStudent.setClassId(classId);
					eduElectiveStudent.setTeachComments(Integer
							.valueOf(teachComments));
					eduElectiveStudent.setStudentComments(studentComments);
					eduElectiveStudent1[i] = eduElectiveStudent;
					json = this.eduElectiveStudentService
							.eduElectiveStudentInsert(eduElectiveStudent1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}

	@RequestMapping({ "/eduClassStudent" })
	@ResponseBody
	public ToJson eduClassStudent(HttpServletRequest request) {
		return this.eduElectiveStudentCountService.eduClassStudent(request);
	}

	@RequestMapping({ "/studentClassIdName" })
	@ResponseBody
	public ToJson studentClassIdName(HttpServletRequest request) {
		return this.eduElectiveStudentCountService.studentClassIdName(Integer
				.valueOf(request.getParameter("sid")));
	}

	@RequestMapping({ "/eduClassIdXuanKeId" })
	@ResponseBody
	public ToJson eduClassIdXuanKeId(HttpServletRequest request) {
		Map map = new HashMap();
		map.put("classId", request.getParameter("classId"));
		map.put("sid", Integer.valueOf(request.getParameter("sid")));
		return this.eduElectiveStudentCountService.eduClassIdXuanKeId(map);
	}
}
