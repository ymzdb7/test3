 package com.myoa.service.meeting.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.hr.HrStaffInfoMapper;
import com.myoa.dao.meet.MeetingAttendConfirmMapper;
import com.myoa.dao.meet.MeetingMapper;
import com.myoa.dao.meet.MeetingRoomMapper;
import com.myoa.dao.users.UserPrivMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.calender.Calendar;
import com.myoa.model.hr.HrStaffInfo;
import com.myoa.model.meet.Meeting;
import com.myoa.model.meet.MeetingAttendConfirm;
import com.myoa.model.meet.MeetingRoom;
import com.myoa.model.meet.MeetingWithBLOBs;
import com.myoa.model.sms2.Sms2Priv;
import com.myoa.model.users.Users;
import com.myoa.service.ThreadSerivice.ThreadService;
import com.myoa.service.calender.CalenderService;
import com.myoa.service.meeting.MeetingService;
import com.myoa.service.sms.SmsService;
import com.myoa.service.smsDelivery.Sms2PrivService;
import com.myoa.util.Constant;
import com.myoa.util.DateFormat;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.io.PrintWriter;
 import java.net.URLEncoder;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.commons.collections.map.HashedMap;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class MeetingServiceImpl
   implements MeetingService
 {
 
   @Resource
   private MeetingMapper meetingMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private MeetingRoomMapper meetingRoomMapper;
 
   @Resource
   private MeetingAttendConfirmMapper meetingAttendConfirmMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   @Resource
   private UserPrivMapper userPrivMapper;
 
   @Resource
   private CalenderService calenderService;
 
   @Resource
   private HrStaffInfoMapper hrStaffInfoMapper;
 
   @Resource
   ThreadService threadService;
 
   @Resource
   private SmsService smsService;
 
   @Resource
   private Sms2PrivService sms2PrivService;
 
   public ToJson<MeetingWithBLOBs> queryMeeting(MeetingWithBLOBs meetingWithBLOBs, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson(1, "error");
     try
     {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       Map map = new HashMap();
       map.put("page", pageParams);
 
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       long currentTime = Long.valueOf(DateFormat.getTime(sdf.format(date)).intValue()).longValue();
       List<MeetingWithBLOBs> meetingList = new ArrayList();
       if ((meetingWithBLOBs.getStatus() != null) && (
         (meetingWithBLOBs.getStatus().intValue() == 3) || (meetingWithBLOBs.getStatus().intValue() == 5))) {
         meetingWithBLOBs.setCurrentTime(sdf.format(date));
       }
 
       map.put("meetingWithBLOBs", meetingWithBLOBs);
       meetingList = this.meetingMapper.queryMeeting(map);
       if ((meetingWithBLOBs.getStatus() != null) && 
         (meetingWithBLOBs.getStatus().intValue() == 2)) {
         meetingList = approveMeeting(meetingWithBLOBs, page, pageSize, useFlag);
       }
 
       for (MeetingWithBLOBs meeting : meetingList) {
         if (meeting.getUid() != null) {
           meeting.setUserName(this.usersMapper.getUsernameById(meeting.getUid().intValue()));
         }
         if (meeting.getManagerId() != null) {
           meeting.setManagerName(this.usersMapper.getUsernameById(meeting.getManagerId().intValue()));
         }
         if (meeting.getMeetRoomId() != null) {
           MeetingRoom meetingRoom = this.meetingRoomMapper.getMeetRoomBySid(Integer.valueOf(meeting.getMeetRoomId().intValue()));
           if (meetingRoom != null) {
             meeting.setMeetRoomName(meetingRoom.getMrName());
           }
         }
         long startTime = 0L;
         long endTime = 0L;
         if (!StringUtils.checkNull(meeting.getStartTime()).booleanValue()) {
           startTime = DateFormat.getTime(meeting.getStartTime()).intValue();
         }
         if (!StringUtils.checkNull(meeting.getEndTime()).booleanValue()) {
           endTime = DateFormat.getTime(meeting.getEndTime()).intValue();
         }
 
         if (meeting.getStatus() != null) {
           switch (meeting.getStatus().intValue()) {
           case 1:
             meeting.setStatusName("待审批");
             meeting.setStatus(Integer.valueOf(1));
             break;
           case 2:
             if ((startTime <= currentTime) && (currentTime < endTime)) {
               meeting.setStatusName("进行中");
               meeting.setStatus(Integer.valueOf(3));
             } else if ((startTime <= currentTime) && (currentTime >= endTime)) {
               meeting.setStatusName("已结束");
               meeting.setStatus(Integer.valueOf(5));
             } else {
               meeting.setStatusName("已审批");
               meeting.setStatus(Integer.valueOf(2));
             }
             break;
           case 4:
             meeting.setStatusName("未批准");
             meeting.setStatus(Integer.valueOf(4));
             break;
           case 5:
             meeting.setStatusName("已结束");
             meeting.setStatus(Integer.valueOf(5));
           case 3:
           }
         }
 
         if (!StringUtils.checkNull(meeting.getStartTime()).booleanValue()) {
           meeting.setStartTime(meeting.getStartTime().substring(0, meeting.getStartTime().length() - 2));
         }
         if (!StringUtils.checkNull(meeting.getEndTime()).booleanValue()) {
           meeting.setEndTime(meeting.getEndTime().substring(0, meeting.getEndTime().length() - 2));
         }
         if (!StringUtils.checkNull(meeting.getCreateTime()).booleanValue()) {
           meeting.setCreateTime(meeting.getCreateTime().substring(0, meeting.getCreateTime().length() - 2));
         }
       }
       json.setObj(meetingList);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl queryMeeting:" + e });
     }
     return json;
   }
 
   public ToJson<MeetingWithBLOBs> getMyMeeting(HttpServletRequest request, MeetingWithBLOBs meetingWithBLOBs, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson(1, "error");
     try
     {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       Map map = new HashMap();
       map.put("page", pageParams);
 
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       meetingWithBLOBs.setUid(user.getUid());
       map.put("meetingWithBLOBs", meetingWithBLOBs);
 
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       long currentTime = Long.valueOf(DateFormat.getTime(sdf.format(date)).intValue()).longValue();
       List<MeetingWithBLOBs> meetingList = meetingList = this.meetingMapper.getMyMeeting(map);
       for (MeetingWithBLOBs meeting : meetingList) {
         if (meeting.getUid() != null) {
           meeting.setUserName(this.usersMapper.getUsernameById(meeting.getUid().intValue()));
         }
         if (meeting.getMeetRoomId() != null) {
           MeetingRoom meetingRoom = this.meetingRoomMapper.getMeetRoomBySid(Integer.valueOf(meeting.getMeetRoomId().intValue()));
           if (meetingRoom != null) {
             meeting.setMeetRoomName(meetingRoom.getMrName());
           }
         }
         long startTime = 0L;
         long endTime = 0L;
         if (!StringUtils.checkNull(meeting.getStartTime()).booleanValue()) {
           startTime = DateFormat.getTime(meeting.getStartTime()).intValue();
         }
         if (!StringUtils.checkNull(meeting.getEndTime()).booleanValue()) {
           endTime = DateFormat.getTime(meeting.getEndTime()).intValue();
         }
 
         if (meeting.getStatus() != null) {
           switch (meeting.getStatus().intValue()) {
           case 1:
             meeting.setStatusName("待审批");
             break;
           case 2:
             if ((startTime <= currentTime) && (currentTime < endTime))
               meeting.setStatusName("进行中");
             else if ((startTime <= currentTime) && (currentTime >= endTime))
               meeting.setStatusName("已结束");
             else {
               meeting.setStatusName("已审批");
             }
             break;
           case 4:
             meeting.setStatusName("未批准");
             break;
           case 5:
             meeting.setStatusName("已结束");
           case 3:
           }
         }
 
         if (!StringUtils.checkNull(meeting.getStartTime()).booleanValue()) {
           meeting.setStartTime(meeting.getStartTime().substring(0, meeting.getStartTime().length() - 2));
         }
         if (!StringUtils.checkNull(meeting.getEndTime()).booleanValue()) {
           meeting.setEndTime(meeting.getEndTime().substring(0, meeting.getEndTime().length() - 2));
         }
         if (!StringUtils.checkNull(meeting.getCreateTime()).booleanValue()) {
           meeting.setCreateTime(meeting.getCreateTime().substring(0, meeting.getCreateTime().length() - 2));
         }
       }
       json.setObj(meetingList);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl getMyMeeting:" + e });
     }
     return json;
   }
 
   public ToJson<MeetingWithBLOBs> queryMeetingById(HttpServletRequest request, HttpServletResponse response, String sid, int output)
   {
     ToJson json = new ToJson(1, "error");
     try {
       MeetingWithBLOBs meetingWithBLOBs = this.meetingMapper.queryMeetingById(sid);
 
       List attachmentList = new ArrayList();
       if ((meetingWithBLOBs.getAttachmentName() != null) && (!"".equals(meetingWithBLOBs.getAttachmentName()))) {
         attachmentList = GetAttachmentListUtil.returnAttachment(meetingWithBLOBs.getAttachmentName(), meetingWithBLOBs.getAttachmentId(), Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), "meeting");
       }
       meetingWithBLOBs.setAttachmentList(attachmentList);
       if (!StringUtils.checkNull(meetingWithBLOBs.getAttendee()).booleanValue()) {
         StringBuffer attendName = new StringBuffer();
         String[] attendArray = meetingWithBLOBs.getAttendee().split(",");
         int i = 1;
         for (String attend : attendArray) {
           if (this.usersMapper.getUsernameById(attend) != null) {
             if (i < attendArray.length)
               attendName.append(this.usersMapper.getUsernameById(attend) + ",");
             else {
               attendName.append(this.usersMapper.getUsernameById(attend));
             }
           }
           i++;
         }
         meetingWithBLOBs.setAttendeeName(attendName.toString());
       }
       if (meetingWithBLOBs.getRecorderId() != null) {
         meetingWithBLOBs.setRecorderName(this.usersMapper.getUsernameById(meetingWithBLOBs.getRecorderId().intValue()));
       }
       if (meetingWithBLOBs.getManagerId() != null) {
         meetingWithBLOBs.setManagerName(this.usersMapper.getUsernameById(meetingWithBLOBs.getManagerId().intValue()));
       }
       if (meetingWithBLOBs.getUid() != null) {
         meetingWithBLOBs.setUserName(this.usersMapper.getUsernameById(meetingWithBLOBs.getUid().intValue()));
       }
       if (meetingWithBLOBs.getMeetRoomId() != null) {
         MeetingRoom meetingRoom = this.meetingRoomMapper.getMeetRoomBySid(Integer.valueOf(meetingWithBLOBs.getMeetRoomId().intValue()));
         if (meetingRoom != null) {
           meetingWithBLOBs.setMeetRoomName(meetingRoom.getMrName());
         }
       }
       if (!StringUtils.checkNull(meetingWithBLOBs.getStartTime()).booleanValue()) {
         meetingWithBLOBs.setStartTime(meetingWithBLOBs.getStartTime().substring(0, meetingWithBLOBs.getStartTime().length() - 2));
       }
       if (!StringUtils.checkNull(meetingWithBLOBs.getEndTime()).booleanValue()) {
         meetingWithBLOBs.setEndTime(meetingWithBLOBs.getEndTime().substring(0, meetingWithBLOBs.getEndTime().length() - 2));
       }
       if (!StringUtils.checkNull(meetingWithBLOBs.getCreateTime()).booleanValue()) {
         meetingWithBLOBs.setCreateTime(meetingWithBLOBs.getCreateTime().substring(0, meetingWithBLOBs.getCreateTime().length() - 2));
       }
       long startTime = 0L;
       long endTime = 0L;
       if (!StringUtils.checkNull(meetingWithBLOBs.getStartTime()).booleanValue()) {
         startTime = DateFormat.getTime(meetingWithBLOBs.getStartTime()).intValue();
       }
       if (!StringUtils.checkNull(meetingWithBLOBs.getEndTime()).booleanValue()) {
         endTime = DateFormat.getTime(meetingWithBLOBs.getEndTime()).intValue();
       }
 
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       long currentTime = Long.valueOf(DateFormat.getTime(sdf.format(date)).intValue()).longValue();
       if (meetingWithBLOBs.getStatus() != null) {
         switch (meetingWithBLOBs.getStatus().intValue()) {
         case 1:
           meetingWithBLOBs.setStatusName("待审批");
           meetingWithBLOBs.setStatus(Integer.valueOf(1));
           break;
         case 2:
           if ((startTime <= currentTime) && (currentTime < endTime)) {
             meetingWithBLOBs.setStatusName("进行中");
             meetingWithBLOBs.setStatus(Integer.valueOf(3));
           } else if ((startTime <= currentTime) && (currentTime >= endTime)) {
             meetingWithBLOBs.setStatusName("已结束");
             meetingWithBLOBs.setStatus(Integer.valueOf(5));
           } else {
             meetingWithBLOBs.setStatusName("已审批");
             meetingWithBLOBs.setStatus(Integer.valueOf(2));
           }
           break;
         case 4:
           meetingWithBLOBs.setStatusName("未批准");
           meetingWithBLOBs.setStatus(Integer.valueOf(4));
           break;
         case 5:
           meetingWithBLOBs.setStatusName("已结束");
           meetingWithBLOBs.setStatus(Integer.valueOf(5));
         case 3:
         }
 
         Map map = new HashedMap();
         Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
         map.put("meetingId", sid);
         map.put("attendeeId", user.getUid());
         MeetingAttendConfirm meetingAttendConfirm = this.meetingAttendConfirmMapper.queryMyAttend(map);
         if (meetingAttendConfirm != null) {
           if (meetingAttendConfirm.getAttendFlag().equals(Integer.valueOf(1))) {
             meetingWithBLOBs.setMyAttend("已签到");
             meetingWithBLOBs.setMyAttendStatus(Integer.valueOf(1));
           } else {
             meetingWithBLOBs.setMyAttend("未签到");
             meetingWithBLOBs.setMyAttendStatus(Integer.valueOf(0));
           }
         }
         this.smsService.updatequerySmsByType("8", user.getUserId(), String.valueOf(sid));
       }
 
       if (output == 1)
       {
         List<MeetingAttendConfirm> meetingAttendConfirmList = this.meetingAttendConfirmMapper.queryAttendByMeetId(sid);
         StringBuffer realAttendName = new StringBuffer();
         for (MeetingAttendConfirm meetingAttendConfirm : meetingAttendConfirmList) {
           if ((meetingAttendConfirm.getAttendeeId() != null) && 
             (!StringUtils.checkNull(this.usersMapper.getUsernameById(meetingAttendConfirm.getAttendeeId().intValue())).booleanValue())) {
             realAttendName.append(this.usersMapper.getUsernameById(meetingAttendConfirm.getAttendeeId().intValue()) + ",");
           }
         }
 
         if (!StringUtils.checkNull(realAttendName.toString()).booleanValue()) {
           meetingWithBLOBs.setRealAttendeeName(realAttendName.toString().substring(0, realAttendName.length() - 1));
         }
         response.setContentType("text/html");
         response.setCharacterEncoding("utf-8");
         response.setHeader("Cache-control", "private");
         response.setContentType("application/octet-stream");
         response.setHeader("Accept-Ranges", "bytes");
         response.setHeader("Cache-Control", "maxage=3600");
         response.setHeader("Pragma", "public");
 
         response.setHeader("Content-disposition", "attachment; filename=\"" + URLEncoder.encode("会议信息导出.html", "UTF-8") + "\"");
 
         StringBuilder sb = new StringBuilder();
         PrintWriter out = response.getWriter();
         out.write("<html>");
         out.write("<head>");
         out.write("<title>会议信息导出</title>");
         out.write("<meta http-equiv=\"Content-Type\" content=\"text>");
         out.write("</head>");
         out.write("<body>");
         out.write("<table><tr>");
         out.write("<td><span>会议名称:<td>");
         out.write("<td><span>" + meetingWithBLOBs.getMeetName() + "<td>");
         out.write("</tr>");
         out.write("<tr>");
         out.write("<td><span>会议主题:<td>");
         out.write("<td><span>" + meetingWithBLOBs.getSubject() + "<td>");
         out.write("</tr>");
         out.write("<tr>");
         out.write("<td><span>会议时间:<td>");
         out.write("<td><span>" + meetingWithBLOBs.getStartTime() + "<span><span>" + meetingWithBLOBs.getEndTime() + "<td>");
         out.write("</tr>");
         out.write("<tr>");
         out.write("<td><span>参会人:<td>");
         out.write("<td><span>" + meetingWithBLOBs.getRealAttendeeName() + "<td>");
         out.write("</tr>");
         out.write("<tr>");
         out.write("<td><span>会议描述:<td>");
         out.write("<td><span>" + meetingWithBLOBs.getMeetDesc() + "<td>");
         out.write("</tr>");
         out.write("<tr>");
         out.write("<td>会议纪要:</td>");
         out.write("<td><span>" + meetingWithBLOBs.getSummary() + "<td>");
         out.write("</tr>");
         out.write("</table>");
         out.write("</body>");
         out.write("</html>");
       }
 
       json.setObject(meetingWithBLOBs);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl queryMeetingById:" + e });
     }
     return json;
   }
 
   @Transactional
   public ToJson<MeetingWithBLOBs> updateMeetingById(MeetingWithBLOBs meetingWithBLOBs)
   {
     ToJson json = new ToJson(1, "error");
     try {
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       meetingWithBLOBs.setCreateTime(sdf.format(date));
       int count = this.meetingMapper.updateMeetingById(meetingWithBLOBs);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl updateMeetingById:" + e });
     }
     return json;
   }
 
   @Transactional
   public ToJson<MeetingWithBLOBs> updMeetStatusById(HttpServletRequest request, Meeting meeting)
   {
     ToJson json = new ToJson(1, "error");
     int count = 0;
     try {
       if (meeting.getStatus().intValue() == 2)
       {
         MeetingWithBLOBs meetingWithBLOBs = this.meetingMapper.queryMeetingById(meeting.getSid().toString());
         Map map = new HashedMap();
         map.put("meetRoomId", meetingWithBLOBs.getMeetRoomId());
         int useRommTotalCount = this.meetingMapper.selCountRoomNoConflict(map);
         map.put("startTime", meetingWithBLOBs.getStartTime());
         map.put("endTime", meetingWithBLOBs.getEndTime());
         int useRommNoConflictCount = this.meetingMapper.selCountRoomNoConflict(map);
         if (useRommTotalCount == useRommNoConflictCount) {
           Date date = new Date();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           MeetingAttendConfirm meetingAttendConfirm = new MeetingAttendConfirm();
           meetingAttendConfirm.setAttendFlag(Integer.valueOf(0));
           meetingAttendConfirm.setCreateTime(sdf.format(date));
           meetingAttendConfirm.setMeetingId(meetingWithBLOBs.getSid());
           meetingAttendConfirm.setReadFlag(Integer.valueOf(0));
           meetingAttendConfirm.setRemark("");
           Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
           meetingAttendConfirm.setCreateUser(user.getUid());
           if (!StringUtils.checkNull(meetingWithBLOBs.getAttendee()).booleanValue()) {
             String[] attendArray = meetingWithBLOBs.getAttendee().split(",");
             if (attendArray.length > 0) {
               for (String attendId : attendArray) {
                 meetingAttendConfirm.setAttendeeId(Integer.valueOf(attendId));
                 count += this.meetingAttendConfirmMapper.insertConfirm(meetingAttendConfirm);
               }
             }
           }
 
           Calendar calendar = new Calendar();
           calendar.setContent("会议：" + meetingWithBLOBs.getSubject());
           calendar.setCalType("1");
           if (!StringUtils.checkNull(meetingWithBLOBs.getStartTime()).booleanValue()) {
             calendar.setCalTime(DateFormat.getTime(meetingWithBLOBs.getStartTime()));
           }
           if (!StringUtils.checkNull(meetingWithBLOBs.getEndTime()).booleanValue()) {
             calendar.setEndTime(DateFormat.getTime(meetingWithBLOBs.getEndTime()));
           }
           calendar.setAddTime(date);
           calendar.setUserId(user.getUserId());
           calendar.setCalLevel("1");
           calendar.setBeforeRemaind("0|" + meetingWithBLOBs.getResendHour() + "|" + meetingWithBLOBs.getResendMinute());
           String[] takerArray = meetingWithBLOBs.getAttendee().split(",");
           StringBuffer takerStr = new StringBuffer();
           for (String uid : takerArray) {
             if (!StringUtils.checkNull(uid).booleanValue()) {
               Users userTemp = this.usersMapper.findUserByuid(Integer.valueOf(uid).intValue());
               if ((userTemp == null) || 
                 (StringUtils.checkNull(userTemp.getUserId()).booleanValue())) continue;
               takerStr.append(userTemp.getUserId() + ",");
             }
 
           }
 
           calendar.setTaker(takerStr.toString());
           this.calenderService.insertSelective(calendar);
           String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
           this.threadService.addMeeting(user, meetingWithBLOBs, sqlType);
         } else {
           json.setMsg("会议室已被占用,请重新修改时间");
           json.setFlag(1);
           return json;
         }
       }
       count += this.meetingMapper.updMeetStatusById(meeting);
       if (count > 0) {
         MeetingWithBLOBs meetingWithBLOBs = this.meetingMapper.queryMeetingByIdInt(meeting.getSid());
         Sms2Priv sms2Priv = new Sms2Priv();
         StringBuffer contextString = null;
         if ((meetingWithBLOBs.getSmsRemind().equals("0")) && (!meetingWithBLOBs.getSubject().equals(""))) {
           sms2Priv.setResendHour(meetingWithBLOBs.getResendHour());
           sms2Priv.setResendMinute(meetingWithBLOBs.getResendMinute());
           sms2Priv.setUserId(meetingWithBLOBs.getAttendee());
           contextString = new StringBuffer(meetingWithBLOBs.getSubject());
 
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           String StartTime = meetingWithBLOBs.getStartTime();
           Date date = sdf.parse(StartTime);
           date.setHours(date.getHours() - meetingWithBLOBs.getResendHour().intValue());
           date.setMinutes(date.getMinutes() - meetingWithBLOBs.getResendMinute().intValue());
           SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           meetingWithBLOBs.setStartTime(sdf1.format(date));
           sms2Priv.setStartTime(meetingWithBLOBs.getStartTime());
         }
 
         this.sms2PrivService.selSenderMobile(meetingWithBLOBs.getSmsRemind(), sms2Priv, contextString, request);
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl updMeetStatusById:" + e });
     }
     return json;
   }
 
   @Transactional
   public ToJson<MeetingWithBLOBs> insertMeeting(MeetingWithBLOBs meetingWithBLOBs, HttpServletRequest request)
   {
     ToJson json = new ToJson(1, "error");
     try {
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       meetingWithBLOBs.setCreateTime(sdf.format(date));
       meetingWithBLOBs.setStatus(Integer.valueOf(1));
       Map map = new HashedMap();
       map.put("meetRoomId", meetingWithBLOBs.getMeetRoomId());
       int useRommTotalCount = this.meetingMapper.selCountRoomNoConflict(map);
       map.put("startTime", meetingWithBLOBs.getStartTime());
       map.put("endTime", meetingWithBLOBs.getEndTime());
       int useRommNoConflictCount = this.meetingMapper.selCountRoomNoConflict(map);
       if (useRommTotalCount == useRommNoConflictCount) {
         int count = this.meetingMapper.insertMeeting(meetingWithBLOBs);
         if (count > 0) {
           json.setMsg("申请成功");
           json.setFlag(0);
         }
       } else {
         json.setMsg("该会议室已被占用");
         json.setFlag(1);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl insertMeeting:" + e });
     }
     return json;
   }
 
   @Transactional
   public ToJson<MeetingWithBLOBs> delMeetingById(String sid)
   {
     ToJson json = new ToJson(1, "error");
     try {
       int count = this.meetingMapper.delMeetingById(sid);
       this.meetingAttendConfirmMapper.delConfirmById(sid);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl delMeetingById:" + e });
     }
     return json;
   }
 
   public ToJson<MeetingAttendConfirm> queryAttendConfirm(String meetingId)
   {
     ToJson json = new ToJson(1, "error");
     try {
       List<MeetingAttendConfirm> meetingAttendConfirmList = this.meetingAttendConfirmMapper.queryAttendConfirm(meetingId);
       if (meetingAttendConfirmList.size() > 0) {
         for (MeetingAttendConfirm meetingAttendConfirm : meetingAttendConfirmList) {
           if (meetingAttendConfirm.getCreateUser() != null) {
             Users users = this.usersMapper.getUserByUid(meetingAttendConfirm.getCreateUser().intValue());
             if (users != null) {
               meetingAttendConfirm.setCreateName(users.getUserName());
             }
           }
           if (meetingAttendConfirm.getAttendeeId() != null) {
             Users users = this.usersMapper.getUserByUid(meetingAttendConfirm.getAttendeeId().intValue());
             if (users != null) {
               meetingAttendConfirm.setAttendeeName(users.getUserName());
               if (users.getDeptId() != null) {
                 meetingAttendConfirm.setDeptName(this.departmentMapper.getDeptNameById(users.getDeptId().intValue()));
               }
               if (users.getUserPriv() != null) {
                 meetingAttendConfirm.setUserPrivName(this.userPrivMapper.getPrivNameById(users.getUserPriv()));
               }
               meetingAttendConfirm.setAvatar(users.getAvatar());
             }
           }
           if (meetingAttendConfirm.getAttendFlag() != null) {
             int attendFlag = Integer.valueOf(meetingAttendConfirm.getAttendFlag().intValue()).intValue();
             switch (attendFlag) {
             case 0:
               meetingAttendConfirm.setAttendFlagStr("待确认");
               break;
             case 1:
               meetingAttendConfirm.setAttendFlagStr("参会");
               break;
             case 2:
               meetingAttendConfirm.setAttendFlagStr("不参会");
             }
           }
 
           if (meetingAttendConfirm.getReadFlag() != null) {
             int attendFlag = Integer.valueOf(meetingAttendConfirm.getReadFlag().intValue()).intValue();
             switch (attendFlag) {
             case 0:
               meetingAttendConfirm.setReadFlagStr("待阅读");
               break;
             case 1:
               meetingAttendConfirm.setReadFlagStr("已签阅");
             }
           }
 
           if (!StringUtils.checkNull(meetingAttendConfirm.getCreateTime()).booleanValue()) {
             meetingAttendConfirm.setCreateTime(meetingAttendConfirm.getCreateTime().substring(0, meetingAttendConfirm.getCreateTime().length() - 2));
           }
           if (!StringUtils.checkNull(meetingAttendConfirm.getReadingTime()).booleanValue()) {
             meetingAttendConfirm.setReadingTime(meetingAttendConfirm.getReadingTime().substring(0, meetingAttendConfirm.getReadingTime().length() - 2));
           }
           if (!StringUtils.checkNull(meetingAttendConfirm.getConfirmTime()).booleanValue()) {
             meetingAttendConfirm.setConfirmTime(meetingAttendConfirm.getConfirmTime().substring(0, meetingAttendConfirm.getConfirmTime().length() - 2));
           }
         }
       }
       json.setObj(meetingAttendConfirmList);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl queryAttendConfirm:" + e });
     }
     return json;
   }
 
   public ToJson<Meeting> queryCountByStatus(HttpServletRequest request)
   {
     ToJson json = new ToJson(1, "error");
     Meeting meeting = new Meeting();
     Meeting paraMeeting = new Meeting();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     paraMeeting.setManagerId(user.getUid());
     try {
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       paraMeeting.setStatus(Integer.valueOf(1));
       meeting.setPendingCount(Integer.valueOf(this.meetingMapper.queryCountByStatus(paraMeeting)));
 
       MeetingWithBLOBs meetingWithBLOBs = new MeetingWithBLOBs();
       meetingWithBLOBs.setStatus(Integer.valueOf(2));
       meetingWithBLOBs.setManagerId(user.getUid());
       List meetingWithBLOBsList = approveMeeting(meetingWithBLOBs, Integer.valueOf(1), Integer.valueOf(0), false);
       meeting.setApprovedCount(Integer.valueOf(meetingWithBLOBsList.size()));
 
       paraMeeting.setStatus(Integer.valueOf(4));
       meeting.setNotApprovedCount(Integer.valueOf(this.meetingMapper.queryCountByStatus(paraMeeting)));
       paraMeeting.setStatus(Integer.valueOf(3));
       paraMeeting.setCurrentTime(sdf.format(date));
       meeting.setProcessingCount(Integer.valueOf(this.meetingMapper.queryCountByStatus(paraMeeting)));
       paraMeeting.setStatus(Integer.valueOf(5));
       paraMeeting.setCurrentTime(sdf.format(date));
       meeting.setOverCount(Integer.valueOf(this.meetingMapper.queryCountByStatus(paraMeeting)));
       json.setObject(meeting);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl queryCountByStatus:" + e });
     }
     return json;
   }
 
   public List<MeetingWithBLOBs> approveMeeting(MeetingWithBLOBs meetingWithBLOBs, Integer page, Integer pageSize, boolean useFlag) {
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     Map map = new HashMap();
     map.put("page", pageParams);
     meetingWithBLOBs.setStatus(Integer.valueOf(2));
     map.put("meetingWithBLOBs", meetingWithBLOBs);
     List<MeetingWithBLOBs> allApproveMeetList = this.meetingMapper.queryMeeting(map);
 
     map.remove("page");
     meetingWithBLOBs.setStatus(Integer.valueOf(3));
     Date date = new Date();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     meetingWithBLOBs.setCurrentTime(sdf.format(date));
     map.put("meetingWithBLOBs", meetingWithBLOBs);
     List doingMeetList = this.meetingMapper.queryMeeting(map);
     meetingWithBLOBs.setStatus(Integer.valueOf(5));
     map.put("meetingWithBLOBs", meetingWithBLOBs);
     List endingMeetList = this.meetingMapper.queryMeeting(map);
     List<MeetingWithBLOBs> meetingWithBLOBsTemp = new ArrayList();
     meetingWithBLOBsTemp.addAll(doingMeetList);
     meetingWithBLOBsTemp.addAll(endingMeetList);
     List approveMeetList = new ArrayList();
     for (MeetingWithBLOBs meeting : allApproveMeetList) {
       int count = 0;
       for (MeetingWithBLOBs temp : meetingWithBLOBsTemp) {
         if (meeting.getSid() == temp.getSid()) {
           count++;
           break;
         }
       }
       if (count == 0) {
         approveMeetList.add(meeting);
       }
     }
     return approveMeetList;
   }
 
   @Transactional
   public ToJson<MeetingWithBLOBs> updateConfirmReadStatusBySId(MeetingAttendConfirm meetingAttendConfirm, HttpServletRequest request)
   {
     ToJson json = new ToJson(1, "error");
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       meetingAttendConfirm.setAttendeeId(user.getUid());
       meetingAttendConfirm.setReadingTime(sdf.format(date));
       meetingAttendConfirm.setReadFlag(Integer.valueOf(1));
       this.meetingAttendConfirmMapper.updateStatusBySId(meetingAttendConfirm);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl updateConfirmReadStatusBySId:" + e });
     }
     return json;
   }
 
   @Transactional
   public ToJson<Users> updateConfirmAttendStatusBySId(MeetingAttendConfirm meetingAttendConfirm, HttpServletRequest request)
   {
     ToJson json = new ToJson(1, "error");
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
       MeetingWithBLOBs meetingWithBLOBs = new MeetingWithBLOBs();
       if (meetingAttendConfirm.getMeetingId() != null) {
         meetingWithBLOBs = this.meetingMapper.queryMeetingById(meetingAttendConfirm.getMeetingId().toString());
         if (meetingWithBLOBs != null) {
           String currentDay = meetingWithBLOBs.getStartTime().substring(0, 10) + " 00:00:00";
           long currentDayTime = DateFormat.getTime(currentDay).intValue();
           long endDayTime = DateFormat.getTime(meetingWithBLOBs.getEndTime()).intValue();
           long currentTime = DateFormat.getTime(DateFormat.getStrDate(new Date())).intValue();
           if (currentTime < currentDayTime) {
             json.setMsg("未到签到时间");
             return json;
           }
           if (currentTime > endDayTime) {
             json.setMsg("签到时间已过，会议已结束");
             return json;
           }
 
           if (!StringUtils.checkNull(meetingWithBLOBs.getAttendee()).booleanValue()) {
             if ((!meetingWithBLOBs.getAttendee().contains(user.getUid() + ",")) && (!meetingWithBLOBs.getAttendee().contains("," + user.getUid() + ","))) {
               json.setMsg("您没有签到权限");
               return json;
             }
           } else {
             json.setMsg("您没有签到权限");
             return json;
           }
 
           Map map = new HashMap();
           map.put("meetingId", meetingAttendConfirm.getMeetingId());
           map.put("attendeeId", meetingAttendConfirm.getAttendeeId());
           MeetingAttendConfirm temp = this.meetingAttendConfirmMapper.queryMyAttend(map);
           if ((temp != null) && 
             (temp.getAttendFlag().intValue() == 1)) {
             json.setMsg("不能重复签到");
             return json;
           }
 
           Date date = new Date();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           meetingAttendConfirm.setAttendeeId(user.getUid());
           meetingAttendConfirm.setConfirmTime(sdf.format(date));
           meetingAttendConfirm.setAttendFlag(Integer.valueOf(1));
           int count = this.meetingAttendConfirmMapper.updateStatusBySId(meetingAttendConfirm);
 
           HrStaffInfo hrStaffInfo = this.hrStaffInfoMapper.getStaffByUserId(user.getUserId());
           if (hrStaffInfo != null) {
             user.setPhotoName(hrStaffInfo.getPhotoName());
           }
           if (count > 0) {
             HttpSession session = request.getSession();
             Map paraMap = new HashedMap();
             paraMap.put("attendFlag", Boolean.valueOf(true));
             SessionUtils.putSession(session, paraMap);
 
             json.setMsg("ok");
             json.setFlag(0);
             json.setObject(user);
           }
         }
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl updateConfirmAttendStatusBySId:" + e });
     }
     return json;
   }
 
   public ToJson<Users> checkAttend(HttpServletRequest request) {
     ToJson toJson = new ToJson(0, "ok");
     String attendFlag = (String)SessionUtils.getSessionInfo(request.getSession(), "attendFlag", String.class);
     String avatar = (String)SessionUtils.getSessionInfo(request.getSession(), "avatar", String.class);
     String photoName = (String)SessionUtils.getSessionInfo(request.getSession(), "photoName", String.class);
     String userName = (String)SessionUtils.getSessionInfo(request.getSession(), "userName", String.class);
     String deptName = (String)SessionUtils.getSessionInfo(request.getSession(), "deptName", String.class);
     String userPrivName = (String)SessionUtils.getSessionInfo(request.getSession(), "userPrivName", String.class);
     Users users = new Users();
     users.setMyStatus(attendFlag);
     users.setAvatar(avatar);
     users.setPhotoName(photoName);
     users.setUserName(userName);
     users.setDeptName(deptName);
     users.setUserPrivName(userPrivName);
     toJson.setObject(users);
     return toJson;
   }
 
   public ToJson<MeetingWithBLOBs> getMeetingNotify(HttpServletRequest request, MeetingWithBLOBs meetingWithBLOBs, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson(1, "error");
     try {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       Map map = new HashMap();
       map.put("page", pageParams);
       map.put("meetingWithBLOBs", meetingWithBLOBs);
 
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       long currentTime = Long.valueOf(DateFormat.getTime(sdf.format(date)).intValue()).longValue();
       List<MeetingWithBLOBs> meetingList = this.meetingMapper.getMeetingNotify(map);
       for (MeetingWithBLOBs meetingWithBLOBs1 : meetingList)
       {
         Long startDate = Long.valueOf(DateFormat.getTime(meetingWithBLOBs1.getStartTime()).intValue());
         Long endDate = Long.valueOf(DateFormat.getTime(meetingWithBLOBs1.getEndTime()).intValue());
         if ((2 == meetingWithBLOBs1.getStatus().intValue()) && (currentTime >= startDate.longValue()) && (currentTime <= endDate.longValue())) {
           meetingWithBLOBs1.setStatus(Integer.valueOf(3));
           meetingWithBLOBs1.setStatusName("进行中");
         } else if (2 == meetingWithBLOBs1.getStatus().intValue()) {
           meetingWithBLOBs1.setStatusName("已批准");
         } else if (3 == meetingWithBLOBs1.getStatus().intValue()) {
           meetingWithBLOBs1.setStatusName("进行中");
         }
 
         if (meetingWithBLOBs1.getUid() != null) {
           meetingWithBLOBs1.setUserName(this.usersMapper.getUsernameById(meetingWithBLOBs1.getUid().intValue()));
         }
         if (meetingWithBLOBs1.getManagerId() != null) {
           meetingWithBLOBs1.setManagerName(this.usersMapper.getUsernameById(meetingWithBLOBs1.getManagerId().intValue()));
         }
         if (meetingWithBLOBs1.getMeetRoomId() != null) {
           MeetingRoom meetingRoom = this.meetingRoomMapper.getMeetRoomBySid(Integer.valueOf(meetingWithBLOBs1.getMeetRoomId().intValue()));
           if (meetingRoom != null) {
             meetingWithBLOBs1.setMeetRoomName(meetingRoom.getMrName());
           }
         }
 
         if (!StringUtils.checkNull(meetingWithBLOBs1.getStartTime()).booleanValue()) {
           meetingWithBLOBs1.setStartTime(meetingWithBLOBs1.getStartTime().substring(0, meetingWithBLOBs1.getStartTime().length() - 2));
         }
         if (!StringUtils.checkNull(meetingWithBLOBs1.getEndTime()).booleanValue()) {
           meetingWithBLOBs1.setEndTime(meetingWithBLOBs1.getEndTime().substring(0, meetingWithBLOBs1.getEndTime().length() - 2));
         }
         if (!StringUtils.checkNull(meetingWithBLOBs1.getCreateTime()).booleanValue()) {
           meetingWithBLOBs1.setCreateTime(meetingWithBLOBs1.getCreateTime().substring(0, meetingWithBLOBs1.getCreateTime().length() - 2));
         }
       }
       json.setObj(meetingList);
       json.setTotleNum(pageParams.getTotal());
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg(e.getMessage());
       L.e(new Object[] { "MeetingServiceImpl queryMeeting:" + e });
     }
     return json;
   }
 }
