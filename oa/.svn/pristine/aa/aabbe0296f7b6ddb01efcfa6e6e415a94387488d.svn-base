package com.myoa.service.hr;

import com.myoa.model.hr.HrStaffInfo;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

import java.io.IOException;
import java.text.ParseException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public abstract interface HrSStaffInfoService
{
  public abstract BaseWrappers selectRetireeInfo(String paramString1, String paramString2);

  public abstract ToJson<HrStaffInfo> selectPersonFileByDeptId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract HrStaffInfo selectPersonFileByUserId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<HrStaffInfo> selectPersonByUserId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<HrStaffInfo> updatePersonFile(HrStaffInfo paramHrStaffInfo, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<HrStaffInfo> selectOnLinePerson(HrStaffInfo paramHrStaffInfo, HttpServletResponse paramHttpServletResponse, HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson<HrStaffInfo> selectLeavePerson(HrStaffInfo paramHrStaffInfo, HttpServletResponse paramHttpServletResponse, HttpServletRequest paramHttpServletRequest, String paramString);

  @Transactional(rollbackFor={Exception.class})
  public abstract ToJson<Users> savePersonFile(HrStaffInfo paramHrStaffInfo, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Object> selectStaffInfoById(String paramString);

  public abstract ToJson<HrStaffInfo> deletePersonById(String paramString);

  public abstract ToJson<HrStaffInfo> queryCountNoDocument(String paramString);

  public abstract ToJson<HrStaffInfo> getUserByDeptId(Integer paramInteger);

  public abstract ToJson<HrStaffInfo> uploadImage(HttpServletRequest paramHttpServletRequest, MultipartFile paramMultipartFile, HrStaffInfo paramHrStaffInfo)
    throws IllegalStateException, IOException;

  public abstract BaseWrapper getAllWorkYearsInfo(int paramInt);

  public abstract BaseWrapper getAllRecordInfo();

  public abstract ToJson<HrStaffInfo> importStaffInfo(MultipartFile paramMultipartFile, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, HttpSession paramHttpSession);

  public abstract ToJson<HrStaffInfo> selectOwnStaffInfo(HttpServletRequest paramHttpServletRequest, Users paramUsers);

  public abstract BaseWrappers getHrStaffInfoNews();

  public abstract BaseWrapper getHrStaffInfoCount(String paramString)
    throws ParseException;
}

