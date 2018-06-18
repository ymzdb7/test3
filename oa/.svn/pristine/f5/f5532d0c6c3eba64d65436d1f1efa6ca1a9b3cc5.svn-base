 package com.myoa.service.todoList.impl;
 
 import com.myoa.dao.document.DocumentModelMapper;
import com.myoa.dao.edu.voteTitle.VoteTitleMapper;
import com.myoa.dao.menu.SysFunctionMapper;
import com.myoa.dao.sms.SmsBodyMapper;
import com.myoa.dao.sms.SmsMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.daiban.DaiBanModel;
import com.myoa.model.daiban.Daiban;
import com.myoa.model.daiban.TodoList;
import com.myoa.model.daiban.TodoListModel;
import com.myoa.model.document.DocumentModelFlowRunPrcs;
import com.myoa.model.document.DocumentModelWithBLOBs;
import com.myoa.model.edu.voteTitle.VoteTitle;
import com.myoa.model.email.EmailBodyModel;
import com.myoa.model.email.EmailModel;
import com.myoa.model.menu.SysFunction;
import com.myoa.model.notify.Notify;
import com.myoa.model.sms.SmsBodyExtend;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.model.worldnews.News;
import com.myoa.service.email.EmailService;
import com.myoa.service.notify.NotifyService;
import com.myoa.service.syspara.SysParaService;
import com.myoa.service.todoList.TodolistService;
import com.myoa.service.users.UserFunctionService;
import com.myoa.service.users.UsersService;
import com.myoa.service.workflow.flowtype.FlowRunPrcsService;
import com.myoa.service.workflow.flowtype.FlowRunService;
import com.myoa.service.worldnews.NewService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.page.PageParams;

 import java.net.Inet4Address;
 import java.net.InetAddress;
 import java.net.NetworkInterface;
 import java.net.SocketException;
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.Enumeration;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class TodolistImpl
   implements TodolistService
 {
 
   @Resource
   private EmailService emailService;
 
   @Resource
   private NotifyService notifyService;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private SysFunctionMapper sysFunctionMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private VoteTitleMapper voteTitleMapper;
 
   @Resource
   private FlowRunPrcsService flowRunPrcsService;
 
   @Resource
   private FlowRunService flowRunService;
 
   @Resource
   private NewService newService;
 
   @Resource
   DocumentModelMapper documentModelMapper;
 
   @Resource
   SmsMapper smsMapper;
 
   @Resource
   SmsBodyMapper smsBodyMapper;
 
   @Resource
   SysParaService sysParaService;
 
   @Resource
   UserFunctionService userFunctionService;
   private static final String EMAIL = "email";
   private static final String NOTIFY = "notify";
   private static final String NEWS = "news";
   private static final String WORKFLOW = "willdo";
   private static final String DOCTMENT = "doctment";
   private static final String TOPIAO = "toupiao";
   private static final int VOTELTEM_ID = 11;
   private static final int EMAIL_ID = 2;
   private static final int NOTIFY_ID = 1;
   private static final int FLOWRUNPRCS_ID = 7;
   private static final int NEWS_ID = 14;
   private static final int DOCTMENT_ID = 70;
 
   public Daiban list(String userId, String sqlType, HttpServletRequest request)
     throws Exception
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Map maps = new HashMap();
     maps.put("fromId", userId);
     Users usersByuserId = this.usersMapper.findUsersByuserId(userId);
     String userId1 = users.getUserId();
     Integer userPriv = users.getUserPriv();
     Integer deptId = users.getDeptId();
     if (usersByuserId != null) {
       userId1 = usersByuserId.getUserId();
       userPriv = usersByuserId.getUserPriv();
       deptId = usersByuserId.getDeptId();
     }
     maps.put("userId", userId1);
     maps.put("name", userId);
     maps.put("userPriv", userPriv);
     maps.put("deptId", deptId);
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(true));
     pageParams.setPage(Integer.valueOf(1));
     pageParams.setPageSize(Integer.valueOf(10));
     maps.put("page", pageParams);
     List list = new ArrayList();
     List list1 = new ArrayList();
     List list2 = new ArrayList();
     List list3 = new ArrayList();
     List list5 = new ArrayList();
     List list6 = new ArrayList();
     Daiban db = new Daiban();
     Integer total = Integer.valueOf(0);
     InetAddress address = getCurrentIp();
     ToJson tojson = this.emailService.selectInboxIsRead(maps, Integer.valueOf(1), Integer.valueOf(10), false, sqlType);
     List<EmailBodyModel> le = tojson.getObj();
     SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     if ((le != null) && (le.size() > 0)) {
       for (EmailBodyModel em : le)
       {
         String userId2 = em.getFromId();
         Users u = this.usersService.findUsersByuserId(userId2);
         TodoList td = new TodoList();
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(em.getContent());
         td.setFromName(em.getSubject());
         td.setImg("workflow/youjian.png");
         List<EmailModel> lemail = em.getEmailList();
         for (EmailModel e : lemail) {
           if (e.getToId().equals(userId)) {
             td.setQid(e.getEmailId());
             td.setDeleteFlag(e.getDeleteFlag());
           }
         }
         td.setReadflag(em.getSendFlag());
         td.setType("email");
         Long e = Long.valueOf(em.getSendTime().intValue() * 1000L);
         String s = f.format(e);
         td.setTime(s);
         td.setUserName(em.getUsers().getUserName());
         td.setIsAttach(em.getAttachmentId() == "" ? "0" : "1");
         td.setFromId(em.getFromId());
         td.setFromUid(u.getUid());
         list.add(td);
       }
     }
 
     ToJson ln = this.notifyService.unreadNotify(maps, Integer.valueOf(1), Integer.valueOf(10), false, userId, sqlType);
     List<Notify> l = ln.getObj();
     if ((l != null) && (l.size() > 0)) {
       for (Notify no : l) {
         TodoList td = new TodoList();
         String userId2 = no.getFromId();
         Users u = this.usersService.findUsersByuserId(userId2);
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(no.getContent());
         td.setFromName(no.getSubject());
         td.setImg("workflow/notify.png");
         td.setQid(no.getNotifyId());
         td.setReadflag(no.getPublish());
         String notifyType = no.getFormat();
         td.setType("notify");
 
         String s = f.format(no.getSendTime());
         td.setTime(s);
         td.setDeleteFlag("");
         td.setUserName(no.getUsers().getUserName());
         td.setIsAttach(no.getAttachmentId() == "" ? "0" : "1");
         td.setFromId(no.getFromId());
         td.setFromUid(u.getUid());
         list1.add(td);
       }
     }
     ToJson news = this.newService.unreadNews(maps, Integer.valueOf(1), Integer.valueOf(10), false, userId, sqlType);
 
     List<News> newsList = news.getObj();
     if ((newsList != null) && (newsList.size() > 0)) {
       for (News newsOne : newsList) {
         TodoList td = new TodoList();
         String userId2 = newsOne.getProvider();
         Users u = this.usersService.findUsersByuserId(userId2);
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(newsOne.getContent());
         td.setFromName(newsOne.getSubject());
         td.setImg("workflow/news.png");
         td.setQid(newsOne.getNewsId());
         td.setReadflag(newsOne.getPublish());
         String notifyType = newsOne.getFormat();
         td.setType("news");
 
         String s = f.format(newsOne.getNewsTime());
         td.setTime(s);
         td.setDeleteFlag("");
         td.setUserName(newsOne.getUsers().getUserName());
         td.setIsAttach(newsOne.getAttachmentId() == "" ? "0" : "1");
         td.setFromId(newsOne.getProvider());
         td.setFromUid(u.getUid());
         list3.add(td);
       }
     }
 
     ToJson toJson = this.flowRunPrcsService.selectObject(maps, Integer.valueOf(1), Integer.valueOf(10), false);
     List<FlowRunPrcs> listFlowRunPrcs = toJson.getObj();
     if ((listFlowRunPrcs != null) && (listFlowRunPrcs.size() > 0)) {
       for (FlowRunPrcs flowRunPrcs : listFlowRunPrcs) {
         FlowRun flowRun = this.flowRunService.find(flowRunPrcs.getRunId());
         TodoList td = new TodoList();
         String userId2 = flowRunPrcs.getUserId();
         Users u = this.usersService.findUsersByuserId(userId2);
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(request.getScheme() + ":" + request.getServerName() + ":" + request.getServerPort() + "work/workform?flowId=" + flowRun.getFlowId() + "&flowStep=" + flowRunPrcs.getPrcsId() + "&runId=" + flowRunPrcs.getRunId() + "&prcsId=" + flowRunPrcs.getFlowPrcs() + "");
 
         td.setFromName(flowRun.getRunName());
         td.setImg("workflow/daibanliucheng.png");
         td.setQid(flowRunPrcs.getId());
         td.setReadflag(flowRunPrcs.getPrcsFlag());
         td.setType("willdo");
         td.setRunId(flowRunPrcs.getRunId());
         td.setFlowId(Integer.valueOf(flowRun.getFlowId()));
 
         td.setTime(flowRunPrcs.getCreateTime().substring(0, flowRunPrcs.getPrcsTime().length() - 2));
         td.setDeleteFlag("");
         td.setUserName(u.getUserName());
         td.setIsAttach("0");
         td.setFromId(u.getUserId());
         td.setFromUid(u.getUid());
         list2.add(td);
       }
     }
     Map param = new HashMap();
     param.put("documentType", Integer.valueOf(0));
     param.put("page", Integer.valueOf(0));
     param.put("pageSize", Integer.valueOf(5));
     param.put("userId", users.getUserId());
     param.put("prcsFlag", Integer.valueOf(1));
 
     List<DocumentModelFlowRunPrcs> datas = this.documentModelMapper.selWillDocSendOrReceive(param);
     if ((datas != null) && (datas.size() > 0)) {
       for (DocumentModelFlowRunPrcs documentModelOverRun : datas) {
         TodoList td = new TodoList();
         String userId2 = documentModelOverRun.getCreater();
         Users u = this.usersService.findUsersByuserId(userId2);
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(request.getScheme() + ":" + request.getServerName() + ":" + request.getServerPort() + "work/workform?flowId=" + documentModelOverRun.getFlowId() + "&flowStep=" + documentModelOverRun.getRealPrcsId() + "&runId=" + documentModelOverRun.getRunId() + "&prcsId=" + documentModelOverRun.getStep() + "");
 
         td.setFromName(documentModelOverRun.getTitle() == null ? "" : documentModelOverRun.getTitle());
         td.setQid(documentModelOverRun.getId());
         td.setReadflag(documentModelOverRun.getRealPrcsId().toString());
         td.setType("doctment");
         td.setImg("workflow/doctment.png");
         td.setRunId(documentModelOverRun.getRunId());
         td.setFlowId(documentModelOverRun.getFlowId());
         td.setTime(documentModelOverRun.getCreateTime().substring(0, documentModelOverRun.getCreateTime().length() - 2));
         td.setDeleteFlag("");
         td.setUserName(u.getUserName());
         td.setIsAttach("0");
         td.setFromId(u.getUserId());
         td.setFromUid(u.getUid());
         list5.add(td);
       }
     }
     list6 = touPiaoDaiBanTongJi(request, users);
     db.setTotal(total);
     db.setEmail(list);
     db.setNotify(list1);
     db.setWorkFlow(list2);
     db.setNewsList(list3);
     db.setDocumentList(list5);
     db.setToupiao(list6);
     return db;
   }
 
   public Daiban readList(String userId, String sqlType, HttpServletRequest request)
     throws Exception
   {
     Map maps = new HashMap();
     maps.put("fromId", userId);
     Users usersByuserId = this.usersMapper.findUsersByuserId(userId);
     maps.put("userId", usersByuserId.getUserId());
     maps.put("name", userId);
     maps.put("userPriv", usersByuserId.getUserPriv());
     maps.put("deptId", usersByuserId.getDeptId());
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(true));
     pageParams.setPage(Integer.valueOf(1));
     pageParams.setPageSize(Integer.valueOf(10));
     maps.put("page", pageParams);
     List list = new ArrayList();
     List list1 = new ArrayList();
     List list2 = new ArrayList();
     List list3 = new ArrayList();
     Daiban db = new Daiban();
     InetAddress address = getCurrentIp();
     ToJson tojson = this.emailService.selectInboxIsReadList(maps, Integer.valueOf(1), Integer.valueOf(10), false, sqlType);
     List<EmailBodyModel> le = tojson.getObj();
     SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
     if ((le != null) && (le.size() > 0)) {
       for (EmailBodyModel em : le)
       {
         String userId2 = em.getFromId();
         Users u = this.usersService.findUsersByuserId(userId2);
         TodoList td = new TodoList();
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(em.getContent());
         td.setFromName(em.getSubject());
         td.setImg("workflow/youjian.png");
         List<EmailModel> lemail = em.getEmailList();
         for (EmailModel e : lemail) {
           if (e.getToId().equals(userId)) {
             td.setQid(e.getEmailId());
             td.setDeleteFlag(e.getDeleteFlag());
           }
         }
         td.setReadflag(em.getSendFlag());
         td.setType("email");
         Long e = Long.valueOf(em.getSendTime().intValue() * 1000L);
         String s = f.format(e);
         td.setTime(s);
         td.setUserName(em.getUsers().getUserName());
         td.setIsAttach(em.getAttachmentId() == "" ? "0" : "1");
         td.setFromId(em.getFromId());
         td.setFromUid(u.getUid());
         list.add(td);
       }
     }
     ToJson ln = this.notifyService.readNotify(maps, Integer.valueOf(1), Integer.valueOf(10), false, userId, sqlType);
     List<Notify> l = ln.getObj();
     if ((l != null) && (l.size() > 0)) {
       for (Notify no : l) {
         TodoList td = new TodoList();
         String userId2 = no.getFromId();
         Users u = this.usersService.findUsersByuserId(userId2);
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(no.getContent());
         td.setFromName(no.getSubject());
         td.setImg("workflow/notify.png");
         td.setQid(no.getNotifyId());
         td.setReadflag(no.getPublish());
         String notifyType = no.getFormat();
         td.setType("notify");
 
         String s = f.format(no.getSendTime());
         td.setTime(s);
         td.setDeleteFlag("");
         td.setUserName(no.getUsers().getUserName());
         td.setIsAttach(no.getAttachmentId() == "" ? "0" : "1");
         td.setFromId(no.getFromId());
         td.setFromUid(u.getUid());
         list1.add(td);
       }
     }
     ToJson news = this.newService.readNews(maps, Integer.valueOf(1), Integer.valueOf(10), false, userId, sqlType);
 
     List<News> newsList = news.getObj();
     if ((newsList != null) && (newsList.size() > 0)) {
       for (News newsOne : newsList) {
         TodoList td = new TodoList();
         String userId2 = newsOne.getProvider();
         Users u = this.usersService.findUsersByuserId(userId2);
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(newsOne.getContent());
         td.setFromName(newsOne.getSubject());
         td.setImg("workflow/news.png");
         td.setQid(newsOne.getNewsId());
         td.setReadflag(newsOne.getPublish());
         String notifyType = newsOne.getFormat();
         td.setType("news");
 
         String s = f.format(newsOne.getNewsTime());
         td.setTime(s);
         td.setDeleteFlag("");
         td.setUserName(newsOne.getUsers().getUserName());
         td.setIsAttach(newsOne.getAttachmentId() == "" ? "0" : "1");
         td.setFromId(newsOne.getProvider());
         td.setFromUid(u.getUid());
         list3.add(td);
       }
     }
 
     ToJson toJson = this.flowRunPrcsService.selectEnd(maps, Integer.valueOf(1), Integer.valueOf(10), false);
     List<FlowRunPrcs> listFlowRunPrcs = toJson.getObj();
     if ((listFlowRunPrcs != null) && (listFlowRunPrcs.size() > 0)) {
       for (FlowRunPrcs flowRunPrcs : listFlowRunPrcs) {
         FlowRun flowRun = this.flowRunService.find(flowRunPrcs.getRunId());
         TodoList td = new TodoList();
         String userId2 = flowRunPrcs.getUserId();
         Users u = this.usersService.findUsersByuserId(userId2);
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(request.getScheme() + ":" + request.getServerName() + ":" + request.getServerPort() + "work/workform?flowId=" + flowRun.getFlowId() + "&flowStep=" + flowRunPrcs.getPrcsId() + "&runId=" + flowRunPrcs.getRunId() + "&prcsId=" + flowRunPrcs.getPrcsFlag() + "");
 
         td.setFromName(flowRun.getRunName());
         td.setImg("workflow/daibanliucheng.png");
         td.setQid(flowRunPrcs.getId());
         td.setReadflag(flowRunPrcs.getPrcsFlag());
         td.setType("willdo");
 
         td.setTime(flowRunPrcs.getPrcsTime().substring(0, flowRunPrcs.getPrcsTime().length() - 2));
         td.setDeleteFlag("");
         td.setUserName(u.getUserName());
         td.setIsAttach("0");
         td.setFromId(u.getUserId());
         td.setFromUid(u.getUid());
         list2.add(td);
       }
     }
 
     db.setEmail(list);
     db.setNotify(list1);
     db.setWorkFlow(list2);
     db.setNewsList(list3);
     return db;
   }
 
   public Daiban readTotal(String userId, String sqlType, HttpServletRequest request, String superfluity) throws Exception
   {
     Daiban db = new Daiban();
     Integer total = Integer.valueOf(0);
     if ("1".equals(superfluity)) {
       Map map = new HashMap();
       map.put("userId", userId);
       map.put("flag", "0");
       List smsBodyExtendList = this.smsBodyMapper.SmsListByType(map);
       total = Integer.valueOf(smsBodyExtendList.size());
     } else {
       Map map = new HashMap();
       map.put("userId", userId);
       map.put("flag", "1");
       List smsBodyExtendList = this.smsBodyMapper.SmsListByType(map);
       total = Integer.valueOf(smsBodyExtendList.size());
     }
 
     db.setTotal(total);
     return db;
   }
 
   public BaseWrapper readHaveMsgList(String classification, String userId, String sqlType, HttpServletRequest request)
     throws Exception
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     Map maps = new HashMap();
     maps.put("fromId", userId);
     Users usersByuserId = this.usersMapper.findUsersByuserId(userId);
     maps.put("userId", usersByuserId.getUserId());
     maps.put("name", userId);
     maps.put("userPriv", usersByuserId.getUserPriv());
     maps.put("deptId", usersByuserId.getDeptId());
 
     if ("email".equals(classification))
     {
       ToJson tojson = this.emailService.selectInboxIsRead(maps, Integer.valueOf(1), Integer.valueOf(10), false, sqlType);
       List<EmailBodyModel> emailBodyModels = tojson.getObj();
       for (EmailBodyModel emailBodyModel : emailBodyModels) {
         Map mapss = new HashMap();
         mapss.put("emailId", ((EmailModel)emailBodyModel.getEmailList().get(0)).getEmailId());
         mapss.put("bodyId", emailBodyModel.getBodyId());
         EmailBodyModel emailBody = this.emailService.queryById(mapss, Integer.valueOf(1), Integer.valueOf(5), false, sqlType);
         if (emailBody != null) {
           EmailModel email = new EmailModel();
           email.setEmailId(((EmailModel)emailBodyModel.getEmailList().get(0)).getEmailId());
           email.setReadFlag("1");
           this.emailService.updateIsRead(email);
         }
       }
     }
     else
     {
       Notify notifyOne;
       if ("notify".equals(classification)) {
         ToJson ln = this.notifyService.unreadNotify(maps, Integer.valueOf(1), Integer.valueOf(10), false, userId, sqlType);
         List<Notify> notifies = ln.getObj();
 
         for (Notify notify : notifies) {
           maps.put("notifyId", notify.getNotifyId());
           notifyOne = this.notifyService.queryById(maps, Integer.valueOf(1), Integer.valueOf(20), false, userId, sqlType, "2");
         }
       }
       else if ("news".equals(classification)) {
         ToJson news = this.newService.unreadNews(maps, Integer.valueOf(1), Integer.valueOf(10), false, userId, sqlType);
         List<News> newsList = news.getObj();
				   News news2;
         for (News news1 : newsList) {
           maps.put("newsId", news1.getNewsId());
           news2 = this.newService.queryById(maps, Integer.valueOf(1), Integer.valueOf(5), false, userId, sqlType, "2");
         }
       }
     }
     
     baseWrapper.setStatus(true);
     baseWrapper.setFlag(true);
     baseWrapper.setMsg("ok");
     baseWrapper.setData("ok");
 
     return baseWrapper;
   }
 
   public BaseWrapper readHaveList(String classification, String userId, String sqlType, HttpServletRequest request) throws Exception
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     Map maps = new HashMap();
     maps.put("fromId", userId);
     Users usersByuserId = this.usersMapper.findUsersByuserId(userId);
     maps.put("userId", usersByuserId.getUserId());
     maps.put("name", userId);
     maps.put("userPriv", usersByuserId.getUserPriv());
     maps.put("deptId", usersByuserId.getDeptId());
 
     if ("email".equals(classification)) {
       ToJson tojson = this.emailService.selectInboxIsRead(maps, Integer.valueOf(1), Integer.valueOf(10), false, sqlType);
       List<EmailBodyModel> emailBodyModels = tojson.getObj();
       for (EmailBodyModel emailBodyModel : emailBodyModels) {
         Map mapss = new HashMap();
         mapss.put("emailId", ((EmailModel)emailBodyModel.getEmailList().get(0)).getEmailId());
         mapss.put("bodyId", emailBodyModel.getBodyId());
         EmailBodyModel emailBody = this.emailService.queryById(mapss, Integer.valueOf(1), Integer.valueOf(5), false, sqlType);
         if (emailBody != null) {
           EmailModel email = new EmailModel();
           email.setEmailId(((EmailModel)emailBodyModel.getEmailList().get(0)).getEmailId());
           email.setReadFlag("1");
           this.emailService.updateIsRead(email);
         }
       }
 
       Map Objmaps = new HashMap();
       Objmaps.put("userId", usersByuserId.getUserId());
       Objmaps.put("flag", "1");
       Objmaps.put("type", "2");
       List smsBodyExtends = this.smsBodyMapper.SmsListMsgByType(Objmaps);
       String[] toBeStored = (String[])smsBodyExtends.toArray(new String[smsBodyExtends.size()]);
       this.smsMapper.updateSmsByIds("0", toBeStored);
     } else if ("notify".equals(classification)) {
       ToJson ln = this.notifyService.unreadNotify(maps, Integer.valueOf(1), Integer.valueOf(10), false, userId, sqlType);
       List<Notify> notifies = ln.getObj();
 		 Notify notifyOne;
       for (Notify notify : notifies) {
         maps.put("notifyId", notify.getNotifyId());
         notifyOne = this.notifyService.queryById(maps, Integer.valueOf(1), Integer.valueOf(20), false, userId, sqlType, "2");
       }
      
       Map Objmaps = new HashMap();
       Objmaps.put("userId", usersByuserId.getUserId());
       Objmaps.put("flag", "1");
       Objmaps.put("type", "1");
       List smsBodyExtends = this.smsBodyMapper.SmsListMsgByType(Objmaps);
       String[] toBeStored = (String[])smsBodyExtends.toArray(new String[smsBodyExtends.size()]);
       this.smsMapper.updateSmsByIds("0", toBeStored);
     } else if ("news".equals(classification)) {
       ToJson news = this.newService.unreadNews(maps, Integer.valueOf(1), Integer.valueOf(10), false, userId, sqlType);
       List<News> newsList = news.getObj();
				 News news2;
       for (News news1 : newsList) {
         maps.put("newsId", news1.getNewsId());
         news2 = this.newService.queryById(maps, Integer.valueOf(1), Integer.valueOf(5), false, userId, sqlType, "2");
       }
       
       Map Objmaps = new HashMap();
       Objmaps.put("userId", usersByuserId.getUserId());
       Objmaps.put("flag", "1");
       Objmaps.put("type", "14");
       List smsBodyExtends = this.smsBodyMapper.SmsListMsgByType(Objmaps);
       String[] toBeStored = (String[])smsBodyExtends.toArray(new String[smsBodyExtends.size()]);
       this.smsMapper.updateSmsByIds("0", toBeStored);
     }
     else if ("willdo".equals(classification)) {
       Map Objmaps = new HashMap();
       Objmaps.put("userId", usersByuserId.getUserId());
       Objmaps.put("flag", "1");
       Objmaps.put("type", "7");
       List smsBodyExtends = this.smsBodyMapper.SmsListMsgByType(Objmaps);
       String[] toBeStored = (String[])smsBodyExtends.toArray(new String[smsBodyExtends.size()]);
       this.smsMapper.updateSmsByIds("0", toBeStored);
     } else if ("toupiao".equals(classification)) {
       Map Objmaps = new HashMap();
       Objmaps.put("userId", usersByuserId.getUserId());
       Objmaps.put("flag", "1");
       Objmaps.put("type", "11");
       List smsBodyExtends = this.smsBodyMapper.SmsListMsgByType(Objmaps);
       String[] toBeStored = (String[])smsBodyExtends.toArray(new String[smsBodyExtends.size()]);
       this.smsMapper.updateSmsByIds("0", toBeStored);
     } else if ("doctment".equals(classification)) {
       Map Objmaps = new HashMap();
       Objmaps.put("userId", usersByuserId.getUserId());
       Objmaps.put("flag", "1");
       Objmaps.put("type", "70");
       List smsBodyExtends = this.smsBodyMapper.SmsListMsgByType(Objmaps);
       String[] toBeStored = (String[])smsBodyExtends.toArray(new String[smsBodyExtends.size()]);
       this.smsMapper.updateSmsByIds("0", toBeStored);
     }
     baseWrapper.setStatus(true);
     baseWrapper.setFlag(true);
     baseWrapper.setMsg("ok");
     baseWrapper.setData("ok");
 
     return baseWrapper;
   }
 
   public Daiban delete(Integer qid, String type)
   {
     if ((!type.equals("email")) || 
       (type.equals("notify")));
     return null;
   }
 
   public static InetAddress getCurrentIp()
   {
     try {
       Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
       while (networkInterfaces.hasMoreElements()) {
         NetworkInterface ni = (NetworkInterface)networkInterfaces.nextElement();
         Enumeration nias = ni.getInetAddresses();
         while (nias.hasMoreElements()) {
           InetAddress ia = (InetAddress)nias.nextElement();
           if ((!ia.isLinkLocalAddress()) && (!ia.isLoopbackAddress()) && ((ia instanceof Inet4Address)))
             return ia;
         }
       }
     }
     catch (SocketException e) {
     }
     return null;
   }
 
   public ToJson<Users> queryUserByUserId(String userName)
   {
     return this.usersService.queryUserByUserId(userName);
   }
 
   public ToJson<Users> queryCountByUserId(String userName)
   {
     ToJson json = new ToJson(1, "error");
     if (StringUtils.checkNull(userName).booleanValue()) {
       json.setMsg("查询不能为空");
       return json;
     }
     try {
       json.setTotleNum(Integer.valueOf(this.usersService.queryCountByUserId(userName)));
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "TodolistController queryCountByUserId:" + e });
     }
     return json;
   }
 
   public ToJson<SysFunction> getSysFunctionByName(String funName, HttpServletRequest request)
   {
     ToJson json = new ToJson(1, "error");
     if (StringUtils.checkNull(funName).booleanValue()) {
       json.setMsg("查询不能为空");
       return json;
     }
 
     try
     {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       Integer uid = users.getUid();
 
       String userFunctionStr = this.userFunctionService.getUserFunctionStrById(uid);
       String[] funcIds = userFunctionStr.split(",");
       List sys = this.sysFunctionMapper.getSysFunctionByName(funName);
       List a11 = new ArrayList();
       for (int o = 0; o < sys.size(); o++) {
         for (int k = 0; k < funcIds.length; k++) {
           if (String.valueOf(((SysFunction)sys.get(o)).getfId()).equals(funcIds[k])) {
             a11.add(sys.get(o));
           }
 
         }
 
       }
 
       json.setObj(a11);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "TodolistImpl getSysFunctionByName:" + e });
     }
     return json;
   }
 
   public ToJson<SysFunction> getCountSysFunctionByName(String funName)
   {
     ToJson json = new ToJson(1, "error");
     if (StringUtils.checkNull(funName).booleanValue()) {
       json.setMsg("查询不能为空");
       return json;
     }
     try {
       json.setTotleNum(Integer.valueOf(this.sysFunctionMapper.getCountSysFunctionByName(funName)));
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "TodolistImpl getCountSysFunctionByName:" + e });
     }
     return json;
   }
 
   public static String stampToDate(String s)
   {
     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     long lt = new Long(s).longValue();
     Date date = new Date(lt * 1000L);
     String res = simpleDateFormat.format(date);
     return res;
   }
 
   public static Long dateToStamp(String s)
     throws ParseException
   {
     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
     Date date = simpleDateFormat.parse(s);
     long ts = date.getTime();
     return Long.valueOf(ts);
   }
 
   public List touPiaoDaiBanTongJi(HttpServletRequest request, Users users) throws Exception {
     List list6 = new ArrayList();
     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 
     Map map = new HashMap();
     map.put("smsType", "11");
     map.put("toId", users.getUserId());
     List<Map<String, Object>> toupiao = this.smsMapper.smsSelectBody(map);
     Date dates = new Date();
     if ((toupiao != null) && (toupiao.size() > 0)) {
       for (Map map1 : toupiao) {
         TodoList td = new TodoList();
         String userId2 = map1.get("toId").toString();
         Users u = this.usersService.findUsersByuserId(map1.get("fromId") + "");
         td.setUid(u.getUid());
         td.setAvater(u.getAvatar());
         td.setContent(String.valueOf(map1.get("remindUrl")));
         td.setFromName(map1.get("content").toString() == null ? "无标题" : map1.get("content").toString());
         td.setImg("workflow/publish.png");
         td.setQid(Integer.valueOf(map1.get("bodyId").toString()));
 
         td.setType("toupiao");
         String toupiaoid = map1.get("remindUrl").toString();
         if (toupiaoid.contains("resultId=")) {
           toupiaoid = toupiaoid.substring(toupiaoid.indexOf("?resultId=") + 1, toupiaoid.lastIndexOf("&"));
           toupiaoid = toupiaoid.replace("resultId=", "");
           td.setVoteId(Integer.valueOf(toupiaoid));
         }
 
         td.setTime(map1.get("sendTime").toString() == null ? "" : map1.get("sendTime").toString());
         td.setDeleteFlag("");
         td.setUserName(u.getUserName());
         td.setIsAttach("0");
         td.setFromId(u.getUserId());
         td.setFromUid(u.getUid());
 
         String date1 = stampToDate(td.getTime());
         String date2 = simpleDateFormat.format(dates);
 
         if (td.getVoteId().intValue() != 0) {
           VoteTitle voteTitle = this.voteTitleMapper.voteSelectOne(td.getVoteId());
           if (voteTitle != null) {
             Long t1 = dateToStamp(voteTitle.getEndDate());
             Long t2 = dateToStamp(date2);
             if (t1.longValue() >= t2.longValue()) {
               td.setTime(voteTitle.getSendTime());
               td.setContent("manage/voteResult?resultId=" + voteTitle.getVoteId() + "&type=1");
               list6.add(td);
             }
           }
         }
       }
     }
     return list6;
   }
 
   public BaseWrapper smsListByType(String userId, HttpServletRequest request, String type)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if (StringUtils.checkNull(userId).booleanValue()) {
       userId = user.getUserId();
     }
     DaiBanModel daiBanModel = new DaiBanModel();
     List list = new ArrayList();
     List list1 = new ArrayList();
     List list2 = new ArrayList();
     List list3 = new ArrayList();
     List list4 = new ArrayList();
     List list5 = new ArrayList();
     Map map = new HashMap();
     map.put("userId", userId);
     map.put("flag", "1");
     List smsBodyExtendList = this.smsBodyMapper.SmsListByType(map);
     Iterator iter = smsBodyExtendList.iterator();
     while (iter.hasNext()) {
       SmsBodyExtend smsBodyExtend = (SmsBodyExtend)iter.next();
       smsBodyExtend.setFromUid(user.getUid());
       smsBodyExtend.setFromName(user.getUserName());
 
       switch (Integer.parseInt(smsBodyExtend.getSmsType())) {
       case 2:
         smsBodyExtend.setImg("workflow/youjian.png");
         smsBodyExtend.setType("email");
         String size1 = smsBodyExtend.getRemindUrl();
         String[] aStrings = size1.split("\\?");
         for (int i = 0; i < aStrings.length; i++) {
           if (aStrings[i].contains("id")) {
             String[] s = aStrings[i].split("=");
             smsBodyExtend.setQid(Integer.valueOf(Integer.parseInt(s[1])));
             break;
           }
         }
         list.add(smsBodyExtend);
         break;
       case 1:
         smsBodyExtend.setImg("workflow/notify.png");
         smsBodyExtend.setType("notify");
         String size2 = smsBodyExtend.getRemindUrl();
         String[] aStrings2 = size2.split("\\?");
         for (int i = 0; i < aStrings2.length; i++) {
           if (aStrings2[i].contains("notifyId")) {
             String[] s = aStrings2[i].split("=");
             smsBodyExtend.setQid(Integer.valueOf(Integer.parseInt(s[1])));
             break;
           }
         }
         list1.add(smsBodyExtend);
 
         break;
       case 7:
         smsBodyExtend.setImg("workflow/daibanliucheng.png");
         smsBodyExtend.setType("willdo");
         String size4 = smsBodyExtend.getRemindUrl();
         if (size4.contains("workformPreView"))
           smsBodyExtend.setHandleType("0");
         else {
           smsBodyExtend.setHandleType("1");
         }
         String[] aStrings4 = size4.split("&");
         for (int i = 0; i < aStrings4.length; i++) {
           if (aStrings4[i].contains("flowId")) {
             String[] s = aStrings4[i].split("=");
             smsBodyExtend.setFlowId(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings4[i].contains("flowStep")) {
             String[] s = aStrings4[i].split("=");
             smsBodyExtend.setReadflag(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings4[i].contains("runId")) {
             String[] s = aStrings4[i].split("=");
             Integer runId = Integer.valueOf(Integer.parseInt(s[1]));
             FlowRun flowRun = this.flowRunService.find(runId);
             Users users = this.usersMapper.findUsersByuserId(flowRun.getBeginUser());
             smsBodyExtend.setUserName(users.getUserName());
             smsBodyExtend.setUid(users.getUid());
             smsBodyExtend.setAvater(users.getAvatar());
             smsBodyExtend.setRunId(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings4[i].contains("prcsId")) {
             String[] s = aStrings4[i].split("=");
             smsBodyExtend.setStep(Integer.valueOf(Integer.parseInt(s[1])));
           }
 
         }
 
         list2.add(smsBodyExtend);
         break;
       case 14:
         smsBodyExtend.setImg("workflow/news.png");
         smsBodyExtend.setType("news");
         String size3 = smsBodyExtend.getRemindUrl();
         String[] aStrings3 = size3.split("\\?");
         for (int i = 0; i < aStrings3.length; i++) {
           if (aStrings3[i].contains("newsId")) {
             String[] s = aStrings3[i].split("=");
             smsBodyExtend.setQid(Integer.valueOf(Integer.parseInt(s[1])));
             break;
           }
         }
         list3.add(smsBodyExtend);
         break;
       case 70:
         smsBodyExtend.setImg("workflow/doctment.png");
         smsBodyExtend.setType("doctment");
         String size5 = smsBodyExtend.getRemindUrl();
         if (size5.contains("workformPreView"))
           smsBodyExtend.setHandleType("0");
         else {
           smsBodyExtend.setHandleType("1");
         }
         String[] aStrings5 = size5.split("&");
         for (int i = 0; i < aStrings5.length; i++) {
           if (aStrings5[i].contains("flowId")) {
             String[] s = aStrings5[i].split("=");
             smsBodyExtend.setFlowId(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings5[i].contains("flowStep")) {
             String[] s = aStrings5[i].split("=");
             smsBodyExtend.setReadflag(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings5[i].contains("runId")) {
             String[] s = aStrings5[i].split("=");
             Integer runId = Integer.valueOf(Integer.parseInt(s[1]));
             FlowRun flowRun = this.flowRunService.find(runId);
             Users users = this.usersMapper.findUsersByuserId(flowRun.getBeginUser());
             smsBodyExtend.setUserName(users.getUserName());
             smsBodyExtend.setUid(users.getUid());
             smsBodyExtend.setAvater(users.getAvatar());
             smsBodyExtend.setRunId(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings5[i].contains("prcsId")) {
             String[] s = aStrings5[i].split("=");
             smsBodyExtend.setStep(Integer.valueOf(Integer.parseInt(s[1])));
           }
         }
 
         list4.add(smsBodyExtend);
         break;
       case 11:
         smsBodyExtend.setImg("workflow/publish.png");
         smsBodyExtend.setType("toupiao");
         String size6 = smsBodyExtend.getRemindUrl();
         String[] aStrings6 = size6.split("\\?");
         for (int i = 0; i < aStrings6.length; i++) {
           if (aStrings6[i].contains("resultId")) {
             String[] s = aStrings6[i].split("=");
             String[] s1 = s[i].split("&");
             smsBodyExtend.setQid(Integer.valueOf(Integer.parseInt(s1[0])));
             break;
           }
         }
         list5.add(smsBodyExtend);
       }
 
     }
 
     daiBanModel.setDocumentList(list4);
     daiBanModel.setEmail(list);
     daiBanModel.setNewsList(list3);
     daiBanModel.setNotify(list1);
     daiBanModel.setWorkFlow(list2);
     daiBanModel.setToupiao(list5);
     baseWrapper.setData(daiBanModel);
     baseWrapper.setFlag(true);
     baseWrapper.setStatus(true);
     return baseWrapper;
   }
 
   public BaseWrapper getWillDocSendOrReceive(String userId, String documentType, HttpServletRequest request)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if (StringUtils.checkNull(userId).booleanValue()) {
       userId = user.getUserId();
     }
     DaiBanModel daiBanModel = new DaiBanModel();
     List documentList = new ArrayList();
 
     Map map = new HashMap();
     map.put("userId", userId);
     map.put("smsType", "70");
     map.put("flag", "1");
     List smsBodyExtendList = this.smsBodyMapper.getWillDocSendOrReceive(map);
     Iterator iter = smsBodyExtendList.iterator();
     while (iter.hasNext()) {
       SmsBodyExtend smsBodyExtend = (SmsBodyExtend)iter.next();
       smsBodyExtend.setFromUid(user.getUid());
       smsBodyExtend.setFromName(user.getUserName());
       smsBodyExtend.setImg("workflow/doctment.png");
       smsBodyExtend.setType("doctment");
       String size = smsBodyExtend.getRemindUrl();
       if (size.contains("workformPreView"))
         smsBodyExtend.setHandleType("0");
       else {
         smsBodyExtend.setHandleType("1");
       }
       String[] aStrings = size.split("&");
       String type = "";
       for (int i = 0; i < aStrings.length; i++) {
         if (aStrings[i].contains("flowId")) {
           String[] s = aStrings[i].split("=");
           smsBodyExtend.setFlowId(Integer.valueOf(Integer.parseInt(s[1])));
         }
         else if (aStrings[i].contains("flowStep")) {
           String[] s = aStrings[i].split("=");
           smsBodyExtend.setReadflag(Integer.valueOf(Integer.parseInt(s[1])));
         }
         else if (aStrings[i].contains("runId")) {
           String[] s = aStrings[i].split("=");
           smsBodyExtend.setRunId(Integer.valueOf(Integer.parseInt(s[1])));
         }
         else if (aStrings[i].contains("prcsId")) {
           String[] s = aStrings[i].split("=");
           smsBodyExtend.setStep(Integer.valueOf(Integer.parseInt(s[1])));
         }
         else if (aStrings[i].contains("tabId")) {
           String[] s = aStrings[i].split("=");
           DocumentModelWithBLOBs documentModelWithBLOBs = this.documentModelMapper.selectByPrimaryKey(Integer.valueOf(Integer.parseInt(s[1])));
           type = documentModelWithBLOBs.getDocumentType();
         }
       }
 
       if ((!"".equals(type)) && (documentType.equals(type))) {
         documentList.add(smsBodyExtend);
       }
     }
     baseWrapper.setData(documentList);
     baseWrapper.setFlag(true);
     baseWrapper.setStatus(true);
     return baseWrapper;
   }
 
   public BaseWrapper getUserFunctionByUserId(String userId, HttpServletRequest request)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if (StringUtils.checkNull(userId).booleanValue()) {
       userId = user.getUserId();
     }
     List todoListModels = new ArrayList();
     List<SysFunction> sysFunctions = this.sysFunctionMapper.getUserFunctionByUserId(userId);
 
     String local = getNowLanguage(request);
 
     for (SysFunction sysFunction : sysFunctions) {
       TodoListModel todoListModel = new TodoListModel();
       if ("email".equals(sysFunction.getUrl())) {
         todoListModel.setCode("email");
         todoListModel.setImg("widget/toEmail.png");
         if (local.equals("zh_CN"))
           todoListModel.setName("发送邮件");
         else if (local.equals("zh_TW"))
           todoListModel.setName("發送郵件");
         else if (local.equals("en_US")) {
           todoListModel.setName("Send mail");
         }
 
         todoListModels.add(todoListModel);
       } else if ("notes/index".equals(sysFunction.getUrl())) {
         todoListModel.setCode("notes");
         todoListModel.setImg("widget/notes.png");
         if (local.equals("zh_CN"))
           todoListModel.setName("新建便签");
         else if (local.equals("zh_TW"))
           todoListModel.setName("新建便簽");
         else if (local.equals("en_US")) {
           todoListModel.setName("Newly-built note");
         }
 
         todoListModels.add(todoListModel);
       } else if ("diary/show".equals(sysFunction.getUrl())) {
         todoListModel.setCode("diary");
         todoListModel.setImg("widget/todiary.png");
         if (local.equals("zh_CN"))
           todoListModel.setName("撰写日志");
         else if (local.equals("zh_TW"))
           todoListModel.setName("撰写日志");
         else if (local.equals("en_US")) {
           todoListModel.setName("Write a log");
         }
 
         todoListModels.add(todoListModel);
       } else if ("calendar".equals(sysFunction.getUrl())) {
         todoListModel.setCode("calendar");
         todoListModel.setImg("widget/toCalendar.png");
         if (local.equals("zh_CN"))
           todoListModel.setName("新建日程");
         else if (local.equals("zh_TW"))
           todoListModel.setName("新建日程");
         else if (local.equals("en_US")) {
           todoListModel.setName("New schedule");
         }
 
         todoListModels.add(todoListModel);
       } else if ("attendance/personal".equals(sysFunction.getUrl())) {
         todoListModel.setCode("qingjia");
         todoListModel.setImg("widget/toQingjia.png");
         if (local.equals("zh_CN"))
           todoListModel.setName("请假申请");
         else if (local.equals("zh_TW"))
           todoListModel.setName("請假申請");
         else if (local.equals("en_US")) {
           todoListModel.setName("application for leave");
         }
         todoListModels.add(todoListModel);
         TodoListModel todoListModel1 = new TodoListModel();
         todoListModel1.setCode("jiaban");
         todoListModel1.setImg("widget/toJiaban.png");
         if (local.equals("zh_CN"))
           todoListModel1.setName("加班申请");
         else if (local.equals("zh_TW"))
           todoListModel1.setName("加班申請");
         else if (local.equals("en_US")) {
           todoListModel1.setName("Over application");
         }
 
         todoListModels.add(todoListModel1);
       }
     }
 
     baseWrapper.setData(todoListModels);
     baseWrapper.setStatus(true);
     baseWrapper.setFlag(true);
 
     return baseWrapper;
   }
 
   public BaseWrapper smsListByReadType(String userId, HttpServletRequest request, String type)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if (StringUtils.checkNull(userId).booleanValue()) {
       userId = user.getUserId();
     }
     DaiBanModel daiBanModel = new DaiBanModel();
     List list = new ArrayList();
     List list1 = new ArrayList();
     List list2 = new ArrayList();
     List list3 = new ArrayList();
     List list4 = new ArrayList();
     List list5 = new ArrayList();
     Map map = new HashMap();
     map.put("userId", userId);
     List smsBodyExtendList = this.smsBodyMapper.SmsListByType(map);
     Iterator iter = smsBodyExtendList.iterator();
     while (iter.hasNext()) {
       SmsBodyExtend smsBodyExtend = (SmsBodyExtend)iter.next();
       smsBodyExtend.setFromUid(user.getUid());
       smsBodyExtend.setFromName(user.getUserName());
       switch (Integer.parseInt(smsBodyExtend.getSmsType())) {
       case 2:
         smsBodyExtend.setImg("workflow/youjian.png");
         smsBodyExtend.setType("email");
         String size1 = smsBodyExtend.getRemindUrl();
         String[] aStrings = size1.split("\\?");
         for (int i = 0; i < aStrings.length; i++) {
           if (aStrings[i].contains("id")) {
             String[] s = aStrings[i].split("=");
             smsBodyExtend.setQid(Integer.valueOf(Integer.parseInt(s[1])));
             break;
           }
         }
         list.add(smsBodyExtend);
         break;
       case 1:
         smsBodyExtend.setImg("workflow/notify.png");
         smsBodyExtend.setType("notify");
         String size2 = smsBodyExtend.getRemindUrl();
         String[] aStrings2 = size2.split("\\?");
         for (int i = 0; i < aStrings2.length; i++) {
           if (aStrings2[i].contains("notifyId")) {
             String[] s = aStrings2[i].split("=");
             smsBodyExtend.setQid(Integer.valueOf(Integer.parseInt(s[1])));
             break;
           }
         }
         list1.add(smsBodyExtend);
 
         break;
       case 7:
         smsBodyExtend.setImg("workflow/daibanliucheng.png");
         smsBodyExtend.setType("willdo");
         String size4 = smsBodyExtend.getRemindUrl();
         if (size4.contains("workformPreView"))
           smsBodyExtend.setHandleType("0");
         else {
           smsBodyExtend.setHandleType("1");
         }
         String[] aStrings4 = size4.split("&");
         for (int i = 0; i < aStrings4.length; i++) {
           if (aStrings4[i].contains("flowId")) {
             String[] s = aStrings4[i].split("=");
             smsBodyExtend.setFlowId(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings4[i].contains("flowStep")) {
             String[] s = aStrings4[i].split("=");
             smsBodyExtend.setReadflag(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings4[i].contains("runId")) {
             String[] s = aStrings4[i].split("=");
             Integer runId = Integer.valueOf(Integer.parseInt(s[1]));
             FlowRun flowRun = this.flowRunService.find(runId);
             Users users = this.usersMapper.findUsersByuserId(flowRun.getBeginUser());
             smsBodyExtend.setUserName(users.getUserName());
             smsBodyExtend.setUid(users.getUid());
             smsBodyExtend.setAvater(users.getAvatar());
             smsBodyExtend.setRunId(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings4[i].contains("prcsId")) {
             String[] s = aStrings4[i].split("=");
             smsBodyExtend.setStep(Integer.valueOf(Integer.parseInt(s[1])));
           }
 
         }
 
         list2.add(smsBodyExtend);
         break;
       case 14:
         smsBodyExtend.setImg("workflow/news.png");
         smsBodyExtend.setType("news");
         String size3 = smsBodyExtend.getRemindUrl();
         String[] aStrings3 = size3.split("\\?");
         for (int i = 0; i < aStrings3.length; i++) {
           if (aStrings3[i].contains("newsId")) {
             String[] s = aStrings3[i].split("=");
             smsBodyExtend.setQid(Integer.valueOf(Integer.parseInt(s[1])));
             break;
           }
         }
         list3.add(smsBodyExtend);
         break;
       case 70:
         smsBodyExtend.setImg("workflow/doctment.png");
         smsBodyExtend.setType("doctment");
         String size5 = smsBodyExtend.getRemindUrl();
         if (size5.contains("workformPreView"))
           smsBodyExtend.setHandleType("0");
         else {
           smsBodyExtend.setHandleType("1");
         }
         String[] aStrings5 = size5.split("&");
         for (int i = 0; i < aStrings5.length; i++) {
           if (aStrings5[i].contains("flowId")) {
             String[] s = aStrings5[i].split("=");
             smsBodyExtend.setFlowId(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings5[i].contains("flowStep")) {
             String[] s = aStrings5[i].split("=");
             smsBodyExtend.setReadflag(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings5[i].contains("runId")) {
             String[] s = aStrings5[i].split("=");
             Integer runId = Integer.valueOf(Integer.parseInt(s[1]));
             FlowRun flowRun = this.flowRunService.find(runId);
             Users users = this.usersMapper.findUsersByuserId(flowRun.getBeginUser());
             smsBodyExtend.setUserName(users.getUserName());
             smsBodyExtend.setUid(users.getUid());
             smsBodyExtend.setAvater(users.getAvatar());
             smsBodyExtend.setRunId(Integer.valueOf(Integer.parseInt(s[1])));
           }
           else if (aStrings5[i].contains("prcsId")) {
             String[] s = aStrings5[i].split("=");
             smsBodyExtend.setStep(Integer.valueOf(Integer.parseInt(s[1])));
           }
         }
 
         list4.add(smsBodyExtend);
         break;
       case 11:
         smsBodyExtend.setImg("workflow/publish.png");
         smsBodyExtend.setType("toupiao");
         String size6 = smsBodyExtend.getRemindUrl();
         String[] aStrings6 = size6.split("\\?");
         for (int i = 0; i < aStrings6.length; i++) {
           if (aStrings6[i].contains("resultId")) {
             String[] s = aStrings6[i].split("=");
             String[] s1 = s[i].split("&");
             smsBodyExtend.setQid(Integer.valueOf(Integer.parseInt(s1[0])));
             break;
           }
         }
         list5.add(smsBodyExtend);
       }
 
     }
 
     daiBanModel.setDocumentList(list4);
     daiBanModel.setEmail(list);
     daiBanModel.setNewsList(list3);
     daiBanModel.setNotify(list1);
     daiBanModel.setWorkFlow(list2);
     daiBanModel.setToupiao(list5);
     baseWrapper.setData(daiBanModel);
     return baseWrapper;
   }
 
   private String getNowLanguage(HttpServletRequest request) {
     Object localObj = SessionUtils.getSessionInfo(request.getSession(), "LOCALE_SESSION_ATTRIBUTE_NAME", Object.class);
     String local = "";
     if (localObj != null) {
       if (StringUtils.checkNull(localObj.toString()).booleanValue()) {
         local = "zh_CN";
         SessionUtils.putSession(request.getSession(), "LOCALE_SESSION_ATTRIBUTE_NAME", "zh_CN");
       } else {
         local = localObj.toString();
       }
     } else {
       local = "zh_CN";
       SessionUtils.putSession(request.getSession(), "LOCALE_SESSION_ATTRIBUTE_NAME", "zh_CN");
     }
     return local;
   }
 }

