package com.myoa.dao.email;

import com.myoa.dao.base.BaseMapper;
import com.myoa.model.email.EmailModel;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface EmailMapper extends BaseMapper<EmailModel> {
	public abstract void updateIsRead(EmailModel paramEmailModel);

	public abstract void updateEmailBox(EmailModel paramEmailModel);

	public abstract List<EmailModel> selectUserReadFlag(
			Map<String, Object> paramMap);

	public abstract EmailModel queryByEmailOne(
			@Param("emailId") Integer paramInteger);

	public abstract List<EmailModel> selectByBodyId(Map<String, Object> paramMap);

	public abstract void updateEmailWithdraw(Map<String, Object> paramMap);
}
