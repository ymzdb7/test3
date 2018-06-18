package com.myoa.dao.users;

import com.myoa.model.users.UserFunction;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface UserFunctionMapper {
	public abstract List<UserFunction> getDatagrid();

	public abstract UserFunction getMenuByUserId(int paramInt);

	public abstract List<UserFunction> getUserByFuncId(String paramString);

	public abstract String getUserFuncIdStr(String paramString);

	public abstract void updateUserFuncIdStr(Map<String, String> paramMap);

	public abstract void insertUserFun(UserFunction paramUserFunction);

	public abstract void deleteUserFun(String[] paramArrayOfString);

	public abstract void updateUserFun(UserFunction paramUserFunction);

	public abstract void updateUserFunByUids(
			@Param("uids") List<String> paramList,
			@Param("userFunction") UserFunction paramUserFunction);

	public abstract int addByUserId(@Param("uid") int paramInt,
			@Param("userId") String paramString1,
			@Param("userFunCidStr") String paramString2);

	public abstract int updateByUserId(@Param("userId") String paramString1,
			@Param("userFunCidStr") String paramString2);

	public abstract String getUid(@Param("userId") String paramString);
}