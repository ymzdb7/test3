  package com.myoa.service.attend;
  
  import com.myoa.dao.attend.AttendEvectionMapper;
import com.myoa.dao.attend.AttendLeaveMapper;
import com.myoa.dao.attend.AttendMapper;
import com.myoa.dao.attend.AttendOutMapper;
import com.myoa.dao.attend.AttendSetMapper;
import com.myoa.dao.attend.AttendanceOvertimeMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.users.UserExtMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.attend.Absenteeism;
import com.myoa.model.attend.Attend;
import com.myoa.model.attend.AttendEvection;
import com.myoa.model.attend.AttendLeave;
import com.myoa.model.attend.AttendOut;
import com.myoa.model.attend.AttendSet;
import com.myoa.model.attend.AttendStatistics;
import com.myoa.model.attend.Attendance;
import com.myoa.model.attend.AttendanceOvertime;
import com.myoa.model.attend.BaseAttend;
import com.myoa.model.attend.BaseSupplement;
import com.myoa.model.attend.Field;
import com.myoa.model.attend.LackCard;
import com.myoa.model.attend.Late;
import com.myoa.model.attend.LeaveEarly;
import com.myoa.model.attend.Normal;
import com.myoa.model.attend.UnitException;
import com.myoa.model.department.Department;
import com.myoa.model.users.UserExt;
import com.myoa.model.users.Users;
import com.myoa.service.attend.wrapper.AttendSetWrappers;
import com.myoa.util.Constant;
import com.myoa.util.DateCompute;
import com.myoa.util.DateFormat;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.page.PageParams;

  import java.io.PrintStream;
  import java.text.ParseException;
  import java.text.SimpleDateFormat;
  import java.util.ArrayList;
  import java.util.Calendar;
  import java.util.Collections;
  import java.util.Date;
  import java.util.HashMap;
  import java.util.Iterator;
  import java.util.LinkedHashMap;
  import java.util.List;
  import java.util.Map;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpSession;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
  @Service
  public class AttendService
  {
    public final String numberZero = "0";
    public final String numberOne = "1";
    public final String numberTwo = "2";
    public final String numberThree = "3";
    public final String numberFour = "4";
    public final String numberFive = "5";
    public final String numberSix = "6";
  
    @Autowired
    private AttendMapper attendMapper;
  
    @Autowired
    private AttendSetMapper attendSetMapper;
  
    @Autowired
    private UserExtMapper userExtMapper;
  
    @Autowired
    private UsersMapper usersMapper;
  
    @Autowired
    private DepartmentMapper departmentMapper;
  
    @Autowired
    private AttendEvectionMapper attendEvectionMapper;
  
    @Autowired
    private AttendLeaveMapper attendLeaveMapper;
  
    @Autowired
    private AttendanceOvertimeMapper attendanceOvertimeMapper;
  
    @Autowired
    private AttendOutMapper attendOutMapper;
    public static String attendDatetime = "08:00:00";
  
    public BaseWrapper newAttend(Attend attend, HttpServletRequest req, String attendDate, String uid)
      throws ParseException
    {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
      String str = sdf.format(date);
      Date date1 = sdf.parse(str);
      attend.setAid(Integer.valueOf(0));
      attend.setDate(DateFormat.DateToStr(attendDate));
      int a = DateFormat.getWYQTime(str).intValue();
      attend.setAtime(Integer.valueOf(a));
      Map map = new HashMap();
  
      map.put("uid", uid);
      map.put("date", attendDate);
      map.put("type", attend.getType());
      List attendList = this.attendMapper.selectAttend(map);
      if ((!"0".equals(attend.getType())) && 
        (attendList != null) && (attendList.size() > 0)) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("重复签到");
        wrappers.setCode("130050");
        return wrappers;
      }
  
      if (StringUtils.checkNull(attend.getAddress()).booleanValue()) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到地址不能为空");
        wrappers.setCode("130060");
        return wrappers;
      }
  
      int res = this.attendMapper.addAttend(attend);
      if (res == 1) {
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setMsg("签到成功");
      } else {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("签到失败");
      }
  
      return wrappers;
    }
  
    public BaseWrapper attendList(String attendDate, HttpServletRequest req, String uid, String sqlType) {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      Attend attend = new Attend();
      Map map = new HashMap();
  
      map.put("uid", uid);
      map.put("date", attendDate);
      UserExt userExt = this.userExtMapper.queryUserExt(uid);
      AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(userExt.getDutyType().shortValue()));
  
      String[] str1 = attendSet.getAtime1Set().split("\\|");
      attendSet.setAtime1Setother(str1[0]);
      attendSet.setCommute1(str1[1]);
      String[] str2 = attendSet.getAtime2Set().split("\\|");
      attendSet.setAtime2Setother(str2[0]);
      attendSet.setCommute2(str2[1]);
  
      String[] str3 = attendSet.getAtime3Set().split("\\|");
      attendSet.setAtime3Setother(str3[0]);
      attendSet.setCommute3(str3[1]);
      String[] str4 = attendSet.getAtime4Set().split("\\|");
      attendSet.setAtime4Setother(str4[0]);
      attendSet.setCommute4(str4[1]);
      String[] str5 = attendSet.getAtime5Set().split("\\|");
      attendSet.setAtime5Setother(str5[0]);
      attendSet.setCommute5(str5[1]);
      String[] str6 = attendSet.getAtime6Set().split("\\|");
      attendSet.setAtime6Setother(str6[0]);
      attendSet.setCommute6(str6[1]);
  
      List<Attend> workList = new ArrayList<Attend>();
      List legwork = new ArrayList();
      if (attendSet != null) {
        Attend attend11 = new Attend();
        Attend attend22 = new Attend();
        Attend attend33 = new Attend();
        Attend attend44 = new Attend();
        Attend attend55 = new Attend();
        Attend attend66 = new Attend();
  
        if ("1".equals(attendSet.getAtime1Setother())) {
          String status = "";
          int atime = 0;
          String remark = "";
          String addres = "";
          Attend attend1 = this.attendMapper.selectAttendAll(attendDate, uid, "1");
          if (attend1 != null) {
            if ("1".equals(attend1.getType())) {
              if ("1".equals(attendSet.getCommute1())) {
                String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime1()).getTime())
                  status = "迟到";
                else
                  status = "正常";
              }
              else {
                String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime1()).getTime())
                  status = "早退";
                else {
                  status = "正常";
                }
              }
            }
  
            atime = attend1.getAtime().intValue();
            remark = attend1.getRemark();
            addres = attend1.getAddress();
          }
          else {
            status = "未签到";
            atime = 0;
          }
          attend11.setNum("1");
          attend11.setSwi("1");
          attend11.setCommute(attendSet.getCommute1());
          attend11.setAtime(Integer.valueOf(atime));
          attend11.setRemark(remark);
          attend11.setAddress(addres);
          attend11.setAtimestate(status);
          workList.add(attend11);
        }
  
        if ("1".equals(attendSet.getAtime2Setother())) {
          String status = "";
          int atime = 0;
          String remark = "";
          String addres = "";
          Attend attend2 = this.attendMapper.selectAttendAll(attendDate, uid, "2");
          if (attend2 != null)
          {
            if ("2".equals(attend2.getType()))
            {
              if ("1".equals(attendSet.getCommute2())) {
                int a22 = DateFormat.getWYQTime(attendSet.getAtime2()).intValue();
                if (attend2.getAtime().intValue() > DateFormat.getWYQTime(attendSet.getAtime2()).intValue())
                  status = "迟到";
                else
                  status = "正常";
              }
              else {
                String a1 = DateFormat.getwyqStrTime(attend2.getAtime());
                if (attend2.getAtime().intValue() < DateFormat.getWYQTime(attendSet.getAtime2()).intValue())
                  status = "早退";
                else {
                  status = "正常";
                }
              }
            }
  
            remark = attend2.getRemark();
            addres = attend2.getAddress();
            atime = attend2.getAtime().intValue();
          }
          else {
            status = "未签到";
          }
          attend22.setNum("1");
          attend22.setSwi("1");
          attend22.setCommute(attendSet.getCommute2());
          attend22.setAtime(Integer.valueOf(atime));
          attend22.setRemark(remark);
          attend22.setAddress(addres);
          attend22.setAtimestate(status);
          workList.add(attend22);
        }
  
        if ("1".equals(attendSet.getAtime3Setother())) {
          String status = "";
          int atime = 0;
          String remark = "";
          String addres = "";
          Attend attend3 = this.attendMapper.selectAttendAll(attendDate, uid, "3");
          if (attend3 != null)
          {
            if ("3".equals(attend3.getType()))
            {
              if ("1".equals(attendSet.getCommute3())) {
                String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime3()).getTime())
                  status = "迟到";
                else
                  status = "正常";
              }
              else {
                String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime3()).getTime())
                  status = "早退";
                else {
                  status = "正常";
                }
              }
            }
  
            remark = attend3.getRemark();
            addres = attend3.getAddress();
            atime = attend3.getAtime().intValue();
          }
          else
          {
            status = "未签到";
          }
          attend33.setNum("1");
          attend33.setSwi("1");
          attend33.setCommute(attendSet.getCommute3());
          attend33.setAtime(Integer.valueOf(atime));
          attend33.setRemark(remark);
          attend33.setAddress(addres);
          attend33.setAtimestate(status);
          workList.add(attend33);
        }
  
        if ("1".equals(attendSet.getAtime4Setother())) {
          String status = "";
          int atime = 0;
          String remark = "";
          String addres = "";
          Attend attend4 = this.attendMapper.selectAttendAll(attendDate, uid, "4");
          if (attend4 != null)
          {
            if ("4".equals(attend4.getType()))
            {
              if ("1".equals(attendSet.getCommute4())) {
                String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime4()).getTime())
                  status = "迟到";
                else
                  status = "正常";
              }
              else {
                String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime4()).getTime())
                  status = "早退";
                else {
                  status = "正常";
                }
              }
              remark = attend4.getRemark();
              addres = attend4.getAddress();
              atime = attend4.getAtime().intValue();
            } else {
              status = "未签到";
            }
            attend44.setNum("1");
            attend44.setSwi("1");
            attend44.setCommute(attendSet.getCommute4());
            attend44.setAtime(Integer.valueOf(atime));
            attend44.setRemark(remark);
            attend44.setAddress(addres);
            attend44.setAtimestate(status);
            workList.add(attend44);
          }
  
        }
  
        if ("1".equals(attendSet.getAtime5Setother())) {
          String status = "";
          int atime = 0;
          String remark = "";
          String addres = "";
          Attend attend5 = this.attendMapper.selectAttendAll(attendDate, uid, "5");
          if (attend5 != null)
          {
            if ("5".equals(attend5.getType()))
            {
              if ("1".equals(attendSet.getCommute5())) {
                String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime5()).getTime())
                  status = "迟到";
                else
                  status = "正常";
              }
              else {
                String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime5()).getTime())
                  status = "早退";
                else {
                  status = "正常";
                }
              }
              remark = attend5.getRemark();
              addres = attend5.getAddress();
              atime = attend5.getAtime().intValue();
            }
            else {
              status = "未签到";
            }
            attend55.setNum("1");
            attend55.setSwi("1");
            attend55.setAtimestate(status);
            attend55.setCommute(attendSet.getCommute5());
            attend55.setRemark(remark);
            attend55.setAddress(addres);
            attend55.setAtime(Integer.valueOf(atime));
            workList.add(attend55);
          }
  
        }
  
        if ("1".equals(attendSet.getAtime6Setother())) {
          String status = "";
          int atime = 0;
          String remark = "";
          String addres = "";
          Attend attend6 = this.attendMapper.selectAttendAll(attendDate, uid, "6");
          if (attend6 != null)
          {
            if ("6".equals(attend6.getType()))
            {
              if ("1".equals(attendSet.getCommute6())) {
                String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime6()).getTime())
                  status = "迟到";
                else
                  status = "正常";
              }
              else {
                String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime6()).getTime())
                  status = "早退";
                else {
                  status = "正常";
                }
              }
              remark = attend6.getRemark();
              addres = attend6.getAddress();
              atime = attend6.getAtime().intValue();
            }
            else {
              status = "未签到";
            }
            attend66.setNum("1");
            attend66.setSwi("1");
            attend66.setCommute(attendSet.getCommute6());
            attend66.setRemark(remark);
            attend66.setAddress(addres);
            attend66.setAtime(Integer.valueOf(atime));
            attend66.setAtimestate(status);
  
            workList.add(attend66);
          }
  
        }
  
        if ("1".equals(attendSet.getIsOut())) {
          List<Attend> attend0 = this.attendMapper.selectAttend0(attendDate, uid);
          if (attend0 != null) {
            for (Attend a : attend0) {
              if ((!StringUtils.checkNull(a.getFileId()).booleanValue()) && (!StringUtils.checkNull(a.getFileName()).booleanValue())) {
                a.setAttachment(GetAttachmentListUtil.returnAttachment(a.getFileName(), a.getFileId(), sqlType, "attend"));
              }
  
              legwork.add(a);
            }
  
          }
  
        }
  
        Date artt = DateFormat.DateToStr(attendDate);
        attend.setDate(artt);
        attend.setAttendList(workList);
        attend.setLegwork(legwork);
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setData(attend);
        wrappers.setMsg("更新成功");
      }
  
      return wrappers;
    }
  
    public BaseWrapper mycheckList(String date) {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      Map map = new HashMap();
      PageParams pageParams = new PageParams();
      pageParams.setUseFlag(Boolean.valueOf(true));
      pageParams.setPage(Integer.valueOf(1));
      pageParams.setPageSize(Integer.valueOf(10));
      map.put("page", pageParams);
      map.put("date", date);
      List attendList = this.attendMapper.AttendList(map);
      Iterator attendIterator = attendList.iterator();
      while (attendIterator.hasNext()) {
        Attend attend = (Attend)attendIterator.next();
  
        Users users = this.usersMapper.getByUid(attend.getUid().intValue());
        attend.setSname(users.getUserName());
        attend.setAva(users.getAvatar());
      }
  
      if (attendList != null) {
        wrappers.setData(attendList);
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setMsg("更新成功");
      } else {
        wrappers.setFlag(true);
        wrappers.setStatus(false);
        wrappers.setMsg("更新失败");
      }
  
      return wrappers;
    }
  
    public BaseWrapper myAttend(String date, String uid, String start, String end, HttpServletRequest req) throws ParseException
    {
      String sqlType = Constant.MYOA + (String)req.getSession().getAttribute("loginDateSouse");
  
      AttendSetWrappers wrappers = new AttendSetWrappers();
      Attend attend = new Attend();
      Map map = new HashMap();
      if (StringUtils.checkNull(uid).booleanValue()) {
        uid = ((Users)SessionUtils.getSessionInfo(req.getSession(), Users.class, new Users())).getUid().toString();
      }
      Users users = (Users)SessionUtils.getSessionInfo(req.getSession(), Users.class, new Users());
      map.put("uid", uid);
      map.put("date", date);
      UserExt userExt = this.userExtMapper.queryUserExt(uid);
      if (userExt != null) {
        AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(userExt.getDutyType().shortValue()));
        int xqhbt = 0;
        String[] str1 = attendSet.getAtime1Set().split("\\|");
        if ("1".equals(str1[0])) {
          xqhbt++;
        }
        attendSet.setAtime1Setother(str1[0]);
        attendSet.setCommute1(str1[1]);
        String[] str2 = attendSet.getAtime2Set().split("\\|");
        if ("1".equals(str2[0])) {
          xqhbt++;
        }
        attendSet.setAtime2Setother(str2[0]);
        attendSet.setCommute2(str2[1]);
        String[] str3 = attendSet.getAtime3Set().split("\\|");
        if ("1".equals(str3[0])) {
          xqhbt++;
        }
        attendSet.setAtime3Setother(str3[0]);
        attendSet.setCommute3(str3[1]);
        String[] str4 = attendSet.getAtime4Set().split("\\|");
        if ("1".equals(str4[0])) {
          xqhbt++;
        }
        attendSet.setAtime4Setother(str4[0]);
        attendSet.setCommute4(str4[1]);
        String[] str5 = attendSet.getAtime5Set().split("\\|");
        if ("1".equals(str5[0])) {
          xqhbt++;
        }
        attendSet.setAtime5Setother(str5[0]);
        attendSet.setCommute5(str5[1]);
        String[] str6 = attendSet.getAtime6Set().split("\\|");
        if ("1".equals(str6[0])) {
          xqhbt++;
        }
        attendSet.setAtime6Setother(str6[0]);
        attendSet.setCommute6(str6[1]);
        if (attendSet != null) {
          List attendances = new ArrayList();
          List normals = new ArrayList();
          List fields = new ArrayList();
          List leaveEarlies = new ArrayList();
          List lackCards = new ArrayList();
          List lates = new ArrayList();
          List absenteeisms = new ArrayList();
          List unitExceptions = new ArrayList();
          List normalNews = new ArrayList();
          List absenteeismRecord = new ArrayList();
          List leaveEarlyRecord = new ArrayList();
          List lackCardRecord = new ArrayList();
          List lateRecord = new ArrayList();
          List attendOutList = new ArrayList();
          List attendanceOvertimeList = new ArrayList();
          List attendEvectionList = new ArrayList();
          List attendLeaveList = new ArrayList();
          List attendListFirst = new ArrayList();
  
          List workList = new ArrayList();
  
          String[] wDate = attendSet.getWorkdate().split(",");
  
          List<Date> datss = new ArrayList();
          SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
          SimpleDateFormat matter2 = new SimpleDateFormat("yyyy-MM-dd");
          Date dt = new Date();
          String a11 = df.format(dt);
          String stratDate = "";
          String endDate = "";
          if (start.equals(a11))
          {
            stratDate = start + "-01";
            endDate = matter2.format(dt);
          }
          else {
            Date date1 = df.parse(start);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date1);
            int first1 = calendar.getActualMinimum(5);
            int last1 = calendar.getActualMaximum(5);
            stratDate = start + "-01";
            endDate = start + "-" + last1;
          }
          List unitExceptionList = myAttendUnitException(stratDate, endDate, uid, req);
  
          Date start1 = matter2.parse(stratDate);
          Date end1 = matter2.parse(endDate);
          Calendar c = Calendar.getInstance();
          List<Date> dates = DateCompute.getBetweenDates(start1, end1);
          for (Date nowdate1 : dates) {
            c.setTime(nowdate1);
            int weekInt = c.get(7);
            weekInt -= 1;
            if (weekInt == 0) {
              weekInt = 7;
            }
  
            String week = String.valueOf(weekInt);
            if (attendSet.getWorkdate().contains(week)) {
              datss.add(nowdate1);
            }
          }
  
          for (Date nowdate : datss) {
            List zhengchang1 = new ArrayList();
            Attendance attendance = new Attendance();
            Absenteeism absenteeism = new Absenteeism();
  
            LeaveEarly leaveEarly = new LeaveEarly();
  
            Normal normal = new Normal();
            Late late = new Late();
  
            LackCard lackCard = new LackCard();
  
            Normal normalNew = new Normal();
  
            List attendOuts = this.attendOutMapper.queryAttendOut(users.getUserId(), DateFormat.getDatestr(nowdate));
            if ((attendOuts.size() > 0) && (attendOuts != null)) {
              Iterator attendOutIterator = attendOuts.iterator();
              while (attendOutIterator.hasNext()) {
                AttendOut attendOut = (AttendOut)attendOutIterator.next();
                BaseAttend attendOutNew = new BaseAttend();
                attendOutNew.setStrat(attendOut.getOutTime1());
                attendOutNew.setEnd(attendOut.getOutTime2());
                attendOutNew.setStr("原因:" + attendOut.getOutType());
                attendOutNew.setHour("1");
                attendOutList.add(attendOutNew);
              }
            }
  
            List attendLeaves = this.attendLeaveMapper.selectAttendLeaveModify(users.getUserId(), DateFormat.getDatestr(nowdate));
            if ((attendLeaves.size() > 0) && (attendLeaves != null)) {
              Iterator attendLeavesIteratorr = attendLeaves.iterator();
              while (attendLeavesIteratorr.hasNext()) {
                AttendLeave attendLeave = (AttendLeave)attendLeavesIteratorr.next();
                BaseAttend attendLeaveNew = new BaseAttend();
                attendLeaveNew.setStrat(DateFormat.getStrDate(attendLeave.getLeaveDate1()));
                attendLeaveNew.setEnd(DateFormat.getStrDate(attendLeave.getLeaveDate2()));
                attendLeaveNew.setStr("原因:" + attendLeave.getLeaveType());
                attendLeaveNew.setHour("1");
                attendLeaveList.add(attendLeaveNew);
              }
            }
  
            List attendEvections = this.attendEvectionMapper.selectAttendEvectionModify(users.getUserId(), DateFormat.getDatestr(nowdate));
            if ((attendEvections.size() > 0) && (attendEvections != null)) {
              Iterator attendEvectionIterator = attendEvections.iterator();
              while (attendEvectionIterator.hasNext()) {
                AttendEvection attendEvection = (AttendEvection)attendEvectionIterator.next();
                BaseAttend attendEvectionNew = new BaseAttend();
                attendEvectionNew.setStrat(DateFormat.getStrDate(attendEvection.getEvectionDate1()));
                attendEvectionNew.setEnd(DateFormat.getStrDate(attendEvection.getEvectionDate2()));
                attendEvectionNew.setStr("原因:" + attendEvection.getReason());
                attendEvectionNew.setHour("1");
                attendEvectionList.add(attendEvectionNew);
              }
            }
            List attendanceOvertimes = this.attendanceOvertimeMapper.queryAttendanceOvertime(users.getUserId(), DateFormat.getDatestr(nowdate));
  
            if ((attendanceOvertimes.size() > 0) && (attendanceOvertimes != null)) {
              Iterator attendanceOvertimeIterator = attendanceOvertimes.iterator();
              while (attendanceOvertimeIterator.hasNext()) {
                AttendanceOvertime attendanceOvertime = (AttendanceOvertime)attendanceOvertimeIterator.next();
                BaseAttend attendanceOvertimeNew = new BaseAttend();
                attendanceOvertimeNew.setStrat(DateFormat.getStrDate(attendanceOvertime.getStartTime()));
                attendanceOvertimeNew.setEnd(DateFormat.getStrDate(attendanceOvertime.getEndTime()));
                attendanceOvertimeNew.setStr("原因:" + attendanceOvertime.getReason());
                attendanceOvertimeNew.setHour(attendanceOvertime.getOvertimeHours());
                attendanceOvertimeList.add(attendanceOvertimeNew);
              }
  
            }
  
            Map maps = new HashMap();
            maps.put("uid", uid);
            maps.put("date", DateFormat.getDatestr(nowdate));
            List attendList111 = this.attendMapper.selectAttendList(maps);
            if (attendList111.size() > 0) {
              attendance.setWeek(DateCompute.getWeekOfDate(nowdate));
              attendance.setDate(DateFormat.getDatestrTime(nowdate));
              attendances.add(attendance);
            }
            else if (!DateFormat.getDatestr(nowdate).equals(DateFormat.getCurrentTime2())) {
              List attendEvection = this.attendEvectionMapper.selectAttendEvectionModify(users.getUserId(), DateFormat.getDatestr(nowdate));
              List attendLeave = this.attendLeaveMapper.selectAttendLeaveModify(users.getUserId(), DateFormat.getDatestr(nowdate));
              if ((attendEvection.size() == 0) && (attendEvection.size() == 0)) {
                Absenteeism absenteeismRecords = new Absenteeism();
                absenteeism.setWeek(DateCompute.getWeekOfDate(nowdate));
                absenteeism.setDate(DateFormat.getDatestrTime(nowdate));
                absenteeismRecords.setWeek(DateCompute.getWeekOfDate(nowdate));
                absenteeismRecords.setDate(DateFormat.getDatestrTime(nowdate));
                absenteeisms.add(absenteeism);
                absenteeismRecord.add(absenteeismRecords);
              }
  
            }
  
            if ("1".equals(attendSet.getIsOut())) {
              List attend0 = this.attendMapper.selectAttend0(DateFormat.getDatestr(nowdate), uid);
              if ((attend0 != null) && (attend0.size() > 0)) {
                Iterator attendIterator = attend0.iterator();
                while (attendIterator.hasNext()) {
                  Field field = new Field();
                  Attend attend1 = (Attend)attendIterator.next();
                  field.setDate(DateFormat.getDatestrTime(nowdate));
                  field.setTime(DateFormat.getwyqStrTime(attend1.getAtime()));
                  field.setStr(attend1.getAddress());
                  field.setPhoneId(attend1.getPhoneId());
                  field.setCause(attend1.getRemark());
                  fields.add(field);
                }
  
              }
  
            }
  
            if ("1".equals(attendSet.getAtime1Setother())) {
              String status = "";
              Late latefirst = new Late();
              Normal normalfirst = new Normal();
              LeaveEarly leaveEarlyfirst = new LeaveEarly();
              LeaveEarly leaveEarlyfirstRecord = new LeaveEarly();
              Late latefirstRecord = new Late();
              Attend attend1 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid, "1");
              if (attend1 != null) {
                if ("1".equals(attend1.getType())) {
                  if ("1".equals(attendSet.getCommute1())) {
                    String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                      status = "迟到";
                      latefirst.setTime(DateFormat.getwyqStrTime(attend1.getAtime()));
                      latefirst.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latefirst.setDate(DateFormat.getDatestrTime(nowdate));
  
                      latefirst.setStr("迟到(" + DateFormat.parseMillisecone(attend1.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime1()).intValue()) + ")");
                      latefirst.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime1());
                      latefirstRecord.setTime(DateFormat.getwyqStrTime(attend1.getAtime()));
                      latefirstRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latefirstRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      latefirstRecord.setStr("迟到(" + DateFormat.parseMillisecone(attend1.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime1()).intValue()) + ")");
                      latefirstRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime1());
                      lates.add(latefirst);
                      lateRecord.add(latefirstRecord);
                    }
                    else
                    {
                      status = "正常";
                      normalfirst.setTime(DateFormat.getwyqStrTime(attend1.getAtime()));
                      normalfirst.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalfirst.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalfirst);
                    }
                  }
                  else {
                    String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                      status = "早退";
                      leaveEarlyfirst.setTime(DateFormat.getwyqStrTime(attend1.getAtime()));
                      leaveEarlyfirst.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlyfirst.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlyfirst.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime1()).intValue() - attend1.getAtime().intValue()) + ")");
                      leaveEarlyfirst.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime1());
                      leaveEarlyfirstRecord.setTime(DateFormat.getwyqStrTime(attend1.getAtime()));
                      leaveEarlyfirstRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlyfirstRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlyfirstRecord.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime1()).intValue() - attend1.getAtime().intValue()) + ")");
                      leaveEarlyfirstRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime1());
                      leaveEarlies.add(leaveEarlyfirst);
                      leaveEarlyRecord.add(leaveEarlyfirstRecord);
                    }
                    else
                    {
                      status = "正常";
                      normalfirst.setTime(DateFormat.getwyqStrTime(attend1.getAtime()));
                      normalfirst.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalfirst.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalfirst);
                    }
                  }
                }
  
              }
              else
              {
                status = "未签到";
                LackCard lackCardfirst = new LackCard();
                LackCard lackCardfirstRecord = new LackCard();
                lackCardfirst.setTime(attendSet.getAtime1());
                lackCardfirst.setWeek(DateCompute.getWeekOfDate(nowdate));
                lackCardfirst.setDate(DateFormat.getDatestrTime(nowdate));
                lackCardfirstRecord.setTime(attendSet.getAtime1());
                lackCardfirstRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                lackCardfirstRecord.setDate(DateFormat.getDatestrTime(nowdate));
                lackCards.add(lackCardfirst);
                lackCardRecord.add(lackCardfirstRecord);
              }
  
            }
  
            if ("1".equals(attendSet.getAtime2Setother())) {
              String status = "";
              Late latetwo = new Late();
              Normal normaltwo = new Normal();
              LeaveEarly leaveEarlytwo = new LeaveEarly();
              Late latetwoRecord = new Late();
              LeaveEarly leaveEarlytwoRecord = new LeaveEarly();
              Attend attend2 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid, "2");
              if (attend2 != null) {
                if ("2".equals(attend2.getType())) {
                  if ("1".equals(attendSet.getCommute2())) {
                    int a22 = DateFormat.getWYQTime(attendSet.getAtime2()).intValue();
                    if (attend2.getAtime().intValue() > DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) {
                      status = "迟到";
                      latetwo.setTime(DateFormat.getwyqStrTime(attend2.getAtime()));
                      latetwo.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latetwo.setDate(DateFormat.getDatestrTime(nowdate));
                      latetwo.setStr("迟到(" + DateFormat.parseMillisecone(attend2.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) + ")");
                      latetwo.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime2());
                      latetwoRecord.setTime(DateFormat.getwyqStrTime(attend2.getAtime()));
                      latetwoRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latetwoRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      latetwoRecord.setStr("迟到(" + DateFormat.parseMillisecone(attend2.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) + ")");
                      latetwoRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime2());
                      lates.add(latetwo);
                      lateRecord.add(latetwoRecord);
                    }
                    else {
                      status = "正常";
                      normaltwo.setTime(DateFormat.getwyqStrTime(attend2.getAtime()));
                      normaltwo.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normaltwo.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normaltwo);
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend2.getAtime());
                    if (attend2.getAtime().intValue() < DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) {
                      status = "早退";
                      leaveEarlytwo.setTime(DateFormat.getwyqStrTime(attend2.getAtime()));
                      leaveEarlytwo.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlytwo.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlytwo.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime2()).intValue() - attend2.getAtime().intValue()) + ")");
                      leaveEarlytwo.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime2());
                      leaveEarlytwoRecord.setTime(DateFormat.getwyqStrTime(attend2.getAtime()));
                      leaveEarlytwoRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlytwoRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlytwoRecord.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime2()).intValue() - attend2.getAtime().intValue()) + ")");
                      leaveEarlytwoRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime2());
                      leaveEarlies.add(leaveEarlytwo);
                      leaveEarlyRecord.add(leaveEarlytwoRecord);
                    }
                    else {
                      status = "正常";
                      normaltwo.setTime(DateFormat.getwyqStrTime(attend2.getAtime()));
                      normaltwo.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normaltwo.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normaltwo);
                    }
                  }
                }
  
              }
              else
              {
                status = "未签到";
                LackCard lackCardtwo = new LackCard();
                LackCard lackCardtwoRecord = new LackCard();
                lackCardtwo.setTime(attendSet.getAtime2());
                lackCardtwo.setWeek(DateCompute.getWeekOfDate(nowdate));
                lackCardtwo.setDate(DateFormat.getDatestrTime(nowdate));
                lackCardtwoRecord.setTime(attendSet.getAtime2());
                lackCardtwoRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                lackCardtwoRecord.setDate(DateFormat.getDatestrTime(nowdate));
                lackCards.add(lackCardtwo);
                lackCardRecord.add(lackCardtwoRecord);
              }
  
            }
  
            if ("1".equals(attendSet.getAtime3Setother())) {
              String status = "";
              Late latethree = new Late();
              Normal normalthree = new Normal();
              LeaveEarly leaveEarlythree = new LeaveEarly();
              Late latethreeRecord = new Late();
              LeaveEarly leaveEarlythreeRecord = new LeaveEarly();
              Attend attend3 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid, "3");
              if (attend3 != null)
              {
                if ("3".equals(attend3.getType()))
                {
                  if ("1".equals(attendSet.getCommute2())) {
                    String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                      status = "迟到";
                      latethree.setTime(DateFormat.getwyqStrTime(attend3.getAtime()));
                      latethree.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latethree.setDate(DateFormat.getDatestrTime(nowdate));
                      latethree.setStr("迟到(" + DateFormat.parseMillisecone(attend3.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime3()).intValue()) + ")");
                      latethree.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime3());
                      latethreeRecord.setTime(DateFormat.getwyqStrTime(attend3.getAtime()));
                      latethreeRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latethreeRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      latethreeRecord.setStr("迟到(" + DateFormat.parseMillisecone(attend3.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime3()).intValue()) + ")");
                      latethreeRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime3());
                      lates.add(latethree);
                      lateRecord.add(latethreeRecord);
                    }
                    else {
                      status = "正常";
                      normalthree.setTime(DateFormat.getwyqStrTime(attend3.getAtime()));
                      normalthree.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalthree.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalthree);
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                      status = "早退";
                      leaveEarlythree.setTime(DateFormat.getwyqStrTime(attend3.getAtime()));
                      leaveEarlythree.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlythree.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlythree.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime3()).intValue() - attend3.getAtime().intValue()) + ")");
                      leaveEarlythree.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime3());
                      leaveEarlythreeRecord.setTime(DateFormat.getwyqStrTime(attend3.getAtime()));
                      leaveEarlythreeRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlythreeRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlythreeRecord.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime3()).intValue() - attend3.getAtime().intValue()) + ")");
                      leaveEarlythreeRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime3());
                      leaveEarlies.add(leaveEarlythree);
                      leaveEarlyRecord.add(leaveEarlythreeRecord);
                    }
                    else {
                      status = "正常";
                      normalthree.setTime(DateFormat.getwyqStrTime(attend3.getAtime()));
                      normalthree.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalthree.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalthree);
                    }
                  }
                }
  
              }
              else
              {
                status = "未签到";
                LackCard lackCardthree = new LackCard();
                LackCard lackCardthreeRecord = new LackCard();
                lackCardthree.setTime(attendSet.getAtime3());
                lackCardthree.setWeek(DateCompute.getWeekOfDate(nowdate));
                lackCardthree.setDate(DateFormat.getDatestrTime(nowdate));
                lackCardthreeRecord.setTime(attendSet.getAtime3());
                lackCardthreeRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                lackCardthreeRecord.setDate(DateFormat.getDatestrTime(nowdate));
                lackCards.add(lackCardthree);
                lackCardRecord.add(lackCardthreeRecord);
              }
  
            }
  
            if ("1".equals(attendSet.getAtime4Setother())) {
              String status = "";
              Late latefour = new Late();
              Normal normalfour = new Normal();
              LeaveEarly leaveEarlyfour = new LeaveEarly();
              LeaveEarly leaveEarlyfourRecord = new LeaveEarly();
              Late latefourRecord = new Late();
              Attend attend4 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid, "4");
              if (attend4 != null)
              {
                if ("4".equals(attend4.getType()))
                {
                  if ("1".equals(attendSet.getCommute4())) {
                    String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                      status = "迟到";
                      latefour.setTime(DateFormat.getwyqStrTime(attend4.getAtime()));
                      latefour.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latefour.setDate(DateFormat.getDatestrTime(nowdate));
                      latefour.setStr("迟到(" + DateFormat.parseMillisecone(attend4.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime4()).intValue()) + ")");
                      latefour.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime4());
                      latefourRecord.setTime(DateFormat.getwyqStrTime(attend4.getAtime()));
                      latefourRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latefourRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      latefourRecord.setStr("迟到(" + DateFormat.parseMillisecone(attend4.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime4()).intValue()) + ")");
                      latefourRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime4());
                      lates.add(latefour);
                      lateRecord.add(latefourRecord);
                    }
                    else {
                      status = "正常";
                      normalfour.setTime(DateFormat.getwyqStrTime(attend4.getAtime()));
                      normalfour.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalfour.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalfour);
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                      status = "早退";
                      leaveEarlyfour.setTime(DateFormat.getwyqStrTime(attend4.getAtime()));
                      leaveEarlyfour.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlyfour.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlyfour.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime4()).intValue() - attend4.getAtime().intValue()) + ")");
                      leaveEarlyfour.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime4());
                      leaveEarlyfourRecord.setTime(DateFormat.getwyqStrTime(attend4.getAtime()));
                      leaveEarlyfourRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlyfourRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlyfourRecord.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime4()).intValue() - attend4.getAtime().intValue()) + ")");
                      leaveEarlyfourRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime4());
                      leaveEarlies.add(leaveEarlyfour);
                      leaveEarlyRecord.add(leaveEarlyfourRecord);
                    }
                    else
                    {
                      status = "正常";
                      normalfour.setTime(DateFormat.getwyqStrTime(attend4.getAtime()));
                      normalfour.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalfour.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalfour);
                    }
                  }
                }
                else {
                  status = "未签到";
                  LackCard lackCardfour = new LackCard();
                  LackCard lackCardfourRecord = new LackCard();
                  lackCardfour.setTime(attendSet.getAtime4());
                  lackCardfour.setWeek(DateCompute.getWeekOfDate(nowdate));
                  lackCardfour.setDate(DateFormat.getDatestrTime(nowdate));
                  lackCardfourRecord.setTime(attendSet.getAtime4());
                  lackCardfourRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                  lackCardfourRecord.setDate(DateFormat.getDatestrTime(nowdate));
                  lackCards.add(lackCardfour);
                  lackCardRecord.add(lackCardfourRecord);
                }
  
              }
  
            }
  
            if ("1".equals(attendSet.getAtime5Setother())) {
              String status = "";
              Late latefive = new Late();
              Late latefiveRecord = new Late();
              Normal normalfour = new Normal();
              LeaveEarly leaveEarlyfive = new LeaveEarly();
              LeaveEarly leaveEarlyfiveRecord = new LeaveEarly();
              Attend attend5 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid, "5");
              if (attend5 != null)
              {
                if ("5".equals(attend5.getType()))
                {
                  if ("1".equals(attendSet.getCommute5())) {
                    String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                      status = "迟到";
                      latefive.setTime(DateFormat.getwyqStrTime(attend5.getAtime()));
                      latefive.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latefive.setDate(DateFormat.getDatestrTime(nowdate));
                      latefive.setStr("迟到(" + DateFormat.parseMillisecone(attend5.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime5()).intValue()) + ")");
                      latefive.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime5());
                      latefiveRecord.setTime(DateFormat.getwyqStrTime(attend5.getAtime()));
                      latefiveRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latefiveRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      latefiveRecord.setStr("迟到(" + DateFormat.parseMillisecone(attend5.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime5()).intValue()) + ")");
                      latefiveRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime5());
                      lates.add(latefive);
                      lateRecord.add(latefiveRecord);
                    }
                    else {
                      status = "正常";
                      normalfour.setTime(DateFormat.getwyqStrTime(attend5.getAtime()));
                      normalfour.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalfour.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalfour);
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                      status = "早退";
                      leaveEarlyfive.setTime(DateFormat.getwyqStrTime(attend5.getAtime()));
                      leaveEarlyfive.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlyfive.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlyfive.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime5()).intValue() - attend5.getAtime().intValue()) + ")");
                      leaveEarlyfive.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime5());
                      leaveEarlyfiveRecord.setTime(DateFormat.getwyqStrTime(attend5.getAtime()));
                      leaveEarlyfiveRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlyfiveRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlyfiveRecord.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime5()).intValue() - attend5.getAtime().intValue()) + ")");
                      leaveEarlyfiveRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime5());
                      leaveEarlies.add(leaveEarlyfive);
                      leaveEarlyRecord.add(leaveEarlyfiveRecord);
                    }
                    else {
                      status = "正常";
                      normalfour.setTime(DateFormat.getwyqStrTime(attend5.getAtime()));
                      normalfour.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalfour.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalfour);
                    }
                  }
                }
                else
                {
                  status = "未签到";
                  LackCard lackCardfive = new LackCard();
                  LackCard lackCardfiveRecord = new LackCard();
                  lackCardfive.setTime(attendSet.getAtime5());
                  lackCardfive.setWeek(DateCompute.getWeekOfDate(nowdate));
                  lackCardfive.setDate(DateFormat.getDatestrTime(nowdate));
                  lackCardfiveRecord.setTime(attendSet.getAtime5());
                  lackCardfiveRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                  lackCardfiveRecord.setDate(DateFormat.getDatestrTime(nowdate));
                  lackCards.add(lackCardfive);
                  lackCardRecord.add(lackCardfiveRecord);
                }
  
              }
  
            }
  
            if ("1".equals(attendSet.getAtime6Setother())) {
              String status = "";
              Late latesix = new Late();
              Late latesixRecord = new Late();
              Normal normalsix = new Normal();
              LeaveEarly leaveEarlysix = new LeaveEarly();
              LeaveEarly leaveEarlysixRecord = new LeaveEarly();
              Attend attend6 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid, "6");
              if (attend6 != null)
              {
                if ("6".equals(attend6.getType()))
                {
                  if ("1".equals(attendSet.getCommute6())) {
                    String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                      status = "迟到";
                      latesix.setTime(DateFormat.getwyqStrTime(attend6.getAtime()));
                      latesix.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latesix.setDate(DateFormat.getDatestrTime(nowdate));
                      latesix.setStr("迟到(" + DateFormat.parseMillisecone(attend6.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime6()).intValue()) + ")");
                      latesix.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime6());
                      latesixRecord.setTime(DateFormat.getwyqStrTime(attend6.getAtime()));
                      latesixRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      latesixRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      latesixRecord.setStr("迟到(" + DateFormat.parseMillisecone(attend6.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime6()).intValue()) + ")");
                      latesixRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime6());
                      lates.add(latesix);
                      lateRecord.add(latesixRecord);
                    }
                    else {
                      status = "正常";
                      normalsix.setTime(DateFormat.getwyqStrTime(attend6.getAtime()));
                      normalsix.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalsix.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalsix);
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                      status = "早退";
                      leaveEarlysix.setTime(DateFormat.getwyqStrTime(attend6.getAtime()));
                      leaveEarlysix.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlysix.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlysix.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime6()).intValue() - attend6.getAtime().intValue()) + ")");
                      leaveEarlysix.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime6());
                      leaveEarlysixRecord.setTime(DateFormat.getwyqStrTime(attend6.getAtime()));
                      leaveEarlysixRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                      leaveEarlysixRecord.setDate(DateFormat.getDatestrTime(nowdate));
                      leaveEarlysixRecord.setStr("早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime6()).intValue() - attend6.getAtime().intValue()) + ")");
                      leaveEarlysixRecord.setAtime(DateFormat.getDatestr(nowdate) + "  " + attendSet.getAtime6());
                      leaveEarlies.add(leaveEarlysix);
                      leaveEarlyRecord.add(leaveEarlysixRecord);
                    }
                    else {
                      status = "正常";
                      normalsix.setTime(DateFormat.getwyqStrTime(attend6.getAtime()));
                      normalsix.setWeek(DateCompute.getWeekOfDate(nowdate));
                      normalsix.setDate(DateFormat.getDatestrTime(nowdate));
                      normals.add(normalsix);
                    }
                  }
                }
                else
                {
                  status = "未签到";
                  LackCard lackCardsix = new LackCard();
                  LackCard lackCardsixRecord = new LackCard();
                  lackCardsix.setTime(attendSet.getAtime6());
                  lackCardsix.setWeek(DateCompute.getWeekOfDate(nowdate));
                  lackCardsix.setDate(DateFormat.getDatestrTime(nowdate));
                  lackCardsixRecord.setTime(attendSet.getAtime6());
                  lackCardsixRecord.setWeek(DateCompute.getWeekOfDate(nowdate));
                  lackCardsixRecord.setDate(DateFormat.getDatestrTime(nowdate));
                  lackCards.add(lackCardsix);
                  lackCardRecord.add(lackCardsixRecord);
                }
  
              }
  
            }
  
            if (normals.size() >= xqhbt) {
              normalNew.setWeek(DateCompute.getWeekOfDate(nowdate));
              normalNew.setDate(DateFormat.getDatestrTime(nowdate));
              normalNews.add(normalNew);
            }
  
            normals.clear();
          }
  
          List attendList = new ArrayList();
          Attend attendfirst = new Attend();
          attendfirst.setSname("迟到记录");
          attendfirst.setRemarksList(lateRecord);
  
          Attend attendtwo = new Attend();
          attendtwo.setSname("早退记录");
          attendtwo.setRemarksList(leaveEarlyRecord);
          Attend attendthree = new Attend();
          attendthree.setSname("缺卡记录");
          attendthree.setRemarksList(lackCardRecord);
          Attend attendfour = new Attend();
          attendfour.setSname("旷工记录");
          attendfour.setRemarksList(absenteeismRecord);
          attendList.add(attendfirst);
          attendList.add(attendtwo);
          attendList.add(attendthree);
          attendList.add(attendfour);
          Attend attend1 = new Attend();
          attend1.setSname("出勤天数");
          if (attendances.size() > 0) {
            attend1.setNum(attendances.size() + "");
            attend1.setState("1");
          } else {
            attend1.setNum("0");
            attend1.setState("0");
          }
          attend1.setType("天");
          attend1.setRemarksList(attendances);
  
          Attend attend2 = new Attend();
          attend2.setSname("正常打卡");
          if (normalNews.size() > 0) {
            attend2.setNum(normalNews.size() + "");
            attend2.setState("1");
          } else {
            attend2.setNum("0");
            attend2.setState("0");
          }
          attend2.setType("天");
          attend2.setRemarksList(normalNews);
          Attend attend3 = new Attend();
          attend3.setSname("外勤打卡");
          if (fields.size() > 0) {
            attend3.setNum(fields.size() + "");
            attend3.setState("1");
          } else {
            attend3.setNum("0");
            attend3.setState("0");
          }
          attend3.setType("次");
          attend3.setRemarksList(fields);
          Attend attend4 = new Attend();
          attend4.setSname("早退");
          if (leaveEarlies.size() > 0) {
            attend4.setNum(leaveEarlies.size() + "");
            attend4.setState("1");
          } else {
            attend4.setNum("0");
            attend4.setState("0");
          }
          attend4.setType("次");
          attend4.setRemarksList(leaveEarlies);
          Attend attend5 = new Attend();
          attend5.setSname("缺卡");
          if (lackCards.size() > 0) {
            attend5.setNum(lackCards.size() + "");
            attend5.setState("1");
          } else {
            attend5.setNum("0");
            attend5.setState("0");
          }
          attend5.setType("次");
          attend5.setRemarksList(lackCards);
          Attend attend6 = new Attend();
          attend6.setSname("迟到");
          if (lates.size() > 0) {
            attend6.setNum(lates.size() + "");
            attend6.setState("1");
          } else {
            attend6.setNum("0");
            attend6.setState("0");
          }
          attend6.setType("次");
          attend6.setRemarksList(lates);
          Attend attend7 = new Attend();
          attend7.setSname("旷工");
          if (absenteeisms.size() > 0) {
            attend7.setNum(absenteeisms.size() + "");
            attend7.setState("1");
          } else {
            attend7.setNum("0");
            attend7.setState("0");
          }
          attend7.setType("天");
          attend7.setRemarksList(absenteeisms);
          Attend attend8 = new Attend();
          attend8.setSname("设备异常");
          if (unitExceptionList.size() > 0) {
            attend8.setNum(unitExceptionList.size() + "");
            attend8.setState("1");
          } else {
            attend8.setNum("0");
            attend8.setState("0");
          }
          attend8.setType("次");
          attend8.setRemarksList(unitExceptionList);
          Attend leave = new Attend();
          leave.setSname("请假");
          if (attendLeaveList.size() > 0) {
            leave.setNum(attendLeaveList.size() + "");
            leave.setState("1");
          } else {
            leave.setNum("0");
            leave.setState("0");
          }
          leave.setType("次");
          leave.setRemarksList(attendLeaveList);
          Attend overtime = new Attend();
          overtime.setSname("加班");
          if (attendanceOvertimeList.size() > 0) {
            overtime.setNum(attendanceOvertimeList.size() + "");
            overtime.setState("1");
          } else {
            overtime.setNum("0");
            overtime.setState("0");
          }
          overtime.setType("次");
          overtime.setRemarksList(attendanceOvertimeList);
  
          Attend goOut = new Attend();
          goOut.setSname("外出");
          if (attendOutList.size() > 0) {
            goOut.setNum(attendOutList.size() + "");
            goOut.setState("1");
          } else {
            goOut.setNum("0");
            goOut.setState("0");
          }
          goOut.setType("次");
          goOut.setRemarksList(attendOutList);
          Attend evection = new Attend();
          evection.setSname("出差");
          if (attendEvectionList.size() > 0) {
            evection.setNum(attendEvectionList.size() + "");
            evection.setState("1");
          } else {
            evection.setNum("0");
            evection.setState("0");
          }
          evection.setType("次");
          evection.setRemarksList(attendEvectionList);
  
          workList.add(attend1);
          workList.add(attend2);
          workList.add(attend3);
          workList.add(attend4);
          workList.add(attend5);
          workList.add(attend6);
          workList.add(attend7);
          workList.add(attend8);
          workList.add(leave);
          workList.add(overtime);
          workList.add(goOut);
          workList.add(evection);
          attend.setAttendList(workList);
          attend.setList(attendList);
          attend.setType(attendSet.getTitle());
          wrappers.setFlag(true);
          wrappers.setStatus(true);
          wrappers.setData(attend);
          wrappers.setMsg("更新成功");
        }
        else {
          wrappers.setFlag(false);
          wrappers.setStatus(true);
          wrappers.setMsg("更新失败");
        }
      }
      else {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("更新失败");
      }
  
      return wrappers;
    }
  
    public List<BaseAttend> myAttendUnitException(String start, String end, String uid, HttpServletRequest request) {
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
  
      Map map = new HashMap();
      map.put("strat", start);
      map.put("end", end);
      map.put("uid", uid);
      List<Attend> attendList = this.attendMapper.queryCountPhone(map);
      List<Integer> attendList1 = new ArrayList<Integer>();
      List<Attend> attendList3 = new ArrayList<Attend>();
      List unitExceptionList = new ArrayList();
  
      Attend attendNew = new Attend();
      Integer a1;
      for (Attend attend1 : attendList) {
        attendList1.add(attend1.getCount());
        a1 = attend1.getCount();
      } 
      double b;
              String phone;
      if ((attendList1 != null) && (attendList1.size() > 0))
      {
        Integer integer = (Integer)Collections.max(attendList1);
        int i = integer.intValue();
        b = i * 0.3D;
        for (Attend attend1 : attendList)
          if (b >= attend1.getCount().intValue())
          {
            phone = attend1.getPhoneId();
            Map maps = new HashMap();
            maps.put("phone", phone);
            maps.put("strat", start);
            maps.put("end", end);
            List<Attend> attendList2 = this.attendMapper.queryAttendPhone(maps);
            for (Attend attend11 : attendList2) {
              UnitException unitException = new UnitException();
              unitException.setDate(DateFormat.getDatestrTime(attend11.getDate()));
              unitException.setTime(DateFormat.getwyqStrTime(attend11.getAtime()));
              unitException.setPhoneId(attend11.getPhoneId());
              unitException.setAtime(DateFormat.getDatestrTime(attend11.getDate()) + "    " + DateFormat.getwyqStrTime(attend11.getAtime()));
              Map map1 = new HashMap();
  
              String msg = "";
              if (!users.getUid().equals(attend11.getUid())) {
                String name = this.usersMapper.getUsernameById(attend11.getUid().intValue());
                msg = "疑似" + name + "代签";
              } else {
                msg = "新设备" + phone;
              }
              unitException.setStr(msg);
              unitExceptionList.add(unitException);
            }
          }
      }
      
      return unitExceptionList;
    }
  
    public String companyAttendanceException(String date, String uid, String type)
      throws ParseException
    {
      String[] date1 = date.split("-");
      String start = date1[0] + "-" + date1[1];
      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
      SimpleDateFormat matter2 = new SimpleDateFormat("yyyy-MM-dd");
      Date dt = new Date();
      String a11 = df.format(dt);
      String stratDate = "";
      String endDate = "";
      if (start.equals(a11)) {
        stratDate = date + "-01";
        endDate = matter2.format(dt);
      } else {
        Date date2 = df.parse(start);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date2);
        int first1 = calendar.getActualMinimum(5);
        int last1 = calendar.getActualMaximum(5);
        stratDate = start + "-01";
        endDate = start + "-" + last1;
      }
  
      Map map = new HashMap();
      map.put("strat", stratDate);
      map.put("end", endDate);
      map.put("uid", uid);
      List<Attend> attendList = this.attendMapper.queryCountPhone(map);
      List attendList1 = new ArrayList();
  
      List unitExceptionList = new ArrayList();
  
      Attend attendNew = new Attend();
      Integer a1;
      for (Attend attend1 : attendList) {
        attendList1.add(attend1.getCount());
        a1 = attend1.getCount();
      }
      
      double b;
      if ((attendList1 != null) && (attendList1.size() > 0)) {
        Integer integer = (Integer)Collections.max(attendList1);
        int i = integer.intValue();
        b = i * 0.3D;
        for (Attend attend1 : attendList) {
          if (b >= attend1.getCount().intValue())
          {
            String phone = attend1.getPhoneId();
            Map maps = new HashMap();
            maps.put("phone", phone);
            maps.put("date", date);
            maps.put("type", type);
  
            List attendListNew = this.attendMapper.queryAttendPhoneId(maps);
            Iterator attendIterator = attendListNew.iterator();
            if (attendIterator.hasNext()) {
              Attend attend = (Attend)attendIterator.next();
              if (attend != null) {
                String msg = "";
                if (!uid.equals(attend.getUid().toString())) {
                  String name = this.usersMapper.getUsernameById(attend.getUid().intValue());
                  msg = "疑似" + name + "代签";
                } else {
                  msg = "新设备" + phone;
                }
  
                return msg;
              }
              return null;
            }
          }
        }
  
      }
  
      return null;
    }
  
    public BaseWrapper companyAttendance(String date)
    {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      try {
        Map maps = new HashMap();
        List usersList = this.usersMapper.getAlluser(maps);
        Iterator usersIterator = usersList.iterator();
        List normal = new ArrayList();
        List normalyichang = new ArrayList();
        List closed = new ArrayList();
        List closedyichang = new ArrayList();
        List notSign = new ArrayList();
        List notOut = new ArrayList();
        List leaveEarly = new ArrayList();
        List late = new ArrayList();
        List filds = new ArrayList();
        List notSignNumbers = new ArrayList();
        List notOutNumbers = new ArrayList();
        List leaveEarlyNumbers = new ArrayList();
        List lateNumbers = new ArrayList();
  
        List leaves = new ArrayList();
        List waichu = new ArrayList();
        List chucha = new ArrayList();
  
        int chuqinRenshu = 0;
        while (usersIterator.hasNext()) {
          Users users = (Users)usersIterator.next();
          BaseSupplement normalB = new BaseSupplement();
          BaseSupplement normalyichangB = new BaseSupplement();
          BaseSupplement closedB = new BaseSupplement();
          BaseSupplement closedyichangB = new BaseSupplement();
          BaseSupplement lateNumber = new BaseSupplement();
          BaseSupplement leaveEarlyNumber = new BaseSupplement();
          BaseSupplement notSignNumber = new BaseSupplement();
          BaseSupplement notOutNumber = new BaseSupplement();
  
          Integer uid = users.getUid();
          Map mapss = new HashMap();
          mapss.put("uid", uid);
          mapss.put("date", date);
          UserExt userExt = this.userExtMapper.queryUserExt(uid.toString());
          if (userExt != null) {
            Date dateTime = new Date();
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            String time = format.format(dateTime);
            Date dateTime1 = new Date();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String time1 = format1.format(dateTime1);
            AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(userExt.getDutyType().shortValue()));
            if (attendSet != null) {
              String[] str1 = attendSet.getAtime1Set().split("\\|");
              attendSet.setAtime1Setother(str1[0]);
              attendSet.setCommute1(str1[1]);
              String[] str2 = attendSet.getAtime2Set().split("\\|");
              attendSet.setAtime2Setother(str2[0]);
              attendSet.setCommute2(str2[1]);
              String[] str3 = attendSet.getAtime3Set().split("\\|");
              attendSet.setAtime3Setother(str3[0]);
              attendSet.setCommute3(str3[1]);
              String[] str4 = attendSet.getAtime4Set().split("\\|");
              attendSet.setAtime4Setother(str4[0]);
              attendSet.setCommute4(str4[1]);
              String[] str5 = attendSet.getAtime5Set().split("\\|");
              attendSet.setAtime5Setother(str5[0]);
              attendSet.setCommute5(str5[1]);
              String[] str6 = attendSet.getAtime6Set().split("\\|");
              attendSet.setAtime6Setother(str6[0]);
              attendSet.setCommute6(str6[1]);
  
              if ("1".equals(attendSet.getIsOut())) {
                List attendList = new ArrayList();
                List attend0 = this.attendMapper.selectAttend0(date, uid.toString());
                if ((attend0 != null) && (attend0.size() > 0)) {
                  BaseSupplement fild = new BaseSupplement();
                  fild.setUid(uid.toString());
                  fild.setName(users.getName());
                  fild.setAvatar(users.getAvatar());
                  if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                    Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                    fild.setDept(department.getDeptName());
                  } else {
                    fild.setDept("未指定部门");
                  }
  
                  fild.setStr(attend0.size() + "次外勤记录");
                  Iterator attendIterator = attend0.iterator();
                  while (attendIterator.hasNext()) {
                    Attend attend = (Attend)attendIterator.next();
                    Attend attendwaiqin = new Attend();
                    attendwaiqin.setTime(DateFormat.getwyqStrTime(attend.getAtime()));
                    String[] a2 = attend.getAddress().split(",");
                    attendwaiqin.setAddress(a2[(a2.length - 1)]);
                    attendList.add(attendwaiqin);
                  }
                  fild.setCishu(attendList);
                  filds.add(fild);
                }
  
              }
  
              List attendLeaveList = this.attendLeaveMapper.selectAttendLeaveModify(users.getUserId(), date);
              if ((attendLeaveList.size() > 0) && (attendLeaveList != null)) {
                Iterator attendIterator = attendLeaveList.iterator();
                while (attendIterator.hasNext()) {
                  AttendLeave attendLeave = (AttendLeave)attendIterator.next();
                  BaseSupplement attendLeaveqingjia = new BaseSupplement();
                  attendLeaveqingjia.setUid(uid.toString());
                  attendLeaveqingjia.setName(users.getName());
                  attendLeaveqingjia.setAvatar(users.getAvatar());
                  if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                    Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                    attendLeaveqingjia.setDept(department.getDeptName());
                  } else {
                    attendLeaveqingjia.setDept("未指定部门");
                  }
  
                  attendLeaveqingjia.setStr(DateFormat.getStrDate(attendLeave.getLeaveDate1()) + "至" + DateFormat.getStrDate(attendLeave.getLeaveDate2()));
                  attendLeaveqingjia.setContent("原因:" + attendLeave.getLeaveType());
                  attendLeaveqingjia.setFlag(attendLeave.getLeaveType2());
                  leaves.add(attendLeaveqingjia);
                }
              }
              List attendOutList = this.attendOutMapper.queryAttendOut(users.getUserId(), date);
              if ((attendOutList.size() > 0) && (attendOutList != null)) {
                Iterator attendOutIterator = attendOutList.iterator();
                while (attendOutIterator.hasNext()) {
                  AttendOut attendOut = (AttendOut)attendOutIterator.next();
                  BaseSupplement attendOutwaichu = new BaseSupplement();
                  attendOutwaichu.setUid(uid.toString());
                  attendOutwaichu.setName(users.getName());
                  attendOutwaichu.setAvatar(users.getAvatar());
                  if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                    Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                    attendOutwaichu.setDept(department.getDeptName());
                  } else {
                    attendOutwaichu.setDept("未指定部门");
                  }
  
                  attendOutwaichu.setStr(attendOut.getOutTime1() + "至" + attendOut.getOutTime2());
                  attendOutwaichu.setContent("原因:" + attendOut.getOutType());
                  attendOutwaichu.setFlag(attendOut.getStatus());
  
                  waichu.add(attendOutwaichu);
                }
              }
              List attendEvections = this.attendEvectionMapper.selectAttendEvectionModify(users.getUserId(), date);
              if ((attendEvections.size() > 0) && (attendEvections != null)) {
                Iterator attendEvectionIterator = attendEvections.iterator();
  
                while (attendEvectionIterator.hasNext()) {
                  AttendEvection attendEvection = (AttendEvection)attendEvectionIterator.next();
                  BaseSupplement attendEvectionchucha = new BaseSupplement();
                  attendEvectionchucha.setUid(uid.toString());
                  attendEvectionchucha.setName(users.getName());
                  attendEvectionchucha.setAvatar(users.getAvatar());
                  if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                    Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                    attendEvectionchucha.setDept(department.getDeptName());
                  } else {
                    attendEvectionchucha.setDept("未指定部门");
                  }
  
                  attendEvectionchucha.setStr(DateFormat.getStrDate(attendEvection.getEvectionDate1()) + "至" + DateFormat.getStrDate(attendEvection.getEvectionDate2()));
                  attendEvectionchucha.setContent("原因:" + attendEvection.getReason() + "地点" + attendEvection.getEvectionDest());
                  attendEvectionchucha.setFlag(attendEvection.getStatus());
                  chucha.add(attendEvectionchucha);
                }
              }
  
              Map chuqinmap = new HashMap();
              chuqinmap.put("uid", uid);
              chuqinmap.put("date", date);
              List attendList111 = this.attendMapper.selectAttendList(chuqinmap);
              if ((attendList111 != null) && (attendList111.size() > 0)) {
                chuqinRenshu++;
              }
  
              if (("1".equals(attendSet.getAtime1Setother())) && (
                (DateFormat.getDateTimes(attendSet.getAtime1()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))) {
                String status = "";
                if ("1".equals(attendSet.getCommute1())) {
                  Attend attend1 = this.attendMapper.selectAttendAll(date, uid.toString(), "1");
                  if (attend1 != null) {
                    String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                      status = "迟到";
                      BaseSupplement latefirst = new BaseSupplement();
                      latefirst.setUid(uid.toString());
                      latefirst.setName(users.getName());
                      latefirst.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                        latefirst.setDept(department.getDeptName());
                      } else {
                        latefirst.setDept("未指定部门");
                      }
  
                      latefirst.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend1.getAtime()) + "迟到(" + DateFormat.parseMillisecone(attend1.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime1()).intValue()) + ")");
  
                      lateNumber.setStr("签到时间为：" + attendSet.getAtime1() + DateFormat.getwyqStrTime(attend1.getAtime()) + DateFormat.getwyqStrTime(Integer.valueOf(attend1.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime1()).intValue())));
  
                      late.add(latefirst);
                    }
                    else {
                      status = "正常";
                      String msg = companyAttendanceException(date, uid.toString(), "1");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        normalyichangB.setUid(uid.toString());
                        normalyichangB.setName(users.getName());
                        normalyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalyichangB.setDept(department.getDeptName());
                        } else {
                          normalyichangB.setDept("未指定部门");
                        }
  
                        normalyichangB.setStr(msg);
                      }
                      else {
                        normalB.setUid(uid.toString());
                        normalB.setName(users.getName());
                        normalB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalB.setDept(department.getDeptName());
                        } else {
                          normalB.setDept("未指定部门");
                        }
  
                        normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend1.getAtime()));
                      }
                    }
  
                  }
                  else
                  {
                    status = "未签到";
                    BaseSupplement notSignfirst = new BaseSupplement();
                    notSignfirst.setUid(uid.toString());
                    notSignfirst.setName(users.getName());
                    notSignfirst.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                      notSignfirst.setDept(department.getDeptName());
                    } else {
                      notSignfirst.setDept("未指定部门");
                    }
                    notSignfirst.setStr("未签到(规定签到时间为：" + attendSet.getAtime1() + ")");
                    notSignNumber.setStr("签到时间为：" + attendSet.getAtime1());
  
                    notSign.add(notSignfirst);
                  }
                }
                else
                {
                  Attend attend1 = this.attendMapper.selectAttendAll(date, uid.toString(), "1");
                  if (attend1 != null) {
                    String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                      status = "早退";
                      BaseSupplement leaveEarlyfirst = new BaseSupplement();
                      leaveEarlyfirst.setUid(uid.toString());
                      leaveEarlyfirst.setName(users.getName());
                      leaveEarlyfirst.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        leaveEarlyfirst.setDept(department.getDeptName());
                      } else {
                        leaveEarlyfirst.setDept("未指定部门");
                      }
  
                      leaveEarlyfirst.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend1.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime1()).intValue() - attend1.getAtime().intValue()) + ")");
                      leaveEarlyNumber.setStr("签到时间为：" + attendSet.getAtime1());
  
                      leaveEarly.add(leaveEarlyfirst);
                    }
                    else {
                      String msg = companyAttendanceException(date, uid.toString(), "1");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        closedyichangB.setUid(uid.toString());
                        closedyichangB.setName(users.getName());
                        closedyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedyichangB.setDept(department.getDeptName());
                        } else {
                          closedyichangB.setDept("未指定部门");
                        }
  
                        closedyichangB.setStr(msg);
                      }
                      else {
                        closedB.setUid(uid.toString());
                        closedB.setName(users.getName());
                        closedB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedB.setDept(department.getDeptName());
                        } else {
                          closedB.setDept("未指定部门");
                        }
  
                        closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend1.getAtime()));
                      }
                    }
                  }
                  else {
                    status = "未签到";
                    BaseSupplement notOutfirst = new BaseSupplement();
                    notOutfirst.setUid(uid.toString());
                    notOutfirst.setName(users.getName());
                    notOutfirst.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                      notOutfirst.setDept(department.getDeptName());
                    } else {
                      notOutfirst.setDept("未指定部门");
                    }
  
                    notOutfirst.setStr("未签退(规定签到时间为：" + attendSet.getAtime1() + ")");
                    notOutNumber.setStr("签到时间为：" + attendSet.getAtime1());
  
                    notOut.add(notOutfirst);
                  }
  
                }
  
              }
  
              if (("1".equals(attendSet.getAtime2Setother())) && (
                (DateFormat.getDateTimes(attendSet.getAtime2()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))) {
                String status = "";
                if ("1".equals(attendSet.getCommute2())) {
                  Attend attend2 = this.attendMapper.selectAttendAll(date, uid.toString(), "2");
                  if (attend2 != null) {
                    int a22 = DateFormat.getWYQTime(attendSet.getAtime2()).intValue();
                    if (attend2.getAtime().intValue() > DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) {
                      status = "迟到";
                      BaseSupplement latetwo = new BaseSupplement();
                      latetwo.setUid(uid.toString());
                      latetwo.setName(users.getName());
                      latetwo.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        latetwo.setDept(department.getDeptName());
                      } else {
                        latetwo.setDept("未指定部门");
                      }
                      latetwo.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend2.getAtime()) + "迟到(" + DateFormat.parseMillisecone(attend2.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) + ")");
                      lateNumber.setStr("签到时间为：" + attendSet.getAtime2());
  
                      late.add(latetwo);
                    } else {
                      status = "正常";
                      String msg = companyAttendanceException(date, uid.toString(), "2");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        normalyichangB.setUid(uid.toString());
                        normalyichangB.setName(users.getName());
                        normalyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalyichangB.setDept(department.getDeptName());
                        } else {
                          normalyichangB.setDept("未指定部门");
                        }
  
                        normalyichangB.setStr(msg);
                      }
                      else {
                        normalB.setUid(uid.toString());
                        normalB.setName(users.getName());
                        normalB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalB.setDept(department.getDeptName());
                        } else {
                          normalB.setDept("未指定部门");
                        }
  
                        normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend2.getAtime()));
                      }
                    }
                  }
                  else {
                    status = "未签到";
                    BaseSupplement notSigntwo = new BaseSupplement();
                    notSigntwo.setUid(uid.toString());
                    notSigntwo.setName(users.getName());
                    notSigntwo.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                      notSigntwo.setDept(department.getDeptName());
                    } else {
                      notSigntwo.setDept("未指定部门");
                    }
                    notSigntwo.setStr("未签到(规定签到时间为：" + attendSet.getAtime1() + ")");
                    notSignNumber.setStr("签到时间为：" + attendSet.getAtime2());
  
                    notSign.add(notSigntwo);
                  }
                } else {
                  Attend attend2 = this.attendMapper.selectAttendAll(date, uid.toString(), "2");
                  if (attend2 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend2.getAtime());
                    if (attend2.getAtime().intValue() < DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) {
                      status = "早退";
                      BaseSupplement leaveEarlytwo = new BaseSupplement();
                      leaveEarlytwo.setUid(uid.toString());
                      leaveEarlytwo.setName(users.getName());
                      leaveEarlytwo.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        leaveEarlytwo.setDept(department.getDeptName());
                      } else {
                        leaveEarlytwo.setDept("未指定部门");
                      }
  
                      leaveEarlytwo.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend2.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime2()).intValue() - attend2.getAtime().intValue()) + ")");
                      leaveEarlyNumber.setStr("签到时间为：" + attendSet.getAtime2());
  
                      leaveEarly.add(leaveEarlytwo);
                    } else {
                      status = "正常";
                      String msg = companyAttendanceException(date, uid.toString(), "2");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        closedyichangB.setUid(uid.toString());
                        closedyichangB.setName(users.getName());
                        closedyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedyichangB.setDept(department.getDeptName());
                        } else {
                          closedyichangB.setDept("未指定部门");
                        }
  
                        closedyichangB.setStr(msg);
                      }
                      else {
                        closedB.setUid(uid.toString());
                        closedB.setName(users.getName());
                        closedB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedB.setDept(department.getDeptName());
                        } else {
                          closedB.setDept("未指定部门");
                        }
  
                        closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend2.getAtime()));
                      }
                    }
                  }
                  else {
                    status = "未签到";
                    BaseSupplement notOuttwo = new BaseSupplement();
                    notOuttwo.setUid(uid.toString());
                    notOuttwo.setName(users.getName());
                    notOuttwo.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                      notOuttwo.setDept(department.getDeptName());
                    } else {
                      notOuttwo.setDept("未指定部门");
                    }
  
                    notOuttwo.setStr("未签退(规定签到时间为：" + attendSet.getAtime2() + ")");
                    notOutNumber.setStr("签到时间为：" + attendSet.getAtime2());
  
                    notOut.add(notOuttwo);
                  }
  
                }
  
              }
  
              if (("1".equals(attendSet.getAtime3Setother())) && (
                (DateFormat.getDateTimes(attendSet.getAtime3()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))) {
                String status = "";
                if ("1".equals(attendSet.getCommute3())) {
                  Attend attend3 = this.attendMapper.selectAttendAll(date, uid.toString(), "3");
                  if (attend3 != null) {
                    String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                      status = "迟到";
                      BaseSupplement latethree = new BaseSupplement();
                      latethree.setUid(uid.toString());
                      latethree.setName(users.getName());
                      latethree.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        latethree.setDept(department.getDeptName());
                      } else {
                        latethree.setDept("未指定部门");
                      }
                      latethree.setStr("签到时间为：" + attendSet.getAtime3() + "迟到(" + DateFormat.parseMillisecone(attend3.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime3()).intValue()) + ")");
                      lateNumber.setStr("签到时间为：" + attendSet.getAtime3());
  
                      late.add(latethree);
                    } else {
                      status = "正常";
                      String msg = companyAttendanceException(date, uid.toString(), "3");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        normalyichangB.setUid(uid.toString());
                        normalyichangB.setName(users.getName());
                        normalyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalyichangB.setDept(department.getDeptName());
                        } else {
                          normalyichangB.setDept("未指定部门");
                        }
  
                        normalyichangB.setStr(msg);
                      }
                      else {
                        normalB.setUid(uid.toString());
                        normalB.setName(users.getName());
                        normalB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalB.setDept(department.getDeptName());
                        } else {
                          normalB.setDept("未指定部门");
                        }
  
                        normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend3.getAtime()));
                      }
                    }
                  }
                  else {
                    status = "weiqiandao";
                    BaseSupplement notSignthree = new BaseSupplement();
                    notSignthree.setUid(uid.toString());
                    notSignthree.setName(users.getName());
                    notSignthree.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                      notSignthree.setDept(department.getDeptName());
                    } else {
                      notSignthree.setDept("未指定部门");
                    }
                    notSignthree.setStr("未签到(规定签到时间为：" + attendSet.getAtime3() + ")");
                    notSignNumber.setStr("签到时间为：" + attendSet.getAtime3());
  
                    notSign.add(notSignthree);
                  }
                } else {
                  Attend attend3 = this.attendMapper.selectAttendAll(date, uid.toString(), "3");
                  if (attend3 != null) {
                    String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                      status = "早退";
                      BaseSupplement leaveEarlythree = new BaseSupplement();
                      leaveEarlythree.setUid(uid.toString());
                      leaveEarlythree.setName(users.getName());
                      leaveEarlythree.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        leaveEarlythree.setDept(department.getDeptName());
                      } else {
                        leaveEarlythree.setDept("未指定部门");
                      }
  
                      leaveEarlythree.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend3.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime3()).intValue() - attend3.getAtime().intValue()) + ")");
                      leaveEarlyNumber.setStr("签到时间为：" + attendSet.getAtime3());
  
                      leaveEarly.add(leaveEarlythree);
                    } else {
                      status = "正常";
                      String msg = companyAttendanceException(date, uid.toString(), "3");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        closedyichangB.setUid(uid.toString());
                        closedyichangB.setName(users.getName());
                        closedyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedyichangB.setDept(department.getDeptName());
                        } else {
                          closedyichangB.setDept("未指定部门");
                        }
  
                        closedyichangB.setStr(msg);
                      }
                      else {
                        closedB.setUid(uid.toString());
                        closedB.setName(users.getName());
                        closedB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedB.setDept(department.getDeptName());
                        } else {
                          closedB.setDept("未指定部门");
                        }
  
                        closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend3.getAtime()));
                      }
                    }
                  }
                  else {
                    status = "weiqiandao";
                    BaseSupplement notOutthree = new BaseSupplement();
                    notOutthree.setUid(uid.toString());
                    notOutthree.setName(users.getName());
                    notOutthree.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                      if (department != null)
                        notOutthree.setDept(department.getDeptName());
                      else
                        notOutthree.setDept("未指定部门");
                    }
                    else
                    {
                      notOutthree.setDept("未指定部门");
                    }
  
                    notOutthree.setStr("未签退(规定签到时间为：" + attendSet.getAtime3() + ")");
                    notOutNumber.setStr("签到时间为：" + attendSet.getAtime3());
  
                    notOut.add(notOutthree);
                  }
                }
              }
  
              if (("1".equals(attendSet.getAtime4Setother())) && (
                (DateFormat.getDateTimes(attendSet.getAtime4()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))) {
                String status = "";
                if ("1".equals(attendSet.getCommute4())) {
                  Attend attend4 = this.attendMapper.selectAttendAll(date, uid.toString(), "4");
                  if (attend4 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                      status = "迟到";
                      BaseSupplement latefour = new BaseSupplement();
                      latefour.setUid(uid.toString());
                      latefour.setName(users.getName());
                      latefour.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        latefour.setDept(department.getDeptName());
                      } else {
                        latefour.setDept("未指定部门");
                      }
  
                      latefour.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend4.getAtime()) + "迟到(" + DateFormat.returnTime(Integer.valueOf(attend4.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime4()).intValue())) + ")");
                      lateNumber.setStr("签到时间为：" + attendSet.getAtime4());
  
                      late.add(latefour);
                    } else {
                      status = "正常";
                      String msg = companyAttendanceException(date, uid.toString(), "4");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        normalyichangB.setUid(uid.toString());
                        normalyichangB.setName(users.getName());
                        normalyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalyichangB.setDept(department.getDeptName());
                        } else {
                          normalyichangB.setDept("未指定部门");
                        }
  
                        normalyichangB.setStr(msg);
                      }
                      else {
                        normalB.setUid(uid.toString());
                        normalB.setName(users.getName());
                        normalB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalB.setDept(department.getDeptName());
                        } else {
                          normalB.setDept("未指定部门");
                        }
  
                        normalB.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend4.getAtime()));
                      }
                    }
                  }
                  else
                  {
                    status = "weiqiandao";
                    BaseSupplement notSignfour = new BaseSupplement();
                    notSignfour.setUid(uid.toString());
                    notSignfour.setName(users.getName());
                    notSignfour.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                      notSignfour.setDept(department.getDeptName());
                    } else {
                      notSignfour.setDept("未指定部门");
                    }
                    notSignfour.setStr("未签到(规定签到时间为：" + attendSet.getAtime4() + ")");
                    notSignNumber.setStr("签到时间为：" + attendSet.getAtime4());
  
                    notSign.add(notSignfour);
                  }
                } else {
                  Attend attend4 = this.attendMapper.selectAttendAll(date, uid.toString(), "4");
                  if (attend4 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                      status = "早退";
                      BaseSupplement leaveEarlyfour = new BaseSupplement();
                      leaveEarlyfour.setUid(uid.toString());
                      leaveEarlyfour.setName(users.getName());
                      leaveEarlyfour.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        leaveEarlyfour.setDept(department.getDeptName());
                      } else {
                        leaveEarlyfour.setDept("未指定部门");
                      }
  
                      leaveEarlyfour.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend4.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime4()).intValue() - attend4.getAtime().intValue()) + ")");
                      leaveEarlyNumber.setStr("签到时间为：" + attendSet.getAtime4());
  
                      leaveEarly.add(leaveEarlyfour);
                    } else {
                      status = "正常";
                      String msg = companyAttendanceException(date, uid.toString(), "4");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        closedyichangB.setUid(uid.toString());
                        closedyichangB.setName(users.getName());
                        closedyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedyichangB.setDept(department.getDeptName());
                        } else {
                          closedyichangB.setDept("未指定部门");
                        }
  
                        closedyichangB.setStr(msg);
                      }
                      else {
                        closedB.setUid(uid.toString());
                        closedB.setName(users.getName());
                        closedB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedB.setDept(department.getDeptName());
                        } else {
                          closedB.setDept("未指定部门");
                        }
  
                        closedB.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend4.getAtime()));
                      }
                    }
                  }
                  else
                  {
                    status = "weiqiandao";
                    BaseSupplement notOutfour = new BaseSupplement();
                    notOutfour.setUid(uid.toString());
                    notOutfour.setName(users.getName());
                    notOutfour.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                      notOutfour.setDept(department.getDeptName());
                    } else {
                      notOutfour.setDept("未指定部门");
                    }
  
                    notOutfour.setStr("未签退(规定签到时间为：" + attendSet.getAtime4() + ")");
                    notOutNumber.setStr("签到时间为：" + attendSet.getAtime4());
  
                    notOut.add(notOutfour);
                  }
  
                }
  
              }
  
              if ("1".equals(attendSet.getAtime5Setother()))
              {
                if ((DateFormat.getDateTimes(attendSet.getAtime5()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
                {
                  String status = "";
                  if ("1".equals(attendSet.getCommute5())) {
                    Attend attend5 = this.attendMapper.selectAttendAll(date, uid.toString(), "5");
                    if (attend5 != null)
                    {
                      String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                      if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                        status = "迟到";
                        BaseSupplement latefive = new BaseSupplement();
                        latefive.setUid(uid.toString());
                        latefive.setName(users.getName());
                        latefive.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                          latefive.setDept(department.getDeptName());
                        } else {
                          latefive.setDept("未指定部门");
                        }
                        latefive.setStr("签到时间为：" + attendSet.getAtime5() + "迟到(" + DateFormat.parseMillisecone(attend5.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime5()).intValue()) + ")");
                        lateNumber.setStr("签到时间为：" + attendSet.getAtime5());
  
                        late.add(latefive);
                      } else {
                        status = "正常";
                        String msg = companyAttendanceException(date, uid.toString(), "5");
                        if (!StringUtils.checkNull(msg).booleanValue()) {
                          normalyichangB.setUid(uid.toString());
                          normalyichangB.setName(users.getName());
                          normalyichangB.setAvatar(users.getAvatar());
                          if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                            Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                            normalyichangB.setDept(department.getDeptName());
                          } else {
                            normalyichangB.setDept("未指定部门");
                          }
  
                          normalyichangB.setStr(msg);
                        }
                        else {
                          normalB.setUid(uid.toString());
                          normalB.setName(users.getName());
                          normalB.setAvatar(users.getAvatar());
                          if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                            Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                            normalB.setDept(department.getDeptName());
                          } else {
                            normalB.setDept("未指定部门");
                          }
  
                          normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend5.getAtime()));
                        }
                      }
                    }
                    else
                    {
                      status = "weiqiandao";
                      BaseSupplement notSignfive = new BaseSupplement();
                      notSignfive.setUid(uid.toString());
                      notSignfive.setName(users.getName());
                      notSignfive.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        notSignfive.setDept(department.getDeptName());
                      } else {
                        notSignfive.setDept("未指定部门");
                      }
                      notSignfive.setStr("未签到(规定签到时间为：" + attendSet.getAtime5() + ")");
                      notSignNumber.setStr("签到时间为：" + attendSet.getAtime5());
  
                      notSign.add(notSignfive);
                    }
                  } else {
                    Attend attend5 = this.attendMapper.selectAttendAll(date, uid.toString(), "5");
                    if (attend5 != null)
                    {
                      String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                      if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                        status = "早退";
                        BaseSupplement leaveEarlyfive = new BaseSupplement();
                        leaveEarlyfive.setUid(uid.toString());
                        leaveEarlyfive.setName(users.getName());
                        leaveEarlyfive.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                          leaveEarlyfive.setDept(department.getDeptName());
                        } else {
                          leaveEarlyfive.setDept("未指定部门");
                        }
  
                        leaveEarlyfive.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend5.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime5()).intValue() - attend5.getAtime().intValue()) + ")");
                        leaveEarlyNumber.setStr("签到时间为：" + attendSet.getAtime5());
  
                        leaveEarly.add(leaveEarlyfive);
                      } else {
                        status = "正常";
                        String msg = companyAttendanceException(date, uid.toString(), "5");
                        if (!StringUtils.checkNull(msg).booleanValue()) {
                          closedyichangB.setUid(uid.toString());
                          closedyichangB.setName(users.getName());
                          closedyichangB.setAvatar(users.getAvatar());
                          if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                            Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                            closedyichangB.setDept(department.getDeptName());
                          } else {
                            closedyichangB.setDept("未指定部门");
                          }
  
                          closedyichangB.setStr(msg);
                        }
                        else {
                          closedB.setUid(uid.toString());
                          closedB.setName(users.getName());
                          closedB.setAvatar(users.getAvatar());
                          if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                            Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                            closedB.setDept(department.getDeptName());
                          } else {
                            closedB.setDept("未指定部门");
                          }
  
                          closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend5.getAtime()));
                        }
                      }
  
                    }
                    else
                    {
                      status = "weiqiandao";
                      BaseSupplement notOutfive = new BaseSupplement();
                      notOutfive.setUid(uid.toString());
                      notOutfive.setName(users.getName());
                      notOutfive.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        notOutfive.setDept(department.getDeptName());
                      } else {
                        notOutfive.setDept("未指定部门");
                      }
  
                      notOutfive.setStr("未签退(规定签到时间为：" + attendSet.getAtime1() + ")");
                      notOutNumber.setStr("签到时间为：" + attendSet.getAtime5());
  
                      notOut.add(notOutfive);
                    }
                  }
  
                }
  
              }
  
              if (("1".equals(attendSet.getAtime6Setother())) && (
                (DateFormat.getDateTimes(attendSet.getAtime6()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))) {
                String status = "";
                if ("1".equals(attendSet.getCommute6())) {
                  Attend attend6 = this.attendMapper.selectAttendAll(date, uid.toString(), "6");
                  if (attend6 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                      status = "迟到";
                      BaseSupplement latesix = new BaseSupplement();
                      latesix.setUid(uid.toString());
                      latesix.setName(users.getName());
                      latesix.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        latesix.setDept(department.getDeptName());
                      } else {
                        latesix.setDept("未指定部门");
                      }
                      latesix.setStr("签到时间为：" + attendSet.getAtime6() + "迟到(" + DateFormat.parseMillisecone(attend6.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime6()).intValue()) + ")");
                      lateNumber.setStr("签到时间为：" + attendSet.getAtime6());
  
                      late.add(latesix);
                    } else {
                      status = "正常";
                      String msg = companyAttendanceException(date, uid.toString(), "6");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        normalyichangB.setUid(uid.toString());
                        normalyichangB.setName(users.getName());
                        normalyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalyichangB.setDept(department.getDeptName());
                        } else {
                          normalyichangB.setDept("未指定部门");
                        }
  
                        normalyichangB.setStr(msg);
                      }
                      else {
                        normalB.setUid(uid.toString());
                        normalB.setName(users.getName());
                        normalB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          normalB.setDept(department.getDeptName());
                        } else {
                          normalB.setDept("未指定部门");
                        }
  
                        normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend6.getAtime()));
                      }
                    }
                  }
                  else {
                    status = "weiqiandao";
                    BaseSupplement notSignsix = new BaseSupplement();
                    notSignsix.setUid(uid.toString());
                    notSignsix.setName(users.getName());
                    notSignsix.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                      notSignsix.setDept(department.getDeptName());
                    } else {
                      notSignsix.setDept("未指定部门");
                    }
                    notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime6() + ")");
                    notSignNumber.setStr("签到时间为：" + attendSet.getAtime6());
  
                    notSign.add(notSignsix);
                  }
                } else {
                  Attend attend6 = this.attendMapper.selectAttendAll(date, uid.toString(), "6");
                  if (attend6 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                      status = "早退";
                      BaseSupplement leaveEarlysix = new BaseSupplement();
                      leaveEarlysix.setUid(uid.toString());
                      leaveEarlysix.setName(users.getName());
                      leaveEarlysix.setAvatar(users.getAvatar());
                      if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                        Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                        leaveEarlysix.setDept(department.getDeptName());
                      } else {
                        leaveEarlysix.setDept("未指定部门");
                      }
  
                      leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend6.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime6()).intValue() - attend6.getAtime().intValue()) + ")");
                      leaveEarlyNumber.setStr("签到时间为：" + attendSet.getAtime6());
  
                      leaveEarly.add(leaveEarlysix);
                    } else {
                      status = "正常";
                      String msg = companyAttendanceException(date, uid.toString(), "6");
                      if (!StringUtils.checkNull(msg).booleanValue()) {
                        closedyichangB.setUid(uid.toString());
                        closedyichangB.setName(users.getName());
                        closedyichangB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedyichangB.setDept(department.getDeptName());
                        } else {
                          closedyichangB.setDept("未指定部门");
                        }
  
                        closedyichangB.setStr(msg);
                      }
                      else {
                        closedB.setUid(uid.toString());
                        closedB.setName(users.getName());
                        closedB.setAvatar(users.getAvatar());
                        if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                          Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
                          closedB.setDept(department.getDeptName());
                        } else {
                          closedB.setDept("未指定部门");
                        }
  
                        closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend6.getAtime()));
                      }
                    }
                  }
                  else
                  {
                    status = "weiqiandao";
                    BaseSupplement notOutsix = new BaseSupplement();
                    notOutsix.setUid(uid.toString());
                    notOutsix.setName(users.getName());
                    notOutsix.setAvatar(users.getAvatar());
                    if ((users.getDeptId() != null) && (users.getDeptId().intValue() != 0)) {
                      Department department = this.departmentMapper.getDeptById(users.getDeptId().intValue());
  
                      notOutsix.setDept(department.getDeptName());
                    } else {
                      notOutsix.setDept("未指定部门");
                    }
  
                    notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime6() + ")");
                    notOutNumber.setStr("签到时间为：" + attendSet.getAtime6());
  
                    notOut.add(notOutsix);
                  }
  
                }
  
              }
  
            }
  
            if (!StringUtils.checkNull(lateNumber.getStr()).booleanValue()) {
              lateNumbers.add(lateNumber);
            }
            if (!StringUtils.checkNull(notOutNumber.getStr()).booleanValue()) {
              notOutNumbers.add(notOutNumber);
            }
            if (!StringUtils.checkNull(leaveEarlyNumber.getStr()).booleanValue()) {
              leaveEarlyNumbers.add(leaveEarlyNumber);
            }
            if (!StringUtils.checkNull(notSignNumber.getStr()).booleanValue()) {
              notSignNumbers.add(notSignNumber);
            }
            if (!StringUtils.checkNull(normalB.getUid()).booleanValue()) {
              normal.add(normalB);
            }
  
            if (!StringUtils.checkNull(normalyichangB.getUid()).booleanValue()) {
              normalyichang.add(normalyichangB);
            }
            if (!StringUtils.checkNull(closedB.getUid()).booleanValue()) {
              closed.add(closedB);
            }
            if (!StringUtils.checkNull(closedyichangB.getUid()).booleanValue()) {
              closedyichang.add(closedyichangB);
            }
  
          }
  
        }
  
        Attend normalAttend = new Attend();
        normalAttend.setSname("上班正常");
        if (normal.size() > 0) {
          normalAttend.setNum(normal.size() + "人");
          normalAttend.setState("1");
        } else {
          normalAttend.setNum("0");
          normalAttend.setState("0");
        }
        normalAttend.setType("天");
        normalAttend.setBaseSupplements(normal);
        Attend normalyichangAttend = new Attend();
        normalyichangAttend.setSname("上班异常");
        if (normalyichang.size() > 0) {
          normalyichangAttend.setNum(normalyichang.size() + "人");
          normalyichangAttend.setState("1");
        } else {
          normalyichangAttend.setNum("0");
          normalyichangAttend.setState("0");
        }
        normalyichangAttend.setType("天");
        normalyichangAttend.setBaseSupplements(normalyichang);
        Attend closedAttend = new Attend();
        closedAttend.setSname("下班正常");
        if (closed.size() > 0) {
          closedAttend.setNum(closed.size() + "人");
          closedAttend.setState("1");
        } else {
          closedAttend.setNum("0");
          closedAttend.setState("0");
        }
        closedAttend.setType("天");
        closedAttend.setBaseSupplements(closed);
  
        Attend closedyichangAttend = new Attend();
        closedyichangAttend.setSname("下班异常");
        if (closedyichang.size() > 0) {
          closedyichangAttend.setNum(closedyichang.size() + "人");
          closedyichangAttend.setState("1");
        } else {
          closedyichangAttend.setNum("0");
          closedyichangAttend.setState("0");
        }
        closedyichangAttend.setType("天");
        closedyichangAttend.setBaseSupplements(closedyichang);
        Attend notSignAttend = new Attend();
        notSignAttend.setSname("未签到");
        if (notSign.size() > 0) {
          notSignAttend.setNum(notSignNumbers.size() + "人");
          notSignAttend.setState("1");
        } else {
          notSignAttend.setNum("0");
          notSignAttend.setState("0");
        }
        notSignAttend.setType("次");
        notSignAttend.setBaseSupplements(notSign);
        Attend notOutAttend = new Attend();
        notOutAttend.setSname("未签退");
        if (notOut.size() > 0) {
          notOutAttend.setNum(notOutNumbers.size() + "人");
          notOutAttend.setState("1");
        } else {
          notOutAttend.setNum("0");
          notOutAttend.setState("0");
        }
        notOutAttend.setType("次");
        notOutAttend.setBaseSupplements(notOut);
        Attend lateAttend = new Attend();
        lateAttend.setSname("迟到");
        if (late.size() > 0) {
          lateAttend.setNum(lateNumbers.size() + "人");
          lateAttend.setState("1");
        } else {
          lateAttend.setNum("0");
          lateAttend.setState("0");
        }
        lateAttend.setType("次");
        lateAttend.setBaseSupplements(late);
  
        Attend leaveEarlyAttend = new Attend();
        leaveEarlyAttend.setSname("早退");
        if (leaveEarly.size() > 0) {
          leaveEarlyAttend.setNum(leaveEarlyNumbers.size() + "人");
          leaveEarlyAttend.setState("1");
        } else {
          leaveEarlyAttend.setNum("0");
          leaveEarlyAttend.setState("0");
        }
        leaveEarlyAttend.setType("次");
        leaveEarlyAttend.setBaseSupplements(leaveEarly);
  
        Attend fileAttend = new Attend();
        fileAttend.setSname("外勤");
        if (filds.size() > 0) {
          fileAttend.setNum(filds.size() + "人");
          fileAttend.setState("1");
        } else {
          fileAttend.setNum("0");
          fileAttend.setState("0");
        }
        fileAttend.setType("次");
        fileAttend.setBaseSupplements(filds);
  
        Attend qingjiaAttend = new Attend();
        qingjiaAttend.setSname("请假");
        if (leaves.size() > 0) {
          qingjiaAttend.setNum(leaves.size() + "人");
          qingjiaAttend.setState("1");
        } else {
          qingjiaAttend.setNum("0");
          qingjiaAttend.setState("0");
        }
        qingjiaAttend.setType("次");
        qingjiaAttend.setBaseSupplements(leaves);
  
        Attend waichuAttend = new Attend();
        waichuAttend.setSname("外出");
        if (waichu.size() > 0) {
          waichuAttend.setNum(waichu.size() + "人");
          waichuAttend.setState("1");
        } else {
          waichuAttend.setNum("0");
          waichuAttend.setState("0");
        }
        waichuAttend.setType("次");
        waichuAttend.setBaseSupplements(waichu);
  
        Attend chuchaAttend = new Attend();
        chuchaAttend.setSname("出差");
        if (chucha.size() > 0) {
          chuchaAttend.setNum(chucha.size() + "人");
          chuchaAttend.setState("1");
        } else {
          chuchaAttend.setNum("0");
          chuchaAttend.setState("0");
        }
        chuchaAttend.setType("次");
        chuchaAttend.setBaseSupplements(chucha);
  
        Attend attend = new Attend();
        attend.setUserAll(Integer.valueOf(usersList.size()));
        attend.setUserSize(Integer.valueOf(chuqinRenshu));
  
        List attendList = new ArrayList();
        attendList.add(normalyichangAttend);
        attendList.add(normalAttend);
        attendList.add(closedyichangAttend);
        attendList.add(closedAttend);
        attendList.add(notSignAttend);
        attendList.add(notOutAttend);
        attendList.add(lateAttend);
        attendList.add(leaveEarlyAttend);
        attendList.add(fileAttend);
        attendList.add(chuchaAttend);
        attendList.add(qingjiaAttend);
        attendList.add(waichuAttend);
        attend.setList(attendList);
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setData(attend);
        wrappers.setMsg("更新成功");
      } catch (Exception e) {
        e.printStackTrace();
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("更新失败");
      }
  
      return wrappers;
    }
  
    public BaseWrapper normalCondition(String year, String month, HttpServletRequest request) throws ParseException {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      Attend attend = new Attend();
  
      String date = year + "-" + month;
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
  
      UserExt userExt = this.userExtMapper.queryUserExt(users.getUid().toString());
      if (userExt != null) {
        AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(userExt.getDutyType().shortValue()));
        int xqhbt = 0;
        String[] str1 = attendSet.getAtime1Set().split("\\|");
        if ("1".equals(str1[0])) {
          xqhbt++;
        }
        attendSet.setAtime1Setother(str1[0]);
        attendSet.setCommute1(str1[1]);
        String[] str2 = attendSet.getAtime2Set().split("\\|");
        if ("1".equals(str2[0])) {
          xqhbt++;
        }
        attendSet.setAtime2Setother(str2[0]);
        attendSet.setCommute2(str2[1]);
        String[] str3 = attendSet.getAtime3Set().split("\\|");
        if ("1".equals(str3[0])) {
          xqhbt++;
        }
        attendSet.setAtime3Setother(str3[0]);
        attendSet.setCommute3(str3[1]);
        String[] str4 = attendSet.getAtime4Set().split("\\|");
        if ("1".equals(str4[0])) {
          xqhbt++;
        }
        attendSet.setAtime4Setother(str4[0]);
        attendSet.setCommute4(str4[1]);
        String[] str5 = attendSet.getAtime5Set().split("\\|");
        if ("1".equals(str5[0])) {
          xqhbt++;
        }
        attendSet.setAtime5Setother(str5[0]);
        attendSet.setCommute5(str5[1]);
        String[] str6 = attendSet.getAtime6Set().split("\\|");
        if ("1".equals(str6[0])) {
          xqhbt++;
        }
        attendSet.setAtime6Setother(str6[0]);
        attendSet.setCommute6(str6[1]);
  
        List baseAttends = new ArrayList();
        String[] wDate = attendSet.getWorkdate().split(",");
  
        List<Date> datss = new ArrayList();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
        SimpleDateFormat matter2 = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = new Date();
        String a11 = df.format(dt);
        String stratDate = "";
        String endDate = "";
        if (date.equals(a11))
        {
          stratDate = date + "-01";
          endDate = matter2.format(dt);
        }
        else {
          Date date1 = df.parse(date);
          Calendar calendar = Calendar.getInstance();
          calendar.setTime(date1);
          int first1 = calendar.getActualMinimum(5);
          int last1 = calendar.getActualMaximum(5);
          stratDate = date + "-01";
          endDate = date + "-" + last1;
        }
        Date start1 = matter2.parse(stratDate);
        Date end1 = matter2.parse(endDate);
        Calendar c = Calendar.getInstance();
        List<Date> dates = DateCompute.getBetweenDates(start1, end1);
        for (Date nowdate1 : dates) {
          c.setTime(nowdate1);
          int weekInt = c.get(7);
          weekInt -= 1;
          if (weekInt == 0) {
            weekInt = 7;
          }
  
          String week = String.valueOf(weekInt);
          if (attendSet.getWorkdate().contains(week)) {
            datss.add(nowdate1);
          }
  
        }
  
        for (Date nowdate : datss) {
          Map map = new HashMap();
          map.put("uid", users.getUid());
          map.put("date", DateFormat.getDatestr(nowdate));
          List attendListzhengchang = this.attendMapper.selectAttendList(map);
          BaseAttend baseAttend = new BaseAttend();
          baseAttend.setAtime(DateFormat.getDatestr(nowdate));
          if ((attendListzhengchang != null) && (attendListzhengchang.size() == xqhbt))
            baseAttend.setStr("1");
          else {
            baseAttend.setStr("0");
          }
          baseAttends.add(baseAttend);
        }
  
        Attend attendzhengchang = new Attend();
        attendzhengchang.setRemarksList(baseAttends);
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setData(attendzhengchang);
        wrappers.setMsg("更新成功");
        return wrappers;
      }
      wrappers.setFlag(false);
      wrappers.setStatus(true);
  
      wrappers.setMsg("更新失败");
      return wrappers;
    }
  
    public BaseWrapper PersonalAttendance(String attendDate, HttpServletRequest req)
      throws ParseException {
      String sqlType = Constant.MYOA + (String)req.getSession().getAttribute("loginDateSouse");
  
      Integer uid = ((Users)SessionUtils.getSessionInfo(req.getSession(), Users.class, new Users())).getUid();
      AttendSetWrappers wrappers = new AttendSetWrappers();
      Attend attend = new Attend();
      Map map = new HashMap();
      map.put("uid", uid);
      map.put("date", attendDate);
      UserExt userExt = this.userExtMapper.queryUserExt(uid.toString());
      if (userExt != null) {
        AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(userExt.getDutyType().shortValue()));
  
        String[] str1 = attendSet.getAtime1Set().split("\\|");
        attendSet.setAtime1Setother(str1[0]);
        attendSet.setCommute1(str1[1]);
        String[] str2 = attendSet.getAtime2Set().split("\\|");
        attendSet.setAtime2Setother(str2[0]);
        attendSet.setCommute2(str2[1]);
  
        String[] str3 = attendSet.getAtime3Set().split("\\|");
        attendSet.setAtime3Setother(str3[0]);
        attendSet.setCommute3(str3[1]);
        String[] str4 = attendSet.getAtime4Set().split("\\|");
        attendSet.setAtime4Setother(str4[0]);
        attendSet.setCommute4(str4[1]);
        String[] str5 = attendSet.getAtime5Set().split("\\|");
        attendSet.setAtime5Setother(str5[0]);
        attendSet.setCommute5(str5[1]);
        String[] str6 = attendSet.getAtime6Set().split("\\|");
        attendSet.setAtime6Setother(str6[0]);
        attendSet.setCommute6(str6[1]);
        List attendlist = new ArrayList();
  
        if (attendSet != null)
        {
          List<Date> datss = new ArrayList();
          SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
          SimpleDateFormat matter2 = new SimpleDateFormat("yyyy-MM-dd");
          Date dt = new Date();
          String a11 = df.format(dt);
          String stratDate = "";
          String endDate = "";
          if (attendDate.equals(a11))
          {
            stratDate = attendDate + "-01";
            endDate = matter2.format(dt);
          }
          else {
            Date date1 = df.parse(attendDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date1);
            int first1 = calendar.getActualMinimum(5);
            int last1 = calendar.getActualMaximum(5);
            stratDate = attendDate + "-01";
            endDate = attendDate + "-" + last1;
          }
          Date start1 = matter2.parse(stratDate);
          Date end1 = matter2.parse(endDate);
          Calendar c = Calendar.getInstance();
          List<Date> dates = DateCompute.getBetweenDates(start1, end1);
          for (Date nowdate1 : dates) {
            c.setTime(nowdate1);
            int weekInt = c.get(7);
            weekInt -= 1;
            if (weekInt == 0) {
              weekInt = 7;
            }
  
            String week = String.valueOf(weekInt);
            if (attendSet.getWorkdate().contains(week)) {
              datss.add(nowdate1);
            }
          }
          for (Date nowdate : datss) {
            List workList = new ArrayList();
            List legwork = new ArrayList();
  
            if ("1".equals(attendSet.getAtime1Setother())) {
              String attendStatus = "0";
              String status = "";
              int atime = 0;
              String remark = "";
              String addres = "";
              Attend attend1 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "1");
              if (attend1 != null) {
                if ("1".equals(attend1.getType())) {
                  if ("1".equals(attendSet.getCommute1())) {
                    String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                      status = "上班迟到";
                      attendStatus = "1";
                    } else {
                      status = "上班正常";
                      attendStatus = "0";
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                      status = "下班早退";
                      attendStatus = "-1";
                    } else {
                      status = "下班正常";
                      attendStatus = "0";
                    }
                  }
                }
  
                atime = attend1.getAtime().intValue();
                remark = attend1.getRemark();
                addres = attend1.getAddress();
              }
              else {
                status = "未签到";
                atime = 0;
              }
              Attend attend11 = new Attend();
              attend11.setAttendStatus(attendStatus);
              attend11.setNum("1");
              attend11.setSwi("1");
              attend11.setCommute(attendSet.getCommute1());
              attend11.setAtime(Integer.valueOf(atime));
              attend11.setRemark(remark);
              attend11.setAddress(addres);
              attend11.setAtimestate(status);
              if (DateFormat.getwyqStrTime(Integer.valueOf(atime)).equals(attendDate))
                attend11.setTime("");
              else {
                attend11.setTime(DateFormat.getwyqStrTime(Integer.valueOf(atime)));
              }
  
              attend11.setDateName(DateFormat.getDatestr(nowdate));
              workList.add(attend11);
            }
  
            if ("1".equals(attendSet.getAtime2Setother())) {
              String attendStatus = "0";
              String status = "";
              int atime = 0;
              String remark = "";
              String addres = "";
              Attend attend2 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "2");
              if (attend2 != null)
              {
                if ("2".equals(attend2.getType()))
                {
                  if ("1".equals(attendSet.getCommute2())) {
                    int a22 = DateFormat.getWYQTime(attendSet.getAtime2()).intValue();
                    if (attend2.getAtime().intValue() > DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) {
                      status = "上班迟到";
                      attendStatus = "1";
                    } else {
                      status = "上班正常";
                      attendStatus = "0";
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend2.getAtime());
                    if (attend2.getAtime().intValue() < DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) {
                      status = "下班早退";
                      attendStatus = "-1";
                    } else {
                      status = "下班正常";
                      attendStatus = "0";
                    }
                  }
                }
  
                remark = attend2.getRemark();
                addres = attend2.getAddress();
                atime = attend2.getAtime().intValue();
              }
              else {
                status = "未签到";
              }
              Attend attend22 = new Attend();
              attend22.setAttendStatus(attendStatus);
              attend22.setNum("1");
              attend22.setSwi("1");
              attend22.setCommute(attendSet.getCommute2());
              attend22.setAtime(Integer.valueOf(atime));
              attend22.setRemark(remark);
              attend22.setAddress(addres);
              attend22.setAtimestate(status);
              if (DateFormat.getwyqStrTime(Integer.valueOf(atime)).equals(attendDate))
                attend22.setTime("");
              else {
                attend22.setTime(DateFormat.getwyqStrTime(Integer.valueOf(atime)));
              }
  
              attend22.setDateName(DateFormat.getDatestr(nowdate));
              workList.add(attend22);
            }
  
            if ("1".equals(attendSet.getAtime3Setother())) {
              String attendStatus = "0";
              String status = "";
              int atime = 0;
              String remark = "";
              String addres = "";
              Attend attend3 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "3");
              if (attend3 != null)
              {
                if ("3".equals(attend3.getType()))
                {
                  if ("1".equals(attendSet.getCommute3())) {
                    String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                      status = "上班迟到";
                      attendStatus = "1";
                    } else {
                      status = "上班正常";
                      attendStatus = "0";
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                      status = "下班早退";
                      attendStatus = "-1";
                    } else {
                      status = "下班正常";
                      attendStatus = "0";
                    }
                  }
                }
  
                remark = attend3.getRemark();
                addres = attend3.getAddress();
                atime = attend3.getAtime().intValue();
              }
              else
              {
                status = "未签到";
              }
              Attend attend33 = new Attend();
              attend33.setAttendStatus(attendStatus);
              attend33.setNum("1");
              attend33.setSwi("1");
              attend33.setCommute(attendSet.getCommute3());
              attend33.setAtime(Integer.valueOf(atime));
              attend33.setRemark(remark);
              attend33.setAddress(addres);
              attend33.setAtimestate(status);
              if (DateFormat.getwyqStrTime(Integer.valueOf(atime)).equals(attendDate))
                attend33.setTime("");
              else {
                attend33.setTime(DateFormat.getwyqStrTime(Integer.valueOf(atime)));
              }
  
              attend33.setDateName(DateFormat.getDatestr(nowdate));
              workList.add(attend33);
            }
  
            if ("1".equals(attendSet.getAtime4Setother())) {
              String attendStatus = "0";
              String status = "";
              int atime = 0;
              String remark = "";
              String addres = "";
              Attend attend4 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "4");
              if (attend4 != null)
              {
                if ("4".equals(attend4.getType()))
                {
                  if ("1".equals(attendSet.getCommute4())) {
                    String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                      status = "上班迟到";
                      attendStatus = "1";
                    } else {
                      status = "上班正常";
                      attendStatus = "0";
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                      status = "下班早退";
                      attendStatus = "-1";
                    } else {
                      status = "下班正常";
                      attendStatus = "0";
                    }
                  }
                  remark = attend4.getRemark();
                  addres = attend4.getAddress();
                  atime = attend4.getAtime().intValue();
                } else {
                  status = "未签到";
                }
                Attend attend44 = new Attend();
                attend44.setAttendStatus(attendStatus);
                attend44.setNum("1");
                attend44.setSwi("1");
                attend44.setCommute(attendSet.getCommute4());
                attend44.setAtime(Integer.valueOf(atime));
                attend44.setRemark(remark);
                attend44.setAddress(addres);
                attend44.setAtimestate(status);
                if (DateFormat.getwyqStrTime(Integer.valueOf(atime)).equals(attendDate))
                  attend44.setTime("");
                else {
                  attend44.setTime(DateFormat.getwyqStrTime(Integer.valueOf(atime)));
                }
  
                attend44.setDateName(DateFormat.getDatestr(nowdate));
                workList.add(attend44);
              }
  
            }
  
            if ("1".equals(attendSet.getAtime5Setother())) {
              String attendStatus = "0";
              String status = "";
              int atime = 0;
              String remark = "";
              String addres = "";
              Attend attend5 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "5");
              if (attend5 != null)
              {
                if ("5".equals(attend5.getType()))
                {
                  if ("1".equals(attendSet.getCommute5())) {
                    String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                      status = "上班迟到";
                      attendStatus = "1";
                    } else {
                      status = "上班正常";
                      attendStatus = "0";
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                      status = "下班早退";
                      attendStatus = "-1";
                    } else {
                      status = "下班正常";
                      attendStatus = "0";
                    }
                  }
                  remark = attend5.getRemark();
                  addres = attend5.getAddress();
                  atime = attend5.getAtime().intValue();
                }
                else {
                  status = "未签到";
                }
                Attend attend55 = new Attend();
                attend55.setAttendStatus(attendStatus);
                attend55.setNum("1");
                attend55.setSwi("1");
                attend55.setAtimestate(status);
                attend55.setCommute(attendSet.getCommute5());
                attend55.setRemark(remark);
                attend55.setAddress(addres);
                attend55.setAtime(Integer.valueOf(atime));
                if (DateFormat.getwyqStrTime(Integer.valueOf(atime)).equals(attendDate))
                  attend55.setTime("");
                else {
                  attend55.setTime(DateFormat.getwyqStrTime(Integer.valueOf(atime)));
                }
  
                attend55.setDateName(DateFormat.getDatestr(nowdate));
                workList.add(attend55);
              }
  
            }
  
            if ("1".equals(attendSet.getAtime6Setother())) {
              String attendStatus = "0";
              String status = "";
              int atime = 0;
              String remark = "";
              String addres = "";
              Attend attend6 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "6");
              if (attend6 != null)
              {
                if ("6".equals(attend6.getType()))
                {
                  if ("1".equals(attendSet.getCommute6())) {
                    String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                      status = "上班迟到";
                      attendStatus = "1";
                    } else {
                      status = "上班正常";
                      attendStatus = "0";
                    }
                  } else {
                    String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                      status = "下班早退";
                      attendStatus = "-1";
                    } else {
                      status = "下班正常";
                      attendStatus = "0";
                    }
                  }
                  remark = attend6.getRemark();
                  addres = attend6.getAddress();
                  atime = attend6.getAtime().intValue();
                }
                else {
                  status = "未签到";
                }
                Attend attend66 = new Attend();
                attend66.setAttendStatus(attendStatus);
                attend66.setNum("1");
                attend66.setSwi("1");
                attend66.setCommute(attendSet.getCommute6());
                attend66.setRemark(remark);
                attend66.setAddress(addres);
                attend66.setAtime(Integer.valueOf(atime));
                if (DateFormat.getwyqStrTime(Integer.valueOf(atime)).equals(attendDate))
                  attend66.setTime("");
                else {
                  attend66.setTime(DateFormat.getwyqStrTime(Integer.valueOf(atime)));
                }
  
                attend66.setAtimestate(status);
                attend66.setDateName(DateFormat.getDatestr(nowdate));
  
                workList.add(attend66);
              }
  
            }
  
            if ("1".equals(attendSet.getIsOut())) {
              List<Attend> attend0 = this.attendMapper.selectAttend0(DateFormat.getDatestr(nowdate), uid.toString());
              if ((attend0 != null) && (attend0.size() > 0)) {
                for (Attend a : attend0) {
                  if ((StringUtils.checkNull(a.getFileId()).booleanValue()) && (StringUtils.checkNull(a.getFileName()).booleanValue())) {
                    a.setAttachment(GetAttachmentListUtil.returnAttachment(a.getFileName(), a.getFileName(), sqlType, "attend"));
                  }
  
                  legwork.add(a);
                }
  
              }
  
            }
  
            Attend attend1 = new Attend();
            attend1.setAttendList(workList);
            attend1.setLegwork(legwork);
            attendlist.add(attend1);
          }
  
        }
  
        attend.setList(attendlist);
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setData(attend);
        wrappers.setMsg("更新成功");
      }
  
      return wrappers;
    }
  
    public BaseWrapper PersonalTodayAttendance(String attendDate, HttpServletRequest req)
      throws ParseException
    {
      String sqlType = Constant.MYOA + (String)req.getSession().getAttribute("loginDateSouse");
  
      Integer uid = ((Users)SessionUtils.getSessionInfo(req.getSession(), Users.class, new Users())).getUid();
      AttendSetWrappers wrappers = new AttendSetWrappers();
      List workList = new ArrayList();
      UserExt userExt = this.userExtMapper.queryUserExt(uid.toString());
      if (userExt != null) {
        for (int i = 1; i <= 6; i++) {
          Attend attend = this.attendMapper.selectAttendAll(attendDate, uid.toString(), i + "");
          if (attend != null) {
            String time = DateFormat.getwyqStrTime(attend.getAtime());
            attend.setTime(time);
            workList.add(attend);
          }
        }
  
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setData(workList);
        wrappers.setMsg("更新成功");
      }
      return wrappers;
    }
  
    public AttendSetWrappers AttendanceStatistics(String beginDate, String endDate, HttpServletRequest req)
    {
      AttendSetWrappers wrappers = new AttendSetWrappers();
  
      Date dateTime = new Date();
      SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
      String time = format.format(dateTime);
      Date dateTime1 = new Date();
      SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
      String time1 = format1.format(dateTime1);
      Integer uid = ((Users)SessionUtils.getSessionInfo(req.getSession(), Users.class, new Users())).getUid();
      AttendStatistics attendStatistics = new AttendStatistics();
      List<Date> date = new ArrayList<Date>();
      UserExt userExt = this.userExtMapper.queryUserExt(String.valueOf(uid));
      if (userExt != null) {
        List normal = new ArrayList();
        List normalyichang = new ArrayList();
        List closed = new ArrayList();
        List notSign = new ArrayList();
        List notOut = new ArrayList();
        List leaveEarly = new ArrayList();
        List late = new ArrayList();
        List fields = new ArrayList();
  
        AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(userExt.getDutyType().shortValue()));
        int xqhbt = 0;
        String[] str1 = attendSet.getAtime1Set().split("\\|");
        if ("1".equals(str1[0])) {
          xqhbt++;
        }
        attendSet.setAtime1Setother(str1[0]);
        attendSet.setCommute1(str1[1]);
        String[] str2 = attendSet.getAtime2Set().split("\\|");
        if ("1".equals(str2[0])) {
          xqhbt++;
        }
        attendSet.setAtime2Setother(str2[0]);
        attendSet.setCommute2(str2[1]);
        String[] str3 = attendSet.getAtime3Set().split("\\|");
        if ("1".equals(str3[0])) {
          xqhbt++;
        }
        attendSet.setAtime3Setother(str3[0]);
        attendSet.setCommute3(str3[1]);
        String[] str4 = attendSet.getAtime4Set().split("\\|");
        if ("1".equals(str4[0])) {
          xqhbt++;
        }
        attendSet.setAtime4Setother(str4[0]);
        attendSet.setCommute4(str4[1]);
        String[] str5 = attendSet.getAtime5Set().split("\\|");
        if ("1".equals(str5[0])) {
          xqhbt++;
        }
        attendSet.setAtime5Setother(str5[0]);
        attendSet.setCommute5(str5[1]);
        String[] str6 = attendSet.getAtime6Set().split("\\|");
        if ("1".equals(str6[0])) {
          xqhbt++;
        }
  
        Calendar c = Calendar.getInstance();
        List<Date> dates = DateCompute.getBetweenDates(DateFormat.DateToStr(beginDate), DateFormat.DateToStr(endDate));
        for (Date nowdate1 : dates) {
          c.setTime(nowdate1);
          int weekInt = c.get(7);
          weekInt -= 1;
          if (weekInt == 0) {
            weekInt = 7;
          }
  
          String week = String.valueOf(weekInt);
          if (attendSet.getWorkdate().contains(week)) {
            date.add(nowdate1);
          }
        }
        normalyichang = myAttendUnitException(beginDate, endDate, uid.toString(), req);
        for (Date nowdate : date) {
          if ("1".equals(attendSet.getIsOut())) {
            List attend0 = this.attendMapper.selectAttend0(DateFormat.getDatestr(nowdate), uid.toString());
            if ((attend0 != null) && (attend0.size() > 0)) {
              Iterator attendIterator = attend0.iterator();
              while (attendIterator.hasNext()) {
                Field field = new Field();
                Attend attend1 = (Attend)attendIterator.next();
                field.setDate(DateFormat.getDatestrTime(nowdate));
                field.setTime(DateFormat.getwyqStrTime(attend1.getAtime()));
                field.setStr(attend1.getAddress());
                field.setPhoneId(attend1.getPhoneId());
                field.setCause(attend1.getRemark());
                fields.add(field);
              }
            }
          }
  
          if ("1".equals(attendSet.getAtime1Setother())) {
            String status = "";
            if ((DateFormat.getDateTimes(attendSet.getAtime1()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
            {
              if ("1".equals(attendSet.getCommute1())) {
                Attend attend1 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "1");
                if (attend1 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                    status = "迟到";
                    BaseAttend latesix = new BaseAttend();
  
                    latesix.setStr("签到时间为：" + attendSet.getAtime1() + "迟到(" + DateFormat.parseMillisecone(attend1.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime1()).intValue()) + ")");
  
                    late.add(latesix);
                  } else {
                    status = "正常";
                    BaseAttend normalB = new BaseAttend();
                    normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend1.getAtime()));
                    normal.add(normalB);
                  }
                } else {
                  status = "未签到";
                  BaseAttend notSignsix = new BaseAttend();
                  notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime1() + ")");
                  notSign.add(notSignsix);
                }
              }
              else {
                Attend attend1 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "1");
                if (attend1 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                    status = "早退";
                    BaseAttend leaveEarlysix = new BaseAttend();
  
                    leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend1.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime1()).intValue() - attend1.getAtime().intValue()) + ")");
  
                    leaveEarly.add(leaveEarlysix);
                  } else {
                    status = "正常";
                    BaseAttend closedB = new BaseAttend();
                    closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend1.getAtime()));
                    closed.add(closedB);
                  }
                }
                else
                {
                  status = "未签到";
                  BaseAttend notOutsix = new BaseAttend();
                  notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime1() + ")");
                  notOut.add(notOutsix);
                }
              }
            }
  
          }
  
          if ("1".equals(attendSet.getAtime2Setother())) {
            String status = "";
            if ((DateFormat.getDateTimes(attendSet.getAtime2()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
            {
              if ("1".equals(attendSet.getCommute2())) {
                Attend attend2 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "2");
                if (attend2 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend2.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime2()).getTime()) {
                    status = "迟到";
                    BaseAttend latesix = new BaseAttend();
  
                    latesix.setStr("签到时间为：" + attendSet.getAtime2() + "迟到(" + DateFormat.parseMillisecone(attend2.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) + ")");
  
                    late.add(latesix);
                  } else {
                    status = "正常";
                    BaseAttend normalB = new BaseAttend();
                    normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend2.getAtime()));
                    normal.add(normalB);
                  }
                } else {
                  status = "未签到";
                  BaseAttend notSignsix = new BaseAttend();
                  notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime2() + ")");
                  notSign.add(notSignsix);
                }
              }
              else {
                Attend attend2 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "2");
                if (attend2 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend2.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime2()).getTime()) {
                    status = "早退";
                    BaseAttend leaveEarlysix = new BaseAttend();
  
                    leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend2.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime2()).intValue() - attend2.getAtime().intValue()) + ")");
  
                    leaveEarly.add(leaveEarlysix);
                  } else {
                    status = "正常";
                    BaseAttend closedB = new BaseAttend();
                    closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend2.getAtime()));
                    closed.add(closedB);
                  }
                }
                else
                {
                  status = "未签到";
                  BaseAttend notOutsix = new BaseAttend();
                  notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime2() + ")");
                  notOut.add(notOutsix);
                }
              }
            }
  
          }
  
          if ("1".equals(attendSet.getAtime3Setother())) {
            String status = "";
            if ((DateFormat.getDateTimes(attendSet.getAtime3()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
            {
              if ("1".equals(attendSet.getCommute3())) {
                Attend attend3 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "3");
                if (attend3 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                    status = "迟到";
                    BaseAttend latesix = new BaseAttend();
  
                    latesix.setStr("签到时间为：" + attendSet.getAtime3() + "迟到(" + DateFormat.parseMillisecone(attend3.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime3()).intValue()) + ")");
  
                    late.add(latesix);
                  } else {
                    status = "正常";
                    BaseAttend normalB = new BaseAttend();
                    normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend3.getAtime()));
                    normal.add(normalB);
                  }
                } else {
                  status = "未签到";
                  BaseAttend notSignsix = new BaseAttend();
                  notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime3() + ")");
                  notSign.add(notSignsix);
                }
              }
              else {
                Attend attend3 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "3");
                if (attend3 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                    status = "早退";
                    BaseAttend leaveEarlysix = new BaseAttend();
  
                    leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend3.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime3()).intValue() - attend3.getAtime().intValue()) + ")");
  
                    leaveEarly.add(leaveEarlysix);
                  } else {
                    status = "正常";
                    BaseAttend closedB = new BaseAttend();
                    closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend3.getAtime()));
                    closed.add(closedB);
                  }
                }
                else
                {
                  status = "未签到";
                  BaseAttend notOutsix = new BaseAttend();
                  notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime3() + ")");
                  notOut.add(notOutsix);
                }
              }
            }
  
          }
  
          if ("1".equals(attendSet.getAtime4Setother())) {
            String status = "";
            if ((DateFormat.getDateTimes(attendSet.getAtime4()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
            {
              if ("1".equals(attendSet.getCommute4())) {
                Attend attend4 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "4");
                if (attend4 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                    status = "迟到";
                    BaseAttend latesix = new BaseAttend();
  
                    latesix.setStr("签到时间为：" + attendSet.getAtime4() + "迟到(" + DateFormat.parseMillisecone(attend4.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime4()).intValue()) + ")");
  
                    late.add(latesix);
                  } else {
                    status = "正常";
                    BaseAttend normalB = new BaseAttend();
                    normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend4.getAtime()));
                    normal.add(normalB);
                  }
                } else {
                  status = "未签到";
                  BaseAttend notSignsix = new BaseAttend();
                  notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime4() + ")");
                  notSign.add(notSignsix);
                }
              }
              else {
                Attend attend4 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "4");
                if (attend4 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                    status = "早退";
                    BaseAttend leaveEarlysix = new BaseAttend();
  
                    leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend4.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime4()).intValue() - attend4.getAtime().intValue()) + ")");
  
                    leaveEarly.add(leaveEarlysix);
                  } else {
                    status = "正常";
                    BaseAttend closedB = new BaseAttend();
                    closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend4.getAtime()));
                    closed.add(closedB);
                  }
                }
                else
                {
                  status = "未签到";
                  BaseAttend notOutsix = new BaseAttend();
                  notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime4() + ")");
                  notOut.add(notOutsix);
                }
              }
            }
  
          }
  
          if ("1".equals(attendSet.getAtime5Setother())) {
            String status = "";
            if ((DateFormat.getDateTimes(attendSet.getAtime5()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
            {
              if ("1".equals(attendSet.getCommute5())) {
                Attend attend5 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "5");
                if (attend5 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                    status = "迟到";
                    BaseAttend latesix = new BaseAttend();
  
                    latesix.setStr("签到时间为：" + attendSet.getAtime5() + "迟到(" + DateFormat.parseMillisecone(attend5.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime5()).intValue()) + ")");
  
                    late.add(latesix);
                  } else {
                    status = "正常";
                    BaseAttend normalB = new BaseAttend();
                    normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend5.getAtime()));
                    normal.add(normalB);
                  }
                } else {
                  status = "未签到";
                  BaseAttend notSignsix = new BaseAttend();
                  notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime5() + ")");
                  notSign.add(notSignsix);
                }
              }
              else {
                Attend attend5 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "5");
                if (attend5 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                    status = "早退";
                    BaseAttend leaveEarlysix = new BaseAttend();
  
                    leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend5.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime5()).intValue() - attend5.getAtime().intValue()) + ")");
  
                    leaveEarly.add(leaveEarlysix);
                  } else {
                    status = "正常";
                    BaseAttend closedB = new BaseAttend();
                    closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend5.getAtime()));
                    closed.add(closedB);
                  }
                }
                else
                {
                  status = "未签到";
                  BaseAttend notOutsix = new BaseAttend();
                  notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime5() + ")");
                  notOut.add(notOutsix);
                }
              }
            }
  
          }
  
          if ("1".equals(attendSet.getAtime6Setother())) {
            String status = "";
            if ((DateFormat.getDateTimes(attendSet.getAtime6()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
            {
              if ("1".equals(attendSet.getCommute6())) {
                Attend attend6 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "6");
                if (attend6 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                    status = "迟到";
                    BaseAttend latesix = new BaseAttend();
  
                    latesix.setStr("签到时间为：" + attendSet.getAtime6() + "迟到(" + DateFormat.parseMillisecone(attend6.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime6()).intValue()) + ")");
  
                    late.add(latesix);
                  } else {
                    status = "正常";
                    BaseAttend normalB = new BaseAttend();
                    normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend6.getAtime()));
                    normal.add(normalB);
                  }
                } else {
                  status = "未签到";
                  BaseAttend notSignsix = new BaseAttend();
                  notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime6() + ")");
                  notSign.add(notSignsix);
                }
              }
              else {
                Attend attend6 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "6");
                if (attend6 != null)
                {
                  String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                  if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                    status = "早退";
                    BaseAttend leaveEarlysix = new BaseAttend();
  
                    leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend6.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime6()).intValue() - attend6.getAtime().intValue()) + ")");
  
                    leaveEarly.add(leaveEarlysix);
                  } else {
                    status = "正常";
                    BaseAttend closedB = new BaseAttend();
                    closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend6.getAtime()));
                    closed.add(closedB);
                  }
                }
                else
                {
                  status = "weiqiandao";
                  BaseAttend notOutsix = new BaseAttend();
                  notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime6() + ")");
                  notOut.add(notOutsix);
                }
  
              }
  
            }
  
          }
  
        }
  
        attendStatistics.setCount1(Integer.valueOf(normal.size()));
        attendStatistics.setCount1List(normal);
  
        attendStatistics.setCount2(Integer.valueOf(closed.size()));
        attendStatistics.setCount2List(closed);
  
        attendStatistics.setCount3(Integer.valueOf(notSign.size()));
        attendStatistics.setCount3List(notSign);
  
        attendStatistics.setCount4(Integer.valueOf(notOut.size()));
        attendStatistics.setCount4List(notOut);
  
        attendStatistics.setCount5(Integer.valueOf(late.size()));
        attendStatistics.setCount5List(late);
  
        attendStatistics.setCount6(Integer.valueOf(leaveEarly.size()));
        attendStatistics.setCount6List(leaveEarly);
  
        attendStatistics.setCount7(Integer.valueOf(normalyichang.size()));
        attendStatistics.setCount7List(normalyichang);
  
        attendStatistics.setCount8(Integer.valueOf(fields.size()));
        attendStatistics.setCount8List(fields);
      }
  
      if (attendStatistics != null) {
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setData(attendStatistics);
        wrappers.setMsg("更新成功");
      } else {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("更新失敗");
      }
      return wrappers;
    }
  
    public AttendSetWrappers pcAttendanceStatistics(String beiginDate, String endDate, String deptId, String dutyType, String uids, HttpServletRequest req)
    {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      Map objectMap = new HashMap();
  
      objectMap.put("deptId", deptId);
  
      objectMap.put("dutyType", dutyType);
  
      objectMap.put("uid", uids);
  
      List usersList = this.usersMapper.getUsersByMaps(objectMap);
      Iterator usersIterator = usersList.iterator();
      Date dateTime = new Date();
      SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
      String time = format.format(dateTime);
      Date dateTime1 = new Date();
      SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
      String time1 = format1.format(dateTime1);
  
      List attendStatisticAll = new ArrayList();
      while (usersIterator.hasNext()) {
        List<Date> date = new ArrayList();
        Users users = (Users)usersIterator.next();
  
        Integer uid = users.getUid();
  
        String deptName = users.getDeptName();
        UserExt userExt = this.userExtMapper.queryUserExt(String.valueOf(users.getUid()));
        if (userExt != null) {
          List normal = new ArrayList();
          List normalyichang = new ArrayList();
          List closed = new ArrayList();
          List notSign = new ArrayList();
          List notOut = new ArrayList();
          List leaveEarly = new ArrayList();
          List late = new ArrayList();
          List fields = new ArrayList();
          List attendance = new ArrayList();
          List evection = new ArrayList();
          List leave = new ArrayList();
          List out = new ArrayList();
  
          AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(userExt.getDutyType().shortValue()));
          int xqhbt = 0;
  
          String[] str1 = attendSet.getAtime1Set().split("\\|");
  
          if ("1".equals(str1[0])) {
            xqhbt++;
          }
  
          attendSet.setAtime1Setother(str1[0]);
  
          attendSet.setCommute1(str1[1]);
          String[] str2 = attendSet.getAtime2Set().split("\\|");
          if ("1".equals(str2[0])) {
            xqhbt++;
          }
          attendSet.setAtime2Setother(str2[0]);
          attendSet.setCommute2(str2[1]);
          String[] str3 = attendSet.getAtime3Set().split("\\|");
          if ("1".equals(str3[0])) {
            xqhbt++;
          }
          attendSet.setAtime3Setother(str3[0]);
          attendSet.setCommute3(str3[1]);
          String[] str4 = attendSet.getAtime4Set().split("\\|");
          if ("1".equals(str4[0])) {
            xqhbt++;
          }
          attendSet.setAtime4Setother(str4[0]);
          attendSet.setCommute4(str4[1]);
          String[] str5 = attendSet.getAtime5Set().split("\\|");
          if ("1".equals(str5[0])) {
            xqhbt++;
          }
          attendSet.setAtime5Setother(str5[0]);
          attendSet.setCommute5(str5[1]);
          String[] str6 = attendSet.getAtime6Set().split("\\|");
          if ("1".equals(str6[0])) {
            xqhbt++;
          }
  
          Calendar c = Calendar.getInstance();
          List<Date> dates = DateCompute.getBetweenDates(DateFormat.DateToStr(beiginDate), DateFormat.DateToStr(endDate));
          for (Date nowdate1 : dates) {
            c.setTime(nowdate1);
            int weekInt = c.get(7);
            weekInt -= 1;
            if (weekInt == 0) {
              weekInt = 7;
            }
  
            String week = String.valueOf(weekInt);
            if (attendSet.getWorkdate().contains(week)) {
              date.add(nowdate1);
            }
          }
          normalyichang = myAttendUnitException(beiginDate, endDate, uid.toString(), req);
          for (Date nowdate : date) {
            if ("1".equals(attendSet.getIsOut())) {
              List attend0 = this.attendMapper.selectAttend0(DateFormat.getDatestr(nowdate), uid.toString());
              if ((attend0 != null) && (attend0.size() > 0)) {
                Iterator attendIterator = attend0.iterator();
                while (attendIterator.hasNext()) {
                  Field field = new Field();
                  Attend attend1 = (Attend)attendIterator.next();
                  field.setDate(DateFormat.getDatestrTime(nowdate));
                  field.setTime(DateFormat.getwyqStrTime(attend1.getAtime()));
                  field.setStr(attend1.getAddress());
                  field.setPhoneId(attend1.getPhoneId());
                  field.setCause(attend1.getRemark());
                  fields.add(field);
                }
              }
            }
  
            if ("1".equals(attendSet.getAtime1Setother())) {
              String status = "";
              if ((DateFormat.getDateTimes(attendSet.getAtime1()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
              {
                if ("1".equals(attendSet.getCommute1())) {
                  Attend attend1 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "1");
                  if (attend1 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                      status = "迟到";
                      BaseAttend latesix = new BaseAttend();
  
                      latesix.setStr("签到时间为：" + attendSet.getAtime1() + "迟到(" + DateFormat.parseMillisecone(attend1.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime1()).intValue()) + ")");
  
                      late.add(latesix);
                    } else {
                      status = "正常";
                      BaseAttend normalB = new BaseAttend();
                      normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend1.getAtime()));
                      normal.add(normalB);
                    }
                  } else {
                    status = "未签到";
                    BaseAttend notSignsix = new BaseAttend();
                    notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime1() + ")");
                    notSign.add(notSignsix);
                  }
                }
                else {
                  Attend attend1 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "1");
                  if (attend1 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend1.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime1()).getTime()) {
                      status = "早退";
                      BaseAttend leaveEarlysix = new BaseAttend();
  
                      leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend1.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime1()).intValue() - attend1.getAtime().intValue()) + ")");
  
                      leaveEarly.add(leaveEarlysix);
                    } else {
                      status = "正常";
                      BaseAttend closedB = new BaseAttend();
                      closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend1.getAtime()));
                      closed.add(closedB);
                    }
                  }
                  else
                  {
                    status = "未签到";
                    BaseAttend notOutsix = new BaseAttend();
                    notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime1() + ")");
                    notOut.add(notOutsix);
                  }
                }
              }
  
            }
  
            if ("1".equals(attendSet.getAtime2Setother())) {
              String status = "";
              if ((DateFormat.getDateTimes(attendSet.getAtime2()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
              {
                if ("1".equals(attendSet.getCommute2())) {
                  Attend attend2 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "2");
                  if (attend2 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend2.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime2()).getTime()) {
                      status = "迟到";
                      BaseAttend latesix = new BaseAttend();
  
                      latesix.setStr("签到时间为：" + attendSet.getAtime2() + "迟到(" + DateFormat.parseMillisecone(attend2.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime2()).intValue()) + ")");
  
                      late.add(latesix);
                    } else {
                      status = "正常";
                      BaseAttend normalB = new BaseAttend();
                      normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend2.getAtime()));
                      normal.add(normalB);
                    }
                  } else {
                    status = "未签到";
                    BaseAttend notSignsix = new BaseAttend();
                    notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime2() + ")");
                    notSign.add(notSignsix);
                  }
                }
                else {
                  Attend attend2 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "2");
                  if (attend2 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend2.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime2()).getTime()) {
                      status = "早退";
                      BaseAttend leaveEarlysix = new BaseAttend();
  
                      leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend2.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime2()).intValue() - attend2.getAtime().intValue()) + ")");
  
                      leaveEarly.add(leaveEarlysix);
                    } else {
                      status = "正常";
                      BaseAttend closedB = new BaseAttend();
                      closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend2.getAtime()));
                      closed.add(closedB);
                    }
                  }
                  else
                  {
                    status = "未签到";
                    BaseAttend notOutsix = new BaseAttend();
                    notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime2() + ")");
                    notOut.add(notOutsix);
                  }
                }
              }
  
            }
  
            if ("1".equals(attendSet.getAtime3Setother())) {
              String status = "";
              if ((DateFormat.getDateTimes(attendSet.getAtime3()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
              {
                if ("1".equals(attendSet.getCommute3())) {
                  Attend attend3 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "3");
                  if (attend3 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                      status = "迟到";
                      BaseAttend latesix = new BaseAttend();
  
                      latesix.setStr("签到时间为：" + attendSet.getAtime3() + "迟到(" + DateFormat.parseMillisecone(attend3.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime3()).intValue()) + ")");
  
                      late.add(latesix);
                    } else {
                      status = "正常";
                      BaseAttend normalB = new BaseAttend();
                      normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend3.getAtime()));
                      normal.add(normalB);
                    }
                  } else {
                    status = "未签到";
                    BaseAttend notSignsix = new BaseAttend();
                    notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime3() + ")");
                    notSign.add(notSignsix);
                  }
                }
                else {
                  Attend attend3 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "3");
                  if (attend3 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend3.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime3()).getTime()) {
                      status = "早退";
                      BaseAttend leaveEarlysix = new BaseAttend();
  
                      leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend3.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime3()).intValue() - attend3.getAtime().intValue()) + ")");
  
                      leaveEarly.add(leaveEarlysix);
                    } else {
                      status = "正常";
                      BaseAttend closedB = new BaseAttend();
                      closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend3.getAtime()));
                      closed.add(closedB);
                    }
                  }
                  else
                  {
                    status = "未签到";
                    BaseAttend notOutsix = new BaseAttend();
                    notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime3() + ")");
                    notOut.add(notOutsix);
                  }
                }
              }
  
            }
  
            if ("1".equals(attendSet.getAtime4Setother())) {
              String status = "";
              if ((DateFormat.getDateTimes(attendSet.getAtime4()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
              {
                if ("1".equals(attendSet.getCommute4())) {
                  Attend attend4 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "4");
                  if (attend4 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                      status = "迟到";
                      BaseAttend latesix = new BaseAttend();
  
                      latesix.setStr("签到时间为：" + attendSet.getAtime4() + "迟到(" + DateFormat.parseMillisecone(attend4.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime4()).intValue()) + ")");
  
                      late.add(latesix);
                    } else {
                      status = "正常";
                      BaseAttend normalB = new BaseAttend();
                      normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend4.getAtime()));
                      normal.add(normalB);
                    }
                  } else {
                    status = "未签到";
                    BaseAttend notSignsix = new BaseAttend();
                    notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime4() + ")");
                    notSign.add(notSignsix);
                  }
                }
                else {
                  Attend attend4 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "4");
                  if (attend4 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend4.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime4()).getTime()) {
                      status = "早退";
                      BaseAttend leaveEarlysix = new BaseAttend();
  
                      leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend4.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime4()).intValue() - attend4.getAtime().intValue()) + ")");
  
                      leaveEarly.add(leaveEarlysix);
                    } else {
                      status = "正常";
                      BaseAttend closedB = new BaseAttend();
                      closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend4.getAtime()));
                      closed.add(closedB);
                    }
                  }
                  else
                  {
                    status = "未签到";
                    BaseAttend notOutsix = new BaseAttend();
                    notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime4() + ")");
                    notOut.add(notOutsix);
                  }
                }
              }
  
            }
  
            if ("1".equals(attendSet.getAtime5Setother())) {
              String status = "";
              if ((DateFormat.getDateTimes(attendSet.getAtime5()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
              {
                if ("1".equals(attendSet.getCommute5())) {
                  Attend attend5 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "5");
                  if (attend5 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                      status = "迟到";
                      BaseAttend latesix = new BaseAttend();
  
                      latesix.setStr("签到时间为：" + attendSet.getAtime5() + "迟到(" + DateFormat.parseMillisecone(attend5.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime5()).intValue()) + ")");
                      latesix.setSignStatus(status);
                      latesix.setSignTimeStr("规定签到时间为：" + attendSet.getAtime5() + "签到时间：(" + DateFormat.parseMillisecone(attend5.getAtime().intValue()) + ")");
  
                      late.add(latesix);
                    } else {
                      status = "正常";
                      BaseAttend normalB = new BaseAttend();
                      normalB.setSignStatus(status);
  
                      normalB.setSignTimeStr("规定签到时间为：" + attendSet.getAtime5() + "签到时间：(" + DateFormat.parseMillisecone(attend5.getAtime().intValue()) + ")");
  
                      normal.add(normalB);
                    }
                  } else {
                    status = "未签到";
                    BaseAttend notSignsix = new BaseAttend();
                    notSignsix.setSignStatus(status);
                    notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime5() + ")");
                    notSign.add(notSignsix);
                  }
                }
                else {
                  Attend attend5 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "5");
                  if (attend5 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend5.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime5()).getTime()) {
                      status = "早退";
                      BaseAttend leaveEarlysix = new BaseAttend();
  
                      leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend5.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime5()).intValue() - attend5.getAtime().intValue()) + ")");
  
                      leaveEarly.add(leaveEarlysix);
                    } else {
                      status = "正常";
                      BaseAttend closedB = new BaseAttend();
                      closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend5.getAtime()));
                      closed.add(closedB);
                    }
                  }
                  else
                  {
                    status = "未签到";
                    BaseAttend notOutsix = new BaseAttend();
                    notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime5() + ")");
                    notOut.add(notOutsix);
                  }
                }
              }
  
            }
  
            if ("1".equals(attendSet.getAtime6Setother())) {
              String status = "";
              if ((DateFormat.getDateTimes(attendSet.getAtime6()).getTime() < DateFormat.getDateTimes(time).getTime()) || (!date.equals(time1)))
              {
                if ("1".equals(attendSet.getCommute6())) {
                  Attend attend6 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "6");
                  if (attend6 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() > DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                      status = "迟到";
                      BaseAttend latesix = new BaseAttend();
  
                      latesix.setStr("签到时间为：" + attendSet.getAtime6() + "迟到(" + DateFormat.parseMillisecone(attend6.getAtime().intValue() - DateFormat.getWYQTime(attendSet.getAtime6()).intValue()) + ")");
  
                      late.add(latesix);
                    } else {
                      status = "正常";
                      BaseAttend normalB = new BaseAttend();
                      normalB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend6.getAtime()));
                      normal.add(normalB);
                    }
                  } else {
                    status = "未签到";
                    BaseAttend notSignsix = new BaseAttend();
                    notSignsix.setStr("未签到(规定签到时间为：" + attendSet.getAtime6() + ")");
                    notSign.add(notSignsix);
                  }
                }
                else {
                  Attend attend6 = this.attendMapper.selectAttendAll(DateFormat.getDatestr(nowdate), uid.toString(), "6");
                  if (attend6 != null)
                  {
                    String a1 = DateFormat.getwyqStrTime(attend6.getAtime());
                    if (DateFormat.getDateTimes(a1).getTime() < DateFormat.getDateTimes(attendSet.getAtime6()).getTime()) {
                      status = "早退";
                      BaseAttend leaveEarlysix = new BaseAttend();
  
                      leaveEarlysix.setStr("签到时间为：" + DateFormat.getwyqStrTime(attend6.getAtime()) + "早退(" + DateFormat.parseMillisecone(DateFormat.getWYQTime(attendSet.getAtime6()).intValue() - attend6.getAtime().intValue()) + ")");
  
                      leaveEarly.add(leaveEarlysix);
                    } else {
                      status = "正常";
                      BaseAttend closedB = new BaseAttend();
                      closedB.setStr("签到时间：" + DateFormat.getwyqStrTime(attend6.getAtime()));
                      closed.add(closedB);
                    }
                  }
                  else
                  {
                    status = "weiqiandao";
                    BaseAttend notOutsix = new BaseAttend();
                    notOutsix.setStr("未签退(规定签到时间为：" + attendSet.getAtime6() + ")");
                    notOut.add(notOutsix);
                  }
  
                }
  
              }
  
            }
  
          }
  
          AttendStatistics attendStatistics = new AttendStatistics();
          attendStatistics.setUserName(users.getUserName());
          System.out.println("aaa" + users.getDeptName());
          attendStatistics.setDeptName(users.getDeptName());
          System.out.println("uid" + users.getUid());
          attendStatistics.setUid(users.getUid());
  
          attendStatistics.setCount1(Integer.valueOf(normal.size()));
          attendStatistics.setCount1List(normal);
  
          attendStatistics.setCount2(Integer.valueOf(closed.size()));
          attendStatistics.setCount2List(closed);
  
          attendStatistics.setCount3(Integer.valueOf(notSign.size()));
          attendStatistics.setCount3List(notSign);
  
          attendStatistics.setCount4(Integer.valueOf(notOut.size()));
          attendStatistics.setCount4List(notOut);
  
          attendStatistics.setCount5(Integer.valueOf(late.size()));
          attendStatistics.setCount5List(late);
  
          attendStatistics.setCount6(Integer.valueOf(leaveEarly.size()));
          attendStatistics.setCount6List(leaveEarly);
  
          attendStatistics.setCount7(Integer.valueOf(normalyichang.size()));
          attendStatistics.setCount7List(normalyichang);
  
          attendStatistics.setCount8(Integer.valueOf(fields.size()));
          attendStatistics.setCount8List(fields);
  
          attendStatistics.setCount9(Integer.valueOf(attendance.size()));
          attendStatistics.setCount9List(attendance);
  
          attendStatistics.setCount10(Integer.valueOf(evection.size()));
          attendStatistics.setCount10List(evection);
  
          attendStatistics.setCount11(Integer.valueOf(leave.size()));
          attendStatistics.setCount11List(leave);
  
          attendStatistics.setCount12(Integer.valueOf(out.size()));
          attendStatistics.setCount12List(out);
  
          attendStatisticAll.add(attendStatistics);
        }
      }
  
      if (attendStatisticAll.size() > 0) {
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setData(attendStatisticAll);
        wrappers.setMsg("查询成功");
      } else {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("查询失败");
      }
      return wrappers;
    }
  
    public ToJson selectAttendDate(Integer uid)
    {
      ToJson toJson = new ToJson();
      List<Date> dateList = this.attendMapper.selectAttendDate(uid);
      List list = new ArrayList();
  
      for (Date date : dateList) {
        Map map = new LinkedHashMap();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = simpleDateFormat.format(date);
        map.put("date2", date2);
  
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String date3 = simpleDateFormat1.format(new Date());
  
        list.add(map);
      }
      if (list != null)
      {
        toJson.setFlag(0);
        toJson.setMsg("查询成功");
        toJson.setObj(list);
      } else {
        toJson.setFlag(0);
        toJson.setMsg("日期为空");
      }
  
      return toJson;
    }
  }

