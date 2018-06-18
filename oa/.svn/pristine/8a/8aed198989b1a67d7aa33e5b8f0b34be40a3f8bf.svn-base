package com.myoa.service.edu.eduElectiveStudentCount;

import com.baomidou.mybatisplus.service.IService;
import com.myoa.model.edu.eduElectiveStudentCount.EduElectiveStudentCount;
import com.myoa.util.ToJson;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public abstract interface IEduElectiveStudentCountService extends IService<EduElectiveStudentCount>
{
  public abstract ToJson<EduElectiveStudentCount> eudSelectStudentCount(EduElectiveStudentCount paramEduElectiveStudentCount);

  public abstract ToJson eudSelectClassStudentCount(Map<String, Object> paramMap);

  public abstract ToJson eduElecctiveStudentCountSum(Map<String, Object> paramMap);

  public abstract ToJson eduElecctiveStudentCountUpdate(Integer paramInteger);

  public abstract ToJson eduElecctiveStudentCountUpdateAccumulation(Integer paramInteger);

  public abstract ToJson eduElecctiveStudentCountInsert(EduElectiveStudentCount paramEduElectiveStudentCount);

  public abstract ToJson eduElectiveOneSelect(String paramString);

  public abstract ToJson eduClassStudent(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson eduMaxElective(Map<String, Object> paramMap);

  public abstract ToJson<Map<String, Object>> studentClassIdName(Integer paramInteger);

  public abstract ToJson eduClassIdXuanKeId(Map<String, Object> paramMap);
}

