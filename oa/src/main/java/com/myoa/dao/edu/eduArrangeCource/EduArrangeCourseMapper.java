package com.myoa.dao.edu.eduArrangeCource;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myoa.model.edu.eduArrangeCource.EduArrangeCourse;
import com.myoa.model.edu.eduArrangeCource.EduArrbean;

import java.util.List;
import java.util.Map;

public abstract interface EduArrangeCourseMapper extends
		BaseMapper<EduArrangeCourse> {
	public abstract List<EduArrbean> eduArrangeCourseClassSelect(
			Map<String, Object> paramMap);

	public abstract Map<String, String> eduArrangeCourseTeacherSelect(
			Map<String, Object> paramMap);

	public abstract List<EduArrbean> eduArrangeCourseTotalClass(
			Map<String, Object> paramMap);

	public abstract List<EduArrangeCourse> eduArrangeCourseTotalTeacher(
			Map<String, Object> paramMap);

	public abstract int eduArrangeCourseInsert(
			EduArrangeCourse paramEduArrangeCourse);
}
