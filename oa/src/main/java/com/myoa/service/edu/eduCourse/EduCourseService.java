package com.myoa.service.edu.eduCourse;

import com.myoa.model.edu.eduCourse.EduCourse;
import com.myoa.model.edu.eduCourse.EduCourseWithBLOBs;
import com.myoa.util.ToJson;

public abstract interface EduCourseService
{
  public abstract ToJson<EduCourseWithBLOBs> selectEdu(EduCourse paramEduCourse);

  public abstract ToJson insertEdu(EduCourseWithBLOBs paramEduCourseWithBLOBs);

  public abstract ToJson deleteByPrimaryKey(Integer paramInteger);

  public abstract ToJson selectByPrimaryKey(Integer paramInteger);

  public abstract ToJson updateByPrimaryKeySelective(EduCourseWithBLOBs paramEduCourseWithBLOBs);

  public abstract ToJson updateKey(EduCourse paramEduCourse);
}

