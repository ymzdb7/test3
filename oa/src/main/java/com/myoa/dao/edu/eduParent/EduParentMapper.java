package com.myoa.dao.edu.eduParent;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myoa.model.edu.eduParent.EduParent;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface EduParentMapper extends BaseMapper<EduParent> {
	public abstract int addParent(EduParent paramEduParent);

	public abstract int updateParent(EduParent paramEduParent);

	public abstract EduParent getPersonInforByUid(String paramString);

	public abstract List<EduParent> checkPassWord(String paramString);

	public abstract EduParent findUserByName(@Param("byname") String paramString);
}
