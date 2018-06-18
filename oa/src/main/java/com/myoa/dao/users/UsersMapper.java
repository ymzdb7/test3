package com.myoa.dao.users;

import com.myoa.model.users.Users;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface UsersMapper {
	public abstract Users findUserByName(@Param("byname") String paramString);

	public abstract Users selectUserAllInfoByName(
			@Param("byname") String paramString);

	public abstract String getUsernameById(int paramInt);

	public abstract Integer addUser(Users paramUsers);

	public abstract Integer insert(Users paramUsers);

	public abstract Integer insertByEdu(Users paramUsers);

	public abstract int editUser(Users paramUsers);

	public abstract void deleteUser(String[] paramArrayOfString);

	public abstract List<Users> getdepId(Map<String, Object> paramMap);

	public abstract List<Users> getRoleId(int paramInt);

	public abstract List<Users> getAlluser(Map<String, Object> paramMap);

	public abstract Users findUserByuid(int paramInt);

	public abstract Users findUsersByuserId(String paramString);

	public abstract List<Users> getUserByMany(Users paramUsers);

	public abstract List<Users> getUserAndDept(Map<String, Object> paramMap);

	public abstract List<Users> getBySearch(Map<String, Object> paramMap);

	public abstract List<Users> getByDeptId(Map<String, Object> paramMap);

	public abstract Users getByUid(int paramInt);

	public abstract String getUsernameByUserId(String paramString);

	public abstract List<Users> getAllInfo();

	public abstract String getUsernameById(String paramString);

	public abstract List<Users> getUserByDeptId(Users paramUsers);

	public abstract List<Users> getUserByRoleId(Users paramUsers);

	public abstract List<Users> getUserOnline();

	public abstract List<Users> getUserbyCondition(Map<String, Object> paramMap);

	public abstract List<Users> getUserNameByFuncId(String paramString);

	public abstract List<String> getUserByFuncId(String paramString);

	public abstract List<String> findUsersByIds(Map<String, List> paramMap);

	public abstract List<Users> checkPassWord(String paramString);

	public abstract List<Users> getUsersByDeptId(Integer paramInteger);

	public abstract List<Users> getNullPwUsers(Integer paramInteger);

	public abstract List<Users> getNewUsers();

	public abstract List<Users> getPUsersByDeptId(Integer paramInteger);

	public abstract List<Users> getCUsersByDeptId(Integer paramInteger);

	public abstract List<Users> getTUsersByDeptId(Integer paramInteger);

	public abstract void clearPassword(String[] paramArrayOfString);

	public abstract void clearOnLine(String[] paramArrayOfString);

	public abstract void setNotLogin(String[] paramArrayOfString);

	public abstract void editUsersDetId(@Param("deptId") Integer paramInteger,
			@Param("uids") String[] paramArrayOfString);

	public abstract List<Users> getUsersByUids(
			@Param("uids") String[] paramArrayOfString);

	public abstract String getUserPrivByuId(Integer paramInteger);

	public abstract List<Users> deptHaveUser(String paramString);

	public abstract void addU(Users paramUsers);

	public abstract List<Users> selectList(Users paramUsers);

	public abstract List<Users> queryUserByUserId(String paramString);

	public abstract int queryCountByUserId(String paramString);

	public abstract List<Users> queryUserByUserName(String paramString);

	public abstract int queryCountByUserName(String paramString);

	public abstract int getUserCount();

	public abstract int updatePwd(Map<String, String> paramMap);

	public abstract Integer getLoginUserCount();

	public abstract Users getUserByUid(@Param("uid") int paramInt);

	public abstract List<Users> queryExportUsers(Map<String, Object> paramMap);

	public abstract void updateUserTheme(Users paramUsers);

	public abstract void editUserBatch(@Param("uids") List<String> paramList,
			@Param("user") Users paramUsers);

	public abstract List<Users> getUsersByDeptIds(
			@Param("deptIds") String[] paramArrayOfString);

	public abstract List<Users> getUsersByPrivIds(
			@Param("privIds") String[] paramArrayOfString);

	public abstract List<Users> getUsersByDeptAndPriv(
			@Param("deptIds") String[] paramArrayOfString1,
			@Param("privIds") String[] paramArrayOfString2);

	public abstract Users getUsersByuserId(String paramString);

	public abstract List<Users> unreadConsultTheSituationNotify(
			Map<String, Object> paramMap);

	public abstract List<Users> readConsultTheSituationNotify(
			Map<String, Object> paramMap);

	public abstract List<Users> unreadConsultTheSituationNew(
			Map<String, Object> paramMap);

	public abstract List<Users> readConsultTheSituationNew(
			Map<String, Object> paramMap);

	public abstract List<Users> selectFileUserSignerAll();

	public abstract List<Users> selectFileUserSigner(
			Map<String, Object> paramMap);

	public abstract Users getUsersBybyname(String paramString);

	public abstract Users getUsersByname(String paramString);

	public abstract List<Users> singleSearch(
			@Param("searchData") String paramString);

	public abstract void updateUsersByuserName(Users paramUsers);

	public abstract int judgeHashUser(String paramString);

	public abstract List<Users> getUsersByUserIds(
			@Param("userIds") String[] paramArrayOfString);

	public abstract List<Users> getUsersByBynames(
			@Param("bynames") String[] paramArrayOfString);

	public abstract Users getUserByUserName(String paramString);

	public abstract void deleteUserByDeptId(String paramString);

	public abstract List<String> getUserNames(Map<String, Object> paramMap);

	public abstract List<Users> getUsersByMaps(Map<String, Object> paramMap);

	public abstract String getMaxUserId();

	public abstract List<Users> getUserPrivOther(String paramString);

	public abstract Users getUserByName(String paramString);

	public abstract Users selectUserByUId(Integer paramInteger);

	public abstract void updateUserByName(Users paramUsers);

	public abstract Users getUserByIdNumber(String paramString);

	public abstract Users importUserByName(String paramString);

	public abstract List<Users> getUserByUids(
			@Param("uids") String[] paramArrayOfString1,
			@Param("userIds") String[] paramArrayOfString2);

	public abstract void updateLoginTime(Users paramUsers);

	public abstract List<Users> getUserByUserIds(
			@Param("userIds") String[] paramArrayOfString);

	public abstract List<Users> LoginUserList();

	public abstract List<Users> selUserOrder(String[] paramArrayOfString);

	public abstract List<Users> getByName(String paramString);

	public abstract List<Users> getuserNameByDeptId(Integer paramInteger);

	public abstract List<Integer> selectuidByName(String paramString);

	public abstract List<Users> getUserDepartmentUserexe(
			Map<String, Object> paramMap);

	public abstract Users getUsersByUid(Integer paramInteger);
}
