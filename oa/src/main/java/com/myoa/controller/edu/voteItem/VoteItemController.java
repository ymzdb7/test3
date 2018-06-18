package com.myoa.controller.edu.voteItem;

import com.myoa.model.edu.voteItem.VoteItem;
import com.myoa.service.edu.voteItem.IVoteItemService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/voteItem" })
public class VoteItemController {

	@Autowired
	IVoteItemService voteItemService;

	@ResponseBody
	@RequestMapping({ "/addVoteItem" })
	public ToJson<VoteItem> addVoteItem(HttpServletRequest request,
			VoteItem voteItem) {
		return this.voteItemService.addVoteItem(request, voteItem);
	}

	@ResponseBody
	@RequestMapping({ "/updateVoteItem" })
	public ToJson<VoteItem> updateVoteItem(HttpServletRequest request,
			VoteItem voteItem) {
		return this.voteItemService.updateVoteItem(request, voteItem);
	}

	@ResponseBody
	@RequestMapping({ "/updateVoteCount" })
	public ToJson<VoteItem> updateVoteCount(HttpServletRequest request,
			VoteItem voteItem) {
		return this.voteItemService.updateVoteCount(request, voteItem);
	}

	@ResponseBody
	@RequestMapping({ "/deleteByItemId" })
	public ToJson<VoteItem> deleteByItemId(HttpServletRequest request,
			Integer itemId) {
		return this.voteItemService.deleteByItemId(request, itemId);
	}

	@ResponseBody
	@RequestMapping({ "/getVoteItemList" })
	public ToJson<VoteItem> getVoteItemList(HttpServletRequest request,
			Integer voteId) {
		return this.voteItemService.getVoteItemList(request, voteId);
	}
}
