package com.myoa.service.edu.eduUser;

import com.baomidou.mybatisplus.service.IService;
import com.myoa.model.edu.eduUser.EduUser;

import java.util.List;
import java.util.Map;

public abstract interface IEduUserService extends IService<EduUser>
{
  public abstract EduUser getByuserId(String paramString);

  public abstract List<EduUser> getBySearch(Map<String, Object> paramMap);

  public abstract EduUser getByUid(Integer paramInteger);

  public abstract String getUserNameByUids(String paramString);

  public abstract String getUserNameByUserIds(String paramString);
}

