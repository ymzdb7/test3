package com.myoa.dao.email;

import com.myoa.dao.base.BaseMapper;
import com.myoa.model.email.EmailBodyModel;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface EmailBodyMapper extends BaseMapper<EmailBodyModel> {
	public abstract int updateByPrimaryKey(EmailBodyModel paramEmailBodyModel);

	public abstract void deleteDrafts(Integer paramInteger);

	public abstract EmailBodyModel queryById(Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> selectInbox(
			Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> listDrafts(Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> listSendEmail(
			Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> selectIsRead(
			Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> listWastePaperbasket(
			Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> listqueryEmailBody(
			Map<String, Object> paramMap);

	public abstract void updateOutbox(Integer paramInteger);

	public abstract void updateOutboxs(Integer paramInteger);

	public abstract void deleteOutbox(Integer paramInteger);

	public abstract void updateInbox(Integer paramInteger);

	public abstract void updateInboxs(Integer paramInteger);

	public abstract void updateRecycle(Integer paramInteger);

	public abstract void deleteRecycle(Integer paramInteger);

	public abstract List<EmailBodyModel> selectBoxEmail(
			Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> selectIsBoxEmail(
			Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> selectInboxIsRead(
			Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> selectInboxIsReadList(
			Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> selectCount(
			Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> selectListByMoths(
			@Param("sendTime") String paramString1,
			@Param("year") String paramString2,
			@Param("userId") String paramString3);

	public abstract EmailBodyModel queryByBodyId(Map<String, Object> paramMap);

	public abstract List<EmailBodyModel> queryEmailBySubject(String paramString);
}
