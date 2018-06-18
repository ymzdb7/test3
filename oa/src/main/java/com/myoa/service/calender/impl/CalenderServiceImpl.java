  package com.myoa.service.calender.impl;
  
  import com.myoa.dao.calendar.CalendarMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.calender.Calendar;
import com.myoa.model.calender.CalendarAll;
import com.myoa.model.users.Users;
import com.myoa.service.calender.CalenderService;
import com.myoa.util.DateCompute;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;

  import java.text.SimpleDateFormat;
  import java.util.ArrayList;
  import java.util.Date;
  import java.util.HashMap;
  import java.util.List;
  import java.util.Map;
  import javax.annotation.Resource;
  import javax.servlet.http.HttpServletRequest;
  import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;
  
  @Service
  public class CalenderServiceImpl
    implements CalenderService
  {
  
    @Resource
    private CalendarMapper calendarMapper;
  
    @Resource
    private UsersMapper usersMapper;
  
    public List<Calendar> getschedule(int calTime, int endTime, String userId)
    {
      Map maps = new HashMap();
      maps.put("calTime", Integer.valueOf(calTime));
      maps.put("endTime", Integer.valueOf(endTime));
      maps.put("userId", userId);
      List list = this.calendarMapper.getschedule(maps);
      SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
      for (int j = 0; j < list.size(); j++) {
        Calendar calendar = (Calendar)list.get(j);
        int cT = calendar.getCalTime().intValue();
        int eT = calendar.getEndTime().intValue();
        Long ct = Long.valueOf(cT * 1000L);
        Long et = Long.valueOf(eT * 1000L);
        String s = f.format(ct);
        String e = f.format(et);
        calendar.setStim(s);
        calendar.setEtim(e);
      }
      return list;
    }
  
    public List<Calendar> getscheduleBycId(String userId)
    {
      Map maps = new HashMap();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      String date = sdf.format(new Date()) + " 00:00:00";
      Integer starTime = DateFormat.getTime(date);
      Integer strTime = Integer.valueOf(518400000);
  
      Integer endTime = Integer.valueOf(starTime.intValue() + strTime.intValue());
  
      maps.put("userId", userId);
      maps.put("starTime", starTime);
      maps.put("endTime", endTime);
      List list = this.calendarMapper.getscheduleBycIds(maps);
  
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
      SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
      List listAll = new ArrayList();
      for (int i = 0; i < 30; i++) {
        Calendar Allcal = new Calendar();
        int pd = starTime.intValue() + 86400 * i;
        Long t = Long.valueOf(pd * 1000L);
        List list1 = new ArrayList();
        String data = format.format(t);
        for (int j = 0; j < list.size(); j++) {
          Calendar calendar = (Calendar)list.get(j);
          CalendarAll ca = new CalendarAll();
          int cT = calendar.getCalTime().intValue();
          int eT = calendar.getEndTime().intValue();
          Long ct = Long.valueOf(cT * 1000L);
          Long et = Long.valueOf(eT * 1000L);
          String s = f.format(ct);
          String e = f.format(et);
          calendar.setStim(s);
          calendar.setEtim(e);
          if (((pd <= cT) && (cT <= pd + 86400)) || ((pd <= eT) && (pd >= cT))) {
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
        }
        Allcal.setCalData(data);
        Allcal.setCalMessage(list1);
        listAll.add(Allcal);
      }
      return listAll;
    }
  
    public List<Calendar> getscheduleBycId(String userId, String calTime) {
      List list = new ArrayList();
      List listAll = new ArrayList();
      try {
        Map maps = new HashedMap();
        String monthTime = DateCompute.getMonthTime(calTime);
        String[] split = monthTime.split(",");
        String startTime = split[0] + " 00:00:00";
        String eTime = split[1] + " 23:59:59";
        Integer startTime_1 = DateFormat.getTime(startTime);
        Integer endTime = DateFormat.getTime(eTime);
        maps.put("userId", userId);
        maps.put("starTime", startTime_1);
        maps.put("endTime", endTime);
        list = this.calendarMapper.getscheduleBycId(maps);
  
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        for (int i = 0; i < 30; i++) {
          Calendar Allcal = new Calendar();
          int pd = startTime_1.intValue() + 86400 * i;
          Long t = Long.valueOf(pd * 1000L);
          List list1 = new ArrayList();
          String data = format.format(t);
          for (int j = 0; j < list.size(); j++) {
            Calendar calendar = (Calendar)list.get(j);
            CalendarAll ca = new CalendarAll();
            int cT = calendar.getCalTime().intValue();
            int eT = calendar.getEndTime().intValue();
            Long ct = Long.valueOf(cT * 1000L);
            Long et = Long.valueOf(eT * 1000L);
            String s = f.format(ct);
            String e = f.format(et);
            calendar.setStim(s);
            calendar.setEtim(e);
            if (((pd <= cT) && (cT <= pd + 86400)) || ((pd <= eT) && (pd >= cT))) {
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
          }
          Allcal.setCalData(data);
          Allcal.setCalMessage(list1);
          listAll.add(Allcal);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
  
      return listAll;
    }
  
    public void insertSelective(Calendar record)
    {
      this.calendarMapper.insertSelective(record);
    }
  
    public void delete(int calId, HttpServletRequest request)
    {
      Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      Calendar calendar = this.calendarMapper.selCalendarById(calId);
      if (calendar.getUserId().equals(user.getUserId())) {
        calendar.setOverStatus("1");
      }
      String owner = "";
      if (calendar.getOwner().contains("," + user.getUserId() + ",")) {
        owner = calendar.getOwner().replace("," + user.getUserId() + ",", ",");
        calendar.setOwner(owner);
      } else if (calendar.getOwner().startsWith(user.getUserId() + ",")) {
        owner = calendar.getOwner().replace(user.getUserId() + ",", "");
        calendar.setOwner(owner);
      }
      String taker = "";
      if (calendar.getTaker().contains("," + user.getUserId() + ",")) {
        taker = calendar.getTaker().replace("," + user.getUserId() + ",", ",");
        calendar.setTaker(taker);
      } else if (calendar.getTaker().startsWith(user.getUserId() + ",")) {
        taker = calendar.getTaker().replace(user.getUserId() + ",", "");
        calendar.setTaker(taker);
      }
      this.calendarMapper.update(calendar);
  
      Calendar calendarNew = this.calendarMapper.selCalendarById(calId);
      if ((calendarNew.getOverStatus().equals("1")) && (StringUtils.checkNull(calendarNew.getTaker()).booleanValue()) && (StringUtils.checkNull(calendarNew.getOwner()).booleanValue()))
        this.calendarMapper.delete(calId);
    }
  
    public int update(Calendar calendar)
    {
      return this.calendarMapper.update(calendar);
    }
  
    public List<Calendar> getscheduleByDay(String userId, int time)
    {
      Map maps = new HashMap();
      maps.put("userId", userId);
      maps.put("calTime", Integer.valueOf(time));
      List list = this.calendarMapper.getscheduleByDay(maps);
      for (int i = 0; i < list.size(); i++) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar cal = (Calendar)list.get(i);
        int cT = cal.getCalTime().intValue();
        int eT = cal.getEndTime().intValue();
        Long ct = Long.valueOf(cT * 1000L);
        Long et = Long.valueOf(eT * 1000L);
        String s = format.format(ct);
        String e = format.format(et);
        cal.setStim(s);
        cal.setEtim(e);
      }
      return list;
    }
  
    public List<Calendar> getAllschedule(String userId)
    {
      Map maps = new HashMap();
      maps.put("userId", userId);
      List list = this.calendarMapper.getAllschedule(maps);
  
      SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
      for (int j = 0; j < list.size(); j++) {
        Calendar calendar = (Calendar)list.get(j);
        int cT = calendar.getCalTime().intValue();
        int eT = calendar.getEndTime().intValue();
        Long ct = Long.valueOf(cT * 1000L);
        Long et = Long.valueOf(eT * 1000L);
        String s = f.format(ct);
        String e = f.format(et);
        calendar.setStim(s);
        calendar.setEtim(e);
      }
      return list;
    }
  
    public List<Calendar> getAllscheduleinfo(Integer deptId)
    {
      Map maps = new HashMap();
      maps.put("deptId", deptId);
      List list = this.calendarMapper.getAllscheduleinfo(maps);
      try {
        if (list.size() > 0) {
          return list;
        }
        return list;
      }
      catch (Exception e) {
        e.printStackTrace();
      }
      return list;
    }
  
    public List<Calendar> getscheduleByTakerAndOwner(String userId, String calTime)
    {
      Map maps = new HashMap();
      maps.put("userId", userId);
  
      String date = DateCompute.getMonthTime(DateFormat.getDateStrTime(Integer.valueOf(calTime)));
      String[] dateArray = date.split(",");
  
      long startTime = DateFormat.getDateTime(dateArray[0]).intValue();
      long endTime = DateFormat.getDateTime(dateArray[1]).intValue();
      maps.put("startTime", Long.valueOf(startTime));
      maps.put("endTime", Long.valueOf(endTime));
      List<Calendar> list = this.calendarMapper.getscheduleByTakerAndOwner(maps);
      List<Calendar> list1 = this.calendarMapper.getscheduleByUserId(maps);
      for (Calendar calendar1 : list1) {
        boolean flag = false;
        if (list.size() > 0) {
          for (Calendar calendar : list) {
            if (calendar.getCalId() == calendar1.getCalId()) {
              flag = true;
            }
          }
          if (!flag)
            list.add(calendar1);
        }
        else {
          list.addAll(list1);
        }
      }
  
      SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
      for (int j = 0; j < list.size(); j++) {
        Calendar calendar = (Calendar)list.get(j);
        int cT = calendar.getCalTime().intValue();
        int eT = calendar.getEndTime().intValue();
        Long ct = Long.valueOf(cT * 1000L);
        Long et = Long.valueOf(eT * 1000L);
        String s = f.format(ct);
        String e = f.format(et);
        calendar.setStim(s);
        calendar.setEtim(e);
      }
      return list;
    }
  
    public List<Calendar> getscheduleByTakerAndOwner(String userId)
    {
      Map maps = new HashMap();
      Date date = new Date();
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
      String da = simpleDateFormat.format(date);
      long calTime = DateFormat.getDateTime(da).intValue();
      maps.put("userId", userId);
      maps.put("calTime", Long.valueOf(calTime));
      List<Calendar> list = this.calendarMapper.getAllScheduleByTakerAndOwner(maps);
      List<Calendar> list1 = this.calendarMapper.getAllScheduleByUserId(maps);
      for (Calendar calendar1 : list1) {
        boolean flag = false;
        if (list.size() > 0) {
          for (Calendar calendar : list) {
            if (calendar.getCalId() == calendar1.getCalId()) {
              flag = true;
            }
          }
          if (!flag)
            list.add(calendar1);
        }
        else {
          list.addAll(list1);
        }
      }
  
      SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
      for (int j = 0; j < list.size(); j++) {
        Calendar calendar = (Calendar)list.get(j);
        int cT = calendar.getCalTime().intValue();
        int eT = calendar.getEndTime().intValue();
        Long ct = Long.valueOf(cT * 1000L);
        Long et = Long.valueOf(eT * 1000L);
        String s = f.format(ct);
        String e = f.format(et);
        calendar.setStim(s);
        calendar.setEtim(e);
      }
      return list;
    }
  
    public ToJson<Calendar> getScheduleByUserIdAndType(HttpServletRequest request)
    {
      ToJson json = new ToJson(1, "error");
      try {
        Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
        List<Calendar> calendarList = this.calendarMapper.getScheduleByUserIdAndType(user.getUserId());
        List<Calendar> list1 = this.calendarMapper.getAllScheduleByAdmin(user.getUserId());
        for (Calendar calendar1 : list1) {
          boolean flag = false;
          for (Calendar calendar : calendarList) {
            if (calendar.getCalId() == calendar1.getCalId()) {
              flag = true;
            }
          }
          if (!flag) {
            calendarList.add(calendar1);
          }
        }
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        for (int j = 0; j < calendarList.size(); j++) {
          Calendar calendar = (Calendar)calendarList.get(j);
          int cT = calendar.getCalTime().intValue();
          int eT = calendar.getEndTime().intValue();
          Long ct = Long.valueOf(cT * 1000L);
          Long et = Long.valueOf(eT * 1000L);
          String s = f.format(ct);
          String e = f.format(et);
          calendar.setStim(s);
          calendar.setEtim(e);
        }
  
        if (calendarList.size() > 0) {
          for (Calendar calendar : calendarList) {
            if (!StringUtils.checkNull(calendar.getTaker()).booleanValue()) {
              String[] takerArr = calendar.getTaker().split(",");
              StringBuffer takeName = new StringBuffer();
              for (String takerId : takerArr) {
                if ((StringUtils.checkNull(takerId).booleanValue()) || 
                  (StringUtils.checkNull(this.usersMapper.getUsernameByUserId(takerId)).booleanValue())) continue;
                takeName.append(this.usersMapper.getUsernameByUserId(takerId) + ",");
              }
  
              calendar.setTakeName(takeName.toString());
            }
            if (!StringUtils.checkNull(calendar.getOwner()).booleanValue()) {
              String[] owerArr = calendar.getOwner().split(",");
              StringBuffer owerName = new StringBuffer();
              for (String owerId : owerArr) {
                if ((StringUtils.checkNull(owerId).booleanValue()) || 
                  (StringUtils.checkNull(this.usersMapper.getUsernameByUserId(owerId)).booleanValue())) continue;
                owerName.append(this.usersMapper.getUsernameByUserId(owerId) + ",");
              }
  
              calendar.setOwnerName(owerName.toString());
            }
          }
        }
        json.setObj(calendarList);
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "CalenderServiceImpl getAllSchedule:" + e });
      }
      return json;
    }
  
    public ToJson<Calendar> getAllScheduleByDeptIdAndDate(String userId, String deptId)
    {
      ToJson json = new ToJson(1, "error");
      try {
        Map maps = new HashMap();
  
        maps.put("deptId", deptId);
        maps.put("userId", userId);
        List<Calendar> calendarList = this.calendarMapper.getAllScheduleByDeptIdAndDate(maps);
        List<Calendar> list1 = this.calendarMapper.queryAllScheduleByTakerAndOwner(maps);
        for (Calendar calendar1 : list1) {
          boolean flag = false;
          for (Calendar calendar : calendarList) {
            if (calendar.getCalId() == calendar1.getCalId()) {
              flag = true;
            }
          }
          if (!flag) {
            calendarList.add(calendar1);
          }
        }
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        for (int j = 0; j < calendarList.size(); j++) {
          Calendar calendar = (Calendar)calendarList.get(j);
          int cT = calendar.getCalTime().intValue();
          int eT = calendar.getEndTime().intValue();
          Long ct = Long.valueOf(cT * 1000L);
          Long et = Long.valueOf(eT * 1000L);
          String s = f.format(ct);
          String e = f.format(et);
          calendar.setStim(s);
          calendar.setEtim(e);
        }
  
        if (calendarList.size() > 0) {
          for (Calendar calendar : calendarList) {
            if (!StringUtils.checkNull(calendar.getTaker()).booleanValue()) {
              String[] takerArr = calendar.getTaker().split(",");
              StringBuffer takeName = new StringBuffer();
              for (String takerId : takerArr) {
                if ((StringUtils.checkNull(takerId).booleanValue()) || 
                  (StringUtils.checkNull(this.usersMapper.getUsernameByUserId(takerId)).booleanValue())) continue;
                takeName.append(this.usersMapper.getUsernameByUserId(takerId) + ",");
              }
  
              calendar.setTakeName(takeName.toString());
            }
            if (!StringUtils.checkNull(calendar.getOwner()).booleanValue()) {
              String[] owerArr = calendar.getOwner().split(",");
              StringBuffer owerName = new StringBuffer();
              for (String owerId : owerArr) {
                if ((StringUtils.checkNull(owerId).booleanValue()) || 
                  (StringUtils.checkNull(this.usersMapper.getUsernameByUserId(owerId)).booleanValue())) continue;
                owerName.append(this.usersMapper.getUsernameByUserId(owerId) + ",");
              }
  
              calendar.setOwnerName(owerName.toString());
            }
          }
        }
        json.setObj(calendarList);
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "CalenderServiceImpl getAllScheduleByDeptIdAndDate:" + e });
      }
      return json;
    }
  
    public List<Calendar> rChSelect()
    {
      List attendSet = this.calendarMapper.rChSelect();
      return attendSet;
    }
  }

