package com.myoa.dao.edu.eduTeacher;

import com.myoa.model.edu.eduTeacher.TeacherInfo;
import com.myoa.model.edu.eduTeacher.TeacherInfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TeacherInfoMapper {
	public abstract int countByExample(
			TeacherInfoExample paramTeacherInfoExample);

	public abstract int deleteByExample(
			TeacherInfoExample paramTeacherInfoExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(TeacherInfo paramTeacherInfo);

	public abstract int insertSelective(TeacherInfo paramTeacherInfo);

	public abstract List<TeacherInfo> selectByExample(
			TeacherInfoExample paramTeacherInfoExample);

	public abstract TeacherInfo selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") TeacherInfo paramTeacherInfo,
			@Param("example") TeacherInfoExample paramTeacherInfoExample);

	public abstract int updateByExample(
			@Param("record") TeacherInfo paramTeacherInfo,
			@Param("example") TeacherInfoExample paramTeacherInfoExample);

	public abstract int updateByPrimaryKeySelective(TeacherInfo paramTeacherInfo);

	public abstract int updateByPrimaryKey(TeacherInfo paramTeacherInfo);
}
