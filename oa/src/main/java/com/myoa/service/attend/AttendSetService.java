  package com.myoa.service.attend;
  
  import com.myoa.dao.attend.AttendSetMapper;
import com.myoa.dao.users.UserExtMapper;
import com.myoa.model.attend.AttendSet;
import com.myoa.model.users.UserExt;
import com.myoa.model.users.Users;
import com.myoa.service.attend.wrapper.AttendSetWrappers;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;

  import java.util.HashMap;
  import java.util.List;
  import java.util.Map;
  import javax.servlet.http.HttpServletRequest;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
  @Service
  public class AttendSetService
  {
  
    @Autowired
    private AttendSetMapper attendSetMapper;
  
    @Autowired
    private UserExtMapper userExtMapper;
  
    public BaseWrapper newAttendSet(AttendSet attendSet, String commute1, String commute2, String commute3, String commute4, String commute5, String commute6, String atime1Setother, String atime2Setother, String atime3Setother, String atime4Setother, String atime5Setother, String atime6Setother)
    {
      AttendSetWrappers wrappers = new AttendSetWrappers();
  
      if (StringUtils.checkNull(attendSet.getTitle()).booleanValue()) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到类型名称不能为空");
        return wrappers;
      }
      if ((Integer.parseInt(atime1Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime1()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime2Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime2()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime3Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime3()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime4Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime4()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime5Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime5()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime6Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime6()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      attendSet.setSid(Integer.valueOf(0));
      attendSet.setAtime1Set(atime1Setother + "|" + commute1);
      attendSet.setAtime2Set(atime2Setother + "|" + commute2);
      attendSet.setAtime3Set(atime3Setother + "|" + commute3);
      attendSet.setAtime4Set(atime4Setother + "|" + commute4);
      attendSet.setAtime5Set(atime5Setother + "|" + commute5);
      attendSet.setAtime6Set(atime6Setother + "|" + commute6);
      int res = this.attendSetMapper.addAttendSet(attendSet);
      if (res > 0) {
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setMsg("更新成功");
      } else {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("更新失败");
      }
  
      return wrappers;
    }
  
    public BaseWrapper updateAttendSet(AttendSet attendSet, String commute1, String commute2, String commute3, String commute4, String commute5, String commute6, String atime1Setother, String atime2Setother, String atime3Setother, String atime4Setother, String atime5Setother, String atime6Setother)
    {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      if ((Integer.parseInt(atime1Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime1()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime2Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime2()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime3Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime3()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime4Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime4()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime5Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime5()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      if ((Integer.parseInt(atime6Setother) == 1) && 
        (StringUtils.checkNull(attendSet.getAtime6()).booleanValue())) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("考勤签到时间不能为空");
        return wrappers;
      }
  
      attendSet.setAtime1Set(atime1Setother + "|" + commute1);
      attendSet.setAtime2Set(atime2Setother + "|" + commute2);
      attendSet.setAtime3Set(atime3Setother + "|" + commute3);
      attendSet.setAtime4Set(atime4Setother + "|" + commute4);
      attendSet.setAtime5Set(atime5Setother + "|" + commute5);
      attendSet.setAtime6Set(atime6Setother + "|" + commute6);
      int res = this.attendSetMapper.updateAttendSet(attendSet);
      if (res > 0) {
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setMsg("更新成功");
      } else {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("更新失败");
      }
      return wrappers;
    }
  
    public BaseWrapper selectAttendSet()
    {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      List attendSetList = this.attendSetMapper.selectAttendSet();
      if (attendSetList.size() > 0) {
        wrappers.setData(attendSetList);
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setMsg("ok");
      }
      else
      {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("err");
      }
  
      return wrappers;
    }
  
    public BaseWrapper queryAttendSetId(String sid, Integer uid, HttpServletRequest request) {
      Integer uuid = ((Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users())).getUid();
      AttendSetWrappers wrappers = new AttendSetWrappers();
      UserExt userExt = this.userExtMapper.queryUserExt(uuid.toString());
      AttendSet attendSet;
      if (StringUtils.checkNull(sid).booleanValue())
        attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(userExt.getDutyType().shortValue()));
      else
        attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(Integer.parseInt(sid)));
      if (attendSet == null) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("err");
      } else {
        String[] str1 = attendSet.getAtime1Set().split("\\|");
        for (int i = 0; i < str1.length; i++) {
          attendSet.setAtime1Setother(str1[0]);
          attendSet.setCommute1(str1[1]);
        }
        String[] str2 = attendSet.getAtime2Set().split("\\|");
        for (int i = 0; i < str2.length; i++) {
          attendSet.setAtime2Setother(str2[0]);
          attendSet.setCommute2(str2[1]);
        }
        String[] str3 = attendSet.getAtime3Set().split("\\|");
        for (int i = 0; i < str3.length; i++) {
          attendSet.setAtime3Setother(str3[0]);
          attendSet.setCommute3(str3[1]);
        }
        String[] str4 = attendSet.getAtime4Set().split("\\|");
        for (int i = 0; i < str4.length; i++) {
          attendSet.setAtime4Setother(str4[0]);
          attendSet.setCommute4(str4[1]);
        }
        String[] str5 = attendSet.getAtime5Set().split("\\|");
        for (int i = 0; i < str5.length; i++) {
          attendSet.setAtime5Setother(str5[0]);
          attendSet.setCommute5(str5[1]);
        }
        String[] str6 = attendSet.getAtime6Set().split("\\|");
        for (int i = 0; i < str6.length; i++) {
          attendSet.setAtime6Setother(str6[0]);
          attendSet.setCommute6(str6[1]);
        }
        Map map = new HashMap();
        map.put("atime1Setother", attendSet.getAtime1Setother());
        map.put("atime2Setother", attendSet.getAtime2Setother());
        map.put("atime3Setother", attendSet.getAtime3Setother());
        map.put("atime4Setother", attendSet.getAtime4Setother());
        map.put("atime5Setother", attendSet.getAtime5Setother());
        map.put("atime6Setother", attendSet.getAtime6Setother());
        Map map1 = new HashMap();
        map1.put("commute1", attendSet.getCommute1());
        map1.put("commute2", attendSet.getCommute2());
        map1.put("commute3", attendSet.getCommute3());
        map1.put("commute4", attendSet.getCommute4());
        map1.put("commute5", attendSet.getCommute5());
        map1.put("commute6", attendSet.getCommute6());
        Map map2 = new HashMap();
        map2.put("atime1", attendSet.getAtime1());
        map2.put("atime2", attendSet.getAtime2());
        map2.put("atime3", attendSet.getAtime3());
        map2.put("atime4", attendSet.getAtime4());
        map2.put("atime5", attendSet.getAtime5());
        map2.put("atime6", attendSet.getAtime6());
  
        attendSet.setAtimeSetotherList(map);
        attendSet.setCommuteList(map1);
        attendSet.setTimeList(map2);
        wrappers.setData(attendSet);
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setMsg("ok");
      }
      return wrappers;
    }
  
    public BaseWrapper queryAttendSetIdDemo(String sid, Integer uid, HttpServletRequest request) {
      Integer uuid = ((Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users())).getUid();
      AttendSetWrappers wrappers = new AttendSetWrappers();
      UserExt userExt = this.userExtMapper.queryUserExt(uuid.toString());
      AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(Integer.parseInt(sid)));
      if (attendSet == null) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("err");
      } else {
        String[] str1 = attendSet.getAtime1Set().split("\\|");
        for (int i = 0; i < str1.length; i++) {
          attendSet.setAtime1Setother(str1[0]);
          attendSet.setCommute1(str1[1]);
        }
        String[] str2 = attendSet.getAtime2Set().split("\\|");
        for (int i = 0; i < str2.length; i++) {
          attendSet.setAtime2Setother(str2[0]);
          attendSet.setCommute2(str2[1]);
        }
        String[] str3 = attendSet.getAtime3Set().split("\\|");
        for (int i = 0; i < str3.length; i++) {
          attendSet.setAtime3Setother(str3[0]);
          attendSet.setCommute3(str3[1]);
        }
        String[] str4 = attendSet.getAtime4Set().split("\\|");
        for (int i = 0; i < str4.length; i++) {
          attendSet.setAtime4Setother(str4[0]);
          attendSet.setCommute4(str4[1]);
        }
        String[] str5 = attendSet.getAtime5Set().split("\\|");
        for (int i = 0; i < str5.length; i++) {
          attendSet.setAtime5Setother(str5[0]);
          attendSet.setCommute5(str5[1]);
        }
        String[] str6 = attendSet.getAtime6Set().split("\\|");
        for (int i = 0; i < str6.length; i++) {
          attendSet.setAtime6Setother(str6[0]);
          attendSet.setCommute6(str6[1]);
        }
        Map map = new HashMap();
        map.put("atime1Setother", attendSet.getAtime1Setother());
        map.put("atime2Setother", attendSet.getAtime2Setother());
        map.put("atime3Setother", attendSet.getAtime3Setother());
        map.put("atime4Setother", attendSet.getAtime4Setother());
        map.put("atime5Setother", attendSet.getAtime5Setother());
        map.put("atime6Setother", attendSet.getAtime6Setother());
        Map map1 = new HashMap();
        map1.put("commute1", attendSet.getCommute1());
        map1.put("commute2", attendSet.getCommute2());
        map1.put("commute3", attendSet.getCommute3());
        map1.put("commute4", attendSet.getCommute4());
        map1.put("commute5", attendSet.getCommute5());
        map1.put("commute6", attendSet.getCommute6());
        Map map2 = new HashMap();
        map2.put("atime1", attendSet.getAtime1());
        map2.put("atime2", attendSet.getAtime2());
        map2.put("atime3", attendSet.getAtime3());
        map2.put("atime4", attendSet.getAtime4());
        map2.put("atime5", attendSet.getAtime5());
        map2.put("atime6", attendSet.getAtime6());
  
        attendSet.setAtimeSetotherList(map);
        attendSet.setCommuteList(map1);
        attendSet.setTimeList(map2);
        wrappers.setData(attendSet);
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setMsg("ok");
      }
      return wrappers;
    }
  
    public BaseWrapper delAttendSetbyId(String sid)
    {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      int res = this.attendSetMapper.delAttendSet(Integer.valueOf(Integer.parseInt(sid)));
      if (res > 0) {
        wrappers.setFlag(true);
        wrappers.setStatus(true);
        wrappers.setMsg("删除成功");
      } else {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("删除失败");
      }
      return wrappers;
    }
  
    public List<AttendSet> selectQuerTop()
    {
      AttendSet attendSet = null;
      List attendSet1 = this.attendSetMapper.selectQuerTop();
      return attendSet1;
    }
  
    public List<AttendSet> userSelectId()
    {
      return this.attendSetMapper.userSelectId();
    }
  
    public AttendSet queryAttendSetByTuiSongId(Integer uid) {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      UserExt userExt = this.userExtMapper.queryUserExt(String.valueOf(uid));
      AttendSet attendSet = this.attendSetMapper.queryAttendSetId(Integer.valueOf(userExt.getDutyType().shortValue()));
  
      if (attendSet == null) {
        wrappers.setFlag(false);
        wrappers.setStatus(true);
        wrappers.setMsg("err");
      } else {
        String[] str1 = attendSet.getAtime1Set().split("\\|");
        for (int i = 0; i < str1.length; i++) {
          attendSet.setAtime1Setother(str1[0]);
          attendSet.setCommute1(str1[1]);
        }
        String[] str2 = attendSet.getAtime2Set().split("\\|");
        for (int i = 0; i < str2.length; i++) {
          attendSet.setAtime2Setother(str2[0]);
          attendSet.setCommute2(str2[1]);
        }
        String[] str3 = attendSet.getAtime3Set().split("\\|");
        for (int i = 0; i < str3.length; i++) {
          attendSet.setAtime3Setother(str3[0]);
          attendSet.setCommute3(str3[1]);
        }
        String[] str4 = attendSet.getAtime4Set().split("\\|");
        for (int i = 0; i < str4.length; i++) {
          attendSet.setAtime4Setother(str4[0]);
          attendSet.setCommute4(str4[1]);
        }
        String[] str5 = attendSet.getAtime5Set().split("\\|");
        for (int i = 0; i < str5.length; i++) {
          attendSet.setAtime5Setother(str5[0]);
          attendSet.setCommute5(str5[1]);
        }
        String[] str6 = attendSet.getAtime6Set().split("\\|");
        for (int i = 0; i < str6.length; i++) {
          attendSet.setAtime6Setother(str6[0]);
          attendSet.setCommute6(str6[1]);
        }
        Map map = new HashMap();
        map.put("atime1Setother", attendSet.getAtime1Setother());
        map.put("atime2Setother", attendSet.getAtime2Setother());
        map.put("atime3Setother", attendSet.getAtime3Setother());
        map.put("atime4Setother", attendSet.getAtime4Setother());
        map.put("atime5Setother", attendSet.getAtime5Setother());
        map.put("atime6Setother", attendSet.getAtime6Setother());
        Map map1 = new HashMap();
        map1.put("commute1", attendSet.getCommute1());
        map1.put("commute2", attendSet.getCommute2());
        map1.put("commute3", attendSet.getCommute3());
        map1.put("commute4", attendSet.getCommute4());
        map1.put("commute5", attendSet.getCommute5());
        map1.put("commute6", attendSet.getCommute6());
        Map map2 = new HashMap();
        map2.put("atime1", attendSet.getAtime1());
        map2.put("atime2", attendSet.getAtime2());
        map2.put("atime3", attendSet.getAtime3());
        map2.put("atime4", attendSet.getAtime4());
        map2.put("atime5", attendSet.getAtime5());
        map2.put("atime6", attendSet.getAtime6());
  
        attendSet.setAtimeSetotherList(map);
        attendSet.setCommuteList(map1);
        attendSet.setTimeList(map2);
        wrappers.setData(attendSet);
      }
  
      return attendSet;
    }
  }

