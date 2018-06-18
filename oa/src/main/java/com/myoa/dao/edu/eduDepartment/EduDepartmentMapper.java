package com.myoa.dao.edu.eduDepartment;

import com.myoa.model.edu.eduDepartment.EduDepartment;
import com.myoa.model.edu.eduDepartment.EduDepartmentWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface EduDepartmentMapper {
	public abstract EduDepartmentWithBLOBs queryGetObjectByDeptId(
			@Param("deptId") String paramString);

	public abstract List<EduDepartmentWithBLOBs> queryListByDeptId(
			@Param("deptParent") String paramString);

	public abstract List<EduDepartmentWithBLOBs> queryListBydeptNO(
			@Param("deptNO") String paramString);

	public abstract int insertSelective(
			EduDepartmentWithBLOBs paramEduDepartmentWithBLOBs);

	public abstract List<EduDepartmentWithBLOBs> queryListEduDepartmentWithBLOBs();

	public abstract int updateEduDepartmentWithBLOBs(
			EduDepartmentWithBLOBs paramEduDepartmentWithBLOBs);

	public abstract int deleteEduDepartmentWithBLOBs(
			@Param("deptId") String paramString);

	public abstract List<EduDepartmentWithBLOBs> queryObjectsBydeptParent(
			String paramString);

	public abstract List<EduDepartmentWithBLOBs> getChDeptEduUser(int paramInt);

	public abstract List<EduDepartmentWithBLOBs> queryUserParent(int paramInt);

	public abstract EduDepartment getClazzByName(
			@Param("className") String paramString);

	public abstract EduDepartment getClazzByNameParent(
			@Param("className") String paramString,
			@Param("deptParent") Integer paramInteger);

	public abstract List<EduDepartmentWithBLOBs> getChDept(String paramString);

	public abstract List<EduDepartmentWithBLOBs> getDeptByDeptNo(
			String paramString);

	public abstract EduDepartmentWithBLOBs selectByDepId(Integer paramInteger);

	public abstract List<Integer> getdeptIdByDeptName(
			@Param("deptName") String paramString);

	public abstract List<EduDepartmentWithBLOBs> getAllGrade();

	public abstract List<EduDepartmentWithBLOBs> getAllClazz(
			Integer paramInteger);

	public abstract List<EduDepartmentWithBLOBs> getClazz();

	public abstract EduDepartmentWithBLOBs selectByDeptParentDeptName(
			@Param("deptParent") Integer paramInteger,
			@Param("deptName") String paramString);
}