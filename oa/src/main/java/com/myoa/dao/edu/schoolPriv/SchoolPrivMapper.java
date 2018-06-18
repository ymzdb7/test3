package com.myoa.dao.edu.schoolPriv;

import com.myoa.model.edu.schoolPriv.SchoolPriv;
import com.myoa.model.edu.schoolPriv.SchoolPrivExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SchoolPrivMapper {
	public abstract int countByExample(SchoolPrivExample paramSchoolPrivExample);

	public abstract int deleteByExample(SchoolPrivExample paramSchoolPrivExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SchoolPriv paramSchoolPriv);

	public abstract int insertSelective(SchoolPriv paramSchoolPriv);

	public abstract List<SchoolPriv> selectByExample(
			SchoolPrivExample paramSchoolPrivExample);

	public abstract SchoolPriv selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SchoolPriv paramSchoolPriv,
			@Param("example") SchoolPrivExample paramSchoolPrivExample);

	public abstract int updateByExample(
			@Param("record") SchoolPriv paramSchoolPriv,
			@Param("example") SchoolPrivExample paramSchoolPrivExample);

	public abstract int updateByPrimaryKeySelective(SchoolPriv paramSchoolPriv);

	public abstract int updateByPrimaryKey(SchoolPriv paramSchoolPriv);

	public abstract List<SchoolPriv> selectList(SchoolPriv paramSchoolPriv);
}
