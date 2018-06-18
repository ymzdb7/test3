 package com.myoa.service.meeting.impl;
 
 import com.myoa.dao.meet.MeetingMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.meet.MeetingWithBLOBs;
import com.myoa.model.users.Users;
import com.myoa.service.meeting.MeetSummaryService;
import com.myoa.util.Constant;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
 
 @Service
 public class MeetSummaryServiceImpl
   implements MeetSummaryService
 {
 
   @Resource
   private MeetingMapper meetingMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   public ToJson<MeetingWithBLOBs> getAllInfo(Integer page, Integer pageSize, boolean useFlag, HttpServletRequest request)
   {
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     ToJson json = new ToJson();
 
     Map map = new HashMap();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     map.put("page", pageParams);
 
     Users sessionInfo = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
     Integer uid = sessionInfo.getUid();
     map.put("id", uid);
     try {
       List<MeetingWithBLOBs> meetSummary = this.meetingMapper.getMeetSummary(map);
       if (meetSummary != null)
       {
         for (MeetingWithBLOBs meetingWithBLOBs : meetSummary)
         {
           String readPeopleId = meetingWithBLOBs.getReadPeopleId();
 
           if ((readPeopleId != "") && (readPeopleId != null)) {
             String[] split = readPeopleId.split(",");
             StringBuffer sb = new StringBuffer();
             for (String s : split) {
               String usernameById = this.usersMapper.getUsernameById(s);
               if ((usernameById != null) && (usernameById != "")) {
                 sb.append(usernameById + ",");
               }
 
             }
 
             meetingWithBLOBs.setReadPeopleNames(sb.toString());
           }
 
           if (!StringUtils.checkNull(meetingWithBLOBs.getStartTime()).booleanValue()) {
             meetingWithBLOBs.setStartTime(meetingWithBLOBs.getStartTime().substring(0, meetingWithBLOBs.getStartTime().length() - 2));
           }
           if (!StringUtils.checkNull(meetingWithBLOBs.getEndTime()).booleanValue()) {
             meetingWithBLOBs.setEndTime(meetingWithBLOBs.getEndTime().substring(0, meetingWithBLOBs.getEndTime().length() - 2));
           }
           if (meetingWithBLOBs.getUid() != null) {
             String usernameById = this.usersMapper.getUsernameById(meetingWithBLOBs.getUid().intValue());
             meetingWithBLOBs.setUserName(usernameById);
           }
           if ((meetingWithBLOBs.getSummaryAttachmentId() != null) && (meetingWithBLOBs.getSummaryAttachmentId() != ""))
             meetingWithBLOBs.setIsuploadsummary("已上传");
           else {
             meetingWithBLOBs.setIsuploadsummary("未上传");
           }
         }
       }
 
       json.setObj(meetSummary);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setObj(null);
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<MeetingWithBLOBs> getMeetSummarydetail(HttpServletRequest request, String sid)
   {
     ToJson json = new ToJson();
     try
     {
       if (sid != null) {
         MeetingWithBLOBs meetingWithBLOBs = this.meetingMapper.queryMeetingById(sid);
 
         List attachmentList = new ArrayList();
         if ((meetingWithBLOBs.getSummaryAttachmentName() != null) && (!"".equals(meetingWithBLOBs.getSummaryAttachmentName()))) {
           attachmentList = GetAttachmentListUtil.returnAttachment(meetingWithBLOBs.getSummaryAttachmentName(), meetingWithBLOBs.getSummaryAttachmentId(), Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), "summary_meet");
         }
         meetingWithBLOBs.setAttachmentList(attachmentList);
 
         String readPeopleId = meetingWithBLOBs.getReadPeopleId();
 
         if ((readPeopleId != "") && (readPeopleId != null)) {
           String[] split = readPeopleId.split(",");
           StringBuffer sb = new StringBuffer();
           for (String s : split) {
             String usernameById = this.usersMapper.getUsernameById(s);
             if ((usernameById != null) && (usernameById != "")) {
               sb.append(usernameById + ",");
             }
           }
 
           meetingWithBLOBs.setReadPeopleNames(sb.toString());
         } else {
           meetingWithBLOBs.setReadPeopleId("");
         }
         json.setFlag(0);
         json.setMsg("ok");
         json.setObject(meetingWithBLOBs);
       }
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> editMeetSummarydetail(HttpServletRequest request, MeetingWithBLOBs meetingWithBLOBs)
   {
     if (meetingWithBLOBs.getResendHour() == null) {
       meetingWithBLOBs.setResendHour(Integer.valueOf(0));
     }
     if (meetingWithBLOBs.getResendMinute() == null) {
       meetingWithBLOBs.setResendMinute(Integer.valueOf(0));
     }
     if (meetingWithBLOBs.getResendSeveral() == null) {
       meetingWithBLOBs.setResendSeveral(Integer.valueOf(0));
     }
     if (meetingWithBLOBs.getStatus() == null) {
       meetingWithBLOBs.setStatus(Integer.valueOf(0));
     }
     ToJson json = new ToJson(1, "err");
     try {
       int i = this.meetingMapper.editMeetSummary(meetingWithBLOBs);
       if (i > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg("err");
       json.setFlag(1);
       e.printStackTrace();
     }
     return json;
   }
 }

