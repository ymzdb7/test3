package com.myoa.dao.edu.voteTitle;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myoa.model.edu.voteTitle.VoteTitle;

import java.util.List;
import java.util.Map;

public abstract interface VoteTitleMapper extends BaseMapper<VoteTitle> {
	public abstract List<VoteTitle> getVoteTitleList(
			Map<String, Object> paramMap);

	public abstract int getcount();

	public abstract int newVoteTitle(VoteTitle paramVoteTitle);

	public abstract int updateVoteTitle(VoteTitle paramVoteTitle);

	public abstract List<VoteTitle> getChildVoteList(Integer paramInteger);

	public abstract VoteTitle getChilddetail(Integer paramInteger);

	public abstract void deleteByVoteId(String[] paramArrayOfString);

	public abstract List<VoteTitle> getVoteDataByVoteId(Integer paramInteger);

	public abstract List<VoteTitle> searchVoteTitleList(
			Map<String, Object> paramMap);

	public abstract List<VoteTitle> searchVoteTitleListCopy(
			Map<String, Object> paramMap);

	public abstract List<VoteTitle> getVoteTitleCount(
			Map<String, Object> paramMap);

	public abstract Integer getCount(Integer paramInteger);

	public abstract int getcount1();

	public abstract int getcount2();

	public abstract VoteTitle voteSelectOne(Integer paramInteger);

	public abstract VoteTitle slectUserTd(Map<String, Object> paramMap);
}