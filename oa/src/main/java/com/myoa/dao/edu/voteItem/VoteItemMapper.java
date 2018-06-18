package com.myoa.dao.edu.voteItem;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myoa.model.edu.voteItem.VoteItem;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface VoteItemMapper extends BaseMapper<VoteItem> {
	public abstract int addVoteItem(VoteItem paramVoteItem);

	public abstract int updateVoteItem(VoteItem paramVoteItem);

	public abstract int deleteByItemId(Integer paramInteger);

	public abstract List<VoteItem> getVoteItemList(Integer paramInteger);

	public abstract int updateVoteCount(VoteItem paramVoteItem);

	public abstract VoteItem getOneVoteItem(VoteItem paramVoteItem);

	public abstract void updateVote(VoteItem paramVoteItem);

	public abstract VoteItem getVoteItem(Integer paramInteger);

	public abstract List<VoteItem> selectVoteEndTime(
			@Param("dateTime") String paramString);
}
