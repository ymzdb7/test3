package com.myoa.service.edu.eduTeacher;

import com.myoa.model.edu.eduCourse.EduCourse;
import com.myoa.model.edu.eduTeacher.EduTeacher;
import com.myoa.model.edu.eduTeacher.EduTeacherWithBLOBs;
import com.myoa.util.ToJson;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.MultipartFile;

public abstract interface EduTeacherService
{
  public abstract ToJson<EduTeacher> save(EduTeacherWithBLOBs paramEduTeacherWithBLOBs);

  public abstract ToJson<EduTeacher> getTeacherInfo(EduTeacherWithBLOBs paramEduTeacherWithBLOBs);

  public abstract ToJson<EduTeacher> deleteTeacher(String paramString);

  public abstract ToJson<EduTeacher> importTeacher(MultipartFile paramMultipartFile, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, HttpSession paramHttpSession);

  public abstract ToJson<EduTeacher> queryAndExport(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, boolean paramBoolean, Integer paramInteger1, Integer paramInteger2, String paramString8);

  public abstract ToJson<EduTeacher> getEduTeacherById(Integer paramInteger);

  public abstract ToJson<EduCourse> getCourseByGrade(String paramString);

  public abstract ToJson<EduTeacher> update(EduTeacherWithBLOBs paramEduTeacherWithBLOBs);

  public abstract ToJson<Map<String, Object>> UsersTeacherIdselect(EduTeacher paramEduTeacher);

  public abstract ToJson<String> getKeMu();

  public abstract List<EduTeacher> getTeacherBygc(String paramString1, String paramString2);
}

