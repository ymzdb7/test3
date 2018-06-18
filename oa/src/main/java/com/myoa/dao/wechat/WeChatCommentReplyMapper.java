package com.myoa.dao.wechat;

import com.myoa.model.wechat.WeChatCommentReply;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface WeChatCommentReplyMapper {
	public abstract int insertWeChatCommentReply(
			WeChatCommentReply paramWeChatCommentReply);

	public abstract List<WeChatCommentReply> selectWeChatCommentReply(
			@Param("wid") Integer paramInteger1,
			@Param("cid") Integer paramInteger2);

	public abstract List<WeChatCommentReply> selectWeChatCommentReplyByCID(
			@Param("cid") Integer paramInteger);

	public abstract List<WeChatCommentReply> selectWeChatCommentReplyByWID(
			@Param("wid") Integer paramInteger);

	public abstract int deleteWeChatCommentReplyByCID(Integer paramInteger);

	public abstract int deleteWeChatCommentReplyByWID(Integer paramInteger);

	public abstract int deleteByPrimaryKey(Integer paramInteger);
}