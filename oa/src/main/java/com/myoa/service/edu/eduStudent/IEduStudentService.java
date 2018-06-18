package com.myoa.service.edu.eduStudent;

import com.myoa.model.edu.eduParent.EduParent;
import com.myoa.model.edu.eduStudent.EduStudent;
import com.myoa.model.edu.eduStudentExt.EduStudentExt;
import com.myoa.util.ToJson;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.MultipartFile;

public abstract interface IEduStudentService
{
  public abstract ToJson<EduStudent> getGrade(HttpServletRequest paramHttpServletRequest, EduStudent paramEduStudent);

  public abstract ToJson<EduStudent> getClassByDeptId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<EduStudent> getUserByDeptId(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<EduStudent> getStudentInforByUid(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<EduStudent> deleteStudentByUid(HttpServletRequest paramHttpServletRequest, String[] paramArrayOfString);

  public abstract ToJson<EduStudent> getStudentList1(HttpServletRequest paramHttpServletRequest, Integer paramInteger);

  public abstract ToJson<EduStudent> addStudent(HttpServletRequest paramHttpServletRequest, EduStudent paramEduStudent, EduStudentExt paramEduStudentExt);

  public abstract ToJson<EduStudent> updateStudent(HttpServletRequest paramHttpServletRequest, EduStudent paramEduStudent, EduParent paramEduParent, EduStudentExt paramEduStudentExt);

  public abstract ToJson<Object> StudentAcademicYear(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Map> studentSelect(String paramString);

  public abstract ToJson<EduStudent> getStudentList(HttpServletRequest paramHttpServletRequest, EduStudent paramEduStudent);

  public abstract ToJson<EduStudent> clearPasswordByUid(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract ToJson importStudentInfor(MultipartFile paramMultipartFile, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, HttpSession paramHttpSession);

  public abstract EduStudent findUserByName(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<EduStudent> getStudentExport(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, EduStudent paramEduStudent, EduStudentExt paramEduStudentExt, String paramString1, String paramString2, Integer paramInteger, String paramString3, String paramString4, String paramString5, String paramString6);
}

