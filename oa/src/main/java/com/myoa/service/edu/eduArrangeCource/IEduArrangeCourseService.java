package com.myoa.service.edu.eduArrangeCource;

import com.baomidou.mybatisplus.service.IService;
import com.myoa.model.edu.eduArrangeCource.EduArrangeCourse;
import com.myoa.model.edu.eduArrangeCource.EduArrbean;
import com.myoa.util.ToJson;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.MultipartFile;

public abstract interface IEduArrangeCourseService extends IService<EduArrangeCourse>
{
  public abstract ToJson<EduArrbean> eduArrangeCourseClassSelect(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<EduArrbean> eduArrangeCourseTeacherSelect(HttpServletRequest paramHttpServletRequest, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<EduArrbean> eduArrangeCourseTotalClass(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<EduArrangeCourse> eduArrangeCourseTotalTeacher(HttpServletRequest paramHttpServletRequest, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<EduArrangeCourse> importArrangeCourse(MultipartFile paramMultipartFile, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, HttpSession paramHttpSession);
}

