 package com.myoa.service.email.impl;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.email.EmailBodyMapper;
import com.myoa.dao.email.EmailBoxMapper;
import com.myoa.dao.email.EmailMapper;
import com.myoa.dao.email.WebmailMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.email.EmailBodyModel;
import com.myoa.model.email.EmailBoxModel;
import com.myoa.model.email.EmailModel;
import com.myoa.model.email.Webmail;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.sms.SmsBody;
import com.myoa.model.sms2.Sms2Priv;
import com.myoa.model.users.Users;
import com.myoa.service.ThreadSerivice.ThreadService;
import com.myoa.service.email.EmailService;
import com.myoa.service.sms.SmsService;
import com.myoa.service.smsDelivery.Sms2PrivService;
import com.myoa.service.users.UsersService;
import com.myoa.util.Constant;
import com.myoa.util.DateFormat;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.dataSource.ContextHolder;
import com.myoa.util.email.EmailUtil;
import com.myoa.util.page.PageParams;

 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.Set;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.apache.commons.collections.map.HashedMap;
 import org.apache.log4j.Logger;
 import org.springframework.scheduling.annotation.Async;
 import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class EmailServiceImpl
   implements EmailService
 {
   private Logger logger = Logger.getLogger(EmailServiceImpl.class);
   private final Integer TO_USER_INFO = Integer.valueOf(17);
   private final Integer COPY_USER_FINO = Integer.valueOf(18);
   private final Integer SERC_USER_FINO = Integer.valueOf(19);
 
   @Resource
   private EmailBodyMapper emailBodyMapper;
 
   @Resource
   private EmailMapper emailMapper;
 
   @Resource
   private EmailBoxMapper emailBoxMapper;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private WebmailMapper webmailMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private SysCodeMapper sysCodeMapper;
 
   @Resource
   private SmsService smsService;
 
   @Resource
   ThreadService threadService;
 
   @Resource
   ThreadPoolTaskExecutor threadPoolTaskExecutor;
 
   @Resource
   private Sms2PrivService sms2PrivService;
 
   @Transactional
   public ToJson<EmailBodyModel> sendEmail(EmailBodyModel emailBody, EmailModel email, String sqlType, String remind, HttpServletRequest request) { ToJson toJson = new ToJson();
     try {
       emailBody.setSendTime(DateFormat.getTime(DateFormat.getStrDate(new Date())));
       emailBody.setSendFlag("1");
       if (!StringUtils.checkNull(emailBody.getFromWebmail()).booleanValue())
       {
         toJson = returnSendWebEmail(emailBody, email, sqlType, request);
       }
       else {
         this.emailBodyMapper.save(emailBody);
         toJson = returnEmail(emailBody, email, remind, request);
       }
     }
     catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("errorSendEmail");
       L.e(new Object[] { "email sendEmail:" + e });
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<EmailBodyModel> saveEmail(EmailBodyModel emailBody)
   {
     ToJson toJson = new ToJson();
     try {
       emailBody.setSendTime(DateFormat.getTime(DateFormat.getStrDate(new Date())));
       emailBody.setSendFlag("0");
       if (!StringUtils.checkNull(emailBody.getFromWebmail()).booleanValue()) {
         toJson = returnSaveWebEmail(emailBody);
       } else {
         this.emailBodyMapper.save(emailBody);
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("errorSendEmail");
       L.e(new Object[] { "email saveEmail:" + e });
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> selectEmail(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
     throws Exception
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.selectObjcet(maps);
     for (EmailBodyModel emailBody : listEmai)
     {
       Map ToMap = getEmailUserName(emailBody.getToId2());
       if (!ToMap.isEmpty()) {
         emailBody.setToId2((String)ToMap.keySet().iterator().next());
         emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
       }
 
       Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
       Map secretMap = getEmailUserName(emailBody.getSecretToId());
       if (!copyMap.isEmpty()) {
         emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
       } else {
         emailBody.setCopyName("");
       }
       if (!secretMap.isEmpty()) {
         emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
         emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
       } else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
       if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
         emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
       } else {
         emailBody.setAttachmentName("");
         emailBody.setAttachmentId("");
       }
       list.add(emailBody);
     }
     tojson.setObj(list);
     tojson.setTotleNum(pageParams.getTotal());
     return tojson;
   }
 
   public void deleteByID(Integer bodyId)
   {
     this.emailBodyMapper.deleteDrafts(bodyId);
   }
 
   public ToJson<EmailBodyModel> listDrafts(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.listDrafts(maps);
 
     Map map2 = new HashedMap();
     map2.put("fromId", maps.get("fromId"));
     Map map3 = new HashedMap();
     map3.put("fromId", maps.get("fromId"));
     List inboxs = this.emailBodyMapper.selectInbox(map2);
     List outemails = this.emailBodyMapper.listSendEmail(map3);
 
     for (EmailBodyModel emailBody : listEmai) {
       emailBody.setToName(this.usersService.getUserNameById(emailBody.getToId2()));
       if (this.usersService.getUserNameById(emailBody.getCopyToId()) != null)
         emailBody.setCopyName(this.usersService.getUserNameById(emailBody.getCopyToId()));
       else {
         emailBody.setCopyName("");
       }
       if (this.usersService.getUserNameById(emailBody.getSecretToId()) != null)
         emailBody.setSecretToName(this.usersService.getUserNameById(emailBody.getSecretToId()));
       else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
       if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
         emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
       } else {
         emailBody.setAttachmentName("");
         emailBody.setAttachmentId("");
       }
 
       list.add(emailBody);
     }
     tojson.setDraftsCount(pageParams.getTotal());
     tojson.setHairboxCount(Integer.valueOf(outemails.size()));
     tojson.setInboxCount(Integer.valueOf(inboxs.size()));
     tojson.setObj(list);
     tojson.setTotleNum(pageParams.getTotal());
     return tojson;
   }
 
   public ToJson<EmailBodyModel> listSendEmail(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
     throws Exception
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
 
     Map map2 = new HashedMap();
     map2.put("fromId", maps.get("fromId"));
     Map map3 = new HashedMap();
     map3.put("fromId", maps.get("fromId"));
     List inboxs = this.emailBodyMapper.selectInbox(map2);
     List drafts = this.emailBodyMapper.listDrafts(map2);
 
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.listSendEmail(maps);
     for (EmailBodyModel emailBody : listEmai)
     {
       Map ToMap = getEmailUserName(emailBody.getToId2());
       if (ToMap.size() != 0) {
         emailBody.setToId2((String)ToMap.keySet().iterator().next());
         emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
       } else {
         emailBody.setToId2("");
         emailBody.setToName("");
       }
 
       Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
       Map secretMap = getEmailUserName(emailBody.getSecretToId());
       if (!copyMap.isEmpty()) {
         emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
       } else {
         emailBody.setCopyName("");
       }
       if (!secretMap.isEmpty()) {
         emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
         emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
       } else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
       if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
         emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
       } else {
         emailBody.setAttachmentName("");
         emailBody.setAttachmentId("");
       }
       list.add(emailBody);
     }
     tojson.setDraftsCount(Integer.valueOf(drafts.size()));
     tojson.setHairboxCount(pageParams.getTotal());
     tojson.setInboxCount(Integer.valueOf(inboxs.size()));
     tojson.setObj(list);
     tojson.setTotleNum(pageParams.getTotal());
     return tojson;
   }
 
   public ToJson<EmailBodyModel> listWastePaperbasket(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
     throws Exception
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.listWastePaperbasket(maps);
     for (EmailBodyModel emailBody : listEmai)
     {
       Map ToMap = getEmailUserName(emailBody.getToId2());
       emailBody.setToId2((String)ToMap.keySet().iterator().next());
       emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
 
       Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
       Map secretMap = getEmailUserName(emailBody.getSecretToId());
       if (!copyMap.isEmpty()) {
         emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
       } else {
         emailBody.setCopyName("");
       }
       if (!secretMap.isEmpty()) {
         emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
         emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
       } else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
       if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
         emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
       } else {
         emailBody.setAttachmentName("");
         emailBody.setAttachmentId("");
       }
       list.add(emailBody);
     }
     tojson.setObj(list);
     tojson.setTotleNum(pageParams.getTotal());
     return tojson;
   }
 
   public ToJson<EmailBodyModel> selectEmailBody(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
     throws Exception
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.listqueryEmailBody(maps);
     for (EmailBodyModel emailBody : listEmai)
     {
       Map ToMap = getEmailUserName(emailBody.getToId2());
       emailBody.setToId2((String)ToMap.keySet().iterator().next());
       emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
 
       Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
       Map secretMap = getEmailUserName(emailBody.getSecretToId());
       if (!copyMap.isEmpty()) {
         emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
       } else {
         emailBody.setCopyName("");
       }
       if (!secretMap.isEmpty()) {
         emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
         emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
       } else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
       if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
         emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
       } else {
         emailBody.setAttachmentName("");
         emailBody.setAttachmentId("");
       }
       list.add(emailBody);
     }
     tojson.setObj(list);
     tojson.setTotleNum(pageParams.getTotal());
     return tojson;
   }
 
   public EmailBodyModel queryById(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
   {
     if (maps.get("emailId") != null) {
       maps.remove("bodyId");
     }
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     EmailBodyModel emailBody = this.emailBodyMapper.queryById(maps);
 
     Map ToMap = getEmailUserName(emailBody.getToId2());
     if (!ToMap.isEmpty()) {
       emailBody.setToId2((String)ToMap.keySet().iterator().next());
       emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
     }
 
     putInfoWithFlag(emailBody, this.TO_USER_INFO, emailBody.getToId2());
 
     Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
     putInfoWithFlag(emailBody, this.COPY_USER_FINO, emailBody.getCopyToId());
 
     Map secretMap = getEmailUserName(emailBody.getSecretToId());
 
     putInfoWithFlag(emailBody, this.SERC_USER_FINO, emailBody.getSecretToId());
 
     if (!copyMap.isEmpty()) {
       emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
       emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
     } else {
       emailBody.setCopyName("");
     }
     if (!secretMap.isEmpty()) {
       emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
       emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
     } else {
       emailBody.setSecretToName("");
     }
 
     emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
     emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
     if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
       emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
     } else {
       emailBody.setAttachmentName("");
       emailBody.setAttachmentId("");
     }
     return emailBody;
   }
 
   private void putInfoWithFlag(EmailBodyModel emailBody, Integer type, String userIds) {
     if ((emailBody != null) && 
       (!StringUtils.checkNull(userIds).booleanValue())) {
       String[] temp = userIds.split(",");
       Map param = new HashMap();
       param.put("userIds", temp);
       param.put("bodyId", emailBody.getBodyId());
       List datas = this.emailMapper.selectUserReadFlag(param);
       if (type == this.TO_USER_INFO) {
         emailBody.setToUserEmailInfo(datas);
       }
       if (type == this.COPY_USER_FINO) {
         emailBody.setCopyUserEmailInfo(datas);
       }
       if (type == this.SERC_USER_FINO)
         emailBody.setSercUserEmailInfo(datas);
     }
   }
 
   public ToJson<EmailBodyModel> selectInbox(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
     throws Exception
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.selectInbox(maps);
     Map map2 = new HashedMap();
     map2.put("fromId", maps.get("fromId"));
     Map map3 = new HashedMap();
     map3.put("fromId", maps.get("fromId"));
     List drafts = this.emailBodyMapper.listDrafts(map2);
     List outemails = this.emailBodyMapper.listSendEmail(map3);
     EmailBodyModel emailBodyModel = new EmailBodyModel();
     if (drafts != null) {
       emailBodyModel.setDraftsCount(Integer.valueOf(drafts.size()));
     }
     if (outemails != null) {
       emailBodyModel.setHairboxCount(Integer.valueOf(outemails.size()));
     }
     for (EmailBodyModel emailBody : listEmai)
     {
       Map ToMap = getEmailUserName(emailBody.getToId2());
       emailBody.setToId2((String)ToMap.keySet().iterator().next());
       emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
 
       Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
       Map secretMap = getEmailUserName(emailBody.getSecretToId());
       if (!copyMap.isEmpty()) {
         emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
       } else {
         emailBody.setCopyName("");
       }
       if (!secretMap.isEmpty()) {
         emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
         emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
       } else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
       if ((!StringUtils.checkNull(emailBody.getAttachmentName()).booleanValue()) && (!StringUtils.checkNull(emailBody.getAttachmentId()).booleanValue())) {
         emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
       } else {
         emailBody.setAttachmentName("");
         emailBody.setAttachmentId("");
       }
     }
 
     tojson.setDraftsCount(Integer.valueOf(drafts.size()));
     tojson.setHairboxCount(Integer.valueOf(outemails.size()));
     tojson.setInboxCount(pageParams.getTotal());
     tojson.setObj(listEmai);
     tojson.setTotleNum(pageParams.getTotal());
     tojson.setObject(emailBodyModel);
     return tojson;
   }
 
   public ToJson<EmailBodyModel> selectIsRead(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
     throws Exception
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.selectIsRead(maps);
     for (EmailBodyModel emailBody : listEmai)
     {
       Map ToMap = getEmailUserName(emailBody.getToId2());
       emailBody.setToId2((String)ToMap.keySet().iterator().next());
       emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
 
       Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
       Map secretMap = getEmailUserName(emailBody.getSecretToId());
       if (!copyMap.isEmpty()) {
         emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
       } else {
         emailBody.setCopyName("");
       }
       if (!secretMap.isEmpty()) {
         emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
         emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
       } else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
         emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
       } else {
         emailBody.setAttachmentName("");
         emailBody.setAttachmentId("");
       }
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
       list.add(emailBody);
     }
     tojson.setObj(list);
     tojson.setTotleNum(pageParams.getTotal());
     return tojson;
   }
 
   public void updateIsRead(EmailModel email)
   {
     Map maps = new HashMap();
     maps.put("emailId", email.getEmailId());
     EmailModel email1 = this.emailMapper.queryByEmailOne(email.getEmailId());
     this.smsService.updatequerySmsByType("2", email1.getToId(), String.valueOf(email1.getEmailId()));
     this.emailMapper.updateIsRead(email);
   }
 
   public String deleteOutEmail(Integer emailId, String flag)
   {
     String returnRes = "0";
     try {
       if ((flag.trim().equals("0")) || (flag.trim().equals("")))
         this.emailBodyMapper.updateOutbox(emailId);
       else if (flag.trim().equals("3"))
         this.emailBodyMapper.updateOutboxs(emailId);
       else
         this.emailBodyMapper.deleteOutbox(emailId);
     }
     catch (Exception e)
     {
       returnRes = "1";
       L.e(new Object[] { "email deleteOutEmail:" + e });
     }
     return returnRes;
   }
 
   public String deleteInEmail(Integer emailId, String flag)
   {
     String returnRes = "0";
     try {
       if ((flag.trim().equals("0")) || (flag.trim().equals("")))
         this.emailBodyMapper.updateInbox(emailId);
       else
         this.emailBodyMapper.updateInboxs(emailId);
     }
     catch (Exception e)
     {
       returnRes = "1";
       L.e(new Object[] { "email deleteInEmail:" + e });
     }
     return returnRes;
   }
 
   @Transactional
   public String deleteRecycleEmail(Integer emailId, String flag)
   {
     String returnRes = "0";
     try {
       if (flag.trim().equals("3"))
         this.emailBodyMapper.updateRecycle(emailId);
       else
         this.emailBodyMapper.deleteRecycle(emailId);
     }
     catch (Exception e) {
       returnRes = "1";
       L.e(new Object[] { "email deleteRecycleEmail:" + e });
     }
     return returnRes;
   }
 
   public String queryByIdCss(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType, HttpServletRequest request)
   {
     Object locale = request.getSession().getAttribute("LOCALE_SESSION_ATTRIBUTE_NAME");
     String shoujianren = "收件人";
     String fajianren = "发件人";
     String chaosongren = "抄送人";
     String misongren = "密送人";
     String fasongshijian = "发送时间";
     String zhuti = "主题";
     if (locale != null)
     {
       if ("en_US".equals(locale.toString())) {
         fajianren = "The sender";
         shoujianren = "The recipient";
         chaosongren = "Cc people";
         misongren = "Close send people";
         fasongshijian = "Send time";
         zhuti = "The theme";
       } else if ("zh_tw".equals(locale.toString())) {
         fajianren = "發件人";
         shoujianren = "收件人";
         chaosongren = "抄送人";
         misongren = "密送人";
         fasongshijian = "發送時間";
         zhuti = "主題";
       }
     }
     EmailBodyModel emailBodyModel = queryById(maps, page, pageSize, useFlag, sqlType);
     StringBuffer fwReEmail = new StringBuffer();
     fwReEmail.append("&nbsp;");
     fwReEmail.append("<div style=\"margin: 5px auto; height: 0px; border-bottom-color: rgb(192, 194, 207); border-bottom-width: 1px; border-bottom-style: solid;\">&nbsp;</div>\n");
     fwReEmail.append("<div style=\"background: rgb(237, 246, 219); padding: 5px 15px; font-size: 12px; border-bottom-color: rgb(204, 204, 204); border-bottom-width: 1px; border-bottom-style: solid;\"><span style=\"line-height: 16px;\"><b><div class=\"emailInternationalization\"  style=\"float:left\">" + fajianren + "<b>&nbsp;");
     fwReEmail.append(emailBodyModel.getUsers().getUserName());
     fwReEmail.append("<>");
     fwReEmail.append("<span style=\"line-height: 16px;\"><b><div class=\"emailInternationalization\" style=\"float:left\">" + shoujianren + "<b>&nbsp;");
 
     fwReEmail.append(emailBodyModel.getToName());
     fwReEmail.append("<>");
     if (emailBodyModel.getCopyName() != "") {
       fwReEmail.append("<span style=\"line-height: 16px;\"><b><div class=\"emailInternationalization\" style=\"float:left\">" + chaosongren + "<b>&nbsp;");
       fwReEmail.append(emailBodyModel.getCopyName());
       fwReEmail.append("<>");
     }
     if (emailBodyModel.getSecretToName() != "") {
       fwReEmail.append("<span style=\"line-height: 16px;\"><b><div class=\"emailInternationalization\" style=\"float:left\">" + misongren + "<b>&nbsp;");
       fwReEmail.append(emailBodyModel.getSecretToName());
       fwReEmail.append("<>");
     }
     fwReEmail.append("<span style=\"line-height: 16px;\"><b><div class=\"emailInternationalization\" style=\"float:left\">" + fasongshijian + "<b>&nbsp;");
     fwReEmail.append(DateFormat.getStrTime(emailBodyModel.getSendTime()));
     fwReEmail.append("<>");
     fwReEmail.append("<span style=\"line-height: 16px;\"><b><div class=\"emailInternationalization\" style=\"float:left\">" + zhuti + "<b>&nbsp;");
     fwReEmail.append(emailBodyModel.getSubject());
     fwReEmail.append("<div>");
     fwReEmail.append(emailBodyModel.getContent());
     String names = fwReEmail.toString();
     System.out.println(names);
     return fwReEmail.toString();
   }
 
   @Transactional
   public ToJson<EmailBodyModel> draftsSendEmail(EmailBodyModel emailBody, EmailModel email, String sqlType, HttpServletRequest request)
   {
     ToJson toJson = new ToJson();
     try {
       emailBody.setSendTime(DateFormat.getTime(DateFormat.getStrDate(new Date())));
       if ("1".equals(emailBody.getSendFlag())) {
         if (!StringUtils.checkNull(emailBody.getFromWebmail()).booleanValue())
         {
           toJson = returnUpdateDEmail(emailBody, email, sqlType, request);
         } else {
           this.emailBodyMapper.update(emailBody);
           toJson = returnEmail(emailBody, email, "2", request);
         }
 
       }
       else if (!StringUtils.checkNull(emailBody.getFromWebmail()).booleanValue()) {
         emailBody.setWebmailFlag("0");
         toJson = returnUpdateD(emailBody);
       } else {
         this.emailBodyMapper.update(emailBody);
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     }
     catch (Exception e) {
       e.printStackTrace();
       toJson.setFlag(1);
       toJson.setMsg("errorSendEmail");
       L.e(new Object[] { "email draftsSendEmail:" + e });
     }
     return toJson;
   }
 
   public List<EmailModel> returnEmail(List<EmailModel> listEmail)
   {
     List list = new ArrayList();
     for (EmailModel emailModel : listEmail) {
       Map returnEmailMap = getEmailUserName(emailModel.getToId());
       if (!returnEmailMap.isEmpty()) {
         emailModel.setToId((String)returnEmailMap.keySet().iterator().next());
 
         emailModel.setToName((String)returnEmailMap.get(emailModel.getToId()));
       }
       list.add(emailModel);
     }
     return list;
   }
 
   @Transactional
   public ToJson<EmailBoxModel> saveEmailBox(EmailBoxModel emailBoxModel)
   {
     ToJson toJson = new ToJson();
     try {
       Integer name = this.emailBoxMapper.selectNameCount(emailBoxModel.getBoxName(), emailBoxModel.getUserId());
       Integer boxId = this.emailBoxMapper.selectBoxIdCount(emailBoxModel.getBoxNo(), emailBoxModel.getUserId());
       if ((name.intValue() == 0) && (boxId.intValue() == 0)) {
         this.emailBoxMapper.save(returnBoxModel(emailBoxModel));
         toJson.setFlag(0);
         toJson.setMsg("ok");
       } else {
         toJson.setFlag(1);
         toJson.setMsg("repeat");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "email saveEmailBox:" + e });
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<EmailModel> updateEmailBox(EmailModel emailModel)
   {
     ToJson toJson = new ToJson();
     try {
       this.emailMapper.updateEmailBox(emailModel);
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "email updateEmailBox:" + e });
     }
     return toJson;
   }
 
   public ToJson<EmailBoxModel> showEmailBox(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     List list = this.emailBoxMapper.selectObjcet(maps);
     int len = list.size();
     if (len < 0) {
       toJson.setFlag(1);
       toJson.setMsg("error");
     } else {
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObj(list);
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> selectBoxEmail(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.selectBoxEmail(maps);
     Integer len = Integer.valueOf(listEmai.size());
     if (len.intValue() > 0) {
       for (EmailBodyModel emailBody : listEmai)
       {
         Map ToMap = getEmailUserName(emailBody.getToId2());
         emailBody.setToId2((String)ToMap.keySet().iterator().next());
         emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
 
         Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
         Map secretMap = getEmailUserName(emailBody.getSecretToId());
         if (!copyMap.isEmpty()) {
           emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
           emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
         } else {
           emailBody.setCopyName("");
         }
         if (!secretMap.isEmpty()) {
           emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
           emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
         } else {
           emailBody.setSecretToName("");
         }
         emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
         emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
         if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
           emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
         } else {
           emailBody.setAttachmentName("");
           emailBody.setAttachmentId("");
         }
         list.add(emailBody);
       }
       tojson.setFlag(0);
       tojson.setMsg("ok");
       tojson.setObj(list);
       tojson.setTotleNum(pageParams.getTotal());
     } else {
       tojson.setFlag(1);
       tojson.setMsg("error");
     }
     return tojson;
   }
 
   public ToJson<EmailBodyModel> deleteBoxEmail(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
 
     boolean flags = true;
     List list = this.emailBodyMapper.selectIsBoxEmail(maps);
     int len = list.size();
     System.out.println(len);
     if (len > 0)
       flags = false;
     else {
       try
       {
         this.emailBoxMapper.deleteBox((Integer)maps.get("boxId"));
       } catch (Exception e) {
         flags = false;
       }
     }
     if (flags) {
       tojson.setFlag(0);
       tojson.setMsg("ok");
     } else {
       tojson.setFlag(1);
       tojson.setMsg("error");
     }
     return tojson;
   }
 
   @Transactional
   public ToJson<EmailBoxModel> updeateEmailBoxName(EmailBoxModel emailBoxModel)
   {
     ToJson toJson = new ToJson();
     try
     {
       Integer box = this.emailBoxMapper.selectBoxUpdate(emailBoxModel.getBoxNo(), emailBoxModel.getBoxName(), emailBoxModel.getUserId());
       if (box.intValue() == 0) {
         this.emailBoxMapper.update(emailBoxModel);
         toJson.setFlag(0);
         toJson.setMsg("ok");
       } else {
         toJson.setFlag(1);
         toJson.setMsg("repeat");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "email updeateEmailBoxName:" + e });
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> selectInboxIsRead(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.selectInboxIsRead(maps);
     for (EmailBodyModel emailBody : listEmai)
     {
       Map ToMap = getEmailUserName(emailBody.getToId2());
       emailBody.setToId2((String)ToMap.keySet().iterator().next());
       emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
 
       Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
       Map secretMap = getEmailUserName(emailBody.getSecretToId());
       if (!copyMap.isEmpty()) {
         emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
       } else {
         emailBody.setCopyName("");
       }
       if (!secretMap.isEmpty()) {
         emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
         emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
       } else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
         emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
       } else {
         emailBody.setAttachmentName("");
         emailBody.setAttachmentId("");
       }
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
       list.add(emailBody);
     }
     tojson.setObj(list);
     tojson.setTotleNum(pageParams.getTotal());
     return tojson;
   }
 
   public ToJson<EmailBodyModel> selectInboxIsReadList(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType)
   {
     ToJson tojson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     List list = new ArrayList();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.selectInboxIsRead(maps);
     for (EmailBodyModel emailBody : listEmai)
     {
       Map ToMap = getEmailUserName(emailBody.getToId2());
       emailBody.setToId2((String)ToMap.keySet().iterator().next());
       emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
 
       Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
       Map secretMap = getEmailUserName(emailBody.getSecretToId());
       if (!copyMap.isEmpty()) {
         emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
       } else {
         emailBody.setCopyName("");
       }
       if (!secretMap.isEmpty()) {
         emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
         emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
       } else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       if ((emailBody.getAttachmentName() != null) && (emailBody.getAttachmentId() != null)) {
         emailBody.setAttachment(GetAttachmentListUtil.returnAttachment(emailBody.getAttachmentName(), emailBody.getAttachmentId(), sqlType, "email"));
       } else {
         emailBody.setAttachmentName("");
         emailBody.setAttachmentId("");
       }
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
       list.add(emailBody);
     }
     tojson.setObj(list);
     tojson.setTotleNum(pageParams.getTotal());
     return tojson;
   }
 
   public EmailBoxModel returnBoxModel(EmailBoxModel emailBoxModel) {
     if (StringUtils.checkNull(emailBoxModel.getDefaultCount()).booleanValue()) {
       emailBoxModel.setDefaultCount("");
     }
     return emailBoxModel;
   }
 
   @Transactional
   public ToJson<Webmail> saveWebMail(Webmail webmail)
   {
     ToJson toJson = new ToJson();
     try {
       this.webmailMapper.save(webmail);
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "email saveWebMail:" + e });
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<Webmail> updateWebMail(Webmail webmail)
   {
     ToJson toJson = new ToJson();
     try {
       this.webmailMapper.update(webmail);
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<Webmail> deleteWebMail(Integer mailId)
   {
     ToJson toJson = new ToJson();
     try {
       this.webmailMapper.deleteWebMail(mailId);
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> returnUpdateD(EmailBodyModel emailBodyModel)
   {
     ToJson toJson = new ToJson();
     try {
       Webmail webmails = this.webmailMapper.selectWebMail(emailBodyModel.getFromWebmail());
       if (webmails != null) {
         emailBodyModel.setWebmailFlag("0");
         emailBodyModel.setFromWebmailId(webmails.getMailId());
         this.emailBodyMapper.update(emailBodyModel);
         toJson.setFlag(0);
         toJson.setMsg("ok");
       } else {
         toJson.setFlag(1);
         toJson.setMsg("error");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "email returnSendWebEmail:" + e });
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> returnSendWebEmail(EmailBodyModel emailBodyModel, EmailModel email, String sqlType, HttpServletRequest request)
   {
     ToJson toJson = new ToJson();
     try
     {
       Webmail webmails = this.webmailMapper.selectWebMail(emailBodyModel.getFromWebmail());
       if (webmails != null)
       {
         boolean flag;
         if (!StringUtils.checkNull(emailBodyModel.getAttachmentName()).booleanValue())
         {
           List attachment = GetAttachmentListUtil.returnAttachment(emailBodyModel.getAttachmentName(), emailBodyModel.getAttachmentId(), sqlType, "email");
           String[] files = returnFiles(attachment, sqlType);
           flag = EmailUtil.sendWEmail(webmails, emailBodyModel, files);
         } else {
           flag = EmailUtil.sendWEmail(webmails, emailBodyModel, new String[0]);
         }
         if (flag) {
           emailBodyModel.setWebmailFlag("2");
           emailBodyModel.setFromWebmailId(webmails.getMailId());
           this.emailBodyMapper.save(emailBodyModel);
           toJson = returnEmail(emailBodyModel, email, "2", request);
           String toWebId = emailBodyModel.getToWebmail().trim() + emailBodyModel.getSecretToWebmail().trim() + emailBodyModel.getCopyToWebmail().trim();
 
           if (!StringUtils.checkNull(toWebId).booleanValue()) {
             email.setToId("__WEBMAIL__" + emailBodyModel.getBodyId());
             email.setBoxId(Integer.valueOf(0));
             email.setBodyId(emailBodyModel.getBodyId());
             this.emailMapper.save(email);
           }
           if (toJson.getMsg().equals("error")) {
             toJson.setFlag(0);
             toJson.setMsg("ok_w");
           }
         } else {
           emailBodyModel.setWebmailFlag("3");
           emailBodyModel.setFromWebmailId(webmails.getMailId());
           this.emailBodyMapper.save(emailBodyModel);
           toJson = returnEmail(emailBodyModel, email, "2", request);
           if (toJson.isFlag()) {
             toJson.setFlag(1);
             toJson.setMsg("error_ws");
           }
         }
       } else {
         toJson.setFlag(1);
         toJson.setMsg("error_w");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "email returnSendWebEmail:" + e });
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> returnUpdateDEmail(EmailBodyModel emailBodyModel, EmailModel email, String sqlType, HttpServletRequest request)
   {
     ToJson toJson = new ToJson();
     try {
       toJson = returnEmail(emailBodyModel, email, "2", request);
       Webmail webmails = this.webmailMapper.selectWebMail(emailBodyModel.getFromWebmail());
       if (webmails != null)
       {
         boolean flag;
         if (!StringUtils.checkNull(emailBodyModel.getAttachmentName()).booleanValue())
         {
           List attachment = GetAttachmentListUtil.returnAttachment(emailBodyModel.getAttachmentName(), emailBodyModel.getAttachmentId(), sqlType, "email");
           String[] files = returnFiles(attachment, sqlType);
           flag = EmailUtil.sendWEmail(webmails, emailBodyModel, files);
         } else {
           flag = EmailUtil.sendWEmail(webmails, emailBodyModel, new String[0]);
         }
         if (flag) {
           emailBodyModel.setWebmailFlag("2");
           emailBodyModel.setFromWebmailId(webmails.getMailId());
           this.emailBodyMapper.update(emailBodyModel);
           toJson = returnEmail(emailBodyModel, email, "2", request);
           String toWebId = emailBodyModel.getToWebmail().trim() + emailBodyModel.getSecretToWebmail().trim() + emailBodyModel.getCopyToWebmail().trim();
 
           if (!StringUtils.checkNull(toWebId).booleanValue()) {
             email.setToId("__WEBMAIL__" + emailBodyModel.getBodyId());
             email.setBoxId(Integer.valueOf(0));
             email.setBodyId(emailBodyModel.getBodyId());
             this.emailMapper.save(email);
           }
           if (toJson.getMsg().equals("error")) {
             toJson.setFlag(0);
             toJson.setMsg("ok_w");
           }
         } else {
           emailBodyModel.setWebmailFlag("3");
           emailBodyModel.setFromWebmailId(webmails.getMailId());
           this.emailBodyMapper.update(emailBodyModel);
           toJson = returnEmail(emailBodyModel, email, "2", request);
           toJson = returnEmail(emailBodyModel, email, "2", request);
         }
       } else {
         toJson.setFlag(1);
         toJson.setMsg("error");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "email returnUpdateDEmail:" + e });
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> returnSaveWebEmail(EmailBodyModel emailBodyModel)
   {
     ToJson toJson = new ToJson();
     try {
       Webmail webmails = this.webmailMapper.selectWebMail(emailBodyModel.getFromWebmail());
       if (webmails != null) {
         emailBodyModel.setWebmailFlag("0");
         emailBodyModel.setFromWebmailId(webmails.getMailId());
         this.emailBodyMapper.save(emailBodyModel);
         toJson.setFlag(0);
         toJson.setMsg("ok");
       } else {
         toJson.setFlag(1);
         toJson.setMsg("error");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "email returnSendWebEmail:" + e });
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> returnEmail(EmailBodyModel emailBody, EmailModel email, String remind, HttpServletRequest request)
   {
     ToJson toJson = new ToJson();
     try {
       String toID = emailBody.getCopyToId().trim() + emailBody.getToId2().trim() + emailBody.getSecretToId().trim();
 
       String toId = emailBody.getToId2().trim();
       String copyId = emailBody.getCopyToId().trim();
       String secrteId = emailBody.getSecretToId().trim();
       Set<String> toIdSet = new HashSet();
 
       if (!StringUtils.checkNull(toID).booleanValue()) {
         String[] toID2 = toID.split(",");
         int i = 0; for (int len = toID2.length; i < len; i++) {
           toIdSet.add(toID2[i]);
         }
         for (String string : toIdSet) {
           email.setToId(string);
           email.setBoxId(Integer.valueOf(0));
           email.setBodyId(emailBody.getBodyId());
           this.emailMapper.save(email);
           addAffairs(emailBody, email.getEmailId(), email.getToId(), request);
         }
         if (("0".equals(emailBody.getSmsDefault())) && (!"".equals(emailBody.getSubject()))) {
           Sms2Priv sms2Priv = new Sms2Priv();
           sms2Priv.setUserId(toID);
           StringBuffer contextString = new StringBuffer(emailBody.getSubject());
           this.sms2PrivService.selSenderMobile(emailBody.getSmsDefault(), sms2Priv, contextString, request);
         }
         toJson.setFlag(0);
         toJson.setMsg("ok");
       } else {
         toJson.setFlag(1);
         toJson.setMsg("error");
       }
     }
     catch (Exception e)
     {
       e.printStackTrace();
       toJson.setFlag(1);
       toJson.setMsg("error");
       L.e(new Object[] { "email returnEmail:" + e });
     }
     return toJson;
   }
 
   public Map<String, String> getEmailUserName(String userIds)
   {
     if (StringUtils.checkNull(userIds).booleanValue()) {
       return new HashMap();
     }
     Map maps = new HashMap();
 
     StringBuffer sb = new StringBuffer();
 
     StringBuffer sName = new StringBuffer();
     String[] temp = userIds.split(",");
     for (int i = 0; i < temp.length; i++) {
       if (!StringUtils.checkNull(temp[i]).booleanValue()) {
         String userName = this.usersMapper.getUsernameByUserId(temp[i]);
         if (!StringUtils.checkNull(userName).booleanValue()) {
           if (i < temp.length - 1) {
             sb.append(userName).append(",");
             sName.append(temp[i]).append(",");
           } else {
             sb.append(userName);
             sName.append(temp[i]);
           }
         }
       }
     }
     maps.put(sName.toString(), sb.toString());
     return maps;
   }
 
   public ToJson<Webmail> selectUserWebMail(String userId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       toJson.setObj(this.webmailMapper.selectUserWebMail(userId));
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       L.e(new Object[] { "EmailServiceImpl selectUserWebMail:" + e });
     }
     return toJson;
   }
 
   public String[] returnFiles(List<Attachment> list, String sqlType)
   {
     String[] files = new String[0];
 
     ResourceBundle rb = ResourceBundle.getBundle("upload");
     String osName = System.getProperty("os.name");
     StringBuffer stringBuffer = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       stringBuffer = stringBuffer.append(rb.getString("upload.win"));
     else {
       stringBuffer = stringBuffer.append(rb.getString("upload.linux"));
     }
 
     stringBuffer.append(System.getProperty("file.separator"));
     stringBuffer.append("attach");
     stringBuffer.append(System.getProperty("file.separator"));
     stringBuffer.append(sqlType);
     stringBuffer.append(System.getProperty("file.separator"));
     int i = 0; for (int len = list.size(); i < len; i++) {
       StringBuffer sb = new StringBuffer(stringBuffer.toString());
       sb.append(((Attachment)list.get(i)).getModule());
       sb.append(System.getProperty("file.separator"));
       sb.append(((Attachment)list.get(i)).getYm());
       sb.append(System.getProperty("file.separator"));
       sb.append(((Attachment)list.get(i)).getAttachId());
       sb.append(".");
       sb.append(((Attachment)list.get(i)).getAttachName());
       files[i] = sb.toString();
     }
     return files;
   }
 
   @Transactional(readOnly=true)
   public ToJson<Webmail> selectOneWebMail(String userId, Integer mailId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       toJson.setObject(this.webmailMapper.selectOneWebMail(userId, mailId));
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } catch (Exception e) {
       L.e(new Object[] { "EmailServiceImpl selectOneWebMail:" + e });
     }
     return toJson;
   }
 
   public BaseWrappers getEmailReadDetail(Integer bodyId, String userIds)
   {
     BaseWrappers baseWrappers = new BaseWrappers();
     if (!StringUtils.checkNull(userIds).booleanValue()) {
       String[] temp = userIds.split(",");
       Map param = new HashMap();
       param.put("userIds", temp);
       param.put("bodyId", bodyId);
       List datas = this.emailMapper.selectUserReadFlag(param);
       baseWrappers.setFlag(true);
       baseWrappers.setDatas(datas);
     } else {
       baseWrappers.setFlag(false);
       baseWrappers.setDatas(null);
       baseWrappers.setMsg("用户ID为空");
     }
     return baseWrappers;
   }
 
   public ToJson<EmailBodyModel> selectCount(HttpServletRequest request, String sendTime, Integer toId)
   {
     ToJson toJson = new ToJson(1, "error");
     Map map = new HashMap();
     map.put("sendTime", sendTime);
     map.put("toId", toId);
     List list = this.emailBodyMapper.selectCount(map);
     try
     {
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("数据获取成功");
         toJson.setFlag(0);
       }
     } catch (Exception e1) {
       e1.printStackTrace();
       toJson.setMsg(e1.getMessage());
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> selectListByMoths(HttpServletRequest request, String sendTime)
   {
     String year = request.getParameter("year");
     String userId = request.getParameter("userId");
     ToJson toJson = new ToJson(1, "error");
     try {
       List<EmailBodyModel> list = this.emailBodyMapper.selectListByMoths(sendTime, year, userId);
       for (EmailBodyModel em : list) {
         if (!StringUtils.checkNull(String.valueOf(em.getSendTime())).booleanValue()) {
           em.setSendTimes(DateFormat.getDate(DateFormat.getDateStrTime(em.getSendTime())));
         }
 
         List attachmentList = new ArrayList();
         if ((em.getAttachmentName() != null) && (!"".equals(em.getAttachmentName()))) {
           attachmentList = GetAttachmentListUtil.returnAttachment(em.getAttachmentName(), em.getAttachmentId(), Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), "email");
         }
         em.setAttachmentList(attachmentList);
       }
 
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("详情列表获取成功");
         toJson.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<EmailBodyModel> selectDetailById(HttpServletRequest request, Integer bodyId)
   {
     ToJson toJson = new ToJson(1, "error");
     Map maps = new HashMap();
     maps.put("bodyId", bodyId);
     try {
       EmailBodyModel emailBodyModel = this.emailBodyMapper.queryByBodyId(maps);
       emailBodyModel.setSendTimes(DateFormat.getDate(DateFormat.getDateStrTime(emailBodyModel.getSendTime())));
 
       Map ToMap = getEmailUserName(emailBodyModel.getToId2());
       if (!ToMap.isEmpty()) {
         emailBodyModel.setToId2((String)ToMap.keySet().iterator().next());
         emailBodyModel.setToName((String)ToMap.get(emailBodyModel.getToId2()));
       }
 
       Map copyMap = getEmailUserName(emailBodyModel.getCopyToId());
 
       if (!copyMap.isEmpty()) {
         emailBodyModel.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBodyModel.setCopyName((String)copyMap.get(emailBodyModel.getCopyToId()));
       } else {
         emailBodyModel.setCopyName("");
       }
 
       List attachmentList = new ArrayList();
       if ((emailBodyModel.getAttachmentName() != null) && (!"".equals(emailBodyModel.getAttachmentName()))) {
         attachmentList = GetAttachmentListUtil.returnAttachment(emailBodyModel.getAttachmentName(), emailBodyModel.getAttachmentId(), Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), "emailCount");
       }
       emailBodyModel.setAttachmentList(attachmentList);
       if (emailBodyModel != null) {
         toJson.setObject(emailBodyModel);
         toJson.setMsg("详情信息获取成功");
         toJson.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<EmailModel> updateEmailWithdraw(Integer bodyId)
   {
     ToJson json = new ToJson();
     try {
       Map map = new HashMap();
       map.put("bodyId", bodyId);
       List<EmailModel> emailModels = this.emailMapper.selectByBodyId(map);
       List toIds = new ArrayList();
       if ((emailModels != null) && (emailModels.size() > 0))
       {
         for (EmailModel emailModel : emailModels)
         {
           if (emailModel.getReadFlag().equals("0")) {
             toIds.add(emailModel.getToId());
           }
         }
 
         if (toIds.size() > 0) {
           map.put("userIds", toIds);
           this.emailMapper.updateEmailWithdraw(map);
         }
       }
       json.setObj(emailModels);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   @Async
   public void addAffairs(EmailBodyModel emailBodyModel,final Integer emailId,final String todoId, HttpServletRequest request)
   {
     final String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
     final String userName = ((Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users())).getUserName();
     final EmailBodyModel emailBodyModelf = emailBodyModel;
     this.threadPoolTaskExecutor.execute(new Runnable()
     {
       public void run() {
         ContextHolder.setConsumerType(Constant.MYOA + sqlType);
         SmsBody smsBody = new SmsBody();
         smsBody.setFromId(emailBodyModelf.getFromId());
         smsBody.setContent("请查收我的邮件！主题：" + emailBodyModelf.getSubject());
         smsBody.setSendTime(emailBodyModelf.getSendTime());
         SysCode sysCode = new SysCode();
         sysCode.setCodeName("电子邮件");
         sysCode.setParentNo("SMS_REMIND");
         if (EmailServiceImpl.this.sysCodeMapper.getCodeNoByNameAndParentNo(sysCode) != null) {
           smsBody.setSmsType(EmailServiceImpl.this.sysCodeMapper.getCodeNoByNameAndParentNo(sysCode).getCodeNo());
         }
         if ((!StringUtils.checkNull(emailBodyModelf.getAttachmentId()).booleanValue()) && (!StringUtils.checkNull(emailBodyModelf.getAttachmentName()).booleanValue())) {
           smsBody.setIsAttach("1");
         }
         smsBody.setRemindUrl("email/details?id=" + emailId);
         String title = userName + "：请查收我的邮件！";
         String context = "主题:" + emailBodyModelf.getSubject();
         EmailServiceImpl.this.smsService.saveSms(smsBody, todoId, "1", "1", title, context, sqlType);
       }
     });
   }
 
   public ToJson<EmailBodyModel> queryEmailBySubject(String trim)
   {
     ToJson tojson = new ToJson();
     List<EmailBodyModel> listEmai = this.emailBodyMapper.queryEmailBySubject(trim);
 
     EmailBodyModel emailBodyModel = new EmailBodyModel();
 
     for (EmailBodyModel emailBody : listEmai)
     {
       Map ToMap = getEmailUserName(emailBody.getToId2());
       emailBody.setToId2((String)ToMap.keySet().iterator().next());
       emailBody.setToName((String)ToMap.get(emailBody.getToId2()));
 
       Map copyMap = getEmailUserName(emailBody.getCopyToId());
 
       Map secretMap = getEmailUserName(emailBody.getSecretToId());
       if (!copyMap.isEmpty()) {
         emailBody.setCopyToId((String)copyMap.keySet().iterator().next());
         emailBody.setCopyName((String)copyMap.get(emailBody.getCopyToId()));
       } else {
         emailBody.setCopyName("");
       }
       if (!secretMap.isEmpty()) {
         emailBody.setSecretToId((String)secretMap.keySet().iterator().next());
         emailBody.setSecretToName((String)secretMap.get(emailBody.getSecretToId()));
       } else {
         emailBody.setSecretToName("");
       }
       emailBody.setEmailList(returnEmail(emailBody.getEmailList()));
       emailBody.setProbablyDate(DateFormat.getProbablyDate(emailBody.getSendTime()));
     }
 
     tojson.setObj(listEmai);
     tojson.setObject(emailBodyModel);
     return tojson;
   }
 }

