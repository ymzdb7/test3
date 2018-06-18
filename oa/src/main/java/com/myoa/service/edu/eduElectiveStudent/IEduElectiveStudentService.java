package com.myoa.service.edu.eduElectiveStudent;

import com.baomidou.mybatisplus.service.IService;
import com.myoa.model.edu.eduElectiveStudent.EduElectiveStudent;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface IEduElectiveStudentService extends IService<EduElectiveStudent>
{
  public abstract ToJson eduElectiveStudentSelect(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson eduElectiveStudentClass(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson eduElectiveStudentDelete(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson eduElectiveStudentInsert(EduElectiveStudent[] paramArrayOfEduElectiveStudent);
}

