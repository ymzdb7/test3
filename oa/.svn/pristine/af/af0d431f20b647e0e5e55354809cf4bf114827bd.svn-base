package com.myoa.dao.edu.eduUser;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myoa.model.edu.eduUser.EduUser;

import java.util.List;
import java.util.Map;

public abstract interface EduUserMapper extends BaseMapper<EduUser> {
	public abstract EduUser getByuserId(String paramString);

	public abstract int addUser(EduUser paramEduUser);

	public abstract int updateUser(EduUser paramEduUser);

	public abstract List<EduUser> getBySearch(Map<String, Object> paramMap);

	public abstract EduUser getByUid(Integer paramInteger);

	public abstract EduUser getByuserName(String paramString);
}