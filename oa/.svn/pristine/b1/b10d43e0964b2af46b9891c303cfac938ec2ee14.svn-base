 package com.myoa.service.worldnews.impl;
 
 import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.users.UserPrivMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.dao.worldnews.NewsCommentMapper;
import com.myoa.dao.worldnews.NewsMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.department.Department;
import com.myoa.model.users.Users;
import com.myoa.model.worldnews.News;
import com.myoa.service.ThreadSerivice.ThreadService;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.sms.SmsService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.service.worldnews.NewService;
import com.myoa.util.DateFormat;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.page.PageParams;

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.apache.commons.collections.map.HashedMap;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class NewServiceImpl
   implements NewService
 {
 
   @Resource
   private NewsMapper newsMapper;
 
   @Resource
   private DepartmentService departmentService;
 
   @Resource
   private DepartmentMapper DepartmentMapper;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private UsersPrivService usersPrivService;
 
   @Resource
   private UserPrivMapper userPrivMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private SysCodeMapper sysCodeMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   @Resource
   private NewsCommentMapper newsCommentMapper;
 
   @Resource
   private SmsService smsService;
 
   @Autowired
   ThreadService threadService;
 
   public ToJson<News> selectNews(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name)
     throws Exception
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     ToJson newJson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
     String changeId = (String)maps.get("changeId");
     if (StringUtils.checkNull(changeId).booleanValue()) {
       newJson.setFlag(1);
       newJson.setMsg("err");
       return newJson;
     }
 
     List<News> list = this.newsMapper.selectNews(maps);
     if ("1".equals(changeId)) {
       for (News news : list) {
         news.setNewsDateTime(DateFormat.getStrDate(news.getNewsTime()));
         news.setProviderName(news.getUsers().getUserName());
         if ((news.getTypeId() != null) && (!news.getTypeId().equals(""))) {
           String name11 = this.sysCodeMapper.getNewsNameByNo(news.getTypeId());
           if (StringUtils.checkNull(name11).booleanValue())
             news.setTypeName("");
           else
             news.setTypeName(name11);
         }
         else {
           news.setTypeName("");
         }
         String depId = news.getToId();
         if (!StringUtils.checkNull(depId).booleanValue()) {
           String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
           if (!"ALL_DEPT".trim().equals(news.getToId()))
             news.setDeprange(depName + ",");
           else {
             news.setDeprange(depName);
           }
 
         }
 
         String userId = news.getUserId();
         if (!StringUtils.checkNull(userId).booleanValue()) {
           String userName = this.usersService.getUserNameById(userId);
           news.setUserrange(userName + ",");
         }
 
         String roleId = news.getPrivId();
         if (!StringUtils.checkNull(roleId).booleanValue()) {
           String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
           news.setRolerange(roleName + ",");
         }
 
         if (news.getReaders().indexOf(name) != -1)
           news.setRead(Integer.valueOf(1));
         else {
           news.setRead(Integer.valueOf(0));
         }
       }
       newJson.setFlag(0);
       newJson.setMsg("ok");
       newJson.setObj(list);
       newJson.setTotleNum(pageParams.getTotal());
     } else if ("2".equals(changeId)) {
       for (News news : list) {
         this.newsMapper.deleteNews(news.getNewsId());
       }
       newJson.setFlag(0);
       newJson.setMsg("ok");
       newJson.setObject(Integer.valueOf(list.size()));
     }
 
     return newJson;
   }
 
   public ToJson<News> unreadNews(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name, String sqlType)
     throws Exception
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     ToJson newJson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
 
     List<News> list = this.newsMapper.unreadNews(maps);
     List list1 = new ArrayList();
     List list2 = new ArrayList();
     for (News news : list) {
       Integer newsId = news.getNewsId();
       if (newsId != null) {
         int count = this.newsCommentMapper.getNewsCount(newsId);
         news.setNewsCount(Integer.valueOf(count));
       }
 
       news.setNewsDateTime(DateFormat.getStrDate(news.getNewsTime()));
       news.setProviderName(news.getUsers().getUserName());
       if ((news.getTypeId() != null) && (!news.getTypeId().equals(""))) {
         String name11 = this.sysCodeMapper.getNewsNameByNo(news.getTypeId());
         if (StringUtils.checkNull(name11).booleanValue())
           news.setTypeName("");
         else
           news.setTypeName(name11);
       }
       else {
         news.setTypeName(" ");
       }
       if ((news.getAttachmentName() != null) && (news.getAttachmentId() != null))
       {
         news.setAttachment(GetAttachmentListUtil.returnAttachment(news.getAttachmentName(), news.getAttachmentId(), sqlType, "news"));
       }
 
       String depId = news.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
         String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
         if (!"ALL_DEPT".trim().equals(news.getToId()))
           news.setDeprange(depName + ",");
         else {
           news.setDeprange(depName);
         }
 
       }
 
       String userId = news.getUserId();
       if (!StringUtils.checkNull(userId).booleanValue()) {
         String userName = this.usersService.getUserNameById(userId);
         news.setUserrange(userName + ",");
       }
 
       String roleId = news.getPrivId();
       if (!StringUtils.checkNull(roleId).booleanValue()) {
         String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
         news.setRolerange(roleName + ",");
       }
       if (news.getReaders().indexOf(name) != -1)
         news.setRead(Integer.valueOf(1));
       else {
         news.setRead(Integer.valueOf(0));
       }
     }
 
     newJson.setObj(list);
     newJson.setTotleNum(pageParams.getTotal());
     return newJson;
   }
 
   public ToJson<News> readNews(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name, String sqlType)
     throws Exception
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     ToJson newJson = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
 
     List<News> list = this.newsMapper.readNews(maps);
     for (News news : list) {
       Integer newsId = news.getNewsId();
       if (newsId != null) {
         int count = this.newsCommentMapper.getNewsCount(newsId);
         news.setNewsCount(Integer.valueOf(count));
       }
       news.setNewsDateTime(DateFormat.getStrDate(news.getNewsTime()));
       news.setProviderName(news.getUsers().getUserName());
       if ((news.getTypeId() != null) && (!news.getTypeId().equals(""))) {
         String name11 = this.sysCodeMapper.getNewsNameByNo(news.getTypeId());
         if (StringUtils.checkNull(name11).booleanValue())
           news.setTypeName("");
         else
           news.setTypeName(name11);
       }
       else {
         news.setTypeName(" ");
       }
       if ((news.getAttachmentName() != null) && (news.getAttachmentId() != null))
       {
         news.setAttachment(GetAttachmentListUtil.returnAttachment(news.getAttachmentName(), news.getAttachmentId(), sqlType, "news"));
       }
 
       String depId = news.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
         String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
         if (!"ALL_DEPT".trim().equals(news.getToId()))
           news.setDeprange(depName + ",");
         else {
           news.setDeprange(depName);
         }
 
       }
 
       String userId = news.getUserId();
       if (!StringUtils.checkNull(userId).booleanValue()) {
         String userName = this.usersService.getUserNameById(userId);
         news.setUserrange(userName + ",");
       }
 
       String roleId = news.getPrivId();
       if (!StringUtils.checkNull(roleId).booleanValue()) {
         String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
         news.setRolerange(roleName + ",");
       }
       if (news.getReaders().indexOf(name) != -1)
         news.setRead(Integer.valueOf(1));
       else {
         news.setRead(Integer.valueOf(0));
       }
 
     }
 
     newJson.setObj(list);
     newJson.setTotleNum(pageParams.getTotal());
     return newJson;
   }
 
   @Transactional
   public void sendNews(News news, String remind, String tuisong, HttpServletRequest request)
   {
     this.newsMapper.save(news);
     if ("1".equals(news.getPublish())) {
       String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
       this.threadService.addNew(news, remind, tuisong, sqlType);
     }
   }
 
   @Transactional
   public void updateNews(News news, String remind, String tuisong, HttpServletRequest request)
   {
     this.newsMapper.update(news);
     Map map = new HashedMap();
     map.put("newsId", news.getNewsId());
     News news1 = this.newsMapper.detailedNews(map);
     if ("1".equals(news1.getPublish())) {
       String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
       this.threadService.addNew(news1, remind, tuisong, sqlType);
     }
   }
 
   public News queryById(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name, String sqlType, String changId)
     throws Exception
   {
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     News news = this.newsMapper.detailedNews(maps);
     news.setNewsDateTime(DateFormat.getStrDate(news.getNewsTime()));
     news.setProviderName(news.getUsers().getUserName());
     if ((news.getTypeId() != null) && (!news.getTypeId().equals(""))) {
       String name11 = this.sysCodeMapper.getNewsNameByNo(news.getTypeId());
       if (StringUtils.checkNull(name11).booleanValue())
         news.setTypeName("");
       else
         news.setTypeName(name11);
     }
     else {
       news.setTypeName(" ");
     }
     if ((news.getAttachmentName() != null) && (news.getAttachmentId() != null)) {
       news.setAttachment(GetAttachmentListUtil.returnAttachment(news.getAttachmentName(), news.getAttachmentId(), sqlType, "news"));
     }
 
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
 
     String depId = news.getToId();
     if (!StringUtils.checkNull(depId).booleanValue()) {
       String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
       if (!"ALL_DEPT".trim().equals(news.getToId()))
         news.setDeprange(depName + ",");
       else {
         news.setDeprange(depName);
       }
 
     }
 
     String userId = news.getUserId();
     if (!StringUtils.checkNull(userId).booleanValue()) {
       String userName = this.usersService.getUserNameById(userId);
       news.setUserrange(userName + ",");
     }
 
     String roleId = news.getPrivId();
     if (!StringUtils.checkNull(roleId).booleanValue()) {
       String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
       news.setRolerange(roleName + ",");
     }
     if (!"1".equals(changId)) {
       if ((news.getReaders().indexOf(name) == -1) || (StringUtils.checkNull(news.getReaders()).booleanValue()))
       {
         this.smsService.updatequerySmsByType("14", name, String.valueOf(news.getNewsId()));
         StringBuffer str2 = new StringBuffer(news.getReaders());
         str2.append(name);
         str2.append(",");
         String str1 = str2.toString();
         news.setNewsId(news.getNewsId());
         news.setReaders(str1);
         news.setClickCount(Integer.valueOf(news.getClickCount().intValue() + 1));
         this.newsMapper.updateNews(news);
       }
       else {
         news.setNewsId(news.getNewsId());
         news.setClickCount(Integer.valueOf(news.getClickCount().intValue() + 1));
         this.newsMapper.updateclickCount(news);
       }
     }
     return news;
   }
 
   @Transactional
   public void deleteByPrimaryKey(Integer newsId)
   {
     this.newsMapper.deleteNews(newsId);
   }
 
   public ToJson<News> deleteByids(String[] newsId)
   {
     ToJson newsToJson = new ToJson();
     if (newsId.length > 0)
     {
       this.newsMapper.deleteByids(newsId);
     }
 
     newsToJson.setFlag(0);
     newsToJson.setMsg("ok");
     return newsToJson;
   }
 
   public ToJson<News> updayeByids(String[] newsId, String top, String publish)
   {
     ToJson newsToJson = new ToJson();
     if ((StringUtils.checkNull(top).booleanValue()) && (StringUtils.checkNull(publish).booleanValue())) {
       newsToJson.setFlag(1);
       newsToJson.setMsg("err");
       return newsToJson;
     }
     if (newsId.length > 0)
     {
       int a = this.newsMapper.updateByIds(top, publish, newsId);
       newsToJson.setFlag(0);
       newsToJson.setMsg("ok");
     } else {
       newsToJson.setFlag(1);
       newsToJson.setMsg("err");
     }
     return newsToJson;
   }
 
   public ToJson<News> ConsultTheSituationNew(String newsId)
   {
     ToJson newsToJson = new ToJson();
     Map maps = new HashMap();
     maps.put("newsId", newsId);
     News news = this.newsMapper.detailedNews(maps);
     if (news != null) {
       news.setNewsDateTime(DateFormat.getStrDate(news.getNewsTime()));
       news.setProviderName(news.getUsers().getUserName());
       List<Users> unreadList = this.usersMapper.unreadConsultTheSituationNew(maps);
       List<Users> readList = this.usersMapper.readConsultTheSituationNew(maps);
       List<Department> departmentList = this.departmentMapper.getDatagrid();
       for (Department department : departmentList) {
         StringBuffer stringBuffer = new StringBuffer();
         for (Users users : unreadList) {
           Integer depId = users.getDeptId();
           if (department.getDeptId().equals(depId)) {
             stringBuffer.append(users.getUserName());
             stringBuffer.append(",");
           }
         }
         department.setUnread(stringBuffer.toString());
         StringBuffer stringBuffer1 = new StringBuffer();
         for (Users users : readList) {
           Integer depId = users.getDeptId();
           if (department.getDeptId().equals(depId)) {
             stringBuffer1.append(users.getUserName());
             stringBuffer1.append(",");
           }
         }
         department.setRead(stringBuffer1.toString());
       }
       news.setReadSize(Integer.valueOf(readList.size()));
       news.setUnreadSize(Integer.valueOf(unreadList.size()));
       news.setDepartmentList(departmentList);
     }
 
     newsToJson.setFlag(0);
     newsToJson.setMsg("ok");
     newsToJson.setObject(news);
     return newsToJson;
   }
 
   public ToJson<News> selectNewsManage(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String name, String sqlType)
     throws Exception
   {
     ToJson newJson = new ToJson();
     String[] strArray = null;
     String[] strArray1 = null;
     String[] strArray2 = null;
     StringBuffer s = new StringBuffer();
     StringBuffer s1 = new StringBuffer();
     StringBuffer s2 = new StringBuffer();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     maps.put("page", pageParams);
     String typeIdStr = (String)maps.get("typeId");
     if (StringUtils.checkNull(typeIdStr).booleanValue()) {
       maps.put("typeId", null);
     }
     List<News> list = this.newsMapper.selectNewsManage(maps);
     List list1 = new ArrayList();
 
     for (News news : list) {
       Integer newsId = news.getNewsId();
       if (newsId != null) {
         int count = this.newsCommentMapper.getNewsCount(newsId);
         news.setNewsCount(Integer.valueOf(count));
       }
       news.setNewsDateTime(DateFormat.getStrDate(news.getNewsTime()));
       news.setProviderName(news.getUsers().getUserName());
       if ((news.getTypeId() != null) && (!news.getTypeId().equals(""))) {
         String name11 = this.sysCodeMapper.getNewsNameByNo(news.getTypeId());
         if (StringUtils.checkNull(name11).booleanValue())
           news.setTypeName("");
         else
           news.setTypeName(name11);
       }
       else {
         news.setTypeName(" ");
       }
       if ((news.getAttachmentName() != null) && (news.getAttachmentId() != null))
       {
         news.setAttachment(GetAttachmentListUtil.returnAttachment(news.getAttachmentName(), news.getAttachmentId(), sqlType, "news"));
       }
 
       String depId = news.getToId();
       if (!StringUtils.checkNull(depId).booleanValue()) {
         String depName = this.departmentService.getDeptNameByDeptId(depId, ",");
         news.setDeprange(depName);
       }
 
       String userId = news.getUserId();
       if (!StringUtils.checkNull(userId).booleanValue()) {
         String userName = this.usersService.getUserNameById(userId);
         news.setUserrange(userName);
       }
 
       String roleId = news.getPrivId();
       if (!StringUtils.checkNull(roleId).booleanValue()) {
         String roleName = this.usersPrivService.getPrivNameByPrivId(roleId, ",");
         news.setRolerange(roleName);
       }
       if (news.getReaders().indexOf(name) != -1)
         news.setRead(Integer.valueOf(1));
       else {
         news.setRead(Integer.valueOf(0));
       }
     }
 
     String button = (String)maps.get("button");
     if (StringUtils.checkNull(button).booleanValue()) {
       maps.put("typeId", null);
     }
     newJson.setObj(list);
     newJson.setTotleNum(pageParams.getTotal());
     return newJson;
   }
 
   public void updatePublish(News news, String remind, String tuisong, HttpServletRequest request)
   {
     this.newsMapper.updatePublish(news);
     Map map = new HashedMap();
     map.put("newsId", news.getNewsId());
     News news1 = this.newsMapper.detailedNews(map);
     if ("1".equals(news1.getPublish())) {
       String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
       this.threadService.addNew(news1, remind, tuisong, sqlType);
     }
   }
 
   public void updateNewsReades(News news, String remind, String tuisong, HttpServletRequest request)
   {
     this.newsMapper.updateNewsReades(news);
   }
 
   public BaseWrapper getNewCountByType(String type)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     List<News> news = this.newsMapper.getNewCountByType();
     Map temp = new HashMap();
     for (News item : news) {
       String key = "新闻";
       SysCode code = item.getCodes();
       if (code != null) {
         key = code.getCodeName();
       }
       if (temp.containsKey(key))
         temp.put(key, Integer.valueOf(((Integer)temp.get(key)).intValue() + 1));
       else {
         temp.put(key, Integer.valueOf(1));
       }
     }
     baseWrapper.setData(temp);
     baseWrapper.setFlag(true);
     baseWrapper.setStatus(true);
     return baseWrapper;
   }
 }

