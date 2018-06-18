package com.myoa.dao.supervision;

import com.myoa.model.supervision.SupFeedBackReply;
import com.myoa.model.supervision.SupFeedBackReplyExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SupFeedBackReplyMapper {
	public abstract int countByExample(
			SupFeedBackReplyExample paramSupFeedBackReplyExample);

	public abstract int deleteByExample(
			SupFeedBackReplyExample paramSupFeedBackReplyExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SupFeedBackReply paramSupFeedBackReply);

	public abstract int insertSelective(SupFeedBackReply paramSupFeedBackReply);

	public abstract List<SupFeedBackReply> selectByExample(
			SupFeedBackReplyExample paramSupFeedBackReplyExample);

	public abstract SupFeedBackReply selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SupFeedBackReply paramSupFeedBackReply,
			@Param("example") SupFeedBackReplyExample paramSupFeedBackReplyExample);

	public abstract int updateByExample(
			@Param("record") SupFeedBackReply paramSupFeedBackReply,
			@Param("example") SupFeedBackReplyExample paramSupFeedBackReplyExample);

	public abstract int updateByPrimaryKeySelective(
			SupFeedBackReply paramSupFeedBackReply);

	public abstract int updateByPrimaryKey(
			SupFeedBackReply paramSupFeedBackReply);

	public abstract List<Object> selectContent(Integer paramInteger);
}
