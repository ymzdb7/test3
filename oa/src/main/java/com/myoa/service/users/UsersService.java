package com.myoa.service.users;

import com.myoa.model.modulePriv.ModulePriv;
import com.myoa.model.users.UserExt;
import com.myoa.model.users.Users;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.MultipartFile;

public abstract interface UsersService
{
  public abstract ToJson<Users> addUser(Users paramUsers, UserExt paramUserExt, ModulePriv paramModulePriv, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Users> editUser(Users paramUsers, UserExt paramUserExt, ModulePriv paramModulePriv);

  public abstract ToJson<Users> edit(Integer paramInteger, String paramString1, String paramString2, Date paramDate, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7);

  public abstract void deleteUser(String paramString);

  public abstract List<Users> getAlluser(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract List<Users> getUserByMany(Users paramUsers);

  public abstract List<Users> getUserAndDept(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract Users findUserByuid(int paramInt);

  public abstract Users findUserByName(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract Users selectUserAllInfoByName(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract List<Users> getBySearch(Map<String, Object> paramMap);

  public abstract List<Users> getByDeptId(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract Users getByUid(int paramInt);

  public abstract List<Users> getAllByUid(String paramString);

  public abstract String getUserNameById(String paramString);

  public abstract String getUserNameById(String paramString1, String paramString2);

  public abstract String findUsersByuid(int[] paramArrayOfInt);

  public abstract String findUsersByuid(String paramString);

  public abstract String findUsersByuidReturn(String paramString);

  public abstract Users findUsersByuserId(String paramString);

  public abstract List<Users> getUsersByCondition(Users paramUsers);

  public abstract List<Users> getUsersOnline();

  public abstract List<Users> getUserbyCondition(Map<String, Object> paramMap);

  public abstract Boolean checkPassWord(String paramString1, String paramString2);

  public abstract String getEncryptString(String paramString);

  public abstract List<Users> getUsersByDeptId(Integer paramInteger);

  public abstract List<Users> getUserByDeptIds(String paramString, Integer paramInteger);

  public abstract List<Users> getUserByuserId(String paramString);

  public abstract List<Users> getNullPwUsers(Integer paramInteger);

  public abstract List<Users> getCUsersByDeptId(Integer paramInteger);

  public abstract List<Users> getTUsersByDeptId(Integer paramInteger);

  public abstract List<Users> getPUsersByDeptId(Integer paramInteger);

  public abstract void clearPassword(String paramString);

  public abstract void clearOnLine(String paramString);

  public abstract void setNotLogin(String paramString);

  public abstract void editUsersDetId(Integer paramInteger, String paramString);

  public abstract List<Users> getUsersByUids(String paramString);

  public abstract List<Users> getUserByuId(String paramString);

  public abstract String getUserPrivByuId(Integer paramInteger);

  public abstract List<Users> deptHaveUser(String paramString);

  public abstract void addU(Users paramUsers);

  public abstract List<Users> selectList(Users paramUsers);

  public abstract ToJson<Users> queryUserByUserId(String paramString);

  public abstract int queryCountByUserId(String paramString);

  public abstract int getUserCount();

  public abstract String editPwd(HttpServletRequest paramHttpServletRequest, Users paramUsers, String paramString);

  public abstract Users getLoginUser(HttpServletRequest paramHttpServletRequest);

  public abstract boolean isUserToMany(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Users> getNewUsers();

  public abstract int getCanLoginUser();

  public abstract Users getUserByUid(int paramInt);

  public abstract void updateUserTheme(Users paramUsers, HttpServletRequest paramHttpServletRequest);

  public abstract Users getLoginUserTheme(HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<Users> queryExportUsers(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, Users paramUsers, String paramString1, String paramString2, String paramString3);

  public abstract ToJson<Users> insertImportUsers(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, HttpSession paramHttpSession, MultipartFile paramMultipartFile, String paramString1, String paramString2, String paramString3);

  public abstract AjaxJson insertImportUsersByEdu(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, HttpSession paramHttpSession, MultipartFile paramMultipartFile, String paramString1, String paramString2, String paramString3, String paramString4);

  public abstract ToJson<Users> editUserBatch(Users paramUsers, UserExt paramUserExt, String paramString1, String paramString2, String paramString3, String paramString4, HttpServletRequest paramHttpServletRequest);

  public abstract Users getUsersByuserId(String paramString);

  public abstract List<Users> selectFileUserSignerAll();

  public abstract List<Users> selectFileUserSigner(Map<String, Object> paramMap);

  public abstract ToJson<Users> singleSearch(String paramString);

  public abstract Users getUserByUserName(String paramString);

  public abstract void deleteUserByDeptId(String paramString);

  public abstract ToJson<Object> userAnalysis(String paramString);

  public abstract ToJson<Users> editUserExt(HttpServletRequest paramHttpServletRequest, MultipartFile paramMultipartFile, Users paramUsers, UserExt paramUserExt)
    throws IllegalStateException, IOException;

  public abstract ToJson editUserSign(HttpServletRequest paramHttpServletRequest, String paramString);

  public abstract void insetErrLog(String paramString);

  public abstract List<Users> getUserPrivOther(String paramString);

  public abstract List<Users> reAllPrivUser(String paramString1, String paramString2, String paramString3);

  public abstract String reAllName(List<Users> paramList);

  public abstract void updateLoginTime(Users paramUsers);

  public abstract List<Users> LoginUserList();

  public abstract BaseWrapper uploadImg(HttpServletRequest paramHttpServletRequest, MultipartFile paramMultipartFile);

  public abstract ToJson<Users> editUserExtNew(HttpServletRequest paramHttpServletRequest, Users paramUsers, UserExt paramUserExt);

  public abstract ToJson<Users> getByName(String paramString);

  public abstract ToJson<Users> getuserNameByDeptId(Integer paramInteger);

  public abstract ToJson<Integer> selectuidByName(String paramString);

  public abstract ToJson<Users> getUserDepartmentUserexe(String paramString1, String paramString2, String paramString3);

  public abstract BaseWrapper checkUserCount(HttpServletRequest paramHttpServletRequest);
}

