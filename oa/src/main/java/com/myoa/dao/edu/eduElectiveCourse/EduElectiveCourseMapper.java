package com.myoa.dao.edu.eduElectiveCourse;

import com.myoa.model.edu.eduElectiveCourse.eduElectiveCourse;
import com.myoa.model.edu.eduElectiveCourse.eduElectiveCourseExample;
import com.myoa.model.edu.eduElectiveCourse.eduElectiveCourseWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface EduElectiveCourseMapper {
	public abstract int countByExample(
			eduElectiveCourseExample parameduElectiveCourseExample);

	public abstract int deleteByExample(
			eduElectiveCourseExample parameduElectiveCourseExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(
			eduElectiveCourseWithBLOBs parameduElectiveCourseWithBLOBs);

	public abstract int insertSelective(
			eduElectiveCourseWithBLOBs parameduElectiveCourseWithBLOBs);

	public abstract List<eduElectiveCourseWithBLOBs> selectEduElectiveCourse(
			eduElectiveCourseWithBLOBs parameduElectiveCourseWithBLOBs);

	public abstract int updateByPrimaryKeySelective(
			eduElectiveCourseWithBLOBs parameduElectiveCourseWithBLOBs);

	public abstract int deleteElectveCourse(String paramString);

	public abstract List<eduElectiveCourseWithBLOBs> selectByExampleWithBLOBs(
			eduElectiveCourseExample parameduElectiveCourseExample);

	public abstract List<eduElectiveCourse> selectByExample(
			eduElectiveCourseExample parameduElectiveCourseExample);

	public abstract eduElectiveCourseWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") eduElectiveCourseWithBLOBs parameduElectiveCourseWithBLOBs,
			@Param("example") eduElectiveCourseExample parameduElectiveCourseExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") eduElectiveCourseWithBLOBs parameduElectiveCourseWithBLOBs,
			@Param("example") eduElectiveCourseExample parameduElectiveCourseExample);

	public abstract int updateByExample(
			@Param("record") eduElectiveCourse parameduElectiveCourse,
			@Param("example") eduElectiveCourseExample parameduElectiveCourseExample);

	public abstract int updateByPrimaryKeyWithBLOBs(
			eduElectiveCourseWithBLOBs parameduElectiveCourseWithBLOBs);

	public abstract int updateByPrimaryKey(
			eduElectiveCourse parameduElectiveCourse);

	public abstract eduElectiveCourseWithBLOBs selectElectiveCurseOne(
			String paramString);
}
