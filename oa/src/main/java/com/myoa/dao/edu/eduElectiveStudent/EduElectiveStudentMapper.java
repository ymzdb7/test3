package com.myoa.dao.edu.eduElectiveStudent;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myoa.model.edu.eduElectiveStudent.EduElectiveStudent;

import java.util.List;
import java.util.Map;

public abstract interface EduElectiveStudentMapper extends
		BaseMapper<EduElectiveStudent> {
	public abstract List<Map<String, Object>> eduElectiveStudentSelect(
			String paramString);

	public abstract List<Map<String, Object>> eduElectiveStudentClass(
			String paramString);

	public abstract int eduElectiveStudentDelete(Integer paramInteger);

	public abstract int eduElectiveStudentInsert(
			EduElectiveStudent paramEduElectiveStudent);
}
