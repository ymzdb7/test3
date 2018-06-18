 package com.myoa.service.sms.impl;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.edu.voteItem.VoteItemMapper;
import com.myoa.dao.notify.NotifyMapper;
import com.myoa.dao.sms.SmsBodyMapper;
import com.myoa.dao.sms.SmsMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.edu.voteItem.VoteItem;
import com.myoa.model.notify.Notify;
import com.myoa.model.sms.Sms;
import com.myoa.model.sms.SmsBody;
import com.myoa.model.sms.SmsBodyExtend;
import com.myoa.model.users.Users;
import com.myoa.service.sms.SmsService;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.ipUtil.MachineCode;
import com.myoa.util.page.PageParams;
import com.tencent.xinge.ClickAction;
 import com.tencent.xinge.Message;
 import com.tencent.xinge.MessageIOS;
 import com.tencent.xinge.Style;
 import com.tencent.xinge.XingeApp;
 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.json.JSONObject;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
 
 @Service
 public class SmsServiceImpl
   implements SmsService
 {
 
   @Resource
   private SmsMapper smsMapper;
 
   @Resource
   private SmsBodyMapper smsBodyMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private SysCodeMapper sysCodeMapper;
 
   @Resource
   private HttpServletRequest request;
 
   @Resource
   private NotifyMapper notifyMapper;
 
   @Resource
   private VoteItemMapper voteItemMapper;
 
   @Value("${xg_push_msg_android_key}")
   String androidKey;
 
   @Value("${xg_push_msg_android_sercetkey}")
   String androidSercetKey;
 
   @Value("${xg_push_msg_ios_key}")
   String iosKey;
 
   @Value("${xg_push_msg_ios_sercetkey}")
   String iosSercetKey;
 
   @Autowired
   ThreadPoolTaskExecutor threadPoolTaskExecutor;
 
   public ToJson<SmsBody> saveSms(SmsBody smsBody, String toIds, String remind, String tuisong, String title, String context, String sqlType)
   {
     ToJson json = new ToJson();
     Long curTime = Long.valueOf(System.currentTimeMillis());
     System.out.println("0=||============>++当前更新时间:" + curTime);
     String jixiema = (String)MachineCode.get16CharMacs().get(0);
     System.out.println("0=||===============》推送机器码：" + jixiema);
     try {
       if ((!StringUtils.checkNull(toIds).booleanValue()) && 
         (remind.equals("1"))) {
         int a = this.smsBodyMapper.insertSelective(smsBody);
         if (a > 0) {
           String[] split = toIds.split(",");
           List<String> list = new ArrayList();
           for (int i = 0; i < split.length; i++) {
             for (int j = i + 1; j < split.length; j++) {
               if (split[i] == split[j]) {
                 i++; j = i;
               }
             }
             list.add(split[i]);
           }
           List smsList = new ArrayList();
           for (String toId : list) {
             Sms sms = new Sms();
             sms.setToId(toId);
             sms.setBodyId(smsBody.getBodyId());
             sms.setRemindFlag("1");
             sms.setDeleteFlag("0");
             sms.setRemindTime(Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
             smsList.add(sms);
           }
           this.smsMapper.insertTomaqi(smsList);
         }
 
       }
 
       if (("1".equals(tuisong)) && 
         (!StringUtils.checkNull(toIds).booleanValue())) {
         String[] split = toIds.split(",");
         List list = new ArrayList();
         for (int i = 0; i < split.length; i++) {
           for (int j = i + 1; j < split.length; j++) {
             if (split[i] == split[j]) {
               i++; j = i;
             }
           }
           if ((split[i] != null) && (!split[i].equals(""))) {
             list.add(split[i]);
           }
         }
         String[] arrayResult = (String[])(String[])list.toArray(new String[list.size()]);
         XingeApp pushAndroid = new XingeApp(Long.parseLong(this.androidKey), this.androidSercetKey);
         XingeApp push = new XingeApp(Long.parseLong(this.iosKey), this.iosSercetKey);
         JSONObject ret3;
         for (int ssi = 0; ssi < arrayResult.length; ssi++) {
           String account = jixiema + arrayResult[ssi] + sqlType;
           ClickAction clickAction = new ClickAction();
           clickAction.setActionType(1);
           clickAction.setActivity("123");
           Style style = new Style(0, 0, 0, 1, 1, 1, 0, 1);
           Message mess = new Message();
           mess.setType(1);
           mess.setStyle(style);
           mess.setTitle(title);
           mess.setContent(context);
           mess.setAction(clickAction);
           JSONObject ret = pushAndroid.pushSingleAccount(0, account, mess);
 
           JSONObject contentTest = new JSONObject();
           JSONObject obj = new JSONObject();
           JSONObject aps = new JSONObject();
           contentTest.put("title", title);
           contentTest.put("body", context);
           aps.put("badge", 1);
           aps.put("alert", contentTest);
           obj.put("aps", aps);
           MessageIOS messageIOS = new MessageIOS();
           messageIOS.setRaw(obj.toString());
           ret3 = push.pushSingleAccount(0, account, messageIOS, 1);
         }
 
       }
 
       System.out.println("0=||============>++结束时间:" + (System.currentTimeMillis() - curTime.longValue()));
     } catch (Exception e) {
       e.printStackTrace();
     }
 
     return json;
   }
 
   public ToJson<SmsBody> getSmsBodies(HttpServletRequest request, Integer queryType, Integer page, Integer pageSize)
   {
     ToJson json = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setPageSize(pageSize);
     pageParams.setPage(page);
     pageParams.setUseFlag(Boolean.valueOf(true));
     try
     {
       Users sessionUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       Map map = new HashMap();
       map.put("page", pageParams);
 
       if (queryType.intValue() == 1) {
         map.put("toId", sessionUser.getUserId());
         map.put("remindFlag", "3");
       }
 
       if (queryType.intValue() == 2) {
         map.put("toId", sessionUser.getUserId());
       }
 
       if (queryType.intValue() == 3) {
         map.put("fromId", sessionUser.getUserId());
       }
 
       List<SmsBody> smsBodyByMap = this.smsBodyMapper.getSmsBodyByMap(map);
       if ((smsBodyByMap != null) && (smsBodyByMap.size() > 0)) {
         for (SmsBody smsBody : smsBodyByMap) {
           if (smsBody != null) {
             if (!StringUtils.checkNull(smsBody.getFromId()).booleanValue()) {
               String usernameByUserId = this.usersMapper.getUsernameByUserId(smsBody.getFromId());
               smsBody.setFromName(usernameByUserId);
             }
             if (!StringUtils.checkNull(smsBody.getToId()).booleanValue()) {
               String usernameByUserId = this.usersMapper.getUsernameByUserId(smsBody.getToId());
               smsBody.setToName(usernameByUserId);
             }
             if (!StringUtils.checkNull(smsBody.getSmsType()).booleanValue()) {
               SysCode sms_remind = this.sysCodeMapper.getSingleCode("SMS_REMIND", smsBody.getSmsType());
               if ((sms_remind != null) && (sms_remind.getCodeName() != null))
                 smsBody.setSmsTypeName(sms_remind.getCodeName());
               else {
                 smsBody.setSmsTypeName("类型不存在");
               }
             }
           }
         }
       }
 
       map.remove("page");
       Integer smsBodyCountByMap = this.smsBodyMapper.getSmsBodyCountByMap(map);
       json.setTotleNum(smsBodyCountByMap);
       json.setObj(smsBodyByMap);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Sms> updateDeleteFlag(HttpServletRequest request, String deleteFlag, String bodyIds)
   {
     ToJson json = new ToJson();
     try {
       Users sessionUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String[] bodyIdsArr = null;
       if (!StringUtils.checkNull(bodyIds).booleanValue()) {
         bodyIdsArr = bodyIds.split(",");
       }
       this.smsMapper.updateDeleteFlag(sessionUser.getUserId(), deleteFlag, bodyIdsArr);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<Sms> updateRemindFlag(HttpServletRequest request, String remindFlag, String bodyIds)
   {
     ToJson json = new ToJson();
     try {
       Users sessionUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String[] bodyIdsArr = null;
       if (!StringUtils.checkNull(bodyIds).booleanValue()) {
         bodyIdsArr = bodyIds.split(",");
       }
       this.smsMapper.updateRemindFlag(sessionUser.getUserId(), remindFlag, (bodyIdsArr != null) && (bodyIdsArr.length == 0) ? null : bodyIdsArr);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<Sms> deleteByRemind(HttpServletRequest request, String deleteType)
   {
     ToJson json = new ToJson();
     try {
       Users sessionUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       if ((sessionUser != null) && (!StringUtils.checkNull(sessionUser.getUserId()).booleanValue())) {
         if ("1".equals(deleteType))
           this.smsMapper.deleteByRemind(sessionUser.getUserId(), null);
         else if ("2".equals(deleteType)) {
           this.smsMapper.deleteByRemind(null, sessionUser.getUserId());
         }
       }
 
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Sms> deleteByDelFlag(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users sessionUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       if ((sessionUser != null) && (!StringUtils.checkNull(sessionUser.getUserId()).booleanValue())) {
         this.smsMapper.deleteByDelFlag(sessionUser.getUserId());
       }
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Sms> setRead(HttpServletRequest request, Integer bodyId)
   {
     ToJson json = new ToJson();
     try {
       Users sessionUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       if ((sessionUser != null) && (!StringUtils.checkNull(sessionUser.getUserId()).booleanValue()) && 
         (bodyId != null) && (bodyId.intValue() != 0)) {
         this.smsMapper.setRead(sessionUser.getUserId(), bodyId);
       }
 
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<SmsBody> querySmsBody(HttpServletRequest request, HttpServletResponse response, String toIds, String fromIds, String smsType, String beginDate, String endDate, String content, String orderBy, String sortType, String opeType, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson();
     Map map = new HashMap();
 
     if ((page != null) && (pageSize != null)) {
       page = Integer.valueOf((page.intValue() - 1) * pageSize.intValue());
       map.put("page", page);
       map.put("pageSize", pageSize);
     } else {
       map.put("page", Integer.valueOf(0));
       map.put("pageSize", Integer.valueOf(100));
     }
     List<SmsBody> smsBodies = new ArrayList();
     try {
       if (toIds != null) {
         String[] split = toIds.split(",");
         if ((split.length > 0) && (!"".equals(split[0])))
           map.put("toIds", split);
         else {
           map.put("toIds", null);
         }
         map.put("deleteFlag", Integer.valueOf(0));
       }
       if (fromIds != null) {
         String[] split = fromIds.split(",");
         if ((split.length > 0) && (!"".equals(split[0])))
           map.put("fromIds", split);
         else {
           map.put("fromIds", null);
         }
         map.put("deleteFlag", Integer.valueOf(2));
       }
       if (!StringUtils.checkNull(beginDate).booleanValue()) {
         map.put("beginDate", DateFormat.getDateTime(beginDate));
       }
       if (!StringUtils.checkNull(endDate).booleanValue())
         map.put("endDate", DateFormat.getDateTime(endDate));
       else {
         map.put("endDate", Long.valueOf(System.currentTimeMillis() / 1000L));
       }
       if (!StringUtils.checkNull(content).booleanValue()) {
         map.put("content", content);
       }
       if (!StringUtils.checkNull(smsType).booleanValue()) {
         map.put("smsType", smsType);
       }
       if (!StringUtils.checkNull(orderBy).booleanValue()) {
         map.put("orderBy", orderBy);
       }
       if (!StringUtils.checkNull(sortType).booleanValue()) {
         map.put("sortType", sortType);
       }
 
       smsBodies = this.smsBodyMapper.querySmsBody(map);
 
       if ((smsBodies != null) && (smsBodies.size() > 0)) {
         for (SmsBody smsBody : smsBodies) {
           if (smsBody != null) {
             if (!StringUtils.checkNull(smsBody.getFromId()).booleanValue()) {
               String usernameByUserId = this.usersMapper.getUsernameByUserId(smsBody.getFromId());
               smsBody.setFromName(usernameByUserId);
             }
             if (!StringUtils.checkNull(smsBody.getToId()).booleanValue()) {
               String usernameByUserId = this.usersMapper.getUsernameByUserId(smsBody.getToId());
               smsBody.setToName(usernameByUserId);
             }
             if (!StringUtils.checkNull(smsBody.getSmsType()).booleanValue()) {
               SysCode sms_remind = this.sysCodeMapper.getSingleCode("SMS_REMIND", smsBody.getSmsType());
               if ((sms_remind != null) && (sms_remind.getCodeName() != null))
                 smsBody.setSmsTypeName(sms_remind.getCodeName());
               else {
                 smsBody.setSmsTypeName("类型不存在");
               }
             }
           }
         }
       }
 
       if ("1".equals(opeType)) {
         json.setObj(smsBodies);
         json.setTotleNum(this.smsBodyMapper.querySmsBodyCount(map));
         json.setFlag(0);
         json.setMsg("ok");
       }
     }
     catch (Exception e)
     {
       HSSFWorkbook workbook1;
       String[] secondTitles;
       String[] beanProperty;
       HSSFWorkbook workbook2;
       HSSFWorkbook workbook;
       String filename;
       ServletOutputStream out;
       e.printStackTrace();
 
       json.setMsg("err");
       json.setFlag(1);
     }
     finally
     {
       HSSFWorkbook workbook1;
       String[] secondTitles = { "类别", "发送人", "内容", "发送时间", "提醒" };;
       String[] beanProperty =  { "smsTypeName", "fromName", "content", "sendTimeStr", "remindStr" };
       HSSFWorkbook workbook2;
       HSSFWorkbook workbook;
       String filename;
       ServletOutputStream out;
       if ("2".equals(opeType)) {
         try {
            workbook1 = ExcelUtil.makeExcelHead("内部提醒", 4);
           if (toIds != null) {
             secondTitles[1] = "收信人";
             beanProperty[1] = "toName";
           }
 
           if (fromIds != null) {
             secondTitles[1] = "发送人";
             beanProperty[1] = "fromName";
           }
           workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
           workbook = ExcelUtil.exportExcelData(workbook2, smsBodies, beanProperty);
           filename = "内部提醒.xls";
           filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
           response.setContentType("application/vnd.ms-excel");
           response.setHeader("content-disposition", "attachment;filename=" + filename);
           out = response.getOutputStream();
           workbook.write(out);
           out.close();
         } catch (Exception e) {
           e.printStackTrace();
         }
       }
     }
 
     return json;
   }
 
   public void setRead(HttpServletRequest request, String url)
   {
     try {
       Users sessionUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       if ((sessionUser != null) && (!StringUtils.checkNull(sessionUser.getUserId()).booleanValue()) && 
         (!StringUtils.checkNull(url).booleanValue())) {
         this.smsMapper.setReadByUrl(sessionUser.getUserId(), url);
       }
     }
     catch (Exception e)
     {
       e.printStackTrace();
     }
   }
 
   public void updatequerySmsByType(String type, String userId, String id)
   {
     Map map = new HashMap();
     map.put("type", type);
     map.put("userId", userId);
     map.put("id", id);
     try {
       List<Sms> smsList = this.smsMapper.querySmsByType(map);
       if ((smsList != null) && (smsList.size() > 0)) {
         for (Sms sms : smsList)
           this.smsMapper.setReadByUrl(sms.getToId(), sms.getUrl());
       }
     }
     catch (Exception e)
     {
       e.printStackTrace();
     }
   }
 
   public void updateEndTimeList(HttpServletRequest request, String userId)
   {
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if (StringUtils.checkNull(userId).booleanValue()) {
       userId = user.getUserId();
     }
     List<Notify> notifies = this.notifyMapper.selectNotifyEndTime(DateFormat.getCurrentTime2());
     List<VoteItem> voteItems = this.voteItemMapper.selectVoteEndTime(DateFormat.getCurrentTime2());
     Map map = new HashMap();
     map.put("userId", user.getUserId());
     map.put("flag", "1");
     List smsBodyExtendList = this.smsBodyMapper.SmsListByType(map);
     Iterator iter = smsBodyExtendList.iterator();
     List list = new ArrayList();
     List list1 = new ArrayList();
     while (iter.hasNext()) {
       SmsBodyExtend smsBodyExtend = (SmsBodyExtend)iter.next();
       switch (Integer.parseInt(smsBodyExtend.getSmsType())) {
       case 1:
         String size2 = smsBodyExtend.getRemindUrl();
         String[] aStrings2 = size2.split("\\?");
         for (int i = 0; i < aStrings2.length; i++) {
           if (aStrings2[i].contains("notifyId")) {
             String[] s = aStrings2[i].split("=");
             smsBodyExtend.setQid(Integer.valueOf(Integer.parseInt(s[1])));
             break;
           }
         }
         list.add(smsBodyExtend);
         break;
       case 11:
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
         list1.add(smsBodyExtend);
       }
     }
 
     if ((notifies != null) && (notifies.size() > 0)) {
       for (Notify notify : notifies) {
         if ((list == null) || (list.size() <= 0)) break;
         for (int i = 0; i < list.size(); i++) {
           if (notify.getNotifyId().equals(((SmsBodyExtend)list.get(i)).getQid())) {
             updatequerySmsByType("1", user.getUserId(), String.valueOf(notify.getNotifyId()));
           }
         }
 
       }
 
     }
 
     if ((voteItems != null) && (voteItems.size() > 0))
       for (VoteItem voteItems1 : voteItems) {
         if ((list == null) || (list.size() <= 0)) break;
         for (int i = 0; i < list1.size(); i++)
           if (voteItems1.getVoteId().equals(((SmsBodyExtend)list1.get(i)).getQid())) {
             String remingUrl = "manage/voteResult?resultId=" + voteItems1.getVoteId() + "&type=1";
             updatequerySmsByType("11", user.getUserId(), remingUrl);
           }
       }
   }
 
   public void querySmsByTypeUpdateRunId(String type, String runId)
   {
     Map map = new HashMap();
     String url = "%&runId=" + runId + "%";
     map.put("type", type);
     map.put("url", url);
     List smsList = this.smsMapper.querySmsByTypeUpdateRunId(map);
     if ((smsList != null) && (smsList.size() > 0)) {
       String[] toBeStored = (String[])smsList.toArray(new String[smsList.size()]);
       this.smsMapper.updateSmsUpdateRunId("1", toBeStored);
     }
   }
 }
