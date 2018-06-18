 package com.myoa.service.hr.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.edu.eduDepartment.EduDepartmentMapper;
import com.myoa.dao.hr.HrStaffInfoMapper;
import com.myoa.dao.hr.HrStaffLeaveMapper;
import com.myoa.dao.users.UserPrivMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.hr.HrStaffInfo;
import com.myoa.model.hr.HrStaffInfoWithBLOBs;
import com.myoa.model.hr.HrStaffLeave;
import com.myoa.model.modulePriv.ModulePriv;
import com.myoa.model.users.UserExt;
import com.myoa.model.users.UserPriv;
import com.myoa.model.users.Users;
import com.myoa.service.hr.HrSStaffInfoService;
import com.myoa.service.users.UsersService;
import com.myoa.util.Constant;
import com.myoa.util.DateCompute;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelUtil;
import com.myoa.util.FileUploadUtil;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.OutputStream;
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Calendar;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.LinkedHashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.UUID;
 import javax.annotation.Resource;
 import javax.servlet.ServletContext;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.Row;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class HrStaffInfoServiceImpl
   implements HrSStaffInfoService
 {
 
   @Resource
   private HrStaffInfoMapper hrStaffInfoMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private HrStaffLeaveMapper hrStaffLeaveMapper;
 
   @Resource
   private EduDepartmentMapper eduDepartmentMapper;
 
   @Resource
   private UserPrivMapper userPrivMapper;
 
   public BaseWrappers selectRetireeInfo(String startTime, String endTime)
   {
     BaseWrappers wrapper = new BaseWrappers();
 
     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
     try
     {
       Date startDate = format.parse(startTime);
       Date endDate = format.parse(endTime);
       HashMap map = new HashMap();
       map.put("endDate", endDate);
       map.put("startDate", startDate);
       List hrStaffInfosList = this.hrStaffInfoMapper.selectRetireeInfo(map);
       wrapper.setDatas(hrStaffInfosList);
     } catch (ParseException e) {
       e.printStackTrace();
     }
     wrapper.setStatus(true);
     wrapper.setFlag(true);
     wrapper.setMsg("退休人员");
     return wrapper;
   }
 
   public ToJson<HrStaffInfo> selectPersonFileByDeptId(HttpServletRequest request, Integer deptId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.hrStaffInfoMapper.selectPersonFileByDeptId(deptId);
 
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       }
       else {
         toJson.setMsg("人员档案信息为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "HrRetireeServiceImpl selectPersonFileByDeptId:" + e });
     }
     return toJson;
   }
 
   public HrStaffInfo selectPersonFileByUserId(HttpServletRequest request, Integer uid)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = this.usersMapper.selectUserByUId(uid);
     String userId = users.getUserId();
     HrStaffInfo hrStaffInfo = this.hrStaffInfoMapper.getStaffByUserId(userId);
     if ((hrStaffInfo != null) && ("02".equals(hrStaffInfo.getWorkStatus()))) {
       HrStaffLeave hrStaffLeave = this.hrStaffLeaveMapper.queryStaffLeaveByLeavePerson(userId);
       if (hrStaffLeave != null)
         hrStaffInfo.setOuitTimeFact(hrStaffLeave.getQuitTimeFact());
     }
     try
     {
       if (hrStaffInfo == null) {
         hrStaffInfo = new HrStaffInfo();
         hrStaffInfo.setUid(users.getUid());
         hrStaffInfo.setUserId(users.getUserId());
         hrStaffInfo.setStaffName(users.getUserName());
         hrStaffInfo.setDeptId(users.getDeptId());
         if ((users.getDeptId() != null) && 
           (!StringUtils.checkNull(this.departmentMapper.getDeptNameByDeptId(users.getDeptId())).booleanValue())) {
           hrStaffInfo.setDeptName(this.departmentMapper.getDeptNameByDeptId(users.getDeptId()));
         }
 
         hrStaffInfo.setUserPriv(users.getUserPriv().toString());
         hrStaffInfo.setUserPrivName(users.getUserPrivName());
         hrStaffInfo.setStaffSex(users.getSex());
         hrStaffInfo.setStaffBirth(users.getBirthdayStr());
         hrStaffInfo.setIsLunar(users.getIsLunar());
         hrStaffInfo.setHomeAddress(users.getAddHome());
         hrStaffInfo.setStaffPhone(users.getTelNoHome());
         hrStaffInfo.setStaffMobile(users.getMobilNo());
         hrStaffInfo.setStaffEmail(users.getEmail());
         hrStaffInfo.setStaffQq(users.getOicqNo());
         hrStaffInfo.setStaffMsn(users.getMsn());
         hrStaffInfo.setPhoto(users.getPhoto());
         hrStaffInfo.setByName(users.getByname());
         hrStaffInfo.setWorkJob(String.valueOf(users.getJobId()));
         hrStaffInfo.setJobPosition(String.valueOf(users.getPostId()));
       } else {
         if (hrStaffInfo.getDeptId() != null) {
           hrStaffInfo.setDeptName(this.departmentMapper.getDeptNameById(hrStaffInfo.getDeptId().intValue()));
         }
         Users usersTemp = this.usersMapper.getUsersByuserId(hrStaffInfo.getUserId());
         hrStaffInfo.setUserPriv(usersTemp.getUserPriv().toString());
         if (usersTemp.getUserPriv() != null) {
           hrStaffInfo.setUserPrivName(this.userPrivMapper.getPrivNameById(Integer.valueOf(usersTemp.getUserPriv().intValue())));
         }
         hrStaffInfo.setByName(usersTemp.getByname());
         hrStaffInfo.setUid(uid);
 
         StringBuffer superiorName = new StringBuffer();
         if (!StringUtils.checkNull(hrStaffInfo.getDirectlySuperior()).booleanValue()) {
           String[] superiorArray = hrStaffInfo.getDirectlySuperior().split(",");
           for (String superior : superiorArray) {
             if ((StringUtils.checkNull(superior).booleanValue()) || 
               (this.usersMapper.getUserByUid(Integer.valueOf(superior).intValue()) == null)) continue;
             superiorName.append(this.usersMapper.getUserByUid(Integer.valueOf(superior).intValue()).getUserName() + ",");
           }
 
         }
 
         hrStaffInfo.setDirectlySuperiorName(superiorName.toString());
         StringBuffer underName = new StringBuffer();
         if (!StringUtils.checkNull(hrStaffInfo.getDirectlyUnder()).booleanValue()) {
           String[] underArray = hrStaffInfo.getDirectlyUnder().split(",");
           for (String under : underArray) {
             if ((StringUtils.checkNull(under).booleanValue()) || 
               (this.usersMapper.getUserByUid(Integer.valueOf(under).intValue()) == null)) continue;
             underName.append(this.usersMapper.getUserByUid(Integer.valueOf(under).intValue()).getUserName() + ",");
           }
 
         }
 
         hrStaffInfo.setDirectlyUnderName(underName.toString());
       }
 
       List attachmentList = new ArrayList();
       if ((hrStaffInfo.getAttachmentName() != null) && (!"".equals(hrStaffInfo.getAttachmentName()))) {
         attachmentList = GetAttachmentListUtil.returnAttachment(hrStaffInfo.getAttachmentName(), hrStaffInfo.getAttachmentId(), Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), "hr_staffinfo");
       }
       hrStaffInfo.setAttachmentList(attachmentList);
 
       toJson.setObject(hrStaffInfo);
       toJson.setMsg("ok");
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return hrStaffInfo;
   }
 
   public ToJson<HrStaffInfo> selectPersonByUserId(HttpServletRequest request, Integer uid)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = this.usersMapper.selectUserByUId(uid);
     String userId = users.getUserId();
     HrStaffInfo hrStaffInfo = this.hrStaffInfoMapper.getStaffByUserId(userId);
     try {
       if (hrStaffInfo == null) {
         hrStaffInfo = new HrStaffInfo();
         hrStaffInfo.setUid(users.getUid());
         hrStaffInfo.setUserId(users.getUserId());
         hrStaffInfo.setStaffName(users.getUserName());
         hrStaffInfo.setDeptId(users.getDeptId());
         if ((users.getDeptId() != null) && 
           (!StringUtils.checkNull(this.departmentMapper.getDeptNameByDeptId(users.getDeptId())).booleanValue())) {
           hrStaffInfo.setDeptName(this.departmentMapper.getDeptNameByDeptId(users.getDeptId()));
         }
 
         hrStaffInfo.setUserPriv(users.getUserPriv().toString());
         hrStaffInfo.setUserPrivName(users.getUserPrivName());
         hrStaffInfo.setStaffSex(users.getSex());
         hrStaffInfo.setStaffBirth(users.getBirthdayStr());
         hrStaffInfo.setIsLunar(users.getIsLunar());
         hrStaffInfo.setHomeAddress(users.getAddHome());
         hrStaffInfo.setStaffPhone(users.getTelNoHome());
         hrStaffInfo.setStaffMobile(users.getMobilNo());
         hrStaffInfo.setStaffEmail(users.getEmail());
         hrStaffInfo.setStaffQq(users.getOicqNo());
         hrStaffInfo.setStaffMsn(users.getMsn());
         hrStaffInfo.setPhoto(users.getPhoto());
       }
       else {
         if (hrStaffInfo.getDeptId() != null) {
           hrStaffInfo.setDeptName(this.departmentMapper.getDeptNameById(hrStaffInfo.getDeptId().intValue()));
         }
         Users usersTemp = this.usersMapper.getUsersByuserId(hrStaffInfo.getUserId());
         hrStaffInfo.setUserPriv(usersTemp.getUserPriv().toString());
         if (usersTemp.getUserPriv() != null) {
           hrStaffInfo.setUserPrivName(this.userPrivMapper.getPrivNameById(Integer.valueOf(usersTemp.getUserPriv().intValue())));
         }
         hrStaffInfo.setUid(uid);
 
         StringBuffer superiorName = new StringBuffer();
         if (!StringUtils.checkNull(hrStaffInfo.getDirectlySuperior()).booleanValue()) {
           String[] superiorArray = hrStaffInfo.getDirectlySuperior().split(",");
           for (String superior : superiorArray) {
             if ((StringUtils.checkNull(superior).booleanValue()) || 
               (this.usersMapper.getUserByUid(Integer.valueOf(superior).intValue()) == null)) continue;
             superiorName.append(this.usersMapper.getUserByUid(Integer.valueOf(superior).intValue()).getUserName() + ",");
           }
 
         }
 
         hrStaffInfo.setDirectlySuperiorName(superiorName.toString());
         StringBuffer underName = new StringBuffer();
         if (!StringUtils.checkNull(hrStaffInfo.getDirectlyUnder()).booleanValue()) {
           String[] underArray = hrStaffInfo.getDirectlyUnder().split(",");
           for (String under : underArray) {
             if ((StringUtils.checkNull(under).booleanValue()) || 
               (this.usersMapper.getUserByUid(Integer.valueOf(under).intValue()) == null)) continue;
             underName.append(this.usersMapper.getUserByUid(Integer.valueOf(under).intValue()).getUserName() + ",");
           }
 
         }
 
         hrStaffInfo.setDirectlyUnderName(underName.toString());
       }
 
       List attachmentList = new ArrayList();
       if ((hrStaffInfo.getAttachmentName() != null) && (!"".equals(hrStaffInfo.getAttachmentName()))) {
         attachmentList = GetAttachmentListUtil.returnAttachment(hrStaffInfo.getAttachmentName(), hrStaffInfo.getAttachmentId(), Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), "hr_staffinfo");
       }
       hrStaffInfo.setAttachmentList(attachmentList);
 
       toJson.setObject(hrStaffInfo);
       toJson.setMsg("ok");
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<HrStaffInfo> selectOwnStaffInfo(HttpServletRequest request, Users user)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = this.usersMapper.selectUserByUId(user.getUid());
     String userId = users.getUserId();
     HrStaffInfo hrStaffInfo = this.hrStaffInfoMapper.getStaffByUserId(userId);
     try {
       if (hrStaffInfo == null) {
         hrStaffInfo = new HrStaffInfo();
         hrStaffInfo.setUid(users.getUid());
         hrStaffInfo.setUserId(users.getUserId());
         hrStaffInfo.setStaffName(users.getUserName());
         hrStaffInfo.setDeptId(users.getDeptId());
         if ((users.getDeptId() != null) && 
           (!StringUtils.checkNull(this.departmentMapper.getDeptNameByDeptId(users.getDeptId())).booleanValue())) {
           hrStaffInfo.setDeptName(this.departmentMapper.getDeptNameByDeptId(users.getDeptId()));
         }
 
         hrStaffInfo.setUserPriv(users.getUserPriv().toString());
         hrStaffInfo.setUserPrivName(users.getUserPrivName());
         hrStaffInfo.setStaffSex(users.getSex());
         hrStaffInfo.setStaffBirth(users.getBirthdayStr());
         hrStaffInfo.setIsLunar(users.getIsLunar());
         hrStaffInfo.setHomeAddress(users.getAddHome());
         hrStaffInfo.setStaffPhone(users.getTelNoHome());
         hrStaffInfo.setStaffMobile(users.getMobilNo());
         hrStaffInfo.setStaffEmail(users.getEmail());
         hrStaffInfo.setStaffQq(users.getOicqNo());
         hrStaffInfo.setStaffMsn(users.getMsn());
         hrStaffInfo.setPhoto(users.getPhoto());
       }
       else {
         if (hrStaffInfo.getDeptId() != null) {
           hrStaffInfo.setDeptName(this.departmentMapper.getDeptNameById(hrStaffInfo.getDeptId().intValue()));
         }
         Users usersTemp = this.usersMapper.getUsersByuserId(hrStaffInfo.getUserId());
         hrStaffInfo.setUserPriv(usersTemp.getUserPriv().toString());
         if (usersTemp.getUserPriv() != null) {
           hrStaffInfo.setUserPrivName(this.userPrivMapper.getPrivNameById(Integer.valueOf(usersTemp.getUserPriv().intValue())));
         }
         hrStaffInfo.setUid(user.getUid());
 
         StringBuffer superiorName = new StringBuffer();
         if (!StringUtils.checkNull(hrStaffInfo.getDirectlySuperior()).booleanValue()) {
           String[] superiorArray = hrStaffInfo.getDirectlySuperior().split(",");
           for (String superior : superiorArray) {
             if ((StringUtils.checkNull(superior).booleanValue()) || 
               (this.usersMapper.getUserByUid(Integer.valueOf(superior).intValue()) == null)) continue;
             superiorName.append(this.usersMapper.getUserByUid(Integer.valueOf(superior).intValue()).getUserName() + ",");
           }
 
         }
 
         hrStaffInfo.setDirectlySuperiorName(superiorName.toString());
         StringBuffer underName = new StringBuffer();
         if (!StringUtils.checkNull(hrStaffInfo.getDirectlyUnder()).booleanValue()) {
           String[] underArray = hrStaffInfo.getDirectlyUnder().split(",");
           for (String under : underArray) {
             if ((StringUtils.checkNull(under).booleanValue()) || 
               (this.usersMapper.getUserByUid(Integer.valueOf(under).intValue()) == null)) continue;
             underName.append(this.usersMapper.getUserByUid(Integer.valueOf(under).intValue()).getUserName() + ",");
           }
 
         }
 
         hrStaffInfo.setDirectlyUnderName(underName.toString());
       }
 
       List attachmentList = new ArrayList();
       if ((hrStaffInfo.getAttachmentName() != null) && (!"".equals(hrStaffInfo.getAttachmentName()))) {
         attachmentList = GetAttachmentListUtil.returnAttachment(hrStaffInfo.getAttachmentName(), hrStaffInfo.getAttachmentId(), Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), "hr_staffinfo");
       }
       hrStaffInfo.setAttachmentList(attachmentList);
 
       toJson.setObject(hrStaffInfo);
       toJson.setMsg("ok");
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public BaseWrappers getHrStaffInfoNews()
   {
     BaseWrappers baseWrapper = new BaseWrappers();
     Calendar cal = Calendar.getInstance();
     int year = cal.get(1);
     int month = cal.get(2) + 1;
     List hrStaffInfos = this.hrStaffInfoMapper.getHrStaffInfoNews(String.valueOf(month), String.valueOf(year));
     baseWrapper.setDatas(hrStaffInfos);
     baseWrapper.setFlag(true);
     baseWrapper.setStatus(true);
     baseWrapper.setMsg("更新成功");
     return baseWrapper;
   }
 
   public BaseWrapper getHrStaffInfoCount(String type) throws ParseException {
     BaseWrapper baseWrapper = new BaseWrapper();
     List<HrStaffInfo> hrStaffInfos = this.hrStaffInfoMapper.getHrStaffInfoCount();
     SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
     if ("1".equals(type)) {
       Map map = new LinkedHashMap();
       map.put("20-25岁", Integer.valueOf(0));
       map.put("25-30岁", Integer.valueOf(0));
       map.put("30-35岁", Integer.valueOf(0));
       map.put("35-40岁", Integer.valueOf(0));
       map.put("40-45岁", Integer.valueOf(0));
       map.put("45-50岁", Integer.valueOf(0));
       map.put("45-50岁", Integer.valueOf(0));
       map.put("50-55岁", Integer.valueOf(0));
       map.put("55以上", Integer.valueOf(0));
       for (HrStaffInfo hrStaffInfo : hrStaffInfos) {
         try {
           Date date = myFormatter.parse(hrStaffInfo.getStaffBirth());
           Integer ageNum = Integer.valueOf(DateCompute.getAge(date));
           if ((ageNum.intValue() >= 20) && (ageNum.intValue() < 25))
             map.put("20-25岁", Integer.valueOf(((Integer)map.get("20-25岁")).intValue() + 1));
           else if ((ageNum.intValue() >= 25) && (ageNum.intValue() < 30))
             map.put("25-30岁", Integer.valueOf(((Integer)map.get("25-30岁")).intValue() + 1));
           else if ((ageNum.intValue() >= 30) && (ageNum.intValue() < 35))
             map.put("30-35岁", Integer.valueOf(((Integer)map.get("30-35岁")).intValue() + 1));
           else if ((ageNum.intValue() >= 35) && (ageNum.intValue() < 40))
             map.put("35-40岁", Integer.valueOf(((Integer)map.get("35-40岁")).intValue() + 1));
           else if ((ageNum.intValue() >= 40) && (ageNum.intValue() < 45))
             map.put("40-45岁", Integer.valueOf(((Integer)map.get("40-45岁")).intValue() + 1));
           else if ((ageNum.intValue() >= 45) && (ageNum.intValue() < 50))
             map.put("45-50岁", Integer.valueOf(((Integer)map.get("45-50岁")).intValue() + 1));
           else if ((ageNum.intValue() >= 50) && (ageNum.intValue() < 55))
             map.put("50-55岁", Integer.valueOf(((Integer)map.get("50-55岁")).intValue() + 1));
           else if (ageNum.intValue() > 55)
             map.put("55以上", Integer.valueOf(((Integer)map.get("55以上")).intValue() + 1));
         }
         catch (ParseException e) {
           e.printStackTrace();
         }
       }
       baseWrapper.setData(map);
     } else if ("2".equals(type)) {
       Map map = new LinkedHashMap();
       map.put("男", Integer.valueOf(0));
       map.put("女", Integer.valueOf(0));
       for (HrStaffInfo hrStaffInfo : hrStaffInfos) {
         if ("1".equals(hrStaffInfo.getSex()))
           map.put("女", Integer.valueOf(((Integer)map.get("女")).intValue() + 1));
         else {
           map.put("男", Integer.valueOf(((Integer)map.get("男")).intValue() + 1));
         }
       }
       baseWrapper.setData(map);
     }
     else if ("3".equals(type)) {
       Map map = new LinkedHashMap();
       map.put("小学", Integer.valueOf(0));
       map.put("初中", Integer.valueOf(0));
       map.put("高中", Integer.valueOf(0));
       map.put("中专", Integer.valueOf(0));
       map.put("大专", Integer.valueOf(0));
       map.put("本科", Integer.valueOf(0));
       map.put("研究生", Integer.valueOf(0));
       map.put("博士", Integer.valueOf(0));
       map.put("博士后", Integer.valueOf(0));
       map.put("技校", Integer.valueOf(0));
       for (HrStaffInfo hrStaffInfo : hrStaffInfos) {
         if ("1".equals(hrStaffInfo.getStaffHighestSchool()))
           map.put("小学", Integer.valueOf(((Integer)map.get("小学")).intValue() + 1));
         else if ("2".equals(hrStaffInfo.getStaffHighestSchool()))
           map.put("初中", Integer.valueOf(((Integer)map.get("初中")).intValue() + 1));
         else if ("3".equals(hrStaffInfo.getStaffHighestSchool()))
           map.put("高中", Integer.valueOf(((Integer)map.get("高中")).intValue() + 1));
         else if ("4".equals(hrStaffInfo.getStaffHighestSchool()))
           map.put("中专", Integer.valueOf(((Integer)map.get("中专")).intValue() + 1));
         else if ("5".equals(hrStaffInfo.getStaffHighestSchool()))
           map.put("大专", Integer.valueOf(((Integer)map.get("大专")).intValue() + 1));
         else if ("6".equals(hrStaffInfo.getStaffHighestSchool()))
           map.put("本科", Integer.valueOf(((Integer)map.get("本科")).intValue() + 1));
         else if ("7".equals(hrStaffInfo.getStaffHighestSchool()))
           map.put("研究生", Integer.valueOf(((Integer)map.get("研究生")).intValue() + 1));
         else if ("8".equals(hrStaffInfo.getStaffHighestSchool()))
           map.put("博士", Integer.valueOf(((Integer)map.get("博士")).intValue() + 1));
         else if ("9".equals(hrStaffInfo.getStaffHighestSchool()))
           map.put("博士后", Integer.valueOf(((Integer)map.get("博士后")).intValue() + 1));
         else if ("11".equals(hrStaffInfo.getStaffHighestSchool())) {
           map.put("技校", Integer.valueOf(((Integer)map.get("技校")).intValue() + 1));
         }
       }
       baseWrapper.setData(map);
     }
     else if ("4".equals(type)) {
       Map map = new LinkedHashMap();
       map.put("1年以内", Integer.valueOf(0));
       map.put("1-3年", Integer.valueOf(0));
       map.put("3-5年", Integer.valueOf(0));
       map.put("5-10年", Integer.valueOf(0));
       map.put("10年以上", Integer.valueOf(0));
       for (HrStaffInfo hrStaffInfo : hrStaffInfos) {
         Date date = myFormatter.parse(hrStaffInfo.getStaffBirth());
         Integer ageNum = Integer.valueOf(DateCompute.getAge(date));
         if (ageNum.intValue() < 1)
           map.put("1年以内", Integer.valueOf(((Integer)map.get("1年以内")).intValue() + 1));
         else if ((ageNum.intValue() >= 1) && (ageNum.intValue() < 3))
           map.put("1-3年", Integer.valueOf(((Integer)map.get("1-3年")).intValue() + 1));
         else if ((ageNum.intValue() >= 3) && (ageNum.intValue() < 5))
           map.put("3-5年", Integer.valueOf(((Integer)map.get("3-5年")).intValue() + 1));
         else if ((ageNum.intValue() >= 5) && (ageNum.intValue() < 10))
           map.put("5-10年", Integer.valueOf(((Integer)map.get("5-10年")).intValue() + 1));
         else if (ageNum.intValue() >= 10) {
           map.put("10年以上", Integer.valueOf(((Integer)map.get("10年以上")).intValue() + 1));
         }
       }
       baseWrapper.setData(map);
     }
 
     baseWrapper.setFlag(true);
     baseWrapper.setStatus(true);
     baseWrapper.setMsg("更新成功");
     return baseWrapper;
   }
 
   public ToJson<HrStaffInfo> selectOnLinePerson(HrStaffInfo hrStaffInfo, HttpServletResponse response, HttpServletRequest request, String export)
   {
     ToJson toJson = new ToJson(1, "error");
     if (export == null)
       export = "0";
     try
     {
       String leaveShow = request.getParameter("leaveShow");
       List<HrStaffInfo> list = new ArrayList();
       if (StringUtils.checkNull(leaveShow).booleanValue()) {
         list = this.hrStaffInfoMapper.selectOnLinePerson(hrStaffInfo);
       }
       else if (!leaveShow.equals("1")) {
         list = this.hrStaffInfoMapper.selectOnLinePerson(hrStaffInfo);
       } else {
         list = this.hrStaffInfoMapper.selStaffByCondi(hrStaffInfo);
         for (HrStaffInfo hrStaffInfoTemp : list) {
           if (!StringUtils.checkNull(hrStaffInfoTemp.getStaffSex()).booleanValue()) {
             if (hrStaffInfoTemp.getStaffSex().equals("1")) {
               hrStaffInfoTemp.setStaffSexName("女");
             }
             else {
               hrStaffInfoTemp.setStaffSexName("男");
             }
           }
           hrStaffInfoTemp.setStaffPoliticalStatusName("无党派人士");
           if (!StringUtils.checkNull(hrStaffInfoTemp.getStaffPoliticalStatus()).booleanValue()) {
             if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("1")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("群众");
             }
             else if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("2")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("共青团员");
             }
             else if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("3")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("中共党员");
             }
             else if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("4")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("中共预备党员");
             }
             else if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("5")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("民主党派");
             }
             else {
               hrStaffInfoTemp.setStaffPoliticalStatusName("无党派人士");
             }
           }
 
           if ((!StringUtils.checkNull(hrStaffInfoTemp.getWorkStatus()).booleanValue()) && 
             (hrStaffInfoTemp.getWorkStatus().equals("02"))) {
             hrStaffInfoTemp.setStaffName(hrStaffInfoTemp.getStaffName() + "(该用户已离职)");
           }
         }
 
       }
 
       toJson.setObj(list);
       toJson.setMsg("ok");
       toJson.setFlag(0);
 
       if (export.equals("1")) {
         HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("人事导出信息表", 9);
         String[] secondTitles = { "Id", "用户名", "用户头像", "档案头像", "OA角色", "性别", "出生年月", "民族", "籍贯", "政治面貌", "入职时间" };
         HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
         String[] beanProperty = { "staffId", "staffName", "photo", "photoName", "userPrivName", "staffSexName", "staffBirth", "staffNationality", "staffNativePlace2", "staffPoliticalStatusName", "datesEmployed" };
         HSSFWorkbook workbook = ExcelUtil.exportExcelData(workbook2, list, beanProperty);
         OutputStream out = response.getOutputStream();
         String filename = "人事导出信息表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel;charset=UTF-8");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
         workbook.write(out);
         out.close();
       }
 
     }
     catch (Exception e)
     {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<HrStaffInfo> selectLeavePerson(HrStaffInfo hrStaffInfo, HttpServletResponse response, HttpServletRequest request, String export)
   {
     ToJson toJson = new ToJson(1, "error");
     if (export == null)
       export = "0";
     try
     {
       String leaveShow = request.getParameter("leaveShow");
       List<HrStaffInfo> list = new ArrayList();
       if (StringUtils.checkNull(leaveShow).booleanValue()) {
         list = this.hrStaffInfoMapper.selectLeavePerson(hrStaffInfo);
       }
       else if (!leaveShow.equals("1")) {
         list = this.hrStaffInfoMapper.selectLeavePerson(hrStaffInfo);
       } else {
         list = this.hrStaffInfoMapper.selStaffByCondi(hrStaffInfo);
         for (HrStaffInfo hrStaffInfoTemp : list) {
           if (!StringUtils.checkNull(hrStaffInfoTemp.getStaffSex()).booleanValue()) {
             if (hrStaffInfoTemp.getStaffSex().equals("1")) {
               hrStaffInfoTemp.setStaffSexName("女");
             }
             else {
               hrStaffInfoTemp.setStaffSexName("男");
             }
           }
           hrStaffInfoTemp.setStaffPoliticalStatusName("无党派人士");
           if (!StringUtils.checkNull(hrStaffInfoTemp.getStaffPoliticalStatus()).booleanValue()) {
             if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("1")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("群众");
             }
             else if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("2")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("共青团员");
             }
             else if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("3")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("中共党员");
             }
             else if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("4")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("中共预备党员");
             }
             else if (hrStaffInfoTemp.getStaffPoliticalStatus().equals("5")) {
               hrStaffInfoTemp.setStaffPoliticalStatusName("民主党派");
             }
             else {
               hrStaffInfoTemp.setStaffPoliticalStatusName("无党派人士");
             }
           }
 
           if ((!StringUtils.checkNull(hrStaffInfoTemp.getWorkStatus()).booleanValue()) && 
             (hrStaffInfoTemp.getWorkStatus().equals("02"))) {
             hrStaffInfoTemp.setStaffName(hrStaffInfoTemp.getStaffName() + "(该用户已离职)");
           }
         }
 
       }
 
       toJson.setObj(list);
       toJson.setMsg("ok");
       toJson.setFlag(0);
 
       if (export.equals("1")) {
         HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("人事导出信息表", 9);
         String[] secondTitles = { "Id", "用户名", "用户头像", "档案头像", "OA角色", "性别", "出生年月", "民族", "籍贯", "政治面貌", "入职时间" };
         HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
         String[] beanProperty = { "staffId", "staffName", "photo", "photoName", "userPrivName", "staffSexName", "staffBirth", "staffNationality", "staffNativePlace2", "staffPoliticalStatusName", "datesEmployed" };
         HSSFWorkbook workbook = ExcelUtil.exportExcelData(workbook2, list, beanProperty);
         OutputStream out = response.getOutputStream();
         String filename = "人事导出信息表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel;charset=UTF-8");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
         workbook.write(out);
         out.close();
       }
 
     }
     catch (Exception e)
     {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   @Transactional(rollbackFor={Exception.class})
   public ToJson<HrStaffInfo> updatePersonFile(HrStaffInfo hrStaffInfo, HttpServletRequest request) {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (hrStaffInfo.getStaffBirth() != null) {
         hrStaffInfo.setStaffBirth(hrStaffInfo.getStaffBirth().trim().equals("") ? "0000-00-00" : hrStaffInfo.getStaffBirth().trim().trim());
       }
       if (hrStaffInfo.getJoinPartyTime() != null) {
         hrStaffInfo.setJoinPartyTime(hrStaffInfo.getJoinPartyTime().trim().equals("") ? "0000-00-00" : hrStaffInfo.getJoinPartyTime().trim().trim());
       }
       if (hrStaffInfo.getJobBeginning() != null) {
         hrStaffInfo.setJobBeginning(hrStaffInfo.getJobBeginning().trim().equals("") ? "0000-00-00" : hrStaffInfo.getJobBeginning().trim().trim());
       }
       if (hrStaffInfo.getGraduationDate() != null) {
         hrStaffInfo.setGraduationDate(hrStaffInfo.getGraduationDate().trim().equals("") ? "0000-00-00" : hrStaffInfo.getGraduationDate().trim().trim());
       }
       if (hrStaffInfo.getBeginSalsryTime() != null) {
         hrStaffInfo.setBeginSalsryTime(hrStaffInfo.getBeginSalsryTime().trim().equals("") ? "0000-00-00" : hrStaffInfo.getBeginSalsryTime().trim().trim());
       }
       if (hrStaffInfo.getStaffCs() != null) {
         hrStaffInfo.setStaffCs(hrStaffInfo.getStaffCs().trim().equals("") ? "0000-00-00" : hrStaffInfo.getStaffCs().trim().trim());
       }
       if (hrStaffInfo.getStaffCtr() != null) {
         hrStaffInfo.setStaffCtr(hrStaffInfo.getStaffCtr().trim().equals("") ? "0000-00-00" : hrStaffInfo.getStaffCtr().trim().trim());
       }
       if (hrStaffInfo.getDatesEmployed() != null) {
         hrStaffInfo.setDatesEmployed(hrStaffInfo.getDatesEmployed().trim().equals("") ? "0000-00-00" : hrStaffInfo.getDatesEmployed().trim().trim());
       }
       if (hrStaffInfo.getLastUpdateTime() != null) {
         hrStaffInfo.setLastUpdateTime(hrStaffInfo.getLastUpdateTime().trim().equals("") ? "0000-00-00 00:00:00" : hrStaffInfo.getLastUpdateTime().trim().trim());
       }
       if (hrStaffInfo.getAddTime() != null) {
         hrStaffInfo.setAddTime(hrStaffInfo.getAddTime().trim().equals("") ? "0000-00-00 00:00:00" : hrStaffInfo.getAddTime().trim().trim());
       }
       if (hrStaffInfo.getRecordDate() != null) {
         hrStaffInfo.setRecordDate(hrStaffInfo.getRecordDate().trim().equals("") ? "0000-00-00" : hrStaffInfo.getRecordDate().trim().trim());
       }
       int count = 0;
       hrStaffInfo.setLastUpdateTime(DateFormat.getDatestr(new Date()));
 
       if (this.hrStaffInfoMapper.getStaffByUserId(hrStaffInfo.getUserId()) != null) {
         HrStaffInfo hrStaffInfoTemp = this.hrStaffInfoMapper.getStaffByUserId(hrStaffInfo.getUserId());
         hrStaffInfo.setStaffId(hrStaffInfoTemp.getStaffId());
         count += this.hrStaffInfoMapper.updatePersonFile(hrStaffInfo);
       } else {
         Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
         hrStaffInfo.setCreateUserId(user.getUserId());
         hrStaffInfo.setCreateDeptId(user.getDeptId());
         hrStaffInfo.setWorkStatus("01");
         if (this.usersMapper.findUsersByuserId(hrStaffInfo.getUserId()) != null) {
           hrStaffInfo.setUserId(this.usersMapper.findUsersByuserId(hrStaffInfo.getUserId()).getUserId());
         } else {
           Users usersByuserId = this.usersMapper.findUsersByuserId(hrStaffInfo.getUserId());
           if (usersByuserId != null) {
             hrStaffInfo.setUserId(usersByuserId.getUserId());
             hrStaffInfo.setWorkStatus("02");
           }
         }
 
         hrStaffInfo.setAddTime(DateFormat.getDatestr(new Date()));
         count += this.hrStaffInfoMapper.insert(hrStaffInfo);
       }
       Users users = new Users();
       users.setUid(hrStaffInfo.getUid());
       users.setUserId(hrStaffInfo.getUserId());
       users.setUserName(hrStaffInfo.getUserName());
       if (hrStaffInfo.getWorkStatus().equals("01")) {
         users.setDeptId(hrStaffInfo.getDeptId());
       }
       users.setUserPriv(Integer.valueOf(hrStaffInfo.getUserPriv()));
       users.setSex(hrStaffInfo.getStaffSex());
       if ((!StringUtils.checkNull(hrStaffInfo.getStaffBirth()).booleanValue()) && (!hrStaffInfo.getStaffBirth().equals("0000-00-00 00:00:00")) && (!hrStaffInfo.getStaffBirth().equals("0000-00-00"))) {
         users.setBirthday(DateFormat.getDate(hrStaffInfo.getStaffBirth()));
       }
       users.setIsLunar(hrStaffInfo.getIsLunar());
       users.setAddHome(hrStaffInfo.getHomeAddress());
       users.setTelNoHome(hrStaffInfo.getStaffPhone());
       users.setMobilNo(hrStaffInfo.getStaffMobile());
       users.setEmail(hrStaffInfo.getStaffEmail());
       users.setOicqNo(hrStaffInfo.getStaffQq());
       users.setMsn(hrStaffInfo.getStaffMsn());
       users.setPhoto(hrStaffInfo.getPhoto());
       users.setPostId(Integer.valueOf(hrStaffInfo.getJobPosition()));
       users.setJobId(Integer.valueOf(hrStaffInfo.getWorkJob()));
       count += this.usersMapper.editUser(users);
       if (count > 1) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   @Transactional(rollbackFor={Exception.class})
   public ToJson<Users> savePersonFile(HrStaffInfo hrStaffInfo, HttpServletRequest request) {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       if (hrStaffInfo.getStaffBirth() != null) {
         hrStaffInfo.setStaffBirth(hrStaffInfo.getStaffBirth().trim().equals("") ? "0000-00-00" : hrStaffInfo.getStaffBirth().trim().trim());
       }
       if (hrStaffInfo.getJoinPartyTime() != null) {
         hrStaffInfo.setJoinPartyTime(hrStaffInfo.getJoinPartyTime().trim().equals("") ? "0000-00-00" : hrStaffInfo.getJoinPartyTime().trim().trim());
       }
       if (hrStaffInfo.getJobBeginning() != null) {
         hrStaffInfo.setJobBeginning(hrStaffInfo.getJobBeginning().trim().equals("") ? "0000-00-00" : hrStaffInfo.getJobBeginning().trim().trim());
       }
       if (hrStaffInfo.getGraduationDate() != null) {
         hrStaffInfo.setGraduationDate(hrStaffInfo.getGraduationDate().trim().equals("") ? "0000-00-00" : hrStaffInfo.getGraduationDate().trim().trim());
       }
       if (hrStaffInfo.getBeginSalsryTime() != null) {
         hrStaffInfo.setBeginSalsryTime(hrStaffInfo.getBeginSalsryTime().trim().equals("") ? "0000-00-00" : hrStaffInfo.getBeginSalsryTime().trim().trim());
       }
       if (hrStaffInfo.getStaffCs() != null) {
         hrStaffInfo.setStaffCs(hrStaffInfo.getStaffCs().trim().equals("") ? "0000-00-00" : hrStaffInfo.getStaffCs().trim().trim());
       }
       if (hrStaffInfo.getStaffCtr() != null) {
         hrStaffInfo.setStaffCtr(hrStaffInfo.getStaffCtr().trim().equals("") ? "0000-00-00" : hrStaffInfo.getStaffCtr().trim().trim());
       }
       if (hrStaffInfo.getDatesEmployed() != null) {
         hrStaffInfo.setDatesEmployed(hrStaffInfo.getDatesEmployed().trim().equals("") ? "0000-00-00" : hrStaffInfo.getDatesEmployed().trim().trim());
       }
       if (hrStaffInfo.getLastUpdateTime() != null) {
         hrStaffInfo.setLastUpdateTime(hrStaffInfo.getLastUpdateTime().trim().equals("") ? "0000-00-00 00:00:00" : hrStaffInfo.getLastUpdateTime().trim().trim());
       }
       if (hrStaffInfo.getAddTime() != null) {
         hrStaffInfo.setAddTime(hrStaffInfo.getAddTime().trim().equals("") ? "0000-00-00 00:00:00" : hrStaffInfo.getAddTime().trim().trim());
       }
       if (hrStaffInfo.getRecordDate() != null) {
         hrStaffInfo.setRecordDate(hrStaffInfo.getRecordDate().trim().equals("") ? "0000-00-00" : hrStaffInfo.getRecordDate().trim().trim());
       }
 
       Users users = new Users();
       users.setDeptId(hrStaffInfo.getDeptId());
       users.setUserPriv(Integer.valueOf(hrStaffInfo.getUserPriv()));
       users.setByname(hrStaffInfo.getUserId());
       users.setUserName(hrStaffInfo.getStaffName());
       users.setPhoto(hrStaffInfo.getPhoto());
       users.setPostId(Integer.valueOf(hrStaffInfo.getJobPosition()));
       users.setJobId(Integer.valueOf(hrStaffInfo.getWorkJob()));
       UserExt userExt = new UserExt();
       ModulePriv modulePriv = new ModulePriv();
       toJson = this.usersService.addUser(users, userExt, modulePriv, request);
 
       if (toJson.isFlag()) {
         Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
         hrStaffInfo.setCreateUserId(user.getUserId());
         hrStaffInfo.setCreateDeptId(user.getDeptId());
         hrStaffInfo.setWorkStatus("01");
         hrStaffInfo.setUserId(this.usersMapper.findUserByName(hrStaffInfo.getUserId()).getUserId());
         hrStaffInfo.setAddTime(DateFormat.getDatestr(new Date()));
         int count = this.hrStaffInfoMapper.insert(hrStaffInfo);
         if (count > 0) {
           toJson.setMsg("ok");
           toJson.setFlag(0);
         }
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<HrStaffInfo> deletePersonById(String staffIds)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int count = 0;
       String[] staffIdArray = staffIds.split(",");
       for (String staffId : staffIdArray) {
         if (!StringUtils.checkNull(staffId).booleanValue()) {
           HrStaffInfo staffInfo = this.hrStaffInfoMapper.getStaffByStaffId(staffId);
           if ((!StringUtils.checkNull(staffInfo.getWorkStatus()).booleanValue()) && (staffInfo.getWorkStatus().equals("02")))
           {
             count += this.hrStaffLeaveMapper.deleteByLeavePerson(staffInfo.getUserId());
           }
           count += this.hrStaffInfoMapper.deletePersonById(staffId);
         }
       }
       if (count > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "HrRetireeServiceImpl deletePersonById:" + e });
     }
     return toJson;
   }
 
   public ToJson<Object> selectStaffInfoById(String staffId)
   {
     ToJson json = new ToJson();
     try {
       if (staffId != null) {
         HrStaffInfo hrStaffInfo = this.hrStaffInfoMapper.selectStaffInfoById(Integer.valueOf(staffId));
         hrStaffInfo.setDeptName(this.departmentMapper.getDeptNameByDeptId(hrStaffInfo.getDeptId()));
 
         json.setFlag(0);
         json.setMsg("ok");
         json.setObject(hrStaffInfo);
       }
     } catch (NumberFormatException e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
       json.setObject(null);
     }
     return json;
   }
 
   public ToJson<HrStaffInfo> queryCountNoDocument(String deptId)
   {
     ToJson json = new ToJson(1, "error");
     try {
       int count = this.hrStaffInfoMapper.queryCountNoDocument(deptId);
       json.setTotleNum(Integer.valueOf(count));
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "HrRetireeServiceImpl queryNoDocument:" + e });
     }
     return json;
   }
 
   public ToJson<HrStaffInfo> getUserByDeptId(Integer deptId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.hrStaffInfoMapper.getUserByDeptId(deptId);
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("没有用户");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<HrStaffInfo> uploadImage(HttpServletRequest request, MultipartFile imageFile, HrStaffInfo hrStaffInfo)
     throws IllegalStateException, IOException
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       String realPath = request.getSession().getServletContext().getRealPath("/");
       String resourcePath = "uihr";
 
       Users users = this.usersMapper.findUsersByuserId(hrStaffInfo.getUserId());
       HrStaffInfo hrStaffInfoTemp = new HrStaffInfo();
       if (users != null)
         hrStaffInfoTemp = this.hrStaffInfoMapper.getStaffByUserId(users.getUserId());
       else {
         hrStaffInfoTemp = this.hrStaffInfoMapper.getStaffByUserId(hrStaffInfo.getUserId());
       }
       if (hrStaffInfoTemp == null) {
         Users users1 = this.usersMapper.findUserByName(hrStaffInfo.getUserId());
         if (users1 != null)
           hrStaffInfoTemp = this.hrStaffInfoMapper.getStaffByUserId(users1.getUserId());
         else {
           hrStaffInfoTemp = this.hrStaffInfoMapper.getStaffByUserId(hrStaffInfo.getUserId());
         }
       }
       if (!StringUtils.checkNull(hrStaffInfoTemp.getPhotoName()).booleanValue()) {
         File temp = new File(realPath + resourcePath + hrStaffInfoTemp.getPhotoName());
         if (temp.exists()) {
           temp.delete();
         }
       }
 
       if (imageFile != null) {
         if (FileUploadUtil.allowUpload(imageFile.getContentType())) {
           String fileName = FileUploadUtil.rename(imageFile.getOriginalFilename());
           File dir = new File(realPath + resourcePath);
           if (!dir.exists()) {
             dir.mkdirs();
           }
           File file = new File(dir, fileName);
           imageFile.transferTo(file);
           hrStaffInfo.setPhotoName(fileName);
         }
         hrStaffInfo.setUserId("");
         hrStaffInfo.setStaffId(hrStaffInfoTemp.getStaffId());
         int count = this.hrStaffInfoMapper.updatePersonFile(hrStaffInfo);
         if (count > 0) {
           toJson.setFlag(0);
           toJson.setMsg("ok");
         }
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public BaseWrapper getAllWorkYearsInfo(int space)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     List<HrStaffInfo> hrStaffInfos = this.hrStaffInfoMapper.getAllWorkYearsInfo();
     HashMap temp = new HashMap();
     for (HrStaffInfo hs : hrStaffInfos)
     {
       Date date = new Date();
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
       int age = -1;
       if (hs != null)
       {
         if ((hs.getWorkAge() != null) && (!"".equals(hs.getWorkAge()))) {
           age = Integer.parseInt(hs.getWorkAge());
           age /= space;
         }
         else {
           Date d = null;
           try {
             d = simpleDateFormat.parse(hs.getDatesEmployed());
           } catch (ParseException e) {
             L.e(new Object[] { "工作时间转换出错" });
             L.e(new Object[] { e });
           }
           if (d != null) {
        	   long years = (date.getTime() - d.getTime()) / 86400000L / 365L;
             age = (int)years / space;
           } else {
             age = -1;
           }
         }
       }
       else age = -1;
 
       if ((age >= 0) && (age <= 65 / space)) {
         if (temp.containsKey("years" + age))
           temp.put("years" + age, Integer.valueOf(((Integer)temp.get("years" + age)).intValue() + 1));
         else {
           temp.put("years" + age, Integer.valueOf(1));
         }
       }
       else if (temp.containsKey("Unknown"))
         temp.put("Unknown", Integer.valueOf(((Integer)temp.get("Unknown")).intValue() + 1));
       else {
         temp.put("Unknown", Integer.valueOf(1));
       }
     }
 
     baseWrapper.setData(temp);
     baseWrapper.setStatus(true);
     baseWrapper.setFlag(true);
     return baseWrapper;
   }
 
   public BaseWrapper getAllRecordInfo()
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     List<HrStaffInfo> hrStaffInfos = this.hrStaffInfoMapper.getAllWorkYearsInfo();
     HashMap temp = new HashMap();
     for (HrStaffInfo hs : hrStaffInfos) {
       String staffHighestSchool = "Unknown";
       if (hs != null) {
         staffHighestSchool = hs.getStaffHighestSchool();
         if ((staffHighestSchool == null) || ("".equals(staffHighestSchool)))
         {
           staffHighestSchool = "Unknown";
         }
       }
       if (temp.containsKey(staffHighestSchool))
         temp.put(staffHighestSchool, Integer.valueOf(((Integer)temp.get(staffHighestSchool)).intValue() + 1));
       else {
         temp.put(staffHighestSchool, Integer.valueOf(1));
       }
     }
     baseWrapper.setData(temp);
     baseWrapper.setStatus(true);
     baseWrapper.setFlag(true);
     return baseWrapper;
   }
 
   public ToJson<HrStaffInfo> importStaffInfo(MultipartFile file, HttpServletRequest request, HttpServletResponse response, HttpSession session)
   {
     ToJson json = new ToJson();
 
     Integer successCount = Integer.valueOf(0);
     try
     {
       ResourceBundle rb = ResourceBundle.getBundle("upload");
       String osName = System.getProperty("os.name");
       StringBuffer path = new StringBuffer();
       if (osName.toLowerCase().startsWith("win"))
         path = path.append(rb.getString("upload.win"));
       else {
         path = path.append(rb.getString("upload.linux"));
       }
 
       if (file.isEmpty()) {
         json.setMsg("请上传文件！");
         json.setFlag(1);
         return json;
       }
       String fileName = file.getOriginalFilename();
       if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
         String uuid = UUID.randomUUID().toString().replaceAll("-", "");
         int pos = fileName.indexOf(".");
         String extName = fileName.substring(pos);
         String newFileName = uuid + extName;
         File dest = new File(path.toString(), newFileName);
         file.transferTo(dest);
 
         String readPath = path.append("\\" + newFileName).toString();
         InputStream in = new FileInputStream(readPath);
         HSSFWorkbook excelObj = new HSSFWorkbook(in);
         HSSFSheet sheetObj = excelObj.getSheetAt(0);
         Row row = sheetObj.getRow(0);
         int colNum = row.getPhysicalNumberOfCells();
         int lastRowNum = sheetObj.getLastRowNum();
         List saveList = new ArrayList();
         HrStaffInfoWithBLOBs hrStaffInfo = null;
         List parentList;
         for (int i = 1; i <= lastRowNum; i++) {
           hrStaffInfo = new HrStaffInfoWithBLOBs();
           row = sheetObj.getRow(i);
           if (row != null)
           {
             String deptIdByDeptName;
             for (int j = 0; j < colNum; j++) {
               Cell cell = row.getCell(j);
               if (cell != null) {
                 switch (j)
                 {
                 case 0:
                   hrStaffInfo.setUserId(cell.getStringCellValue());
                   break;
                 case 1:
                   parentList = this.departmentMapper.getDeptIdByDeptName(cell.getStringCellValue());
                   deptIdByDeptName = "";
                   if (parentList.size() > 0) {
                     deptIdByDeptName = (String)parentList.get(0);
                   }
                   if (StringUtils.checkNull(deptIdByDeptName).booleanValue()) continue;
                   hrStaffInfo.setDeptId(Integer.valueOf(deptIdByDeptName)); break;
                 case 2:
                   hrStaffInfo.setStaffNo(String.valueOf(cell.getNumericCellValue()));
                   break;
                 case 3:
                   hrStaffInfo.setWorkNo(String.valueOf(cell.getNumericCellValue()));
                   break;
                 case 4:
                   hrStaffInfo.setStaffName(cell.getStringCellValue());
                   break;
                 case 5:
                   hrStaffInfo.setStaffCardNo(String.valueOf(cell.getStringCellValue()));
                   break;
                 case 6:
                   hrStaffInfo.setStaffSex(String.valueOf(cell.getNumericCellValue()));
                   break;
                 case 7:
                   hrStaffInfo.setStaffNationality(cell.getStringCellValue());
                   break;
                 case 8:
                   hrStaffInfo.setStaffAge(String.valueOf(cell.getNumericCellValue()));
                   break;
                 case 9:
                   hrStaffInfo.setStaffNativePlace(cell.getStringCellValue());
                   hrStaffInfo.setStaffNativePlace2(cell.getStringCellValue());
                   break;
                 case 10:
                   String stringCellValue = cell.getStringCellValue();
                   if (stringCellValue.equals("群众")) {
                     hrStaffInfo.setStaffPoliticalStatus("1");
                   }
                   else if (stringCellValue.equals("共青团员")) {
                     hrStaffInfo.setStaffPoliticalStatus("2");
                   }
                   else if (stringCellValue.equals("中共党员")) {
                     hrStaffInfo.setStaffPoliticalStatus("3");
                   }
                   else if (stringCellValue.equals("中共预备党员")) {
                     hrStaffInfo.setStaffPoliticalStatus("4");
                   }
                   else if (stringCellValue.equals("民主党派")) {
                     hrStaffInfo.setStaffPoliticalStatus("5");
                   }
                   else {
                     hrStaffInfo.setStaffPoliticalStatus("6");
                   }
                   break;
                 case 11:
                   hrStaffInfo.setStaffMobile(String.valueOf(cell.getNumericCellValue()));
                   break;
                 case 12:
                   hrStaffInfo.setStaffEmail(cell.getStringCellValue());
                   break;
                 case 13:
                   hrStaffInfo.setStaffQq(String.valueOf(cell.getNumericCellValue()));
                   break;
                 case 14:
                   hrStaffInfo.setHomeAddress(cell.getStringCellValue());
                   break;
                 case 15:
                   hrStaffInfo.setStaffHealth(cell.getStringCellValue());
                   break;
                 case 16:
                   UserPriv userPrivByName = this.userPrivMapper.getUserPrivByName(cell.getStringCellValue());
                   if (userPrivByName == null) continue;
                   hrStaffInfo.setUserPriv(userPrivByName.getUserPriv().toString());
                 }
               }
 
             }
 
             HrStaffInfo singleHrStaffInfo = this.hrStaffInfoMapper.getSingleHrStaffInfo(hrStaffInfo);
 
             if (singleHrStaffInfo != null) {
               singleHrStaffInfo.setStaffId(singleHrStaffInfo.getStaffId());
               int i1 = this.hrStaffInfoMapper.updateByPrimaryKeySelective(singleHrStaffInfo);
               if (i1 > 0) {
 //               parentList = successCount;
   //                       deptIdByDeptName = successCount = Integer.valueOf(successCount.intValue() + 1);
                           successCount = Integer.valueOf(successCount.intValue() + 1);
               }
             } else {
               ToJson usersToJson = savePersonFile(hrStaffInfo, request);
               if (usersToJson.isFlag()) {
         //        parentList = successCount; deptIdByDeptName = 
		                     successCount = Integer.valueOf(successCount.intValue() + 1);
               }
             }
           }
         }
 
       }
       else
       {
         json.setMsg("file type error!");
         json.setFlag(1);
         return json;
       }
 
       json.setTotleNum(successCount);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 }

