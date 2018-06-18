  package com.myoa.service.attend;
  
  import com.myoa.dao.attend.AttendEvectionMapper;
import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.dao.workflow.FlowRunMapper;
import com.myoa.dao.workflow.FlowRunPrcsMapper;
import com.myoa.model.attend.AttendEvection;
import com.myoa.model.attend.AttendEvectionFlowRunPrcs;
import com.myoa.model.common.SysCode;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowFast;
import com.myoa.model.workflow.FlowRun;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.service.WFE.WFERunner.WFEFlowRunInfo;
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
  import java.util.Date;
  import java.util.HashMap;
  import java.util.Iterator;
  import java.util.List;
  import java.util.Map;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpSession;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
  @Service
  public class AttendEvectionService
  {
  
    @Autowired
    private AttendEvectionMapper attendEvectionMapper;
  
    @Autowired
    private UsersMapper usersMapper;
  
    @Autowired
    private DepartmentMapper departmentMapper;
  
    @Autowired
    private FlowRunPrcsMapper flowRunPrcsMapper;
  
    @Autowired
    private FlowRunMapper flowRunMapper;
  
    @Autowired
    private SysCodeMapper sysCodeMapper;
  
    @Autowired
    private WFEFlowRunInfo wfeFlowRunInfo;
  
    public ToJson<AttendEvectionFlowRunPrcs> queryAllAttendEvection(Integer page, Integer pageSize, Boolean useFlag, HttpServletRequest request, String FlowAllow)
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
        List<AttendEvectionFlowRunPrcs> attendEvectionList = this.attendEvectionMapper.queryAllAttendEvection(objectMap);
        for (AttendEvection attendEvection : attendEvectionList) {
          if (!StringUtils.checkNull(attendEvection.getUserId()).booleanValue()) {
            if (this.usersMapper.findUsersByuserId(attendEvection.getUserId()) != null) {
              attendEvection.setUserName(this.usersMapper.findUsersByuserId(attendEvection.getUserId()).getUserName());
            }
            if ((this.usersMapper.findUsersByuserId(attendEvection.getUserId()) != null) && 
              (this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendEvection.getUserId()).getDeptId().intValue()) != null)) {
              attendEvection.setDeptName(this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendEvection.getUserId()).getDeptId().intValue()));
            }
  
          }
  
          if ((!StringUtils.checkNull(attendEvection.getAgent()).booleanValue()) && 
            (this.usersMapper.findUsersByuserId(attendEvection.getAgent()) != null)) {
            attendEvection.setAgent(this.usersMapper.findUsersByuserId(attendEvection.getAgent()).getUserName());
          }
  
          if (!StringUtils.checkNull(attendEvection.getStatus()).booleanValue()) {
            int status = Integer.valueOf(attendEvection.getStatus()).intValue();
            switch (status) {
            case 1:
              attendEvection.setStatus("未确认");
              break;
            case 2:
              attendEvection.setStatus("已确认");
            }
          }
  
          if (!StringUtils.checkNull(attendEvection.getAllow()).booleanValue()) {
            int allow = Integer.valueOf(attendEvection.getAllow()).intValue();
            switch (allow) {
            case 0:
              attendEvection.setAllow("待审批");
              break;
            case 1:
              attendEvection.setAllow("已批准");
              break;
            case 2:
              attendEvection.setAllow("未批准");
            }
  
          }
  
          if ((attendEvection.getEvectionDate1() != null) && (attendEvection.getEvectionDate2() != null)) {
            attendEvection.setBeginDate(DateFormat.getStrDate(attendEvection.getEvectionDate1()));
            attendEvection.setEndDate(DateFormat.getStrDate(attendEvection.getEvectionDate2()));
            long begin = DateFormat.getTime(sdf.format(attendEvection.getEvectionDate1())).intValue();
            long end = DateFormat.getTime(sdf.format(attendEvection.getEvectionDate2())).intValue();
            attendEvection.setEvectionTime(DateFormat.returnTime(Integer.valueOf((int)(end - begin))));
          } else {
            attendEvection.setBeginDate("");
            attendEvection.setEndDate("");
            attendEvection.setEvectionTime("");
          }
          FlowRunPrcs flowRunPrcs = this.flowRunPrcsMapper.queryByRunId(attendEvection.getRunId());
          if (flowRunPrcs != null) {
            attendEvection.setFlowPrcs(flowRunPrcs.getFlowPrcs().toString());
            attendEvection.setPrcsId(flowRunPrcs.getPrcsId().toString());
          } else {
            attendEvection.setFlowPrcs("");
            attendEvection.setPrcsId("");
          }
          FlowRun flowRun = this.flowRunMapper.find(attendEvection.getRunId());
          if (flowRun != null) {
            attendEvection.setRunId(Integer.valueOf(flowRun.getRunId()));
          }
  
        }
  
        json.setObj(attendEvectionList);
        json.setMsg("ok");
        json.setFlag(0);
        json.setTotleNum(pageParams.getTotal());
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "AttendService queryAllAttendEvection:" + e });
      }
      return json;
    }
    public BaseWrapper addAttendEvection(String createDate, HttpServletRequest request) {
      BaseWrapper baseWrapper = new BaseWrapper();
      AttendEvection attendEvection = new AttendEvection();
      String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
  
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      List<SysCode> SysCode = this.sysCodeMapper.getSysCode("KQQJTYPE");
      for (SysCode sysCode : SysCode) {
        if (sysCode.getCodeName().equals("出差申请")) {
          ToJson flowFastToJson = this.wfeFlowRunInfo.workFastAdd(users, Integer.parseInt(sysCode.getCodeNo()), 1, "1", "", request, sqlType, "", null);
          if (flowFastToJson.isFlag()) {
            FlowFast flowFast = (FlowFast)flowFastToJson.getObject();
            attendEvection.setUserId(users.getUserId());
            attendEvection.setRegisterIp(IpAddr.getIpAddress(request));
            attendEvection.setRecordTime(DateFormat.getDate(createDate));
            attendEvection.setRunId(Integer.valueOf(flowFast.getFlowRun().getRunId()));
            attendEvection.setStatus("1");
            attendEvection.setTableName("attend_evection");
            attendEvection.setAllow("0");
            int amount = this.attendEvectionMapper.insertSelective(attendEvection);
            if (amount > 0) {
              attendEvection.setFlowId(flowFast.getFlowTypeModel().getFlowId().toString());
              attendEvection.setFlowName(flowFast.getFlowTypeModel().getFlowName());
              baseWrapper.setFlag(true);
              baseWrapper.setStatus(true);
              baseWrapper.setData(attendEvection);
              baseWrapper.setMsg("更新成功");
            }
          }
        }
      }
  
      return baseWrapper;
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
        List<AttendEvectionFlowRunPrcs> attendFlowRunPrcs = this.attendEvectionMapper.backlogAttendEvection(map);
        for (AttendEvectionFlowRunPrcs attendFlowRunPrcs1 : attendFlowRunPrcs)
        {
          if (this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()) != null) {
            attendFlowRunPrcs1.setUserName(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getUserName());
          }
          if ((this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()) != null) && 
            (this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getDeptId().intValue()) != null)) {
            attendFlowRunPrcs1.setDeptName(this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getDeptId().intValue()));
          }
  
          if ((attendFlowRunPrcs1.getEvectionDate1() != null) && (attendFlowRunPrcs1.getEvectionDate2() != null)) {
            attendFlowRunPrcs1.setBeginDate(DateFormat.getStrDate(attendFlowRunPrcs1.getEvectionDate1()));
            attendFlowRunPrcs1.setEndDate(DateFormat.getStrDate(attendFlowRunPrcs1.getEvectionDate2()));
          }
          else {
            attendFlowRunPrcs1.setBeginDate("");
            attendFlowRunPrcs1.setEndDate("");
            attendFlowRunPrcs1.setEvectionTime("");
          }
          attendFlowRunPrcs1.setTableName("attend_evection");
        }
  
        wrappers.setFlag(true);
        wrappers.setDatas(attendFlowRunPrcs);
        wrappers.setTotal(pageParams.getTotal());
      } else if ("2".equals(num)) {
        List<AttendEvectionFlowRunPrcs> attendFlowRunPrcs = this.attendEvectionMapper.haveDoneAttendEvection(map);
        for (AttendEvectionFlowRunPrcs attendFlowRunPrcs1 : attendFlowRunPrcs) {
          if (this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()) != null) {
            attendFlowRunPrcs1.setUserName(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getUserName());
          }
          if ((this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()) != null) && 
            (this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getDeptId().intValue()) != null)) {
            attendFlowRunPrcs1.setDeptName(this.departmentMapper.getDeptNameById(this.usersMapper.findUsersByuserId(attendFlowRunPrcs1.getUserId()).getDeptId().intValue()));
          }
  
          if ((attendFlowRunPrcs1.getEvectionDate1() != null) && (attendFlowRunPrcs1.getEvectionDate2() != null)) {
            attendFlowRunPrcs1.setBeginDate(DateFormat.getStrDate(attendFlowRunPrcs1.getEvectionDate1()));
            attendFlowRunPrcs1.setEndDate(DateFormat.getStrDate(attendFlowRunPrcs1.getEvectionDate2()));
          }
          else {
            attendFlowRunPrcs1.setBeginDate("");
            attendFlowRunPrcs1.setEndDate("");
            attendFlowRunPrcs1.setEvectionTime("");
          }
          attendFlowRunPrcs1.setTableName("attend_evection");
        }
        wrappers.setFlag(true);
        wrappers.setDatas(attendFlowRunPrcs);
        wrappers.setTotal(pageParams.getTotal());
      }
  
      return wrappers;
    }
  
    public ToJson<AttendEvection> selectAttendEvectionByUserId(String beginDate, String endDate, HttpServletRequest req)
    {
      ToJson json = new ToJson();
      try {
        String userId = ((Users)SessionUtils.getSessionInfo(req.getSession(), Users.class, new Users())).getUserId();
        List<Date> dates = DateCompute.getBetweenDates(DateFormat.DateToStr(beginDate), DateFormat.DateToStr(endDate));
        List attendEvectionList = this.attendEvectionMapper.selectAttendEvectionByUserId(userId);
        List newAttendEvectionList = new ArrayList();
        if (attendEvectionList.size() > 0) {
          for (Iterator i$ = attendEvectionList.iterator(); i$.hasNext(); ) { 
	                AttendEvection attendEvection = (AttendEvection)i$.next();
            for (Date nowDate : dates) {
              String aTime = DateFormat.getDatestr(attendEvection.getRecordTime()).substring(0, 10);
              String nTime = DateFormat.getDatestr(nowDate);
              if (aTime.equals(nTime))
                newAttendEvectionList.add(attendEvection);
            }
          }
          AttendEvection attendEvection;
          json.setObj(newAttendEvectionList);
          json.setFlag(0);
          json.setMsg("ok");
        } else {
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
  }

