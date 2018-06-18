package com.myoa.service.edu.eduStudentExt;

import com.baomidou.mybatisplus.service.IService;
import com.myoa.model.edu.eduStudentExt.EduStudentExt;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;

public abstract interface IEduStudentExtService extends IService<EduStudentExt>
{
  public abstract ToJson<EduStudentExt> getSemeter(HttpServletRequest paramHttpServletRequest, EduStudentExt paramEduStudentExt);
}

