package com.myoa.dao.department;

import com.myoa.model.department.Department;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface DepartmentMapper {
	public abstract List<Department> getDatagrid();

	public abstract String getDeptNameById(int paramInt);

	public abstract Department getDeptById(int paramInt);

	public abstract void deleteDept(int paramInt);

	public abstract void insertDept(Department paramDepartment);

	public abstract void editDept(Department paramDepartment);

	public abstract List<Department> getDeptByMany(Department paramDepartment);

	public abstract List<Department> getChDept(int paramInt);

	public abstract Department getFatherDept(int paramInt);

	public abstract List<Department> getChDeptUser(int paramInt);

	public abstract int getCountChDeptUser(String paramString);

	public abstract String getDeptNameByDeptId(Integer paramInteger);

	public abstract List<String> getDeptIdByDeptName(String paramString);

	public abstract List<Department> getDepartmentByUid(Integer paramInteger);

	public abstract List<Department> getDepartmentByParet();

	public abstract Department getFirstDept(String paramString);

	public abstract int batchUpdateDeptById(Department paramDepartment);

	public abstract int updateDeptNoByDeptId(Department paramDepartment);

	public abstract List<Integer> getDeptIdByParent(int paramInt);

	public abstract List<Department> getAllDepartment();

	public abstract String getFatherDeptName(Integer paramInteger);

	public abstract List<Department> checkDep(String paramString);

	public abstract List<String> getDeptNames(Map<String, Object> paramMap);

	public abstract int setClassifyOrgByDeptId(Department paramDepartment);

	public abstract List<Department> getAllClassifyOrg();

	public abstract List<Department> getClassifyOrgByAdmin(
			Department paramDepartment);

	public abstract int selClaNumByParentId(int paramInt);

	public abstract List<Department> getBydeptNo(String paramString);

	public abstract List<Department> getDepByNo(String paramString);

	public abstract String departmentOneSelect(Integer paramInteger);

	public abstract List<String> selDeptNoByDeptParent(
			Map<String, Object> paramMap);

	public abstract List<Department> selByLikeDeptName(String paramString);

	public abstract String getDeptManagerIdByDeptId(Integer paramInteger);

	public abstract List<Department> getDeptByName(
			@Param("deptName") String paramString);

	public abstract Integer getParentDingdingId(Integer paramInteger);

	public abstract Integer getDingdingIdByDeptId(Integer paramInteger);

	public abstract List<Department> selDeptByIds(
			@Param("ids") String[] paramArrayOfString);

	public abstract List<Department> selByNameAndParent(
			Map<String, Object> paramMap);
}