package com.myoa.controller.dingdingManage;

import com.myoa.model.common.SysPara;
import com.myoa.service.dingdingManage.DingdingManageService;
import com.myoa.util.common.wrapper.BaseWrapper;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/dingdingMicroApp" })
public class DingdingMicroAppController {

	@Autowired
	DingdingManageService dingdingManageService;

	@RequestMapping({ "/getMainddh5" })
	public String mainddh5(HttpServletRequest request) {
		BaseWrapper wrapper = this.dingdingManageService.baseDingDingGet();
		String corpId = "";
		String corpSecret = "";
		if (wrapper.isFlag()) {
			List<SysPara> sysParaList = (List<SysPara>) wrapper.getData();
			for (SysPara sysPara : sysParaList) {
				if (sysPara.getParaName().equals("DINGDINGQY_CORPID")) {
					corpId = sysPara.getParaValue();
				}
				if (sysPara.getParaName().equals("DINGDINGQY_SECRET")) {
					corpSecret = sysPara.getParaValue();
				}
			}
			request.setAttribute("corpId", corpId);
			request.setAttribute("corpSecret", corpSecret);
		}
		return "/app/main/mainddh5";
	}

	@RequestMapping({ "/chooseTeam" })
	public String chooseTeam() {
		return "/app/main/m/maintionh5";
	}

	@RequestMapping({ "/noticeh5" })
	public String noticeh5() {
		return "/app/notice/m/noticeh5";
	}

	@RequestMapping({ "/noticeDetailsh5" })
	public String noticeDetailsh5() {
		return "/app/notice/m/noticeDetailsh5";
	}

	@RequestMapping({ "/emailh5" })
	public String emailh5() {
		return "/app/email/m/emailh5";
	}

	@RequestMapping({ "/addMailh5" })
	public String addMailh5() {
		return "/app/email/m/add_mailh5";
	}

	@RequestMapping({ "/detailh5" })
	public String detailh5() {
		return "/app/email/m/detailh5";
	}

	@RequestMapping({ "/turnMailh5" })
	public String turnMailh5() {
		return "/app/email/m/turn_mailh5";
	}

	@RequestMapping({ "/emailPoph5" })
	public String emailPoph5() {
		return "/app/email/m/emailPoph5";
	}

	@RequestMapping({ "/replyMailh5" })
	public String replyMailh5() {
		return "/app/email/m/replyMailh5";
	}

	@RequestMapping({ "/newsh5" })
	public String newsh5() {
		return "/app/news/m/newsh5";
	}

	@RequestMapping({ "/newsdetailh5" })
	public String newsdetailh5() {
		return "/app/news/m/newsdetailh5";
	}

	@RequestMapping({ "/calendarh5" })
	public String calendarh5() {
		return "/app/calendar/m/calendarh5";
	}

	@RequestMapping({ "/addScheduleh5" })
	public String addScheduleh5() {
		return "/app/calendar/m/addScheduleh5";
	}

	@RequestMapping({ "/diaryIndex" })
	public String diaryIndex() {
		return "/app/diary/m/index";
	}

	@RequestMapping({ "/iStartedList" })
	public String iStartedList() {
		return "/app/diary/m/iStarted_list";
	}

	@RequestMapping({ "/diaryCreate" })
	public String diaryCreate() {
		return "/app/diary/m/Create";
	}

	@RequestMapping({ "/diaryConsult" })
	public String diaryConsult() {
		return "/app/diary/m/consult";
	}

	@RequestMapping({ "/diaryComment" })
	public String diaryComment() {
		return "/app/diary/m/comment";
	}

	@RequestMapping({ "/diaryShareList" })
	public String diaryShareList() {
		return "/app/diary/m/share_list";
	}

	@RequestMapping({ "/diaryReceivedDetails" })
	public String diaryReceivedDetails() {
		return "/app/diary/m/received_details";
	}

	@RequestMapping({ "/diaryCount" })
	public String diaryCount() {
		return "/app/diary/m/count";
	}

	@RequestMapping({ "/diaryCountList" })
	public String diaryCountList() {
		return "/app/diary/m/count_list";
	}

	@RequestMapping({ "/diaryCalender" })
	public String diaryCalender() {
		return "/app/diary/m/calender";
	}

	@RequestMapping({ "/workflowAdd" })
	public String workflowAdd() {
		return "/app/workflow/m/add";
	}

	@RequestMapping({ "/workflowIndex" })
	public String workflowIndex() {
		return "/app/workflow/m/index";
	}

	@RequestMapping({ "/workflowNewWork" })
	public String workflowNewWork() {
		return "/app/workflow/m/new_work";
	}

	@RequestMapping({ "/workflowLaunch" })
	public String workflowLaunch() {
		return "/app/workflow/m/launch";
	}

	@RequestMapping({ "/workform" })
	public String workform() {
		return "/app/workflow/m/workform";
	}

	@RequestMapping({ "/fileIndex" })
	public String fileIndex() {
		return "/app/file/m/index";
	}

	@RequestMapping({ "/fileContent" })
	public String fileContent() {
		return "/app/file/m/file_content";
	}

	@RequestMapping({ "/attendIndex" })
	public String attendIndex() {
		return "/app/attend/m/index";
	}

	@RequestMapping({ "/attendCount" })
	public String attendCount() {
		return "/app/attend/m/kqtj_index";
	}

	@RequestMapping({ "/attendAddtype" })
	public String attendAddtype() {
		return "/app/attend/m/addtype";
	}

	@RequestMapping({ "/attendWindex" })
	public String attendWindex() {
		return "/app/attend/m/windex";
	}
}
