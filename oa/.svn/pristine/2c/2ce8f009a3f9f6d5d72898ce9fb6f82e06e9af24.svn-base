package com.myoa.dao.strstatus;

import com.myoa.model.strstatus.Strstatus;
import com.myoa.model.strstatus.StrstatusExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface StrstatusMapper {
	public abstract int countByExample(StrstatusExample paramStrstatusExample);

	public abstract int deleteByExample(StrstatusExample paramStrstatusExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(Strstatus paramStrstatus);

	public abstract int insertSelective(Strstatus paramStrstatus);

	public abstract List<Strstatus> selectByExample(
			StrstatusExample paramStrstatusExample);

	public abstract Strstatus selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") Strstatus paramStrstatus,
			@Param("example") StrstatusExample paramStrstatusExample);

	public abstract int updateByExample(
			@Param("record") Strstatus paramStrstatus,
			@Param("example") StrstatusExample paramStrstatusExample);

	public abstract int updateByPrimaryKeySelective(Strstatus paramStrstatus);

	public abstract int updateByPrimaryKey(Strstatus paramStrstatus);
}
