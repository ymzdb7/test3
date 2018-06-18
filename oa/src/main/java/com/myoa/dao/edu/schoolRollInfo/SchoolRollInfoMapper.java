package com.myoa.dao.edu.schoolRollInfo;

import com.myoa.model.edu.schoolRollInfo.SchoolRollInfo;
import com.myoa.model.edu.schoolRollInfo.SchoolRollInfoExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface SchoolRollInfoMapper {
	public abstract int countByExample(
			SchoolRollInfoExample paramSchoolRollInfoExample);

	public abstract int deleteByExample(
			SchoolRollInfoExample paramSchoolRollInfoExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SchoolRollInfo paramSchoolRollInfo);

	public abstract int insertSelective(SchoolRollInfo paramSchoolRollInfo);

	public abstract List<SchoolRollInfo> selectByExample(
			SchoolRollInfoExample paramSchoolRollInfoExample);

	public abstract SchoolRollInfo selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SchoolRollInfo paramSchoolRollInfo,
			@Param("example") SchoolRollInfoExample paramSchoolRollInfoExample);

	public abstract int updateByExample(
			@Param("record") SchoolRollInfo paramSchoolRollInfo,
			@Param("example") SchoolRollInfoExample paramSchoolRollInfoExample);

	public abstract int updateByPrimaryKeySelective(
			SchoolRollInfo paramSchoolRollInfo);

	public abstract int updateByPrimaryKey(SchoolRollInfo paramSchoolRollInfo);

	public abstract List<SchoolRollInfo> selSchoolRollInfo(
			Map<String, Object> paramMap);

	public abstract List<SchoolRollInfo> selObjBySchoolCode(
			Map<String, Object> paramMap);
}
