package com.myoa.dao.edu.eduCourse;

import com.myoa.model.edu.eduCourse.EduCourse;
import com.myoa.model.edu.eduCourse.EduCourseExample;
import com.myoa.model.edu.eduCourse.EduCourseWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface EduCourseMapper {
	public abstract int countByExample(EduCourseExample paramEduCourseExample);

	public abstract int deleteByExample(EduCourseExample paramEduCourseExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(EduCourseWithBLOBs paramEduCourseWithBLOBs);

	public abstract int insertSelective(
			EduCourseWithBLOBs paramEduCourseWithBLOBs);

	public abstract List<EduCourseWithBLOBs> selectByExampleWithBLOBs(
			EduCourseExample paramEduCourseExample);

	public abstract List<EduCourseWithBLOBs> selectByExample(
			EduCourse paramEduCourse);

	public abstract EduCourseWithBLOBs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") EduCourseWithBLOBs paramEduCourseWithBLOBs,
			@Param("example") EduCourseExample paramEduCourseExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") EduCourseWithBLOBs paramEduCourseWithBLOBs,
			@Param("example") EduCourseExample paramEduCourseExample);

	public abstract int updateByExample(
			@Param("record") EduCourse paramEduCourse,
			@Param("example") EduCourseExample paramEduCourseExample);

	public abstract int updateByPrimaryKeySelective(
			EduCourseWithBLOBs paramEduCourseWithBLOBs);

	public abstract void updateByPrimaryKeyWithBLOBs(
			EduCourseWithBLOBs paramEduCourseWithBLOBs);

	public abstract void updateByPrimaryKey(EduCourse paramEduCourse);

	public abstract List<EduCourseWithBLOBs> getAllSubject();

	public abstract EduCourseWithBLOBs getCourseBycourseId(String paramString);

	public abstract void updatekey(EduCourse paramEduCourse);

	public abstract List<EduCourse> getCourseByStage(
			@Param("stage") String paramString);
}
