package com.myoa.service.edu.voteItem;

import com.baomidou.mybatisplus.service.IService;
import com.myoa.model.edu.voteItem.VoteItem;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface IVoteItemService extends IService<VoteItem>
{
  public abstract ToJson<VoteItem> addVoteItem(HttpServletRequest paramHttpServletRequest, VoteItem paramVoteItem);

  public abstract ToJson<VoteItem> updateVoteItem(HttpServletRequest paramHttpServletRequest, VoteItem paramVoteItem);

  public abstract ToJson<VoteItem> deleteByItemId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<VoteItem> getVoteItemList(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<VoteItem> updateVoteCount(HttpServletRequest paramHttpServletRequest, VoteItem paramVoteItem);
}
