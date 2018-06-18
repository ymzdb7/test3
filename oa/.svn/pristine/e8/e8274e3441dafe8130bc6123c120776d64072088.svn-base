  package com.myoa.service.attend;
  
  import com.myoa.dao.attend.AttendLeaveMapper;
import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.dao.workflow.FlowRunMapper;
import com.myoa.dao.workflow.FlowRunPrcsMapper;
import com.myoa.model.attend.AttendFlowRunPrcs;
import com.myoa.model.attend.AttendLeave;
import com.myoa.model.common.SysCode;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowFast;
import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.service.WFE.WFERunner.WFEFlowRunInfo;
import com.myoa.service.attend.wrapper.AttendSetWrappers;
import com.myoa.util.Constant;
import com.myoa.util.DateCompute;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.ipUtil.IpAddr;
import com.myoa.util.page.PageParams;

  import java.text.SimpleDateFormat;
  import java.util.ArrayList;
  import java.util.Calendar;
  import java.util.Date;
  import java.util.GregorianCalendar;
  import java.util.HashMap;
  import java.util.Iterator;
  import java.util.List;
  import java.util.Map;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpSession;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
  @Service
  public class AttendLeaveService
  {
  
    @Autowired
    private AttendLeaveMapper attendLeaveMapper;
  
    @Autowired
    private UsersMapper usersMapper;
  
    @Autowired
    private DepartmentMapper departmentMapper;
  
    @Autowired
    private SysCodeMapper sysCodeMapper;
  
    @Autowired
    private FlowRunPrcsMapper flowRunPrcsMapper;
  
    @Autowired
    private FlowRunMapper flowRunMapper;
  
    @Autowired
    private WFEFlowRunInfo wfeFlowRunInfo;
    public final String dateTime = "0";
  
    public ToJson<AttendFlowRunPrcs> queryAllAttendLeave(Integer page, Integer pageSize, Boolean useFlag, HttpServletRequest request, String FlowAllow)
    {
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      Map objectMap = new HashMap();
      PageParams pageParams = new PageParams();
      pageParams.setUseFlag(useFlag);
      pageParams.setPage(page);
      pageParams.setPageSize(pageSize);
      objectMap.put("page", pageParams);
      objectMap.put("userId", users.getUserId());
      objectMap.put("flowAllow", FlowAllow);
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      ToJson json = new ToJson(1, "error");
      try {
        List<AttendFlowRunPrcs> attendLeaveList = this.attendLeaveMapper.queryAllAttendLeave(objectMap);
        for (AttendLeave attendLeave : attendLeaveList)
        {
          if (!StringUtils.checkNull(attendLeave.getUserId()).booleanValue()) {
            if (this.usersMapper.findUsersByuserId(attendLeave.getUserId()) != null) {
              attendLeave.setUserName(this.usersMapper.findUsersByuserId(attendLeave.getUserId()).getUserName());
            }
            if ((this.usersMapper.findUsersByuserId(attendLeave.getUserId()) != null) && 
              (this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendLeave.getUserId()).getDeptId().intValue()) != null)) {
              attendLeave.setDeptName(this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendLeave.getUserId()).getDeptId().intValue()));
            }
  
          }
  
          if ((!StringUtils.checkNull(attendLeave.getAgent()).booleanValue()) && 
            (this.usersMapper.findUsersByuserId(attendLeave.getAgent()) != null)) {
            attendLeave.setAgent(this.usersMapper.findUsersByuserId(attendLeave.getAgent()).getUserName());
          }
  
          if (!StringUtils.checkNull(attendLeave.getStatus()).booleanValue()) {
            int status = Integer.valueOf(attendLeave.getStatus()).intValue();
            switch (status) {
            case 1:
              attendLeave.setStatus("未确认");
              break;
            case 2:
              attendLeave.setStatus("确认销假");
            }
          }
  
          if (!StringUtils.checkNull(attendLeave.getAllow()).booleanValue()) {
            int allow = Integer.valueOf(attendLeave.getAllow()).intValue();
            switch (allow) {
            case 0:
              attendLeave.setAllow("待审批");
              break;
            case 1:
              attendLeave.setAllow("已批准");
              break;
            case 2:
              attendLeave.setAllow("未批准");
              break;
            case 3:
              attendLeave.setAllow("申请销假");
            }
          }
  
          if (!StringUtils.checkNull(attendLeave.getLeaveType2()).booleanValue()) {
            int leaveType2 = Integer.valueOf(attendLeave.getLeaveType2()).intValue();
            switch (leaveType2) {
            case 1:
              attendLeave.setLeaveType2("事假");
              break;
            case 2:
              attendLeave.setLeaveType2("病假");
              break;
            case 3:
              attendLeave.setLeaveType2("年假");
            }
          }
  
          if ((attendLeave.getLeaveDate1() != null) && (attendLeave.getLeaveDate1() != null)) {
            attendLeave.setBeginDate(DateFormat.getStrDate(attendLeave.getLeaveDate1()));
            attendLeave.setEndDate(DateFormat.getStrDate(attendLeave.getLeaveDate2()));
            long begin = DateFormat.getTime(sdf.format(attendLeave.getLeaveDate1())).intValue();
            long end = DateFormat.getTime(sdf.format(attendLeave.getLeaveDate2())).intValue();
            attendLeave.setLeaveTime(DateFormat.returnTime(Integer.valueOf((int)(end - begin))));
          } else {
            attendLeave.setBeginDate("");
            attendLeave.setEndDate("");
            attendLeave.setLeaveTime("");
          }
          FlowRunPrcs flowRunPrcs = this.flowRunPrcsMapper.queryByRunId(attendLeave.getRunId());
          if (flowRunPrcs != null) {
            attendLeave.setFlowPrcs(flowRunPrcs.getFlowPrcs().toString());
            attendLeave.setPrcsId(flowRunPrcs.getPrcsId().toString());
          } else {
            attendLeave.setFlowPrcs("");
            attendLeave.setPrcsId("");
          }
          FlowRun flowRun = this.flowRunMapper.find(attendLeave.getRunId());
          if (flowRun != null) {
            attendLeave.setRunId(Integer.valueOf(flowRun.getRunId()));
          }
        }
  
        json.setObj(attendLeaveList);
        json.setMsg("ok");
        json.setFlag(0);
        json.setTotleNum(pageParams.getTotal());
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "AttendService queryAllAttendLeave:" + e });
      }
      return json;
    }
  
    public ToJson<AttendLeave> queryAllAttendLeaveFields(String tableName, HttpServletRequest req) {
      String sqlType = Constant.MYOA + (String)req.getSession().getAttribute("loginDateSouse");
  
      ToJson json = new ToJson(1, "error");
      Map map = new HashMap();
      map.put("tableName", tableName);
      map.put("sqlType", sqlType);
      List attendLeaveList = this.attendLeaveMapper.queryAllAttendLeaveFields(map);
      if ((attendLeaveList != null) && (attendLeaveList.size() > 0))
      {
        json.setObj(attendLeaveList);
        json.setMsg("ok");
        json.setFlag(0);
        return json;
      }
      return json;
    }
    public BaseWrapper addAttendLeave(String userId, String recordTime, HttpServletRequest request) {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      AttendLeave attendLeave = new AttendLeave();
      Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
  
      List<SysCode> sysCodes = this.sysCodeMapper.getSysCode("KQQJTYPE");
      for (SysCode sysCode : sysCodes) {
        if (sysCode.getCodeName().equals("请假申请")) {
          ToJson flowFastToJson = this.wfeFlowRunInfo.workFastAdd(user, Integer.parseInt(sysCode.getCodeNo()), 1, "1", "", request, sqlType, "", null);
          if (flowFastToJson.isFlag()) {
            if (StringUtils.checkNull(userId).booleanValue()) {
              Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
              attendLeave.setUserId(users.getUserId());
            } else {
              attendLeave.setUserId(userId);
            }
            FlowFast flowFast = (FlowFast)flowFastToJson.getObject();
            attendLeave.setRunId(Integer.valueOf(flowFast.getFlowRun().getRunId()));
            attendLeave.setRecordTime(DateFormat.getDate(recordTime));
            attendLeave.setRegisterIp(IpAddr.getIpAddress(request));
            attendLeave.setTableName("attend_leave");
            attendLeave.setAllow("0");
            attendLeave.setStatus("1");
  
            int amount = this.attendLeaveMapper.addAttendLeave(attendLeave);
            if (amount > 0) {
              attendLeave.setFlowId(flowFast.getFlowTypeModel().getFlowId().toString());
              attendLeave.setFlowName(flowFast.getFlowTypeModel().getFlowName());
              wrappers.setFlag(true);
              wrappers.setStatus(true);
              wrappers.setData(attendLeave);
              wrappers.setMsg("更新成功");
            }
  
          }
  
        }
  
      }
  
      return wrappers;
    }
  
    public BaseWrappers backlogAttendList(HttpServletRequest request, String num, Integer page, Integer pageSize, Boolean useFlag)
    {
      BaseWrappers wrappers = new BaseWrappers();
      wrappers.setStatus(true);
      wrappers.setFlag(false);
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      if (StringUtils.checkNull(users.getUserId()).booleanValue()) {
        wrappers.setMsg("用户信息过期");
        return wrappers;
      }
      Map map = new HashMap();
      PageParams pageParams = new PageParams();
      pageParams.setUseFlag(useFlag);
      pageParams.setPage(page);
      pageParams.setPageSize(pageSize);
      map.put("page", pageParams);
      map.put("userId", users.getUserId());
      wrappers.setTotal(pageParams.getTotal());
      if ("1".equals(num)) {
        List<AttendFlowRunPrcs> attendFlowRunPrcs = this.attendLeaveMapper.backlogAttendList(map);
        for (AttendFlowRunPrcs attendFlowRunPrcs1 : attendFlowRunPrcs)
        {
          if ((this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()) != null) && 
            (this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getDeptId().intValue()) != null)) {
            attendFlowRunPrcs1.setDeptName(this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getDeptId().intValue()));
          }
  
          if ((attendFlowRunPrcs1.getLeaveDate1() != null) && (attendFlowRunPrcs1.getLeaveDate1() != null)) {
            attendFlowRunPrcs1.setBeginDate(DateFormat.getStrDate(attendFlowRunPrcs1.getLeaveDate1()));
            attendFlowRunPrcs1.setEndDate(DateFormat.getStrDate(attendFlowRunPrcs1.getLeaveDate2()));
          }
          else {
            attendFlowRunPrcs1.setBeginDate("");
            attendFlowRunPrcs1.setEndDate("");
          }
  
          attendFlowRunPrcs1.setTableName("attend_leave");
        }
        wrappers.setFlag(true);
        wrappers.setDatas(attendFlowRunPrcs);
        wrappers.setTotal(pageParams.getTotal());
      } else if ("2".equals(num)) {
        List<AttendFlowRunPrcs> attendFlowRunPrcs = this.attendLeaveMapper.haveDoneAttendList(map);
        for (AttendFlowRunPrcs attendFlowRunPrcs1 : attendFlowRunPrcs)
        {
          if ((this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()) != null) && 
            (this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getDeptId().intValue()) != null)) {
            attendFlowRunPrcs1.setDeptName(this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getDeptId().intValue()));
          }
  
          if ((attendFlowRunPrcs1.getLeaveDate1() != null) && (attendFlowRunPrcs1.getLeaveDate1() != null)) {
            attendFlowRunPrcs1.setBeginDate(DateFormat.getStrDate(attendFlowRunPrcs1.getLeaveDate1()));
            attendFlowRunPrcs1.setEndDate(DateFormat.getStrDate(attendFlowRunPrcs1.getLeaveDate2()));
          }
          else {
            attendFlowRunPrcs1.setBeginDate("");
            attendFlowRunPrcs1.setEndDate("");
          }
  
          attendFlowRunPrcs1.setTableName("attend_leave");
        }
        wrappers.setFlag(true);
        wrappers.setDatas(attendFlowRunPrcs);
        wrappers.setTotal(pageParams.getTotal());
      }
  
      return wrappers;
    }
  
    public BaseWrapper getAllByDate(String startDate, String endDate, Integer length, String userId)
    {
      BaseWrapper baseWrapper = new BaseWrapper();
      GregorianCalendar calendar = new GregorianCalendar();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  
      if ((length != null) && (length.intValue() > 0)) {
        calendar.setTime(new Date());
        endDate = sdf.format(calendar.getTime());
        calendar.add(2, -length.intValue());
        calendar.set(5, 1);
        startDate = sdf.format(calendar.getTime());
      }
  
      HashMap param = new HashMap();
      param.put("startDate", startDate);
      param.put("endDate", endDate);
      param.put("userId", userId);
      List<AttendLeave> attendLeaves = this.attendLeaveMapper.getAllByDate(param);
  
      sdf = new SimpleDateFormat("yyyy-MM");
      Map temp = new HashMap();
      for (AttendLeave a : attendLeaves) {
        Date date = a.getLeaveDate1();
        String key = "unKnown";
        if (date != null) {
          key = sdf.format(date);
        }
        if (temp.containsKey(key))
          temp.put(key, Integer.valueOf(((Integer)temp.get(key)).intValue() + 1));
        else {
          temp.put(key, Integer.valueOf(1));
        }
  
      }
  
      baseWrapper.setData(temp);
      return baseWrapper;
    }
  
    public ToJson<AttendLeave> selectAttendLeaveByUserId(String beginDate, String endDate, HttpServletRequest req)
    {
      ToJson json = new ToJson();
      try {
        String userId = ((Users)SessionUtils.getSessionInfo(req.getSession(), Users.class, new Users())).getUserId();
        List<Date> dates = DateCompute.getBetweenDates(DateFormat.DateToStr(beginDate), DateFormat.DateToStr(endDate));
        List attendLeaveList = this.attendLeaveMapper.selectAttendLeaveByUserId(userId);
        List newAttendLeaveList = new ArrayList();
        if (attendLeaveList.size() > 0) {
          for (Iterator i$ = attendLeaveList.iterator(); i$.hasNext(); ) {
	                AttendLeave  attendLeave = (AttendLeave)i$.next();
            for (Date nowDate : dates) {
              String aTime = DateFormat.getDatestr(attendLeave.getRecordTime()).substring(0, 10);
              String nTime = DateFormat.getDatestr(nowDate);
              if (aTime.equals(nTime))
                newAttendLeaveList.add(attendLeave);
            }
          }
          AttendLeave attendLeave;
          json.setObj(newAttendLeaveList);
          json.setFlag(0);
          json.setMsg("ok");
        } else {
          json.setFlag(1);
          json.setMsg("err");
        }
  
      }
      catch (Exception e)
      {
        e.printStackTrace();
        json.setFlag(1);
        json.setMsg("err");
      }
      return json;
    }
    public BaseWrapper getAttendLeaveCount() {
      AttendSetWrappers wrappers = new AttendSetWrappers();
      Calendar cal = Calendar.getInstance();
      int year = cal.get(1);
      List attendLeaves = this.attendLeaveMapper.getAttendLeaveCount(String.valueOf(year));
      wrappers.setData(attendLeaves);
      wrappers.setFlag(true);
      wrappers.setStatus(true);
      wrappers.setMsg("更新成功");
      return wrappers;
    }
  } 