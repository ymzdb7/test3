package com.myoa.service.email;

import com.myoa.model.email.EmailBodyModel;
import com.myoa.model.email.EmailBoxModel;
import com.myoa.model.email.EmailModel;
import com.myoa.model.email.Webmail;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrappers;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public abstract interface EmailService
{
  public abstract ToJson<EmailBodyModel> sendEmail(EmailBodyModel paramEmailBodyModel, EmailModel paramEmailModel, String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<EmailBodyModel> saveEmail(EmailBodyModel paramEmailBodyModel);

  public abstract void updateIsRead(EmailModel paramEmailModel);

  public abstract ToJson<EmailBodyModel> selectEmail(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString)
    throws Exception;

  public abstract void deleteByID(Integer paramInteger);

  public abstract EmailBodyModel queryById(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString);

  public abstract ToJson<EmailBodyModel> selectInbox(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString)
    throws Exception;

  public abstract ToJson<EmailBodyModel> listDrafts(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString)
    throws Exception;

  public abstract ToJson<EmailBodyModel> listSendEmail(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString)
    throws Exception;

  public abstract ToJson<EmailBodyModel> listWastePaperbasket(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString)
    throws Exception;

  public abstract ToJson<EmailBodyModel> selectEmailBody(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString)
    throws Exception;

  public abstract ToJson<EmailBodyModel> selectIsRead(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString)
    throws Exception;

  public abstract String deleteOutEmail(Integer paramInteger, String paramString);

  public abstract String deleteInEmail(Integer paramInteger, String paramString);

  public abstract String deleteRecycleEmail(Integer paramInteger, String paramString);

  public abstract String queryByIdCss(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<EmailBodyModel> draftsSendEmail(EmailBodyModel paramEmailBodyModel, EmailModel paramEmailModel, String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<EmailBoxModel> saveEmailBox(EmailBoxModel paramEmailBoxModel);

  public abstract ToJson<EmailBoxModel> showEmailBox(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<EmailModel> updateEmailBox(EmailModel paramEmailModel);

  public abstract ToJson<EmailBodyModel> selectBoxEmail(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString);

  public abstract ToJson<EmailBodyModel> deleteBoxEmail(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<EmailBoxModel> updeateEmailBoxName(EmailBoxModel paramEmailBoxModel);

  public abstract ToJson<EmailBodyModel> selectInboxIsRead(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString);

  public abstract ToJson<EmailBodyModel> selectInboxIsReadList(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean, String paramString);

  public abstract ToJson<Webmail> saveWebMail(Webmail paramWebmail);

  public abstract ToJson<Webmail> updateWebMail(Webmail paramWebmail);

  public abstract ToJson<Webmail> deleteWebMail(Integer paramInteger);

  public abstract ToJson<Webmail> selectUserWebMail(String paramString);

  public abstract ToJson<Webmail> selectOneWebMail(String paramString, Integer paramInteger);

  public abstract BaseWrappers getEmailReadDetail(Integer paramInteger, String paramString);

  public abstract ToJson<EmailBodyModel> selectCount(HttpServletRequest paramHttpServletRequest, String paramString, Integer paramInteger);

  public abstract ToJson<EmailBodyModel> selectListByMoths(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<EmailBodyModel> selectDetailById(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<EmailModel> updateEmailWithdraw(Integer paramInteger);

  public abstract ToJson<EmailBodyModel> queryEmailBySubject(String paramString);
}

