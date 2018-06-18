package com.myoa.dao.users;

import com.myoa.model.users.RoleManager;
import com.myoa.model.users.UserPriv;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface UserPrivMapper {
	public abstract void deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(UserPriv paramUserPriv);

	public abstract int insertSelective(UserPriv paramUserPriv);

	public abstract UserPriv selectByPrimaryKey(int paramInt);

	public abstract int updateByPrimaryKeySelective(UserPriv paramUserPriv);

	public abstract int updateByPrimaryKey(UserPriv paramUserPriv);

	public abstract String getPrivNameById(Integer paramInteger);

	public abstract List<UserPriv> getAlluserPriv(Map<String, Object> paramMap);

	public abstract List<UserPriv> getPrivByMany(UserPriv paramUserPriv);

	public abstract List<UserPriv> getUserPrivNameByFuncId(String paramString);

	public abstract String getUserPrivfuncIdStr(String paramString);

	public abstract void updateUserPrivFuncIdStr(Map<String, Object> paramMap);

	public abstract String getPrivNameByPrivId(Integer paramInteger);

	public abstract int checkSuperPass(String paramString);

	public abstract String getSuperPass();

	public abstract void updateSuperPass(String paramString);

	public abstract void delPriByName(String paramString);

	public abstract void updateFunByUserId(Map<String, Object> paramMap);

	public abstract String getUserFunByUserId(String paramString);

	public abstract int insertRoleManager(RoleManager paramRoleManager);

	public abstract int updateRoleManager(RoleManager paramRoleManager);

	public abstract int deleteRoleManagerById(int paramInt);

	public abstract RoleManager getRoleManagerById(int paramInt);

	public abstract List<RoleManager> getAllRoleManager();

	public abstract String getDeptNameById(int paramInt);

	public abstract int getRoleLoginCount(int paramInt);

	public abstract int getRoleNoLoginCount(int paramInt);

	public abstract int getUserRoleCount(int paramInt);

	public abstract String getFunNameByFunId(String paramString);

	public abstract List<String> getFunIdByFunName(String paramString);

	public abstract String getUserNameByUserId(String paramString);

	public abstract UserPriv getUserPriv(Integer paramInteger);

	public abstract UserPriv getUserPrivByName(
			@Param("privName") String paramString);

	public abstract List<String> getUserPNames(Map<String, Object> paramMap);

	public abstract List<UserPriv> getPrivBySearch(Map<String, Object> paramMap);

	public abstract UserPriv getUserPrivByUserId(String paramString);

	public abstract List<UserPriv> getUserPrivByIds(
			@Param("ids") String[] paramArrayOfString);

	public abstract List<UserPriv> getUserPrivsByName(
			@Param("privName") String paramString);
}
