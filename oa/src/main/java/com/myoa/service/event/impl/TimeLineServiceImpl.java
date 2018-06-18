 package com.myoa.service.event.impl;
 
 import com.myoa.dao.event.TimeLineMapper;
import com.myoa.dao.event.TimeLinePostDeptMapper;
import com.myoa.dao.event.TimeLinePostRoleMapper;
import com.myoa.dao.event.TimeLinePostUserMapper;
import com.myoa.dao.event.TimeLineViewDeptMapper;
import com.myoa.dao.event.TimeLineViewRoleMapper;
import com.myoa.dao.event.TimeLineViewUserMapper;
import com.myoa.model.event.TimeLine;
import com.myoa.model.event.TimeLinePostDept;
import com.myoa.model.event.TimeLinePostRole;
import com.myoa.model.event.TimeLinePostUser;
import com.myoa.model.event.TimeLineViewDept;
import com.myoa.model.event.TimeLineViewRole;
import com.myoa.model.event.TimeLineViewUser;
import com.myoa.model.users.Users;
import com.myoa.service.event.TimeLineService;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.io.UnsupportedEncodingException;
 import java.util.List;
 import java.util.Map;
 import java.util.UUID;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;
 
 @Service
 public class TimeLineServiceImpl
   implements TimeLineService
 {
 
   @Resource
   TimeLineMapper timeLineMapper;
 
   @Resource
   TimeLineViewUserMapper timeLineViewUserMapper;
 
   @Resource
   TimeLineViewRoleMapper timeLineViewRoleMapper;
 
   @Resource
   TimeLineViewDeptMapper timeLineViewDeptMapper;
 
   @Resource
   TimeLinePostUserMapper timeLinePostUserMapper;
 
   @Resource
   TimeLinePostRoleMapper timeLinePostRoleMapper;
 
   @Resource
   TimeLinePostDeptMapper timeLinePostDeptMapper;
 
   public ToJson<TimeLine> getDetailByUuid(HttpServletRequest request, String uuid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       TimeLine timeLine = this.timeLineMapper.selectByPrimaryKey(uuid);
 
       List list = this.timeLineMapper.getDetailByUuid(uuid);
       if (list != null) {
         for (int i = 0; i < list.size(); i++) {
           String postDeptName = timeLine.getPostDeptName();
           String postRoleName = timeLine.getPostRoleName();
           String viewDeptName = timeLine.getViewDeptName();
           StringBuffer sb = new StringBuffer();
 
           if (i != postDeptName.length() - 1)
             sb.append(String.valueOf(postDeptName)).append(",");
           else {
             sb.append(String.valueOf(postDeptName));
           }
           if (i != postRoleName.length() - 1)
             sb.append(String.valueOf(postRoleName)).append(",");
           else {
             sb.append(String.valueOf(postRoleName));
           }
           if (i != viewDeptName.length() - 1)
             sb.append(String.valueOf(viewDeptName)).append(",");
           else {
             sb.append(String.valueOf(viewDeptName));
           }
         }
         toJson.setObject(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("数据为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineServiceImpl getDetailByUuid:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLine> getTimeLineByUuid(HttpServletRequest request, String uuid)
   {
     ToJson toJson = new ToJson(1, "error");
 
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
     TimeLine timeLine = this.timeLineMapper.selectTimeLineByUuid(uuid);
 
     List<TimeLineViewUser> timeLineViewUser = this.timeLineViewUserMapper.selectByUUID(uuid);
     StringBuffer name = new StringBuffer();
     StringBuffer id = new StringBuffer();
     for (TimeLineViewUser tlvu : timeLineViewUser) {
       if ((tlvu.getUserId() != null) && (tlvu.getUserName() != null)) {
         name.append(tlvu.getUserName() + ",");
         id.append(tlvu.getUserId() + ",");
       }
     }
     timeLine.setViewUserId(id.toString());
     timeLine.setViewUserName(name.toString());
 
     List<TimeLineViewRole> timeLineViewRoles = this.timeLineViewRoleMapper.selectByUUID(uuid);
     name.setLength(0);
     id.setLength(0);
     for (TimeLineViewRole tlvr : timeLineViewRoles) {
       if ((tlvr.getRoleId() != null) && (tlvr.getRoleName() != null)) {
         name.append(tlvr.getRoleName() + ",");
         id.append(tlvr.getRoleId() + ",");
       }
     }
     timeLine.setViewRoleId(id.toString());
     timeLine.setViewRoleName(name.toString());
 
     List<TimeLineViewDept> timeLineViewDepts = this.timeLineViewDeptMapper.selectByUUID(uuid);
     name.setLength(0);
     id.setLength(0);
     for (TimeLineViewDept tlvd : timeLineViewDepts) {
       if ((tlvd.getDeptId() != null) && (tlvd.getDeptName() != null)) {
         name.append(tlvd.getDeptName() + ",");
         id.append(tlvd.getDeptId() + ",");
       }
     }
     timeLine.setViewDeptId(id.toString());
     timeLine.setViewDeptName(name.toString());
 
     List<TimeLinePostUser> timeLinePostUsers = this.timeLinePostUserMapper.selectByUUID(uuid);
     name.setLength(0);
     id.setLength(0);
     for (TimeLinePostUser tlvu : timeLinePostUsers) {
       if ((tlvu.getUserId() != null) && (tlvu.getUserName() != null)) {
         name.append(tlvu.getUserName() + ",");
         id.append(tlvu.getUserId() + ",");
         if (tlvu.getUserId().toString().equals(users.getUserId())) {
           timeLine.setRight(true);
         }
       }
     }
     timeLine.setPostUserId(id.toString());
     timeLine.setPostUserName(name.toString());
 
     List<TimeLinePostRole> timeLinePostPostRoles = this.timeLinePostRoleMapper.selectByUUID(uuid);
     name.setLength(0);
     id.setLength(0);
     for (TimeLinePostRole tlvr : timeLinePostPostRoles) {
       if ((tlvr.getRoleId() != null) && (tlvr.getRoleName() != null)) {
         name.append(tlvr.getRoleName() + ",");
         id.append(tlvr.getRoleId() + ",");
         if (tlvr.getRoleId() == users.getUserPriv()) {
           timeLine.setRight(true);
         }
       }
     }
     timeLine.setPostRoleId(id.toString());
     timeLine.setPostRoleName(name.toString());
 
     List<TimeLinePostDept> imeLinePostDept = this.timeLinePostDeptMapper.selectByUUID(uuid);
     name.setLength(0);
     id.setLength(0);
     for (TimeLinePostDept tlvd : imeLinePostDept) {
       if ((tlvd.getDeptId() != null) && (tlvd.getDeptName() != null)) {
         name.append(tlvd.getDeptName() + ",");
         id.append(tlvd.getDeptId() + ",");
         if (tlvd.getDeptId() == users.getDeptId()) {
           timeLine.setRight(true);
         }
       }
     }
     timeLine.setPostDeptId(id.toString());
     timeLine.setPostDeptName(name.toString());
 
     if (timeLine.getCrUserId() == users.getUid()) {
       timeLine.setRight(true);
     }
     toJson.setObject(timeLine);
     toJson.setMsg("ok");
     toJson.setFlag(0);
     return toJson;
   }
 
   public ToJson<Object> getTimelineCode(HttpServletRequest request, String uuid)
   {
     return null;
   }
 
   public ToJson<TimeLine> getInforList(HttpServletRequest request, TimeLine timeLine)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Map map = new HashedMap();
     map.put("userId", users.getUid());
     map.put("deptId", users.getDeptId());
     map.put("roleId", users.getUserPriv());
     try
     {
       if (timeLine.getCrTime() == null) {
         timeLine.setCrTime(DateFormat.getCurrentTime());
       }
 
       if (users.getByname().equals("admin")) {
         List list1 = this.timeLineMapper.getInforList1(timeLine);
         if (list1 != null) {
           toJson.setObj(list1);
           toJson.setMsg("ok");
         } else {
           toJson.setMsg("列表数据为空");
         }
         toJson.setFlag(0);
       } else {
         List list = this.timeLineMapper.getInforList(timeLine);
         if (list != null) {
           toJson.setObj(list);
           toJson.setMsg("ok");
         } else {
           toJson.setMsg("列表数据为空");
         }
         toJson.setFlag(0);
       }
     }
     catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineServiceImpl getInforList:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLine> getInforList1(HttpServletRequest request, TimeLine timeLine)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Map map = new HashedMap();
     map.put("userId", users.getUid());
     map.put("deptId", users.getDeptId());
     map.put("roleId", users.getUserPriv());
     try
     {
       if (timeLine.getCrTime() == null) {
         timeLine.setCrTime(DateFormat.getCurrentTime());
       }
       List list = this.timeLineMapper.getInforList1(timeLine);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("列表数据为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineServiceImpl getInforList1:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLine> updateData(HttpServletRequest request, TimeLine timeLine, TimeLinePostDept timeLinePostDept, TimeLinePostRole timeLinePostRole, TimeLinePostUser timeLinePostUser, TimeLineViewDept timeLineViewDept, TimeLineViewRole timeLineViewRole, TimeLineViewUser timeLineViewUser, String post1, String post2, String post3, String view1, String view2, String view3)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       timeLinePostDept.setTimelineId(timeLine.getUuid());
       this.timeLinePostDeptMapper.deleteByPrimaryKey(timeLinePostDept.getTimelineId());
 
       if ((post3 != null) && (!"".equals(post3))) {
         String[] strArrary1 = post3.split(",");
         for (int i = 0; i < strArrary1.length; i++) {
           timeLinePostDept.setDeptId(Integer.valueOf(strArrary1[i]));
           timeLinePostDept.setTimelineId(timeLine.getUuid());
           this.timeLinePostDeptMapper.addTimeLinePostDept(timeLinePostDept);
         }
       }
 
       timeLinePostRole.setTimelineId(timeLine.getUuid());
       this.timeLinePostRoleMapper.deleteByPrimaryKey(timeLinePostRole.getTimelineId());
       if ((post2 != null) && (!"".equals(post2))) {
         String[] strArrary2 = post2.split(",");
         for (int i = 0; i < strArrary2.length; i++) {
           timeLinePostRole.setRoleId(Integer.valueOf(strArrary2[i]));
           timeLinePostRole.setTimelineId(timeLine.getUuid());
           this.timeLinePostRoleMapper.addTimeLinePostRole(timeLinePostRole);
         }
       }
 
       timeLinePostUser.setTimelineId(timeLine.getUuid());
       this.timeLinePostUserMapper.deleteByPrimaryKey(timeLinePostUser.getTimelineId());
       if ((post1 != null) && (!"".equals(post1))) {
         String[] strArrary3 = post1.split(",");
         for (int i = 0; i < strArrary3.length; i++) {
           timeLinePostUser.setUserId(strArrary3[i]);
           timeLinePostUser.setTimelineId(timeLine.getUuid());
           this.timeLinePostUserMapper.addTimeLinePostUser(timeLinePostUser);
         }
 
       }
 
       timeLineViewDept.setTimelineId(timeLine.getUuid());
       this.timeLineViewDeptMapper.deleteByPrimaryKey(timeLineViewDept.getTimelineId());
       if ((view3 != null) && (!"".equals(view3))) {
         String[] strArrary4 = view3.split(",");
         for (int i = 0; i < strArrary4.length; i++) {
           timeLineViewDept.setDeptId(Integer.valueOf(strArrary4[i]));
           timeLineViewDept.setTimelineId(timeLine.getUuid());
           this.timeLineViewDeptMapper.addTimeLineViewDept(timeLineViewDept);
         }
       }
       timeLineViewRole.setTimelineId(timeLine.getUuid());
       this.timeLineViewRoleMapper.deleteByPrimaryKey(timeLineViewRole.getTimelineId());
       if ((view2 != null) && (!"".equals(view2))) {
         String[] strArrary5 = view2.split(",");
         for (int i = 0; i < strArrary5.length; i++) {
           timeLineViewRole.setRoleId(Integer.valueOf(strArrary5[i]));
           timeLineViewRole.setTimelineId(timeLine.getUuid());
           this.timeLineViewRoleMapper.addTimeLineViewRole(timeLineViewRole);
         }
       }
 
       timeLineViewUser.setTimelineId(timeLine.getUuid());
       this.timeLineViewUserMapper.deleteByPrimaryKey(timeLineViewUser.getTimelineId());
       if ((view1 != null) && (!"".equals(view1))) {
         String[] strArrary6 = view1.split(",");
         for (int i = 0; i < strArrary6.length; i++) {
           timeLineViewUser.setUserId(strArrary6[i]);
           timeLineViewUser.setTimelineId(timeLine.getUuid());
           this.timeLineViewUserMapper.addTimeLineViewUser(timeLineViewUser);
         }
       }
       if (timeLine.getCrTime() == null) {
         timeLine.setCrTime(DateFormat.getCurrentTime());
       }
       if (timeLine.getTag() == null) {
         timeLine.setTag("");
       }
       int a = this.timeLineMapper.updateData(timeLine);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("更新失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineServiceImpl updateData:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLine> addData(HttpServletRequest request, TimeLine timeLine, String post1, String post2, String post3, String view1, String view2, String view3)
   {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       String uuid = UUID.randomUUID().toString().replaceAll("-", "");
       timeLine.setUuid(uuid);
 
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       timeLine.setCrUserId(users.getUid());
 
       TimeLinePostDept timeLinePostDept = new TimeLinePostDept();
       if ((post3 != null) && (!"".equals(post3))) {
         String[] strArrary1 = post3.split(",");
         for (int i = 0; i < strArrary1.length; i++) {
           timeLinePostDept.setTimelineId(uuid);
           timeLinePostDept.setDeptId(Integer.valueOf(strArrary1[i]));
           this.timeLinePostDeptMapper.addTimeLinePostDept(timeLinePostDept);
         }
 
       }
 
       if ((post2 != null) && (!"".equals(post2))) {
         TimeLinePostRole timeLinePostRole = new TimeLinePostRole();
         String[] strArrary2 = post2.split(",");
         for (int i = 0; i < strArrary2.length; i++) {
           timeLinePostRole.setTimelineId(uuid);
           timeLinePostRole.setRoleId(Integer.valueOf(strArrary2[i]));
           this.timeLinePostRoleMapper.addTimeLinePostRole(timeLinePostRole);
         }
       }
 
       if ((post1 != null) && (!"".equals(post1))) {
         TimeLinePostUser timeLinePostUser = new TimeLinePostUser();
         String[] strArrary3 = post1.split(",");
         for (int i = 0; i < strArrary3.length; i++) {
           timeLinePostUser.setTimelineId(uuid);
           timeLinePostUser.setUserId(strArrary3[i]);
           this.timeLinePostUserMapper.addTimeLinePostUser(timeLinePostUser);
         }
       }
 
       if ((view3 != null) && (!"".equals(view3))) {
         TimeLineViewDept timeLineViewDept = new TimeLineViewDept();
         String[] strArrary4 = view3.split(",");
         for (int i = 0; i < strArrary4.length; i++) {
           timeLineViewDept.setTimelineId(uuid);
           timeLineViewDept.setDeptId(Integer.valueOf(strArrary4[i]));
           this.timeLineViewDeptMapper.addTimeLineViewDept(timeLineViewDept);
         }
       }
 
       if ((view2 != null) && (!"".equals(view2))) {
         TimeLineViewRole timeLineViewRole = new TimeLineViewRole();
         String[] strArrary5 = view2.split(",");
         for (int i = 0; i < strArrary5.length; i++) {
           timeLineViewRole.setTimelineId(uuid);
           timeLineViewRole.setRoleId(Integer.valueOf(strArrary5[i]));
           this.timeLineViewRoleMapper.addTimeLineViewRole(timeLineViewRole);
         }
       }
 
       if ((view1 != null) && (!"".equals(view1))) {
         TimeLineViewUser timeLineViewUser = new TimeLineViewUser();
         String[] strArrary6 = view1.split(",");
         for (int i = 0; i < strArrary6.length; i++) {
           timeLineViewUser.setTimelineId(uuid);
           timeLineViewUser.setUserId(strArrary6[i]);
           this.timeLineViewUserMapper.addTimeLineViewUser(timeLineViewUser);
         }
       }
 
       if (timeLine.getCrTime() == null) {
         timeLine.setCrTime(DateFormat.getCurrentTime());
       }
       if (timeLine.getTag() == null) {
         timeLine.setTag("");
       }
       int a = this.timeLineMapper.addData(timeLine);
 
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("更新失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineServiceImpl addDate:" + e });
     }
     return toJson;
   }
 
   public ToJson<TimeLine> deleteByUuid(HttpServletRequest request, String uuid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.timeLineMapper.deleteByUuid(uuid);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("删除失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "TimeLineServiceImpl deleteByUuid:" + e });
     }
     return toJson;
   }
 
   public List<TimeLine> getTimelines(HttpServletRequest request)
     throws UnsupportedEncodingException
   {
     return getPageTimelines(request, null, null);
   }
 
   public List<TimeLine> getPageTimelines(HttpServletRequest request, PageParams page, Map map) throws UnsupportedEncodingException
   {
     request.setCharacterEncoding("UTF-8");
     if (map == null) {
       map = new HashedMap();
     }
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     map.put("id", users.getUid());
     map.put("userID", users.getUserId());
     map.put("deptId", users.getDeptId());
     map.put("roleId", users.getUserPriv());
     if ((page != null) && (page.getPageSize() != null) && (page.getPage() != null)) {
       int start = page.getPageSize().intValue() * (page.getPage().intValue() - 1);
       int end = page.getPageSize().intValue();
       map.put("start", Integer.valueOf(start));
       map.put("size", Integer.valueOf(end));
     }
     List<TimeLine> lists = this.timeLineMapper.getTimelines(map);
     for (TimeLine t : lists) {
       if (postTimelines(request, null, t.getUuid()).size() > 0) {
         t.setRight(true);
       }
     }
     return lists;
   }
 
   public List<TimeLine> postTimelines(HttpServletRequest request, PageParams page, String uuid)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Map map = new HashedMap();
     map.put("id", users.getUid());
     map.put("userID", users.getUserId());
     map.put("deptId", users.getDeptId());
     map.put("roleId", users.getUserPriv());
     map.put("title", request.getParameter("title"));
     map.put("tag", request.getParameter("tag"));
     if (uuid != null) {
       map.put("uuid", uuid);
     }
     if ((page != null) && (page.getPageSize() != null) && (page.getPage() != null)) {
       int start = page.getPageSize().intValue() * (page.getPage().intValue() - 1);
       int end = page.getPageSize().intValue();
       map.put("start", Integer.valueOf(start));
       map.put("size", Integer.valueOf(end));
     } else {
       map.put("start", Integer.valueOf(0));
       map.put("size", Integer.valueOf(10));
     }
     List<TimeLine> lists = this.timeLineMapper.postTimelines(map);
     for (TimeLine t : lists) {
       t.setRight(true);
     }
     return lists;
   }
 }

