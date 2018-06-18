package com.myoa.controller.edu.voteTitle;

import com.myoa.model.edu.voteTitle.VoteTitle;
import com.myoa.model.users.Users;
import com.myoa.service.edu.voteTitle.IVoteTitleService;
import com.myoa.util.AjaxJson;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/vote/manage" })
public class VoteTitleController {

	@Autowired
	IVoteTitleService voteTitleService;

	@ResponseBody
	@RequestMapping({ "/getVoteTitleList" })
	public ToJson<VoteTitle> getVoteTitleList(
			HttpServletRequest request,
			VoteTitle voteTitle,
			Map<String, Object> maps,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		return this.voteTitleService.getVoteTitleList(request, voteTitle, maps,
				page, pageSize, useFlag);
	}

	@RequestMapping({ "/vote" })
	public String vote(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/voteTitle/index";
	}

	@RequestMapping({ "/voteChild" })
	public String voteChild(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/voteTitle/voteChild";
	}

	@RequestMapping({ "/voteList" })
	public String voteList(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/voteTitle/voteList";
	}

	@RequestMapping({ "/newVote" })
	public String newVote(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/voteTitle/newVote";
	}

	@RequestMapping({ "/updateVote" })
	public String updateVote(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/voteTitle/viteItem";
	}

	@RequestMapping({ "/editVote" })
	public String editVote(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/voteTitle/voteEdit";
	}

	@RequestMapping({ "/editChildVote" })
	public String editChildVote(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/voteTitle/editChildVote";
	}

	@RequestMapping({ "/voteIndex" })
	public String voteIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/vote/voteList/index";
	}

	@RequestMapping({ "/publishVote" })
	public String publishVote(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/vote/voteList/publishVote";
	}

	@RequestMapping({ "/unPublishVote" })
	public String unPublishVote(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/vote/voteList/unPublishVote";
	}

	@RequestMapping({ "/voteResult" })
	public String voteResult(HttpServletRequest request) {
		String resultId = request.getParameter("resultId");
		String type = request.getParameter("type");
		if (type.equals("0")) {
			return "app/edu/voteTitle/voteResult";
		}
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		boolean isVote = this.voteTitleService.isVotite(resultId, user);

		if (!isVote) {
			return "app/vote/voteList/readVote";
		}
		return "app/edu/voteTitle/voteResult";
	}

	@RequestMapping({ "/readVote" })
	public String readVote(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/vote/voteList/readVote";
	}

	@RequestMapping({ "/newChildVote" })
	public String newChildVote(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/edu/voteTitle/newChildVote";
	}

	@ResponseBody
	@RequestMapping({ "/newVoteTitle" })
	public ToJson<VoteTitle> newVoteTitle(HttpServletRequest request,
			VoteTitle voteTitle) {
		return this.voteTitleService.newVoteTitle(request, voteTitle);
	}

	@ResponseBody
	@RequestMapping({ "/updateVoteTitle" })
	public ToJson<VoteTitle> updateVoteTitle(HttpServletRequest request,
			VoteTitle voteTitle) {
		return this.voteTitleService.updateVoteTitle(request, voteTitle);
	}

	@ResponseBody
	@RequestMapping({ "/getChildVoteList" })
	public ToJson<VoteTitle> getChildVoteList(HttpServletRequest request,
			VoteTitle voteTitle, Integer voteId) {
		return this.voteTitleService.getChildVoteList(request, voteTitle,
				voteId);
	}

	@ResponseBody
	@RequestMapping({ "/getOptionVoteList" })
	public ToJson<VoteTitle> getOptionVoteList(HttpServletRequest request,
			VoteTitle voteTitle, Integer voteId) {
		return this.voteTitleService.getOptionVoteList(request, voteTitle,
				voteId);
	}

	@ResponseBody
	@RequestMapping({ "/addChildVoteTitle" })
	public ToJson<VoteTitle> addChildVoteTitle(HttpServletRequest request,
			VoteTitle voteTitle) {
		return this.voteTitleService.addChildVoteTitle(request, voteTitle);
	}

	@ResponseBody
	@RequestMapping({ "/getChildDetail" })
	public ToJson<VoteTitle> getChilddetail(HttpServletRequest request,
			Integer voteId) {
		return this.voteTitleService.getChilddetail(request, voteId);
	}

	@ResponseBody
	@RequestMapping({ "/deleteByVoteId" })
	public ToJson<VoteTitle> deleteByVoteId(HttpServletRequest request,
			String[] voteIds) {
		return this.voteTitleService.deleteByVoteId(request, voteIds);
	}

	@ResponseBody
	@RequestMapping({ "/getVoteDataByVoteId" })
	public ToJson<VoteTitle> getVoteDataByVoteId(HttpServletRequest request,
			Integer voteId) {
		return this.voteTitleService.getVoteDataByVoteId(request, voteId);
	}

	@ResponseBody
	@RequestMapping({ "/searchVoteTitleList" })
	public ToJson<VoteTitle> searchVoteTitleList(
			HttpServletRequest request,
			VoteTitle voteTitle,
			Map<String, Object> maps,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		return this.voteTitleService.searchVoteTitleList(request, voteTitle,
				maps, page, pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/getVoteTitleCount" })
	public ToJson<VoteTitle> getVoteTitleCount(
			HttpServletRequest request,
			VoteTitle voteTitle,
			Map<String, Object> maps,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		return this.voteTitleService.getVoteTitleCount(request, voteTitle,
				maps, page, pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/addVoteTitle" })
	public AjaxJson addVoteTitle(HttpServletRequest request,
			VoteTitle voteTitle, String options, Integer voteId) {
		return this.voteTitleService.addVoteTitle(request, voteTitle, options,
				voteId);
	}

	@ResponseBody
	@RequestMapping({ "/statusUpdate" })
	public AjaxJson statusUpdate(HttpServletRequest request, Integer voteId) {
		return this.voteTitleService.statusUpdate(request, voteId);
	}

	@ResponseBody
	@RequestMapping({ "/getPublishVoteTitleList" })
	public ToJson<VoteTitle> getPublishVoteTitleList(
			HttpServletRequest request,
			VoteTitle voteTitle,
			Map<String, Object> maps,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		return this.voteTitleService.getPublishVoteTitleList(request,
				voteTitle, maps, page, pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/getPublishVoteTitleCount" })
	public ToJson<VoteTitle> getPublishVoteTitleCount(
			HttpServletRequest request,
			VoteTitle voteTitle,
			Map<String, Object> maps,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		return this.voteTitleService.getPublishVoteTitleCount(request,
				voteTitle, maps, page, pageSize, useFlag);
	}
}
