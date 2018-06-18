package com.myoa.dao.im;

import com.myoa.model.im.ImMessage;

import java.util.List;
import java.util.Map;

public abstract interface ImMessageMapper {
	public abstract int deleteByUuid(Map<String, Object> paramMap);

	public abstract List<ImMessage> getMessageList(Map<String, Object> paramMap);

	public abstract List<ImMessage> getGroupMessage(Map<String, Object> paramMap);

	public abstract int save(ImMessage paramImMessage);

	public abstract ImMessage getLastMessage(Map<String, Object> paramMap);

	public abstract List<ImMessage> selectMessageByPage(
			Map<String, Object> paramMap);

	public abstract List<ImMessage> getAttchments(Map<String, Object> paramMap);

	public abstract List<ImMessage> selectMessage(Map<String, Object> paramMap);

	public abstract ImMessage getMessageByLast(Map<String, Object> paramMap);

	public abstract List<ImMessage> getAllGroupMessage(String paramString);

	public abstract int upMessageByType(Map<String, Object> paramMap);
}