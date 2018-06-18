 package com.myoa.service.widget.impl;
 
 import com.myoa.dao.calendar.CalendarMapper;
import com.myoa.dao.diary.DiaryModelMapper;
import com.myoa.dao.document.DocumentModelMapper;
import com.myoa.dao.email.EmailBodyMapper;
import com.myoa.dao.notify.NotifyMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.dao.widget.WidgetModuleMapper;
import com.myoa.dao.widget.WidgetSetMapper;
import com.myoa.dao.workflow.FlowRunMapper;
import com.myoa.dao.workflow.FlowRunPrcsMapper;
import com.myoa.dao.worldnews.NewsMapper;
import com.myoa.model.calender.CalendarAll;
import com.myoa.model.diary.DiaryModel;
import com.myoa.model.document.DocumentModelFlowRunPrcs;
import com.myoa.model.email.EmailBodyModel;
import com.myoa.model.users.Users;
import com.myoa.model.weather.OneDayWeatherInf;
import com.myoa.model.weather.WeatherInf;
import com.myoa.model.widget.WidgetDataModel;
import com.myoa.model.widget.WidgetModel;
import com.myoa.model.widget.WidgetSetModel;
import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.service.calender.CalenderService;
import com.myoa.service.email.EmailService;
import com.myoa.service.notify.NotifyService;
import com.myoa.service.users.UsersService;
import com.myoa.service.widget.WidgetService;
import com.myoa.service.workflow.flowtype.FlowRunPrcsService;
import com.myoa.service.worldnews.NewService;
import com.myoa.util.Constant;
import com.myoa.util.PinYinUtil;
import com.myoa.util.ToJson;
import com.myoa.util.WeatherUtil;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
 
 @Service
 public class WidgetServiceImpl
   implements WidgetService
 {
 
   @Resource
   private EmailBodyMapper emailBodyMapper;
 
   @Resource
   private EmailService emailService;
 
   @Resource
   private NotifyMapper notifyMapper;
 
   @Resource
   private NotifyService notifyService;
 
   @Resource
   private NewsMapper newsMapper;
 
   @Resource
   private NewService newService;
 
   @Resource
   private DiaryModelMapper diaryModelMapper;
 
   @Resource
   private CalendarMapper calendarMapper;
 
   @Resource
   private CalenderService calenderService;
 
   @Resource
   private FlowRunPrcsMapper flowRunPrcsMapper;
 
   @Resource
   private FlowRunPrcsService flowRunPrcsService;
 
   @Resource
   private WidgetModuleMapper widgetModuleMapper;
 
   @Resource
   private WidgetSetMapper widgetSetMapper;
 
   @Resource
   private DocumentModelMapper documentModelMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private FlowRunMapper flowRunMapper;
 
   @Resource
   UsersService usersService;
   private static final int WEATHER_ID = 1;
   private static final int CALENDAR_ID = 2;
   private static final int DIARY_ID = 3;
   private static final int EMAIL_ID = 4;
   private static final int NOTIFY_ID = 5;
   private static final int FLOWRUNPRCS_ID = 6;
   private static final int NEWS_ID = 7;
   private static final int DOCTMENT_ID = 8;
 
   public ToJson<WidgetSetModel> getWidgetToDoMsg(HttpServletRequest request, String cityName)
   {
     ToJson json = new ToJson();
     List dataList = new ArrayList();
     WidgetSetModel widgetSetModel = null;
     PageParams pageParams = new PageParams();
     pageParams.setPage(Integer.valueOf(1));
     pageParams.setPageSize(Integer.valueOf(5));
     pageParams.setUseFlag(Boolean.valueOf(true));
     try
     {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
       String local = getNowLanguage(request);
 
       widgetSetModel = this.widgetSetMapper.getWidgetSetByUid(user.getUid());
 
       if (widgetSetModel == null) {
         widgetSetModel = new WidgetSetModel();
         widgetSetModel.setUid(user.getUid());
         widgetSetModel.setBg("8");
         widgetSetModel.setModuleIds("1,2,4,5,");
         widgetSetModel.setType("1");
         this.widgetSetMapper.saveWidgetSet(widgetSetModel);
       }
       List<String> moduleIds = null;
       if ((widgetSetModel != null) && (!StringUtils.checkNull(widgetSetModel.getModuleIds()).booleanValue()))
         moduleIds = Arrays.asList(widgetSetModel.getModuleIds().split(","));
       Map maps;
       if ((moduleIds != null) && (moduleIds.size() > 0))
       {
         maps = new HashMap();
         maps.put("pageParams", pageParams);
         maps.put("fromId", user.getUserId());
         maps.put("userId", user.getUserId());
         maps.put("name", user.getUserId());
         maps.put("userPriv", user.getUserPriv());
         maps.put("deptId", user.getDeptId());
         for (String id : moduleIds) {
           switch (Integer.valueOf(id).intValue())
           {
           case 1:
             if (StringUtils.checkNull(cityName).booleanValue()) break;
             WidgetDataModel widgetDataModel = new WidgetDataModel();
             OneDayWeatherInf oneDayWeatherInf = null;
             try {
               WeatherInf weatherInf = WeatherUtil.resolveWeatherInf(cityName);
               if ((weatherInf != null) && (weatherInf.getWeatherInfs() != null) && (weatherInf.getWeatherInfs().length != 0)) {
                 oneDayWeatherInf = weatherInf.getWeatherInfs()[0];
               } else {
                 weatherInf = WeatherUtil.resolveWeatherInf("北京");
                 if ((weatherInf != null) && (weatherInf.getWeatherInfs() != null) && (weatherInf.getWeatherInfs().length != 0))
                   oneDayWeatherInf = weatherInf.getWeatherInfs()[0];
                 else {
                   break;
                 }
               }
               String weather = PinYinUtil.getPingYin(oneDayWeatherInf.getWeather());
               oneDayWeatherInf.setPicture("weather/" + weather + ".png");
 
               setWeiHao(oneDayWeatherInf);
             } catch (Exception e) {
               e.printStackTrace();
             }
             widgetDataModel.setData("weather");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("天气");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("天氣");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("Weather");
             }
             widgetDataModel.setObject(oneDayWeatherInf);
             dataList.add(widgetDataModel);
             break;
           case 4:
             maps.put("fromId", user.getUserId());
             String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
             List<EmailBodyModel> emailBodyModels = new ArrayList<EmailBodyModel>();
             try {
               ToJson emailBodyModelToJson = this.emailService.selectInbox(maps, Integer.valueOf(1), Integer.valueOf(5), true, sqlType);
               emailBodyModels = emailBodyModelToJson.getObj();
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (emailBodyModels == null) break;
             if (emailBodyModels.size() > 0) {
               for (EmailBodyModel e : emailBodyModels) {
                 if (e.getUsers() == null) {
                   e.setUsers(new Users());
                 }
               }
             }
               widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("email");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("邮件");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("郵件");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("E-mail");
             }
             widgetDataModel.setImg("widget/email.png");
             widgetDataModel.setData_info(emailBodyModels);
             dataList.add(widgetDataModel);
             break;
           case 5:
             maps.remove("fromId");
             List notifies = new ArrayList();
             try {
               ToJson json1 = this.notifyService.selectNotifyManage(maps, Integer.valueOf(1), Integer.valueOf(5), true, user.getUserId(), null);
               notifies = json1.getObj();
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (notifies == null) break;
               widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("notify");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("公告");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("公告");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("Notice");
             }
             widgetDataModel.setImg("widget/notify.png");
             widgetDataModel.setData_info(notifies);
             dataList.add(widgetDataModel);
             break;
           case 7:
             List news = new ArrayList();
             try {
               ToJson newsToJson = this.newService.selectNewsManage(maps, Integer.valueOf(1), Integer.valueOf(5), true, user.getUserId(), null);
               news = newsToJson.getObj();
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (news == null) break;
               widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("news");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("新闻");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("新聞");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("News");
             }
             widgetDataModel.setImg("widget/news.png");
             widgetDataModel.setData_info(news);
             dataList.add(widgetDataModel);
             break;
           case 3:
             List diaryList = new ArrayList();
             try {
               diaryList = this.diaryModelMapper.getDiarySelf(maps);
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (dataList == null) break;
               widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("diary");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("日志");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("日誌");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("Diary");
             }
             widgetDataModel.setImg("widget/diary.png");
             widgetDataModel.setData_info(diaryList);
             dataList.add(widgetDataModel);
             break;
           case 2:
             java.util.Calendar cal = java.util.Calendar.getInstance();
             cal.set(11, 0);
             cal.set(13, 0);
             cal.set(12, 0);
             cal.set(14, 0);
             int calTime = (int)(cal.getTimeInMillis() / 1000L);
             maps.put("calTime", Integer.valueOf(calTime));
             List calendarList = this.calendarMapper.getscheduleBycId(maps);
             SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
             SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
             List listAll = new ArrayList();
             com.myoa.model.calender.Calendar Allcal = new com.myoa.model.calender.Calendar();
             List list1 = new ArrayList();
             String data = format.format(new Date());
             for (int j = 0; j < calendarList.size(); j++) {
               com.myoa.model.calender.Calendar calendar = (com.myoa.model.calender.Calendar)calendarList.get(j);
               CalendarAll ca = new CalendarAll();
               int cT = calendar.getCalTime().intValue();
               int eT = calendar.getEndTime().intValue();
               Long ct = Long.valueOf(cT * 1000L);
               Long et = Long.valueOf(eT * 1000L);
               String s = f.format(ct);
               String e = f.format(et);
               calendar.setStim(s);
               calendar.setEtim(e);
               ca.setAddTime(calendar.getAddTime());
               ca.setCalId(calendar.getCalId());
               ca.setCalType(calendar.getCalType());
               ca.setEndTime(calendar.getEndTime());
               ca.setContent(calendar.getContent());
               ca.setCalLevel(calendar.getCalLevel());
               ca.setCalTime(calendar.getCalTime());
               ca.setTaker(calendar.getTaker());
               ca.setStim(calendar.getStim());
               ca.setEtim(calendar.getEtim());
               ca.setOwner(calendar.getOwner());
               list1.add(ca);
             }
             Allcal.setCalData(data);
             Allcal.setCalMessage(list1);
             listAll.add(Allcal);
 
             if (calendarList == null) break;
               widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("calendar");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("日程");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("日程");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("Schedule");
             }
             widgetDataModel.setImg("widget/calendar.png");
             widgetDataModel.setData_info(listAll);
             dataList.add(widgetDataModel);
             break;
           case 6:
             List flowRunPrcs = new ArrayList();
             try {
               ToJson flowRunPrcsToJson = this.flowRunPrcsService.selectObject(maps, Integer.valueOf(1), Integer.valueOf(5), true);
               flowRunPrcs = flowRunPrcsToJson.getObj();
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (flowRunPrcs == null) break;
               widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("flowRunPrcs");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("工作流");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("工作流");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("Workflow");
             }
             widgetDataModel.setImg("widget/flowRunPrcs.png");
             widgetDataModel.setData_info(flowRunPrcs);
             dataList.add(widgetDataModel);
             break;
           case 8:
             Map param = new HashMap();
             param.put("documentType", Integer.valueOf(0));
             param.put("page", Integer.valueOf(0));
             param.put("pageSize", Integer.valueOf(5));
             param.put("userId", user.getUserId());
             param.put("prcsFlag", Integer.valueOf(1));
             List<DocumentModelFlowRunPrcs> datas = new ArrayList<DocumentModelFlowRunPrcs>();
             try {
               datas = this.documentModelMapper.selWillDocSendOrReceive(param);
             } catch (Exception e) {
               e.printStackTrace();
             }
             for (DocumentModelFlowRunPrcs doc : datas) {
               if (!StringUtils.checkNull(doc.getCreateTime()).booleanValue()) {
                 doc.setCreateTime(doc.getCreateTime().substring(0, doc.getCreateTime().length() - 2));
               }
               if (!StringUtils.checkNull(doc.getPrcsTime()).booleanValue()) {
                 doc.setPrcsTime(doc.getPrcsTime().substring(0, doc.getPrcsTime().length() - 2));
               }
             }
             if (datas == null) break;
               widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("doctment");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("公文");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("公文");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("officialdocument");
             }
             widgetDataModel.setImg("widget/document.png");
             widgetDataModel.setData_info(datas);
             dataList.add(widgetDataModel);
           }
         }
 
       }
 
       widgetSetModel.setData(dataList);
       widgetSetModel.setCount(this.widgetModuleMapper.getAllCount());
       json.setObject(widgetSetModel);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<WidgetSetModel> getWeather(HttpServletRequest request, String cityName)
   {
     ToJson json = new ToJson();
     List dataList = new ArrayList();
     WidgetSetModel widgetSetModel = null;
     try
     {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
       String local = getNowLanguage(request);
       widgetSetModel = this.widgetSetMapper.getWidgetSetByUid(user.getUid());
 
       if (widgetSetModel == null) {
         widgetSetModel = new WidgetSetModel();
         widgetSetModel.setUid(user.getUid());
         widgetSetModel.setBg("8");
         widgetSetModel.setModuleIds("1,2,4,5,");
         widgetSetModel.setType("1");
         this.widgetSetMapper.saveWidgetSet(widgetSetModel);
       }
       List<String> moduleIds = null;
       if ((widgetSetModel != null) && (!StringUtils.checkNull(widgetSetModel.getModuleIds()).booleanValue())) {
         moduleIds = Arrays.asList(widgetSetModel.getModuleIds().split(","));
       }
 
       if ((moduleIds != null) && (moduleIds.size() > 0)) {
         for (String id : moduleIds) {
           switch (Integer.valueOf(id).intValue())
           {
           case 1:
             if (!StringUtils.checkNull(cityName).booleanValue()) {
               WidgetDataModel widgetDataModel = new WidgetDataModel();
               OneDayWeatherInf oneDayWeatherInf = null;
               try {
                 WeatherInf weatherInf = WeatherUtil.resolveWeatherInf(cityName);
                 if ((weatherInf != null) && (weatherInf.getWeatherInfs() != null) && (weatherInf.getWeatherInfs().length != 0)) {
                   oneDayWeatherInf = weatherInf.getWeatherInfs()[0];
                 } else {
                   weatherInf = WeatherUtil.resolveWeatherInf("北京");
                   if ((weatherInf != null) && (weatherInf.getWeatherInfs() != null) && (weatherInf.getWeatherInfs().length != 0))
                     oneDayWeatherInf = weatherInf.getWeatherInfs()[0];
                   else {
                     break;
                   }
                 }
                 String weather = PinYinUtil.getPingYin(oneDayWeatherInf.getWeather());
                 oneDayWeatherInf.setPicture("weather/" + weather + ".png");
 
                 setWeiHao(oneDayWeatherInf);
               } catch (Exception e) {
                 e.printStackTrace();
               }
               widgetDataModel.setData("weather");
               if (local.equals("zh_CN"))
                 widgetDataModel.setName("天气");
               else if (local.equals("zh_tw"))
                 widgetDataModel.setName("天氣");
               else if (local.equals("en_US")) {
                 widgetDataModel.setName("Weather");
               }
               widgetDataModel.setObject(oneDayWeatherInf);
               dataList.add(widgetDataModel);
             }
           }
 
         }
 
         label475: widgetSetModel.setData(dataList);
         widgetSetModel.setCount(this.widgetModuleMapper.getAllCount());
         json.setObject(widgetSetModel);
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<WidgetSetModel> getWidgetMsg(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     List dataList = new ArrayList();
     WidgetSetModel widgetSetModel = null;
     PageParams pageParams = new PageParams();
     pageParams.setPage(Integer.valueOf(1));
     pageParams.setPageSize(Integer.valueOf(5));
     pageParams.setUseFlag(Boolean.valueOf(true));
     try
     {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
       String local = getNowLanguage(request);
 
       widgetSetModel = this.widgetSetMapper.getWidgetSetByUid(user.getUid());
 
       if (widgetSetModel == null) {
         widgetSetModel = new WidgetSetModel();
         widgetSetModel.setUid(user.getUid());
         widgetSetModel.setBg("8");
         widgetSetModel.setModuleIds("1,2,4,5,");
         widgetSetModel.setType("1");
         this.widgetSetMapper.saveWidgetSet(widgetSetModel);
       }
       List<String> moduleIds = null;
       if ((widgetSetModel != null) && (!StringUtils.checkNull(widgetSetModel.getModuleIds()).booleanValue()))
         moduleIds = Arrays.asList(widgetSetModel.getModuleIds().split(","));
       Map maps;
       if ((moduleIds != null) && (moduleIds.size() > 0))
       {
         maps = new HashMap();
         maps.put("pageParams", pageParams);
         maps.put("fromId", user.getUserId());
         maps.put("userId", user.getUserId());
         maps.put("name", user.getUserId());
         maps.put("userPriv", user.getUserPriv());
         maps.put("deptId", user.getDeptId());
         for (String id : moduleIds) {
           switch (Integer.valueOf(id).intValue()) {
           case 1:
             WidgetDataModel widgetDataModel1 = new WidgetDataModel();
             OneDayWeatherInf oneDayWeatherInf = null;
             widgetDataModel1.setData("weather");
             if (local.equals("zh_CN"))
               widgetDataModel1.setName("天气");
             else if (local.equals("zh_tw"))
               widgetDataModel1.setName("天氣");
             else if (local.equals("en_US")) {
               widgetDataModel1.setName("Weather");
             }
             widgetDataModel1.setObject(oneDayWeatherInf);
             dataList.add(widgetDataModel1);
 
             break;
           case 4:
             maps.put("fromId", user.getUserId());
             String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
             List<EmailBodyModel> emailBodyModels = new ArrayList<EmailBodyModel>();
             try {
               ToJson emailBodyModelToJson = this.emailService.selectInbox(maps, Integer.valueOf(1), Integer.valueOf(5), true, sqlType);
               emailBodyModels = emailBodyModelToJson.getObj();
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (emailBodyModels == null) break;
             if (emailBodyModels.size() > 0) {
               for (EmailBodyModel e : emailBodyModels) {
                 if (e.getUsers() == null) {
                   e.setUsers(new Users());
                 }
               }
             }
             WidgetDataModel widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("email");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("邮件");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("郵件");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("E-mail");
             }
             widgetDataModel.setImg("widget/email.png");
             widgetDataModel.setData_info(emailBodyModels);
             dataList.add(widgetDataModel);
             break;
           case 5:
             maps.remove("fromId");
             List notifies = new ArrayList();
             try {
               ToJson json1 = this.notifyService.selectNotifyManage(maps, Integer.valueOf(1), Integer.valueOf(5), true, user.getUserId(), null);
               notifies = json1.getObj();
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (notifies == null) break;
              widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("notify");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("公告");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("公告");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("Notice");
             }
             widgetDataModel.setImg("widget/notify.png");
             widgetDataModel.setData_info(notifies);
             dataList.add(widgetDataModel);
             break;
           case 7:
             List news = new ArrayList();
             try {
               ToJson newsToJson = this.newService.selectNewsManage(maps, Integer.valueOf(1), Integer.valueOf(5), true, user.getUserId(), null);
               news = newsToJson.getObj();
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (news == null) break;
             widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("news");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("新闻");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("新聞");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("News");
             }
             widgetDataModel.setImg("widget/news.png");
             widgetDataModel.setData_info(news);
             dataList.add(widgetDataModel);
             break;
           case 3:
             maps.put("diaType", "1");
             List<DiaryModel> diaryList = new ArrayList<DiaryModel>();
             try {
               diaryList = this.diaryModelMapper.getDiaryList(maps);
               if ((diaryList != null) && (diaryList.size() > 0)) {
                 for (DiaryModel diaryModel : diaryList)
                   if (!StringUtils.checkNull(diaryModel.getToId()).booleanValue()) {
                     String toIdName = this.usersService.getUserNameById(diaryModel.getToId());
                     diaryModel.setToIdName(toIdName);
                   }
               }
             }
             catch (Exception e)
             {
               e.printStackTrace();
             }
             if (dataList == null) break;
             widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("diary");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("日志");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("日誌");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("Diary");
             }
             widgetDataModel.setImg("widget/diary.png");
             widgetDataModel.setData_info(diaryList);
             dataList.add(widgetDataModel);
             break;
           case 2:
             List calendarList = new ArrayList();
             List listAll = new ArrayList();
             try {
               java.util.Calendar cal = java.util.Calendar.getInstance();
               cal.set(11, 0);
               cal.set(13, 0);
               cal.set(12, 0);
               cal.set(14, 0);
               int calTime = (int)(cal.getTimeInMillis() / 1000L);
               maps.put("starTime", Integer.valueOf(calTime));
               calendarList = this.calendarMapper.getscheduleBycId(maps);
               SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
               SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
               com.myoa.model.calender.Calendar Allcal = new com.myoa.model.calender.Calendar();
               List list1 = new ArrayList();
               String data = format.format(new Date());
               for (int j = 0; j < calendarList.size(); j++) {
                 com.myoa.model.calender.Calendar calendar = (com.myoa.model.calender.Calendar)calendarList.get(j);
                 CalendarAll ca = new CalendarAll();
                 int cT = calendar.getCalTime().intValue();
                 int eT = calendar.getEndTime().intValue();
                 Long ct = Long.valueOf(cT * 1000L);
                 Long et = Long.valueOf(eT * 1000L);
                 String s = f.format(ct);
                 String e = f.format(et);
                 calendar.setStim(s);
                 calendar.setEtim(e);
                 ca.setAddTime(calendar.getAddTime());
                 ca.setCalId(calendar.getCalId());
                 ca.setCalType(calendar.getCalType());
                 ca.setEndTime(calendar.getEndTime());
                 ca.setContent(calendar.getContent());
                 ca.setCalLevel(calendar.getCalLevel());
                 ca.setCalTime(calendar.getCalTime());
                 ca.setTaker(calendar.getTaker());
                 ca.setStim(calendar.getStim());
                 ca.setEtim(calendar.getEtim());
                 ca.setOwner(calendar.getOwner());
                 Users users = this.usersMapper.findUsersByuserId(calendar.getUserId());
                 if (users != null)
                   ca.setUid(users.getUid());
                 else {
                   ca.setUid(null);
                 }
                 list1.add(ca);
               }
               Allcal.setCalData(data);
               Allcal.setCalMessage(list1);
               listAll.add(Allcal);
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (calendarList == null) break;
             widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("calendar");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("日程");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("日程");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("Schedule");
             }
             widgetDataModel.setImg("widget/calendar.png");
             widgetDataModel.setData_info(listAll);
             dataList.add(widgetDataModel);
             break;
           case 6:
             List<FlowRunPrcs> flowRunPrcs = new ArrayList();
             try {
               ToJson flowRunPrcsToJson = this.flowRunPrcsService.selectObject(maps, Integer.valueOf(1), Integer.valueOf(5), true);
               flowRunPrcs = flowRunPrcsToJson.getObj();
             } catch (Exception e) {
               e.printStackTrace();
             }
             if (flowRunPrcs == null) break;
             for (FlowRunPrcs flowRunPrcs1 : flowRunPrcs) {
               FlowRun flowRun = this.flowRunMapper.find(flowRunPrcs1.getRunId());
               flowRunPrcs1.setAvatar(this.usersMapper.findUsersByuserId(flowRun.getBeginUser()).getAvatar());
             }
             widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("flowRunPrcs");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("工作流");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("工作流");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("Workflow");
             }
             widgetDataModel.setImg("widget/flowRunPrcs.png");
             widgetDataModel.setData_info(flowRunPrcs);
             dataList.add(widgetDataModel);
             break;
           case 8:
             Map param = new HashMap();
             param.put("documentType", Integer.valueOf(0));
             param.put("page", Integer.valueOf(0));
             param.put("pageSize", Integer.valueOf(5));
             param.put("userId", user.getUserId());
             param.put("prcsFlag", Integer.valueOf(1));
             List<DocumentModelFlowRunPrcs> datas = new ArrayList<DocumentModelFlowRunPrcs>();
             try {
               datas = this.documentModelMapper.selWillDocSendOrReceive(param);
             } catch (Exception e) {
               e.printStackTrace();
             }
             for (DocumentModelFlowRunPrcs doc : datas) {
               if (!StringUtils.checkNull(doc.getCreateTime()).booleanValue()) {
                 doc.setCreateTime(doc.getCreateTime().substring(0, doc.getCreateTime().length() - 2));
               }
               if (!StringUtils.checkNull(doc.getPrcsTime()).booleanValue()) {
                 doc.setPrcsTime(doc.getPrcsTime().substring(0, doc.getPrcsTime().length() - 2));
               }
               Users users = this.usersMapper.findUsersByuserId(doc.getCreater());
               if (users != null) {
                 doc.setAvatar(users.getAvatar());
                 doc.setUid(users.getUid());
               } else {
                 doc.setAvatar("0");
                 doc.setUid(null);
                 doc.setCreaterName("此用户已禁用");
               }
             }
             if (datas == null) break;
             widgetDataModel = new WidgetDataModel();
             widgetDataModel.setData("doctment");
             if (local.equals("zh_CN"))
               widgetDataModel.setName("公文");
             else if (local.equals("zh_tw"))
               widgetDataModel.setName("公文");
             else if (local.equals("en_US")) {
               widgetDataModel.setName("officialdocument");
             }
             widgetDataModel.setImg("widget/document.png");
             widgetDataModel.setData_info(datas);
             dataList.add(widgetDataModel);
           }
         }
 
       }
 
       widgetSetModel.setData(dataList);
       widgetSetModel.setCount(this.widgetModuleMapper.getAllCount());
       json.setObject(widgetSetModel);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<WidgetSetModel> getUserSetByUid(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try
     {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
       String local = getNowLanguage(request);
 
       WidgetSetModel dataByUid = this.widgetSetMapper.getWidgetSetByUid(user.getUid());
 
       List<WidgetModel> on_module = this.widgetModuleMapper.getModelByIds(dataByUid.getModuleIds().split(","));
 
       List<WidgetModel> allModel = this.widgetModuleMapper.getAllModel();
 
       allModel.removeAll(on_module);
 
       for (WidgetModel widgetModel : allModel) {
         widgetModel.setAid(null);
         widgetModel.setTid(null);
         widgetModel.setNo(null);
         widgetModel.setIsOn(null);
         widgetModel.setIsSet(null);
         setImg(widgetModel);
         setLanguage(local, widgetModel);
       }
       dataByUid.setOff(allModel);
 
       for (WidgetModel widgetModel : on_module) {
         widgetModel.setAid(null);
         widgetModel.setTid(null);
         widgetModel.setNo(null);
         widgetModel.setIsOn(null);
         widgetModel.setIsSet(null);
         setImg(widgetModel);
         setLanguage(local, widgetModel);
       }
       dataByUid.setOn(on_module);
 
       dataByUid.setId(null);
       dataByUid.setType(null);
       dataByUid.setModuleIds(null);
 
       json.setObject(dataByUid);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
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
 
   private void setLanguage(String local, WidgetModel widgetModel) {
     if (widgetModel.getName().equals("天气")) {
       if (local.equals("zh_tw"))
         widgetModel.setName("天氣");
       else if (local.equals("en_US"))
         widgetModel.setName("Weather");
     }
     else if (widgetModel.getName().equals("邮件")) {
       if (local.equals("zh_tw"))
         widgetModel.setName("郵件");
       else if (local.equals("en_US"))
         widgetModel.setName("E-mail");
     }
     else if (widgetModel.getName().equals("公告")) {
       if (local.equals("zh_tw"))
         widgetModel.setName("公告");
       else if (local.equals("en_US"))
         widgetModel.setName("Notice");
     }
     else if (widgetModel.getName().equals("新闻")) {
       if (local.equals("zh_tw"))
         widgetModel.setName("新聞");
       else if (local.equals("en_US"))
         widgetModel.setName("News");
     }
     else if (widgetModel.getName().equals("日志")) {
       if (local.equals("zh_tw"))
         widgetModel.setName("日誌");
       else if (local.equals("en_US"))
         widgetModel.setName("Diary");
     }
     else if (widgetModel.getName().equals("日程")) {
       if (local.equals("zh_tw"))
         widgetModel.setName("日程");
       else if (local.equals("en_US"))
         widgetModel.setName("Schedule");
     }
     else if (widgetModel.getName().equals("工作流待办")) {
       if (local.equals("zh_tw"))
         widgetModel.setName("工作流待辦");
       else if (local.equals("en_US"))
         widgetModel.setName("Workflow");
     }
     else if (widgetModel.getName().equals("待办公文"))
       if (local.equals("zh_tw"))
         widgetModel.setName("待办公文");
       else if (local.equals("en_US"))
         widgetModel.setName("officialdocument");
   }
 
   public ToJson<WidgetSetModel> editWidgetSetModel(HttpServletRequest request, WidgetSetModel widgetSetModel)
   {
     ToJson json = new ToJson();
     try
     {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       widgetSetModel.setUid(user.getUid());
       this.widgetSetMapper.updateWidgetSet(widgetSetModel);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   private static void setImg(WidgetModel widgetModel)
   {
     switch (widgetModel.getId().intValue()) {
     case 1:
       widgetModel.setImg("widget/weather.png");
       break;
     case 2:
       widgetModel.setImg("widget/calendar.png");
       break;
     case 3:
       widgetModel.setImg("widget/diary.png");
       break;
     case 4:
       widgetModel.setImg("widget/email.png");
       break;
     case 5:
       widgetModel.setImg("widget/notify.png");
       break;
     case 6:
       widgetModel.setImg("widget/flowRunPrcs.png");
       break;
     case 7:
       widgetModel.setImg("widget/news.png");
       break;
     case 8:
       widgetModel.setImg("widget/doctment.png");
     }
   }
 
   private void setWeiHao(OneDayWeatherInf oneDayWeatherInf)
   {
     switch (oneDayWeatherInf.getWeek()) {
     case "周一":
       oneDayWeatherInf.setWeihao("0,5");
       break;
     case "周二":
       oneDayWeatherInf.setWeihao("1,6");
       break;
     case "周三":
       oneDayWeatherInf.setWeihao("2,7");
       break;
     case "周四":
       oneDayWeatherInf.setWeihao("3,8");
       break;
     case "周五":
       oneDayWeatherInf.setWeihao("4,9");
       break;
     case "周六":
       oneDayWeatherInf.setWeihao("不限行");
       break;
     case "周日":
       oneDayWeatherInf.setWeihao("不限行");
     }
   }
 }

