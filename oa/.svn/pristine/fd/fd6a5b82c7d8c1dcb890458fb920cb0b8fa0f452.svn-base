package com.myoa.service.users;

import com.myoa.model.users.RoleManager;
import com.myoa.model.users.UserPriv;
import com.myoa.util.ToJson;

import java.util.List;
import java.util.Map;

public abstract interface UsersPrivService
{
  public abstract String getPrivNameById(int[] paramArrayOfInt);

  public abstract UserPriv selectByPrimaryKey(int paramInt);

  public abstract void deleteByPrimaryKey(int paramInt);

  public abstract int insertSelective(UserPriv paramUserPriv);

  public abstract List<UserPriv> getAllPriv(Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract List<UserPriv> getPrivByMany(UserPriv paramUserPriv);

  public abstract List<UserPriv> getAllUserPriv();

  public abstract List<UserPriv> getUserPrivNameByFuncId(String paramString);

  public abstract void updateUserPrivfuncIdStr(String paramString1, String paramString2);

  public abstract void deleteUserPriv(String paramString1, String paramString2);

  public abstract String getPrivNameByPrivId(String paramString1, String paramString2);

  public abstract int updateUserPriv(UserPriv paramUserPriv);

  public abstract void copyUserPriv(UserPriv paramUserPriv);

  public abstract int checkSuperPass(String paramString);

  public abstract void updateSuperPass(String paramString);

  public abstract String getEncryptString(String paramString);

  public abstract void delPriByName(String paramString);

  public abstract ToJson<UserPriv> updNoByPrivId(UserPriv paramUserPriv);

  public abstract ToJson addUserFunByUID(String paramString1, String paramString2);

  public abstract void deleteUserFunByUID(String paramString1, String paramString2);

  public abstract int insertRoleManager(RoleManager paramRoleManager);

  public abstract int updateRoleManager(RoleManager paramRoleManager);

  public abstract int deleteRoleManagerById(int paramInt);

  public abstract RoleManager getRoleManagerById(int paramInt);

  public abstract List<RoleManager> getAllRoleManager();

  public abstract String getFunNameByFunId(String paramString);

  public abstract List<String> getFunIdByFunName(String paramString);

  public abstract UserPriv getUserPriv(Integer paramInteger);

  public abstract List<UserPriv> getPrivBySearch(Map<String, Object> paramMap);

  public abstract void getFuncByuserPrivOther(String paramString1, String paramString2);
}

