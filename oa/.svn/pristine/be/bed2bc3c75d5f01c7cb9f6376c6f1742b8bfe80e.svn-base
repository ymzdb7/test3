  package com.myoa.service.attend;
  
  import com.myoa.dao.attend.AttendanceOvertimeMapper;
import com.myoa.dao.common.SysCodeMapper;
import com.myoa.model.attend.AttendEvection;
import com.myoa.model.attend.AttendanceOvertime;
import com.myoa.model.common.SysCode;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowFast;
import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.service.WFE.WFERunner.WFEFlowRunInfo;
import com.myoa.util.Constant;
import com.myoa.util.DateCompute;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.ipUtil.IpAddr;

  import java.util.ArrayList;
  import java.util.Date;
  import java.util.Iterator;
  import java.util.List;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpSession;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
  @Service
  public class AttendanceOvertimeService
  {
  
    @Autowired
    private SysCodeMapper sysCodeMapper;
  
    @Autowired
    private WFEFlowRunInfo wfeFlowRunInfo;
  
    @Autowired
    private AttendanceOvertimeMapper attendanceOvertimeMapper;
  
    public ToJson<AttendanceOvertime> queryAttendanceOvertimeByUserId(String beginDate, String endDate, HttpServletRequest req)
    {
      ToJson json = new ToJson();
      try {
        String userId = ((Users)SessionUtils.getSessionInfo(req.getSession(), Users.class, new Users())).getUserId();
        List<Date> dates = DateCompute.getBetweenDates(DateFormat.DateToStr(beginDate), DateFormat.DateToStr(endDate));
        List attendanceOvertimeList = this.attendanceOvertimeMapper.queryAttendanceOvertimeByUserId(userId);
        List newAttendanceOvertimeList = new ArrayList();
        if (attendanceOvertimeList.size() > 0) {
          for (Iterator i$ = attendanceOvertimeList.iterator(); i$.hasNext(); ) {
	                AttendanceOvertime attendanceOvertime = (AttendanceOvertime)i$.next();
            for (Date nowDate : dates) {
              String aTime = DateFormat.getDatestrTime(attendanceOvertime.getRecordTime()).substring(0, 10);
              String nTime = DateFormat.getDatestr(nowDate);
              if (aTime.equals(nTime))
                newAttendanceOvertimeList.add(attendanceOvertime);
            }
          }
          AttendanceOvertime attendanceOvertime;
          json.setObj(newAttendanceOvertimeList);
          json.setFlag(0);
          json.setMsg("err");
        }
        else {
          json.setMsg("err");
          json.setFlag(1);
        }
      }
      catch (Exception e) {
        e.printStackTrace();
        json.setFlag(1);
        json.setMsg("err");
      }
      return json;
    }
  
    public BaseWrapper addAttendanceOvertime(String createDate, HttpServletRequest request) {
      BaseWrapper baseWrapper = new BaseWrapper();
      AttendanceOvertime attendanceOvertime = new AttendanceOvertime();
      AttendEvection attendEvection = new AttendEvection();
      String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
  
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      List<SysCode> SysCode = this.sysCodeMapper.getSysCode("KQQJTYPE");
      for (SysCode sysCode : SysCode) {
        if (sysCode.getCodeName().equals("加班申请")) {
          ToJson flowFastToJson = this.wfeFlowRunInfo.workFastAdd(users, Integer.parseInt(sysCode.getCodeNo()), 1, "1", "", request, sqlType, "", null);
          if (flowFastToJson.isFlag()) {
            FlowFast flowFast = (FlowFast)flowFastToJson.getObject();
            attendanceOvertime.setUserId(users.getUserId());
            attendanceOvertime.setRegisterIp(IpAddr.getIpAddress(request));
            attendanceOvertime.setRecordTime(DateFormat.getDate(createDate));
            attendanceOvertime.setRunId(Integer.valueOf(flowFast.getFlowRun().getRunId()));
            attendanceOvertime.setStatus("1");
            attendanceOvertime.setTableName("attendance_overtime");
            attendanceOvertime.setAllow("0");
            int amount = this.attendanceOvertimeMapper.insertSelective(attendanceOvertime);
            if (amount > 0) {
              attendanceOvertime.setFlowId(flowFast.getFlowTypeModel().getFlowId().toString());
              attendanceOvertime.setFlowName(flowFast.getFlowTypeModel().getFlowName());
              baseWrapper.setFlag(true);
              baseWrapper.setStatus(true);
              baseWrapper.setData(attendanceOvertime);
              baseWrapper.setMsg("更新成功");
            }
          }
        }
      }
  
      return baseWrapper;
    }
  }

