package com.myoa.service.department;

import com.myoa.model.department.Department;
import com.myoa.util.ToJson;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

public abstract interface DepartmentService
{
  public abstract List<String> getDeptNameById(int[] paramArrayOfInt);

  public abstract String getDpNameById(int[] paramArrayOfInt);

  public abstract List<Department> getDatagrid();

  public abstract Department getDeptById(int paramInt);

  public abstract void deleteDept(int paramInt);

  public abstract void insertDept(Department paramDepartment);

  public abstract void editDept(Department paramDepartment);

  public abstract List<Department> getDeptByMany(Department paramDepartment);

  public abstract List<Department> getChDept(int paramInt);

  public abstract List<Department> getFatherDept(int paramInt, List<Department> paramList);

  public abstract List<Department> getChDeptByNo(String paramString);

  public abstract List<Department> getChDeptUser(int paramInt);

  public abstract List<Department> getChDtUser(int paramInt);

  public abstract int getCountChDeptUser(String paramString);

  public abstract List<Department> listDept();

  public abstract List<Department> getFatherChildDept();

  public abstract String getDeptNameByDeptId(String paramString1, String paramString2);

  public abstract Department getFirstDept(String paramString);

  public abstract String longDepName(int paramInt);

  public abstract ToJson<Department> batchUpdateDeptById(String paramString);

  public abstract void updateDeptNo(Integer paramInteger, String paramString);

  public abstract ToJson<Department> outputDepartment(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse);

  public abstract List<Department> getAllDep(int paramInt1, int paramInt2, List<Department> paramList);

  public abstract boolean checkDep(Department paramDepartment, int paramInt);

  public abstract ToJson<Department> getAllDepartment();

  public abstract int judgeHashUser(String paramString);

  public abstract ToJson<Department> getAllDepartAndUsers(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse);

  public abstract ToJson<Department> setClassifyOrgByDeptId(String paramString1, String paramString2, int paramInt);

  public abstract ToJson<Department> getAllClassifyOrg();

  public abstract ToJson<Department> getClassifyOrgByAdmin(HttpServletRequest paramHttpServletRequest);

  public abstract List<Department> getDepartmentByParet();

  public abstract int selClaNumByParentId(int paramInt);

  public abstract List<Department> getDepByNo(String paramString);

  public abstract ToJson<Department> importDepartment(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, MultipartFile paramMultipartFile);

  public abstract ToJson<Department> selDeptNoByDeptParent(String paramString1, String paramString2, int paramInt, String paramString3);

  public abstract ToJson<Department> selByLikeDeptName(String paramString);
}
